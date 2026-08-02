package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.bdu.trigger.network.dto.TriggerActionRequestDto;
import com.yandex.music.shared.bdu.trigger.network.dto.TriggerListsDto;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import retrofit2.Call;

/* loaded from: classes5.dex */
public final class rc4 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc4(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
        this.m = obj2;
        this.n = obj3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0097, code lost:
    
        if (r7.emit(r0, r6) == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0099, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        if (r7.emit(r1, r6) == r2) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object k(Object obj) {
        e57 e57Var = (e57) this.n;
        mgk mgkVar = (mgk) this.m;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            if (o8g.A((rfk) this.l)) {
                return Unit.a;
            }
            if (mgkVar == null) {
                xdr xdrVar = e57Var.F;
                vcp vcpVar = new vcp(false, false);
                xdrVar.getClass();
                xdrVar.m(null, vcpVar);
                kpm kpmVar = e57Var.E;
                if (kpmVar == null) {
                    Intrinsics.j("coordinator");
                    throw null;
                }
                jzi jziVar = new jzi(e57Var);
                jek a = ((sbp) kpmVar.b).c.a();
                ((tdk) a.c).g(a.a, a.b, new aqd(13, a, jziVar));
                return Unit.a;
            }
            e57Var.w = mgkVar;
            x0q x0qVar = e57Var.x0;
            this.k = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
            x0q x0qVar2 = e57Var.w0;
            m47 m47Var = new m47(o8g.p(mgkVar.d()), mgkVar.f());
            this.k = 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0078, code lost:
    
        if (r10.collect(r2, r9) == r1) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object l(Object obj) {
        mm6 mm6Var;
        x0q x0qVar;
        e57 e57Var = (e57) this.n;
        nm6 nm6Var = nm6.a;
        int i = this.k;
        int i2 = 1;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            mm6Var = (mm6) this.l;
            x0qVar = e57Var.w0;
            e8w e8wVar = e8w.a;
            ot0.F(e57Var);
            this.l = mm6Var;
            this.m = x0qVar;
            this.k = 1;
            e8w.c();
            fs fsVar = new fs(15, new gm2());
            if (fsVar != nm6Var) {
                obj = fsVar;
            }
            return nm6Var;
        }
        if (i != 1) {
            if (i == 2) {
                qgg.h0(obj);
                return Unit.a;
            }
            xq0.q("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        x0qVar = (x0q) this.m;
        mm6Var = (mm6) this.l;
        qgg.h0(obj);
        a37 a37Var = new a37(e57Var, mm6Var, continuation, i2);
        pjc b0 = zsd.b0(new cz(new u21(10, x0qVar, (pjc) obj, a37Var), e57Var, 28));
        p47 p47Var = new p47(e57Var, 3);
        this.l = null;
        this.m = null;
        this.k = 2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                rc4 rc4Var = new rc4((rjc) this.m, (sc4) this.n, continuation, 0);
                rc4Var.l = obj;
                return rc4Var;
            case 1:
                rc4 rc4Var2 = new rc4((fgp) this.m, this.n, continuation, 1);
                rc4Var2.l = obj;
                return rc4Var2;
            case 2:
                return new rc4((r2f) this.l, (Exception) this.m, (vn4) this.n, continuation, 2);
            case 3:
                return new rc4((lg3) this.l, (vn4) this.m, (jtc) this.n, continuation, 3);
            case 4:
                return new rc4((hr4) this.l, (e3t) this.m, (c80) this.n, continuation, 4);
            case 5:
                return new rc4((ajh) this.m, (hr4) this.n, continuation, 5);
            case 6:
                rc4 rc4Var3 = new rc4((ajh) this.m, (hr4) this.n, continuation, 6);
                rc4Var3.l = obj;
                return rc4Var3;
            case 7:
                rc4 rc4Var4 = new rc4((hr4) this.m, (wih) this.n, continuation, 7);
                rc4Var4.l = obj;
                return rc4Var4;
            case 8:
                return new rc4((xih) this.m, (hr4) this.n, continuation, 8);
            case 9:
                rc4 rc4Var5 = new rc4((xih) this.m, (hr4) this.n, continuation, 9);
                rc4Var5.l = obj;
                return rc4Var5;
            case 10:
                return new rc4((aqi) this.l, (aqi) this.m, (fk0) this.n, continuation, 10);
            case 11:
                return new rc4((e15) this.l, (String) this.m, (String) this.n, continuation, 11);
            case 12:
                return new rc4((e15) this.m, (String) this.n, continuation, 12);
            case 13:
                rc4 rc4Var6 = new rc4((xiu) this.m, (snq) this.n, continuation, 13);
                rc4Var6.l = obj;
                return rc4Var6;
            case 14:
                return new rc4((mg5) this.l, (kxi) this.m, (w5l) this.n, continuation, 14);
            case 15:
                return new rc4((oi5) this.l, (String) this.m, (mh5) this.n, continuation, 15);
            case 16:
                return new rc4((oi5) this.l, (String) this.m, (String) this.n, continuation, 16);
            case 17:
                return new rc4((jk5) this.l, (String) this.m, (String) this.n, continuation, 17);
            case 18:
                rc4 rc4Var7 = new rc4(continuation, (rw5) this.m);
                rc4Var7.l = obj;
                return rc4Var7;
            case 19:
                return new rc4((aqi) this.m, (qbs) this.n, continuation, 19);
            case 20:
                rc4 rc4Var8 = new rc4((aqi) this.m, (fk0) this.n, continuation, 20);
                rc4Var8.l = obj;
                return rc4Var8;
            case 21:
                rc4 rc4Var9 = new rc4((bo6) this.n, continuation, 21);
                rc4Var9.l = obj;
                return rc4Var9;
            case 22:
                return new rc4((vo6) this.n, continuation, 22);
            case 23:
                rc4 rc4Var10 = new rc4((o17) this.m, (mfk) this.n, continuation, 23);
                rc4Var10.l = obj;
                return rc4Var10;
            case 24:
                return new rc4((c27) this.l, (kpo) this.m, (mfk) this.n, continuation, 24);
            case 25:
                rc4 rc4Var11 = new rc4((h37) this.n, continuation, 25);
                rc4Var11.l = obj;
                return rc4Var11;
            case 26:
                return new rc4((g47) this.l, (sld) this.m, (zl2) this.n, continuation, 26);
            case 27:
                return new rc4((rfk) this.l, (mgk) this.m, (e57) this.n, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                rc4 rc4Var12 = new rc4((e57) this.n, continuation, 28);
                rc4Var12.l = obj;
                return rc4Var12;
            default:
                return new rc4((e57) this.l, (kpo) this.m, (mfk) this.n, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((rc4) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0431, code lost:
    
        if (r0 == r13) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x03eb, code lost:
    
        if (r0 == r13) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x040b, code lost:
    
        if (defpackage.fk0.c(r0, r2, null, null, r31, 14) == r13) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x044d, code lost:
    
        if (r0 == r13) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x074f, code lost:
    
        if (r1 == r0) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x071e, code lost:
    
        if (r2 == r0) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (kotlin.Unit.a == r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x08b1, code lost:
    
        if (defpackage.hr4.b(r0, r5, r31) != r3) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x088c, code lost:
    
        if (r5 == r3) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0881, code lost:
    
        if (r5.c(r6, r31) == r3) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        if (kotlin.Unit.a == r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x09a2, code lost:
    
        if (defpackage.hr4.b(r0, r5, r31) != r3) goto L446;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f6, code lost:
    
        if (kotlin.Unit.a == r14) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x097d, code lost:
    
        if (r5 == r3) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0972, code lost:
    
        if (r6.b(r5, r31) == r3) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017e, code lost:
    
        if (r0 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0147, code lost:
    
        if (r6 == r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0231, code lost:
    
        if (r0 == r1) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0209, code lost:
    
        if (r2 == r1) goto L99;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        Object a;
        String str;
        Object a2;
        String str2;
        Object d;
        um4 um4Var;
        Object a3;
        Object a4;
        CoroutineContext.Element p;
        xdr xdrVar;
        Object b;
        Object x;
        aqi aqiVar;
        Object c;
        Object c2;
        Object c3;
        Object a5;
        bo6 bo6Var;
        Object yr1Var;
        Object a6;
        vo6 vo6Var;
        Object as1Var;
        String str3;
        String str4;
        Object a7;
        mm6 mm6Var;
        x0q x0qVar;
        Object fsVar;
        int i = 6;
        int i2 = 27;
        int i3 = 23;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i4 = 2;
        int i5 = 1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    mm6 mm6Var2 = (mm6) this.l;
                    rjc rjcVar = (rjc) this.m;
                    qln i7 = ((sc4) this.n).i(mm6Var2);
                    this.k = 1;
                    Object H = xv.H(rjcVar, i7, true, this);
                    Object obj3 = H;
                    if (H != obj2) {
                        obj3 = Unit.a;
                    }
                    if (obj3 == obj2) {
                        return obj2;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var = nm6.a;
                int i8 = this.k;
                try {
                    if (i8 == 0) {
                        qgg.h0(obj);
                        fgp fgpVar = (fgp) this.m;
                        Object obj4 = this.n;
                        r7o r7oVar = z7o.b;
                        this.k = 1;
                        if (fgpVar.m(obj4, this) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i8 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    t7oVar = Unit.a;
                    r7o r7oVar2 = z7o.b;
                } catch (Throwable th) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(th);
                }
                return new gd4(!(t7oVar instanceof t7o) ? Unit.a : new ed4(z7o.a(t7oVar)));
            case 2:
                Exception exc = (Exception) this.m;
                nm6 nm6Var2 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    r2f r2fVar = (r2f) this.l;
                    this.k = 1;
                    r2fVar.g(n7w.c("Collection of responses completed exceptionally", exc));
                    Object j0 = r2fVar.j0(this);
                    if (j0 != nm6Var2) {
                        j0 = Unit.a;
                    }
                    if (j0 == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i9 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                ((vn4) this.n).a("Collection of responses completed exceptionally", exc);
                return Unit.a;
            case 3:
                vn4 vn4Var = (vn4) this.m;
                nm6 nm6Var3 = nm6.a;
                int i10 = this.k;
                try {
                    if (i10 == 0) {
                        qgg.h0(obj);
                        lg3 lg3Var = (lg3) this.l;
                        jtc jtcVar = (jtc) this.n;
                        this.k = 1;
                        if (lg3Var.s0(vn4Var, jtcVar, this) == nm6Var3) {
                            return nm6Var3;
                        }
                    } else {
                        if (i10 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    vn4Var.b();
                    return Unit.a;
                } catch (Exception e) {
                    vn4Var.a("Collection of requests completed exceptionally", e);
                    throw e;
                }
            case 4:
                nm6 nm6Var4 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    er4 er4Var = new er4((hr4) this.l, (e3t) this.m, (c80) this.n, null);
                    this.k = 1;
                    if (gld.Q(er4Var, this) == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                hr4 hr4Var = (hr4) this.n;
                ajh ajhVar = (ajh) this.m;
                nm6 nm6Var5 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    p1g p1gVar = (p1g) ajhVar.b;
                    if (p1gVar instanceof ejh) {
                        br4 br4Var = br4.a;
                        String str5 = ((ejh) p1gVar).a;
                        this.k = 1;
                        break;
                    }
                } else if (i12 == 1) {
                    qgg.h0(obj);
                } else {
                    if (i12 == 2) {
                        qgg.h0(obj);
                        a = obj;
                        String str6 = (String) a;
                        k5 k5Var = new k5(19, ajhVar);
                        this.l = str6;
                        this.k = 3;
                        if (hr4.b(hr4Var, k5Var, this) != nm6Var5) {
                            str = str6;
                            cr4 cr4Var = new cr4(str, i5);
                            this.l = null;
                            this.k = 4;
                        }
                        return nm6Var5;
                    }
                    if (i12 == 3) {
                        str = (String) this.l;
                        qgg.h0(obj);
                        cr4 cr4Var2 = new cr4(str, i5);
                        this.l = null;
                        this.k = 4;
                        break;
                    } else {
                        if (i12 == 4) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                br4 br4Var2 = br4.a;
                this.k = 2;
                a = br4Var2.a(this);
                break;
            case 6:
                nm6 nm6Var6 = nm6.a;
                int i13 = this.k;
                try {
                    if (i13 == 0) {
                        qgg.h0(obj);
                        ajh ajhVar2 = (ajh) this.m;
                        hr4 hr4Var2 = (hr4) this.n;
                        r7o r7oVar4 = z7o.b;
                        rc4 rc4Var = new rc4(ajhVar2, hr4Var2, z5 ? 1 : 0, 5);
                        this.k = 1;
                        if (gld.Q(rc4Var, this) == nm6Var6) {
                            return nm6Var6;
                        }
                    } else {
                        if (i13 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    r7o r7oVar5 = z7o.b;
                } catch (Throwable unused) {
                    r7o r7oVar6 = z7o.b;
                }
                return Unit.a;
            case 7:
                nm6 nm6Var7 = nm6.a;
                int i14 = this.k;
                try {
                    if (i14 == 0) {
                        qgg.h0(obj);
                        hr4 hr4Var3 = (hr4) this.m;
                        wih wihVar = (wih) this.n;
                        r7o r7oVar7 = z7o.b;
                        k5 k5Var2 = new k5(20, wihVar);
                        this.k = 1;
                        if (hr4.b(hr4Var3, k5Var2, this) == nm6Var7) {
                            return nm6Var7;
                        }
                    } else {
                        if (i14 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    r7o r7oVar8 = z7o.b;
                } catch (Throwable unused2) {
                    r7o r7oVar9 = z7o.b;
                }
                return Unit.a;
            case 8:
                hr4 hr4Var4 = (hr4) this.n;
                xih xihVar = (xih) this.m;
                nm6 nm6Var8 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    br4 br4Var3 = br4.a;
                    String str7 = xihVar.c;
                    this.k = 1;
                    break;
                } else if (i15 == 1) {
                    qgg.h0(obj);
                } else {
                    if (i15 == 2) {
                        qgg.h0(obj);
                        a2 = obj;
                        String str8 = (String) a2;
                        k5 k5Var3 = new k5(21, xihVar);
                        this.l = str8;
                        this.k = 3;
                        if (hr4.b(hr4Var4, k5Var3, this) != nm6Var8) {
                            str2 = str8;
                            cr4 cr4Var3 = new cr4(str2, i4);
                            this.l = null;
                            this.k = 4;
                        }
                        return nm6Var8;
                    }
                    if (i15 == 3) {
                        str2 = (String) this.l;
                        qgg.h0(obj);
                        cr4 cr4Var32 = new cr4(str2, i4);
                        this.l = null;
                        this.k = 4;
                        break;
                    } else {
                        if (i15 == 4) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                }
                br4 br4Var4 = br4.a;
                this.k = 2;
                a2 = br4Var4.a(this);
                break;
            case 9:
                nm6 nm6Var9 = nm6.a;
                int i16 = this.k;
                try {
                    if (i16 == 0) {
                        qgg.h0(obj);
                        xih xihVar2 = (xih) this.m;
                        hr4 hr4Var5 = (hr4) this.n;
                        r7o r7oVar10 = z7o.b;
                        rc4 rc4Var2 = new rc4(xihVar2, hr4Var5, z6 ? 1 : 0, 8);
                        this.k = 1;
                        if (gld.Q(rc4Var2, this) == nm6Var9) {
                            return nm6Var9;
                        }
                    } else {
                        if (i16 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    r7o r7oVar11 = z7o.b;
                } catch (Throwable unused3) {
                    r7o r7oVar12 = z7o.b;
                }
                return Unit.a;
            case 10:
                nm6 nm6Var10 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    h7a d0 = zsd.d0(szf.s0(new jc((aqi) this.l, i)), 1);
                    gl glVar = new gl(i3, (aqi) this.m, (fk0) this.n);
                    this.k = 1;
                    if (d0.collect(glVar, this) == nm6Var10) {
                        return nm6Var10;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                e15 e15Var = (e15) this.l;
                nm6 nm6Var11 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    rtl rtlVar = (rtl) e15Var.d.getValue();
                    String str9 = (String) this.m;
                    nvl nvlVar = new nvl((String) this.n, "3");
                    this.k = 1;
                    d = rtlVar.d(str9, nvlVar, true, this);
                    if (d == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    d = obj;
                }
                cvl cvlVar = (cvl) d;
                if (cvlVar != null) {
                    return cvl.a(cvlVar, (String) e15Var.f.getValue(), null, 0, 0, 0L, null, null, null, null, null, null, null, null, null, null, 134217725);
                }
                return null;
            case 12:
                nm6 nm6Var12 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    um4Var = new um4(pgp.a);
                    um4Var.c("disliked", true);
                    um4Var.i("(available=1)", xz0.X(new Object[0]));
                    e15 e15Var2 = (e15) this.m;
                    String str10 = (String) this.n;
                    this.l = um4Var;
                    this.k = 1;
                    a3 = e15.a(e15Var2, str10, this);
                    break;
                } else {
                    if (i19 != 1) {
                        if (i19 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        a4 = obj;
                        return Boolean.valueOf(((Number) a4).intValue() > 0);
                    }
                    um4Var = (um4) this.l;
                    qgg.h0(obj);
                    a3 = obj;
                }
                atn atnVar = new atn(hlr.d("\n                    SELECT count(*) FROM artist\n                    WHERE " + um4Var.l() + "\n                "), um4Var.j());
                this.l = null;
                this.k = 2;
                a4 = ((hjn) a3).a(atnVar, this);
                break;
            case 13:
                xiu xiuVar = (xiu) this.m;
                mm6 mm6Var3 = (mm6) this.l;
                nm6 nm6Var13 = nm6.a;
                int i20 = this.k;
                if (i20 != 0) {
                    if (i20 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                ArrayList G = new lum("collection", ((snq) this.n).c).G();
                ArrayList arrayList = new ArrayList(v75.o(G, 10));
                Iterator it = G.iterator();
                while (it.hasNext()) {
                    drf drfVar = ((s63) it.next()).a;
                    String str11 = drfVar.a().b;
                    y35 y35Var = y35.WIZARD;
                    if (Intrinsics.d(str11, "COLLECTION_FAVOURITE_PLAYLIST")) {
                        p = x97.p(mm6Var3, null, null, new m35(xiuVar, drfVar, z10 ? 1 : 0, z ? 1 : 0), 3);
                    } else if (Intrinsics.d(str11, "COLLECTION_SECTIONS")) {
                        p = x97.p(mm6Var3, null, null, new qi((Object) xiuVar, (Object) drfVar, (Continuation) (z9 ? 1 : 0), i2), 3);
                    } else {
                        mw4 mw4Var = mw4.DOWNLOADED_ARTISTS;
                        p = Intrinsics.d(str11, "COLLECTION_FAVOURITE_ARTISTS") ? x97.p(mm6Var3, null, null, new m35(xiuVar, drfVar, z8 ? 1 : 0, i5), 3) : Intrinsics.d(str11, "COLLECTION_DISLIKES") ? x97.p(mm6Var3, null, null, new m35(xiuVar, drfVar, z7 ? 1 : 0, i4), 3) : hld.i(drfVar);
                    }
                    arrayList.add(p);
                }
                this.l = null;
                this.k = 1;
                Object v = ox6.v(arrayList, this);
                return v == nm6Var13 ? nm6Var13 : v;
            case 14:
                w5l w5lVar = (w5l) this.n;
                kxi kxiVar = (kxi) this.m;
                mg5 mg5Var = (mg5) this.l;
                wvu wvuVar = mg5Var.b;
                nm6 nm6Var14 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    lwu lwuVar = (lwu) mg5Var.e.a.getValue();
                    boolean z14 = lwuVar instanceof zvu;
                    r9p r9pVar = r9p.a;
                    if (z14 || (lwuVar instanceof ewu)) {
                        wvu.b(wvuVar, new s9p(t75.c(r9pVar)), null, kxiVar, w5lVar, false, 48);
                    } else if (lwuVar instanceof dwu) {
                        wvu.b(wvuVar, new s9p(t75.c(r9pVar)), null, kxiVar, w5lVar, false, 32);
                    } else {
                        if (!Intrinsics.d(lwuVar, hwu.a) && !(lwuVar instanceof cwu)) {
                            b6e.s();
                            return null;
                        }
                        nmf nmfVar = mg5Var.a;
                        this.k = 1;
                        nmfVar.a.a.l(new cwu(new iwu(new s9p(t75.c(r9pVar)), xku.b), ""));
                        Object b2 = nmfVar.b.b(true, this);
                        if (b2 != nm6Var14) {
                            b2 = Unit.a;
                        }
                        if (b2 != nm6Var14) {
                            b2 = Unit.a;
                        }
                        if (b2 == nm6Var14) {
                            return nm6Var14;
                        }
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                nm6 nm6Var15 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    cj5 cj5Var = (cj5) ((oi5) this.l).c.getValue();
                    String str12 = (String) this.m;
                    mh5 mh5Var = (mh5) this.n;
                    String str13 = mh5Var.a;
                    rv8 rv8Var = mh5Var.d;
                    this.k = 1;
                    if (cj5Var.b(str12, str13, rv8Var, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                nm6 nm6Var16 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    oi5 oi5Var = (oi5) this.l;
                    String str14 = (String) this.m;
                    String str15 = (String) this.n;
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    this.k = 1;
                    if (oi5Var.h(str14, str15, e5bVar, this) == nm6Var16) {
                        return nm6Var16;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                nm6 nm6Var17 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    jk5 jk5Var = (jk5) this.l;
                    Call<MusicBackendResponse<TriggerListsDto>> c4 = jk5Var.a.c(new TriggerActionRequestDto((String) this.m, (String) this.n, jk5Var.b.a()));
                    this.k = 1;
                    if (jk5.a(jk5Var, c4, this) == nm6Var17) {
                        return nm6Var17;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 18:
                Object obj5 = this.l;
                nm6 nm6Var18 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    rw5 rw5Var = (rw5) this.m;
                    xdrVar = rw5Var.f;
                    xx5 xx5Var = rw5Var.d;
                    this.l = null;
                    this.n = xdrVar;
                    this.k = 1;
                    b = xx5Var.b((xxq) obj5, this);
                    if (b == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xdr xdrVar2 = (xdr) this.n;
                    qgg.h0(obj);
                    xdrVar = xdrVar2;
                    b = obj;
                }
                Object obj6 = (ox5) b;
                if (obj6 == null) {
                    obj6 = px5.a;
                }
                xdrVar.getClass();
                xdrVar.m(null, obj6);
                return Unit.a;
            case 19:
                nm6 nm6Var19 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    aqi aqiVar2 = (aqi) this.m;
                    qbs qbsVar = (qbs) this.n;
                    this.l = aqiVar2;
                    this.k = 1;
                    x = wct.x(qbsVar, this);
                    if (x == nm6Var19) {
                        return nm6Var19;
                    }
                    aqiVar = aqiVar2;
                } else {
                    if (i26 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aqiVar = (aqi) this.l;
                    qgg.h0(obj);
                    x = obj;
                }
                aqiVar.setValue(x);
                return Unit.a;
            case 20:
                jn6 jn6Var = (jn6) this.l;
                nm6 nm6Var20 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    ((aqi) this.m).setValue(jn6Var);
                    int ordinal = jn6Var.ordinal();
                    if (ordinal == 0) {
                        fk0 fk0Var = (fk0) this.n;
                        Float f = new Float(1.0f);
                        this.l = null;
                        this.k = 1;
                        c = fk0.c(fk0Var, f, null, null, this, 14);
                        break;
                    } else if (ordinal == 1) {
                        fk0 fk0Var2 = (fk0) this.n;
                        Float f2 = new Float(1.0f);
                        this.l = null;
                        this.k = 2;
                        break;
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        fk0 fk0Var3 = (fk0) this.n;
                        Float f3 = new Float(0.0f);
                        this.l = null;
                        this.k = 4;
                        c2 = fk0.c(fk0Var3, f3, null, null, this, 14);
                        break;
                    }
                    return nm6Var20;
                }
                if (i27 == 1) {
                    qgg.h0(obj);
                    c = obj;
                } else if (i27 == 2) {
                    qgg.h0(obj);
                    fk0 fk0Var4 = (fk0) this.n;
                    Float f4 = new Float(0.5f);
                    act S = weo.S(800, 0, null, 6);
                    jyn jynVar = jyn.a;
                    vje vjeVar = new vje(S);
                    this.l = null;
                    this.k = 3;
                    c3 = fk0.c(fk0Var4, f4, vjeVar, null, this, 12);
                    break;
                } else if (i27 == 3) {
                    qgg.h0(obj);
                    c3 = obj;
                } else {
                    if (i27 != 4) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    c2 = obj;
                }
                return Unit.a;
            case 21:
                bo6 bo6Var2 = (bo6) this.n;
                String str16 = bo6Var2.a;
                mm6 mm6Var4 = (mm6) this.l;
                nm6 nm6Var21 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    if (str16.length() == 0) {
                        return Unit.a;
                    }
                    pce pceVar = new pce(bo6Var2.c);
                    pceVar.c = str16;
                    pceVar.e(lmq.c);
                    rce a8 = pceVar.a();
                    cce cceVar = bo6Var2.d;
                    this.l = mm6Var4;
                    this.m = bo6Var2;
                    this.k = 1;
                    a5 = cceVar.a(a8, this);
                    if (a5 == nm6Var21) {
                        return nm6Var21;
                    }
                    bo6Var = bo6Var2;
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bo6 bo6Var3 = (bo6) this.m;
                    qgg.h0(obj);
                    bo6Var = bo6Var3;
                    a5 = obj;
                }
                sce sceVar = (sce) a5;
                bo6Var.getClass();
                boolean z15 = sceVar instanceof bqr;
                if (z15) {
                    bqr bqrVar = (bqr) sceVar;
                    yr1Var = new as1(bo6.a(bqrVar.a), bqrVar);
                } else {
                    if (!(sceVar instanceof pgb)) {
                        b6e.s();
                        return null;
                    }
                    pgb pgbVar = (pgb) sceVar;
                    Drawable drawable = pgbVar.a;
                    yr1Var = new yr1(drawable != null ? bo6.a(drawable) : null, pgbVar);
                }
                bo6Var.e.setValue(yr1Var);
                if (bo6Var2.b != null) {
                    return Unit.a;
                }
                if (z15) {
                    x97.y(mm6Var4, null, null, new ao6(bo6Var2, z11 ? 1 : 0, z2 ? 1 : 0), 3);
                }
                return Unit.a;
            case 22:
                vo6 vo6Var2 = (vo6) this.n;
                nm6 nm6Var22 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    pce pceVar2 = new pce(vo6Var2.c);
                    pceVar2.c = vo6Var2.a;
                    pceVar2.e(lmq.c);
                    rce a9 = pceVar2.a();
                    cce cceVar2 = vo6Var2.d;
                    this.l = vo6Var2;
                    this.m = vo6Var2;
                    this.k = 1;
                    a6 = cceVar2.a(a9, this);
                    if (a6 == nm6Var22) {
                        return nm6Var22;
                    }
                    vo6Var = vo6Var2;
                } else {
                    if (i29 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    vo6 vo6Var3 = (vo6) this.m;
                    vo6 vo6Var4 = (vo6) this.l;
                    qgg.h0(obj);
                    vo6Var = vo6Var3;
                    vo6Var2 = vo6Var4;
                    a6 = obj;
                }
                sce sceVar2 = (sce) a6;
                vo6Var.getClass();
                if (sceVar2 instanceof pgb) {
                    pgb pgbVar2 = (pgb) sceVar2;
                    Drawable drawable2 = pgbVar2.a;
                    as1Var = new yr1(drawable2 != null ? vo6.b(drawable2) : null, pgbVar2);
                } else {
                    if (!(sceVar2 instanceof bqr)) {
                        b6e.s();
                        return null;
                    }
                    bqr bqrVar2 = (bqr) sceVar2;
                    as1Var = new as1(vo6.b(bqrVar2.a), bqrVar2);
                }
                vo6Var2.getClass();
                vo6Var2.f.setValue(as1Var);
                return Unit.a;
            case 23:
                nm6 nm6Var23 = nm6.a;
                int i30 = this.k;
                if (i30 != 0) {
                    if (i30 == 1) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                mm6 mm6Var5 = (mm6) this.l;
                o17 o17Var = (o17) this.m;
                bf bfVar = o17Var.k;
                if (bfVar == null) {
                    Intrinsics.j("actionFlowReceiver");
                    throw null;
                }
                x0q x0qVar2 = bfVar.a;
                tl0 tl0Var = new tl0(11, mm6Var5, o17Var, (mfk) this.n);
                this.k = 1;
                x0qVar2.collect(tl0Var, this);
                return nm6Var23;
            case 24:
                c27 c27Var = (c27) this.l;
                nm6 nm6Var24 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    dn9 dn9Var = c27Var.k;
                    kpo kpoVar = (kpo) this.m;
                    mfk mfkVar = (mfk) this.n;
                    qc9 qc9Var = c27Var.p;
                    this.k = 1;
                    dn9Var.getClass();
                    String str17 = kpoVar.d() ? "smsCode" : "randomAmount";
                    if (!qdq.y() ? (str3 = mfkVar.c) == null : (str3 = mfkVar.d) == null) {
                        str3 = "";
                    }
                    String str18 = kpoVar.g;
                    str4 = str18 != null ? str18 : "";
                    dq8 dq8Var = dq8.SBP_CHALLENGER;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("method", str17);
                    jSONObject.put("sbpTokenMemberName", str3);
                    jSONObject.put("maskedPhoneNumber", str4);
                    a7 = ((sfg) dn9Var.e).a(qc9Var, new sfm(dq8Var, jSONObject, 2), new aa0(dn9Var, kpoVar, mfkVar, null, 4), this);
                    break;
                } else {
                    if (i31 != 1) {
                        if (i31 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a7 = obj;
                }
                this.k = 2;
                Object emit = c27Var.r.emit(new hw8((rv8) a7, t75.c(new Pair("isLightTheme", String.valueOf(c27Var.q)))), this);
                if (emit != nm6Var24) {
                    emit = Unit.a;
                    break;
                }
                break;
            case 25:
                h37 h37Var = (h37) this.n;
                nm6 nm6Var25 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    mm6Var = (mm6) this.l;
                    x0qVar = h37Var.B;
                    e8w e8wVar = e8w.a;
                    ot0.F(h37Var);
                    this.l = mm6Var;
                    this.m = x0qVar;
                    this.k = 1;
                    e8w.c();
                    fsVar = new fs(15, new gm2());
                    break;
                } else {
                    if (i32 != 1) {
                        if (i32 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x0qVar = (x0q) this.m;
                    mm6Var = (mm6) this.l;
                    qgg.h0(obj);
                    fsVar = obj;
                }
                a37 a37Var = new a37((Object) h37Var, (Object) mm6Var, (Continuation) (z13 ? 1 : 0), (int) (z3 ? 1 : 0));
                y27 y27Var = new y27(h37Var, i5);
                this.l = null;
                this.m = null;
                this.k = 2;
                Object y = tt0.y(new e37(y27Var, h37Var), new l1((Object) a37Var, (Continuation) (z12 ? 1 : 0), 25), this, wg.s, new pjc[]{x0qVar, (pjc) fsVar});
                if (y != nm6Var25) {
                    y = Unit.a;
                }
                if (y != nm6Var25) {
                    y = Unit.a;
                    break;
                }
                break;
            case 26:
                zl2 zl2Var = (zl2) this.n;
                g47 g47Var = (g47) this.l;
                String str19 = g47Var.m;
                x3n x3nVar = g47Var.k;
                nm6 nm6Var26 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    aro aroVar = g47Var.n;
                    if (!(aroVar instanceof xqo)) {
                        if (!Intrinsics.d(aroVar, yqo.a)) {
                            if (Intrinsics.d(aroVar, zqo.a)) {
                                e47 e47Var = new e47(g47Var, zl2Var, i4);
                                this.k = 3;
                                ((hpo) x3nVar.d).a = true;
                                ((jek) x3nVar.a).e(str19, new aqd(i3, x3nVar, e47Var));
                                break;
                            }
                        } else {
                            e47 e47Var2 = new e47(g47Var, zl2Var, i5);
                            this.k = 2;
                            ((hpo) x3nVar.d).a = true;
                            ((jek) x3nVar.a).b(str19, new iwe(i3, x3nVar, e47Var2));
                            break;
                        }
                    } else {
                        String str20 = ((xqo) aroVar).a;
                        str4 = str20 != null ? str20 : "";
                        e47 e47Var3 = new e47(g47Var, zl2Var, z4 ? 1 : 0);
                        sld sldVar = (sld) this.m;
                        this.k = 1;
                        ((hpo) x3nVar.d).a = true;
                        ((tdk) ((sdk) x3nVar.b)).h.b(str4, new afg(i2, x3nVar, e47Var3), sldVar);
                        break;
                    }
                } else {
                    if (i33 != 1 && i33 != 2 && i33 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 27:
                return k(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return l(obj);
            default:
                nm6 nm6Var27 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    zi3 zi3Var = ((e57) this.l).H;
                    fie fieVar = new fie((kpo) this.m, (mfk) this.n);
                    this.k = 1;
                    if (zi3Var.m(fieVar, this) == nm6Var27) {
                        return nm6Var27;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc4(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rc4(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc4(Continuation continuation, rw5 rw5Var) {
        super(2, continuation);
        this.j = 18;
        this.m = rw5Var;
    }
}
