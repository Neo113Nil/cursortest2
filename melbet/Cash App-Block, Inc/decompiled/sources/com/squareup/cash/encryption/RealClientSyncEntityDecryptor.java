package com.squareup.cash.encryption;

import android.content.SharedPreferences;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.room.RoomDatabase$closeBarrier$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.db.WireAdapter;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.encryption.EllipticCurveEncryptionEngine;
import com.squareup.protos.franklin.common.EncryptedSyncEntity;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.UnaryOperator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.text.Charsets;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.MonotonicTimeSource;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;
import okio.ByteString;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealClientSyncEntityDecryptor {
    public static final AtomicReference hasReported = new AtomicReference(Boolean.FALSE);
    public final RoomDatabase$closeBarrier$1 appTokenProvider;
    public final Lazy engine$delegate;
    public final ErrorReporter errorReporter;
    public final SharedPreferences prefs;
    public final WireAdapter delegate = new WireAdapter(SyncEntity.ADAPTER);
    public final String encryptionDecision = "en_decision";
    public final String decryptionDecision = "de_decision";

    public RealClientSyncEntityDecryptor(RealBrazeManager$$ExternalSyntheticLambda0 realBrazeManager$$ExternalSyntheticLambda0, RoomDatabase$closeBarrier$1 roomDatabase$closeBarrier$1, ErrorReporter errorReporter, SharedPreferences sharedPreferences) {
        this.appTokenProvider = roomDatabase$closeBarrier$1;
        this.errorReporter = errorReporter;
        this.prefs = sharedPreferences;
        this.engine$delegate = LazyKt.lazy(realBrazeManager$$ExternalSyntheticLambda0);
    }

    public final com.squareup.cash.clientsync.models.SyncEntity decryptEntity(com.squareup.cash.clientsync.models.SyncEntity syncEntity) {
        Object obj;
        Object obj2;
        ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
        ErrorReporter errorReporter = this.errorReporter;
        syncEntity.getClass();
        if (((SyncEntity) syncEntity.getEntityProto()).encrypted_sync_entity == null) {
            return syncEntity;
        }
        SyncEntity syncEntity2 = (SyncEntity) syncEntity.getEntityProto();
        EncryptedSyncEntity encryptedSyncEntity = syncEntity2.encrypted_sync_entity;
        encryptedSyncEntity.getClass();
        ByteString byteString = encryptedSyncEntity.encrypted_sync_entity;
        byteString.getClass();
        final byte[] byteArray = byteString.toByteArray();
        String str = this.encryptionDecision;
        SharedPreferences sharedPreferences = this.prefs;
        String string2 = sharedPreferences.getString(str, "unknown");
        String string3 = sharedPreferences.getString(this.decryptionDecision, "unknown");
        EncryptedSyncEntity encryptedSyncEntity2 = syncEntity2.encrypted_sync_entity;
        if (encryptedSyncEntity2 == null || (obj = encryptedSyncEntity2.f1377type) == null) {
            obj = "MISSING_ENTITY_TYPE";
        }
        if (encryptedSyncEntity2 == null || (obj2 = encryptedSyncEntity2.sync_value_type) == null) {
            obj2 = "MISSING_VALUE_TYPE";
        }
        final String str2 = obj + "." + obj2;
        Timber.Forest.i(CameraSelector$$ExternalSyntheticOutline0.m("Decryption attempt. Encrypted with ", string2, ". Decrypted with ", string3), new Object[0]);
        TimeSource.Monotonic.INSTANCE.getClass();
        MonotonicTimeSource.INSTANCE.getClass();
        long read$1 = MonotonicTimeSource.read$1();
        Object invoke = this.appTokenProvider.invoke();
        if (invoke == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
            return null;
        }
        String str3 = (String) invoke;
        try {
            WireAdapter wireAdapter = this.delegate;
            EllipticCurveEncryptionEngine ellipticCurveEncryptionEngine = (EllipticCurveEncryptionEngine) this.engine$delegate.getValue();
            byte[] bytes = str3.getBytes(Charsets.UTF_8);
            bytes.getClass();
            byte[] decrypt = ellipticCurveEncryptionEngine.decrypt(byteArray, bytes);
            wireAdapter.getClass();
            try {
                TimedValue timedValue = new TimedValue((SyncEntity) ((Message) ((ProtoAdapter) wireAdapter.adapter).decode(decrypt)), TimeSource.Monotonic.ValueTimeMark.m4180elapsedNowUwyO8pc(read$1), null);
                SyncEntity syncEntity3 = (SyncEntity) timedValue.component1();
                final double m4175toDoubleimpl = Duration.m4175toDoubleimpl(timedValue.m4181component2UwyO8pc(), DurationUnit.MILLISECONDS);
                if (m4175toDoubleimpl >= 500.0d) {
                    AtomicReference atomicReference = hasReported;
                    if (!((Boolean) atomicReference.get()).booleanValue()) {
                        atomicReference.getAndUpdate(new UnaryOperator() { // from class: com.squareup.cash.encryption.RealClientSyncEntityDecryptor$$ExternalSyntheticLambda0
                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                RealClientSyncEntityDecryptor.this.errorReporter.report(new DecryptionTimeoutError(byteArray, m4175toDoubleimpl, str2), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                return Boolean.TRUE;
                            }
                        });
                    }
                }
                return com.squareup.cash.clientsync.models.SyncEntity.copy$default(syncEntity, null, syncEntity3, 55);
            } catch (IOException e) {
                throw new IllegalStateException(e);
            }
        } catch (IllegalStateException e2) {
            string2.getClass();
            string3.getClass();
            errorReporter.report(new DecryptionFailureError(e2, string2, string3, str2), defaultSamplingStrategy);
            a$$ExternalSyntheticBUOutline0.m("Failed Decrypt Entity ".concat(str2), e2);
            return null;
        } catch (GeneralSecurityException e3) {
            string2.getClass();
            string3.getClass();
            errorReporter.report(new DecryptionFailureError(e3, string2, string3, str2), defaultSamplingStrategy);
            throw new GeneralSecurityException("Failed Decrypt Entity ".concat(str2), e3);
        }
    }
}
