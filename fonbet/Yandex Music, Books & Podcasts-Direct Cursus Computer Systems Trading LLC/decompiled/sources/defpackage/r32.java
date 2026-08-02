package defpackage;

import android.net.Uri;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import com.connectsdk.service.DeviceService;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r32 extends aur implements Function2 {
    public final /* synthetic */ int j = 3;
    public int k;
    public boolean l;
    public Object m;
    public Object n;
    public Object o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r32(iz7 iz7Var, boolean z, String str, String str2, z77 z77Var, String str3, Continuation continuation) {
        super(2, continuation);
        this.m = iz7Var;
        this.l = z;
        this.n = str;
        this.o = str2;
        this.p = z77Var;
        this.q = str3;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                r32 r32Var = new r32((t32) this.q, continuation);
                r32Var.p = obj;
                return r32Var;
            case 1:
                return new r32((fkg) this.n, (String) this.o, (String) this.p, (String) this.q, this.l, continuation);
            case 2:
                return new r32((iz7) this.m, this.l, (String) this.n, (String) this.o, (z77) this.p, (String) this.q, continuation);
            case 3:
                return new r32((a7q) this.m, (v2q) this.n, (EnumSet) this.o, this.l, (Long) this.p, (t0q) this.q, continuation);
            default:
                r32 r32Var2 = new r32((fk0) this.m, (Function0) this.n, (Function0) this.o, this.l, (Function0) this.q, continuation);
                r32Var2.p = obj;
                return r32Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((r32) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x00fe, code lost:
    
        if (r2.e(r5, r40) == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        if (defpackage.fk0.c(r0, r1, r2, null, r40, 12) == r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x04a1, code lost:
    
        if (r2 == r10) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:?, code lost:
    
        return r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0474, code lost:
    
        if (r2 == r10) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        if (defpackage.fk0.c(r0, r1, r2, null, r40, 12) == r11) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x018b, code lost:
    
        if (r2 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x027a, code lost:
    
        if (r2 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02aa, code lost:
    
        if (r2 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0136, code lost:
    
        if (r2 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0153, code lost:
    
        if (r2 == r0) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0317  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object s;
        ou7 ou7Var;
        bqi bqiVar;
        Object H;
        ArrayList arrayList;
        boolean z;
        bqi bqiVar2;
        Object V;
        Object b;
        drt drtVar;
        Object t7oVar;
        Object b2;
        z3c z3cVar;
        boolean z2;
        ff7 a4cVar;
        qvs b3;
        rar rarVar;
        int i = 2;
        int i2 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                t32 t32Var = (t32) this.q;
                mm6 mm6Var = (mm6) this.p;
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    ou7 p = x97.p(mm6Var, null, null, new hl(t32Var, continuation, 16), 3);
                    ou7 p2 = x97.p(mm6Var, null, null, new cs1(t32Var, continuation, i2), 3);
                    xdr xdrVar = t32Var.n;
                    this.p = null;
                    this.m = p2;
                    this.n = xdrVar;
                    this.k = 1;
                    s = p.s(this);
                    if (s != nm6Var) {
                        ou7Var = p2;
                        bqiVar = xdrVar;
                    }
                    return nm6Var;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = this.l;
                    arrayList = (ArrayList) this.o;
                    bqiVar2 = (bqi) this.n;
                    qgg.h0(obj);
                    H = obj;
                    v32 v32Var = new v32(z, arrayList, (x32) H);
                    xdr xdrVar2 = (xdr) bqiVar2;
                    xdrVar2.getClass();
                    xdrVar2.m(null, v32Var);
                    return Unit.a;
                }
                bqiVar = (bqi) this.n;
                ou7 ou7Var2 = (ou7) this.m;
                qgg.h0(obj);
                ou7Var = ou7Var2;
                s = obj;
                boolean booleanValue = ((Boolean) s).booleanValue();
                ArrayList arrayList2 = t32Var.r;
                this.p = null;
                this.m = null;
                this.n = bqiVar;
                this.o = arrayList2;
                this.l = booleanValue;
                this.k = 2;
                H = ou7Var.H(this);
                if (H != nm6Var) {
                    bqi bqiVar3 = bqiVar;
                    arrayList = arrayList2;
                    z = booleanValue;
                    bqiVar2 = bqiVar3;
                    v32 v32Var2 = new v32(z, arrayList, (x32) H);
                    xdr xdrVar22 = (xdr) bqiVar2;
                    xdrVar22.getClass();
                    xdrVar22.m(null, v32Var2);
                    return Unit.a;
                }
                return nm6Var;
            case 1:
                String str = (String) this.q;
                String str2 = (String) this.p;
                String str3 = (String) this.o;
                fkg fkgVar = (fkg) this.n;
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    mn7 mn7Var = dm6.b;
                    yjg yjgVar = new yjg(fkgVar, str3, continuation, i);
                    this.m = null;
                    this.k = 1;
                    V = x97.V(mn7Var, yjgVar, this);
                    break;
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        str = (String) this.m;
                        qgg.h0(obj);
                        b = obj;
                        String str4 = str;
                        String str5 = (String) b;
                        if (str5 == null) {
                            str5 = "";
                        }
                        return new cvl(str4, str5, new drt(str2, str2, str2, false), 0, 0, false, 0, 0, 0, 0L, 0L, null, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134217720);
                    }
                    qgg.h0(obj);
                    V = obj;
                }
                cvl cvlVar = (cvl) V;
                if (Intrinsics.d((cvlVar == null || (drtVar = cvlVar.c) == null) ? null : drtVar.a, str2) && Intrinsics.d(cvlVar.a, str)) {
                    return cvlVar;
                }
                if (!this.l) {
                    return null;
                }
                this.m = str;
                this.k = 2;
                b = fkg.b(fkgVar, str3, DeviceService.KEY_DESC, this);
                break;
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                try {
                    if (i5 == 0) {
                        qgg.h0(obj);
                        iz7 iz7Var = (iz7) this.m;
                        boolean z3 = this.l;
                        String str6 = (String) this.n;
                        String str7 = (String) this.o;
                        z77 z77Var = (z77) this.p;
                        String str8 = (String) this.q;
                        r7o r7oVar = z7o.b;
                        this.k = 1;
                        try {
                            b2 = iz7.b(iz7Var, z3, str6, str7, z77Var, str8, this);
                            if (b2 == nm6Var3) {
                                return nm6Var3;
                            }
                        } catch (CancellationException e) {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                            r7o r7oVar2 = z7o.b;
                            t7oVar = new t7o(th);
                            return new z7o(t7oVar);
                        }
                    } else {
                        if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        b2 = obj;
                    }
                    t7oVar = (l7a) b2;
                    r7o r7oVar3 = z7o.b;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    th = th2;
                }
                return new z7o(t7oVar);
            case 3:
                Object obj2 = nm6.a;
                int i6 = 5;
                switch (this.k) {
                    case 0:
                        qgg.h0(obj);
                        d18 d18Var = ((a7q) this.m).s;
                        v2q v2qVar = (v2q) this.n;
                        d18Var.getClass();
                        v2qVar.getClass();
                        d18Var.h = v2qVar;
                        ((a7q) this.m).p.g = (v2q) this.n;
                        ((jmf) ((a7q) this.m).i.getValue()).a.set((v2q) this.n);
                        ((a7q) this.m).m.set((EnumSet) this.o);
                        v33 v33Var = ((a7q) this.m).f;
                        v2q v2qVar2 = (v2q) this.n;
                        this.k = 1;
                        break;
                    case 1:
                        qgg.h0(obj);
                        s70 s70Var = ((a7q) this.m).q;
                        rar rarVar2 = (rar) s70Var.b;
                        if (rarVar2 != null) {
                            rarVar2.g(null);
                        }
                        s70Var.b = null;
                        s70Var.a = null;
                        s70Var.c = null;
                        boolean z4 = this.l;
                        a7q a7qVar = (a7q) this.m;
                        if (!z4) {
                            this.k = 3;
                            a7qVar.getClass();
                            Object V2 = x97.V(mal.b(), new x6q(a7qVar, continuation, 11), this);
                            if (V2 != obj2) {
                                V2 = Unit.a;
                                break;
                            }
                        } else {
                            this.k = 2;
                            a7qVar.getClass();
                            Object V3 = x97.V(mal.b(), new x6q(a7qVar, continuation, i6), this);
                            if (V3 != obj2) {
                                V3 = Unit.a;
                                break;
                            }
                        }
                        rdk rdkVar = ((a7q) this.m).e;
                        t0q t0qVar = (t0q) this.q;
                        v2q v2qVar3 = (v2q) this.n;
                        EnumSet enumSet = (EnumSet) this.o;
                        z3cVar = z3c.p;
                        t0qVar.getClass();
                        v2qVar3.getClass();
                        z2 = t0qVar instanceof r0q;
                        if ((z2 || enumSet.contains(g5q.c)) && !t0qVar.equals(q0q.a)) {
                            if (z2) {
                                if (!(t0qVar instanceof s0q)) {
                                    b6e.s();
                                    return null;
                                }
                                a4cVar = new a4c(5000L);
                            } else if (v2qVar3.b() != null && (b3 = v2qVar3.b()) != null) {
                                long j = b3.b;
                                qvs a = qvs.a(b3, ((long) ((j - r10) * 0.25d)) + b3.a, 0L, 0L, 13);
                                long j2 = a.b - a.a;
                                if (j2 < 0) {
                                    j2 = 0;
                                }
                                a4cVar = new a4c(j2);
                            }
                            rarVar = (rar) rdkVar.g;
                            if (rarVar != null) {
                                rarVar.g(null);
                            }
                            jf2 jf2Var = (jf2) rdkVar.f;
                            long andSet = jf2Var != null ? ((kf2) jf2Var).a.getAndSet(0L) : 0L;
                            if (!a4cVar.equals(z3cVar)) {
                                ssg.a(3, "AudioFadeLauncherImpl", "launch fade with " + a4cVar + " context", null);
                                rdkVar.g = x97.y((mm6) rdkVar.e, null, null, new nw1(((o4c) ((xu6) rdkVar.b).invoke()).b, rdkVar, ((o4c) ((xu6) rdkVar.b).invoke()).a, ((efo) rdkVar.c).c(a4cVar), null), 3);
                            } else if (andSet > 0 && ((Boolean) ((tcl) rdkVar.d).a.g.invoke()).booleanValue()) {
                                rdkVar.g = x97.y((mm6) rdkVar.e, null, null, new pw1(((o4c) ((xu6) rdkVar.b).invoke()).b, rdkVar, ((o4c) ((xu6) rdkVar.b).invoke()).a, andSet, null), 3);
                            }
                            return Unit.a;
                        }
                        a4cVar = z3cVar;
                        rarVar = (rar) rdkVar.g;
                        if (rarVar != null) {
                        }
                        jf2 jf2Var2 = (jf2) rdkVar.f;
                        if (jf2Var2 != null) {
                        }
                        if (!a4cVar.equals(z3cVar)) {
                        }
                        return Unit.a;
                    case 2:
                    case 3:
                        qgg.h0(obj);
                        v2q v2qVar4 = (v2q) this.n;
                        if (v2qVar4 instanceof u2q) {
                            a7q a7qVar2 = (a7q) this.m;
                            Long l = (Long) this.p;
                            EnumSet enumSet2 = (EnumSet) this.o;
                            this.k = 4;
                            Object a2 = a7qVar2.r.a(new jbb(a7qVar2, enumSet2, l, (u2q) v2qVar4, (Continuation) null, 10), this);
                            if (a2 != obj2) {
                                a2 = Unit.a;
                                break;
                            }
                        } else if (v2qVar4 instanceof s2q) {
                            a7q a7qVar3 = (a7q) this.m;
                            b7q b7qVar = a7qVar3.d;
                            g7q g7qVar = a7qVar3.c;
                            b7qVar.getClass();
                            g7qVar.getClass();
                            bdt I = hag.I(vsb.class);
                            qdc qdcVar = b7qVar.a;
                            qdcVar.getClass();
                            vsb vsbVar = (vsb) qdcVar.C(I);
                            bdt I2 = hag.I(p6q.class);
                            qdc qdcVar2 = b7qVar.a;
                            qdcVar2.getClass();
                            p6q p6qVar = (p6q) qdcVar2.C(I2);
                            bdt I3 = hag.I(nbo.class);
                            qdc qdcVar3 = b7qVar.a;
                            qdcVar3.getClass();
                            a76 a76Var = new a76(vsbVar.e(null), vsbVar.f);
                            obo oboVar = (obo) nbo.b(maa.a).b;
                            c5b c5bVar = c5b.a;
                            ywd ywdVar = ywd.d;
                            b7q b7qVar2 = vsbVar.a;
                            bdt I4 = hag.I(oco.class);
                            qdc qdcVar4 = b7qVar2.a;
                            qdcVar4.getClass();
                            oco ocoVar = (oco) qdcVar4.C(I4);
                            bdt I5 = hag.I(dpt.class);
                            qdc qdcVar5 = b7qVar2.a;
                            qdcVar5.getClass();
                            sco scoVar = new sco(ocoVar, g7qVar, a76Var, oboVar, c5bVar, (dpt) qdcVar5.C(I5), ywdVar);
                            Uri uri = ((s2q) v2qVar4).b;
                            String str9 = (String) p6qVar.a.m.getValue();
                            uri.getClass();
                            str9.getClass();
                            Uri build = Uri.parse(uri.toString()).buildUpon().appendQueryParameter("vsid", str9).build();
                            build.getClass();
                            onh c = onh.c(build);
                            HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(scoVar);
                            hlsMediaSource$Factory.i = new zeg();
                            yzd d = hlsMediaSource$Factory.d(c);
                            Long l2 = (Long) this.p;
                            this.k = 5;
                            Object a3 = a7qVar3.r.a(new jbb(a7qVar3, v2qVar4, d, l2, (Continuation) null, 9), this);
                            if (a3 != obj2) {
                                a3 = Unit.a;
                                break;
                            }
                        } else {
                            if (!(v2qVar4 instanceof t2q)) {
                                b6e.s();
                                return null;
                            }
                            a7q a7qVar4 = (a7q) this.m;
                            bgq bgqVar = new bgq(((t2q) v2qVar4).c);
                            Long l3 = (Long) this.p;
                            this.k = 6;
                            Object a4 = a7qVar4.r.a(new jbb(a7qVar4, v2qVar4, bgqVar, l3, (Continuation) null, 9), this);
                            if (a4 != obj2) {
                                a4 = Unit.a;
                                break;
                            }
                        }
                        break;
                    case 4:
                    case 5:
                    case 6:
                        qgg.h0(obj);
                        rdk rdkVar2 = ((a7q) this.m).e;
                        t0q t0qVar2 = (t0q) this.q;
                        v2q v2qVar32 = (v2q) this.n;
                        EnumSet enumSet3 = (EnumSet) this.o;
                        z3cVar = z3c.p;
                        t0qVar2.getClass();
                        v2qVar32.getClass();
                        z2 = t0qVar2 instanceof r0q;
                        if (z2) {
                            break;
                        }
                        if (z2) {
                        }
                        rarVar = (rar) rdkVar2.g;
                        if (rarVar != null) {
                        }
                        jf2 jf2Var22 = (jf2) rdkVar2.f;
                        if (jf2Var22 != null) {
                        }
                        if (!a4cVar.equals(z3cVar)) {
                        }
                        return Unit.a;
                    default:
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            default:
                mm6 mm6Var2 = (mm6) this.p;
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var = (fk0) this.m;
                    Float f = new Float(0.95f);
                    act S = weo.S(100, 0, null, 6);
                    this.p = mm6Var2;
                    this.k = 1;
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                x97.y(mm6Var2, dm6.b(), null, new tnf((Function0) this.n, (Function0) this.o, this.l, (Function0) this.q, (Continuation) null), 2);
                fk0 fk0Var2 = (fk0) this.m;
                Float f2 = new Float(2.0f);
                act S2 = weo.S(300, 0, null, 6);
                this.p = null;
                this.k = 2;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r32(t32 t32Var, Continuation continuation) {
        super(2, continuation);
        this.q = t32Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r32(fk0 fk0Var, Function0 function0, Function0 function02, boolean z, Function0 function03, Continuation continuation) {
        super(2, continuation);
        this.m = fk0Var;
        this.n = function0;
        this.o = function02;
        this.l = z;
        this.q = function03;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r32(fkg fkgVar, String str, String str2, String str3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.n = fkgVar;
        this.o = str;
        this.p = str2;
        this.q = str3;
        this.l = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r32(a7q a7qVar, v2q v2qVar, EnumSet enumSet, boolean z, Long l, t0q t0qVar, Continuation continuation) {
        super(2, continuation);
        this.m = a7qVar;
        this.n = v2qVar;
        this.o = enumSet;
        this.l = z;
        this.p = l;
        this.q = t0qVar;
    }
}
