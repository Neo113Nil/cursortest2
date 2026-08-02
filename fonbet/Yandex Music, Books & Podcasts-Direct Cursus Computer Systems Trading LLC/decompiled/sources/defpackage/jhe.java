package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.audio.WarningContent;

/* loaded from: classes4.dex */
public abstract class jhe {
    public static final List a;

    static {
        jzb jzbVar = jzb.c;
        rab rabVar = new rab("Certified Lover Boy", "Drake", null, "https://avatars.yandex.net/get-music-content/4388221/075fc2e1.a.17859702-1/m1000x1000", jzbVar, true, false);
        Album$AlbumType album$AlbumType = Album$AlbumType.COMMON;
        WarningContent warningContent = WarningContent.EXPLICIT;
        u9b u9bVar = new u9b("https://avatars.yandex.net/get-music-content/4388221/075fc2e1.a.17859702-1/m1000x1000", "", "");
        gs5 gs5Var = gs5.d;
        List c = t75.c(new hs5(gs5Var, "1"));
        h94 h94Var = h94.f;
        ehe eheVar = new ehe(rabVar, new lt("17859702", album$AlbumType, "Certified Lover Boy", warningContent, u9bVar, new gd6(c, t75.c(h94Var), true)), null);
        rab rabVar2 = new rab("good kid, m.A.A.d. city", "Kendrick Lamar", null, "https://avatars.yandex.net/get-music-content/28589/98382a55.a.1174459-1/m1000x1000", null, false, false);
        WarningContent warningContent2 = WarningContent.NONE;
        a = u75.h(new ahe("1880735", "Kanye West", "https://avatars.yandex.net/get-music-content/1880735/bd8ccdfb.p.644/m1000x1000", u75.h(eheVar, new ehe(rabVar2, new lt("1174459", album$AlbumType, "good kid, m.A.A.d. city", warningContent2, new u9b("https://avatars.yandex.net/get-music-content/28589/98382a55.a.1174459-1/m1000x1000", "", ""), null), null))), new ahe("5234847", "James Blake", "https://avatars.yandex.net/get-music-content/5234847/74f987bb.p.9048/m1000x1000", u75.h(new ehe(new rab("CARPRISONGS", "FKA twigs", null, "https://avatars.yandex.net/get-music-content/5631481/b1ed45b6.a.20612913-1/m1000x1000", null, false, false), new lt("20612913", album$AlbumType, "CARPRISONGS", warningContent, new u9b("https://avatars.yandex.net/get-music-content/5631481/b1ed45b6.a.20612913-1/m1000x1000", "", ""), null), null), new ehe(new rab("Spirit 2.0", "Sampha", null, "https://avatars.yandex.net/get-music-content/9784575/3f582587.a.26341392-1/m1000x1000", null, false, false), new lt("26341392", album$AlbumType, "Spirit 2.0", warningContent2, new u9b("https://avatars.yandex.net/get-music-content/9784575/3f582587.a.26341392-1/m1000x1000", "", ""), null), null))), new ahe("9784575", "Instasamka", "https://avatars.yandex.net/get-music-content/9784575/5c0b94de.p.7461723/m1000x1000", u75.h(new ehe(new rab("ВИТОН", "MONEYKEN", null, "https://avatars.yandex.net/get-music-content/2350646/8ede5ccc.a.12044575-2/m1000x1000", jzb.d, true, false), new lt("12044575", album$AlbumType, "ВИТОН", warningContent2, new u9b("https://avatars.yandex.net/get-music-content/2350646/8ede5ccc.a.12044575-2/m1000x1000", "", ""), new gd6(t75.c(new hs5(gs5.c, "2")), t75.c(h94.g), true)), null), new ehe(new rab("Беги", "XATI, Dj Speesh", null, "https://avatars.yandex.net/get-music-content/4304260/7e934e6d.a.13924708-1/m1000x1000", jzbVar, true, false), new lt("13924708", album$AlbumType, "Беги", warningContent, new u9b("https://avatars.yandex.net/get-music-content/4304260/7e934e6d.a.13924708-1/m1000x1000", "", ""), new gd6(t75.c(new hs5(gs5Var, "1")), t75.c(h94Var), true)), null))));
    }

