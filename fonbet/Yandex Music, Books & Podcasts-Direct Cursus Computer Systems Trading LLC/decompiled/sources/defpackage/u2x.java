package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.screenmirroring.ScreenMirroringConfig;
import io.appmetrica.analytics.BuildConfig;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.KotlinVersion;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.a;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u2x implements ws3 {
    public static final wn5 a = new wn5(new bo5(25), -543024820, false);
    public static final wn5 b = new wn5(new jo5(20), -2125656359, false);
    public static final wn5 c = new wn5(new lo5(7), -1000253562, false);
    public static final wn5 d = new wn5(new lo5(8), -715117659, false);
    public static final wn5 e = new wn5(new jo5(21), 479835234, false);
    public static final wn5 f;
    public static final int[] g;
    public static final long[] h;
    public static final Object[] i;
    public static final jwl j;
    public static Method k = null;
    public static Method l = null;
    public static boolean m = false;
    public static Boolean n = null;
    public static boolean o = false;
    public static Method p = null;
    public static boolean q = false;
    public static Field r;

    static {
        new wn5(new jo5(22), -1353342851, false);
        f = new wn5(new po5(23), 1268004142, false);
        g = new int[0];
        h = new long[0];
        i = new Object[0];
        j = new jwl(4);
    }

    public static boolean A(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = wdu.a;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList2 = vdu.d;
            vdu vduVar = (vdu) view.getTag(R.id.tag_unhandled_key_event_manager);
            WeakReference weakReference = null;
            if (vduVar == null) {
                vduVar = new vdu();
                vduVar.a = null;
                vduVar.b = null;
                vduVar.c = null;
                view.setTag(R.id.tag_unhandled_key_event_manager, vduVar);
            }
            WeakReference weakReference2 = vduVar.c;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                vduVar.c = new WeakReference(keyEvent);
                if (vduVar.b == null) {
                    vduVar.b = new SparseArray();
                }
                SparseArray sparseArray = vduVar.b;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view2 = (View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    l1j.f();
                    return false;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean B(raf rafVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (rafVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return rafVar.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!o) {
                            try {
                                p = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            o = true;
                        }
                        Method method = p;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (wdu.d(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!q) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        r = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    q = true;
                }
                Field field = r;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (wdu.d(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && wdu.d(view, keyEvent)) || rafVar.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static void C(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            mi.k(canvas, z);
            return;
        }
        if (!m) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    k = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    l = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    k = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    l = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = k;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = l;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            m = true;
        }
        if (z) {
            try {
                Method method4 = k;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = l) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static int D(int i2, float f2, int i3) {
        if (i2 == i3 || f2 <= 0.0f) {
            return i2;
        }
        if (f2 >= 1.0f) {
            return i3;
        }
        float f3 = ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f4 = ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f5 = ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f6 = ((i3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f7 = ((i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float f8 = ((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f;
        float l2 = l(f4);
        float l3 = l(f5);
        float l4 = l((i2 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float l5 = l(f7);
        float l6 = l(f8);
        float l7 = l((i3 & KotlinVersion.MAX_COMPONENT_VALUE) / 255.0f);
        float e2 = su4.e(f6, f3, f2, f3);
        float e3 = su4.e(l5, l2, f2, l2);
        float e4 = su4.e(l6, l3, f2, l3);
        float e5 = su4.e(l7, l4, f2, l4);
        float m2 = m(e3) * 255.0f;
        float m3 = m(e4) * 255.0f;
        return Math.round(m(e5) * 255.0f) | (Math.round(m2) << 16) | (Math.round(e2 * 255.0f) << 24) | (Math.round(m3) << 8);
    }

    public static final a E(Executor executor) {
        a aVar;
        aa8 aa8Var = executor instanceof aa8 ? (aa8) executor : null;
        return (aa8Var == null || (aVar = aa8Var.a) == null) ? new uob(executor) : aVar;
    }

    public static int F(JSONObject jSONObject, xzb xzbVar) {
        qc9 qc9Var = u89.f;
        ox8 ox8Var = vct.a;
        szb c2 = e5f.c(qc9Var, jSONObject, "repeat_mode");
        return Intrinsics.d(c2 != null ? (String) c2.a(xzbVar) : null, "reverse") ? 2 : 1;
    }

    public static hyd G(String str, int i2, int i3, int i4) {
        str.getClass();
        int max = Math.max(i2, 1);
        int min = Math.min(i3, 2147483646);
        hyd hydVar = new hyd();
        hydVar.c = true;
        hydVar.a = max;
        hydVar.b = min;
        hydVar.d = i4;
        if (i4 > 1002) {
            Log.e("Histogram", String.format(Locale.US, "Number of buckets was limited to %d instead of requested %d.", Arrays.copyOf(new Object[]{1002, Integer.valueOf(hydVar.d)}, 2)));
            hydVar.c = false;
            hydVar.d = 1002;
        }
        if (hydVar.a > hydVar.b) {
            Log.e("Histogram", "Minimum value is greater than maximum value, they were swaped.");
            hydVar.c = false;
            int i5 = hydVar.a;
            hydVar.a = hydVar.b;
            hydVar.b = i5;
        }
        int i6 = hydVar.d;
        if (i6 < 3) {
            Log.e("Histogram", String.format(Locale.US, "Minimum number of buckets was increased to 3 instead of requested %d.", Arrays.copyOf(new Object[]{Integer.valueOf(i6)}, 1)));
            hydVar.c = false;
            hydVar.d = 3;
        }
        int i7 = (hydVar.b - hydVar.a) + 2;
        if (hydVar.d > i7) {
            Log.e("Histogram", String.format(Locale.US, "Number buckets was limited to %d according to minimum and maximum value.", Arrays.copyOf(new Object[]{Integer.valueOf(i7)}, 1)));
            hydVar.c = false;
            hydVar.d = i7;
        }
        return hydVar;
    }

    public static final boolean H(oq oqVar) {
        oqVar.getClass();
        return z(m20.AudioBook, oqVar.j);
    }

    public static final boolean I(oq oqVar) {
        oqVar.getClass();
        return z(m20.NonMusic, oqVar.j);
    }

    public static final boolean J(oq oqVar) {
        oqVar.getClass();
        return z(m20.Podcast, oqVar.j);
    }

    public static final boolean K(k10 k10Var) {
        k10Var.getClass();
        return z(m20.Podcast, k10Var.b);
    }

    public static final boolean L(Album$AlbumType album$AlbumType) {
        album$AlbumType.getClass();
        return z(m20.Podcast, album$AlbumType.a);
    }

    public static final boolean M(String str) {
        return z(m20.Podcast, str) || z(m20.AudioBook, str);
    }

    public static void N(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static Map O(String str) {
        if (str == null) {
            return new HashMap();
        }
        x0 x0Var = new x0((char) 0, 14);
        ptw ptwVar = new ptw();
        ptwVar.c = 0;
        ptwVar.d = new char[16384];
        ptwVar.k = new StringBuffer();
        ptwVar.a = null;
        x0Var.c = ptwVar;
        x0Var.d = null;
        x0Var.b = 0;
        try {
            try {
                return (Map) x0Var.U(new StringReader(str));
            } catch (IOException e2) {
                throw new f7k(-1, 2, e2);
            }
        } catch (f7k unused) {
            return new HashMap();
        } catch (ClassCastException unused2) {
            return new HashMap();
        }
    }

    public static final int P(double d2) {
        if (d2 >= 0.0d && d2 <= 1.0d) {
            return (int) ((d2 * 255.0f) + 0.5f);
        }
        e7o.e();
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v6, types: [c5b] */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v7, types: [c5b] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final xh6 Q(x63 x63Var) {
        ?? r10;
        List list;
        List list2;
        x63Var.getClass();
        ?? r2 = 0;
        r2 = 0;
        if (!(x63Var instanceof v63)) {
            if (!(x63Var instanceof w63)) {
                b6e.s();
                return null;
            }
            w63 w63Var = (w63) x63Var;
            eul eulVar = w63Var.a;
            String str = eulVar.b;
            String str2 = eulVar.c;
            cuk cukVar = drt.e;
            String str3 = eulVar.a;
            str3.getClass();
            return new uh6(new cvl(str, str2, cuk.B(str3, "", ""), 0, 0, false, 0, 0, 0, 0L, 0L, null, 0L, null, null, null, null, null, 0, null, null, null, false, null, false, null, null, 134217720), w63Var.b);
        }
        v63 v63Var = (v63) x63Var;
        lt ltVar = v63Var.a;
        Integer num = v63Var.c;
        Integer num2 = v63Var.d;
        String str4 = ltVar.a;
        String str5 = ltVar.c;
        String str6 = ltVar.b.a;
        c5b c5bVar = c5b.a;
        gd6 gd6Var = ltVar.f;
        if (gd6Var == null || (list2 = gd6Var.b) == null) {
            r10 = 0;
        } else {
            List list3 = list2;
            r10 = new ArrayList(v75.o(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                r10.add(((h94) it.next()).a);
            }
        }
        if (r10 == 0) {
            r10 = c5b.a;
        }
        Collection collection = (Collection) r10;
        if (gd6Var != null && (list = gd6Var.a) != null) {
            List list4 = list;
            r2 = new ArrayList(v75.o(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                r2.add(((hs5) it2.next()).d());
            }
        }
        if (r2 == 0) {
            r2 = c5b.a;
        }
        return new sh6(new oq(str4, str5, null, false, null, null, ltVar.d, null, str6, null, 0, null, c5bVar, kg5.M(ltVar.e, WebPath$Storage.AVATARS), 0, false, null, null, CollectionsKt.g0(collection, (Iterable) r2), num, num2, null, false, null, 523214268), v63Var.b);
    }

    public static int R(szb szbVar, xzb xzbVar) {
        long longValue = ((Number) szbVar.a(xzbVar)).longValue();
        long j2 = longValue >> 31;
        return (j2 == 0 || j2 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    }

    public static final void a(ua1 ua1Var, ib1 ib1Var, hq5 hq5Var, int i2) {
        ib1Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1043558720);
        int i3 = (oq5Var.f(ua1Var) ? 4 : 2) | i2 | (oq5Var.f(ib1Var) ? 32 : 16);
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            irf.h(rvf.M(R.string.artist_info_links_block_title, oq5Var), androidx.compose.ui.platform.a.a(vci.a, "artist_links_block_title"), null, null, null, false, null, false, null, oq5Var, 48, 508);
            for (w7g w7gVar : ua1Var.a) {
                r7g r7gVar = w7gVar.b;
                Object K = oq5Var.K();
                kjn kjnVar = gq5.a;
                if (K == kjnVar) {
                    K = gld.R(g.a, oq5Var);
                    oq5Var.k0(K);
                }
                mm6 mm6Var = (mm6) K;
                boolean f2 = oq5Var.f(r7gVar);
                Object K2 = oq5Var.K();
                if (f2 || K2 == kjnVar) {
                    K2 = ib1Var.u(r7gVar, mm6Var);
                    oq5Var.k0(K2);
                }
                x7g x7gVar = (x7g) K2;
                long j2 = ((dq0) oq5Var.j(eq0.a)).c.b;
                boolean h2 = oq5Var.h(x7gVar);
                Object K3 = oq5Var.K();
                if (h2 || K3 == kjnVar) {
                    m71 m71Var = new m71(0, x7gVar, x7g.class, "onClick", "onClick()V", 0, 8);
                    oq5Var.k0(m71Var);
                    K3 = m71Var;
                }
                u7g.b((Function0) ((h9f) K3), w7gVar.a, null, j2, oq5Var, 6);
            }
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new a3(ua1Var, ib1Var, i2, 12);
        }
    }

    public static final void b(pw5 pw5Var, yci yciVar, hq5 hq5Var, int i2) {
        int i3;
        pw5Var.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(958523688);
        if ((i2 & 6) == 0) {
            i3 = i2 | (oq5Var.f(pw5Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci a2 = androidx.compose.ui.platform.a.a(ksw.D(yciVar, pw5Var.n, null), "concert_item_column");
            ta5 a3 = sa5.a(qx0.e, b2c.o, oq5Var, 54);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
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
            g0g.U(oq5Var, l2, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            vci vciVar = vci.a;
            yci a4 = androidx.compose.ui.platform.a.a(vciVar, "concert_item_month");
            String str = pw5Var.d;
            ges j2 = nu0.j();
            agr agrVar = eq0.a;
            xcs.b(str, a4, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, j2, oq5Var, 48, 0, 65528);
            xcs.b(pw5Var.e, androidx.compose.ui.platform.a.a(vciVar, "concert_item_day_of_month"), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.d(), oq5Var, 48, 0, 65528);
            xcs.b(pw5Var.f, androidx.compose.ui.platform.a.a(vciVar, "concert_item_day_of_week"), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, nu0.j(), oq5Var, 48, 0, 65528);
            oq5Var = oq5Var;
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new z2(pw5Var, yciVar, i2, 18);
        }
    }

    public static final void c(nw5 nw5Var, yci yciVar, hq5 hq5Var, int i2) {
        nw5 nw5Var2;
        yci yciVar2;
        oq5 oq5Var;
        nw5Var.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-40328016);
        int i3 = (oq5Var2.h(nw5Var) ? 4 : 2) | i2 | (oq5Var2.f(yciVar) ? 32 : 16);
        if ((i3 & 19) == 18 && oq5Var2.z()) {
            oq5Var2.S();
            nw5Var2 = nw5Var;
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
        } else {
            aqi Q = szf.Q(nw5Var.getState(), oq5Var2);
            boolean b2 = nw5Var.b();
            pw5 pw5Var = (pw5) Q.getValue();
            boolean h2 = oq5Var2.h(nw5Var);
            Object K = oq5Var2.K();
            kjn kjnVar = gq5.a;
            if (h2 || K == kjnVar) {
                e65 e65Var = new e65(0, nw5Var, nw5.class, "onClick", "onClick()V", 0, 8);
                oq5Var2.k0(e65Var);
                K = e65Var;
            }
            h9f h9fVar = (h9f) K;
            boolean h3 = oq5Var2.h(nw5Var);
            Object K2 = oq5Var2.K();
            if (h3 || K2 == kjnVar) {
                e65 e65Var2 = new e65(0, nw5Var, nw5.class, "onPriceClick", "onPriceClick()V", 0, 10);
                nw5Var2 = nw5Var;
                oq5Var2.k0(e65Var2);
                K2 = e65Var2;
            } else {
                nw5Var2 = nw5Var;
            }
            yciVar2 = yciVar;
            oq5Var = oq5Var2;
            f(b2, pw5Var, (Function0) h9fVar, (Function0) ((h9f) K2), yciVar2, null, oq5Var, (i3 << 9) & 57344);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new kw5(nw5Var2, yciVar2, i2, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0182, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4.K(), java.lang.Integer.valueOf(r14)) == false) goto L110;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(pw5 pw5Var, wn5 wn5Var, Function0 function0, Function0 function02, yci yciVar, boolean z, pyc pycVar, boolean z2, o0k o0kVar, hq5 hq5Var, int i2, int i3) {
        int i4;
        yci yciVar2;
        boolean z3;
        int i5;
        pyc pycVar2;
        int i6;
        boolean z4;
        int i7;
        boolean z5;
        int i8;
        boolean z6;
        boolean z7;
        xmn r2;
        pw5Var.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1194619182);
        if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(pw5Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(wn5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= oq5Var.h(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.h(function02) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            yciVar2 = yciVar;
            i4 |= oq5Var.f(yciVar2) ? 16384 : RemoteCameraConfig.Notification.ID;
        } else {
            yciVar2 = yciVar;
        }
        int i9 = i3 & 32;
        if (i9 != 0) {
            i4 |= 196608;
        } else if ((196608 & i2) == 0) {
            z3 = z;
            i4 |= oq5Var.g(z3) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX;
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= ScreenMirroringConfig.Video.BITRATE_1_5MB;
            } else if ((1572864 & i2) == 0) {
                pycVar2 = pycVar;
                i4 |= oq5Var.h(pycVar2) ? 1048576 : 524288;
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                } else if ((12582912 & i2) == 0) {
                    z4 = z2;
                    i4 |= oq5Var.g(z4) ? 8388608 : RemoteCameraConfig.Camera.BITRATE;
                    if ((i2 & 100663296) == 0) {
                        i4 |= oq5Var.f(o0kVar) ? 67108864 : 33554432;
                    }
                    i7 = i4;
                    if ((i7 & 38347923) == 38347922 || !oq5Var.z()) {
                        oq5Var.U();
                        if ((i2 & 1) != 0 || oq5Var.y()) {
                            if (i9 != 0) {
                                z3 = false;
                            }
                            if (i5 != 0) {
                                pycVar2 = ild.C(1740264490, new xu0(5, z3), oq5Var);
                            }
                            if (i6 != 0) {
                                z4 = true;
                            }
                        } else {
                            oq5Var.S();
                        }
                        boolean z8 = z3;
                        pyc pycVar3 = pycVar2;
                        boolean z9 = z4;
                        oq5Var.q();
                        yci l2 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.e(yciVar2, false, null, null, function0, 7), o0kVar);
                        hz2 hz2Var = b2c.l;
                        nho a2 = lho.a(qx0.g, hz2Var, oq5Var, 54);
                        int i10 = oq5Var.P;
                        androidx.compose.runtime.internal.a l3 = oq5Var.l();
                        yci H = vnj.H(oq5Var, l2);
                        xp5.T.getClass();
                        grb grbVar = wp5.b;
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.n0();
                        } else {
                            oq5Var.k(grbVar);
                        }
                        kb5 kb5Var = wp5.f;
                        g0g.U(oq5Var, a2, kb5Var);
                        kb5 kb5Var2 = wp5.e;
                        g0g.U(oq5Var, l3, kb5Var2);
                        kb5 kb5Var3 = wp5.g;
                        if (oq5Var.O) {
                            z5 = z9;
                        } else {
                            z5 = z9;
                        }
                        ouj.x(i10, oq5Var, i10, kb5Var3);
                        kb5 kb5Var4 = wp5.d;
                        g0g.U(oq5Var, H, kb5Var4);
                        if (1.0f <= 0.0d) {
                            qme.a("invalid weight; must be greater than zero");
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(true, 1.0f);
                        nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
                        i8 = oq5Var.P;
                        androidx.compose.runtime.internal.a l4 = oq5Var.l();
                        yci H2 = vnj.H(oq5Var, layoutWeightElement);
                        oq5Var.d0();
                        if (oq5Var.O) {
                            oq5Var.n0();
                        } else {
                            oq5Var.k(grbVar);
                        }
                        g0g.U(oq5Var, a3, kb5Var);
                        g0g.U(oq5Var, l4, kb5Var2);
                        if (!oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                            ouj.x(i8, oq5Var, i8, kb5Var3);
                        }
                        g0g.U(oq5Var, H2, kb5Var4);
                        wn5Var.invoke(pw5Var, oq5Var, Integer.valueOf(i7 & 126));
                        vci vciVar = vci.a;
                        u1g.l(oq5Var, d.r(vciVar, 8));
                        pycVar3.invoke(pw5Var, oq5Var, Integer.valueOf((i7 & 14) | ((i7 >> 15) & 112)));
                        oq5Var.p(true);
                        u1g.l(oq5Var, d.r(vciVar, 20));
                        pycVar2 = pycVar3;
                        z6 = z5;
                        n(((i7 >> 12) & 7168) | ((i7 >> 6) & 112), oq5Var, null, pw5Var.j, function02, z6);
                        oq5Var.p(true);
                        z7 = z8;
                    } else {
                        oq5Var.S();
                        z7 = z3;
                        z6 = z4;
                    }
                    pyc pycVar4 = pycVar2;
                    r2 = oq5Var.r();
                    if (r2 == null) {
                        r2.d = new t43(pw5Var, wn5Var, function0, function02, yciVar, z7, pycVar4, z6, o0kVar, i2, i3);
                        return;
                    }
                    return;
                }
                z4 = z2;
                if ((i2 & 100663296) == 0) {
                }
                i7 = i4;
                if ((i7 & 38347923) == 38347922) {
                }
                oq5Var.U();
                if ((i2 & 1) != 0) {
                }
                if (i9 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 != 0) {
                }
                boolean z82 = z3;
                pyc pycVar32 = pycVar2;
                boolean z92 = z4;
                oq5Var.q();
                yci l22 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.e(yciVar2, false, null, null, function0, 7), o0kVar);
                hz2 hz2Var2 = b2c.l;
                nho a22 = lho.a(qx0.g, hz2Var2, oq5Var, 54);
                int i102 = oq5Var.P;
                androidx.compose.runtime.internal.a l32 = oq5Var.l();
                yci H3 = vnj.H(oq5Var, l22);
                xp5.T.getClass();
                grb grbVar2 = wp5.b;
                oq5Var.d0();
                if (oq5Var.O) {
                }
                kb5 kb5Var5 = wp5.f;
                g0g.U(oq5Var, a22, kb5Var5);
                kb5 kb5Var22 = wp5.e;
                g0g.U(oq5Var, l32, kb5Var22);
                kb5 kb5Var32 = wp5.g;
                if (oq5Var.O) {
                }
                ouj.x(i102, oq5Var, i102, kb5Var32);
                kb5 kb5Var42 = wp5.d;
                g0g.U(oq5Var, H3, kb5Var42);
                if (1.0f <= 0.0d) {
                }
                LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(true, 1.0f);
                nho a32 = lho.a(qx0.a, hz2Var2, oq5Var, 48);
                i8 = oq5Var.P;
                androidx.compose.runtime.internal.a l42 = oq5Var.l();
                yci H22 = vnj.H(oq5Var, layoutWeightElement2);
                oq5Var.d0();
                if (oq5Var.O) {
                }
                g0g.U(oq5Var, a32, kb5Var5);
                g0g.U(oq5Var, l42, kb5Var22);
                if (!oq5Var.O) {
                }
                ouj.x(i8, oq5Var, i8, kb5Var32);
                g0g.U(oq5Var, H22, kb5Var42);
                wn5Var.invoke(pw5Var, oq5Var, Integer.valueOf(i7 & 126));
                vci vciVar2 = vci.a;
                u1g.l(oq5Var, d.r(vciVar2, 8));
                pycVar32.invoke(pw5Var, oq5Var, Integer.valueOf((i7 & 14) | ((i7 >> 15) & 112)));
                oq5Var.p(true);
                u1g.l(oq5Var, d.r(vciVar2, 20));
                pycVar2 = pycVar32;
                z6 = z5;
                n(((i7 >> 12) & 7168) | ((i7 >> 6) & 112), oq5Var, null, pw5Var.j, function02, z6);
                oq5Var.p(true);
                z7 = z82;
                pyc pycVar42 = pycVar2;
                r2 = oq5Var.r();
                if (r2 == null) {
                }
            }
            pycVar2 = pycVar;
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            z4 = z2;
            if ((i2 & 100663296) == 0) {
            }
            i7 = i4;
            if ((i7 & 38347923) == 38347922) {
            }
            oq5Var.U();
            if ((i2 & 1) != 0) {
            }
            if (i9 != 0) {
            }
            if (i5 != 0) {
            }
            if (i6 != 0) {
            }
            boolean z822 = z3;
            pyc pycVar322 = pycVar2;
            boolean z922 = z4;
            oq5Var.q();
            yci l222 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.e(yciVar2, false, null, null, function0, 7), o0kVar);
            hz2 hz2Var22 = b2c.l;
            nho a222 = lho.a(qx0.g, hz2Var22, oq5Var, 54);
            int i1022 = oq5Var.P;
            androidx.compose.runtime.internal.a l322 = oq5Var.l();
            yci H32 = vnj.H(oq5Var, l222);
            xp5.T.getClass();
            grb grbVar22 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
            }
            kb5 kb5Var52 = wp5.f;
            g0g.U(oq5Var, a222, kb5Var52);
            kb5 kb5Var222 = wp5.e;
            g0g.U(oq5Var, l322, kb5Var222);
            kb5 kb5Var322 = wp5.g;
            if (oq5Var.O) {
            }
            ouj.x(i1022, oq5Var, i1022, kb5Var322);
            kb5 kb5Var422 = wp5.d;
            g0g.U(oq5Var, H32, kb5Var422);
            if (1.0f <= 0.0d) {
            }
            LayoutWeightElement layoutWeightElement22 = new LayoutWeightElement(true, 1.0f);
            nho a322 = lho.a(qx0.a, hz2Var22, oq5Var, 48);
            i8 = oq5Var.P;
            androidx.compose.runtime.internal.a l422 = oq5Var.l();
            yci H222 = vnj.H(oq5Var, layoutWeightElement22);
            oq5Var.d0();
            if (oq5Var.O) {
            }
            g0g.U(oq5Var, a322, kb5Var52);
            g0g.U(oq5Var, l422, kb5Var222);
            if (!oq5Var.O) {
            }
            ouj.x(i8, oq5Var, i8, kb5Var322);
            g0g.U(oq5Var, H222, kb5Var422);
            wn5Var.invoke(pw5Var, oq5Var, Integer.valueOf(i7 & 126));
            vci vciVar22 = vci.a;
            u1g.l(oq5Var, d.r(vciVar22, 8));
            pycVar322.invoke(pw5Var, oq5Var, Integer.valueOf((i7 & 14) | ((i7 >> 15) & 112)));
            oq5Var.p(true);
            u1g.l(oq5Var, d.r(vciVar22, 20));
            pycVar2 = pycVar322;
            z6 = z5;
            n(((i7 >> 12) & 7168) | ((i7 >> 6) & 112), oq5Var, null, pw5Var.j, function02, z6);
            oq5Var.p(true);
            z7 = z822;
            pyc pycVar422 = pycVar2;
            r2 = oq5Var.r();
            if (r2 == null) {
            }
        }
        z3 = z;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        pycVar2 = pycVar;
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        z4 = z2;
        if ((i2 & 100663296) == 0) {
        }
        i7 = i4;
        if ((i7 & 38347923) == 38347922) {
        }
        oq5Var.U();
        if ((i2 & 1) != 0) {
        }
        if (i9 != 0) {
        }
        if (i5 != 0) {
        }
        if (i6 != 0) {
        }
        boolean z8222 = z3;
        pyc pycVar3222 = pycVar2;
        boolean z9222 = z4;
        oq5Var.q();
        yci l2222 = androidx.compose.foundation.layout.a.l(androidx.compose.foundation.a.e(yciVar2, false, null, null, function0, 7), o0kVar);
        hz2 hz2Var222 = b2c.l;
        nho a2222 = lho.a(qx0.g, hz2Var222, oq5Var, 54);
        int i10222 = oq5Var.P;
        androidx.compose.runtime.internal.a l3222 = oq5Var.l();
        yci H322 = vnj.H(oq5Var, l2222);
        xp5.T.getClass();
        grb grbVar222 = wp5.b;
        oq5Var.d0();
        if (oq5Var.O) {
        }
        kb5 kb5Var522 = wp5.f;
        g0g.U(oq5Var, a2222, kb5Var522);
        kb5 kb5Var2222 = wp5.e;
        g0g.U(oq5Var, l3222, kb5Var2222);
        kb5 kb5Var3222 = wp5.g;
        if (oq5Var.O) {
        }
        ouj.x(i10222, oq5Var, i10222, kb5Var3222);
        kb5 kb5Var4222 = wp5.d;
        g0g.U(oq5Var, H322, kb5Var4222);
        if (1.0f <= 0.0d) {
        }
        LayoutWeightElement layoutWeightElement222 = new LayoutWeightElement(true, 1.0f);
        nho a3222 = lho.a(qx0.a, hz2Var222, oq5Var, 48);
        i8 = oq5Var.P;
        androidx.compose.runtime.internal.a l4222 = oq5Var.l();
        yci H2222 = vnj.H(oq5Var, layoutWeightElement222);
        oq5Var.d0();
        if (oq5Var.O) {
        }
        g0g.U(oq5Var, a3222, kb5Var522);
        g0g.U(oq5Var, l4222, kb5Var2222);
        if (!oq5Var.O) {
        }
        ouj.x(i8, oq5Var, i8, kb5Var3222);
        g0g.U(oq5Var, H2222, kb5Var4222);
        wn5Var.invoke(pw5Var, oq5Var, Integer.valueOf(i7 & 126));
        vci vciVar222 = vci.a;
        u1g.l(oq5Var, d.r(vciVar222, 8));
        pycVar3222.invoke(pw5Var, oq5Var, Integer.valueOf((i7 & 14) | ((i7 >> 15) & 112)));
        oq5Var.p(true);
        u1g.l(oq5Var, d.r(vciVar222, 20));
        pycVar2 = pycVar3222;
        z6 = z5;
        n(((i7 >> 12) & 7168) | ((i7 >> 6) & 112), oq5Var, null, pw5Var.j, function02, z6);
        oq5Var.p(true);
        z7 = z8222;
        pyc pycVar4222 = pycVar2;
        r2 = oq5Var.r();
        if (r2 == null) {
        }
    }

    public static final void f(boolean z, pw5 pw5Var, Function0 function0, Function0 function02, yci yciVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        Function0 function03;
        Function0 function04;
        int i4;
        o0k q0kVar;
        o0k o0kVar2;
        pw5Var.getClass();
        function0.getClass();
        function02.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1482068270);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(pw5Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function03 = function0;
            i3 |= oq5Var.h(function03) ? 256 : 128;
        } else {
            function03 = function0;
        }
        if ((i2 & 3072) == 0) {
            function04 = function02;
            i3 |= oq5Var.h(function04) ? 2048 : 1024;
        } else {
            function04 = function02;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if ((196608 & i2) == 0) {
            i3 |= SQLiteDatabase.OPEN_FULLMUTEX;
        }
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
            o0kVar2 = o0kVar;
        } else {
            oq5Var.U();
            if ((i2 & 1) == 0 || oq5Var.y()) {
                float f2 = 14;
                float f3 = 16;
                i4 = i3 & (-458753);
                q0kVar = new q0k(f3, f2, f3, f2);
            } else {
                oq5Var.S();
                i4 = i3 & (-458753);
                q0kVar = o0kVar;
            }
            oq5Var.q();
            e(pw5Var, ild.C(-1616666263, new o91(z, pw5Var, 2), oq5Var), function03, function04, yciVar, false, ild.C(-1913760914, new xu0(6, z), oq5Var), false, q0kVar, oq5Var, (14 & (i4 >> 3)) | 1572912 | (i4 & 896) | (i4 & 7168) | (i4 & 57344), 160);
            o0kVar2 = q0kVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new dq(z, pw5Var, function0, function02, yciVar, o0kVar2, i2, 6);
        }
    }

    public static final void g(yci yciVar, hq5 hq5Var, int i2) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-2032915942);
        if ((i2 & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            yci n2 = androidx.compose.foundation.layout.a.n(yciVar, 16, 14);
            hz2 hz2Var = b2c.l;
            nho a2 = lho.a(qx0.g, hz2Var, oq5Var, 54);
            int i3 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            yci H = vnj.H(oq5Var, n2);
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var, i3, kb5Var3);
            }
            kb5 kb5Var4 = wp5.d;
            g0g.U(oq5Var, H, kb5Var4);
            if (1.0f <= 0.0d) {
                qme.a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(false, 1.0f);
            nho a3 = lho.a(qx0.a, hz2Var, oq5Var, 48);
            int i4 = oq5Var.P;
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
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var3);
            }
            g0g.U(oq5Var, H2, kb5Var4);
            float P = ff7.P(v7g.z(68), oq5Var) + 12;
            vci vciVar = vci.a;
            ivf.k(6, 0, oq5Var, xp3.u(d.o(vciVar, 59, P), o5g.F(oq5Var)), true);
            u1g.l(oq5Var, d.r(vciVar, 8));
            ta5 a4 = sa5.a(qx0.e, b2c.n, oq5Var, 6);
            int i5 = oq5Var.P;
            androidx.compose.runtime.internal.a l4 = oq5Var.l();
            yci H3 = vnj.H(oq5Var, vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a4, kb5Var);
            g0g.U(oq5Var, l4, kb5Var2);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i5))) {
                ouj.x(i5, oq5Var, i5, kb5Var3);
            }
            g0g.U(oq5Var, H3, kb5Var4);
            ivf.l(true, d.r(vciVar, 150), nu0.j(), oq5Var, 54, 0);
            u1g.l(oq5Var, d.e(vciVar, 4));
            ivf.l(true, d.r(vciVar, 97), nu0.j(), oq5Var, 54, 0);
            oq5Var.p(true);
            oq5Var.p(true);
            u1g.l(oq5Var, d.r(vciVar, 20));
            ivf.k(6, 0, oq5Var, xp3.u(d.o(vciVar, 100, 28), ugo.a), true);
            oq5Var.p(true);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new u71(yciVar, i2, 17);
        }
    }

    public static final void h(String str, ru5 ru5Var, String str2, String str3, Integer num, String str4, hq5 hq5Var, int i2) {
        Integer num2;
        boolean z;
        boolean z2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(426117379);
        int i3 = i2 | (oq5Var.f(str) ? 4 : 2) | (oq5Var.h(ru5Var) ? 32 : 16) | (oq5Var.f(str2) ? 256 : 128) | (oq5Var.f(str3) ? 2048 : 1024) | (oq5Var.f(num) ? 16384 : RemoteCameraConfig.Notification.ID) | (oq5Var.f(str4) ? SQLiteDatabase.OPEN_SHAREDCACHE : SQLiteDatabase.OPEN_FULLMUTEX);
        if ((74899 & i3) == 74898 && oq5Var.z()) {
            oq5Var.S();
            num2 = num;
        } else {
            boolean z3 = (i3 & 14) == 4;
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (z3 || K == obj) {
                K = szf.g0(Boolean.FALSE);
                oq5Var.k0(K);
            }
            aqi aqiVar = (aqi) K;
            ta5 a2 = sa5.a(qx0.e, b2c.n, oq5Var, 6);
            int i4 = oq5Var.P;
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
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
            yci a3 = androidx.compose.ui.platform.a.a(vciVar, "concert_item_title");
            List c2 = t75.c(str == null ? "" : str);
            ges j2 = nu0.j();
            agr agrVar = eq0.a;
            long j3 = ((dq0) oq5Var.j(agrVar)).b.a;
            int i5 = num == null ? 2 : 1;
            boolean f2 = oq5Var.f(aqiVar);
            Object K2 = oq5Var.K();
            if (f2 || K2 == obj) {
                K2 = new x80(aqiVar, 10);
                oq5Var.k0(K2);
            }
            m3f.a(c2, a3, j3, 0L, 0L, 0, 0L, i5, (Function1) K2, j2, oq5Var, 48, 0, 2040);
            bg3.a(null, null, false, ild.C(1377018551, new up(str2, ru5Var, num, aqiVar, 13), oq5Var), oq5Var, 3072, 7);
            xv7.i(new mn0(6, str3, (ArrayList) null), androidx.compose.ui.platform.a.a(vciVar, "concert_item_long_city"), ((dq0) oq5Var.j(agrVar)).b.b, 0L, 0L, 0, 0L, 0, false, (((Boolean) aqiVar.getValue()).booleanValue() || num != null) ? 1 : 2, 0, null, null, nu0.j(), null, null, oq5Var, 48, 0, 909304);
            oq5Var = oq5Var;
            if (num != null) {
                oq5Var.Z(1433566164);
                hz2 hz2Var = b2c.l;
                yci D = ksw.D(androidx.compose.ui.platform.a.a(vciVar, "concert_item_cashback"), str4, null);
                nho a4 = lho.a(qx0.a, hz2Var, oq5Var, 48);
                int i6 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, D);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a4, kb5Var);
                g0g.U(oq5Var, l3, kb5Var2);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i6))) {
                    ouj.x(i6, oq5Var, i6, kb5Var3);
                }
                g0g.U(oq5Var, H2, kb5Var4);
                gae.b(a0g.E(R.drawable.ic_plus_12, 0, oq5Var), null, d.m(vciVar, 12), ((dq0) oq5Var.j(agrVar)).b.a, oq5Var, 432, 0);
                u1g.l(oq5Var, d.r(vciVar, 4));
                StringBuilder sb = new StringBuilder();
                num2 = num;
                sb.append(num2);
                sb.append("%");
                xcs.b(sb.toString(), null, ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.i(), oq5Var, 0, 3120, 55290);
                oq5Var = oq5Var;
                z = true;
                oq5Var.p(true);
                z2 = false;
            } else {
                num2 = num;
                z = true;
                z2 = false;
                oq5Var.Z(1421468693);
            }
            oq5Var.p(z2);
            oq5Var.p(z);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new pr(str, ru5Var, str2, str3, num2, str4, i2, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [hq5, oq5] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    public static final void i(String str, String str2, String str3, String str4, String str5, hq5 hq5Var, int i2) {
        int i3;
        kb5 kb5Var;
        agr agrVar;
        grb grbVar;
        kb5 kb5Var2;
        vci vciVar;
        oq5 oq5Var;
        ?? r8;
        boolean z;
        boolean z2;
        ?? r5 = (oq5) hq5Var;
        r5.b0(1032388276);
        int i4 = i2 | (r5.f(str) ? 4 : 2) | (r5.f(str2) ? 32 : 16) | (r5.f(str3) ? 256 : 128) | (r5.f(str4) ? 2048 : 1024) | (r5.f(str5) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i4 & 9363) == 9362 && r5.z()) {
            r5.S();
            oq5Var = r5;
        } else {
            boolean z3 = (i4 & 14) == 4;
            Object K = r5.K();
            Object obj = gq5.a;
            if (z3 || K == obj) {
                K = szf.g0(Boolean.FALSE);
                r5.k0(K);
            }
            aqi aqiVar = (aqi) K;
            ta5 a2 = sa5.a(qx0.e, b2c.n, r5, 6);
            int i5 = r5.P;
            androidx.compose.runtime.internal.a l2 = r5.l();
            vci vciVar2 = vci.a;
            yci H = vnj.H(r5, vciVar2);
            xp5.T.getClass();
            grb grbVar2 = wp5.b;
            r5.d0();
            if (r5.O) {
                r5.k(grbVar2);
            } else {
                r5.n0();
            }
            kb5 kb5Var3 = wp5.f;
            g0g.U(r5, a2, kb5Var3);
            kb5 kb5Var4 = wp5.e;
            g0g.U(r5, l2, kb5Var4);
            kb5 kb5Var5 = wp5.g;
            if (r5.O || !Intrinsics.d(r5.K(), Integer.valueOf(i5))) {
                ouj.x(i5, r5, i5, kb5Var5);
            }
            kb5 kb5Var6 = wp5.d;
            g0g.U(r5, H, kb5Var6);
            yci a3 = androidx.compose.ui.platform.a.a(vciVar2, "concert_item_city");
            List c2 = t75.c(str);
            ges j2 = nu0.j();
            agr agrVar2 = eq0.a;
            long j3 = ((dq0) r5.j(agrVar2)).b.a;
            int i6 = (str4 == null && str5 == null) ? 2 : 1;
            boolean f2 = r5.f(aqiVar);
            Object K2 = r5.K();
            int i7 = 12;
            if (f2 || K2 == obj) {
                K2 = new x80(aqiVar, i7);
                r5.k0(K2);
            }
            m3f.a(c2, a3, j3, 0L, 0L, 0, 0L, i6, (Function1) K2, j2, r5, 48, 0, 2040);
            if (str2 != null) {
                r5.Z(1542013584);
                i3 = i4;
                oq5Var = r5;
                bg3.a(null, null, false, ild.C(-160158565, new lc(str3, str2, str4, str5, aqiVar, 4), r5), oq5Var, 3072, 7);
                oq5Var.p(false);
                r8 = 0;
                kb5Var2 = kb5Var3;
                kb5Var = kb5Var6;
                grbVar = grbVar2;
                agrVar = agrVar2;
                vciVar = vciVar2;
            } else {
                i3 = i4;
                r5.Z(1542695677);
                kb5Var = kb5Var6;
                agrVar = agrVar2;
                grbVar = grbVar2;
                kb5Var2 = kb5Var3;
                vciVar = vciVar2;
                xcs.b(str3, androidx.compose.ui.platform.a.a(vciVar2, "concert_item_long_place"), ((dq0) r5.j(agrVar2)).b.b, 0L, null, 0L, null, null, 0L, 0, false, 1, 0, null, nu0.j(), r5, ((i3 >> 6) & 14) | 48, 3072, 57336);
                oq5Var = r5;
                r8 = 0;
                oq5Var.p(false);
            }
            if (str5 != null) {
                oq5Var.Z(1543056610);
                vci vciVar3 = vciVar;
                u1g.l(oq5Var, d.e(vciVar3, 8));
                yci a4 = androidx.compose.ui.platform.a.a(vciVar3, "cashback");
                nho a5 = lho.a(qx0.a, b2c.l, oq5Var, 48);
                int i8 = oq5Var.P;
                androidx.compose.runtime.internal.a l3 = oq5Var.l();
                yci H2 = vnj.H(oq5Var, a4);
                oq5Var.d0();
                if (oq5Var.O) {
                    oq5Var.k(grbVar);
                } else {
                    oq5Var.n0();
                }
                g0g.U(oq5Var, a5, kb5Var2);
                g0g.U(oq5Var, l3, kb5Var4);
                if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                    ouj.x(i8, oq5Var, i8, kb5Var5);
                }
                g0g.U(oq5Var, H2, kb5Var);
                agr agrVar3 = agrVar;
                oq5 oq5Var2 = oq5Var;
                gae.b(a0g.E(R.drawable.ic_plus_12, r8, oq5Var), null, d.m(vciVar3, 12), ((dq0) oq5Var.j(agrVar3)).b.a, oq5Var2, 432, 0);
                u1g.l(oq5Var2, d.r(vciVar3, 4));
                xcs.b(str5, null, ((dq0) oq5Var2.j(agrVar3)).b.a, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var2, (i3 >> 12) & 14, 3120, 55290);
                oq5Var = oq5Var2;
                z2 = true;
                oq5Var.p(true);
                oq5Var.p(false);
            } else {
                boolean z4 = r8;
                agr agrVar4 = agrVar;
                vci vciVar4 = vciVar;
                if (str4 != null) {
                    oq5Var.Z(1544040922);
                    u1g.l(oq5Var, d.e(vciVar4, 8));
                    oq5 oq5Var3 = oq5Var;
                    xcs.b(str4, null, ((dq0) oq5Var.j(agrVar4)).b.d, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, nu0.j(), oq5Var3, (i3 >> 9) & 14, 3120, 55290);
                    oq5Var = oq5Var3;
                    z = false;
                } else {
                    z = z4;
                    oq5Var.Z(1528280088);
                }
                oq5Var.p(z);
                z2 = true;
            }
            oq5Var.p(z2);
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new bj(i2, 14, str, str2, str3, str4, str5);
        }
    }

    public static final void j(Function0 function0, yci yciVar, e9g e9gVar, hq5 hq5Var, int i2) {
        int i3;
        yci yciVar2;
        e9g e9gVar2;
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1025540019);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i4 = i3 | 432;
        if (oq5Var.P(i4 & 1, (i4 & 147) != 146)) {
            e9gVar2 = e9g.a;
            vci vciVar = vci.a;
            ngg.i(function0, androidx.compose.ui.platform.a.a(vciVar, "create_new_playlist_button"), ild.C(-1193239537, new fp5(15), oq5Var), false, 0L, null, null, 0.0f, null, ff7.b, oq5Var, (i4 & 14) | 806879616, 440);
            yciVar2 = vciVar;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
            e9gVar2 = e9gVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new b3(function0, yciVar2, e9gVar2, i2);
        }
    }

    public static final void k(ArrayList arrayList, ArrayList arrayList2, xha xhaVar, fvf fvfVar, o0k o0kVar, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var;
        xhaVar.getClass();
        fvfVar.getClass();
        o0kVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(318044999);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var2.h(arrayList) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var2.h(arrayList2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var2.h(xhaVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= oq5Var2.f(fvfVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= oq5Var2.f(o0kVar) ? 16384 : RemoteCameraConfig.Notification.ID;
        }
        if (oq5Var2.P(i3 & 1, (i3 & 9363) != 9362)) {
            vm C = ghh.C(o0kVar, androidx.compose.foundation.layout.a.c(0.0f, 0.0f, 0.0f, 16, 7));
            yci a2 = androidx.compose.ui.platform.a.a(d.c(vci.a, 1.0f), "collection_downloaded_podcasts_blocks");
            boolean h2 = oq5Var2.h(arrayList) | oq5Var2.h(xhaVar) | oq5Var2.h(arrayList2);
            Object K = oq5Var2.K();
            if (h2 || K == gq5.a) {
                K = new g3(26, arrayList, arrayList2, xhaVar);
                oq5Var2.k0(K);
            }
            oq5Var = oq5Var2;
            weo.f(a2, fvfVar, C, null, null, null, false, null, (Function1) K, oq5Var, ((i3 >> 6) & 112) | 6, 504);
        } else {
            oq5Var = oq5Var2;
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new tu(i2, 12, arrayList, arrayList2, xhaVar, fvfVar, o0kVar);
        }
    }

    public static float l(float f2) {
        return f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float m(float f2) {
        return f2 <= 0.0031308f ? f2 * 12.92f : (float) ((Math.pow(f2, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    public static final void n(int i2, hq5 hq5Var, yci yciVar, String str, Function0 function0, boolean z) {
        String str2;
        int i3;
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1041896736);
        if ((i2 & 6) == 0) {
            str2 = str;
            i3 = (oq5Var.f(str2) ? 4 : 2) | i2;
        } else {
            str2 = str;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.h(function0) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if ((i2 & 3072) == 0) {
            i4 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if ((i4 & 1171) == 1170 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            String M = rvf.M(R.string.artist_concerts_buy, oq5Var);
            int i5 = 0;
            boolean z2 = (i4 & 14) == 4;
            Object K = oq5Var.K();
            if (z2 || K == gq5.a) {
                K = szf.g0(str2);
                oq5Var.k0(K);
            }
            wn5 C = ild.C(1485656392, new hw5(i5, (aqi) K, M), oq5Var);
            float f2 = BuildConfig.API_LEVEL;
            vci vciVar = vci.a;
            yci a2 = androidx.compose.ui.platform.a.a(d.s(vciVar, 100, f2), "concert_purchase_button");
            if (z) {
                oq5Var.Z(-582260273);
                hdg.r(function0, a2, null, C, oq5Var, ((i4 >> 3) & 14) | 3072, 4);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-582108435);
                hdg.u(function0, a2, null, C, oq5Var, ((i4 >> 3) & 14) | 3072, 4);
                oq5Var.p(false);
            }
            yciVar2 = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new iw5(str, function0, yciVar2, z, i2, 0, (byte) 0);
        }
    }

    public static final void o(Function0 function0, wn5 wn5Var, hq5 hq5Var, int i2) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-192474773);
        int i3 = (oq5Var.h(function0) ? 4 : 2) | i2;
        if (oq5Var.P(i3 & 1, (i3 & 19) != 18)) {
            s9b.a(function0, wn5Var, oq5Var, i3 & 126);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new r9b(function0, wn5Var, i2, 0);
        }
    }

    public static final void p(yci yciVar, Function2 function2, hq5 hq5Var, int i2, int i3) {
        int i4;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1298353104);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (oq5Var.f(yciVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= oq5Var.h(function2) ? 32 : 16;
        }
        if (oq5Var.P(i4 & 1, (i4 & 19) != 18)) {
            if (i5 != 0) {
                yciVar = vci.a;
            }
            Object K = oq5Var.K();
            if (K == gq5.a) {
                K = new cnr(i9w.d);
                oq5Var.k0(K);
            }
            q((cnr) K, yciVar, function2, oq5Var, (i4 << 3) & 1008);
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new zmr(yciVar, function2, i2, i3);
        }
    }

    public static final void q(cnr cnrVar, yci yciVar, Function2 function2, hq5 hq5Var, int i2) {
        int i3;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-511989831);
        if ((i2 & 6) == 0) {
            i3 = (oq5Var.h(cnrVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= oq5Var.f(yciVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= oq5Var.h(function2) ? 256 : 128;
        }
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            int i4 = oq5Var.P;
            mq5 z = lxe.z(oq5Var);
            yci H = vnj.H(oq5Var, yciVar);
            androidx.compose.runtime.internal.a l2 = oq5Var.l();
            grb grbVar = grb.X;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, cnrVar, cnrVar.c);
            g0g.U(oq5Var, z, cnrVar.d);
            g0g.U(oq5Var, function2, cnrVar.e);
            xp5.T.getClass();
            g0g.U(oq5Var, l2, wp5.e);
            g0g.U(oq5Var, H, wp5.d);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            oq5Var.p(true);
            if (oq5Var.z()) {
                oq5Var.Z(-26267397);
                oq5Var.p(false);
            } else {
                oq5Var.Z(-26326018);
                boolean h2 = oq5Var.h(cnrVar);
                Object K = oq5Var.K();
                if (h2 || K == gq5.a) {
                    K = new kgk(26, cnrVar);
                    oq5Var.k0(K);
                }
                gld.D((Function0) K, oq5Var);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new ig0(cnrVar, yciVar, function2, i2, 7);
        }
    }

    public static final int r(boolean z, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        if (z) {
            oq5Var.Z(1840524121);
            neg.s(oq5Var);
            oq5Var.p(false);
            return R.string.accessibility_uncheck_action;
        }
        oq5Var.Z(1840525564);
        neg.s(oq5Var);
        oq5Var.p(false);
        return R.string.accessibility_check_action;
    }

    public static void s(kn0 kn0Var, String str) {
        if ("�".length() <= 0) {
            vme.a("alternateText can't be an empty string.");
        }
        jn0 jn0Var = new jn0(new dkr(str), kn0Var.a.length(), 0, 4);
        ArrayList arrayList = kn0Var.b;
        arrayList.add(jn0Var);
        kn0Var.c.add(jn0Var);
        arrayList.size();
        kn0Var.d("�");
        kn0Var.e();
    }

    public static final List t(wfl wflVar, ArrayList arrayList, roi roiVar, int i2, int i3, int i4, Function1 function1) {
        roi roiVar2;
        long j2;
        long j3;
        int i5;
        Object obj;
        int i6;
        int i7;
        if (wflVar == null || arrayList.isEmpty() || roiVar.b == 0) {
            return c5b.a;
        }
        int index = ((vtf) CollectionsKt.Q(arrayList)).getIndex();
        int i8 = -1;
        if (((vtf) CollectionsKt.Y(arrayList)).getIndex() - index < 0 || (i7 = roiVar.b) == 0) {
            roiVar2 = spe.a;
        } else {
            IntRange m2 = yhn.m(0, i7);
            int i9 = m2.a;
            int i10 = m2.b;
            int i11 = -1;
            if (i9 <= i10) {
                while (roiVar.c(i9) <= index) {
                    i11 = roiVar.c(i9);
                    if (i9 == i10) {
                        break;
                    }
                    i9++;
                }
            }
            if (i11 == -1) {
                roiVar2 = spe.a;
            } else {
                roi roiVar3 = spe.a;
                roiVar2 = new roi(1);
                roiVar2.a(i11);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            Object obj2 = arrayList.get(i12);
            int index2 = ((vtf) obj2).getIndex();
            int[] iArr = roiVar.a;
            int i13 = roiVar.b;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    break;
                }
                if (iArr[i14] == index2) {
                    arrayList3.add(obj2);
                    break;
                }
                i14++;
            }
        }
        int[] iArr2 = roiVar2.a;
        int i15 = roiVar2.b;
        int i16 = 0;
        while (i16 < i15) {
            int i17 = iArr2[i16];
            Iterator it = arrayList.iterator();
            int i18 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i18 = i8;
                    break;
                }
                if (((vtf) it.next()).getIndex() == i17) {
                    break;
                }
                i18++;
            }
            vtf vtfVar = i18 == i8 ? (vtf) function1.invoke(Integer.valueOf(i17)) : (vtf) arrayList.remove(i18);
            int f2 = vtfVar.f();
            if (i18 == i8) {
                i5 = Integer.MIN_VALUE;
                j2 = 4294967295L;
            } else {
                long i19 = vtfVar.i(0);
                if (vtfVar.e()) {
                    j2 = 4294967295L;
                    j3 = i19 & 4294967295L;
                } else {
                    j2 = 4294967295L;
                    j3 = i19 >> 32;
                }
                i5 = (int) j3;
            }
            int size2 = arrayList3.size();
            int i20 = 0;
            while (true) {
                if (i20 >= size2) {
                    obj = null;
                    break;
                }
                obj = arrayList3.get(i20);
                if (((vtf) obj).getIndex() != i17) {
                    break;
                }
                i20++;
            }
            vtf vtfVar2 = (vtf) obj;
            if (vtfVar2 != null) {
                long i21 = vtfVar2.i(0);
                i6 = (int) (vtfVar2.e() ? i21 & j2 : i21 >> 32);
            } else {
                i6 = Integer.MIN_VALUE;
            }
            int max = i5 == Integer.MIN_VALUE ? -i2 : Math.max(-i2, i5);
            if (i6 != Integer.MIN_VALUE) {
                max = Math.min(max, i6 - f2);
            }
            vtfVar.h();
            vtfVar.a(max, 0, i3, i4);
            arrayList2.add(vtfVar);
            i16++;
            i8 = -1;
        }
        return arrayList2;
    }

    public static final Executor u(a aVar) {
        Executor J0;
        kotlinx.coroutines.d dVar = aVar instanceof kotlinx.coroutines.d ? (kotlinx.coroutines.d) aVar : null;
        return (dVar == null || (J0 = dVar.J0()) == null) ? new aa8(aVar) : J0;
    }

    public static final ea2 v(fvf fvfVar, Function1 function1, hq5 hq5Var) {
        boolean booleanValue;
        boolean f2;
        Object K;
        boolean f3;
        Object K2;
        function1.getClass();
        uf7 a2 = m8r.a(hq5Var);
        oq5 oq5Var = (oq5) hq5Var;
        boolean f4 = oq5Var.f(a2);
        Object K3 = oq5Var.K();
        kjn kjnVar = gq5.a;
        if (f4 || K3 == kjnVar) {
            K3 = new om7(a2);
            oq5Var.k0(K3);
        }
        om7 om7Var = (om7) K3;
        boolean booleanValue2 = ((Boolean) oq5Var.j(koe.a)).booleanValue();
        aeu aeuVar = (aeu) oq5Var.j(es5.s);
        oq5Var.Z(-723400178);
        Boolean bool = n;
        if (bool == null) {
            oq5Var.Z(597145028);
            Object systemService = ((Context) oq5Var.j(AndroidCompositionLocals_androidKt.b)).getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            booleanValue = true;
            if (activityManager == null) {
                oq5Var.p(false);
                oq5Var.p(false);
                f2 = oq5Var.f(om7Var) | oq5Var.f(aeuVar);
                K = oq5Var.K();
                if (!f2 || K == kjnVar) {
                    K = new lic(aeuVar.e() * ((!booleanValue2 || booleanValue) ? 0.6f : 0.8f), om7Var);
                    oq5Var.k0(K);
                }
                lic licVar = (lic) K;
                oq5 oq5Var2 = (oq5) hq5Var;
                jx7 jx7Var = (jx7) oq5Var2.j(es5.h);
                f3 = oq5Var2.f(fvfVar) | oq5Var2.f(licVar) | oq5Var2.f(jx7Var) | oq5Var2.f(function1);
                K2 = oq5Var2.K();
                if (!f3 || K2 == kjnVar) {
                    K2 = new ea2(fvfVar, licVar, new zya(5, jx7Var, function1));
                    oq5Var2.k0(K2);
                }
                return (ea2) K2;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (!activityManager.isLowRamDevice() && memoryInfo.totalMem > 4294967296L) {
                booleanValue = false;
            }
            n = Boolean.valueOf(booleanValue);
            oq5Var.p(false);
        } else {
            oq5Var.Z(597132473);
            oq5Var.p(false);
            booleanValue = bool.booleanValue();
        }
        oq5Var.p(false);
        f2 = oq5Var.f(om7Var) | oq5Var.f(aeuVar);
        K = oq5Var.K();
        if (!f2) {
        }
        K = new lic(aeuVar.e() * ((!booleanValue2 || booleanValue) ? 0.6f : 0.8f), om7Var);
        oq5Var.k0(K);
        lic licVar2 = (lic) K;
        oq5 oq5Var22 = (oq5) hq5Var;
        jx7 jx7Var2 = (jx7) oq5Var22.j(es5.h);
        f3 = oq5Var22.f(fvfVar) | oq5Var22.f(licVar2) | oq5Var22.f(jx7Var2) | oq5Var22.f(function1);
        K2 = oq5Var22.K();
        if (!f3) {
        }
        K2 = new ea2(fvfVar, licVar2, new zya(5, jx7Var2, function1));
        oq5Var22.k0(K2);
        return (ea2) K2;
    }

    public static final int x(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int y(long[] jArr, int i2, long j2) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j3 = jArr[i5];
            if (j3 < j2) {
                i4 = i5 + 1;
            } else {
                if (j3 <= j2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final boolean z(m20 m20Var, String str) {
        m20Var.getClass();
        if (str == null) {
            return false;
        }
        return m20Var.a.contains(str);
    }

    public abstract void S(ArrayList arrayList);

    public abstract Object w(boolean z, apo apoVar, cg6 cg6Var);
}
