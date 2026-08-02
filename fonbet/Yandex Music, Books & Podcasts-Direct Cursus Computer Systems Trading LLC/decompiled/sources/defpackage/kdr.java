package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class kdr extends aur implements Function2 {
    public int j;
    public final /* synthetic */ um0 k;
    public final /* synthetic */ fk0 l;
    public final /* synthetic */ long m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kdr(um0 um0Var, fk0 fk0Var, long j, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.k = um0Var;
        this.l = fk0Var;
        this.m = j;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new kdr(this.k, this.l, this.m, this.n, this.o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kdr) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a8, code lost:
    
        if (r0 == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0056, code lost:
    
        if (r5.f(r0, r15) == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (defpackage.fk0.c(r15.l, r2, r0, null, r15, 12) == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c7, code lost:
    
        if (r0 == r6) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d8, code lost:
    
        if (r5.f(r0, r15) == r6) goto L41;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object c2;
        nm6 nm6Var = nm6.a;
        int i = this.j;
        int i2 = this.o;
        long j = this.m;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    Long l = new Long(j);
                    act S = weo.S((i2 / 3) * 2, 0, lya.d, 2);
                    this.j = 3;
                    c2 = fk0.c(this.l, l, S, null, this, 12);
                } else if (i == 3) {
                    qgg.h0(obj);
                    c2 = obj;
                } else if (i == 4) {
                    qgg.h0(obj);
                    c = obj;
                } else if (i != 5) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            qgg.h0(obj);
        } else {
            qgg.h0(obj);
            int ordinal = this.k.ordinal();
            fk0 fk0Var = this.l;
            if (ordinal != 0) {
                if (ordinal == 1) {
                    int i3 = this.n;
                    int i4 = i3 * 2;
                    if (j > i3 * 10000 || i4 > j) {
                        Long l2 = new Long(j);
                        act S2 = weo.S(i2 / 3, 0, lya.d, 2);
                        this.j = 4;
                        c = fk0.c(this.l, l2, S2, null, this, 12);
                    } else {
                        Long l3 = new Long(j - i3);
                        act S3 = weo.S(i2 / 3, 0, lya.d, 2);
                        this.j = 2;
                    }
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    Long l4 = new Long(0L);
                    this.j = 5;
                }
                return nm6Var;
            }
            Long l5 = new Long(j);
            this.j = 1;
        }
        return Unit.a;
    }
}
