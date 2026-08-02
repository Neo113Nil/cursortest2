package defpackage;

import android.content.res.Configuration;
import android.os.Build;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.dto.artist.LinkDto;
import com.yandex.music.shared.dto.wave.AgentDto;
import com.yandex.music.shared.dto.wave.recommendation.StationIdDto;
import com.yandex.music.shared.search.network.WaveDataDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.video.m3.player.AbrPreferences;
import ru.yandex.video.m3.player.PreparingParams;

/* loaded from: classes3.dex */
public abstract class s7g {
    public static final ail A(xqq xqqVar) {
        xqqVar.getClass();
        return new ail(29, xqqVar.J(), xqqVar);
    }

    public static final ayn B(fvf fvfVar, ryc rycVar, hq5 hq5Var, int i) {
        zwn zwnVar;
        fvfVar.getClass();
        rycVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(-645045624);
        float f = 0;
        q0k q0kVar = new q0k(f, f, f, f);
        float f2 = pxn.a;
        oq5Var.Z(1347434050);
        boolean z = (((i & 14) ^ 6) > 4 && oq5Var.f(fvfVar)) || (i & 6) == 4;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (z || K == kjnVar) {
            K = new yxn(fvfVar, 0);
            oq5Var.k0(K);
        }
        Function0 function0 = (Function0) K;
        oq5Var.p(false);
        function0.getClass();
        oq5Var.Z(996643712);
        Object K2 = oq5Var.K();
        if (K2 == kjnVar) {
            K2 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
        }
        mm6 mm6Var = ((fs5) K2).a;
        aqi o0 = szf.o0(function0, oq5Var);
        aqi o02 = szf.o0(100L, oq5Var);
        oq5Var.Z(1852585201);
        boolean e = oq5Var.e(100L) | oq5Var.f(fvfVar) | oq5Var.f(mm6Var);
        Object K3 = oq5Var.K();
        if (e || K3 == kjnVar) {
            K3 = new dyo(fvfVar, mm6Var, new j5n(9, o0, o02));
            oq5Var.k0(K3);
        }
        dyo dyoVar = (dyo) K3;
        oq5Var.p(false);
        oq5Var.p(false);
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        float n0 = jx7Var.n0(f2);
        Object K4 = oq5Var.K();
        if (K4 == kjnVar) {
            K4 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
        }
        mm6 mm6Var2 = ((fs5) K4).a;
        aqi o03 = szf.o0(rycVar, oq5Var);
        xof xofVar = (xof) oq5Var.j(es5.n);
        i5 i5Var = new i5(jx7Var.n0(a.f(q0kVar, xofVar)), jx7Var.n0(a.e(q0kVar, xofVar)), jx7Var.n0(f), jx7Var.n0(f));
        oq5Var.Z(1347465600);
        int i2 = (i & 14) ^ 6;
        boolean z2 = (i2 > 4 && oq5Var.f(fvfVar)) || (i & 6) == 4;
        Object K5 = oq5Var.K();
        if (z2 || K5 == kjnVar) {
            K5 = new yxn(fvfVar, 1);
            oq5Var.k0(K5);
        }
        oq5Var.p(false);
        zx7 U = szf.U((Function0) K5);
        bxj bxjVar = (bxj) U.getValue();
        oq5Var.Z(1347468268);
        boolean f3 = ((((i & 7168) ^ 3072) > 2048 && oq5Var.f(dyoVar)) || (i & 3072) == 2048) | ((i2 > 4 && oq5Var.f(fvfVar)) || (i & 6) == 4) | oq5Var.f(mm6Var2) | ((((i & 896) ^ 384) > 256 && oq5Var.c(f2)) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && oq5Var.f(q0kVar)) || (i & 48) == 32) | oq5Var.f(bxjVar);
        Object K6 = oq5Var.K();
        if (f3 || K6 == kjnVar) {
            int ordinal = ((bxj) U.getValue()).ordinal();
            if (ordinal == 0) {
                zwnVar = zwn.t;
            } else {
                if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
                zwnVar = zwn.u;
            }
            zwn zwnVar2 = zwnVar;
            dyoVar.getClass();
            xofVar.getClass();
            ayn aynVar = new ayn(new sml(fvfVar), mm6Var2, o03, n0, i5Var, dyoVar, xofVar, zwnVar2);
            oq5Var.k0(aynVar);
            K6 = aynVar;
        }
        ayn aynVar2 = (ayn) K6;
        oq5Var.p(false);
        oq5Var.p(false);
        return aynVar2;
    }

    public static void C(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            aps.a(view, charSequence);
            return;
        }
        cps cpsVar = cps.k;
        if (cpsVar != null && cpsVar.a == view) {
            cps.d(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new cps(view, charSequence);
            return;
        }
        cps cpsVar2 = cps.l;
        if (cpsVar2 != null && cpsVar2.a == view) {
            cpsVar2.c();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    public static final m7g D(LinkDto linkDto) {
        String title = linkDto.getTitle();
        if (title == null) {
            return null;
        }
        String subtitle = linkDto.getSubtitle();
        String url = linkDto.getUrl();
        if (url == null) {
            return null;
        }
        return new m7g(title, subtitle, url, linkDto.getImageUrl());
    }

    public static final u1u E(WaveDataDto waveDataDto) {
        String subtitle;
        String color;
        Integer b0;
        StationIdDto stationIdDto = waveDataDto.getStationIdDto();
        if (stationIdDto != null) {
            StationId T = asq.T(stationIdDto);
            List seeds = waveDataDto.getSeeds();
            List O = seeds != null ? CollectionsKt.O(seeds) : c5b.a;
            String title = waveDataDto.getTitle();
            if (title != null && (subtitle = waveDataDto.getSubtitle()) != null && (color = waveDataDto.getColor()) != null && (b0 = y2x.b0(color)) != null) {
                int intValue = b0.intValue();
                String image = waveDataDto.getImage();
                String str = (image == null || StringsKt.U(image)) ? null : image;
                AgentDto agent = waveDataDto.getAgent();
                return new u1u(T, O, title, subtitle, intValue, str, agent != null ? w1g.E(agent) : null);
            }
        }
        return null;
    }

    public static final yci F(yj0 yj0Var) {
        return new wx7(yj0Var, ucs.z);
    }

    public static void G(Parcel parcel, s2i s2iVar) {
        int i;
        int read;
        if (s2iVar != null) {
            Charset charset = wue.a;
            i = s2iVar.b;
        } else {
            i = 0;
        }
        if (i == 0) {
            parcel.writeInt(0);
            return;
        }
        Charset charset2 = wue.a;
        Object[] objArr = new Object[s2iVar.b * 2];
        for (int i2 = 0; i2 < s2iVar.b; i2++) {
            int i3 = i2 * 2;
            objArr[i3] = s2iVar.f(i2);
            int i4 = i3 + 1;
            Object obj = s2iVar.a[i4];
            if (!(obj instanceof byte[])) {
                ((p2i) obj).getClass();
                throw null;
            }
            objArr[i4] = obj;
        }
        parcel.writeInt(i);
        for (int i5 = 0; i5 < i; i5++) {
            int i6 = i5 * 2;
            byte[] bArr = (byte[]) objArr[i6];
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
            Object obj2 = objArr[i6 + 1];
            if (obj2 instanceof byte[]) {
                byte[] bArr2 = (byte[]) obj2;
                parcel.writeInt(bArr2.length);
                parcel.writeByteArray(bArr2);
            } else {
                if (obj2 instanceof s6k) {
                    parcel.writeInt(-1);
                    parcel.dataPosition();
                    throw null;
                }
                byte[] a = y63.a(y63.a);
                try {
                    InputStream inputStream = (InputStream) obj2;
                    int i7 = 0;
                    while (i7 < a.length && (read = inputStream.read(a, i7, a.length - i7)) != -1) {
                        i7 += read;
                    }
                    if (i7 == a.length) {
                        throw sgr.l.i("Metadata value too large").a();
                    }
                    parcel.writeInt(i7);
                    if (i7 > 0) {
                        parcel.writeByteArray(a, 0, i7);
                    }
                    y63.b(a);
                } catch (Throwable th) {
                    y63.b(a);
                    throw th;
                }
            }
        }
    }

    public static final void a(r5h r5hVar, hq5 hq5Var, int i) {
        fvf fvfVar;
        x5h x5hVar;
        r5hVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1518151080);
        int i2 = (oq5Var.h(r5hVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            x5h x5hVar2 = (x5h) szf.Q(r5hVar.h, oq5Var).getValue();
            fvf a = hvf.a(0, 0, oq5Var, 0, 3);
            ogp.g.e(false, x5hVar2 instanceof v5h, null, oq5Var, 4096, 5);
            yci a2 = androidx.compose.ui.platform.a.a(vci.a, "collection_main_kids_screen");
            boolean booleanValue = ((Boolean) szf.Q(r5hVar.i, oq5Var).getValue()).booleanValue();
            boolean h = oq5Var.h(r5hVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                fvfVar = a;
                x5hVar = x5hVar2;
                k5h k5hVar = new k5h(0, r5hVar, r5h.class, "onRefresh", "onRefresh()V", 0, 0);
                oq5Var.k0(k5hVar);
                K = k5hVar;
            } else {
                x5hVar = x5hVar2;
                fvfVar = a;
            }
            h9f h9fVar = (h9f) K;
            boolean h2 = oq5Var.h(r5hVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                k5h k5hVar2 = new k5h(0, r5hVar, r5h.class, "onBackClicked", "onBackClicked()V", 0, 1);
                oq5Var.k0(k5hVar2);
                K2 = k5hVar2;
            }
            h9f h9fVar2 = (h9f) K2;
            boolean h3 = oq5Var.h(r5hVar);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                k5h k5hVar3 = new k5h(0, r5hVar, r5h.class, "onSearchClicked", "onSearchClicked()V", 0, 2);
                oq5Var.k0(k5hVar3);
                K3 = k5hVar3;
            }
            xp3.g(R.string.kids_catalog_title, fvfVar, booleanValue, (Function0) h9fVar, (Function0) h9fVar2, a2, (Function0) ((h9f) K3), null, ild.C(527890132, new vtb(11, x5hVar, r5hVar, fvfVar), oq5Var), oq5Var, 100859904, 128);
            oq5Var = oq5Var;
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ykf(r5hVar, i, 5);
        }
    }

    public static final void b(tx txVar, Function2 function2, Function2 function22, ryc rycVar, hq5 hq5Var, int i) {
        function2.getClass();
        function22.getClass();
        rycVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2057009043);
        int i2 = i | (oq5Var.h(txVar) ? 4 : 2) | (oq5Var.h(function2) ? 32 : 16) | (oq5Var.h(function22) ? 256 : 128) | (oq5Var.h(rycVar) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 7168) == 2048;
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new ykf(14, rycVar);
                oq5Var.k0(K);
            }
            wyf.k(txVar, function2, function22, null, (Function2) K, oq5Var, (i2 & 14) | 8 | (i2 & 112) | (i2 & 896));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new av5(i, 24, txVar, function2, function22, rycVar);
        }
    }

    public static final void c(vdr vdrVar, kub kubVar, tt4 tt4Var, yke ykeVar, xan xanVar, Function0 function0, Function0 function02, hq5 hq5Var, int i) {
        kb5 kb5Var;
        kb5 kb5Var2;
        boolean z;
        int i2;
        sdr sdrVar;
        kb5 kb5Var3;
        boolean z2;
        boolean z3;
        kb5 kb5Var4;
        kb5 kb5Var5;
        yci b;
        jzk jzkVar = vnj.i;
        vdrVar.getClass();
        kubVar.getClass();
        tt4Var.getClass();
        ykeVar.getClass();
        xanVar.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-911916370);
        int i3 = i | (oq5Var.h(vdrVar) ? 4 : 2) | (oq5Var.f(kubVar) ? 32 : 16) | (oq5Var.f(tt4Var) ? 256 : 128) | (oq5Var.h(ykeVar) ? 2048 : 1024) | (oq5Var.f(xanVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(function02) ? 1048576 : 524288);
        if (oq5Var.P(i3 & 1, (599187 & i3) != 599186)) {
            aqi M = gld.M(vdrVar, oq5Var);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = szf.U(new xtb(M, 13));
                oq5Var.k0(K);
            }
            sdr sdrVar2 = (sdr) K;
            Object K2 = oq5Var.K();
            if (K2 == obj) {
                K2 = szf.U(new xtb(M, 14));
                oq5Var.k0(K2);
            }
            sdr sdrVar3 = (sdr) K2;
            Object K3 = oq5Var.K();
            if (K3 == obj) {
                K3 = szf.U(new xtb(M, 15));
                oq5Var.k0(K3);
            }
            sdr sdrVar4 = (sdr) K3;
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci yciVar = vci.a;
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var6 = wp5.f;
            g0g.U(oq5Var, d, kb5Var6);
            kb5 kb5Var7 = wp5.e;
            g0g.U(oq5Var, l, kb5Var7);
            kb5 kb5Var8 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var8);
            }
            kb5 kb5Var9 = wp5.d;
            g0g.U(oq5Var, H, kb5Var9);
            if (((Boolean) sdrVar2.getValue()).booleanValue()) {
                oq5Var.Z(-1297180338);
                yci b2 = androidx.compose.foundation.a.b(yciVar, ((dq0) oq5Var.j(eq0.a)).c.a, jzkVar);
                boolean f = oq5Var.f(M);
                Object K4 = oq5Var.K();
                if (f || K4 == obj) {
                    K4 = new xtb(M, 16);
                    oq5Var.k0(K4);
                }
                yci a = androidx.compose.ui.platform.a.a(wyf.s(b2, (Function0) K4), "expanded_player");
                int i5 = i3 >> 6;
                int i6 = (i3 & 112) | (i5 & 896) | (i5 & 7168);
                kb5Var2 = kb5Var6;
                sdrVar = sdrVar3;
                kb5Var3 = kb5Var7;
                kb5Var = kb5Var9;
                i2 = -1300408678;
                vq1.h(a, kubVar, xanVar, function0, oq5Var, i6);
                oq5Var = oq5Var;
                z = false;
            } else {
                kb5Var = kb5Var9;
                kb5Var2 = kb5Var6;
                z = false;
                i2 = -1300408678;
                sdrVar = sdrVar3;
                kb5Var3 = kb5Var7;
                oq5Var.Z(-1300408678);
            }
            oq5Var.p(z);
            if (((Boolean) sdrVar.getValue()).booleanValue()) {
                oq5Var.Z(-1296697017);
                agr agrVar = es5.h;
                kke kkeVar = (kke) szf.P(ykeVar.a((jx7) oq5Var.j(agrVar)), null, null, oq5Var, 48, 2).getValue();
                oq5Var.Z(-1011634937);
                boolean h = oq5Var.h(ykeVar) | oq5Var.f(M);
                Object K5 = oq5Var.K();
                if (h || K5 == obj) {
                    K5 = new avi(15, ykeVar, M);
                    oq5Var.k0(K5);
                }
                yci a2 = androidx.compose.ui.graphics.a.a(yciVar, (Function1) K5);
                if (kkeVar == null) {
                    oq5Var.Z(-1011641488);
                    b = androidx.compose.foundation.a.a(yciVar, jf0.E(oq5Var));
                    oq5Var.p(false);
                    kb5Var4 = kb5Var8;
                    kb5Var5 = kb5Var2;
                } else {
                    oq5Var.Z(-1011638739);
                    kb5Var4 = kb5Var8;
                    kb5Var5 = kb5Var2;
                    b = androidx.compose.foundation.a.b(yciVar, ((dq0) oq5Var.j(eq0.a)).c.a, jzkVar);
                    oq5Var.p(false);
                }
                yci f2 = a2.f(b);
                if (kkeVar != null) {
                    int i7 = kkeVar.a;
                    Object K6 = oq5Var.K();
                    if (K6 == obj) {
                        K6 = ggl.a;
                        oq5Var.k0(K6);
                    }
                    Function1 function1 = (Function1) ((h9f) K6);
                    function1.getClass();
                    final long m = xv.m(((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)).screenWidthDp, ((cma) function1.invoke(oq5Var.j(agrVar))).a + kkeVar.b);
                    boolean h2 = oq5Var.h(ykeVar);
                    Object K7 = oq5Var.K();
                    if (h2 || K7 == obj) {
                        K7 = new d1j(29, ykeVar);
                        oq5Var.k0(K7);
                    }
                    final Function0 function03 = (Function0) K7;
                    final long F = nt0.F(Integer.valueOf(i7), oq5Var, 0);
                    final boolean g = ((ma5) oq5Var.j(pa5.a)).g();
                    boolean e = oq5Var.e(F) | oq5Var.e(m) | oq5Var.f(function03) | oq5Var.g(g);
                    Object K8 = oq5Var.K();
                    if (e || K8 == obj) {
                        K8 = new Function1() { // from class: ike
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                np3 np3Var = (np3) obj2;
                                np3Var.getClass();
                                long j = m;
                                float d2 = nmq.d(np3Var.B0(j));
                                float b3 = nmq.b(np3Var.B0(j));
                                float density = np3Var.getDensity() * ((cma) function03.invoke()).a;
                                nh0 a3 = ph0.a();
                                eak.a(a3, cb0.l(ywf.d(0L, np3Var.a.e()), x97.f(density, density), x97.f(density, density), x97.f(0.0f, 0.0f), x97.f(0.0f, 0.0f)));
                                float f3 = g ? 0.2f : 0.32f;
                                Float valueOf = Float.valueOf(0.0f);
                                long j2 = F;
                                float f4 = 2;
                                return np3Var.b(new jke(a3, (((np3Var.getDensity() * 80) * f4) + d2) / b3, y9w.N(new Pair[]{new Pair(valueOf, new d85(d85.b(j2, 1.0f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.55f), new d85(d85.b(j2, 0.58f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(1.0f), new d85(d85.b(j2, 0.0f, 0.0f, 0.0f, 0.0f, 14)))}, b3 / f4, 10), f3, 0));
                            }
                        };
                        oq5Var.k0(K8);
                    }
                    f2 = f2.f(androidx.compose.ui.draw.a.b(yciVar, (Function1) K8));
                }
                oq5Var.p(false);
                ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
                int i8 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, f2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a3, kb5Var5);
                g0g.U(oq5Var, l2, kb5Var3);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var, i8, kb5Var4);
                }
                g0g.U(oq5Var, H2, kb5Var);
                Object K9 = oq5Var.K();
                if (K9 == obj) {
                    K9 = vz1.h(oq5Var);
                }
                uoi uoiVar = (uoi) K9;
                z3 = false;
                z2 = true;
                oq5 oq5Var2 = oq5Var;
                vwb.f(tt4Var, ykeVar, androidx.compose.ui.platform.a.a(androidx.compose.foundation.a.d(yciVar, uoiVar, null, false, null, null, function02, 28), "collapsed_player"), oq5Var2, (i3 >> 6) & 126, 0);
                oq5Var = oq5Var2;
                oq5Var.Z(789253036);
                yci c = d.c(yciVar, 1.0f);
                if (((Boolean) sdrVar4.getValue()).booleanValue()) {
                    yciVar = androidx.compose.foundation.a.b(yciVar, ((dq0) oq5Var.j(eq0.a)).c.a, jzkVar);
                }
                yci f3 = c.f(yciVar);
                oq5Var.p(false);
                ug3.a(f3, oq5Var, 0);
                oq5Var.p(true);
            } else {
                z2 = true;
                z3 = false;
                oq5Var.Z(i2);
            }
            oq5Var.p(z3);
            oq5Var.p(z2);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vl1(vdrVar, kubVar, tt4Var, ykeVar, xanVar, function0, function02, i);
        }
    }

    public static final void d(int i, hq5 hq5Var, yci yciVar, boolean z) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(514119056);
        int i2 = (oq5Var.g(z) ? 4 : 2) | i | (oq5Var.f(yciVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            wn5 C = ild.C(-1675832799, new k4m(0, z), oq5Var);
            wn5 C2 = ild.C(1636141120, new k4m(1, z), oq5Var);
            wn5 C3 = ild.C(653147743, new k4m(2, z), oq5Var);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new hvl(5);
                oq5Var.k0(K);
            }
            yciVar2 = yciVar;
            wyf.m(C, C2, C3, (Function0) K, yciVar2, oq5Var, ((i2 << 9) & 57344) | 3510);
        } else {
            yciVar2 = yciVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q10(z, yciVar2, i, 12);
        }
    }

    public static final void e(final ngt ngtVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(888617593);
        int i2 = (oq5Var.f(ngtVar) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            final int i3 = 1;
            final int i4 = 2;
            final int i5 = 0;
            int i6 = i2 << 6;
            wyf.m(ild.C(367642186, new Function2() { // from class: j4m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i3;
                    ngt ngtVar2 = ngtVar;
                    switch (i7) {
                        case 0:
                            int i8 = ngtVar2.c;
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(1 & intValue, (intValue & 3) != 2)) {
                                String C = tt0.C(i8);
                                oq5Var2.Z(868859479);
                                String H = rvf.H(R.plurals.contest_playlist_min_tracks_quantity, i8, new Object[]{C}, oq5Var2);
                                oq5Var2.p(false);
                                xv7.j(H, null, ((dq0) oq5Var2.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var2, 0, 3120, 120826);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        case 1:
                            hq5 hq5Var3 = (hq5) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var3;
                            if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String str = ngtVar2.b;
                                qo6 qo6Var = qo6.e;
                                e9g e9gVar = e9g.a;
                                irf.y(str, qo6Var, d.m(vci.a, lsq.s(e9gVar)), false, false, null, null, lsq.r(e9gVar, qo6Var, oq5Var3, 54), oq5Var3, 48, 120);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                        default:
                            hq5 hq5Var4 = (hq5) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            oq5 oq5Var4 = (oq5) hq5Var4;
                            if (oq5Var4.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                                xv7.j(ngtVar2.a, null, ((dq0) oq5Var4.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var4, 0, 3120, 120826);
                            } else {
                                oq5Var4.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), ild.C(1129523497, new Function2() { // from class: j4m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i4;
                    ngt ngtVar2 = ngtVar;
                    switch (i7) {
                        case 0:
                            int i8 = ngtVar2.c;
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(1 & intValue, (intValue & 3) != 2)) {
                                String C = tt0.C(i8);
                                oq5Var2.Z(868859479);
                                String H = rvf.H(R.plurals.contest_playlist_min_tracks_quantity, i8, new Object[]{C}, oq5Var2);
                                oq5Var2.p(false);
                                xv7.j(H, null, ((dq0) oq5Var2.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var2, 0, 3120, 120826);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        case 1:
                            hq5 hq5Var3 = (hq5) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var3;
                            if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String str = ngtVar2.b;
                                qo6 qo6Var = qo6.e;
                                e9g e9gVar = e9g.a;
                                irf.y(str, qo6Var, d.m(vci.a, lsq.s(e9gVar)), false, false, null, null, lsq.r(e9gVar, qo6Var, oq5Var3, 54), oq5Var3, 48, 120);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                        default:
                            hq5 hq5Var4 = (hq5) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            oq5 oq5Var4 = (oq5) hq5Var4;
                            if (oq5Var4.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                                xv7.j(ngtVar2.a, null, ((dq0) oq5Var4.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var4, 0, 3120, 120826);
                            } else {
                                oq5Var4.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), ild.C(1891404808, new Function2() { // from class: j4m
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = i5;
                    ngt ngtVar2 = ngtVar;
                    switch (i7) {
                        case 0:
                            int i8 = ngtVar2.c;
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(1 & intValue, (intValue & 3) != 2)) {
                                String C = tt0.C(i8);
                                oq5Var2.Z(868859479);
                                String H = rvf.H(R.plurals.contest_playlist_min_tracks_quantity, i8, new Object[]{C}, oq5Var2);
                                oq5Var2.p(false);
                                xv7.j(H, null, ((dq0) oq5Var2.j(eq0.a)).b.b, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var2, 0, 3120, 120826);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        case 1:
                            hq5 hq5Var3 = (hq5) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var3;
                            if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                String str = ngtVar2.b;
                                qo6 qo6Var = qo6.e;
                                e9g e9gVar = e9g.a;
                                irf.y(str, qo6Var, d.m(vci.a, lsq.s(e9gVar)), false, false, null, null, lsq.r(e9gVar, qo6Var, oq5Var3, 54), oq5Var3, 48, 120);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                        default:
                            hq5 hq5Var4 = (hq5) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            oq5 oq5Var4 = (oq5) hq5Var4;
                            if (oq5Var4.P(intValue3 & 1, (intValue3 & 3) != 2)) {
                                xv7.j(ngtVar2.a, null, ((dq0) oq5Var4.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 1, 0, null, null, oq5Var4, 0, 3120, 120826);
                            } else {
                                oq5Var4.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), function0, yciVar, oq5Var, (i6 & 7168) | 438 | (i6 & 57344));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(ngtVar, function0, yciVar, i, 24);
        }
    }

    public static final void f(n4m n4mVar, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        int i2;
        n4mVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-859903061);
        int i3 = (oq5Var.f(n4mVar) ? 4 : 2) | i | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            aht ahtVar = (aht) szf.Q(n4mVar.c, oq5Var).getValue();
            yciVar2 = vci.a;
            yci d = d.d(yciVar2, 1.0f);
            kfh d2 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, d);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean z = ahtVar instanceof bgt;
            kjn kjnVar = gq5.a;
            if (z) {
                oq5Var.Z(222767264);
                boolean z2 = ((bgt) ahtVar).a;
                Object K = oq5Var.K();
                if (K == kjnVar) {
                    K = new osl(15);
                    oq5Var.k0(K);
                }
                d(0, oq5Var, nfp.a(yciVar2, (Function1) K), z2);
                oq5Var.p(false);
            } else {
                if (!(ahtVar instanceof ngt)) {
                    throw vz1.i(oq5Var, 222765972, false);
                }
                oq5Var.Z(222773495);
                ngt ngtVar = (ngt) ahtVar;
                int i5 = i3 & 14;
                boolean z3 = i5 == 4;
                Object K2 = oq5Var.K();
                if (z3 || K2 == kjnVar) {
                    i2 = i5;
                    ayl aylVar = new ayl(0, n4mVar, n4m.class, "onPlaylistClick", "onPlaylistClick()V", 0, 9);
                    oq5Var.k0(aylVar);
                    K2 = aylVar;
                } else {
                    i2 = i5;
                }
                Function0 function0 = (Function0) ((h9f) K2);
                boolean z4 = i2 == 4;
                Object K3 = oq5Var.K();
                if (z4 || K3 == kjnVar) {
                    K3 = new ykf(23, n4mVar);
                    oq5Var.k0(K3);
                }
                e(ngtVar, function0, com.yandex.music.core.ui.compose.a.b(yciVar2, null, 0L, 0.0f, null, (Function2) K3, 15), oq5Var, 0);
                oq5Var.p(false);
            }
            oq5Var.p(true);
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wcj(n4mVar, yciVar2, i, 17);
        }
    }

    public static final /* synthetic */ PreparingParams g(boolean z, boolean z2, int i, AbrPreferences abrPreferences, Function1 function1) {
        abrPreferences.getClass();
        jom jomVar = new jom(z, z2, i, abrPreferences);
        function1.invoke(jomVar);
        return jomVar.a();
    }

    public static final void h(androidx.compose.foundation.lazy.a aVar, ayn aynVar, Object obj, yci yciVar, boolean z, yci yciVar2, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        yci a;
        int i3;
        yci yciVar3;
        boolean z2;
        yci yciVar4;
        boolean z3;
        yci a2;
        yci yciVar5;
        yci yciVar6;
        boolean z4;
        yci a3;
        aVar.getClass();
        aynVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(346306449);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(aynVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(obj) ? 256 : 128;
        }
        int i4 = i2 | 27648;
        if ((196608 & i) == 0) {
            i4 = 93184 | i2;
        }
        if ((1572864 & i) == 0) {
            i4 |= oq5Var.h(wn5Var) ? 1048576 : 524288;
        }
        if ((599187 & i4) == 599186 && oq5Var.z()) {
            oq5Var.S();
            yciVar5 = yciVar;
            z2 = z;
            yciVar6 = yciVar2;
        } else {
            oq5Var.U();
            int i5 = i & 1;
            vci vciVar = vci.a;
            if (i5 == 0 || oq5Var.y()) {
                a = androidx.compose.foundation.lazy.a.a(aVar, vciVar);
                i3 = i4 & (-458753);
                yciVar3 = vciVar;
                z2 = true;
            } else {
                oq5Var.S();
                i3 = i4 & (-458753);
                yciVar3 = yciVar;
                z2 = z;
                a = yciVar2;
            }
            oq5Var.q();
            oq5Var.Z(-1662944388);
            int i6 = i3 & 112;
            boolean z5 = i6 == 32;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z5 || K == kjnVar) {
                K = new rxn(aynVar, 4);
                oq5Var.k0(K);
            }
            oq5Var.p(false);
            zx7 U = szf.U((Function0) K);
            zx7 U2 = szf.U(new j5n(3, obj, aynVar));
            if (((Boolean) U2.getValue()).booleanValue()) {
                oq5Var.Z(-11550209);
                yci g0 = f8g.g0(vciVar, 1.0f);
                int ordinal = ((bxj) U.getValue()).ordinal();
                if (ordinal == 0) {
                    oq5Var.Z(-1662936154);
                    oq5Var.Z(-1662935720);
                    boolean z6 = i6 == 32;
                    Object K2 = oq5Var.K();
                    if (z6 || K2 == kjnVar) {
                        K2 = new xxn(aynVar, 0);
                        oq5Var.k0(K2);
                    }
                    z4 = false;
                    oq5Var.p(false);
                    a3 = androidx.compose.ui.graphics.a.a(vciVar, (Function1) K2);
                    oq5Var.p(false);
                } else {
                    if (ordinal != 1) {
                        throw vz1.i(oq5Var, -1663429177, false);
                    }
                    oq5Var.Z(-1662931418);
                    oq5Var.Z(-1662930984);
                    boolean z7 = i6 == 32;
                    Object K3 = oq5Var.K();
                    if (z7 || K3 == kjnVar) {
                        K3 = new xxn(aynVar, 1);
                        oq5Var.k0(K3);
                    }
                    z4 = false;
                    oq5Var.p(false);
                    a3 = androidx.compose.ui.graphics.a.a(vciVar, (Function1) K3);
                    oq5Var.p(false);
                }
                yciVar4 = g0.f(a3);
                oq5Var.p(z4);
            } else if (obj.equals(aynVar.s.getValue())) {
                oq5Var.Z(-11093021);
                yci g02 = f8g.g0(vciVar, 1.0f);
                int ordinal2 = ((bxj) U.getValue()).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        throw vz1.i(oq5Var, -1663429177, false);
                    }
                    oq5Var.Z(-1662916236);
                    oq5Var.Z(-1662915802);
                    boolean z8 = i6 == 32;
                    Object K4 = oq5Var.K();
                    if (z8 || K4 == kjnVar) {
                        K4 = new xxn(aynVar, 3);
                        oq5Var.k0(K4);
                    }
                    z3 = false;
                    oq5Var.p(false);
                    a2 = androidx.compose.ui.graphics.a.a(vciVar, (Function1) K4);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-1662921420);
                    oq5Var.Z(-1662920986);
                    boolean z9 = i6 == 32;
                    Object K5 = oq5Var.K();
                    if (z9 || K5 == kjnVar) {
                        K5 = new xxn(aynVar, 2);
                        oq5Var.k0(K5);
                    }
                    z3 = false;
                    oq5Var.p(false);
                    a2 = androidx.compose.ui.graphics.a.a(vciVar, (Function1) K5);
                    oq5Var.p(false);
                }
                yciVar4 = g02.f(a2);
                oq5Var.p(z3);
            } else {
                oq5Var.Z(-10663144);
                oq5Var.p(false);
                yciVar4 = a;
            }
            q7g.h(aynVar, obj, yciVar3.f(yciVar4), z2, ((Boolean) U2.getValue()).booleanValue(), wn5Var, oq5Var, 466046 & (i3 >> 3));
            yciVar5 = yciVar3;
            yciVar6 = a;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new jl6(aVar, aynVar, obj, yciVar5, z2, yciVar6, wn5Var, i);
        }
    }

    public static final void i(String str, String str2, boolean z, Function1 function1, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        str.getClass();
        str2.getClass();
        function1.getClass();
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-358877869);
        int i2 = i | (oq5Var2.f(str) ? 4 : 2) | (oq5Var2.f(str2) ? 32 : 16) | (oq5Var2.g(z) ? 256 : 128) | (oq5Var2.h(function1) ? 2048 : 1024) | (oq5Var2.h(function0) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((74899 & i2) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            yci d = d.d(yciVar, 1.0f);
            agr agrVar = eq0.a;
            yci a = androidx.compose.ui.platform.a.a(a.m(androidx.compose.foundation.a.b(d, ((dq0) oq5Var2.j(agrVar)).d.c, o5g.G(oq5Var2)), 16), "share_invite_to_family_switcher_block");
            kx0 kx0Var = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var2, 0);
            int i3 = oq5Var2.P;
            androidx.compose.runtime.internal.a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, a);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var2, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var2, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var4);
            int i4 = i2 & 896;
            boolean z2 = i4 == 256;
            Object K = oq5Var2.K();
            boolean z3 = z2;
            kjn kjnVar = gq5.a;
            if (z3 || K == kjnVar) {
                K = new i32(8, z);
                oq5Var2.k0(K);
            }
            vci vciVar = vci.a;
            yci b = nfp.b(vciVar, true, (Function1) K);
            Object K2 = oq5Var2.K();
            if (K2 == kjnVar) {
                K2 = vz1.h(oq5Var2);
            }
            uoi uoiVar = (uoi) K2;
            boolean z4 = (i4 == 256) | ((i2 & 7168) == 2048);
            Object K3 = oq5Var2.K();
            if (z4 || K3 == kjnVar) {
                K3 = new j32(function1, z, 2);
                oq5Var2.k0(K3);
            }
            yci d2 = androidx.compose.foundation.a.d(b, uoiVar, null, false, null, null, (Function0) K3, 28);
            ta5 a3 = sa5.a(kx0Var, gz2Var, oq5Var2, 0);
            int i5 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, d2);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a3, kb5Var);
            g0g.U(oq5Var2, l2, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var3);
            }
            g0g.U(oq5Var2, H2, kb5Var4);
            float f = 12;
            yci q = a.q(d.d(vciVar, 1.0f), 0.0f, 0.0f, 0.0f, f, 7);
            nho a4 = lho.a(qx0.a, b2c.k, oq5Var2, 0);
            int i6 = oq5Var2.P;
            androidx.compose.runtime.internal.a l3 = oq5Var2.l();
            yci H3 = vnj.H(oq5Var2, q);
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a4, kb5Var);
            g0g.U(oq5Var2, l3, kb5Var2);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var2, i6, kb5Var3);
            }
            g0g.U(oq5Var2, H3, kb5Var4);
            ges j = nu0.j();
            long j2 = ((dq0) oq5Var2.j(agrVar)).b.a;
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            xcs.b(str, androidx.compose.ui.platform.a.a(new LayoutWeightElement(true, 1.0f), "share_invite_to_family_title"), j2, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j, oq5Var2, i2 & 14, 0, 65528);
            int i7 = 4;
            ds7 n = n(((dq0) oq5Var2.j(agrVar)).e.a, ((dq0) oq5Var2.j(agrVar)).e.b, oq5Var2, 967);
            Object K4 = oq5Var2.K();
            if (K4 == kjnVar) {
                K4 = new pvp(i7);
                oq5Var2.k0(K4);
            }
            uvr.a(z, function1, androidx.compose.ui.platform.a.a(nfp.b(vciVar, false, (Function1) K4), "share_invite_to_family_switcher"), false, n, oq5Var2, (i2 >> 6) & 126, 24);
            oq5Var = oq5Var2;
            oq5Var.p(true);
            xcs.b(str2, androidx.compose.ui.platform.a.a(a.q(d.d(vciVar, 1.0f), 0.0f, 0.0f, 0.0f, f, 7), "share_invite_to_family_subtitle"), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.i(), oq5Var, ((i2 >> 3) & 14) | 48, 0, 65528);
            oq5Var.p(true);
            nt0.k(((i2 >> 9) & 112) | 384, oq5Var, androidx.compose.ui.platform.a.a(vciVar, "share_invite_to_family_learn_more"), null, rvf.M(R.string.share_invite_more_details, oq5Var), function0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k5b(str, str2, z, function1, function0, yciVar, i);
        }
    }

    public static final void j(ukd ukdVar, ukd ukdVar2, Function1 function1, hq5 hq5Var, int i) {
        ukd ukdVar3;
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-63057753);
        int i2 = (oq5Var.f(ukdVar) ? 32 : 16) | i | (oq5Var.f(ukdVar2) ? 256 : 128) | (oq5Var.h(function1) ? 2048 : 1024);
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            ArrayList arrayList = new ArrayList();
            function1.invoke(new j9r(arrayList));
            ukdVar3 = ukdVar;
            ot0.h(ukdVar3, 1, 1, ild.C(-1870683279, new f6p(9, ukdVar2, arrayList), oq5Var), oq5Var, ((i2 >> 3) & 14) | 3072, 0);
        } else {
            ukdVar3 = ukdVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(ukdVar3, ukdVar2, function1, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0135, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r6.K(), java.lang.Integer.valueOf(r0)) == false) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void k(Function2 function2, wn5 wn5Var, wn5 wn5Var2, wn5 wn5Var3, yci yciVar, boolean z, Function2 function22, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        int i5;
        Function2 function23;
        int i6;
        boolean booleanValue;
        int i7;
        boolean z2;
        iz2 iz2Var;
        int i8;
        Function2 function24;
        boolean z3;
        Function2 function25;
        boolean z4;
        oq5 oq5Var;
        yci yciVar3;
        boolean z5;
        xmn r;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1658153384);
        if ((i & 6) == 0) {
            i3 = (oq5Var2.h(function2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var2.h(wn5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var2.h(wn5Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= oq5Var2.h(wn5Var3) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
            if ((196608 & i) == 0) {
                i3 |= SQLiteDatabase.OPEN_FULLMUTEX;
            }
            i4 = 1572864 | i3;
            i5 = i2 & 128;
            if (i5 == 0) {
                i4 = 14155776 | i3;
            } else if ((12582912 & i) == 0) {
                function23 = function22;
                i4 |= oq5Var2.h(function23) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                if ((i4 & 4793491) == 4793490 || !oq5Var2.z()) {
                    oq5Var2.U();
                    i6 = i & 1;
                    vci vciVar = vci.a;
                    if (i6 != 0 || oq5Var2.y()) {
                        if (i9 != 0) {
                            yciVar2 = vciVar;
                        }
                        booleanValue = ((Boolean) oq5Var2.j(tpg.a)).booleanValue();
                        i7 = i4 & (-458753);
                        if (i5 != 0) {
                            function23 = null;
                        }
                    } else {
                        oq5Var2.S();
                        i7 = i4 & (-458753);
                        booleanValue = z;
                    }
                    oq5Var2.q();
                    iz2 iz2Var2 = b2c.b;
                    kfh d = ug3.d(iz2Var2, false);
                    int i10 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l = oq5Var2.l();
                    yci H = vnj.H(oq5Var2, yciVar2);
                    xp5.T.getClass();
                    z2 = booleanValue;
                    grb grbVar = wp5.b;
                    oq5Var2.d0();
                    int i11 = i7;
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(oq5Var2, d, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(oq5Var2, l, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    yci yciVar4 = yciVar2;
                    if (oq5Var2.O) {
                        iz2Var = iz2Var2;
                    } else {
                        iz2Var = iz2Var2;
                    }
                    ouj.x(i10, oq5Var2, i10, kb5Var3);
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(oq5Var2, H, kb5Var4);
                    ta5 a = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
                    i8 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var2.l();
                    function24 = function23;
                    yci H2 = vnj.H(oq5Var2, vciVar);
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(oq5Var2, a, kb5Var);
                    g0g.U(oq5Var2, l2, kb5Var2);
                    if (!oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i8))) {
                        ouj.x(i8, oq5Var2, i8, kb5Var3);
                    }
                    g0g.U(oq5Var2, H2, kb5Var4);
                    if (function2 == null) {
                        oq5Var2.Z(1677779251);
                        z3 = false;
                    } else {
                        z3 = false;
                        oq5Var2.Z(1677779252);
                        u1g.l(oq5Var2, d.e(vciVar, 12));
                        function2.invoke(oq5Var2, 0);
                    }
                    oq5Var2.p(z3);
                    wn5Var.invoke(oq5Var2, Integer.valueOf((i11 >> 3) & 14));
                    u1g.l(oq5Var2, d.e(vciVar, 16));
                    wn5Var2.invoke(oq5Var2, Integer.valueOf((i11 >> 6) & 14));
                    u1g.l(oq5Var2, d.e(vciVar, 40));
                    wn5Var3.invoke(oq5Var2, Integer.valueOf((i11 >> 9) & 14));
                    oq5Var2.Z(1678105619);
                    oq5Var2.p(false);
                    if (function24 == null) {
                        oq5Var2.Z(1678227635);
                        oq5Var2.p(false);
                        function25 = function24;
                    } else {
                        oq5Var2.Z(1678227636);
                        u1g.l(oq5Var2, d.e(vciVar, 24));
                        function25 = function24;
                        function25.invoke(oq5Var2, 0);
                        oq5Var2.p(false);
                    }
                    eta.p(vciVar, 20, oq5Var2, true);
                    if (z2) {
                        oq5Var2.Z(-744273731);
                        z4 = false;
                        q7g.c(a.n(b.a.a(vciVar, iz2Var), 12, 4), oq5Var2, 0);
                    } else {
                        z4 = false;
                        oq5Var2.Z(-746044544);
                    }
                    oq5Var2.p(z4);
                    oq5Var2.p(true);
                    oq5Var = oq5Var2;
                    function23 = function25;
                    yciVar3 = yciVar4;
                    z5 = z2;
                } else {
                    oq5Var2.S();
                    oq5Var = oq5Var2;
                    yciVar3 = yciVar2;
                    z5 = z;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new i93(function2, wn5Var, wn5Var2, wn5Var3, yciVar3, z5, function23, i, i2, 3);
                    return;
                }
                return;
            }
            function23 = function22;
            if ((i4 & 4793491) == 4793490) {
            }
            oq5Var2.U();
            i6 = i & 1;
            vci vciVar2 = vci.a;
            if (i6 != 0) {
            }
            if (i9 != 0) {
            }
            booleanValue = ((Boolean) oq5Var2.j(tpg.a)).booleanValue();
            i7 = i4 & (-458753);
            if (i5 != 0) {
            }
            oq5Var2.q();
            iz2 iz2Var22 = b2c.b;
            kfh d2 = ug3.d(iz2Var22, false);
            int i102 = oq5Var2.P;
            androidx.compose.runtime.internal.a l3 = oq5Var2.l();
            yci H3 = vnj.H(oq5Var2, yciVar2);
            xp5.T.getClass();
            z2 = booleanValue;
            grb grbVar2 = wp5.b;
            oq5Var2.d0();
            int i112 = i7;
            if (oq5Var2.O) {
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var2, d2, kb5Var5);
            kb5 kb5Var22 = wp5.e;
            g0g.U(oq5Var2, l3, kb5Var22);
            kb5 kb5Var32 = wp5.g;
            yci yciVar42 = yciVar2;
            if (oq5Var2.O) {
            }
            ouj.x(i102, oq5Var2, i102, kb5Var32);
            kb5 kb5Var42 = wp5.d;
            g0g.U(oq5Var2, H3, kb5Var42);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
            i8 = oq5Var2.P;
            androidx.compose.runtime.internal.a l22 = oq5Var2.l();
            function24 = function23;
            yci H22 = vnj.H(oq5Var2, vciVar2);
            oq5Var2.d0();
            if (oq5Var2.O) {
            }
            g0g.U(oq5Var2, a2, kb5Var5);
            g0g.U(oq5Var2, l22, kb5Var22);
            if (!oq5Var2.O) {
            }
            ouj.x(i8, oq5Var2, i8, kb5Var32);
            g0g.U(oq5Var2, H22, kb5Var42);
            if (function2 == null) {
            }
            oq5Var2.p(z3);
            wn5Var.invoke(oq5Var2, Integer.valueOf((i112 >> 3) & 14));
            u1g.l(oq5Var2, d.e(vciVar2, 16));
            wn5Var2.invoke(oq5Var2, Integer.valueOf((i112 >> 6) & 14));
            u1g.l(oq5Var2, d.e(vciVar2, 40));
            wn5Var3.invoke(oq5Var2, Integer.valueOf((i112 >> 9) & 14));
            oq5Var2.Z(1678105619);
            oq5Var2.p(false);
            if (function24 == null) {
            }
            eta.p(vciVar2, 20, oq5Var2, true);
            if (z2) {
            }
            oq5Var2.p(z4);
            oq5Var2.p(true);
            oq5Var = oq5Var2;
            function23 = function25;
            yciVar3 = yciVar42;
            z5 = z2;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        if ((196608 & i) == 0) {
        }
        i4 = 1572864 | i3;
        i5 = i2 & 128;
        if (i5 == 0) {
        }
        function23 = function22;
        if ((i4 & 4793491) == 4793490) {
        }
        oq5Var2.U();
        i6 = i & 1;
        vci vciVar22 = vci.a;
        if (i6 != 0) {
        }
        if (i9 != 0) {
        }
        booleanValue = ((Boolean) oq5Var2.j(tpg.a)).booleanValue();
        i7 = i4 & (-458753);
        if (i5 != 0) {
        }
        oq5Var2.q();
        iz2 iz2Var222 = b2c.b;
        kfh d22 = ug3.d(iz2Var222, false);
        int i1022 = oq5Var2.P;
        androidx.compose.runtime.internal.a l32 = oq5Var2.l();
        yci H32 = vnj.H(oq5Var2, yciVar2);
        xp5.T.getClass();
        z2 = booleanValue;
        grb grbVar22 = wp5.b;
        oq5Var2.d0();
        int i1122 = i7;
        if (oq5Var2.O) {
        }
        kb5 kb5Var52 = wp5.f;
        g0g.U(oq5Var2, d22, kb5Var52);
        kb5 kb5Var222 = wp5.e;
        g0g.U(oq5Var2, l32, kb5Var222);
        kb5 kb5Var322 = wp5.g;
        yci yciVar422 = yciVar2;
        if (oq5Var2.O) {
        }
        ouj.x(i1022, oq5Var2, i1022, kb5Var322);
        kb5 kb5Var422 = wp5.d;
        g0g.U(oq5Var2, H32, kb5Var422);
        ta5 a22 = sa5.a(qx0.c, b2c.o, oq5Var2, 48);
        i8 = oq5Var2.P;
        androidx.compose.runtime.internal.a l222 = oq5Var2.l();
        function24 = function23;
        yci H222 = vnj.H(oq5Var2, vciVar22);
        oq5Var2.d0();
        if (oq5Var2.O) {
        }
        g0g.U(oq5Var2, a22, kb5Var52);
        g0g.U(oq5Var2, l222, kb5Var222);
        if (!oq5Var2.O) {
        }
        ouj.x(i8, oq5Var2, i8, kb5Var322);
        g0g.U(oq5Var2, H222, kb5Var422);
        if (function2 == null) {
        }
        oq5Var2.p(z3);
        wn5Var.invoke(oq5Var2, Integer.valueOf((i1122 >> 3) & 14));
        u1g.l(oq5Var2, d.e(vciVar22, 16));
        wn5Var2.invoke(oq5Var2, Integer.valueOf((i1122 >> 6) & 14));
        u1g.l(oq5Var2, d.e(vciVar22, 40));
        wn5Var3.invoke(oq5Var2, Integer.valueOf((i1122 >> 9) & 14));
        oq5Var2.Z(1678105619);
        oq5Var2.p(false);
        if (function24 == null) {
        }
        eta.p(vciVar22, 20, oq5Var2, true);
        if (z2) {
        }
        oq5Var2.p(z4);
        oq5Var2.p(true);
        oq5Var = oq5Var2;
        function23 = function25;
        yciVar3 = yciVar422;
        z5 = z2;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final hoi l(Object obj, String str, String str2, boolean z) {
        Object obj2;
        itr.b.getClass();
        Iterator it = itr.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((itr) obj2).a.equals(str2)) {
                break;
            }
        }
        itr itrVar = (itr) obj2;
        if (itrVar != null) {
            return new hoi(str, obj, z, itrVar);
        }
        xq0.x("Unknown sort type: ".concat(str2));
        return null;
    }

    public static void m(long j, hi3 hi3Var, int i, ArrayList arrayList, int i2, int i3, ArrayList arrayList2) {
        int i4;
        int i5;
        ArrayList arrayList3;
        long j2;
        int i6;
        int i7 = i;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i2 >= i3) {
            xq0.x("Failed requirement.");
            return;
        }
        for (int i8 = i2; i8 < i3; i8++) {
            if (((pn3) arrayList4.get(i8)).d() < i7) {
                xq0.x("Failed requirement.");
                return;
            }
        }
        pn3 pn3Var = (pn3) arrayList.get(i2);
        pn3 pn3Var2 = (pn3) arrayList4.get(i3 - 1);
        if (i7 == pn3Var.d()) {
            int intValue = ((Number) arrayList5.get(i2)).intValue();
            int i9 = i2 + 1;
            pn3 pn3Var3 = (pn3) arrayList4.get(i9);
            i4 = i9;
            i5 = intValue;
            pn3Var = pn3Var3;
        } else {
            i4 = i2;
            i5 = -1;
        }
        if (pn3Var.k(i7) == pn3Var2.k(i7)) {
            int min = Math.min(pn3Var.d(), pn3Var2.d());
            int i10 = 0;
            for (int i11 = i7; i11 < min && pn3Var.k(i11) == pn3Var2.k(i11); i11++) {
                i10++;
            }
            long j3 = 4;
            long j4 = (hi3Var.b / j3) + j + 2 + i10 + 1;
            hi3Var.P0(-i10);
            hi3Var.P0(i5);
            int i12 = i7 + i10;
            while (i7 < i12) {
                hi3Var.P0(pn3Var.k(i7) & KotlinVersion.MAX_COMPONENT_VALUE);
                i7++;
            }
            if (i4 + 1 == i3) {
                if (i12 == ((pn3) arrayList4.get(i4)).d()) {
                    hi3Var.P0(((Number) arrayList5.get(i4)).intValue());
                    return;
                } else {
                    xq0.q("Check failed.");
                    return;
                }
            }
            hi3 hi3Var2 = new hi3();
            hi3Var.P0(((int) ((hi3Var2.b / j3) + j4)) * (-1));
            m(j4, hi3Var2, i12, arrayList4, i4, i3, arrayList5);
            hi3Var.o0(hi3Var2);
            return;
        }
        int i13 = 1;
        for (int i14 = i4 + 1; i14 < i3; i14++) {
            if (((pn3) arrayList4.get(i14 - 1)).k(i7) != ((pn3) arrayList4.get(i14)).k(i7)) {
                i13++;
            }
        }
        long j5 = 4;
        long j6 = (hi3Var.b / j5) + j + 2 + (i13 * 2);
        hi3Var.P0(i13);
        hi3Var.P0(i5);
        for (int i15 = i4; i15 < i3; i15++) {
            int k = ((pn3) arrayList4.get(i15)).k(i7);
            if (i15 == i4 || k != ((pn3) arrayList4.get(i15 - 1)).k(i7)) {
                hi3Var.P0(k & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        hi3 hi3Var3 = new hi3();
        int i16 = i4;
        while (i16 < i3) {
            byte k2 = ((pn3) arrayList4.get(i16)).k(i7);
            int i17 = i16 + 1;
            int i18 = i17;
            while (true) {
                if (i18 >= i3) {
                    i18 = i3;
                    break;
                } else if (k2 != ((pn3) arrayList4.get(i18)).k(i7)) {
                    break;
                } else {
                    i18++;
                }
            }
            if (i17 == i18 && i7 + 1 == ((pn3) arrayList4.get(i16)).d()) {
                hi3Var.P0(((Number) arrayList5.get(i16)).intValue());
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
            } else {
                hi3Var.P0(((int) ((hi3Var3.b / j5) + j6)) * (-1));
                arrayList3 = arrayList5;
                j2 = j6;
                i6 = i18;
                m(j2, hi3Var3, i7 + 1, arrayList, i16, i6, arrayList3);
                arrayList4 = arrayList;
            }
            j6 = j2;
            i16 = i6;
            arrayList5 = arrayList3;
        }
        hi3Var.o0(hi3Var3);
    }

    public static ds7 n(long j, long j2, hq5 hq5Var, int i) {
        agr agrVar = pa5.a;
        long e = ((ma5) ((oq5) hq5Var).j(agrVar)).e();
        long f = (i & 8) != 0 ? ((ma5) ((oq5) hq5Var).j(agrVar)).f() : j;
        long c = (i & 16) != 0 ? ((ma5) ((oq5) hq5Var).j(agrVar)).c() : j2;
        float f2 = (i & 32) != 0 ? 0.38f : 1.0f;
        qs5 qs5Var = sb6.a;
        oq5 oq5Var = (oq5) hq5Var;
        long j3 = ((d85) oq5Var.j(qs5Var)).a;
        if (((ma5) oq5Var.j(agrVar)).g()) {
            c3x.N(j3);
        } else {
            c3x.N(j3);
        }
        long D = c3x.D(d85.b(e, 0.38f, 0.0f, 0.0f, 0.0f, 14), ((ma5) oq5Var.j(agrVar)).f());
        oq5 oq5Var2 = (oq5) hq5Var;
        long j4 = ((d85) oq5Var2.j(qs5Var)).a;
        if (((ma5) oq5Var2.j(agrVar)).g()) {
            c3x.N(j4);
        } else {
            c3x.N(j4);
        }
        long D2 = c3x.D(d85.b(e, 0.38f, 0.0f, 0.0f, 0.0f, 14), ((ma5) oq5Var2.j(agrVar)).f());
        oq5 oq5Var3 = (oq5) hq5Var;
        long j5 = ((d85) oq5Var3.j(qs5Var)).a;
        if (((ma5) oq5Var3.j(agrVar)).g()) {
            c3x.N(j5);
        } else {
            c3x.N(j5);
        }
        long j6 = f;
        long D3 = c3x.D(d85.b(j6, 0.38f, 0.0f, 0.0f, 0.0f, 14), ((ma5) oq5Var3.j(agrVar)).f());
        oq5 oq5Var4 = (oq5) hq5Var;
        long j7 = ((d85) oq5Var4.j(qs5Var)).a;
        if (((ma5) oq5Var4.j(agrVar)).g()) {
            c3x.N(j7);
        } else {
            c3x.N(j7);
        }
        long j8 = c;
        float f3 = f2;
        return new ds7(e, d85.b(e, 0.54f, 0.0f, 0.0f, 0.0f, 14), j6, d85.b(j8, f3, 0.0f, 0.0f, 0.0f, 14), D, d85.b(D2, 0.54f, 0.0f, 0.0f, 0.0f, 14), D3, d85.b(c3x.D(d85.b(j8, 0.38f, 0.0f, 0.0f, 0.0f, 14), ((ma5) oq5Var4.j(agrVar)).f()), f3, 0.0f, 0.0f, 0.0f, 14));
    }

    public static final int o(cko ckoVar, String str) {
        ckoVar.getClass();
        int columnCount = ckoVar.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(ckoVar.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        String k = ouj.k('`', "`", str);
        int columnCount2 = ckoVar.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (k.equals(ckoVar.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = ckoVar.getColumnCount();
            String concat = ".".concat(str);
            String k2 = ouj.k('`', ".", str);
            for (int i3 = 0; i3 < columnCount3; i3++) {
                String columnName = ckoVar.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (c.n(columnName, concat, false) || (columnName.charAt(0) == '`' && c.n(columnName, k2, false)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static z9u p(int i, x1u x1uVar) {
        x1uVar.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(skr.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        skr skrVar = (skr) qdcVar.C(I);
        Long valueOf = Long.valueOf(x1uVar.f / 60000);
        long j = x1uVar.f;
        String format = String.format("%d:%02d", Arrays.copyOf(new Object[]{valueOf, Long.valueOf((j / 1000) % 60)}, 2));
        msa msaVar = nsa.b;
        String d = skrVar.d(R.string.player_duration_description, saf.r0(yd5.N(j, ssa.MILLISECONDS)));
        String str = x1uVar.a;
        String pathForSize = x1uVar.o.a.getPathForSize(720);
        pathForSize.getClass();
        return new z9u(i, str, null, pathForSize, x1uVar.b, v5g.B(x1uVar).toString(), format, x1uVar.n, x1uVar.i, d);
    }

    public static final String r(szu szuVar) {
        szuVar.getClass();
        izs izsVar = szuVar.l.g;
        if (!(izsVar instanceof e6v)) {
            if (Intrinsics.d(izsVar, hzs.a)) {
                ssg.a(7, null, "This should not happen. Track source should be always filled in wave queue", null);
                return "";
            }
            b6e.s();
            return null;
        }
        e6v e6vVar = (e6v) izsVar;
        if (e6vVar instanceof d6v) {
            z4q z4qVar = ((d6v) e6vVar).a;
            if (z4qVar instanceof u4q) {
                return ((u4q) z4qVar).c.a;
            }
            if (z4qVar instanceof s4q) {
                return ((s4q) z4qVar).c.a;
            }
            if (z4qVar instanceof w4q) {
                return ((w4q) z4qVar).c.a;
            }
            b6e.s();
            return null;
        }
        if (!(e6vVar instanceof b6v)) {
            b6e.s();
            return null;
        }
        r3q r3qVar = ((b6v) e6vVar).a;
        r3qVar.getClass();
        if (r3qVar instanceof j3q) {
            return ((j3q) r3qVar).b.a;
        }
        if (r3qVar instanceof l3q) {
            return ((l3q) r3qVar).b.a;
        }
        if (r3qVar instanceof p3q) {
            return ((p3q) r3qVar).c.a;
        }
        if (r3qVar instanceof m3q) {
            return "";
        }
        b6e.s();
        return null;
    }

    public static final pqw t(sqw sqwVar) {
        sqwVar.getClass();
        if (sqwVar instanceof pqw) {
            return (pqw) sqwVar;
        }
        if (sqwVar instanceof rqw) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static final int u(cko ckoVar, String str) {
        ckoVar.getClass();
        return o(ckoVar, str);
    }

    public static final int v(cko ckoVar, String str) {
        ckoVar.getClass();
        int o = o(ckoVar, str);
        if (o >= 0) {
            return o;
        }
        int columnCount = ckoVar.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(ckoVar.getColumnName(i));
        }
        xq0.r("Column '", str, "' does not exist. Available columns: [", CollectionsKt.X(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static final boolean w(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2.size() > arrayList.size()) {
            int i = 0;
            while (i < arrayList.size() && Intrinsics.d(arrayList.get(i), arrayList2.get(i))) {
                i++;
            }
            if (i != arrayList.size()) {
                int size = arrayList.size() - 1;
                for (int size2 = arrayList2.size() - 1; size >= i && Intrinsics.d(arrayList.get(size), arrayList2.get(size2)); size2--) {
                    size--;
                }
                if (size < i) {
                }
            }
            return true;
        }
        return false;
    }

    public static final boolean x(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        int i3;
        int i4 = i;
        while (true) {
            i3 = i4 + 1;
            if (i3 >= i2 || !Intrinsics.d(arrayList.get(i3), arrayList2.get(i4))) {
                break;
            }
            i4 = i3;
        }
        return Intrinsics.d(arrayList.get(i), arrayList2.get(i4)) && Intrinsics.d(arrayList.subList(i3, i2), arrayList2.subList(i3, i2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static qwj y(pn3... pn3VarArr) {
        if (pn3VarArr.length == 0) {
            return new qwj(new pn3[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(new rx0(pn3VarArr, false));
        y75.r(arrayList);
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList2.add(-1);
        }
        int length = pn3VarArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            arrayList2.set(u75.e(arrayList, pn3VarArr[i2]), Integer.valueOf(i3));
            i2++;
            i3++;
        }
        if (((pn3) arrayList.get(0)).d() <= 0) {
            xq0.x("the empty byte string is not a supported option");
            return null;
        }
        int i4 = 0;
        while (i4 < arrayList.size()) {
            pn3 pn3Var = (pn3) arrayList.get(i4);
            int i5 = i4 + 1;
            int i6 = i5;
            while (i6 < arrayList.size()) {
                pn3 pn3Var2 = (pn3) arrayList.get(i6);
                pn3Var2.getClass();
                pn3Var.getClass();
                if (pn3Var2.p(0, pn3Var, pn3Var.d())) {
                    if (pn3Var2.d() == pn3Var.d()) {
                        l1j.p(pn3Var2, "duplicate option: ");
                        return null;
                    }
                    if (((Number) arrayList2.get(i6)).intValue() > ((Number) arrayList2.get(i4)).intValue()) {
                        arrayList.remove(i6);
                        arrayList2.remove(i6);
                    } else {
                        i6++;
                    }
                }
            }
            i4 = i5;
        }
        hi3 hi3Var = new hi3();
        m(0L, hi3Var, 0, arrayList, 0, arrayList.size(), arrayList2);
        int i7 = (int) (hi3Var.b / 4);
        int[] iArr = new int[i7];
        for (int i8 = 0; i8 < i7; i8++) {
            iArr[i8] = hi3Var.readInt();
        }
        return new qwj((pn3[]) Arrays.copyOf(pn3VarArr, pn3VarArr.length), iArr);
    }

    public static final Object z(x3f x3fVar, String str, q5f q5fVar, t9f t9fVar) {
        x3fVar.getClass();
        str.getClass();
        return new f7f(x3fVar, q5fVar, str, t9fVar.getDescriptor()).e(t9fVar);
    }

    public abstract String q(byte[] bArr, int i, int i2);

    public abstract int s(String str, byte[] bArr, int i, int i2);
}
