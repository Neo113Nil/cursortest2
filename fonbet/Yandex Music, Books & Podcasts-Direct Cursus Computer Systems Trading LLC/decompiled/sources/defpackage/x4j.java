package defpackage;

import androidx.compose.foundation.a;
import androidx.compose.foundation.layout.d;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final /* synthetic */ class x4j implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ yci c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ x4j(long j, geh gehVar, psv psvVar, lyv lyvVar, rxv rxvVar, Function0 function0, yci yciVar, int i) {
        this.b = j;
        this.e = gehVar;
        this.f = psvVar;
        this.g = lyvVar;
        this.h = rxvVar;
        this.i = function0;
        this.c = yciVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        wn5 C;
        switch (this.a) {
            case 0:
                d85 d85Var = (d85) this.e;
                final i5j i5jVar = (i5j) this.f;
                final l5j l5jVar = (l5j) this.g;
                final sdr sdrVar = (sdr) this.h;
                final bc5 bc5Var = (bc5) this.i;
                hq5 hq5Var = (hq5) obj;
                int intValue = ((Integer) obj2).intValue();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 3) != 2)) {
                    iz2 iz2Var = b2c.f;
                    long j = this.b;
                    if (d85Var == null) {
                        oq5Var.Z(-832417763);
                        oq5Var.p(false);
                        C = null;
                    } else {
                        oq5Var.Z(-832417762);
                        C = ild.C(-923104260, new lw4(d85Var, j), oq5Var);
                        oq5Var.p(false);
                    }
                    wn5 wn5Var = C;
                    yci u = xp3.u(this.c, o5g.C(oq5Var));
                    d85 d85Var2 = new d85(j);
                    final int i = this.d;
                    lg3.i(u, d85Var2, iz2Var, null, wn5Var, ild.C(2108457833, new ryc() { // from class: y4j
                        /* JADX WARN: Code restructure failed: missing block: B:25:0x00f9, code lost:
                        
                            if (kotlin.jvm.internal.Intrinsics.d(r14.K(), java.lang.Integer.valueOf(r8)) == false) goto L33;
                         */
                        /* JADX WARN: Code restructure failed: missing block: B:84:0x042e, code lost:
                        
                            if (r2 == r0) goto L114;
                         */
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r11v10, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r11v34 */
                        /* JADX WARN: Type inference failed for: r11v9 */
                        @Override // defpackage.ryc
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object invoke(Object obj3, Object obj4, Object obj5, Object obj6) {
                            yci g;
                            i5j i5jVar2;
                            ?? r11;
                            oq5 oq5Var2;
                            kjn kjnVar;
                            boolean z;
                            u9b u9bVar;
                            String e;
                            uoi uoiVar = (uoi) obj4;
                            hq5 hq5Var2 = (hq5) obj5;
                            int intValue2 = ((Integer) obj6).intValue();
                            ((dh3) obj3).getClass();
                            uoiVar.getClass();
                            if ((intValue2 & 48) == 0) {
                                intValue2 |= ((oq5) hq5Var2).f(uoiVar) ? 32 : 16;
                            }
                            oq5 oq5Var3 = (oq5) hq5Var2;
                            if (oq5Var3.P(intValue2 & 1, (intValue2 & 145) != 144)) {
                                hz2 hz2Var = b2c.l;
                                i5j i5jVar3 = i5j.this;
                                boolean f = oq5Var3.f(i5jVar3);
                                l5j l5jVar2 = l5jVar;
                                boolean f2 = f | oq5Var3.f(l5jVar2);
                                Object K = oq5Var3.K();
                                kjn kjnVar2 = gq5.a;
                                if (f2 || K == kjnVar2) {
                                    K = new q4j(i5jVar3, l5jVar2, 2);
                                    oq5Var3.k0(K);
                                }
                                Function0 S = irf.S((Function0) K, oq5Var3, 0);
                                meo meoVar = new meo(0);
                                boolean f3 = oq5Var3.f(i5jVar3) | oq5Var3.f(l5jVar2);
                                int i2 = i;
                                boolean d = f3 | oq5Var3.d(i2);
                                Object K2 = oq5Var3.K();
                                if (d || K2 == kjnVar2) {
                                    K2 = new r4j(i5jVar3, l5jVar2, i2, 5);
                                    oq5Var3.k0(K2);
                                }
                                vci vciVar = vci.a;
                                g = a.g(vciVar, uoiVar, null, true, null, (r17 & 16) != 0 ? null : meoVar, null, (r17 & 64) != 0 ? null : S, null, (Function0) K2);
                                float f4 = 10;
                                float f5 = 12;
                                yci q = androidx.compose.foundation.layout.a.q(g, f5, f4, 0.0f, f4, 4);
                                x2i x2iVar = qx0.a;
                                nho a = lho.a(x2iVar, hz2Var, oq5Var3, 48);
                                int i3 = oq5Var3.P;
                                androidx.compose.runtime.internal.a l = oq5Var3.l();
                                yci H = vnj.H(oq5Var3, q);
                                xp5.T.getClass();
                                grb grbVar = wp5.b;
                                oq5Var3.d0();
                                if (oq5Var3.O) {
                                    oq5Var3.k(grbVar);
                                } else {
                                    oq5Var3.n0();
                                }
                                kb5 kb5Var = wp5.f;
                                g0g.U(oq5Var3, a, kb5Var);
                                kb5 kb5Var2 = wp5.e;
                                g0g.U(oq5Var3, l, kb5Var2);
                                kb5 kb5Var3 = wp5.g;
                                if (oq5Var3.O) {
                                    i5jVar2 = i5jVar3;
                                } else {
                                    i5jVar2 = i5jVar3;
                                }
                                ouj.x(i3, oq5Var3, i3, kb5Var3);
                                kb5 kb5Var4 = wp5.d;
                                g0g.U(oq5Var3, H, kb5Var4);
                                iz2 iz2Var2 = b2c.f;
                                yci u2 = xp3.u(d.m(vciVar, 80), o5g.F(oq5Var3));
                                kfh d2 = ug3.d(iz2Var2, false);
                                int i4 = oq5Var3.P;
                                androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                                yci H2 = vnj.H(oq5Var3, u2);
                                oq5Var3.d0();
                                if (oq5Var3.O) {
                                    oq5Var3.k(grbVar);
                                } else {
                                    oq5Var3.n0();
                                }
                                g0g.U(oq5Var3, d2, kb5Var);
                                g0g.U(oq5Var3, l2, kb5Var2);
                                if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i4))) {
                                    ouj.x(i4, oq5Var3, i4, kb5Var3);
                                }
                                g0g.U(oq5Var3, H2, kb5Var4);
                                agr agrVar = eq0.a;
                                long j2 = ((dq0) oq5Var3.j(agrVar)).c.d;
                                String str = "";
                                if (!((Boolean) oq5Var3.j(koe.a)).booleanValue() && (u9bVar = l5jVar2.c.e) != null && (e = u9bVar.e(wct.t(), WebPath$Storage.AVATARS)) != null) {
                                    str = e;
                                }
                                qo6 qo6Var = qo6.k;
                                yci c = d.c(vciVar, 1.0f);
                                sdr sdrVar2 = sdrVar;
                                kw kwVar = (kw) sdrVar2.getValue();
                                kw kwVar2 = kw.a;
                                i5j i5jVar4 = i5jVar2;
                                ltg.e(qo6Var, str, androidx.compose.ui.platform.a.a(orl.c(c, kwVar != kwVar2, j2, oq5Var3), "new_releases_item_block_cover"), null, null, null, null, null, oq5Var3, 6, 248);
                                oq5 oq5Var4 = oq5Var3;
                                if (((kw) sdrVar2.getValue()) != kwVar2) {
                                    oq5Var4.Z(736674163);
                                    orl.a(0, 6, 0L, oq5Var4, null, ((kw) sdrVar2.getValue()) == kw.b);
                                    oq5Var2 = oq5Var4;
                                    r11 = 0;
                                } else {
                                    r11 = 0;
                                    oq5Var4.Z(730520291);
                                    oq5Var2 = oq5Var4;
                                }
                                oq5Var2.p(r11);
                                oq5Var2.p(true);
                                yci d3 = d.d(androidx.compose.foundation.layout.a.q(vciVar, f5, 0.0f, (float) r11, 0.0f, 10), 1.0f);
                                if (1.0f <= 0.0d) {
                                    qme.a("invalid weight; must be greater than zero");
                                }
                                yci g2 = vz1.g(1.0f, d3, true);
                                ta5 a2 = sa5.a(qx0.e, b2c.n, oq5Var2, 6);
                                int i5 = oq5Var2.P;
                                androidx.compose.runtime.internal.a l3 = oq5Var2.l();
                                yci H3 = vnj.H(oq5Var2, g2);
                                oq5Var2.d0();
                                if (oq5Var2.O) {
                                    oq5Var2.k(grbVar);
                                } else {
                                    oq5Var2.n0();
                                }
                                g0g.U(oq5Var2, a2, kb5Var);
                                g0g.U(oq5Var2, l3, kb5Var2);
                                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                                    ouj.x(i5, oq5Var2, i5, kb5Var3);
                                }
                                g0g.U(oq5Var2, H3, kb5Var4);
                                hyf.l(l5jVar2, androidx.compose.ui.platform.a.a(vciVar, "new_releases_item_block_album_name"), oq5Var2, 48);
                                u1g.l(oq5Var2, d.e(vciVar, mu0.a));
                                nho a3 = lho.a(x2iVar, b2c.k, oq5Var2, 0);
                                int i6 = oq5Var2.P;
                                androidx.compose.runtime.internal.a l4 = oq5Var2.l();
                                yci H4 = vnj.H(oq5Var2, vciVar);
                                oq5Var2.d0();
                                if (oq5Var2.O) {
                                    oq5Var2.k(grbVar);
                                } else {
                                    oq5Var2.n0();
                                }
                                g0g.U(oq5Var2, a3, kb5Var);
                                g0g.U(oq5Var2, l4, kb5Var2);
                                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                                    ouj.x(i6, oq5Var2, i6, kb5Var3);
                                }
                                g0g.U(oq5Var2, H4, kb5Var4);
                                oq5 oq5Var5 = oq5Var2;
                                xv7.j(etn.H(l5jVar2.c), androidx.compose.ui.platform.a.a(vciVar, "new_releases_item_block_title"), ((dq0) oq5Var2.j(agrVar)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var5, 48, 3120, 55288);
                                oq5 oq5Var6 = oq5Var5;
                                String str2 = l5jVar2.d;
                                if (str2 == null) {
                                    oq5Var6.Z(334204188);
                                } else {
                                    oq5Var6.Z(334204189);
                                    yci a4 = androidx.compose.ui.platform.a.a(vciVar, "new_releases_item_block_release_date");
                                    StringBuilder sb = new StringBuilder(16);
                                    new ArrayList();
                                    ArrayList arrayList = new ArrayList();
                                    new ArrayList();
                                    sb.append(" • ");
                                    sb.append(str2);
                                    String sb2 = sb.toString();
                                    ArrayList arrayList2 = new ArrayList(arrayList.size());
                                    int i7 = 0;
                                    for (int size = arrayList.size(); i7 < size; size = size) {
                                        arrayList2.add(((jn0) arrayList.get(i7)).a(sb.length()));
                                        i7++;
                                    }
                                    xv7.i(new mn0(sb2, arrayList2), a4, ((dq0) oq5Var6.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, nu0.i(), null, null, oq5Var6, 48, 3120, 907256);
                                    oq5Var6 = oq5Var6;
                                }
                                oq5Var6.p(false);
                                oq5Var6.p(true);
                                oq5Var6.p(true);
                                nho a5 = lho.a(x2iVar, hz2Var, oq5Var6, 48);
                                int i8 = oq5Var6.P;
                                androidx.compose.runtime.internal.a l5 = oq5Var6.l();
                                yci H5 = vnj.H(oq5Var6, vciVar);
                                oq5Var6.d0();
                                if (oq5Var6.O) {
                                    oq5Var6.k(grbVar);
                                } else {
                                    oq5Var6.n0();
                                }
                                g0g.U(oq5Var6, a5, kb5Var);
                                g0g.U(oq5Var6, l5, kb5Var2);
                                if (oq5Var6.O || !Intrinsics.d(oq5Var6.K(), Integer.valueOf(i8))) {
                                    ouj.x(i8, oq5Var6, i8, kb5Var3);
                                }
                                g0g.U(oq5Var6, H5, kb5Var4);
                                if (l5jVar2.k) {
                                    oq5Var6.Z(1073762411);
                                    boolean f6 = oq5Var6.f(i5jVar4) | oq5Var6.f(l5jVar2) | oq5Var6.d(i2);
                                    Object K3 = oq5Var6.K();
                                    if (f6) {
                                        kjnVar = kjnVar2;
                                    } else {
                                        kjnVar = kjnVar2;
                                    }
                                    K3 = new r4j(i5jVar4, l5jVar2, i2, 6);
                                    oq5Var6.k0(K3);
                                    u1g.o(0, 0L, oq5Var6, null, (Function0) K3);
                                    z = false;
                                } else {
                                    kjnVar = kjnVar2;
                                    z = false;
                                    oq5Var6.Z(1065454721);
                                }
                                oq5Var6.p(z);
                                bc5 bc5Var2 = bc5Var;
                                boolean f7 = oq5Var6.f(bc5Var2);
                                Object K4 = oq5Var6.K();
                                if (f7 || K4 == kjnVar) {
                                    sui suiVar = new sui(0, bc5Var2, bc5.class, "onClick", "onClick()V", 0, 10);
                                    oq5Var6.k0(suiVar);
                                    K4 = suiVar;
                                }
                                oq5 oq5Var7 = oq5Var6;
                                rvf.m((Function0) ((h9f) K4), ((kw) sdrVar2.getValue()) == kw.b ? true : z, androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 0.0f, 4, 0.0f, 11), 0L, oq5Var7, 384, 8);
                                oq5Var7.p(true);
                                oq5Var7.p(true);
                            } else {
                                oq5Var3.S();
                            }
                            return Unit.a;
                        }
                    }, oq5Var), oq5Var, 1575936, 20);
                } else {
                    oq5Var.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                f8g.g(this.b, (geh) this.e, (psv) this.f, (lyv) this.g, (rxv) this.h, (Function0) this.i, this.c, (hq5) obj, rvf.R(this.d | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ x4j(d85 d85Var, yci yciVar, long j, i5j i5jVar, l5j l5jVar, int i, aqi aqiVar, bc5 bc5Var) {
        this.e = d85Var;
        this.c = yciVar;
        this.b = j;
        this.f = i5jVar;
        this.g = l5jVar;
        this.d = i;
        this.h = aqiVar;
        this.i = bc5Var;
    }
}
