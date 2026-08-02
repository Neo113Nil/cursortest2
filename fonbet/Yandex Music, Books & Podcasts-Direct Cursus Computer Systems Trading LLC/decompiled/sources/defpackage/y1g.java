package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import android.util.SizeF;
import android.widget.ImageView;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.viewinterop.a;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.music.core.ui.compose.b;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.passport.sloth.ui.dependencies.m;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class y1g {
    public static void A(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            xq0.q(hrg.s("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", myLooper != null ? myLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void B(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        xq0.q(str);
    }

    public static void C(String str) {
        if (TextUtils.isEmpty(str)) {
            xq0.x("Given String is empty or null");
        }
    }

    public static void D(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            xq0.x(str2);
        }
    }

    public static void E() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                xq0.q("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static void F(String str) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return;
        }
        xq0.q(str);
    }

    public static void G(Object obj) {
        if (obj != null) {
            return;
        }
        jj4.j("null reference");
    }

    public static void H(Object obj, String str) {
        if (obj != null) {
            return;
        }
        jj4.j(str);
    }

    public static void I(String str, boolean z) {
        if (z) {
            return;
        }
        xq0.q(str);
    }

    public static final ghi J(fhi fhiVar, Long l) {
        Object obj = null;
        if (l == null) {
            return null;
        }
        Iterator it = fhiVar.d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            Long l2 = ((ghi) next).a;
            long longValue = l.longValue();
            if (l2 != null && l2.longValue() == longValue) {
                obj = next;
                break;
            }
        }
        return (ghi) obj;
    }

    public static final List K(t7k t7kVar) {
        return t7kVar instanceof cfb ? ((cfb) t7kVar).b : t7kVar instanceof u7k ? K(((u7k) t7kVar).c()) : c5b.a;
    }

    public static final kvh L(f7l f7lVar) {
        f7lVar.getClass();
        return new kvh(f7lVar.c, 25);
    }

    public static final pzg M(Context context, oyg oygVar, String str, boolean z) {
        if (oygVar instanceof myg) {
            if (!Intrinsics.d(str, "__LottieInternalDefaultCacheKey__")) {
                return gyg.f(context, str, ((myg) oygVar).a);
            }
            int i = ((myg) oygVar).a;
            return gyg.f(context, gyg.l(context, i), i);
        }
        if (oygVar instanceof nyg) {
            int i2 = 0;
            if (!Intrinsics.d(str, "__LottieInternalDefaultCacheKey__")) {
                return gyg.a(str, new cyg(context, ((nyg) oygVar).a, str, i2), null);
            }
            String str2 = ((nyg) oygVar).a;
            HashMap hashMap = gyg.a;
            String g = f1d.g("url_", str2);
            return gyg.a(g, new cyg(context, str2, g, i2), null);
        }
        if (oygVar instanceof lyg) {
            if (z) {
                return null;
            }
            throw null;
        }
        if (!(oygVar instanceof kyg)) {
            b6e.s();
            return null;
        }
        int i3 = 1;
        if (!Intrinsics.d(str, "__LottieInternalDefaultCacheKey__")) {
            String str3 = ((kyg) oygVar).a;
            HashMap hashMap2 = gyg.a;
            return gyg.a(str, new cyg(context.getApplicationContext(), str3, str, i3), null);
        }
        String str4 = ((kyg) oygVar).a;
        HashMap hashMap3 = gyg.a;
        String concat = "asset_".concat(str4);
        return gyg.a(concat, new cyg(context.getApplicationContext(), str4, concat, i3), null);
    }

    public static void N(MediaFormat mediaFormat, q85 q85Var) {
        if (q85Var != null) {
            O(mediaFormat, "color-transfer", q85Var.c);
            O(mediaFormat, "color-standard", q85Var.a);
            O(mediaFormat, "color-range", q85Var.b);
            byte[] bArr = q85Var.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static void O(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static final ghi P(fhi fhiVar, Long l) {
        fhiVar.getClass();
        Object obj = null;
        if (l == null) {
            return null;
        }
        for (Object obj2 : fhiVar.d) {
            Long l2 = ((ghi) obj2).a;
            long longValue = l.longValue();
            if (l2 == null || l2.longValue() != longValue) {
                obj = obj2;
                break;
            }
        }
        return (ghi) obj;
    }

    public static final jyg Q(oyg oygVar, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(-1248473602);
        kr3 kr3Var = new kr3(3, 3, null);
        Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
        oq5Var.a0(1388713953);
        boolean f = oq5Var.f(oygVar);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (f || K == kjnVar) {
            K = szf.g0(new jyg());
            oq5Var.k0(K);
        }
        aqi aqiVar = (aqi) K;
        oq5Var.p(false);
        oq5Var.a0(1388714244);
        boolean f2 = oq5Var.f(oygVar) | oq5Var.f("__LottieInternalDefaultCacheKey__");
        Object K2 = oq5Var.K();
        if (f2 || K2 == kjnVar) {
            K2 = M(context, oygVar, "__LottieInternalDefaultCacheKey__", true);
            oq5Var.k0(K2);
        }
        oq5Var.p(false);
        gld.y(oygVar, "__LottieInternalDefaultCacheKey__", new av7(kr3Var, context, oygVar, aqiVar, null), oq5Var);
        jyg jygVar = (jyg) aqiVar.getValue();
        oq5Var.p(false);
        return jygVar;
    }

    public static final dzg R(ezg[] ezgVarArr, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(-395574495);
        int hashCode = Arrays.hashCode(ezgVarArr);
        oq5Var.a0(34468001);
        boolean d = oq5Var.d(hashCode);
        Object K = oq5Var.K();
        if (d || K == gq5.a) {
            K = new dzg(xz0.X(ezgVarArr));
            oq5Var.k0(K);
        }
        dzg dzgVar = (dzg) K;
        oq5Var.p(false);
        oq5Var.p(false);
        return dzgVar;
    }

    public static final ezg S(Integer num, String[] strArr, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.a0(-1788530187);
        oq5Var.a0(1613443961);
        boolean f = oq5Var.f(strArr);
        Object K = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (f || K == kjnVar) {
            K = new abf((String[]) Arrays.copyOf(strArr, strArr.length));
            oq5Var.k0(K);
        }
        abf abfVar = (abf) K;
        oq5Var.p(false);
        oq5Var.a0(1613444012);
        boolean f2 = oq5Var.f(abfVar) | oq5Var.f(num);
        Object K2 = oq5Var.K();
        if (f2 || K2 == kjnVar) {
            K2 = new ezg(abfVar, num);
            oq5Var.k0(K2);
        }
        ezg ezgVar = (ezg) K2;
        oq5Var.p(false);
        oq5Var.p(false);
        return ezgVar;
    }

    public static final m1p T(Function0 function0, Function1 function1, hq5 hq5Var, int i, int i2) {
        String str = (i2 & 1) != 0 ? "" : "Hello";
        if ((i2 & 2) != 0) {
            function0 = null;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        Object[] objArr = new Object[0];
        apo B = dag.B(new j1p(1), new xum(10, function0, function1));
        boolean z = ((((i & 14) ^ 6) > 4 && ((oq5) hq5Var).f(str)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ((oq5) hq5Var).f(function0)) || (i & 48) == 32) | ((((i & 896) ^ 384) > 256 && ((oq5) hq5Var).f(function1)) || (i & 384) == 256);
        oq5 oq5Var = (oq5) hq5Var;
        Object K = oq5Var.K();
        if (z || K == gq5.a) {
            K = new cte(str, function0, function1);
            oq5Var.k0(K);
        }
        return (m1p) o2g.g0(objArr, B, (Function0) K, oq5Var, 0, 4);
    }

    public static void U(qv6 qv6Var) {
        qv6Var.k = -3.4028235E38f;
        qv6Var.j = Integer.MIN_VALUE;
        CharSequence charSequence = qv6Var.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                qv6Var.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = qv6Var.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static final float V(long j, float f, jx7 jx7Var) {
        if (kes.a(j, kes.c)) {
            return f;
        }
        long b = kes.b(j);
        if (les.a(b, 4294967296L)) {
            return jx7Var.N(j);
        }
        if (les.a(b, 8589934592L)) {
            return kes.c(j) * f;
        }
        return Float.NaN;
    }

    public static final float W(long j, float f, jx7 jx7Var) {
        float c;
        long b = kes.b(j);
        if (les.a(b, 4294967296L)) {
            if (jx7Var.i0() <= 1.05d) {
                return jx7Var.N(j);
            }
            c = kes.c(j) / kes.c(jx7Var.w(f));
        } else {
            if (!les.a(b, 8589934592L)) {
                return Float.NaN;
            }
            c = kes.c(j);
        }
        return c * f;
    }

    public static float X(int i, int i2, int i3, float f) {
        float f2;
        if (f == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f2 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return -3.4028235E38f;
                }
                return f;
            }
            f2 = i2;
        }
        return f * f2;
    }

    public static final hzj Y(t7k t7kVar) {
        return t7kVar instanceof hzj ? (hzj) t7kVar : new hzj(t7kVar);
    }

    public static final void Z(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new ForegroundColorSpan(c3x.U(j)), i, i2, 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(klu kluVar, owu owuVar, yci yciVar, uoi uoiVar, hq5 hq5Var, int i, int i2) {
        int i3;
        owu owuVar2;
        yci yciVar2;
        int i4;
        Object K;
        yci yciVar3;
        uoi uoiVar2;
        xmn r;
        owuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1525213111);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(kluVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            owuVar2 = owuVar;
            i3 |= oq5Var.h(owuVar2) ? 32 : 16;
        } else {
            owuVar2 = owuVar;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 256 : 128;
            i4 = i3 | 3072;
            if ((i4 & 1171) == 1170 || !oq5Var.z()) {
                yci yciVar4 = i5 == 0 ? vci.a : yciVar2;
                K = oq5Var.K();
                if (K == gq5.a) {
                    K = vz1.h(oq5Var);
                }
                uoi uoiVar3 = (uoi) K;
                rb.d(kluVar, owuVar2, zpd.l, ((jlu) oq5Var.j(mpg.a)).a, yciVar4, null, uoiVar3, new d85(d85.m), null, oq5Var, (i4 & 14) | 12583296 | (i4 & 112) | (57344 & (i4 << 6)) | ((i4 << 9) & 3670016), 288);
                yciVar3 = yciVar4;
                uoiVar2 = uoiVar3;
            } else {
                oq5Var.S();
                yciVar3 = yciVar2;
                uoiVar2 = uoiVar;
            }
            r = oq5Var.r();
            if (r == null) {
                r.d = new hq(kluVar, owuVar, yciVar3, uoiVar2, i, i2, 25);
                return;
            }
            return;
        }
        yciVar2 = yciVar;
        i4 = i3 | 3072;
        if ((i4 & 1171) == 1170) {
        }
        if (i5 == 0) {
        }
        K = oq5Var.K();
        if (K == gq5.a) {
        }
        uoi uoiVar32 = (uoi) K;
        rb.d(kluVar, owuVar2, zpd.l, ((jlu) oq5Var.j(mpg.a)).a, yciVar4, null, uoiVar32, new d85(d85.m), null, oq5Var, (i4 & 14) | 12583296 | (i4 & 112) | (57344 & (i4 << 6)) | ((i4 << 9) & 3670016), 288);
        yciVar3 = yciVar4;
        uoiVar2 = uoiVar32;
        r = oq5Var.r();
        if (r == null) {
        }
    }

    public static void a0(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(k5r.i(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static final void b(klu kluVar, owu owuVar, yci yciVar, uoi uoiVar, d85 d85Var, cma cmaVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        uoi uoiVar2;
        d85 d85Var2;
        owuVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(1094846038);
        int i2 = i | (oq5Var2.h(kluVar) ? 4 : 2) | (oq5Var2.h(owuVar) ? 32 : 16) | 27648;
        if ((74899 & i2) == 74898 && oq5Var2.z()) {
            oq5Var2.S();
            uoiVar2 = uoiVar;
            d85Var2 = d85Var;
            oq5Var = oq5Var2;
        } else {
            Object K = oq5Var2.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var2);
            }
            uoi uoiVar3 = (uoi) K;
            d85 d85Var3 = new d85(d85.m);
            oq5Var = oq5Var2;
            rb.d(kluVar, owuVar, zpd.m, ((jlu) oq5Var2.j(mpg.a)).a, yciVar, cmaVar != null ? d.m(vci.a, cmaVar.a) : null, uoiVar3, d85Var3, cmaVar != null ? b2c.o : b2c.n, oq5Var, (i2 & 112) | (i2 & 14) | 384 | 14180352, 0);
            uoiVar2 = uoiVar3;
            d85Var2 = d85Var3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pr(kluVar, owuVar, yciVar, uoiVar2, d85Var2, cmaVar, i);
        }
    }

    public static final void b0(Spannable spannable, long j, jx7 jx7Var, int i, int i2) {
        long b = kes.b(j);
        if (les.a(b, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(eeh.b(jx7Var.N(j)), false), i, i2, 33);
        } else if (les.a(b, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(kes.c(j)), i, i2, 33);
        }
    }

    /* JADX WARN: Type inference failed for: r1v31, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37, types: [java.util.ArrayList] */
    public static final void c(int i, long j, hq5 hq5Var, ymq ymqVar, Function2 function2) {
        List list;
        List list2;
        ?? c;
        ymq ymqVar2 = ymqVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1526030150);
        Function2 function22 = function2;
        int i2 = i | (oq5Var.f(ymqVar2) ? 4 : 2) | (oq5Var.e(j) ? 32 : 16) | (oq5Var.f(function22) ? 256 : 128);
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (ymqVar2 instanceof xmq) {
                oq5Var.a0(-1173540356);
                oq5Var.p(false);
                list2 = t75.c(new fma(j));
            } else {
                if (!(ymqVar2 instanceof wmq)) {
                    oq5Var.a0(-1173645715);
                    oq5Var.p(false);
                    b6e.s();
                    return;
                }
                oq5Var.a0(-1173538668);
                if (Build.VERSION.SDK_INT >= 31) {
                    oq5Var.a0(-2019914396);
                    Bundle bundle = (Bundle) oq5Var.j(ds5.a);
                    oq5Var.a0(-1173535336);
                    boolean e = oq5Var.e(j);
                    Object K = oq5Var.K();
                    if (e || K == gq5.a) {
                        K = new w60(j, 2);
                        oq5Var.k0(K);
                    }
                    Function0 function0 = (Function0) K;
                    oq5Var.p(false);
                    ArrayList<SizeF> parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
                        int i3 = bundle.getInt("appWidgetMinHeight", 0);
                        int i4 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i5 = bundle.getInt("appWidgetMinWidth", 0);
                        int i6 = bundle.getInt("appWidgetMaxWidth", 0);
                        c = (i3 == 0 || i4 == 0 || i5 == 0 || i6 == 0) ? t75.c(function0.invoke()) : u75.h(new fma(xv.m(i5, i4)), new fma(xv.m(i6, i3)));
                    } else {
                        c = new ArrayList(v75.o(parcelableArrayList, 10));
                        for (SizeF sizeF : parcelableArrayList) {
                            c.add(new fma(xv.m(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    }
                    oq5Var.p(false);
                    list = c;
                } else {
                    oq5Var.a0(-2019826759);
                    Bundle bundle2 = (Bundle) oq5Var.j(ds5.a);
                    int i7 = bundle2.getInt("appWidgetMinHeight", 0);
                    int i8 = bundle2.getInt("appWidgetMaxWidth", 0);
                    fma fmaVar = null;
                    fma fmaVar2 = (i7 == 0 || i8 == 0) ? null : new fma(xv.m(i8, i7));
                    int i9 = bundle2.getInt("appWidgetMaxHeight", 0);
                    int i10 = bundle2.getInt("appWidgetMinWidth", 0);
                    if (i9 != 0 && i10 != 0) {
                        fmaVar = new fma(xv.m(i10, i9));
                    }
                    List w = xz0.w(new fma[]{fmaVar2, fmaVar});
                    if (w.isEmpty()) {
                        w = t75.c(new fma(j));
                    }
                    oq5Var.p(false);
                    list = w;
                }
                oq5Var.p(false);
                list2 = list;
            }
            List K2 = CollectionsKt.K(list2);
            ArrayList arrayList = new ArrayList(v75.o(K2, 10));
            Iterator it = K2.iterator();
            while (it.hasNext()) {
                m(((i2 << 3) & 112) | (i2 & 896), ((fma) it.next()).a, oq5Var, ymqVar2, function22);
                arrayList.add(Unit.a);
                ymqVar2 = ymqVar;
                function22 = function2;
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rmq(i, j, ymqVar, function2);
        }
    }

    public static final void c0(Spannable spannable, bqg bqgVar, int i, int i2) {
        if (bqgVar != null) {
            ArrayList arrayList = new ArrayList(v75.o(bqgVar, 10));
            Iterator it = bqgVar.a.iterator();
            while (it.hasNext()) {
                arrayList.add(((zpg) it.next()).a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(Function0 function0, v1g v1gVar, w3g w3gVar, yci yciVar, boolean z, Function0 function02, hq5 hq5Var, int i, int i2) {
        int i3;
        yci yciVar2;
        int i4;
        boolean z2;
        Function0 function03;
        boolean z3;
        xmn r;
        function0.getClass();
        w3gVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1457852729);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? oq5Var.f(v1gVar) : oq5Var.h(v1gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(w3gVar) : oq5Var.h(w3gVar) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            yciVar2 = yciVar;
            i3 |= oq5Var.f(yciVar2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                z2 = z;
                i3 |= oq5Var.g(z2) ? 16384 : RemoteCameraConfig.Notification.ID;
                if ((196608 & i) == 0) {
                    function03 = function02;
                    i3 |= oq5Var.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
                } else {
                    function03 = function02;
                }
                if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
                    yci yciVar3 = i5 != 0 ? vci.a : yciVar2;
                    boolean z4 = i4 != 0 ? false : z2;
                    u1g.c(function0, v1gVar, w3gVar, yciVar3, z4, null, null, function03, oq5Var, (65534 & i3) | ((i3 << 6) & 29360128), 96);
                    z3 = z4;
                    yciVar2 = yciVar3;
                } else {
                    oq5Var.S();
                    z3 = z2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new o1g(function0, v1gVar, w3gVar, yciVar2, z3, function02, i, i2, 1);
                    return;
                }
                return;
            }
            z2 = z;
            if ((196608 & i) == 0) {
            }
            if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
            }
            r = oq5Var.r();
            if (r != null) {
            }
        }
        yciVar2 = yciVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        z2 = z;
        if ((196608 & i) == 0) {
        }
        if (oq5Var.P(i3 & 1, (74899 & i3) != 74898)) {
        }
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static yci d0(yci yciVar, float f, dup dupVar, boolean z, int i) {
        if ((i & 2) != 0) {
            dupVar = vnj.i;
        }
        dup dupVar2 = dupVar;
        if ((i & 4) != 0) {
            z = Float.compare(f, (float) 0) > 0;
        }
        boolean z2 = z;
        long j = apd.a;
        return (Float.compare(f, (float) 0) > 0 || z2) ? yciVar.f(new ShadowGraphicsLayerElement(f, dupVar2, z2, j, j)) : yciVar;
    }

    public static final void e(nbg nbgVar, long j, hq5 hq5Var, int i) {
        int i2;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        scaleType.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(2144338563);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(nbgVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.e(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= oq5Var.d(scaleType.ordinal()) ? 256 : 128;
        }
        int i3 = i & 3072;
        vci vciVar = vci.a;
        if (i3 == 0) {
            i2 |= oq5Var.f(vciVar) ? 2048 : 1024;
        }
        if ((i2 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = new d9w(0);
                oq5Var.k0(K);
            }
            Function1 function1 = (Function1) K;
            Object K2 = oq5Var.K();
            if (K2 == obj) {
                K2 = new d9w(1);
                oq5Var.k0(K2);
            }
            Function1 function12 = (Function1) K2;
            Object K3 = oq5Var.K();
            if (K3 == obj) {
                K3 = new d9w(2);
                oq5Var.k0(K3);
            }
            Function1 function13 = (Function1) K3;
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object K4 = oq5Var.K();
            if (z || K4 == obj) {
                K4 = new j8a(j, nbgVar);
                oq5Var.k0(K4);
            }
            a.b(function1, vciVar, function12, function13, (Function1) K4, oq5Var, ((i2 >> 6) & 112) | 3462, 0);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new irj(nbgVar, j, i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final jjv e0(String str) {
        gjv gjvVar = gjv.a;
        if (str != null) {
            switch (str.hashCode()) {
                case -2032180703:
                    str.equals("DEFAULT");
                    break;
                case -699513332:
                    if (str.equals("CONTROL_ACCENT")) {
                        return new fjv(true);
                    }
                    break;
                case 76402927:
                    if (str.equals("PROMO")) {
                        return ijv.a;
                    }
                    break;
                case 1580653263:
                    if (str.equals("MULTIVIBE")) {
                        return hjv.a;
                    }
                    break;
                case 1669525821:
                    if (str.equals("CONTROL")) {
                        return new fjv(false);
                    }
                    break;
            }
        }
        return gjvVar;
    }

    public static final void f(klu kluVar, pwu pwuVar, yci yciVar, uoi uoiVar, d85 d85Var, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        uoi uoiVar2;
        kluVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(299877867);
        if ((i & 6) == 0) {
            i2 = (oq5Var.h(kluVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(pwuVar) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if ((i & 24576) == 0) {
            i3 |= oq5Var.f(d85Var) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i3 & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            uoiVar2 = uoiVar;
        } else {
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = vz1.h(oq5Var);
            }
            uoi uoiVar3 = (uoi) K;
            jlu jluVar = (jlu) oq5Var.j(mpg.a);
            int i4 = (i3 & 14) | 100860288 | (i3 & 112) | (57344 & (i3 << 6));
            int i5 = i3 << 9;
            vci vciVar = vci.a;
            rb.d(kluVar, pwuVar, zpd.n, jluVar.a, vciVar, null, uoiVar3, d85Var, b2c.n, oq5Var, i4 | (3670016 & i5) | (i5 & 29360128), 0);
            yciVar2 = vciVar;
            uoiVar2 = uoiVar3;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new tu(i, 26, kluVar, pwuVar, yciVar2, uoiVar2, d85Var);
        }
    }

    public static final pxm f0(d0o d0oVar, Annotation[] annotationArr) {
        d0oVar.getClass();
        annotationArr.getClass();
        b80 b80Var = (b80) b80.class.cast(d0oVar.e.get(b80.class));
        String str = d0oVar.a.i;
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            pxm pxmVar = null;
            if (i >= length) {
                StringBuilder sb = new StringBuilder("Illegal state, must be returned before, annotations=");
                sb.append(annotationArr);
                Assertions.throwOrSkip$default(new FailedAssertionException(su4.o(sb, ", url=", str)), null, 2, null);
                return new vqt(str, "");
            }
            Annotation annotation = annotationArr[i];
            String str2 = "URL_SCHEME";
            if (annotation instanceof a0k) {
                String value = ((a0k) annotation).value();
                if (value.length() <= 0) {
                    value = null;
                }
                if (value == null) {
                    String str3 = b80Var != null ? b80Var.a : null;
                    if (str3 != null) {
                        str2 = str3;
                    }
                } else {
                    str2 = value;
                }
                pxmVar = new xqt(str, str2);
            } else if (annotation instanceof lzc) {
                String value2 = ((lzc) annotation).value();
                if (value2.length() <= 0) {
                    value2 = null;
                }
                if (value2 == null) {
                    String str4 = b80Var != null ? b80Var.a : null;
                    if (str4 != null) {
                        str2 = str4;
                    }
                } else {
                    str2 = value2;
                }
                pxmVar = new wqt(str, str2);
            } else if (annotation instanceof b0k) {
                String value3 = ((b0k) annotation).value();
                if (value3.length() <= 0) {
                    value3 = null;
                }
                if (value3 == null) {
                    String str5 = b80Var != null ? b80Var.a : null;
                    if (str5 != null) {
                        str2 = str5;
                    }
                } else {
                    str2 = value3;
                }
                pxmVar = new yqt(str, str2);
            }
            if (pxmVar != null) {
                return pxmVar;
            }
            i++;
        }
    }

    public static final void g(te teVar, int i, boolean z, Function1 function1, yci yciVar, hq5 hq5Var, int i2) {
        q0k c;
        teVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1930857457);
        int i3 = i2 | (oq5Var.f(teVar) ? 4 : 2) | (oq5Var.d(i) ? 32 : 16) | (oq5Var.g(z) ? 256 : 128) | (oq5Var.h(function1) ? 2048 : 1024) | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i3 & 1, (i3 & 9363) != 9362)) {
            float f = z ? 16 : 24;
            if (i == 0) {
                float f2 = qbb.a;
                float f3 = qbb.b;
                float f4 = qbb.c;
                c = new q0k(f4, f2, f4, f3);
            } else {
                float f5 = 16;
                c = androidx.compose.foundation.layout.a.c(f5, 0.0f, f5, f5, 2);
            }
            q0k q0kVar = c;
            int i4 = i3 & 14;
            boolean z2 = ((i3 & 7168) == 2048) | (i4 == 4);
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = new y6g(22, function1, teVar);
                oq5Var.k0(K);
            }
            xp3.e(teVar, (Function0) K, yciVar, null, f, q0kVar, null, oq5Var, ((i3 >> 6) & 896) | i4, 72);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pp(teVar, i, z, function1, yciVar, i2);
        }
    }

    public static /* synthetic */ boolean g0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, flx flxVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(flxVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(flxVar) != obj && atomicReferenceFieldUpdater.get(flxVar) != obj) {
                return false;
            }
        }
        return true;
    }

    public static final void h(osj osjVar, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        osjVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-857330759);
        if ((i & 6) == 0) {
            i2 = (oq5Var.f(osjVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            yciVar2 = vci.a;
            yci c = d.c(yciVar2, 1.0f);
            kfh d = ug3.d(b2c.b, false);
            int i4 = oq5Var.P;
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
            g0g.U(oq5Var, d, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eht ehtVar = (eht) gld.M(osjVar.a(), oq5Var).getValue();
            boolean z = ehtVar instanceof egt;
            Object obj = gq5.a;
            if (z) {
                oq5Var.Z(-1619557810);
                egt egtVar = (egt) ehtVar;
                boolean z2 = egtVar.a;
                boolean z3 = egtVar.b;
                Object K = oq5Var.K();
                if (K == obj) {
                    K = new hpj(8);
                    oq5Var.k0(K);
                }
                o2g.h(0, 0, oq5Var, nfp.a(yciVar2, (Function1) K), z2, z3);
                oq5Var.p(false);
            } else {
                if (!(ehtVar instanceof rgt)) {
                    throw vz1.i(oq5Var, 363397180, false);
                }
                oq5Var.Z(-1619273447);
                rgt rgtVar = (rgt) ehtVar;
                ArrayList arrayList = rgtVar.b;
                int i5 = i3 & 14;
                boolean f = oq5Var.f(arrayList);
                Object K2 = oq5Var.K();
                if (f || K2 == obj) {
                    K2 = new v3e(osjVar, arrayList);
                    oq5Var.k0(K2);
                }
                v3e v3eVar = (v3e) K2;
                ynn i6 = irv.i(oq5Var);
                usj usjVar = rgtVar.e;
                boolean z4 = rgtVar.c;
                yci a = androidx.compose.ui.platform.a.a(yciVar2, "open_playlist_block");
                wn5 C = ild.C(309824751, new qo5(rgtVar, 1), oq5Var);
                boolean f2 = (i5 == 4) | oq5Var.f(i6);
                Object K3 = oq5Var.K();
                if (f2 || K3 == obj) {
                    K3 = new gab(18, i6, osjVar);
                    oq5Var.k0(K3);
                }
                o2g.g(usjVar, osjVar, v3eVar, C, a, z4, (pyc) K3, oq5Var, ((i3 << 3) & 112) | 27648, 0);
                oq5Var = oq5Var;
                oq5Var.p(false);
            }
            oq5Var.p(true);
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new gva(osjVar, yciVar2, i, 26);
        }
    }

    public static final void i(vvd vvdVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1049473119);
        int i2 = i | (oq5Var.f(vvdVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | 384;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            yciVar2 = vci.a;
            irf.h(vvdVar.a, yciVar2, vvdVar.b, r43.c(new cma(0), new cma(12), 5), function0, false, null, false, null, oq5Var, 48 | ((i2 << 9) & 57344), 480);
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new q6h(vvdVar, function0, yciVar2, i, 15);
        }
    }

    public static final void j(dvl dvlVar, nab nabVar, thj thjVar, qzl qzlVar, tvd tvdVar, hq5 hq5Var, int i) {
        gvd gvdVar = dvlVar.c;
        nabVar.getClass();
        thjVar.getClass();
        qzlVar.getClass();
        tvdVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-234239420);
        int i2 = i | (oq5Var.f(dvlVar) ? 4 : 2) | (oq5Var.h(nabVar) ? 32 : 16) | (oq5Var.h(thjVar) ? 256 : 128) | (oq5Var.f(qzlVar) ? 2048 : 1024) | (oq5Var.f(tvdVar) ? 16384 : RemoteCameraConfig.Notification.ID);
        if (oq5Var.P(i2 & 1, (i2 & 9363) != 9362)) {
            boolean f = oq5Var.f(gvdVar);
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (f || K == obj) {
                K = new hab(gvdVar);
                oq5Var.k0(K);
            }
            hab habVar = (hab) K;
            boolean h = oq5Var.h(habVar) | ((i2 & 14) == 4) | ((i2 & 7168) == 2048);
            Object K2 = oq5Var.K();
            if (h || K2 == obj) {
                K2 = new ou4(3, habVar, dvlVar, qzlVar);
                oq5Var.k0(K2);
            }
            Function0 function0 = (Function0) K2;
            String str = dvlVar.a.h;
            jbu jbuVar = str != null ? new jbu(str) : null;
            l13 l13Var = qzlVar.a.o.a;
            u2x.o(function0, ild.C(458855082, new x91(qzlVar, nabVar, thjVar, tvdVar, dvlVar, habVar, function0, hyf.J(jbuVar, ((iau) l13Var.a.D(hag.I(iau.class), l13Var, l13Var.b)).a(), oq5Var, 0)), oq5Var), oq5Var, 48);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new pli(i, 7, dvlVar, nabVar, thjVar, qzlVar, tvdVar);
        }
    }

    public static final void k(uft uftVar, Function1 function1, hq5 hq5Var, int i) {
        int i2;
        uftVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-603665768);
        if ((i & 6) == 0) {
            i2 = (oq5Var.d(uftVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(function1) ? 32 : 16;
        }
        if (oq5Var.P(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object K = oq5Var.K();
            if (z || K == gq5.a) {
                K = new r5n(function1, uftVar, 1);
                oq5Var.k0(K);
            }
            w1g.g(false, ild.C(-2107187883, new s5n(uftVar, 2), oq5Var), ild.C(-1528421738, new s5n(uftVar, 3), oq5Var), ild.C(-949655593, new wcj(28, function1, uftVar), oq5Var), androidx.compose.foundation.a.e(vci.a, false, null, null, (Function0) K, 7), oq5Var, 3510);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new x8l(uftVar, function1, i, 3);
        }
    }

    public static final void l(ukd ukdVar, int i, int i2, wn5 wn5Var, hq5 hq5Var, int i3, int i4) {
        int i5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1618370649);
        if ((i3 & 6) == 0) {
            i5 = (oq5Var.f(ukdVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i6 = i4 & 2;
        if (i6 != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= oq5Var.d(i) ? 32 : 16;
        }
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 |= 384;
        } else if ((i3 & 384) == 0) {
            i5 |= oq5Var.d(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= oq5Var.f(wn5Var) ? 2048 : 1024;
        }
        if ((i5 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i6 != 0) {
                i = 0;
            }
            if (i7 != 0) {
                i2 = 0;
            }
            kho khoVar = kho.a;
            oq5Var.a0(578571862);
            oq5Var.a0(-548224868);
            if (!(oq5Var.a instanceof mw0)) {
                lxe.v();
                throw null;
            }
            oq5Var.X();
            if (oq5Var.O) {
                oq5Var.k(khoVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, ukdVar, zwn.v);
            g0g.U(oq5Var, new e40(i2), zwn.w);
            g0g.U(oq5Var, new d40(i), zwn.x);
            wn5Var.invoke(pho.a, oq5Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            oq5Var.p(true);
            oq5Var.p(false);
            oq5Var.p(false);
        }
        int i8 = i;
        int i9 = i2;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new ra5(ukdVar, i8, i9, wn5Var, i3, i4, 1);
        }
    }

    public static final void m(int i, long j, hq5 hq5Var, ymq ymqVar, Function2 function2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-53921383);
        int i2 = (oq5Var.e(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            int i3 = i & 64;
            i2 |= oq5Var.f(ymqVar) ? 32 : 16;
        }
        if (((i2 | (oq5Var.f(function2) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            etn.m(new qzm[]{cs5.a.a(new fma(j))}, ild.s(oq5Var, -1209815847, new rmq(function2, j, ymqVar)), oq5Var, 48);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new v0n(i, j, ymqVar, function2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(yj2 yj2Var, sdr sdrVar, sdr sdrVar2, Function0 function0, Function0 function02, Function0 function03, ccg ccgVar, yci yciVar, hq5 hq5Var, int i) {
        boolean z;
        Object obj;
        int i2;
        nbg nbgVar;
        sdr sdrVar3;
        boolean z2;
        Object obj2;
        yci yciVar2;
        boolean z3 = yj2Var.e;
        sdrVar.getClass();
        sdrVar2.getClass();
        function0.getClass();
        function02.getClass();
        function03.getClass();
        ccgVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(270594474);
        int i3 = 12582912 | i | (oq5Var.f(yj2Var) ? 4 : 2) | (oq5Var.f(sdrVar) ? 32 : 16) | (oq5Var.f(sdrVar2) ? 256 : 128) | (oq5Var.h(function02) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.h(function03) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX) | (oq5Var.h(ccgVar) ? 1048576 : 524288);
        if ((4793491 & i3) == 4793490 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
            obj = ccgVar;
        } else {
            boolean f = oq5Var.f(ccgVar);
            Object K = oq5Var.K();
            Object obj3 = gq5.a;
            if (f || K == obj3) {
                bcg O = ccgVar.O();
                if (O != null) {
                    ecg ecgVar = (ecg) O;
                    String str = ecgVar.m;
                    qdc qdcVar = ecgVar.a;
                    qdcVar.H(str, "getPlayer", null, new Object[0]);
                    ru.yandex.video.m3.list_player_manager.impl.a aVar = ecgVar.b;
                    y7g.Y(false, aVar.c);
                    m mVar = aVar.a;
                    gag gagVar = (gag) mVar.j;
                    nsh nshVar = (nsh) mVar.h;
                    Context applicationContext = ((Context) mVar.k).getApplicationContext();
                    tf6 tf6Var = (tf6) mVar.i;
                    applicationContext.getClass();
                    n9g n9gVar = new n9g(tf6Var, gagVar, nshVar, applicationContext);
                    String str2 = (String) mVar.b;
                    qdc qdcVar2 = (qdc) mVar.c;
                    int andIncrement = o9g.a.getAndIncrement();
                    acg acgVar = new acg(qdcVar2, str2, andIncrement, (xiu) mVar.d, (xiu) mVar.e, (ime) mVar.f, (s1) mVar.g, n9gVar);
                    acgVar.u.a(aVar);
                    ArrayList arrayList = aVar.g;
                    arrayList.add(acgVar);
                    ecg ecgVar2 = aVar.l;
                    if (ecgVar2 != null && arrayList.size() == 0) {
                        dn9 dn9Var = ecgVar2.d;
                        ((AtomicReference) dn9Var.e).set(null);
                        ((AtomicInteger) dn9Var.f).set(Integer.MIN_VALUE);
                    }
                    ime imeVar = ecgVar.h;
                    acgVar.a((q9g) imeVar.d);
                    ((ArrayList) imeVar.b).add(acgVar);
                    z = false;
                    qdcVar.H(str, "getPlayer", "returned player index = " + andIncrement, new Object[0]);
                    K = new nbg(acgVar);
                } else {
                    z = false;
                    K = null;
                }
                oq5Var.k0(K);
            } else {
                z = false;
            }
            nbg nbgVar2 = (nbg) K;
            if (nbgVar2 == null) {
                xmn r = oq5Var.r();
                if (r != null) {
                    r.d = new vl1(yj2Var, sdrVar, sdrVar2, function0, function02, function03, ccgVar, i, 12);
                    return;
                }
                return;
            }
            obj = ccgVar;
            boolean h = oq5Var.h(obj) | oq5Var.f(nbgVar2);
            Object K2 = oq5Var.K();
            if (h || K2 == obj3) {
                K2 = new itv(13, obj, nbgVar2);
                oq5Var.k0(K2);
            }
            gld.j(nbgVar2, obj, (Function1) K2, oq5Var);
            long j = ((dq0) oq5Var.j(eq0.a)).c.a;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            e(nbgVar2, j, oq5Var, 3456);
            Object[] objArr = {nbgVar2, yj2Var, function02, function03, function0, sdrVar2};
            int i4 = i3 & 14;
            int i5 = i3 & 896;
            boolean f2 = (i4 == 4 ? true : z) | (i5 == 256 ? true : z) | ((57344 & i3) == 16384 ? true : z) | ((458752 & i3) == 131072 ? true : z) | oq5Var.f(nbgVar2);
            Object K3 = oq5Var.K();
            if (f2 || K3 == obj3) {
                i2 = i5;
                Object m10Var = new m10(yj2Var, sdrVar2, nbgVar2, function02, function03, function0);
                nbgVar = nbgVar2;
                sdrVar3 = sdrVar2;
                oq5Var.k0(m10Var);
                K3 = m10Var;
            } else {
                i2 = i5;
                nbgVar = nbgVar2;
                sdrVar3 = sdrVar2;
            }
            gld.l(objArr, (Function1) K3, oq5Var);
            if (z3) {
                oq5Var.Z(-371702497);
                boolean f3 = oq5Var.f(nbgVar) | (i2 == 256);
                Object K4 = oq5Var.K();
                if (f3 || K4 == obj3) {
                    obj2 = null;
                    K4 = new y6v((Object) sdrVar3, (Object) nbgVar, (Continuation) (0 == true ? 1 : 0), 19);
                    oq5Var.k0(K4);
                } else {
                    obj2 = null;
                }
                gld.y(sdrVar3, nbgVar, (Function2) K4, oq5Var);
                z2 = false;
            } else {
                z2 = false;
                obj2 = null;
                oq5Var.Z(-375128648);
            }
            oq5Var.p(z2);
            Context context = (Context) oq5Var.j(AndroidCompositionLocals_androidKt.b);
            boolean f4 = oq5Var.f(nbgVar) | (i4 == 4 ? true : z2);
            Object K5 = oq5Var.K();
            if (f4 || K5 == obj3) {
                Object cx1Var = z3 ? new cx1(context, 4, 3, new nb0(2, nbgVar.a)) : obj2;
                oq5Var.k0(cx1Var);
                K5 = cx1Var;
            }
            cx1 cx1Var2 = (cx1) K5;
            dzf dzfVar = (dzf) oq5Var.j(ykg.a);
            Object[] objArr2 = {sdrVar, dzfVar, nbgVar, sdrVar3};
            boolean h2 = oq5Var.h(dzfVar) | ((i3 & 112) == 32 ? true : z2) | oq5Var.f(nbgVar) | (i2 == 256 ? true : z2) | oq5Var.h(cx1Var2);
            Object K6 = oq5Var.K();
            if (h2 || K6 == obj3) {
                Object inrVar = new inr(dzfVar, sdrVar, nbgVar, sdrVar3, cx1Var2, (Continuation) null);
                oq5Var.k0(inrVar);
                K6 = inrVar;
            }
            gld.z(objArr2, (Function2) K6, oq5Var);
            yciVar2 = vci.a;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new x91(yj2Var, sdrVar, sdrVar2, function0, function02, function03, obj, yciVar2, i, 6);
        }
    }

    public static final void o(String str, ukd ukdVar, fes fesVar, int i, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-192911377);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.f(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(ukdVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(fesVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.d(i) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i2 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            scs scsVar = scs.a;
            oq5Var.a0(-1115894518);
            oq5Var.a0(1886828752);
            if (!(oq5Var.a instanceof mw0)) {
                lxe.v();
                throw null;
            }
            oq5Var.X();
            if (oq5Var.O) {
                oq5Var.k(new ypb(scsVar));
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, str, epo.A0);
            g0g.U(oq5Var, ukdVar, epo.B0);
            g0g.U(oq5Var, fesVar, ucs.s);
            ucs ucsVar = ucs.t;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i))) {
                oq5Var.k0(Integer.valueOf(i));
                oq5Var.b(Integer.valueOf(i), ucsVar);
            }
            f1d.u(oq5Var, true, false, false);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new rj0(str, ukdVar, fesVar, i, i2, 5);
        }
    }

    public static final void p(String str, hq5 hq5Var, int i) {
        yci u;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(248868209);
        int i2 = i | (oq5Var.f(str) ? 4 : 2);
        if (oq5Var.P(i2 & 1, (i2 & 3) != 2)) {
            nho a = lho.a(qx0.a, b2c.l, oq5Var, 48);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
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
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            gae.b(a0g.E(R.drawable.ic_plus_logo, 0, oq5Var), null, androidx.compose.foundation.layout.a.q(d.m(vciVar, ff7.P(nu0.j().a.b, oq5Var)), 0.0f, 0.0f, 4, 0.0f, 11), d85.n, oq5Var, 3120, 0);
            u = d.u(vciVar, b2c.l, (r2 & 2) == 0);
            xcs.b(str, u, ((dq0) oq5Var.j(eq0.a)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var, (i2 & 14) | 48, 3120, 55288);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new da1(str, i, 13);
        }
    }

    public static final void q(Function0 function0, Function0 function02, d85 d85Var, hq5 hq5Var, int i, int i2) {
        int i3;
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1217834968);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.h(function02) ? 32 : 16;
        }
        if (((i3 | (((i2 & 4) == 0 && oq5Var.f(d85Var)) ? 256 : 128)) & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
                int i4 = i2 & 4;
            } else if ((i2 & 4) != 0) {
                d85Var = ((q9b) oq5Var.j(s9b.a)).a();
            }
            oq5Var.q();
            String M = rvf.M(R.string.menu_element_trailer, oq5Var);
            wn5 C = ild.C(116070000, new kws(function02, function0, d85Var), oq5Var);
            boolean f = oq5Var.f(M);
            Object K = oq5Var.K();
            if (f || K == gq5.a) {
                K = new srp(M, 12);
                oq5Var.k0(K);
            }
            g0g.m(C, M, nfp.b(vci.a, true, (Function1) K), null, 0L, 0, oq5Var, 6, 56);
        }
        d85 d85Var2 = d85Var;
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new o4p(function0, function02, d85Var2, i, i2, 11);
        }
    }

    public static final void r(x2u x2uVar, bci bciVar, hq5 hq5Var, int i) {
        x2uVar.getClass();
        bciVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1412900276);
        int i2 = (oq5Var.h(x2uVar) ? 4 : 2) | i | (oq5Var.h(bciVar) ? 32 : 16);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            c3u c3uVar = (c3u) gld.M(x2uVar.g, oq5Var).getValue();
            if (Intrinsics.d(c3uVar, y2u.a)) {
                oq5Var.Z(-587492368);
                oq5Var.p(false);
            } else {
                if (!(c3uVar instanceof b3u)) {
                    throw vz1.i(oq5Var, -587495539, false);
                }
                oq5Var.Z(-1032333183);
                s((b3u) c3uVar, bciVar, x2uVar, oq5Var, ((i2 << 6) & 896) | (i2 & 112) | 64);
                oq5Var.p(false);
            }
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(x2uVar, bciVar, i, 24);
        }
    }

    public static final void s(b3u b3uVar, bci bciVar, x2u x2uVar, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-531086339);
        int i2 = (oq5Var.h(b3uVar) ? 4 : 2) | i | (oq5Var.h(bciVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= oq5Var.h(x2uVar) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            x2uVar.getClass();
            oq5Var.Z(-1670849320);
            nmj nmjVar = x2uVar.f;
            boolean h = oq5Var.h(x2uVar);
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (h || K == kjnVar) {
                K = new ti1(12, x2uVar);
                oq5Var.k0(K);
            }
            jmj b = nmjVar.b((dmj) K, x2uVar.a, x2uVar.e, 1, oq5Var, 36352);
            oq5Var.p(false);
            boolean h2 = oq5Var.h(b3uVar) | oq5Var.h(b) | oq5Var.h(x2uVar);
            Object K2 = oq5Var.K();
            if (h2 || K2 == kjnVar) {
                K2 = new zzq(11, b3uVar, b, x2uVar);
                oq5Var.k0(K2);
            }
            oq5Var = oq5Var;
            vq1.g(null, bciVar, false, (Function1) K2, oq5Var, (i2 & 112) | 64, 13);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(b3uVar, bciVar, x2uVar, i, 20);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void t(klu kluVar, qmu qmuVar, yci yciVar, uoi uoiVar, d85 d85Var, hq5 hq5Var, int i, int i2) {
        int i3;
        uoi uoiVar2;
        int i4;
        d85 d85Var2;
        uoi uoiVar3;
        uoi uoiVar4;
        xmn r;
        kluVar.getClass();
        qmuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(389428142);
        if ((i & 6) == 0) {
            i3 = (oq5Var.h(kluVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= oq5Var.d(qmuVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= oq5Var.f(yciVar) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            uoiVar2 = uoiVar;
            i3 |= oq5Var.f(uoiVar2) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                d85Var2 = d85Var;
                i3 |= oq5Var.f(d85Var2) ? 16384 : RemoteCameraConfig.Notification.ID;
                if ((i3 & 9363) == 9362 || !oq5Var.z()) {
                    if (i5 != 0) {
                        Object K = oq5Var.K();
                        if (K == gq5.a) {
                            K = vz1.h(oq5Var);
                        }
                        uoiVar3 = (uoi) K;
                    } else {
                        uoiVar3 = uoiVar2;
                    }
                    d85 d85Var3 = i4 != 0 ? new d85(d85.m) : d85Var2;
                    int i6 = i3 & 126;
                    int i7 = i3 << 3;
                    rb.n(kluVar, qmuVar, ((jlu) oq5Var.j(mpg.a)).a, yciVar, uoiVar3, d85Var3, false, oq5Var, i6 | (i7 & 7168) | (57344 & i7) | (i7 & 458752), 64);
                    uoiVar4 = uoiVar3;
                    d85Var2 = d85Var3;
                } else {
                    oq5Var.S();
                    uoiVar4 = uoiVar2;
                }
                r = oq5Var.r();
                if (r != null) {
                    r.d = new cj(kluVar, qmuVar, yciVar, uoiVar4, d85Var2, i, i2);
                    return;
                }
                return;
            }
            d85Var2 = d85Var;
            if ((i3 & 9363) == 9362) {
            }
            if (i5 != 0) {
            }
            if (i4 != 0) {
            }
            int i62 = i3 & 126;
            int i72 = i3 << 3;
            rb.n(kluVar, qmuVar, ((jlu) oq5Var.j(mpg.a)).a, yciVar, uoiVar3, d85Var3, false, oq5Var, i62 | (i72 & 7168) | (57344 & i72) | (i72 & 458752), 64);
            uoiVar4 = uoiVar3;
            d85Var2 = d85Var3;
            r = oq5Var.r();
            if (r != null) {
            }
        }
        uoiVar2 = uoiVar;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        d85Var2 = d85Var;
        if ((i3 & 9363) == 9362) {
        }
        if (i5 != 0) {
        }
        if (i4 != 0) {
        }
        int i622 = i3 & 126;
        int i722 = i3 << 3;
        rb.n(kluVar, qmuVar, ((jlu) oq5Var.j(mpg.a)).a, yciVar, uoiVar3, d85Var3, false, oq5Var, i622 | (i722 & 7168) | (57344 & i722) | (i722 & 458752), 64);
        uoiVar4 = uoiVar3;
        d85Var2 = d85Var3;
        r = oq5Var.r();
        if (r != null) {
        }
    }

    public static final void u(jlf jlfVar, boolean z, yci yciVar, e9b e9bVar, vpb vpbVar, wn5 wn5Var, hq5 hq5Var, int i) {
        int i2;
        aqi aqiVar;
        Object tnfVar;
        aqi aqiVar2;
        yci yciVar2;
        jlf jlfVar2 = jlfVar;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1472959860);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? oq5Var.f(jlfVar2) : oq5Var.h(jlfVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.g(z) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= oq5Var.f(e9bVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= oq5Var.f(vpbVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((i & 196608) == 0) {
            i3 |= oq5Var.h(wn5Var) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        int i4 = i3;
        if ((74899 & i4) == 74898 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(jlfVar2);
                oq5Var.k0(K);
            }
            aqi aqiVar3 = (aqi) K;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = szf.g0(Boolean.valueOf(z));
                oq5Var.k0(K2);
            }
            aqi aqiVar4 = (aqi) K2;
            boolean z2 = false;
            boolean z3 = (i4 & 112) == 32;
            if ((i4 & 14) == 4 || ((i4 & 8) != 0 && oq5Var.h(jlfVar2))) {
                z2 = true;
            }
            boolean z4 = z3 | z2;
            Object K3 = oq5Var.K();
            if (z4 || K3 == kjnVar) {
                aqiVar = aqiVar3;
                aqiVar2 = aqiVar4;
                tnfVar = new tnf(3, jlfVar, aqiVar2, aqiVar, null, z);
                jlfVar2 = jlfVar;
                oq5Var.k0(tnfVar);
            } else {
                aqiVar = aqiVar3;
                tnfVar = K3;
                aqiVar2 = aqiVar4;
            }
            gld.w(oq5Var, jlfVar2, (Function2) tnfVar);
            boolean booleanValue = ((Boolean) aqiVar2.getValue()).booleanValue();
            wn5 C = ild.C(486526028, new dv(wn5Var, i4, aqiVar, 6), oq5Var);
            int i5 = i4 >> 3;
            vci vciVar = vci.a;
            etn.f(booleanValue, vciVar, e9bVar, vpbVar, null, C, oq5Var, (i5 & 112) | 196608 | (i5 & 896) | (i5 & 7168), 16);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new dq(jlfVar2, z, yciVar2, e9bVar, vpbVar, wn5Var, i);
        }
    }

    public static final void v(uht uhtVar, Function1 function1, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        uhtVar.getClass();
        function1.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(836233701);
        int i2 = i | (oq5Var.d(uhtVar.ordinal()) ? 4 : 2) | (oq5Var.h(function1) ? 32 : 16) | 384;
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            ta5 a = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l = oq5Var.l();
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
            g0g.U(oq5Var, a, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            oq5Var.Z(1115667310);
            uht.c.getClass();
            rdb rdbVar = uht.e;
            rdbVar.getClass();
            c7 c7Var = new c7(0, rdbVar);
            int i4 = 0;
            while (c7Var.hasNext()) {
                Object next = c7Var.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    u75.n();
                    throw null;
                }
                uht uhtVar2 = (uht) next;
                boolean z = uhtVar2 == uhtVar;
                String M = rvf.M(uhtVar2.a, oq5Var);
                String M2 = rvf.M(uhtVar2.b, oq5Var);
                boolean d = ((i2 & 112) == 32) | oq5Var.d(uhtVar2.ordinal());
                Object K = oq5Var.K();
                if (d || K == gq5.a) {
                    K = new hav(5, function1, uhtVar2);
                    oq5Var.k0(K);
                }
                ox6.f(0, oq5Var, b.b(b.c(androidx.compose.ui.platform.a.a(androidx.compose.foundation.a.e(vciVar, false, null, null, (Function0) K, 7), "settings_button"), "selected", Boolean.valueOf(uhtVar2 == uhtVar)), i4), M, M2, z);
                c7Var = c7Var;
                i4 = i5;
            }
            oq5Var.p(false);
            oq5Var.p(true);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new kws(uhtVar, function1, yciVar2, i, 15);
        }
    }

    public static final void w(bov bovVar, hq5 hq5Var, int i) {
        oq5 oq5Var;
        bovVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-772429276);
        int i2 = (oq5Var2.h(bovVar) ? 4 : 2) | i;
        if (oq5Var2.P(i2 & 1, (i2 & 3) != 2)) {
            String M = rvf.M(R.string.widget_settings_color_type, oq5Var2);
            fvf a = hvf.a(0, 0, oq5Var2, 0, 3);
            boolean h = oq5Var2.h(bovVar);
            Object K = oq5Var2.K();
            if (h || K == gq5.a) {
                vtu vtuVar = new vtu(0, bovVar, bov.class, "onCloseClick", "onCloseClick()V", 0, 8);
                oq5Var2.k0(vtuVar);
                K = vtuVar;
            }
            WeakHashMap weakHashMap = rqv.w;
            oq5Var = oq5Var2;
            xp3.d(M, a, androidx.compose.ui.platform.a.a(vci.a, "widget_settings_screen"), p6g.n(z7l.h(oq5Var2).e, oq5Var2), (Function0) ((h9f) K), null, false, false, null, null, null, ild.C(851004378, new olu(7, bovVar), oq5Var2), oq5Var, 384, 48, 2016);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cov(bovVar, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0122 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object x(Context context, oyg oygVar, String str, String str2, String str3, String str4, cg6 cg6Var) {
        dun dunVar;
        nm6 nm6Var;
        int i;
        String str5;
        String str6;
        String str7;
        Context context2;
        ayg aygVar;
        ayg aygVar2;
        Context context3;
        String str8;
        Object V;
        String str9;
        Context context4;
        String str10;
        Object V2;
        if (cg6Var instanceof dun) {
            dunVar = (dun) cg6Var;
            int i2 = dunVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dunVar.o = i2 - Integer.MIN_VALUE;
                Object obj = dunVar.n;
                nm6Var = nm6.a;
                i = dunVar.o;
                int i3 = 1;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    int i4 = 0;
                    pzg M = M(context, oygVar, str4, false);
                    if (M == null) {
                        tiu.g(oygVar, ".", "Unable to create parsing task for ");
                        return null;
                    }
                    dunVar.j = context;
                    str5 = str;
                    dunVar.k = str5;
                    str6 = str2;
                    dunVar.l = str6;
                    str7 = str3;
                    dunVar.m = str7;
                    dunVar.o = 1;
                    zt3 zt3Var = new zt3(1, qxe.b(dunVar));
                    zt3Var.s();
                    M.b(new cun(zt3Var, i4));
                    M.a(new cun(zt3Var, i3));
                    obj = zt3Var.q();
                    if (obj != nm6Var) {
                        context2 = context;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ayg aygVar3 = (ayg) dunVar.j;
                        qgg.h0(obj);
                        return aygVar3;
                    }
                    aygVar2 = (ayg) dunVar.m;
                    str10 = dunVar.l;
                    str9 = dunVar.k;
                    context4 = (Context) dunVar.j;
                    qgg.h0(obj);
                    str8 = null;
                    dunVar.j = aygVar2;
                    dunVar.k = str8;
                    dunVar.l = str8;
                    dunVar.m = str8;
                    dunVar.o = 3;
                    if (aygVar2.f.isEmpty()) {
                        dq7 dq7Var = ca8.a;
                        V2 = x97.V(mn7.d, new v24(aygVar2, context4, str9, str10, (Continuation) null, 11), dunVar);
                        if (V2 != nm6Var) {
                            V2 = Unit.a;
                        }
                    } else {
                        V2 = Unit.a;
                    }
                    return V2 != nm6Var ? nm6Var : aygVar2;
                }
                String str11 = (String) dunVar.m;
                String str12 = dunVar.l;
                String str13 = dunVar.k;
                Context context5 = (Context) dunVar.j;
                qgg.h0(obj);
                str7 = str11;
                context2 = context5;
                str6 = str12;
                str5 = str13;
                aygVar = (ayg) obj;
                dunVar.j = context2;
                dunVar.k = str6;
                dunVar.l = str7;
                dunVar.m = aygVar;
                dunVar.o = 2;
                if (aygVar.d.isEmpty()) {
                    dq7 dq7Var2 = ca8.a;
                    Context context6 = context2;
                    String str14 = str5;
                    aygVar2 = aygVar;
                    context3 = context6;
                    str8 = null;
                    V = x97.V(mn7.d, new n71(aygVar, context6, str14, continuation, 29), dunVar);
                    if (V != nm6Var) {
                        V = Unit.a;
                    }
                } else {
                    context3 = context2;
                    aygVar2 = aygVar;
                    V = Unit.a;
                    str8 = null;
                }
                if (V != nm6Var) {
                    str9 = str6;
                    context4 = context3;
                    str10 = str7;
                    dunVar.j = aygVar2;
                    dunVar.k = str8;
                    dunVar.l = str8;
                    dunVar.m = str8;
                    dunVar.o = 3;
                    if (aygVar2.f.isEmpty()) {
                    }
                    if (V2 != nm6Var) {
                    }
                }
            }
        }
        dunVar = new dun(cg6Var);
        Object obj2 = dunVar.n;
        nm6Var = nm6.a;
        i = dunVar.o;
        int i32 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        aygVar = (ayg) obj2;
        dunVar.j = context2;
        dunVar.k = str6;
        dunVar.l = str7;
        dunVar.m = aygVar;
        dunVar.o = 2;
        if (aygVar.d.isEmpty()) {
        }
        if (V != nm6Var) {
        }
    }

    public static void y(String str, boolean z) {
        if (z) {
            return;
        }
        xq0.x(str);
    }

    public static void z(boolean z) {
        if (z) {
            return;
        }
        e7o.e();
    }
}
