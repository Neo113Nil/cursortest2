package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import androidx.compose.foundation.a;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import ru.yandex.music.R;
import timber.log.Timber;

/* loaded from: classes5.dex */
public abstract class lg3 {
    public static final ofc a;
    public static final qee b;
    public static final wn5 c;
    public static final wn5 d;
    public static final wn5 e;
    public static final wn5 f;
    public static final wn5 g;
    public static final wn5 h;
    public static final wn5 i;
    public static final wn5 j;
    public static final wn5 k;
    public static final wn5 l;
    public static final wn5 m;
    public static final wn5 n;
    public static final wn5 o;
    public static final wn5 p;
    public static final wn5 q;
    public static final uw8 r;
    public static final int[][] s;
    public static final int[][] t;
    public static final int[][] u;
    public static final int[][] v;
    public static final chv[] w;
    public static kgr x;

    static {
        int i2 = 14;
        a = new ofc(i2);
        b = new qee(i2);
        int i3 = 22;
        c = new wn5(new fo5(i3), -919406869, false);
        new wn5(new fo5(23), 1833645887, false);
        d = new wn5(new rz3(12), -1797639093, false);
        e = new wn5(new zo5(16), 1530438809, false);
        f = new wn5(new zo5(25), -1669469304, false);
        g = new wn5(new zo5(26), 1232564583, false);
        h = new wn5(new zo5(27), -1529468628, false);
        i = new wn5(new zo5(28), -1671380606, false);
        j = new wn5(new zo5(17), -1805963295, false);
        k = new wn5(new ap5(3), -1073876584, false);
        l = new wn5(new zo5(18), -309936063, false);
        m = new wn5(new zo5(19), 1950673245, false);
        new wn5(new zo5(20), -1594649557, false);
        n = new wn5(new zo5(21), -477086915, false);
        o = new wn5(new ap5(4), 402475380, false);
        p = new wn5(new zo5(i3), -1581474915, false);
        q = new wn5(new zo5(23), -590817607, false);
        new wn5(new zo5(24), -2061077992, false);
        r = new uw8(11);
        s = new int[][]{new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};
        t = new int[][]{new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};
        u = new int[][]{new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};
        v = new int[][]{new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};
        w = new chv[]{chv.CONSUMER, chv.BUSINESS};
    }

