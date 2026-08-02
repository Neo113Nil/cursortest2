package ru.yandex.taxi.am;

import defpackage.b64;
import defpackage.e3n;
import defpackage.io90;
import defpackage.jst;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.tls;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.am.PassportInitializer$waitWithTimeout$1", f = "PassportInitializer.kt", l = {HProv.ALG_SID_KECCAK_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PassportInitializer$waitWithTimeout$1 extends SuspendLambda implements wls {
    final /* synthetic */ SupportedPushPlatform $platform;
    final /* synthetic */ tls $run;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportInitializer$waitWithTimeout$1(tls tlsVar, SupportedPushPlatform supportedPushPlatform, Continuation continuation) {
        super(2, continuation);
        this.$run = tlsVar;
        this.$platform = supportedPushPlatform;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportInitializer$waitWithTimeout$1(this.$run, this.$platform, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PassportInitializer$waitWithTimeout$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        SupportedPushPlatform supportedPushPlatform;
        Pair pair;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                tls tlsVar = this.$run;
                SupportedPushPlatform supportedPushPlatform2 = this.$platform;
                try {
                    o430 o430Var = e3n.b;
                    long U = kp50.U(30000, DurationUnit.MILLISECONDS);
                    PassportInitializer$waitWithTimeout$1$1$1 passportInitializer$waitWithTimeout$1$1$1 = new PassportInitializer$waitWithTimeout$1$1$1(tlsVar, null);
                    this.L$0 = supportedPushPlatform2;
                    this.label = 1;
                    Object v = kotlinx.coroutines.a.v(U, passportInitializer$waitWithTimeout$1$1$1, this);
                    return v == coroutineSingletons ? coroutineSingletons : v;
                } catch (Throwable th2) {
                    th = th2;
                    supportedPushPlatform = supportedPushPlatform2;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                supportedPushPlatform = (SupportedPushPlatform) this.L$0;
                try {
                    kotlin.b.b(obj);
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            int i2 = io90.a[supportedPushPlatform.ordinal()];
            if (i2 == 1) {
                pair = new Pair(b64.j(SupportedPushPlatform.FCM.getErrorPrefix(), ":FAILED_TO_GET_TOKEN"), "Failed to get fcm token");
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                pair = new Pair(b64.j(SupportedPushPlatform.HMS.getErrorPrefix(), ":FAILED_TO_GET_TOKEN"), "Failed to get hms token");
            }
            xby.l(jst.e, (String) pair.getFirst(), null, th, (String) pair.getSecond(), 2);
            return null;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
