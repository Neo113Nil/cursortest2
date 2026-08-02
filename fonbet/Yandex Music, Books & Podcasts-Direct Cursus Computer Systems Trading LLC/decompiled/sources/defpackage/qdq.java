package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.os.ext.SdkExtensions;
import android.util.TypedValue;
import android.view.DisplayCutout;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.core.graphics.drawable.IconCompat;
import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import com.yandex.pulse.metrics.c;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class qdq {
    public static volatile pdq a;
    public static volatile ArrayList b;

    public static final void A(Function0 function0) {
        pvt.a.post(new u6h(3, function0));
    }

    public static final boolean B(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean C(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static final int D(Integer num) {
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static void E(Context context, odq odqVar) {
        IconCompat iconCompat;
        int i;
        InputStream g;
        Bitmap decodeStream;
        IconCompat iconCompat2;
        context.getClass();
        int i2 = Build.VERSION.SDK_INT;
        int maxShortcutCountPerActivity = i2 >= 25 ? ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity() : 5;
        if (maxShortcutCountPerActivity == 0) {
            return;
        }
        if (i2 <= 29 && (iconCompat = odqVar.e) != null && (((i = iconCompat.a) == 6 || i == 4) && (g = iconCompat.g(context)) != null && (decodeStream = BitmapFactory.decodeStream(g)) != null)) {
            if (i == 6) {
                iconCompat2 = new IconCompat(5);
                iconCompat2.b = decodeStream;
            } else {
                iconCompat2 = new IconCompat(1);
                iconCompat2.b = decodeStream;
            }
            odqVar.e = iconCompat2;
        }
        char c = 65535;
        if (i2 >= 30) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(odqVar.a());
        } else if (i2 >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager.isRateLimitingActive()) {
                return;
            }
            List<ShortcutInfo> dynamicShortcuts = shortcutManager.getDynamicShortcuts();
            if (dynamicShortcuts.size() >= maxShortcutCountPerActivity) {
                int i3 = -1;
                String str = null;
                for (ShortcutInfo shortcutInfo : dynamicShortcuts) {
                    if (shortcutInfo.getRank() > i3) {
                        str = shortcutInfo.getId();
                        i3 = shortcutInfo.getRank();
                    }
                }
                shortcutManager.removeDynamicShortcuts(Arrays.asList(str));
            }
            shortcutManager.addDynamicShortcuts(Arrays.asList(odqVar.a()));
        }
        try {
            q(context).getClass();
            ArrayList arrayList = new ArrayList();
            if (arrayList.size() >= maxShortcutCountPerActivity) {
                String[] strArr = new String[1];
                Iterator it = arrayList.iterator();
                String str2 = null;
                while (it.hasNext()) {
                    odq odqVar2 = (odq) it.next();
                    odqVar2.getClass();
                    if (c < 0) {
                        str2 = odqVar2.b;
                        c = 0;
                    }
                }
                strArr[0] = str2;
                Arrays.asList(strArr);
            }
            Arrays.asList(odqVar);
            Iterator it2 = ((ArrayList) p(context)).iterator();
            if (it2.hasNext()) {
                if (it2.next() != null) {
                    l1j.f();
                    return;
                } else {
                    Collections.singletonList(odqVar);
                    throw null;
                }
            }
        } catch (Exception unused) {
            Iterator it3 = ((ArrayList) p(context)).iterator();
            if (it3.hasNext()) {
                if (it3.next() != null) {
                    l1j.f();
                    return;
                } else {
                    Collections.singletonList(odqVar);
                    throw null;
                }
            }
        } catch (Throwable th) {
            Iterator it4 = ((ArrayList) p(context)).iterator();
            if (!it4.hasNext()) {
                J(context, odqVar.b);
                throw th;
            }
            if (it4.next() != null) {
                l1j.f();
                return;
            } else {
                Collections.singletonList(odqVar);
                throw null;
            }
        }
        J(context, odqVar.b);
    }

    public static boolean F(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static boolean G(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static boolean H(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }

    public static void I(Context context, List list) {
        if (Build.VERSION.SDK_INT >= 25) {
            e7o.b(context.getSystemService(e7o.d())).removeDynamicShortcuts(list);
        }
        q(context).getClass();
        Iterator it = ((ArrayList) p(context)).iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
    }

    public static void J(Context context, String str) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 25) {
            e7o.b(context.getSystemService(e7o.d())).reportShortcutUsed(str);
        }
        Iterator it = ((ArrayList) p(context)).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                l1j.f();
            } else {
                Collections.singletonList(str);
                throw null;
            }
        }
    }

    public static void K(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
        window.setDecorFitsSystemWindows(z);
    }

    public static void L(Window window, boolean z) {
        window.setDecorFitsSystemWindows(z);
    }

    public static void M(View view) {
        view.setImportantForContentCapture(1);
    }

    public static void N(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }

    public static void O(Outline outline, eak eakVar) {
        if (eakVar instanceof nh0) {
            outline.setPath(((nh0) eakVar).a);
        } else {
            qq6.d("Unable to obtain android.graphics.Path");
        }
    }

    public static void P(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }

    public static void Q(Surface surface, float f) {
        try {
            surface.setFrameRate(f, f == 0.0f ? 0 : 1);
        } catch (IllegalStateException e) {
            vq1.L("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static dqh R(MediaRoute2Info mediaRoute2Info) {
        int i;
        CharSequence description;
        Uri iconUri;
        Bundle extras;
        Bundle bundle;
        ArrayList parcelableArrayList;
        if (mediaRoute2Info != null) {
            cqh cqhVar = new cqh(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
            int connectionState = mediaRoute2Info.getConnectionState();
            Bundle bundle2 = cqhVar.a;
            bundle2.putInt("connectionState", connectionState);
            bundle2.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
            bundle2.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
            bundle2.putInt("volume", mediaRoute2Info.getVolume());
            Bundle extras2 = mediaRoute2Info.getExtras();
            if (extras2 == null) {
                bundle2.putBundle("extras", null);
            } else {
                bundle2.putBundle("extras", new Bundle(extras2));
            }
            bundle2.putBoolean("enabled", true);
            bundle2.putBoolean("canDisconnect", false);
            if (Build.VERSION.SDK_INT >= 34) {
                bundle2.putStringArrayList("deduplicationIds", new ArrayList<>(jrh.b(mediaRoute2Info)));
                int c = jrh.c(mediaRoute2Info);
                i = 2;
                if (c == 2) {
                    i = 12;
                } else if (c == 3) {
                    i = 13;
                } else if (c == 4) {
                    i = 14;
                } else if (c == 22) {
                    i = 20;
                } else if (c == 23) {
                    i = 21;
                } else if (c == 26) {
                    i = 22;
                } else if (c == 29) {
                    i = 24;
                } else if (c != 2000) {
                    switch (c) {
                        case 8:
                            i = 3;
                            break;
                        case 9:
                            i = 16;
                            break;
                        case 10:
                            i = 23;
                            break;
                        case 11:
                            i = 17;
                            break;
                        case 12:
                            i = 18;
                            break;
                        case 13:
                            i = 19;
                            break;
                        default:
                            switch (c) {
                                case c.FINITE_SUM_FIELD_NUMBER /* 1001 */:
                                    i = 1;
                                    break;
                                case 1003:
                                    i = 4;
                                    break;
                                case 1004:
                                    i = 5;
                                    break;
                                case 1005:
                                    i = 6;
                                    break;
                                case 1006:
                                    i = 7;
                                    break;
                                case 1007:
                                    i = 8;
                                    break;
                                case 1008:
                                    i = 9;
                                    break;
                                case 1009:
                                    i = 10;
                                    break;
                                case 1010:
                                    i = 11;
                                    break;
                            }
                    }
                } else {
                    i = 1000;
                }
                description = mediaRoute2Info.getDescription();
                if (description != null) {
                    bundle2.putString("status", description.toString());
                }
                iconUri = mediaRoute2Info.getIconUri();
                if (iconUri != null) {
                    bundle2.putString("iconUri", iconUri.toString());
                }
                extras = mediaRoute2Info.getExtras();
                if (extras != null && extras.containsKey("androidx.mediarouter.media.KEY_EXTRAS") && extras.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") && extras.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
                    bundle = extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                    if (bundle != null) {
                        bundle2.putBundle("extras", null);
                    } else {
                        bundle2.putBundle("extras", new Bundle(bundle));
                    }
                    if (i == 0) {
                        i = extras.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0);
                    }
                    bundle2.putInt(SSDPDeviceDescriptionParser.TAG_DEVICE_TYPE, i);
                    bundle2.putInt("playbackType", extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                    parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                    if (parcelableArrayList != null) {
                        cqhVar.a(parcelableArrayList);
                    }
                    return cqhVar.b();
                }
            }
            i = 0;
            description = mediaRoute2Info.getDescription();
            if (description != null) {
            }
            iconUri = mediaRoute2Info.getIconUri();
            if (iconUri != null) {
            }
            extras = mediaRoute2Info.getExtras();
            if (extras != null) {
                bundle = extras.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
                if (bundle != null) {
                }
                if (i == 0) {
                }
                bundle2.putInt(SSDPDeviceDescriptionParser.TAG_DEVICE_TYPE, i);
                bundle2.putInt("playbackType", extras.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
                parcelableArrayList = extras.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
                if (parcelableArrayList != null) {
                }
                return cqhVar.b();
            }
        }
        return null;
    }

    public static final void a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        viewGroup.getClass();
        viewGroup2.getClass();
        l8t.a(viewGroup, new w3c());
        l8t.a(viewGroup2, new qb4());
    }

    public static final void b(ViewGroup viewGroup, ViewGroup viewGroup2) {
        viewGroup.getClass();
        viewGroup2.getClass();
        View findFocus = viewGroup.findFocus();
        if (findFocus != null) {
            if (Build.VERSION.SDK_INT >= 30) {
                WindowInsetsController windowInsetsController = findFocus.getWindowInsetsController();
                if (windowInsetsController != null) {
                    windowInsetsController.hide(WindowInsets.Type.ime());
                }
            } else {
                Object systemService = findFocus.getContext().getSystemService("input_method");
                systemService.getClass();
                ((InputMethodManager) systemService).hideSoftInputFromWindow(findFocus.getWindowToken(), 0);
            }
        }
        a(viewGroup, viewGroup2);
    }

    public static void c(int i, View view) {
        boolean z = (i & 8) == 0;
        view.getClass();
        j(view, new jn1(2, z));
    }

    public static final void d(View view, final boolean z, final boolean z2, final boolean z3, final boolean z4) {
        view.getClass();
        final int i = view.getLayoutParams().height;
        final int i2 = view.getLayoutParams().width;
        j(view, new ryc() { // from class: foe
            @Override // defpackage.ryc
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                View view2 = (View) obj;
                kqv kqvVar = (kqv) obj2;
                cme cmeVar = (cme) obj3;
                view2.getClass();
                kqvVar.getClass();
                cmeVar.getClass();
                zne g = kqvVar.a.g(527);
                g.getClass();
                boolean z5 = z;
                int i3 = z5 ? g.a : 0;
                boolean z6 = z2;
                int i4 = z6 ? g.b : 0;
                boolean z7 = z3;
                int i5 = z7 ? g.c : 0;
                boolean z8 = z4;
                int i6 = z8 ? g.d : 0;
                view2.setPadding(cmeVar.a + i3, cmeVar.b + i4, cmeVar.c + i5, cmeVar.d + i6);
                int i7 = i;
                if (i7 != -1 && i7 != -2) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams == null) {
                        jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return null;
                    }
                    if (!z8) {
                        i6 = 0;
                    }
                    int i8 = i7 + i6;
                    if (!z6) {
                        i4 = 0;
                    }
                    layoutParams.height = i8 + i4;
                    view2.setLayoutParams(layoutParams);
                }
                int i9 = i2;
                if (i9 != -1 && i9 != -2) {
                    ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                    if (layoutParams2 == null) {
                        jj4.j("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                        return null;
                    }
                    if (!z5) {
                        i3 = 0;
                    }
                    layoutParams2.width = i9 + i3 + (z7 ? i5 : 0);
                    view2.setLayoutParams(layoutParams2);
                }
                return Unit.a;
            }
        });
    }

    public static final void f(Resources.Theme theme, View view, TypedValue typedValue) {
        theme.getClass();
        view.getClass();
        int i = (!theme.resolveAttribute(R.attr.windowLightStatusBar, typedValue, true) || typedValue.data == 0) ? 0 : 8;
        if (theme.resolveAttribute(R.attr.windowLightNavigationBar, typedValue, true) && typedValue.data != 0) {
            i |= 16;
        }
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        windowInsetsController.getClass();
        windowInsetsController.setSystemBarsAppearance(i, 24);
    }

    public static final void g(TextView textView, Integer num) {
        textView.getClass();
        textView.setVisibility(num != null ? 0 : 8);
        if (num != null) {
            textView.setText(num.intValue());
        }
    }

    public static final w7o h(mif mifVar, long j) {
        mifVar.getClass();
        AtomicReference atomicReference = new AtomicReference();
        Object obj = new Object();
        mif.b(mif.b(mifVar, new xvt(obj, atomicReference, 0), null, 5), lhb.y0, new xvt(obj, atomicReference, 1), 1);
        synchronized (obj) {
            obj.wait(j);
        }
        Object obj2 = atomicReference.get();
        obj2.getClass();
        return (w7o) obj2;
    }

    public static Icon i(Uri uri) {
        return Icon.createWithAdaptiveBitmapContentUri(uri);
    }

    public static final void j(View view, ryc rycVar) {
        view.getClass();
        cme cmeVar = new cme(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        u13 u13Var = new u13(6, rycVar, cmeVar, marginLayoutParams != null ? new bme(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin) : null);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(view, u13Var);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new goe(0));
        }
    }

    public static Rect k(WindowManager windowManager) {
        return windowManager.getCurrentWindowMetrics().getBounds();
    }

    public static final int l(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            return l1b.j(context).getCurrentWindowMetrics().getBounds().height();
        }
        Point point = new Point();
        l1b.j(context).getDefaultDisplay().getRealSize(point);
        return point.y;
    }

    public static final int m(Context context) {
        context.getClass();
        context.getClass();
        return eeh.b((Build.VERSION.SDK_INT >= 30 ? l1b.j(context).getCurrentWindowMetrics().getBounds().width() : l1b.j(context).getDefaultDisplay().getWidth()) / context.getResources().getDisplayMetrics().density);
    }

    public static final int n(Context context) {
        int i;
        context.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            i = l1b.j(context).getCurrentWindowMetrics().getWindowInsets().getInsets(2).bottom;
            return i;
        }
        Configuration configuration = context.getResources().getConfiguration();
        configuration.getClass();
        int identifier = context.getResources().getIdentifier(asq.J(configuration) ? "navigation_bar_height" : "navigation_bar_height_landscape", "dimen", ConstantDeviceInfo.APP_PLATFORM);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static ArrayList o(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2Info = (MediaRoute2Info) it.next();
            if (mediaRoute2Info != null) {
                arrayList.add(mediaRoute2Info.getId());
            }
        }
        return arrayList;
    }

    public static List p(Context context) {
        Bundle bundle;
        String string;
        if (b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            Iterator<ResolveInfo> it = packageManager.queryIntentActivities(intent, 128).iterator();
            while (it.hasNext()) {
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && (bundle = activityInfo.metaData) != null && (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) != null) {
                    try {
                        if (Class.forName(string, false, qdq.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context) != null) {
                            throw new ClassCastException();
                        }
                        arrayList.add(null);
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
            if (b == null) {
                b = arrayList;
            }
        }
        return b;
    }

    public static pdq q(Context context) {
        if (a == null) {
            try {
                a = (pdq) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, qdq.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (a == null) {
                a = new pdq();
            }
        }
        return a;
    }

    public static CharSequence r(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static final int s(Context context) {
        context.getClass();
        return eeh.b(t(context) / context.getResources().getDisplayMetrics().density);
    }

    public static final int t(Context context) {
        int i;
        context.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            i = l1b.j(context).getCurrentWindowMetrics().getWindowInsets().getInsets(1).top;
            return i;
        }
        Configuration configuration = context.getResources().getConfiguration();
        configuration.getClass();
        int identifier = context.getResources().getIdentifier(asq.J(configuration) ? "status_bar_height" : "status_bar_height_landscape", "dimen", ConstantDeviceInfo.APP_PLATFORM);
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final zne u(Context context) {
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        Rect rect = new Rect();
        if (Build.VERSION.SDK_INT >= 30) {
            WindowMetrics currentWindowMetrics = l1b.j(context).getCurrentWindowMetrics();
            currentWindowMetrics.getClass();
            WindowInsets windowInsets = currentWindowMetrics.getWindowInsets();
            windowInsets.getClass();
            zne g = kqv.h(null, windowInsets).a.g(647);
            g.getClass();
            rect.left = g.a;
            rect.top = g.b;
            rect.right = g.c;
            rect.bottom = g.d;
        } else {
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (rootWindowInsets = decorView.getRootWindowInsets()) == null) {
                return zne.e;
            }
            zne g2 = kqv.h(null, rootWindowInsets).a.g(519);
            g2.getClass();
            rect.left = g2.a;
            rect.top = g2.b;
            rect.right = g2.c;
            rect.bottom = g2.d;
        }
        return zne.c(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static String v(yh yhVar) {
        if (yhVar instanceof xh) {
            return "image/*";
        }
        if (yhVar instanceof wh) {
            return null;
        }
        b6e.s();
        return null;
    }

    public static Insets w(DisplayCutout displayCutout) {
        return displayCutout.getWaterfallInsets();
    }

    public static boolean x(Context context) {
        return Build.VERSION.SDK_INT >= 31 && ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
    }

    public static final boolean y() {
        return Intrinsics.d(Locale.getDefault().getLanguage(), "ru");
    }

    public static boolean z() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return true;
        }
        return i >= 30 && SdkExtensions.getExtensionVersion(30) >= 2;
    }
}
