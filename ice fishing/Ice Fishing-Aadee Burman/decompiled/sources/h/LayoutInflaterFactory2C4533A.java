package h;

import D.AbstractC0291j;
import D.RunnableC0282a;
import O.C0330e0;
import O.InterfaceC0335j;
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
import androidx.lifecycle.C0505x;
import androidx.lifecycle.EnumC0497o;
import androidx.lifecycle.InterfaceC0503v;
import com.facebook.ads.AdError;
import com.icefishing.icefishinglive2.C5275R;
import g.AbstractC4518a;
import g1.C4523c;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC4615b;
import k.C4617d;
import k.C4618e;
import k.C4622i;
import k.InterfaceC4614a;
import l.C4651h;
import l.C4652i;
import m.C4669C;
import m.C4671E;
import m.C4686f0;
import m.C4687g;
import m.C4695k;
import m.C4710s;
import m.C4714u;
import m.C4718w;
import m.C4720x;
import m.C4722y;
import m.InterfaceC4690h0;
import m.O;
import m.X0;
import m.c1;
import m.f1;

/* renamed from: h.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C4533A extends p implements l.k, LayoutInflater.Factory2 {

    /* renamed from: N0, reason: collision with root package name */
    public static final s.k f37754N0 = new s.k();

    /* renamed from: O0, reason: collision with root package name */
    public static final int[] f37755O0 = {R.attr.windowBackground};

    /* renamed from: P0, reason: collision with root package name */
    public static final boolean f37756P0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A0, reason: collision with root package name */
    public int f37757A0;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f37758B0;

    /* renamed from: C, reason: collision with root package name */
    public final Object f37759C;
    public x C0;

    /* renamed from: D, reason: collision with root package name */
    public final Context f37760D;

    /* renamed from: D0, reason: collision with root package name */
    public x f37761D0;

    /* renamed from: E, reason: collision with root package name */
    public Window f37762E;

    /* renamed from: E0, reason: collision with root package name */
    public boolean f37763E0;

    /* renamed from: F, reason: collision with root package name */
    public w f37764F;

    /* renamed from: F0, reason: collision with root package name */
    public int f37765F0;

    /* renamed from: G, reason: collision with root package name */
    public final Object f37766G;

    /* renamed from: H, reason: collision with root package name */
    public AbstractC4541a f37768H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f37769H0;

    /* renamed from: I, reason: collision with root package name */
    public C4622i f37770I;

    /* renamed from: I0, reason: collision with root package name */
    public Rect f37771I0;
    public CharSequence J;

    /* renamed from: J0, reason: collision with root package name */
    public Rect f37772J0;

    /* renamed from: K, reason: collision with root package name */
    public InterfaceC4690h0 f37773K;

    /* renamed from: K0, reason: collision with root package name */
    public C4536D f37774K0;

    /* renamed from: L, reason: collision with root package name */
    public C4523c f37775L;

    /* renamed from: L0, reason: collision with root package name */
    public OnBackInvokedDispatcher f37776L0;

    /* renamed from: M, reason: collision with root package name */
    public r f37777M;

    /* renamed from: M0, reason: collision with root package name */
    public OnBackInvokedCallback f37778M0;

    /* renamed from: N, reason: collision with root package name */
    public AbstractC4615b f37779N;

    /* renamed from: O, reason: collision with root package name */
    public ActionBarContextView f37780O;

    /* renamed from: P, reason: collision with root package name */
    public PopupWindow f37781P;

    /* renamed from: Q, reason: collision with root package name */
    public q f37782Q;

    /* renamed from: S, reason: collision with root package name */
    public boolean f37784S;

    /* renamed from: T, reason: collision with root package name */
    public ViewGroup f37785T;

    /* renamed from: U, reason: collision with root package name */
    public TextView f37786U;

    /* renamed from: V, reason: collision with root package name */
    public View f37787V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f37788W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f37789X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f37790Z;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f37791n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f37792o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f37793p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f37794q0;

    /* renamed from: r0, reason: collision with root package name */
    public z[] f37795r0;

    /* renamed from: s0, reason: collision with root package name */
    public z f37796s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f37797t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f37798u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f37799v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f37800w0;

    /* renamed from: x0, reason: collision with root package name */
    public Configuration f37801x0;

    /* renamed from: y0, reason: collision with root package name */
    public final int f37802y0;

    /* renamed from: z0, reason: collision with root package name */
    public int f37803z0;

    /* renamed from: R, reason: collision with root package name */
    public C0330e0 f37783R = null;

    /* renamed from: G0, reason: collision with root package name */
    public final q f37767G0 = new q(this, 0);

    public LayoutInflaterFactory2C4533A(Context context, Window window, InterfaceC4552l interfaceC4552l, Object obj) {
        AbstractActivityC4551k abstractActivityC4551k;
        this.f37802y0 = -100;
        this.f37760D = context;
        this.f37766G = interfaceC4552l;
        this.f37759C = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC4551k)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC4551k = (AbstractActivityC4551k) context;
                    break;
                }
            }
            abstractActivityC4551k = null;
            if (abstractActivityC4551k != null) {
                this.f37802y0 = ((LayoutInflaterFactory2C4533A) abstractActivityC4551k.getDelegate()).f37802y0;
            }
        }
        if (this.f37802y0 == -100) {
            s.k kVar = f37754N0;
            Integer num = (Integer) kVar.getOrDefault(this.f37759C.getClass().getName(), null);
            if (num != null) {
                this.f37802y0 = num.intValue();
                kVar.remove(this.f37759C.getClass().getName());
            }
        }
        if (window != null) {
            o(window);
        }
        C4710s.d();
    }

    public static K.l p(Context context) {
        K.l lVar;
        K.l lVar2;
        if (Build.VERSION.SDK_INT >= 33 || (lVar = p.f37907v) == null) {
            return null;
        }
        K.l b9 = u.b(context.getApplicationContext().getResources().getConfiguration());
        K.m mVar = lVar.f1483a;
        if (mVar.f1484a.isEmpty()) {
            lVar2 = K.l.f1482b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b9.f1483a.f1484a.size() + mVar.f1484a.size()) {
                Locale locale = i < mVar.f1484a.size() ? mVar.f1484a.get(i) : b9.f1483a.f1484a.get(i - mVar.f1484a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            lVar2 = new K.l(new K.m(K.k.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return lVar2.f1483a.f1484a.isEmpty() ? b9 : lVar2;
    }

    public static Configuration u(Context context, int i, K.l lVar, Configuration configuration, boolean z3) {
        int i6 = i != 1 ? i != 2 ? z3 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i6 | (configuration2.uiMode & (-49));
        if (lVar != null) {
            u.d(configuration2, lVar);
        }
        return configuration2;
    }

    public final E2.a A(Context context) {
        if (this.C0 == null) {
            if (Z2.e.f4168y == null) {
                Context applicationContext = context.getApplicationContext();
                Z2.e.f4168y = new Z2.e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.C0 = new x(this, Z2.e.f4168y);
        }
        return this.C0;
    }

    public final z B(int i) {
        z[] zVarArr = this.f37795r0;
        if (zVarArr == null || zVarArr.length <= i) {
            z[] zVarArr2 = new z[i + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.f37795r0 = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f37927a = i;
        zVar2.f37939n = false;
        zVarArr[i] = zVar2;
        return zVar2;
    }

    public final void C() {
        x();
        if (this.Y && this.f37768H == null) {
            Object obj = this.f37759C;
            if (obj instanceof Activity) {
                this.f37768H = new L((Activity) obj, this.f37790Z);
            } else if (obj instanceof Dialog) {
                this.f37768H = new L((Dialog) obj);
            }
            AbstractC4541a abstractC4541a = this.f37768H;
            if (abstractC4541a != null) {
                abstractC4541a.l(this.f37769H0);
            }
        }
    }

    public final void D(int i) {
        this.f37765F0 = (1 << i) | this.f37765F0;
        if (this.f37763E0) {
            return;
        }
        View decorView = this.f37762E.getDecorView();
        q qVar = this.f37767G0;
        WeakHashMap weakHashMap = X.f2054a;
        decorView.postOnAnimation(qVar);
        this.f37763E0 = true;
    }

    public final int E(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f37761D0 == null) {
                            this.f37761D0 = new x(this, context);
                        }
                        return this.f37761D0.f();
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
        boolean z3 = this.f37797t0;
        this.f37797t0 = false;
        z B9 = B(0);
        if (!B9.f37938m) {
            AbstractC4615b abstractC4615b = this.f37779N;
            if (abstractC4615b != null) {
                abstractC4615b.a();
                return true;
            }
            C();
            AbstractC4541a abstractC4541a = this.f37768H;
            if (abstractC4541a == null || !abstractC4541a.b()) {
                return false;
            }
        } else if (!z3) {
            t(B9, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0164, code lost:
    
        if (r15.f38796y.getCount() > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0144, code lost:
    
        if (r15 != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G(z zVar, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        if (zVar.f37938m || this.f37800w0) {
            return;
        }
        int i6 = zVar.f37927a;
        Context context = this.f37760D;
        if (i6 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f37762E.getCallback();
        if (callback != null && !callback.onMenuOpened(i6, zVar.f37934h)) {
            t(zVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !I(zVar, keyEvent)) {
            return;
        }
        y yVar = zVar.f37931e;
        if (yVar == null || zVar.f37939n) {
            if (yVar == null) {
                Context z3 = z();
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = z3.getResources().newTheme();
                newTheme.setTo(z3.getTheme());
                newTheme.resolveAttribute(C5275R.attr.actionBarPopupTheme, typedValue, true);
                int i9 = typedValue.resourceId;
                if (i9 != 0) {
                    newTheme.applyStyle(i9, true);
                }
                newTheme.resolveAttribute(C5275R.attr.panelMenuListTheme, typedValue, true);
                int i10 = typedValue.resourceId;
                if (i10 != 0) {
                    newTheme.applyStyle(i10, true);
                } else {
                    newTheme.applyStyle(C5275R.style.Theme_AppCompat_CompactMenu, true);
                }
                C4617d c4617d = new C4617d(z3, 0);
                c4617d.getTheme().setTo(newTheme);
                zVar.f37935j = c4617d;
                TypedArray obtainStyledAttributes = c4617d.obtainStyledAttributes(AbstractC4518a.f37596j);
                zVar.f37928b = obtainStyledAttributes.getResourceId(86, 0);
                zVar.f37930d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                zVar.f37931e = new y(this, zVar.f37935j);
                zVar.f37929c = 81;
            } else if (zVar.f37939n && yVar.getChildCount() > 0) {
                zVar.f37931e.removeAllViews();
            }
            View view = zVar.f37933g;
            if (view == null) {
                if (zVar.f37934h != null) {
                    if (this.f37777M == null) {
                        this.f37777M = new r(this);
                    }
                    r rVar = this.f37777M;
                    if (zVar.i == null) {
                        C4652i c4652i = new C4652i(zVar.f37935j);
                        zVar.i = c4652i;
                        c4652i.f38795x = rVar;
                        l.m mVar = zVar.f37934h;
                        mVar.b(c4652i, mVar.f38820n);
                    }
                    C4652i c4652i2 = zVar.i;
                    y yVar2 = zVar.f37931e;
                    if (c4652i2.f38794w == null) {
                        c4652i2.f38794w = (ExpandedMenuView) c4652i2.f38792u.inflate(C5275R.layout.abc_expanded_menu_layout, (ViewGroup) yVar2, false);
                        if (c4652i2.f38796y == null) {
                            c4652i2.f38796y = new C4651h(c4652i2);
                        }
                        c4652i2.f38794w.setAdapter((ListAdapter) c4652i2.f38796y);
                        c4652i2.f38794w.setOnItemClickListener(c4652i2);
                    }
                    ExpandedMenuView expandedMenuView = c4652i2.f38794w;
                    zVar.f37932f = expandedMenuView;
                }
                zVar.f37939n = true;
                return;
            }
            zVar.f37932f = view;
            if (zVar.f37932f != null) {
                if (zVar.f37933g == null) {
                    C4652i c4652i3 = zVar.i;
                    if (c4652i3.f38796y == null) {
                        c4652i3.f38796y = new C4651h(c4652i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = zVar.f37932f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                zVar.f37931e.setBackgroundResource(zVar.f37928b);
                ViewParent parent = zVar.f37932f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(zVar.f37932f);
                }
                zVar.f37931e.addView(zVar.f37932f, layoutParams2);
                if (!zVar.f37932f.hasFocus()) {
                    zVar.f37932f.requestFocus();
                }
            }
            zVar.f37939n = true;
            return;
        }
        View view2 = zVar.f37933g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            zVar.f37937l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
            layoutParams3.gravity = zVar.f37929c;
            layoutParams3.windowAnimations = zVar.f37930d;
            windowManager.addView(zVar.f37931e, layoutParams3);
            zVar.f37938m = true;
            if (i6 != 0) {
                K();
                return;
            }
            return;
        }
        i = -2;
        zVar.f37937l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
        layoutParams32.gravity = zVar.f37929c;
        layoutParams32.windowAnimations = zVar.f37930d;
        windowManager.addView(zVar.f37931e, layoutParams32);
        zVar.f37938m = true;
        if (i6 != 0) {
        }
    }

    public final boolean H(z zVar, int i, KeyEvent keyEvent) {
        l.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f37936k || I(zVar, keyEvent)) && (mVar = zVar.f37934h) != null) {
            return mVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d5, code lost:
    
        if (r13.f37934h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(z zVar, KeyEvent keyEvent) {
        InterfaceC4690h0 interfaceC4690h0;
        InterfaceC4690h0 interfaceC4690h02;
        Resources.Theme theme;
        InterfaceC4690h0 interfaceC4690h03;
        InterfaceC4690h0 interfaceC4690h04;
        if (!this.f37800w0) {
            if (zVar.f37936k) {
                return true;
            }
            z zVar2 = this.f37796s0;
            if (zVar2 != null && zVar2 != zVar) {
                t(zVar2, false);
            }
            Window.Callback callback = this.f37762E.getCallback();
            int i = zVar.f37927a;
            if (callback != null) {
                zVar.f37933g = callback.onCreatePanelView(i);
            }
            boolean z3 = i == 0 || i == 108;
            if (z3 && (interfaceC4690h04 = this.f37773K) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4690h04;
                actionBarOverlayLayout.k();
                ((X0) actionBarOverlayLayout.f4556x).f39091l = true;
            }
            if (zVar.f37933g == null && (!z3 || !(this.f37768H instanceof C4539G))) {
                l.m mVar = zVar.f37934h;
                if (mVar == null || zVar.f37940o) {
                    if (mVar == null) {
                        Context context = this.f37760D;
                        if ((i == 0 || i == 108) && this.f37773K != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(C5275R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(C5275R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(C5275R.attr.actionBarWidgetTheme, typedValue, true);
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
                                C4617d c4617d = new C4617d(context, 0);
                                c4617d.getTheme().setTo(theme);
                                context = c4617d;
                            }
                        }
                        l.m mVar2 = new l.m(context);
                        mVar2.f38824x = this;
                        l.m mVar3 = zVar.f37934h;
                        if (mVar2 != mVar3) {
                            if (mVar3 != null) {
                                mVar3.r(zVar.i);
                            }
                            zVar.f37934h = mVar2;
                            C4652i c4652i = zVar.i;
                            if (c4652i != null) {
                                mVar2.b(c4652i, mVar2.f38820n);
                            }
                        }
                    }
                    if (z3 && (interfaceC4690h02 = this.f37773K) != null) {
                        if (this.f37775L == null) {
                            this.f37775L = new C4523c(22, this);
                        }
                        ((ActionBarOverlayLayout) interfaceC4690h02).l(zVar.f37934h, this.f37775L);
                    }
                    zVar.f37934h.w();
                    if (callback.onCreatePanelMenu(i, zVar.f37934h)) {
                        zVar.f37940o = false;
                    } else {
                        l.m mVar4 = zVar.f37934h;
                        if (mVar4 != null) {
                            if (mVar4 != null) {
                                mVar4.r(zVar.i);
                            }
                            zVar.f37934h = null;
                        }
                        if (z3 && (interfaceC4690h0 = this.f37773K) != null) {
                            ((ActionBarOverlayLayout) interfaceC4690h0).l(null, this.f37775L);
                        }
                    }
                }
                zVar.f37934h.w();
                Bundle bundle = zVar.f37941p;
                if (bundle != null) {
                    zVar.f37934h.s(bundle);
                    zVar.f37941p = null;
                }
                if (!callback.onPreparePanel(0, zVar.f37933g, zVar.f37934h)) {
                    if (z3 && (interfaceC4690h03 = this.f37773K) != null) {
                        ((ActionBarOverlayLayout) interfaceC4690h03).l(null, this.f37775L);
                    }
                    zVar.f37934h.v();
                    return false;
                }
                zVar.f37934h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                zVar.f37934h.v();
            }
            zVar.f37936k = true;
            zVar.f37937l = false;
            this.f37796s0 = zVar;
            return true;
        }
        return false;
    }

    public final void J() {
        if (this.f37784S) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z3 = false;
            if (this.f37776L0 != null && (B(0).f37938m || this.f37779N != null)) {
                z3 = true;
            }
            if (z3 && this.f37778M0 == null) {
                this.f37778M0 = v.b(this.f37776L0, this);
            } else {
                if (z3 || (onBackInvokedCallback = this.f37778M0) == null) {
                    return;
                }
                v.c(this.f37776L0, onBackInvokedCallback);
                this.f37778M0 = null;
            }
        }
    }

    @Override // h.p
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f37760D);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C4533A) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // h.p
    public final void b() {
        if (this.f37768H != null) {
            C();
            if (this.f37768H.f()) {
                return;
            }
            D(0);
        }
    }

    @Override // h.p
    public final void d() {
        String str;
        this.f37798u0 = true;
        n(false, true);
        y();
        Object obj = this.f37759C;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0291j.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e9) {
                    throw new IllegalArgumentException(e9);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC4541a abstractC4541a = this.f37768H;
                if (abstractC4541a == null) {
                    this.f37769H0 = true;
                } else {
                    abstractC4541a.l(true);
                }
            }
            synchronized (p.f37903A) {
                p.f(this);
                p.f37911z.add(new WeakReference(this));
            }
        }
        this.f37801x0 = new Configuration(this.f37760D.getResources().getConfiguration());
        this.f37799v0 = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // h.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e() {
        AbstractC4541a abstractC4541a;
        x xVar;
        x xVar2;
        if (this.f37759C instanceof Activity) {
            synchronized (p.f37903A) {
                p.f(this);
            }
        }
        if (this.f37763E0) {
            this.f37762E.getDecorView().removeCallbacks(this.f37767G0);
        }
        this.f37800w0 = true;
        if (this.f37802y0 != -100) {
            Object obj = this.f37759C;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f37754N0.put(this.f37759C.getClass().getName(), Integer.valueOf(this.f37802y0));
                abstractC4541a = this.f37768H;
                if (abstractC4541a != null) {
                    abstractC4541a.h();
                }
                xVar = this.C0;
                if (xVar != null) {
                    xVar.c();
                }
                xVar2 = this.f37761D0;
                if (xVar2 == null) {
                    xVar2.c();
                    return;
                }
                return;
            }
        }
        f37754N0.remove(this.f37759C.getClass().getName());
        abstractC4541a = this.f37768H;
        if (abstractC4541a != null) {
        }
        xVar = this.C0;
        if (xVar != null) {
        }
        xVar2 = this.f37761D0;
        if (xVar2 == null) {
        }
    }

    @Override // h.p
    public final boolean g(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.f37793p0 && i == 108) {
            return false;
        }
        if (this.Y && i == 1) {
            this.Y = false;
        }
        if (i == 1) {
            J();
            this.f37793p0 = true;
            return true;
        }
        if (i == 2) {
            J();
            this.f37788W = true;
            return true;
        }
        if (i == 5) {
            J();
            this.f37789X = true;
            return true;
        }
        if (i == 10) {
            J();
            this.f37791n0 = true;
            return true;
        }
        if (i == 108) {
            J();
            this.Y = true;
            return true;
        }
        if (i != 109) {
            return this.f37762E.requestFeature(i);
        }
        J();
        this.f37790Z = true;
        return true;
    }

    @Override // h.p
    public final void h(int i) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f37785T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f37760D).inflate(i, viewGroup);
        this.f37764F.a(this.f37762E.getCallback());
    }

    @Override // h.p
    public final void i(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f37785T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f37764F.a(this.f37762E.getCallback());
    }

    @Override // h.p
    public final void j(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f37785T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f37764F.a(this.f37762E.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // l.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(l.m mVar) {
        ActionMenuView actionMenuView;
        C4695k c4695k;
        InterfaceC4690h0 interfaceC4690h0 = this.f37773K;
        if (interfaceC4690h0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4690h0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((X0) actionBarOverlayLayout.f4556x).f39081a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f4609n) != null && actionMenuView.f4561L) {
                if (ViewConfiguration.get(this.f37760D).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f37773K;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((X0) actionBarOverlayLayout2.f4556x).f39081a.f4609n;
                    if (actionMenuView2 != null) {
                        C4695k c4695k2 = actionMenuView2.f4562M;
                        if (c4695k2 != null) {
                            if (c4695k2.f39169N == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f37762E.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f37773K;
                actionBarOverlayLayout3.k();
                if (((X0) actionBarOverlayLayout3.f4556x).f39081a.p()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f37773K;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((X0) actionBarOverlayLayout4.f4556x).f39081a.f4609n;
                    if (actionMenuView3 != null && (c4695k = actionMenuView3.f4562M) != null) {
                        c4695k.f();
                    }
                    if (this.f37800w0) {
                        return;
                    }
                    callback.onPanelClosed(108, B(0).f37934h);
                    return;
                }
                if (callback == null || this.f37800w0) {
                    return;
                }
                if (this.f37763E0 && (1 & this.f37765F0) != 0) {
                    View decorView = this.f37762E.getDecorView();
                    q qVar = this.f37767G0;
                    decorView.removeCallbacks(qVar);
                    qVar.run();
                }
                z B9 = B(0);
                l.m mVar2 = B9.f37934h;
                if (mVar2 == null || B9.f37940o || !callback.onPreparePanel(0, B9.f37933g, mVar2)) {
                    return;
                }
                callback.onMenuOpened(108, B9.f37934h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f37773K;
                actionBarOverlayLayout5.k();
                ((X0) actionBarOverlayLayout5.f4556x).f39081a.v();
                return;
            }
        }
        z B10 = B(0);
        B10.f37939n = true;
        t(B10, false);
        G(B10, null);
    }

    @Override // h.p
    public final void l(CharSequence charSequence) {
        this.J = charSequence;
        InterfaceC4690h0 interfaceC4690h0 = this.f37773K;
        if (interfaceC4690h0 != null) {
            interfaceC4690h0.setWindowTitle(charSequence);
            return;
        }
        AbstractC4541a abstractC4541a = this.f37768H;
        if (abstractC4541a != null) {
            abstractC4541a.r(charSequence);
            return;
        }
        TextView textView = this.f37786U;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0049  */
    /* JADX WARN: Type inference failed for: r3v1, types: [h.l, java.lang.Object] */
    @Override // h.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC4615b m(InterfaceC4614a interfaceC4614a) {
        AbstractC4615b onWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        AbstractC4615b abstractC4615b;
        boolean z3 = false;
        int i = 1;
        if (interfaceC4614a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC4615b abstractC4615b2 = this.f37779N;
        if (abstractC4615b2 != null) {
            abstractC4615b2.a();
        }
        S0.e eVar = new S0.e(this, interfaceC4614a, 29, z3);
        C();
        AbstractC4541a abstractC4541a = this.f37768H;
        ?? r32 = this.f37766G;
        if (abstractC4541a != null) {
            AbstractC4615b s9 = abstractC4541a.s(eVar);
            this.f37779N = s9;
            if (s9 != null) {
                r32.onSupportActionModeStarted(s9);
            }
        }
        if (this.f37779N == null) {
            C0330e0 c0330e0 = this.f37783R;
            if (c0330e0 != null) {
                c0330e0.b();
            }
            AbstractC4615b abstractC4615b3 = this.f37779N;
            if (abstractC4615b3 != null) {
                abstractC4615b3.a();
            }
            if (!this.f37800w0) {
                try {
                    onWindowStartingSupportActionMode = r32.onWindowStartingSupportActionMode(eVar);
                } catch (AbstractMethodError unused) {
                }
                if (onWindowStartingSupportActionMode == null) {
                    this.f37779N = onWindowStartingSupportActionMode;
                } else {
                    if (this.f37780O == null) {
                        if (this.f37792o0) {
                            TypedValue typedValue = new TypedValue();
                            Context context = this.f37760D;
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(C5275R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                C4617d c4617d = new C4617d(context, 0);
                                c4617d.getTheme().setTo(newTheme);
                                context = c4617d;
                            }
                            this.f37780O = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, C5275R.attr.actionModePopupWindowStyle);
                            this.f37781P = popupWindow;
                            U.l.d(popupWindow, 2);
                            this.f37781P.setContentView(this.f37780O);
                            this.f37781P.setWidth(-1);
                            context.getTheme().resolveAttribute(C5275R.attr.actionBarSize, typedValue, true);
                            this.f37780O.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.f37781P.setHeight(-2);
                            this.f37782Q = new q(this, i);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f37785T.findViewById(C5275R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(z()));
                                this.f37780O = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.f37780O != null) {
                        C0330e0 c0330e02 = this.f37783R;
                        if (c0330e02 != null) {
                            c0330e02.b();
                        }
                        this.f37780O.e();
                        Context context2 = this.f37780O.getContext();
                        ActionBarContextView actionBarContextView = this.f37780O;
                        C4618e c4618e = new C4618e();
                        c4618e.f38494v = context2;
                        c4618e.f38495w = actionBarContextView;
                        c4618e.f38496x = eVar;
                        l.m mVar = new l.m(actionBarContextView.getContext());
                        mVar.f38808E = 1;
                        c4618e.f38493A = mVar;
                        mVar.f38824x = c4618e;
                        if (((InterfaceC4614a) eVar.f2781u).g(c4618e, mVar)) {
                            c4618e.g();
                            this.f37780O.c(c4618e);
                            this.f37779N = c4618e;
                            if (this.f37784S && (viewGroup = this.f37785T) != null && viewGroup.isLaidOut()) {
                                this.f37780O.setAlpha(0.0f);
                                C0330e0 a9 = X.a(this.f37780O);
                                a9.a(1.0f);
                                this.f37783R = a9;
                                a9.d(new s(i, this));
                            } else {
                                this.f37780O.setAlpha(1.0f);
                                this.f37780O.setVisibility(0);
                                if (this.f37780O.getParent() instanceof View) {
                                    View view = (View) this.f37780O.getParent();
                                    WeakHashMap weakHashMap = X.f2054a;
                                    O.J.c(view);
                                }
                            }
                            if (this.f37781P != null) {
                                this.f37762E.getDecorView().post(this.f37782Q);
                            }
                        } else {
                            this.f37779N = null;
                        }
                    }
                }
                abstractC4615b = this.f37779N;
                if (abstractC4615b != null) {
                    r32.onSupportActionModeStarted(abstractC4615b);
                }
                K();
                this.f37779N = this.f37779N;
            }
            onWindowStartingSupportActionMode = null;
            if (onWindowStartingSupportActionMode == null) {
            }
            abstractC4615b = this.f37779N;
            if (abstractC4615b != null) {
            }
            K();
            this.f37779N = this.f37779N;
        }
        K();
        return this.f37779N;
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
    public final boolean n(boolean z3, boolean z6) {
        int i;
        Configuration configuration;
        K.l b9;
        int i6;
        boolean z9;
        boolean z10;
        Object obj;
        Object obj2;
        LongSparseArray longSparseArray;
        Activity activity;
        if (this.f37800w0) {
            return false;
        }
        int i9 = this.f37802y0;
        if (i9 == -100) {
            i9 = p.f37906u;
        }
        int i10 = i9;
        Context context = this.f37760D;
        int E8 = E(context, i10);
        int i11 = Build.VERSION.SDK_INT;
        K.l p9 = i11 < 33 ? p(context) : null;
        if (!z6 && p9 != null) {
            p9 = u.b(context.getResources().getConfiguration());
        }
        Configuration u3 = u(context, E8, p9, null, false);
        boolean z11 = this.f37758B0;
        Object obj3 = this.f37759C;
        if (!z11 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f37801x0;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i12 = configuration.uiMode & 48;
                int i13 = u3.uiMode & 48;
                K.l b10 = u.b(configuration);
                b9 = p9 != null ? null : u.b(u3);
                i6 = i12 == i13 ? 512 : 0;
                if (b9 != null && !b10.equals(b9)) {
                    i6 |= 8196;
                }
                if (((~i) & i6) != 0 && z3 && this.f37798u0 && ((f37756P0 || this.f37799v0) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i14 = Build.VERSION.SDK_INT;
                        if (i14 >= 31 && (i6 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(u3.getLayoutDirection());
                        }
                        if (i14 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new RunnableC0282a(r3, activity));
                        }
                        z9 = true;
                        if (!z9 || i6 == 0) {
                            z10 = z9;
                        } else {
                            r3 = (i & i6) == i6 ? 1 : 0;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i13;
                            if (b9 != null) {
                                u.d(configuration2, b9);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i15 = Build.VERSION.SDK_INT;
                            if (i15 < 26 && i15 < 28) {
                                if (!com.bumptech.glide.e.f23386h) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        com.bumptech.glide.e.f23385g = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e9) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e9);
                                    }
                                    com.bumptech.glide.e.f23386h = true;
                                }
                                Field field = com.bumptech.glide.e.f23385g;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e10) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!com.bumptech.glide.e.f23380b) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                com.bumptech.glide.e.f23379a = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e11) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
                                            }
                                            com.bumptech.glide.e.f23380b = true;
                                        }
                                        Field field2 = com.bumptech.glide.e.f23379a;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e12) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
                                            }
                                            if (obj2 != null) {
                                                if (!com.bumptech.glide.e.f23382d) {
                                                    try {
                                                        com.bumptech.glide.e.f23381c = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e13) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e13);
                                                    }
                                                    com.bumptech.glide.e.f23382d = true;
                                                }
                                                Class cls = com.bumptech.glide.e.f23381c;
                                                if (cls != null) {
                                                    if (!com.bumptech.glide.e.f23384f) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            com.bumptech.glide.e.f23383e = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e14) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e14);
                                                        }
                                                        com.bumptech.glide.e.f23384f = true;
                                                    }
                                                    Field field3 = com.bumptech.glide.e.f23383e;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e15) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e15);
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
                            int i16 = this.f37803z0;
                            if (i16 != 0) {
                                context.setTheme(i16);
                                z10 = true;
                                context.getTheme().applyStyle(this.f37803z0, true);
                            } else {
                                z10 = true;
                            }
                            if (r3 != 0 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof InterfaceC0503v) {
                                    if (((C0505x) ((InterfaceC0503v) activity2).getLifecycle()).f5178d.compareTo(EnumC0497o.f5166v) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f37799v0 && !this.f37800w0) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z10 && (obj3 instanceof AbstractActivityC4551k)) {
                            if ((i6 & 512) != 0) {
                                ((AbstractActivityC4551k) obj3).onNightModeChanged(E8);
                            }
                            if ((i6 & 4) != 0) {
                                ((AbstractActivityC4551k) obj3).onLocalesChanged(p9);
                            }
                        }
                        if (b9 != null) {
                            u.c(u.b(context.getResources().getConfiguration()));
                        }
                        if (i10 == 0) {
                            A(context).m();
                        } else {
                            x xVar = this.C0;
                            if (xVar != null) {
                                xVar.c();
                            }
                        }
                        if (i10 == 3) {
                            if (this.f37761D0 == null) {
                                this.f37761D0 = new x(this, context);
                            }
                            this.f37761D0.m();
                        } else {
                            x xVar2 = this.f37761D0;
                            if (xVar2 != null) {
                                xVar2.c();
                            }
                        }
                        return z10;
                    }
                }
                z9 = false;
                if (z9) {
                }
                z10 = z9;
                if (z10) {
                    if ((i6 & 512) != 0) {
                    }
                    if ((i6 & 4) != 0) {
                    }
                }
                if (b9 != null) {
                }
                if (i10 == 0) {
                }
                if (i10 == 3) {
                }
                return z10;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i11 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f37757A0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e16) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e16);
                this.f37757A0 = 0;
            }
        }
        this.f37758B0 = true;
        i = this.f37757A0;
        configuration = this.f37801x0;
        if (configuration == null) {
        }
        int i122 = configuration.uiMode & 48;
        int i132 = u3.uiMode & 48;
        K.l b102 = u.b(configuration);
        if (p9 != null) {
        }
        if (i122 == i132) {
        }
        if (b9 != null) {
            i6 |= 8196;
        }
        if (((~i) & i6) != 0) {
            activity = (Activity) obj3;
            if (!activity.isChild()) {
            }
        }
        z9 = false;
        if (z9) {
        }
        z10 = z9;
        if (z10) {
        }
        if (b9 != null) {
        }
        if (i10 == 0) {
        }
        if (i10 == 3) {
        }
        return z10;
    }

    public final void o(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f37762E != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof w) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        w wVar = new w(this, callback);
        this.f37764F = wVar;
        window.setCallback(wVar);
        j4.g r9 = j4.g.r(this.f37760D, null, f37755O0);
        Drawable j6 = r9.j(0);
        if (j6 != null) {
            window.setBackgroundDrawable(j6);
        }
        r9.t();
        this.f37762E = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f37776L0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f37778M0) != null) {
            v.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f37778M0 = null;
        }
        Object obj = this.f37759C;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f37776L0 = v.a(activity);
                K();
            }
        }
        this.f37776L0 = null;
        K();
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
        View c4669c;
        char c9 = 4;
        if (this.f37774K0 == null) {
            int[] iArr = AbstractC4518a.f37596j;
            Context context2 = this.f37760D;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f37774K0 = new C4536D();
            } else {
                try {
                    this.f37774K0 = (C4536D) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f37774K0 = new C4536D();
                }
            }
        }
        C4536D c4536d = this.f37774K0;
        int i = c1.f39130a;
        c4536d.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC4518a.f37611y, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c4617d = (resourceId == 0 || ((context instanceof C4617d) && ((C4617d) context).f38488a == resourceId)) ? context : new C4617d(context, resourceId);
        str.getClass();
        View view2 = null;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c9 = '\t';
                    break;
                }
                c9 = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c9 = '\n';
                    break;
                }
                c9 = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c9 = 11;
                    break;
                }
                c9 = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c9 = '\f';
                    break;
                }
                c9 = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c9 = '\r';
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                c4669c = new C4669C(c4617d, attributeSet);
                break;
            case 1:
                c4669c = new m.r(c4617d, attributeSet);
                break;
            case 2:
                c4669c = new C4722y(c4617d, attributeSet);
                break;
            case 3:
                c4669c = c4536d.e(c4617d, attributeSet);
                break;
            case 4:
                c4669c = new C4718w(c4617d, attributeSet, C5275R.attr.imageButtonStyle);
                break;
            case 5:
                c4669c = new C4671E(c4617d, attributeSet);
                break;
            case 6:
                c4669c = new O(c4617d, attributeSet);
                break;
            case 7:
                c4669c = c4536d.d(c4617d, attributeSet);
                break;
            case '\b':
                c4669c = new C4686f0(c4617d, attributeSet);
                break;
            case '\t':
                c4669c = new C4720x(c4617d, attributeSet, 0);
                break;
            case '\n':
                c4669c = c4536d.a(c4617d, attributeSet);
                break;
            case 11:
                c4669c = c4536d.c(c4617d, attributeSet);
                break;
            case '\f':
                c4669c = new C4714u(c4617d, attributeSet);
                break;
            case '\r':
                c4669c = c4536d.b(c4617d, attributeSet);
                break;
            default:
                c4669c = null;
                break;
        }
        if (c4669c == null && context != c4617d) {
            Object[] objArr = c4536d.f37816a;
            if (str.equals(com.anythink.expressad.a.f17596C)) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c4617d;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i6 = 0;
                    while (true) {
                        String[] strArr = C4536D.f37814g;
                        if (i6 < 3) {
                            View f3 = c4536d.f(c4617d, str, strArr[i6]);
                            if (f3 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = f3;
                            } else {
                                i6++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View f9 = c4536d.f(c4617d, str, null);
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
            c4669c = view2;
        }
        if (c4669c != null) {
            Context context3 = c4669c.getContext();
            if ((context3 instanceof ContextWrapper) && c4669c.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C4536D.f37810c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c4669c.setOnClickListener(new ViewOnClickListenerC4535C(c4669c, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c4617d.obtainStyledAttributes(attributeSet, C4536D.f37811d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z3 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = X.f2054a;
                    new O.G(C5275R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(c4669c, Boolean.valueOf(z3));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c4617d.obtainStyledAttributes(attributeSet, C4536D.f37812e);
                if (obtainStyledAttributes5.hasValue(0)) {
                    X.p(c4669c, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c4617d.obtainStyledAttributes(attributeSet, C4536D.f37813f);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z6 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = X.f2054a;
                    new O.G(C5275R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(c4669c, Boolean.valueOf(z6));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c4669c;
    }

    @Override // l.k
    public final boolean q(l.m mVar, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.f37762E.getCallback();
        if (callback != null && !this.f37800w0) {
            l.m k9 = mVar.k();
            z[] zVarArr = this.f37795r0;
            int length = zVarArr != null ? zVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    zVar = zVarArr[i];
                    if (zVar != null && zVar.f37934h == k9) {
                        break;
                    }
                    i++;
                } else {
                    zVar = null;
                    break;
                }
            }
            if (zVar != null) {
                return callback.onMenuItemSelected(zVar.f37927a, menuItem);
            }
        }
        return false;
    }

    public final void r(int i, z zVar, l.m mVar) {
        if (mVar == null) {
            if (zVar == null && i >= 0) {
                z[] zVarArr = this.f37795r0;
                if (i < zVarArr.length) {
                    zVar = zVarArr[i];
                }
            }
            if (zVar != null) {
                mVar = zVar.f37934h;
            }
        }
        if ((zVar == null || zVar.f37938m) && !this.f37800w0) {
            w wVar = this.f37764F;
            Window.Callback callback = this.f37762E.getCallback();
            wVar.getClass();
            try {
                wVar.f37921x = true;
                callback.onPanelClosed(i, mVar);
            } finally {
                wVar.f37921x = false;
            }
        }
    }

    public final void s(l.m mVar) {
        C4695k c4695k;
        if (this.f37794q0) {
            return;
        }
        this.f37794q0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f37773K;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((X0) actionBarOverlayLayout.f4556x).f39081a.f4609n;
        if (actionMenuView != null && (c4695k = actionMenuView.f4562M) != null) {
            c4695k.f();
            C4687g c4687g = c4695k.f39168M;
            if (c4687g != null && c4687g.b()) {
                c4687g.i.dismiss();
            }
        }
        Window.Callback callback = this.f37762E.getCallback();
        if (callback != null && !this.f37800w0) {
            callback.onPanelClosed(108, mVar);
        }
        this.f37794q0 = false;
    }

    public final void t(z zVar, boolean z3) {
        y yVar;
        InterfaceC4690h0 interfaceC4690h0;
        if (z3 && zVar.f37927a == 0 && (interfaceC4690h0 = this.f37773K) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4690h0;
            actionBarOverlayLayout.k();
            if (((X0) actionBarOverlayLayout.f4556x).f39081a.p()) {
                s(zVar.f37934h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f37760D.getSystemService("window");
        if (windowManager != null && zVar.f37938m && (yVar = zVar.f37931e) != null) {
            windowManager.removeView(yVar);
            if (z3) {
                r(zVar.f37927a, zVar, null);
            }
        }
        zVar.f37936k = false;
        zVar.f37937l = false;
        zVar.f37938m = false;
        zVar.f37932f = null;
        zVar.f37939n = true;
        if (this.f37796s0 == zVar) {
            this.f37796s0 = null;
        }
        if (zVar.f37927a == 0) {
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
        boolean z3;
        boolean z6;
        ActionMenuView actionMenuView;
        Object obj = this.f37759C;
        if ((!(obj instanceof InterfaceC0335j) && !(obj instanceof DialogInterfaceC4548h)) || (decorView = this.f37762E.getDecorView()) == null || !X2.e.G(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                w wVar = this.f37764F;
                Window.Callback callback = this.f37762E.getCallback();
                wVar.getClass();
                try {
                    wVar.f37920w = true;
                } finally {
                    wVar.f37920w = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.f37797t0 = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        z B9 = B(0);
                        if (!B9.f37938m) {
                            I(B9, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f37779N == null) {
                        z B10 = B(0);
                        InterfaceC4690h0 interfaceC4690h0 = this.f37773K;
                        Context context = this.f37760D;
                        if (interfaceC4690h0 != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4690h0;
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((X0) actionBarOverlayLayout.f4556x).f39081a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f4609n) != null && actionMenuView.f4561L && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f37773K;
                                actionBarOverlayLayout2.k();
                                if (((X0) actionBarOverlayLayout2.f4556x).f39081a.p()) {
                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f37773K;
                                    actionBarOverlayLayout3.k();
                                    ActionMenuView actionMenuView2 = ((X0) actionBarOverlayLayout3.f4556x).f39081a.f4609n;
                                    if (actionMenuView2 != null) {
                                        C4695k c4695k = actionMenuView2.f4562M;
                                        if (c4695k != null) {
                                        }
                                    }
                                } else if (!this.f37800w0 && I(B10, keyEvent)) {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f37773K;
                                    actionBarOverlayLayout4.k();
                                    z3 = ((X0) actionBarOverlayLayout4.f4556x).f39081a.v();
                                    if (z3) {
                                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(com.anythink.basead.exoplayer.k.o.f8445b);
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                                z3 = false;
                                if (z3) {
                                }
                            }
                        }
                        boolean z9 = B10.f37938m;
                        if (z9 || B10.f37937l) {
                            t(B10, true);
                            z3 = z9;
                            if (z3) {
                            }
                        } else {
                            if (B10.f37936k) {
                                if (B10.f37940o) {
                                    B10.f37936k = false;
                                    z6 = I(B10, keyEvent);
                                } else {
                                    z6 = true;
                                }
                                if (z6) {
                                    G(B10, keyEvent);
                                    z3 = true;
                                    if (z3) {
                                    }
                                }
                            }
                            z3 = false;
                            if (z3) {
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
        z B9 = B(i);
        if (B9.f37934h != null) {
            Bundle bundle = new Bundle();
            B9.f37934h.t(bundle);
            if (bundle.size() > 0) {
                B9.f37941p = bundle;
            }
            B9.f37934h.w();
            B9.f37934h.clear();
        }
        B9.f37940o = true;
        B9.f37939n = true;
        if ((i == 108 || i == 0) && this.f37773K != null) {
            z B10 = B(0);
            B10.f37936k = false;
            I(B10, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.f37784S) {
            return;
        }
        int[] iArr = AbstractC4518a.f37596j;
        Context context = this.f37760D;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(com.anythink.expressad.video.module.a.a.f21727Q, false)) {
            g(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            g(com.anythink.expressad.video.module.a.a.f21756z);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.f37792o0 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        y();
        this.f37762E.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f37793p0) {
            viewGroup = this.f37791n0 ? (ViewGroup) from.inflate(C5275R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C5275R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f37792o0) {
            viewGroup = (ViewGroup) from.inflate(C5275R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f37790Z = false;
            this.Y = false;
        } else if (this.Y) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C5275R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C4617d(context, typedValue.resourceId) : context).inflate(C5275R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC4690h0 interfaceC4690h0 = (InterfaceC4690h0) viewGroup.findViewById(C5275R.id.decor_content_parent);
            this.f37773K = interfaceC4690h0;
            interfaceC4690h0.setWindowCallback(this.f37762E.getCallback());
            if (this.f37790Z) {
                ((ActionBarOverlayLayout) this.f37773K).j(com.anythink.expressad.video.module.a.a.f21756z);
            }
            if (this.f37788W) {
                ((ActionBarOverlayLayout) this.f37773K).j(2);
            }
            if (this.f37789X) {
                ((ActionBarOverlayLayout) this.f37773K).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.Y + ", windowActionBarOverlay: " + this.f37790Z + ", android:windowIsFloating: " + this.f37792o0 + ", windowActionModeOverlay: " + this.f37791n0 + ", windowNoTitle: " + this.f37793p0 + " }");
        }
        r rVar = new r(this);
        WeakHashMap weakHashMap = X.f2054a;
        O.L.u(viewGroup, rVar);
        if (this.f37773K == null) {
            this.f37786U = (TextView) viewGroup.findViewById(C5275R.id.title);
        }
        boolean z3 = f1.f39146a;
        try {
            Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            method.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e9) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e9);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e10) {
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e10);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C5275R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f37762E.findViewById(R.id.content);
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
        this.f37762E.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new I0.j(26, this));
        this.f37785T = viewGroup;
        Object obj = this.f37759C;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.J;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC4690h0 interfaceC4690h02 = this.f37773K;
            if (interfaceC4690h02 != null) {
                interfaceC4690h02.setWindowTitle(title);
            } else {
                AbstractC4541a abstractC4541a = this.f37768H;
                if (abstractC4541a != null) {
                    abstractC4541a.r(title);
                } else {
                    TextView textView = this.f37786U;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f37785T.findViewById(R.id.content);
        View decorView = this.f37762E.getDecorView();
        contentFrameLayout2.f4581z.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f37784S = true;
        z B9 = B(0);
        if (this.f37800w0 || B9.f37934h != null) {
            return;
        }
        D(108);
    }

    public final void y() {
        if (this.f37762E == null) {
            Object obj = this.f37759C;
            if (obj instanceof Activity) {
                o(((Activity) obj).getWindow());
            }
        }
        if (this.f37762E == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context z() {
        C();
        AbstractC4541a abstractC4541a = this.f37768H;
        Context e9 = abstractC4541a != null ? abstractC4541a.e() : null;
        return e9 == null ? this.f37760D : e9;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
