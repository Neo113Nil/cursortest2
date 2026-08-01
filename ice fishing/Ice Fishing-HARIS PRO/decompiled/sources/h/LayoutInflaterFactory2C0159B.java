package h;

import O.C0046w;
import O.InterfaceC0034j;
import O.N;
import Z.AbstractC0059g;
import a.AbstractC0078a;
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
import androidx.lifecycle.EnumC0097n;
import androidx.lifecycle.InterfaceC0101s;
import androidx.recyclerview.widget.RecyclerView;
import g.AbstractC0155a;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC0177a;
import k.C0179c;
import k.C0184h;
import l.C0224h;
import l.C0225i;
import l.InterfaceC0227k;
import l.MenuC0229m;
import m.C0235A;
import m.C0239E;
import m.C0241G;
import m.C0254g;
import m.C0257h0;
import m.C0264l;
import m.C0277s;
import m.C0281u;
import m.C0285w;
import m.C0289y;
import m.C0291z;
import m.InterfaceC0261j0;
import m.InterfaceC0263k0;
import m.Q;
import m.X0;
import m.c1;
import m.e1;
import m.h1;
import r.C0342j;

/* renamed from: h.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0159B extends p implements InterfaceC0227k, LayoutInflater.Factory2 {

    /* renamed from: h0, reason: collision with root package name */
    public static final C0342j f3078h0 = new C0342j(0);

    /* renamed from: i0, reason: collision with root package name */
    public static final int[] f3079i0 = {R.attr.windowBackground};

    /* renamed from: j0, reason: collision with root package name */
    public static final boolean f3080j0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A, reason: collision with root package name */
    public ViewGroup f3081A;

    /* renamed from: B, reason: collision with root package name */
    public TextView f3082B;

    /* renamed from: C, reason: collision with root package name */
    public View f3083C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f3084D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3085E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3086F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3087G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f3088H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f3089I;
    public boolean J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f3090K;

    /* renamed from: L, reason: collision with root package name */
    public C0158A[] f3091L;

    /* renamed from: M, reason: collision with root package name */
    public C0158A f3092M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f3093N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f3094O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f3095P;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f3096Q;

    /* renamed from: R, reason: collision with root package name */
    public Configuration f3097R;

    /* renamed from: S, reason: collision with root package name */
    public final int f3098S;

    /* renamed from: T, reason: collision with root package name */
    public int f3099T;

    /* renamed from: U, reason: collision with root package name */
    public int f3100U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f3101V;

    /* renamed from: W, reason: collision with root package name */
    public x f3102W;

    /* renamed from: X, reason: collision with root package name */
    public x f3103X;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f3104Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f3105Z;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3107b0;

    /* renamed from: c0, reason: collision with root package name */
    public Rect f3108c0;

    /* renamed from: d0, reason: collision with root package name */
    public Rect f3109d0;

    /* renamed from: e0, reason: collision with root package name */
    public F f3110e0;

    /* renamed from: f0, reason: collision with root package name */
    public OnBackInvokedDispatcher f3111f0;

    /* renamed from: g0, reason: collision with root package name */
    public OnBackInvokedCallback f3112g0;
    public final Object j;

    /* renamed from: k, reason: collision with root package name */
    public final Context f3113k;

    /* renamed from: l, reason: collision with root package name */
    public Window f3114l;

    /* renamed from: m, reason: collision with root package name */
    public w f3115m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f3116n;

    /* renamed from: o, reason: collision with root package name */
    public M f3117o;

    /* renamed from: p, reason: collision with root package name */
    public C0184h f3118p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f3119q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0261j0 f3120r;

    /* renamed from: s, reason: collision with root package name */
    public r f3121s;

    /* renamed from: t, reason: collision with root package name */
    public r f3122t;

    /* renamed from: u, reason: collision with root package name */
    public AbstractC0177a f3123u;

    /* renamed from: v, reason: collision with root package name */
    public ActionBarContextView f3124v;

    /* renamed from: w, reason: collision with root package name */
    public PopupWindow f3125w;

    /* renamed from: x, reason: collision with root package name */
    public q f3126x;

    /* renamed from: z, reason: collision with root package name */
    public boolean f3128z;

    /* renamed from: y, reason: collision with root package name */
    public N f3127y = null;

    /* renamed from: a0, reason: collision with root package name */
    public final q f3106a0 = new q(this, 0);

    public LayoutInflaterFactory2C0159B(Context context, Window window, InterfaceC0169j interfaceC0169j, Object obj) {
        AbstractActivityC0168i abstractActivityC0168i = null;
        this.f3098S = -100;
        this.f3113k = context;
        this.j = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof AbstractActivityC0168i)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        abstractActivityC0168i = (AbstractActivityC0168i) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (abstractActivityC0168i != null) {
                this.f3098S = ((LayoutInflaterFactory2C0159B) abstractActivityC0168i.l()).f3098S;
            }
        }
        if (this.f3098S == -100) {
            C0342j c0342j = f3078h0;
            Integer num = (Integer) c0342j.get(this.j.getClass().getName());
            if (num != null) {
                this.f3098S = num.intValue();
                c0342j.remove(this.j.getClass().getName());
            }
        }
        if (window != null) {
            l(window);
        }
        C0281u.d();
    }

    public static K.g m(Context context) {
        K.g gVar;
        K.g gVar2;
        if (Build.VERSION.SDK_INT >= 33 || (gVar = p.f3225c) == null) {
            return null;
        }
        K.g b2 = u.b(context.getApplicationContext().getResources().getConfiguration());
        K.h hVar = gVar.f385a;
        if (hVar.f386a.isEmpty()) {
            gVar2 = K.g.f384b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b2.f385a.f386a.size() + hVar.f386a.size()) {
                Locale locale = i < hVar.f386a.size() ? hVar.f386a.get(i) : b2.f385a.f386a.get(i - hVar.f386a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            gVar2 = new K.g(new K.h(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return gVar2.f385a.f386a.isEmpty() ? b2 : gVar2;
    }

    public static Configuration s(Context context, int i, K.g gVar, Configuration configuration, boolean z2) {
        int i2 = i != 1 ? i != 2 ? z2 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = RecyclerView.f2111C0;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            u.d(configuration2, gVar);
        }
        return configuration2;
    }

    public final void A(int i) {
        this.f3105Z = (1 << i) | this.f3105Z;
        if (this.f3104Y) {
            return;
        }
        View decorView = this.f3114l.getDecorView();
        q qVar = this.f3106a0;
        WeakHashMap weakHashMap = O.K.f747a;
        decorView.postOnAnimation(qVar);
        this.f3104Y = true;
    }

    public final int B(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return x(context).f();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
                if (this.f3103X == null) {
                    this.f3103X = new x(this, context);
                }
                return this.f3103X.f();
            }
        }
        return i;
    }

    public final boolean C() {
        InterfaceC0263k0 interfaceC0263k0;
        X0 x02;
        boolean z2 = this.f3093N;
        this.f3093N = false;
        C0158A y2 = y(0);
        if (y2.f3074m) {
            if (!z2) {
                q(y2, true);
            }
            return true;
        }
        AbstractC0177a abstractC0177a = this.f3123u;
        if (abstractC0177a != null) {
            abstractC0177a.a();
            return true;
        }
        z();
        M m2 = this.f3117o;
        if (m2 == null || (interfaceC0263k0 = m2.e) == null || (x02 = ((c1) interfaceC0263k0).f3923a.f1856L) == null || x02.f3902b == null) {
            return false;
        }
        X0 x03 = ((c1) interfaceC0263k0).f3923a.f1856L;
        l.o oVar = x03 == null ? null : x03.f3902b;
        if (oVar != null) {
            oVar.collapseActionView();
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0173, code lost:
    
        if (r3.f3702f.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0153, code lost:
    
        if (r3 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(C0158A c0158a, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c0158a.f3074m || this.f3096Q) {
            return;
        }
        int i2 = c0158a.f3065a;
        Context context = this.f3113k;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f3114l.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, c0158a.f3071h)) {
            q(c0158a, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !F(c0158a, keyEvent)) {
            return;
        }
        z zVar = c0158a.e;
        if (zVar == null || c0158a.f3075n) {
            if (zVar == null) {
                z();
                M m2 = this.f3117o;
                Context w02 = m2 != null ? m2.w0() : null;
                if (w02 != null) {
                    context = w02;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.lumenpath.harispro.hrnavigator.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.lumenpath.harispro.hrnavigator.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.lumenpath.harispro.hrnavigator.R.style.Theme_AppCompat_CompactMenu, true);
                }
                C0179c c0179c = new C0179c(context, 0);
                c0179c.getTheme().setTo(newTheme);
                c0158a.j = c0179c;
                TypedArray obtainStyledAttributes = c0179c.obtainStyledAttributes(AbstractC0155a.j);
                c0158a.f3066b = obtainStyledAttributes.getResourceId(86, 0);
                c0158a.f3068d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                c0158a.e = new z(this, c0158a.j);
                c0158a.f3067c = 81;
            } else if (c0158a.f3075n && zVar.getChildCount() > 0) {
                c0158a.e.removeAllViews();
            }
            View view = c0158a.f3070g;
            if (view == null) {
                if (c0158a.f3071h != null) {
                    if (this.f3122t == null) {
                        this.f3122t = new r(this, 3);
                    }
                    r rVar = this.f3122t;
                    if (c0158a.i == null) {
                        C0225i c0225i = new C0225i(c0158a.j);
                        c0158a.i = c0225i;
                        c0225i.e = rVar;
                        MenuC0229m menuC0229m = c0158a.f3071h;
                        menuC0229m.b(c0225i, menuC0229m.f3709a);
                    }
                    C0225i c0225i2 = c0158a.i;
                    z zVar2 = c0158a.e;
                    if (c0225i2.f3701d == null) {
                        c0225i2.f3701d = (ExpandedMenuView) c0225i2.f3699b.inflate(com.lumenpath.harispro.hrnavigator.R.layout.abc_expanded_menu_layout, (ViewGroup) zVar2, false);
                        if (c0225i2.f3702f == null) {
                            c0225i2.f3702f = new C0224h(c0225i2);
                        }
                        c0225i2.f3701d.setAdapter((ListAdapter) c0225i2.f3702f);
                        c0225i2.f3701d.setOnItemClickListener(c0225i2);
                    }
                    ExpandedMenuView expandedMenuView = c0225i2.f3701d;
                    c0158a.f3069f = expandedMenuView;
                }
                c0158a.f3075n = true;
                return;
            }
            c0158a.f3069f = view;
            if (c0158a.f3069f != null) {
                if (c0158a.f3070g == null) {
                    C0225i c0225i3 = c0158a.i;
                    if (c0225i3.f3702f == null) {
                        c0225i3.f3702f = new C0224h(c0225i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = c0158a.f3069f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                c0158a.e.setBackgroundResource(c0158a.f3066b);
                ViewParent parent = c0158a.f3069f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c0158a.f3069f);
                }
                c0158a.e.addView(c0158a.f3069f, layoutParams2);
                if (!c0158a.f3069f.hasFocus()) {
                    c0158a.f3069f.requestFocus();
                }
            }
            c0158a.f3075n = true;
            return;
        }
        View view2 = c0158a.f3070g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            c0158a.f3073l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = c0158a.f3067c;
            layoutParams3.windowAnimations = c0158a.f3068d;
            windowManager.addView(c0158a.e, layoutParams3);
            c0158a.f3074m = true;
            if (i2 != 0) {
                H();
                return;
            }
            return;
        }
        i = -2;
        c0158a.f3073l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = c0158a.f3067c;
        layoutParams32.windowAnimations = c0158a.f3068d;
        windowManager.addView(c0158a.e, layoutParams32);
        c0158a.f3074m = true;
        if (i2 != 0) {
        }
    }

    public final boolean E(C0158A c0158a, int i, KeyEvent keyEvent) {
        MenuC0229m menuC0229m;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c0158a.f3072k || F(c0158a, keyEvent)) && (menuC0229m = c0158a.f3071h) != null) {
            return menuC0229m.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final boolean F(C0158A c0158a, KeyEvent keyEvent) {
        InterfaceC0261j0 interfaceC0261j0;
        InterfaceC0261j0 interfaceC0261j02;
        Resources.Theme theme;
        InterfaceC0261j0 interfaceC0261j03;
        InterfaceC0261j0 interfaceC0261j04;
        if (this.f3096Q) {
            return false;
        }
        if (c0158a.f3072k) {
            return true;
        }
        C0158A c0158a2 = this.f3092M;
        if (c0158a2 != null && c0158a2 != c0158a) {
            q(c0158a2, false);
        }
        Window.Callback callback = this.f3114l.getCallback();
        int i = c0158a.f3065a;
        if (callback != null) {
            c0158a.f3070g = callback.onCreatePanelView(i);
        }
        boolean z2 = i == 0 || i == 108;
        if (z2 && (interfaceC0261j04 = this.f3120r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0261j04;
            actionBarOverlayLayout.k();
            ((c1) actionBarOverlayLayout.e).f3931l = true;
        }
        if (c0158a.f3070g == null) {
            MenuC0229m menuC0229m = c0158a.f3071h;
            if (menuC0229m == null || c0158a.f3076o) {
                if (menuC0229m == null) {
                    Context context = this.f3113k;
                    if ((i == 0 || i == 108) && this.f3120r != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(com.lumenpath.harispro.hrnavigator.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(com.lumenpath.harispro.hrnavigator.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(com.lumenpath.harispro.hrnavigator.R.attr.actionBarWidgetTheme, typedValue, true);
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
                            C0179c c0179c = new C0179c(context, 0);
                            c0179c.getTheme().setTo(theme);
                            context = c0179c;
                        }
                    }
                    MenuC0229m menuC0229m2 = new MenuC0229m(context);
                    menuC0229m2.e = this;
                    MenuC0229m menuC0229m3 = c0158a.f3071h;
                    if (menuC0229m2 != menuC0229m3) {
                        if (menuC0229m3 != null) {
                            menuC0229m3.r(c0158a.i);
                        }
                        c0158a.f3071h = menuC0229m2;
                        C0225i c0225i = c0158a.i;
                        if (c0225i != null) {
                            menuC0229m2.b(c0225i, menuC0229m2.f3709a);
                        }
                    }
                    if (c0158a.f3071h == null) {
                        return false;
                    }
                }
                if (z2 && (interfaceC0261j02 = this.f3120r) != null) {
                    if (this.f3121s == null) {
                        this.f3121s = new r(this, 2);
                    }
                    ((ActionBarOverlayLayout) interfaceC0261j02).l(c0158a.f3071h, this.f3121s);
                }
                c0158a.f3071h.w();
                if (!callback.onCreatePanelMenu(i, c0158a.f3071h)) {
                    MenuC0229m menuC0229m4 = c0158a.f3071h;
                    if (menuC0229m4 != null) {
                        if (menuC0229m4 != null) {
                            menuC0229m4.r(c0158a.i);
                        }
                        c0158a.f3071h = null;
                    }
                    if (z2 && (interfaceC0261j0 = this.f3120r) != null) {
                        ((ActionBarOverlayLayout) interfaceC0261j0).l(null, this.f3121s);
                    }
                    return false;
                }
                c0158a.f3076o = false;
            }
            c0158a.f3071h.w();
            Bundle bundle = c0158a.f3077p;
            if (bundle != null) {
                c0158a.f3071h.s(bundle);
                c0158a.f3077p = null;
            }
            if (!callback.onPreparePanel(0, c0158a.f3070g, c0158a.f3071h)) {
                if (z2 && (interfaceC0261j03 = this.f3120r) != null) {
                    ((ActionBarOverlayLayout) interfaceC0261j03).l(null, this.f3121s);
                }
                c0158a.f3071h.v();
                return false;
            }
            c0158a.f3071h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
            c0158a.f3071h.v();
        }
        c0158a.f3072k = true;
        c0158a.f3073l = false;
        this.f3092M = c0158a;
        return true;
    }

    public final void G() {
        if (this.f3128z) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void H() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z2 = false;
            if (this.f3111f0 != null && (y(0).f3074m || this.f3123u != null)) {
                z2 = true;
            }
            if (z2 && this.f3112g0 == null) {
                this.f3112g0 = v.b(this.f3111f0, this);
            } else {
                if (z2 || (onBackInvokedCallback = this.f3112g0) == null) {
                    return;
                }
                v.c(this.f3111f0, onBackInvokedCallback);
                this.f3112g0 = null;
            }
        }
    }

    @Override // h.p
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f3113k);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C0159B) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // h.p
    public final void c() {
        String str;
        this.f3094O = true;
        k(false, true);
        w();
        Object obj = this.j;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = D.e.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                M m2 = this.f3117o;
                if (m2 == null) {
                    this.f3107b0 = true;
                } else {
                    m2.y0(true);
                }
            }
            synchronized (p.f3229h) {
                p.e(this);
                p.f3228g.add(new WeakReference(this));
            }
        }
        this.f3097R = new Configuration(this.f3113k.getResources().getConfiguration());
        this.f3095P = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // h.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d() {
        x xVar;
        x xVar2;
        if (this.j instanceof Activity) {
            synchronized (p.f3229h) {
                p.e(this);
            }
        }
        if (this.f3104Y) {
            this.f3114l.getDecorView().removeCallbacks(this.f3106a0);
        }
        this.f3096Q = true;
        if (this.f3098S != -100) {
            Object obj = this.j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f3078h0.put(this.j.getClass().getName(), Integer.valueOf(this.f3098S));
                xVar = this.f3102W;
                if (xVar != null) {
                    xVar.c();
                }
                xVar2 = this.f3103X;
                if (xVar2 == null) {
                    xVar2.c();
                    return;
                }
                return;
            }
        }
        f3078h0.remove(this.j.getClass().getName());
        xVar = this.f3102W;
        if (xVar != null) {
        }
        xVar2 = this.f3103X;
        if (xVar2 == null) {
        }
    }

    @Override // h.p
    public final boolean f(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.J && i == 108) {
            return false;
        }
        if (this.f3086F && i == 1) {
            this.f3086F = false;
        }
        if (i == 1) {
            G();
            this.J = true;
            return true;
        }
        if (i == 2) {
            G();
            this.f3084D = true;
            return true;
        }
        if (i == 5) {
            G();
            this.f3085E = true;
            return true;
        }
        if (i == 10) {
            G();
            this.f3088H = true;
            return true;
        }
        if (i == 108) {
            G();
            this.f3086F = true;
            return true;
        }
        if (i != 109) {
            return this.f3114l.requestFeature(i);
        }
        G();
        this.f3087G = true;
        return true;
    }

    @Override // h.p
    public final void g(int i) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f3081A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f3113k).inflate(i, viewGroup);
        this.f3115m.a(this.f3114l.getCallback());
    }

    @Override // h.p
    public final void h(View view) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f3081A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f3115m.a(this.f3114l.getCallback());
    }

    @Override // h.p
    public final void i(View view, ViewGroup.LayoutParams layoutParams) {
        v();
        ViewGroup viewGroup = (ViewGroup) this.f3081A.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f3115m.a(this.f3114l.getCallback());
    }

    @Override // h.p
    public final void j(CharSequence charSequence) {
        this.f3119q = charSequence;
        InterfaceC0261j0 interfaceC0261j0 = this.f3120r;
        if (interfaceC0261j0 != null) {
            interfaceC0261j0.setWindowTitle(charSequence);
            return;
        }
        M m2 = this.f3117o;
        if (m2 == null) {
            TextView textView = this.f3082B;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        c1 c1Var = (c1) m2.e;
        if (c1Var.f3928g) {
            return;
        }
        c1Var.f3929h = charSequence;
        if ((c1Var.f3924b & 8) != 0) {
            Toolbar toolbar = c1Var.f3923a;
            toolbar.setTitle(charSequence);
            if (c1Var.f3928g) {
                O.K.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(boolean z2, boolean z3) {
        int i;
        Configuration configuration;
        K.g b2;
        int i2;
        boolean z4;
        Activity activity;
        if (this.f3096Q) {
            return false;
        }
        int i3 = this.f3098S;
        if (i3 == -100) {
            i3 = p.f3224b;
        }
        Context context = this.f3113k;
        int B2 = B(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        K.g m2 = i4 < 33 ? m(context) : null;
        if (!z3 && m2 != null) {
            m2 = u.b(context.getResources().getConfiguration());
        }
        Configuration s2 = s(context, B2, m2, null, false);
        boolean z5 = this.f3101V;
        Object obj = this.j;
        boolean z6 = true;
        if (!z5 && (obj instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f3097R;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = s2.uiMode & 48;
                K.g b3 = u.b(configuration);
                b2 = m2 != null ? null : u.b(s2);
                i2 = i5 == i6 ? 512 : 0;
                if (b2 != null && !b3.equals(b2)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z2 && this.f3094O && ((f3080j0 || this.f3095P) && (obj instanceof Activity))) {
                    activity = (Activity) obj;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(s2.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new D.a(0, activity));
                        }
                        z4 = true;
                        if (!z4 || i2 == 0) {
                            z6 = z4;
                        } else {
                            boolean z7 = (i2 & i) == i2;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
                            if (b2 != null) {
                                u.d(configuration2, b2);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = this.f3099T;
                            if (i8 != 0) {
                                context.setTheme(i8);
                                context.getTheme().applyStyle(this.f3099T, true);
                            }
                            if (z7 && (obj instanceof Activity)) {
                                Activity activity2 = (Activity) obj;
                                if (activity2 instanceof InterfaceC0101s) {
                                    if (((InterfaceC0101s) activity2).d().f2048c.compareTo(EnumC0097n.f2040c) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f3095P && !this.f3096Q) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z6 && (obj instanceof AbstractActivityC0168i)) {
                            if ((i2 & 512) != 0) {
                            }
                            if ((i2 & 4) != 0) {
                            }
                        }
                        if (b2 != null) {
                            u.c(u.b(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            x(context).j();
                        } else {
                            x xVar = this.f3102W;
                            if (xVar != null) {
                                xVar.c();
                            }
                        }
                        if (i3 == 3) {
                            if (this.f3103X == null) {
                                this.f3103X = new x(this, context);
                            }
                            this.f3103X.j();
                        } else {
                            x xVar2 = this.f3103X;
                            if (xVar2 != null) {
                                xVar2.c();
                            }
                        }
                        return z6;
                    }
                }
                z4 = false;
                if (z4) {
                }
                z6 = z4;
                if (z6) {
                    if ((i2 & 512) != 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                }
                if (b2 != null) {
                }
                if (i3 == 0) {
                }
                if (i3 == 3) {
                }
                return z6;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj.getClass()), i4 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f3100U = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.f3100U = 0;
            }
        }
        this.f3101V = true;
        i = this.f3100U;
        configuration = this.f3097R;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = s2.uiMode & 48;
        K.g b32 = u.b(configuration);
        if (m2 != null) {
        }
        if (i52 == i62) {
        }
        if (b2 != null) {
            i2 |= 8196;
        }
        if (((~i) & i2) != 0) {
            activity = (Activity) obj;
            if (!activity.isChild()) {
            }
        }
        z4 = false;
        if (z4) {
        }
        z6 = z4;
        if (z6) {
        }
        if (b2 != null) {
        }
        if (i3 == 0) {
        }
        if (i3 == 3) {
        }
        return z6;
    }

    public final void l(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.f3114l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof w) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        w wVar = new w(this, callback);
        this.f3115m = wVar;
        window.setCallback(wVar);
        int[] iArr = f3079i0;
        Context context = this.f3113k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            C0281u a2 = C0281u.a();
            synchronized (a2) {
                drawable = a2.f4028a.d(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f3114l = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f3111f0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f3112g0) != null) {
            v.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f3112g0 = null;
        }
        Object obj = this.j;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f3111f0 = v.a(activity);
                H();
            }
        }
        this.f3111f0 = null;
        H();
    }

    public final void n(int i, C0158A c0158a, MenuC0229m menuC0229m) {
        if (menuC0229m == null) {
            if (c0158a == null && i >= 0) {
                C0158A[] c0158aArr = this.f3091L;
                if (i < c0158aArr.length) {
                    c0158a = c0158aArr[i];
                }
            }
            if (c0158a != null) {
                menuC0229m = c0158a.f3071h;
            }
        }
        if ((c0158a == null || c0158a.f3074m) && !this.f3096Q) {
            w wVar = this.f3115m;
            Window.Callback callback = this.f3114l.getCallback();
            wVar.getClass();
            try {
                wVar.f3238d = true;
                callback.onPanelClosed(i, menuC0229m);
            } finally {
                wVar.f3238d = false;
            }
        }
    }

    public final void o(MenuC0229m menuC0229m) {
        C0264l c0264l;
        if (this.f3090K) {
            return;
        }
        this.f3090K = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f3120r;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((c1) actionBarOverlayLayout.e).f3923a.f1862a;
        if (actionMenuView != null && (c0264l = actionMenuView.f1826t) != null) {
            c0264l.c();
            C0254g c0254g = c0264l.f3976u;
            if (c0254g != null && c0254g.b()) {
                c0254g.i.dismiss();
            }
        }
        Window.Callback callback = this.f3114l.getCallback();
        if (callback != null && !this.f3096Q) {
            callback.onPanelClosed(108, menuC0229m);
        }
        this.f3090K = false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0115, code lost:
    
        if (r2.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c0239e;
        int i;
        String str2 = str;
        char c2 = 4;
        View view2 = null;
        if (this.f3110e0 == null) {
            int[] iArr = AbstractC0155a.j;
            Context context2 = this.f3113k;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f3110e0 = new F();
            } else {
                try {
                    this.f3110e0 = (F) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f3110e0 = new F();
                }
            }
        }
        F f2 = this.f3110e0;
        int i2 = e1.f3935a;
        f2.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0155a.f3054x, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c0179c = (resourceId == 0 || ((context instanceof C0179c) && ((C0179c) context).f3312a == resourceId)) ? context : new C0179c(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str2.equals("RatingBar")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1455429095:
                if (str2.equals("CheckedTextView")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1346021293:
                if (str2.equals("MultiAutoCompleteTextView")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -938935918:
                if (str2.equals("TextView")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str2.equals("SeekBar")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -339785223:
                if (str2.equals("Spinner")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 776382189:
                if (str2.equals("RadioButton")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 799298502:
                if (str2.equals("ToggleButton")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case 1125864064:
                if (str2.equals("ImageView")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 1413872058:
                if (str2.equals("AutoCompleteTextView")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 1601505219:
                if (str2.equals("CheckBox")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 1666676343:
                if (str2.equals("EditText")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case 2001146706:
                if (str2.equals("Button")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
                c0239e = new C0239E(c0179c, attributeSet);
                break;
            case 1:
                c0239e = new C0277s(c0179c, attributeSet);
                break;
            case 2:
                c0239e = new C0235A(c0179c, attributeSet);
                break;
            case 3:
                c0239e = f2.e(c0179c, attributeSet);
                break;
            case 4:
                c0239e = new C0289y(c0179c, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.imageButtonStyle);
                break;
            case 5:
                c0239e = new C0241G(c0179c, attributeSet);
                break;
            case 6:
                c0239e = new Q(c0179c, attributeSet);
                break;
            case 7:
                c0239e = f2.d(c0179c, attributeSet);
                break;
            case '\b':
                c0239e = new C0257h0(c0179c, attributeSet);
                break;
            case '\t':
                c0239e = new C0291z(c0179c, attributeSet, 0);
                break;
            case '\n':
                c0239e = f2.a(c0179c, attributeSet);
                break;
            case 11:
                c0239e = f2.c(c0179c, attributeSet);
                break;
            case '\f':
                c0239e = new C0285w(c0179c, attributeSet);
                break;
            case '\r':
                c0239e = f2.b(c0179c, attributeSet);
                break;
            default:
                c0239e = null;
                break;
        }
        if (c0239e == null && context != c0179c) {
            Object[] objArr = f2.f3141a;
            if (str2.equals("view")) {
                str2 = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c0179c;
                objArr[1] = attributeSet;
                if (-1 == str2.indexOf(46)) {
                    int i3 = 0;
                    while (true) {
                        String[] strArr = F.f3139g;
                        if (i3 < 3) {
                            View f3 = f2.f(c0179c, str2, strArr[i3]);
                            if (f3 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = f3;
                            } else {
                                i3++;
                            }
                        }
                    }
                } else {
                    View f4 = f2.f(c0179c, str2, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f4;
                }
            } catch (Exception unused) {
            } finally {
                objArr[0] = null;
                objArr[1] = null;
            }
            c0239e = view2;
        }
        if (c0239e != null) {
            Context context3 = c0239e.getContext();
            if ((context3 instanceof ContextWrapper) && c0239e.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, F.f3136c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c0239e.setOnClickListener(new E(c0239e, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c0179c.obtainStyledAttributes(attributeSet, F.f3137d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = O.K.f747a;
                    i = 0;
                    new C0046w(com.lumenpath.harispro.hrnavigator.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).d(c0239e, Boolean.valueOf(z2));
                } else {
                    i = 0;
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c0179c.obtainStyledAttributes(attributeSet, F.e);
                if (obtainStyledAttributes5.hasValue(i)) {
                    O.K.m(c0239e, obtainStyledAttributes5.getString(i));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c0179c.obtainStyledAttributes(attributeSet, F.f3138f);
                if (obtainStyledAttributes6.hasValue(i)) {
                    boolean z3 = obtainStyledAttributes6.getBoolean(i, i);
                    WeakHashMap weakHashMap2 = O.K.f747a;
                    new C0046w(com.lumenpath.harispro.hrnavigator.R.id.tag_screen_reader_focusable, Boolean.class, i, 28, 0).d(c0239e, Boolean.valueOf(z3));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c0239e;
    }

    @Override // l.InterfaceC0227k
    public final boolean p(MenuC0229m menuC0229m, MenuItem menuItem) {
        C0158A c0158a;
        Window.Callback callback = this.f3114l.getCallback();
        if (callback != null && !this.f3096Q) {
            MenuC0229m k2 = menuC0229m.k();
            C0158A[] c0158aArr = this.f3091L;
            int length = c0158aArr != null ? c0158aArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c0158a = c0158aArr[i];
                    if (c0158a != null && c0158a.f3071h == k2) {
                        break;
                    }
                    i++;
                } else {
                    c0158a = null;
                    break;
                }
            }
            if (c0158a != null) {
                return callback.onMenuItemSelected(c0158a.f3065a, menuItem);
            }
        }
        return false;
    }

    public final void q(C0158A c0158a, boolean z2) {
        z zVar;
        InterfaceC0261j0 interfaceC0261j0;
        C0264l c0264l;
        if (z2 && c0158a.f3065a == 0 && (interfaceC0261j0 = this.f3120r) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0261j0;
            actionBarOverlayLayout.k();
            ActionMenuView actionMenuView = ((c1) actionBarOverlayLayout.e).f3923a.f1862a;
            if (actionMenuView != null && (c0264l = actionMenuView.f1826t) != null && c0264l.g()) {
                o(c0158a.f3071h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f3113k.getSystemService("window");
        if (windowManager != null && c0158a.f3074m && (zVar = c0158a.e) != null) {
            windowManager.removeView(zVar);
            if (z2) {
                n(c0158a.f3065a, c0158a, null);
            }
        }
        c0158a.f3072k = false;
        c0158a.f3073l = false;
        c0158a.f3074m = false;
        c0158a.f3069f = null;
        c0158a.f3075n = true;
        if (this.f3092M == c0158a) {
            this.f3092M = null;
        }
        if (c0158a.f3065a == 0) {
            H();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.g() != false) goto L20;
     */
    @Override // l.InterfaceC0227k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(MenuC0229m menuC0229m) {
        ActionMenuView actionMenuView;
        C0264l c0264l;
        C0264l c0264l2;
        C0264l c0264l3;
        InterfaceC0261j0 interfaceC0261j0 = this.f3120r;
        if (interfaceC0261j0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0261j0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((c1) actionBarOverlayLayout.e).f3923a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1862a) != null && actionMenuView.f1825s) {
                if (ViewConfiguration.get(this.f3113k).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f3120r;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((c1) actionBarOverlayLayout2.e).f3923a.f1862a;
                    if (actionMenuView2 != null) {
                        C0264l c0264l4 = actionMenuView2.f1826t;
                        if (c0264l4 != null) {
                            if (c0264l4.f3977v == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f3114l.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f3120r;
                actionBarOverlayLayout3.k();
                ActionMenuView actionMenuView3 = ((c1) actionBarOverlayLayout3.e).f3923a.f1862a;
                if ((actionMenuView3 == null || (c0264l3 = actionMenuView3.f1826t) == null || !c0264l3.g()) ? false : true) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f3120r;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView4 = ((c1) actionBarOverlayLayout4.e).f3923a.f1862a;
                    if (actionMenuView4 != null && (c0264l2 = actionMenuView4.f1826t) != null) {
                        c0264l2.c();
                    }
                    if (this.f3096Q) {
                        return;
                    }
                    callback.onPanelClosed(108, y(0).f3071h);
                    return;
                }
                if (callback == null || this.f3096Q) {
                    return;
                }
                if (this.f3104Y && (1 & this.f3105Z) != 0) {
                    View decorView = this.f3114l.getDecorView();
                    q qVar = this.f3106a0;
                    decorView.removeCallbacks(qVar);
                    qVar.run();
                }
                C0158A y2 = y(0);
                MenuC0229m menuC0229m2 = y2.f3071h;
                if (menuC0229m2 == null || y2.f3076o || !callback.onPreparePanel(0, y2.f3070g, menuC0229m2)) {
                    return;
                }
                callback.onMenuOpened(108, y2.f3071h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f3120r;
                actionBarOverlayLayout5.k();
                ActionMenuView actionMenuView5 = ((c1) actionBarOverlayLayout5.e).f3923a.f1862a;
                if (actionMenuView5 == null || (c0264l = actionMenuView5.f1826t) == null) {
                    return;
                }
                c0264l.o();
                return;
            }
        }
        C0158A y3 = y(0);
        y3.f3075n = true;
        q(y3, false);
        D(y3, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00db, code lost:
    
        if (r7.c() != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0101, code lost:
    
        if (r7.o() != false) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean t(KeyEvent keyEvent) {
        View decorView;
        boolean z2;
        boolean z3;
        ActionMenuView actionMenuView;
        C0264l c0264l;
        Object obj = this.j;
        if (((obj instanceof InterfaceC0034j) || (obj instanceof D)) && (decorView = this.f3114l.getDecorView()) != null && AbstractC0078a.u(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82) {
            w wVar = this.f3115m;
            Window.Callback callback = this.f3114l.getCallback();
            wVar.getClass();
            try {
                wVar.f3237c = true;
                if (callback.dispatchKeyEvent(keyEvent)) {
                    return true;
                }
            } finally {
                wVar.f3237c = false;
            }
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyEvent.getAction() == 0) {
            if (keyCode == 4) {
                this.f3093N = (keyEvent.getFlags() & 128) != 0;
            } else if (keyCode == 82) {
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
                C0158A y2 = y(0);
                if (y2.f3074m) {
                    return true;
                }
                F(y2, keyEvent);
                return true;
            }
        } else if (keyCode != 4) {
            if (keyCode == 82) {
                if (this.f3123u != null) {
                    return true;
                }
                C0158A y3 = y(0);
                InterfaceC0261j0 interfaceC0261j0 = this.f3120r;
                Context context = this.f3113k;
                if (interfaceC0261j0 != null) {
                    ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0261j0;
                    actionBarOverlayLayout.k();
                    Toolbar toolbar = ((c1) actionBarOverlayLayout.e).f3923a;
                    if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f1862a) != null && actionMenuView.f1825s && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                        ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f3120r;
                        actionBarOverlayLayout2.k();
                        ActionMenuView actionMenuView2 = ((c1) actionBarOverlayLayout2.e).f3923a.f1862a;
                        if (actionMenuView2 == null || (c0264l = actionMenuView2.f1826t) == null || !c0264l.g()) {
                            if (!this.f3096Q && F(y3, keyEvent)) {
                                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f3120r;
                                actionBarOverlayLayout3.k();
                                ActionMenuView actionMenuView3 = ((c1) actionBarOverlayLayout3.e).f3923a.f1862a;
                                if (actionMenuView3 != null) {
                                    C0264l c0264l2 = actionMenuView3.f1826t;
                                    if (c0264l2 != null) {
                                    }
                                }
                            }
                            z2 = false;
                        } else {
                            ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f3120r;
                            actionBarOverlayLayout4.k();
                            ActionMenuView actionMenuView4 = ((c1) actionBarOverlayLayout4.e).f3923a.f1862a;
                            if (actionMenuView4 != null) {
                                C0264l c0264l3 = actionMenuView4.f1826t;
                                if (c0264l3 != null) {
                                }
                            }
                            z2 = false;
                        }
                        if (z2) {
                            return true;
                        }
                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                        if (audioManager != null) {
                            audioManager.playSoundEffect(0);
                            return true;
                        }
                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                        return true;
                    }
                }
                boolean z4 = y3.f3074m;
                if (z4 || y3.f3073l) {
                    q(y3, true);
                    z2 = z4;
                    if (z2) {
                    }
                } else {
                    if (y3.f3072k) {
                        if (y3.f3076o) {
                            y3.f3072k = false;
                            z3 = F(y3, keyEvent);
                        } else {
                            z3 = true;
                        }
                        if (z3) {
                            D(y3, keyEvent);
                            z2 = true;
                            if (z2) {
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                }
            }
        } else if (C()) {
            return true;
        }
        return false;
    }

    public final void u(int i) {
        C0158A y2 = y(i);
        if (y2.f3071h != null) {
            Bundle bundle = new Bundle();
            y2.f3071h.t(bundle);
            if (bundle.size() > 0) {
                y2.f3077p = bundle;
            }
            y2.f3071h.w();
            y2.f3071h.clear();
        }
        y2.f3076o = true;
        y2.f3075n = true;
        if ((i == 108 || i == 0) && this.f3120r != null) {
            C0158A y3 = y(0);
            y3.f3072k = false;
            F(y3, null);
        }
    }

    public final void v() {
        ViewGroup viewGroup;
        int i = 1;
        int i2 = 0;
        if (this.f3128z) {
            return;
        }
        int[] iArr = AbstractC0155a.j;
        Context context = this.f3113k;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(126, false)) {
            f(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            f(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            f(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            f(10);
        }
        this.f3089I = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        w();
        this.f3114l.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.J) {
            viewGroup = this.f3088H ? (ViewGroup) from.inflate(com.lumenpath.harispro.hrnavigator.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.lumenpath.harispro.hrnavigator.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f3089I) {
            viewGroup = (ViewGroup) from.inflate(com.lumenpath.harispro.hrnavigator.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f3087G = false;
            this.f3086F = false;
        } else if (this.f3086F) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.lumenpath.harispro.hrnavigator.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C0179c(context, typedValue.resourceId) : context).inflate(com.lumenpath.harispro.hrnavigator.R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC0261j0 interfaceC0261j0 = (InterfaceC0261j0) viewGroup.findViewById(com.lumenpath.harispro.hrnavigator.R.id.decor_content_parent);
            this.f3120r = interfaceC0261j0;
            interfaceC0261j0.setWindowCallback(this.f3114l.getCallback());
            if (this.f3087G) {
                ((ActionBarOverlayLayout) this.f3120r).j(109);
            }
            if (this.f3084D) {
                ((ActionBarOverlayLayout) this.f3120r).j(2);
            }
            if (this.f3085E) {
                ((ActionBarOverlayLayout) this.f3120r).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f3086F + ", windowActionBarOverlay: " + this.f3087G + ", android:windowIsFloating: " + this.f3089I + ", windowActionModeOverlay: " + this.f3088H + ", windowNoTitle: " + this.J + " }");
        }
        r rVar = new r(this, i2);
        WeakHashMap weakHashMap = O.K.f747a;
        O.B.l(viewGroup, rVar);
        if (this.f3120r == null) {
            this.f3082B = (TextView) viewGroup.findViewById(com.lumenpath.harispro.hrnavigator.R.id.title);
        }
        boolean z2 = h1.f3952a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.lumenpath.harispro.hrnavigator.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f3114l.findViewById(R.id.content);
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
        this.f3114l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new r(this, i));
        this.f3081A = viewGroup;
        Object obj = this.j;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.f3119q;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC0261j0 interfaceC0261j02 = this.f3120r;
            if (interfaceC0261j02 != null) {
                interfaceC0261j02.setWindowTitle(title);
            } else {
                M m2 = this.f3117o;
                if (m2 != null) {
                    c1 c1Var = (c1) m2.e;
                    if (!c1Var.f3928g) {
                        c1Var.f3929h = title;
                        if ((c1Var.f3924b & 8) != 0) {
                            Toolbar toolbar = c1Var.f3923a;
                            toolbar.setTitle(title);
                            if (c1Var.f3928g) {
                                O.K.m(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.f3082B;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f3081A.findViewById(R.id.content);
        View decorView = this.f3114l.getDecorView();
        contentFrameLayout2.f1842g.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f3128z = true;
        C0158A y2 = y(0);
        if (this.f3096Q || y2.f3071h != null) {
            return;
        }
        A(108);
    }

    public final void w() {
        if (this.f3114l == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                l(((Activity) obj).getWindow());
            }
        }
        if (this.f3114l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final AbstractC0059g x(Context context) {
        if (this.f3102W == null) {
            if (M0.h.e == null) {
                Context applicationContext = context.getApplicationContext();
                M0.h.e = new M0.h(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f3102W = new x(this, M0.h.e);
        }
        return this.f3102W;
    }

    public final C0158A y(int i) {
        C0158A[] c0158aArr = this.f3091L;
        if (c0158aArr == null || c0158aArr.length <= i) {
            C0158A[] c0158aArr2 = new C0158A[i + 1];
            if (c0158aArr != null) {
                System.arraycopy(c0158aArr, 0, c0158aArr2, 0, c0158aArr.length);
            }
            this.f3091L = c0158aArr2;
            c0158aArr = c0158aArr2;
        }
        C0158A c0158a = c0158aArr[i];
        if (c0158a != null) {
            return c0158a;
        }
        C0158A c0158a2 = new C0158A();
        c0158a2.f3065a = i;
        c0158a2.f3075n = false;
        c0158aArr[i] = c0158a2;
        return c0158a2;
    }

    public final void z() {
        v();
        if (this.f3086F && this.f3117o == null) {
            Object obj = this.j;
            if (obj instanceof Activity) {
                this.f3117o = new M((Activity) obj, this.f3087G);
            } else if (obj instanceof Dialog) {
                this.f3117o = new M((Dialog) obj);
            }
            M m2 = this.f3117o;
            if (m2 != null) {
                m2.y0(this.f3107b0);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
