package defpackage;

import com.yandex.passport.api.g;
import com.yandex.passport.internal.impl.q0;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class pju extends aur implements Function2 {
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ qju l;
    public pju m;
    public wqn n;
    public int o;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public boolean w;
    public long x;
    public long y;
    public double z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pju(Continuation continuation, qju qjuVar) {
        super(2, continuation);
        this.l = qjuVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        pju pjuVar = new pju(continuation, this.l);
        pjuVar.k = obj;
        return pjuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pju) create(obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0211  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x01af -> B:16:0x0069). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        hn5 hn5Var;
        WeakReference weakReference;
        q0 q0Var;
        int i;
        Throwable th;
        wqn wqnVar;
        jyr jyrVar;
        nm6 nm6Var;
        long j;
        double d;
        int i2;
        int i3;
        int i4;
        pju pjuVar;
        long j2;
        int i5;
        boolean z;
        boolean z2;
        int i6;
        Object obj2;
        double d2;
        long j3;
        nm6 nm6Var2;
        int i7;
        int i8;
        String str2;
        int i9;
        boolean z3;
        int i10;
        wqn wqnVar2;
        int i11;
        int i12;
        pju pjuVar2;
        boolean z4;
        Throwable a;
        Object obj3;
        Throwable a2;
        qju qjuVar = this.l;
        jyr jyrVar2 = qjuVar.a;
        Object obj4 = this.k;
        nm6 nm6Var3 = nm6.a;
        int i13 = this.j;
        if (i13 == 0) {
            str = "retry attempt ";
            qgg.h0(obj);
            Pair pair = (Pair) obj4;
            boolean booleanValue = ((Boolean) pair.a).booleanValue();
            boolean booleanValue2 = ((Boolean) pair.b).booleanValue();
            if (booleanValue2) {
                if (!booleanValue && booleanValue2 && (hn5Var = qjuVar.e) != null && (weakReference = (WeakReference) qjuVar.f.get(qju.a(hn5Var))) != null && (q0Var = (q0) weakReference.get()) != null) {
                    ssg.a(3, "VpnGateActivityCallbacks", "onVpnGateEnabledChanged try call showVpnBlockerIfNeeded", null);
                    x97.y(wyf.F(hn5Var.getLifecycle()), null, null, new nju(q0Var, null, 1), 3);
                }
                return Unit.a;
            }
            i = 3;
            th = null;
            ssg.a(3, "VpnGateActivityCallbacks", "disableVpnBlocker", null);
            wqnVar = new wqn();
            wqnVar.a = 100L;
            jyrVar = jyrVar2;
            nm6Var = nm6Var3;
            j = 1000;
            d = 2.0d;
            i2 = 4;
            i3 = 0;
            i4 = 0;
            pjuVar = this;
            j2 = 100;
            i5 = 5;
            z = booleanValue;
            z2 = booleanValue2;
            i6 = 0;
            if (i6 < i2) {
            }
        } else if (i13 == 1) {
            int i14 = this.u;
            int i15 = this.t;
            i12 = this.s;
            double d3 = this.z;
            long j4 = this.y;
            long j5 = this.x;
            i10 = this.r;
            int i16 = this.q;
            int i17 = this.p;
            boolean z5 = this.w;
            boolean z6 = this.v;
            int i18 = this.o;
            wqn wqnVar3 = this.n;
            pju pjuVar3 = this.m;
            qgg.h0(obj);
            obj2 = ((z7o) obj).a;
            d2 = d3;
            j3 = j4;
            j2 = j5;
            i9 = i17;
            z3 = z5;
            z4 = z6;
            wqnVar2 = wqnVar3;
            i11 = i15;
            nm6Var2 = nm6Var3;
            i8 = i16;
            str2 = "retry attempt ";
            i7 = i14;
            i3 = i18;
            jyrVar = jyrVar2;
            pjuVar2 = pjuVar3;
            a = z7o.a(obj2);
            int i19 = i12;
            if (a instanceof CancellationException) {
            }
        } else {
            if (i13 != 2) {
                if (i13 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                obj3 = ((z7o) obj).a;
                a2 = z7o.a(obj3);
                if (a2 != null) {
                    ssg.a(7, "VpnGateActivityCallbacks", "disableVpnBlocker error", a2);
                }
                return Unit.a;
            }
            int i20 = this.s;
            double d4 = this.z;
            long j6 = this.y;
            long j7 = this.x;
            int i21 = this.r;
            i8 = this.q;
            int i22 = this.p;
            boolean z7 = this.w;
            boolean z8 = this.v;
            int i23 = this.o;
            wqn wqnVar4 = this.n;
            pju pjuVar4 = this.m;
            qgg.h0(obj);
            int i24 = i21;
            d = d4;
            String str3 = "retry attempt ";
            int i25 = i20;
            jyrVar = jyrVar2;
            pjuVar = pjuVar4;
            wqnVar = wqnVar4;
            j = j6;
            z = z8;
            nm6 nm6Var4 = nm6Var3;
            z2 = z7;
            i5 = i22;
            i3 = i23;
            j2 = j7;
            i4 = i8;
            long j8 = (long) (wqnVar.a * d);
            if (j8 > j) {
                j8 = j;
            }
            wqnVar.a = j8;
            i6 = i25 + 1;
            i2 = i24;
            nm6Var = nm6Var4;
            str = str3;
            i = 3;
            th = null;
            if (i6 < i2) {
                str2 = str;
                v3w.k(str2, i6, i, "VpnGateActivityCallbacks", th);
                g gVar = (g) jyrVar.getValue();
                this.k = th;
                this.m = pjuVar;
                this.n = wqnVar;
                this.o = i3;
                this.v = z;
                this.w = z2;
                this.p = i5;
                this.q = i4;
                this.r = i2;
                this.x = j2;
                wqnVar2 = wqnVar;
                pju pjuVar5 = pjuVar;
                this.y = j;
                double d5 = d;
                this.z = d5;
                this.s = i6;
                this.t = i6;
                int i26 = i6;
                this.u = 0;
                this.j = 1;
                int i27 = i2;
                Object p = gVar.p(this);
                nm6 nm6Var5 = nm6Var;
                if (p == nm6Var5) {
                    return nm6Var5;
                }
                d2 = d5;
                obj2 = p;
                z4 = z;
                nm6Var2 = nm6Var5;
                pjuVar2 = pjuVar5;
                j3 = j;
                i11 = i26;
                i7 = 0;
                i10 = i27;
                i8 = i4;
                i9 = i5;
                z3 = z2;
                i12 = i11;
                a = z7o.a(obj2);
                int i192 = i12;
                if (a instanceof CancellationException) {
                    throw a;
                }
                if (a == null) {
                    obj3 = obj2;
                    a2 = z7o.a(obj3);
                    if (a2 != null) {
                    }
                    return Unit.a;
                }
                str3 = str2;
                ssg.a(6, "VpnGateActivityCallbacks", dfi.c(i11, str2, " failed"), a);
                long j9 = wqnVar2.a;
                this.k = null;
                this.m = pjuVar2;
                this.n = wqnVar2;
                this.o = i3;
                this.v = z4;
                this.w = z3;
                this.p = i9;
                this.q = i8;
                this.r = i10;
                this.x = j2;
                boolean z9 = z4;
                pju pjuVar6 = pjuVar2;
                long j10 = j3;
                this.y = j10;
                double d6 = d2;
                this.z = d6;
                i25 = i192;
                this.s = i25;
                this.t = i11;
                this.u = i7;
                this.j = 2;
                nm6Var4 = nm6Var2;
                if (y2x.o(j9, this) == nm6Var4) {
                    return nm6Var4;
                }
                pjuVar = pjuVar6;
                j = j10;
                d = d6;
                wqnVar = wqnVar2;
                i24 = i10;
                z2 = z3;
                i5 = i9;
                z = z9;
                i4 = i8;
                long j82 = (long) (wqnVar.a * d);
                if (j82 > j) {
                }
                wqnVar.a = j82;
                i6 = i25 + 1;
                i2 = i24;
                nm6Var = nm6Var4;
                str = str3;
                i = 3;
                th = null;
                if (i6 < i2) {
                    nm6 nm6Var6 = nm6Var;
                    g gVar2 = (g) jyrVar.getValue();
                    this.k = null;
                    this.m = null;
                    this.n = null;
                    this.o = i3;
                    this.v = z;
                    this.w = z2;
                    this.p = i5;
                    this.q = i4;
                    this.x = j2;
                    this.y = j;
                    this.z = d;
                    this.r = 0;
                    this.j = 3;
                    obj3 = gVar2.p(this);
                    if (obj3 == nm6Var6) {
                        return nm6Var6;
                    }
                    a2 = z7o.a(obj3);
                    if (a2 != null) {
                    }
                    return Unit.a;
                }
            }
        }
    }
}
