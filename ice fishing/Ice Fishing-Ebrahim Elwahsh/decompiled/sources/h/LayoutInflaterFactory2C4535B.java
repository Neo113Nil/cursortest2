package h;

import D.AbstractC0290j;
import D.RunnableC0281a;
import O.C0343e0;
import O.InterfaceC0348j;
import O.X;
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
import androidx.lifecycle.C0515x;
import androidx.lifecycle.EnumC0507o;
import androidx.lifecycle.InterfaceC0513v;
import com.facebook.ads.AdError;
import com.icefishing.icefishingliveapp.C5284R;
import g.AbstractC4518a;
import g1.C4524d;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC4614b;
import k.C4616d;
import k.C4617e;
import k.C4621i;
import k.InterfaceC4613a;
import l.C4679g;
import l.C4680h;
import l.InterfaceC4682j;
import m.C4716C;
import m.C4718E;
import m.C4734f0;
import m.C4735g;
import m.C4743k;
import m.C4758s;
import m.C4762u;
import m.C4766w;
import m.C4768x;
import m.C4770y;
import m.InterfaceC4738h0;
import m.O;
import m.Q0;
import m.Y0;
import m.d1;
import m.g1;

/* renamed from: h.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C4535B extends q implements InterfaceC4682j, LayoutInflater.Factory2 {

    /* renamed from: N0, reason: collision with root package name */
    public static final s.k f37967N0 = new s.k();

    /* renamed from: O0, reason: collision with root package name */
    public static final int[] f37968O0 = {R.attr.windowBackground};

    /* renamed from: P0, reason: collision with root package name */
    public static final boolean f37969P0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A0, reason: collision with root package name */
    public int f37970A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f37971B0;

    /* renamed from: C, reason: collision with root package name */
    public final Object f37972C;
    public y C0;

    /* renamed from: D, reason: collision with root package name */
    public final Context f37973D;

    /* renamed from: D0, reason: collision with root package name */
    public y f37974D0;

    /* renamed from: E, reason: collision with root package name */
    public Window f37975E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f37976E0;

    /* renamed from: F, reason: collision with root package name */
    public x f37977F;

    /* renamed from: F0, reason: collision with root package name */
    public int f37978F0;

    /* renamed from: G, reason: collision with root package name */
    public final Object f37979G;

    /* renamed from: H, reason: collision with root package name */
    public AbstractC4542a f37981H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f37982H0;

    /* renamed from: I, reason: collision with root package name */
    public C4621i f37983I;

    /* renamed from: I0, reason: collision with root package name */
    public Rect f37984I0;
    public CharSequence J;

    /* renamed from: J0, reason: collision with root package name */
    public Rect f37985J0;

    /* renamed from: K, reason: collision with root package name */
    public InterfaceC4738h0 f37986K;

    /* renamed from: K0, reason: collision with root package name */
    public C4538E f37987K0;

    /* renamed from: L, reason: collision with root package name */
    public I0.j f37988L;

    /* renamed from: L0, reason: collision with root package name */
    public OnBackInvokedDispatcher f37989L0;

    /* renamed from: M, reason: collision with root package name */
    public s f37990M;

    /* renamed from: M0, reason: collision with root package name */
    public OnBackInvokedCallback f37991M0;

    /* renamed from: N, reason: collision with root package name */
    public AbstractC4614b f37992N;

    /* renamed from: O, reason: collision with root package name */
    public ActionBarContextView f37993O;

    /* renamed from: P, reason: collision with root package name */
    public PopupWindow f37994P;

    /* renamed from: Q, reason: collision with root package name */
    public r f37995Q;

    /* renamed from: S, reason: collision with root package name */
    public boolean f37997S;

    /* renamed from: T, reason: collision with root package name */
    public ViewGroup f37998T;

    /* renamed from: U, reason: collision with root package name */
    public TextView f37999U;

    /* renamed from: V, reason: collision with root package name */
    public View f38000V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f38001W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f38002X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f38003Z;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f38004n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f38005o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f38006p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f38007q0;

    /* renamed from: r0, reason: collision with root package name */
    public C4534A[] f38008r0;

    /* renamed from: s0, reason: collision with root package name */
    public C4534A f38009s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f38010t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f38011u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f38012v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f38013w0;

    /* renamed from: x0, reason: collision with root package name */
    public Configuration f38014x0;

    /* renamed from: y0, reason: collision with root package name */
    public final int f38015y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f38016z0;

    /* renamed from: R, reason: collision with root package name */
    public C0343e0 f37996R = null;

    /* renamed from: G0, reason: collision with root package name */
    public final r f37980G0 = new r(this, 0);

    public LayoutInflaterFactory2C4535B(Context context, Window window, InterfaceC4554m interfaceC4554m, Object obj) {
        AbstractActivityC4553l abstractActivityC4553l;
        this.f38015y0 = -100;
        this.f37973D = context;
        this.f37979G = interfaceC4554m;
        this.f37972C = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC4553l)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC4553l = (AbstractActivityC4553l) context;
                    break;
                }
            }
            abstractActivityC4553l = null;
            if (abstractActivityC4553l != null) {
                this.f38015y0 = ((LayoutInflaterFactory2C4535B) abstractActivityC4553l.getDelegate()).f38015y0;
            }
        }
        if (this.f38015y0 == -100) {
            s.k kVar = f37967N0;
            Integer num = (Integer) kVar.getOrDefault(this.f37972C.getClass().getName(), null);
            if (num != null) {
                this.f38015y0 = num.intValue();
                kVar.remove(this.f37972C.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        C4758s.d();
    }

    public static K.l q(Context context) {
        K.l lVar;
        K.l lVar2;
        if (Build.VERSION.SDK_INT >= 33 || (lVar = q.f38122v) == null) {
            return null;
        }
        K.l b9 = v.b(context.getApplicationContext().getResources().getConfiguration());
        K.m mVar = lVar.f1480a;
        if (mVar.f1481a.isEmpty()) {
            lVar2 = K.l.f1479b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b9.f1480a.f1481a.size() + mVar.f1481a.size()) {
                Locale locale = i < mVar.f1481a.size() ? mVar.f1481a.get(i) : b9.f1480a.f1481a.get(i - mVar.f1481a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            lVar2 = new K.l(new K.m(K.k.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return lVar2.f1480a.f1481a.isEmpty() ? b9 : lVar2;
    }

    public static Configuration u(Context context, int i, K.l lVar, Configuration configuration, boolean z8) {
        int i4 = i != 1 ? i != 2 ? z8 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
        if (lVar != null) {
            v.d(configuration2, lVar);
        }
        return configuration2;
    }

    public final D2.a A(Context context) {
        if (this.C0 == null) {
            if (Y2.e.f3961y == null) {
                Context applicationContext = context.getApplicationContext();
                Y2.e.f3961y = new Y2.e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.C0 = new y(this, Y2.e.f3961y);
        }
        return this.C0;
    }

    public final C4534A B(int i) {
        C4534A[] c4534aArr = this.f38008r0;
        if (c4534aArr == null || c4534aArr.length <= i) {
            C4534A[] c4534aArr2 = new C4534A[i + 1];
            if (c4534aArr != null) {
                System.arraycopy(c4534aArr, 0, c4534aArr2, 0, c4534aArr.length);
            }
            this.f38008r0 = c4534aArr2;
            c4534aArr = c4534aArr2;
        }
        C4534A c4534a = c4534aArr[i];
        if (c4534a != null) {
            return c4534a;
        }
        C4534A c4534a2 = new C4534A();
        c4534a2.f37952a = i;
        c4534a2.f37964n = false;
        c4534aArr[i] = c4534a2;
        return c4534a2;
    }

    public final void C() {
        x();
        if (this.Y && this.f37981H == null) {
            Object obj = this.f37972C;
            if (obj instanceof Activity) {
                this.f37981H = new M((Activity) obj, this.f38003Z);
            } else if (obj instanceof Dialog) {
                this.f37981H = new M((Dialog) obj);
            }
            AbstractC4542a abstractC4542a = this.f37981H;
            if (abstractC4542a != null) {
                abstractC4542a.l(this.f37982H0);
            }
        }
    }

    public final void D(int i) {
        this.f37978F0 = (1 << i) | this.f37978F0;
        if (this.f37976E0) {
            return;
        }
        View decorView = this.f37975E.getDecorView();
        r rVar = this.f37980G0;
        WeakHashMap weakHashMap = X.f2240a;
        decorView.postOnAnimation(rVar);
        this.f37976E0 = true;
    }

    public final int E(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f37974D0 == null) {
                            this.f37974D0 = new y(this, context);
                        }
                        return this.f37974D0.f();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return A(context).f();
                }
            }
            return i;
        }
        return -1;
    }

    public final boolean F() {
        boolean z8 = this.f38010t0;
        this.f38010t0 = false;
        C4534A B8 = B(0);
        if (!B8.f37963m) {
            AbstractC4614b abstractC4614b = this.f37992N;
            if (abstractC4614b != null) {
                abstractC4614b.a();
                return true;
            }
            C();
            AbstractC4542a abstractC4542a = this.f37981H;
            if (abstractC4542a == null || !abstractC4542a.b()) {
                return false;
            }
        } else if (!z8) {
            t(B8, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0164, code lost:
    
        if (r15.f38938y.getCount() > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0144, code lost:
    
        if (r15 != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(C4534A c4534a, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (c4534a.f37963m || this.f38013w0) {
            return;
        }
        int i4 = c4534a.f37952a;
        Context context = this.f37973D;
        if (i4 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f37975E.getCallback();
        if (callback != null && !callback.onMenuOpened(i4, c4534a.f37959h)) {
            t(c4534a, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !I(c4534a, keyEvent)) {
            return;
        }
        z zVar = c4534a.f37956e;
        if (zVar == null || c4534a.f37964n) {
            if (zVar == null) {
                Context z8 = z();
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = z8.getResources().newTheme();
                newTheme.setTo(z8.getTheme());
                newTheme.resolveAttribute(C5284R.attr.actionBarPopupTheme, typedValue, true);
                int i9 = typedValue.resourceId;
                if (i9 != 0) {
                    newTheme.applyStyle(i9, true);
                }
                newTheme.resolveAttribute(C5284R.attr.panelMenuListTheme, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    newTheme.applyStyle(i10, true);
                } else {
                    newTheme.applyStyle(C5284R.style.Theme_AppCompat_CompactMenu, true);
                }
                C4616d c4616d = new C4616d(z8, 0);
                c4616d.getTheme().setTo(newTheme);
                c4534a.f37960j = c4616d;
                TypedArray obtainStyledAttributes = c4616d.obtainStyledAttributes(AbstractC4518a.f37826j);
                c4534a.f37953b = obtainStyledAttributes.getResourceId(86, 0);
                c4534a.f37955d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                c4534a.f37956e = new z(this, c4534a.f37960j);
                c4534a.f37954c = 81;
            } else if (c4534a.f37964n && zVar.getChildCount() > 0) {
                c4534a.f37956e.removeAllViews();
            }
            View view = c4534a.f37958g;
            if (view == null) {
                if (c4534a.f37959h != null) {
                    if (this.f37990M == null) {
                        this.f37990M = new s(this);
                    }
                    s sVar = this.f37990M;
                    if (c4534a.i == null) {
                        C4680h c4680h = new C4680h(c4534a.f37960j);
                        c4534a.i = c4680h;
                        c4680h.f38937x = sVar;
                        l.l lVar = c4534a.f37959h;
                        lVar.b(c4680h, lVar.f38962n);
                    }
                    C4680h c4680h2 = c4534a.i;
                    z zVar2 = c4534a.f37956e;
                    if (c4680h2.f38936w == null) {
                        c4680h2.f38936w = (ExpandedMenuView) c4680h2.f38934u.inflate(C5284R.layout.abc_expanded_menu_layout, (ViewGroup) zVar2, false);
                        if (c4680h2.f38938y == null) {
                            c4680h2.f38938y = new C4679g(c4680h2);
                        }
                        c4680h2.f38936w.setAdapter((ListAdapter) c4680h2.f38938y);
                        c4680h2.f38936w.setOnItemClickListener(c4680h2);
                    }
                    ExpandedMenuView expandedMenuView = c4680h2.f38936w;
                    c4534a.f37957f = expandedMenuView;
                }
                c4534a.f37964n = true;
                return;
            }
            c4534a.f37957f = view;
            if (c4534a.f37957f != null) {
                if (c4534a.f37958g == null) {
                    C4680h c4680h3 = c4534a.i;
                    if (c4680h3.f38938y == null) {
                        c4680h3.f38938y = new C4679g(c4680h3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = c4534a.f37957f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                c4534a.f37956e.setBackgroundResource(c4534a.f37953b);
                ViewParent parent = c4534a.f37957f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(c4534a.f37957f);
                }
                c4534a.f37956e.addView(c4534a.f37957f, layoutParams2);
                if (!c4534a.f37957f.hasFocus()) {
                    c4534a.f37957f.requestFocus();
                }
            }
            c4534a.f37964n = true;
            return;
        }
        View view2 = c4534a.f37958g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            c4534a.f37962l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
            layoutParams3.gravity = c4534a.f37954c;
            layoutParams3.windowAnimations = c4534a.f37955d;
            windowManager.addView(c4534a.f37956e, layoutParams3);
            c4534a.f37963m = true;
            if (i4 != 0) {
                K();
                return;
            }
            return;
        }
        i = -2;
        c4534a.f37962l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
        layoutParams32.gravity = c4534a.f37954c;
        layoutParams32.windowAnimations = c4534a.f37955d;
        windowManager.addView(c4534a.f37956e, layoutParams32);
        c4534a.f37963m = true;
        if (i4 != 0) {
        }
    }

    public final boolean H(C4534A c4534a, int i, KeyEvent keyEvent) {
        l.l lVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((c4534a.f37961k || I(c4534a, keyEvent)) && (lVar = c4534a.f37959h) != null) {
            return lVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d5, code lost:
    
        if (r13.f37959h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(C4534A c4534a, KeyEvent keyEvent) {
        InterfaceC4738h0 interfaceC4738h0;
        InterfaceC4738h0 interfaceC4738h02;
        Resources.Theme theme;
        InterfaceC4738h0 interfaceC4738h03;
        InterfaceC4738h0 interfaceC4738h04;
        if (!this.f38013w0) {
            if (c4534a.f37961k) {
                return true;
            }
            C4534A c4534a2 = this.f38009s0;
            if (c4534a2 != null && c4534a2 != c4534a) {
                t(c4534a2, false);
            }
            Window.Callback callback = this.f37975E.getCallback();
            int i = c4534a.f37952a;
            if (callback != null) {
                c4534a.f37958g = callback.onCreatePanelView(i);
            }
            boolean z8 = i == 0 || i == 108;
            if (z8 && (interfaceC4738h04 = this.f37986K) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4738h04;
                actionBarOverlayLayout.k();
                ((Y0) actionBarOverlayLayout.f4671x).f39363l = true;
            }
            if (c4534a.f37958g == null && (!z8 || !(this.f37981H instanceof C4541H))) {
                l.l lVar = c4534a.f37959h;
                if (lVar == null || c4534a.f37965o) {
                    if (lVar == null) {
                        Context context = this.f37973D;
                        if ((i == 0 || i == 108) && this.f37986K != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(C5284R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(C5284R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(C5284R.attr.actionBarWidgetTheme, typedValue, true);
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
                                C4616d c4616d = new C4616d(context, 0);
                                c4616d.getTheme().setTo(theme);
                                context = c4616d;
                            }
                        }
                        l.l lVar2 = new l.l(context);
                        lVar2.f38966x = this;
                        l.l lVar3 = c4534a.f37959h;
                        if (lVar2 != lVar3) {
                            if (lVar3 != null) {
                                lVar3.r(c4534a.i);
                            }
                            c4534a.f37959h = lVar2;
                            C4680h c4680h = c4534a.i;
                            if (c4680h != null) {
                                lVar2.b(c4680h, lVar2.f38962n);
                            }
                        }
                    }
                    if (z8 && (interfaceC4738h02 = this.f37986K) != null) {
                        if (this.f37988L == null) {
                            this.f37988L = new I0.j(28, this);
                        }
                        ((ActionBarOverlayLayout) interfaceC4738h02).l(c4534a.f37959h, this.f37988L);
                    }
                    c4534a.f37959h.w();
                    if (callback.onCreatePanelMenu(i, c4534a.f37959h)) {
                        c4534a.f37965o = false;
                    } else {
                        l.l lVar4 = c4534a.f37959h;
                        if (lVar4 != null) {
                            if (lVar4 != null) {
                                lVar4.r(c4534a.i);
                            }
                            c4534a.f37959h = null;
                        }
                        if (z8 && (interfaceC4738h0 = this.f37986K) != null) {
                            ((ActionBarOverlayLayout) interfaceC4738h0).l(null, this.f37988L);
                        }
                    }
                }
                c4534a.f37959h.w();
                Bundle bundle = c4534a.f37966p;
                if (bundle != null) {
                    c4534a.f37959h.s(bundle);
                    c4534a.f37966p = null;
                }
                if (!callback.onPreparePanel(0, c4534a.f37958g, c4534a.f37959h)) {
                    if (z8 && (interfaceC4738h03 = this.f37986K) != null) {
                        ((ActionBarOverlayLayout) interfaceC4738h03).l(null, this.f37988L);
                    }
                    c4534a.f37959h.v();
                    return false;
                }
                c4534a.f37959h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                c4534a.f37959h.v();
            }
            c4534a.f37961k = true;
            c4534a.f37962l = false;
            this.f38009s0 = c4534a;
            return true;
        }
        return false;
    }

    public final void J() {
        if (this.f37997S) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z8 = false;
            if (this.f37989L0 != null && (B(0).f37963m || this.f37992N != null)) {
                z8 = true;
            }
            if (z8 && this.f37991M0 == null) {
                this.f37991M0 = w.b(this.f37989L0, this);
            } else {
                if (z8 || (onBackInvokedCallback = this.f37991M0) == null) {
                    return;
                }
                w.c(this.f37989L0, onBackInvokedCallback);
                this.f37991M0 = null;
            }
        }
    }

    @Override // h.q
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f37973D);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C4535B) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // h.q
    public final void b() {
        if (this.f37981H != null) {
            C();
            if (this.f37981H.f()) {
                return;
            }
            D(0);
        }
    }

    @Override // h.q
    public final void d() {
        String str;
        this.f38011u0 = true;
        n(false, true);
        y();
        Object obj = this.f37972C;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0290j.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e6) {
                    throw new IllegalArgumentException(e6);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC4542a abstractC4542a = this.f37981H;
                if (abstractC4542a == null) {
                    this.f37982H0 = true;
                } else {
                    abstractC4542a.l(true);
                }
            }
            synchronized (q.f38118A) {
                q.f(this);
                q.f38126z.add(new WeakReference(this));
            }
        }
        this.f38014x0 = new Configuration(this.f37973D.getResources().getConfiguration());
        this.f38012v0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // h.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        AbstractC4542a abstractC4542a;
        y yVar;
        y yVar2;
        if (this.f37972C instanceof Activity) {
            synchronized (q.f38118A) {
                q.f(this);
            }
        }
        if (this.f37976E0) {
            this.f37975E.getDecorView().removeCallbacks(this.f37980G0);
        }
        this.f38013w0 = true;
        if (this.f38015y0 != -100) {
            Object obj = this.f37972C;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f37967N0.put(this.f37972C.getClass().getName(), Integer.valueOf(this.f38015y0));
                abstractC4542a = this.f37981H;
                if (abstractC4542a != null) {
                    abstractC4542a.h();
                }
                yVar = this.C0;
                if (yVar != null) {
                    yVar.c();
                }
                yVar2 = this.f37974D0;
                if (yVar2 == null) {
                    yVar2.c();
                    return;
                }
                return;
            }
        }
        f37967N0.remove(this.f37972C.getClass().getName());
        abstractC4542a = this.f37981H;
        if (abstractC4542a != null) {
        }
        yVar = this.C0;
        if (yVar != null) {
        }
        yVar2 = this.f37974D0;
        if (yVar2 == null) {
        }
    }

    @Override // h.q
    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f38006p0 && i == 108) {
            return false;
        }
        if (this.Y && i == 1) {
            this.Y = false;
        }
        if (i == 1) {
            J();
            this.f38006p0 = true;
            return true;
        }
        if (i == 2) {
            J();
            this.f38001W = true;
            return true;
        }
        if (i == 5) {
            J();
            this.f38002X = true;
            return true;
        }
        if (i == 10) {
            J();
            this.f38004n0 = true;
            return true;
        }
        if (i == 108) {
            J();
            this.Y = true;
            return true;
        }
        if (i != 109) {
            return this.f37975E.requestFeature(i);
        }
        J();
        this.f38003Z = true;
        return true;
    }

    @Override // h.q
    public final void h(int i) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f37998T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f37973D).inflate(i, viewGroup);
        this.f37977F.a(this.f37975E.getCallback());
    }

    @Override // h.q
    public final void i(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f37998T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f37977F.a(this.f37975E.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // l.InterfaceC4682j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(l.l lVar) {
        ActionMenuView actionMenuView;
        C4743k c4743k;
        InterfaceC4738h0 interfaceC4738h0 = this.f37986K;
        if (interfaceC4738h0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4738h0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((Y0) actionBarOverlayLayout.f4671x).f39353a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f4724n) != null && actionMenuView.f4676L) {
                if (ViewConfiguration.get(this.f37973D).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f37986K;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((Y0) actionBarOverlayLayout2.f4671x).f39353a.f4724n;
                    if (actionMenuView2 != null) {
                        C4743k c4743k2 = actionMenuView2.f4677M;
                        if (c4743k2 != null) {
                            if (c4743k2.f39440N == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f37975E.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f37986K;
                actionBarOverlayLayout3.k();
                if (((Y0) actionBarOverlayLayout3.f4671x).f39353a.p()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f37986K;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((Y0) actionBarOverlayLayout4.f4671x).f39353a.f4724n;
                    if (actionMenuView3 != null && (c4743k = actionMenuView3.f4677M) != null) {
                        c4743k.f();
                    }
                    if (this.f38013w0) {
                        return;
                    }
                    callback.onPanelClosed(108, B(0).f37959h);
                    return;
                }
                if (callback == null || this.f38013w0) {
                    return;
                }
                if (this.f37976E0 && (1 & this.f37978F0) != 0) {
                    View decorView = this.f37975E.getDecorView();
                    r rVar = this.f37980G0;
                    decorView.removeCallbacks(rVar);
                    rVar.run();
                }
                C4534A B8 = B(0);
                l.l lVar2 = B8.f37959h;
                if (lVar2 == null || B8.f37965o || !callback.onPreparePanel(0, B8.f37958g, lVar2)) {
                    return;
                }
                callback.onMenuOpened(108, B8.f37959h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f37986K;
                actionBarOverlayLayout5.k();
                ((Y0) actionBarOverlayLayout5.f4671x).f39353a.v();
                return;
            }
        }
        C4534A B9 = B(0);
        B9.f37964n = true;
        t(B9, false);
        G(B9, null);
    }

    @Override // h.q
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f37998T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f37977F.a(this.f37975E.getCallback());
    }

    @Override // h.q
    public final void l(CharSequence charSequence) {
        this.J = charSequence;
        InterfaceC4738h0 interfaceC4738h0 = this.f37986K;
        if (interfaceC4738h0 != null) {
            interfaceC4738h0.setWindowTitle(charSequence);
            return;
        }
        AbstractC4542a abstractC4542a = this.f37981H;
        if (abstractC4542a != null) {
            abstractC4542a.r(charSequence);
            return;
        }
        TextView textView = this.f37999U;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Type inference failed for: r3v1, types: [h.m, java.lang.Object] */
    @Override // h.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC4614b m(InterfaceC4613a interfaceC4613a) {
        AbstractC4614b onWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        AbstractC4614b abstractC4614b;
        boolean z8 = false;
        int i = 1;
        if (interfaceC4613a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC4614b abstractC4614b2 = this.f37992N;
        if (abstractC4614b2 != null) {
            abstractC4614b2.a();
        }
        S0.l lVar = new S0.l(this, interfaceC4613a, 12, z8);
        C();
        AbstractC4542a abstractC4542a = this.f37981H;
        ?? r32 = this.f37979G;
        if (abstractC4542a != null) {
            AbstractC4614b s3 = abstractC4542a.s(lVar);
            this.f37992N = s3;
            if (s3 != null) {
                r32.onSupportActionModeStarted(s3);
            }
        }
        if (this.f37992N == null) {
            C0343e0 c0343e0 = this.f37996R;
            if (c0343e0 != null) {
                c0343e0.b();
            }
            AbstractC4614b abstractC4614b3 = this.f37992N;
            if (abstractC4614b3 != null) {
                abstractC4614b3.a();
            }
            if (!this.f38013w0) {
                try {
                    onWindowStartingSupportActionMode = r32.onWindowStartingSupportActionMode(lVar);
                } catch (AbstractMethodError unused) {
                }
                if (onWindowStartingSupportActionMode == null) {
                    this.f37992N = onWindowStartingSupportActionMode;
                } else {
                    if (this.f37993O == null) {
                        if (this.f38005o0) {
                            TypedValue typedValue = new TypedValue();
                            Context context = this.f37973D;
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(C5284R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                C4616d c4616d = new C4616d(context, 0);
                                c4616d.getTheme().setTo(newTheme);
                                context = c4616d;
                            }
                            this.f37993O = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, C5284R.attr.actionModePopupWindowStyle);
                            this.f37994P = popupWindow;
                            U.l.d(popupWindow, 2);
                            this.f37994P.setContentView(this.f37993O);
                            this.f37994P.setWidth(-1);
                            context.getTheme().resolveAttribute(C5284R.attr.actionBarSize, typedValue, true);
                            this.f37993O.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.f37994P.setHeight(-2);
                            this.f37995Q = new r(this, i);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f37998T.findViewById(C5284R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(z()));
                                this.f37993O = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.f37993O != null) {
                        C0343e0 c0343e02 = this.f37996R;
                        if (c0343e02 != null) {
                            c0343e02.b();
                        }
                        this.f37993O.e();
                        Context context2 = this.f37993O.getContext();
                        ActionBarContextView actionBarContextView = this.f37993O;
                        C4617e c4617e = new C4617e();
                        c4617e.f38614v = context2;
                        c4617e.f38615w = actionBarContextView;
                        c4617e.f38616x = lVar;
                        l.l lVar2 = new l.l(actionBarContextView.getContext());
                        lVar2.f38950E = 1;
                        c4617e.f38613A = lVar2;
                        lVar2.f38966x = c4617e;
                        if (((InterfaceC4613a) lVar.f2910u).e(c4617e, lVar2)) {
                            c4617e.g();
                            this.f37993O.c(c4617e);
                            this.f37992N = c4617e;
                            if (this.f37997S && (viewGroup = this.f37998T) != null && viewGroup.isLaidOut()) {
                                this.f37993O.setAlpha(0.0f);
                                C0343e0 a9 = X.a(this.f37993O);
                                a9.a(1.0f);
                                this.f37996R = a9;
                                a9.d(new t(i, this));
                            } else {
                                this.f37993O.setAlpha(1.0f);
                                this.f37993O.setVisibility(0);
                                if (this.f37993O.getParent() instanceof View) {
                                    View view = (View) this.f37993O.getParent();
                                    WeakHashMap weakHashMap = X.f2240a;
                                    O.J.c(view);
                                }
                            }
                            if (this.f37994P != null) {
                                this.f37975E.getDecorView().post(this.f37995Q);
                            }
                        } else {
                            this.f37992N = null;
                        }
                    }
                }
                abstractC4614b = this.f37992N;
                if (abstractC4614b != null) {
                    r32.onSupportActionModeStarted(abstractC4614b);
                }
                K();
                this.f37992N = this.f37992N;
            }
            onWindowStartingSupportActionMode = null;
            if (onWindowStartingSupportActionMode == null) {
            }
            abstractC4614b = this.f37992N;
            if (abstractC4614b != null) {
            }
            K();
            this.f37992N = this.f37992N;
        }
        K();
        return this.f37992N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean n(boolean z8, boolean z9) {
        int i;
        Configuration configuration;
        K.l b9;
        int i4;
        boolean z10;
        boolean z11;
        Object obj;
        Object obj2;
        LongSparseArray longSparseArray;
        Activity activity;
        if (this.f38013w0) {
            return false;
        }
        int i9 = this.f38015y0;
        if (i9 == -100) {
            i9 = q.f38121u;
        }
        int i10 = i9;
        Context context = this.f37973D;
        int E8 = E(context, i10);
        int i11 = Build.VERSION.SDK_INT;
        K.l q6 = i11 < 33 ? q(context) : null;
        if (!z9 && q6 != null) {
            q6 = v.b(context.getResources().getConfiguration());
        }
        Configuration u7 = u(context, E8, q6, null, false);
        boolean z12 = this.f37971B0;
        Object obj3 = this.f37972C;
        if (!z12 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f38014x0;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i12 = configuration.uiMode & 48;
                int i13 = u7.uiMode & 48;
                K.l b10 = v.b(configuration);
                b9 = q6 != null ? null : v.b(u7);
                i4 = i12 == i13 ? 512 : 0;
                if (b9 != null && !b10.equals(b9)) {
                    i4 |= 8196;
                }
                if (((~i) & i4) != 0 && z8 && this.f38011u0 && ((f37969P0 || this.f38012v0) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i14 = Build.VERSION.SDK_INT;
                        if (i14 >= 31 && (i4 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(u7.getLayoutDirection());
                        }
                        if (i14 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new RunnableC0281a(r3, activity));
                        }
                        z10 = true;
                        if (!z10 || i4 == 0) {
                            z11 = z10;
                        } else {
                            r3 = (i & i4) == i4 ? 1 : 0;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i13;
                            if (b9 != null) {
                                v.d(configuration2, b9);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i15 = Build.VERSION.SDK_INT;
                            if (i15 < 26 && i15 < 28) {
                                if (!W2.e.f3446j) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        W2.e.i = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e6) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e6);
                                    }
                                    W2.e.f3446j = true;
                                }
                                Field field = W2.e.i;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e9) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e9);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!W2.e.f3441d) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                W2.e.f3440c = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e10) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e10);
                                            }
                                            W2.e.f3441d = true;
                                        }
                                        Field field2 = W2.e.f3440c;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e11) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e11);
                                            }
                                            if (obj2 != null) {
                                                if (!W2.e.f3443f) {
                                                    try {
                                                        W2.e.f3442e = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e12) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e12);
                                                    }
                                                    W2.e.f3443f = true;
                                                }
                                                Class cls = W2.e.f3442e;
                                                if (cls != null) {
                                                    if (!W2.e.f3445h) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            W2.e.f3444g = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e13) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e13);
                                                        }
                                                        W2.e.f3445h = true;
                                                    }
                                                    Field field3 = W2.e.f3444g;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e14) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e14);
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
                            int i16 = this.f38016z0;
                            if (i16 != 0) {
                                context.setTheme(i16);
                                z11 = true;
                                context.getTheme().applyStyle(this.f38016z0, true);
                            } else {
                                z11 = true;
                            }
                            if (r3 != 0 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof InterfaceC0513v) {
                                    if (((C0515x) ((InterfaceC0513v) activity2).getLifecycle()).f5290d.compareTo(EnumC0507o.f5278v) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f38012v0 && !this.f38013w0) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z11 && (obj3 instanceof AbstractActivityC4553l)) {
                            if ((i4 & 512) != 0) {
                                ((AbstractActivityC4553l) obj3).onNightModeChanged(E8);
                            }
                            if ((i4 & 4) != 0) {
                                ((AbstractActivityC4553l) obj3).onLocalesChanged(q6);
                            }
                        }
                        if (b9 != null) {
                            v.c(v.b(context.getResources().getConfiguration()));
                        }
                        if (i10 == 0) {
                            A(context).m();
                        } else {
                            y yVar = this.C0;
                            if (yVar != null) {
                                yVar.c();
                            }
                        }
                        if (i10 == 3) {
                            if (this.f37974D0 == null) {
                                this.f37974D0 = new y(this, context);
                            }
                            this.f37974D0.m();
                        } else {
                            y yVar2 = this.f37974D0;
                            if (yVar2 != null) {
                                yVar2.c();
                            }
                        }
                        return z11;
                    }
                }
                z10 = false;
                if (z10) {
                }
                z11 = z10;
                if (z11) {
                    if ((i4 & 512) != 0) {
                    }
                    if ((i4 & 4) != 0) {
                    }
                }
                if (b9 != null) {
                }
                if (i10 == 0) {
                }
                if (i10 == 3) {
                }
                return z11;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i11 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f37970A0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e15) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e15);
                this.f37970A0 = 0;
            }
        }
        this.f37971B0 = true;
        i = this.f37970A0;
        configuration = this.f38014x0;
        if (configuration == null) {
        }
        int i122 = configuration.uiMode & 48;
        int i132 = u7.uiMode & 48;
        K.l b102 = v.b(configuration);
        if (q6 != null) {
        }
        if (i122 == i132) {
        }
        if (b9 != null) {
            i4 |= 8196;
        }
        if (((~i) & i4) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z10 = false;
        if (z10) {
        }
        z11 = z10;
        if (z11) {
        }
        if (b9 != null) {
        }
        if (i10 == 0) {
        }
        if (i10 == 3) {
        }
        return z11;
    }

    @Override // l.InterfaceC4682j
    public final boolean o(l.l lVar, MenuItem menuItem) {
        C4534A c4534a;
        Window.Callback callback = this.f37975E.getCallback();
        if (callback != null && !this.f38013w0) {
            l.l k6 = lVar.k();
            C4534A[] c4534aArr = this.f38008r0;
            int length = c4534aArr != null ? c4534aArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    c4534a = c4534aArr[i];
                    if (c4534a != null && c4534a.f37959h == k6) {
                        break;
                    }
                    i++;
                } else {
                    c4534a = null;
                    break;
                }
            }
            if (c4534a != null) {
                return callback.onMenuItemSelected(c4534a.f37952a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0112, code lost:
    
        if (r13.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View c4716c;
        char c4 = 4;
        if (this.f37987K0 == null) {
            int[] iArr = AbstractC4518a.f37826j;
            Context context2 = this.f37973D;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f37987K0 = new C4538E();
            } else {
                try {
                    this.f37987K0 = (C4538E) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f37987K0 = new C4538E();
                }
            }
        }
        C4538E c4538e = this.f37987K0;
        int i = d1.f39401a;
        c4538e.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37841y, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c4616d = (resourceId == 0 || ((context instanceof C4616d) && ((C4616d) context).f38608a == resourceId)) ? context : new C4616d(context, resourceId);
        str.getClass();
        View view2 = null;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c4 = 0;
                    break;
                }
                c4 = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c4 = 1;
                    break;
                }
                c4 = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c4 = 2;
                    break;
                }
                c4 = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c4 = 3;
                    break;
                }
                c4 = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c4 = 5;
                    break;
                }
                c4 = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c4 = 6;
                    break;
                }
                c4 = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c4 = 7;
                    break;
                }
                c4 = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c4 = '\b';
                    break;
                }
                c4 = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c4 = '\t';
                    break;
                }
                c4 = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c4 = '\n';
                    break;
                }
                c4 = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c4 = 11;
                    break;
                }
                c4 = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c4 = '\f';
                    break;
                }
                c4 = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c4 = '\r';
                    break;
                }
                c4 = 65535;
                break;
            default:
                c4 = 65535;
                break;
        }
        switch (c4) {
            case 0:
                c4716c = new C4716C(c4616d, attributeSet);
                break;
            case 1:
                c4716c = new m.r(c4616d, attributeSet);
                break;
            case 2:
                c4716c = new C4770y(c4616d, attributeSet);
                break;
            case 3:
                c4716c = c4538e.e(c4616d, attributeSet);
                break;
            case 4:
                c4716c = new C4766w(c4616d, attributeSet, C5284R.attr.imageButtonStyle);
                break;
            case 5:
                c4716c = new C4718E(c4616d, attributeSet);
                break;
            case 6:
                c4716c = new O(c4616d, attributeSet);
                break;
            case 7:
                c4716c = c4538e.d(c4616d, attributeSet);
                break;
            case '\b':
                c4716c = new C4734f0(c4616d, attributeSet);
                break;
            case '\t':
                c4716c = new C4768x(c4616d, attributeSet, 0);
                break;
            case '\n':
                c4716c = c4538e.a(c4616d, attributeSet);
                break;
            case 11:
                c4716c = c4538e.c(c4616d, attributeSet);
                break;
            case '\f':
                c4716c = new C4762u(c4616d, attributeSet);
                break;
            case '\r':
                c4716c = c4538e.b(c4616d, attributeSet);
                break;
            default:
                c4716c = null;
                break;
        }
        if (c4716c == null && context != c4616d) {
            Object[] objArr = c4538e.f38029a;
            if (str.equals(com.anythink.expressad.a.f17754C)) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c4616d;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr = C4538E.f38027g;
                        if (i4 < 3) {
                            View f6 = c4538e.f(c4616d, str, strArr[i4]);
                            if (f6 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = f6;
                            } else {
                                i4++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View f9 = c4538e.f(c4616d, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = f9;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            c4716c = view2;
        }
        if (c4716c != null) {
            Context context3 = c4716c.getContext();
            if ((context3 instanceof ContextWrapper) && c4716c.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C4538E.f38023c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c4716c.setOnClickListener(new ViewOnClickListenerC4537D(c4716c, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c4616d.obtainStyledAttributes(attributeSet, C4538E.f38024d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z8 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = X.f2240a;
                    new O.G(C5284R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(c4716c, Boolean.valueOf(z8));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c4616d.obtainStyledAttributes(attributeSet, C4538E.f38025e);
                if (obtainStyledAttributes5.hasValue(0)) {
                    X.p(c4716c, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c4616d.obtainStyledAttributes(attributeSet, C4538E.f38026f);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z9 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = X.f2240a;
                    new O.G(C5284R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(c4716c, Boolean.valueOf(z9));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c4716c;
    }

    public final void p(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f37975E != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof x) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        x xVar = new x(this, callback);
        this.f37977F = xVar;
        window.setCallback(xVar);
        Q0 o9 = Q0.o(this.f37973D, null, f37968O0);
        Drawable h9 = o9.h(0);
        if (h9 != null) {
            window.setBackgroundDrawable(h9);
        }
        o9.q();
        this.f37975E = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f37989L0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f37991M0) != null) {
            w.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f37991M0 = null;
        }
        Object obj = this.f37972C;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f37989L0 = w.a(activity);
                K();
            }
        }
        this.f37989L0 = null;
        K();
    }

    public final void r(int i, C4534A c4534a, l.l lVar) {
        if (lVar == null) {
            if (c4534a == null && i >= 0) {
                C4534A[] c4534aArr = this.f38008r0;
                if (i < c4534aArr.length) {
                    c4534a = c4534aArr[i];
                }
            }
            if (c4534a != null) {
                lVar = c4534a.f37959h;
            }
        }
        if ((c4534a == null || c4534a.f37963m) && !this.f38013w0) {
            x xVar = this.f37977F;
            Window.Callback callback = this.f37975E.getCallback();
            xVar.getClass();
            try {
                xVar.f38136x = true;
                callback.onPanelClosed(i, lVar);
            } finally {
                xVar.f38136x = false;
            }
        }
    }

    public final void s(l.l lVar) {
        C4743k c4743k;
        if (this.f38007q0) {
            return;
        }
        this.f38007q0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f37986K;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((Y0) actionBarOverlayLayout.f4671x).f39353a.f4724n;
        if (actionMenuView != null && (c4743k = actionMenuView.f4677M) != null) {
            c4743k.f();
            C4735g c4735g = c4743k.f39439M;
            if (c4735g != null && c4735g.b()) {
                c4735g.i.dismiss();
            }
        }
        Window.Callback callback = this.f37975E.getCallback();
        if (callback != null && !this.f38013w0) {
            callback.onPanelClosed(108, lVar);
        }
        this.f38007q0 = false;
    }

    public final void t(C4534A c4534a, boolean z8) {
        z zVar;
        InterfaceC4738h0 interfaceC4738h0;
        if (z8 && c4534a.f37952a == 0 && (interfaceC4738h0 = this.f37986K) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4738h0;
            actionBarOverlayLayout.k();
            if (((Y0) actionBarOverlayLayout.f4671x).f39353a.p()) {
                s(c4534a.f37959h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f37973D.getSystemService("window");
        if (windowManager != null && c4534a.f37963m && (zVar = c4534a.f37956e) != null) {
            windowManager.removeView(zVar);
            if (z8) {
                r(c4534a.f37952a, c4534a, null);
            }
        }
        c4534a.f37961k = false;
        c4534a.f37962l = false;
        c4534a.f37963m = false;
        c4534a.f37957f = null;
        c4534a.f37964n = true;
        if (this.f38009s0 == c4534a) {
            this.f38009s0 = null;
        }
        if (c4534a.f37952a == 0) {
            K();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f0, code lost:
    
        if (r7.f() != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v(KeyEvent keyEvent) {
        View decorView;
        boolean z8;
        boolean z9;
        ActionMenuView actionMenuView;
        Object obj = this.f37972C;
        if ((!(obj instanceof InterfaceC0348j) && !(obj instanceof DialogInterfaceC4550i)) || (decorView = this.f37975E.getDecorView()) == null || !com.bumptech.glide.e.k(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                x xVar = this.f37977F;
                Window.Callback callback = this.f37975E.getCallback();
                xVar.getClass();
                try {
                    xVar.f38135w = true;
                } finally {
                    xVar.f38135w = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.f38010t0 = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        C4534A B8 = B(0);
                        if (!B8.f37963m) {
                            I(B8, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f37992N == null) {
                        C4534A B9 = B(0);
                        InterfaceC4738h0 interfaceC4738h0 = this.f37986K;
                        Context context = this.f37973D;
                        if (interfaceC4738h0 != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4738h0;
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((Y0) actionBarOverlayLayout.f4671x).f39353a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f4724n) != null && actionMenuView.f4676L && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f37986K;
                                actionBarOverlayLayout2.k();
                                if (((Y0) actionBarOverlayLayout2.f4671x).f39353a.p()) {
                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f37986K;
                                    actionBarOverlayLayout3.k();
                                    ActionMenuView actionMenuView2 = ((Y0) actionBarOverlayLayout3.f4671x).f39353a.f4724n;
                                    if (actionMenuView2 != null) {
                                        C4743k c4743k = actionMenuView2.f4677M;
                                        if (c4743k != null) {
                                        }
                                    }
                                } else if (!this.f38013w0 && I(B9, keyEvent)) {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f37986K;
                                    actionBarOverlayLayout4.k();
                                    z8 = ((Y0) actionBarOverlayLayout4.f4671x).f39353a.v();
                                    if (z8) {
                                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(com.anythink.basead.exoplayer.k.o.f8602b);
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                                z8 = false;
                                if (z8) {
                                }
                            }
                        }
                        boolean z10 = B9.f37963m;
                        if (z10 || B9.f37962l) {
                            t(B9, true);
                            z8 = z10;
                            if (z8) {
                            }
                        } else {
                            if (B9.f37961k) {
                                if (B9.f37965o) {
                                    B9.f37961k = false;
                                    z9 = I(B9, keyEvent);
                                } else {
                                    z9 = true;
                                }
                                if (z9) {
                                    G(B9, keyEvent);
                                    z8 = true;
                                    if (z8) {
                                    }
                                }
                            }
                            z8 = false;
                            if (z8) {
                            }
                        }
                    }
                }
                return false;
            }
            if (!F()) {
                return false;
            }
        }
        return true;
    }

    public final void w(int i) {
        C4534A B8 = B(i);
        if (B8.f37959h != null) {
            Bundle bundle = new Bundle();
            B8.f37959h.t(bundle);
            if (bundle.size() > 0) {
                B8.f37966p = bundle;
            }
            B8.f37959h.w();
            B8.f37959h.clear();
        }
        B8.f37965o = true;
        B8.f37964n = true;
        if ((i == 108 || i == 0) && this.f37986K != null) {
            C4534A B9 = B(0);
            B9.f37961k = false;
            I(B9, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.f37997S) {
            return;
        }
        int[] iArr = AbstractC4518a.f37826j;
        Context context = this.f37973D;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(com.anythink.expressad.video.module.a.a.f21885Q, false)) {
            g(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            g(com.anythink.expressad.video.module.a.a.f21914z);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.f38005o0 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        y();
        this.f37975E.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f38006p0) {
            viewGroup = this.f38004n0 ? (ViewGroup) from.inflate(C5284R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C5284R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f38005o0) {
            viewGroup = (ViewGroup) from.inflate(C5284R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f38003Z = false;
            this.Y = false;
        } else if (this.Y) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C5284R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C4616d(context, typedValue.resourceId) : context).inflate(C5284R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC4738h0 interfaceC4738h0 = (InterfaceC4738h0) viewGroup.findViewById(C5284R.id.decor_content_parent);
            this.f37986K = interfaceC4738h0;
            interfaceC4738h0.setWindowCallback(this.f37975E.getCallback());
            if (this.f38003Z) {
                ((ActionBarOverlayLayout) this.f37986K).j(com.anythink.expressad.video.module.a.a.f21914z);
            }
            if (this.f38001W) {
                ((ActionBarOverlayLayout) this.f37986K).j(2);
            }
            if (this.f38002X) {
                ((ActionBarOverlayLayout) this.f37986K).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.Y + ", windowActionBarOverlay: " + this.f38003Z + ", android:windowIsFloating: " + this.f38005o0 + ", windowActionModeOverlay: " + this.f38004n0 + ", windowNoTitle: " + this.f38006p0 + " }");
        }
        s sVar = new s(this);
        WeakHashMap weakHashMap = X.f2240a;
        O.L.u(viewGroup, sVar);
        if (this.f37986K == null) {
            this.f37999U = (TextView) viewGroup.findViewById(C5284R.id.title);
        }
        boolean z8 = g1.f39419a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e6) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e6);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e9) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e9);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C5284R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f37975E.findViewById(R.id.content);
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
        this.f37975E.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new C4524d(20, this));
        this.f37998T = viewGroup;
        Object obj = this.f37972C;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.J;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC4738h0 interfaceC4738h02 = this.f37986K;
            if (interfaceC4738h02 != null) {
                interfaceC4738h02.setWindowTitle(title);
            } else {
                AbstractC4542a abstractC4542a = this.f37981H;
                if (abstractC4542a != null) {
                    abstractC4542a.r(title);
                } else {
                    TextView textView = this.f37999U;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f37998T.findViewById(R.id.content);
        View decorView = this.f37975E.getDecorView();
        contentFrameLayout2.f4696z.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f37997S = true;
        C4534A B8 = B(0);
        if (this.f38013w0 || B8.f37959h != null) {
            return;
        }
        D(108);
    }

    public final void y() {
        if (this.f37975E == null) {
            Object obj = this.f37972C;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.f37975E == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context z() {
        C();
        AbstractC4542a abstractC4542a = this.f37981H;
        Context e6 = abstractC4542a != null ? abstractC4542a.e() : null;
        return e6 == null ? this.f37973D : e6;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
