package com.squareup.cash.mri.android;

import android.os.Debug;
import android.os.SystemClock;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.mri.android.RealComputationalIntegrityChecker;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.crypto.generators.Argon2BytesGenerator;
import org.bouncycastle.crypto.params.Argon2Parameters;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealComputationalIntegrityChecker$measure$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ComputationalIntegrityConfig $config;
    public final /* synthetic */ RealComputationalIntegrityChecker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealComputationalIntegrityChecker$measure$2(RealComputationalIntegrityChecker realComputationalIntegrityChecker, ComputationalIntegrityConfig computationalIntegrityConfig, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realComputationalIntegrityChecker;
        this.$config = computationalIntegrityConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealComputationalIntegrityChecker$measure$2(this.this$0, this.$config, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealComputationalIntegrityChecker$measure$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ComputationalIntegrityConfig computationalIntegrityConfig = this.$config;
        RealComputationalIntegrityChecker realComputationalIntegrityChecker = this.this$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        try {
            String str = (String) realComputationalIntegrityChecker.deviceId.$$delegate_0.getValue();
            String appTokenOrNull = PlatformKt.appTokenOrNull(realComputationalIntegrityChecker.sessionManager);
            if (appTokenOrNull == null) {
                return null;
            }
            long currentTimeMillis = System.currentTimeMillis();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bytes = (str + "|" + appTokenOrNull + "|" + currentTimeMillis).getBytes(Charsets.UTF_8);
            bytes.getClass();
            byte[] digest = messageDigest.digest(bytes);
            byte[] bArr = new byte[16];
            new SecureRandom().nextBytes(bArr);
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            long threadCpuTimeNanos = Debug.threadCpuTimeNanos();
            Argon2BytesGenerator argon2BytesGenerator = new Argon2BytesGenerator();
            argon2BytesGenerator.init(new Argon2Parameters.Builder(2).withSalt(bArr).withMemoryAsKB(computationalIntegrityConfig.memoryCostKb).withIterations(2).withParallelism(2).build());
            byte[] bArr2 = new byte[32];
            argon2BytesGenerator.generateBytes(digest, bArr2);
            return new ComputationalIntegrityResult((SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos) / 1000000, (Debug.threadCpuTimeNanos() - threadCpuTimeNanos) / 1000000, currentTimeMillis, ArraysKt___ArraysKt.joinToString$default(bArr2, "", new OffersHomeQueries$$ExternalSyntheticLambda1(18), 30), computationalIntegrityConfig);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            realComputationalIntegrityChecker.errorReporter.report(new RealComputationalIntegrityChecker.ComputationalIntegrityError(e2), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
            return null;
        }
    }
}