    public static final void a(khe kheVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        kheVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2073282449);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(kheVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            d8t e = i8t.e(gld.M(kheVar.getState(), oq5Var).getValue(), "inStylePlaceholderCrossfade", oq5Var, 48, 0);
            act S = weo.S(0, 0, null, 7);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new mvd(25);
                oq5Var.k0(K);
            }
            vci vciVar = vci.a;
            tt0.f(e, vciVar, S, (Function1) K, ild.C(-985370532, new ghe(kheVar, 0), oq5Var), oq5Var, (i3 & 112) | 28032, 0);
            yciVar = vciVar;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(kheVar, yciVar, i, 11);
        }
    }

    public static final void b(int i, hq5 hq5Var, yci yciVar, String str, boolean z) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1725188460);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.g(z) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            g(i2 & 126, oq5Var, null, str, z);
            u1g.l(oq5Var, d.e(vci.a, 16));
            e((i2 >> 3) & 14, oq5Var, null, z);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gb1(str, z, yciVar, i, 1);
        }
    }

    public static final void c(pgt pgtVar, ahe aheVar, khe kheVar, yci yciVar, hq5 hq5Var, int i) {
        pgt pgtVar2;
        int i2;
        ahe aheVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-840989539);
        if ((i & 6) == 0) {
            pgtVar2 = pgtVar;
            i2 = (oq5Var.f(pgtVar2) ? 4 : 2) | i;
        } else {
            pgtVar2 = pgtVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            aheVar2 = aheVar;
            i2 |= oq5Var.f(aheVar2) ? 32 : 16;
        } else {
            aheVar2 = aheVar;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(kheVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        int i3 = i2;
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            vci vciVar = vci.a;
            h(pgtVar2, aheVar2, kheVar, androidx.compose.ui.platform.a.a(d.d(vciVar, 1.0f), "in_style_block_chips"), oq5Var, (i3 & 896) | (i3 & 14) | 3072 | (i3 & 112));
            u1g.l(oq5Var, d.e(vciVar, 16));
            tt0.g(aheVar, null, null, "inStyleContentCrossfade", ild.C(553740088, new ghe(kheVar, 1), oq5Var), oq5Var, ((i3 >> 3) & 14) | 27648, 6);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hhe(pgtVar, aheVar, kheVar, yciVar, i, 0);
        }
    }

    public static final void d(final ehe eheVar, final Function1 function1, yci yciVar, final Function1 function12, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-127653996);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(eheVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(function12) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            rab rabVar = eheVar.a;
            int i3 = i2 & 14;
            boolean z = ((i2 & 112) == 32) | (i3 == 4);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                final int i4 = 0;
                K = new Function0() { // from class: fhe
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                function1.invoke(eheVar);
                                break;
                            default:
                                Function1 function13 = function1;
                                if (function13 != null) {
                                    function13.invoke(eheVar);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
            }
            Function0 function0 = (Function0) K;
            boolean z2 = ((i2 & 7168) == 2048) | (i3 == 4);
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                final int i5 = 1;
                K2 = new Function0() { // from class: fhe
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                function12.invoke(eheVar);
                                break;
                            default:
                                Function1 function13 = function12;
                                if (function13 != null) {
                                    function13.invoke(eheVar);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K2);
            }
            irf.a(i2 & 896, 16, oq5Var, rabVar, yciVar, function0, (Function0) K2, false);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wda(i, 8, eheVar, function1, yciVar, function12);
        }
    }

    public static final void e(int i, hq5 hq5Var, yci yciVar, boolean z) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(608636181);
        int i2 = ((i & 6) == 0 ? (oq5Var.g(z) ? 4 : 2) | i : i) | 48;
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            ArrayList arrayList = new ArrayList(10);
            for (int i3 = 0; i3 < 10; i3++) {
                arrayList.add(Unit.a);
            }
            wn5 C = ild.C(496448751, new xu0(11, z), oq5Var);
            int i4 = (i2 & 112) | ScreenMirroringConfig.Video.BITRATE_1_5MB;
            yciVar2 = vci.a;
            up6.j(arrayList, yciVar2, null, 0.0f, 0.0f, null, null, false, 0, C, oq5Var, i4, 956);
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z, yciVar2, i, 11);
        }
    }

    public static final void f(ahe aheVar, khe kheVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1813016806);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(aheVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(kheVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var2.f(yciVar2) ? 256 : 128;
        } else {
            yciVar2 = yciVar;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 147) != 146)) {
            apo apoVar = fvf.w;
            Object[] objArr = {aheVar};
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new sxd(7);
                oq5Var2.k0(K);
            }
            fvf fvfVar = (fvf) o2g.g0(objArr, apoVar, (Function0) K, oq5Var2, 3072, 4);
            ynn i3 = irv.i(oq5Var2);
            List list = aheVar.d;
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = new rea(19);
                oq5Var2.k0(K2);
            }
            oq5Var = oq5Var2;
            up6.i(list, yciVar2, (Function2) K2, null, 0.0f, 0.0f, 0.0f, fvfVar, null, null, false, 0, ild.C(685917273, new jv(9, i3, kheVar), oq5Var2), oq5Var, ((i2 >> 3) & 112) | 384, 384, 3960);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yja(aheVar, kheVar, yciVar, i, 7);
        }
    }

    public static final void g(int i, hq5 hq5Var, yci yciVar, String str, boolean z) {
        String str2;
        int i2;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1886960083);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = i | (oq5Var2.f(str2) ? 4 : 2);
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.g(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (oq5Var2.P(i3 & 1, (i3 & 147) != 146)) {
            ArrayList arrayList = new ArrayList(5);
            for (int i4 = 0; i4 < 5; i4++) {
                arrayList.add(Integer.valueOf(i4));
            }
            float f = 8;
            q0k q0kVar = new q0k(f, f, 16, f);
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = new mvd(27);
                oq5Var2.k0(K);
            }
            vci vciVar = vci.a;
            oq5Var = oq5Var2;
            ngg.h(str2, arrayList, 0, (Function1) K, ild.C(931668791, new jn1(1, z), oq5Var2), vciVar, 0L, 0L, false, q0kVar, 0.0f, 0.0f, null, oq5Var, (i3 & 14) | 100691328 | ((i3 << 9) & 458752), 6, 14528);
            yciVar2 = vciVar;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ihe(str, z, yciVar2, i, 0);
        }
    }

    public static final void h(pgt pgtVar, ahe aheVar, khe kheVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        oq5 oq5Var;
        kjn kjnVar;
        int i3;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1898773430);
        if ((i & 6) == 0) {
            i2 = (oq5Var2.f(pgtVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var2.f(aheVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var2.f(kheVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i2 |= oq5Var2.f(yciVar2) ? 2048 : 1024;
        } else {
            yciVar2 = yciVar;
        }
        if (oq5Var2.P(i2 & 1, (i2 & 1171) != 1170)) {
            String str = pgtVar.a;
            List list = pgtVar.b;
            int i4 = i2 & 896;
            boolean z = i4 == 256;
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (z || K == kjnVar2) {
                kjnVar = kjnVar2;
                i3 = i4;
                aub aubVar = new aub(1, kheVar, khe.class, "onEntityClick", "onEntityClick(Lcom/yandex/music/shared/skeleton/blocks/ui/logic/api/instyle/InStyleBlockEntityUiData;)V", 0, 15);
                oq5Var2.k0(aubVar);
                K = aubVar;
            } else {
                i3 = i4;
                kjnVar = kjnVar2;
            }
            h9f h9fVar = (h9f) K;
            boolean z2 = i3 == 256;
            Object K2 = oq5Var2.K();
            if (z2 || K2 == kjnVar) {
                aub aubVar2 = new aub(1, kheVar, khe.class, "onArtistChipLongCLick", "onArtistChipLongCLick(Lcom/yandex/music/shared/skeleton/blocks/ui/logic/api/instyle/InStyleBlockEntityUiData;)V", 0, 16);
                oq5Var2.k0(aubVar2);
                K2 = aubVar2;
            }
            float f = 8;
            oq5Var = oq5Var2;
            ngg.h(str, list, aheVar, (Function1) h9fVar, leu.b, yciVar2, 0L, 0L, false, new q0k(f, f, 16, f), 0.0f, 0.0f, (Function1) ((h9f) K2), oq5Var, ((i2 << 3) & 896) | 24576 | ((i2 << 6) & 458752), 0, 7616);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new hhe(pgtVar, aheVar, kheVar, yciVar, i, 1);
        }
    }
}
