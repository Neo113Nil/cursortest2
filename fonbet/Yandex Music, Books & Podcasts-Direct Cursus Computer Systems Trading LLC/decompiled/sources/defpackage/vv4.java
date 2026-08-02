package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.bdu.trigger.network.dto.TriggerListsDto;
import com.yandex.music.shared.bdu.trigger.network.dto.TriggerShownRequestDto;
import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class vv4 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ Object l;
    public Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vv4(xv4 xv4Var, vbc vbcVar, Continuation continuation) {
        super(2, continuation);
        this.j = 1;
        this.l = xv4Var;
        this.m = vbcVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                vv4 vv4Var = new vv4((xv4) this.l, continuation, 0);
                vv4Var.m = obj;
                return vv4Var;
            case 1:
                return new vv4((xv4) this.l, (vbc) this.m, continuation);
            case 2:
                return new vv4((e15) this.m, (Integer) this.l, continuation, 2);
            case 3:
                return new vv4((d35) this.l, continuation, 3);
            case 4:
                return new vv4((ei5) this.m, (String) this.l, continuation, 4);
            case 5:
                return new vv4((jk5) this.m, (String) this.l, continuation, 5);
            case 6:
                return new vv4((wl5) this.m, (ml5) this.l, continuation, 6);
            case 7:
                return new vv4((wl5) this.m, (String) this.l, continuation, 7);
            case 8:
                return new vv4((pgt) this.m, (aqi) this.l, continuation, 8);
            case 9:
                return new vv4((sp5) this.m, (Runnable) this.l, continuation, 9);
            case 10:
                return new vv4((o3k) this.m, (lv5) this.l, continuation, 10);
            case 11:
                return new vv4((fp7) this.m, (iv5) this.l, continuation, 11);
            case 12:
                return new vv4((yc4) this.m, continuation, (rw5) this.l, 12);
            case 13:
                return new vv4((rw5) this.m, (rx5) this.l, continuation, 13);
            case 14:
                return new vv4((nx5) this.l, continuation, 14);
            case 15:
                return new vv4((tz5) this.m, (fvf) this.l, continuation, 15);
            case 16:
                return new vv4((o3k) this.m, (m16) this.l, continuation, 16);
            case 17:
                return new vv4((o3k) this.m, (c26) this.l, continuation, 17);
            case 18:
                return new vv4((evj) this.m, (Long) this.l, continuation, 18);
            case 19:
                return new vv4((c26) this.m, (fvf) this.l, continuation, 19);
            case 20:
                return new vv4((i26) this.m, (rx5) this.l, continuation, 20);
            case 21:
                return new vv4((pjc) this.m, continuation, (i26) this.l, 21);
            case 22:
                return new vv4((Function2) this.m, (ahm) this.l, continuation, 22);
            case 23:
                return new vv4((Function2) this.m, (xqn) this.l, continuation, 23);
            case 24:
                vv4 vv4Var2 = new vv4((z66) this.l, continuation, 24);
                vv4Var2.m = obj;
                return vv4Var2;
            case 25:
                return new vv4((zg6) this.m, (Context) this.l, continuation, 25);
            case 26:
                vv4 vv4Var3 = new vv4((g6d) this.l, continuation, 26);
                vv4Var3.m = obj;
                return vv4Var3;
            case 27:
                vv4 vv4Var4 = new vv4((le3) this.l, continuation, 27);
                vv4Var4.m = obj;
                return vv4Var4;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new vv4((pfm) this.m, (qbs) this.l, continuation, 28);
            default:
                return new vv4((lr6) this.m, (String) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
            case 15:
                ((vv4) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
                break;
        }
        return ((vv4) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0067, code lost:
    
        if (r2 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        if (r2 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04ef, code lost:
    
        if (r1.c(r0, (defpackage.ox5) r8, r21) == r3) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0500, code lost:
    
        if (r1.a(r0, r21) == r3) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x04dc, code lost:
    
        if (r0 == r3) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r2 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0703, code lost:
    
        if (defpackage.lmm.a((defpackage.wb7) r1, r2, r21) == r0) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x06f1, code lost:
    
        if (r1 == r0) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x07ed, code lost:
    
        if (r0.collect(r1, r21) != r3) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x08f7, code lost:
    
        if (r1.emit((defpackage.rj6) r5, r21) == r3) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x08ca, code lost:
    
        if (r5 == r3) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0255, code lost:
    
        if (defpackage.y7g.q(r0, r3, r21) == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0241, code lost:
    
        if (r2 == r1) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0324  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object d;
        Object w;
        d35 d35Var;
        Object v;
        d35 d35Var2;
        Object a2;
        Object a3;
        Object value;
        Object obj2;
        Object g0;
        Object h;
        Long l;
        Object V;
        Object value2;
        Object value3;
        t16 t16Var;
        q06 q06Var;
        m16 m16Var;
        m16 m16Var2;
        Object V2;
        Object V3;
        Object V4;
        cvl cvlVar;
        int i = this.j;
        int i2 = 9;
        int i3 = 3;
        int i4 = 6;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        int i5 = 2;
        Object obj3 = this.l;
        int i6 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                xv4 xv4Var = (xv4) obj3;
                jyr jyrVar = xv4Var.v;
                rjc rjcVar = (rjc) this.m;
                nm6 nm6Var = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    dp1 dp1Var = (dp1) xv4Var.t.getValue();
                    this.m = rjcVar;
                    this.k = 1;
                    a = dp1Var.a(this);
                    break;
                } else if (i7 == 1) {
                    qgg.h0(obj);
                    a = obj;
                } else if (i7 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                jp1 jp1Var = (jp1) jyrVar.getValue();
                x97.y(jp1Var.b, null, null, new fp1(jp1Var, continuation, i6), 3);
                jp1 jp1Var2 = (jp1) jyrVar.getValue();
                x97.y(jp1Var2.b, null, null, new fp1(jp1Var2, continuation, i5), 3);
                this.m = null;
                this.k = 2;
                break;
            case 1:
                xv4 xv4Var2 = (xv4) obj3;
                nm6 nm6Var2 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    yv4 yv4Var = (yv4) xv4Var2.s.getValue();
                    vbc vbcVar = (vbc) this.m;
                    yv4Var.getClass();
                    dk1 a4 = yv4.a(vbcVar);
                    xv4.a(xv4Var2, a4);
                    jv4 jv4Var = (jv4) xv4Var2.r.getValue();
                    this.k = 1;
                    Object a5 = lmm.a(((v55) jv4Var.b.getValue()).r(), new z45(a4, null), this);
                    Object obj4 = a5;
                    if (a5 != nm6Var2) {
                        obj4 = Unit.a;
                    }
                    if (obj4 != nm6Var2) {
                        obj4 = Unit.a;
                    }
                    if (obj4 == nm6Var2) {
                        break;
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    e15 e15Var = (e15) this.m;
                    String str = ((frt) l18.b.c(hag.I(frt.class))).c().a;
                    str.getClass();
                    fkm fkmVar = (fkm) e15Var.e.getValue();
                    this.k = 1;
                    d = fkmVar.d(str, (Integer) obj3, this);
                    if (d == nm6Var3) {
                        break;
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    d = obj;
                }
                break;
            case 3:
                d35 d35Var3 = (d35) obj3;
                ime imeVar = d35Var3.l;
                nm6 nm6Var4 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    this.m = d35Var3;
                    this.k = 1;
                    w = ((v55) ((jyr) imeVar.d).getValue()).w(this);
                    if (w != nm6Var4) {
                        d35Var = d35Var3;
                    }
                    break;
                } else if (i10 == 1) {
                    d35 d35Var4 = (d35) this.m;
                    qgg.h0(obj);
                    d35Var = d35Var4;
                    w = obj;
                } else if (i10 == 2) {
                    d35 d35Var5 = (d35) this.m;
                    qgg.h0(obj);
                    d35Var2 = d35Var5;
                    v = obj;
                    d35.G(d35Var2, (s0m) v);
                    xdr xdrVar = d35Var3.t;
                    xdr xdrVar2 = d35Var3.u;
                    frt frtVar = (frt) imeVar.b;
                    jyr jyrVar2 = (jyr) imeVar.c;
                    String str2 = frtVar.c().a;
                    e15 e15Var2 = (e15) jyrVar2.getValue();
                    b15 b15Var = new b15(e15Var2.h("playlist_mview", "playlist_track"), e15Var2, str2, null, null, null);
                    e15 e15Var3 = (e15) jyrVar2.getValue();
                    ub7 Q = zsd.Q(xdrVar, xdrVar2, new u21(10, b15Var, new b15(e15Var3.h("playlist_mview", "playlist_track"), e15Var3, null, str2, Boolean.TRUE, Boolean.FALSE), new jw4(i3, 4, continuation)), new a35(d35Var3, continuation, z ? 1 : 0));
                    i64 i64Var = new i64(9, d35Var3);
                    this.m = null;
                    this.k = 3;
                    break;
                } else if (i10 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                d35.H(d35Var, (s0m) w);
                this.m = d35Var3;
                this.k = 2;
                v = ((v55) ((jyr) imeVar.d).getValue()).v(this);
                if (v != nm6Var4) {
                    d35Var2 = d35Var3;
                    d35.G(d35Var2, (s0m) v);
                    xdr xdrVar3 = d35Var3.t;
                    xdr xdrVar22 = d35Var3.u;
                    frt frtVar2 = (frt) imeVar.b;
                    jyr jyrVar22 = (jyr) imeVar.c;
                    String str22 = frtVar2.c().a;
                    e15 e15Var22 = (e15) jyrVar22.getValue();
                    b15 b15Var2 = new b15(e15Var22.h("playlist_mview", "playlist_track"), e15Var22, str22, null, null, null);
                    e15 e15Var32 = (e15) jyrVar22.getValue();
                    ub7 Q2 = zsd.Q(xdrVar3, xdrVar22, new u21(10, b15Var2, new b15(e15Var32.h("playlist_mview", "playlist_track"), e15Var32, null, str22, Boolean.TRUE, Boolean.FALSE), new jw4(i3, 4, continuation)), new a35(d35Var3, continuation, z ? 1 : 0));
                    i64 i64Var2 = new i64(9, d35Var3);
                    this.m = null;
                    this.k = 3;
                }
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    ei5 ei5Var = (ei5) this.m;
                    this.k = 1;
                    a2 = ei5.a(ei5Var, this);
                    break;
                } else if (i11 == 1) {
                    qgg.h0(obj);
                    a2 = obj;
                } else if (i11 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                bi5 bi5Var = new bi5((String) obj3, null);
                this.k = 2;
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    jk5 jk5Var = (jk5) this.m;
                    Call<MusicBackendResponse<TriggerListsDto>> a6 = jk5Var.a.a(new TriggerShownRequestDto((String) obj3, jk5Var.b.a()));
                    this.k = 1;
                    if (jk5.a(jk5Var, a6, this) == nm6Var6) {
                        break;
                    }
                } else if (i12 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 6:
                Object obj5 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    wl5 wl5Var = (wl5) this.m;
                    this.k = 1;
                    Object h0 = zsd.h0(wl5Var.m, new xc(i5, i2, continuation), this);
                    Object obj6 = h0;
                    if (h0 != obj5) {
                        obj6 = Unit.a;
                    }
                    if (obj6 == obj5) {
                        break;
                    }
                } else if (i13 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                ((ml5) obj3).getParentFragmentManager().e0(new Bundle(), "send_complaint");
                break;
            case 7:
                String str3 = (String) obj3;
                wl5 wl5Var2 = (wl5) this.m;
                nm6 nm6Var7 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    uz1 uz1Var = (uz1) wl5Var2.k.getValue();
                    this.k = 1;
                    a3 = uz1.a(uz1Var, str3, this);
                    if (a3 == nm6Var7) {
                        break;
                    }
                } else if (i14 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    a3 = obj;
                }
                String str4 = (String) a3;
                xdr xdrVar4 = wl5Var2.m;
                do {
                    value = xdrVar4.getValue();
                    obj2 = (ul5) value;
                    if (!(obj2 instanceof ql5)) {
                        obj2 = new sl5(str4 == null ? str3 : str4);
                    }
                } while (!xdrVar4.k(value, obj2));
            case 8:
                nm6 nm6Var8 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    if (y2x.o(3000L, this) == nm6Var8) {
                        break;
                    }
                } else if (i15 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                ((aqi) obj3).setValue((pgt) this.m);
                break;
            case 9:
                sp5 sp5Var = (sp5) this.m;
                nm6 nm6Var9 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    f3e f3eVar = sp5Var.f;
                    this.k = 1;
                    Object b = f3eVar.b(0.0f - f3eVar.b, this);
                    if (b != nm6Var9) {
                        b = Unit.a;
                    }
                    if (b == nm6Var9) {
                        break;
                    }
                } else if (i16 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                ((x6k) sp5Var.c.b).setValue(Boolean.FALSE);
                ((Runnable) obj3).run();
                break;
            case 10:
                nm6 nm6Var10 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    o3k o3kVar = (o3k) this.m;
                    int i18 = ((lv5) obj3).b;
                    this.k = 1;
                    if (o3k.g(o3kVar, i18, null, this, 6) == nm6Var10) {
                        break;
                    }
                } else if (i17 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 11:
                nm6 nm6Var11 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    h7a H0 = zsd.H0(((fp7) this.m).r.a, 1);
                    i64 i64Var3 = new i64(17, (iv5) obj3);
                    this.k = 1;
                    if (H0.collect(i64Var3, this) == nm6Var11) {
                        break;
                    }
                } else if (i19 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 12:
                nm6 nm6Var12 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    yc4 yc4Var = (yc4) this.m;
                    rc4 rc4Var = new rc4(null, (rw5) obj3);
                    this.k = 1;
                    if (zsd.O(yc4Var, rc4Var, this) == nm6Var12) {
                        break;
                    }
                } else if (i20 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 13:
                rw5 rw5Var = (rw5) this.m;
                xx5 xx5Var = rw5Var.d;
                nm6 nm6Var13 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    pjc g = rw5Var.a.g();
                    this.k = 1;
                    g0 = zsd.g0(g, this);
                    break;
                } else if (i21 == 1) {
                    qgg.h0(obj);
                    g0 = obj;
                } else if (i21 != 2 && i21 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                xxq xxqVar = (xxq) g0;
                rx5 rx5Var = (rx5) obj3;
                if (!(rx5Var instanceof ox5)) {
                    if (!rx5Var.equals(px5.a)) {
                        if (!rx5Var.equals(qx5.a)) {
                            b6e.s();
                            break;
                        }
                    } else {
                        this.k = 3;
                        break;
                    }
                } else {
                    this.k = 2;
                    break;
                }
            case 14:
                nx5 nx5Var = (nx5) obj3;
                xdr xdrVar5 = nx5Var.n;
                nm6 nm6Var14 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    xdrVar5.getClass();
                    xdrVar5.m(null, hfg.a);
                    le3 le3Var = nx5Var.l;
                    this.m = xdrVar5;
                    this.k = 1;
                    h = le3Var.h(this);
                    if (h == nm6Var14) {
                        break;
                    }
                } else if (i22 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    xdrVar5 = (xdr) this.m;
                    qgg.h0(obj);
                    h = obj;
                }
                xdrVar5.l(h);
                break;
            case 15:
                nm6 nm6Var15 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    dib dibVar = ((tz5) this.m).h;
                    o50 o50Var = new o50((fvf) obj3, i6);
                    this.k = 1;
                    if (dibVar.collect(o50Var, this) == nm6Var15) {
                        break;
                    }
                } else if (i23 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                rj7.f();
                break;
            case 16:
                o3k o3kVar2 = (o3k) this.m;
                nm6 nm6Var16 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    int j = o3kVar2.j();
                    int i25 = ((m16) obj3).a;
                    if (j != i25) {
                        this.k = 1;
                        if (o3k.g(o3kVar2, i25, null, this, 6) == nm6Var16) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (i24 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 17:
                nm6 nm6Var17 = nm6.a;
                int i26 = this.k;
                if (i26 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar = ((o3k) this.m).r.a;
                    i64 i64Var4 = new i64(22, (c26) obj3);
                    this.k = 1;
                    x0qVar.collect(i64Var4, this);
                    break;
                } else if (i26 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
            case 18:
                nm6 nm6Var18 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object b2 = ((w16) ((evj) this.m).e).b((Long) obj3, this);
                    if (b2 != nm6Var18) {
                        break;
                    }
                } else if (i27 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                break;
            case 19:
                nm6 nm6Var19 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    pjc j2 = ((c26) this.m).j();
                    o50 o50Var2 = new o50((fvf) obj3, i5);
                    this.k = 1;
                    if (j2.collect(o50Var2, this) == nm6Var19) {
                        break;
                    }
                } else if (i28 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 20:
                i26 i26Var = (i26) this.m;
                xdr xdrVar6 = i26Var.r;
                nm6 nm6Var20 = nm6.a;
                int i29 = this.k;
                if (i29 == 0) {
                    qgg.h0(obj);
                    evj evjVar = i26Var.m;
                    rx5 rx5Var2 = (rx5) obj3;
                    if (i26Var.o) {
                        ox5 ox5Var = rx5Var2 instanceof ox5 ? (ox5) rx5Var2 : null;
                        if (ox5Var != null) {
                            l = Long.valueOf(ox5Var.a.a);
                            this.k = 1;
                            evjVar.getClass();
                            V = x97.V(dm6.b, new ov(evjVar, l, continuation, 13), this);
                            if (V == nm6Var20) {
                                break;
                            }
                        }
                    }
                    l = null;
                    this.k = 1;
                    evjVar.getClass();
                    V = x97.V(dm6.b, new ov(evjVar, l, continuation, 13), this);
                    if (V == nm6Var20) {
                    }
                } else if (i29 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    V = obj;
                }
                r06 r06Var = (r06) V;
                if (!(r06Var instanceof q06)) {
                    if (!Intrinsics.d(r06Var, p06.a)) {
                        b6e.s();
                        break;
                    } else {
                        do {
                            value2 = xdrVar6.getValue();
                        } while (!xdrVar6.k(value2, new l26(((l26) value2).a, l16.a, v06.a)));
                    }
                } else {
                    do {
                        value3 = xdrVar6.getValue();
                        l26 l26Var = (l26) value3;
                        t16Var = l26Var.a;
                        o16 o16Var = l26Var.b;
                        q06Var = (q06) r06Var;
                        m16Var = q06Var.a;
                        m16Var2 = o16Var instanceof m16 ? (m16) o16Var : null;
                    } while (!xdrVar6.k(value3, new l26(t16Var, m16.a(m16Var, m16Var2 == null ? 0 : m16Var2.a), q06Var.b)));
                }
                xdr xdrVar7 = i26Var.t;
                Boolean bool = Boolean.FALSE;
                xdrVar7.getClass();
                xdrVar7.m(null, bool);
                break;
            case 21:
                nm6 nm6Var21 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    pjc pjcVar = (pjc) this.m;
                    nz5 nz5Var = new nz5(continuation, (i26) obj3, i6);
                    this.k = 1;
                    if (zsd.O(pjcVar, nz5Var, this) == nm6Var21) {
                        break;
                    }
                } else if (i30 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 22:
                nm6 nm6Var22 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object invoke = ((Function2) this.m).invoke((ahm) obj3, this);
                    if (invoke != nm6Var22) {
                        break;
                    }
                } else if (i31 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                break;
            case 23:
                nm6 nm6Var23 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    Function2 function2 = (Function2) this.m;
                    Object obj7 = ((xqn) obj3).a;
                    this.k = 1;
                    Object invoke2 = function2.invoke(obj7, this);
                    if (invoke2 != nm6Var23) {
                        break;
                    }
                } else if (i32 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                break;
            case 24:
                ltm ltmVar = (ltm) this.m;
                nm6 nm6Var24 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    nz5 nz5Var2 = new nz5((z66) obj3, ltmVar, continuation, i5);
                    mn7 mn7Var = dm6.b;
                    this.m = ltmVar;
                    this.k = 1;
                    V2 = x97.V(mn7Var, nz5Var2, this);
                    break;
                } else if (i33 == 1) {
                    qgg.h0(obj);
                    V2 = obj;
                } else if (i33 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                r25 r25Var = new r25(27, (owf) V2);
                this.m = null;
                this.k = 2;
                break;
            case 25:
                nm6 nm6Var25 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    x0q x0qVar2 = ((zg6) this.m).k;
                    tg6 tg6Var = new tg6((Context) obj3, z2 ? 1 : 0);
                    this.k = 1;
                    x0qVar2.collect(tg6Var, this);
                    break;
                } else if (i34 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
            case 26:
                pfm pfmVar = (pfm) this.m;
                Object obj8 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    gfm gfmVar = gfm.a;
                    mt4 mt4Var = new mt4(1, (g6d) obj3, g6d.class, "onTransformStart", "onTransformStart(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", 0, 24);
                    int i36 = 0;
                    lk6 lk6Var = new lk6(6, (g6d) obj3, g6d.class, "onTransform", "onTransform-E2oHoeU(Landroidx/compose/ui/input/pointer/PointerInputChange;JZJFF)V", 0, i36);
                    mt4 mt4Var2 = new mt4(1, (g6d) obj3, g6d.class, "onTransformEnd", "onTransformEnd(Landroidx/compose/ui/input/pointer/PointerInputChange;)V", i36, 25);
                    this.m = null;
                    this.k = 1;
                    Object v2 = xee.v(pfmVar, new mk6(mt4Var, lk6Var, mt4Var2, null), this);
                    Object obj9 = v2;
                    if (v2 != obj8) {
                        obj9 = Unit.a;
                    }
                    if (obj9 == obj8) {
                        break;
                    }
                } else if (i35 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 27:
                nm6 nm6Var26 = nm6.a;
                int i37 = this.k;
                if (i37 == 0) {
                    qgg.h0(obj);
                    ltm ltmVar2 = (ltm) this.m;
                    le3 le3Var2 = (le3) obj3;
                    o9e o9eVar = (o9e) le3Var2.b;
                    String str5 = ((ehk) le3Var2.a).a;
                    ltmVar2.getClass();
                    ozw ozwVar = new ozw(20, ltmVar2);
                    str5.getClass();
                    n20 n20Var = new n20();
                    xdh xdhVar = new xdh(new n9e(ozwVar, z3 ? 1 : 0), new n9e(ozwVar, i6), o9eVar.b);
                    mif.b(mif.b(mif.a(mif.b(mif.a(fxf.V(new ssb(5, o9eVar, str5), new d03(xdhVar, i5), new xdh(continuation, new zfm(), o9eVar.c.a, n20Var)), new u8b(i4, xdhVar), null, 5), lhb.K, null, 5), lhb.z0, lhb.L, 1).c(new b8w(12, o9eVar)), new bw0(ltmVar2, i6), null, 5), lhb.x0, new bw0(ltmVar2, i5), 1);
                    bs5 bs5Var = bs5.y;
                    this.k = 1;
                    if (y7g.q(ltmVar2, bs5Var, this) == nm6Var26) {
                        break;
                    }
                } else if (i37 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var27 = nm6.a;
                int i38 = this.k;
                if (i38 == 0) {
                    qgg.h0(obj);
                    pfm pfmVar2 = (pfm) this.m;
                    hl6 hl6Var = new hl6((qbs) obj3, i6);
                    this.k = 1;
                    if (g6s.e(pfmVar2, null, null, hl6Var, this, 7) == nm6Var27) {
                        break;
                    }
                } else if (i38 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                String str6 = (String) obj3;
                lr6 lr6Var = (lr6) this.m;
                nm6 nm6Var28 = nm6.a;
                int i39 = this.k;
                Continuation continuation2 = null;
                if (i39 == 0) {
                    qgg.h0(obj);
                    cvl cvlVar2 = lr6Var.k;
                    if (cvlVar2 != null) {
                        bnd bndVar = lr6Var.l;
                        this.k = 1;
                        jul julVar = (jul) ((jyr) ((pt0) bndVar.b).a).getValue();
                        julVar.getClass();
                        dq7 dq7Var = ca8.a;
                        V3 = x97.V(mn7.d, new c5l(julVar, cvlVar2, str6, continuation2, 8), this);
                        break;
                    }
                    bnd bndVar2 = lr6Var.l;
                    this.k = 2;
                    jul julVar2 = (jul) ((jyr) ((pt0) bndVar2.b).a).getValue();
                    julVar2.getClass();
                    dq7 dq7Var2 = ca8.a;
                    V4 = x97.V(mn7.d, new b5l((Object) julVar2, str6, continuation2, 18), this);
                    break;
                } else if (i39 == 1) {
                    qgg.h0(obj);
                    V3 = obj;
                } else if (i39 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    V4 = obj;
                    cvlVar = (cvl) V4;
                    xdr xdrVar8 = lr6Var.m;
                    pr6 pr6Var = new pr6(cvlVar, lr6Var.k == null);
                    xdrVar8.getClass();
                    xdrVar8.m(null, pr6Var);
                    break;
                }
                cvlVar = (cvl) V3;
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vv4(pjc pjcVar, Continuation continuation, Object obj, int i) {
        super(2, continuation);
        this.j = i;
        this.m = pjcVar;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vv4(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.l = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vv4(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }
}
