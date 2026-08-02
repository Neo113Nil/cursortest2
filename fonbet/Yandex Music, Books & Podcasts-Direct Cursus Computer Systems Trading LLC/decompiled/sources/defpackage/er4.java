package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class er4 extends aur implements Function2 {
    public yde j;
    public d3t k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final /* synthetic */ hr4 r;
    public final /* synthetic */ e3t s;
    public final /* synthetic */ c80 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er4(hr4 hr4Var, e3t e3tVar, c80 c80Var, Continuation continuation) {
        super(2, continuation);
        this.r = hr4Var;
        this.s = e3tVar;
        this.t = c80Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new er4(this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((er4) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a0, code lost:
    
        if (defpackage.hr4.b(r9, r13, r23) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0190, code lost:
    
        if (defpackage.hr4.b(r9, r7, r23) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011d, code lost:
    
        if (defpackage.hr4.b(r9, r17, r23) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a5, code lost:
    
        if (defpackage.hr4.b(r9, r2, r23) == r1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0076, code lost:
    
        if (defpackage.hr4.b(r9, r2, r23) == r1) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x019a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0190 -> B:10:0x0029). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        yde ydeVar;
        int size;
        int i;
        d3t d3tVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        d3t d3tVar2;
        yde ydeVar2;
        boolean z;
        int i7;
        int i8;
        int i9;
        d3t d3tVar3;
        yde ydeVar3;
        int i10;
        int i11;
        int i12;
        int i13;
        yde ydeVar4;
        u2i u2iVar;
        nm6 nm6Var = nm6.a;
        int i14 = this.q;
        int i15 = 0;
        boolean z2 = true;
        hr4 hr4Var = this.r;
        switch (i14) {
            case 0:
                qgg.h0(obj);
                ha0 ha0Var = new ha0(24, hr4Var, this.t);
                this.q = 1;
                break;
            case 1:
                qgg.h0(obj);
                yde ydeVar5 = this.s.a;
                ydeVar5.getClass();
                ydeVar = ydeVar5;
                size = ydeVar5.size();
                i = 0;
                if (i < size) {
                    e1 e1Var = e1.x0;
                    this.j = null;
                    this.q = 6;
                    break;
                } else {
                    d3tVar = (d3t) ydeVar.get(i);
                    e1 e1Var2 = e1.v0;
                    this.j = ydeVar;
                    this.k = d3tVar;
                    this.l = i;
                    this.m = size;
                    this.q = 2;
                    break;
                }
                return nm6Var;
            case 2:
                size = this.m;
                i = this.l;
                d3tVar = this.k;
                ydeVar = this.j;
                qgg.h0(obj);
                d3tVar.getClass();
                jyr jyrVar = hr4.e;
                int i16 = d3tVar.a;
                if (i16 != 0 && (u2iVar = d3tVar.a(i15).l) != null) {
                    n2i[] n2iVarArr = u2iVar.a;
                    int length = n2iVarArr.length;
                    while (i15 < length) {
                        z = z2;
                        n2i n2iVar = n2iVarArr[i15];
                        n2iVar.getClass();
                        if (n2iVar instanceof v0e) {
                            if (d3tVar.b.c == 2) {
                                i11 = -1;
                                d3tVar2 = d3tVar;
                                ydeVar2 = ydeVar;
                                i12 = 0;
                                i5 = size;
                                i2 = i16;
                                i6 = i;
                                while (i12 < i2) {
                                    dsc a = d3tVar2.a(i12);
                                    a.getClass();
                                    i4 = a.u;
                                    if (i11 != i4) {
                                        boolean z3 = d3tVar2.e[i12];
                                        jyr jyrVar2 = hr4.e;
                                        int i17 = i12;
                                        dr4 dr4Var = new dr4(z3 ? "[X]" : "[ ]", i17, a, hr4.a(hr4Var, d3tVar2.d[i12]), 0);
                                        i3 = i17;
                                        this.j = ydeVar2;
                                        this.k = d3tVar2;
                                        this.l = i6;
                                        this.m = i5;
                                        this.n = i4;
                                        this.o = i3;
                                        this.p = i2;
                                        this.q = 3;
                                        break;
                                    } else {
                                        i12++;
                                    }
                                }
                                size = i5;
                                i13 = i6;
                                ydeVar4 = ydeVar2;
                                e1 e1Var3 = e1.w0;
                                this.j = ydeVar4;
                                this.k = null;
                                this.l = i13;
                                this.m = size;
                                this.q = 5;
                                break;
                            }
                            d3t d3tVar4 = d3tVar;
                            i8 = size;
                            i7 = i16;
                            d3tVar3 = d3tVar4;
                            ydeVar3 = ydeVar;
                            i10 = 0;
                            i9 = i;
                            while (i10 < i7) {
                                boolean z4 = d3tVar3.e[i10];
                                jyr jyrVar3 = hr4.e;
                                String str = z4 ? "[X]" : "[ ]";
                                String a2 = hr4.a(hr4Var, d3tVar3.d[i10]);
                                dsc a3 = d3tVar3.a(i10);
                                a3.getClass();
                                int i18 = i10;
                                dr4 dr4Var2 = new dr4(str, i18, a3, a2, 1);
                                this.j = ydeVar3;
                                this.k = d3tVar3;
                                this.l = i9;
                                this.m = i8;
                                this.n = i18;
                                this.o = i7;
                                this.q = 4;
                                if (hr4.b(hr4Var, dr4Var2, this) == nm6Var) {
                                    return nm6Var;
                                }
                                i10 = i18 + 1;
                            }
                            size = i8;
                            i13 = i9;
                            ydeVar4 = ydeVar3;
                            e1 e1Var32 = e1.w0;
                            this.j = ydeVar4;
                            this.k = null;
                            this.l = i13;
                            this.m = size;
                            this.q = 5;
                        } else {
                            i15++;
                            z2 = z;
                        }
                    }
                }
                z = z2;
                d3t d3tVar42 = d3tVar;
                i8 = size;
                i7 = i16;
                d3tVar3 = d3tVar42;
                ydeVar3 = ydeVar;
                i10 = 0;
                i9 = i;
                while (i10 < i7) {
                }
                size = i8;
                i13 = i9;
                ydeVar4 = ydeVar3;
                e1 e1Var322 = e1.w0;
                this.j = ydeVar4;
                this.k = null;
                this.l = i13;
                this.m = size;
                this.q = 5;
                break;
            case 3:
                i2 = this.p;
                i3 = this.o;
                i4 = this.n;
                i5 = this.m;
                i6 = this.l;
                d3tVar2 = this.k;
                ydeVar2 = this.j;
                qgg.h0(obj);
                z = true;
                i11 = i4;
                i12 = i3 + 1;
                while (i12 < i2) {
                }
                size = i5;
                i13 = i6;
                ydeVar4 = ydeVar2;
                e1 e1Var3222 = e1.w0;
                this.j = ydeVar4;
                this.k = null;
                this.l = i13;
                this.m = size;
                this.q = 5;
                break;
            case 4:
                i7 = this.o;
                int i19 = this.n;
                i8 = this.m;
                i9 = this.l;
                d3tVar3 = this.k;
                ydeVar3 = this.j;
                qgg.h0(obj);
                z = true;
                i10 = i19 + 1;
                while (i10 < i7) {
                }
                size = i8;
                i13 = i9;
                ydeVar4 = ydeVar3;
                e1 e1Var32222 = e1.w0;
                this.j = ydeVar4;
                this.k = null;
                this.l = i13;
                this.m = size;
                this.q = 5;
                break;
            case 5:
                size = this.m;
                i13 = this.l;
                ydeVar4 = this.j;
                qgg.h0(obj);
                z = true;
                ydeVar = ydeVar4;
                i = i13 + 1;
                z2 = z;
                i15 = 0;
                if (i < size) {
                }
                return nm6Var;
            case 6:
                qgg.h0(obj);
                return Unit.a;
            default:
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
