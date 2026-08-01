package h;

import Z.AbstractComponentCallbacksC0070s;
import Z.C0071t;
import Z.C0072u;
import Z.C0073v;
import Z.C0074w;
import Z.O;
import Z.V;
import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0103u;
import androidx.lifecycle.EnumC0096m;
import androidx.lifecycle.EnumC0097n;
import androidx.lifecycle.U;
import androidx.recyclerview.widget.RecyclerView;
import b.AbstractActivityC0113i;
import c0.C0120a;
import e0.C0128a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import k.C0179c;
import k.C0184h;
import l0.C0233d;
import m.C0281u;
import m.L0;
import m.c1;
import m.e1;
import r.C0340h;
import r.C0343k;

/* renamed from: h.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0168i extends AbstractActivityC0113i implements InterfaceC0169j {

    /* renamed from: t, reason: collision with root package name */
    public boolean f3213t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3214u;

    /* renamed from: w, reason: collision with root package name */
    public LayoutInflaterFactory2C0159B f3216w;

    /* renamed from: r, reason: collision with root package name */
    public final B.b f3211r = new B.b(18, new C0074w(this));

    /* renamed from: s, reason: collision with root package name */
    public final C0103u f3212s = new C0103u(this);

    /* renamed from: v, reason: collision with root package name */
    public boolean f3215v = true;

    public AbstractActivityC0168i() {
        ((C0233d) this.e.f2300c).f("android:support:lifecycle", new C0071t(this, 0));
        g(new C0072u(0, this));
        this.f2290m.add(new C0072u(1, this));
        h(new C0073v(this, 0));
        ((C0233d) this.e.f2300c).f("androidx:appcompat", new C0166g(this));
        h(new C0167h(this));
    }

    public static boolean n(Z.M m2) {
        EnumC0097n enumC0097n = EnumC0097n.f2040c;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0070s abstractComponentCallbacksC0070s : m2.f1437c.j()) {
            if (abstractComponentCallbacksC0070s != null) {
                C0074w c0074w = abstractComponentCallbacksC0070s.f1615t;
                if ((c0074w == null ? null : c0074w.e) != null) {
                    z2 |= n(abstractComponentCallbacksC0070s.g());
                }
                V v2 = abstractComponentCallbacksC0070s.f1593P;
                EnumC0097n enumC0097n2 = EnumC0097n.f2041d;
                if (v2 != null) {
                    v2.f();
                    if (v2.f1497d.f2048c.compareTo(enumC0097n2) >= 0) {
                        abstractComponentCallbacksC0070s.f1593P.f1497d.g(enumC0097n);
                        z2 = true;
                    }
                }
                if (abstractComponentCallbacksC0070s.f1592O.f2048c.compareTo(enumC0097n2) >= 0) {
                    abstractComponentCallbacksC0070s.f1592O.g(enumC0097n);
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) l();
        layoutInflaterFactory2C0159B.v();
        ((ViewGroup) layoutInflaterFactory2C0159B.f3081A.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0159B.f3115m.a(layoutInflaterFactory2C0159B.f3114l.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        int i = 0;
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) l();
        layoutInflaterFactory2C0159B.f3094O = true;
        int i2 = layoutInflaterFactory2C0159B.f3098S;
        if (i2 == -100) {
            i2 = p.f3224b;
        }
        int B2 = layoutInflaterFactory2C0159B.B(context, i2);
        if (p.b(context) && p.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (p.i) {
                    try {
                        K.g gVar = p.f3225c;
                        if (gVar == null) {
                            if (p.f3226d == null) {
                                p.f3226d = K.g.a(D.e.e(context));
                            }
                            if (!p.f3226d.f385a.f386a.isEmpty()) {
                                p.f3225c = p.f3226d;
                            }
                        } else if (!gVar.equals(p.f3226d)) {
                            K.g gVar2 = p.f3225c;
                            p.f3226d = gVar2;
                            D.e.d(context, gVar2.f385a.f386a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!p.f3227f) {
                p.f3223a.execute(new RunnableC0170k(context, i));
            }
        }
        K.g m2 = LayoutInflaterFactory2C0159B.m(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0159B.s(context, B2, m2, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0179c) {
            try {
                ((C0179c) context).a(LayoutInflaterFactory2C0159B.s(context, B2, m2, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C0159B.f3080j0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = RecyclerView.f2111C0;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = RecyclerView.f2111C0;
                if (configuration3.diff(configuration4) != 0) {
                    float f2 = configuration3.fontScale;
                    float f3 = configuration4.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i3 = configuration3.mcc;
                    int i4 = configuration4.mcc;
                    if (i3 != i4) {
                        configuration.mcc = i4;
                    }
                    int i5 = configuration3.mnc;
                    int i6 = configuration4.mnc;
                    if (i5 != i6) {
                        configuration.mnc = i6;
                    }
                    u.a(configuration3, configuration4, configuration);
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & 192;
                    int i22 = configuration4.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 768;
                    int i26 = configuration4.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration3.colorMode & 3;
                    int i28 = configuration4.colorMode & 3;
                    if (i27 != i28) {
                        configuration.colorMode |= i28;
                    }
                    int i29 = configuration3.colorMode & 12;
                    int i30 = configuration4.colorMode & 12;
                    if (i29 != i30) {
                        configuration.colorMode |= i30;
                    }
                    int i31 = configuration3.uiMode & 15;
                    int i32 = configuration4.uiMode & 15;
                    if (i31 != i32) {
                        configuration.uiMode |= i32;
                    }
                    int i33 = configuration3.uiMode & 48;
                    int i34 = configuration4.uiMode & 48;
                    if (i33 != i34) {
                        configuration.uiMode |= i34;
                    }
                    int i35 = configuration3.screenWidthDp;
                    int i36 = configuration4.screenWidthDp;
                    if (i35 != i36) {
                        configuration.screenWidthDp = i36;
                    }
                    int i37 = configuration3.screenHeightDp;
                    int i38 = configuration4.screenHeightDp;
                    if (i37 != i38) {
                        configuration.screenHeightDp = i38;
                    }
                    int i39 = configuration3.smallestScreenWidthDp;
                    int i40 = configuration4.smallestScreenWidthDp;
                    if (i39 != i40) {
                        configuration.smallestScreenWidthDp = i40;
                    }
                    int i41 = configuration3.densityDpi;
                    int i42 = configuration4.densityDpi;
                    if (i41 != i42) {
                        configuration.densityDpi = i42;
                    }
                }
            }
            Configuration s2 = LayoutInflaterFactory2C0159B.s(context, B2, m2, configuration, true);
            C0179c c0179c = new C0179c(context, com.lumenpath.harispro.hrnavigator.R.style.Theme_AppCompat_Empty);
            c0179c.a(s2);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0179c.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        F.n.a(theme);
                    } else {
                        synchronized (F.b.e) {
                            if (!F.b.f192g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    F.b.f191f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                F.b.f192g = true;
                            }
                            Method method = F.b.f191f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    F.b.f191f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c0179c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C0159B) l()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // b.AbstractActivityC0113i, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C0159B) l()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L34;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f3213t);
        printWriter.print(" mResumed=");
        printWriter.print(this.f3214u);
        printWriter.print(" mStopped=");
        printWriter.print(this.f3215v);
        if (getApplication() != null) {
            U c2 = c();
            O o2 = C0128a.f2836c;
            D1.i.e(c2, "store");
            C0120a c0120a = C0120a.f2339b;
            D1.i.e(c0120a, "defaultCreationExtras");
            M0.h hVar = new M0.h(c2, o2, c0120a);
            D1.e a2 = D1.o.a(C0128a.class);
            String t2 = R.j.t(a2);
            if (t2 == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            C0343k c0343k = ((C0128a) hVar.f(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(t2))).f2837b;
            if (c0343k.e() > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (c0343k.e() > 0) {
                    if (c0343k.f(0) != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(c0343k.c(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0074w) this.f3211r.f10b).f1631d.u(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) l();
        layoutInflaterFactory2C0159B.v();
        return layoutInflaterFactory2C0159B.f3114l.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) l();
        if (layoutInflaterFactory2C0159B.f3118p == null) {
            layoutInflaterFactory2C0159B.z();
            M m2 = layoutInflaterFactory2C0159B.f3117o;
            layoutInflaterFactory2C0159B.f3118p = new C0184h(m2 != null ? m2.w0() : layoutInflaterFactory2C0159B.f3113k);
        }
        return layoutInflaterFactory2C0159B.f3118p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = e1.f3935a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) l();
        if (layoutInflaterFactory2C0159B.f3117o != null) {
            layoutInflaterFactory2C0159B.z();
            layoutInflaterFactory2C0159B.f3117o.getClass();
            layoutInflaterFactory2C0159B.A(0);
        }
    }

    public final p l() {
        if (this.f3216w == null) {
            n nVar = p.f3223a;
            this.f3216w = new LayoutInflaterFactory2C0159B(this, null, this, this);
        }
        return this.f3216w;
    }

    public final void m() {
        androidx.lifecycle.L.f(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        D1.i.e(decorView, "<this>");
        decorView.setTag(com.lumenpath.harispro.hrnavigator.R.id.view_tree_view_model_store_owner, this);
        h0.f.z(getWindow().getDecorView(), this);
        R.j.h0(getWindow().getDecorView(), this);
    }

    public final void o() {
        super.onDestroy();
        ((C0074w) this.f3211r.f10b).f1631d.k();
        this.f3212s.d(EnumC0096m.ON_DESTROY);
    }

    @Override // b.AbstractActivityC0113i, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f3211r.B();
        super.onActivityResult(i, i2, intent);
    }

    @Override // b.AbstractActivityC0113i, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) l();
        if (layoutInflaterFactory2C0159B.f3086F && layoutInflaterFactory2C0159B.f3128z) {
            layoutInflaterFactory2C0159B.z();
            M m2 = layoutInflaterFactory2C0159B.f3117o;
            if (m2 != null) {
                m2.z0(m2.f3156a.getResources().getBoolean(com.lumenpath.harispro.hrnavigator.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0281u a2 = C0281u.a();
        Context context = layoutInflaterFactory2C0159B.f3113k;
        synchronized (a2) {
            L0 l02 = a2.f4028a;
            synchronized (l02) {
                C0340h c0340h = (C0340h) l02.f3850b.get(context);
                if (c0340h != null) {
                    c0340h.a();
                }
            }
        }
        layoutInflaterFactory2C0159B.f3097R = new Configuration(layoutInflaterFactory2C0159B.f3113k.getResources().getConfiguration());
        layoutInflaterFactory2C0159B.k(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // b.AbstractActivityC0113i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3212s.d(EnumC0096m.ON_CREATE);
        Z.M m2 = ((C0074w) this.f3211r.f10b).f1631d;
        m2.f1427F = false;
        m2.f1428G = false;
        m2.f1433M.f1471g = false;
        m2.t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0074w) this.f3211r.f10b).f1631d.f1439f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        o();
        l().d();
    }

    @Override // b.AbstractActivityC0113i, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent b2;
        if (p(i, menuItem)) {
            return true;
        }
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) l();
        layoutInflaterFactory2C0159B.z();
        M m2 = layoutInflaterFactory2C0159B.f3117o;
        if (menuItem.getItemId() == 16908332 && m2 != null && (((c1) m2.e).f3924b & 4) != 0 && (b2 = D.e.b(this)) != null) {
            if (!shouldUpRecreateTask(b2)) {
                navigateUpTo(b2);
                return true;
            }
            D.i iVar = new D.i(this);
            Intent b3 = D.e.b(this);
            if (b3 == null) {
                b3 = D.e.b(this);
            }
            if (b3 != null) {
                ComponentName component = b3.getComponent();
                if (component == null) {
                    component = b3.resolveActivity(iVar.f123b.getPackageManager());
                }
                iVar.a(component);
                iVar.f122a.add(b3);
            }
            iVar.b();
            try {
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f3214u = false;
        ((C0074w) this.f3211r.f10b).f1631d.t(5);
        this.f3212s.d(EnumC0096m.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0159B) l()).v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        q();
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) l();
        layoutInflaterFactory2C0159B.z();
        M m2 = layoutInflaterFactory2C0159B.f3117o;
        if (m2 != null) {
            m2.f3172t = true;
        }
    }

    @Override // b.AbstractActivityC0113i, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f3211r.B();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        B.b bVar = this.f3211r;
        bVar.B();
        super.onResume();
        this.f3214u = true;
        ((C0074w) bVar.f10b).f1631d.x(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        r();
        ((LayoutInflaterFactory2C0159B) l()).k(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f3211r.B();
    }

    @Override // android.app.Activity
    public final void onStop() {
        s();
        LayoutInflaterFactory2C0159B layoutInflaterFactory2C0159B = (LayoutInflaterFactory2C0159B) l();
        layoutInflaterFactory2C0159B.z();
        M m2 = layoutInflaterFactory2C0159B.f3117o;
        if (m2 != null) {
            m2.f3172t = false;
            k.j jVar = m2.f3171s;
            if (jVar != null) {
                jVar.a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        l().j(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C0159B) l()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public final boolean p(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0074w) this.f3211r.f10b).f1631d.i();
        }
        return false;
    }

    public final void q() {
        super.onPostResume();
        this.f3212s.d(EnumC0096m.ON_RESUME);
        Z.M m2 = ((C0074w) this.f3211r.f10b).f1631d;
        m2.f1427F = false;
        m2.f1428G = false;
        m2.f1433M.f1471g = false;
        m2.t(7);
    }

    public final void r() {
        B.b bVar = this.f3211r;
        bVar.B();
        super.onStart();
        this.f3215v = false;
        boolean z2 = this.f3213t;
        C0074w c0074w = (C0074w) bVar.f10b;
        if (!z2) {
            this.f3213t = true;
            Z.M m2 = c0074w.f1631d;
            m2.f1427F = false;
            m2.f1428G = false;
            m2.f1433M.f1471g = false;
            m2.t(4);
        }
        c0074w.f1631d.x(true);
        this.f3212s.d(EnumC0096m.ON_START);
        Z.M m3 = c0074w.f1631d;
        m3.f1427F = false;
        m3.f1428G = false;
        m3.f1433M.f1471g = false;
        m3.t(5);
    }

    public final void s() {
        B.b bVar;
        super.onStop();
        this.f3215v = true;
        do {
            bVar = this.f3211r;
        } while (n(((C0074w) bVar.f10b).f1631d));
        Z.M m2 = ((C0074w) bVar.f10b).f1631d;
        m2.f1428G = true;
        m2.f1433M.f1471g = true;
        m2.t(4);
        this.f3212s.d(EnumC0096m.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        m();
        l().g(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0159B) l()).f3099T = i;
    }

    @Override // b.AbstractActivityC0113i, android.app.Activity
    public void setContentView(View view) {
        m();
        l().h(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0074w) this.f3211r.f10b).f1631d.f1439f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m();
        l().i(view, layoutParams);
    }
}
