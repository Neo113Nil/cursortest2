package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import com.yandex.media.ynison.service.i0;
import com.yandex.music.core.ui.compose.a;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Exchanger;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.utils.Preconditions;
import ru.yandex.video.m3.ab.validation.AbValidationType;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class vq2 {
    public static final ym0 a = new ym0(Float.POSITIVE_INFINITY);
    public static final zm0 b = new zm0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final an0 c = new an0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final bn0 d = new bn0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final ym0 e = new ym0(Float.NEGATIVE_INFINITY);
    public static final zm0 f = new zm0(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final an0 g = new an0(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final bn0 h = new bn0(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final wn5 i = new wn5(new fo5(20), 209484009, false);
    public static final wn5 j = new wn5(new no5(1), -1753017014, false);
    public static final wn5 k = new wn5(new no5(2), 2067924299, false);
    public static final wn5 l = new wn5(new no5(3), 1593898316, false);
    public static final wn5 m = new wn5(new no5(4), 1119872333, false);
    public static final wn5 n = new wn5(new zo5(14), -505530717, false);
    public static final rj7 o;
    public static final Object p;
    public static final Object q;
    public static jku r;

    static {
        new wn5(new zo5(15), 1407613156, false);
        o = new rj7(23);
        p = new Object();
        q = new Object();
    }

    public static final Intent A(Context context, Class cls, Bundle bundle) {
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.replaceExtras(bundle);
        return intent;
    }

    public static File B(Context context, String str) {
        File file = new File(context.getExternalCacheDir(), hrg.s("log_", new SimpleDateFormat("HH_mm", Locale.US).format(new Date(System.currentTimeMillis())), "_", str, ".txt"));
        wge C = q6k.C(context);
        C.b();
        Exchanger exchanger = new Exchanger();
        ((LinkedBlockingQueue) C.c).offer(new nud(exchanger, file, C, false, 8));
        if (((Boolean) exchanger.exchange(null)).booleanValue()) {
            return file;
        }
        return null;
    }

    public static final String C(cvl cvlVar) {
        r54 r54Var;
        u4h u4hVar = cvlVar.u;
        htr H = swf.H();
        H.getClass();
        String str = (H != htr.h || u4hVar == null || (r54Var = u4hVar.b) == null) ? null : r54Var.b;
        if (str != null && str.length() != 0) {
            return str;
        }
        if (u4hVar == null) {
            return str;
        }
        drt drtVar = u4hVar.a;
        if (drtVar != null) {
            return drtVar.b;
        }
        return null;
    }

    public static Object[] D(Object[] objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : objArr) {
            if (obj instanceof Object[]) {
                for (Object obj2 : D((Object[]) obj)) {
                    arrayList.add(obj2);
                }
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList.toArray();
    }

    public static zp2 E(c01 c01Var) {
        ArrayList arrayList;
        c01Var.getClass();
        List list = c01Var.h;
        if (list != null) {
            List<c01> list2 = list;
            arrayList = new ArrayList(v75.o(list2, 10));
            for (c01 c01Var2 : list2) {
                Parcelable.Creator<zp2> creator = zp2.CREATOR;
                arrayList.add(E(c01Var2));
            }
        } else {
            arrayList = null;
        }
        return new zp2(c01Var.a, c01Var.b, null, c01Var.i, arrayList, c01Var.n, c01Var.k, c01Var.l, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static aa7 F(aa7 aa7Var, kzm kzmVar, qzc qzcVar) {
        long j2;
        zje zjeVar;
        zk4 zk4Var;
        try {
            j2 = Long.parseLong(qzcVar.p("Content-Length"));
        } catch (Exception unused) {
            j2 = -1;
        }
        if (-1 != j2) {
            if (j2 < 0) {
                x7e i2 = x7e.i(aa7Var.a(), new my1("not using chunked encoding, and no content-length found."));
                i2.f(aa7Var);
                return i2;
            }
            if (j2 == 0) {
                x7e i3 = x7e.i(aa7Var.a(), null);
                i3.f(aa7Var);
                return i3;
            }
            nc6 nc6Var = new nc6();
            nc6Var.h = new om3();
            nc6Var.f = j2;
            nc6Var.f(aa7Var);
            zk4Var = nc6Var;
        } else {
            if (!"chunked".equalsIgnoreCase(qzcVar.p("Transfer-Encoding"))) {
                if (kzmVar == kzm.b && !"close".equalsIgnoreCase(qzcVar.p("Connection"))) {
                    x7e i4 = x7e.i(aa7Var.a(), null);
                    i4.f(aa7Var);
                    return i4;
                }
                if (!"gzip".equals(qzcVar.p("Content-Encoding"))) {
                    rzc rzcVar = new rzc(new Inflater(true));
                    rzcVar.h = true;
                    rzcVar.i = new CRC32();
                    rzcVar.f(aa7Var);
                    zjeVar = rzcVar;
                } else {
                    if (!"deflate".equals(qzcVar.p("Content-Encoding"))) {
                        return aa7Var;
                    }
                    zje zjeVar2 = new zje(new Inflater());
                    zjeVar2.f(aa7Var);
                    zjeVar = zjeVar2;
                }
                return zjeVar;
            }
            zk4 zk4Var2 = new zk4();
            zk4Var2.f = 0;
            zk4Var2.g = 0;
            zk4Var2.h = 1;
            zk4Var2.i = new om3();
            zk4Var2.f(aa7Var);
            zk4Var = zk4Var2;
        }
        aa7Var = zk4Var;
        if (!"gzip".equals(qzcVar.p("Content-Encoding"))) {
        }
        return zjeVar;
    }

    public static final float G(View view, int i2, xd9 xd9Var, xzb xzbVar) {
        Object c2 = xd9Var.c();
        if (!(c2 instanceof yd9)) {
            return c2 instanceof he9 ? (((float) ((Number) ((he9) c2).a.a(xzbVar)).doubleValue()) / 100.0f) * i2 : i2 / 2.0f;
        }
        yd9 yd9Var = (yd9) c2;
        float longValue = ((Number) yd9Var.b.a(xzbVar)).longValue();
        int ordinal = ((jk9) yd9Var.a.a(xzbVar)).ordinal();
        if (ordinal == 0) {
            return bg3.y(Float.valueOf(longValue), view.getResources().getDisplayMetrics());
        }
        if (ordinal == 1) {
            return bg3.a0(Float.valueOf(longValue), view.getResources().getDisplayMetrics());
        }
        if (ordinal == 2) {
            return longValue;
        }
        b6e.s();
        return 0.0f;
    }

    public static final long H(ffh ffhVar, gnc gncVar, long j2, Function1 function1) {
        if (u1g.J(u1g.I(ffhVar)) != 0.0f) {
            int G = ffhVar.G(Integer.MAX_VALUE);
            return qpe.a(G, ffhVar.z(G));
        }
        u1g.I(ffhVar);
        ksk M = ffhVar.M(j2);
        function1.invoke(M);
        return qpe.a(M.a0(), M.Z());
    }

    public static final String I(cvl cvlVar, Context context, boolean z, boolean z2) {
        cvlVar.getClass();
        String C = C(cvlVar);
        if (C != null && C.length() != 0) {
            Date date = cvlVar.o;
            if (date == null) {
                date = new Date(System.currentTimeMillis());
            }
            String a2 = rd7.a(context, date, new zzp(1), false);
            a2.getClass();
            String string = context.getString(R.string.playlist_built_for, C, a2);
            string.getClass();
            return string;
        }
        int i2 = z2 ? cvlVar.i : cvlVar.g;
        drt drtVar = cvlVar.c;
        drtVar.getClass();
        String str = drtVar.c;
        if (str.length() == 0) {
            str = drtVar.b;
        }
        if (!z && (i2 <= 0 || cvlVar.h > 0)) {
            return str;
        }
        l18 l18Var = l18.b;
        bdt I = hag.I(skr.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        String b2 = ((skr) qdcVar.C(I)).b(R.plurals.plural_n_tracks_rtl_support, i2, Integer.valueOf(i2));
        return str.length() == 0 ? b2 : k5r.m(str, context.getString(R.string.dot_divider), "\u200f", b2);
    }

    public static final void J(TextView textView, Context context, boolean z) {
        Drawable drawable;
        textView.getClass();
        context.getClass();
        if (z) {
            jyr jyrVar = sht.a;
            Object nonNull = Preconditions.nonNull(y2x.w(context, R.drawable.ic_small_like_active_16));
            nonNull.getClass();
            drawable = (Drawable) nonNull;
            drawable.setColorFilter(ksw.C(context, R.attr.iconLike));
        } else {
            jyr jyrVar2 = sht.a;
            Object nonNull2 = Preconditions.nonNull(y2x.w(context, R.drawable.ic_small_like_unactive_16));
            nonNull2.getClass();
            drawable = (Drawable) nonNull2;
            drawable.setColorFilter(ksw.C(context, R.attr.iconSecondary));
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public static ComponentName K(Context context, Intent intent) {
        synchronized (q) {
            try {
                w(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    r.a();
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final n8g L(m04 m04Var) {
        n8g b2 = t75.b();
        ArrayList arrayList = m04Var.a;
        ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new bz3((o04) it.next()));
        }
        b2.addAll(arrayList2);
        List list = m04Var.b;
        if (list != null) {
            Integer num = m04Var.c;
            int intValue = num != null ? num.intValue() + 1 : 0;
            List<n54> list2 = list;
            ArrayList arrayList3 = new ArrayList(v75.o(list2, 10));
            for (n54 n54Var : list2) {
                arrayList3.add(new cz3(n54Var.a, n54Var.b));
            }
            b2.addAll(intValue, arrayList3);
        }
        return t75.a(b2);
    }

    public static final Bitmap M(Drawable drawable, int i2, int i3, Bitmap.Config config) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() == null) {
                xq0.x("bitmap is null");
                return null;
            }
            if (config == null || bitmapDrawable.getBitmap().getConfig() == config) {
                return (i2 == bitmapDrawable.getBitmap().getWidth() && i3 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i2, i3, true);
            }
        }
        Rect bounds = drawable.getBounds();
        int i4 = bounds.left;
        int i5 = bounds.top;
        int i6 = bounds.right;
        int i7 = bounds.bottom;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i3, config);
        drawable.setBounds(0, 0, i2, i3);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i4, i5, i6, i7);
        return createBitmap;
    }

    public static /* synthetic */ Bitmap N(Drawable drawable, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i2 = drawable.getIntrinsicWidth();
        }
        if ((i4 & 2) != 0) {
            i3 = drawable.getIntrinsicHeight();
        }
        return M(drawable, i2, i3, null);
    }

    public static final fav O(n9v n9vVar) {
        n9vVar.getClass();
        if (n9vVar instanceof l9v) {
            return cav.b;
        }
        if (n9vVar.equals(j9v.a)) {
            return bav.b;
        }
        if (n9vVar instanceof i9v) {
            return new eav(((i9v) n9vVar).b);
        }
        if (n9vVar instanceof k9v) {
            k9v k9vVar = (k9v) n9vVar;
            return new dav(k9vVar.a, k9vVar.b);
        }
        if (n9vVar instanceof m9v) {
            return new dav(((m9v) n9vVar).a, f6v.b);
        }
        b6e.s();
        return null;
    }

    public static final void P(View view, al alVar) {
        if (!((Boolean) alVar.invoke(view)).booleanValue() || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i2 = 0;
        while (true) {
            if (!(i2 < viewGroup.getChildCount())) {
                return;
            }
            int i3 = i2 + 1;
            View childAt = viewGroup.getChildAt(i2);
            if (childAt == null) {
                rj7.m();
                return;
            } else {
                P(childAt, alVar);
                i2 = i3;
            }
        }
    }

    public static final Activity Q(Context context) {
        Activity R = R(context);
        if (R != null) {
            return R;
        }
        wvs.g(context, ", possibly app/service context is provided", "no activity context found in ");
        return null;
    }

    public static final Activity R(Context context) {
        context.getClass();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        baseContext.getClass();
        return R(baseContext);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (defpackage.sj2.H(r7, r5, r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        if (defpackage.sj2.H(r6, r5, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object S(Context context, aon aonVar, f9r f9rVar, Continuation continuation) {
        qkd qkdVar;
        int i2;
        if (continuation instanceof qkd) {
            qkdVar = (qkd) continuation;
            int i3 = qkdVar.m;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qkdVar.m = i3 - Integer.MIN_VALUE;
                Object obj = qkdVar.l;
                nm6 nm6Var = nm6.a;
                i2 = qkdVar.m;
                if (i2 != 0) {
                    qgg.h0(obj);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext == null) {
                        applicationContext = context;
                    }
                    if (applicationContext.getSystemService(AppWidgetManager.class) == null) {
                        return Unit.a;
                    }
                    qkdVar.j = context;
                    qkdVar.k = f9rVar;
                    qkdVar.m = 1;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f9rVar = qkdVar.k;
                    context = qkdVar.j;
                    qgg.h0(obj);
                }
                qkdVar.j = null;
                qkdVar.k = null;
                qkdVar.m = 2;
            }
        }
        qkdVar = new qkd(continuation);
        Object obj2 = qkdVar.l;
        nm6 nm6Var2 = nm6.a;
        i2 = qkdVar.m;
        if (i2 != 0) {
        }
        qkdVar.j = null;
        qkdVar.k = null;
        qkdVar.m = 2;
    }

    public static m2 T(yse yseVar) {
        bte bteVar = yseVar.b;
        List list = yseVar.a;
        Integer num = bteVar.a;
        boolean z = num != null;
        boolean isEmpty = list.isEmpty();
        AbValidationType abValidationType = AbValidationType.Experiment;
        return (z || !isEmpty) ? (z || isEmpty) ? (!z || CollectionsKt.I(list, num)) ? new l2(abValidationType) : new i2(abValidationType) : new c2(abValidationType) : new f2(abValidationType);
    }

    public static m2 U(yse yseVar) {
        bte bteVar = yseVar.b;
        List list = yseVar.a;
        Integer num = bteVar.b;
        boolean z = num != null;
        boolean isEmpty = list.isEmpty();
        AbValidationType abValidationType = AbValidationType.FeatureToggle;
        return (z || !isEmpty) ? (z || isEmpty) ? (!z || CollectionsKt.I(list, num)) ? new l2(abValidationType) : new i2(abValidationType) : new c2(abValidationType) : new f2(abValidationType);
    }

    public static final a63 V(cvo cvoVar, thj thjVar) {
        cvoVar.getClass();
        return new a63(new x43(cvoVar, 1, 4), thjVar);
    }

    public static fk0 a(float f2) {
        return new fk0(Float.valueOf(f2), azt.a, Float.valueOf(0.01f), 8);
    }

    public static final void b(nnk nnkVar, Function0 function0, yci yciVar, long j2, hq5 hq5Var, int i2) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(339810469);
        int i3 = i2 | (oq5Var.h(nnkVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if ((i3 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
        } else {
            oq5Var.U();
            if ((i2 & 1) != 0 && !oq5Var.y()) {
                oq5Var.S();
            }
            oq5Var.q();
            eul eulVar = (eul) nnkVar.b;
            int i4 = i3 >> 3;
            ngg.i(function0, yciVar, ild.C(335166695, new q2(9, eulVar), oq5Var), false, j2, null, null, 0.0f, null, ild.C(-1804275008, new a3(18, eulVar, nnkVar), oq5Var), oq5Var, (i4 & 112) | (i4 & 14) | 805306752 | 24576, 488);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new df1(nnkVar, function0, yciVar, j2, i2, 0);
        }
    }

    public static final void c(ukd ukdVar, f40 f40Var, wn5 wn5Var, hq5 hq5Var, int i2, int i3) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1959221577);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(ukdVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= oq5Var.f(f40Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.f(wn5Var) ? 256 : 128;
        }
        if ((i4 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
        } else {
            if (i5 != 0) {
                f40Var = f40.c;
            }
            sg3 sg3Var = sg3.a;
            oq5Var.a0(578571862);
            int i6 = i4 & 896;
            oq5Var.a0(-548224868);
            if (!(oq5Var.a instanceof mw0)) {
                lxe.v();
                throw null;
            }
            oq5Var.X();
            if (oq5Var.O) {
                oq5Var.k(sg3Var);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, ukdVar, af0.K);
            g0g.U(oq5Var, f40Var, af0.L);
            wn5Var.invoke(oq5Var, Integer.valueOf((i6 >> 6) & 14));
            oq5Var.p(true);
            oq5Var.p(false);
            oq5Var.p(false);
        }
        f40 f40Var2 = f40Var;
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new rj0(ukdVar, f40Var2, wn5Var, i2, i3, 1);
        }
    }

    public static final void d(b04 b04Var, p21 p21Var, hq5 hq5Var, int i2) {
        List list;
        b04Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(440208328);
        int i3 = (oq5Var.h(b04Var) ? 4 : 2) | i2 | (oq5Var.d(p21Var.ordinal()) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            n04 n04Var = (n04) gld.O(b04Var.f, oq5Var).getValue();
            if (n04Var instanceof m04) {
                oq5Var.Z(1711430551);
                m04 m04Var = (m04) n04Var;
                List list2 = m04Var.b;
                if (p21Var == p21.b && (list = list2) != null && !list.isEmpty()) {
                    oq5Var.Z(2133423146);
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((n54) it.next()).a);
                    }
                    p(b04Var, arrayList, oq5Var, i3 & 14);
                    oq5Var.p(false);
                } else if (p21Var == p21.c) {
                    oq5Var.Z(1711849299);
                    i(b04Var, L(m04Var), oq5Var, i3 & 14);
                    oq5Var.p(false);
                } else {
                    oq5Var.Z(2133438041);
                    n(b04Var, L(m04Var), oq5Var, i3 & 14);
                    oq5Var.p(false);
                }
                oq5Var.p(false);
            } else if (n04Var instanceof l04) {
                oq5Var.Z(1712319910);
                int ordinal = p21Var.ordinal();
                if (ordinal == 0) {
                    oq5Var.Z(2133464291);
                    m(((l04) n04Var).a, 0, oq5Var);
                    oq5Var.p(false);
                } else if (ordinal == 1) {
                    oq5Var.Z(2133448960);
                    o(((l04) n04Var).a, 0, oq5Var);
                    oq5Var.p(false);
                } else {
                    if (ordinal != 2) {
                        throw vz1.i(oq5Var, 2133446108, false);
                    }
                    oq5Var.Z(1712616053);
                    g(((l04) n04Var).a, 0, oq5Var);
                    oq5Var.p(false);
                }
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(n04Var, k04.a)) {
                    throw vz1.i(oq5Var, 2133414553, false);
                }
                oq5Var.Z(1713101110);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new m32(b04Var, p21Var, i2, 14);
        }
    }

    public static final void e(mn0 mn0Var, yci yciVar, ges gesVar, boolean z, int i2, int i3, Function1 function1, Function1 function12, hq5 hq5Var, int i4) {
        int i5;
        oq5 oq5Var;
        boolean z2;
        int i6;
        int i7;
        Function1 function13;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-246609449);
        if ((i4 & 6) == 0) {
            i5 = (oq5Var2.f(mn0Var) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= oq5Var2.f(yciVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= oq5Var2.f(gesVar) ? 256 : 128;
        }
        int i8 = i5 | 1797120;
        if ((12582912 & i4) == 0) {
            i8 |= oq5Var2.h(function12) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        if (oq5Var2.P(i8 & 1, (4793491 & i8) != 4793490)) {
            gx3 gx3Var = gx3.E;
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = szf.g0(null);
                oq5Var2.k0(K);
            }
            aqi aqiVar = (aqi) K;
            boolean z3 = (29360128 & i8) == 8388608;
            Object K2 = oq5Var2.K();
            if (z3 || K2 == kjnVar) {
                K2 = new pn4(aqiVar, function12);
                oq5Var2.k0(K2);
            }
            yci f2 = yciVar.f(eur.a(vci.a, function12, (PointerInputEventHandler) K2));
            boolean z4 = (i8 & 3670016) == 1048576;
            Object K3 = oq5Var2.K();
            if (z4 || K3 == kjnVar) {
                K3 = new kf0(aqiVar, 3);
                oq5Var2.k0(K3);
            }
            oq5Var = oq5Var2;
            j66.e(mn0Var, f2, gesVar, (Function1) K3, 1, true, Integer.MAX_VALUE, 0, null, null, oq5Var, (58254 & i8) | (458752 & (i8 << 6)) | ((i8 << 3) & 3670016), ScreenMirroringConfig.Video.DEFAULT_WIDTH);
            function13 = gx3Var;
            i6 = 1;
            z2 = true;
            i7 = Integer.MAX_VALUE;
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
            z2 = z;
            i6 = i2;
            i7 = i3;
            function13 = function1;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new on4(mn0Var, yciVar, gesVar, z2, i6, i7, function13, function12, i4);
        }
    }

    public static final void f(vuf vufVar, final lvf lvfVar, final c26 c26Var, final xqc xqcVar, final int i2) {
        vufVar.getClass();
        lvfVar.getClass();
        c26Var.getClass();
        if (lvfVar.d() != 0) {
            vuf.Y(vufVar, null, xp3.b, 3);
        }
        List<hqd> c2 = t75.c(new hqd(new iqd(lvfVar), xqcVar.a, xqcVar.c, xqcVar.b));
        final wn5 wn5Var = new wn5(new uyc() { // from class: t06
            @Override // defpackage.uyc
            public final Object b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                Object obj7;
                final s06 s06Var = (s06) obj2;
                final int intValue = ((Integer) obj3).intValue();
                final int intValue2 = ((Integer) obj4).intValue();
                hq5 hq5Var = (hq5) obj5;
                int intValue3 = ((Integer) obj6).intValue();
                ((dh3) obj).getClass();
                if (s06Var != null) {
                    oq5 oq5Var = (oq5) hq5Var;
                    oq5Var.Z(-368432146);
                    ct5 ct5Var = s06Var.b;
                    final c26 c26Var2 = c26.this;
                    int i3 = (intValue3 & 896) ^ 384;
                    boolean h2 = oq5Var.h(c26Var2) | oq5Var.h(s06Var) | ((i3 > 256 && oq5Var.d(intValue)) || (intValue3 & 384) == 256);
                    int i4 = (intValue3 & 7168) ^ 3072;
                    boolean z = (i4 > 2048 && oq5Var.d(intValue2)) || (intValue3 & 3072) == 2048;
                    final xqc xqcVar2 = xqcVar;
                    boolean f2 = h2 | z | oq5Var.f(xqcVar2);
                    final int i5 = i2;
                    boolean d2 = f2 | oq5Var.d(i5);
                    Object K = oq5Var.K();
                    kjn kjnVar = gq5.a;
                    if (d2 || K == kjnVar) {
                        obj7 = new Function0() { // from class: u06
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                h06 h06Var = s06Var.a;
                                int i6 = xqcVar2.a;
                                int i7 = intValue2;
                                int i8 = intValue;
                                c26.this.n(h06Var, new spd(i8, i7, (i6 * i7) + i8), i5);
                                return Unit.a;
                            }
                        };
                        oq5Var.k0(obj7);
                    } else {
                        obj7 = K;
                    }
                    Function0 function0 = (Function0) obj7;
                    boolean b2 = c26Var2.b();
                    yci c3 = d.c(vci.a, 1.0f);
                    boolean h3 = oq5Var.h(c26Var2) | oq5Var.h(s06Var) | ((i3 > 256 && oq5Var.d(intValue)) || (intValue3 & 384) == 256) | ((i4 > 2048 && oq5Var.d(intValue2)) || (intValue3 & 3072) == 2048) | oq5Var.f(xqcVar2);
                    lvf lvfVar2 = lvfVar;
                    boolean h4 = h3 | oq5Var.h(lvfVar2) | oq5Var.d(i5);
                    Object K2 = oq5Var.K();
                    if (h4 || K2 == kjnVar) {
                        xj xjVar = new xj(c26Var2, s06Var, intValue, intValue2, xqcVar2, lvfVar2, i5);
                        oq5Var.k0(xjVar);
                        K2 = xjVar;
                    }
                    qwp.i(ct5Var, function0, b2, a.b(c3, null, 0L, 0.0f, null, (Function2) K2, 15), oq5Var, 8);
                    oq5Var.p(false);
                } else {
                    if (s06Var != null) {
                        throw vz1.i((oq5) hq5Var, -11886987, false);
                    }
                    oq5 oq5Var2 = (oq5) hq5Var;
                    oq5Var2.Z(-366682661);
                    oq5Var2.p(false);
                }
                return Unit.a;
            }
        }, 621215987, true);
        c2.getClass();
        for (hqd hqdVar : c2) {
            final lvf lvfVar2 = hqdVar.a.a;
            final int i3 = hqdVar.b;
            final q0k q0kVar = hqdVar.d;
            final mx0 mx0Var = hqdVar.c;
            lvfVar2.getClass();
            mx0Var.getClass();
            final int d2 = lvfVar2.d();
            vufVar.Z(d2 == 0 ? 0 : ouj.b(d2, 1, i3, 1), null, vsf.v, new wn5(new ryc() { // from class: m26
                @Override // defpackage.ryc
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    Integer num = (Integer) obj2;
                    int intValue = num.intValue();
                    hq5 hq5Var = (hq5) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    ((androidx.compose.foundation.lazy.a) obj).getClass();
                    if ((intValue2 & 48) == 0) {
                        intValue2 |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
                    }
                    int i4 = intValue2;
                    if ((i4 & 145) == 144) {
                        oq5 oq5Var = (oq5) hq5Var;
                        if (oq5Var.z()) {
                            oq5Var.S();
                            return Unit.a;
                        }
                    }
                    yci l2 = androidx.compose.foundation.layout.a.l(vci.a, q0k.this);
                    nho a2 = lho.a(mx0Var, b2c.k, hq5Var, 0);
                    oq5 oq5Var2 = (oq5) hq5Var;
                    int i5 = oq5Var2.P;
                    androidx.compose.runtime.internal.a l3 = oq5Var2.l();
                    yci H = vnj.H(hq5Var, l2);
                    xp5.T.getClass();
                    grb grbVar = wp5.b;
                    oq5Var2.d0();
                    if (oq5Var2.O) {
                        oq5Var2.k(grbVar);
                    } else {
                        oq5Var2.n0();
                    }
                    g0g.U(hq5Var, a2, wp5.f);
                    g0g.U(hq5Var, l3, wp5.e);
                    kb5 kb5Var = wp5.g;
                    if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                        ouj.x(i5, oq5Var2, i5, kb5Var);
                    }
                    g0g.U(hq5Var, H, wp5.d);
                    oq5Var2.Z(694511836);
                    int i6 = 0;
                    while (true) {
                        int i7 = i3;
                        if (i6 >= i7) {
                            break;
                        }
                        int i8 = (i7 * intValue) + i6;
                        if (i8 < d2) {
                            oq5Var2.Z(55176293);
                            Object c3 = lvfVar2.c(i8);
                            oq5Var2.W(694518817, Integer.valueOf(i8));
                            if (1.0f <= 0.0d) {
                                qme.a("invalid weight; must be greater than zero");
                            }
                            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f);
                            kfh d3 = ug3.d(b2c.b, true);
                            int i9 = oq5Var2.P;
                            androidx.compose.runtime.internal.a l4 = oq5Var2.l();
                            yci H2 = vnj.H(hq5Var, layoutWeightElement);
                            xp5.T.getClass();
                            grb grbVar2 = wp5.b;
                            oq5Var2.d0();
                            if (oq5Var2.O) {
                                oq5Var2.k(grbVar2);
                            } else {
                                oq5Var2.n0();
                            }
                            g0g.U(hq5Var, d3, wp5.f);
                            g0g.U(hq5Var, l4, wp5.e);
                            kb5 kb5Var2 = wp5.g;
                            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i9))) {
                                ouj.x(i9, oq5Var2, i9, kb5Var2);
                            }
                            g0g.U(hq5Var, H2, wp5.d);
                            wn5Var.b(b.a, c3, Integer.valueOf(i6), num, hq5Var, Integer.valueOf(6 | ((i4 << 6) & 7168)));
                            f1d.u(oq5Var2, true, false, false);
                        } else {
                            oq5Var2.Z(55810336);
                            if (1.0f <= 0.0d) {
                                qme.a("invalid weight; must be greater than zero");
                            }
                            u1g.l(hq5Var, new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f));
                            oq5Var2.p(false);
                        }
                        i6++;
                    }
                    oq5Var2.p(false);
                    oq5Var2.p(true);
                    return Unit.a;
                }
            }, -1853614674, true));
        }
    }

    public static final void g(int i2, int i3, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(22669978);
        int i4 = (oq5Var.d(i2) ? 4 : 2) | i3 | (oq5Var.g(true) ? 32 : 16);
        if (oq5Var.P(i4 & 1, (i4 & 19) != 18)) {
            int i5 = i2 <= 1 ? 1 : 2;
            ArrayList arrayList = new ArrayList(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                arrayList.add(Unit.a);
            }
            float f2 = 16;
            hld.l(arrayList, d.d(vci.a, 1.0f), null, 0.0f, f2, f2, 0.0f, null, 0, false, false, false, ild.C(-814105678, new rz3(0), oq5Var), oq5Var, 221232, 438, 972);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new mz3(i2, i3, 1);
        }
    }

    public static final void h(b04 b04Var, dz3 dz3Var, int i2, Function0 function0, yci yciVar, Function0 function02, hq5 hq5Var, int i3) {
        int i4;
        grb grbVar;
        kb5 kb5Var;
        kjn kjnVar;
        int i5;
        vci vciVar;
        oq5 oq5Var;
        int i6;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-288165578);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var2.h(b04Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= (i3 & 64) == 0 ? oq5Var2.f(dz3Var) : oq5Var2.h(dz3Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var2.d(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var2.h(function0) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= oq5Var2.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i3) == 0) {
            i4 |= oq5Var2.h(function02) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if (oq5Var2.P(i4 & 1, (74899 & i4) != 74898)) {
            hz2 hz2Var = b2c.l;
            x2i x2iVar = qx0.a;
            nho a2 = lho.a(x2iVar, hz2Var, oq5Var2, 48);
            int i7 = oq5Var2.P;
            androidx.compose.runtime.internal.a l2 = oq5Var2.l();
            yci H = vnj.H(oq5Var2, yciVar);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar2);
            } else {
                oq5Var2.n0();
            }
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var2, a2, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var2, l2, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i7))) {
                ouj.x(i7, oq5Var2, i7, kb5Var4);
            }
            kb5 kb5Var5 = wp5.d;
            g0g.U(oq5Var2, H, kb5Var5);
            q91 c2 = dz3Var.c();
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            int i8 = i4 >> 3;
            wct.a(c2, function0, new LayoutWeightElement(true, 1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f), false, function02, oq5Var2, ((i4 >> 6) & 112) | (i8 & 57344), 8);
            if (1.3f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.3f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.3f);
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i9 = oq5Var2.P;
            androidx.compose.runtime.internal.a l3 = oq5Var2.l();
            yci H2 = vnj.H(oq5Var2, layoutWeightElement);
            oq5Var2.d0();
            if (oq5Var2.O) {
                grbVar = grbVar2;
                oq5Var2.k(grbVar);
            } else {
                grbVar = grbVar2;
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a3, kb5Var2);
            g0g.U(oq5Var2, l3, kb5Var3);
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i9))) {
                kb5Var = kb5Var4;
                ouj.x(i9, oq5Var2, i9, kb5Var);
            } else {
                kb5Var = kb5Var4;
            }
            g0g.U(oq5Var2, H2, kb5Var5);
            int t = dz3Var.t();
            kjn kjnVar2 = gq5.a;
            vci vciVar2 = vci.a;
            if (t > 0) {
                oq5Var2.Z(1581831814);
                float f2 = 8;
                float f3 = 4;
                yci q2 = androidx.compose.foundation.layout.a.q(vciVar2, f2, 0.0f, 0.0f, f3, 6);
                boolean h2 = oq5Var2.h(b04Var) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && oq5Var2.h(dz3Var))) | ((i4 & 896) == 256);
                Object K = oq5Var2.K();
                if (h2 || K == kjnVar2) {
                    K = new oz3(b04Var, dz3Var, i2, 4);
                    oq5Var2.k0(K);
                }
                yci d2 = d.d(androidx.compose.foundation.layout.a.p(androidx.compose.foundation.a.e(q2, false, null, null, (Function0) K, 7), f2, f2, f3, f2), 1.0f);
                nho a4 = lho.a(x2iVar, hz2Var, oq5Var2, 48);
                int i10 = oq5Var2.P;
                androidx.compose.runtime.internal.a l4 = oq5Var2.l();
                yci H3 = vnj.H(oq5Var2, d2);
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, a4, kb5Var2);
                g0g.U(oq5Var2, l4, kb5Var3);
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i10))) {
                    ouj.x(i10, oq5Var2, i10, kb5Var);
                }
                g0g.U(oq5Var2, H3, kb5Var5);
                kjnVar = kjnVar2;
                irf.r(a0g.E(2131231330, 0, oq5Var2), null, d.m(vciVar2, 52), null, null, 0.0f, null, oq5Var2, 432, 120);
                xv7.j(rvf.H(R.plurals.collection_artist_liked_tracks, dz3Var.t(), new Object[]{Integer.valueOf(dz3Var.t())}, oq5Var2), androidx.compose.foundation.layout.a.q(vciVar2, f2, 0.0f, 0.0f, 0.0f, 14), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 0, false, 2, 0, null, nu0.j(), oq5Var2, 48, 3072, 57336);
                oq5Var = oq5Var2;
                oq5Var.p(true);
                oq5Var.p(false);
                vciVar = vciVar2;
                i5 = i4;
            } else {
                kjnVar = kjnVar2;
                oq5Var2.Z(1583134403);
                float f4 = 8;
                float f5 = 4;
                yci q3 = androidx.compose.foundation.layout.a.q(vciVar2, f4, 0.0f, 0.0f, f5, 6);
                i5 = i4;
                boolean h3 = ((i4 & 896) == 256) | oq5Var2.h(b04Var) | ((i4 & 112) == 32 || ((i4 & 64) != 0 && oq5Var2.h(dz3Var)));
                Object K2 = oq5Var2.K();
                if (h3 || K2 == kjnVar) {
                    K2 = new oz3(b04Var, dz3Var, i2, 5);
                    oq5Var2.k0(K2);
                }
                yci d3 = d.d(androidx.compose.foundation.layout.a.p(androidx.compose.foundation.a.e(q3, false, null, null, (Function0) K2, 7), f4, f4, f5, f4), 1.0f);
                nho a5 = lho.a(x2iVar, hz2Var, oq5Var2, 48);
                int i11 = oq5Var2.P;
                androidx.compose.runtime.internal.a l5 = oq5Var2.l();
                yci H4 = vnj.H(oq5Var2, d3);
                oq5Var2.d0();
                if (oq5Var2.O) {
                    oq5Var2.k(grbVar);
                } else {
                    oq5Var2.n0();
                }
                g0g.U(oq5Var2, a5, kb5Var2);
                g0g.U(oq5Var2, l5, kb5Var3);
                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i11))) {
                    ouj.x(i11, oq5Var2, i11, kb5Var);
                }
                g0g.U(oq5Var2, H4, kb5Var5);
                vciVar = vciVar2;
                irf.r(a0g.E(2131231331, 0, oq5Var2), null, d.m(vciVar2, 52), null, null, 0.0f, null, oq5Var2, 432, 120);
                xv7.j(rvf.M(R.string.collection_artist_top_tracks, oq5Var2), androidx.compose.foundation.layout.a.q(vciVar, f4, 0.0f, 0.0f, 0.0f, 14), ((dq0) oq5Var2.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 0, false, 2, 0, null, nu0.j(), oq5Var2, 48, 3072, 57336);
                oq5Var = oq5Var2;
                oq5Var.p(true);
                oq5Var.p(false);
            }
            euu euuVar = new euu(rvf.M(R.string.collection_artist_wave, oq5Var), null, "android.resource://ru.yandex.music/drawable/ic_artist_wave", d85.n);
            e9g e9gVar = e9g.b;
            u51 d4 = dz3Var.d();
            int i12 = (i8 & 112) | ((i5 << 6) & 896);
            b04Var.getClass();
            d4.getClass();
            StationId b2 = StationId.b(d4.a);
            b2.getClass();
            List E = c9g.E(b2);
            dxl dxlVar = new dxl();
            kxi kxiVar = b04Var.a;
            k6l k6lVar = b04Var.c;
            uwu uwuVar = b04Var.d;
            qwu qwuVar = b04Var.e;
            boolean h4 = oq5Var.h(b04Var) | oq5Var.h(d4) | ((((i12 & 112) ^ 48) > 32 && oq5Var.d(i2)) || (i12 & 48) == 32);
            Object K3 = oq5Var.K();
            if (h4 || K3 == kjnVar) {
                i6 = 4;
                K3 = new de(b04Var, d4, i2, i6);
                oq5Var.k0(K3);
            } else {
                i6 = 4;
            }
            oq5 oq5Var3 = oq5Var;
            float f6 = 8;
            float f7 = i6;
            fxf.p(euuVar, wyf.Y(b2, E, kxiVar, (Function0) K3, k6lVar, uwuVar, qwuVar, dxlVar, null, null, oq5Var3, 6, 0, 768), d.d(androidx.compose.foundation.layout.a.q(vciVar, f6, f7, 0.0f, 0.0f, 12), 1.0f), new q0k(f6, f6, f7, f6), false, e9gVar, oq5Var3, 221568, 0);
            oq5Var2 = oq5Var3;
            oq5Var2.p(true);
            oq5Var2.p(true);
        } else {
            oq5Var2.S();
        }
        xmn r2 = oq5Var2.r();
        if (r2 != null) {
            r2.d = new cj(b04Var, dz3Var, i2, function0, yciVar, function02, i3);
        }
    }

    public static final void i(b04 b04Var, List list, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1491012882);
        int i3 = i2 | (oq5Var.h(b04Var) ? 4 : 2) | (oq5Var.f(list) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            float f2 = 16;
            hld.l(list, androidx.compose.ui.platform.a.a(d.d(vci.a, 1.0f), "collection_artists_block"), null, 0.0f, f2, f2, 0.0f, null, 0, false, false, false, ild.C(978823853, new lz3(b04Var, 2), oq5Var), oq5Var, ((i3 >> 3) & 14) | 221232, 390, 3020);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new qz3(b04Var, list, i2, 1);
        }
    }

    public static final void j(yci yciVar, mx0 mx0Var, ox0 ox0Var, int i2, pnc pncVar, wn5 wn5Var, hq5 hq5Var, int i3) {
        int i4;
        pnc pncVar2;
        hz2 hz2Var = b2c.k;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-218661582);
        if ((i3 & 6) == 0) {
            i4 = (oq5Var.f(yciVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= oq5Var.f(mx0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= oq5Var.f(ox0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= oq5Var.f(hz2Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= oq5Var.d(i2) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i3) == 0) {
            i4 |= oq5Var.d(Integer.MAX_VALUE) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((1572864 & i3) == 0) {
            pncVar2 = pncVar;
            i4 |= oq5Var.f(pncVar2) ? 1048576 : 524288;
        } else {
            pncVar2 = pncVar;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= oq5Var.h(wn5Var) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
        }
        int i5 = i4;
        if (oq5Var.P(i5 & 1, (i5 & 4793491) != 4793490)) {
            int i6 = i5 & 3670016;
            boolean z = i6 == 1048576;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (z || K == kjnVar) {
                pncVar2.getClass();
                tmc tmcVar = tmc.a;
                K = new ymc();
                oq5Var.k0(K);
            }
            ymc ymcVar = (ymc) K;
            int i7 = i5 >> 3;
            boolean f2 = ((((57344 & i7) ^ 24576) > 16384 && oq5Var.d(Integer.MAX_VALUE)) || (i7 & 24576) == 16384) | ((((i7 & 14) ^ 6) > 4 && oq5Var.f(mx0Var)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && oq5Var.f(ox0Var)) || (i7 & 48) == 32) | ((((i7 & 896) ^ 384) > 256 && oq5Var.f(hz2Var)) || (i7 & 384) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && oq5Var.d(i2)) || (i7 & 3072) == 2048) | oq5Var.f(ymcVar);
            Object K2 = oq5Var.K();
            if (f2 || K2 == kjnVar) {
                gnc gncVar = new gnc(mx0Var, ox0Var, mx0Var.o(), new hu6(hz2Var), ox0Var.o(), i2, ymcVar);
                oq5Var.k0(gncVar);
                K2 = gncVar;
            }
            gnc gncVar2 = (gnc) K2;
            boolean z2 = (i6 == 1048576) | ((i5 & 29360128) == 8388608) | ((i5 & 458752) == 131072);
            Object K3 = oq5Var.K();
            Object obj = K3;
            if (z2 || K3 == kjnVar) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new wn5(new pp0(wn5Var, 1), 702094978, true));
                pncVar.getClass();
                tmc tmcVar2 = tmc.a;
                oq5Var.k0(arrayList);
                obj = arrayList;
            }
            wn5 o2 = ghh.o((List) obj);
            boolean f3 = oq5Var.f(gncVar2);
            Object K4 = oq5Var.K();
            if (f3 || K4 == kjnVar) {
                K4 = new hgi(gncVar2);
                oq5Var.k0(K4);
            }
            kfh kfhVar = (kfh) K4;
            int i8 = oq5Var.P;
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
            g0g.U(oq5Var, kfhVar, wp5.f);
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            eta.l(0, o2, oq5Var, true);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new sj0(yciVar, mx0Var, ox0Var, i2, pncVar, wn5Var, i3);
        }
    }

    public static final void k(yci yciVar, mx0 mx0Var, ox0 ox0Var, hz2 hz2Var, int i2, int i3, wn5 wn5Var, hq5 hq5Var, int i4) {
        hz2 hz2Var2;
        int i5;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2070229740);
        int i6 = i4 | (oq5Var.f(yciVar) ? 4 : 2) | (oq5Var.f(mx0Var) ? 32 : 16) | (oq5Var.f(ox0Var) ? 256 : 128) | 3072 | (oq5Var.d(i2) ? 16384 : RemoteCameraConfig.Notification.ID) | 196608;
        if (oq5Var.P(i6 & 1, (599187 & i6) != 599186)) {
            hz2Var2 = b2c.k;
            j(yciVar, mx0Var, ox0Var, i2, pnc.a, wn5Var, oq5Var, (i6 & 57344) | (i6 & 14) | ScreenMirroringConfig.Video.BITRATE_1_5MB | (i6 & 112) | (i6 & 896) | 3072 | 12779520);
            i5 = Integer.MAX_VALUE;
        } else {
            oq5Var.S();
            hz2Var2 = hz2Var;
            i5 = i3;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new sj0(yciVar, mx0Var, ox0Var, hz2Var2, i2, i5, wn5Var, i4);
        }
    }

    public static final void l(ArrayList arrayList, aff affVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        affVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1905799712);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(affVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.f(fvfVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var.f(o0kVar) ? 2048 : 1024;
        }
        if (oq5Var.P(i3 & 1, (i3 & 1171) != 1170)) {
            c3x.t(fvfVar, arrayList, oq5Var, ((i3 >> 6) & 14) | ((i3 << 3) & 112));
            vm C = ghh.C(o0kVar, androidx.compose.foundation.layout.a.c(0.0f, 24, 0.0f, 16, 5));
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "collection_kids_playlists_lazy_column");
            boolean h2 = oq5Var.h(arrayList) | oq5Var.h(affVar);
            Object K = oq5Var.K();
            if (h2 || K == gq5.a) {
                K = new dae(7, arrayList, affVar);
                oq5Var.k0(K);
            }
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i3 >> 3) & 112) | 6, 504);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new wda(i2, 15, arrayList, affVar, fvfVar, o0kVar);
        }
    }

    public static final void m(int i2, int i3, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(522046593);
        int i4 = (oq5Var.d(i2) ? 4 : 2) | i3 | (oq5Var.g(true) ? 32 : 16);
        if (oq5Var.P(i4 & 1, (i4 & 19) != 18)) {
            ArrayList arrayList = new ArrayList(i2);
            for (int i5 = 0; i5 < i2; i5++) {
                arrayList.add(Unit.a);
            }
            up6.j(arrayList, d.d(vci.a, 1.0f), null, 0.0f, 0.0f, null, null, false, 0, ild.C(357205595, new h3(4), oq5Var), oq5Var, 48, 1020);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new mz3(i2, i3, 0);
        }
    }

    public static final void n(b04 b04Var, List list, hq5 hq5Var, int i2) {
        oq5 oq5Var;
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-2128555079);
        int i3 = (oq5Var2.h(b04Var) ? 4 : 2) | i2 | (oq5Var2.f(list) ? 32 : 16);
        if (oq5Var2.P(i3 & 1, (i3 & 19) != 18)) {
            oq5Var = oq5Var2;
            up6.i(CollectionsKt.q0(list, 8), androidx.compose.ui.platform.a.a(d.d(vci.a, 1.0f), "collection_artists_block"), null, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(228345297, new lz3(b04Var, 1), oq5Var2), oq5Var, 48, 384, 4092);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new qz3(b04Var, list, i2, 0);
        }
    }

    public static final void o(int i2, int i3, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-450941926);
        int i4 = (oq5Var.d(i2) ? 4 : 2) | i3 | (oq5Var.g(true) ? 32 : 16);
        if (oq5Var.P(i4 & 1, (i4 & 19) != 18)) {
            ArrayList arrayList = new ArrayList(i2);
            for (int i5 = 0; i5 < i2; i5++) {
                arrayList.add(Unit.a);
            }
            up6.j(arrayList, d.d(vci.a, 1.0f), null, 0.0f, 0.0f, null, null, false, 0, ild.C(-887205760, new h3(5), oq5Var), oq5Var, 48, 1020);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new mz3(i2, i3, 2);
        }
    }

    public static final void p(b04 b04Var, ArrayList arrayList, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1308417810);
        int i3 = i2 | (oq5Var.h(b04Var) ? 4 : 2) | (oq5Var.h(arrayList) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            up6.i(arrayList, androidx.compose.ui.platform.a.a(d.d(vci.a, 1.0f), "collection_artists_block"), null, null, 0.0f, 0.0f, 0.0f, null, null, null, false, 0, ild.C(712898170, new lz3(b04Var, 0), oq5Var), oq5Var, ((i3 >> 3) & 14) | 48, 384, 4092);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new m32(b04Var, arrayList, i2, 13);
        }
    }

    public static final void q(SpannableStringBuilder spannableStringBuilder, Context context) {
        l18 l18Var = l18.b;
        bdt I = hag.I(prn.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        rrn rrnVar = (rrn) ((prn) qdcVar.C(I));
        b6d b6dVar = (b6d) rrnVar.c.getValue();
        b6d b6dVar2 = (b6d) rrnVar.c.getValue();
        b6dVar2.getClass();
        String str = b6dVar2.a;
        str.getClass();
        Drawable drawable = context.getDrawable(str.equalsIgnoreCase("BY") ? R.drawable.ic_explicit_age_16 : R.drawable.ic_explicit_16);
        if (drawable != null) {
            Resources resources = context.getResources();
            b6dVar.getClass();
            String str2 = b6dVar.a;
            str2.getClass();
            boolean equalsIgnoreCase = str2.equalsIgnoreCase("BY");
            int i2 = R.dimen.juicy_bottom_sheet_explicit_icon_size;
            int dimensionPixelSize = resources.getDimensionPixelSize(equalsIgnoreCase ? R.dimen.juicy_bottom_sheet_explicit_icon_size_18_width : R.dimen.juicy_bottom_sheet_explicit_icon_size);
            Resources resources2 = context.getResources();
            String str3 = b6dVar.a;
            str3.getClass();
            if (str3.equalsIgnoreCase("BY")) {
                i2 = R.dimen.juicy_bottom_sheet_explicit_icon_size_18_height;
            }
            drawable.setBounds(0, 0, dimensionPixelSize, resources2.getDimensionPixelSize(i2));
            drawable.setTint(weo.M(context, android.R.attr.textColorPrimary));
            spannableStringBuilder.append("  ");
            ImageSpan imageSpan = new ImageSpan(drawable, 1);
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) etn.J(context, R.string.explicit_element_content_description));
            spannableStringBuilder.setSpan(imageSpan, length, spannableStringBuilder.length(), 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(ViewGroup viewGroup, boolean z) {
        f29 f29Var = viewGroup instanceof f29 ? (f29) viewGroup : null;
        if (f29Var != null) {
            f29Var.setNeedClipping(z);
        }
        ViewParent parent = viewGroup.getParent();
        if (z || !(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).setClipChildren(false);
    }

    public static a63 s(n6v n6vVar, cvo cvoVar) {
        n6vVar.getClass();
        cvoVar.getClass();
        g6v g6vVar = n6vVar.e;
        String str = g6vVar.a;
        String str2 = n6vVar.f;
        pkb n2 = sj2.n(g6vVar, pkb.Link);
        str2.getClass();
        return V(cvoVar, new thj(n2, str, 1, 2, str2));
    }

    public static final o4q t(cu7 cu7Var) {
        List elements = cu7Var.a.getElements();
        if (!(elements instanceof Collection) || !elements.isEmpty()) {
            Iterator it = elements.iterator();
            while (it.hasNext()) {
                if (q7g.G(((naq) ((mwk) it.next())).d) != null) {
                    return o4q.a;
                }
            }
        }
        return o4q.b;
    }

    public static final xqc u(hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        float f2 = ((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
        float f3 = 16;
        nx0 g2 = qx0.g(f3);
        oq5Var.Z(-1799035449);
        Integer num = 2;
        jpd jpdVar = new jpd(160);
        jx7 jx7Var = (jx7) oq5Var.j(es5.h);
        int K = ff7.K(f2 - (2 * f3), oq5Var);
        int K2 = ff7.K(g2.d, oq5Var);
        jx7Var.getClass();
        int size = jpdVar.a(jx7Var, K, K2).size();
        int intValue = num.intValue();
        if (size < intValue) {
            size = intValue;
        }
        oq5Var.p(false);
        return new xqc(size, androidx.compose.foundation.layout.a.c(f3, 0.0f, f3, 28, 2), g2);
    }

    public static final Pair v(cu7 cu7Var, int i2) {
        i0 i0Var;
        egc egcVar = cu7Var.a;
        List list = cu7Var.b;
        boolean z = i2 >= u75.g(egcVar.getElements()) && !list.isEmpty();
        egc egcVar2 = cu7Var.a;
        List h0 = z ? CollectionsKt.h0(egcVar2.getElements(), CollectionsKt.Q(list)) : egcVar2.getElements();
        fyu fyuVar = (fyu) cu7Var.e.getValue();
        if (fyuVar instanceof eyu) {
            Iterable h02 = z ? CollectionsKt.h0(((eyu) fyuVar).a, Integer.valueOf(u75.g(h0))) : ((eyu) fyuVar).a;
            meq k2 = i0.k();
            k2.h(h02);
            i0Var = (i0) k2.b();
        } else {
            if (!Intrinsics.d(fyuVar, dyu.a)) {
                b6e.s();
                return null;
            }
            i0Var = null;
        }
        return new Pair(h0, i0Var);
    }

    public static void w(Context context) {
        if (r == null) {
            jku jkuVar = new jku(context);
            r = jkuVar;
            synchronized (jkuVar.a) {
                jkuVar.g = true;
            }
        }
    }

    public static List x() {
        return u75.h(new wv6("_id", "INTEGER"), new wv6("mAddTracksToPlayerTime", "TEXT"), new wv6("mAlbumID", "TEXT"), new wv6("mAliceSessionId", "TEXT"), new wv6("mAudioAuto", "TEXT"), new wv6("mAudioOutputName", "TEXT"), new wv6("mAudioOutputType", "TEXT"), new wv6("mBlockId", "TEXT"), new wv6("mContext", "TEXT"), new wv6("mContextItem", "TEXT"), new wv6("mDownloadToken", "TEXT"), new wv6("mEndPosition", "REAL"), new wv6("mEntityId", "TEXT"), new wv6("mEventId", "TEXT"), new wv6("mFrom", "TEXT"), new wv6("mGenerativeStreamId", "TEXT"), new wv6("mIsFromCache", "INTEGER"), new wv6("mListenActivity", "TEXT"), new wv6("mMeta", "TEXT"), new wv6("mPlayedTime", "TEXT"), new wv6("mPlaylistId", "TEXT"), new wv6("mRadioSessionId", "TEXT"), new wv6("mRestored", "INTEGER"), new wv6("mStartPosition", "REAL"), new wv6("mTotalPlayedTime", "REAL"), new wv6("mTrackID", "TEXT"), new wv6("mTrackLength", "REAL"), new wv6("mUniquePlayId", "TEXT"), new wv6("mUserID", "TEXT"));
    }

    public static void y(Intent intent) {
        synchronized (q) {
            try {
                if (r != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    r.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void z(ObjectAnimator objectAnimator, gc8 gc8Var, cn8 cn8Var, cd8 cd8Var, xzb xzbVar) {
        tm8 tm8Var;
        um8 um8Var;
        int i2;
        szb szbVar = cd8Var.b;
        if (szbVar == null || (tm8Var = (tm8) szbVar.a(xzbVar)) == null) {
            tm8Var = (tm8) cn8Var.b().a(xzbVar);
        }
        szb szbVar2 = cd8Var.c;
        if (szbVar2 == null) {
            szbVar2 = cn8Var.getDuration();
        }
        objectAnimator.setDuration(((Number) szbVar2.a(xzbVar)).longValue());
        szb szbVar3 = cd8Var.g;
        if (szbVar3 == null) {
            szbVar3 = cn8Var.f();
        }
        objectAnimator.setStartDelay(((Number) szbVar3.a(xzbVar)).longValue());
        szb szbVar4 = cd8Var.e;
        if (szbVar4 == null || (um8Var = (um8) szbVar4.a(xzbVar)) == null) {
            um8Var = (um8) cn8Var.c().a(xzbVar);
        }
        int ordinal = tm8Var.ordinal();
        objectAnimator.setInterpolator((ordinal == 1 || ordinal == 3) ? new fei(3, vq1.Q(um8Var)) : vq1.Q(um8Var));
        lu8 lu8Var = cd8Var.f;
        if (lu8Var == null) {
            lu8Var = cn8Var.a();
        }
        if (lu8Var instanceof ju8) {
            i2 = ((int) ((Number) ((ju8) lu8Var).b.a.a(xzbVar)).longValue()) - 1;
            if (i2 < 0) {
                i2 = 0;
            }
        } else {
            if (!(lu8Var instanceof ku8)) {
                b6e.s();
                return;
            }
            i2 = -1;
        }
        objectAnimator.setRepeatCount(i2);
        int ordinal2 = tm8Var.ordinal();
        objectAnimator.setRepeatMode((ordinal2 == 2 || ordinal2 == 3) ? 2 : 1);
        List e2 = cn8Var.e();
        if (e2 != null) {
            objectAnimator.addListener(new az9(e2, gc8Var, xzbVar, 0));
        }
        List d2 = cn8Var.d();
        if (d2 != null) {
            objectAnimator.addListener(new az9(d2, gc8Var, xzbVar, 1));
        }
    }
}
