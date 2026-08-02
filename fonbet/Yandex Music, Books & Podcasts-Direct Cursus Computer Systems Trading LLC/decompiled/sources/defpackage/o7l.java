package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.yandex.video.m3.data.PlaybackStats;

/* loaded from: classes6.dex */
public final class o7l extends aur implements Function2 {
    public long j;
    public long k;
    public long l;
    public long m;
    public boolean n;
    public boolean o;
    public int p;
    public final /* synthetic */ xdh q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7l(xdh xdhVar, Continuation continuation) {
        super(2, continuation);
        this.q = xdhVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new o7l(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o7l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r4 == r3) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007c, code lost:
    
        if (r4 == r3) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d9  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object V;
        long longValue;
        Object V2;
        Object V3;
        long j;
        Object V4;
        long j2;
        long j3;
        Object V5;
        boolean z;
        long j4;
        long j5;
        long j6;
        boolean z2;
        long j7;
        xdh xdhVar = this.q;
        xrb xrbVar = (xrb) xdhVar.a;
        nm6 nm6Var = nm6.a;
        int i = this.p;
        if (i == 0) {
            qgg.h0(obj);
            if (xrbVar.c() == 1) {
                return null;
            }
            this.p = 1;
            V = x97.V(xdhVar.k(), new n7l(xdhVar, null, 4), this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    longValue = this.j;
                    qgg.h0(obj);
                    V2 = obj;
                    long longValue2 = ((Number) V2).longValue();
                    this.j = longValue;
                    this.k = longValue2;
                    this.p = 3;
                    V3 = x97.V(xdhVar.k(), new db(2, 11, null), this);
                    if (V3 != nm6Var) {
                        j = longValue2;
                        long longValue3 = ((Number) V3).longValue();
                        this.j = longValue;
                        this.k = j;
                        this.l = longValue3;
                        this.p = 4;
                        V4 = x97.V(xdhVar.k(), new n7l(xdhVar, null, 2), this);
                        if (V4 != nm6Var) {
                        }
                    }
                    return nm6Var;
                }
                if (i == 3) {
                    j = this.k;
                    longValue = this.j;
                    qgg.h0(obj);
                    V3 = obj;
                    long longValue32 = ((Number) V3).longValue();
                    this.j = longValue;
                    this.k = j;
                    this.l = longValue32;
                    this.p = 4;
                    V4 = x97.V(xdhVar.k(), new n7l(xdhVar, null, 2), this);
                    if (V4 != nm6Var) {
                        j2 = j;
                        j3 = longValue32;
                        long longValue4 = ((Number) V4).longValue();
                        boolean e = xrbVar.e();
                        boolean g0 = xrbVar.g0();
                        this.j = longValue;
                        this.k = j2;
                        this.l = j3;
                        this.m = longValue4;
                        this.n = e;
                        this.o = g0;
                        this.p = 5;
                        V5 = x97.V(xdhVar.k(), new n7l(xdhVar, null, 1), this);
                        if (V5 != nm6Var) {
                        }
                    }
                    return nm6Var;
                }
                if (i != 4) {
                    if (i != 5) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z3 = this.o;
                    boolean z4 = this.n;
                    long j8 = this.m;
                    j7 = this.l;
                    long j9 = this.k;
                    long j10 = this.j;
                    qgg.h0(obj);
                    z2 = z3;
                    z = z4;
                    j6 = j10;
                    V5 = obj;
                    j5 = j8;
                    j4 = j9;
                    return new PlaybackStats(j4, j7, -9223372036854775807L, j5, null, z, j6, null, z2, ((Number) V5).longValue(), -1L, null, null, null, null, null, null, null);
                }
                j3 = this.l;
                j2 = this.k;
                longValue = this.j;
                qgg.h0(obj);
                V4 = obj;
                long longValue42 = ((Number) V4).longValue();
                boolean e2 = xrbVar.e();
                boolean g02 = xrbVar.g0();
                this.j = longValue;
                this.k = j2;
                this.l = j3;
                this.m = longValue42;
                this.n = e2;
                this.o = g02;
                this.p = 5;
                V5 = x97.V(xdhVar.k(), new n7l(xdhVar, null, 1), this);
                if (V5 != nm6Var) {
                    z = e2;
                    j4 = j2;
                    j5 = longValue42;
                    j6 = longValue;
                    z2 = g02;
                    j7 = j3;
                    return new PlaybackStats(j4, j7, -9223372036854775807L, j5, null, z, j6, null, z2, ((Number) V5).longValue(), -1L, null, null, null, null, null, null, null);
                }
                return nm6Var;
            }
            qgg.h0(obj);
            V = obj;
        }
        longValue = ((Number) V).longValue();
        this.j = longValue;
        this.p = 2;
        V2 = x97.V(xdhVar.k(), new n7l(xdhVar, null, 0), this);
    }
}