    public static final void A(n9b n9bVar) {
        n9bVar.getClass();
        n9bVar.a.b(q6k.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void B(Function0 function0, Set set, yci yciVar, d85 d85Var, d85 d85Var2, hq5 hq5Var, int i2, int i3) {
        int i4;
        d85 d85Var3;
        int i5;
        d85 d85Var4;
        d85 d85Var5;
        xmn r2;
        function0.getClass();
        set.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1192947289);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(set) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            d85Var3 = d85Var;
            i4 |= oq5Var.f(d85Var3) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                d85Var4 = d85Var2;
                i4 |= oq5Var.f(d85Var4) ? 16384 : RemoteCameraConfig.Notification.ID;
                if ((i4 & 9363) == 9362 || !oq5Var.z()) {
                    d85 d85Var6 = i6 != 0 ? null : d85Var3;
                    d85 d85Var7 = i5 != 0 ? null : d85Var4;
                    jf0.a(new qzm[0], null, true, ild.C(-1263176657, new bj(d85Var6, set, yciVar, d85Var7, function0), oq5Var), oq5Var, 3072, 2);
                    d85Var5 = d85Var6;
                    d85Var4 = d85Var7;
                } else {
                    oq5Var.S();
                    d85Var5 = d85Var3;
                }
                r2 = oq5Var.r();
                if (r2 != null) {
                    r2.d = new cj(function0, set, yciVar, d85Var5, d85Var4, i2, i3, 0);
                    return;
                }
                return;
            }
            d85Var4 = d85Var2;
            if ((i4 & 9363) == 9362) {
            }
            if (i6 != 0) {
            }
            if (i5 != 0) {
            }
            jf0.a(new qzm[0], null, true, ild.C(-1263176657, new bj(d85Var6, set, yciVar, d85Var7, function0), oq5Var), oq5Var, 3072, 2);
            d85Var5 = d85Var6;
            d85Var4 = d85Var7;
            r2 = oq5Var.r();
            if (r2 != null) {
            }
        }
        d85Var3 = d85Var;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        d85Var4 = d85Var2;
        if ((i4 & 9363) == 9362) {
        }
        if (i6 != 0) {
        }
        if (i5 != 0) {
        }
        jf0.a(new qzm[0], null, true, ild.C(-1263176657, new bj(d85Var6, set, yciVar, d85Var7, function0), oq5Var), oq5Var, 3072, 2);
        d85Var5 = d85Var6;
        d85Var4 = d85Var7;
        r2 = oq5Var.r();
        if (r2 != null) {
        }
    }

    public static final void C(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1235069901);
        int i3 = 3;
        if (((i2 | 6) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            tgo F = o5g.F(oq5Var);
            vci vciVar = vci.a;
            yci u2 = xp3.u(vciVar, F);
            agr agrVar = eq0.a;
            yci m2 = d.m(a.b(u2, ((dq0) oq5Var.j(agrVar)).c.c, vnj.i), 40);
            kfh d2 = ug3.d(b2c.f, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, m2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            gae.b(a0g.E(R.drawable.ic_settings_24, 0, oq5Var), null, null, ((dq0) oq5Var.j(agrVar)).a.a, oq5Var, 48, 4);
            oq5Var.p(true);
            yciVar = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new cxd(yciVar, i2, i3);
        }
    }

    public static final void D(ubi ubiVar, float f2) {
        ubiVar.getClass();
        ubiVar.a(new wn5(new xd1(f2), 1201679792, true));
    }

    public static final void E(jgf jgfVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-483219416);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.f(jgfVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (((i3 | 48) & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
            yciVar2 = yciVar;
        } else {
            if (jgfVar instanceof igf) {
                i4 = R.string.kids_tab_visibility_informer_subtitle_return;
            } else {
                if (!(jgfVar instanceof hgf)) {
                    b6e.s();
                    return;
                }
                i4 = R.string.kids_tab_visibility_informer_subtitle_hide;
            }
            vci vciVar = vci.a;
            oq5Var = oq5Var2;
            xcs.b(rvf.M(i4, oq5Var2), androidx.compose.ui.platform.a.a(vciVar, "kids_tab_visibility_informer_subtitle"), ((dq0) oq5Var2.j(eq0.a)).b.b, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var, 0, 3120, 55288);
            yciVar2 = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new gva(jgfVar, yciVar2, i2, 14);
        }
    }

    public static final void F(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1344337843);
        if (((i2 | 6) & 3) == 2 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            String M = rvf.M(R.string.kids_tab_visibility_informer_title, oq5Var2);
            ges j2 = nu0.j();
            long j3 = ((dq0) oq5Var2.j(eq0.a)).b.a;
            oq5Var = oq5Var2;
            yciVar2 = vci.a;
            xcs.b(M, yciVar2, j3, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j2, oq5Var, 48, 3120, 55288);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new cxd(yciVar2, i2, 4);
        }
    }

    public static Object G(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void H(w23 w23Var, int i2, q0u q0uVar, int i3, rnj rnjVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        byte[][] bArr = (byte[][]) rnjVar.d;
        int i14 = rnjVar.b;
        int i15 = rnjVar.c;
        for (byte[] bArr2 : bArr) {
            Arrays.fill(bArr2, (byte) -1);
        }
        int length = s[0].length;
        a0(0, 0, rnjVar);
        int i16 = i14 - length;
        a0(i16, 0, rnjVar);
        a0(0, i16, rnjVar);
        Z(0, 7, rnjVar);
        int i17 = i14 - 8;
        Z(i17, 7, rnjVar);
        Z(0, i17, rnjVar);
        b0(7, 0, rnjVar);
        int i18 = i15 - 8;
        b0(i18, 0, rnjVar);
        int i19 = i15 - 7;
        b0(7, i19, rnjVar);
        if (rnjVar.p(8, i18) == 0) {
            throw new k6w();
        }
        rnjVar.r(8, i18, 1);
        int i20 = q0uVar.a;
        if (i20 < 2) {
            i4 = 0;
            i5 = 1;
        } else {
            i4 = 0;
            int[] iArr = u[i20 - 1];
            i5 = 1;
            int length2 = iArr.length;
            int i21 = 0;
            while (i21 < length2) {
                int i22 = iArr[i21];
                if (i22 >= 0) {
                    int length3 = iArr.length;
                    int i23 = 0;
                    while (i23 < length3) {
                        int i24 = iArr[i23];
                        if (i24 >= 0 && n0(rnjVar.p(i24, i22))) {
                            int i25 = i24 - 2;
                            int i26 = i22 - 2;
                            i6 = length3;
                            i7 = i14;
                            int i27 = 0;
                            while (true) {
                                if (i27 >= 5) {
                                    break;
                                }
                                int[] iArr2 = t[i27];
                                int i28 = i27;
                                int i29 = 0;
                                for (int i30 = 5; i29 < i30; i30 = 5) {
                                    int i31 = i29;
                                    rnjVar.r(i25 + i29, i26 + i28, iArr2[i31]);
                                    i29 = i31 + 1;
                                    iArr = iArr;
                                }
                                i27 = i28 + 1;
                            }
                        } else {
                            i6 = length3;
                            i7 = i14;
                        }
                        i23++;
                        length3 = i6;
                        i14 = i7;
                        iArr = iArr;
                    }
                }
                i21++;
                i14 = i14;
                iArr = iArr;
            }
        }
        int i32 = i14;
        int i33 = 8;
        while (i33 < i17) {
            int i34 = i33 + 1;
            int i35 = i34 % 2;
            if (n0(rnjVar.p(i33, 6))) {
                rnjVar.r(i33, 6, i35);
            }
            if (n0(rnjVar.p(6, i33))) {
                rnjVar.r(6, i33, i35);
            }
            i33 = i34;
        }
        w23 w23Var2 = new w23();
        if (i3 < 0 || i3 >= 8) {
            throw new k6w("Invalid mask pattern");
        }
        int i36 = 1;
        if (i2 != 1) {
            i36 = 2;
            if (i2 == 2) {
                i36 = 0;
            } else if (i2 == 3) {
                i36 = 3;
            } else if (i2 != 4) {
                throw null;
            }
        }
        int i37 = (i36 << 3) | i3;
        w23Var2.c(i37, 5);
        w23Var2.c(I(i37, 1335), 10);
        w23 w23Var3 = new w23();
        w23Var3.c(21522, 15);
        if (w23Var2.b != w23Var3.b) {
            xq0.x("Sizes don't match");
            return;
        }
        int i38 = i4;
        while (true) {
            int[] iArr3 = w23Var2.a;
            if (i38 >= iArr3.length) {
                break;
            }
            iArr3[i38] = iArr3[i38] ^ w23Var3.a[i38];
            i38++;
        }
        if (w23Var2.b != 15) {
            throw new k6w("should not happen but we got: " + w23Var2.b);
        }
        int i39 = i4;
        while (true) {
            int i40 = w23Var2.b;
            if (i39 >= i40) {
                break;
            }
            boolean e2 = w23Var2.e((i40 - 1) - i39);
            int[] iArr4 = v[i39];
            rnjVar.s(iArr4[i4], iArr4[i5], e2);
            if (i39 < 8) {
                i13 = (i32 - i39) - 1;
                i12 = 8;
            } else {
                i12 = (i39 - 8) + i19;
                i13 = 8;
            }
            rnjVar.s(i13, i12, e2);
            i39++;
        }
        if (i20 >= 7) {
            w23 w23Var4 = new w23();
            w23Var4.c(i20, 6);
            w23Var4.c(I(i20, 7973), 12);
            if (w23Var4.b != 18) {
                throw new k6w("should not happen but we got: " + w23Var4.b);
            }
            int i41 = 17;
            for (int i42 = i4; i42 < 6; i42++) {
                for (int i43 = i4; i43 < 3; i43++) {
                    boolean e3 = w23Var4.e(i41);
                    i41--;
                    int i44 = (i15 - 11) + i43;
                    rnjVar.s(i42, i44, e3);
                    rnjVar.s(i44, i42, e3);
                }
            }
        }
        int i45 = i32 - 1;
        int i46 = i15 - 1;
        int i47 = i4;
        int i48 = -1;
        while (i45 > 0) {
            if (i45 == 6) {
                i45--;
            }
            while (i46 >= 0 && i46 < i15) {
                for (int i49 = i4; i49 < 2; i49++) {
                    int i50 = i45 - i49;
                    if (n0(rnjVar.p(i50, i46))) {
                        if (i47 < w23Var.b) {
                            z = w23Var.e(i47);
                            i47++;
                        } else {
                            z = i4;
                        }
                        if (i3 != -1) {
                            switch (i3) {
                                case 0:
                                    i8 = i46 + i50;
                                    i9 = i8 & 1;
                                    if ((i9 != 0 ? i5 : i4) != 0) {
                                        z = !z;
                                        break;
                                    }
                                    break;
                                case 1:
                                    i9 = i46 & 1;
                                    if ((i9 != 0 ? i5 : i4) != 0) {
                                    }
                                    break;
                                case 2:
                                    i9 = i50 % 3;
                                    if ((i9 != 0 ? i5 : i4) != 0) {
                                    }
                                    break;
                                case 3:
                                    i9 = (i46 + i50) % 3;
                                    if ((i9 != 0 ? i5 : i4) != 0) {
                                    }
                                    break;
                                case 4:
                                    i9 = ((i50 / 3) + (i46 / 2)) & 1;
                                    if ((i9 != 0 ? i5 : i4) != 0) {
                                    }
                                    break;
                                case 5:
                                    int i51 = i46 * i50;
                                    i9 = (i51 % 3) + (i51 & 1);
                                    if ((i9 != 0 ? i5 : i4) != 0) {
                                    }
                                    break;
                                case 6:
                                    int i52 = i46 * i50;
                                    i10 = i52 & 1;
                                    i11 = i52 % 3;
                                    i8 = i11 + i10;
                                    i9 = i8 & 1;
                                    if ((i9 != 0 ? i5 : i4) != 0) {
                                    }
                                    break;
                                case 7:
                                    i11 = (i46 * i50) % 3;
                                    i10 = (i46 + i50) & 1;
                                    i8 = i11 + i10;
                                    i9 = i8 & 1;
                                    if ((i9 != 0 ? i5 : i4) != 0) {
                                    }
                                    break;
                                default:
                                    xq0.x(k5r.i(i3, "Invalid mask pattern: "));
                                    return;
                            }
                        }
                        rnjVar.s(i50, i46, z);
                    }
                }
                i46 += i48;
            }
            i48 = -i48;
            i46 += i48;
            i45 -= 2;
        }
        if (i47 == w23Var.b) {
            return;
        }
        throw new k6w("Not all bits consumed: " + i47 + '/' + w23Var.b);
    }

    public static int I(int i2, int i3) {
        if (i3 == 0) {
            xq0.x("0 polynomial");
            return 0;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i3);
        int i4 = 32 - numberOfLeadingZeros;
        int i5 = i2 << (31 - numberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(i5) >= i4) {
            i5 ^= i3 << ((32 - Integer.numberOfLeadingZeros(i5)) - i4);
        }
        return i5;
    }

    public static Object J(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(lg3.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final ub7 K(pjc pjcVar, pjc pjcVar2, pjc pjcVar3, pjc pjcVar4, pjc pjcVar5, uyc uycVar) {
        pjcVar.getClass();
        pjcVar2.getClass();
        pjcVar3.getClass();
        pjcVar4.getClass();
        pjcVar5.getClass();
        return new ub7(new pjc[]{pjcVar, pjcVar2, pjcVar3, pjcVar4, pjcVar5}, uycVar);
    }

    public static final lmc L(pjc pjcVar, pjc pjcVar2, pjc pjcVar3, xdr xdrVar, pjc pjcVar4, pjc pjcVar5, vyc vycVar) {
        pjcVar.getClass();
        pjcVar2.getClass();
        pjcVar3.getClass();
        xdrVar.getClass();
        pjcVar4.getClass();
        pjcVar5.getClass();
        return new lmc(new pjc[]{pjcVar, pjcVar2, pjcVar3, xdrVar, pjcVar4, pjcVar5}, vycVar, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        if (defpackage.vnj.s(r9, r1, kotlin.jvm.internal.Intrinsics.d(r7, r2) ? r0.getWidth() : defpackage.k.e(r7.a, r8), kotlin.jvm.internal.Intrinsics.d(r7, r2) ? r0.getHeight() : defpackage.k.e(r7.b, r8), r8) == 1.0d) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap M(Drawable drawable, Bitmap.Config config, lmq lmqVar, nso nsoVar, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap3 = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap3.getConfig() == ((config == null || fx1.j(config)) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z) {
                    int width = bitmap3.getWidth();
                    int height = bitmap3.getHeight();
                    lmq lmqVar2 = lmq.c;
                }
                return bitmap3;
            }
        }
        Drawable mutate = drawable.mutate();
        Bitmap.Config[] configArr = k.a;
        boolean z2 = mutate instanceof BitmapDrawable;
        BitmapDrawable bitmapDrawable = z2 ? (BitmapDrawable) mutate : null;
        int intrinsicWidth = (bitmapDrawable == null || (bitmap2 = bitmapDrawable.getBitmap()) == null) ? mutate.getIntrinsicWidth() : bitmap2.getWidth();
        int i2 = RemoteCameraConfig.Mic.BUFFER_SIZE;
        if (intrinsicWidth <= 0) {
            intrinsicWidth = 512;
        }
        BitmapDrawable bitmapDrawable2 = z2 ? (BitmapDrawable) mutate : null;
        int intrinsicHeight = (bitmapDrawable2 == null || (bitmap = bitmapDrawable2.getBitmap()) == null) ? mutate.getIntrinsicHeight() : bitmap.getHeight();
        if (intrinsicHeight > 0) {
            i2 = intrinsicHeight;
        }
        lmq lmqVar3 = lmq.c;
        double s2 = vnj.s(intrinsicWidth, i2, Intrinsics.d(lmqVar, lmqVar3) ? intrinsicWidth : k.e(lmqVar.a, nsoVar), Intrinsics.d(lmqVar, lmqVar3) ? i2 : k.e(lmqVar.b, nsoVar), nsoVar);
        int a2 = eeh.a(intrinsicWidth * s2);
        int a3 = eeh.a(s2 * i2);
        if (config == null || fx1.j(config)) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(a2, a3, config);
        Rect bounds = mutate.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        mutate.setBounds(0, 0, a2, a3);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public static final List N(pz9 pz9Var, xzb xzbVar) {
        List list = pz9Var.R;
        if (list == null) {
            return c5b.a;
        }
        List<c0a> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (c0a c0aVar : list2) {
            Uri uri = (Uri) c0aVar.d.a(xzbVar);
            String str = (String) c0aVar.b.a(xzbVar);
            b0a b0aVar = c0aVar.c;
            Long l2 = null;
            zz9 zz9Var = b0aVar != null ? new zz9((int) ((Number) b0aVar.b.a(xzbVar)).longValue(), (int) ((Number) b0aVar.a.a(xzbVar)).longValue()) : null;
            szb szbVar = c0aVar.a;
            if (szbVar != null) {
                l2 = (Long) szbVar.a(xzbVar);
            }
            arrayList.add(new d0a(uri, str, zz9Var, l2));
        }
        return arrayList;
    }

    public static final long O(long j2) {
        p85 b0 = pd.b0(j2);
        int i2 = d85.o;
        float f2 = b0.a;
        float f3 = b0.b;
        float f4 = b0.c;
        return mvt.z(f2, f3, ((double) f4) <= 0.55d ? f4 + 0.2f : f4 - 0.2f, 0.0f, 24);
    }

    public static int P(byte[] bArr, int i2, vx0 vx0Var) {
        int W = W(bArr, i2, vx0Var);
        int i3 = vx0Var.a;
        if (i3 < 0) {
            throw bye.f();
        }
        if (i3 > bArr.length - W) {
            throw bye.h();
        }
        if (i3 == 0) {
            vx0Var.c = nn3.b;
            return W;
        }
        vx0Var.c = nn3.n(bArr, W, i3);
        return W + i3;
    }

    public static int Q(int i2, byte[] bArr) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static long R(int i2, byte[] bArr) {
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    public static int S(wto wtoVar, byte[] bArr, int i2, int i3, int i4, vx0 vx0Var) {
        o3d c2 = wtoVar.c();
        int p0 = p0(c2, wtoVar, bArr, i2, i3, i4, vx0Var);
        wtoVar.a(c2);
        vx0Var.c = c2;
        return p0;
    }

    public static int T(wto wtoVar, int i2, byte[] bArr, int i3, int i4, rse rseVar, vx0 vx0Var) {
        o3d c2 = wtoVar.c();
        wto wtoVar2 = wtoVar;
        byte[] bArr2 = bArr;
        int i5 = i4;
        vx0 vx0Var2 = vx0Var;
        int q0 = q0(c2, wtoVar2, bArr2, i3, i5, vx0Var2);
        wtoVar2.a(c2);
        vx0Var2.c = c2;
        rseVar.add(c2);
        while (q0 < i5) {
            vx0 vx0Var3 = vx0Var2;
            int i6 = i5;
            int W = W(bArr2, q0, vx0Var3);
            if (i2 != vx0Var3.a) {
                break;
            }
            byte[] bArr3 = bArr2;
            wto wtoVar3 = wtoVar2;
            o3d c3 = wtoVar3.c();
            q0 = q0(c3, wtoVar3, bArr3, W, i6, vx0Var3);
            wtoVar2 = wtoVar3;
            bArr2 = bArr3;
            i5 = i6;
            vx0Var2 = vx0Var3;
            wtoVar2.a(c3);
            vx0Var2.c = c3;
            rseVar.add(c3);
        }
        return q0;
    }

    public static int U(int i2, byte[] bArr, int i3, int i4, lkt lktVar, vx0 vx0Var) {
        if ((i2 >>> 3) == 0) {
            throw bye.b();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int Y = Y(bArr, i3, vx0Var);
            lktVar.f(i2, Long.valueOf(vx0Var.b));
            return Y;
        }
        if (i5 == 1) {
            lktVar.f(i2, Long.valueOf(R(i3, bArr)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int W = W(bArr, i3, vx0Var);
            int i6 = vx0Var.a;
            if (i6 < 0) {
                throw bye.f();
            }
            if (i6 > bArr.length - W) {
                throw bye.h();
            }
            if (i6 == 0) {
                lktVar.f(i2, nn3.b);
            } else {
                lktVar.f(i2, nn3.n(bArr, W, i6));
            }
            return W + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw bye.b();
            }
            lktVar.f(i2, Integer.valueOf(Q(i3, bArr)));
            return i3 + 4;
        }
        lkt lktVar2 = new lkt();
        int i7 = (i2 & (-8)) | 4;
        int i8 = vx0Var.d + 1;
        vx0Var.d = i8;
        if (i8 >= 100) {
            throw new bye("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i9 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int W2 = W(bArr, i3, vx0Var);
            i9 = vx0Var.a;
            if (i9 == i7) {
                i3 = W2;
                break;
            }
            i3 = U(i9, bArr, W2, i4, lktVar2, vx0Var);
        }
        vx0Var.d--;
        if (i3 > i4 || i9 != i7) {
            throw bye.g();
        }
        lktVar.f(i2, lktVar2);
        return i3;
    }

    public static int V(int i2, byte[] bArr, int i3, vx0 vx0Var) {
        int i4 = i2 & 127;
        int i5 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            vx0Var.a = i4 | (b2 << 7);
            return i5;
        }
        int i6 = i4 | ((b2 & Byte.MAX_VALUE) << 7);
        int i7 = i3 + 2;
        byte b3 = bArr[i5];
        if (b3 >= 0) {
            vx0Var.a = i6 | (b3 << 14);
            return i7;
        }
        int i8 = i6 | ((b3 & Byte.MAX_VALUE) << 14);
        int i9 = i3 + 3;
        byte b4 = bArr[i7];
        if (b4 >= 0) {
            vx0Var.a = i8 | (b4 << 21);
            return i9;
        }
        int i10 = i8 | ((b4 & Byte.MAX_VALUE) << 21);
        int i11 = i3 + 4;
        byte b5 = bArr[i9];
        if (b5 >= 0) {
            vx0Var.a = i10 | (b5 << 28);
            return i11;
        }
        int i12 = i10 | ((b5 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i13 = i11 + 1;
            if (bArr[i11] >= 0) {
                vx0Var.a = i12;
                return i13;
            }
            i11 = i13;
        }
    }

    public static int W(byte[] bArr, int i2, vx0 vx0Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return V(b2, bArr, i3, vx0Var);
        }
        vx0Var.a = b2;
        return i3;
    }

    public static int X(int i2, byte[] bArr, int i3, int i4, rse rseVar, vx0 vx0Var) {
        ipe ipeVar = (ipe) rseVar;
        int W = W(bArr, i3, vx0Var);
        ipeVar.g(vx0Var.a);
        while (W < i4) {
            int W2 = W(bArr, W, vx0Var);
            if (i2 != vx0Var.a) {
                break;
            }
            W = W(bArr, W2, vx0Var);
            ipeVar.g(vx0Var.a);
        }
        return W;
    }

    public static int Y(byte[] bArr, int i2, vx0 vx0Var) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            vx0Var.b = j2;
            return i3;
        }
        int i4 = i2 + 2;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            i5 += 7;
            j3 |= (r10 & Byte.MAX_VALUE) << i5;
            b2 = bArr[i4];
            i4 = i6;
        }
        vx0Var.b = j3;
        return i4;
    }

    public static void Z(int i2, int i3, rnj rnjVar) {
        for (int i4 = 0; i4 < 8; i4++) {
            int i5 = i2 + i4;
            if (!n0(rnjVar.p(i5, i3))) {
                throw new k6w();
            }
            rnjVar.r(i5, i3, 0);
        }
    }

    public static final void a(final Function0 function0, yci yciVar, long j2, long j3, hq5 hq5Var, final int i2, final int i3) {
        yci yciVar2;
        final long j4;
        final long j5;
        final yci yciVar3;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1710520882);
        long j6 = j2;
        final long j7 = j3;
        int i4 = i2 | (oq5Var.h(function0) ? 4 : 2) | 48 | (((i3 & 4) == 0 && oq5Var.e(j6)) ? 256 : 128) | (((i3 & 8) == 0 && oq5Var.e(j7)) ? 2048 : 1024);
        if ((i4 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            j4 = j7;
            j5 = j6;
            yciVar3 = yciVar;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                if ((i3 & 4) != 0) {
                    j6 = ((dq0) oq5Var.j(eq0.a)).b.c;
                    i4 &= -897;
                }
                int i5 = i3 & 8;
                yciVar2 = vci.a;
                if (i5 != 0) {
                    j7 = ((dq0) oq5Var.j(eq0.a)).c.c;
                    i4 &= -7169;
                }
            } else {
                oq5Var.S();
                if ((i3 & 4) != 0) {
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    i4 &= -7169;
                }
                yciVar2 = yciVar;
            }
            oq5Var.q();
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var);
            }
            final uoi uoiVar = (uoi) K;
            h6g h6gVar = nu0.a;
            h6g h6gVar2 = h6g.c;
            final ges h2 = nu0.h();
            final yci yciVar4 = yciVar2;
            final long j8 = j6;
            zc4.m(j7, ild.C(1214646526, new Function2() { // from class: zi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    hq5 hq5Var2 = (hq5) obj;
                    if ((((Integer) obj2).intValue() & 3) == 2) {
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        if (oq5Var2.z()) {
                            oq5Var2.S();
                            return Unit.a;
                        }
                    }
                    meo meoVar = new meo(0);
                    yci yciVar5 = yci.this;
                    uoi uoiVar2 = uoiVar;
                    yci d2 = a.d(yciVar5, uoiVar2, null, false, null, meoVar, function0, 12);
                    kfh d3 = ug3.d(b2c.f, false);
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    int i6 = oq5Var3.P;
                    androidx.compose.runtime.internal.a l2 = oq5Var3.l();
                    yci H = vnj.H(hq5Var2, d2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(grbVar);
                    } else {
                        oq5Var3.n0();
                    }
                    kb5 kb5Var = wp5.f;
                    g0g.U(hq5Var2, d3, kb5Var);
                    kb5 kb5Var2 = wp5.e;
                    g0g.U(hq5Var2, l2, kb5Var2);
                    kb5 kb5Var3 = wp5.g;
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i6))) {
                        ouj.x(i6, oq5Var3, i6, kb5Var3);
                    }
                    kb5 kb5Var4 = wp5.d;
                    g0g.U(hq5Var2, H, kb5Var4);
                    b bVar = b.a;
                    vci vciVar = vci.a;
                    yci b2 = bVar.b(vciVar);
                    geo a2 = eeo.a(0.0f, 3, j7, false);
                    float f2 = 4;
                    float f3 = 2;
                    b2.getClass();
                    uoiVar2.getClass();
                    ug3.a(androidx.compose.foundation.layout.a.n(e.a(xp3.u(androidx.compose.ui.layout.a.b(b2, new mbh(f2, f3, 2)), ugo.a(f2)), uoiVar2, a2), f2, f3), hq5Var2, 0);
                    nho a3 = lho.a(qx0.a, b2c.l, hq5Var2, 48);
                    int i7 = oq5Var3.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var3.l();
                    yci H2 = vnj.H(hq5Var2, vciVar);
                    oq5Var3.d0();
                    if (oq5Var3.O) {
                        oq5Var3.k(grbVar);
                    } else {
                        oq5Var3.n0();
                    }
                    g0g.U(hq5Var2, a3, kb5Var);
                    g0g.U(hq5Var2, l3, kb5Var2);
                    if (oq5Var3.O || !Intrinsics.d(oq5Var3.K(), Integer.valueOf(i7))) {
                        ouj.x(i7, oq5Var3, i7, kb5Var3);
                    }
                    g0g.U(hq5Var2, H2, kb5Var4);
                    long j9 = j8;
                    ges gesVar = h2;
                    lg3.b(j9, gesVar, null, hq5Var2, 0);
                    u1g.l(hq5Var2, d.r(vciVar, f2));
                    gae.b(a0g.E(R.drawable.ic_erid_20, 0, hq5Var2), null, d.m(vciVar, w1g.p(gesVar, 0, hq5Var2, 0, 2)), j9, hq5Var2, 48, 0);
                    oq5Var3.p(true);
                    oq5Var3.p(true);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, ((i4 >> 9) & 14) | 48, 0);
            j4 = j7;
            j5 = j8;
            yciVar3 = yciVar4;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new Function2(yciVar3, j5, j4, i2, i3) { // from class: aj
                public final /* synthetic */ yci b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ int e;

                {
                    this.e = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(1);
                    lg3.a(Function0.this, this.b, this.c, this.d, (hq5) obj, R, this.e);
                    return Unit.a;
                }
            };
        }
    }

    public static void a0(int i2, int i3, rnj rnjVar) {
        for (int i4 = 0; i4 < 7; i4++) {
            int[] iArr = s[i4];
            for (int i5 = 0; i5 < 7; i5++) {
                rnjVar.r(i2 + i5, i3 + i4, iArr[i5]);
            }
        }
    }

    public static final void b(long j2, ges gesVar, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        yci yciVar2;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1459838046);
        int i3 = i2 | (oq5Var2.e(j2) ? 4 : 2) | (oq5Var2.f(gesVar) ? 32 : 16) | 384;
        if ((i3 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            String M = rvf.M(R.string.ad_title, oq5Var2);
            int i4 = 48 | ((i3 << 6) & 896);
            int i5 = ((i3 << 15) & 3670016) | 3120;
            vci vciVar = vci.a;
            oq5Var = oq5Var2;
            xv7.j(M, vciVar, j2, 0L, 0L, 3, 0L, 2, false, 1, 0, null, gesVar, oq5Var, i4, i5, 55032);
            yciVar2 = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new dj(j2, gesVar, yciVar2, i2);
        }
    }

    public static void b0(int i2, int i3, rnj rnjVar) {
        for (int i4 = 0; i4 < 7; i4++) {
            int i5 = i3 + i4;
            if (!n0(rnjVar.p(i2, i5))) {
                throw new k6w();
            }
            rnjVar.r(i2, i5, 0);
        }
    }

    public static final void c(jzb jzbVar, yci yciVar, long j2, hq5 hq5Var, int i2) {
        int i3;
        jzbVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1893828605);
        int i4 = i2 & 6;
        qho qhoVar = qho.a;
        if (i4 == 0) {
            i3 = (oq5Var.f(qhoVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.d(jzbVar.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.e(j2) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i2 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new qxb(16);
                oq5Var.k0(K);
            }
            q(jzbVar, qhoVar.c(yciVar, (Function1) K), j2, oq5Var, (i3 >> 3) & 910, 0);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new azb(jzbVar, yciVar, j2, i2, 0);
        }
    }

    public static final void c0(y8p y8pVar) {
        try {
            x.a.a(new y70((String) y8pVar.b, (Map) y8pVar.c));
        } catch (Exception e2) {
            Timber.w(e2, "failed sending %s", y8pVar);
        }
    }

    public static final void d(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-80642307);
        int i3 = 2;
        if (((i2 | 6) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            vci vciVar = vci.a;
            gae.b(a0g.E(R.drawable.ic_arrow_mid_right_24, 0, oq5Var), rvf.M(R.string.arrow_icon_go_description, oq5Var), d.m(vciVar, 24), ((dq0) oq5Var.j(eq0.a)).a.a, oq5Var, 0, 0);
            yciVar = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new cxd(yciVar, i2, i3);
        }
    }

    public static final void d0(String str) {
        Object obj = null;
        c0(new y8p(str, obj, false, 5));
    }

    public static final void e(pf1 pf1Var, rf1 rf1Var, yci yciVar, hq5 hq5Var, int i2) {
        vci vciVar;
        yci yciVar2;
        pf1Var.getClass();
        rf1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1163044905);
        int i3 = i2 | (oq5Var.f(pf1Var) ? 4 : 2) | (oq5Var.h(rf1Var) ? 32 : 16) | 384;
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            kg1 kg1Var = (kg1) szf.Q(rf1Var.a.n, oq5Var).getValue();
            vci vciVar2 = vci.a;
            yci d2 = d.d(androidx.compose.ui.platform.a.a(vciVar2, "block_pre_save"), 1.0f);
            kfh d3 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d3, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (kg1Var instanceof ig1) {
                oq5Var.Z(-62376760);
                f(0, oq5Var, null, ((ig1) kg1Var).a);
                oq5Var.p(false);
                vciVar = vciVar2;
            } else {
                if (!(kg1Var instanceof jg1)) {
                    throw vz1.i(oq5Var, -62378378, false);
                }
                oq5Var.Z(-62372064);
                jg1 jg1Var = (jg1) kg1Var;
                boolean h2 = oq5Var.h(rf1Var) | oq5Var.f(kg1Var);
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (h2 || K == kjnVar) {
                    K = new hb(21, rf1Var, jg1Var);
                    oq5Var.k0(K);
                }
                Function0 function0 = (Function0) K;
                boolean f2 = oq5Var.f(kg1Var) | oq5Var.h(rf1Var);
                Object K2 = oq5Var.K();
                if (f2 || K2 == kjnVar) {
                    K2 = new a3(19, jg1Var, rf1Var);
                    oq5Var.k0(K2);
                }
                yci b2 = com.yandex.music.core.ui.compose.a.b(vciVar2, null, 0L, 0.0f, null, (Function2) K2, 15);
                vciVar = vciVar2;
                g(pf1Var, jg1Var, function0, b2, oq5Var, i3 & 14);
                oq5Var.p(false);
            }
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new x3(pf1Var, rf1Var, yciVar2, i2, 27);
        }
    }

    public static final void e0(String str, Map map) {
        c0(new y8p(str, map, false, 5));
    }

    public static final void f(int i2, hq5 hq5Var, yci yciVar, boolean z) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1503804165);
        int i3 = (oq5Var.g(z) ? 4 : 2) | i2 | 48;
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i4 = i3 & 126;
            vci vciVar = vci.a;
            cb0.k(i4, oq5Var, vciVar, z);
            yciVar = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new q10(z, yciVar, i2, 1);
        }
    }

    public static lg3 f0(int i2, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i2 = 2;
        }
        if (i2 == 0) {
            return new pdi(dArr, dArr2);
        }
        if (i2 == 2) {
            double d2 = dArr[0];
            double[] dArr3 = dArr2[0];
            mw6 mw6Var = new mw6();
            mw6Var.y = d2;
            mw6Var.z = dArr3;
            return mw6Var;
        }
        l6g l6gVar = new l6g();
        int length = dArr2[0].length;
        l6gVar.A = new double[length];
        l6gVar.y = dArr;
        l6gVar.z = dArr2;
        if (length > 2) {
            double d3 = 0.0d;
            int i3 = 0;
            while (true) {
                double d4 = d3;
                if (i3 >= dArr.length) {
                    break;
                }
                double d5 = dArr2[i3][0];
                if (i3 > 0) {
                    Math.hypot(d5 - d3, d5 - d4);
                }
                i3++;
                d3 = d5;
            }
        }
        return l6gVar;
    }

    public static final void g(pf1 pf1Var, jg1 jg1Var, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(740603064);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(pf1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(jg1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(yciVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            g0g.k(jg1Var.a, androidx.compose.ui.platform.a.a(yciVar, "artist_upcoming_release_item"), null, ild.C(-1602581340, new x3(28, pf1Var, jg1Var, function0), oq5Var), oq5Var, 3072, 4);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new uu(pf1Var, jg1Var, false, function0, yciVar, i2, 8);
        }
    }

    public static final DisplayMetrics g0(Context context) {
        context.getClass();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        displayMetrics.getClass();
        return displayMetrics;
    }

    public static final void h(pf1 pf1Var, boolean z, Function0 function0, hq5 hq5Var, int i2) {
        pf1Var.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-76868125);
        int i3 = (oq5Var.f(pf1Var) ? 4 : 2) | i2 | (oq5Var.g(z) ? 32 : 16) | (oq5Var.h(function0) ? 256 : 128);
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            String M = rvf.M(R.string.menu_element_like, oq5Var);
            String M2 = rvf.M(pf1Var.m(z), oq5Var);
            yci m2 = d.m(vci.a, 40);
            boolean f2 = oq5Var.f(M2) | oq5Var.f(M);
            Object K = oq5Var.K();
            int i4 = 1;
            if (f2 || K == gq5.a) {
                K = new cb(M2, M, i4);
                oq5Var.k0(K);
            }
            aae.a(function0, com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(nfp.b(m2, true, (Function1) K), "presave_button"), "is_presaved", Boolean.valueOf(z)), false, ild.C(1526201031, new sm(5, z), oq5Var), oq5Var, ((i3 >> 6) & 14) | 24576, 12);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new oc1(pf1Var, z, function0, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(yci yciVar, d85 d85Var, g40 g40Var, uoi uoiVar, ryc rycVar, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        g40 g40Var2;
        int i4;
        int i5;
        ryc rycVar2;
        Object K;
        ryc rycVar3;
        long j2;
        float f2;
        float f3;
        int i6;
        boolean z;
        uoi uoiVar2;
        ryc rycVar4;
        xmn r2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1721987990);
        int i7 = (oq5Var.f(yciVar) ? 4 : 2) | i2 | (oq5Var.f(d85Var) ? 32 : 16);
        int i8 = i7 | 384;
        int i9 = i3 & 8;
        if (i9 != 0) {
            i8 = i7 | 3456;
        } else if ((i2 & 3072) == 0) {
            g40Var2 = g40Var;
            i8 |= oq5Var.f(g40Var2) ? 2048 : 1024;
            int i10 = i8 | 24576;
            i4 = i3 & 32;
            if (i4 == 0) {
                i5 = i8 | 221184;
                rycVar2 = rycVar;
            } else {
                ryc rycVar5 = rycVar;
                i5 = i10 | (oq5Var.h(rycVar5) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
                rycVar2 = rycVar5;
            }
            if ((599187 & i5) == 599186 || !oq5Var.z()) {
                if (i9 != 0) {
                    g40Var2 = b2c.b;
                }
                K = oq5Var.K();
                if (K == gq5.a) {
                    K = vz1.h(oq5Var);
                }
                uoi uoiVar3 = (uoi) K;
                rycVar3 = rycVar2;
                if (i4 != 0) {
                    rycVar3 = null;
                }
                if (d85Var != null) {
                    oq5Var.Z(-1268032110);
                    agr agrVar = eq0.a;
                    j2 = c3x.D(((dq0) oq5Var.j(agrVar)).c.c, ((dq0) oq5Var.j(agrVar)).c.a);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(-1268033381);
                    oq5Var.p(false);
                    j2 = d85Var.a;
                }
                p85 b0 = pd.b0(j2);
                float f4 = b0.a;
                f2 = b0.b + 0.1f;
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                f3 = b0.c - 0.06f;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                }
                int i11 = d85.o;
                long z2 = mvt.z(f4, f2, f3, 1.0f, 16);
                yci b2 = a.b(yciVar, j2, vnj.i);
                kfh d2 = ug3.d(g40Var2, false);
                i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l2 = oq5Var.l();
                yci H = vnj.H(oq5Var, b2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.n0();
                } else {
                    oq5Var.k(grbVar);
                }
                g0g.U(oq5Var, d2, wp5.f);
                g0g.U(oq5Var, l2, wp5.e);
                kb5 kb5Var = wp5.g;
                if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                if (rycVar3 == null) {
                    oq5Var.Z(1282346654);
                    rycVar3.invoke(b.a, uoiVar3, oq5Var, Integer.valueOf(((i5 >> 9) & 896) | 54));
                    z = false;
                } else {
                    z = false;
                    oq5Var.Z(1280779666);
                }
                oq5Var.p(z);
                zc4.m(z2, ild.C(1612152096, new fh3(uoiVar3, z2, wn5Var, 0), oq5Var), oq5Var, 48, 0);
                oq5Var.p(true);
                uoiVar2 = uoiVar3;
                rycVar4 = rycVar3;
            } else {
                oq5Var.S();
                uoiVar2 = uoiVar;
                rycVar4 = rycVar2;
            }
            ryc rycVar6 = rycVar4;
            g40 g40Var3 = g40Var2;
            r2 = oq5Var.r();
            if (r2 == null) {
                r2.d = new fd1(yciVar, d85Var, g40Var3, uoiVar2, rycVar6, wn5Var, i2, i3);
                return;
            }
            return;
        }
        g40Var2 = g40Var;
        int i102 = i8 | 24576;
        i4 = i3 & 32;
        if (i4 == 0) {
        }
        if ((599187 & i5) == 599186) {
        }
        if (i9 != 0) {
        }
        K = oq5Var.K();
        if (K == gq5.a) {
        }
        uoi uoiVar32 = (uoi) K;
        rycVar3 = rycVar2;
        if (i4 != 0) {
        }
        if (d85Var != null) {
        }
        p85 b02 = pd.b0(j2);
        float f42 = b02.a;
        f2 = b02.b + 0.1f;
        if (f2 > 1.0f) {
        }
        f3 = b02.c - 0.06f;
        if (f3 < 0.0f) {
        }
        int i112 = d85.o;
        long z22 = mvt.z(f42, f2, f3, 1.0f, 16);
        yci b22 = a.b(yciVar, j2, vnj.i);
        kfh d22 = ug3.d(g40Var2, false);
        i6 = oq5Var.P;
        androidx.compose.runtime.internal.a l22 = oq5Var.l();
        yci H2 = vnj.H(oq5Var, b22);
        xp5.T.getClass();
        grb grbVar2 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, d22, wp5.f);
        g0g.U(oq5Var, l22, wp5.e);
        kb5 kb5Var2 = wp5.g;
        if (!oq5Var.O) {
        }
        ouj.x(i6, oq5Var, i6, kb5Var2);
        g0g.U(oq5Var, H2, wp5.d);
        if (rycVar3 == null) {
        }
        oq5Var.p(z);
        zc4.m(z22, ild.C(1612152096, new fh3(uoiVar32, z22, wn5Var, 0), oq5Var), oq5Var, 48, 0);
        oq5Var.p(true);
        uoiVar2 = uoiVar32;
        rycVar4 = rycVar3;
        ryc rycVar62 = rycVar4;
        g40 g40Var32 = g40Var2;
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v6 */
    public static final void j(o54 o54Var, nb6 nb6Var, int i2, j54 j54Var, hvq hvqVar, zd3 zd3Var, zsq zsqVar, hq5 hq5Var, int i3) {
        boolean z;
        boolean z2;
        int i4;
        b bVar;
        vci vciVar;
        Object obj;
        ?? r5;
        iz2 iz2Var = b2c.c;
        hvqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(642699044);
        int i5 = i3 | (oq5Var.f(o54Var) ? 4 : 2) | (oq5Var.f(nb6Var) ? 32 : 16) | (oq5Var.d(i2) ? 256 : 128) | (oq5Var.h(j54Var) ? 2048 : 1024) | (oq5Var.h(hvqVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(zd3Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.f(zsqVar) ? 1048576 : 524288);
        if ((599187 & i5) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            float f2 = zd3Var != null ? zd3Var.a + xvq.c : gwq.a;
            vci vciVar2 = vci.a;
            yci e2 = d.e(androidx.compose.foundation.layout.a.o(d.d(vciVar2, 1.0f), xvq.d, 0.0f, 2), f2);
            kfh d2 = ug3.d(b2c.b, false);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, e2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, d2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            boolean z3 = o54Var.a && !((Boolean) ksw.K(oq5Var).getValue()).booleanValue();
            String str = o54Var.d.a;
            g24 g24Var = o54Var.e;
            Object obj2 = gq5.a;
            b bVar2 = b.a;
            if (z3) {
                oq5Var.Z(1596779097);
                if (o54Var.b) {
                    oq5Var.Z(1596783189);
                    if (zd3Var == null) {
                        oq5Var.Z(1596796518);
                        oq5Var.p(false);
                        r5 = 0;
                        vciVar = vciVar2;
                        obj = obj2;
                        bVar = bVar2;
                    } else {
                        oq5Var.Z(1596796519);
                        yci a2 = bVar2.a(vciVar2, iz2Var);
                        Object K = oq5Var.K();
                        if (K == obj2) {
                            i4 = 57344;
                            K = new h14(1);
                            oq5Var.k0(K);
                        } else {
                            i4 = 57344;
                        }
                        yci b2 = nfp.b(a2, false, (Function1) K);
                        int i7 = i5 >> 6;
                        int i8 = (i7 & 896) | (i5 & 112) | ((i5 << 3) & 7168) | (i7 & i4);
                        bVar = bVar2;
                        vciVar = vciVar2;
                        obj = obj2;
                        r5 = 0;
                        pd.d(zd3Var, nb6Var, hvqVar, i2, zsqVar, b2, oq5Var, i8);
                        oq5Var.p(false);
                    }
                    boolean f3 = oq5Var.f(str) | oq5Var.h(g24Var) | oq5Var.h(j54Var);
                    Object K2 = oq5Var.K();
                    if (f3 || K2 == obj) {
                        K2 = new vd(10, str, g24Var, j54Var);
                        oq5Var.k0(K2);
                    }
                    Function0 function0 = (Function0) K2;
                    yci a3 = bVar.a(vciVar, b2c.d);
                    Object K3 = oq5Var.K();
                    if (K3 == obj) {
                        K3 = new h14(2);
                        oq5Var.k0(K3);
                    }
                    bcx.g(function0, nfp.b(a3, r5, (Function1) K3), oq5Var, r5);
                    oq5Var.p(r5);
                    z2 = r5;
                    z = true;
                } else {
                    oq5Var.Z(1597904087);
                    z2 = false;
                    z = true;
                    pd.f(bVar2.a(vciVar2, iz2Var), ild.C(1331173074, new bj(str, g24Var, hvqVar, zsqVar, j54Var, 8), oq5Var), oq5Var, 48);
                    oq5Var.p(false);
                }
                oq5Var.p(z2);
            } else {
                z = true;
                oq5Var.Z(1599071795);
                if (zd3Var == null) {
                    oq5Var.Z(1599071794);
                } else {
                    oq5Var.Z(1599071795);
                    yci a4 = bVar2.a(vciVar2, iz2Var);
                    Object K4 = oq5Var.K();
                    if (K4 == obj2) {
                        K4 = new h14(3);
                        oq5Var.k0(K4);
                    }
                    yci b3 = nfp.b(a4, false, (Function1) K4);
                    int i9 = i5 & 112;
                    int i10 = i5 >> 6;
                    pd.d(zd3Var, nb6Var, hvqVar, i2, zsqVar, b3, oq5Var, i9 | (i10 & 896) | ((i5 << 3) & 7168) | (i10 & 57344));
                }
                oq5Var.p(false);
                oq5Var.p(false);
            }
            oq5Var.p(z);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new uu0(o54Var, nb6Var, i2, j54Var, hvqVar, zd3Var, zsqVar, i3);
        }
    }

    public static final void k(Object obj, boolean z, long j2, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1008625581);
        int i3 = i2 | (oq5Var.h(obj) ? 4 : 2) | (oq5Var.g(z) ? 32 : 16) | (oq5Var.e(j2) ? 256 : 128) | (oq5Var.f(yciVar) ? 2048 : 1024);
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            w1g.j(obj, null, null, null, null, null, null, 0.0f, null, 0, ild.C(-2089184973, new sd5(1, j2, yciVar, z), oq5Var), oq5Var, (i3 & 14) | 48, 1020);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ul3(obj, z, j2, yciVar, i2);
        }
    }

    public static final void l(String str, String str2, boolean z, long j2, obh obhVar, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        wn5 wn5Var;
        yci yciVar2;
        obhVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2002684159);
        int i3 = i2 | (oq5Var.f(str) ? 4 : 2) | (oq5Var.f(str2) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.e(j2) ? 2048 : 1024) | (oq5Var.h(obhVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function0) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | ScreenMirroringConfig.Video.BITRATE_1_5MB;
        if ((599187 & i3) == 599186 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            if (str != null) {
                oq5Var.Z(-572647207);
                wn5Var = ild.C(202824559, new sd5(0, j2, str, z), oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-572386683);
                oq5Var.p(false);
                wn5Var = null;
            }
            int i4 = i3 >> 6;
            vut.q(str2, j2, obhVar, function0, wn5Var, oq5Var, ((i3 >> 3) & 14) | (i4 & 112) | RemoteCameraConfig.Mic.BUFFER_SIZE | (i4 & 896) | (i4 & 7168) | 24576);
            yciVar2 = vci.a;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new td5(str, str2, z, j2, obhVar, function0, yciVar2, i2);
        }
    }

    public static final void m(pud pudVar, int i2, c26 c26Var, yci yciVar, hq5 hq5Var, int i3) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1757079531);
        int i4 = i3 | (oq5Var2.h(pudVar) ? 4 : 2) | (oq5Var2.d(i2) ? 32 : 16) | (oq5Var2.h(c26Var) ? 256 : 128) | (oq5Var2.f(yciVar) ? 2048 : 1024);
        if ((i4 & 1171) == 1170 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            ges j2 = nu0.j();
            ges i5 = nu0.i();
            boolean h2 = ((i4 & 14) == 4 || oq5Var2.h(pudVar)) | oq5Var2.h(c26Var) | ((i4 & 112) == 32);
            Object K = oq5Var2.K();
            if (h2 || K == gq5.a) {
                K = new g16(c26Var, pudVar, i2, 4);
                oq5Var2.k0(K);
            }
            wn5 C = ild.C(-1736681124, new up(c26Var, j2, i5, pudVar, 17), oq5Var2);
            oq5Var = oq5Var2;
            hdg.n(((i4 >> 6) & 112) | 384, 0, C, oq5Var, yciVar, (Function0) K);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new b3(pudVar, i2, c26Var, yciVar, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0086 A[Catch: all -> 0x0031, TryCatch #1 {all -> 0x0031, blocks: (B:11:0x002d, B:12:0x007e, B:14:0x0086, B:15:0x0091, B:22:0x00a1, B:24:0x006d, B:28:0x00a4, B:32:0x00a9, B:33:0x00aa, B:46:0x0067, B:17:0x0092, B:19:0x0098), top: B:7:0x0021, outer: #2, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab A[Catch: all -> 0x00b4, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00b4, blocks: (B:35:0x00ab, B:55:0x00b8, B:56:0x00bb, B:11:0x002d, B:12:0x007e, B:14:0x0086, B:15:0x0091, B:22:0x00a1, B:24:0x006d, B:28:0x00a4, B:32:0x00a9, B:33:0x00aa, B:46:0x0067, B:17:0x0092, B:19:0x0098, B:52:0x00b6), top: B:7:0x0021, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r6v4, types: [qln] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x007b -> B:12:0x007e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m0(cg6 cg6Var) {
        gmd gmdVar;
        int i2;
        zi3 g2;
        h5n h5nVar;
        si3 si3Var;
        AtomicBoolean atomicBoolean;
        boolean z;
        try {
            try {
                if (cg6Var instanceof gmd) {
                    gmdVar = (gmd) cg6Var;
                    int i3 = gmdVar.o;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        gmdVar.o = i3 - Integer.MIN_VALUE;
                        Object obj = gmdVar.n;
                        nm6 nm6Var = nm6.a;
                        i2 = gmdVar.o;
                        if (i2 != 0) {
                            qgg.h0(obj);
                            g2 = men.g(1, 6, null);
                            AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
                            sea seaVar = new sea(12, atomicBoolean2, g2);
                            synchronized (g2r.b) {
                                g2r.h = CollectionsKt.h0((Collection) g2r.h, seaVar);
                            }
                            g2r.a();
                            h5nVar = new h5n(12, seaVar);
                            si3Var = new si3(g2);
                            atomicBoolean = atomicBoolean2;
                            gmdVar.j = atomicBoolean;
                            gmdVar.k = h5nVar;
                            gmdVar.l = g2;
                            gmdVar.m = si3Var;
                            gmdVar.o = 1;
                            obj = si3Var.c(gmdVar);
                            g2 = g2;
                            if (obj == nm6Var) {
                            }
                            if (((Boolean) obj).booleanValue()) {
                            }
                        } else {
                            if (i2 != 1) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            si3Var = gmdVar.m;
                            ?? r6 = gmdVar.l;
                            h5nVar = gmdVar.k;
                            atomicBoolean = gmdVar.j;
                            qgg.h0(obj);
                            g2 = r6;
                            if (((Boolean) obj).booleanValue()) {
                                atomicBoolean.set(false);
                                synchronized (g2r.b) {
                                    upi upiVar = g2r.i.h;
                                    z = upiVar != null && upiVar.i();
                                }
                                if (z) {
                                    g2r.a();
                                }
                                gmdVar.j = atomicBoolean;
                                gmdVar.k = h5nVar;
                                gmdVar.l = g2;
                                gmdVar.m = si3Var;
                                gmdVar.o = 1;
                                obj = si3Var.c(gmdVar);
                                g2 = g2;
                                if (obj == nm6Var) {
                                    return nm6Var;
                                }
                                if (((Boolean) obj).booleanValue()) {
                                    g2.g(null);
                                    h5nVar.b();
                                    return Unit.a;
                                }
                            }
                        }
                    }
                }
                if (i2 != 0) {
                }
            } finally {
            }
        } catch (Throwable th) {
            h5nVar.b();
            throw th;
        }
        gmdVar = new gmd(cg6Var);
        Object obj2 = gmdVar.n;
        nm6 nm6Var2 = nm6.a;
        i2 = gmdVar.o;
    }

    public static final void n(m16 m16Var, List list, c26 c26Var, o3k o3kVar, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        List list2;
        int i4;
        q0k a2;
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(572971328);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(m16Var) : oq5Var.h(m16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            list2 = list;
            i3 |= oq5Var.f(list2) ? 32 : 16;
        } else {
            list2 = list;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(c26Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(o3kVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i5 = i3;
        if ((i5 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean booleanValue = ((Boolean) ksw.K(oq5Var).getValue()).booleanValue();
            boolean h2 = irv.h(oq5Var);
            ta5 a3 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i6 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            qs5 qs5Var = AndroidCompositionLocals_androidKt.a;
            float f2 = ((Configuration) oq5Var.j(qs5Var)).screenWidthDp;
            float f3 = ((Configuration) oq5Var.j(qs5Var)).screenHeightDp;
            cma cmaVar = new cma(0.5f * f2);
            cma cmaVar2 = new cma(f3 * 0.6f);
            if (cmaVar.compareTo(cmaVar2) > 0) {
                cmaVar = cmaVar2;
            }
            float f4 = cmaVar.a;
            if (h2) {
                a2 = androidx.compose.foundation.layout.a.a((f2 - f4) / 2, 0.0f, 2);
                i4 = 16;
            } else {
                i4 = 16;
                a2 = androidx.compose.foundation.layout.a.a(16, 0.0f, 2);
            }
            q0k q0kVar = a2;
            float f5 = i4;
            boolean z2 = !booleanValue;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new kz5(4);
                oq5Var.k0(K);
            }
            vci vciVar = vci.a;
            rvf.b(o3kVar, androidx.compose.ui.platform.a.a(nfp.b(vciVar, false, (Function1) K), "concert_landing_header_pager"), q0kVar, null, 0, f5, null, null, z2, null, null, null, ild.C(-1324478376, new f54(m16Var, c26Var, list2, h2, f4, o3kVar), oq5Var), oq5Var, ((i5 >> 9) & 14) | 196608, 3072, 7896);
            oq5Var = oq5Var;
            if (o3kVar.n() > 0) {
                oq5Var.Z(668469842);
                z = !c3x.L(oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-752270141);
                oq5Var.p(false);
                z = false;
            }
            if (z) {
                oq5Var.Z(-752229061);
                u1g.l(oq5Var, d.e(vciVar, 20));
                int j2 = o3kVar.j();
                int n2 = o3kVar.n();
                jx7 jx7Var = (jx7) oq5Var.j(es5.h);
                float n0 = jx7Var.n0(3);
                float n02 = jx7Var.n0(2);
                float n03 = jx7Var.n0(1);
                float n04 = jx7Var.n0(4);
                agr agrVar = eq0.a;
                m2k m2kVar = new m2k(n0, n02, n03, n04, ((dq0) oq5Var.j(agrVar)).a.c, ((dq0) oq5Var.j(agrVar)).a.a, 5);
                Object K2 = oq5Var.K();
                if (K2 == kjnVar) {
                    K2 = new kz5(5);
                    oq5Var.k0(K2);
                }
                ivf.j(j2, null, (Function1) K2, n2, m2kVar, null, oq5Var, 432, 32);
            } else {
                oq5Var.Z(-763924276);
            }
            oq5Var.p(false);
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new tu(m16Var, list, c26Var, o3kVar, yciVar, i2);
        }
    }

    public static boolean n0(int i2) {
        return i2 == -1;
    }

    public static final void o(m16 m16Var, c26 c26Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        kjn kjnVar;
        oq5 oq5Var;
        List list;
        m16Var.getClass();
        c26Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1539426819);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var2.f(m16Var) : oq5Var2.h(m16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(c26Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var2.f(yciVar2) ? 256 : 128;
        } else {
            yciVar2 = yciVar;
        }
        int i4 = i3;
        if ((i4 & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
        } else {
            boolean g2 = irv.g(oq5Var2);
            Boolean valueOf = Boolean.valueOf(g2);
            boolean g3 = oq5Var2.g(g2) | oq5Var2.h(c26Var);
            Object K = oq5Var2.K();
            kjn kjnVar2 = gq5.a;
            if (g3 || K == kjnVar2) {
                K = new k16(g2, c26Var, null, 0);
                oq5Var2.k0(K);
            }
            gld.w(oq5Var2, valueOf, (Function2) K);
            long a2 = bcb.a(oq5Var2);
            boolean z = false;
            if (((Boolean) oq5Var2.j(koe.a)).booleanValue()) {
                oq5Var2.Z(596864138);
                oq5Var2.p(false);
                list = c5b.a;
                oq5Var = oq5Var2;
                kjnVar = kjnVar2;
            } else {
                oq5Var2.Z(596912777);
                List list2 = m16Var.b;
                ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    ct5 ct5Var = ((pud) it.next()).d;
                    String str = ct5Var.a;
                    oq5 oq5Var3 = oq5Var2;
                    mud O = vnj.O(a2, new bud(c3x.U(ct5Var.b)), oq5Var3);
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(etn.f0(str, O, c26Var.h(), oq5Var3, 3072, 0));
                    kjnVar2 = kjnVar2;
                    arrayList = arrayList2;
                    a2 = a2;
                    oq5Var2 = oq5Var3;
                    it = it;
                    z = false;
                }
                kjnVar = kjnVar2;
                boolean z2 = z;
                oq5Var = oq5Var2;
                oq5Var.p(z2);
                list = arrayList;
            }
            int i5 = i4 & 14;
            boolean z3 = i5 == 4 || ((i4 & 8) != 0 && oq5Var.h(m16Var));
            Object K2 = oq5Var.K();
            if (z3 || K2 == kjnVar) {
                K2 = new r25(19, m16Var);
                oq5Var.k0(K2);
            }
            fp7 b2 = r3k.b(0, (Function0) K2, oq5Var, 0, 2);
            int i6 = i4 << 3;
            int i7 = i6 & 896;
            oq5 oq5Var4 = oq5Var;
            r(((Boolean) ksw.K(oq5Var).getValue()).booleanValue(), m16Var, c26Var, b2, oq5Var4, (i6 & 112) | 64 | i7);
            oq5Var2 = oq5Var4;
            if (g2) {
                oq5Var2.Z(597861904);
                int i8 = i4 << 6;
                z(m16Var, b2.j(), list, c26Var, yciVar2, oq5Var2, (57344 & i8) | 8 | i5 | (i8 & 7168));
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(598110276);
                n(m16Var, list, c26Var, b2, yciVar, oq5Var2, 8 | i5 | i7 | (57344 & (i4 << 6)));
                oq5Var2.p(false);
            }
        }
        xmn r2 = oq5Var2.r();
        if (r2 != null) {
            r2.d = new b3(m16Var, c26Var, yciVar, i2, 25);
        }
    }

    public static final boolean o0(unl unlVar) {
        whd whdVar;
        Object obj;
        unlVar.getClass();
        String playerType = unlVar.getPlayerType();
        if (playerType != null) {
            whd.c.getClass();
            Iterator it = whd.f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((whd) obj).a.equals(playerType)) {
                    break;
                }
            }
            whdVar = (whd) obj;
            if (whdVar == null) {
                whdVar = whd.d;
            }
        } else {
            whdVar = whd.d;
        }
        if (!whdVar.b) {
            return false;
        }
        String liveStreamText = unlVar.getLiveStreamText();
        String id = unlVar.getId();
        String type = unlVar.getType();
        mab entityInfo = unlVar.getEntityInfo();
        String id2 = entityInfo != null ? entityInfo.getId() : null;
        mab entityInfo2 = unlVar.getEntityInfo();
        List<String> h2 = u75.h(liveStreamText, id, type, id2, entityInfo2 != null ? entityInfo2.getType() : null);
        if ((h2 instanceof Collection) && h2.isEmpty()) {
            return false;
        }
        for (String str : h2) {
            if (str != null && !StringsKt.U(str)) {
                String liveStreamText2 = unlVar.getLiveStreamText();
                mab entityInfo3 = unlVar.getEntityInfo();
                String id3 = entityInfo3 != null ? entityInfo3.getId() : null;
                mab entityInfo4 = unlVar.getEntityInfo();
                List<String> h3 = u75.h(liveStreamText2, id3, entityInfo4 != null ? entityInfo4.getType() : null);
                if (!(h3 instanceof Collection) || !h3.isEmpty()) {
                    for (String str2 : h3) {
                        if (str2 != null && !StringsKt.U(str2)) {
                            break;
                        }
                    }
                }
                List h4 = u75.h(unlVar.getId(), unlVar.getType());
                if ((h4 instanceof Collection) && h4.isEmpty()) {
                    return false;
                }
                Iterator it2 = h4.iterator();
                while (it2.hasNext()) {
                    if (((String) it2.next()) == null) {
                        int ordinal = xp3.Q(unlVar).ordinal();
                        if (ordinal != 5) {
                            return ordinal != 7 || unlVar.getLiveStreamText() == null;
                        }
                        String liveStreamText3 = unlVar.getLiveStreamText();
                        mab entityInfo5 = unlVar.getEntityInfo();
                        List h5 = u75.h(liveStreamText3, entityInfo5 != null ? entityInfo5.getId() : null);
                        if ((h5 instanceof Collection) && h5.isEmpty()) {
                            return false;
                        }
                        Iterator it3 = h5.iterator();
                        while (it3.hasNext()) {
                            if (((String) it3.next()) == null) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static final void p(jzb jzbVar, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        Function0 function02;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1006078544);
        int i4 = (oq5Var.d(jzbVar.ordinal()) ? 4 : 2) | i2 | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            function02 = function0;
        } else {
            int ordinal = jzbVar.ordinal();
            if (ordinal == 0) {
                i3 = R.drawable.ic_explicit_16;
            } else if (ordinal == 1) {
                i3 = R.drawable.ic_explicit_age_16;
            } else {
                if (ordinal != 2) {
                    b6e.s();
                    return;
                }
                i3 = R.drawable.ic_universal_marking_16;
            }
            w4k E = a0g.E(i3, 0, oq5Var);
            String M = rvf.M(R.string.explicit_element_content_description, oq5Var);
            function02 = function0;
            gld.r(i4 & 112, oq5Var, com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(yciVar, "explicit"), "18+", Boolean.valueOf(jzbVar == jzb.d)), E, M, function02);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new v48(i2, 12, yciVar, jzbVar, function02);
        }
    }

    public static int p0(Object obj, wto wtoVar, byte[] bArr, int i2, int i3, int i4, vx0 vx0Var) {
        zzh zzhVar = (zzh) wtoVar;
        int i5 = vx0Var.d + 1;
        vx0Var.d = i5;
        if (i5 >= 100) {
            throw new bye("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int G = zzhVar.G(obj, bArr, i2, i3, i4, vx0Var);
        vx0Var.d--;
        vx0Var.c = obj;
        return G;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if ((r20 & 4) != 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(jzb jzbVar, yci yciVar, long j2, hq5 hq5Var, int i2, int i3) {
        int i4;
        long j3;
        int i5;
        long j4;
        int i6;
        jzbVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2033876211);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.d(jzbVar.ordinal()) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                j3 = j2;
                if (oq5Var.e(j3)) {
                    i6 = 256;
                    i4 |= i6;
                }
            } else {
                j3 = j2;
            }
            i6 = 128;
            i4 |= i6;
        } else {
            j3 = j2;
        }
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            j4 = j3;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                if ((i3 & 4) != 0) {
                    j3 = ((dq0) oq5Var.j(eq0.a)).a.c;
                    i4 &= -897;
                }
                long j5 = j3;
                oq5Var.q();
                int ordinal = jzbVar.ordinal();
                if (ordinal == 0) {
                    i5 = R.drawable.ic_explicit_16;
                } else if (ordinal == 1) {
                    i5 = R.drawable.ic_explicit_age_16;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return;
                    }
                    i5 = R.drawable.ic_universal_marking_16;
                }
                gae.b(a0g.E(i5, 0, oq5Var), rvf.M(R.string.explicit_element_content_description, oq5Var), com.yandex.music.core.ui.compose.b.c(androidx.compose.ui.platform.a.a(yciVar, "explicit"), "18+", Boolean.valueOf(jzbVar == jzb.d)), j5, oq5Var, (i4 << 3) & 7168, 0);
                j4 = j5;
            } else {
                oq5Var.S();
            }
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new p74(jzbVar, yciVar, j4, i2, i3, 3);
        }
    }

    public static int q0(Object obj, wto wtoVar, byte[] bArr, int i2, int i3, vx0 vx0Var) {
        int i4 = i2 + 1;
        int i5 = bArr[i2];
        if (i5 < 0) {
            i4 = V(i5, bArr, i4, vx0Var);
            i5 = vx0Var.a;
        }
        int i6 = i4;
        if (i5 < 0 || i5 > i3 - i6) {
            throw bye.h();
        }
        int i7 = vx0Var.d + 1;
        vx0Var.d = i7;
        if (i7 >= 100) {
            throw new bye("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i8 = i6 + i5;
        wtoVar.i(obj, bArr, i6, i8, vx0Var);
        vx0Var.d--;
        vx0Var.c = obj;
        return i8;
    }

    public static final void r(boolean z, m16 m16Var, c26 c26Var, o3k o3kVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(345004196);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? oq5Var.f(m16Var) : oq5Var.h(m16Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(c26Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(o3kVar) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Boolean valueOf = Boolean.valueOf(z);
            boolean h2 = ((i3 & 14) == 4) | oq5Var.h(c26Var);
            Object K = oq5Var.K();
            Continuation continuation = null;
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                K = new k16(z, c26Var, continuation, 1);
                oq5Var.k0(K);
            }
            gld.w(oq5Var, valueOf, (Function2) K);
            Integer valueOf2 = Integer.valueOf(m16Var.a);
            int i4 = i3 & 7168;
            boolean z2 = ((i3 & 112) == 32 || ((i3 & 64) != 0 && oq5Var.h(m16Var))) | (i4 == 2048);
            Object K2 = oq5Var.K();
            if (z2 || K2 == kjnVar) {
                K2 = new vv4(o3kVar, m16Var, continuation, 16);
                oq5Var.k0(K2);
            }
            gld.w(oq5Var, valueOf2, (Function2) K2);
            Unit unit = Unit.a;
            boolean h3 = oq5Var.h(c26Var) | (i4 == 2048);
            Object K3 = oq5Var.K();
            if (h3 || K3 == kjnVar) {
                K3 = new vv4(o3kVar, c26Var, continuation, 17);
                oq5Var.k0(K3);
            }
            gld.w(oq5Var, unit, (Function2) K3);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new pp(z, m16Var, c26Var, o3kVar, i2, 7);
        }
    }

    public static final long r0(pud pudVar, bs1 bs1Var, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        boolean g2 = ((ma5) oq5Var.j(pa5.a)).g();
        boolean g3 = ((((i2 & 14) ^ 6) > 4 && oq5Var.f(pudVar)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && oq5Var.f(bs1Var)) || (i2 & 48) == 32) | oq5Var.g(!g2);
        Object K = oq5Var.K();
        if (g3 || K == gq5.a) {
            K = new d85(bs1Var instanceof as1 ? pudVar.d.b : !g2 ? c3x.h(4280690214L) : c3x.h(4289901234L));
            oq5Var.k0(K);
        }
        return ((d85) K).a;
    }

    public static final void s(pud pudVar, m16 m16Var, c26 c26Var, int i2, List list, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        Object f16Var;
        int i5;
        pud pudVar2;
        int i6;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1102318739);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? oq5Var2.f(pudVar) : oq5Var2.h(pudVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? oq5Var2.f(m16Var) : oq5Var2.h(m16Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var2.h(c26Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var2.d(i2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= oq5Var2.f(list) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i3) == 0) {
            i4 |= oq5Var2.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i7 = i4;
        if ((74899 & i7) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            yci u2 = xp3.u(yciVar, bs4.d);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = new kz5(3);
                oq5Var2.k0(K);
            }
            yci b2 = nfp.b(u2, false, (Function1) K);
            int i8 = i7 & 14;
            int i9 = i7 & 7168;
            boolean h2 = oq5Var2.h(c26Var) | (i8 == 4 || ((i7 & 8) != 0 && oq5Var2.h(pudVar))) | (i9 == 2048) | ((i7 & 112) == 32 || ((i7 & 64) != 0 && oq5Var2.h(m16Var)));
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                i5 = i8;
                f16Var = new f16(c26Var, pudVar, i2, m16Var, 0);
                pudVar2 = pudVar;
                i6 = i2;
                oq5Var2.k0(f16Var);
            } else {
                pudVar2 = pudVar;
                i6 = i2;
                f16Var = K2;
                i5 = i8;
            }
            yci b3 = com.yandex.music.core.ui.compose.a.b(b2, null, 0L, 0.0f, null, (Function2) f16Var, 15);
            boolean h3 = oq5Var2.h(c26Var) | (i5 == 4 || ((i7 & 8) != 0 && oq5Var2.h(pudVar2))) | (i9 == 2048);
            Object K3 = oq5Var2.K();
            if (h3 || K3 == kjnVar) {
                K3 = new g16(c26Var, pudVar2, i6, 0);
                oq5Var2.k0(K3);
            }
            yci e2 = a.e(b3, false, null, null, (Function0) K3, 7);
            kfh d2 = ug3.d(b2c.f, false);
            int i10 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, e2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, d2, wp5.f);
            g0g.U(oq5Var2, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i10))) {
                ouj.x(i10, oq5Var2, i10, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            gvd gvdVar = (gvd) CollectionsKt.S(list, i6);
            int i11 = i5 | 8;
            long j2 = ((d85) bmq.b(r0(pudVar2, gvdVar != null ? gvdVar.d() : null, oq5Var2, i11), weo.S(200, 0, null, 6), null, oq5Var2, 48, 12).getValue()).a;
            gvd gvdVar2 = (gvd) CollectionsKt.S(list, i2);
            long j3 = ((d85) bmq.b(O(r0(pudVar2, gvdVar2 != null ? gvdVar2.d() : null, oq5Var2, i11)), weo.S(200, 0, null, 6), null, oq5Var2, 48, 12).getValue()).a;
            vci vciVar = vci.a;
            yci c2 = d.c(vciVar, 1.0f);
            boolean e3 = oq5Var2.e(j2);
            Object K4 = oq5Var2.K();
            if (e3 || K4 == kjnVar) {
                K4 = new nm0(j2, 2);
                oq5Var2.k0(K4);
            }
            t(list, i2, zsd.c0(c2, (Function0) K4), oq5Var2, ((i7 >> 12) & 14) | ((i7 >> 6) & 112));
            u(pudVar2, c26Var, j3, i2, androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.a.o(b.a.a(vciVar, b2c.i), 16, 0.0f, 2), 0.0f, 0.0f, 0.0f, 20, 7), oq5Var2, ((i7 >> 3) & 112) | i11 | i9);
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new cj(pudVar, m16Var, c26Var, i2, list, yciVar, i3, 5);
        }
    }

    public static final void t(List list, int i2, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1167060617);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.f(list) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else if (((Boolean) oq5Var.j(koe.a)).booleanValue()) {
            oq5Var.Z(-142407100);
            ug3.a(a.b(d.c(yciVar, 1.0f), d85.h, vnj.i), oq5Var, 0);
            oq5Var.p(false);
        } else {
            oq5Var.Z(-142240723);
            bs1 d2 = ((gvd) list.get(i2)).d();
            if (Intrinsics.d(d2, xr1.a) || (d2 instanceof yr1) || (d2 instanceof zr1)) {
                oq5Var.Z(-142046725);
                ivf.k(((i4 >> 3) & 112) | 6, 0, oq5Var, yciVar, false);
                oq5Var.p(false);
            } else {
                if (!(d2 instanceof as1)) {
                    throw vz1.i(oq5Var, -558777739, false);
                }
                oq5Var.Z(-141832081);
                irf.r(((as1) d2).a, null, yciVar, null, hd6.a, 0.0f, null, oq5Var, (i4 & 896) | 24624, 104);
                oq5Var.p(false);
            }
            oq5Var.p(false);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new uf4(list, i2, yciVar, i3, 2);
        }
    }

    public static int t0(int i2, byte[] bArr, int i3, int i4, vx0 vx0Var) {
        if ((i2 >>> 3) == 0) {
            throw bye.b();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            return Y(bArr, i3, vx0Var);
        }
        if (i5 == 1) {
            return i3 + 8;
        }
        if (i5 == 2) {
            return W(bArr, i3, vx0Var) + vx0Var.a;
        }
        if (i5 != 3) {
            if (i5 == 5) {
                return i3 + 4;
            }
            throw bye.b();
        }
        int i6 = (i2 & (-8)) | 4;
        int i7 = 0;
        while (i3 < i4) {
            i3 = W(bArr, i3, vx0Var);
            i7 = vx0Var.a;
            if (i7 == i6) {
                break;
            }
            i3 = t0(i7, bArr, i3, i4, vx0Var);
        }
        if (i3 > i4 || i7 != i6) {
            throw bye.g();
        }
        return i3;
    }

    public static final void u(pud pudVar, c26 c26Var, long j2, int i2, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        int i5;
        yci yciVar2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1719398006);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? oq5Var2.f(pudVar) : oq5Var2.h(pudVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var2.h(c26Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var2.e(j2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 = i2;
            i4 |= oq5Var2.d(i2) ? 2048 : 1024;
        } else {
            i5 = i2;
        }
        if ((i3 & 24576) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var2.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            yciVar2 = yciVar;
        }
        if ((i4 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            boolean b2 = c26Var.b();
            vci vciVar = vci.a;
            oq5Var = oq5Var2;
            jf0.a(new qzm[0], null, true, ild.C(-1849683730, new pb1(yciVar2, pudVar, c26Var, j2, i5, b2 ? d.u(vciVar, b2c.l, (r2 & 2) == 0) : d.e(vciVar, 46)), oq5Var2), oq5Var, 3072, 2);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new e16(pudVar, c26Var, j2, i2, yciVar, i3);
        }
    }

    public static final fkn u0(pjc pjcVar, mm6 mm6Var, Object obj) {
        pjcVar.getClass();
        mm6Var.getClass();
        return zsd.F0(pjcVar, mm6Var, lbq.a, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r11.K(), java.lang.Integer.valueOf(r10)) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v14, types: [yci] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void v(final pud pudVar, final c26 c26Var, final long j2, final int i2, final yci yciVar, hq5 hq5Var, final int i3) {
        kb5 kb5Var;
        int i4;
        kb5 kb5Var2;
        grb grbVar;
        kb5 kb5Var3;
        vci vciVar;
        kb5 kb5Var4;
        kb5 kb5Var5;
        kjn kjnVar;
        int i5;
        boolean z;
        Object K;
        int i6;
        boolean z2;
        xmn r2;
        Function2 function2;
        ct5 ct5Var = pudVar.d;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1339926187);
        int w2 = oq5Var.w();
        int i7 = i3 | (oq5Var.h(pudVar) ? 4 : 2) | (oq5Var.h(c26Var) ? 32 : 16) | (oq5Var.e(j2) ? 256 : 128) | (oq5Var.d(i2) ? 2048 : 1024);
        if ((i7 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            boolean b2 = c26Var.b();
            hz2 hz2Var = b2c.l;
            vci vciVar2 = vci.a;
            yci f2 = yciVar.f(b2 ? androidx.compose.foundation.layout.a.k(vciVar2, -5, 0.0f, 2) : vciVar2);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i8 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, f2);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var6 = wp5.f;
            g0g.U(oq5Var, a2, kb5Var6);
            kb5 kb5Var7 = wp5.e;
            g0g.U(oq5Var, l2, kb5Var7);
            kb5 kb5Var8 = wp5.g;
            if (oq5Var.O) {
                kb5Var = kb5Var7;
            } else {
                kb5Var = kb5Var7;
            }
            ouj.x(i8, oq5Var, i8, kb5Var8);
            kb5 kb5Var9 = wp5.d;
            g0g.U(oq5Var, H, kb5Var9);
            oq5Var.Z(-588391455);
            kjn kjnVar2 = gq5.a;
            if (b2) {
                i4 = w2;
                kb5Var2 = kb5Var9;
                grbVar = grbVar2;
                kb5Var3 = kb5Var6;
                vciVar = vciVar2;
                kb5Var4 = kb5Var8;
                kb5Var5 = kb5Var;
                oq5Var.Z(-587709084);
                String str = ct5Var.e;
                String str2 = ct5Var.f;
                String str3 = ct5Var.g;
                iu5 iu5Var = iu5.a;
                yci k2 = androidx.compose.foundation.layout.a.k(vciVar, 0.0f, 23, 1);
                int i9 = i7 & 14;
                boolean h2 = oq5Var.h(c26Var) | (i9 == 4 || oq5Var.h(pudVar)) | ((i7 & 7168) == 2048);
                Object K2 = oq5Var.K();
                if (h2) {
                    kjnVar = kjnVar2;
                } else {
                    kjnVar = kjnVar2;
                    if (K2 != kjnVar) {
                        i5 = i2;
                        yci e2 = a.e(k2, false, null, null, (Function0) K2, 7);
                        z = i9 != 4 || oq5Var.h(pudVar);
                        K = oq5Var.K();
                        if (!z || K == kjnVar) {
                            final int i10 = 1;
                            K = new Function1() { // from class: h16
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    int i11 = i10;
                                    jfp jfpVar = (jfp) obj;
                                    jfpVar.getClass();
                                    switch (i11) {
                                        case 0:
                                            wfp.k(jfpVar, pudVar.f);
                                            break;
                                        default:
                                            wfp.k(jfpVar, pudVar.f);
                                            break;
                                    }
                                    return Unit.a;
                                }
                            };
                            oq5Var.k0(K);
                        }
                        yci a3 = nfp.a(e2, (Function1) K);
                        i6 = i7;
                        qwp.t(str, str2, str3, iu5Var, a3, oq5Var, 3072);
                        oq5Var.p(false);
                    }
                }
                i5 = i2;
                K2 = new g16(c26Var, pudVar, i5, 2);
                oq5Var.k0(K2);
                yci e22 = a.e(k2, false, null, null, (Function0) K2, 7);
                if (i9 != 4) {
                }
                K = oq5Var.K();
                if (!z) {
                }
                final int i102 = 1;
                K = new Function1() { // from class: h16
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i11 = i102;
                        jfp jfpVar = (jfp) obj;
                        jfpVar.getClass();
                        switch (i11) {
                            case 0:
                                wfp.k(jfpVar, pudVar.f);
                                break;
                            default:
                                wfp.k(jfpVar, pudVar.f);
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var.k0(K);
                yci a32 = nfp.a(e22, (Function1) K);
                i6 = i7;
                qwp.t(str, str2, str3, iu5Var, a32, oq5Var, 3072);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-588482782);
                String str4 = ct5Var.e;
                String str5 = ct5Var.f;
                String str6 = ct5Var.g;
                int i11 = i7 & 14;
                boolean h3 = oq5Var.h(c26Var) | (i11 == 4 || oq5Var.h(pudVar)) | ((i7 & 7168) == 2048);
                Object K3 = oq5Var.K();
                if (h3 || K3 == kjnVar2) {
                    K3 = new g16(c26Var, pudVar, i2, 1);
                    oq5Var.k0(K3);
                }
                yci e3 = a.e(vciVar2, false, null, null, (Function0) K3, 7);
                boolean z3 = i11 == 4 || oq5Var.h(pudVar);
                Object K4 = oq5Var.K();
                if (z3 || K4 == kjnVar2) {
                    final int i12 = 0;
                    K4 = new Function1() { // from class: h16
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            int i112 = i12;
                            jfp jfpVar = (jfp) obj;
                            jfpVar.getClass();
                            switch (i112) {
                                case 0:
                                    wfp.k(jfpVar, pudVar.f);
                                    break;
                                default:
                                    wfp.k(jfpVar, pudVar.f);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    oq5Var.k0(K4);
                }
                i4 = w2;
                grbVar = grbVar2;
                kb5Var4 = kb5Var8;
                kb5Var5 = kb5Var;
                kb5Var2 = kb5Var9;
                kb5Var3 = kb5Var6;
                vciVar = vciVar2;
                qwp.l(str4, str5, str6, j2, nfp.a(e3, (Function1) K4), 0.0f, false, 0.0f, 0.0f, false, oq5Var, ((i7 << 3) & 7168) | ScreenMirroringConfig.Video.BITRATE_1_5MB, 928);
                oq5Var = oq5Var;
                vz1.B(vciVar, 16, oq5Var, false);
                i5 = i2;
                i6 = i7;
                kjnVar = kjnVar2;
            }
            lx0 lx0Var = qx0.e;
            vci j3 = b2 ? androidx.compose.foundation.layout.a.j(vciVar, -10, 10) : vciVar;
            int i13 = i6 & 14;
            boolean h4 = oq5Var.h(c26Var) | (i13 == 4 || oq5Var.h(pudVar)) | ((i6 & 7168) == 2048);
            Object K5 = oq5Var.K();
            if (h4 || K5 == kjnVar) {
                K5 = new g16(c26Var, pudVar, i5, 3);
                oq5Var.k0(K5);
            }
            yci e4 = a.e(j3, false, null, null, (Function0) K5, 7);
            ta5 a4 = sa5.a(lx0Var, b2c.n, oq5Var, 6);
            int i14 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, e4);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a4, kb5Var3);
            g0g.U(oq5Var, l3, kb5Var5);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i14))) {
                ouj.x(i14, oq5Var, i14, kb5Var4);
            }
            g0g.U(oq5Var, H2, kb5Var2);
            oq5Var.Z(-1717946171);
            if (!b2) {
                oq5Var.Z(-1717992579);
                w(pudVar, oq5Var, 8 | i13);
                oq5Var.t(i4);
                r2 = oq5Var.r();
                if (r2 != null) {
                    final int i15 = 0;
                    final int i16 = i5;
                    function2 = new Function2(pudVar, c26Var, j2, i16, yciVar, i3, i15) { // from class: i16
                        public final /* synthetic */ int a;
                        public final /* synthetic */ pud b;
                        public final /* synthetic */ c26 c;
                        public final /* synthetic */ long d;
                        public final /* synthetic */ int e;
                        public final /* synthetic */ yci f;

                        {
                            this.a = i15;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.a) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int R = rvf.R(24585);
                                    lg3.v(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int R2 = rvf.R(24585);
                                    lg3.v(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R2);
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    r2.d = function2;
                }
                return;
            }
            oq5Var.Z(-1737279725);
            oq5Var.p(false);
            oq5Var.Z(498775836);
            StringBuilder sb = new StringBuilder();
            String str7 = ct5Var.j;
            sb.append(j66.d0(ct5Var.n.d(), oq5Var));
            if (str7 != null) {
                sb.append(" • ".concat(str7));
            }
            String sb2 = sb.toString();
            oq5Var.p(false);
            float f3 = 4;
            yci q2 = androidx.compose.foundation.layout.a.q(d.d(vciVar, 1.0f), 0.0f, 0.0f, f3, 0.0f, 11);
            ges j4 = nu0.j();
            agr agrVar = eq0.a;
            vci vciVar3 = vciVar;
            oq5 oq5Var2 = oq5Var;
            xcs.b(sb2, q2, d85.b(((dq0) oq5Var.j(agrVar)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j4, oq5Var2, 48, 3120, 55288);
            bg3.a(null, null, false, ild.C(-1791418747, new j16(pudVar, 0), oq5Var2), oq5Var2, 3072, 7);
            float f4 = f3;
            u1g.l(oq5Var2, d.e(vciVar3, f4));
            String str8 = ct5Var.h;
            yci d2 = d.d(vciVar3, 1.0f);
            if (str7 != null) {
                z2 = false;
                f4 = 0;
            } else {
                z2 = false;
            }
            boolean z4 = z2;
            xcs.b(str8, androidx.compose.foundation.layout.a.q(d2, 0.0f, 0.0f, f4, 0.0f, 11), d85.b(((dq0) oq5Var2.j(agrVar)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var2, 0, 3120, 55288);
            oq5Var = oq5Var2;
            k5r.s(oq5Var, z4, true, z4, true);
        }
        r2 = oq5Var.r();
        if (r2 != null) {
            final int i17 = 1;
            function2 = new Function2(pudVar, c26Var, j2, i2, yciVar, i3, i17) { // from class: i16
                public final /* synthetic */ int a;
                public final /* synthetic */ pud b;
                public final /* synthetic */ c26 c;
                public final /* synthetic */ long d;
                public final /* synthetic */ int e;
                public final /* synthetic */ yci f;

                {
                    this.a = i17;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.a) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int R = rvf.R(24585);
                            lg3.v(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int R2 = rvf.R(24585);
                            lg3.v(this.b, this.c, this.d, this.e, this.f, (hq5) obj, R2);
                            break;
                    }
                    return Unit.a;
                }
            };
            r2.d = function2;
        }
    }

    public static final nek v0(lgb lgbVar) {
        int ordinal = lgbVar.a.ordinal();
        if (ordinal == 0) {
            return nek.a;
        }
        if (ordinal == 1) {
            return nek.b;
        }
        if (ordinal == 2) {
            return nek.c;
        }
        if (ordinal == 3) {
            return nek.d;
        }
        b6e.s();
        return null;
    }

    public static final void w(pud pudVar, hq5 hq5Var, int i2) {
        int i3;
        vci vciVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1996534121);
        if ((i2 & 6) == 0) {
            i3 = i2 | ((i2 & 8) == 0 ? oq5Var.f(pudVar) : oq5Var.h(pudVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            bg3.a(null, null, false, ild.C(-1406751231, new j16(pudVar, 1), oq5Var), oq5Var, 3072, 7);
            float f2 = 4;
            vci vciVar2 = vci.a;
            u1g.l(oq5Var, d.e(vciVar2, f2));
            yci d2 = d.d(vciVar2, 1.0f);
            x2i x2iVar = qx0.a;
            nho a2 = lho.a(x2iVar, b2c.k, oq5Var, 0);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, d2);
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
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            StringBuilder sb = new StringBuilder();
            ct5 ct5Var = pudVar.d;
            String str = ct5Var.i;
            String str2 = ct5Var.j;
            sb.append(ct5Var.h);
            if (!(str == null || StringsKt.U(str))) {
                sb.append(" • ");
                sb.append(str);
            }
            if (str2 != null) {
                sb.append(StringUtil.SPACE);
            }
            String sb2 = sb.toString();
            if (!(((double) 1.0f) > 0.0d)) {
                qme.a("invalid weight; must be greater than zero");
            }
            yci q2 = androidx.compose.foundation.layout.a.q(new LayoutWeightElement(false, 1.0f), 0.0f, 0.0f, str2 != null ? 0 : f2, 0.0f, 11);
            ges j2 = nu0.j();
            agr agrVar = eq0.a;
            float f3 = f2;
            xcs.b(sb2, q2, d85.b(((dq0) oq5Var.j(agrVar)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j2, oq5Var, 0, 3120, 55288);
            oq5Var = oq5Var;
            if (str2 == null) {
                oq5Var.Z(-314934840);
                oq5Var.p(false);
                vciVar = vciVar2;
            } else {
                oq5Var.Z(-314934839);
                f3 = f3;
                vciVar = vciVar2;
                xcs.b("• ".concat(str2), androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, f3, 0.0f, 11), d85.b(((dq0) oq5Var.j(agrVar)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, 48, 3120, 55288);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
            oq5Var.p(true);
            String str3 = ct5Var.k;
            if (str3 == null) {
                oq5Var.Z(-2038720026);
            } else {
                oq5Var.Z(-2038720025);
                hz2 hz2Var = b2c.l;
                yci a3 = androidx.compose.ui.platform.a.a(vciVar, "cashback");
                nho a4 = lho.a(x2iVar, hz2Var, oq5Var, 48);
                int i5 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, a3);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a4, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                    ouj.x(i5, oq5Var, i5, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                oq5 oq5Var2 = oq5Var;
                gae.b(a0g.E(R.drawable.ic_plus_12, 0, oq5Var), null, d.m(vciVar, 12), d85.b(((dq0) oq5Var.j(agrVar)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14), oq5Var2, 432, 0);
                u1g.l(oq5Var2, d.r(vciVar, f3));
                xcs.b(str3, null, d85.b(((dq0) oq5Var2.j(agrVar)).b.a, 0.9f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var2, 0, 3120, 55290);
                oq5Var = oq5Var2;
                oq5Var.p(true);
            }
            oq5Var.p(false);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new i4(pudVar, i2, 7);
        }
    }

    public static final void x(Function0 function0, Function0 function02, hq5 hq5Var, int i2) {
        int i3;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(703275161);
        int i4 = (oq5Var.h(function0) ? 4 : 2) | i2 | (oq5Var.h(function02) ? 32 : 16);
        if ((i4 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            i3 = 2;
        } else {
            vci vciVar = vci.a;
            float f2 = 16;
            yci m2 = androidx.compose.foundation.layout.a.m(d.d(vciVar, 1.0f), f2);
            ta5 a2 = sa5.a(qx0.c, b2c.o, oq5Var, 48);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, m2);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            irf.r(a0g.E(2131232645, 0, oq5Var), null, xp3.u(androidx.compose.foundation.layout.a.d(d.d(androidx.compose.foundation.layout.a.m(vciVar, f2), 1.0f), 1.9125f), ugo.a(8)), null, null, 0.0f, null, oq5Var, 48, 120);
            float f3 = 12;
            String o2 = vz1.o(vciVar, f3, oq5Var, R.string.shake_onboarding_title, oq5Var);
            ges c2 = nu0.c();
            agr agrVar = eq0.a;
            xv7.j(o2, null, ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 3, 0L, 0, false, 0, 0, null, c2, oq5Var, 0, 0, 65274);
            xv7.i(o8g.m(vz1.o(vciVar, f3, oq5Var, R.string.shake_onboarding_description2, oq5Var), 0L, oq5Var, 0, 1), wyf.C(vciVar, function02, 0.0f, 4, 10), ((dq0) oq5Var.j(agrVar)).b.b, 0L, 0L, 3, 0L, 0, false, 0, 0, null, null, nu0.j(), null, null, oq5Var, 0, 0, 917240);
            oq5Var = oq5Var;
            i3 = 2;
            hdg.o(vz1.o(vciVar, 24, oq5Var, R.string.shake_onboarding_primary_button, oq5Var), function0, d.t(vciVar, mu0.j, 0.0f, 2), 0.0f, oq5Var, (i4 << 3) & 112, 8);
            WeakHashMap weakHashMap = rqv.w;
            u1g.l(oq5Var, s7g.F(z7l.h(oq5Var).e));
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new w7a(function0, function02, i2, i3);
        }
    }

    public static final void y(jgf jgfVar, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        jgfVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1427752087);
        int i3 = (oq5Var.f(jgfVar) ? 4 : 2) | i2 | 48;
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            float f2 = 8;
            yciVar2 = vci.a;
            yci q2 = androidx.compose.foundation.layout.a.q(androidx.compose.foundation.layout.a.o(yciVar2, 0.0f, f2, 1), f2, 0.0f, 12, 0.0f, 10);
            nho a2 = lho.a(qx0.g(f2), b2c.l, oq5Var, 54);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, q2);
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
            g0g.U(oq5Var, l2, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            C(null, oq5Var, 0);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(false, 1.0f);
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l3 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, layoutWeightElement);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var);
            g0g.U(oq5Var, l3, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            E(jgfVar, null, oq5Var, i3 & 14);
            F(null, oq5Var, 0);
            oq5Var.p(true);
            d(null, oq5Var, 0);
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new t1b(jgfVar, yciVar2, i2, 21);
        }
    }

    public static final void z(m16 m16Var, int i2, List list, c26 c26Var, yci yciVar, hq5 hq5Var, int i3) {
        int i4;
        Object f16Var;
        pud pudVar;
        int i5;
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1130259309);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? oq5Var.f(m16Var) : oq5Var.h(m16Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.d(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.f(list) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.h(c26Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pud pudVar2 = (pud) CollectionsKt.S(m16Var.b, i2);
            if (pudVar2 == null) {
                oq5Var.Z(988850823);
                oq5Var.p(false);
            } else {
                oq5Var.Z(988850824);
                gvd gvdVar = (gvd) CollectionsKt.S(list, i2);
                bs1 d2 = gvdVar != null ? gvdVar.d() : null;
                long j2 = ((d85) bmq.b(r0(pudVar2, d2, oq5Var, 8), weo.S(200, 0, null, 6), null, oq5Var, 48, 12).getValue()).a;
                long j3 = ((d85) bmq.b(O(r0(pudVar2, d2, oq5Var, 8)), weo.S(200, 0, null, 6), null, oq5Var, 48, 12).getValue()).a;
                boolean e2 = oq5Var.e(j2);
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (e2 || K == kjnVar) {
                    K = new nm0(j2, 3);
                    oq5Var.k0(K);
                }
                yci t2 = wyf.t(yciVar, (Function0) K);
                boolean z2 = true;
                boolean h2 = oq5Var.h(c26Var) | oq5Var.h(pudVar2) | ((i4 & 112) == 32);
                if ((i4 & 14) != 4 && ((i4 & 8) == 0 || !oq5Var.h(m16Var))) {
                    z2 = false;
                }
                boolean z3 = h2 | z2;
                Object K2 = oq5Var.K();
                if (z3 || K2 == kjnVar) {
                    pudVar = pudVar2;
                    i5 = i4;
                    z = false;
                    f16Var = new f16(c26Var, pudVar, i2, m16Var, 1);
                    oq5Var.k0(f16Var);
                } else {
                    i5 = i4;
                    f16Var = K2;
                    pudVar = pudVar2;
                    z = false;
                }
                yci o2 = androidx.compose.foundation.layout.a.o(com.yandex.music.core.ui.compose.a.b(t2, null, 0L, 0.0f, null, (Function2) f16Var, 15), 128, 0.0f, 2);
                float f2 = 32;
                u(pudVar, c26Var, j3, i2, androidx.compose.foundation.layout.a.q(o2, 0.0f, f2, 0.0f, f2, 5), oq5Var, 8 | ((i5 >> 6) & 112) | ((i5 << 6) & 7168));
                oq5Var.p(z);
            }
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new hq(m16Var, i2, list, c26Var, yciVar, i3, 6);
        }
    }

    public abstract double h0(double d2);

    public abstract void i0(double d2, double[] dArr);

    public abstract void j0(double d2, float[] fArr);

    public abstract void k0(double d2, double[] dArr);

    public abstract double[] l0();

    public abstract Object s0(vn4 vn4Var, jtc jtcVar, Continuation continuation);
}
