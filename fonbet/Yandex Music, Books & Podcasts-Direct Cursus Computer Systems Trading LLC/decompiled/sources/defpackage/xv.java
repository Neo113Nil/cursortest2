package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Binder;
import android.os.Build;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.music.core.ui.compose.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.music.R;
import ru.yandex.music.data.stores.WebPath$Storage;
import ru.yandex.music.kids.KidsCatalogActivity;
import ru.yandex.music.ui.view.RoundedOutlineProviderImageView;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

/* loaded from: classes3.dex */
public abstract class xv {
    public static final Continuation[] a = new Continuation[0];
    public static final wn5 b = new wn5(new go5(0), 590268614, false);
    public static final wn5 c = new wn5(new go5(1), 613320021, false);
    public static final wn5 d = new wn5(new lo5(13), 1086168572, false);
    public static final wn5 e = new wn5(new wo5(20), 10695009, false);
    public static final wn5 f = new wn5(new wo5(21), 1976297130, false);
    public static final wn5 g = new wn5(new wo5(22), -1663201629, false);
    public static final Class[] h = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final mj i = new mj(20);
    public static final Object j = new Object();

    public static final Point A(View view, View view2, iu9 iu9Var, xzb xzbVar) {
        int i2;
        int height;
        ow8 ow8Var;
        ow8 ow8Var2;
        int[] iArr = new int[2];
        view2.getLocationInWindow(iArr);
        int i3 = 0;
        Point point = new Point(iArr[0], iArr[1]);
        szb szbVar = iu9Var.k;
        bf9 bf9Var = iu9Var.j;
        hu9 hu9Var = (hu9) szbVar.a(xzbVar);
        int i4 = point.x;
        switch (hu9Var.ordinal()) {
            case 0:
            case 1:
            case 7:
                i2 = -view.getWidth();
                break;
            case 2:
            case 6:
            case 8:
                i2 = (view2.getWidth() - view.getWidth()) / 2;
                break;
            case 3:
            case 4:
            case 5:
                i2 = view2.getWidth();
                break;
            default:
                b6e.s();
                return null;
        }
        point.x = i4 + i2;
        int i5 = point.y;
        switch (hu9Var.ordinal()) {
            case 0:
            case 4:
            case 8:
                height = (view2.getHeight() - view.getHeight()) / 2;
                break;
            case 1:
            case 2:
            case 3:
                height = -view.getHeight();
                break;
            case 5:
            case 6:
            case 7:
                height = view2.getHeight();
                break;
            default:
                b6e.s();
                return null;
        }
        point.y = i5 + height;
        DisplayMetrics displayMetrics = view2.getResources().getDisplayMetrics();
        point.x += (bf9Var == null || (ow8Var2 = bf9Var.a) == null) ? 0 : bg3.f0(ow8Var2, displayMetrics, xzbVar);
        int i6 = point.y;
        if (bf9Var != null && (ow8Var = bf9Var.b) != null) {
            i3 = bg3.f0(ow8Var, displayMetrics, xzbVar);
        }
        point.y = i6 + i3;
        return point;
    }

