package ru.yandex.taxi;

import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import defpackage.jx81;
import defpackage.jxi;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.x6f0;
import defpackage.y6f0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6f0;", "", "Lzy11;", "<anonymous>", "(Ly6f0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.PlatformHelper$observeCallState$1", f = "PlatformHelper.kt", l = {160, 162}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class PlatformHelper$observeCallState$1 extends SuspendLambda implements wls {
    final /* synthetic */ TelephonyManager $telephonyManager;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformHelper$observeCallState$1(h hVar, TelephonyManager telephonyManager, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$telephonyManager = telephonyManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlatformHelper$observeCallState$1 platformHelper$observeCallState$1 = new PlatformHelper$observeCallState$1(this.this$0, this.$telephonyManager, continuation);
        platformHelper$observeCallState$1.L$0 = obj;
        return platformHelper$observeCallState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlatformHelper$observeCallState$1) create((y6f0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (kotlinx.coroutines.channels.b.a(r0, new defpackage.agc0(r4, r6, r8), r7) == r1) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0067, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0065, code lost:
    
        if (kotlinx.coroutines.channels.b.a(r0, new defpackage.agc0(3, r6, r8), r7) == r1) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        final y6f0 y6f0Var = (y6f0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 2;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean e = jx81.e();
            h hVar = this.this$0;
            TelephonyManager telephonyManager = this.$telephonyManager;
            if (e) {
                this.L$0 = null;
                this.label = 1;
                hVar.getClass();
                PlatformHelper$observeCallStateApi31$callback$1 platformHelper$observeCallStateApi31$callback$1 = new PlatformHelper$observeCallStateApi31$callback$1(y6f0Var);
                telephonyManager.registerTelephonyCallback(hVar.a.getMainExecutor(), platformHelper$observeCallStateApi31$callback$1);
            } else {
                this.L$0 = null;
                this.label = 2;
                hVar.getClass();
                PhoneStateListener phoneStateListener = new PhoneStateListener() { // from class: ru.yandex.taxi.PlatformHelper$observeCallState$listener$1
                    @Override // android.telephony.PhoneStateListener
                    @jxi
                    public void onCallStateChanged(int state, String phoneNumber) {
                        ((x6f0) y6f0.this).d(Integer.valueOf(state));
                    }
                };
                telephonyManager.listen(phoneStateListener, 32);
            }
        } else {
            if (i != 1 && i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
