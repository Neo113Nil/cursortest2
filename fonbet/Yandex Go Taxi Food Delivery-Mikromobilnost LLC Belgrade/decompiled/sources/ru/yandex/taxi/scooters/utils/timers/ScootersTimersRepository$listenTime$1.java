package ru.yandex.taxi.scooters.utils.timers;

import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.t7s;
import defpackage.tje;
import defpackage.vpr;
import defpackage.wls;
import defpackage.z5p0;
import defpackage.zy11;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.n0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.utils.timers.ScootersTimersRepository$listenTime$1", f = "ScootersTimersRepository.kt", l = {58, 59}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersTimersRepository$listenTime$1 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersTimersRepository$TimerDirection $direction;
    final /* synthetic */ long $durationSec;
    final /* synthetic */ String $sessionId;
    final /* synthetic */ String $sessionStatusName;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersTimersRepository$listenTime$1(h hVar, String str, ScootersTimersRepository$TimerDirection scootersTimersRepository$TimerDirection, String str2, long j, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$sessionId = str;
        this.$direction = scootersTimersRepository$TimerDirection;
        this.$sessionStatusName = str2;
        this.$durationSec = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersTimersRepository$listenTime$1 scootersTimersRepository$listenTime$1 = new ScootersTimersRepository$listenTime$1(this.this$0, this.$sessionId, this.$direction, this.$sessionStatusName, this.$durationSec, continuation);
        scootersTimersRepository$listenTime$1.L$0 = obj;
        return scootersTimersRepository$listenTime$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersTimersRepository$listenTime$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        if (kotlinx.coroutines.flow.e.u(r11, r0, r10) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0034, code lost:
    
        if (r11 == r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            h hVar = this.this$0;
            String str = this.$sessionId;
            ScootersTimersRepository$TimerDirection scootersTimersRepository$TimerDirection = this.$direction;
            this.L$0 = vprVar;
            this.label = 1;
            obj = h.b(hVar, str, scootersTimersRepository$TimerDirection, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        z5p0 z5p0Var = (z5p0) obj;
        String str2 = this.$sessionStatusName;
        long j = this.$durationSec;
        n0 n0Var = z5p0Var.b;
        if (z5p0Var.c == null || !jl40.l(z5p0Var.d, str2) || z5p0Var.e != j) {
            pzt0 pzt0Var = z5p0Var.c;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            z5p0Var.d = str2;
            z5p0Var.e = j;
            z5p0Var.c = tje.N(z5p0Var.a, null, null, new ScootersTimer$listenTimeFlow$$inlined$collectLatestIn$1(z5p0Var.a(j), n0Var, null), 3);
        }
        Pattern pattern = t7s.a;
        f fVar = new f(n0Var);
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }
}
