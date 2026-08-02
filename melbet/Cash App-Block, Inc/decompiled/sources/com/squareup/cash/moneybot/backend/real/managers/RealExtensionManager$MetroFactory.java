package com.squareup.cash.moneybot.backend.real.managers;

import androidx.media3.extractor.ts.DefaultTsPayloadReaderFactory;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.google.mlkit.vision.text.zzc;
import com.squareup.cash.blockers.actions.util.RealBlockerActionUriDecoder;
import com.squareup.cash.cashapplite.CashAppLiteReleaseModule$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.backend.real.extensions.FlowExtension$MetroFactory;
import com.squareup.cash.storage.StorageLink;
import com.squareup.cash.treehouse.android.broadway.TreehouseReceiptMapper;
import com.squareup.preferences.KeyValue;
import dev.zacsweers.metro.internal.Factory;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class RealExtensionManager$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RealExtensionManager$MetroFactory(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return new DefaultTsPayloadReaderFactory((zzc) FlowExtension$MetroFactory.INSTANCE.invoke());
            case 1:
                return new RealBlockerActionUriDecoder();
            case 2:
                return new CashAppLiteReleaseModule$$ExternalSyntheticLambda0(Boolean.FALSE.booleanValue());
            case 3:
                return new KeyValue() { // from class: com.squareup.cash.moneybot.backend.real.inject.ProductionMoneybotPreambleModule$provideMoneybotPreambleOverride$1
                    @Override // com.squareup.preferences.KeyValue
                    public final /* bridge */ /* synthetic */ Object blockingGet() {
                        return null;
                    }

                    @Override // com.squareup.preferences.KeyValue
                    public final /* bridge */ /* synthetic */ void blockingSet(Object obj) {
                    }

                    @Override // com.squareup.preferences.KeyValue
                    public final Object delete(Continuation continuation) {
                        return Unit.INSTANCE;
                    }

                    @Override // com.squareup.preferences.KeyValue
                    public final Flow observe() {
                        return new AppLockMonitor$special$$inlined$map$2(null, 19);
                    }

                    @Override // com.squareup.preferences.KeyValue
                    public final Object set(Object obj, Continuation continuation) {
                        return Unit.INSTANCE;
                    }
                };
            case 4:
                return StorageLink.Legacy.INSTANCE;
            default:
                return SetsKt__SetsJVMKt.setOf(new TreehouseReceiptMapper());
        }
    }

    public /* synthetic */ RealExtensionManager$MetroFactory(Object obj, int i) {
        this.$r8$classId = i;
    }
}
