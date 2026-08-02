package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class e2r extends h7o implements Function2 {
    public long[] k;
    public int l;
    public int m;
    public int n;
    public /* synthetic */ Object o;
    public final /* synthetic */ f2r p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2r(f2r f2rVar, Continuation continuation) {
        super(2, continuation);
        this.p = f2rVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        e2r e2rVar = new e2r(this.p, continuation);
        e2rVar.o = obj;
        return e2rVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e2r) create((ygp) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00c3 -> B:7:0x00c4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0081 -> B:20:0x0098). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ygp ygpVar;
        long[] jArr;
        int length;
        int i;
        ygp ygpVar2;
        int i2;
        ygp ygpVar3;
        int i3;
        f2r f2rVar = this.p;
        long j = f2rVar.a;
        long j2 = f2rVar.c;
        long j3 = f2rVar.b;
        nm6 nm6Var = nm6.a;
        int i4 = this.n;
        if (i4 == 0) {
            qgg.h0(obj);
            ygpVar = (ygp) this.o;
            jArr = f2rVar.d;
            if (jArr != null) {
                length = jArr.length;
                i = 0;
            }
            if (j3 != 0) {
                ygpVar2 = ygpVar;
                i2 = 0;
                if (i2 >= 64) {
                }
            }
            if (j != 0) {
            }
            return Unit.a;
        }
        if (i4 == 1) {
            length = this.m;
            int i5 = this.l;
            jArr = this.k;
            ygpVar = (ygp) this.o;
            qgg.h0(obj);
            i = i5 + 1;
        } else {
            if (i4 != 2) {
                if (i4 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = this.l;
                ygpVar3 = (ygp) this.o;
                qgg.h0(obj);
                i3++;
                if (i3 < 64) {
                    if (((1 << i3) & j) != 0) {
                        Long l = new Long(j2 + i3 + 64);
                        this.o = ygpVar3;
                        this.k = null;
                        this.l = i3;
                        this.n = 3;
                        ygpVar3.a(l, this);
                        nm6 nm6Var2 = nm6.a;
                        return nm6Var;
                    }
                    i3++;
                    if (i3 < 64) {
                    }
                }
                return Unit.a;
            }
            i2 = this.l;
            ygpVar2 = (ygp) this.o;
            qgg.h0(obj);
            i2++;
            if (i2 >= 64) {
                ygpVar = ygpVar2;
                if (j != 0) {
                    ygpVar3 = ygpVar;
                    i3 = 0;
                    if (i3 < 64) {
                    }
                }
                return Unit.a;
            }
            if (((1 << i2) & j3) != 0) {
                Long l2 = new Long(j2 + i2);
                this.o = ygpVar2;
                this.k = null;
                this.l = i2;
                this.n = 2;
                ygpVar2.a(l2, this);
                nm6 nm6Var3 = nm6.a;
                return nm6Var;
            }
            i2++;
            if (i2 >= 64) {
            }
        }
        if (i < length) {
            Long l3 = new Long(jArr[i]);
            this.o = ygpVar;
            this.k = jArr;
            this.l = i;
            this.m = length;
            this.n = 1;
            ygpVar.a(l3, this);
            return nm6Var;
        }
        if (j3 != 0) {
        }
        if (j != 0) {
        }
        return Unit.a;
    }
}
