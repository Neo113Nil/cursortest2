package defpackage;

import android.os.Build;
import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.ReorderHapticFeedbackType;

/* loaded from: classes11.dex */
public abstract class t791 {
    public static final String[] a = {"com.noshufou.android.su", "com.noshufou.android.su.elite", "eu.chainfire.supersu", "com.koushikdutta.superuser", "com.thirdparty.superuser", "com.yellowes.su", "com.topjohnwu.magisk", "com.kingroot.kinguser", "com.kingo.root", "com.smedialink.oneclickroot", "com.zhiqupk.root.global", "com.alephzain.framaroot"};
    public static final String[] b = {"com.koushikdutta.rommanager", "com.koushikdutta.rommanager.license", "com.dimonvideo.luckypatcher", "com.chelpus.lackypatch", "com.ramdroid.appquarantine", "com.ramdroid.appquarantinepro", "com.android.vending.billing.InAppBillingService.COIN", "com.android.vending.billing.InAppBillingService.LUCK", "com.chelpus.luckypatcher", "com.blackmartalpha", "org.blackmart.market", "com.allinone.free", "com.repodroid.app", "org.creeplays.hack", "com.baseappfull.fwd", "com.zmapp", "com.dv.marketmod.installer", "org.mobilism.android", "com.android.wp.net.log", "com.android.camera.update", "cc.madkite.freedom", "com.solohsu.android.edxp.manager", "org.meowcat.edxposed.manager", "com.xmodgame", "com.cih.game_cih", "com.charles.lpoqasert", "catch_.me_.if_.you_.can_"};
    public static final String[] c = {"/data/local/", "/data/local/bin/", "/data/local/xbin/", "/sbin/", "/su/bin/", "/system/bin/", "/system/bin/.ext/", "/system/bin/failsafe/", "/system/sd/xbin/", "/system/usr/we-need-root/", "/system/xbin/", "/cache/", "/data/", "/dev/"};
    public static final String[] d = {"/system", "/system/bin", "/system/sbin", "/system/xbin", "/vendor/bin", "/sbin", "/etc"};
    public static Constructor e;

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, wj90 wj90Var, boolean z, ButtonForm buttonForm, ButtonSize buttonSize, ety0 ety0Var, sls slsVar, fid fidVar, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        sls slsVar2;
        bts btsVar;
        ButtonForm buttonForm2;
        ety0 ety0Var2;
        boolean z3;
        ButtonSize buttonSize2;
        aii0 v;
        int i5;
        ButtonSize buttonSize3;
        ButtonForm buttonForm3;
        ety0 ety0Var3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-897348980);
        if ((i & 6) == 0) {
            i3 = (btsVar2.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? btsVar2.k(wj90Var) : btsVar2.e(wj90Var) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= btsVar2.a(z2) ? 256 : 128;
            i4 = i3 | 27648;
            if ((196608 & i) == 0) {
                i4 = 93184 | i3;
            }
            if ((i & 1572864) != 0) {
                slsVar2 = slsVar;
                i4 |= btsVar2.e(slsVar2) ? 1048576 : 524288;
            } else {
                slsVar2 = slsVar;
            }
            if (btsVar2.V(i4 & 1, (599187 & i4) == 599186)) {
                btsVar = btsVar2;
                btsVar.Y();
                buttonForm2 = buttonForm;
                ety0Var2 = ety0Var;
                z3 = z2;
                buttonSize2 = buttonSize;
            } else {
                btsVar2.a0();
                if ((i & 1) == 0 || btsVar2.C()) {
                    boolean z4 = i6 == 0 ? z2 : false;
                    ButtonForm buttonForm4 = ButtonForm.Squircle;
                    i5 = i4 & (-458753);
                    boolean z5 = z4;
                    buttonSize3 = ButtonSize.L;
                    z2 = z5;
                    buttonForm3 = buttonForm4;
                    ety0Var3 = xya1.e(btsVar2).g.b;
                } else {
                    btsVar2.Y();
                    buttonForm3 = buttonForm;
                    buttonSize3 = buttonSize;
                    i5 = i4 & (-458753);
                    ety0Var3 = ety0Var;
                }
                btsVar2.u();
                btsVar = btsVar2;
                d17.d(ofb1.b(f530Var, z2, null, 14), !z2, buttonSize3, new gz6(wj90Var.b, AppColor$Palette.TextOnControl), buttonForm3, slsVar2, wwg.S(-255239847, true, new y740(7, wj90Var, ety0Var3), btsVar2), btsVar, ((i5 >> 6) & 896) | 1572864 | ((i5 << 3) & HProv.ALG_CLASS_ALL) | ((i5 >> 3) & ImageMetadata.JPEG_GPS_COORDINATES), 0);
                ety0Var2 = ety0Var3;
                z3 = z2;
                buttonSize2 = buttonSize3;
                buttonForm2 = buttonForm3;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new u07(f530Var, wj90Var, z3, buttonForm2, buttonSize2, ety0Var2, slsVar, i, i2);
                return;
            }
            return;
        }
        z2 = z;
        i4 = i3 | 27648;
        if ((196608 & i) == 0) {
        }
        if ((i & 1572864) != 0) {
        }
        if (btsVar2.V(i4 & 1, (599187 & i4) == 599186)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void b(List list, boolean z, tls tlsVar, fid fidVar, int i, int i2) {
        boolean z2;
        int i3;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1742299325);
        int i4 = 4;
        int i5 = i | (btsVar.k(list) ? 4 : 2);
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            z2 = z;
        } else {
            z2 = z;
            i3 = i5 | (btsVar.a(z2) ? 32 : 16);
        }
        int i7 = i3 | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i7 & 1, (i7 & 147) != 146)) {
            boolean z4 = i6 != 0 ? false : z2;
            c530 c530Var = c530.a;
            float f = 1.0f;
            f530 d2 = i9a1.d(an91.o(bzk0.c(ymb1.l(ljs0.c(c530Var, 1.0f), cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), AppColor$Palette.BgFloating, qke.q), 8.0f, 8.0f, 8.0f, 0.0f, 8));
            sic a2 = qic.a(new i43(4.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d3 = b.d(btsVar, d2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d3);
            btsVar.e0(778710916);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                wj90 wj90Var = (wj90) it.next();
                c530 c530Var2 = c530Var;
                f530 c2 = ljs0.c(c530Var2, f);
                boolean e2 = btsVar.e(wj90Var) | ((i7 & 896) == 256);
                Object Q = btsVar.Q();
                if (e2 || Q == did.a) {
                    Q = new ifa(wj90Var, tlsVar, i4);
                    btsVar.o0(Q);
                }
                a(c2, wj90Var, z4, null, null, null, (sls) Q, btsVar, 6 | ((i7 << 3) & 896), 56);
                c530Var = c530Var2;
                f = f;
                i4 = 4;
            }
            btsVar.t(false);
            btsVar.t(true);
            z3 = z4;
        } else {
            btsVar.Y();
            z3 = z2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ts(list, z3, tlsVar, i, i2);
        }
    }

    public static final void c(f530 f530Var, wj90 wj90Var, boolean z, ButtonForm buttonForm, sls slsVar, fid fidVar, int i, int i2) {
        f530 f530Var2;
        ButtonForm buttonForm2;
        f530 f530Var3;
        ButtonForm buttonForm3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(502655694);
        int i3 = i | 6 | (btsVar.k(wj90Var) ? 32 : 16) | 384 | (btsVar.a(z) ? 2048 : 1024);
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= HProv.ALG_CLASS_DATA_ENCRYPT;
        } else if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.c(buttonForm == null ? -1 : buttonForm.ordinal()) ? 16384 : 8192;
        }
        int i5 = i3 | (btsVar.e(slsVar) ? 131072 : 65536);
        int i6 = 1;
        if (btsVar.V(i5 & 1, (74899 & i5) != 74898)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                f530Var3 = c530.a;
                if (i4 != 0) {
                    buttonForm3 = ButtonForm.Circle;
                    btsVar.u();
                    d17.d(ofb1.b(f530Var3, false, null, 14), z, ButtonSize.XS, new gz6(wj90Var.b, AppColor$Palette.TextOnControl), buttonForm3, slsVar, wwg.S(399099163, true, new jka(wj90Var, i6), btsVar), btsVar, ((i5 >> 6) & 112) | 1573248 | (57344 & i5) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
                    f530Var2 = f530Var3;
                    buttonForm2 = buttonForm3;
                }
            } else {
                btsVar.Y();
                f530Var3 = f530Var;
            }
            buttonForm3 = buttonForm;
            btsVar.u();
            d17.d(ofb1.b(f530Var3, false, null, 14), z, ButtonSize.XS, new gz6(wj90Var.b, AppColor$Palette.TextOnControl), buttonForm3, slsVar, wwg.S(399099163, true, new jka(wj90Var, i6), btsVar), btsVar, ((i5 >> 6) & 112) | 1573248 | (57344 & i5) | (i5 & ImageMetadata.JPEG_GPS_COORDINATES), 0);
            f530Var2 = f530Var3;
            buttonForm2 = buttonForm3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            buttonForm2 = buttonForm;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new egb(f530Var2, wj90Var, z, buttonForm2, slsVar, i, i2);
        }
    }

    public static final float d(long j, Orientation orientation) {
        int i = vw21.a[orientation.ordinal()];
        if (i == 1) {
            return Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        }
        if (i == 2) {
            return Float.intBitsToFloat((int) (j >> 32));
        }
        w511.b();
        return 0.0f;
    }

    public static final int e(long j, Orientation orientation) {
        int i = vw21.a[orientation.ordinal()];
        if (i == 1) {
            return (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        }
        if (i == 2) {
            return (int) (j >> 32);
        }
        w511.b();
        return 0;
    }

    public static String[] f() {
        ArrayList arrayList = new ArrayList(Arrays.asList(c));
        String str = System.getenv("PATH");
        if (str == null || "".equals(str)) {
            return (String[]) arrayList.toArray(new String[0]);
        }
        String[] split = str.split(":");
        int length = split.length;
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            if (!str2.endsWith("/")) {
                str2 = str2.concat("/");
            }
            if (!arrayList.contains(str2)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static Object g(Method method, Class cls, Object obj, Object[] objArr) {
        Constructor constructor = e;
        if (constructor == null) {
            constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            constructor.setAccessible(true);
            e = constructor;
        }
        return ((MethodHandles.Lookup) constructor.newInstance(cls, -1)).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public static final void h(View view, ReorderHapticFeedbackType reorderHapticFeedbackType) {
        int i = vw21.b[reorderHapticFeedbackType.ordinal()];
        if (i == 1) {
            if (Build.VERSION.SDK_INT >= 34) {
                view.performHapticFeedback(25);
            }
        } else if (i == 2) {
            if (Build.VERSION.SDK_INT >= 30) {
                view.performHapticFeedback(13);
            }
        } else if (i != 3) {
            w511.b();
        } else if (Build.VERSION.SDK_INT >= 34) {
            view.performHapticFeedback(27);
        }
    }

    public static final long i(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) + Float.intBitsToFloat((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        return (Float.floatToRawIntBits(intBitsToFloat2) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }
}
