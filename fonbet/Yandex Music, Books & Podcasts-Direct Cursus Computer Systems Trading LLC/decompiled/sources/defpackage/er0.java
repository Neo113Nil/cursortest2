package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.core.app.a;
import androidx.core.app.f;
import com.connectsdk.discovery.provider.ssdp.SSDPDeviceDescriptionParser;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraProperty;
import io.appmetrica.analytics.BuildConfig;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class er0 extends rq0 implements fxh, LayoutInflater.Factory2 {
    public static final ciq O0 = new ciq(0);
    public static final int[] P0 = {R.attr.windowBackground};
    public static final boolean Q0 = !"robolectric".equals(Build.FINGERPRINT);
    public boolean A;
    public int A0;
    public ViewGroup B;
    public int B0;
    public TextView C;
    public boolean C0;
    public View D;
    public br0 D0;
    public boolean E;
    public br0 E0;
    public boolean F;
    public boolean F0;
    public boolean G;
    public int G0;
    public boolean H;
    public boolean I;
    public boolean I0;
    public boolean J;
    public Rect J0;
    public boolean K;
    public Rect K0;
    public boolean L;
    public ws0 L0;
    public OnBackInvokedDispatcher M0;
    public OnBackInvokedCallback N0;
    public dr0[] X;
    public dr0 Y;
    public boolean Z;
    public final Object j;
    public final Context k;
    public Window l;
    public ar0 m;
    public final kq0 n;
    public qd o;
    public msr p;
    public CharSequence q;
    public ActionBarOverlayLayout r;
    public efo s;
    public ix6 t;
    public ig u;
    public ActionBarContextView v;
    public boolean v0;
    public PopupWindow w;
    public boolean w0;
    public tq0 x;
    public boolean x0;
    public Configuration y0;
    public int z0;
    public wgu y = null;
    public final boolean z = true;
    public final tq0 H0 = new tq0(this, 0);

    public er0(Context context, Window window, kq0 kq0Var, Object obj) {
        hq0 hq0Var = null;
        this.z0 = -100;
        this.k = context;
        this.n = kq0Var;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof hq0)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        hq0Var = (hq0) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (hq0Var != null) {
                this.z0 = ((er0) hq0Var.getDelegate()).z0;
            }
        }
        if (this.z0 == -100) {
            String name = this.j.getClass().getName();
            ciq ciqVar = O0;
            Integer num = (Integer) ciqVar.get(name);
            if (num != null) {
                this.z0 = num.intValue();
                ciqVar.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            s(window);
        }
        ir0.d();
    }

    public static Configuration x(Context context, int i, dqg dqgVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (dqgVar != null) {
            wq0.d(configuration2, dqgVar);
        }
        return configuration2;
    }

    public final void A() {
        ViewGroup viewGroup;
        if (this.A) {
            return;
        }
        Context context = this.k;
        int[] iArr = ken.j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            xq0.q("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            j(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            j(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            j(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            j(10);
        }
        this.J = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        C();
        this.l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        int i = 5;
        int i2 = 2;
        if (this.K) {
            viewGroup = this.I ? (ViewGroup) from.inflate(ru.yandex.music.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(ru.yandex.music.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.J) {
            viewGroup = (ViewGroup) from.inflate(ru.yandex.music.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.H = false;
            this.G = false;
        } else if (this.G) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(ru.yandex.music.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new uf6(context, typedValue.resourceId) : context).inflate(ru.yandex.music.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(ru.yandex.music.R.id.decor_content_parent);
            this.r = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.l.getCallback());
            if (this.H) {
                this.r.f(109);
            }
            if (this.E) {
                this.r.f(2);
            }
            if (this.F) {
                this.r.f(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder sb = new StringBuilder("AppCompat does not support the current theme features: { windowActionBar: ");
            sb.append(this.G);
            sb.append(", windowActionBarOverlay: ");
            sb.append(this.H);
            sb.append(", android:windowIsFloating: ");
            sb.append(this.J);
            sb.append(", windowActionModeOverlay: ");
            sb.append(this.I);
            sb.append(", windowNoTitle: ");
            xq0.x(ouj.r(sb, this.K, " }"));
            return;
        }
        znk znkVar = new znk(i2, this);
        WeakHashMap weakHashMap = wdu.a;
        ndu.n(viewGroup, znkVar);
        if (this.r == null) {
            this.C = (TextView) viewGroup.findViewById(ru.yandex.music.R.id.title);
        }
        boolean z = zhu.a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, null);
        } catch (IllegalAccessException e) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e2) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e2);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(ru.yandex.music.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new ozw(i, this));
        this.B = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.q;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.r;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                qd qdVar = this.o;
                if (qdVar != null) {
                    qdVar.t(title);
                } else {
                    TextView textView = this.C;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.B.findViewById(R.id.content);
        View decorView = this.l.getDecorView();
        contentFrameLayout2.g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(122)) {
            obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(123)) {
            obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.A = true;
        dr0 E = E(0);
        if (this.x0 || E.h != null) {
            return;
        }
        G(108);
    }

    @Override // defpackage.fxh
    public final boolean B(hxh hxhVar, MenuItem menuItem) {
        dr0 dr0Var;
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.x0) {
            hxh k = hxhVar.k();
            dr0[] dr0VarArr = this.X;
            int length = dr0VarArr != null ? dr0VarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    dr0Var = dr0VarArr[i];
                    if (dr0Var != null && dr0Var.h == k) {
                        break;
                    }
                    i++;
                } else {
                    dr0Var = null;
                    break;
                }
            }
            if (dr0Var != null) {
                return callback.onMenuItemSelected(dr0Var.a, menuItem);
            }
        }
        return false;
    }

    public final void C() {
        if (this.l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                s(((Activity) obj).getWindow());
            }
        }
        if (this.l != null) {
            return;
        }
        xq0.q("We have not been given a Window");
    }

    public final b6 D(Context context) {
        if (this.D0 == null) {
            if (yks.e == null) {
                Context applicationContext = context.getApplicationContext();
                yks.e = new yks(applicationContext, (LocationManager) applicationContext.getSystemService(SSDPDeviceDescriptionParser.TAG_LOCATION));
            }
            this.D0 = new br0(this, yks.e);
        }
        return this.D0;
    }

    public final dr0 E(int i) {
        dr0[] dr0VarArr = this.X;
        if (dr0VarArr == null || dr0VarArr.length <= i) {
            dr0[] dr0VarArr2 = new dr0[i + 1];
            if (dr0VarArr != null) {
                System.arraycopy(dr0VarArr, 0, dr0VarArr2, 0, dr0VarArr.length);
            }
            this.X = dr0VarArr2;
            dr0VarArr = dr0VarArr2;
        }
        dr0 dr0Var = dr0VarArr[i];
        if (dr0Var != null) {
            return dr0Var;
        }
        dr0 dr0Var2 = new dr0();
        dr0Var2.a = i;
        dr0Var2.n = false;
        dr0VarArr[i] = dr0Var2;
        return dr0Var2;
    }

    public final void F() {
        A();
        if (this.G && this.o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.o = new hpv((Activity) obj, this.H);
            } else if (obj instanceof Dialog) {
                this.o = new hpv((Dialog) obj);
            }
            qd qdVar = this.o;
            if (qdVar != null) {
                qdVar.m(this.I0);
            }
        }
    }

    public final void G(int i) {
        this.G0 = (1 << i) | this.G0;
        if (this.F0) {
            return;
        }
        View decorView = this.l.getDecorView();
        WeakHashMap weakHashMap = wdu.a;
        decorView.postOnAnimation(this.H0);
        this.F0 = true;
    }

    public final int H(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            xq0.q("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        if (this.E0 == null) {
                            this.E0 = new br0(this, context);
                        }
                        return this.E0.p();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return D(context).p();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean I() {
        boolean z = this.Z;
        this.Z = false;
        dr0 E = E(0);
        if (!E.m) {
            ig igVar = this.u;
            if (igVar != null) {
                igVar.b();
                return true;
            }
            F();
            qd qdVar = this.o;
            if (qdVar == null || !qdVar.b()) {
                return false;
            }
        } else if (!z) {
            w(E, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0175, code lost:
    
        if (r2.f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0155, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(dr0 dr0Var, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = dr0Var.m;
        int i2 = dr0Var.a;
        if (z || this.x0) {
            return;
        }
        int i3 = 4;
        Context context = this.k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, dr0Var.h)) {
            w(dr0Var, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !L(dr0Var, keyEvent)) {
            return;
        }
        cr0 cr0Var = dr0Var.e;
        if (cr0Var == null || dr0Var.n) {
            if (cr0Var == null) {
                F();
                qd qdVar = this.o;
                Context e = qdVar != null ? qdVar.e() : null;
                if (e != null) {
                    context = e;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(ru.yandex.music.R.attr.actionBarPopupTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                }
                newTheme.resolveAttribute(ru.yandex.music.R.attr.panelMenuListTheme, typedValue, true);
                int i5 = typedValue.resourceId;
                if (i5 != 0) {
                    newTheme.applyStyle(i5, true);
                } else {
                    newTheme.applyStyle(ru.yandex.music.R.style.Theme_AppCompat_CompactMenu, true);
                }
                uf6 uf6Var = new uf6(context, 0);
                uf6Var.getTheme().setTo(newTheme);
                dr0Var.j = uf6Var;
                TypedArray obtainStyledAttributes = uf6Var.obtainStyledAttributes(ken.j);
                dr0Var.b = obtainStyledAttributes.getResourceId(86, 0);
                dr0Var.d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                dr0Var.e = new cr0(this, dr0Var.j);
                dr0Var.c = 81;
            } else if (dr0Var.n && cr0Var.getChildCount() > 0) {
                dr0Var.e.removeAllViews();
            }
            View view = dr0Var.g;
            if (view == null) {
                if (dr0Var.h != null) {
                    if (this.t == null) {
                        this.t = new ix6(i3, this);
                    }
                    ix6 ix6Var = this.t;
                    if (dr0Var.i == null) {
                        h9g h9gVar = new h9g(dr0Var.j);
                        dr0Var.i = h9gVar;
                        h9gVar.e = ix6Var;
                        hxh hxhVar = dr0Var.h;
                        hxhVar.b(h9gVar, hxhVar.a);
                    }
                    h9g h9gVar2 = dr0Var.i;
                    cr0 cr0Var2 = dr0Var.e;
                    if (h9gVar2.d == null) {
                        h9gVar2.d = (ExpandedMenuView) h9gVar2.b.inflate(ru.yandex.music.R.layout.abc_expanded_menu_layout, (ViewGroup) cr0Var2, false);
                        if (h9gVar2.f == null) {
                            h9gVar2.f = new g9g(h9gVar2);
                        }
                        h9gVar2.d.setAdapter((ListAdapter) h9gVar2.f);
                        h9gVar2.d.setOnItemClickListener(h9gVar2);
                    }
                    ExpandedMenuView expandedMenuView = h9gVar2.d;
                    dr0Var.f = expandedMenuView;
                }
                dr0Var.n = true;
                return;
            }
            dr0Var.f = view;
            if (dr0Var.f != null) {
                if (dr0Var.g == null) {
                    h9g h9gVar3 = dr0Var.i;
                    if (h9gVar3.f == null) {
                        h9gVar3.f = new g9g(h9gVar3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = dr0Var.f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                dr0Var.e.setBackgroundResource(dr0Var.b);
                ViewParent parent = dr0Var.f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(dr0Var.f);
                }
                dr0Var.e.addView(dr0Var.f, layoutParams2);
                if (!dr0Var.f.hasFocus()) {
                    dr0Var.f.requestFocus();
                }
            }
            dr0Var.n = true;
            return;
        }
        View view2 = dr0Var.g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            dr0Var.l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = dr0Var.c;
            layoutParams3.windowAnimations = dr0Var.d;
            windowManager.addView(dr0Var.e, layoutParams3);
            dr0Var.m = true;
            if (i2 != 0) {
                N();
                return;
            }
            return;
        }
        i = -2;
        dr0Var.l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = dr0Var.c;
        layoutParams32.windowAnimations = dr0Var.d;
        windowManager.addView(dr0Var.e, layoutParams32);
        dr0Var.m = true;
        if (i2 != 0) {
        }
    }

    public final boolean K(dr0 dr0Var, int i, KeyEvent keyEvent) {
        hxh hxhVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((dr0Var.k || L(dr0Var, keyEvent)) && (hxhVar = dr0Var.h) != null) {
            return hxhVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d3, code lost:
    
        if (r13.h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean L(dr0 dr0Var, KeyEvent keyEvent) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme theme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.x0) {
            boolean z = dr0Var.k;
            int i = dr0Var.a;
            if (z) {
                return true;
            }
            dr0 dr0Var2 = this.Y;
            if (dr0Var2 != null && dr0Var2 != dr0Var) {
                w(dr0Var2, false);
            }
            Window.Callback callback = this.l.getCallback();
            if (callback != null) {
                dr0Var.g = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.r) != null) {
                actionBarOverlayLayout4.i();
                ((zos) actionBarOverlayLayout4.e).l = true;
            }
            if (dr0Var.g == null && (!z2 || !(this.o instanceof tos))) {
                hxh hxhVar = dr0Var.h;
                if (hxhVar == null || dr0Var.o) {
                    if (hxhVar == null) {
                        Context context = this.k;
                        if ((i == 0 || i == 108) && this.r != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(ru.yandex.music.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(ru.yandex.music.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(ru.yandex.music.R.attr.actionBarWidgetTheme, typedValue, true);
                                theme = null;
                            }
                            if (typedValue.resourceId != 0) {
                                if (theme == null) {
                                    theme = context.getResources().newTheme();
                                    theme.setTo(theme2);
                                }
                                theme.applyStyle(typedValue.resourceId, true);
                            }
                            if (theme != null) {
                                uf6 uf6Var = new uf6(context, 0);
                                uf6Var.getTheme().setTo(theme);
                                context = uf6Var;
                            }
                        }
                        hxh hxhVar2 = new hxh(context);
                        hxhVar2.e = this;
                        hxh hxhVar3 = dr0Var.h;
                        if (hxhVar2 != hxhVar3) {
                            if (hxhVar3 != null) {
                                hxhVar3.r(dr0Var.i);
                            }
                            dr0Var.h = hxhVar2;
                            h9g h9gVar = dr0Var.i;
                            if (h9gVar != null) {
                                hxhVar2.b(h9gVar, hxhVar2.a);
                            }
                        }
                    }
                    if (z2 && (actionBarOverlayLayout2 = this.r) != null) {
                        if (this.s == null) {
                            this.s = new efo(4, this);
                        }
                        actionBarOverlayLayout2.j(dr0Var.h, this.s);
                    }
                    dr0Var.h.w();
                    if (callback.onCreatePanelMenu(i, dr0Var.h)) {
                        dr0Var.o = false;
                    } else {
                        hxh hxhVar4 = dr0Var.h;
                        if (hxhVar4 != null) {
                            if (hxhVar4 != null) {
                                hxhVar4.r(dr0Var.i);
                            }
                            dr0Var.h = null;
                        }
                        if (z2 && (actionBarOverlayLayout = this.r) != null) {
                            actionBarOverlayLayout.j(null, this.s);
                        }
                    }
                }
                dr0Var.h.w();
                Bundle bundle = dr0Var.p;
                if (bundle != null) {
                    dr0Var.h.s(bundle);
                    dr0Var.p = null;
                }
                if (!callback.onPreparePanel(0, dr0Var.g, dr0Var.h)) {
                    if (z2 && (actionBarOverlayLayout3 = this.r) != null) {
                        actionBarOverlayLayout3.j(null, this.s);
                    }
                    dr0Var.h.v();
                    return false;
                }
                dr0Var.h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                dr0Var.h.v();
            }
            dr0Var.k = true;
            dr0Var.l = false;
            this.Y = dr0Var;
            return true;
        }
        return false;
    }

    public final void M() {
        if (this.A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void N() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.M0 != null && (E(0).m || this.u != null)) {
                z = true;
            }
            if (z && this.N0 == null) {
                this.N0 = zq0.b(this.M0, this);
            } else {
                if (z || (onBackInvokedCallback = this.N0) == null) {
                    return;
                }
                zq0.c(this.M0, onBackInvokedCallback);
                this.N0 = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // defpackage.fxh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(hxh hxhVar) {
        ActionMenuView actionMenuView;
        dg dgVar;
        ActionBarOverlayLayout actionBarOverlayLayout = this.r;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.i();
            Toolbar toolbar = ((zos) actionBarOverlayLayout.e).a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.s) {
                if (ViewConfiguration.get(this.k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.r;
                    actionBarOverlayLayout2.i();
                    ActionMenuView actionMenuView2 = ((zos) actionBarOverlayLayout2.e).a.a;
                    if (actionMenuView2 != null) {
                        dg dgVar2 = actionMenuView2.t;
                        if (dgVar2 != null) {
                            if (dgVar2.u == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.r;
                actionBarOverlayLayout3.i();
                if (((zos) actionBarOverlayLayout3.e).a.p()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.r;
                    actionBarOverlayLayout4.i();
                    ActionMenuView actionMenuView3 = ((zos) actionBarOverlayLayout4.e).a.a;
                    if (actionMenuView3 != null && (dgVar = actionMenuView3.t) != null) {
                        dgVar.f();
                    }
                    if (this.x0) {
                        return;
                    }
                    callback.onPanelClosed(108, E(0).h);
                    return;
                }
                if (callback == null || this.x0) {
                    return;
                }
                if (this.F0 && (1 & this.G0) != 0) {
                    View decorView = this.l.getDecorView();
                    tq0 tq0Var = this.H0;
                    decorView.removeCallbacks(tq0Var);
                    tq0Var.run();
                }
                dr0 E = E(0);
                hxh hxhVar2 = E.h;
                if (hxhVar2 == null || E.o || !callback.onPreparePanel(0, E.g, hxhVar2)) {
                    return;
                }
                callback.onMenuOpened(108, E.h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.r;
                actionBarOverlayLayout5.i();
                ((zos) actionBarOverlayLayout5.e).a.v();
                return;
            }
        }
        dr0 E2 = E(0);
        E2.n = true;
        w(E2, false);
        J(E2, null);
    }

    @Override // defpackage.rq0
    public final void d() {
        LayoutInflater from = LayoutInflater.from(this.k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof er0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // defpackage.rq0
    public final void e() {
        if (this.o != null) {
            F();
            if (this.o.g()) {
                return;
            }
            G(0);
        }
    }

    @Override // defpackage.rq0
    public final void g() {
        String str;
        this.v0 = true;
        r(false, true);
        C();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = f.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                qd qdVar = this.o;
                if (qdVar == null) {
                    this.I0 = true;
                } else {
                    qdVar.m(true);
                }
            }
            synchronized (rq0.h) {
                rq0.i(this);
                rq0.g.add(new WeakReference(this));
            }
        }
        this.y0 = new Configuration(this.k.getResources().getConfiguration());
        this.w0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.rq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        qd qdVar;
        br0 br0Var;
        br0 br0Var2;
        if (this.j instanceof Activity) {
            synchronized (rq0.h) {
                rq0.i(this);
            }
        }
        if (this.F0) {
            this.l.getDecorView().removeCallbacks(this.H0);
        }
        this.x0 = true;
        if (this.z0 != -100) {
            Object obj = this.j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                O0.put(this.j.getClass().getName(), Integer.valueOf(this.z0));
                qdVar = this.o;
                if (qdVar != null) {
                    qdVar.i();
                }
                br0Var = this.D0;
                if (br0Var != null) {
                    br0Var.i();
                }
                br0Var2 = this.E0;
                if (br0Var2 == null) {
                    br0Var2.i();
                    return;
                }
                return;
            }
        }
        O0.remove(this.j.getClass().getName());
        qdVar = this.o;
        if (qdVar != null) {
        }
        br0Var = this.D0;
        if (br0Var != null) {
        }
        br0Var2 = this.E0;
        if (br0Var2 == null) {
        }
    }

    @Override // defpackage.rq0
    public final boolean j(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.K && i == 108) {
            return false;
        }
        if (this.G && i == 1) {
            this.G = false;
        }
        if (i == 1) {
            M();
            this.K = true;
            return true;
        }
        if (i == 2) {
            M();
            this.E = true;
            return true;
        }
        if (i == 5) {
            M();
            this.F = true;
            return true;
        }
        if (i == 10) {
            M();
            this.I = true;
            return true;
        }
        if (i == 108) {
            M();
            this.G = true;
            return true;
        }
        if (i != 109) {
            return this.l.requestFeature(i);
        }
        M();
        this.H = true;
        return true;
    }

    @Override // defpackage.rq0
    public final void k(int i) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.k).inflate(i, viewGroup);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.rq0
    public final void l(View view) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.rq0
    public final void m(View view, ViewGroup.LayoutParams layoutParams) {
        A();
        ViewGroup viewGroup = (ViewGroup) this.B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.m.a(this.l.getCallback());
    }

    @Override // defpackage.rq0
    public final void n(int i) {
        if (this.z0 != i) {
            this.z0 = i;
            if (this.v0) {
                r(true, true);
            }
        }
    }

    @Override // defpackage.rq0
    public final void o(CharSequence charSequence) {
        this.q = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.r;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        qd qdVar = this.o;
        if (qdVar != null) {
            qdVar.t(charSequence);
            return;
        }
        TextView textView = this.C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (this.L0 == null) {
            int[] iArr = ken.j;
            Context context2 = this.k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(BuildConfig.API_LEVEL);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.L0 = new ws0();
            } else {
                try {
                    this.L0 = (ws0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.L0 = new ws0();
                }
            }
        }
        ws0 ws0Var = this.L0;
        int i = lzt.a;
        return ws0Var.f(view, str, context, attributeSet, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
    @Override // defpackage.rq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ig p(hg hgVar) {
        ig igVar;
        ViewGroup viewGroup;
        ig igVar2;
        if (hgVar == null) {
            xq0.x("ActionMode callback can not be null.");
            return null;
        }
        ig igVar3 = this.u;
        if (igVar3 != null) {
            igVar3.b();
        }
        nnk nnkVar = new nnk();
        nnkVar.b = this;
        nnkVar.a = hgVar;
        F();
        qd qdVar = this.o;
        kq0 kq0Var = this.n;
        if (qdVar != null) {
            ig v = qdVar.v(nnkVar);
            this.u = v;
            if (v != null && kq0Var != null) {
                kq0Var.onSupportActionModeStarted(v);
            }
        }
        if (this.u == null) {
            wgu wguVar = this.y;
            if (wguVar != null) {
                wguVar.b();
            }
            ig igVar4 = this.u;
            if (igVar4 != null) {
                igVar4.b();
            }
            if (kq0Var != null && !this.x0) {
                try {
                    igVar = kq0Var.onWindowStartingSupportActionMode(nnkVar);
                } catch (AbstractMethodError unused) {
                }
                if (igVar == null) {
                    this.u = igVar;
                } else {
                    int i = 1;
                    if (this.v == null) {
                        boolean z = this.J;
                        Context context = this.k;
                        if (z) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(ru.yandex.music.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                uf6 uf6Var = new uf6(context, 0);
                                uf6Var.getTheme().setTo(newTheme);
                                context = uf6Var;
                            }
                            this.v = new ActionBarContextView(context);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, ru.yandex.music.R.attr.actionModePopupWindowStyle);
                            this.w = popupWindow;
                            popupWindow.setWindowLayoutType(2);
                            this.w.setContentView(this.v);
                            this.w.setWidth(-1);
                            context.getTheme().resolveAttribute(ru.yandex.music.R.attr.actionBarSize, typedValue, true);
                            this.v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.w.setHeight(-2);
                            this.x = new tq0(this, i);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.B.findViewById(ru.yandex.music.R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                F();
                                qd qdVar2 = this.o;
                                Context e = qdVar2 != null ? qdVar2.e() : null;
                                if (e != null) {
                                    context = e;
                                }
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(context));
                                this.v = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.v != null) {
                        wgu wguVar2 = this.y;
                        if (wguVar2 != null) {
                            wguVar2.b();
                        }
                        this.v.e();
                        Context context2 = this.v.getContext();
                        ActionBarContextView actionBarContextView = this.v;
                        qar qarVar = new qar();
                        qarVar.c = context2;
                        qarVar.d = actionBarContextView;
                        qarVar.e = nnkVar;
                        hxh hxhVar = new hxh(actionBarContextView.getContext());
                        hxhVar.l = 1;
                        qarVar.h = hxhVar;
                        hxhVar.e = qarVar;
                        if (((hg) nnkVar.a).B(qarVar, hxhVar)) {
                            qarVar.h();
                            this.v.c(qarVar);
                            this.u = qarVar;
                            boolean z2 = this.A && (viewGroup = this.B) != null && viewGroup.isLaidOut();
                            ActionBarContextView actionBarContextView2 = this.v;
                            if (z2) {
                                actionBarContextView2.setAlpha(0.0f);
                                wgu b = wdu.b(this.v);
                                b.a(1.0f);
                                this.y = b;
                                b.d(new uq0(i, this));
                            } else {
                                actionBarContextView2.setAlpha(1.0f);
                                this.v.setVisibility(0);
                                if (this.v.getParent() instanceof View) {
                                    View view = (View) this.v.getParent();
                                    WeakHashMap weakHashMap = wdu.a;
                                    ldu.c(view);
                                }
                            }
                            if (this.w != null) {
                                this.l.getDecorView().post(this.x);
                            }
                        } else {
                            this.u = null;
                        }
                    }
                }
                igVar2 = this.u;
                if (igVar2 != null && kq0Var != null) {
                    kq0Var.onSupportActionModeStarted(igVar2);
                }
                N();
                this.u = this.u;
            }
            igVar = null;
            if (igVar == null) {
            }
            igVar2 = this.u;
            if (igVar2 != null) {
                kq0Var.onSupportActionModeStarted(igVar2);
            }
            N();
            this.u = this.u;
        }
        N();
        return this.u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(boolean z, boolean z2) {
        int i;
        Configuration configuration;
        dqg b;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj;
        Object obj2;
        LongSparseArray longSparseArray;
        Activity activity;
        if (this.x0) {
            return false;
        }
        int i3 = this.z0;
        if (i3 == -100) {
            i3 = rq0.b;
        }
        int i4 = i3;
        Context context = this.k;
        int H = H(context, i4);
        int i5 = Build.VERSION.SDK_INT;
        dqg t = i5 < 33 ? t(context) : null;
        if (!z2 && t != null) {
            t = wq0.b(context.getResources().getConfiguration());
        }
        Configuration x = x(context, H, t, null, false);
        boolean z6 = this.C0;
        Object obj3 = this.j;
        if (!z6 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.y0;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i6 = configuration.uiMode & 48;
                int i7 = x.uiMode & 48;
                dqg b2 = wq0.b(configuration);
                b = t != null ? null : wq0.b(x);
                i2 = i6 == i7 ? RemoteCameraConfig.Mic.BUFFER_SIZE : 0;
                if (b != null && !b2.equals(b)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z && this.v0 && ((Q0 || this.w0) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 31 && (i2 & RemoteCameraConfig.Notification.ID) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(x.getLayoutDirection());
                        }
                        if (i8 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new a(r2, activity));
                        }
                        z3 = true;
                        if (!z3 || i2 == 0) {
                            z4 = z3;
                        } else {
                            r2 = (i & i2) == i2 ? 1 : 0;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i7;
                            if (b != null) {
                                wq0.d(configuration2, b);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i9 = Build.VERSION.SDK_INT;
                            if (i9 < 26 && i9 < 28) {
                                if (!ocg.h) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        ocg.g = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                                    }
                                    ocg.h = true;
                                }
                                Field field = ocg.g;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e2) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!ocg.b) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                ocg.a = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e3) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                                            }
                                            ocg.b = true;
                                        }
                                        Field field2 = ocg.a;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e4) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                                            }
                                            if (obj2 != null) {
                                                if (!ocg.d) {
                                                    try {
                                                        ocg.c = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e5) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e5);
                                                    }
                                                    ocg.d = true;
                                                }
                                                Class cls = ocg.c;
                                                if (cls != null) {
                                                    if (!ocg.f) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            ocg.e = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e6) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e6);
                                                        }
                                                        ocg.f = true;
                                                    }
                                                    Field field3 = ocg.e;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e7) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e7);
                                                            longSparseArray = null;
                                                        }
                                                        if (longSparseArray != null) {
                                                            longSparseArray.clear();
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        obj2 = null;
                                        if (obj2 != null) {
                                        }
                                    }
                                }
                            }
                            int i10 = this.A0;
                            if (i10 != 0) {
                                context.setTheme(i10);
                                z5 = true;
                                context.getTheme().applyStyle(this.A0, true);
                            } else {
                                z5 = true;
                            }
                            if (r2 != 0 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof dzf) {
                                    if (((dzf) activity2).getLifecycle().b().compareTo(lyf.c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.w0 && !this.x0) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                            z4 = z5;
                        }
                        if (z4 && (obj3 instanceof hq0)) {
                            if ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                                ((hq0) obj3).onNightModeChanged(H);
                            }
                            if ((i2 & 4) != 0) {
                                ((hq0) obj3).onLocalesChanged(t);
                            }
                        }
                        if (b != null) {
                            wq0.c(wq0.b(context.getResources().getConfiguration()));
                        }
                        if (i4 == 0) {
                            D(context).K();
                        } else {
                            br0 br0Var = this.D0;
                            if (br0Var != null) {
                                br0Var.i();
                            }
                        }
                        br0 br0Var2 = this.E0;
                        if (i4 == 3) {
                            if (br0Var2 == null) {
                                this.E0 = new br0(this, context);
                            }
                            this.E0.K();
                        } else if (br0Var2 != null) {
                            br0Var2.i();
                        }
                        return z4;
                    }
                }
                z3 = false;
                if (z3) {
                }
                z4 = z3;
                if (z4) {
                    if ((i2 & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                }
                if (b != null) {
                }
                if (i4 == 0) {
                }
                br0 br0Var22 = this.E0;
                if (i4 == 3) {
                }
                return z4;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i5 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.B0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e8) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e8);
                this.B0 = 0;
            }
        }
        this.C0 = true;
        i = this.B0;
        configuration = this.y0;
        if (configuration == null) {
        }
        int i62 = configuration.uiMode & 48;
        int i72 = x.uiMode & 48;
        dqg b22 = wq0.b(configuration);
        if (t != null) {
        }
        if (i62 == i72) {
        }
        if (b != null) {
            i2 |= 8196;
        }
        if (((~i) & i2) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z3 = false;
        if (z3) {
        }
        z4 = z3;
        if (z4) {
        }
        if (b != null) {
        }
        if (i4 == 0) {
        }
        br0 br0Var222 = this.E0;
        if (i4 == 3) {
        }
        return z4;
    }

    public final void s(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.l != null) {
            xq0.q("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof ar0) {
            xq0.q("AppCompat has already installed itself into the Window");
            return;
        }
        ar0 ar0Var = new ar0(this, callback);
        this.m = ar0Var;
        window.setCallback(ar0Var);
        lum V = lum.V(this.k, null, P0);
        Drawable N = V.N(0);
        if (N != null) {
            window.setBackgroundDrawable(N);
        }
        V.f0();
        this.l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.M0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.N0) != null) {
            zq0.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.N0 = null;
        }
        Object obj = this.j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.M0 = zq0.a(activity);
                N();
            }
        }
        this.M0 = null;
        N();
    }

    public dqg t(Context context) {
        dqg dqgVar;
        dqg d;
        if (Build.VERSION.SDK_INT >= 33 || (dqgVar = rq0.c) == null) {
            return null;
        }
        eqg eqgVar = dqgVar.a;
        dqg b = wq0.b(context.getApplicationContext().getResources().getConfiguration());
        if (dqgVar.c()) {
            d = dqg.b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b.a.a.size() + eqgVar.a.size()) {
                Locale b2 = i < eqgVar.a.size() ? dqgVar.b(i) : b.b(i - eqgVar.a.size());
                if (b2 != null) {
                    linkedHashSet.add(b2);
                }
                i++;
            }
            d = dqg.d(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()])));
        }
        return d.c() ? b : d;
    }

    public final void u(int i, dr0 dr0Var, hxh hxhVar) {
        if (hxhVar == null) {
            if (dr0Var == null && i >= 0) {
                dr0[] dr0VarArr = this.X;
                if (i < dr0VarArr.length) {
                    dr0Var = dr0VarArr[i];
                }
            }
            if (dr0Var != null) {
                hxhVar = dr0Var.h;
            }
        }
        if ((dr0Var == null || dr0Var.m) && !this.x0) {
            ar0 ar0Var = this.m;
            Window.Callback callback = this.l.getCallback();
            ar0Var.getClass();
            try {
                ar0Var.e = true;
                callback.onPanelClosed(i, hxhVar);
            } finally {
                ar0Var.e = false;
            }
        }
    }

    public final void v(hxh hxhVar) {
        dg dgVar;
        if (this.L) {
            return;
        }
        this.L = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.r;
        actionBarOverlayLayout.i();
        ActionMenuView actionMenuView = ((zos) actionBarOverlayLayout.e).a.a;
        if (actionMenuView != null && (dgVar = actionMenuView.t) != null) {
            dgVar.f();
            ag agVar = dgVar.t;
            if (agVar != null && agVar.b()) {
                agVar.i.dismiss();
            }
        }
        Window.Callback callback = this.l.getCallback();
        if (callback != null && !this.x0) {
            callback.onPanelClosed(108, hxhVar);
        }
        this.L = false;
    }

    public final void w(dr0 dr0Var, boolean z) {
        cr0 cr0Var;
        ActionBarOverlayLayout actionBarOverlayLayout;
        if (z && dr0Var.a == 0 && (actionBarOverlayLayout = this.r) != null) {
            actionBarOverlayLayout.i();
            if (((zos) actionBarOverlayLayout.e).a.p()) {
                v(dr0Var.h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.k.getSystemService("window");
        if (windowManager != null && dr0Var.m && (cr0Var = dr0Var.e) != null) {
            windowManager.removeView(cr0Var);
            if (z) {
                u(dr0Var.a, dr0Var, null);
            }
        }
        dr0Var.k = false;
        dr0Var.l = false;
        dr0Var.m = false;
        dr0Var.f = null;
        dr0Var.n = true;
        if (this.Y == dr0Var) {
            this.Y = null;
        }
        if (dr0Var.a == 0) {
            N();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00e8, code lost:
    
        if (r7.f() != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        ActionMenuView actionMenuView;
        Object obj = this.j;
        if ((!(obj instanceof raf) && !(obj instanceof gr0)) || (decorView = this.l.getDecorView()) == null || !u2x.A(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                ar0 ar0Var = this.m;
                Window.Callback callback = this.l.getCallback();
                ar0Var.getClass();
                try {
                    ar0Var.d = true;
                } finally {
                    ar0Var.d = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.Z = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        dr0 E = E(0);
                        if (!E.m) {
                            L(E, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.u == null) {
                        dr0 E2 = E(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.r;
                        Context context = this.k;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.i();
                            Toolbar toolbar = ((zos) actionBarOverlayLayout.e).a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.r;
                                actionBarOverlayLayout2.i();
                                if (((zos) actionBarOverlayLayout2.e).a.p()) {
                                    ActionBarOverlayLayout actionBarOverlayLayout3 = this.r;
                                    actionBarOverlayLayout3.i();
                                    ActionMenuView actionMenuView2 = ((zos) actionBarOverlayLayout3.e).a.a;
                                    if (actionMenuView2 != null) {
                                        dg dgVar = actionMenuView2.t;
                                        if (dgVar != null) {
                                        }
                                    }
                                } else if (!this.x0 && L(E2, keyEvent)) {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.r;
                                    actionBarOverlayLayout4.i();
                                    z = ((zos) actionBarOverlayLayout4.e).a.v();
                                    if (z) {
                                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(CameraProperty.AUDIO);
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                                z = false;
                                if (z) {
                                }
                            }
                        }
                        boolean z3 = E2.m;
                        if (z3 || E2.l) {
                            w(E2, true);
                            z = z3;
                            if (z) {
                            }
                        } else {
                            if (E2.k) {
                                if (E2.o) {
                                    E2.k = false;
                                    z2 = L(E2, keyEvent);
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    J(E2, keyEvent);
                                    z = true;
                                    if (z) {
                                    }
                                }
                            }
                            z = false;
                            if (z) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!I()) {
                return false;
            }
        }
        return true;
    }

    public final void z(int i) {
        dr0 E = E(i);
        if (E.h != null) {
            Bundle bundle = new Bundle();
            E.h.t(bundle);
            if (bundle.size() > 0) {
                E.p = bundle;
            }
            E.h.w();
            E.h.clear();
        }
        E.o = true;
        E.n = true;
        if ((i == 108 || i == 0) && this.r != null) {
            dr0 E2 = E(0);
            E2.k = false;
            L(E2, null);
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