    public static final boolean C(Object obj) {
        if (obj instanceof l2r) {
            l2r l2rVar = (l2r) obj;
            if (l2rVar.f() == wvo.e || l2rVar.f() == ehv.h || l2rVar.f() == rwd.h) {
                Object value = l2rVar.getValue();
                if (value == null) {
                    return true;
                }
                return C(value);
            }
        } else {
            if ((obj instanceof syc) && (obj instanceof Serializable)) {
                return false;
            }
            for (int i2 = 0; i2 < 7; i2++) {
                if (h[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void D(la5 la5Var, gc8 gc8Var) {
        if (Intrinsics.d(la5Var, la5.c)) {
            gc8Var.I(new IllegalStateException("Colors for linear gradient are not provided. Please check if 'colors' or 'color_map' properties are defined"));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress E(int i2, int i3, String str) {
        int i4;
        byte[] bArr = new byte[16];
        int i5 = i2;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            if (i5 >= i3) {
                break;
            }
            if (i6 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i3 && c.u(i5, str, "::", false)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                i7 = i6;
                if (i9 == i3) {
                    break;
                }
                i8 = i9;
                int i10 = 0;
                i5 = i8;
                while (i5 < i3) {
                }
                i4 = i5 - i8;
                return i4 == 0 ? null : null;
            }
            if (i6 != 0) {
                if (c.u(i5, str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
                    i5++;
                } else {
                    if (!c.u(i5, str, ".", false)) {
                        return null;
                    }
                    int i11 = i6 - 2;
                    int i12 = i11;
                    while (i8 < i3) {
                        if (i12 == 16) {
                            return null;
                        }
                        if (i12 != i11) {
                            if (str.charAt(i8) != '.') {
                                return null;
                            }
                            i8++;
                        }
                        int i13 = 0;
                        int i14 = i8;
                        while (i14 < i3) {
                            char charAt = str.charAt(i14);
                            if (Intrinsics.e(charAt, 48) < 0 || Intrinsics.e(charAt, 57) > 0) {
                                break;
                            }
                            if ((i13 == 0 && i8 != i14) || ((i13 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i14++;
                        }
                        if (i14 - i8 == 0) {
                            return null;
                        }
                        bArr[i12] = (byte) i13;
                        i12++;
                        i8 = i14;
                    }
                    if (i12 != i6 + 2) {
                        return null;
                    }
                    i6 += 2;
                }
            }
            i8 = i5;
            int i102 = 0;
            i5 = i8;
            while (i5 < i3) {
                int r = cvt.r(str.charAt(i5));
                if (r == -1) {
                    break;
                }
                i102 = (i102 << 4) + r;
                i5++;
            }
            i4 = i5 - i8;
            if (i4 == 0 && i4 <= 4) {
                int i15 = i6 + 1;
                bArr[i6] = (byte) (255 & (i102 >>> 8));
                i6 += 2;
                bArr[i15] = (byte) (i102 & KotlinVersion.MAX_COMPONENT_VALUE);
            }
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i16 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i16, i16);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static final void F(ldi ldiVar, md mdVar, z2a z2aVar) {
        if (mdVar != null) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            ldiVar.b(mdVar, z2aVar, e5bVar);
        }
    }

    public static final void G(jpa jpaVar, float f2, long j2, amr amrVar) {
        jpaVar.getClass();
        float f3 = 2;
        float f4 = amrVar.a / f3;
        float d2 = nmq.d(jpaVar.e()) - (f3 * f4);
        jpaVar.V(j2, 270.0f, f2, false, swf.i(f4, f4), a4g.i(d2, d2), (r26 & 64) != 0 ? 1.0f : 0.0f, (r26 & 128) != 0 ? dbc.a : amrVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
    
        if (r2.emit(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0070 A[Catch: all -> 0x0034, TRY_LEAVE, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x002e, B:14:0x0053, B:20:0x0068, B:22:0x0070, B:32:0x0045, B:34:0x004f), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0082 -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object H(rjc rjcVar, qln qlnVar, boolean z, Continuation continuation) {
        rkc rkcVar;
        int i2;
        si3 it;
        si3 si3Var;
        rjc rjcVar2;
        Object c2;
        try {
            if (continuation instanceof rkc) {
                rkcVar = (rkc) continuation;
                int i3 = rkcVar.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    rkcVar.o = i3 - Integer.MIN_VALUE;
                    Object obj = rkcVar.n;
                    nm6 nm6Var = nm6.a;
                    i2 = rkcVar.o;
                    if (i2 != 0) {
                        qgg.h0(obj);
                        zsd.f0(rjcVar);
                        it = qlnVar.iterator();
                        rkcVar.j = rjcVar;
                        rkcVar.k = qlnVar;
                        rkcVar.l = it;
                        rkcVar.m = z;
                        rkcVar.o = 1;
                        c2 = it.c(rkcVar);
                        if (c2 != nm6Var) {
                        }
                    } else if (i2 == 1) {
                        z = rkcVar.m;
                        si3Var = rkcVar.l;
                        qlnVar = rkcVar.k;
                        rjcVar2 = rkcVar.j;
                        qgg.h0(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i2 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = rkcVar.m;
                        si3Var = rkcVar.l;
                        qlnVar = rkcVar.k;
                        rjcVar2 = rkcVar.j;
                        qgg.h0(obj);
                        it = si3Var;
                        rjcVar = rjcVar2;
                        rkcVar.j = rjcVar;
                        rkcVar.k = qlnVar;
                        rkcVar.l = it;
                        rkcVar.m = z;
                        rkcVar.o = 1;
                        c2 = it.c(rkcVar);
                        if (c2 != nm6Var) {
                            return nm6Var;
                        }
                        rjcVar2 = rjcVar;
                        si3Var = it;
                        obj = c2;
                        if (((Boolean) obj).booleanValue()) {
                            if (z) {
                                qlnVar.g(null);
                            }
                            return Unit.a;
                        }
                        Object d2 = si3Var.d();
                        rkcVar.j = rjcVar2;
                        rkcVar.k = qlnVar;
                        rkcVar.l = si3Var;
                        rkcVar.m = z;
                        rkcVar.o = 2;
                    }
                }
            }
            if (i2 != 0) {
            }
        } finally {
        }
        rkcVar = new rkc(continuation);
        Object obj2 = rkcVar.n;
        nm6 nm6Var2 = nm6.a;
        i2 = rkcVar.o;
    }

    public static final View I(View view, String str) {
        if (Intrinsics.d(view.getTag(), str)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        c7 c7Var = new c7(8, (ViewGroup) view);
        while (c7Var.hasNext()) {
            View I = I((View) c7Var.next(), str);
            if (I != null) {
                return I;
            }
        }
        return null;
    }

    public static final Pair J(View view, String str) {
        Object tag = view.getTag(R.id.div_tooltips_tag);
        List<iu9> list = tag instanceof List ? (List) tag : null;
        if (list != null) {
            for (iu9 iu9Var : list) {
                if (Intrinsics.d(iu9Var.h, str)) {
                    return new Pair(iu9Var, view);
                }
            }
        }
        if (view instanceof ViewGroup) {
            c7 c7Var = new c7(8, (ViewGroup) view);
            while (c7Var.hasNext()) {
                Pair J = J((View) c7Var.next(), str);
                if (J != null) {
                    return J;
                }
            }
        }
        return null;
    }

    public static final long K(jil jilVar) {
        wxk wxkVar;
        un6 b2;
        Integer num;
        iil iilVar = jilVar instanceof iil ? (iil) jilVar : null;
        return (iilVar == null || (wxkVar = (wxk) iilVar.a.b.a) == null || (b2 = wxkVar.b()) == null || (num = b2.c) == null) ? oa5.a : c3x.f(num.intValue());
    }

    public static final String L(uy uyVar) {
        if (uyVar instanceof ly) {
            return "branded_buttons";
        }
        if (uyVar instanceof ny) {
            return "donation_carousel_block";
        }
        if (uyVar instanceof oy) {
            return "duplicate_albums";
        }
        if (uyVar instanceof py) {
            return "more_albums";
        }
        if (uyVar instanceof qy) {
            return "albums_same_genre";
        }
        if (uyVar instanceof ry) {
            return "similar_entities";
        }
        if (uyVar instanceof sy) {
            return "album_tracks";
        }
        if (uyVar instanceof ty) {
            return "vibe_button_block";
        }
        if (uyVar.equals(my.a)) {
            return "disable_offline_block";
        }
        b6e.s();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x024e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean M(jc8 jc8Var) {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        List list10;
        List list11;
        List list12;
        List list13;
        List list14;
        List list15;
        List list16;
        List list17;
        List list18;
        List list19;
        List list20;
        List list21;
        List t = jc8Var.d().t();
        if (t == null || t.isEmpty()) {
            if (jc8Var instanceof cb8) {
                jt8 jt8Var = ((cb8) jc8Var).c;
                if (jt8Var.b == null && (((list19 = jt8Var.d) == null || list19.isEmpty()) && (((list20 = jt8Var.r) == null || list20.isEmpty()) && ((list21 = jt8Var.G) == null || list21.isEmpty())))) {
                    List list22 = jt8Var.B;
                    if (list22 != null) {
                        List list23 = list22;
                        if (!(list23 instanceof Collection) || !list23.isEmpty()) {
                            Iterator it = list23.iterator();
                            while (it.hasNext()) {
                                if (M((jc8) it.next())) {
                                }
                            }
                        }
                    }
                    return false;
                }
            } else {
                if (jc8Var instanceof db8) {
                    List list24 = ((db8) jc8Var).c.q;
                    if (list24 != null) {
                        List list25 = list24;
                        if (!(list25 instanceof Collection) || !list25.isEmpty()) {
                            Iterator it2 = list25.iterator();
                            while (it2.hasNext()) {
                                if (M((jc8) it2.next())) {
                                }
                            }
                        }
                    }
                    return false;
                }
                if (jc8Var instanceof eb8) {
                    return true;
                }
                if (jc8Var instanceof fb8) {
                    i19 i19Var = ((fb8) jc8Var).c;
                    if (i19Var.b == null && (((list16 = i19Var.d) == null || list16.isEmpty()) && (((list17 = i19Var.q) == null || list17.isEmpty()) && ((list18 = i19Var.A) == null || list18.isEmpty())))) {
                        return false;
                    }
                } else if (jc8Var instanceof gb8) {
                    w19 w19Var = ((gb8) jc8Var).c;
                    if (w19Var.b == null && (((list13 = w19Var.d) == null || list13.isEmpty()) && (((list14 = w19Var.q) == null || list14.isEmpty()) && ((list15 = w19Var.A) == null || list15.isEmpty())))) {
                        List list26 = w19Var.y;
                        if (list26 != null) {
                            List list27 = list26;
                            if (!(list27 instanceof Collection) || !list27.isEmpty()) {
                                Iterator it3 = list27.iterator();
                                while (it3.hasNext()) {
                                    if (M((jc8) it3.next())) {
                                    }
                                }
                            }
                        }
                        return false;
                    }
                } else if (jc8Var instanceof hb8) {
                    i29 i29Var = ((hb8) jc8Var).c;
                    if (i29Var.b != null || (((list10 = i29Var.d) != null && !list10.isEmpty()) || (((list11 = i29Var.r) != null && !list11.isEmpty()) || ((list12 = i29Var.D) != null && !list12.isEmpty())))) {
                    }
                } else {
                    if (jc8Var instanceof ib8) {
                        return false;
                    }
                    if ((jc8Var instanceof jb8) || (jc8Var instanceof kb8) || (jc8Var instanceof lb8)) {
                        return true;
                    }
                    if (jc8Var instanceof mb8) {
                        ri9 ri9Var = ((mb8) jc8Var).c;
                        if (ri9Var.b != null || (((list7 = ri9Var.d) != null && !list7.isEmpty()) || (((list8 = ri9Var.o) != null && !list8.isEmpty()) || ((list9 = ri9Var.x) != null && !list9.isEmpty())))) {
                        }
                    } else {
                        if (jc8Var instanceof nb8) {
                            return true;
                        }
                        if (jc8Var instanceof ob8) {
                            dm9 dm9Var = ((ob8) jc8Var).c;
                            if (dm9Var.b == null && (((list4 = dm9Var.d) == null || list4.isEmpty()) && (((list5 = dm9Var.q) == null || list5.isEmpty()) && ((list6 = dm9Var.z) == null || list6.isEmpty())))) {
                                List list28 = dm9Var.I;
                                if (!(list28 instanceof Collection) || !list28.isEmpty()) {
                                    Iterator it4 = list28.iterator();
                                    while (it4.hasNext()) {
                                        jc8 jc8Var2 = ((cm9) it4.next()).c;
                                        if (jc8Var2 == null || !M(jc8Var2)) {
                                        }
                                    }
                                }
                                return false;
                            }
                        } else {
                            if ((jc8Var instanceof pb8) || (jc8Var instanceof qb8)) {
                                return true;
                            }
                            if (!(jc8Var instanceof rb8)) {
                                if (jc8Var instanceof sb8) {
                                    return false;
                                }
                                b6e.s();
                                return false;
                            }
                            xq9 xq9Var = ((rb8) jc8Var).c;
                            if (xq9Var.b != null || (((list = xq9Var.d) != null && !list.isEmpty()) || (((list2 = xq9Var.o) != null && !list2.isEmpty()) || ((list3 = xq9Var.J) != null && !list3.isEmpty())))) {
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public static Intent N(Context context, String str, String str2) {
        context.getClass();
        Intent putExtra = new Intent(context, (Class<?>) KidsCatalogActivity.class).putExtra("kids.landing.tab.id", str).putExtra("kids.landing.block.id", str2).putExtra("kids.landing.back.nav", true);
        putExtra.getClass();
        return putExtra;
    }

    public static final long O(long j2, long j3) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final pj2 P(sdr sdrVar, hq5 hq5Var) {
        sdrVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (K == kjnVar) {
            K = bmq.a(K((jil) sdrVar.getValue()));
            oq5Var.k0(K);
        }
        fk0 fk0Var = (fk0) K;
        boolean f2 = oq5Var.f(sdrVar) | oq5Var.h(fk0Var);
        Object K2 = oq5Var.K();
        if (f2 || K2 == kjnVar) {
            K2 = new cs1(sdrVar, fk0Var, null, 5);
            oq5Var.k0(K2);
        }
        gld.w(oq5Var, sdrVar, (Function2) K2);
        boolean f3 = oq5Var.f(fk0Var);
        Object K3 = oq5Var.K();
        if (f3 || K3 == kjnVar) {
            K3 = new pj2(fk0Var);
            oq5Var.k0(K3);
        }
        return (pj2) K3;
    }

    public static final long Q(long j2) {
        return (Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (j2 >> 32))) << 32);
    }

    public static final void R(View view, zb zbVar) {
        if (view != null && zbVar.a(view.getContext())) {
            view.sendAccessibilityEventUnchecked(Build.VERSION.SDK_INT >= 30 ? bb.c() : AccessibilityEvent.obtain(32));
        }
    }

    public static final void S(RoundedOutlineProviderImageView roundedOutlineProviderImageView) {
        roundedOutlineProviderImageView.getClass();
        roundedOutlineProviderImageView.setCornerRadius(roundedOutlineProviderImageView.getContext().getResources().getDimensionPixelSize(R.dimen.juicy_bottom_sheet_cover_corners_radius));
    }

    public static final String T(String str) {
        int i2;
        str.getClass();
        int i3 = 0;
        int i4 = -1;
        if (StringsKt.M(str, StringUtils.PROCESS_POSTFIX_DELIMITER, false)) {
            InetAddress E = (c.v(str, "[", false) && c.n(str, "]", false)) ? E(1, str.length() - 1, str) : E(0, str.length(), str);
            if (E != null) {
                byte[] address = E.getAddress();
                if (address.length != 16) {
                    if (address.length == 4) {
                        return E.getHostAddress();
                    }
                    xq0.w(ouj.k('\'', "Invalid IPv6 address: '", str));
                    return null;
                }
                int i5 = 0;
                int i6 = 0;
                while (i5 < address.length) {
                    int i7 = i5;
                    while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                        i7 += 2;
                    }
                    int i8 = i7 - i5;
                    if (i8 > i6 && i8 >= 4) {
                        i4 = i5;
                        i6 = i8;
                    }
                    i5 = i7 + 2;
                }
                hi3 hi3Var = new hi3();
                while (i3 < address.length) {
                    if (i3 == i4) {
                        hi3Var.M0(58);
                        i3 += i6;
                        if (i3 == 16) {
                            hi3Var.M0(58);
                        }
                    } else {
                        if (i3 > 0) {
                            hi3Var.M0(58);
                        }
                        byte b2 = address[i3];
                        byte[] bArr = cvt.a;
                        hi3Var.O0(((b2 & 255) << 8) | (address[i3 + 1] & 255));
                        i3 += 2;
                    }
                }
                return hi3Var.G0();
            }
        } else {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() != 0) {
                    int length = lowerCase.length();
                    for (0; i2 < length; i2 + 1) {
                        char charAt = lowerCase.charAt(i2);
                        i2 = (Intrinsics.e(charAt, 31) > 0 && Intrinsics.e(charAt, 127) < 0 && StringsKt.S(" #%/:?@[\\]", charAt, 0, 6) == -1) ? i2 + 1 : 0;
                    }
                    return lowerCase;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public static final f3p U(oq oqVar, e4p e4pVar) {
        oqVar.getClass();
        return new f3p(oqVar, e4pVar);
    }

    public static final p0p V(n5p n5pVar) {
        if (n5pVar instanceof j5p) {
            switch (wj6.a[((j5p) n5pVar).b.d().ordinal()]) {
                case 1:
                    return p0p.h;
                case 2:
                    return p0p.i;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return p0p.g;
                default:
                    b6e.s();
                    return null;
            }
        }
        if (n5pVar instanceof m5p) {
            return ((m5p) n5pVar).c;
        }
        if (n5pVar instanceof k5p) {
            return p0p.j;
        }
        if (n5pVar instanceof l5p) {
            return ((l5p) n5pVar).b;
        }
        b6e.s();
        return null;
    }

    public static final i4p W(ipg ipgVar, e4p e4pVar) {
        ipgVar.getClass();
        if (ipgVar instanceof bpg) {
            return new f3p(((bpg) ipgVar).b, e4pVar);
        }
        if (ipgVar instanceof cpg) {
            return new g3p(((cpg) ipgVar).b, e4pVar);
        }
        if (ipgVar instanceof dpg) {
            return new b4p(((dpg) ipgVar).b, e4pVar);
        }
        if (ipgVar instanceof epg) {
            return new a4p(((epg) ipgVar).b, e4pVar);
        }
        if (ipgVar instanceof fpg) {
            return new c4p(((fpg) ipgVar).b, e4pVar);
        }
        if (ipgVar instanceof gpg) {
            return new f4p(((gpg) ipgVar).b, e4pVar);
        }
        if (ipgVar instanceof hpg) {
            return new h4p(((hpg) ipgVar).b, e4pVar);
        }
        b6e.s();
        return null;
    }

    public static final f4p X(mqs mqsVar, e4p e4pVar) {
        mqsVar.getClass();
        return new f4p(mqsVar, e4pVar);
    }

    public static final List Y(int i2, int i3, ArrayList arrayList, List list) {
        if (arrayList.isEmpty()) {
            return c5b.a;
        }
        ArrayList y0 = CollectionsKt.y0(list);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            vtf vtfVar = (vtf) arrayList.get(i4);
            int index = vtfVar.getIndex();
            if (i2 <= index && index <= i3) {
                y0.add(vtfVar);
            }
        }
        y75.s(y0, i);
        return y0;
    }

    public static final void a(List list, fvf fvfVar, dib dibVar, eoe eoeVar, hq5 hq5Var, int i2) {
        int i3;
        fvf fvfVar2;
        float f2 = edo.b;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(363423729);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(list) : oq5Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            fvfVar2 = fvfVar;
            i3 |= oq5Var.f(fvfVar2) ? 32 : 16;
        } else {
            fvfVar2 = fvfVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(dibVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.c(f2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(eoeVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            jx7 jx7Var = (jx7) oq5Var.j(es5.h);
            Unit unit = Unit.a;
            boolean h2 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && oq5Var.h(list))) | oq5Var.h(dibVar) | oq5Var.f(jx7Var) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((i3 & 112) == 32);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                ov ovVar = new ov(dibVar, list, jx7Var, fvfVar2, eoeVar, (Continuation) null);
                oq5Var.k0(ovVar);
                K = ovVar;
            }
            gld.w(oq5Var, unit, (Function2) K);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu(list, fvfVar, dibVar, eoeVar, i2);
        }
    }

    public static final void b(yv yvVar, j00 j00Var, gvd gvdVar, hq5 hq5Var, int i2) {
        gvdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(700897625);
        int i3 = (oq5Var.h(yvVar) ? 4 : 2) | i2 | (oq5Var.f(j00Var) ? 32 : 16) | (oq5Var.f(gvdVar) ? 256 : 128);
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            boolean f2 = oq5Var.f(yvVar);
            Object K = oq5Var.K();
            if (f2 || K == gq5.a) {
                n8g b2 = t75.b();
                ly lyVar = yvVar.d;
                if (lyVar != null) {
                    b2.add(lyVar);
                }
                b2.add(yvVar.f);
                ry ryVar = yvVar.c;
                if (ryVar != null) {
                    b2.add(ryVar);
                }
                ny nyVar = yvVar.e;
                if (nyVar != null) {
                    b2.add(nyVar);
                }
                ty tyVar = yvVar.g;
                if (tyVar != null) {
                    b2.add(tyVar);
                }
                oy oyVar = yvVar.h;
                if (oyVar != null) {
                    b2.add(oyVar);
                }
                qy qyVar = yvVar.i;
                if (qyVar != null) {
                    b2.add(qyVar);
                }
                py pyVar = yvVar.j;
                if (pyVar != null) {
                    b2.add(pyVar);
                }
                my myVar = yvVar.k;
                if (myVar != null) {
                    b2.add(myVar);
                }
                K = t75.a(b2);
                oq5Var.k0(K);
            }
            c((List) K, yvVar.a, yvVar.b, gvdVar, j00Var, oq5Var, ((i3 << 3) & 7168) | ((i3 << 9) & 57344));
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x3(yvVar, j00Var, gvdVar, i2, 7);
        }
    }

    public static final void c(final List list, lt ltVar, final iab iabVar, final gvd gvdVar, final j00 j00Var, hq5 hq5Var, int i2) {
        int i3;
        iab iabVar2;
        Object obj;
        j00 j00Var2;
        boolean h2;
        Object K;
        boolean h3;
        Object K2;
        list.getClass();
        gvdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(350738844);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(list) : oq5Var.h(list) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(ltVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(iabVar) : oq5Var.h(iabVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(gvdVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (i2 & SQLiteDatabase.OPEN_NOMUTEX) == 0 ? oq5Var.f(j00Var) : oq5Var.h(j00Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        int i4 = i3;
        if (oq5Var.P(i4 & 1, (i4 & 9363) != 9362)) {
            float f2 = edo.b;
            final fvf a2 = hvf.a(0, 0, oq5Var, 0, 3);
            final tvd X = zwf.X(a2, oq5Var, 6);
            WeakHashMap weakHashMap = rqv.w;
            final eoe n = p6g.n(z7l.h(oq5Var).f, oq5Var);
            String str = iabVar.h;
            jbu jbuVar = str != null ? new jbu(str) : null;
            l13 l13Var = j00Var.c.o.a;
            final aqi J = hyf.J(jbuVar, ((iau) l13Var.a.D(hag.I(iau.class), l13Var, l13Var.b)).a(), oq5Var, 0);
            boolean z = (i4 & 7168) == 2048;
            Object K3 = oq5Var.K();
            Object obj2 = gq5.a;
            if (z || K3 == obj2) {
                K3 = new hab(gvdVar);
                oq5Var.k0(K3);
            }
            final hab habVar = (hab) K3;
            boolean h4 = oq5Var.h(habVar) | ((i4 & 896) == 256 || ((i4 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0 && oq5Var.h(iabVar)));
            Object K4 = oq5Var.K();
            if (h4 || K4 == obj2) {
                K4 = new uv(0, habVar, iabVar);
                oq5Var.k0(K4);
            }
            final Function0 function0 = (Function0) K4;
            boolean c2 = oq5Var.c(f2) | oq5Var.f(n);
            Object K5 = oq5Var.K();
            if (c2 || K5 == obj2) {
                K5 = new mv(n, 0);
                oq5Var.k0(K5);
            }
            final ea2 v = u2x.v(a2, (Function1) K5, oq5Var);
            final jab jabVar = new jab(qkb.Header, 1, 1, 1);
            j00Var.a(jabVar);
            final thj w = c3x.w(ltVar, 0, 0);
            kfh d2 = ug3.d(b2c.b, false);
            int i5 = oq5Var.P;
            a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            int i6 = 0;
            etn.t(a2, v, oq5Var, 0);
            Continuation continuation = null;
            a(list, a2, j00Var.p, n, oq5Var, i4 & 14);
            j0q j0qVar = j00Var.r;
            int i7 = 57344 & i4;
            boolean h5 = oq5Var.h(jabVar) | (i7 == 16384 || ((i4 & SQLiteDatabase.OPEN_NOMUTEX) != 0 && oq5Var.h(j00Var))) | oq5Var.h(w);
            Object K6 = oq5Var.K();
            if (h5 || K6 == obj2) {
                K6 = new rr(j00Var, jabVar, w, 8);
                oq5Var.k0(K6);
            }
            y5g.j(j0qVar, (Function0) K6, oq5Var, 0);
            Object[] objArr = new Object[0];
            Object K7 = oq5Var.K();
            if (K7 == obj2) {
                K7 = new s2(16);
                oq5Var.k0(K7);
            }
            final poi poiVar = (poi) o2g.g0(objArr, null, (Function0) K7, oq5Var, 0, 6);
            Unit unit = Unit.a;
            boolean f3 = oq5Var.f(poiVar);
            Object K8 = oq5Var.K();
            if (f3 || K8 == obj2) {
                K8 = new qv(poiVar, continuation, i6);
                oq5Var.k0(K8);
            }
            gld.w(oq5Var, unit, (Function2) K8);
            boolean z2 = false;
            iabVar2 = iabVar;
            bg3.a(androidx.compose.ui.platform.a.a(d.c(vciVar, 1.0f), "album_screen_success"), null, false, ild.C(1244160832, new pyc() { // from class: nv
                @Override // defpackage.pyc
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    List list2;
                    oq5 oq5Var2;
                    final androidx.compose.foundation.layout.c cVar = (androidx.compose.foundation.layout.c) obj3;
                    hq5 hq5Var2 = (hq5) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    cVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((oq5) hq5Var2).f(cVar) ? 4 : 2;
                    }
                    oq5 oq5Var3 = (oq5) hq5Var2;
                    if (oq5Var3.P(intValue & 1, (intValue & 19) != 18)) {
                        yci a3 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "lazy_column");
                        vm C = ghh.C(ghh.C(androidx.compose.foundation.layout.a.c(0.0f, 0.0f, 0.0f, 16, 7), zs4.g(oq5Var3)), ogp.A(oq5Var3));
                        final Function0 function02 = function0;
                        boolean f4 = oq5Var3.f(function02);
                        final j00 j00Var3 = j00Var;
                        boolean h6 = f4 | oq5Var3.h(j00Var3);
                        final jab jabVar2 = jabVar;
                        boolean h7 = h6 | oq5Var3.h(jabVar2);
                        final thj thjVar = w;
                        boolean h8 = h7 | oq5Var3.h(thjVar);
                        final tvd tvdVar = X;
                        boolean f5 = h8 | oq5Var3.f(tvdVar);
                        final sdr sdrVar = J;
                        boolean f6 = f5 | oq5Var3.f(sdrVar);
                        final iab iabVar3 = iabVar;
                        boolean h9 = f6 | oq5Var3.h(iabVar3);
                        final gvd gvdVar2 = gvdVar;
                        boolean f7 = h9 | oq5Var3.f(gvdVar2);
                        boolean z3 = false;
                        final hab habVar2 = habVar;
                        boolean h10 = f7 | oq5Var3.h(habVar2);
                        int i8 = intValue;
                        List list3 = list;
                        boolean h11 = h10 | oq5Var3.h(list3);
                        if ((i8 & 14) == 4) {
                            z3 = true;
                        }
                        final poi poiVar2 = poiVar;
                        boolean f8 = h11 | z3 | oq5Var3.f(poiVar2);
                        final fvf fvfVar = fvf.this;
                        boolean f9 = f8 | oq5Var3.f(fvfVar);
                        final eoe eoeVar = n;
                        boolean f10 = f9 | oq5Var3.f(eoeVar);
                        Object K9 = oq5Var3.K();
                        if (f10) {
                            list2 = list3;
                        } else {
                            list2 = list3;
                            if (K9 != gq5.a) {
                                oq5Var2 = oq5Var3;
                                weo.f(a3, fvfVar, C, null, null, v, false, null, (Function1) K9, oq5Var2, 6, 440);
                            }
                        }
                        final List list4 = list2;
                        oq5Var2 = oq5Var3;
                        K9 = new Function1() { // from class: vu
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:13:0x0119  */
                            /* JADX WARN: Removed duplicated region for block: B:17:0x0133  */
                            /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Throwable] */
                            @Override // kotlin.jvm.functions.Function1
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object invoke(Object obj6) {
                                qkb qkbVar;
                                int size;
                                final j00 j00Var4;
                                int i9;
                                final int i10;
                                int i11;
                                int i12;
                                vuf vufVar = (vuf) obj6;
                                vufVar.getClass();
                                final Function0 function03 = function02;
                                j00 j00Var5 = j00Var3;
                                final jab jabVar3 = jabVar2;
                                final thj thjVar2 = thjVar;
                                final j00 j00Var6 = j00Var5;
                                final tvd tvdVar2 = tvdVar;
                                final iab iabVar4 = iabVar3;
                                final gvd gvdVar3 = gvdVar2;
                                final hab habVar3 = habVar2;
                                final sdr sdrVar2 = sdrVar;
                                pyc pycVar = new pyc() { // from class: wu
                                    @Override // defpackage.pyc
                                    public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                        hq5 hq5Var3 = (hq5) obj8;
                                        int intValue2 = ((Integer) obj9).intValue();
                                        ((androidx.compose.foundation.lazy.a) obj7).getClass();
                                        oq5 oq5Var4 = (oq5) hq5Var3;
                                        if (oq5Var4.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                            j00 j00Var7 = j00Var6;
                                            jab jabVar4 = jabVar3;
                                            thj thjVar3 = thjVar2;
                                            tvd tvdVar3 = tvdVar2;
                                            iab iabVar5 = iabVar4;
                                            gvd gvdVar4 = gvdVar3;
                                            hab habVar4 = habVar3;
                                            Function0 function04 = Function0.this;
                                            u2x.o(function04, ild.C(1676734117, new fv(j00Var7, jabVar4, thjVar3, tvdVar3, iabVar5, gvdVar4, habVar4, function04, sdrVar2, 0), oq5Var4), oq5Var4, 48);
                                        } else {
                                            oq5Var4.S();
                                        }
                                        return Unit.a;
                                    }
                                };
                                final int i13 = 1;
                                wn5 wn5Var = new wn5(pycVar, 1285437899, true);
                                Function1 function1 = null;
                                vuf.Y(vufVar, null, wn5Var, 3);
                                List list5 = list4;
                                final int i14 = 0;
                                int i15 = 0;
                                for (Object obj7 : list5) {
                                    int i16 = i15 + 1;
                                    if (i15 < 0) {
                                        ?? r17 = function1;
                                        u75.n();
                                        throw r17;
                                    }
                                    final uy uyVar = (uy) obj7;
                                    uyVar.getClass();
                                    boolean z4 = uyVar instanceof ly;
                                    if (z4) {
                                        qkbVar = qkb.BrandedButtons;
                                    } else if (uyVar instanceof ny) {
                                        qkbVar = qkb.Donations;
                                    } else if (uyVar instanceof oy) {
                                        qkbVar = qkb.OtherAlbumVersions;
                                    } else if (uyVar instanceof py) {
                                        qkbVar = qkb.OtherAlbums;
                                    } else if (uyVar instanceof qy) {
                                        qkbVar = qkb.GenreAlbums;
                                    } else if (uyVar instanceof ry) {
                                        qkbVar = qkb.GenreAlbums;
                                    } else if (uyVar instanceof sy) {
                                        qkbVar = qkb.Tracks;
                                    } else if (uyVar instanceof ty) {
                                        qkbVar = qkb.MyWave;
                                    } else {
                                        if (!(uyVar instanceof my)) {
                                            Function1 function12 = function1;
                                            b6e.s();
                                            return function12;
                                        }
                                        qkbVar = qkb.OfflineMode;
                                    }
                                    if (!z4) {
                                        if (uyVar instanceof ny) {
                                            size = ((ny) uyVar).a.a.size();
                                        } else if (uyVar instanceof oy) {
                                            size = ((oy) uyVar).a.size();
                                        } else if (uyVar instanceof py) {
                                            size = ((py) uyVar).a.b.size();
                                        } else if (uyVar instanceof qy) {
                                            size = ((qy) uyVar).a.b.size();
                                        } else if (uyVar instanceof ry) {
                                            size = ((ry) uyVar).a.size();
                                        } else if (uyVar instanceof sy) {
                                            size = ((sy) uyVar).a.size();
                                        } else if (!(uyVar instanceof ty) && !(uyVar instanceof my)) {
                                            Function1 function13 = function1;
                                            b6e.s();
                                            return function13;
                                        }
                                        final jab jabVar4 = new jab(qkbVar, 1, i15 + 2, size);
                                        j00Var6.a(jabVar4);
                                        Function1 function14 = function1;
                                        final int i17 = 2;
                                        vuf.Y(vufVar, k5r.i(i15, "leading_spacer_"), new wn5(new gv(i15, i14), -1835696831, true), 2);
                                        if (!z4) {
                                            vuf.Y(vufVar, xv.L(uyVar), new wn5(new pyc() { // from class: xu
                                                @Override // defpackage.pyc
                                                public final Object invoke(Object obj8, Object obj9, Object obj10) {
                                                    int i18 = i14;
                                                    final int i19 = 2;
                                                    kjn kjnVar = gq5.a;
                                                    vci vciVar2 = vci.a;
                                                    final jab jabVar5 = jabVar4;
                                                    final j00 j00Var7 = j00Var6;
                                                    uy uyVar2 = uyVar;
                                                    final int i20 = 1;
                                                    switch (i18) {
                                                        case 0:
                                                            hq5 hq5Var3 = (hq5) obj9;
                                                            int intValue2 = ((Integer) obj10).intValue();
                                                            ((androidx.compose.foundation.lazy.a) obj8).getClass();
                                                            oq5 oq5Var4 = (oq5) hq5Var3;
                                                            if (oq5Var4.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                                te teVar = ((ly) uyVar2).a;
                                                                thj v2 = qwp.v(teVar);
                                                                vci vciVar3 = vci.a;
                                                                yci d3 = d.d(vciVar3, 1.0f);
                                                                kfh d4 = ug3.d(b2c.f, false);
                                                                int i21 = oq5Var4.P;
                                                                a l2 = oq5Var4.l();
                                                                yci H2 = vnj.H(oq5Var4, d3);
                                                                xp5.T.getClass();
                                                                grb grbVar2 = wp5.b;
                                                                oq5Var4.d0();
                                                                if (oq5Var4.O) {
                                                                    oq5Var4.k(grbVar2);
                                                                } else {
                                                                    oq5Var4.n0();
                                                                }
                                                                g0g.U(oq5Var4, d4, wp5.f);
                                                                g0g.U(oq5Var4, l2, wp5.e);
                                                                kb5 kb5Var2 = wp5.g;
                                                                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i21))) {
                                                                    ouj.x(i21, oq5Var4, i21, kb5Var2);
                                                                }
                                                                g0g.U(oq5Var4, H2, wp5.d);
                                                                String str2 = teVar.a;
                                                                d85 d85Var = teVar.b;
                                                                float f11 = qbb.c;
                                                                yci q = androidx.compose.foundation.layout.a.q(vciVar3, f11, 0.0f, f11, 0.0f, 10);
                                                                boolean h12 = oq5Var4.h(j00Var7) | oq5Var4.h(jabVar5) | oq5Var4.h(v2);
                                                                Object K10 = oq5Var4.K();
                                                                Object obj11 = K10;
                                                                if (h12 || K10 == kjnVar) {
                                                                    bv bvVar = new bv(j00Var7, jabVar5, v2, 0);
                                                                    oq5Var4.k0(bvVar);
                                                                    obj11 = bvVar;
                                                                }
                                                                yci a4 = androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(q, null, 0L, 0.0f, null, (Function2) obj11, 15), "branded_button");
                                                                boolean h13 = oq5Var4.h(j00Var7) | oq5Var4.h(jabVar5);
                                                                Object K11 = oq5Var4.K();
                                                                Object obj12 = K11;
                                                                if (h13 || K11 == kjnVar) {
                                                                    cv cvVar = new cv(j00Var7, jabVar5, r10 ? 1 : 0);
                                                                    oq5Var4.k0(cvVar);
                                                                    obj12 = cvVar;
                                                                }
                                                                hdg.b(str2, (Function0) obj12, a4, d85Var, null, oq5Var4, 0, 16);
                                                                oq5Var4.p(true);
                                                            } else {
                                                                oq5Var4.S();
                                                            }
                                                            break;
                                                        case 1:
                                                            hq5 hq5Var4 = (hq5) obj9;
                                                            int intValue3 = ((Integer) obj10).intValue();
                                                            ((androidx.compose.foundation.lazy.a) obj8).getClass();
                                                            oq5 oq5Var5 = (oq5) hq5Var4;
                                                            if (oq5Var5.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                                xv.w(((ry) uyVar2).a, j00Var6, jabVar4, androidx.compose.ui.platform.a.a(vciVar2, "similar_entities"), oq5Var5, 3072);
                                                            } else {
                                                                oq5Var5.S();
                                                            }
                                                            break;
                                                        case 2:
                                                            hq5 hq5Var5 = (hq5) obj9;
                                                            int intValue4 = ((Integer) obj10).intValue();
                                                            ((androidx.compose.foundation.lazy.a) obj8).getClass();
                                                            oq5 oq5Var6 = (oq5) hq5Var5;
                                                            if (oq5Var6.P(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                                List list6 = ((oy) uyVar2).a;
                                                                String M = rvf.M(R.string.other_album_versions, oq5Var6);
                                                                yci a5 = androidx.compose.ui.platform.a.a(vciVar2, "duplicate_albums");
                                                                ryc rycVar = new ryc() { // from class: ev
                                                                    @Override // defpackage.ryc
                                                                    public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                        switch (i19) {
                                                                            case 0:
                                                                                oq oqVar = (oq) obj13;
                                                                                thj thjVar3 = (thj) obj14;
                                                                                ((Integer) obj16).getClass();
                                                                                oqVar.getClass();
                                                                                thjVar3.getClass();
                                                                                oq5 oq5Var7 = (oq5) ((hq5) obj15);
                                                                                oq5Var7.Z(-1010350727);
                                                                                boolean f12 = oq5Var7.f(oqVar);
                                                                                Object K12 = oq5Var7.K();
                                                                                if (f12 || K12 == gq5.a) {
                                                                                    j00 j00Var8 = j00Var7;
                                                                                    tmb tmbVar = j00Var8.h;
                                                                                    jab jabVar6 = jabVar5;
                                                                                    g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                    oq5Var7.k0(g00Var);
                                                                                    K12 = g00Var;
                                                                                }
                                                                                g00 g00Var2 = (g00) K12;
                                                                                oq5Var7.p(false);
                                                                                return g00Var2;
                                                                            case 1:
                                                                                oq oqVar2 = (oq) obj13;
                                                                                thj thjVar4 = (thj) obj14;
                                                                                ((Integer) obj16).getClass();
                                                                                oqVar2.getClass();
                                                                                thjVar4.getClass();
                                                                                oq5 oq5Var8 = (oq5) ((hq5) obj15);
                                                                                oq5Var8.Z(-790570120);
                                                                                boolean f13 = oq5Var8.f(oqVar2);
                                                                                Object K13 = oq5Var8.K();
                                                                                if (f13 || K13 == gq5.a) {
                                                                                    j00 j00Var9 = j00Var7;
                                                                                    tmb tmbVar2 = j00Var9.h;
                                                                                    jab jabVar7 = jabVar5;
                                                                                    g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                    oq5Var8.k0(g00Var3);
                                                                                    K13 = g00Var3;
                                                                                }
                                                                                g00 g00Var4 = (g00) K13;
                                                                                oq5Var8.p(false);
                                                                                return g00Var4;
                                                                            default:
                                                                                oq oqVar3 = (oq) obj13;
                                                                                thj thjVar5 = (thj) obj14;
                                                                                ((Integer) obj16).getClass();
                                                                                oqVar3.getClass();
                                                                                thjVar5.getClass();
                                                                                oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                oq5Var9.Z(-570789513);
                                                                                boolean f14 = oq5Var9.f(oqVar3);
                                                                                Object K14 = oq5Var9.K();
                                                                                if (f14 || K14 == gq5.a) {
                                                                                    j00 j00Var10 = j00Var7;
                                                                                    tmb tmbVar3 = j00Var10.h;
                                                                                    jab jabVar8 = jabVar5;
                                                                                    g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                    oq5Var9.k0(g00Var5);
                                                                                    K14 = g00Var5;
                                                                                }
                                                                                g00 g00Var6 = (g00) K14;
                                                                                oq5Var9.p(false);
                                                                                return g00Var6;
                                                                        }
                                                                    }
                                                                };
                                                                boolean h14 = oq5Var6.h(j00Var7) | oq5Var6.h(jabVar5);
                                                                Object K12 = oq5Var6.K();
                                                                if (h14 || K12 == kjnVar) {
                                                                    K12 = new zu(j00Var7, jabVar5, 3);
                                                                    oq5Var6.k0(K12);
                                                                }
                                                                xv.v(list6, M, rycVar, a5, (pyc) K12, null, null, oq5Var6, 3080, 96);
                                                            } else {
                                                                oq5Var6.S();
                                                            }
                                                            break;
                                                        case 3:
                                                            hq5 hq5Var6 = (hq5) obj9;
                                                            int intValue5 = ((Integer) obj10).intValue();
                                                            ((androidx.compose.foundation.lazy.a) obj8).getClass();
                                                            oq5 oq5Var7 = (oq5) hq5Var6;
                                                            if (oq5Var7.P(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                                ey eyVar = ((qy) uyVar2).a;
                                                                ArrayList arrayList = eyVar.b;
                                                                String str3 = eyVar.a;
                                                                String M2 = rvf.M(R.string.more_albums, oq5Var7);
                                                                yci a6 = androidx.compose.ui.platform.a.a(vciVar2, "albums_same_genre");
                                                                ryc rycVar2 = new ryc() { // from class: ev
                                                                    @Override // defpackage.ryc
                                                                    public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                        switch (i20) {
                                                                            case 0:
                                                                                oq oqVar = (oq) obj13;
                                                                                thj thjVar3 = (thj) obj14;
                                                                                ((Integer) obj16).getClass();
                                                                                oqVar.getClass();
                                                                                thjVar3.getClass();
                                                                                oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                oq5Var72.Z(-1010350727);
                                                                                boolean f12 = oq5Var72.f(oqVar);
                                                                                Object K122 = oq5Var72.K();
                                                                                if (f12 || K122 == gq5.a) {
                                                                                    j00 j00Var8 = j00Var7;
                                                                                    tmb tmbVar = j00Var8.h;
                                                                                    jab jabVar6 = jabVar5;
                                                                                    g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                    oq5Var72.k0(g00Var);
                                                                                    K122 = g00Var;
                                                                                }
                                                                                g00 g00Var2 = (g00) K122;
                                                                                oq5Var72.p(false);
                                                                                return g00Var2;
                                                                            case 1:
                                                                                oq oqVar2 = (oq) obj13;
                                                                                thj thjVar4 = (thj) obj14;
                                                                                ((Integer) obj16).getClass();
                                                                                oqVar2.getClass();
                                                                                thjVar4.getClass();
                                                                                oq5 oq5Var8 = (oq5) ((hq5) obj15);
                                                                                oq5Var8.Z(-790570120);
                                                                                boolean f13 = oq5Var8.f(oqVar2);
                                                                                Object K13 = oq5Var8.K();
                                                                                if (f13 || K13 == gq5.a) {
                                                                                    j00 j00Var9 = j00Var7;
                                                                                    tmb tmbVar2 = j00Var9.h;
                                                                                    jab jabVar7 = jabVar5;
                                                                                    g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                    oq5Var8.k0(g00Var3);
                                                                                    K13 = g00Var3;
                                                                                }
                                                                                g00 g00Var4 = (g00) K13;
                                                                                oq5Var8.p(false);
                                                                                return g00Var4;
                                                                            default:
                                                                                oq oqVar3 = (oq) obj13;
                                                                                thj thjVar5 = (thj) obj14;
                                                                                ((Integer) obj16).getClass();
                                                                                oqVar3.getClass();
                                                                                thjVar5.getClass();
                                                                                oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                oq5Var9.Z(-570789513);
                                                                                boolean f14 = oq5Var9.f(oqVar3);
                                                                                Object K14 = oq5Var9.K();
                                                                                if (f14 || K14 == gq5.a) {
                                                                                    j00 j00Var10 = j00Var7;
                                                                                    tmb tmbVar3 = j00Var10.h;
                                                                                    jab jabVar8 = jabVar5;
                                                                                    g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                    oq5Var9.k0(g00Var5);
                                                                                    K14 = g00Var5;
                                                                                }
                                                                                g00 g00Var6 = (g00) K14;
                                                                                oq5Var9.p(false);
                                                                                return g00Var6;
                                                                        }
                                                                    }
                                                                };
                                                                boolean h15 = oq5Var7.h(j00Var7) | oq5Var7.h(jabVar5);
                                                                Object K13 = oq5Var7.K();
                                                                if (h15 || K13 == kjnVar) {
                                                                    K13 = new zu(j00Var7, jabVar5, i19);
                                                                    oq5Var7.k0(K13);
                                                                }
                                                                pyc pycVar2 = (pyc) K13;
                                                                boolean h16 = oq5Var7.h(j00Var7) | oq5Var7.h(jabVar5);
                                                                Object K14 = oq5Var7.K();
                                                                if (h16 || K14 == kjnVar) {
                                                                    K14 = new cv(j00Var7, jabVar5, i20);
                                                                    oq5Var7.k0(K14);
                                                                }
                                                                xv.v(arrayList, str3, rycVar2, a6, pycVar2, M2, (Function0) K14, oq5Var7, 3080, 0);
                                                            } else {
                                                                oq5Var7.S();
                                                            }
                                                            break;
                                                        default:
                                                            hq5 hq5Var7 = (hq5) obj9;
                                                            int intValue6 = ((Integer) obj10).intValue();
                                                            ((androidx.compose.foundation.lazy.a) obj8).getClass();
                                                            oq5 oq5Var8 = (oq5) hq5Var7;
                                                            if (oq5Var8.P(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                                ey eyVar2 = ((py) uyVar2).a;
                                                                ArrayList arrayList2 = eyVar2.b;
                                                                String N = rvf.N(R.string.more_of_artist, new Object[]{eyVar2.a}, oq5Var8);
                                                                yci a7 = androidx.compose.ui.platform.a.a(vciVar2, "more_albums");
                                                                final int i22 = r10 ? 1 : 0;
                                                                ryc rycVar3 = new ryc() { // from class: ev
                                                                    @Override // defpackage.ryc
                                                                    public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                        switch (i22) {
                                                                            case 0:
                                                                                oq oqVar = (oq) obj13;
                                                                                thj thjVar3 = (thj) obj14;
                                                                                ((Integer) obj16).getClass();
                                                                                oqVar.getClass();
                                                                                thjVar3.getClass();
                                                                                oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                oq5Var72.Z(-1010350727);
                                                                                boolean f12 = oq5Var72.f(oqVar);
                                                                                Object K122 = oq5Var72.K();
                                                                                if (f12 || K122 == gq5.a) {
                                                                                    j00 j00Var8 = j00Var7;
                                                                                    tmb tmbVar = j00Var8.h;
                                                                                    jab jabVar6 = jabVar5;
                                                                                    g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                    oq5Var72.k0(g00Var);
                                                                                    K122 = g00Var;
                                                                                }
                                                                                g00 g00Var2 = (g00) K122;
                                                                                oq5Var72.p(false);
                                                                                return g00Var2;
                                                                            case 1:
                                                                                oq oqVar2 = (oq) obj13;
                                                                                thj thjVar4 = (thj) obj14;
                                                                                ((Integer) obj16).getClass();
                                                                                oqVar2.getClass();
                                                                                thjVar4.getClass();
                                                                                oq5 oq5Var82 = (oq5) ((hq5) obj15);
                                                                                oq5Var82.Z(-790570120);
                                                                                boolean f13 = oq5Var82.f(oqVar2);
                                                                                Object K132 = oq5Var82.K();
                                                                                if (f13 || K132 == gq5.a) {
                                                                                    j00 j00Var9 = j00Var7;
                                                                                    tmb tmbVar2 = j00Var9.h;
                                                                                    jab jabVar7 = jabVar5;
                                                                                    g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                    oq5Var82.k0(g00Var3);
                                                                                    K132 = g00Var3;
                                                                                }
                                                                                g00 g00Var4 = (g00) K132;
                                                                                oq5Var82.p(false);
                                                                                return g00Var4;
                                                                            default:
                                                                                oq oqVar3 = (oq) obj13;
                                                                                thj thjVar5 = (thj) obj14;
                                                                                ((Integer) obj16).getClass();
                                                                                oqVar3.getClass();
                                                                                thjVar5.getClass();
                                                                                oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                oq5Var9.Z(-570789513);
                                                                                boolean f14 = oq5Var9.f(oqVar3);
                                                                                Object K142 = oq5Var9.K();
                                                                                if (f14 || K142 == gq5.a) {
                                                                                    j00 j00Var10 = j00Var7;
                                                                                    tmb tmbVar3 = j00Var10.h;
                                                                                    jab jabVar8 = jabVar5;
                                                                                    g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                    oq5Var9.k0(g00Var5);
                                                                                    K142 = g00Var5;
                                                                                }
                                                                                g00 g00Var6 = (g00) K142;
                                                                                oq5Var9.p(false);
                                                                                return g00Var6;
                                                                        }
                                                                    }
                                                                };
                                                                boolean h17 = oq5Var8.h(j00Var7) | oq5Var8.h(jabVar5);
                                                                Object K15 = oq5Var8.K();
                                                                if (h17 || K15 == kjnVar) {
                                                                    K15 = new zu(j00Var7, jabVar5, i20);
                                                                    oq5Var8.k0(K15);
                                                                }
                                                                xv.v(arrayList2, N, rycVar3, a7, (pyc) K15, null, null, oq5Var8, 3080, 96);
                                                            } else {
                                                                oq5Var8.S();
                                                            }
                                                            break;
                                                    }
                                                    return Unit.a;
                                                }
                                            }, 764827246, true), 2);
                                            j00Var4 = j00Var6;
                                        } else if (uyVar instanceof ny) {
                                            j00Var4 = j00Var6;
                                            vuf.Y(vufVar, xv.L(uyVar), new wn5(new up(uyVar, cVar, j00Var4, jabVar4, 1), -1127993499, true), 2);
                                        } else {
                                            j00Var4 = j00Var6;
                                            if (uyVar instanceof sy) {
                                                f9h f9hVar = new f9h();
                                                ArrayList<u00> arrayList = ((sy) uyVar).a;
                                                Object obj8 = function14;
                                                for (u00 u00Var : arrayList) {
                                                    if (u00Var instanceof t00) {
                                                        obj8 = Integer.valueOf(((t00) u00Var).a);
                                                    } else {
                                                        if (!(u00Var instanceof s00)) {
                                                            b6e.s();
                                                            return function14;
                                                        }
                                                        f9hVar.put(u00Var, obj8);
                                                    }
                                                }
                                                f9h b2 = f9hVar.b();
                                                rv rvVar = rv.a;
                                                int size2 = arrayList.size();
                                                vv vvVar = new vv(arrayList);
                                                i9 = i15;
                                                wv wvVar = new wv(arrayList, j00Var4, jabVar4, poiVar2, b2, 0);
                                                j00Var4 = j00Var4;
                                                vufVar.Z(size2, function14, vvVar, new wn5(wvVar, -632812321, true));
                                            } else {
                                                i9 = i15;
                                                if (uyVar instanceof ty) {
                                                    vuf.Y(vufVar, xv.L(uyVar), new wn5(new up(uyVar, gvdVar3, j00Var4, jabVar4, 2), -1567554713, true), 2);
                                                } else if (uyVar instanceof ry) {
                                                    vuf.Y(vufVar, xv.L(uyVar), new wn5(new pyc() { // from class: xu
                                                        @Override // defpackage.pyc
                                                        public final Object invoke(Object obj82, Object obj9, Object obj10) {
                                                            int i18 = i13;
                                                            final int i19 = 2;
                                                            kjn kjnVar = gq5.a;
                                                            vci vciVar2 = vci.a;
                                                            final jab jabVar5 = jabVar4;
                                                            final j00 j00Var7 = j00Var4;
                                                            uy uyVar2 = uyVar;
                                                            final int i20 = 1;
                                                            switch (i18) {
                                                                case 0:
                                                                    hq5 hq5Var3 = (hq5) obj9;
                                                                    int intValue2 = ((Integer) obj10).intValue();
                                                                    ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                    oq5 oq5Var4 = (oq5) hq5Var3;
                                                                    if (oq5Var4.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                                        te teVar = ((ly) uyVar2).a;
                                                                        thj v2 = qwp.v(teVar);
                                                                        vci vciVar3 = vci.a;
                                                                        yci d3 = d.d(vciVar3, 1.0f);
                                                                        kfh d4 = ug3.d(b2c.f, false);
                                                                        int i21 = oq5Var4.P;
                                                                        a l2 = oq5Var4.l();
                                                                        yci H2 = vnj.H(oq5Var4, d3);
                                                                        xp5.T.getClass();
                                                                        grb grbVar2 = wp5.b;
                                                                        oq5Var4.d0();
                                                                        if (oq5Var4.O) {
                                                                            oq5Var4.k(grbVar2);
                                                                        } else {
                                                                            oq5Var4.n0();
                                                                        }
                                                                        g0g.U(oq5Var4, d4, wp5.f);
                                                                        g0g.U(oq5Var4, l2, wp5.e);
                                                                        kb5 kb5Var2 = wp5.g;
                                                                        if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i21))) {
                                                                            ouj.x(i21, oq5Var4, i21, kb5Var2);
                                                                        }
                                                                        g0g.U(oq5Var4, H2, wp5.d);
                                                                        String str2 = teVar.a;
                                                                        d85 d85Var = teVar.b;
                                                                        float f11 = qbb.c;
                                                                        yci q = androidx.compose.foundation.layout.a.q(vciVar3, f11, 0.0f, f11, 0.0f, 10);
                                                                        boolean h12 = oq5Var4.h(j00Var7) | oq5Var4.h(jabVar5) | oq5Var4.h(v2);
                                                                        Object K10 = oq5Var4.K();
                                                                        Object obj11 = K10;
                                                                        if (h12 || K10 == kjnVar) {
                                                                            bv bvVar = new bv(j00Var7, jabVar5, v2, 0);
                                                                            oq5Var4.k0(bvVar);
                                                                            obj11 = bvVar;
                                                                        }
                                                                        yci a4 = androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(q, null, 0L, 0.0f, null, (Function2) obj11, 15), "branded_button");
                                                                        boolean h13 = oq5Var4.h(j00Var7) | oq5Var4.h(jabVar5);
                                                                        Object K11 = oq5Var4.K();
                                                                        Object obj12 = K11;
                                                                        if (h13 || K11 == kjnVar) {
                                                                            cv cvVar = new cv(j00Var7, jabVar5, r10 ? 1 : 0);
                                                                            oq5Var4.k0(cvVar);
                                                                            obj12 = cvVar;
                                                                        }
                                                                        hdg.b(str2, (Function0) obj12, a4, d85Var, null, oq5Var4, 0, 16);
                                                                        oq5Var4.p(true);
                                                                    } else {
                                                                        oq5Var4.S();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    hq5 hq5Var4 = (hq5) obj9;
                                                                    int intValue3 = ((Integer) obj10).intValue();
                                                                    ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                    oq5 oq5Var5 = (oq5) hq5Var4;
                                                                    if (oq5Var5.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                                        xv.w(((ry) uyVar2).a, j00Var4, jabVar4, androidx.compose.ui.platform.a.a(vciVar2, "similar_entities"), oq5Var5, 3072);
                                                                    } else {
                                                                        oq5Var5.S();
                                                                    }
                                                                    break;
                                                                case 2:
                                                                    hq5 hq5Var5 = (hq5) obj9;
                                                                    int intValue4 = ((Integer) obj10).intValue();
                                                                    ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                    oq5 oq5Var6 = (oq5) hq5Var5;
                                                                    if (oq5Var6.P(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                                        List list6 = ((oy) uyVar2).a;
                                                                        String M = rvf.M(R.string.other_album_versions, oq5Var6);
                                                                        yci a5 = androidx.compose.ui.platform.a.a(vciVar2, "duplicate_albums");
                                                                        ryc rycVar = new ryc() { // from class: ev
                                                                            @Override // defpackage.ryc
                                                                            public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                switch (i19) {
                                                                                    case 0:
                                                                                        oq oqVar = (oq) obj13;
                                                                                        thj thjVar3 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar.getClass();
                                                                                        thjVar3.getClass();
                                                                                        oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                        oq5Var72.Z(-1010350727);
                                                                                        boolean f12 = oq5Var72.f(oqVar);
                                                                                        Object K122 = oq5Var72.K();
                                                                                        if (f12 || K122 == gq5.a) {
                                                                                            j00 j00Var8 = j00Var7;
                                                                                            tmb tmbVar = j00Var8.h;
                                                                                            jab jabVar6 = jabVar5;
                                                                                            g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                            oq5Var72.k0(g00Var);
                                                                                            K122 = g00Var;
                                                                                        }
                                                                                        g00 g00Var2 = (g00) K122;
                                                                                        oq5Var72.p(false);
                                                                                        return g00Var2;
                                                                                    case 1:
                                                                                        oq oqVar2 = (oq) obj13;
                                                                                        thj thjVar4 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar2.getClass();
                                                                                        thjVar4.getClass();
                                                                                        oq5 oq5Var82 = (oq5) ((hq5) obj15);
                                                                                        oq5Var82.Z(-790570120);
                                                                                        boolean f13 = oq5Var82.f(oqVar2);
                                                                                        Object K132 = oq5Var82.K();
                                                                                        if (f13 || K132 == gq5.a) {
                                                                                            j00 j00Var9 = j00Var7;
                                                                                            tmb tmbVar2 = j00Var9.h;
                                                                                            jab jabVar7 = jabVar5;
                                                                                            g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                            oq5Var82.k0(g00Var3);
                                                                                            K132 = g00Var3;
                                                                                        }
                                                                                        g00 g00Var4 = (g00) K132;
                                                                                        oq5Var82.p(false);
                                                                                        return g00Var4;
                                                                                    default:
                                                                                        oq oqVar3 = (oq) obj13;
                                                                                        thj thjVar5 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar3.getClass();
                                                                                        thjVar5.getClass();
                                                                                        oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                        oq5Var9.Z(-570789513);
                                                                                        boolean f14 = oq5Var9.f(oqVar3);
                                                                                        Object K142 = oq5Var9.K();
                                                                                        if (f14 || K142 == gq5.a) {
                                                                                            j00 j00Var10 = j00Var7;
                                                                                            tmb tmbVar3 = j00Var10.h;
                                                                                            jab jabVar8 = jabVar5;
                                                                                            g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                            oq5Var9.k0(g00Var5);
                                                                                            K142 = g00Var5;
                                                                                        }
                                                                                        g00 g00Var6 = (g00) K142;
                                                                                        oq5Var9.p(false);
                                                                                        return g00Var6;
                                                                                }
                                                                            }
                                                                        };
                                                                        boolean h14 = oq5Var6.h(j00Var7) | oq5Var6.h(jabVar5);
                                                                        Object K12 = oq5Var6.K();
                                                                        if (h14 || K12 == kjnVar) {
                                                                            K12 = new zu(j00Var7, jabVar5, 3);
                                                                            oq5Var6.k0(K12);
                                                                        }
                                                                        xv.v(list6, M, rycVar, a5, (pyc) K12, null, null, oq5Var6, 3080, 96);
                                                                    } else {
                                                                        oq5Var6.S();
                                                                    }
                                                                    break;
                                                                case 3:
                                                                    hq5 hq5Var6 = (hq5) obj9;
                                                                    int intValue5 = ((Integer) obj10).intValue();
                                                                    ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                    oq5 oq5Var7 = (oq5) hq5Var6;
                                                                    if (oq5Var7.P(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                                        ey eyVar = ((qy) uyVar2).a;
                                                                        ArrayList arrayList2 = eyVar.b;
                                                                        String str3 = eyVar.a;
                                                                        String M2 = rvf.M(R.string.more_albums, oq5Var7);
                                                                        yci a6 = androidx.compose.ui.platform.a.a(vciVar2, "albums_same_genre");
                                                                        ryc rycVar2 = new ryc() { // from class: ev
                                                                            @Override // defpackage.ryc
                                                                            public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                switch (i20) {
                                                                                    case 0:
                                                                                        oq oqVar = (oq) obj13;
                                                                                        thj thjVar3 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar.getClass();
                                                                                        thjVar3.getClass();
                                                                                        oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                        oq5Var72.Z(-1010350727);
                                                                                        boolean f12 = oq5Var72.f(oqVar);
                                                                                        Object K122 = oq5Var72.K();
                                                                                        if (f12 || K122 == gq5.a) {
                                                                                            j00 j00Var8 = j00Var7;
                                                                                            tmb tmbVar = j00Var8.h;
                                                                                            jab jabVar6 = jabVar5;
                                                                                            g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                            oq5Var72.k0(g00Var);
                                                                                            K122 = g00Var;
                                                                                        }
                                                                                        g00 g00Var2 = (g00) K122;
                                                                                        oq5Var72.p(false);
                                                                                        return g00Var2;
                                                                                    case 1:
                                                                                        oq oqVar2 = (oq) obj13;
                                                                                        thj thjVar4 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar2.getClass();
                                                                                        thjVar4.getClass();
                                                                                        oq5 oq5Var82 = (oq5) ((hq5) obj15);
                                                                                        oq5Var82.Z(-790570120);
                                                                                        boolean f13 = oq5Var82.f(oqVar2);
                                                                                        Object K132 = oq5Var82.K();
                                                                                        if (f13 || K132 == gq5.a) {
                                                                                            j00 j00Var9 = j00Var7;
                                                                                            tmb tmbVar2 = j00Var9.h;
                                                                                            jab jabVar7 = jabVar5;
                                                                                            g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                            oq5Var82.k0(g00Var3);
                                                                                            K132 = g00Var3;
                                                                                        }
                                                                                        g00 g00Var4 = (g00) K132;
                                                                                        oq5Var82.p(false);
                                                                                        return g00Var4;
                                                                                    default:
                                                                                        oq oqVar3 = (oq) obj13;
                                                                                        thj thjVar5 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar3.getClass();
                                                                                        thjVar5.getClass();
                                                                                        oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                        oq5Var9.Z(-570789513);
                                                                                        boolean f14 = oq5Var9.f(oqVar3);
                                                                                        Object K142 = oq5Var9.K();
                                                                                        if (f14 || K142 == gq5.a) {
                                                                                            j00 j00Var10 = j00Var7;
                                                                                            tmb tmbVar3 = j00Var10.h;
                                                                                            jab jabVar8 = jabVar5;
                                                                                            g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                            oq5Var9.k0(g00Var5);
                                                                                            K142 = g00Var5;
                                                                                        }
                                                                                        g00 g00Var6 = (g00) K142;
                                                                                        oq5Var9.p(false);
                                                                                        return g00Var6;
                                                                                }
                                                                            }
                                                                        };
                                                                        boolean h15 = oq5Var7.h(j00Var7) | oq5Var7.h(jabVar5);
                                                                        Object K13 = oq5Var7.K();
                                                                        if (h15 || K13 == kjnVar) {
                                                                            K13 = new zu(j00Var7, jabVar5, i19);
                                                                            oq5Var7.k0(K13);
                                                                        }
                                                                        pyc pycVar2 = (pyc) K13;
                                                                        boolean h16 = oq5Var7.h(j00Var7) | oq5Var7.h(jabVar5);
                                                                        Object K14 = oq5Var7.K();
                                                                        if (h16 || K14 == kjnVar) {
                                                                            K14 = new cv(j00Var7, jabVar5, i20);
                                                                            oq5Var7.k0(K14);
                                                                        }
                                                                        xv.v(arrayList2, str3, rycVar2, a6, pycVar2, M2, (Function0) K14, oq5Var7, 3080, 0);
                                                                    } else {
                                                                        oq5Var7.S();
                                                                    }
                                                                    break;
                                                                default:
                                                                    hq5 hq5Var7 = (hq5) obj9;
                                                                    int intValue6 = ((Integer) obj10).intValue();
                                                                    ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                    oq5 oq5Var8 = (oq5) hq5Var7;
                                                                    if (oq5Var8.P(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                                        ey eyVar2 = ((py) uyVar2).a;
                                                                        ArrayList arrayList22 = eyVar2.b;
                                                                        String N = rvf.N(R.string.more_of_artist, new Object[]{eyVar2.a}, oq5Var8);
                                                                        yci a7 = androidx.compose.ui.platform.a.a(vciVar2, "more_albums");
                                                                        final int i22 = r10 ? 1 : 0;
                                                                        ryc rycVar3 = new ryc() { // from class: ev
                                                                            @Override // defpackage.ryc
                                                                            public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                switch (i22) {
                                                                                    case 0:
                                                                                        oq oqVar = (oq) obj13;
                                                                                        thj thjVar3 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar.getClass();
                                                                                        thjVar3.getClass();
                                                                                        oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                        oq5Var72.Z(-1010350727);
                                                                                        boolean f12 = oq5Var72.f(oqVar);
                                                                                        Object K122 = oq5Var72.K();
                                                                                        if (f12 || K122 == gq5.a) {
                                                                                            j00 j00Var8 = j00Var7;
                                                                                            tmb tmbVar = j00Var8.h;
                                                                                            jab jabVar6 = jabVar5;
                                                                                            g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                            oq5Var72.k0(g00Var);
                                                                                            K122 = g00Var;
                                                                                        }
                                                                                        g00 g00Var2 = (g00) K122;
                                                                                        oq5Var72.p(false);
                                                                                        return g00Var2;
                                                                                    case 1:
                                                                                        oq oqVar2 = (oq) obj13;
                                                                                        thj thjVar4 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar2.getClass();
                                                                                        thjVar4.getClass();
                                                                                        oq5 oq5Var82 = (oq5) ((hq5) obj15);
                                                                                        oq5Var82.Z(-790570120);
                                                                                        boolean f13 = oq5Var82.f(oqVar2);
                                                                                        Object K132 = oq5Var82.K();
                                                                                        if (f13 || K132 == gq5.a) {
                                                                                            j00 j00Var9 = j00Var7;
                                                                                            tmb tmbVar2 = j00Var9.h;
                                                                                            jab jabVar7 = jabVar5;
                                                                                            g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                            oq5Var82.k0(g00Var3);
                                                                                            K132 = g00Var3;
                                                                                        }
                                                                                        g00 g00Var4 = (g00) K132;
                                                                                        oq5Var82.p(false);
                                                                                        return g00Var4;
                                                                                    default:
                                                                                        oq oqVar3 = (oq) obj13;
                                                                                        thj thjVar5 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar3.getClass();
                                                                                        thjVar5.getClass();
                                                                                        oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                        oq5Var9.Z(-570789513);
                                                                                        boolean f14 = oq5Var9.f(oqVar3);
                                                                                        Object K142 = oq5Var9.K();
                                                                                        if (f14 || K142 == gq5.a) {
                                                                                            j00 j00Var10 = j00Var7;
                                                                                            tmb tmbVar3 = j00Var10.h;
                                                                                            jab jabVar8 = jabVar5;
                                                                                            g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                            oq5Var9.k0(g00Var5);
                                                                                            K142 = g00Var5;
                                                                                        }
                                                                                        g00 g00Var6 = (g00) K142;
                                                                                        oq5Var9.p(false);
                                                                                        return g00Var6;
                                                                                }
                                                                            }
                                                                        };
                                                                        boolean h17 = oq5Var8.h(j00Var7) | oq5Var8.h(jabVar5);
                                                                        Object K15 = oq5Var8.K();
                                                                        if (h17 || K15 == kjnVar) {
                                                                            K15 = new zu(j00Var7, jabVar5, i20);
                                                                            oq5Var8.k0(K15);
                                                                        }
                                                                        xv.v(arrayList22, N, rycVar3, a7, (pyc) K15, null, null, oq5Var8, 3080, 96);
                                                                    } else {
                                                                        oq5Var8.S();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }, -1787335320, true), 2);
                                                } else if (uyVar instanceof oy) {
                                                    vuf.Y(vufVar, xv.L(uyVar), new wn5(new pyc() { // from class: xu
                                                        @Override // defpackage.pyc
                                                        public final Object invoke(Object obj82, Object obj9, Object obj10) {
                                                            int i18 = i17;
                                                            final int i19 = 2;
                                                            kjn kjnVar = gq5.a;
                                                            vci vciVar2 = vci.a;
                                                            final jab jabVar5 = jabVar4;
                                                            final j00 j00Var7 = j00Var4;
                                                            uy uyVar2 = uyVar;
                                                            final int i20 = 1;
                                                            switch (i18) {
                                                                case 0:
                                                                    hq5 hq5Var3 = (hq5) obj9;
                                                                    int intValue2 = ((Integer) obj10).intValue();
                                                                    ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                    oq5 oq5Var4 = (oq5) hq5Var3;
                                                                    if (oq5Var4.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                                        te teVar = ((ly) uyVar2).a;
                                                                        thj v2 = qwp.v(teVar);
                                                                        vci vciVar3 = vci.a;
                                                                        yci d3 = d.d(vciVar3, 1.0f);
                                                                        kfh d4 = ug3.d(b2c.f, false);
                                                                        int i21 = oq5Var4.P;
                                                                        a l2 = oq5Var4.l();
                                                                        yci H2 = vnj.H(oq5Var4, d3);
                                                                        xp5.T.getClass();
                                                                        grb grbVar2 = wp5.b;
                                                                        oq5Var4.d0();
                                                                        if (oq5Var4.O) {
                                                                            oq5Var4.k(grbVar2);
                                                                        } else {
                                                                            oq5Var4.n0();
                                                                        }
                                                                        g0g.U(oq5Var4, d4, wp5.f);
                                                                        g0g.U(oq5Var4, l2, wp5.e);
                                                                        kb5 kb5Var2 = wp5.g;
                                                                        if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i21))) {
                                                                            ouj.x(i21, oq5Var4, i21, kb5Var2);
                                                                        }
                                                                        g0g.U(oq5Var4, H2, wp5.d);
                                                                        String str2 = teVar.a;
                                                                        d85 d85Var = teVar.b;
                                                                        float f11 = qbb.c;
                                                                        yci q = androidx.compose.foundation.layout.a.q(vciVar3, f11, 0.0f, f11, 0.0f, 10);
                                                                        boolean h12 = oq5Var4.h(j00Var7) | oq5Var4.h(jabVar5) | oq5Var4.h(v2);
                                                                        Object K10 = oq5Var4.K();
                                                                        Object obj11 = K10;
                                                                        if (h12 || K10 == kjnVar) {
                                                                            bv bvVar = new bv(j00Var7, jabVar5, v2, 0);
                                                                            oq5Var4.k0(bvVar);
                                                                            obj11 = bvVar;
                                                                        }
                                                                        yci a4 = androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(q, null, 0L, 0.0f, null, (Function2) obj11, 15), "branded_button");
                                                                        boolean h13 = oq5Var4.h(j00Var7) | oq5Var4.h(jabVar5);
                                                                        Object K11 = oq5Var4.K();
                                                                        Object obj12 = K11;
                                                                        if (h13 || K11 == kjnVar) {
                                                                            cv cvVar = new cv(j00Var7, jabVar5, r10 ? 1 : 0);
                                                                            oq5Var4.k0(cvVar);
                                                                            obj12 = cvVar;
                                                                        }
                                                                        hdg.b(str2, (Function0) obj12, a4, d85Var, null, oq5Var4, 0, 16);
                                                                        oq5Var4.p(true);
                                                                    } else {
                                                                        oq5Var4.S();
                                                                    }
                                                                    break;
                                                                case 1:
                                                                    hq5 hq5Var4 = (hq5) obj9;
                                                                    int intValue3 = ((Integer) obj10).intValue();
                                                                    ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                    oq5 oq5Var5 = (oq5) hq5Var4;
                                                                    if (oq5Var5.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                                        xv.w(((ry) uyVar2).a, j00Var4, jabVar4, androidx.compose.ui.platform.a.a(vciVar2, "similar_entities"), oq5Var5, 3072);
                                                                    } else {
                                                                        oq5Var5.S();
                                                                    }
                                                                    break;
                                                                case 2:
                                                                    hq5 hq5Var5 = (hq5) obj9;
                                                                    int intValue4 = ((Integer) obj10).intValue();
                                                                    ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                    oq5 oq5Var6 = (oq5) hq5Var5;
                                                                    if (oq5Var6.P(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                                        List list6 = ((oy) uyVar2).a;
                                                                        String M = rvf.M(R.string.other_album_versions, oq5Var6);
                                                                        yci a5 = androidx.compose.ui.platform.a.a(vciVar2, "duplicate_albums");
                                                                        ryc rycVar = new ryc() { // from class: ev
                                                                            @Override // defpackage.ryc
                                                                            public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                switch (i19) {
                                                                                    case 0:
                                                                                        oq oqVar = (oq) obj13;
                                                                                        thj thjVar3 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar.getClass();
                                                                                        thjVar3.getClass();
                                                                                        oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                        oq5Var72.Z(-1010350727);
                                                                                        boolean f12 = oq5Var72.f(oqVar);
                                                                                        Object K122 = oq5Var72.K();
                                                                                        if (f12 || K122 == gq5.a) {
                                                                                            j00 j00Var8 = j00Var7;
                                                                                            tmb tmbVar = j00Var8.h;
                                                                                            jab jabVar6 = jabVar5;
                                                                                            g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                            oq5Var72.k0(g00Var);
                                                                                            K122 = g00Var;
                                                                                        }
                                                                                        g00 g00Var2 = (g00) K122;
                                                                                        oq5Var72.p(false);
                                                                                        return g00Var2;
                                                                                    case 1:
                                                                                        oq oqVar2 = (oq) obj13;
                                                                                        thj thjVar4 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar2.getClass();
                                                                                        thjVar4.getClass();
                                                                                        oq5 oq5Var82 = (oq5) ((hq5) obj15);
                                                                                        oq5Var82.Z(-790570120);
                                                                                        boolean f13 = oq5Var82.f(oqVar2);
                                                                                        Object K132 = oq5Var82.K();
                                                                                        if (f13 || K132 == gq5.a) {
                                                                                            j00 j00Var9 = j00Var7;
                                                                                            tmb tmbVar2 = j00Var9.h;
                                                                                            jab jabVar7 = jabVar5;
                                                                                            g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                            oq5Var82.k0(g00Var3);
                                                                                            K132 = g00Var3;
                                                                                        }
                                                                                        g00 g00Var4 = (g00) K132;
                                                                                        oq5Var82.p(false);
                                                                                        return g00Var4;
                                                                                    default:
                                                                                        oq oqVar3 = (oq) obj13;
                                                                                        thj thjVar5 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar3.getClass();
                                                                                        thjVar5.getClass();
                                                                                        oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                        oq5Var9.Z(-570789513);
                                                                                        boolean f14 = oq5Var9.f(oqVar3);
                                                                                        Object K142 = oq5Var9.K();
                                                                                        if (f14 || K142 == gq5.a) {
                                                                                            j00 j00Var10 = j00Var7;
                                                                                            tmb tmbVar3 = j00Var10.h;
                                                                                            jab jabVar8 = jabVar5;
                                                                                            g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                            oq5Var9.k0(g00Var5);
                                                                                            K142 = g00Var5;
                                                                                        }
                                                                                        g00 g00Var6 = (g00) K142;
                                                                                        oq5Var9.p(false);
                                                                                        return g00Var6;
                                                                                }
                                                                            }
                                                                        };
                                                                        boolean h14 = oq5Var6.h(j00Var7) | oq5Var6.h(jabVar5);
                                                                        Object K12 = oq5Var6.K();
                                                                        if (h14 || K12 == kjnVar) {
                                                                            K12 = new zu(j00Var7, jabVar5, 3);
                                                                            oq5Var6.k0(K12);
                                                                        }
                                                                        xv.v(list6, M, rycVar, a5, (pyc) K12, null, null, oq5Var6, 3080, 96);
                                                                    } else {
                                                                        oq5Var6.S();
                                                                    }
                                                                    break;
                                                                case 3:
                                                                    hq5 hq5Var6 = (hq5) obj9;
                                                                    int intValue5 = ((Integer) obj10).intValue();
                                                                    ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                    oq5 oq5Var7 = (oq5) hq5Var6;
                                                                    if (oq5Var7.P(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                                        ey eyVar = ((qy) uyVar2).a;
                                                                        ArrayList arrayList2 = eyVar.b;
                                                                        String str3 = eyVar.a;
                                                                        String M2 = rvf.M(R.string.more_albums, oq5Var7);
                                                                        yci a6 = androidx.compose.ui.platform.a.a(vciVar2, "albums_same_genre");
                                                                        ryc rycVar2 = new ryc() { // from class: ev
                                                                            @Override // defpackage.ryc
                                                                            public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                switch (i20) {
                                                                                    case 0:
                                                                                        oq oqVar = (oq) obj13;
                                                                                        thj thjVar3 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar.getClass();
                                                                                        thjVar3.getClass();
                                                                                        oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                        oq5Var72.Z(-1010350727);
                                                                                        boolean f12 = oq5Var72.f(oqVar);
                                                                                        Object K122 = oq5Var72.K();
                                                                                        if (f12 || K122 == gq5.a) {
                                                                                            j00 j00Var8 = j00Var7;
                                                                                            tmb tmbVar = j00Var8.h;
                                                                                            jab jabVar6 = jabVar5;
                                                                                            g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                            oq5Var72.k0(g00Var);
                                                                                            K122 = g00Var;
                                                                                        }
                                                                                        g00 g00Var2 = (g00) K122;
                                                                                        oq5Var72.p(false);
                                                                                        return g00Var2;
                                                                                    case 1:
                                                                                        oq oqVar2 = (oq) obj13;
                                                                                        thj thjVar4 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar2.getClass();
                                                                                        thjVar4.getClass();
                                                                                        oq5 oq5Var82 = (oq5) ((hq5) obj15);
                                                                                        oq5Var82.Z(-790570120);
                                                                                        boolean f13 = oq5Var82.f(oqVar2);
                                                                                        Object K132 = oq5Var82.K();
                                                                                        if (f13 || K132 == gq5.a) {
                                                                                            j00 j00Var9 = j00Var7;
                                                                                            tmb tmbVar2 = j00Var9.h;
                                                                                            jab jabVar7 = jabVar5;
                                                                                            g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                            oq5Var82.k0(g00Var3);
                                                                                            K132 = g00Var3;
                                                                                        }
                                                                                        g00 g00Var4 = (g00) K132;
                                                                                        oq5Var82.p(false);
                                                                                        return g00Var4;
                                                                                    default:
                                                                                        oq oqVar3 = (oq) obj13;
                                                                                        thj thjVar5 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar3.getClass();
                                                                                        thjVar5.getClass();
                                                                                        oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                        oq5Var9.Z(-570789513);
                                                                                        boolean f14 = oq5Var9.f(oqVar3);
                                                                                        Object K142 = oq5Var9.K();
                                                                                        if (f14 || K142 == gq5.a) {
                                                                                            j00 j00Var10 = j00Var7;
                                                                                            tmb tmbVar3 = j00Var10.h;
                                                                                            jab jabVar8 = jabVar5;
                                                                                            g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                            oq5Var9.k0(g00Var5);
                                                                                            K142 = g00Var5;
                                                                                        }
                                                                                        g00 g00Var6 = (g00) K142;
                                                                                        oq5Var9.p(false);
                                                                                        return g00Var6;
                                                                                }
                                                                            }
                                                                        };
                                                                        boolean h15 = oq5Var7.h(j00Var7) | oq5Var7.h(jabVar5);
                                                                        Object K13 = oq5Var7.K();
                                                                        if (h15 || K13 == kjnVar) {
                                                                            K13 = new zu(j00Var7, jabVar5, i19);
                                                                            oq5Var7.k0(K13);
                                                                        }
                                                                        pyc pycVar2 = (pyc) K13;
                                                                        boolean h16 = oq5Var7.h(j00Var7) | oq5Var7.h(jabVar5);
                                                                        Object K14 = oq5Var7.K();
                                                                        if (h16 || K14 == kjnVar) {
                                                                            K14 = new cv(j00Var7, jabVar5, i20);
                                                                            oq5Var7.k0(K14);
                                                                        }
                                                                        xv.v(arrayList2, str3, rycVar2, a6, pycVar2, M2, (Function0) K14, oq5Var7, 3080, 0);
                                                                    } else {
                                                                        oq5Var7.S();
                                                                    }
                                                                    break;
                                                                default:
                                                                    hq5 hq5Var7 = (hq5) obj9;
                                                                    int intValue6 = ((Integer) obj10).intValue();
                                                                    ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                    oq5 oq5Var8 = (oq5) hq5Var7;
                                                                    if (oq5Var8.P(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                                        ey eyVar2 = ((py) uyVar2).a;
                                                                        ArrayList arrayList22 = eyVar2.b;
                                                                        String N = rvf.N(R.string.more_of_artist, new Object[]{eyVar2.a}, oq5Var8);
                                                                        yci a7 = androidx.compose.ui.platform.a.a(vciVar2, "more_albums");
                                                                        final int i22 = r10 ? 1 : 0;
                                                                        ryc rycVar3 = new ryc() { // from class: ev
                                                                            @Override // defpackage.ryc
                                                                            public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                switch (i22) {
                                                                                    case 0:
                                                                                        oq oqVar = (oq) obj13;
                                                                                        thj thjVar3 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar.getClass();
                                                                                        thjVar3.getClass();
                                                                                        oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                        oq5Var72.Z(-1010350727);
                                                                                        boolean f12 = oq5Var72.f(oqVar);
                                                                                        Object K122 = oq5Var72.K();
                                                                                        if (f12 || K122 == gq5.a) {
                                                                                            j00 j00Var8 = j00Var7;
                                                                                            tmb tmbVar = j00Var8.h;
                                                                                            jab jabVar6 = jabVar5;
                                                                                            g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                            oq5Var72.k0(g00Var);
                                                                                            K122 = g00Var;
                                                                                        }
                                                                                        g00 g00Var2 = (g00) K122;
                                                                                        oq5Var72.p(false);
                                                                                        return g00Var2;
                                                                                    case 1:
                                                                                        oq oqVar2 = (oq) obj13;
                                                                                        thj thjVar4 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar2.getClass();
                                                                                        thjVar4.getClass();
                                                                                        oq5 oq5Var82 = (oq5) ((hq5) obj15);
                                                                                        oq5Var82.Z(-790570120);
                                                                                        boolean f13 = oq5Var82.f(oqVar2);
                                                                                        Object K132 = oq5Var82.K();
                                                                                        if (f13 || K132 == gq5.a) {
                                                                                            j00 j00Var9 = j00Var7;
                                                                                            tmb tmbVar2 = j00Var9.h;
                                                                                            jab jabVar7 = jabVar5;
                                                                                            g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                            oq5Var82.k0(g00Var3);
                                                                                            K132 = g00Var3;
                                                                                        }
                                                                                        g00 g00Var4 = (g00) K132;
                                                                                        oq5Var82.p(false);
                                                                                        return g00Var4;
                                                                                    default:
                                                                                        oq oqVar3 = (oq) obj13;
                                                                                        thj thjVar5 = (thj) obj14;
                                                                                        ((Integer) obj16).getClass();
                                                                                        oqVar3.getClass();
                                                                                        thjVar5.getClass();
                                                                                        oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                        oq5Var9.Z(-570789513);
                                                                                        boolean f14 = oq5Var9.f(oqVar3);
                                                                                        Object K142 = oq5Var9.K();
                                                                                        if (f14 || K142 == gq5.a) {
                                                                                            j00 j00Var10 = j00Var7;
                                                                                            tmb tmbVar3 = j00Var10.h;
                                                                                            jab jabVar8 = jabVar5;
                                                                                            g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                            oq5Var9.k0(g00Var5);
                                                                                            K142 = g00Var5;
                                                                                        }
                                                                                        g00 g00Var6 = (g00) K142;
                                                                                        oq5Var9.p(false);
                                                                                        return g00Var6;
                                                                                }
                                                                            }
                                                                        };
                                                                        boolean h17 = oq5Var8.h(j00Var7) | oq5Var8.h(jabVar5);
                                                                        Object K15 = oq5Var8.K();
                                                                        if (h17 || K15 == kjnVar) {
                                                                            K15 = new zu(j00Var7, jabVar5, i20);
                                                                            oq5Var8.k0(K15);
                                                                        }
                                                                        xv.v(arrayList22, N, rycVar3, a7, (pyc) K15, null, null, oq5Var8, 3080, 96);
                                                                    } else {
                                                                        oq5Var8.S();
                                                                    }
                                                                    break;
                                                            }
                                                            return Unit.a;
                                                        }
                                                    }, -2007115927, true), 2);
                                                } else {
                                                    if (uyVar instanceof qy) {
                                                        i10 = 3;
                                                        vuf.Y(vufVar, xv.L(uyVar), new wn5(new pyc() { // from class: xu
                                                            @Override // defpackage.pyc
                                                            public final Object invoke(Object obj82, Object obj9, Object obj10) {
                                                                int i18 = i10;
                                                                final int i19 = 2;
                                                                kjn kjnVar = gq5.a;
                                                                vci vciVar2 = vci.a;
                                                                final jab jabVar5 = jabVar4;
                                                                final j00 j00Var7 = j00Var4;
                                                                uy uyVar2 = uyVar;
                                                                final int i20 = 1;
                                                                switch (i18) {
                                                                    case 0:
                                                                        hq5 hq5Var3 = (hq5) obj9;
                                                                        int intValue2 = ((Integer) obj10).intValue();
                                                                        ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                        oq5 oq5Var4 = (oq5) hq5Var3;
                                                                        if (oq5Var4.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                                            te teVar = ((ly) uyVar2).a;
                                                                            thj v2 = qwp.v(teVar);
                                                                            vci vciVar3 = vci.a;
                                                                            yci d3 = d.d(vciVar3, 1.0f);
                                                                            kfh d4 = ug3.d(b2c.f, false);
                                                                            int i21 = oq5Var4.P;
                                                                            a l2 = oq5Var4.l();
                                                                            yci H2 = vnj.H(oq5Var4, d3);
                                                                            xp5.T.getClass();
                                                                            grb grbVar2 = wp5.b;
                                                                            oq5Var4.d0();
                                                                            if (oq5Var4.O) {
                                                                                oq5Var4.k(grbVar2);
                                                                            } else {
                                                                                oq5Var4.n0();
                                                                            }
                                                                            g0g.U(oq5Var4, d4, wp5.f);
                                                                            g0g.U(oq5Var4, l2, wp5.e);
                                                                            kb5 kb5Var2 = wp5.g;
                                                                            if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i21))) {
                                                                                ouj.x(i21, oq5Var4, i21, kb5Var2);
                                                                            }
                                                                            g0g.U(oq5Var4, H2, wp5.d);
                                                                            String str2 = teVar.a;
                                                                            d85 d85Var = teVar.b;
                                                                            float f11 = qbb.c;
                                                                            yci q = androidx.compose.foundation.layout.a.q(vciVar3, f11, 0.0f, f11, 0.0f, 10);
                                                                            boolean h12 = oq5Var4.h(j00Var7) | oq5Var4.h(jabVar5) | oq5Var4.h(v2);
                                                                            Object K10 = oq5Var4.K();
                                                                            Object obj11 = K10;
                                                                            if (h12 || K10 == kjnVar) {
                                                                                bv bvVar = new bv(j00Var7, jabVar5, v2, 0);
                                                                                oq5Var4.k0(bvVar);
                                                                                obj11 = bvVar;
                                                                            }
                                                                            yci a4 = androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(q, null, 0L, 0.0f, null, (Function2) obj11, 15), "branded_button");
                                                                            boolean h13 = oq5Var4.h(j00Var7) | oq5Var4.h(jabVar5);
                                                                            Object K11 = oq5Var4.K();
                                                                            Object obj12 = K11;
                                                                            if (h13 || K11 == kjnVar) {
                                                                                cv cvVar = new cv(j00Var7, jabVar5, r10 ? 1 : 0);
                                                                                oq5Var4.k0(cvVar);
                                                                                obj12 = cvVar;
                                                                            }
                                                                            hdg.b(str2, (Function0) obj12, a4, d85Var, null, oq5Var4, 0, 16);
                                                                            oq5Var4.p(true);
                                                                        } else {
                                                                            oq5Var4.S();
                                                                        }
                                                                        break;
                                                                    case 1:
                                                                        hq5 hq5Var4 = (hq5) obj9;
                                                                        int intValue3 = ((Integer) obj10).intValue();
                                                                        ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                        oq5 oq5Var5 = (oq5) hq5Var4;
                                                                        if (oq5Var5.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                                            xv.w(((ry) uyVar2).a, j00Var4, jabVar4, androidx.compose.ui.platform.a.a(vciVar2, "similar_entities"), oq5Var5, 3072);
                                                                        } else {
                                                                            oq5Var5.S();
                                                                        }
                                                                        break;
                                                                    case 2:
                                                                        hq5 hq5Var5 = (hq5) obj9;
                                                                        int intValue4 = ((Integer) obj10).intValue();
                                                                        ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                        oq5 oq5Var6 = (oq5) hq5Var5;
                                                                        if (oq5Var6.P(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                                            List list6 = ((oy) uyVar2).a;
                                                                            String M = rvf.M(R.string.other_album_versions, oq5Var6);
                                                                            yci a5 = androidx.compose.ui.platform.a.a(vciVar2, "duplicate_albums");
                                                                            ryc rycVar = new ryc() { // from class: ev
                                                                                @Override // defpackage.ryc
                                                                                public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                    switch (i19) {
                                                                                        case 0:
                                                                                            oq oqVar = (oq) obj13;
                                                                                            thj thjVar3 = (thj) obj14;
                                                                                            ((Integer) obj16).getClass();
                                                                                            oqVar.getClass();
                                                                                            thjVar3.getClass();
                                                                                            oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                            oq5Var72.Z(-1010350727);
                                                                                            boolean f12 = oq5Var72.f(oqVar);
                                                                                            Object K122 = oq5Var72.K();
                                                                                            if (f12 || K122 == gq5.a) {
                                                                                                j00 j00Var8 = j00Var7;
                                                                                                tmb tmbVar = j00Var8.h;
                                                                                                jab jabVar6 = jabVar5;
                                                                                                g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                                oq5Var72.k0(g00Var);
                                                                                                K122 = g00Var;
                                                                                            }
                                                                                            g00 g00Var2 = (g00) K122;
                                                                                            oq5Var72.p(false);
                                                                                            return g00Var2;
                                                                                        case 1:
                                                                                            oq oqVar2 = (oq) obj13;
                                                                                            thj thjVar4 = (thj) obj14;
                                                                                            ((Integer) obj16).getClass();
                                                                                            oqVar2.getClass();
                                                                                            thjVar4.getClass();
                                                                                            oq5 oq5Var82 = (oq5) ((hq5) obj15);
                                                                                            oq5Var82.Z(-790570120);
                                                                                            boolean f13 = oq5Var82.f(oqVar2);
                                                                                            Object K132 = oq5Var82.K();
                                                                                            if (f13 || K132 == gq5.a) {
                                                                                                j00 j00Var9 = j00Var7;
                                                                                                tmb tmbVar2 = j00Var9.h;
                                                                                                jab jabVar7 = jabVar5;
                                                                                                g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                                oq5Var82.k0(g00Var3);
                                                                                                K132 = g00Var3;
                                                                                            }
                                                                                            g00 g00Var4 = (g00) K132;
                                                                                            oq5Var82.p(false);
                                                                                            return g00Var4;
                                                                                        default:
                                                                                            oq oqVar3 = (oq) obj13;
                                                                                            thj thjVar5 = (thj) obj14;
                                                                                            ((Integer) obj16).getClass();
                                                                                            oqVar3.getClass();
                                                                                            thjVar5.getClass();
                                                                                            oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                            oq5Var9.Z(-570789513);
                                                                                            boolean f14 = oq5Var9.f(oqVar3);
                                                                                            Object K142 = oq5Var9.K();
                                                                                            if (f14 || K142 == gq5.a) {
                                                                                                j00 j00Var10 = j00Var7;
                                                                                                tmb tmbVar3 = j00Var10.h;
                                                                                                jab jabVar8 = jabVar5;
                                                                                                g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                                oq5Var9.k0(g00Var5);
                                                                                                K142 = g00Var5;
                                                                                            }
                                                                                            g00 g00Var6 = (g00) K142;
                                                                                            oq5Var9.p(false);
                                                                                            return g00Var6;
                                                                                    }
                                                                                }
                                                                            };
                                                                            boolean h14 = oq5Var6.h(j00Var7) | oq5Var6.h(jabVar5);
                                                                            Object K12 = oq5Var6.K();
                                                                            if (h14 || K12 == kjnVar) {
                                                                                K12 = new zu(j00Var7, jabVar5, 3);
                                                                                oq5Var6.k0(K12);
                                                                            }
                                                                            xv.v(list6, M, rycVar, a5, (pyc) K12, null, null, oq5Var6, 3080, 96);
                                                                        } else {
                                                                            oq5Var6.S();
                                                                        }
                                                                        break;
                                                                    case 3:
                                                                        hq5 hq5Var6 = (hq5) obj9;
                                                                        int intValue5 = ((Integer) obj10).intValue();
                                                                        ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                        oq5 oq5Var7 = (oq5) hq5Var6;
                                                                        if (oq5Var7.P(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                                            ey eyVar = ((qy) uyVar2).a;
                                                                            ArrayList arrayList2 = eyVar.b;
                                                                            String str3 = eyVar.a;
                                                                            String M2 = rvf.M(R.string.more_albums, oq5Var7);
                                                                            yci a6 = androidx.compose.ui.platform.a.a(vciVar2, "albums_same_genre");
                                                                            ryc rycVar2 = new ryc() { // from class: ev
                                                                                @Override // defpackage.ryc
                                                                                public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                    switch (i20) {
                                                                                        case 0:
                                                                                            oq oqVar = (oq) obj13;
                                                                                            thj thjVar3 = (thj) obj14;
                                                                                            ((Integer) obj16).getClass();
                                                                                            oqVar.getClass();
                                                                                            thjVar3.getClass();
                                                                                            oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                            oq5Var72.Z(-1010350727);
                                                                                            boolean f12 = oq5Var72.f(oqVar);
                                                                                            Object K122 = oq5Var72.K();
                                                                                            if (f12 || K122 == gq5.a) {
                                                                                                j00 j00Var8 = j00Var7;
                                                                                                tmb tmbVar = j00Var8.h;
                                                                                                jab jabVar6 = jabVar5;
                                                                                                g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                                oq5Var72.k0(g00Var);
                                                                                                K122 = g00Var;
                                                                                            }
                                                                                            g00 g00Var2 = (g00) K122;
                                                                                            oq5Var72.p(false);
                                                                                            return g00Var2;
                                                                                        case 1:
                                                                                            oq oqVar2 = (oq) obj13;
                                                                                            thj thjVar4 = (thj) obj14;
                                                                                            ((Integer) obj16).getClass();
                                                                                            oqVar2.getClass();
                                                                                            thjVar4.getClass();
                                                                                            oq5 oq5Var82 = (oq5) ((hq5) obj15);
                                                                                            oq5Var82.Z(-790570120);
                                                                                            boolean f13 = oq5Var82.f(oqVar2);
                                                                                            Object K132 = oq5Var82.K();
                                                                                            if (f13 || K132 == gq5.a) {
                                                                                                j00 j00Var9 = j00Var7;
                                                                                                tmb tmbVar2 = j00Var9.h;
                                                                                                jab jabVar7 = jabVar5;
                                                                                                g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                                oq5Var82.k0(g00Var3);
                                                                                                K132 = g00Var3;
                                                                                            }
                                                                                            g00 g00Var4 = (g00) K132;
                                                                                            oq5Var82.p(false);
                                                                                            return g00Var4;
                                                                                        default:
                                                                                            oq oqVar3 = (oq) obj13;
                                                                                            thj thjVar5 = (thj) obj14;
                                                                                            ((Integer) obj16).getClass();
                                                                                            oqVar3.getClass();
                                                                                            thjVar5.getClass();
                                                                                            oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                            oq5Var9.Z(-570789513);
                                                                                            boolean f14 = oq5Var9.f(oqVar3);
                                                                                            Object K142 = oq5Var9.K();
                                                                                            if (f14 || K142 == gq5.a) {
                                                                                                j00 j00Var10 = j00Var7;
                                                                                                tmb tmbVar3 = j00Var10.h;
                                                                                                jab jabVar8 = jabVar5;
                                                                                                g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                                oq5Var9.k0(g00Var5);
                                                                                                K142 = g00Var5;
                                                                                            }
                                                                                            g00 g00Var6 = (g00) K142;
                                                                                            oq5Var9.p(false);
                                                                                            return g00Var6;
                                                                                    }
                                                                                }
                                                                            };
                                                                            boolean h15 = oq5Var7.h(j00Var7) | oq5Var7.h(jabVar5);
                                                                            Object K13 = oq5Var7.K();
                                                                            if (h15 || K13 == kjnVar) {
                                                                                K13 = new zu(j00Var7, jabVar5, i19);
                                                                                oq5Var7.k0(K13);
                                                                            }
                                                                            pyc pycVar2 = (pyc) K13;
                                                                            boolean h16 = oq5Var7.h(j00Var7) | oq5Var7.h(jabVar5);
                                                                            Object K14 = oq5Var7.K();
                                                                            if (h16 || K14 == kjnVar) {
                                                                                K14 = new cv(j00Var7, jabVar5, i20);
                                                                                oq5Var7.k0(K14);
                                                                            }
                                                                            xv.v(arrayList2, str3, rycVar2, a6, pycVar2, M2, (Function0) K14, oq5Var7, 3080, 0);
                                                                        } else {
                                                                            oq5Var7.S();
                                                                        }
                                                                        break;
                                                                    default:
                                                                        hq5 hq5Var7 = (hq5) obj9;
                                                                        int intValue6 = ((Integer) obj10).intValue();
                                                                        ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                        oq5 oq5Var8 = (oq5) hq5Var7;
                                                                        if (oq5Var8.P(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                                            ey eyVar2 = ((py) uyVar2).a;
                                                                            ArrayList arrayList22 = eyVar2.b;
                                                                            String N = rvf.N(R.string.more_of_artist, new Object[]{eyVar2.a}, oq5Var8);
                                                                            yci a7 = androidx.compose.ui.platform.a.a(vciVar2, "more_albums");
                                                                            final int i22 = r10 ? 1 : 0;
                                                                            ryc rycVar3 = new ryc() { // from class: ev
                                                                                @Override // defpackage.ryc
                                                                                public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                    switch (i22) {
                                                                                        case 0:
                                                                                            oq oqVar = (oq) obj13;
                                                                                            thj thjVar3 = (thj) obj14;
                                                                                            ((Integer) obj16).getClass();
                                                                                            oqVar.getClass();
                                                                                            thjVar3.getClass();
                                                                                            oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                            oq5Var72.Z(-1010350727);
                                                                                            boolean f12 = oq5Var72.f(oqVar);
                                                                                            Object K122 = oq5Var72.K();
                                                                                            if (f12 || K122 == gq5.a) {
                                                                                                j00 j00Var8 = j00Var7;
                                                                                                tmb tmbVar = j00Var8.h;
                                                                                                jab jabVar6 = jabVar5;
                                                                                                g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                                oq5Var72.k0(g00Var);
                                                                                                K122 = g00Var;
                                                                                            }
                                                                                            g00 g00Var2 = (g00) K122;
                                                                                            oq5Var72.p(false);
                                                                                            return g00Var2;
                                                                                        case 1:
                                                                                            oq oqVar2 = (oq) obj13;
                                                                                            thj thjVar4 = (thj) obj14;
                                                                                            ((Integer) obj16).getClass();
                                                                                            oqVar2.getClass();
                                                                                            thjVar4.getClass();
                                                                                            oq5 oq5Var82 = (oq5) ((hq5) obj15);
                                                                                            oq5Var82.Z(-790570120);
                                                                                            boolean f13 = oq5Var82.f(oqVar2);
                                                                                            Object K132 = oq5Var82.K();
                                                                                            if (f13 || K132 == gq5.a) {
                                                                                                j00 j00Var9 = j00Var7;
                                                                                                tmb tmbVar2 = j00Var9.h;
                                                                                                jab jabVar7 = jabVar5;
                                                                                                g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                                oq5Var82.k0(g00Var3);
                                                                                                K132 = g00Var3;
                                                                                            }
                                                                                            g00 g00Var4 = (g00) K132;
                                                                                            oq5Var82.p(false);
                                                                                            return g00Var4;
                                                                                        default:
                                                                                            oq oqVar3 = (oq) obj13;
                                                                                            thj thjVar5 = (thj) obj14;
                                                                                            ((Integer) obj16).getClass();
                                                                                            oqVar3.getClass();
                                                                                            thjVar5.getClass();
                                                                                            oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                            oq5Var9.Z(-570789513);
                                                                                            boolean f14 = oq5Var9.f(oqVar3);
                                                                                            Object K142 = oq5Var9.K();
                                                                                            if (f14 || K142 == gq5.a) {
                                                                                                j00 j00Var10 = j00Var7;
                                                                                                tmb tmbVar3 = j00Var10.h;
                                                                                                jab jabVar8 = jabVar5;
                                                                                                g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                                oq5Var9.k0(g00Var5);
                                                                                                K142 = g00Var5;
                                                                                            }
                                                                                            g00 g00Var6 = (g00) K142;
                                                                                            oq5Var9.p(false);
                                                                                            return g00Var6;
                                                                                    }
                                                                                }
                                                                            };
                                                                            boolean h17 = oq5Var8.h(j00Var7) | oq5Var8.h(jabVar5);
                                                                            Object K15 = oq5Var8.K();
                                                                            if (h17 || K15 == kjnVar) {
                                                                                K15 = new zu(j00Var7, jabVar5, i20);
                                                                                oq5Var8.k0(K15);
                                                                            }
                                                                            xv.v(arrayList22, N, rycVar3, a7, (pyc) K15, null, null, oq5Var8, 3080, 96);
                                                                        } else {
                                                                            oq5Var8.S();
                                                                        }
                                                                        break;
                                                                }
                                                                return Unit.a;
                                                            }
                                                        }, 2068070762, true), 2);
                                                    } else {
                                                        i10 = 3;
                                                        if (uyVar instanceof py) {
                                                            final int i18 = 4;
                                                            vuf.Y(vufVar, xv.L(uyVar), new wn5(new pyc() { // from class: xu
                                                                @Override // defpackage.pyc
                                                                public final Object invoke(Object obj82, Object obj9, Object obj10) {
                                                                    int i182 = i18;
                                                                    final int i19 = 2;
                                                                    kjn kjnVar = gq5.a;
                                                                    vci vciVar2 = vci.a;
                                                                    final jab jabVar5 = jabVar4;
                                                                    final j00 j00Var7 = j00Var4;
                                                                    uy uyVar2 = uyVar;
                                                                    final int i20 = 1;
                                                                    switch (i182) {
                                                                        case 0:
                                                                            hq5 hq5Var3 = (hq5) obj9;
                                                                            int intValue2 = ((Integer) obj10).intValue();
                                                                            ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                            oq5 oq5Var4 = (oq5) hq5Var3;
                                                                            if (oq5Var4.P(intValue2 & 1, (intValue2 & 17) != 16)) {
                                                                                te teVar = ((ly) uyVar2).a;
                                                                                thj v2 = qwp.v(teVar);
                                                                                vci vciVar3 = vci.a;
                                                                                yci d3 = d.d(vciVar3, 1.0f);
                                                                                kfh d4 = ug3.d(b2c.f, false);
                                                                                int i21 = oq5Var4.P;
                                                                                a l2 = oq5Var4.l();
                                                                                yci H2 = vnj.H(oq5Var4, d3);
                                                                                xp5.T.getClass();
                                                                                grb grbVar2 = wp5.b;
                                                                                oq5Var4.d0();
                                                                                if (oq5Var4.O) {
                                                                                    oq5Var4.k(grbVar2);
                                                                                } else {
                                                                                    oq5Var4.n0();
                                                                                }
                                                                                g0g.U(oq5Var4, d4, wp5.f);
                                                                                g0g.U(oq5Var4, l2, wp5.e);
                                                                                kb5 kb5Var2 = wp5.g;
                                                                                if (oq5Var4.O || !Intrinsics.d(oq5Var4.K(), Integer.valueOf(i21))) {
                                                                                    ouj.x(i21, oq5Var4, i21, kb5Var2);
                                                                                }
                                                                                g0g.U(oq5Var4, H2, wp5.d);
                                                                                String str2 = teVar.a;
                                                                                d85 d85Var = teVar.b;
                                                                                float f11 = qbb.c;
                                                                                yci q = androidx.compose.foundation.layout.a.q(vciVar3, f11, 0.0f, f11, 0.0f, 10);
                                                                                boolean h12 = oq5Var4.h(j00Var7) | oq5Var4.h(jabVar5) | oq5Var4.h(v2);
                                                                                Object K10 = oq5Var4.K();
                                                                                Object obj11 = K10;
                                                                                if (h12 || K10 == kjnVar) {
                                                                                    bv bvVar = new bv(j00Var7, jabVar5, v2, 0);
                                                                                    oq5Var4.k0(bvVar);
                                                                                    obj11 = bvVar;
                                                                                }
                                                                                yci a4 = androidx.compose.ui.platform.a.a(com.yandex.music.core.ui.compose.a.b(q, null, 0L, 0.0f, null, (Function2) obj11, 15), "branded_button");
                                                                                boolean h13 = oq5Var4.h(j00Var7) | oq5Var4.h(jabVar5);
                                                                                Object K11 = oq5Var4.K();
                                                                                Object obj12 = K11;
                                                                                if (h13 || K11 == kjnVar) {
                                                                                    cv cvVar = new cv(j00Var7, jabVar5, r10 ? 1 : 0);
                                                                                    oq5Var4.k0(cvVar);
                                                                                    obj12 = cvVar;
                                                                                }
                                                                                hdg.b(str2, (Function0) obj12, a4, d85Var, null, oq5Var4, 0, 16);
                                                                                oq5Var4.p(true);
                                                                            } else {
                                                                                oq5Var4.S();
                                                                            }
                                                                            break;
                                                                        case 1:
                                                                            hq5 hq5Var4 = (hq5) obj9;
                                                                            int intValue3 = ((Integer) obj10).intValue();
                                                                            ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                            oq5 oq5Var5 = (oq5) hq5Var4;
                                                                            if (oq5Var5.P(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                                                xv.w(((ry) uyVar2).a, j00Var4, jabVar4, androidx.compose.ui.platform.a.a(vciVar2, "similar_entities"), oq5Var5, 3072);
                                                                            } else {
                                                                                oq5Var5.S();
                                                                            }
                                                                            break;
                                                                        case 2:
                                                                            hq5 hq5Var5 = (hq5) obj9;
                                                                            int intValue4 = ((Integer) obj10).intValue();
                                                                            ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                            oq5 oq5Var6 = (oq5) hq5Var5;
                                                                            if (oq5Var6.P(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                                                List list6 = ((oy) uyVar2).a;
                                                                                String M = rvf.M(R.string.other_album_versions, oq5Var6);
                                                                                yci a5 = androidx.compose.ui.platform.a.a(vciVar2, "duplicate_albums");
                                                                                ryc rycVar = new ryc() { // from class: ev
                                                                                    @Override // defpackage.ryc
                                                                                    public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                        switch (i19) {
                                                                                            case 0:
                                                                                                oq oqVar = (oq) obj13;
                                                                                                thj thjVar3 = (thj) obj14;
                                                                                                ((Integer) obj16).getClass();
                                                                                                oqVar.getClass();
                                                                                                thjVar3.getClass();
                                                                                                oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                                oq5Var72.Z(-1010350727);
                                                                                                boolean f12 = oq5Var72.f(oqVar);
                                                                                                Object K122 = oq5Var72.K();
                                                                                                if (f12 || K122 == gq5.a) {
                                                                                                    j00 j00Var8 = j00Var7;
                                                                                                    tmb tmbVar = j00Var8.h;
                                                                                                    jab jabVar6 = jabVar5;
                                                                                                    g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                                    oq5Var72.k0(g00Var);
                                                                                                    K122 = g00Var;
                                                                                                }
                                                                                                g00 g00Var2 = (g00) K122;
                                                                                                oq5Var72.p(false);
                                                                                                return g00Var2;
                                                                                            case 1:
                                                                                                oq oqVar2 = (oq) obj13;
                                                                                                thj thjVar4 = (thj) obj14;
                                                                                                ((Integer) obj16).getClass();
                                                                                                oqVar2.getClass();
                                                                                                thjVar4.getClass();
                                                                                                oq5 oq5Var82 = (oq5) ((hq5) obj15);
                                                                                                oq5Var82.Z(-790570120);
                                                                                                boolean f13 = oq5Var82.f(oqVar2);
                                                                                                Object K132 = oq5Var82.K();
                                                                                                if (f13 || K132 == gq5.a) {
                                                                                                    j00 j00Var9 = j00Var7;
                                                                                                    tmb tmbVar2 = j00Var9.h;
                                                                                                    jab jabVar7 = jabVar5;
                                                                                                    g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                                    oq5Var82.k0(g00Var3);
                                                                                                    K132 = g00Var3;
                                                                                                }
                                                                                                g00 g00Var4 = (g00) K132;
                                                                                                oq5Var82.p(false);
                                                                                                return g00Var4;
                                                                                            default:
                                                                                                oq oqVar3 = (oq) obj13;
                                                                                                thj thjVar5 = (thj) obj14;
                                                                                                ((Integer) obj16).getClass();
                                                                                                oqVar3.getClass();
                                                                                                thjVar5.getClass();
                                                                                                oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                                oq5Var9.Z(-570789513);
                                                                                                boolean f14 = oq5Var9.f(oqVar3);
                                                                                                Object K142 = oq5Var9.K();
                                                                                                if (f14 || K142 == gq5.a) {
                                                                                                    j00 j00Var10 = j00Var7;
                                                                                                    tmb tmbVar3 = j00Var10.h;
                                                                                                    jab jabVar8 = jabVar5;
                                                                                                    g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                                    oq5Var9.k0(g00Var5);
                                                                                                    K142 = g00Var5;
                                                                                                }
                                                                                                g00 g00Var6 = (g00) K142;
                                                                                                oq5Var9.p(false);
                                                                                                return g00Var6;
                                                                                        }
                                                                                    }
                                                                                };
                                                                                boolean h14 = oq5Var6.h(j00Var7) | oq5Var6.h(jabVar5);
                                                                                Object K12 = oq5Var6.K();
                                                                                if (h14 || K12 == kjnVar) {
                                                                                    K12 = new zu(j00Var7, jabVar5, 3);
                                                                                    oq5Var6.k0(K12);
                                                                                }
                                                                                xv.v(list6, M, rycVar, a5, (pyc) K12, null, null, oq5Var6, 3080, 96);
                                                                            } else {
                                                                                oq5Var6.S();
                                                                            }
                                                                            break;
                                                                        case 3:
                                                                            hq5 hq5Var6 = (hq5) obj9;
                                                                            int intValue5 = ((Integer) obj10).intValue();
                                                                            ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                            oq5 oq5Var7 = (oq5) hq5Var6;
                                                                            if (oq5Var7.P(intValue5 & 1, (intValue5 & 17) != 16)) {
                                                                                ey eyVar = ((qy) uyVar2).a;
                                                                                ArrayList arrayList2 = eyVar.b;
                                                                                String str3 = eyVar.a;
                                                                                String M2 = rvf.M(R.string.more_albums, oq5Var7);
                                                                                yci a6 = androidx.compose.ui.platform.a.a(vciVar2, "albums_same_genre");
                                                                                ryc rycVar2 = new ryc() { // from class: ev
                                                                                    @Override // defpackage.ryc
                                                                                    public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                        switch (i20) {
                                                                                            case 0:
                                                                                                oq oqVar = (oq) obj13;
                                                                                                thj thjVar3 = (thj) obj14;
                                                                                                ((Integer) obj16).getClass();
                                                                                                oqVar.getClass();
                                                                                                thjVar3.getClass();
                                                                                                oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                                oq5Var72.Z(-1010350727);
                                                                                                boolean f12 = oq5Var72.f(oqVar);
                                                                                                Object K122 = oq5Var72.K();
                                                                                                if (f12 || K122 == gq5.a) {
                                                                                                    j00 j00Var8 = j00Var7;
                                                                                                    tmb tmbVar = j00Var8.h;
                                                                                                    jab jabVar6 = jabVar5;
                                                                                                    g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                                    oq5Var72.k0(g00Var);
                                                                                                    K122 = g00Var;
                                                                                                }
                                                                                                g00 g00Var2 = (g00) K122;
                                                                                                oq5Var72.p(false);
                                                                                                return g00Var2;
                                                                                            case 1:
                                                                                                oq oqVar2 = (oq) obj13;
                                                                                                thj thjVar4 = (thj) obj14;
                                                                                                ((Integer) obj16).getClass();
                                                                                                oqVar2.getClass();
                                                                                                thjVar4.getClass();
                                                                                                oq5 oq5Var82 = (oq5) ((hq5) obj15);
                                                                                                oq5Var82.Z(-790570120);
                                                                                                boolean f13 = oq5Var82.f(oqVar2);
                                                                                                Object K132 = oq5Var82.K();
                                                                                                if (f13 || K132 == gq5.a) {
                                                                                                    j00 j00Var9 = j00Var7;
                                                                                                    tmb tmbVar2 = j00Var9.h;
                                                                                                    jab jabVar7 = jabVar5;
                                                                                                    g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                                    oq5Var82.k0(g00Var3);
                                                                                                    K132 = g00Var3;
                                                                                                }
                                                                                                g00 g00Var4 = (g00) K132;
                                                                                                oq5Var82.p(false);
                                                                                                return g00Var4;
                                                                                            default:
                                                                                                oq oqVar3 = (oq) obj13;
                                                                                                thj thjVar5 = (thj) obj14;
                                                                                                ((Integer) obj16).getClass();
                                                                                                oqVar3.getClass();
                                                                                                thjVar5.getClass();
                                                                                                oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                                oq5Var9.Z(-570789513);
                                                                                                boolean f14 = oq5Var9.f(oqVar3);
                                                                                                Object K142 = oq5Var9.K();
                                                                                                if (f14 || K142 == gq5.a) {
                                                                                                    j00 j00Var10 = j00Var7;
                                                                                                    tmb tmbVar3 = j00Var10.h;
                                                                                                    jab jabVar8 = jabVar5;
                                                                                                    g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                                    oq5Var9.k0(g00Var5);
                                                                                                    K142 = g00Var5;
                                                                                                }
                                                                                                g00 g00Var6 = (g00) K142;
                                                                                                oq5Var9.p(false);
                                                                                                return g00Var6;
                                                                                        }
                                                                                    }
                                                                                };
                                                                                boolean h15 = oq5Var7.h(j00Var7) | oq5Var7.h(jabVar5);
                                                                                Object K13 = oq5Var7.K();
                                                                                if (h15 || K13 == kjnVar) {
                                                                                    K13 = new zu(j00Var7, jabVar5, i19);
                                                                                    oq5Var7.k0(K13);
                                                                                }
                                                                                pyc pycVar2 = (pyc) K13;
                                                                                boolean h16 = oq5Var7.h(j00Var7) | oq5Var7.h(jabVar5);
                                                                                Object K14 = oq5Var7.K();
                                                                                if (h16 || K14 == kjnVar) {
                                                                                    K14 = new cv(j00Var7, jabVar5, i20);
                                                                                    oq5Var7.k0(K14);
                                                                                }
                                                                                xv.v(arrayList2, str3, rycVar2, a6, pycVar2, M2, (Function0) K14, oq5Var7, 3080, 0);
                                                                            } else {
                                                                                oq5Var7.S();
                                                                            }
                                                                            break;
                                                                        default:
                                                                            hq5 hq5Var7 = (hq5) obj9;
                                                                            int intValue6 = ((Integer) obj10).intValue();
                                                                            ((androidx.compose.foundation.lazy.a) obj82).getClass();
                                                                            oq5 oq5Var8 = (oq5) hq5Var7;
                                                                            if (oq5Var8.P(intValue6 & 1, (intValue6 & 17) != 16)) {
                                                                                ey eyVar2 = ((py) uyVar2).a;
                                                                                ArrayList arrayList22 = eyVar2.b;
                                                                                String N = rvf.N(R.string.more_of_artist, new Object[]{eyVar2.a}, oq5Var8);
                                                                                yci a7 = androidx.compose.ui.platform.a.a(vciVar2, "more_albums");
                                                                                final int i22 = r10 ? 1 : 0;
                                                                                ryc rycVar3 = new ryc() { // from class: ev
                                                                                    @Override // defpackage.ryc
                                                                                    public final Object invoke(Object obj13, Object obj14, Object obj15, Object obj16) {
                                                                                        switch (i22) {
                                                                                            case 0:
                                                                                                oq oqVar = (oq) obj13;
                                                                                                thj thjVar3 = (thj) obj14;
                                                                                                ((Integer) obj16).getClass();
                                                                                                oqVar.getClass();
                                                                                                thjVar3.getClass();
                                                                                                oq5 oq5Var72 = (oq5) ((hq5) obj15);
                                                                                                oq5Var72.Z(-1010350727);
                                                                                                boolean f12 = oq5Var72.f(oqVar);
                                                                                                Object K122 = oq5Var72.K();
                                                                                                if (f12 || K122 == gq5.a) {
                                                                                                    j00 j00Var8 = j00Var7;
                                                                                                    tmb tmbVar = j00Var8.h;
                                                                                                    jab jabVar6 = jabVar5;
                                                                                                    g00 g00Var = new g00(tmbVar.a(jabVar6, null), thjVar3, j00Var8, oqVar, jabVar6);
                                                                                                    oq5Var72.k0(g00Var);
                                                                                                    K122 = g00Var;
                                                                                                }
                                                                                                g00 g00Var2 = (g00) K122;
                                                                                                oq5Var72.p(false);
                                                                                                return g00Var2;
                                                                                            case 1:
                                                                                                oq oqVar2 = (oq) obj13;
                                                                                                thj thjVar4 = (thj) obj14;
                                                                                                ((Integer) obj16).getClass();
                                                                                                oqVar2.getClass();
                                                                                                thjVar4.getClass();
                                                                                                oq5 oq5Var82 = (oq5) ((hq5) obj15);
                                                                                                oq5Var82.Z(-790570120);
                                                                                                boolean f13 = oq5Var82.f(oqVar2);
                                                                                                Object K132 = oq5Var82.K();
                                                                                                if (f13 || K132 == gq5.a) {
                                                                                                    j00 j00Var9 = j00Var7;
                                                                                                    tmb tmbVar2 = j00Var9.h;
                                                                                                    jab jabVar7 = jabVar5;
                                                                                                    g00 g00Var3 = new g00(tmbVar2.a(jabVar7, null), thjVar4, j00Var9, oqVar2, jabVar7);
                                                                                                    oq5Var82.k0(g00Var3);
                                                                                                    K132 = g00Var3;
                                                                                                }
                                                                                                g00 g00Var4 = (g00) K132;
                                                                                                oq5Var82.p(false);
                                                                                                return g00Var4;
                                                                                            default:
                                                                                                oq oqVar3 = (oq) obj13;
                                                                                                thj thjVar5 = (thj) obj14;
                                                                                                ((Integer) obj16).getClass();
                                                                                                oqVar3.getClass();
                                                                                                thjVar5.getClass();
                                                                                                oq5 oq5Var9 = (oq5) ((hq5) obj15);
                                                                                                oq5Var9.Z(-570789513);
                                                                                                boolean f14 = oq5Var9.f(oqVar3);
                                                                                                Object K142 = oq5Var9.K();
                                                                                                if (f14 || K142 == gq5.a) {
                                                                                                    j00 j00Var10 = j00Var7;
                                                                                                    tmb tmbVar3 = j00Var10.h;
                                                                                                    jab jabVar8 = jabVar5;
                                                                                                    g00 g00Var5 = new g00(tmbVar3.a(jabVar8, null), thjVar5, j00Var10, oqVar3, jabVar8);
                                                                                                    oq5Var9.k0(g00Var5);
                                                                                                    K142 = g00Var5;
                                                                                                }
                                                                                                g00 g00Var6 = (g00) K142;
                                                                                                oq5Var9.p(false);
                                                                                                return g00Var6;
                                                                                        }
                                                                                    }
                                                                                };
                                                                                boolean h17 = oq5Var8.h(j00Var7) | oq5Var8.h(jabVar5);
                                                                                Object K15 = oq5Var8.K();
                                                                                if (h17 || K15 == kjnVar) {
                                                                                    K15 = new zu(j00Var7, jabVar5, i20);
                                                                                    oq5Var8.k0(K15);
                                                                                }
                                                                                xv.v(arrayList22, N, rycVar3, a7, (pyc) K15, null, null, oq5Var8, 3080, 96);
                                                                            } else {
                                                                                oq5Var8.S();
                                                                            }
                                                                            break;
                                                                    }
                                                                    return Unit.a;
                                                                }
                                                            }, 1848290155, true), 2);
                                                        } else {
                                                            if (!uyVar.equals(my.a)) {
                                                                b6e.s();
                                                                return null;
                                                            }
                                                            i11 = 0;
                                                            vuf.Y(vufVar, xv.L(uyVar), new wn5(new zu(j00Var4, jabVar4, i11), 1628509548, true), 2);
                                                            i12 = i9;
                                                            vuf.Y(vufVar, k5r.i(i12, "trailing_spacer_"), new wn5(new dv(list5, i12, (uy) list5.get(i12), i11), 963858607, true), 2);
                                                            i14 = i11;
                                                            j00Var6 = j00Var4;
                                                            i15 = i16;
                                                            function1 = null;
                                                        }
                                                    }
                                                    i12 = i9;
                                                    i11 = 0;
                                                    vuf.Y(vufVar, k5r.i(i12, "trailing_spacer_"), new wn5(new dv(list5, i12, (uy) list5.get(i12), i11), 963858607, true), 2);
                                                    i14 = i11;
                                                    j00Var6 = j00Var4;
                                                    i15 = i16;
                                                    function1 = null;
                                                }
                                            }
                                            i12 = i9;
                                            i11 = 0;
                                            i10 = 3;
                                            vuf.Y(vufVar, k5r.i(i12, "trailing_spacer_"), new wn5(new dv(list5, i12, (uy) list5.get(i12), i11), 963858607, true), 2);
                                            i14 = i11;
                                            j00Var6 = j00Var4;
                                            i15 = i16;
                                            function1 = null;
                                        }
                                        i11 = i14;
                                        i10 = 3;
                                        i12 = i15;
                                        vuf.Y(vufVar, k5r.i(i12, "trailing_spacer_"), new wn5(new dv(list5, i12, (uy) list5.get(i12), i11), 963858607, true), 2);
                                        i14 = i11;
                                        j00Var6 = j00Var4;
                                        i15 = i16;
                                        function1 = null;
                                    }
                                    size = 1;
                                    final jab jabVar42 = new jab(qkbVar, 1, i15 + 2, size);
                                    j00Var6.a(jabVar42);
                                    Function1 function142 = function1;
                                    final int i172 = 2;
                                    vuf.Y(vufVar, k5r.i(i15, "leading_spacer_"), new wn5(new gv(i15, i14), -1835696831, true), 2);
                                    if (!z4) {
                                    }
                                    i11 = i14;
                                    i10 = 3;
                                    i12 = i15;
                                    vuf.Y(vufVar, k5r.i(i12, "trailing_spacer_"), new wn5(new dv(list5, i12, (uy) list5.get(i12), i11), 963858607, true), 2);
                                    i14 = i11;
                                    j00Var6 = j00Var4;
                                    i15 = i16;
                                    function1 = null;
                                }
                                jf0.h(vufVar, fvfVar, eoeVar);
                                return Unit.a;
                            }
                        };
                        oq5Var2.k0(K9);
                        weo.f(a3, fvfVar, C, null, null, v, false, null, (Function1) K9, oq5Var2, 6, 440);
                    } else {
                        oq5Var3.S();
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 3078, 6);
            String str2 = iabVar2.a;
            boolean z3 = i7 == 16384 || ((i4 & SQLiteDatabase.OPEN_NOMUTEX) != 0 && oq5Var.h(j00Var));
            Object K9 = oq5Var.K();
            if (z3) {
                obj = obj2;
            } else {
                obj = obj2;
                if (K9 != obj) {
                    j00Var2 = j00Var;
                    yci a3 = androidx.compose.ui.platform.a.a(vciVar, "album_top_bar");
                    float f4 = edo.a;
                    Function0 function02 = (Function0) ((h9f) K9);
                    h2 = (i7 != 16384 || ((i4 & SQLiteDatabase.OPEN_NOMUTEX) != 0 && oq5Var.h(j00Var2))) | oq5Var.h(jabVar) | oq5Var.h(w);
                    K = oq5Var.K();
                    if (!h2 || K == obj) {
                        K = new rr(j00Var2, jabVar, w, 9);
                        oq5Var.k0(K);
                    }
                    Function0 function03 = (Function0) K;
                    if (i7 != 16384 || ((i4 & SQLiteDatabase.OPEN_NOMUTEX) != 0 && oq5Var.h(j00Var2))) {
                        z2 = true;
                    }
                    h3 = z2 | oq5Var.h(jabVar) | oq5Var.h(w);
                    K2 = oq5Var.K();
                    if (!h3 || K2 == obj) {
                        K2 = new rr(j00Var2, jabVar, w, 10);
                        oq5Var.k0(K2);
                    }
                    edo.c(X, str2, a3, function02, function03, (Function0) K2, f2, oq5Var, 384, 0);
                    oq5Var = oq5Var;
                    oq5Var.p(true);
                }
            }
            K9 = new c3(0, j00Var, j00.class, "onBackClick", "onBackClick()V", 0, 18);
            j00Var2 = j00Var;
            oq5Var.k0(K9);
            yci a32 = androidx.compose.ui.platform.a.a(vciVar, "album_top_bar");
            float f42 = edo.a;
            Function0 function022 = (Function0) ((h9f) K9);
            h2 = (i7 != 16384 || ((i4 & SQLiteDatabase.OPEN_NOMUTEX) != 0 && oq5Var.h(j00Var2))) | oq5Var.h(jabVar) | oq5Var.h(w);
            K = oq5Var.K();
            if (!h2) {
            }
            K = new rr(j00Var2, jabVar, w, 9);
            oq5Var.k0(K);
            Function0 function032 = (Function0) K;
            if (i7 != 16384) {
            }
            z2 = true;
            h3 = z2 | oq5Var.h(jabVar) | oq5Var.h(w);
            K2 = oq5Var.K();
            if (!h3) {
            }
            K2 = new rr(j00Var2, jabVar, w, 10);
            oq5Var.k0(K2);
            edo.c(X, str2, a32, function022, function032, (Function0) K2, f2, oq5Var, 384, 0);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            iabVar2 = iabVar;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i2, 0, list, ltVar, iabVar2, gvdVar, j00Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a9, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r11.K(), java.lang.Integer.valueOf(r12)) != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(String str, List list, Function1 function1, yci yciVar, hq5 hq5Var, int i2) {
        Function1 function12;
        str.getClass();
        list.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1353018888);
        int i3 = i2 | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(list) ? 32 : 16) | (oq5Var.h(function1) ? 256 : 128);
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            function12 = function1;
        } else {
            gz2 gz2Var = b2c.o;
            float f2 = 16;
            yci d2 = d.d(androidx.compose.foundation.layout.a.p(yciVar, f2, 12, f2, 32), 1.0f);
            kx0 kx0Var = qx0.c;
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 48);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
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
            g0g.U(oq5Var, l, kb5Var2);
            kb5 kb5Var3 = wp5.g;
            if (oq5Var.O) {
            }
            ouj.x(i4, oq5Var, i4, kb5Var3);
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            vci vciVar = vci.a;
            yci a3 = androidx.compose.ui.platform.a.a(vciVar, "artist_list_bottom_sheet_title");
            ges c2 = nu0.c();
            agr agrVar = eq0.a;
            int i5 = i3;
            xv7.j(str, a3, ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 0, 0L, 0, false, 0, 0, null, c2, oq5Var, (i3 & 14) | 48, 0, 65528);
            oq5Var = oq5Var;
            u1g.l(oq5Var, d.e(vciVar, f2));
            yci a4 = androidx.compose.ui.platform.a.a(androidx.compose.foundation.a.b(vciVar, ((dq0) oq5Var.j(agrVar)).d.c, ugo.a(8)), "artist_list_bottom_sheet_column");
            ta5 a5 = sa5.a(kx0Var, b2c.n, oq5Var, 0);
            int i6 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, a4);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a5, kb5Var);
            g0g.U(oq5Var, l2, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                ouj.x(i6, oq5Var, i6, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            oq5Var.Z(-744546698);
            int i7 = 0;
            for (Object obj : list) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    u75.n();
                    throw null;
                }
                u51 u51Var = (u51) obj;
                int i9 = i5;
                boolean h2 = ((i9 & 896) == 256) | oq5Var.h(u51Var);
                Object K = oq5Var.K();
                if (h2 || K == gq5.a) {
                    K = new hb(19, function1, u51Var);
                    oq5Var.k0(K);
                }
                e(u51Var, (Function0) K, i7, list.size() - 1, null, oq5Var, 0);
                i5 = i9;
                i7 = i8;
            }
            function12 = function1;
            f1d.u(oq5Var, false, true, true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl(i2, 15, str, list, function12, yciVar);
        }
    }

    public static final void e(u51 u51Var, Function0 function0, int i2, int i3, yci yciVar, hq5 hq5Var, int i4) {
        String e2;
        boolean z;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(221206214);
        if (((i4 | (oq5Var.h(u51Var) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.d(i2) ? 256 : 128) | (oq5Var.d(i3) ? 2048 : 1024) | 24576) & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            boolean z2 = i2 != i3;
            hz2 hz2Var = b2c.l;
            vci vciVar = vci.a;
            float f2 = 8;
            yci e3 = androidx.compose.foundation.a.e(androidx.compose.foundation.layout.a.o(d.d(vciVar, 1.0f), f2, 0.0f, 2), false, null, null, function0, 7);
            nho a2 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i5 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, e3);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            float f3 = 48;
            yci b2 = b.b(androidx.compose.ui.platform.a.a(xp3.u(d.m(androidx.compose.foundation.layout.a.o(vciVar, 0.0f, f2, 1), f3), ugo.a), "artist_list_item_cover"), i2);
            u9b u9bVar = u51Var.c;
            if (u9bVar == null) {
                oq5Var.Z(-408590420);
                oq5Var.p(false);
                e2 = null;
            } else {
                oq5Var.Z(1233745653);
                e2 = u9bVar.e(ff7.K(f3, oq5Var), WebPath$Storage.AVATARS);
                oq5Var.p(false);
            }
            if (e2 == null) {
                e2 = "";
            }
            irf.d(e2, b2, null, null, oq5Var, 0, 12);
            u1g.l(oq5Var, d.r(vciVar, 12));
            String str = u51Var.b;
            ges j2 = nu0.j();
            agr agrVar = eq0.a;
            xv7.j(str, b.b(androidx.compose.ui.platform.a.a(vciVar, "artist_list_item_title"), i2), ((dq0) oq5Var.j(agrVar)).b.a, 0L, 0L, 0, 0L, 0, false, 0, 0, null, j2, oq5Var, 0, 0, 65528);
            oq5Var = oq5Var;
            oq5Var.p(true);
            if (z2) {
                oq5Var.Z(1475686215);
                xv7.k(d.d(vciVar, 1.0f), ((dq0) oq5Var.j(agrVar)).c.c, 0.0f, 0.0f, oq5Var, 6, 12);
                oq5Var = oq5Var;
                z = false;
            } else {
                z = false;
                oq5Var.Z(1471558844);
            }
            oq5Var.p(z);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new lx(u51Var, function0, i2, i3, yciVar2, i4);
        }
    }

    public static final void f(qzm[] qzmVarArr, dq0 dq0Var, ma5 ma5Var, cce cceVar, q8r q8rVar, Function2 function2, hq5 hq5Var, int i2) {
        qzmVarArr.getClass();
        cceVar.getClass();
        q8rVar.getClass();
        function2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(753574972);
        int i3 = (i2 & 48) == 0 ? (oq5Var.f(dq0Var) ? 32 : 16) | i2 : i2;
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(ma5Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.h(cceVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.h(q8rVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.h(function2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        oq5Var.W(-1663924018, Integer.valueOf(qzmVarArr.length));
        int i4 = i3 | (oq5Var.d(qzmVarArr.length) ? 4 : 0);
        for (qzm qzmVar : qzmVarArr) {
            i4 |= (i2 & 8) == 0 ? oq5Var.f(qzmVar) : oq5Var.h(qzmVar) ? 4 : 0;
        }
        oq5Var.p(false);
        if ((i4 & 14) == 0) {
            i4 |= 2;
        }
        if ((74899 & i4) == 74898 && oq5Var.z()) {
            oq5Var.S();
        } else {
            u(ma5Var, ild.C(-1023930115, new su0(qzmVarArr, dq0Var, cceVar, q8rVar, function2), oq5Var), oq5Var, ((i4 >> 6) & 14) | 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new uu0(qzmVarArr, dq0Var, ma5Var, cceVar, q8rVar, function2, i2, 0);
        }
    }

    public static final void g(qzm[] qzmVarArr, dq0 dq0Var, cce cceVar, q8r q8rVar, Function2 function2, hq5 hq5Var, int i2) {
        cceVar.getClass();
        q8rVar.getClass();
        function2.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1058630471);
        int i3 = (oq5Var.f(dq0Var) ? 32 : 16) | i2 | (oq5Var.h(cceVar) ? 256 : 128) | (oq5Var.h(q8rVar) ? 2048 : 1024) | (oq5Var.h(function2) ? 16384 : RemoteCameraConfig.Notification.ID);
        oq5Var.W(563367179, Integer.valueOf(qzmVarArr.length));
        int i4 = i3 | (oq5Var.d(qzmVarArr.length) ? 4 : 0);
        for (qzm qzmVar : qzmVarArr) {
            i4 |= oq5Var.h(qzmVar) ? 4 : 0;
        }
        oq5Var.p(false);
        if ((i4 & 14) == 0) {
            i4 |= 2;
        }
        if ((i4 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pz0 pz0Var = new pz0(4);
            pz0Var.c(qzmVarArr);
            pz0Var.b(eq0.a.a(dq0Var));
            pz0Var.b(tkg.a.a(cceVar));
            pz0Var.b(t8r.a.a(q8rVar));
            ArrayList arrayList = pz0Var.a;
            etn.m((qzm[]) arrayList.toArray(new qzm[arrayList.size()]), function2, oq5Var, ((i4 >> 9) & 112) | 8);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new su0(qzmVarArr, dq0Var, cceVar, q8rVar, function2, i2);
        }
    }

    public static final void h(final Function0 function0, final float f2, final long j2, final long j3, yci yciVar, final int i2, hq5 hq5Var, final int i3) {
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1623093318);
        int i4 = i3 | (oq5Var.h(function0) ? 4 : 2) | (oq5Var.e(j2) ? 256 : 128) | (oq5Var.e(j3) ? 2048 : 1024) | (oq5Var.d(i2) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((74899 & i4) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            oq5Var.U();
            if ((i3 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            amr amrVar = new amr(((jx7) oq5Var.j(es5.h)).n0(f2), 0.0f, i2, 0, 26);
            float f3 = 40;
            yciVar2 = yciVar;
            yci a2 = d.a(yciVar2, f3, f3);
            boolean h2 = ((i4 & 14) == 4) | ((i4 & 7168) == 2048) | oq5Var.h(amrVar) | ((i4 & 896) == 256);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new ql4(function0, j3, amrVar, j2);
                oq5Var.k0(K);
            }
            ksw.j(0, oq5Var, a2, (Function1) K);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            final yci yciVar3 = yciVar2;
            r.d = new Function2(f2, j2, j3, yciVar3, i2, i3) { // from class: sl4
                public final /* synthetic */ float b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ yci e;
                public final /* synthetic */ int f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int R = rvf.R(24625);
                    xv.h(Function0.this, this.b, this.c, this.d, this.e, this.f, (hq5) obj, R);
                    return Unit.a;
                }
            };
        }
    }

    public static final void i(wv5 wv5Var, hq5 hq5Var, int i2) {
        boolean z;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(675424212);
        if (((i2 | (oq5Var.h(wv5Var) ? 4 : 2)) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
        } else {
            lx0 lx0Var = qx0.e;
            gz2 gz2Var = b2c.o;
            vci vciVar = vci.a;
            yci c2 = d.c(vciVar, 1.0f);
            ta5 a2 = sa5.a(lx0Var, gz2Var, oq5Var, 54);
            int i3 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c2);
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
            String M = rvf.M(R.string.concert_tab_buy_ticket, oq5Var);
            ges j2 = nu0.j();
            agr agrVar = eq0.a;
            xcs.b(M, null, ((dq0) oq5Var.j(agrVar)).b.e, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, j2, oq5Var, 0, 3120, 55290);
            oq5Var = oq5Var;
            String str = wv5Var.h;
            if (str != null) {
                oq5Var.Z(850983119);
                u1g.l(oq5Var, d.e(vciVar, mu0.a));
                z = false;
                xcs.b(str, null, d85.b(((dq0) oq5Var.j(agrVar)).b.e, 0.5f, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, 0, 3120, 55290);
                oq5Var = oq5Var;
            } else {
                z = false;
                oq5Var.Z(830822052);
            }
            oq5Var.p(z);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv4(wv5Var, i2, 14);
        }
    }

    public static final void j(wv5 wv5Var, final tz5 tz5Var, yci yciVar, hq5 hq5Var, int i2) {
        yci yciVar2;
        tz5 tz5Var2;
        wv5 wv5Var2;
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1547598722);
        if ((((oq5Var2.h(wv5Var) ? 4 : 2) | i2 | (oq5Var2.h(tz5Var) ? 32 : 16) | (oq5Var2.f(yciVar) ? 256 : 128)) & 147) == 146 && oq5Var2.z()) {
            oq5Var2.S();
            tz5Var2 = tz5Var;
            wv5Var2 = wv5Var;
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            ges j2 = nu0.j();
            ges i3 = nu0.i();
            yci q = androidx.compose.foundation.layout.a.q(yciVar, 0.0f, 24, 0.0f, 0.0f, 13);
            yciVar2 = yciVar;
            nho a2 = lho.a(qx0.a, b2c.k, oq5Var2, 0);
            int i4 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, q);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var2, i4, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            boolean h2 = oq5Var2.h(tz5Var);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                final int i5 = 0;
                K = new Function0() { // from class: fz5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String str;
                        int i6 = i5;
                        tz5 tz5Var3 = tz5Var;
                        switch (i6) {
                            case 0:
                                pv5 pv5Var = tz5Var3.c.v;
                                if (pv5Var != null) {
                                    mu5 mu5Var = pv5Var.a;
                                    rmb rmbVar = tz5Var3.p;
                                    thj thjVar = tz5Var3.q;
                                    wjb wjbVar = wjb.ShareScreen;
                                    rmb.j(rmbVar, wjbVar, thjVar, null, 12);
                                    qxp qxpVar = tz5Var3.d;
                                    qxpVar.getClass();
                                    bz5 bz5Var = (bz5) qxpVar.a;
                                    mvp mvpVar = (mvp) bz5Var.r.getValue();
                                    pu0 t = pd.t(new qzm[0]);
                                    y yVar = bz5Var.d;
                                    np2 np2Var = bz5Var.c;
                                    fnb fnbVar = bz5Var.e.a;
                                    mvpVar.getClass();
                                    yVar.getClass();
                                    fnbVar.getClass();
                                    zwp zwpVar = new zwp(new fxp(mu5Var.a), new co6(new jcv(mu5Var.d, WebPath$Storage.AFISHA), qo6.f, null), mu5Var.c, "");
                                    sai saiVar = new sai(false);
                                    cvo cvoVar = cvo.i;
                                    e3s.X(o6m.b(wjbVar, null, 6), yVar, "SHARE_BOTTOM_SHEET", saiVar, null, new wn5(new ntb(t, mvpVar, zwpVar, saiVar, np2Var, yVar, fnbVar, 4), 1326092232, true), 48);
                                }
                                break;
                            default:
                                d06 d06Var = tz5Var3.c;
                                pv5 pv5Var2 = d06Var.v;
                                if (pv5Var2 != null && (str = pv5Var2.a.b) != null) {
                                    rmb.j(tz5Var3.p, wjb.ConcertPurchaseScreen, tz5Var3.q, null, 12);
                                    qxp qxpVar2 = tz5Var3.d;
                                    String str2 = d06Var.k;
                                    qxpVar2.getClass();
                                    str2.getClass();
                                    a0g.D(((bz5) qxpVar2.a).c, str2, str);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K);
            }
            a0g.p((Function0) K, null, false, false, 0L, null, sk3.b, oq5Var2, ScreenMirroringConfig.Video.BITRATE_1_5MB, 62);
            vci vciVar = vci.a;
            u1g.l(oq5Var2, d.r(vciVar, 16));
            yci d2 = d.d(vciVar, 1.0f);
            hz2 hz2Var = b2c.m;
            yci u = d.u(d2.f(new VerticalAlignElement(hz2Var)), hz2Var, true);
            boolean h3 = oq5Var2.h(tz5Var);
            Object K2 = oq5Var2.K();
            if (h3 || K2 == kjnVar) {
                final int i6 = 1;
                K2 = new Function0() { // from class: fz5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        String str;
                        int i62 = i6;
                        tz5 tz5Var3 = tz5Var;
                        switch (i62) {
                            case 0:
                                pv5 pv5Var = tz5Var3.c.v;
                                if (pv5Var != null) {
                                    mu5 mu5Var = pv5Var.a;
                                    rmb rmbVar = tz5Var3.p;
                                    thj thjVar = tz5Var3.q;
                                    wjb wjbVar = wjb.ShareScreen;
                                    rmb.j(rmbVar, wjbVar, thjVar, null, 12);
                                    qxp qxpVar = tz5Var3.d;
                                    qxpVar.getClass();
                                    bz5 bz5Var = (bz5) qxpVar.a;
                                    mvp mvpVar = (mvp) bz5Var.r.getValue();
                                    pu0 t = pd.t(new qzm[0]);
                                    y yVar = bz5Var.d;
                                    np2 np2Var = bz5Var.c;
                                    fnb fnbVar = bz5Var.e.a;
                                    mvpVar.getClass();
                                    yVar.getClass();
                                    fnbVar.getClass();
                                    zwp zwpVar = new zwp(new fxp(mu5Var.a), new co6(new jcv(mu5Var.d, WebPath$Storage.AFISHA), qo6.f, null), mu5Var.c, "");
                                    sai saiVar = new sai(false);
                                    cvo cvoVar = cvo.i;
                                    e3s.X(o6m.b(wjbVar, null, 6), yVar, "SHARE_BOTTOM_SHEET", saiVar, null, new wn5(new ntb(t, mvpVar, zwpVar, saiVar, np2Var, yVar, fnbVar, 4), 1326092232, true), 48);
                                }
                                break;
                            default:
                                d06 d06Var = tz5Var3.c;
                                pv5 pv5Var2 = d06Var.v;
                                if (pv5Var2 != null && (str = pv5Var2.a.b) != null) {
                                    rmb.j(tz5Var3.p, wjb.ConcertPurchaseScreen, tz5Var3.q, null, 12);
                                    qxp qxpVar2 = tz5Var3.d;
                                    String str2 = d06Var.k;
                                    qxpVar2.getClass();
                                    str2.getClass();
                                    a0g.D(((bz5) qxpVar2.a).c, str2, str);
                                }
                                break;
                        }
                        return Unit.a;
                    }
                };
                oq5Var2.k0(K2);
            }
            Function0 function0 = (Function0) K2;
            tz5Var2 = tz5Var;
            wv5Var2 = wv5Var;
            oq5Var = oq5Var2;
            hdg.n(384, 0, ild.C(-960496041, new up(tz5Var, wv5Var, j2, i3, 15), oq5Var2), oq5Var, u, function0);
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ez5(wv5Var2, tz5Var2, yciVar2, i2);
        }
    }

    public static final void k(final wv5 wv5Var, final tz5 tz5Var, final rv5 rv5Var, final gvd gvdVar, final tvd tvdVar, final hab habVar, final Function0 function0, final dib dibVar, final Function0 function02, final yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        gvdVar.getClass();
        tvdVar.getClass();
        habVar.getClass();
        dibVar.getClass();
        function02.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(2041250850);
        if (((i2 | (oq5Var2.h(wv5Var) ? 4 : 2) | (oq5Var2.h(tz5Var) ? 32 : 16) | (oq5Var2.h(rv5Var) ? 256 : 128) | (oq5Var2.f(gvdVar) ? 2048 : 1024) | (oq5Var2.f(tvdVar) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var2.f(habVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var2.h(function0) ? 1048576 : 524288) | (oq5Var2.h(dibVar) ? 8388608 : RemoteCameraConfig.Camera.BITRATE) | (oq5Var2.h(function02) ? 67108864 : 33554432) | (oq5Var2.f(yciVar) ? SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING : 268435456)) & 306783379) == 306783378 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            final boolean g2 = irv.g(oq5Var2);
            iv5 iv5Var = rv5Var != null ? rv5Var.b : null;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.U(new nr(tvdVar, 15));
                oq5Var2.k0(K);
            }
            sdr sdrVar = (sdr) K;
            Boolean bool = (Boolean) sdrVar.getValue();
            bool.getClass();
            boolean h2 = oq5Var2.h(iv5Var);
            Object K2 = oq5Var2.K();
            if (h2 || K2 == kjnVar) {
                K2 = new nz5(iv5Var, sdrVar, (Continuation) null, 0);
                oq5Var2.k0(K2);
            }
            gld.w(oq5Var2, bool, (Function2) K2);
            final iv5 iv5Var2 = iv5Var;
            oq5Var = oq5Var2;
            jf0.a(new qzm[0], null, true, ild.C(-852254054, new Function2() { // from class: iz5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    aqi M;
                    hq5 hq5Var2 = (hq5) obj;
                    if ((((Integer) obj2).intValue() & 3) == 2) {
                        oq5 oq5Var3 = (oq5) hq5Var2;
                        if (oq5Var3.z()) {
                            oq5Var3.S();
                            return Unit.a;
                        }
                    }
                    iv5 iv5Var3 = iv5.this;
                    fkn fknVar = iv5Var3 != null ? iv5Var3.b : null;
                    if (fknVar == null) {
                        oq5 oq5Var4 = (oq5) hq5Var2;
                        oq5Var4.Z(-1948781993);
                        oq5Var4.p(false);
                        M = null;
                    } else {
                        oq5 oq5Var5 = (oq5) hq5Var2;
                        oq5Var5.Z(1322609386);
                        M = gld.M(fknVar, oq5Var5);
                        oq5Var5.p(false);
                    }
                    mv5 mv5Var = M != null ? (mv5) M.getValue() : null;
                    long j2 = d85.m;
                    oq5 oq5Var6 = (oq5) hq5Var2;
                    long j3 = ((dq0) oq5Var6.j(eq0.a)).b.a;
                    yci d2 = d.d(yciVar, 1.0f);
                    gvd gvdVar2 = gvdVar;
                    boolean f2 = oq5Var6.f(gvdVar2);
                    Object K3 = oq5Var6.K();
                    kjn kjnVar2 = gq5.a;
                    if (f2 || K3 == kjnVar2) {
                        K3 = new u91(gvdVar2, 1);
                        oq5Var6.k0(K3);
                    }
                    yci a2 = androidx.compose.ui.platform.a.a(androidx.compose.ui.draw.a.a(d2, (Function1) K3), "entity_header");
                    Object K4 = oq5Var6.K();
                    if (K4 == kjnVar2) {
                        K4 = new kz5(2);
                        oq5Var6.k0(K4);
                    }
                    q5g.k(nfp.b(a2, false, (Function1) K4), null, j2, j3, null, 0.0f, ild.C(1357770966, new mz5(tvdVar, g2, mv5Var, function0, tz5Var, habVar, iv5Var3, wv5Var, function02, rv5Var, dibVar), oq5Var6), oq5Var6, 1573248, 50);
                    return Unit.a;
                }
            }, oq5Var2), oq5Var, 3072, 2);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new i11(wv5Var, tz5Var, rv5Var, gvdVar, tvdVar, habVar, function0, dibVar, function02, yciVar, i2);
        }
    }

    public static void l(n9b n9bVar, String str, Function0 function0, String str2, int i2) {
        yci n = androidx.compose.foundation.layout.a.n(vci.a, 16, 8);
        if ((i2 & 8) != 0) {
            str2 = null;
        }
        n9bVar.getClass();
        str.getClass();
        n.getClass();
        n9bVar.a.a(new wn5(new av5(n, function0, str, str2), -187067483, true));
    }

    public static final long m(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static void n(n9b n9bVar, xbb xbbVar) {
        n9bVar.getClass();
        xbbVar.getClass();
        n9bVar.a.a(new wn5(new aa1(xbbVar, 3), 189217405, true));
    }

    public static final void o(xbb xbbVar, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(323459459);
        int i3 = (oq5Var.h(xbbVar) ? 4 : 2) | i2 | 48 | (oq5Var.h(null) ? 256 : 128);
        if ((i3 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            p(xbbVar.a, new mn0(6, xbbVar.b, (ArrayList) null), xbbVar.c, xbbVar.d, xbbVar.i, oq5Var, 24576 | ((i3 << 12) & 3670016));
            yciVar = vci.a;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ea1(xbbVar, yciVar, i2, 1);
        }
    }

    public static final void p(String str, mn0 mn0Var, String str2, jzb jzbVar, qo6 qo6Var, hq5 hq5Var, int i2) {
        int i3;
        wn5 C;
        str.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1288556746);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(mn0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(str2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.d(jzbVar == null ? -1 : jzbVar.ordinal()) ? 2048 : 1024;
        }
        int i4 = i2 & 24576;
        vci vciVar = vci.a;
        if (i4 == 0) {
            i3 |= oq5Var.f(vciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.d(qo6Var != null ? qo6Var.ordinal() : -1) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i2) == 0) {
            i3 |= oq5Var.h(null) ? 1048576 : 524288;
        }
        if ((599187 & i3) == 599186 && oq5Var.z()) {
            oq5Var.S();
        } else {
            wn5 C2 = ild.C(277095412, new t1b(3, str, qo6Var), oq5Var);
            wn5 C3 = ild.C(-1380012845, new t1b(4, jzbVar, mn0Var), oq5Var);
            if (str2 == null) {
                oq5Var.Z(1025165484);
                oq5Var.p(false);
                C = null;
            } else {
                oq5Var.Z(1025165485);
                C = ild.C(-1135064227, new da1(str2, 6), oq5Var);
                oq5Var.p(false);
            }
            sk3.i(C2, C3, C, androidx.compose.foundation.a.k(vciVar, true, null), null, null, oq5Var, ((i3 >> 6) & 57344) | 54, 32);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(str, mn0Var, str2, jzbVar, qo6Var, i2);
        }
    }

    public static final void q(final w4k w4kVar, final long j2, final long j3, final Function0 function0, final yci yciVar, boolean z, boolean z2, hq5 hq5Var, final int i2) {
        int i3;
        Function0 function02;
        final boolean z3;
        final boolean z4;
        w4kVar.getClass();
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2003397149);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(w4kVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.e(j2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.e(j3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.g(false) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            function02 = function0;
            i3 |= oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            function02 = function0;
        }
        if ((196608 & i2) == 0) {
            i3 |= oq5Var.f(yciVar) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (((i3 | 14155776) & 4793491) == 4793490 && oq5Var.z()) {
            oq5Var.S();
            z3 = z;
            z4 = z2;
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var);
            }
            oq5Var.Z(-2118109926);
            yie yieVar = (yie) oq5Var.j(e.a);
            oq5Var.p(false);
            yci d2 = androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.c(xp3.u(d.m(yciVar, 56), ugo.a), new u5d(j2)), (uoi) K, yieVar, false, null, new meo(0), function02, 12);
            kfh d3 = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
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
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            ksw.j(0, oq5Var, androidx.compose.foundation.layout.b.a.a(d.m(vci.a, 24), b2c.f), new v5d(w4kVar, j3));
            oq5Var.p(true);
            z3 = true;
            z4 = true;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new Function2() { // from class: t5d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xv.q(w4k.this, j2, j3, function0, yciVar, z3, z4, (hq5) obj, rvf.R(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void r(boolean z, wv5 wv5Var, long j2, Function0 function0, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        int i4;
        kb5 kb5Var;
        vci vciVar;
        kb5 kb5Var2;
        kb5 kb5Var3;
        grb grbVar;
        kb5 kb5Var4;
        int i5;
        boolean z2;
        kjn kjnVar;
        wv5 wv5Var2;
        xmn r;
        hz5 hz5Var;
        ct5 ct5Var = wv5Var.f;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-681810313);
        int w = oq5Var.w();
        int i6 = i2 | (oq5Var.g(z) ? 4 : 2) | (oq5Var.h(wv5Var) ? 32 : 16) | (oq5Var.e(j2) ? 256 : 128) | (oq5Var.h(function0) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i6 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            wv5Var2 = wv5Var;
        } else {
            nho a2 = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i7 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, yciVar);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar2);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var5 = wp5.f;
            g0g.U(oq5Var, a2, kb5Var5);
            kb5 kb5Var6 = wp5.e;
            g0g.U(oq5Var, l, kb5Var6);
            kb5 kb5Var7 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var, i7, kb5Var7);
            }
            kb5 kb5Var8 = wp5.d;
            g0g.U(oq5Var, H, kb5Var8);
            oq5Var.Z(852736219);
            vci vciVar2 = vci.a;
            kjn kjnVar2 = gq5.a;
            if (z) {
                i3 = w;
                i4 = i6;
                kb5Var = kb5Var6;
                vciVar = vciVar2;
                kb5Var2 = kb5Var8;
                kb5Var3 = kb5Var5;
                grbVar = grbVar2;
                kb5Var4 = kb5Var7;
                i5 = 2;
                oq5Var.Z(853212998);
                String str = ct5Var.e;
                String str2 = ct5Var.f;
                String str3 = ct5Var.g;
                iu5 iu5Var = iu5.a;
                z2 = true;
                yci k = androidx.compose.foundation.layout.a.k(vciVar, 0.0f, 10, 1);
                boolean z3 = (i4 & 112) == 32 || oq5Var.h(wv5Var);
                Object K = oq5Var.K();
                kjnVar = kjnVar2;
                if (z3 || K == kjnVar) {
                    K = new gz5(wv5Var, 1);
                    oq5Var.k0(K);
                }
                qwp.t(str, str2, str3, iu5Var, nfp.a(k, (Function1) K), oq5Var, 3072);
                oq5Var.p(false);
            } else {
                oq5Var.Z(852660702);
                String str4 = ct5Var.e;
                String str5 = ct5Var.f;
                String str6 = ct5Var.g;
                float f2 = 6;
                yci u = xp3.u(vciVar2, klx.c);
                i4 = i6;
                boolean z4 = (i4 & 112) == 32 || oq5Var.h(wv5Var);
                Object K2 = oq5Var.K();
                if (z4 || K2 == kjnVar2) {
                    K2 = new gz5(wv5Var, 0);
                    oq5Var.k0(K2);
                }
                kb5Var4 = kb5Var7;
                i3 = w;
                kb5Var2 = kb5Var8;
                grbVar = grbVar2;
                kb5Var3 = kb5Var5;
                i5 = 2;
                vciVar = vciVar2;
                kb5Var = kb5Var6;
                qwp.l(str4, str5, str6, j2, nfp.a(u, (Function1) K2), f2, false, 0.0f, 0.0f, false, oq5Var, ((i4 << 3) & 7168) | 196608, 960);
                oq5Var = oq5Var;
                vz1.B(vciVar, 16, oq5Var, false);
                kjnVar = kjnVar2;
                z2 = true;
            }
            lx0 lx0Var = qx0.e;
            yci k2 = z ? androidx.compose.foundation.layout.a.k(vciVar, -5, 0.0f, i5) : vciVar;
            ta5 a3 = sa5.a(lx0Var, b2c.n, oq5Var, 6);
            int i8 = oq5Var.P;
            a l2 = oq5Var.l();
            yci H2 = vnj.H(oq5Var, k2);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var3);
            g0g.U(oq5Var, l2, kb5Var);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var4);
            }
            g0g.U(oq5Var, H2, kb5Var2);
            oq5Var.Z(2138582136);
            ges d2 = nu0.d();
            ges c2 = nu0.c();
            Object K3 = oq5Var.K();
            if (K3 == kjnVar) {
                K3 = szf.g0(d2);
                oq5Var.k0(K3);
            }
            aqi aqiVar = (aqi) K3;
            if (!z) {
                oq5Var.Z(2138740576);
                s(wv5Var, function0, oq5Var, ((i4 >> 3) & 14) | 8 | ((i4 >> 6) & 112));
                oq5Var.t(i3);
                r = oq5Var.r();
                if (r != null) {
                    hz5Var = new hz5(z, wv5Var, j2, function0, yciVar, i2, 0);
                    r.d = hz5Var;
                }
                return;
            }
            oq5Var.Z(2126795377);
            oq5Var.p(false);
            vci vciVar3 = vciVar;
            oq5 oq5Var2 = oq5Var;
            bg3.a(null, null, false, ild.C(-477805657, new jz5(wv5Var, 0), oq5Var), oq5Var2, 3072, 7);
            float f3 = 4;
            u1g.l(oq5Var2, d.e(vciVar3, f3));
            String str7 = ct5Var.c;
            ges gesVar = (ges) aqiVar.getValue();
            long j3 = ((dq0) oq5Var2.j(eq0.a)).b.a;
            yci e2 = androidx.compose.foundation.a.e(vciVar3, false, null, null, function0, 7);
            Object K4 = oq5Var2.K();
            if (K4 == kjnVar) {
                K4 = new kz5(0);
                oq5Var2.k0(K4);
            }
            yci b2 = nfp.b(e2, false, (Function1) K4);
            boolean f4 = oq5Var2.f(c2);
            Object K5 = oq5Var2.K();
            if (f4 || K5 == kjnVar) {
                K5 = new lz5(c2, aqiVar, 0);
                oq5Var2.k0(K5);
            }
            xcs.b(str7, b2, j3, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, (Function1) K5, gesVar, oq5Var2, 0, 3120, 22520);
            oq5Var = oq5Var2;
            u1g.l(oq5Var, d.e(vciVar3, f3));
            wv5Var2 = wv5Var;
            bg3.a(null, null, false, ild.C(706579230, new jz5(wv5Var2, 1), oq5Var), oq5Var, 3072, 7);
            k5r.s(oq5Var, false, true, false, true);
        }
        r = oq5Var.r();
        if (r != null) {
            hz5Var = new hz5(z, wv5Var2, j2, function0, yciVar, i2, 1);
            r.d = hz5Var;
        }
    }

    public static final void s(wv5 wv5Var, Function0 function0, hq5 hq5Var, int i2) {
        int i3;
        ct5 ct5Var = wv5Var.f;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1650877014);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? oq5Var.f(wv5Var) : oq5Var.h(wv5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            ges d2 = nu0.d();
            ges c2 = nu0.c();
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = szf.g0(d2);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            String str = ct5Var.c;
            ges gesVar = (ges) aqiVar.getValue();
            agr agrVar = eq0.a;
            long j2 = ((dq0) oq5Var.j(agrVar)).b.a;
            vci vciVar = vci.a;
            yci e2 = androidx.compose.foundation.a.e(vciVar, false, null, null, function0, 7);
            Object K2 = oq5Var.K();
            int i5 = 1;
            if (K2 == obj) {
                K2 = new kz5(i5);
                oq5Var.k0(K2);
            }
            yci b2 = nfp.b(e2, false, (Function1) K2);
            boolean f2 = oq5Var.f(c2);
            Object K3 = oq5Var.K();
            if (f2 || K3 == obj) {
                K3 = new lz5(c2, aqiVar, i5);
                oq5Var.k0(K3);
            }
            xcs.b(str, b2, j2, 0L, null, 0L, null, null, 0L, 2, false, 2, 0, (Function1) K3, gesVar, oq5Var, 0, 3120, 22520);
            oq5Var = oq5Var;
            float f3 = 4;
            u1g.l(oq5Var, d.e(vciVar, f3));
            bg3.a(null, null, false, ild.C(-1395909460, new jz5(wv5Var, i4), oq5Var), oq5Var, 3072, 7);
            String str2 = ct5Var.k;
            if (str2 == null) {
                oq5Var.Z(-391847580);
            } else {
                oq5Var.Z(-391847579);
                hz2 hz2Var = b2c.l;
                yci a2 = androidx.compose.ui.platform.a.a(vciVar, "cashback");
                nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
                int i6 = oq5Var.P;
                a l = oq5Var.l();
                yci H = vnj.H(oq5Var, a2);
                xp5.T.getClass();
                grb grbVar = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a3, wp5.f);
                g0g.U(oq5Var, l, wp5.e);
                kb5 kb5Var = wp5.g;
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var);
                }
                g0g.U(oq5Var, H, wp5.d);
                gae.b(a0g.E(R.drawable.ic_plus_12, 0, oq5Var), null, d.m(vciVar, 12), ((dq0) oq5Var.j(agrVar)).b.a, oq5Var, 432, 0);
                u1g.l(oq5Var, d.r(vciVar, f3));
                xcs.b(str2, null, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, 0, 3120, 55290);
                oq5Var = oq5Var;
                oq5Var.p(true);
            }
            oq5Var.p(false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(wv5Var, function0, i2, 20);
        }
    }

    public static final long t(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final void u(ma5 ma5Var, wn5 wn5Var, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1170858537);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(ma5Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            int i4 = i3;
            ywf.a(ma5Var, new udt(ges.b(((udt) oq5Var.j(wdt.b)).i, 0L, 0L, null, null, v7g.z(0), 0, 0L, null, null, 0, 0, 16777087), 15871), null, wn5Var, oq5Var, (i4 & 14) | ((i4 << 6) & 7168));
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new z2(ma5Var, wn5Var, i2, 4);
        }
    }

    public static final void v(List list, String str, ryc rycVar, yci yciVar, pyc pycVar, String str2, Function0 function0, hq5 hq5Var, int i2, int i3) {
        String str3;
        int i4;
        Function0 function02;
        int i5;
        oq5 oq5Var;
        Function0 function03;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-314150418);
        int i6 = i2 | (oq5Var2.h(list) ? 4 : 2) | (oq5Var2.f(str) ? 32 : 16) | (oq5Var2.h(rycVar) ? 256 : 128) | (oq5Var2.h(pycVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        int i7 = i3 & 32;
        if (i7 != 0) {
            i4 = i6 | 196608;
            str3 = str2;
        } else {
            str3 = str2;
            i4 = i6 | (oq5Var2.f(str3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        }
        int i8 = i3 & 64;
        if (i8 != 0) {
            i5 = i4 | ScreenMirroringConfig.Video.BITRATE_1_5MB;
            function02 = function0;
        } else {
            function02 = function0;
            i5 = i4 | (oq5Var2.h(function02) ? 1048576 : 524288);
        }
        if (oq5Var2.P(i5 & 1, (599187 & i5) != 599186)) {
            wn5 wn5Var = null;
            String str4 = i7 != 0 ? null : str3;
            Function0 function04 = i8 != 0 ? null : function02;
            if (str4 == null || function04 == null) {
                oq5Var2.Z(-120397576);
                oq5Var2.p(false);
            } else {
                oq5Var2.Z(-120631192);
                wn5Var = ild.C(-156322061, new hv(str4, function04, 0), oq5Var2);
                oq5Var2.p(false);
            }
            oq5Var = oq5Var2;
            x97.j(ild.C(-451808460, new iv(str, function04, 0), oq5Var2), list, yciVar, null, null, 0.0f, 0.0f, null, wn5Var, false, false, 0, ild.C(-551566883, new jv(0, rycVar, pycVar), oq5Var2), oq5Var, ((i5 << 3) & 112) | NetworkRequestException.BANNED);
            function03 = function04;
            str3 = str4;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            function03 = function02;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kv(list, str, rycVar, yciVar, pycVar, str3, function03, i2, i3);
        }
    }

    public static final void w(List list, j00 j00Var, jab jabVar, yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-903941541);
        int i3 = i2 | (oq5Var2.f(list) ? 4 : 2) | (oq5Var2.f(j00Var) ? 32 : 16) | (oq5Var2.h(jabVar) ? 256 : 128);
        if (oq5Var2.P(i3 & 1, (i3 & 1171) != 1170)) {
            int i4 = (i3 & 896) | ((i3 >> 3) & 14) | ((i3 << 3) & 112);
            boolean z = (((i4 & 112) ^ 48) > 32 && oq5Var2.f(list)) || (i4 & 48) == 32;
            Object K = oq5Var2.K();
            if (z || K == gq5.a) {
                kxi kxiVar = j00Var.b;
                j00Var.a.getClass();
                zr zrVar = new zr(new ygt(jabVar.f, list), kxiVar, j00Var.j, j00Var.h.a(jabVar, null));
                oq5Var2.k0(zrVar);
                K = zrVar;
            }
            f14 f14Var = (f14) K;
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i5 = oq5Var2.P;
            a l = oq5Var2.l();
            yci H = vnj.H(oq5Var2, yciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a2, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var2, i5, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            oq5Var = oq5Var2;
            irf.h(rvf.M(R.string.similar_entities_block_title, oq5Var2), vci.a, null, null, null, false, null, false, null, oq5Var, 48, 508);
            bg3.c(f14Var, zpd.k, null, null, 0.0f, oq5Var, 48, 28);
            oq5Var.p(true);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new wl(i2, 5, list, j00Var, jabVar, yciVar);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final q1c x(String str) {
        if (str == null) {
            return q1c.a;
        }
        switch (str.hashCode()) {
            case -1562584233:
                if (str.equals("limit_exceeded")) {
                    return q1c.i;
                }
                break;
            case -1528707547:
                if (str.equals("authorization_reject")) {
                    return q1c.k;
                }
                break;
            case 675222369:
                if (str.equals("fail_3ds")) {
                    return q1c.f;
                }
                break;
            case 1635433643:
                if (str.equals("not_enough_funds")) {
                    return q1c.j;
                }
                break;
            case 2038628819:
                if (str.equals("unknown_error")) {
                    return q1c.a;
                }
                break;
        }
        return q1c.a;
    }

    public static final yci z(yci yciVar, float f2) {
        return f2 == 1.0f ? yciVar : androidx.compose.ui.graphics.a.b(yciVar, 0.0f, 0.0f, f2, 0.0f, 0.0f, null, true, 126971);
    }

    public Integer B(ksk kskVar) {
        return null;
    }

    public abstract int y(int i2, int i3, ksk kskVar);
}
