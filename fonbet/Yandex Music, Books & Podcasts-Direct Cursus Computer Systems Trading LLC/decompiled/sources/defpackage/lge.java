package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class lge {
    public final xfe a;
    public final cfe b;
    public final vrt c;
    public final jyr d;
    public awc e;
    public final boolean f;
    public volatile long g;
    public final qqi h;
    public final xdr i;
    public final fkn j;

    public lge(xfe xfeVar, cfe cfeVar, vrt vrtVar, afe afeVar, jyr jyrVar) {
        this.a = xfeVar;
        this.b = cfeVar;
        this.c = vrtVar;
        this.d = jyrVar;
        jyr jyrVar2 = tn4.a;
        boolean u = xz0.u(new rn4[]{rn4.b}, (rn4) tn4.b.getValue());
        this.f = u;
        this.h = rqi.a();
        xdr a = ydr.a(u ? cge.a : cge.f);
        this.i = a;
        this.j = new fkn(a);
    }

    public static nge d(cge cgeVar) {
        int ordinal = cgeVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return nge.b;
            }
            if (ordinal == 2) {
                return nge.c;
            }
            if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                b6e.s();
                return null;
            }
        }
        return nge.a;
    }

    public final Enum a(mfe mfeVar, kge kgeVar) {
        if (Intrinsics.d(mfeVar, lfe.a)) {
            return b(kgeVar);
        }
        if (mfeVar instanceof ife) {
            awc awcVar = this.e;
            if (awcVar != null) {
                awcVar.F(new v6o(((ife) mfeVar).a));
            }
            return cge.c;
        }
        if (Intrinsics.d(mfeVar, kfe.a)) {
            awc awcVar2 = this.e;
            if (awcVar2 != null) {
                awcVar2.F(y6o.b);
            }
            return cge.c;
        }
        if (!Intrinsics.d(mfeVar, jfe.a)) {
            b6e.s();
            return null;
        }
        awc awcVar3 = this.e;
        if (awcVar3 != null) {
            awcVar3.F(u6o.b);
        }
        return cge.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0087, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum b(cg6 cg6Var) {
        jge jgeVar;
        int i;
        aot aotVar;
        if (cg6Var instanceof jge) {
            jgeVar = (jge) cg6Var;
            int i2 = jgeVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jgeVar.l = i2 - Integer.MIN_VALUE;
                Object obj = jgeVar.j;
                nm6 nm6Var = nm6.a;
                i = jgeVar.l;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    jgeVar.l = 1;
                    obj = x97.V(dm6.b, new zts(this.c, continuation, 9), jgeVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return cge.d;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                aotVar = (aot) obj;
                if (aotVar instanceof ynt) {
                    if (!(aotVar instanceof wnt)) {
                        b6e.s();
                        return null;
                    }
                    awc awcVar = this.e;
                    if (awcVar != null) {
                        awcVar.F(new x6o(c7o.ERROR_ON_SUBSCRIPTION_CHECK));
                    }
                    return cge.c;
                }
                ynt yntVar = (ynt) aotVar;
                boolean z = yntVar.b;
                awc awcVar2 = this.e;
                if (!z) {
                    if (awcVar2 != null) {
                        awcVar2.F(new x6o(c7o.NOT_SUBSCRIBED));
                    }
                    return cge.c;
                }
                if (awcVar2 != null) {
                    awcVar2.F(new x6o(c7o.SUBSCRIBED));
                }
                efe efeVar = (efe) this.d.getValue();
                String str = yntVar.a;
                jgeVar.l = 2;
                Object a = lmm.a(((hfe) efeVar).a, new gfe(str, null), jgeVar);
                if (a != nm6Var) {
                    a = Unit.a;
                }
            }
        }
        jgeVar = new jge(this, cg6Var);
        Object obj2 = jgeVar.j;
        nm6 nm6Var2 = nm6.a;
        i = jgeVar.l;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        aotVar = (aot) obj2;
        if (aotVar instanceof ynt) {
        }
    }

    public final boolean c(boolean z) {
        if (this.f) {
            return (z || System.currentTimeMillis() - this.g > mge.a) && this.i.getValue() != cge.b;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dc, code lost:
    
        if (r13 != r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d A[Catch: all -> 0x007d, TRY_LEAVE, TryCatch #1 {all -> 0x007d, blocks: (B:26:0x0067, B:28:0x006d, B:31:0x0080), top: B:25:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[Catch: all -> 0x007d, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x007d, blocks: (B:26:0x0067, B:28:0x006d, B:31:0x0080), top: B:25:0x0067 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum e(String str, boolean z, cg6 cg6Var) {
        kge kgeVar;
        int i;
        String str2;
        oqi oqiVar;
        boolean z2;
        lge lgeVar;
        try {
            try {
                if (cg6Var instanceof kge) {
                    kgeVar = (kge) cg6Var;
                    int i2 = kgeVar.o;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        kgeVar.o = i2 - Integer.MIN_VALUE;
                        Object obj = kgeVar.m;
                        nm6 nm6Var = nm6.a;
                        i = kgeVar.o;
                        if (i != 0) {
                            qgg.h0(obj);
                            qqi qqiVar = this.h;
                            kgeVar.j = str;
                            kgeVar.k = qqiVar;
                            kgeVar.l = z;
                            kgeVar.o = 1;
                            if (qqiVar.a(kgeVar) != nm6Var) {
                                str2 = str;
                                oqiVar = qqiVar;
                            }
                            return nm6Var;
                        }
                        if (i == 1) {
                            z = kgeVar.l;
                            oqiVar = (oqi) kgeVar.k;
                            str2 = kgeVar.j;
                            qgg.h0(obj);
                        } else {
                            if (i != 2) {
                                if (i != 3) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                qgg.h0(obj);
                                cge cgeVar = (cge) obj;
                                this.i.l(cgeVar);
                                return d(cgeVar);
                            }
                            z2 = kgeVar.l;
                            lgeVar = (lge) kgeVar.k;
                            qgg.h0(obj);
                            kgeVar.j = null;
                            kgeVar.k = null;
                            kgeVar.l = z2;
                            kgeVar.o = 3;
                            obj = lgeVar.a((mfe) obj, kgeVar);
                        }
                        if (c(z)) {
                            return d((cge) this.i.getValue());
                        }
                        this.g = System.currentTimeMillis();
                        xdr xdrVar = this.i;
                        cge cgeVar2 = cge.b;
                        xdrVar.getClass();
                        xdrVar.m(null, cgeVar2);
                        oqiVar.b(null);
                        l13 l13Var = this.a.a;
                        str2.getClass();
                        awc awcVar = new awc(new yee(str2, (it0) l13Var.a.D(hag.I(it0.class), l13Var, l13Var.b)));
                        this.e = awcVar;
                        awcVar.F(w6o.b);
                        cfe cfeVar = this.b;
                        kgeVar.j = null;
                        kgeVar.k = this;
                        kgeVar.l = z;
                        kgeVar.o = 2;
                        obj = cfeVar.a(kgeVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        z2 = z;
                        lgeVar = this;
                        kgeVar.j = null;
                        kgeVar.k = null;
                        kgeVar.l = z2;
                        kgeVar.o = 3;
                        obj = lgeVar.a((mfe) obj, kgeVar);
                    }
                }
                if (c(z)) {
                }
            } finally {
                oqiVar.b(null);
            }
            if (i != 0) {
            }
        } catch (CancellationException e) {
            xdr xdrVar2 = this.i;
            cge cgeVar3 = cge.a;
            xdrVar2.getClass();
            xdrVar2.m(null, cgeVar3);
            throw e;
        }
        kgeVar = new kge(this, cg6Var);
        Object obj2 = kgeVar.m;
        nm6 nm6Var2 = nm6.a;
        i = kgeVar.o;
    }
}
