package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.animation.AlphaAnimation;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.a;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.shared.dto.artist.PreSaveContentRestrictionsDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import ru.yandex.music.R;
import ru.yandex.music.cover.upload.UploadCoverService;
import ru.yandex.video.m3.player.ui.debug.model.SessionColor;

/* loaded from: classes.dex */
public final class cb0 {
    public static Boolean a;

    public static int A(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static final boolean B(jgo jgoVar) {
        long j = jgoVar.e;
        return (j >>> 32) == (4294967295L & j) && j == jgoVar.f && j == jgoVar.g && j == jgoVar.h;
    }

    public static AlphaAnimation C(View view) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new sxc(1, new WeakReference(view)));
        view.startAnimation(alphaAnimation);
        return alphaAnimation;
    }

    public static long D(long... jArr) {
        o2g.L(jArr.length > 0);
        long j = jArr[0];
        for (int i = 1; i < jArr.length; i++) {
            long j2 = jArr[i];
            if (j2 > j) {
                j = j2;
            }
        }
        return j;
    }

    public static mdr E(int i, s2c s2cVar, d7k d7kVar) {
        mdr d = mdr.d(s2cVar, d7kVar);
        while (true) {
            int i2 = d.a;
            if (i2 == i) {
                return d;
            }
            dfi.o(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = d.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw r7k.c("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            s2cVar.y((int) j2);
            d = mdr.d(s2cVar, d7kVar);
        }
    }

    public static void F(Context context, String str, String str2, Uri uri, File file) {
        context.startService(new Intent(context, (Class<?>) UploadCoverService.class).putExtra("extra.upload.job", new pot(str, str2, uri, file, 0L)));
    }

    public static final zjm G(PreSaveContentRestrictionsDto preSaveContentRestrictionsDto) {
        List disclaimers = preSaveContentRestrictionsDto.getDisclaimers();
        List O = disclaimers != null ? CollectionsKt.O(disclaimers) : c5b.a;
        Boolean available = preSaveContentRestrictionsDto.getAvailable();
        return new zjm(O, available != null ? available.booleanValue() : true);
    }

    public static final pxm H(aab aabVar) {
        aabVar.getClass();
        if (aabVar instanceof lt) {
            lt ltVar = (lt) aabVar;
            int i = n0p.a[ltVar.b.ordinal()];
            String str = ltVar.a;
            return i == 1 ? new z0p(str) : new u0p(str);
        }
        if (aabVar instanceof u51) {
            return new v0p(((u51) aabVar).a);
        }
        if (aabVar instanceof eul) {
            return new y0p(((eul) aabVar).f);
        }
        b6e.s();
        return null;
    }

    public static n1g I(j1g j1gVar) {
        return new n1g(j1gVar, true, true);
    }

    public static boolean J(byte b) {
        return b > -65;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final boolean z, final int i, final Function0 function0, final Function0 function02, boolean z2, boolean z3, boolean z4, d85 d85Var, d85 d85Var2, int i2, hq5 hq5Var, final int i3, final int i4) {
        int i5;
        final boolean z5;
        int i6;
        int i7;
        int i8;
        d85 d85Var3;
        int i9;
        int i10;
        d85 d85Var4;
        int i11;
        int i12;
        int i13;
        final int i14;
        oq5 oq5Var;
        final d85 d85Var5;
        final d85 d85Var6;
        final boolean z6;
        final boolean z7;
        xmn r;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1992633581);
        int i15 = (oq5Var2.g(z) ? 4 : 2) | i3;
        if ((i3 & 48) == 0) {
            i5 = i;
            i15 |= oq5Var2.d(i5) ? 32 : 16;
        } else {
            i5 = i;
        }
        if ((i3 & 384) == 0) {
            i15 |= oq5Var2.h(function0) ? 256 : 128;
        }
        int i16 = i15 | (oq5Var2.h(function02) ? 2048 : 1024);
        int i17 = i4 & 16;
        if (i17 != 0) {
            i16 |= 24576;
        } else if ((i3 & 24576) == 0) {
            z5 = z2;
            i16 |= oq5Var2.g(z5) ? 16384 : RemoteCameraConfig.Notification.ID;
            int i18 = 196608 | i16;
            i6 = i4 & 64;
            if (i6 == 0) {
                i7 = i16 | 1769472;
            } else {
                i7 = i18 | (oq5Var2.g(z4) ? 1048576 : 524288);
            }
            i8 = i4 & 128;
            if (i8 == 0) {
                i9 = i7 | 12582912;
                d85Var3 = d85Var;
            } else {
                d85Var3 = d85Var;
                i9 = i7 | (oq5Var2.f(d85Var3) ? 8388608 : RemoteCameraConfig.Camera.BITRATE);
            }
            i10 = i4 & 256;
            if (i10 == 0) {
                i11 = i9 | 100663296;
                d85Var4 = d85Var2;
            } else {
                d85Var4 = d85Var2;
                i11 = i9 | (oq5Var2.f(d85Var4) ? 67108864 : 33554432);
            }
            i12 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
            if (i12 == 0) {
                i11 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                i13 = i12;
                i11 |= oq5Var2.d(i2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
                if ((i11 & 306783379) == 306783378 || !oq5Var2.z()) {
                    boolean z8 = i17 != 0 ? true : z5;
                    boolean z9 = i6 != 0 ? false : z4;
                    if (i8 != 0) {
                        d85Var3 = null;
                    }
                    d85 d85Var7 = i10 != 0 ? null : d85Var4;
                    int i19 = i13 != 0 ? 1 : i2;
                    int i20 = 2147482750 & i11;
                    d85 d85Var8 = d85Var3;
                    b(z, i5, ((Number) function0.invoke()).floatValue() > 0.5f, function02, z8, z9, d85Var8, d85Var7, i19, oq5Var2, i20);
                    i14 = i19;
                    oq5Var = oq5Var2;
                    d85Var5 = d85Var8;
                    d85Var6 = d85Var7;
                    z6 = true;
                    z7 = z9;
                    z5 = z8;
                } else {
                    oq5Var2.S();
                    z6 = z3;
                    z7 = z4;
                    oq5Var = oq5Var2;
                    d85Var5 = d85Var3;
                    d85Var6 = d85Var4;
                    i14 = i2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new Function2() { // from class: f1g
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            cb0.a(z, i, function0, function02, z5, z6, z7, d85Var5, d85Var6, i14, (hq5) obj, rvf.R(i3 | 1), i4);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            i13 = i12;
            if ((i11 & 306783379) == 306783378) {
            }
            if (i17 != 0) {
            }
            if (i6 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (i13 != 0) {
            }
            int i202 = 2147482750 & i11;
            d85 d85Var82 = d85Var3;
            b(z, i5, ((Number) function0.invoke()).floatValue() > 0.5f, function02, z8, z9, d85Var82, d85Var7, i19, oq5Var2, i202);
            i14 = i19;
            oq5Var = oq5Var2;
            d85Var5 = d85Var82;
            d85Var6 = d85Var7;
            z6 = true;
            z7 = z9;
            z5 = z8;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        z5 = z2;
        int i182 = 196608 | i16;
        i6 = i4 & 64;
        if (i6 == 0) {
        }
        i8 = i4 & 128;
        if (i8 == 0) {
        }
        i10 = i4 & 256;
        if (i10 == 0) {
        }
        i12 = i4 & RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (i12 == 0) {
        }
        i13 = i12;
        if ((i11 & 306783379) == 306783378) {
        }
        if (i17 != 0) {
        }
        if (i6 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (i13 != 0) {
        }
        int i2022 = 2147482750 & i11;
        d85 d85Var822 = d85Var3;
        b(z, i5, ((Number) function0.invoke()).floatValue() > 0.5f, function02, z8, z9, d85Var822, d85Var7, i19, oq5Var2, i2022);
        i14 = i19;
        oq5Var = oq5Var2;
        d85Var5 = d85Var822;
        d85Var6 = d85Var7;
        z6 = true;
        z7 = z9;
        z5 = z8;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void b(final boolean z, final int i, final boolean z2, final Function0 function0, final boolean z3, final boolean z4, final d85 d85Var, final d85 d85Var2, final int i2, hq5 hq5Var, final int i3) {
        int i4;
        d85 d85Var3;
        d85 d85Var4;
        int i5;
        String M;
        oq5 oq5Var;
        function0.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(423322845);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var2.g(z) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var2.d(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var2.g(z2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var2.h(function0) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= oq5Var2.g(z3) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i3) == 0) {
            i4 |= oq5Var2.g(true) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i3) == 0) {
            i4 |= oq5Var2.g(z4) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            d85Var3 = d85Var;
            i4 |= oq5Var2.f(d85Var3) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        } else {
            d85Var3 = d85Var;
        }
        if ((100663296 & i3) == 0) {
            d85Var4 = d85Var2;
            i4 |= oq5Var2.f(d85Var4) ? 67108864 : 33554432;
        } else {
            d85Var4 = d85Var2;
        }
        if ((805306368 & i3) == 0) {
            i4 |= oq5Var2.d(i2) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456;
        }
        int i6 = i4;
        if ((306783379 & i6) == 306783378 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            oq5Var2.Z(-1208627048);
            StringBuilder sb = new StringBuilder();
            if (z4) {
                i5 = z ? R.string.my_shelf_menu_unlike : R.string.my_shelf_menu_like;
            } else {
                i5 = z ? R.string.remove_from_phonoteka_description : R.string.add_to_phonoteka_description;
            }
            sb.append(rvf.M(i5, oq5Var2));
            if (z3) {
                oq5Var2.Z(-742886572);
                sb.append(StringUtil.SPACE);
                sb.append(rvf.H(R.plurals.likes_content_description, i, new Object[]{Integer.valueOf(i)}, oq5Var2));
            } else {
                oq5Var2.Z(-745390876);
            }
            oq5Var2.p(false);
            String sb2 = sb.toString();
            oq5Var2.p(false);
            int i7 = R.string.add;
            if (z3) {
                oq5Var2.Z(1188671323);
                Resources resources = ((Context) oq5Var2.j(AndroidCompositionLocals_androidKt.b)).getResources();
                resources.getClass();
                jyr jyrVar = y3g.a;
                if (i == 0) {
                    M = resources.getString(R.string.add);
                    M.getClass();
                } else {
                    M = ((DecimalFormat) y3g.a.getValue()).format(Integer.valueOf(i));
                    M.getClass();
                }
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(1188787542);
                if (z4) {
                    i7 = z ? R.string.my_shelf_menu_unlike : R.string.my_shelf_menu_like;
                }
                M = rvf.M(i7, oq5Var2);
                oq5Var2.p(false);
            }
            String str = M;
            yci a2 = a.a(vci.a, "like_entity_button");
            boolean f = oq5Var2.f(sb2);
            Object K = oq5Var2.K();
            if (f || K == gq5.a) {
                K = new wq(sb2, 28);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            g0g.m(ild.C(866523509, new mba(z, d85Var3, function0, z2, d85Var4), oq5Var2), str, nfp.b(a2, true, (Function1) K), null, 0L, i2, oq5Var, ((i6 >> 12) & 458752) | 6, 24);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: g1g
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    cb0.b(z, i, z2, function0, z3, z4, d85Var, d85Var2, i2, (hq5) obj, rvf.R(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(vuf vufVar, ArrayList arrayList, int i, q0k q0kVar, Function1 function1, Function1 function12, Function0 function0) {
        vufVar.getClass();
        vuf.Y(vufVar, null, new wn5(new g9j(q0kVar, i, arrayList, function0, 0), -1771342353, true), 3);
        vuf.Y(vufVar, null, new wn5(new vtb(arrayList, function1, function12), -664641768, true), 3);
    }

    public static final void d(orj orjVar, hq5 hq5Var, int i) {
        orjVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-897619547);
        int i2 = i | (oq5Var.f(orjVar) ? 4 : 2);
        int i3 = 1;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            List h = u75.h(vq2.j, vq2.k, vq2.l, vq2.m);
            String[] stringArray = gdg.K(oq5Var).getStringArray(R.array.onboarding_title_text);
            if (stringArray.length != h.size()) {
                su4.s(2, null, "Page count does not equal text string count", null);
            }
            boolean f = oq5Var.f(h);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (f || K == kjnVar) {
                K = new zga(h, i3);
                oq5Var.k0(K);
            }
            fp7 b = r3k.b(0, (Function0) K, oq5Var, 0, 3);
            vci vciVar = vci.a;
            yci a2 = a.a(androidx.compose.foundation.a.b(d.c(vciVar, 1.0f), ((dq0) oq5Var.j(eq0.a)).c.a, vnj.i), "onboarding_box");
            kfh d = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, a2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            yci c = d.c(vciVar, 1.0f);
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = new hpj(7);
                oq5Var.k0(K2);
            }
            rvf.a(b, nfp.a(c, (Function1) K2), null, null, 0, 0.0f, null, null, false, null, null, null, null, ild.C(-1550281346, new fb1(10, h, orjVar, b), oq5Var), oq5Var, 0, 24576, 16380);
            oq5Var = oq5Var;
            szf.h(stringArray, b, orjVar, oq5Var, (i2 << 6) & 896);
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ykf(orjVar, i, 15);
        }
    }

    public static ih0 e(String str, ges gesVar, long j, jx7 jx7Var, ppc ppcVar, c5b c5bVar, int i, int i2) {
        if ((i2 & 32) != 0) {
            c5bVar = c5b.a;
        }
        return new ih0(new mh0(str, gesVar, c5bVar, c5b.a, ppcVar, jx7Var), i, 1, j);
    }

    public static final void f(String str, hq5 hq5Var, int i) {
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1730085829);
        int i2 = i | (oq5Var.f(str) ? 4 : 2);
        if ((i2 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            lx0 lx0Var = qx0.e;
            hz2 hz2Var = b2c.l;
            vci vciVar = vci.a;
            yci d = d.d(vciVar, 1.0f);
            nho a2 = lho.a(lx0Var, hz2Var, oq5Var, 54);
            int i3 = oq5Var.P;
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
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            gae.b(a0g.E(R.drawable.ic_play_mid_24, 0, oq5Var), null, d.m(vciVar, 24), 0L, oq5Var, 432, 8);
            u1g.l(oq5Var, d.r(vciVar, mu0.h));
            xcs.b(str, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, oq5Var, i2 & 14, 3120, 120830);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new da1(str, i, 11);
        }
    }

    public static final void g(int i, hq5 hq5Var, yci yciVar, String str, Function0 function0) {
        yci yciVar2;
        Function0 function02;
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(784949299);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            function02 = function0;
        } else {
            int i3 = i2 >> 3;
            yciVar2 = yciVar;
            function02 = function0;
            hdg.n((i3 & 14) | 384 | (i3 & 112), 0, ild.C(1678104228, new mf3(str, 10), oq5Var), oq5Var, yciVar2, function02);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new in1(str, function02, yciVar2, i, 2);
        }
    }

    public static final void h(int i, hq5 hq5Var, yci yciVar, String str, Function0 function0) {
        str.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1933945445);
        int i2 = (oq5Var.f(str) ? 4 : 2) | i | (oq5Var.h(function0) ? 32 : 16);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            hdg.s(((i2 >> 3) & 14) | 432, ild.C(1482293018, new mf3(str, 9), oq5Var), oq5Var, yciVar, function0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new in1(str, function0, yciVar, i, 1);
        }
    }

    public static final void i(yci yciVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(424547375);
        int i2 = (oq5Var.f(yciVar) ? 4 : 2) | i;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            gz2 gz2Var = b2c.o;
            yci o = androidx.compose.foundation.layout.a.o(yciVar, 48, 0.0f, 2);
            ta5 a2 = sa5.a(qx0.c, gz2Var, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, o);
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
            w4k E = a0g.E(R.drawable.ic_playlist_24, 0, oq5Var);
            long j = ((dq0) oq5Var.j(eq0.a)).a.e;
            vci vciVar = vci.a;
            gae.b(E, null, d.m(vciVar, 124), j, oq5Var, 432, 0);
            xcs.b(vz1.o(vciVar, 24, oq5Var, R.string.url_noPlaylist, oq5Var), null, 0L, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 0, 0, 65022);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar, i, 8);
        }
    }

    public static final void j(String str, yg0 yg0Var, SessionColor sessionColor, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        SessionColor sessionColor2;
        boolean z;
        boolean z2;
        long j;
        sessionColor.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(494046032);
        int i3 = i & 6;
        qho qhoVar = qho.a;
        if (i3 == 0) {
            i2 = (oq5Var.f(qhoVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(yg0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            sessionColor2 = sessionColor;
            i2 |= oq5Var.f(sessionColor2) ? 2048 : 1024;
        } else {
            sessionColor2 = sessionColor;
        }
        if ((i & 24576) == 0) {
            i2 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i2 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.a0(1222878633);
            xbl xblVar = (xbl) oq5Var.j(lf7.a);
            oq5Var.p(false);
            xblVar.getClass();
            yci b = qhoVar.b(qhoVar.a(lf7.j(oq5Var) ? 0.2f : 0.25f, yciVar, true), b2c.m);
            oq5Var.a0(733328855);
            iz2 iz2Var = b2c.b;
            wg3 e = ug3.e(iz2Var, false, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            wn5 A = ghh.A(b);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, e, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            A.invoke(new lrq(oq5Var), oq5Var, 0);
            oq5Var.a0(2058660585);
            lp4 lp4Var = (lp4) oq5Var.j(es5.e);
            oq5Var.a0(-1224613366);
            if (yg0Var != null) {
                hxe hxeVar = hxe.a;
                float f = 16;
                yci u = xp3.u(androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.r(vci.a, hxeVar), hxeVar), ugo.a(f));
                int i5 = k5n.a[sessionColor2.ordinal()];
                int i6 = i2;
                if (i5 == 1) {
                    j = d85.h;
                } else if (i5 == 2) {
                    j = d85.j;
                } else if (i5 == 3) {
                    j = d85.g;
                } else {
                    if (i5 != 4) {
                        b6e.s();
                        return;
                    }
                    j = d85.m;
                }
                yci b2 = androidx.compose.foundation.a.b(u, d85.b(j, 0.5f, 0.0f, 0.0f, 0.0f, 14), vnj.i);
                oq5Var.a0(733328855);
                wg3 e2 = ug3.e(iz2Var, false, oq5Var, 0);
                oq5Var.a0(-1323940314);
                int i7 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                wn5 A2 = ghh.A(b2);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, e2, kb5Var);
                g0g.U(oq5Var, l2, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                    ouj.x(i7, oq5Var, i7, kb5Var3);
                }
                A2.invoke(new lrq(oq5Var), oq5Var, 0);
                oq5Var.a0(2058660585);
                q33 q33Var = new q33(yg0Var);
                yci u2 = xp3.u(androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.a.g(androidx.compose.foundation.layout.a.r(yciVar, hxeVar), hxeVar), 4), ugo.a(f));
                oq5Var.a0(-1934458708);
                boolean h = ((i6 & 112) == 32) | oq5Var.h(lp4Var);
                Object K = oq5Var.K();
                if (h || K == gq5.a) {
                    K = new j5n(0, str, lp4Var);
                    oq5Var.k0(K);
                }
                oq5Var.p(false);
                z2 = true;
                irf.r(q33Var, "", androidx.compose.foundation.a.i(u2, null, (Function0) K, xuj.D, 47), null, null, 0.0f, null, oq5Var, 48, 120);
                z = false;
                k5r.s(oq5Var, false, true, false, false);
            } else {
                z = false;
                z2 = true;
            }
            k5r.s(oq5Var, z, z, z2, z);
            oq5Var.p(z);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new un5(i, 6, str, yg0Var, sessionColor, yciVar);
        }
    }

    public static final void k(int i, hq5 hq5Var, yci yciVar, boolean z) {
        int i2;
        boolean z2 = z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-331905786);
        if ((i & 6) == 0) {
            i2 = (oq5Var.g(z2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            hz2 hz2Var = b2c.l;
            yci n = androidx.compose.foundation.layout.a.n(yciVar, 16, 8);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, n);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            float f = 80;
            vci vciVar = vci.a;
            int i5 = (i3 & 14) | 48;
            ivf.k(i5, 0, oq5Var, d.m(vciVar, f), z2);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci d = d.d(androidx.compose.foundation.layout.a.q(new LayoutWeightElement(true, 1.0f), 12, 0.0f, 0.0f, 0.0f, 14), 1.0f);
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, d);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            h6g h6gVar = nu0.a;
            h6g h6gVar2 = h6g.c;
            ivf.l(z, d.r(vciVar, f), nu0.j(), oq5Var, i5, 0);
            u1g.l(oq5Var, d.e(vciVar, mu0.a));
            z2 = z;
            ivf.l(z2, d.r(vciVar, 120), nu0.i(), oq5Var, i5, 0);
            oq5Var.p(true);
            oq5Var.Z(-1069656653);
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new yt(z2, yciVar, i, 14);
        }
    }

    public static final jgo l(ynn ynnVar, long j, long j2, long j3, long j4) {
        return new jgo(ynnVar.a, ynnVar.b, ynnVar.c, ynnVar.d, j, j2, j3, j4);
    }

    public static final jgo m(float f, float f2, float f3, float f4, long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat2));
        return new jgo(f, f2, f3, f4, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits, floatToRawIntBits);
    }

    public static final void n(eqp eqpVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        eqp eqpVar2;
        List list;
        boolean z;
        fvf fvfVar;
        Object qbpVar;
        oq5 oq5Var2;
        eqp eqpVar3 = eqpVar;
        eqpVar3.getClass();
        oq5 oq5Var3 = (oq5) hq5Var;
        oq5Var3.b0(-455247711);
        int i2 = (oq5Var3.f(eqpVar3) ? 4 : 2) | i;
        if (oq5Var3.P(i2 & 1, (i2 & 3) != 2)) {
            List list2 = (List) szf.Q(eqpVar3.h, oq5Var3).getValue();
            fvf a2 = hvf.a(0, 0, oq5Var3, 0, 3);
            int i3 = i2 & 14;
            boolean f = (i3 == 4) | oq5Var3.f(list2) | oq5Var3.f(a2);
            Object K = oq5Var3.K();
            kjn kjnVar = gq5.a;
            if (f || K == kjnVar) {
                kun kunVar = new kun(eqpVar3, list2, a2, null, 18);
                eqpVar2 = eqpVar3;
                list = list2;
                z = false;
                fvfVar = a2;
                oq5Var3.k0(kunVar);
                K = kunVar;
            } else {
                eqpVar2 = eqpVar3;
                list = list2;
                z = false;
                fvfVar = a2;
            }
            gld.y(list, eqpVar2, (Function2) K, oq5Var3);
            ogp.g.e(false, false, null, oq5Var3, 4096, 7);
            String M = rvf.M(R.string.app_preferences_text, oq5Var3);
            vm C = ghh.C(zs4.g(oq5Var3), ogp.A(oq5Var3));
            boolean z2 = i3 != 4 ? z : true;
            Object K2 = oq5Var3.K();
            if (z2 || K2 == kjnVar) {
                eqp eqpVar4 = eqpVar2;
                oq5Var2 = oq5Var3;
                qbpVar = new qbp(0, eqpVar4, eqp.class, "onBackClick", "onBackClick()V", 0, 6);
                eqpVar3 = eqpVar4;
                oq5Var2.k0(qbpVar);
            } else {
                oq5Var2 = oq5Var3;
                qbpVar = K2;
                eqpVar3 = eqpVar2;
            }
            oq5Var = oq5Var2;
            xp3.d(M, fvfVar, null, C, (Function0) ((h9f) qbpVar), null, false, false, null, null, null, ild.C(-1929187753, new vtb(26, list, eqpVar3, fvfVar), oq5Var2), oq5Var, 0, 48, 2020);
        } else {
            oq5Var = oq5Var3;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ucm(eqpVar3, i, 24);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void o(int i, int i2, hq5 hq5Var, yci yciVar, final Function1 function1, final Function1 function12) {
        yci yciVar2;
        yci yciVar3;
        int i3;
        vci vciVar;
        boolean z;
        yci yciVar4;
        yci yciVar5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1851325466);
        int i4 = i2 | (oq5Var.d(i) ? 4 : 2) | 48 | (oq5Var.d(R.drawable.ic_warning_16) ? 256 : 128) | (oq5Var.h(function1) ? 2048 : 1024) | (oq5Var.h(function12) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i4 & 1, (i4 & 9363) != 9362)) {
            oq5Var.U();
            int i5 = i2 & 1;
            vci vciVar2 = vci.a;
            if (i5 == 0 || oq5Var.y()) {
                yciVar3 = vciVar2;
            } else {
                oq5Var.S();
                yciVar3 = yciVar;
            }
            oq5Var.q();
            final Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            boolean z2 = function1 != null;
            boolean z3 = function12 != null;
            iz2 iz2Var = b2c.f;
            float f = 16;
            yci p = androidx.compose.foundation.layout.a.p(d.c(yciVar3, 1.0f), f, 14, f, 6);
            kfh d = ug3.d(iz2Var, false);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, p);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, d, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            lx0 lx0Var = qx0.g;
            hz2 hz2Var = b2c.l;
            oq5Var.Z(-1053792347);
            kjn kjnVar = gq5.a;
            if (z2) {
                i3 = i4;
                boolean h = ((i4 & 7168) == 2048) | oq5Var.h(context);
                Object K = oq5Var.K();
                if (h || K == kjnVar) {
                    z = false;
                    final Object[] objArr = 0 == true ? 1 : 0;
                    K = new Function0() { // from class: lkq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (objArr) {
                                case 0:
                                    Function1 function13 = function1;
                                    if (function13 != null) {
                                        function13.invoke(context);
                                    }
                                    break;
                                default:
                                    function1.invoke(context);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K);
                } else {
                    z = false;
                }
                yciVar4 = androidx.compose.foundation.a.e(vciVar2, false, null, null, (Function0) K, 7);
                vciVar = vciVar2;
            } else {
                i3 = i4;
                vciVar = vciVar2;
                z = false;
                yciVar4 = vciVar;
            }
            oq5Var.p(z);
            vci vciVar3 = vciVar;
            yci f2 = yciVar4.f(z3 ? d.c(vciVar3, 1.0f) : vciVar3);
            nho a2 = lho.a(lx0Var, hz2Var, oq5Var, 54);
            int i7 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, f2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            oq5Var.Z(-800551195);
            yci yciVar6 = yciVar3;
            gae.b(a0g.E(R.drawable.ic_warning_16, (i3 >> 6) & 14, oq5Var), null, d.m(androidx.compose.foundation.layout.a.q(vciVar3, 0.0f, 0.0f, ff7.P(v7g.z(8), oq5Var), 0.0f, 11), ff7.P(v7g.z(16), oq5Var)), ((dq0) oq5Var.j(eq0.a)).b.d, oq5Var, 48, 0);
            oq5Var.p(false);
            mn0 m = o8g.m(f8g.Y(i, oq5Var), 0L, oq5Var, 0, 1);
            boolean z4 = z3;
            ges i8 = nu0.i();
            agr agrVar = eq0.a;
            long j = ((dq0) oq5Var.j(agrVar)).b.a;
            if (z4) {
                if (1.0f <= 0.0d) {
                    qme.a("invalid weight; must be greater than zero");
                }
                yciVar5 = new LayoutWeightElement(true, 1.0f);
            } else {
                yciVar5 = vciVar3;
            }
            xv7.i(m, yciVar5, j, 0L, 0L, 5, 0L, 2, false, 1, 0, null, null, i8, null, null, oq5Var, 0, 3120, 907000);
            oq5Var = oq5Var;
            if (function12 != null) {
                oq5Var.Z(-799711560);
                w4k E = a0g.E(R.drawable.ic_close_mid_24, 0, oq5Var);
                yci m2 = d.m(androidx.compose.foundation.layout.a.q(vciVar3, ff7.P(v7g.z(8), oq5Var), 0.0f, 0.0f, 0.0f, 14), ff7.P(v7g.z(24), oq5Var));
                boolean h2 = oq5Var.h(context) | ((i3 & 57344) == 16384);
                Object K2 = oq5Var.K();
                if (h2 || K2 == kjnVar) {
                    final int i9 = 1;
                    K2 = new Function0() { // from class: lkq
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i9) {
                                case 0:
                                    Function1 function13 = function12;
                                    if (function13 != null) {
                                        function13.invoke(context);
                                    }
                                    break;
                                default:
                                    function12.invoke(context);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K2);
                }
                gae.b(E, rvf.M(R.string.close_content_description, oq5Var), androidx.compose.foundation.a.e(m2, false, null, null, (Function0) K2, 7), ((dq0) oq5Var.j(agrVar)).b.b, oq5Var, 0, 0);
            } else {
                oq5Var.Z(-803101658);
            }
            oq5Var.p(false);
            oq5Var.p(true);
            oq5Var.p(true);
            yciVar2 = yciVar6;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(i, yciVar2, function1, function12, i2);
        }
    }

    public static final void p(ior iorVar, sor sorVar, hq5 hq5Var, int i) {
        iorVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(767088855);
        int i2 = (oq5Var.f(iorVar) ? 4 : 2) | i | (oq5Var.h(sorVar) ? 32 : 16);
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new kor(iorVar, sorVar, context);
                oq5Var.k0(K);
            }
            g0g.v((kor) K, oq5Var, 6);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(iorVar, sorVar, i, 9);
        }
    }

    public static final void q(z5t z5tVar, hq5 hq5Var, int i) {
        qo6 qo6Var;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1938551859);
        int i2 = (oq5Var.f(z5tVar) ? 4 : 2) | i;
        int i3 = 1;
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            l5t l5tVar = z5tVar.a;
            w5t a2 = l5tVar.a();
            int ordinal = l5tVar.ordinal();
            if (ordinal == 0) {
                qo6Var = qo6.b;
            } else if (ordinal == 1) {
                qo6Var = qo6.b;
            } else if (ordinal == 2) {
                qo6Var = qo6.e;
            } else if (ordinal == 3) {
                qo6Var = qo6.d;
            } else {
                if (ordinal != 4) {
                    b6e.s();
                    return;
                }
                qo6Var = qo6.a;
            }
            int ordinal2 = l5tVar.ordinal();
            if (ordinal2 != 1 && ordinal2 != 4) {
                i3 = 5;
            }
            p1g.r(qo6Var, ild.C(-219526484, new dv(z5tVar, i3, a2, 5), oq5Var), oq5Var, 384);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new f5r(z5tVar, i, 10);
        }
    }

    public static h1u r(OkHttpClient okHttpClient, n4f n4fVar, rc rcVar, wpt wptVar) {
        okHttpClient.getClass();
        new b3i(20);
        g8c g8cVar = new g8c();
        g8cVar.a = wptVar;
        return new h1u(okHttpClient, n4fVar, rcVar, wptVar, g8cVar);
    }

    public static final void s(wn5 wn5Var, Function2 function2, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1018656851);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(wn5Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            gtu gtuVar = (gtu) oq5Var.j(htu.a);
            yci c = d.c(yciVar, 1.0f);
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var = wp5.f;
            g0g.U(oq5Var, a2, kb5Var);
            kb5 kb5Var2 = wp5.e;
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci d = d.d(new LayoutWeightElement(true, 1.0f), 1.0f);
            iz2 iz2Var = b2c.b;
            kfh d2 = ug3.d(iz2Var, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, d);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            eta.l(i2 & 14, wn5Var, oq5Var, true);
            float f = gtuVar.e;
            vci vciVar = vci.a;
            u1g.l(oq5Var, d.e(vciVar, f));
            yci d3 = d.d(androidx.compose.foundation.layout.a.o(vciVar, 16, 0.0f, 2), 1.0f);
            kfh d4 = ug3.d(iz2Var, false);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, d3);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d4, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            function2.invoke(oq5Var, Integer.valueOf((i2 >> 3) & 14));
            oq5Var.p(true);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(wn5Var, function2, yciVar, i, 24);
        }
    }

    public static boolean t(s2c s2cVar) {
        d7k d7kVar = new d7k(8);
        int i = mdr.d(s2cVar, d7kVar).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        s2cVar.A(d7kVar.a, 0, 4);
        d7kVar.H(0);
        int h = d7kVar.h();
        if (h == 1463899717) {
            return true;
        }
        vq1.K("WavHeaderReader", "Unsupported form type: " + h);
        return false;
    }

    public static llv u(dmv dmvVar, boolean z) {
        boolean z2 = dmvVar instanceof yje;
        alv alvVar = alv.a;
        if (z2) {
            if (((yje) dmvVar).c) {
                return new llv(new klv(u75.h(new xkv(false, true), alvVar, new vkv()), 1), new klv(u75.h(new xkv(false, true), alvVar, new vkv()), 1), new klv(u75.h(alvVar, new xkv(false, true), new vkv()), 0));
            }
            wkv wkvVar = wkv.a;
            return new llv(new klv(u75.h(wkvVar, alvVar, wkvVar), 1), new klv(u75.h(wkvVar, alvVar, wkvVar), 1), new klv(u75.h(alvVar, wkvVar, wkvVar), 0));
        }
        if (!(dmvVar instanceof n0t)) {
            if (dmvVar instanceof c8u) {
                return new llv(new klv(u75.h(new xkv(z, true), alvVar, new elv(true)), 1), new klv(u75.h(new blv(true), alvVar, new elv(true), new xkv(z, true)), 1), new klv(u75.h(alvVar, new xkv(z, true), new elv(true)), 0));
            }
            b6e.s();
            return null;
        }
        if (!a4g.D(gys.NonMusicHolder, ((n0t) dmvVar).a)) {
            return new llv(new klv(u75.h(new xkv(z, true), alvVar, new elv(true)), 1), new klv(u75.h(new blv(true), alvVar, new elv(true), new xkv(z, true)), 1), new klv(u75.h(alvVar, new xkv(z, true), new elv(true)), 0));
        }
        clv clvVar = clv.a;
        dlv dlvVar = dlv.a;
        return new llv(new klv(u75.h(clvVar, alvVar, dlvVar), 1), new klv(u75.h(clvVar, alvVar, dlvVar, new xkv(z, true)), 1), new klv(u75.h(alvVar, clvVar, dlvVar), 0));
    }

    public static String v(mn3 mn3Var) {
        StringBuilder sb = new StringBuilder(mn3Var.size());
        for (int i = 0; i < mn3Var.size(); i++) {
            byte a2 = mn3Var.a(i);
            if (a2 == 34) {
                sb.append("\\\"");
            } else if (a2 == 39) {
                sb.append("\\'");
            } else if (a2 != 92) {
                switch (a2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a2 < 32 || a2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a2 >>> 6) & 3) + 48));
                            sb.append((char) (((a2 >>> 3) & 7) + 48));
                            sb.append((char) ((a2 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a2);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static final int w(List list, int i) {
        int i2;
        int i3 = ((t5k) CollectionsKt.Y(list)).c;
        if (i > ((t5k) CollectionsKt.Y(list)).c) {
            tme.a("Index " + i + " should be less or equal than last line's end " + i3);
        }
        int size = list.size() - 1;
        int i4 = 0;
        while (true) {
            if (i4 > size) {
                i2 = -(i4 + 1);
                break;
            }
            i2 = (i4 + size) >>> 1;
            t5k t5kVar = (t5k) list.get(i2);
            char c = t5kVar.b > i ? (char) 1 : t5kVar.c <= i ? (char) 65535 : (char) 0;
            if (c >= 0) {
                if (c <= 0) {
                    break;
                }
                size = i2 - 1;
            } else {
                i4 = i2 + 1;
            }
        }
        if (i2 >= 0 && i2 < list.size()) {
            return i2;
        }
        StringBuilder q = k5r.q(i2, "Found paragraph index ", " should be in range [0, ");
        q.append(list.size());
        q.append(").\nDebug info: index=");
        q.append(i);
        q.append(", paragraphs=[");
        q.append(lag.b(list, null, k9i.H, 31));
        q.append(']');
        tme.a(q.toString());
        return i2;
    }

    public static final int x(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            t5k t5kVar = (t5k) list.get(i3);
            char c = t5kVar.d > i ? (char) 1 : t5kVar.e <= i ? (char) 65535 : (char) 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else {
                if (c <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final int y(ArrayList arrayList, float f) {
        if (f <= 0.0f) {
            return 0;
        }
        if (f >= ((t5k) CollectionsKt.Y(arrayList)).g) {
            return arrayList.size() - 1;
        }
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            t5k t5kVar = (t5k) arrayList.get(i2);
            char c = t5kVar.f > f ? (char) 1 : t5kVar.g <= f ? (char) 65535 : (char) 0;
            if (c < 0) {
                i = i2 + 1;
            } else {
                if (c <= 0) {
                    return i2;
                }
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final void z(ArrayList arrayList, long j, Function1 function1) {
        int size = arrayList.size();
        for (int w = w(arrayList, rds.e(j)); w < size; w++) {
            t5k t5kVar = (t5k) arrayList.get(w);
            if (t5kVar.b >= rds.d(j)) {
                return;
            }
            if (t5kVar.b != t5kVar.c) {
                function1.invoke(t5kVar);
            }
        }
    }
}
