package defpackage;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class sf5 extends aur implements Function2 {
    public float j;
    public float k;
    public long l;
    public long m;
    public int n;
    public int o;
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ltm r;
    public final /* synthetic */ long s;
    public final /* synthetic */ long t;
    public final /* synthetic */ float u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf5(ltm ltmVar, long j, long j2, float f, Continuation continuation) {
        super(2, continuation);
        this.r = ltmVar;
        this.s = j;
        this.t = j2;
        this.u = f;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        sf5 sf5Var = new sf5(this.r, this.s, this.t, this.u, continuation);
        sf5Var.q = obj;
        return sf5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((sf5) create((nvm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x012d, code lost:
    
        if (((defpackage.oc4) r6).d.m(r4, r22) == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a5, code lost:
    
        if (1 <= r8) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        if (((defpackage.oc4) r6).d.m(r13, r22) == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x012d -> B:8:0x0130). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        float longValue;
        long j;
        float f;
        long elapsedRealtime;
        int d;
        float f2;
        long j2;
        int i;
        long j3;
        int i2;
        long j4;
        float elapsedRealtime2;
        long j5;
        float f3;
        long j6;
        nvm nvmVar = (nvm) this.q;
        nm6 nm6Var = nm6.a;
        int i3 = this.p;
        long j7 = this.t;
        mm6 mm6Var = this.r;
        int i4 = 1;
        if (i3 == 0) {
            qgg.h0(obj);
            longValue = nvmVar.d.longValue();
            j = nvmVar.b;
            f = j / longValue;
            Float f4 = new Float(f);
            this.q = nvmVar;
            this.j = longValue;
            this.l = j;
            this.k = f;
            this.p = 1;
        } else {
            if (i3 != 1) {
                if (i3 == 2) {
                    i2 = this.o;
                    int i5 = this.n;
                    long j8 = this.m;
                    float f5 = this.k;
                    long j9 = this.l;
                    float f6 = this.j;
                    qgg.h0(obj);
                    j3 = j9;
                    f2 = f5;
                    j2 = j8;
                    i = i5;
                    longValue = f6;
                    j4 = j7;
                    elapsedRealtime2 = (((SystemClock.elapsedRealtime() - j2) * this.u) + j3) / longValue;
                    if (elapsedRealtime2 > 1.0f) {
                    }
                    if (nvmVar.f) {
                    }
                    return nm6Var;
                }
                if (i3 == 3) {
                    i2 = this.o;
                    int i6 = this.n;
                    j5 = this.m;
                    f3 = this.k;
                    j6 = this.l;
                    float f7 = this.j;
                    qgg.h0(obj);
                    j4 = j7;
                    d = i6;
                    longValue = f7;
                    if (i2 != d) {
                    }
                    return Unit.a;
                }
                if (i3 != 4) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = this.o;
                i = this.n;
                j2 = this.m;
                f2 = this.k;
                long j10 = this.l;
                longValue = this.j;
                qgg.h0(obj);
                j3 = j10;
                j4 = j7;
                long j11 = j3;
                d = i;
                j5 = j2;
                f3 = f2;
                j6 = j11;
                if (i2 != d) {
                    long j12 = j5;
                    i4 = i2 + 1;
                    f = f3;
                    j = j6;
                    elapsedRealtime = j12;
                    j7 = j4;
                    this.q = nvmVar;
                    this.j = longValue;
                    this.l = j;
                    this.k = f;
                    this.m = elapsedRealtime;
                    this.n = d;
                    this.o = i4;
                    this.p = 2;
                    if (y2x.p(j7, this) != nm6Var) {
                        long j13 = elapsedRealtime;
                        f2 = f;
                        i2 = i4;
                        i = d;
                        j3 = j;
                        j2 = j13;
                        j4 = j7;
                        elapsedRealtime2 = (((SystemClock.elapsedRealtime() - j2) * this.u) + j3) / longValue;
                        if (elapsedRealtime2 > 1.0f) {
                            elapsedRealtime2 = 1.0f;
                        }
                        if (nvmVar.f) {
                            Float f8 = new Float(f2);
                            this.q = nvmVar;
                            this.j = longValue;
                            this.l = j3;
                            this.k = f2;
                            this.m = j2;
                            this.n = i;
                            this.o = i2;
                            this.p = 4;
                        } else {
                            Float f9 = new Float(elapsedRealtime2);
                            this.q = nvmVar;
                            this.j = longValue;
                            this.l = j3;
                            this.k = f2;
                            this.m = j2;
                            this.n = i;
                            this.o = i2;
                            this.p = 3;
                            if (((oc4) mm6Var).d.m(f9, this) != nm6Var) {
                                float f10 = longValue;
                                int i7 = i;
                                j5 = j2;
                                f3 = f2;
                                j6 = j3;
                                d = i7;
                                longValue = f10;
                                if (i2 != d) {
                                }
                            }
                        }
                    }
                    return nm6Var;
                }
                return Unit.a;
            }
            f = this.k;
            j = this.l;
            longValue = this.j;
            qgg.h0(obj);
        }
        elapsedRealtime = SystemClock.elapsedRealtime();
        d = (int) nsa.d(this.s, j7);
    }
}
