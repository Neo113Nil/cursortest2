package defpackage;

import android.nfc.Tag;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h1j extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1j(Continuation continuation, ivk ivkVar, String str, int i) {
        super(2, continuation);
        this.j = 25;
        this.l = ivkVar;
        this.m = str;
        this.k = i;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [aur, kotlin.jvm.functions.Function2] */
    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new h1j((i1j) this.l, (ltm) this.m, continuation, 0);
            case 1:
                return new h1j((z3j) this.m, continuation, 1);
            case 2:
                return new h1j((b6j) this.l, (Tag) this.m, continuation, 2);
            case 3:
                return new h1j((v9j) this.m, continuation, 3);
            case 4:
                return new h1j((v9j) this.l, (vbc) this.m, continuation, 4);
            case 5:
                return new h1j((dn9) this.l, (Throwable) this.m, continuation, 5);
            case 6:
                h1j h1jVar = new h1j((vcj) this.m, continuation, 6);
                h1jVar.l = obj;
                return h1jVar;
            case 7:
                return new h1j((udj) this.m, continuation, 7);
            case 8:
                return new h1j((udj) this.l, (vbc) this.m, continuation, 8);
            case 9:
                return new h1j((kij) this.l, (eba) this.m, continuation, 9);
            case 10:
                return new h1j((fvf) this.l, (Function0) this.m, continuation, 10);
            case 11:
                return new h1j((o3k) this.l, (yoc) this.m, continuation, 11);
            case 12:
                h1j h1jVar2 = new h1j((rvj) this.m, continuation, 12);
                h1jVar2.l = obj;
                return h1jVar2;
            case 13:
                return new h1j((cwj) this.m, continuation, 13);
            case 14:
                h1j h1jVar3 = new h1j((j1k) this.m, continuation, 14);
                h1jVar3.l = obj;
                return h1jVar3;
            case 15:
                return new h1j((w1k) this.l, (pjq) this.m, continuation, 15);
            case 16:
                return new h1j((w1k) this.l, (zi3) this.m, continuation, 16);
            case 17:
                return new h1j((dib) this.l, (tsf) this.m, continuation, 17);
            case 18:
                return new h1j((dib) this.l, (fvf) this.m, continuation, 18);
            case 19:
                return new h1j((Function2) this.l, (w9k) this.m, continuation);
            case 20:
                h1j h1jVar4 = new h1j((ekk) this.m, continuation, 20);
                h1jVar4.l = obj;
                return h1jVar4;
            case 21:
                return new h1j((ekk) this.l, (String) this.m, continuation, 21);
            case 22:
                return new h1j((klk) this.l, (wkk) this.m, continuation, 22);
            case 23:
                return new h1j((ork) this.l, (String) this.m, continuation, 23);
            case 24:
                return new h1j((yuk) this.l, (ruk) this.m, continuation, 24);
            case 25:
                return new h1j(continuation, (ivk) this.l, (String) this.m, this.k);
            case 26:
                return new h1j((xlw) this.m, continuation, 26);
            case 27:
                return new h1j((kz3) this.l, (r1l) this.m, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new h1j((t1f) this.l, (v1l) this.m, continuation, 28);
            default:
                return new h1j((z4l) this.l, (s4l) this.m, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((h1j) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x03de, code lost:
    
        if (defpackage.y2x.p(r3, r62) == r2) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x03fb, code lost:
    
        if (r3 == r2) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0728, code lost:
    
        if (r0 == r3) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x076b, code lost:
    
        if (r0 == r3) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0989, code lost:
    
        if (r0 == r3) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x09cc, code lost:
    
        if (r0 == r3) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0112, code lost:
    
        if (r2.collect(r3, r62) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00af, code lost:
    
        if (defpackage.zsd.g0(r2, r62) == r0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x015c, code lost:
    
        if (r0 == r2) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014b, code lost:
    
        if (r3 == r2) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:354:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:361:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0a8a  */
    /* JADX WARN: Removed duplicated region for block: B:440:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:447:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b1 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v130, types: [aur, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:138:0x03ed -> B:129:0x03c1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:140:0x03fb -> B:127:0x03ff). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        xdr xdrVar;
        Object c;
        v9j v9jVar;
        Object x;
        v9j v9jVar2;
        Object y;
        Object y2;
        Object d;
        udj udjVar;
        Object q;
        udj udjVar2;
        Object y3;
        Object y4;
        Object a2;
        dkk dkkVar;
        Object s;
        Boolean bool;
        gxc gxcVar;
        Boolean bool2;
        Iterator it;
        Boolean bool3;
        Object obj2;
        Object b;
        Object b2;
        int i = 7;
        int i2 = 11;
        int i3 = 10;
        int i4 = 3;
        int i5 = 25;
        int i6 = 0;
        int i7 = 2;
        int i8 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(1000L, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                jsg.j().e(r3w.a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
                ((oc4) ((ltm) this.m)).c(new ma6(7));
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    z3j z3jVar = (z3j) this.m;
                    xdr xdrVar2 = z3jVar.k;
                    this.l = xdrVar2;
                    this.k = 1;
                    a = z3j.a(z3jVar, this);
                    if (a == nm6Var2) {
                        return nm6Var2;
                    }
                    xdrVar = xdrVar2;
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar = (xdr) this.l;
                    qgg.h0(obj);
                    a = obj;
                }
                xdrVar.l(a);
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    b6j b6jVar = (b6j) this.l;
                    Tag tag = (Tag) this.m;
                    tag.getClass();
                    this.k = 1;
                    if (b6j.a(b6jVar, tag, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                wg wgVar = wg.s;
                l18 l18Var = l18.b;
                v9j v9jVar3 = (v9j) this.m;
                nm6 nm6Var4 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    int ordinal = v9jVar3.k.ordinal();
                    if (ordinal == 0) {
                        k35 k35Var = (k35) v9jVar3.n.getValue();
                        this.l = v9jVar3;
                        this.k = 1;
                        c = ((v55) k35Var.b.getValue()).c(this);
                        if (c == nm6Var4) {
                            return nm6Var4;
                        }
                        v9jVar = v9jVar3;
                        v9j.a(v9jVar, (wv1) c);
                        xdr xdrVar3 = v9jVar3.t;
                        k35 k35Var2 = (k35) v9jVar3.n.getValue();
                        k35Var2.getClass();
                        bdt I = hag.I(frt.class);
                        qdc qdcVar = l18Var.a;
                        qdcVar.getClass();
                        String str = ((frt) qdcVar.C(I)).c().a;
                        str.getClass();
                        h15 b3 = u12.b(k35Var2.a, str);
                        Continuation continuation2 = null;
                        t9j t9jVar = new t9j(v9jVar3, continuation2, i6);
                        u9j u9jVar = new u9j(v9jVar3, i6);
                        this.l = null;
                        this.k = 2;
                        y = tt0.y(u9jVar, new l1((Object) t9jVar, continuation2, i5), this, wgVar, new pjc[]{xdrVar3, b3});
                        if (y != nm6Var4) {
                        }
                        if (y == nm6Var4) {
                        }
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        l35 l35Var = (l35) v9jVar3.o.getValue();
                        this.l = v9jVar3;
                        this.k = 3;
                        x = ((v55) l35Var.b.getValue()).x(this);
                        if (x == nm6Var4) {
                            return nm6Var4;
                        }
                        v9jVar2 = v9jVar3;
                        v9j.G(v9jVar2, (kcm) x);
                        xdr xdrVar4 = v9jVar3.t;
                        l35 l35Var2 = (l35) v9jVar3.o.getValue();
                        l35Var2.getClass();
                        bdt I2 = hag.I(frt.class);
                        qdc qdcVar2 = l18Var.a;
                        qdcVar2.getClass();
                        String str2 = ((frt) qdcVar2.C(I2)).c().a;
                        str2.getClass();
                        h15 f = u12.f(l35Var2.a, str2);
                        Continuation continuation3 = null;
                        t9j t9jVar2 = new t9j(v9jVar3, continuation3, i8);
                        u9j u9jVar2 = new u9j(v9jVar3, i8);
                        this.l = null;
                        this.k = 4;
                        y2 = tt0.y(u9jVar2, new l1((Object) t9jVar2, continuation3, i5), this, wgVar, new pjc[]{xdrVar4, f});
                        if (y2 != nm6Var4) {
                        }
                        if (y2 == nm6Var4) {
                        }
                    }
                } else if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 == 3) {
                            v9j v9jVar4 = (v9j) this.l;
                            qgg.h0(obj);
                            v9jVar2 = v9jVar4;
                            x = obj;
                            v9j.G(v9jVar2, (kcm) x);
                            xdr xdrVar42 = v9jVar3.t;
                            l35 l35Var22 = (l35) v9jVar3.o.getValue();
                            l35Var22.getClass();
                            bdt I22 = hag.I(frt.class);
                            qdc qdcVar22 = l18Var.a;
                            qdcVar22.getClass();
                            String str22 = ((frt) qdcVar22.C(I22)).c().a;
                            str22.getClass();
                            h15 f2 = u12.f(l35Var22.a, str22);
                            Continuation continuation32 = null;
                            t9j t9jVar22 = new t9j(v9jVar3, continuation32, i8);
                            u9j u9jVar22 = new u9j(v9jVar3, i8);
                            this.l = null;
                            this.k = 4;
                            y2 = tt0.y(u9jVar22, new l1((Object) t9jVar22, continuation32, i5), this, wgVar, new pjc[]{xdrVar42, f2});
                            if (y2 != nm6Var4) {
                                y2 = Unit.a;
                            }
                            if (y2 == nm6Var4) {
                                return nm6Var4;
                            }
                        } else if (i12 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    qgg.h0(obj);
                } else {
                    v9j v9jVar5 = (v9j) this.l;
                    qgg.h0(obj);
                    v9jVar = v9jVar5;
                    c = obj;
                    v9j.a(v9jVar, (wv1) c);
                    xdr xdrVar32 = v9jVar3.t;
                    k35 k35Var22 = (k35) v9jVar3.n.getValue();
                    k35Var22.getClass();
                    bdt I3 = hag.I(frt.class);
                    qdc qdcVar3 = l18Var.a;
                    qdcVar3.getClass();
                    String str3 = ((frt) qdcVar3.C(I3)).c().a;
                    str3.getClass();
                    h15 b32 = u12.b(k35Var22.a, str3);
                    Continuation continuation22 = null;
                    t9j t9jVar3 = new t9j(v9jVar3, continuation22, i6);
                    u9j u9jVar3 = new u9j(v9jVar3, i6);
                    this.l = null;
                    this.k = 2;
                    y = tt0.y(u9jVar3, new l1((Object) t9jVar3, continuation22, i5), this, wgVar, new pjc[]{xdrVar32, b32});
                    if (y != nm6Var4) {
                        y = Unit.a;
                    }
                    if (y == nm6Var4) {
                        return nm6Var4;
                    }
                }
                return Unit.a;
            case 4:
                vbc vbcVar = (vbc) this.m;
                v9j v9jVar6 = (v9j) this.l;
                Object obj3 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    int ordinal2 = v9jVar6.k.ordinal();
                    if (ordinal2 == 0) {
                        ((lz1) v9jVar6.p.getValue()).getClass();
                        wv1 a3 = lz1.a(vbcVar);
                        v9j.a(v9jVar6, a3);
                        k35 k35Var3 = (k35) v9jVar6.n.getValue();
                        this.k = 1;
                        Object a4 = lmm.a(((v55) k35Var3.b.getValue()).r(), new a55(a3, null), this);
                        if (a4 != obj3) {
                            a4 = Unit.a;
                        }
                        if (a4 != obj3) {
                            a4 = Unit.a;
                            break;
                        }
                    } else {
                        if (ordinal2 != 1) {
                            b6e.s();
                            return null;
                        }
                        ((jcm) v9jVar6.q.getValue()).getClass();
                        kcm a5 = jcm.a(vbcVar);
                        v9j.G(v9jVar6, a5);
                        l35 l35Var3 = (l35) v9jVar6.o.getValue();
                        this.k = 2;
                        Object a6 = lmm.a(((v55) l35Var3.b.getValue()).r(), new u55(a5, null), this);
                        if (a6 != obj3) {
                            a6 = Unit.a;
                        }
                        if (a6 != obj3) {
                            a6 = Unit.a;
                            break;
                        }
                    }
                } else {
                    if (i13 == 1 || i13 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                break;
            case 5:
                nm6 nm6Var5 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar = (j0q) ((dn9) this.l).e;
                    Throwable th = (Throwable) this.m;
                    th.getClass();
                    this.k = 1;
                    if (j0qVar.emit(th, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i14 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                vcj vcjVar = (vcj) this.m;
                mm6 mm6Var = (mm6) this.l;
                nm6 nm6Var6 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    rar y5 = x97.y(mm6Var, null, null, new m1i(vcjVar, null, 17), 3);
                    pjc a7 = vcjVar.m.a();
                    lrf lrfVar = new lrf(23, vcjVar, y5);
                    this.l = null;
                    this.k = 1;
                    if (a7.collect(lrfVar, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 7:
                wg wgVar2 = wg.s;
                l18 l18Var2 = l18.b;
                udj udjVar3 = (udj) this.m;
                nm6 nm6Var7 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    int ordinal3 = udjVar3.k.ordinal();
                    if (ordinal3 == 0) {
                        fw4 fw4Var = (fw4) udjVar3.n.getValue();
                        this.l = udjVar3;
                        this.k = 1;
                        d = ((v55) fw4Var.b.getValue()).d(this);
                        if (d == nm6Var7) {
                            return nm6Var7;
                        }
                        udjVar = udjVar3;
                        udj.a(udjVar, (nd4) d);
                        xdr xdrVar5 = udjVar3.t;
                        fw4 fw4Var2 = (fw4) udjVar3.n.getValue();
                        fw4Var2.getClass();
                        bdt I4 = hag.I(frt.class);
                        qdc qdcVar4 = l18Var2.a;
                        qdcVar4.getClass();
                        String str4 = ((frt) qdcVar4.C(I4)).c().a;
                        str4.getClass();
                        h15 a8 = u12.a(fw4Var2.a, str4);
                        Continuation continuation4 = null;
                        sdj sdjVar = new sdj(udjVar3, continuation4, i6);
                        tdj tdjVar = new tdj(udjVar3, i6);
                        this.l = null;
                        this.k = 2;
                        y3 = tt0.y(tdjVar, new l1((Object) sdjVar, continuation4, i5), this, wgVar2, new pjc[]{xdrVar5, a8});
                        if (y3 != nm6Var7) {
                        }
                        if (y3 == nm6Var7) {
                        }
                    } else {
                        if (ordinal3 != 1) {
                            b6e.s();
                            return null;
                        }
                        e35 e35Var = (e35) udjVar3.o.getValue();
                        this.l = udjVar3;
                        this.k = 3;
                        q = ((v55) e35Var.b.getValue()).q(this);
                        if (q == nm6Var7) {
                            return nm6Var7;
                        }
                        udjVar2 = udjVar3;
                        udj.G(udjVar2, (aeb) q);
                        xdr xdrVar6 = udjVar3.t;
                        e35 e35Var2 = (e35) udjVar3.o.getValue();
                        e35Var2.getClass();
                        bdt I5 = hag.I(frt.class);
                        qdc qdcVar5 = l18Var2.a;
                        qdcVar5.getClass();
                        String str5 = ((frt) qdcVar5.C(I5)).c().a;
                        str5.getClass();
                        h15 g = u12.g(e35Var2.a, str5);
                        Continuation continuation5 = null;
                        sdj sdjVar2 = new sdj(udjVar3, continuation5, i8);
                        tdj tdjVar2 = new tdj(udjVar3, i8);
                        this.l = null;
                        this.k = 4;
                        y4 = tt0.y(tdjVar2, new l1((Object) sdjVar2, continuation5, i5), this, wgVar2, new pjc[]{xdrVar6, g});
                        if (y4 != nm6Var7) {
                        }
                        if (y4 == nm6Var7) {
                        }
                    }
                } else if (i16 != 1) {
                    if (i16 != 2) {
                        if (i16 == 3) {
                            udj udjVar4 = (udj) this.l;
                            qgg.h0(obj);
                            udjVar2 = udjVar4;
                            q = obj;
                            udj.G(udjVar2, (aeb) q);
                            xdr xdrVar62 = udjVar3.t;
                            e35 e35Var22 = (e35) udjVar3.o.getValue();
                            e35Var22.getClass();
                            bdt I52 = hag.I(frt.class);
                            qdc qdcVar52 = l18Var2.a;
                            qdcVar52.getClass();
                            String str52 = ((frt) qdcVar52.C(I52)).c().a;
                            str52.getClass();
                            h15 g2 = u12.g(e35Var22.a, str52);
                            Continuation continuation52 = null;
                            sdj sdjVar22 = new sdj(udjVar3, continuation52, i8);
                            tdj tdjVar22 = new tdj(udjVar3, i8);
                            this.l = null;
                            this.k = 4;
                            y4 = tt0.y(tdjVar22, new l1((Object) sdjVar22, continuation52, i5), this, wgVar2, new pjc[]{xdrVar62, g2});
                            if (y4 != nm6Var7) {
                                y4 = Unit.a;
                            }
                            if (y4 == nm6Var7) {
                                return nm6Var7;
                            }
                        } else if (i16 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    qgg.h0(obj);
                } else {
                    udj udjVar5 = (udj) this.l;
                    qgg.h0(obj);
                    udjVar = udjVar5;
                    d = obj;
                    udj.a(udjVar, (nd4) d);
                    xdr xdrVar52 = udjVar3.t;
                    fw4 fw4Var22 = (fw4) udjVar3.n.getValue();
                    fw4Var22.getClass();
                    bdt I42 = hag.I(frt.class);
                    qdc qdcVar42 = l18Var2.a;
                    qdcVar42.getClass();
                    String str42 = ((frt) qdcVar42.C(I42)).c().a;
                    str42.getClass();
                    h15 a82 = u12.a(fw4Var22.a, str42);
                    Continuation continuation42 = null;
                    sdj sdjVar3 = new sdj(udjVar3, continuation42, i6);
                    tdj tdjVar3 = new tdj(udjVar3, i6);
                    this.l = null;
                    this.k = 2;
                    y3 = tt0.y(tdjVar3, new l1((Object) sdjVar3, continuation42, i5), this, wgVar2, new pjc[]{xdrVar52, a82});
                    if (y3 != nm6Var7) {
                        y3 = Unit.a;
                    }
                    if (y3 == nm6Var7) {
                        return nm6Var7;
                    }
                }
                return Unit.a;
            case 8:
                vbc vbcVar2 = (vbc) this.m;
                udj udjVar6 = (udj) this.l;
                Object obj4 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    int ordinal4 = udjVar6.k.ordinal();
                    if (ordinal4 == 0) {
                        ((md4) udjVar6.q.getValue()).getClass();
                        nd4 a9 = md4.a(vbcVar2);
                        udj.a(udjVar6, a9);
                        fw4 fw4Var3 = (fw4) udjVar6.n.getValue();
                        this.k = 1;
                        Object a10 = lmm.a(((v55) fw4Var3.b.getValue()).r(), new b55(a9, null), this);
                        if (a10 != obj4) {
                            a10 = Unit.a;
                        }
                        if (a10 != obj4) {
                            a10 = Unit.a;
                            break;
                        }
                    } else {
                        if (ordinal4 != 1) {
                            b6e.s();
                            return null;
                        }
                        ((zdb) udjVar6.p.getValue()).getClass();
                        aeb a11 = zdb.a(vbcVar2);
                        udj.G(udjVar6, a11);
                        e35 e35Var3 = (e35) udjVar6.o.getValue();
                        this.k = 2;
                        Object a12 = lmm.a(((v55) e35Var3.b.getValue()).r(), new o55(a11, null), this);
                        if (a12 != obj4) {
                            a12 = Unit.a;
                        }
                        if (a12 != obj4) {
                            a12 = Unit.a;
                            break;
                        }
                    }
                } else {
                    if (i17 == 1 || i17 == 2) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                break;
            case 9:
                nm6 nm6Var8 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = ((kij) this.l).d;
                    eba ebaVar = (eba) this.m;
                    this.k = 1;
                    if (x0qVar.emit(ebaVar, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 10:
                nm6 nm6Var9 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    h7a d0 = zsd.d0(szf.s0(new ga2((fvf) this.l, i)), 1);
                    fmi fmiVar = new fmi(i2, (Function0) this.m);
                    this.k = 1;
                    if (d0.collect(fmiVar, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                Object obj5 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    o3k o3kVar = (o3k) this.l;
                    this.k = 1;
                    Object g3 = o3k.g(o3kVar, o3kVar.j() + 1, null, this, 6);
                    if (g3 != obj5) {
                        g3 = Unit.a;
                    }
                    if (g3 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i20 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                yoc.b((yoc) this.m);
                return Unit.a;
            case 12:
                jtm jtmVar = (jtm) this.l;
                nm6 nm6Var10 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    tqn tqnVar = new tqn();
                    tqnVar.a = true;
                    fkn fknVar = ((rvj) this.m).e;
                    pvj pvjVar = new pvj(jtmVar, tqnVar, null, i6);
                    this.l = null;
                    this.k = 1;
                    if (zsd.O(fknVar, pvjVar, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                cwj cwjVar = (cwj) this.m;
                xdr xdrVar7 = cwjVar.y;
                nm6 nm6Var11 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    xdrVar7.l(null);
                    qvj qvjVar = cwjVar.n;
                    String R = cwjVar.l.R();
                    String str6 = cwjVar.o;
                    this.l = xdrVar7;
                    this.k = 1;
                    jyr jyrVar = qvjVar.a;
                    jyr jyrVar2 = qvjVar.b;
                    qkj b4 = ((k5m) jyrVar.getValue()).b();
                    if (str6 == null) {
                        str6 = ((mh7) jyrVar2.getValue()).a();
                    }
                    a2 = b4.a(new rkj(18, "music_option_paywall_screen", R, str6, null, ((mh7) jyrVar2.getValue()).b()), this);
                    if (a2 == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdrVar7 = (xdr) this.l;
                    qgg.h0(obj);
                    a2 = obj;
                }
                xdrVar7.l(a2);
                return Unit.a;
            case 14:
                j1k j1kVar = (j1k) this.m;
                nm6 nm6Var12 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    pjq pjqVar = (pjq) this.l;
                    Continuation continuation6 = null;
                    int i24 = 9;
                    pjc M = hyf.M(new yjc(new bca(new eno(new d57(new clc((b56) j1kVar.c.b, new jud(i7, i3, continuation6)), new cle(j1kVar, continuation6, i24), continuation6, i24)), 18), new cle(continuation6, j1kVar, i3), null, 1));
                    ds1 ds1Var = new ds1(i7, pjqVar);
                    this.k = 1;
                    if (M.collect(ds1Var, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                nm6 nm6Var13 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    nc4 V = zsd.V(((w1k) this.l).h);
                    fmi fmiVar2 = new fmi(14, (pjq) this.m);
                    this.k = 1;
                    if (V.collect(fmiVar2, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                nm6 nm6Var14 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = ((w1k) this.l).d;
                    fmi fmiVar3 = new fmi(15, (zi3) this.m);
                    this.k = 1;
                    if (pjcVar.collect(fmiVar3, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                nm6 nm6Var15 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    dib dibVar = (dib) this.l;
                    ssf ssfVar = new ssf((tsf) this.m, null);
                    this.k = 1;
                    if (zsd.O(dibVar, ssfVar, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                nm6 nm6Var16 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    dib dibVar2 = (dib) this.l;
                    aq5 aq5Var = new aq5((fvf) this.m, null, i4);
                    this.k = 1;
                    if (zsd.O(dibVar2, aq5Var, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 19:
                nm6 nm6Var17 = nm6.a;
                int i29 = this.k;
                if (i29 != 0) {
                    if (i29 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ?? r2 = (aur) this.l;
                w9k w9kVar = (w9k) this.m;
                this.k = 1;
                Object invoke = r2.invoke(w9kVar, this);
                return invoke == nm6Var17 ? nm6Var17 : invoke;
            case 20:
                mm6 mm6Var2 = (mm6) this.l;
                nm6 nm6Var18 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    if (!gld.T(mm6Var2)) {
                    }
                } else if (i30 == 1) {
                    qgg.h0(obj);
                    ekk ekkVar = (ekk) this.m;
                    synchronized (ekkVar) {
                        dkkVar = (dkk) ekkVar.g.c;
                    }
                    if (dkkVar != null) {
                        ou7 ou7Var = dkkVar.a;
                        this.l = mm6Var2;
                        this.k = 2;
                        s = ou7Var.s(this);
                        nm6 nm6Var19 = nm6.a;
                        break;
                    }
                    if (!gld.T(mm6Var2)) {
                    }
                } else {
                    if (i30 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    s = obj;
                    ueo ueoVar = (ueo) s;
                    if (ueoVar != null) {
                        ueoVar.p();
                    }
                    if (!gld.T(mm6Var2)) {
                        return Unit.a;
                    }
                    long q2 = nsa.q(((ekk) this.m).c, 0.8d);
                    this.l = mm6Var2;
                    this.k = 1;
                    break;
                }
            case 21:
                nm6 nm6Var20 = nm6.a;
                int i31 = this.k;
                if (i31 != 0) {
                    if (i31 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ekk ekkVar2 = (ekk) this.l;
                String str7 = (String) this.m;
                this.k = 1;
                Object b5 = ekkVar2.b(str7, this);
                return b5 == nm6Var20 ? nm6Var20 : b5;
            case 22:
                nm6 nm6Var21 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    j0q j0qVar2 = ((klk) this.l).b;
                    wkk wkkVar = (wkk) this.m;
                    this.k = 1;
                    if (j0qVar2.emit(wkkVar, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                Object obj6 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    ork orkVar = (ork) this.l;
                    String str8 = (String) this.m;
                    this.k = 1;
                    Object V2 = x97.V(orkVar.d.a, new nrk(str8, orkVar, null), this);
                    if (V2 != obj6) {
                        V2 = Unit.a;
                    }
                    if (V2 == obj6) {
                        return obj6;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                nm6 nm6Var22 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    ivk ivkVar = (ivk) ((yuk) this.l).d.getValue();
                    ruk rukVar = (ruk) this.m;
                    this.k = 1;
                    if (ivkVar.a(rukVar, this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                bvk v = ((ivk) this.l).b.v();
                String str9 = (String) this.m;
                int i35 = this.k;
                v.getClass();
                str9.getClass();
                List list = (List) up6.F(v.a, true, false, new x20(str9, i35, 5));
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new Long(((fvk) it2.next()).a));
                }
                ArrayList arrayList2 = new ArrayList(v75.o(list, 10));
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    fvk fvkVar = (fvk) it3.next();
                    String str10 = fvkVar.F;
                    String str11 = fvkVar.c;
                    String str12 = fvkVar.B;
                    String str13 = fvkVar.y;
                    Boolean bool4 = fvkVar.w;
                    String str14 = fvkVar.t;
                    String str15 = fvkVar.b;
                    String str16 = fvkVar.H;
                    String str17 = fvkVar.z;
                    String str18 = fvkVar.A;
                    Iterator it4 = it3;
                    Float f3 = fvkVar.E;
                    Float f4 = fvkVar.D;
                    Float f5 = fvkVar.o;
                    Boolean bool5 = fvkVar.p;
                    Boolean bool6 = fvkVar.q;
                    Float f6 = fvkVar.G;
                    String str19 = fvkVar.s;
                    String str20 = fvkVar.h;
                    String str21 = fvkVar.r;
                    String str23 = fvkVar.i;
                    Boolean bool7 = fvkVar.j;
                    Boolean bool8 = fvkVar.k;
                    Boolean bool9 = fvkVar.l;
                    String str24 = fvkVar.m;
                    String str25 = fvkVar.n;
                    String str26 = fvkVar.d;
                    String str27 = fvkVar.C;
                    String str28 = fvkVar.x;
                    String str29 = fvkVar.g;
                    String str30 = fvkVar.f;
                    String str31 = fvkVar.e;
                    Boolean bool10 = fvkVar.u;
                    String str32 = fvkVar.v;
                    String str33 = fvkVar.J;
                    Boolean bool11 = fvkVar.K;
                    String str34 = fvkVar.L;
                    if (str34 == null) {
                        bool = bool4;
                    } else {
                        bool = bool4;
                        String str35 = fvkVar.R;
                        if (str35 != null) {
                            gxcVar = new gxc(str34, str35);
                            gj gjVar = new gj(fvkVar.M, fvkVar.N, fvkVar.O, fvkVar.P, fvkVar.Q, null);
                            String str36 = fvkVar.S;
                            bool2 = fvkVar.T;
                            Float f7 = fvkVar.U;
                            b2c b2cVar = e4c.b;
                            String str37 = fvkVar.V;
                            b2cVar.getClass();
                            it = e4c.g.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    bool3 = bool2;
                                    obj2 = null;
                                } else {
                                    obj2 = it.next();
                                    bool3 = bool2;
                                    if (Intrinsics.d(str37, ((e4c) obj2).a)) {
                                        break;
                                    }
                                    bool2 = bool3;
                                }
                            }
                            arrayList2.add(new ruk(str10, str11, str12, str13, bool, str14, str15, str16, str17, str18, f3, f4, f5, bool5, bool6, f6, str19, str20, str21, str23, bool7, bool8, bool9, str24, str25, str26, str27, str28, str29, str30, str31, bool10, str32, str33, bool11, gxcVar, gjVar, str36, bool3, f7, (e4c) obj2, fvkVar.W));
                            it3 = it4;
                        }
                    }
                    gxcVar = null;
                    gj gjVar2 = new gj(fvkVar.M, fvkVar.N, fvkVar.O, fvkVar.P, fvkVar.Q, null);
                    String str362 = fvkVar.S;
                    bool2 = fvkVar.T;
                    Float f72 = fvkVar.U;
                    b2c b2cVar2 = e4c.b;
                    String str372 = fvkVar.V;
                    b2cVar2.getClass();
                    it = e4c.g.iterator();
                    while (true) {
                        if (it.hasNext()) {
                        }
                        bool2 = bool3;
                    }
                    arrayList2.add(new ruk(str10, str11, str12, str13, bool, str14, str15, str16, str17, str18, f3, f4, f5, bool5, bool6, f6, str19, str20, str21, str23, bool7, bool8, bool9, str24, str25, str26, str27, str28, str29, str30, str31, bool10, str32, str33, bool11, gxcVar, gjVar2, str362, bool3, f72, (e4c) obj2, fvkVar.W));
                    it3 = it4;
                }
                return new Pair(arrayList, arrayList2);
            case 26:
                xlw xlwVar = (xlw) this.m;
                nm6 nm6Var24 = nm6.a;
                int i36 = this.k;
                if (i36 == 0) {
                    qgg.h0(obj);
                    pbx pbxVar = (pbx) xlwVar.c.c;
                    this.k = 1;
                    b = pbxVar.b(this);
                    break;
                } else {
                    if (i36 != 1) {
                        if (i36 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj7 = this.l;
                        qgg.h0(obj);
                        b = obj7;
                        b2 = obj;
                        return new Pair(b, b2);
                    }
                    qgg.h0(obj);
                    b = obj;
                }
                pbx pbxVar2 = (pbx) xlwVar.c.d;
                this.l = b;
                this.k = 2;
                b2 = pbxVar2.b(this);
                break;
            case 27:
                nm6 nm6Var25 = nm6.a;
                int i37 = this.k;
                if (i37 == 0) {
                    qgg.h0(obj);
                    l18 l18Var3 = l18.b;
                    bdt I6 = hag.I(frt.class);
                    qdc qdcVar6 = l18Var3.a;
                    qdcVar6.getClass();
                    pjc g4 = ((frt) qdcVar6.C(I6)).g();
                    this.k = 1;
                    break;
                } else {
                    if (i37 != 1) {
                        if (i37 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                kz3 kz3Var = (kz3) this.l;
                t1f t1fVar = ((oq7) kz3Var.a.getValue()).d;
                msa msaVar = nsa.b;
                pjc C = zsd.C(zsd.M0(zsd.b0(new njf(zsd.b0(new a1l(((oq7) kz3Var.a.getValue()).a.c, i8)), kz3Var, 26)), new cle(continuation, new njf(t1fVar.D(yd5.N(2000L, ssa.MILLISECONDS)), kz3Var, i5), i2)), -1);
                fmi fmiVar4 = new fmi(24, (r1l) this.m);
                this.k = 2;
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var26 = nm6.a;
                int i38 = this.k;
                if (i38 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar2 = (x0q) ((t1f) this.l).d;
                    v1l v1lVar = (v1l) this.m;
                    this.k = 1;
                    if (x0qVar2.emit(v1lVar, this) == nm6Var26) {
                        return nm6Var26;
                    }
                } else {
                    if (i38 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var27 = nm6.a;
                int i39 = this.k;
                try {
                    if (i39 == 0) {
                        qgg.h0(obj);
                        oi oiVar = ((z4l) this.l).i;
                        s4l s4lVar = (s4l) this.m;
                        this.k = 1;
                        if (oiVar.m(s4lVar, this) == nm6Var27) {
                            return nm6Var27;
                        }
                    } else {
                        if (i39 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                } catch (CancellationException unused) {
                    dfi.r("channel closed", "PlaybackSaveProgressReporter");
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1j(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1j(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h1j(Function2 function2, w9k w9kVar, Continuation continuation) {
        super(2, continuation);
        this.j = 19;
        this.l = (aur) function2;
        this.m = w9kVar;
    }
}
