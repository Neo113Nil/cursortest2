package h;

import D.AbstractC0279i;
import O.C0335e0;
import O.InterfaceC0340j;
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
import androidx.lifecycle.C0509x;
import androidx.lifecycle.EnumC0501o;
import androidx.lifecycle.InterfaceC0507v;
import com.IceFishing.LiveIceFishing.C5248R;
import com.facebook.ads.AdError;
import com.google.android.gms.internal.ads.LP;
import g.AbstractC4528a;
import i1.C4585b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k.AbstractC4625b;
import k.C4627d;
import k.C4628e;
import k.C4632i;
import k.InterfaceC4624a;
import l.C4662h;
import l.C4663i;
import m.C4681C;
import m.C4683E;
import m.C4699f0;
import m.C4700g;
import m.C4708k;
import m.C4723s;
import m.C4727u;
import m.C4731w;
import m.C4733x;
import m.C4735y;
import m.InterfaceC4703h0;
import m.O;
import m.Y0;
import m.d1;
import m.g1;

/* renamed from: h.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C4537A extends p implements l.k, LayoutInflater.Factory2 {

    /* renamed from: I0, reason: collision with root package name */
    public static final s.k f37780I0 = new s.k();

    /* renamed from: J0, reason: collision with root package name */
    public static final int[] f37781J0 = {R.attr.windowBackground};

    /* renamed from: K0, reason: collision with root package name */
    public static final boolean f37782K0 = !"robolectric".equals(Build.FINGERPRINT);

    /* renamed from: A0, reason: collision with root package name */
    public int f37783A0;

    /* renamed from: C, reason: collision with root package name */
    public final Object f37785C;
    public boolean C0;

    /* renamed from: D, reason: collision with root package name */
    public final Context f37786D;

    /* renamed from: D0, reason: collision with root package name */
    public Rect f37787D0;

    /* renamed from: E, reason: collision with root package name */
    public Window f37788E;

    /* renamed from: E0, reason: collision with root package name */
    public Rect f37789E0;

    /* renamed from: F, reason: collision with root package name */
    public w f37790F;

    /* renamed from: F0, reason: collision with root package name */
    public C4540D f37791F0;

    /* renamed from: G, reason: collision with root package name */
    public final Object f37792G;

    /* renamed from: G0, reason: collision with root package name */
    public OnBackInvokedDispatcher f37793G0;

    /* renamed from: H, reason: collision with root package name */
    public AbstractC4545a f37794H;

    /* renamed from: H0, reason: collision with root package name */
    public OnBackInvokedCallback f37795H0;

    /* renamed from: I, reason: collision with root package name */
    public C4632i f37796I;
    public CharSequence J;

    /* renamed from: K, reason: collision with root package name */
    public InterfaceC4703h0 f37797K;

    /* renamed from: L, reason: collision with root package name */
    public C4585b f37798L;

    /* renamed from: M, reason: collision with root package name */
    public r f37799M;

    /* renamed from: N, reason: collision with root package name */
    public AbstractC4625b f37800N;

    /* renamed from: O, reason: collision with root package name */
    public ActionBarContextView f37801O;

    /* renamed from: P, reason: collision with root package name */
    public PopupWindow f37802P;

    /* renamed from: Q, reason: collision with root package name */
    public q f37803Q;

    /* renamed from: S, reason: collision with root package name */
    public boolean f37805S;

    /* renamed from: T, reason: collision with root package name */
    public ViewGroup f37806T;

    /* renamed from: U, reason: collision with root package name */
    public TextView f37807U;

    /* renamed from: V, reason: collision with root package name */
    public View f37808V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f37809W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f37810X;
    public boolean Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f37811Z;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f37812i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f37813j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f37814k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f37815l0;
    public z[] m0;

    /* renamed from: n0, reason: collision with root package name */
    public z f37816n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f37817o0;

    /* renamed from: p0, reason: collision with root package name */
    public boolean f37818p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f37819q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f37820r0;

    /* renamed from: s0, reason: collision with root package name */
    public Configuration f37821s0;

    /* renamed from: t0, reason: collision with root package name */
    public final int f37822t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f37823u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f37824v0;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f37825w0;

    /* renamed from: x0, reason: collision with root package name */
    public x f37826x0;

    /* renamed from: y0, reason: collision with root package name */
    public x f37827y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f37828z0;

    /* renamed from: R, reason: collision with root package name */
    public C0335e0 f37804R = null;

    /* renamed from: B0, reason: collision with root package name */
    public final q f37784B0 = new q(this, 0);

    public LayoutInflaterFactory2C4537A(Context context, Window window, InterfaceC4556l interfaceC4556l, Object obj) {
        AbstractActivityC4555k abstractActivityC4555k;
        this.f37822t0 = -100;
        this.f37786D = context;
        this.f37792G = interfaceC4556l;
        this.f37785C = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof AbstractActivityC4555k)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    abstractActivityC4555k = (AbstractActivityC4555k) context;
                    break;
                }
            }
            abstractActivityC4555k = null;
            if (abstractActivityC4555k != null) {
                this.f37822t0 = ((LayoutInflaterFactory2C4537A) abstractActivityC4555k.getDelegate()).f37822t0;
            }
        }
        if (this.f37822t0 == -100) {
            s.k kVar = f37780I0;
            Integer num = (Integer) kVar.getOrDefault(this.f37785C.getClass().getName(), null);
            if (num != null) {
                this.f37822t0 = num.intValue();
                kVar.remove(this.f37785C.getClass().getName());
            }
        }
        if (window != null) {
            p(window);
        }
        C4723s.d();
    }

    public static K.l q(Context context) {
        K.l lVar;
        K.l lVar2;
        if (Build.VERSION.SDK_INT >= 33 || (lVar = p.f37933v) == null) {
            return null;
        }
        K.l b9 = u.b(context.getApplicationContext().getResources().getConfiguration());
        K.m mVar = lVar.f1592a;
        if (mVar.f1593a.isEmpty()) {
            lVar2 = K.l.f1591b;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < b9.f1592a.f1593a.size() + mVar.f1593a.size()) {
                Locale locale = i < mVar.f1593a.size() ? mVar.f1593a.get(i) : b9.f1592a.f1593a.get(i - mVar.f1593a.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            lVar2 = new K.l(new K.m(K.k.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return lVar2.f1592a.f1593a.isEmpty() ? b9 : lVar2;
    }

    public static Configuration u(Context context, int i, K.l lVar, Configuration configuration, boolean z6) {
        int i4 = i != 1 ? i != 2 ? z6 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i4 | (configuration2.uiMode & (-49));
        if (lVar != null) {
            u.d(configuration2, lVar);
        }
        return configuration2;
    }

    public final B1.b A(Context context) {
        if (this.f37826x0 == null) {
            if (b3.e.f5555y == null) {
                Context applicationContext = context.getApplicationContext();
                b3.e.f5555y = new b3.e(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.f37826x0 = new x(this, b3.e.f5555y);
        }
        return this.f37826x0;
    }

    public final z B(int i) {
        z[] zVarArr = this.m0;
        if (zVarArr == null || zVarArr.length <= i) {
            z[] zVarArr2 = new z[i + 1];
            if (zVarArr != null) {
                System.arraycopy(zVarArr, 0, zVarArr2, 0, zVarArr.length);
            }
            this.m0 = zVarArr2;
            zVarArr = zVarArr2;
        }
        z zVar = zVarArr[i];
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z();
        zVar2.f37953a = i;
        zVar2.f37965n = false;
        zVarArr[i] = zVar2;
        return zVar2;
    }

    public final void C() {
        x();
        if (this.Y && this.f37794H == null) {
            Object obj = this.f37785C;
            if (obj instanceof Activity) {
                this.f37794H = new M((Activity) obj, this.f37811Z);
            } else if (obj instanceof Dialog) {
                this.f37794H = new M((Dialog) obj);
            }
            AbstractC4545a abstractC4545a = this.f37794H;
            if (abstractC4545a != null) {
                abstractC4545a.l(this.C0);
            }
        }
    }

    public final void D(int i) {
        this.f37783A0 = (1 << i) | this.f37783A0;
        if (this.f37828z0) {
            return;
        }
        View decorView = this.f37788E.getDecorView();
        q qVar = this.f37784B0;
        WeakHashMap weakHashMap = X.f2142a;
        decorView.postOnAnimation(qVar);
        this.f37828z0 = true;
    }

    public final int E(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                        }
                        if (this.f37827y0 == null) {
                            this.f37827y0 = new x(this, context);
                        }
                        return this.f37827y0.f();
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
        boolean z6 = this.f37817o0;
        this.f37817o0 = false;
        z B3 = B(0);
        if (!B3.f37964m) {
            AbstractC4625b abstractC4625b = this.f37800N;
            if (abstractC4625b != null) {
                abstractC4625b.a();
                return true;
            }
            C();
            AbstractC4545a abstractC4545a = this.f37794H;
            if (abstractC4545a == null || !abstractC4545a.b()) {
                return false;
            }
        } else if (!z6) {
            t(B3, true);
            return true;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0164, code lost:
    
        if (r15.f38723y.getCount() > 0) goto L81;
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
        if (zVar.f37964m || this.f37820r0) {
            return;
        }
        int i4 = zVar.f37953a;
        Context context = this.f37786D;
        if (i4 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.f37788E.getCallback();
        if (callback != null && !callback.onMenuOpened(i4, zVar.f37960h)) {
            t(zVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !I(zVar, keyEvent)) {
            return;
        }
        y yVar = zVar.f37957e;
        if (yVar == null || zVar.f37965n) {
            if (yVar == null) {
                Context z6 = z();
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = z6.getResources().newTheme();
                newTheme.setTo(z6.getTheme());
                newTheme.resolveAttribute(C5248R.attr.actionBarPopupTheme, typedValue, true);
                int i6 = typedValue.resourceId;
                if (i6 != 0) {
                    newTheme.applyStyle(i6, true);
                }
                newTheme.resolveAttribute(C5248R.attr.panelMenuListTheme, typedValue, true);
                int i9 = typedValue.resourceId;
                if (i9 != 0) {
                    newTheme.applyStyle(i9, true);
                } else {
                    newTheme.applyStyle(C5248R.style.Theme_AppCompat_CompactMenu, true);
                }
                C4627d c4627d = new C4627d(z6, 0);
                c4627d.getTheme().setTo(newTheme);
                zVar.f37961j = c4627d;
                TypedArray obtainStyledAttributes = c4627d.obtainStyledAttributes(AbstractC4528a.f37558j);
                zVar.f37954b = obtainStyledAttributes.getResourceId(86, 0);
                zVar.f37956d = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                zVar.f37957e = new y(this, zVar.f37961j);
                zVar.f37955c = 81;
            } else if (zVar.f37965n && yVar.getChildCount() > 0) {
                zVar.f37957e.removeAllViews();
            }
            View view = zVar.f37959g;
            if (view == null) {
                if (zVar.f37960h != null) {
                    if (this.f37799M == null) {
                        this.f37799M = new r(this);
                    }
                    r rVar = this.f37799M;
                    if (zVar.i == null) {
                        C4663i c4663i = new C4663i(zVar.f37961j);
                        zVar.i = c4663i;
                        c4663i.f38722x = rVar;
                        l.m mVar = zVar.f37960h;
                        mVar.b(c4663i, mVar.f38747n);
                    }
                    C4663i c4663i2 = zVar.i;
                    y yVar2 = zVar.f37957e;
                    if (c4663i2.f38721w == null) {
                        c4663i2.f38721w = (ExpandedMenuView) c4663i2.f38719u.inflate(C5248R.layout.abc_expanded_menu_layout, (ViewGroup) yVar2, false);
                        if (c4663i2.f38723y == null) {
                            c4663i2.f38723y = new C4662h(c4663i2);
                        }
                        c4663i2.f38721w.setAdapter((ListAdapter) c4663i2.f38723y);
                        c4663i2.f38721w.setOnItemClickListener(c4663i2);
                    }
                    ExpandedMenuView expandedMenuView = c4663i2.f38721w;
                    zVar.f37958f = expandedMenuView;
                }
                zVar.f37965n = true;
                return;
            }
            zVar.f37958f = view;
            if (zVar.f37958f != null) {
                if (zVar.f37959g == null) {
                    C4663i c4663i3 = zVar.i;
                    if (c4663i3.f38723y == null) {
                        c4663i3.f38723y = new C4662h(c4663i3);
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = zVar.f37958f.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                zVar.f37957e.setBackgroundResource(zVar.f37954b);
                ViewParent parent = zVar.f37958f.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(zVar.f37958f);
                }
                zVar.f37957e.addView(zVar.f37958f, layoutParams2);
                if (!zVar.f37958f.hasFocus()) {
                    zVar.f37958f.requestFocus();
                }
            }
            zVar.f37965n = true;
            return;
        }
        View view2 = zVar.f37959g;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            zVar.f37963l = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
            layoutParams3.gravity = zVar.f37955c;
            layoutParams3.windowAnimations = zVar.f37956d;
            windowManager.addView(zVar.f37957e, layoutParams3);
            zVar.f37964m = true;
            if (i4 != 0) {
                K();
                return;
            }
            return;
        }
        i = -2;
        zVar.f37963l = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, 8519680, -3);
        layoutParams32.gravity = zVar.f37955c;
        layoutParams32.windowAnimations = zVar.f37956d;
        windowManager.addView(zVar.f37957e, layoutParams32);
        zVar.f37964m = true;
        if (i4 != 0) {
        }
    }

    public final boolean H(z zVar, int i, KeyEvent keyEvent) {
        l.m mVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((zVar.f37962k || I(zVar, keyEvent)) && (mVar = zVar.f37960h) != null) {
            return mVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00d5, code lost:
    
        if (r13.f37960h == null) goto L81;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean I(z zVar, KeyEvent keyEvent) {
        InterfaceC4703h0 interfaceC4703h0;
        InterfaceC4703h0 interfaceC4703h02;
        Resources.Theme theme;
        InterfaceC4703h0 interfaceC4703h03;
        InterfaceC4703h0 interfaceC4703h04;
        if (!this.f37820r0) {
            if (zVar.f37962k) {
                return true;
            }
            z zVar2 = this.f37816n0;
            if (zVar2 != null && zVar2 != zVar) {
                t(zVar2, false);
            }
            Window.Callback callback = this.f37788E.getCallback();
            int i = zVar.f37953a;
            if (callback != null) {
                zVar.f37959g = callback.onCreatePanelView(i);
            }
            boolean z6 = i == 0 || i == 108;
            if (z6 && (interfaceC4703h04 = this.f37797K) != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4703h04;
                actionBarOverlayLayout.k();
                ((Y0) actionBarOverlayLayout.f4524x).f39161l = true;
            }
            if (zVar.f37959g == null && (!z6 || !(this.f37794H instanceof C4544H))) {
                l.m mVar = zVar.f37960h;
                if (mVar == null || zVar.f37966o) {
                    if (mVar == null) {
                        Context context = this.f37786D;
                        if ((i == 0 || i == 108) && this.f37797K != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(C5248R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(C5248R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(C5248R.attr.actionBarWidgetTheme, typedValue, true);
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
                                C4627d c4627d = new C4627d(context, 0);
                                c4627d.getTheme().setTo(theme);
                                context = c4627d;
                            }
                        }
                        l.m mVar2 = new l.m(context);
                        mVar2.f38751x = this;
                        l.m mVar3 = zVar.f37960h;
                        if (mVar2 != mVar3) {
                            if (mVar3 != null) {
                                mVar3.r(zVar.i);
                            }
                            zVar.f37960h = mVar2;
                            C4663i c4663i = zVar.i;
                            if (c4663i != null) {
                                mVar2.b(c4663i, mVar2.f38747n);
                            }
                        }
                    }
                    if (z6 && (interfaceC4703h02 = this.f37797K) != null) {
                        if (this.f37798L == null) {
                            this.f37798L = new C4585b(27, this);
                        }
                        ((ActionBarOverlayLayout) interfaceC4703h02).l(zVar.f37960h, this.f37798L);
                    }
                    zVar.f37960h.w();
                    if (callback.onCreatePanelMenu(i, zVar.f37960h)) {
                        zVar.f37966o = false;
                    } else {
                        l.m mVar4 = zVar.f37960h;
                        if (mVar4 != null) {
                            if (mVar4 != null) {
                                mVar4.r(zVar.i);
                            }
                            zVar.f37960h = null;
                        }
                        if (z6 && (interfaceC4703h0 = this.f37797K) != null) {
                            ((ActionBarOverlayLayout) interfaceC4703h0).l(null, this.f37798L);
                        }
                    }
                }
                zVar.f37960h.w();
                Bundle bundle = zVar.f37967p;
                if (bundle != null) {
                    zVar.f37960h.s(bundle);
                    zVar.f37967p = null;
                }
                if (!callback.onPreparePanel(0, zVar.f37959g, zVar.f37960h)) {
                    if (z6 && (interfaceC4703h03 = this.f37797K) != null) {
                        ((ActionBarOverlayLayout) interfaceC4703h03).l(null, this.f37798L);
                    }
                    zVar.f37960h.v();
                    return false;
                }
                zVar.f37960h.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                zVar.f37960h.v();
            }
            zVar.f37962k = true;
            zVar.f37963l = false;
            this.f37816n0 = zVar;
            return true;
        }
        return false;
    }

    public final void J() {
        if (this.f37805S) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void K() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z6 = false;
            if (this.f37793G0 != null && (B(0).f37964m || this.f37800N != null)) {
                z6 = true;
            }
            if (z6 && this.f37795H0 == null) {
                this.f37795H0 = v.b(this.f37793G0, this);
            } else {
                if (z6 || (onBackInvokedCallback = this.f37795H0) == null) {
                    return;
                }
                v.c(this.f37793G0, onBackInvokedCallback);
                this.f37795H0 = null;
            }
        }
    }

    @Override // h.p
    public final void a() {
        LayoutInflater from = LayoutInflater.from(this.f37786D);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof LayoutInflaterFactory2C4537A) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // h.p
    public final void b() {
        if (this.f37794H != null) {
            C();
            if (this.f37794H.f()) {
                return;
            }
            D(0);
        }
    }

    @Override // h.p
    public final void d() {
        String str;
        this.f37818p0 = true;
        o(false, true);
        y();
        Object obj = this.f37785C;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0279i.c(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e9) {
                    throw new IllegalArgumentException(e9);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                AbstractC4545a abstractC4545a = this.f37794H;
                if (abstractC4545a == null) {
                    this.C0 = true;
                } else {
                    abstractC4545a.l(true);
                }
            }
            synchronized (p.f37929A) {
                p.f(this);
                p.f37937z.add(new WeakReference(this));
            }
        }
        this.f37821s0 = new Configuration(this.f37786D.getResources().getConfiguration());
        this.f37819q0 = true;
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
        AbstractC4545a abstractC4545a;
        x xVar;
        x xVar2;
        if (this.f37785C instanceof Activity) {
            synchronized (p.f37929A) {
                p.f(this);
            }
        }
        if (this.f37828z0) {
            this.f37788E.getDecorView().removeCallbacks(this.f37784B0);
        }
        this.f37820r0 = true;
        if (this.f37822t0 != -100) {
            Object obj = this.f37785C;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f37780I0.put(this.f37785C.getClass().getName(), Integer.valueOf(this.f37822t0));
                abstractC4545a = this.f37794H;
                if (abstractC4545a != null) {
                    abstractC4545a.h();
                }
                xVar = this.f37826x0;
                if (xVar != null) {
                    xVar.c();
                }
                xVar2 = this.f37827y0;
                if (xVar2 == null) {
                    xVar2.c();
                    return;
                }
                return;
            }
        }
        f37780I0.remove(this.f37785C.getClass().getName());
        abstractC4545a = this.f37794H;
        if (abstractC4545a != null) {
        }
        xVar = this.f37826x0;
        if (xVar != null) {
        }
        xVar2 = this.f37827y0;
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
        if (this.f37814k0 && i == 108) {
            return false;
        }
        if (this.Y && i == 1) {
            this.Y = false;
        }
        if (i == 1) {
            J();
            this.f37814k0 = true;
            return true;
        }
        if (i == 2) {
            J();
            this.f37809W = true;
            return true;
        }
        if (i == 5) {
            J();
            this.f37810X = true;
            return true;
        }
        if (i == 10) {
            J();
            this.f37812i0 = true;
            return true;
        }
        if (i == 108) {
            J();
            this.Y = true;
            return true;
        }
        if (i != 109) {
            return this.f37788E.requestFeature(i);
        }
        J();
        this.f37811Z = true;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r6.k() != false) goto L20;
     */
    @Override // l.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(l.m mVar) {
        ActionMenuView actionMenuView;
        C4708k c4708k;
        InterfaceC4703h0 interfaceC4703h0 = this.f37797K;
        if (interfaceC4703h0 != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4703h0;
            actionBarOverlayLayout.k();
            Toolbar toolbar = ((Y0) actionBarOverlayLayout.f4524x).f39151a;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f4579n) != null && actionMenuView.f4529L) {
                if (ViewConfiguration.get(this.f37786D).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f37797K;
                    actionBarOverlayLayout2.k();
                    ActionMenuView actionMenuView2 = ((Y0) actionBarOverlayLayout2.f4524x).f39151a.f4579n;
                    if (actionMenuView2 != null) {
                        C4708k c4708k2 = actionMenuView2.f4530M;
                        if (c4708k2 != null) {
                            if (c4708k2.f39238N == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.f37788E.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f37797K;
                actionBarOverlayLayout3.k();
                if (((Y0) actionBarOverlayLayout3.f4524x).f39151a.p()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f37797K;
                    actionBarOverlayLayout4.k();
                    ActionMenuView actionMenuView3 = ((Y0) actionBarOverlayLayout4.f4524x).f39151a.f4579n;
                    if (actionMenuView3 != null && (c4708k = actionMenuView3.f4530M) != null) {
                        c4708k.f();
                    }
                    if (this.f37820r0) {
                        return;
                    }
                    callback.onPanelClosed(108, B(0).f37960h);
                    return;
                }
                if (callback == null || this.f37820r0) {
                    return;
                }
                if (this.f37828z0 && (1 & this.f37783A0) != 0) {
                    View decorView = this.f37788E.getDecorView();
                    q qVar = this.f37784B0;
                    decorView.removeCallbacks(qVar);
                    qVar.run();
                }
                z B3 = B(0);
                l.m mVar2 = B3.f37960h;
                if (mVar2 == null || B3.f37966o || !callback.onPreparePanel(0, B3.f37959g, mVar2)) {
                    return;
                }
                callback.onMenuOpened(108, B3.f37960h);
                ActionBarOverlayLayout actionBarOverlayLayout5 = (ActionBarOverlayLayout) this.f37797K;
                actionBarOverlayLayout5.k();
                ((Y0) actionBarOverlayLayout5.f4524x).f39151a.v();
                return;
            }
        }
        z B9 = B(0);
        B9.f37965n = true;
        t(B9, false);
        G(B9, null);
    }

    @Override // h.p
    public final void i(int i) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f37806T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f37786D).inflate(i, viewGroup);
        this.f37790F.a(this.f37788E.getCallback());
    }

    @Override // h.p
    public final void j(View view) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f37806T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f37790F.a(this.f37788E.getCallback());
    }

    @Override // h.p
    public final void k(View view, ViewGroup.LayoutParams layoutParams) {
        x();
        ViewGroup viewGroup = (ViewGroup) this.f37806T.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f37790F.a(this.f37788E.getCallback());
    }

    @Override // h.p
    public final void l(CharSequence charSequence) {
        this.J = charSequence;
        InterfaceC4703h0 interfaceC4703h0 = this.f37797K;
        if (interfaceC4703h0 != null) {
            interfaceC4703h0.setWindowTitle(charSequence);
            return;
        }
        AbstractC4545a abstractC4545a = this.f37794H;
        if (abstractC4545a != null) {
            abstractC4545a.r(charSequence);
            return;
        }
        TextView textView = this.f37807U;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // l.k
    public final boolean m(l.m mVar, MenuItem menuItem) {
        z zVar;
        Window.Callback callback = this.f37788E.getCallback();
        if (callback != null && !this.f37820r0) {
            l.m k9 = mVar.k();
            z[] zVarArr = this.m0;
            int length = zVarArr != null ? zVarArr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    zVar = zVarArr[i];
                    if (zVar != null && zVar.f37960h == k9) {
                        break;
                    }
                    i++;
                } else {
                    zVar = null;
                    break;
                }
            }
            if (zVar != null) {
                return callback.onMenuItemSelected(zVar.f37953a, menuItem);
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0046  */
    /* JADX WARN: Type inference failed for: r2v0, types: [h.l, java.lang.Object] */
    @Override // h.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC4625b n(InterfaceC4624a interfaceC4624a) {
        AbstractC4625b onWindowStartingSupportActionMode;
        ViewGroup viewGroup;
        AbstractC4625b abstractC4625b;
        int i = 1;
        if (interfaceC4624a == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC4625b abstractC4625b2 = this.f37800N;
        if (abstractC4625b2 != null) {
            abstractC4625b2.a();
        }
        LP lp = new LP(this, interfaceC4624a);
        C();
        AbstractC4545a abstractC4545a = this.f37794H;
        ?? r22 = this.f37792G;
        if (abstractC4545a != null) {
            AbstractC4625b s9 = abstractC4545a.s(lp);
            this.f37800N = s9;
            if (s9 != null) {
                r22.onSupportActionModeStarted(s9);
            }
        }
        if (this.f37800N == null) {
            C0335e0 c0335e0 = this.f37804R;
            if (c0335e0 != null) {
                c0335e0.b();
            }
            AbstractC4625b abstractC4625b3 = this.f37800N;
            if (abstractC4625b3 != null) {
                abstractC4625b3.a();
            }
            if (!this.f37820r0) {
                try {
                    onWindowStartingSupportActionMode = r22.onWindowStartingSupportActionMode(lp);
                } catch (AbstractMethodError unused) {
                }
                if (onWindowStartingSupportActionMode == null) {
                    this.f37800N = onWindowStartingSupportActionMode;
                } else {
                    if (this.f37801O == null) {
                        if (this.f37813j0) {
                            TypedValue typedValue = new TypedValue();
                            Context context = this.f37786D;
                            Resources.Theme theme = context.getTheme();
                            theme.resolveAttribute(C5248R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                Resources.Theme newTheme = context.getResources().newTheme();
                                newTheme.setTo(theme);
                                newTheme.applyStyle(typedValue.resourceId, true);
                                C4627d c4627d = new C4627d(context, 0);
                                c4627d.getTheme().setTo(newTheme);
                                context = c4627d;
                            }
                            this.f37801O = new ActionBarContextView(context, null);
                            PopupWindow popupWindow = new PopupWindow(context, (AttributeSet) null, C5248R.attr.actionModePopupWindowStyle);
                            this.f37802P = popupWindow;
                            U.l.d(popupWindow, 2);
                            this.f37802P.setContentView(this.f37801O);
                            this.f37802P.setWidth(-1);
                            context.getTheme().resolveAttribute(C5248R.attr.actionBarSize, typedValue, true);
                            this.f37801O.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics()));
                            this.f37802P.setHeight(-2);
                            this.f37803Q = new q(this, i);
                        } else {
                            ViewStubCompat viewStubCompat = (ViewStubCompat) this.f37806T.findViewById(C5248R.id.action_mode_bar_stub);
                            if (viewStubCompat != null) {
                                viewStubCompat.setLayoutInflater(LayoutInflater.from(z()));
                                this.f37801O = (ActionBarContextView) viewStubCompat.a();
                            }
                        }
                    }
                    if (this.f37801O != null) {
                        C0335e0 c0335e02 = this.f37804R;
                        if (c0335e02 != null) {
                            c0335e02.b();
                        }
                        this.f37801O.e();
                        Context context2 = this.f37801O.getContext();
                        ActionBarContextView actionBarContextView = this.f37801O;
                        C4628e c4628e = new C4628e();
                        c4628e.f38506v = context2;
                        c4628e.f38507w = actionBarContextView;
                        c4628e.f38508x = lp;
                        l.m mVar = new l.m(actionBarContextView.getContext());
                        mVar.f38735E = 1;
                        c4628e.f38505A = mVar;
                        mVar.f38751x = c4628e;
                        if (((InterfaceC4624a) lp.f26916u).f(c4628e, mVar)) {
                            c4628e.g();
                            this.f37801O.c(c4628e);
                            this.f37800N = c4628e;
                            if (this.f37805S && (viewGroup = this.f37806T) != null && viewGroup.isLaidOut()) {
                                this.f37801O.setAlpha(0.0f);
                                C0335e0 a9 = X.a(this.f37801O);
                                a9.a(1.0f);
                                this.f37804R = a9;
                                a9.d(new s(i, this));
                            } else {
                                this.f37801O.setAlpha(1.0f);
                                this.f37801O.setVisibility(0);
                                if (this.f37801O.getParent() instanceof View) {
                                    View view = (View) this.f37801O.getParent();
                                    WeakHashMap weakHashMap = X.f2142a;
                                    O.J.c(view);
                                }
                            }
                            if (this.f37802P != null) {
                                this.f37788E.getDecorView().post(this.f37803Q);
                            }
                        } else {
                            this.f37800N = null;
                        }
                    }
                }
                abstractC4625b = this.f37800N;
                if (abstractC4625b != null) {
                    r22.onSupportActionModeStarted(abstractC4625b);
                }
                K();
                this.f37800N = this.f37800N;
            }
            onWindowStartingSupportActionMode = null;
            if (onWindowStartingSupportActionMode == null) {
            }
            abstractC4625b = this.f37800N;
            if (abstractC4625b != null) {
            }
            K();
            this.f37800N = this.f37800N;
        }
        K();
        return this.f37800N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0195  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(boolean z6, boolean z9) {
        int i;
        Configuration configuration;
        K.l b9;
        int i4;
        boolean z10;
        Object obj;
        Object obj2;
        LongSparseArray longSparseArray;
        Activity activity;
        boolean z11 = true;
        z11 = true;
        z11 = true;
        z11 = true;
        z11 = true;
        z11 = true;
        z11 = true;
        if (this.f37820r0) {
            return false;
        }
        int i6 = this.f37822t0;
        if (i6 == -100) {
            i6 = p.f37932u;
        }
        int i9 = i6;
        Context context = this.f37786D;
        int E8 = E(context, i9);
        int i10 = Build.VERSION.SDK_INT;
        K.l q8 = i10 < 33 ? q(context) : null;
        if (!z9 && q8 != null) {
            q8 = u.b(context.getResources().getConfiguration());
        }
        Configuration u6 = u(context, E8, q8, null, false);
        boolean z12 = this.f37825w0;
        Object obj3 = this.f37785C;
        if (!z12 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.f37821s0;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i11 = configuration.uiMode & 48;
                int i12 = u6.uiMode & 48;
                K.l b10 = u.b(configuration);
                b9 = q8 != null ? null : u.b(u6);
                i4 = i11 == i12 ? 512 : 0;
                if (b9 != null && !b10.equals(b9)) {
                    i4 |= 8196;
                }
                if (((~i) & i4) != 0 && z6 && this.f37818p0 && ((f37782K0 || this.f37819q0) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i13 = Build.VERSION.SDK_INT;
                        if (i13 >= 31 && (i4 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(u6.getLayoutDirection());
                        }
                        if (i13 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new A3.p(z11 ? 1 : 0, activity));
                        }
                        z10 = true;
                        if (!z10 || i4 == 0) {
                            z11 = z10;
                        } else {
                            boolean z13 = (i & i4) == i4;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i12;
                            if (b9 != null) {
                                u.d(configuration2, b9);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i14 = Build.VERSION.SDK_INT;
                            if (i14 < 26 && i14 < 28) {
                                if (!com.bumptech.glide.f.f24176h) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        com.bumptech.glide.f.f24175g = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e9) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e9);
                                    }
                                    com.bumptech.glide.f.f24176h = true;
                                }
                                Field field = com.bumptech.glide.f.f24175g;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e10) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!com.bumptech.glide.f.f24170b) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                com.bumptech.glide.f.f24169a = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e11) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
                                            }
                                            com.bumptech.glide.f.f24170b = true;
                                        }
                                        Field field2 = com.bumptech.glide.f.f24169a;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e12) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
                                            }
                                            if (obj2 != null) {
                                                if (!com.bumptech.glide.f.f24172d) {
                                                    try {
                                                        com.bumptech.glide.f.f24171c = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e13) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e13);
                                                    }
                                                    com.bumptech.glide.f.f24172d = true;
                                                }
                                                Class cls = com.bumptech.glide.f.f24171c;
                                                if (cls != null) {
                                                    if (!com.bumptech.glide.f.f24174f) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            com.bumptech.glide.f.f24173e = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e14) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e14);
                                                        }
                                                        com.bumptech.glide.f.f24174f = true;
                                                    }
                                                    Field field3 = com.bumptech.glide.f.f24173e;
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
                            int i15 = this.f37823u0;
                            if (i15 != 0) {
                                context.setTheme(i15);
                                context.getTheme().applyStyle(this.f37823u0, true);
                            }
                            if (z13 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof InterfaceC0507v) {
                                    if (((C0509x) ((InterfaceC0507v) activity2).getLifecycle()).f5145d.compareTo(EnumC0501o.f5133v) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.f37819q0 && !this.f37820r0) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (z11 && (obj3 instanceof AbstractActivityC4555k)) {
                            if ((i4 & 512) != 0) {
                                ((AbstractActivityC4555k) obj3).onNightModeChanged(E8);
                            }
                            if ((i4 & 4) != 0) {
                                ((AbstractActivityC4555k) obj3).onLocalesChanged(q8);
                            }
                        }
                        if (b9 != null) {
                            u.c(u.b(context.getResources().getConfiguration()));
                        }
                        if (i9 == 0) {
                            A(context).m();
                        } else {
                            x xVar = this.f37826x0;
                            if (xVar != null) {
                                xVar.c();
                            }
                        }
                        if (i9 == 3) {
                            if (this.f37827y0 == null) {
                                this.f37827y0 = new x(this, context);
                            }
                            this.f37827y0.m();
                        } else {
                            x xVar2 = this.f37827y0;
                            if (xVar2 != null) {
                                xVar2.c();
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
                if (i9 == 0) {
                }
                if (i9 == 3) {
                }
                return z11;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i10 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f37824v0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e16) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e16);
                this.f37824v0 = 0;
            }
        }
        this.f37825w0 = true;
        i = this.f37824v0;
        configuration = this.f37821s0;
        if (configuration == null) {
        }
        int i112 = configuration.uiMode & 48;
        int i122 = u6.uiMode & 48;
        K.l b102 = u.b(configuration);
        if (q8 != null) {
        }
        if (i112 == i122) {
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
        if (i9 == 0) {
        }
        if (i9 == 3) {
        }
        return z11;
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
        View c4681c;
        char c9 = 4;
        if (this.f37791F0 == null) {
            int[] iArr = AbstractC4528a.f37558j;
            Context context2 = this.f37786D;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                this.f37791F0 = new C4540D();
            } else {
                try {
                    this.f37791F0 = (C4540D) context2.getClassLoader().loadClass(string).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f37791F0 = new C4540D();
                }
            }
        }
        C4540D c4540d = this.f37791F0;
        int i = d1.f39199a;
        c4540d.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC4528a.f37573y, 0, 0);
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context c4627d = (resourceId == 0 || ((context instanceof C4627d) && ((C4627d) context).f38500a == resourceId)) ? context : new C4627d(context, resourceId);
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
                c4681c = new C4681C(c4627d, attributeSet);
                break;
            case 1:
                c4681c = new m.r(c4627d, attributeSet);
                break;
            case 2:
                c4681c = new C4735y(c4627d, attributeSet);
                break;
            case 3:
                c4681c = c4540d.e(c4627d, attributeSet);
                break;
            case 4:
                c4681c = new C4731w(c4627d, attributeSet, C5248R.attr.imageButtonStyle);
                break;
            case 5:
                c4681c = new C4683E(c4627d, attributeSet);
                break;
            case 6:
                c4681c = new O(c4627d, attributeSet);
                break;
            case 7:
                c4681c = c4540d.d(c4627d, attributeSet);
                break;
            case '\b':
                c4681c = new C4699f0(c4627d, attributeSet);
                break;
            case '\t':
                c4681c = new C4733x(c4627d, attributeSet, 0);
                break;
            case '\n':
                c4681c = c4540d.a(c4627d, attributeSet);
                break;
            case 11:
                c4681c = c4540d.c(c4627d, attributeSet);
                break;
            case '\f':
                c4681c = new C4727u(c4627d, attributeSet);
                break;
            case '\r':
                c4681c = c4540d.b(c4627d, attributeSet);
                break;
            default:
                c4681c = null;
                break;
        }
        if (c4681c == null && context != c4627d) {
            Object[] objArr = c4540d.f37841a;
            if (str.equals(com.anythink.expressad.a.f18383C)) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = c4627d;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i4 = 0;
                    while (true) {
                        String[] strArr = C4540D.f37839g;
                        if (i4 < 3) {
                            View f2 = c4540d.f(c4627d, str, strArr[i4]);
                            if (f2 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = f2;
                            } else {
                                i4++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View f9 = c4540d.f(c4627d, str, null);
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
            c4681c = view2;
        }
        if (c4681c != null) {
            Context context3 = c4681c.getContext();
            if ((context3 instanceof ContextWrapper) && c4681c.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, C4540D.f37835c);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    c4681c.setOnClickListener(new ViewOnClickListenerC4539C(c4681c, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = c4627d.obtainStyledAttributes(attributeSet, C4540D.f37836d);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z6 = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = X.f2142a;
                    new O.G(C5248R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).f(c4681c, Boolean.valueOf(z6));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = c4627d.obtainStyledAttributes(attributeSet, C4540D.f37837e);
                if (obtainStyledAttributes5.hasValue(0)) {
                    X.p(c4681c, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = c4627d.obtainStyledAttributes(attributeSet, C4540D.f37838f);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z9 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = X.f2142a;
                    new O.G(C5248R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).f(c4681c, Boolean.valueOf(z9));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return c4681c;
    }

    public final void p(Window window) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        if (this.f37788E != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof w) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        w wVar = new w(this, callback);
        this.f37790F = wVar;
        window.setCallback(wVar);
        l4.g r9 = l4.g.r(this.f37786D, null, f37781J0);
        Drawable j6 = r9.j(0);
        if (j6 != null) {
            window.setBackgroundDrawable(j6);
        }
        r9.t();
        this.f37788E = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.f37793G0) != null) {
            return;
        }
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.f37795H0) != null) {
            v.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f37795H0 = null;
        }
        Object obj = this.f37785C;
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.f37793G0 = v.a(activity);
                K();
            }
        }
        this.f37793G0 = null;
        K();
    }

    public final void r(int i, z zVar, l.m mVar) {
        if (mVar == null) {
            if (zVar == null && i >= 0) {
                z[] zVarArr = this.m0;
                if (i < zVarArr.length) {
                    zVar = zVarArr[i];
                }
            }
            if (zVar != null) {
                mVar = zVar.f37960h;
            }
        }
        if ((zVar == null || zVar.f37964m) && !this.f37820r0) {
            w wVar = this.f37790F;
            Window.Callback callback = this.f37788E.getCallback();
            wVar.getClass();
            try {
                wVar.f37947x = true;
                callback.onPanelClosed(i, mVar);
            } finally {
                wVar.f37947x = false;
            }
        }
    }

    public final void s(l.m mVar) {
        C4708k c4708k;
        if (this.f37815l0) {
            return;
        }
        this.f37815l0 = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f37797K;
        actionBarOverlayLayout.k();
        ActionMenuView actionMenuView = ((Y0) actionBarOverlayLayout.f4524x).f39151a.f4579n;
        if (actionMenuView != null && (c4708k = actionMenuView.f4530M) != null) {
            c4708k.f();
            C4700g c4700g = c4708k.f39237M;
            if (c4700g != null && c4700g.b()) {
                c4700g.i.dismiss();
            }
        }
        Window.Callback callback = this.f37788E.getCallback();
        if (callback != null && !this.f37820r0) {
            callback.onPanelClosed(108, mVar);
        }
        this.f37815l0 = false;
    }

    public final void t(z zVar, boolean z6) {
        y yVar;
        InterfaceC4703h0 interfaceC4703h0;
        if (z6 && zVar.f37953a == 0 && (interfaceC4703h0 = this.f37797K) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4703h0;
            actionBarOverlayLayout.k();
            if (((Y0) actionBarOverlayLayout.f4524x).f39151a.p()) {
                s(zVar.f37960h);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.f37786D.getSystemService("window");
        if (windowManager != null && zVar.f37964m && (yVar = zVar.f37957e) != null) {
            windowManager.removeView(yVar);
            if (z6) {
                r(zVar.f37953a, zVar, null);
            }
        }
        zVar.f37962k = false;
        zVar.f37963l = false;
        zVar.f37964m = false;
        zVar.f37958f = null;
        zVar.f37965n = true;
        if (this.f37816n0 == zVar) {
            this.f37816n0 = null;
        }
        if (zVar.f37953a == 0) {
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
        boolean z6;
        boolean z9;
        ActionMenuView actionMenuView;
        Object obj = this.f37785C;
        if ((!(obj instanceof InterfaceC0340j) && !(obj instanceof DialogInterfaceC4552h)) || (decorView = this.f37788E.getDecorView()) == null || !X2.a.f(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                w wVar = this.f37790F;
                Window.Callback callback = this.f37788E.getCallback();
                wVar.getClass();
                try {
                    wVar.f37946w = true;
                } finally {
                    wVar.f37946w = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.f37817o0 = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        z B3 = B(0);
                        if (!B3.f37964m) {
                            I(B3, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.f37800N == null) {
                        z B9 = B(0);
                        InterfaceC4703h0 interfaceC4703h0 = this.f37797K;
                        Context context = this.f37786D;
                        if (interfaceC4703h0 != null) {
                            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC4703h0;
                            actionBarOverlayLayout.k();
                            Toolbar toolbar = ((Y0) actionBarOverlayLayout.f4524x).f39151a;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.f4579n) != null && actionMenuView.f4529L && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = (ActionBarOverlayLayout) this.f37797K;
                                actionBarOverlayLayout2.k();
                                if (((Y0) actionBarOverlayLayout2.f4524x).f39151a.p()) {
                                    ActionBarOverlayLayout actionBarOverlayLayout3 = (ActionBarOverlayLayout) this.f37797K;
                                    actionBarOverlayLayout3.k();
                                    ActionMenuView actionMenuView2 = ((Y0) actionBarOverlayLayout3.f4524x).f39151a.f4579n;
                                    if (actionMenuView2 != null) {
                                        C4708k c4708k = actionMenuView2.f4530M;
                                        if (c4708k != null) {
                                        }
                                    }
                                } else if (!this.f37820r0 && I(B9, keyEvent)) {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = (ActionBarOverlayLayout) this.f37797K;
                                    actionBarOverlayLayout4.k();
                                    z6 = ((Y0) actionBarOverlayLayout4.f4524x).f39151a.v();
                                    if (z6) {
                                        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(com.anythink.basead.exoplayer.k.o.f9231b);
                                        if (audioManager != null) {
                                            audioManager.playSoundEffect(0);
                                            return true;
                                        }
                                        Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                        return true;
                                    }
                                }
                                z6 = false;
                                if (z6) {
                                }
                            }
                        }
                        boolean z10 = B9.f37964m;
                        if (z10 || B9.f37963l) {
                            t(B9, true);
                            z6 = z10;
                            if (z6) {
                            }
                        } else {
                            if (B9.f37962k) {
                                if (B9.f37966o) {
                                    B9.f37962k = false;
                                    z9 = I(B9, keyEvent);
                                } else {
                                    z9 = true;
                                }
                                if (z9) {
                                    G(B9, keyEvent);
                                    z6 = true;
                                    if (z6) {
                                    }
                                }
                            }
                            z6 = false;
                            if (z6) {
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
        z B3 = B(i);
        if (B3.f37960h != null) {
            Bundle bundle = new Bundle();
            B3.f37960h.t(bundle);
            if (bundle.size() > 0) {
                B3.f37967p = bundle;
            }
            B3.f37960h.w();
            B3.f37960h.clear();
        }
        B3.f37966o = true;
        B3.f37965n = true;
        if ((i == 108 || i == 0) && this.f37797K != null) {
            z B9 = B(0);
            B9.f37962k = false;
            I(B9, null);
        }
    }

    public final void x() {
        ViewGroup viewGroup;
        if (this.f37805S) {
            return;
        }
        int[] iArr = AbstractC4528a.f37558j;
        Context context = this.f37786D;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(com.anythink.expressad.video.module.a.a.f22514Q, false)) {
            g(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            g(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            g(com.anythink.expressad.video.module.a.a.f22543z);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            g(10);
        }
        this.f37813j0 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        y();
        this.f37788E.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.f37814k0) {
            viewGroup = this.f37812i0 ? (ViewGroup) from.inflate(C5248R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(C5248R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.f37813j0) {
            viewGroup = (ViewGroup) from.inflate(C5248R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.f37811Z = false;
            this.Y = false;
        } else if (this.Y) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C5248R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new C4627d(context, typedValue.resourceId) : context).inflate(C5248R.layout.abc_screen_toolbar, (ViewGroup) null);
            InterfaceC4703h0 interfaceC4703h0 = (InterfaceC4703h0) viewGroup.findViewById(C5248R.id.decor_content_parent);
            this.f37797K = interfaceC4703h0;
            interfaceC4703h0.setWindowCallback(this.f37788E.getCallback());
            if (this.f37811Z) {
                ((ActionBarOverlayLayout) this.f37797K).j(com.anythink.expressad.video.module.a.a.f22543z);
            }
            if (this.f37809W) {
                ((ActionBarOverlayLayout) this.f37797K).j(2);
            }
            if (this.f37810X) {
                ((ActionBarOverlayLayout) this.f37797K).j(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.Y + ", windowActionBarOverlay: " + this.f37811Z + ", android:windowIsFloating: " + this.f37813j0 + ", windowActionModeOverlay: " + this.f37812i0 + ", windowNoTitle: " + this.f37814k0 + " }");
        }
        r rVar = new r(this);
        WeakHashMap weakHashMap = X.f2142a;
        O.L.u(viewGroup, rVar);
        if (this.f37797K == null) {
            this.f37807U = (TextView) viewGroup.findViewById(C5248R.id.title);
        }
        boolean z6 = g1.f39217a;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(C5248R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f37788E.findViewById(R.id.content);
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
        this.f37788E.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new n4.c(29, this));
        this.f37806T = viewGroup;
        Object obj = this.f37785C;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.J;
        if (!TextUtils.isEmpty(title)) {
            InterfaceC4703h0 interfaceC4703h02 = this.f37797K;
            if (interfaceC4703h02 != null) {
                interfaceC4703h02.setWindowTitle(title);
            } else {
                AbstractC4545a abstractC4545a = this.f37794H;
                if (abstractC4545a != null) {
                    abstractC4545a.r(title);
                } else {
                    TextView textView = this.f37807U;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.f37806T.findViewById(R.id.content);
        View decorView = this.f37788E.getDecorView();
        contentFrameLayout2.f4549z.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.f37805S = true;
        z B3 = B(0);
        if (this.f37820r0 || B3.f37960h != null) {
            return;
        }
        D(108);
    }

    public final void y() {
        if (this.f37788E == null) {
            Object obj = this.f37785C;
            if (obj instanceof Activity) {
                p(((Activity) obj).getWindow());
            }
        }
        if (this.f37788E == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public final Context z() {
        C();
        AbstractC4545a abstractC4545a = this.f37794H;
        Context e9 = abstractC4545a != null ? abstractC4545a.e() : null;
        return e9 == null ? this.f37786D : e9;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
