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
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class SJ7tYVsF extends DQL61DDk implements wr, LayoutInflater.Factory2 {
    public boolean ESscZ9M1;
    public nEk3tCGF Ey6iv0m0;
    public boolean FXJmAAN1;
    public PopupWindow FySoLYna;
    public Configuration HdOGZAzC;
    public yzvmSy3z I5GHvsYW;
    public int KRabZ4CU;
    public nEk3tCGF KlHjfFWx;
    public e0 LvHlPNBd;
    public View Mq3SeTnW;
    public boolean N8VPGzVC;
    public Window OnDfzHZD;
    public CharSequence OxcuoDLp;
    public ActionBarContextView RXQxj5Oe;
    public boolean SgZGMMPL;
    public Rect Sjrx9cEN;
    public D7luKAMV TrssYQ34;
    public ViewGroup U0LaHZX7;
    public int VGmz0ccI;
    public boolean VhgXwMj9;
    public OnBackInvokedCallback Wi7iiXC4;
    public boolean Xkz7p5xa;
    public final int ZyZthT5G;
    public boolean aZz0PFXp;
    public ActionBarOverlayLayout amk52bBQ;
    public int bvfAo0eO;
    public boolean eIA6dogk;
    public boolean euDDoUNr;
    public nBenlUV4[] fVMzMhyS;
    public D7luKAMV g2aRJUAd;
    public fhw4zlf4 gjV1z5T1;
    public boolean gmkaJpmS;
    public OnBackInvokedDispatcher hGvurcGl;
    public nBenlUV4 hzgxAD8d;
    public TextView i7xS8jrb;
    public final Object k3x7lurq;
    public zh0 lDXGDhIF;
    public boolean lwWCatUu;
    public boolean nSmgoSB5;
    public final Context ow5vqvCr;
    public boolean pP9Y2m6O;
    public boolean pRiPUEwG;
    public ra0 sjUBp5pO;
    public Rect tef3qNMP;
    public kCZyLIxn ygLcUYwZ;
    public boolean ytu5o6f4;
    public boolean zCflySGU;
    public static final p70 QT4Tf9Dt = new p70(0);
    public static final int[] orhfF2Ya = {R.attr.windowBackground};
    public static final boolean dHozS53r = !"robolectric".equals(Build.FINGERPRINT);
    public xg0 WYNAV5pd = null;
    public final boolean DK9slbsy = true;
    public final fhw4zlf4 LfKQckgD = new fhw4zlf4(this, 0);

    public SJ7tYVsF(Context context, Window window, fBtTvv4Q fbttvv4q, Object obj) {
        f4UNdked f4undked = null;
        this.ZyZthT5G = -100;
        this.ow5vqvCr = context;
        this.k3x7lurq = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (!(context instanceof f4UNdked)) {
                        if (!(context instanceof ContextWrapper)) {
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    } else {
                        f4undked = (f4UNdked) context;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (f4undked != null) {
                this.ZyZthT5G = ((SJ7tYVsF) f4undked.OnDfzHZD()).ZyZthT5G;
            }
        }
        if (this.ZyZthT5G == -100) {
            String name = this.k3x7lurq.getClass().getName();
            p70 p70Var = QT4Tf9Dt;
            Integer num = (Integer) p70Var.get(name);
            if (num != null) {
                this.ZyZthT5G = num.intValue();
                p70Var.remove(this.k3x7lurq.getClass().getName());
            }
        }
        if (window != null) {
            OnDfzHZD(window);
        }
        j5BPOSYv.MdtA4re8();
    }

    public static Configuration KlHjfFWx(Context context, int i, dq dqVar, Configuration configuration, boolean z) {
        int i2 = i != 1 ? i != 2 ? z ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (dqVar != null) {
            tx3ZX4rv.wxUZMvaN(configuration2, dqVar);
        }
        return configuration2;
    }

    public static dq lDXGDhIF(Context context) {
        dq dqVar;
        dq dqVar2;
        if (Build.VERSION.SDK_INT >= 33 || (dqVar = DQL61DDk.wxUZMvaN) == null) {
            return null;
        }
        eq eqVar = dqVar.qoPGr6Ce;
        dq NCTxEWno = tx3ZX4rv.NCTxEWno(context.getApplicationContext().getResources().getConfiguration());
        if (eqVar.qoPGr6Ce.isEmpty()) {
            dqVar2 = dq.NCTxEWno;
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i = 0;
            while (i < NCTxEWno.qoPGr6Ce.qoPGr6Ce.size() + eqVar.qoPGr6Ce.size()) {
                Locale locale = i < eqVar.qoPGr6Ce.size() ? eqVar.qoPGr6Ce.get(i) : NCTxEWno.qoPGr6Ce.qoPGr6Ce.get(i - eqVar.qoPGr6Ce.size());
                if (locale != null) {
                    linkedHashSet.add(locale);
                }
                i++;
            }
            dqVar2 = new dq(new eq(new LocaleList((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]))));
        }
        return dqVar2.qoPGr6Ce.qoPGr6Ce.isEmpty() ? NCTxEWno : dqVar2;
    }

    public final void DK9slbsy() {
        zh0 zh0Var;
        RXQxj5Oe();
        if (this.ytu5o6f4 && (zh0Var = this.lDXGDhIF) == null) {
            Object obj = this.k3x7lurq;
            if (obj instanceof Activity) {
                zh0Var = new zh0((Activity) obj, this.eIA6dogk);
                this.lDXGDhIF = zh0Var;
            } else if (obj instanceof Dialog) {
                zh0Var = new zh0((Dialog) obj);
                this.lDXGDhIF = zh0Var;
            }
            if (zh0Var != null) {
                zh0Var.wxUZMvaN(this.pP9Y2m6O);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
    
        if (r4.dispatchKeyEvent(r7) != false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d6, code lost:
    
        if (r6.wxUZMvaN() != false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00fa, code lost:
    
        if (r6.ygLcUYwZ() != false) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Ey6iv0m0(KeyEvent keyEvent) {
        View decorView;
        boolean z;
        boolean z2;
        ActionMenuView actionMenuView;
        CTE3lpUp cTE3lpUp;
        Object obj = this.k3x7lurq;
        if ((!(obj instanceof bo) && !(obj instanceof PVxc5pbY)) || (decorView = this.OnDfzHZD.getDecorView()) == null || !hg0.wxUZMvaN(decorView, keyEvent)) {
            if (keyEvent.getKeyCode() == 82) {
                kCZyLIxn kczylixn = this.ygLcUYwZ;
                Window.Callback callback = this.OnDfzHZD.getCallback();
                kczylixn.getClass();
                try {
                    kczylixn.wxUZMvaN = true;
                } finally {
                    kczylixn.wxUZMvaN = false;
                }
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyEvent.getAction() == 0) {
                if (keyCode == 4) {
                    this.zCflySGU = (keyEvent.getFlags() & 128) != 0;
                    return false;
                }
                if (keyCode == 82) {
                    if (keyEvent.getRepeatCount() == 0) {
                        nBenlUV4 WYNAV5pd = WYNAV5pd(0);
                        if (!WYNAV5pd.OnDfzHZD) {
                            SgZGMMPL(WYNAV5pd, keyEvent);
                            return true;
                        }
                    }
                }
                return false;
            }
            if (keyCode != 4) {
                if (keyCode == 82) {
                    if (this.I5GHvsYW == null) {
                        nBenlUV4 WYNAV5pd2 = WYNAV5pd(0);
                        ActionBarOverlayLayout actionBarOverlayLayout = this.amk52bBQ;
                        Context context = this.ow5vqvCr;
                        if (actionBarOverlayLayout != null) {
                            actionBarOverlayLayout.k3x7lurq();
                            Toolbar toolbar = ((dd0) actionBarOverlayLayout.P7K7Inc8).qoPGr6Ce;
                            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.NCTxEWno) != null && actionMenuView.Ey6iv0m0 && !ViewConfiguration.get(context).hasPermanentMenuKey()) {
                                ActionBarOverlayLayout actionBarOverlayLayout2 = this.amk52bBQ;
                                actionBarOverlayLayout2.k3x7lurq();
                                ActionMenuView actionMenuView2 = ((dd0) actionBarOverlayLayout2.P7K7Inc8).qoPGr6Ce.NCTxEWno;
                                if (actionMenuView2 == null || (cTE3lpUp = actionMenuView2.I5GHvsYW) == null || !cTE3lpUp.jb9XjC4I()) {
                                    if (!this.N8VPGzVC && SgZGMMPL(WYNAV5pd2, keyEvent)) {
                                        ActionBarOverlayLayout actionBarOverlayLayout3 = this.amk52bBQ;
                                        actionBarOverlayLayout3.k3x7lurq();
                                        ActionMenuView actionMenuView3 = ((dd0) actionBarOverlayLayout3.P7K7Inc8).qoPGr6Ce.NCTxEWno;
                                        if (actionMenuView3 != null) {
                                            CTE3lpUp cTE3lpUp2 = actionMenuView3.I5GHvsYW;
                                            if (cTE3lpUp2 != null) {
                                            }
                                        }
                                    }
                                    z = false;
                                } else {
                                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.amk52bBQ;
                                    actionBarOverlayLayout4.k3x7lurq();
                                    ActionMenuView actionMenuView4 = ((dd0) actionBarOverlayLayout4.P7K7Inc8).qoPGr6Ce.NCTxEWno;
                                    if (actionMenuView4 != null) {
                                        CTE3lpUp cTE3lpUp3 = actionMenuView4.I5GHvsYW;
                                        if (cTE3lpUp3 != null) {
                                        }
                                    }
                                    z = false;
                                }
                                if (z) {
                                    AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
                                    if (audioManager != null) {
                                        audioManager.playSoundEffect(0);
                                        return true;
                                    }
                                    Log.w("AppCompatDelegate", "Couldn't get audio manager");
                                    return true;
                                }
                            }
                        }
                        boolean z3 = WYNAV5pd2.OnDfzHZD;
                        if (z3 || WYNAV5pd2.ow5vqvCr) {
                            amk52bBQ(WYNAV5pd2, true);
                            z = z3;
                            if (z) {
                            }
                        } else {
                            if (WYNAV5pd2.k3x7lurq) {
                                if (WYNAV5pd2.lDXGDhIF) {
                                    WYNAV5pd2.k3x7lurq = false;
                                    z2 = SgZGMMPL(WYNAV5pd2, keyEvent);
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    Mq3SeTnW(WYNAV5pd2, keyEvent);
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
            if (!i7xS8jrb()) {
                return false;
            }
        }
        return true;
    }

    public final void FySoLYna() {
        if (this.OnDfzHZD == null) {
            Object obj = this.k3x7lurq;
            if (obj instanceof Activity) {
                OnDfzHZD(((Activity) obj).getWindow());
            }
        }
        if (this.OnDfzHZD != null) {
            return;
        }
        m1.Ey6iv0m0("We have not been given a Window");
    }

    public final void I5GHvsYW(int i) {
        nBenlUV4 WYNAV5pd = WYNAV5pd(i);
        if (WYNAV5pd.Qr9iLBAD != null) {
            Bundle bundle = new Bundle();
            WYNAV5pd.Qr9iLBAD.Ey6iv0m0(bundle);
            if (bundle.size() > 0) {
                WYNAV5pd.sjUBp5pO = bundle;
            }
            WYNAV5pd.Qr9iLBAD.FySoLYna();
            WYNAV5pd.Qr9iLBAD.clear();
        }
        WYNAV5pd.lDXGDhIF = true;
        WYNAV5pd.ygLcUYwZ = true;
        if ((i == 108 || i == 0) && this.amk52bBQ != null) {
            nBenlUV4 WYNAV5pd2 = WYNAV5pd(0);
            WYNAV5pd2.k3x7lurq = false;
            SgZGMMPL(WYNAV5pd2, null);
        }
    }

    @Override // defpackage.DQL61DDk
    public final void MdtA4re8() {
        String str;
        this.FXJmAAN1 = true;
        ow5vqvCr(false, true);
        FySoLYna();
        Object obj = this.k3x7lurq;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = le0.I5GHvsYW(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                zh0 zh0Var = this.lDXGDhIF;
                if (zh0Var == null) {
                    this.pP9Y2m6O = true;
                } else {
                    zh0Var.wxUZMvaN(true);
                }
            }
            synchronized (DQL61DDk.jb9XjC4I) {
                DQL61DDk.VgvYg0wo(this);
                DQL61DDk.Qr9iLBAD.add(new WeakReference(this));
            }
        }
        this.HdOGZAzC = new Configuration(this.ow5vqvCr.getResources().getConfiguration());
        this.nSmgoSB5 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x0170, code lost:
    
        if (r6.getCount() > 0) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0152, code lost:
    
        if (r2 != null) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Mq3SeTnW(nBenlUV4 nbenluv4, KeyEvent keyEvent) {
        int i;
        ViewGroup.LayoutParams layoutParams;
        boolean z = nbenluv4.OnDfzHZD;
        int i2 = nbenluv4.qoPGr6Ce;
        if (z || this.N8VPGzVC) {
            return;
        }
        Context context = this.ow5vqvCr;
        if (i2 == 0 && (context.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callback = this.OnDfzHZD.getCallback();
        if (callback != null && !callback.onMenuOpened(i2, nbenluv4.Qr9iLBAD)) {
            amk52bBQ(nbenluv4, true);
            return;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null || !SgZGMMPL(nbenluv4, keyEvent)) {
            return;
        }
        REcs5POV rEcs5POV = nbenluv4.VgvYg0wo;
        if (rEcs5POV == null || nbenluv4.ygLcUYwZ) {
            if (rEcs5POV == null) {
                DK9slbsy();
                zh0 zh0Var = this.lDXGDhIF;
                Context NCTxEWno = zh0Var != null ? zh0Var.NCTxEWno() : null;
                if (NCTxEWno != null) {
                    context = NCTxEWno;
                }
                TypedValue typedValue = new TypedValue();
                Resources.Theme newTheme = context.getResources().newTheme();
                newTheme.setTo(context.getTheme());
                newTheme.resolveAttribute(com.kolosta.rejin.jilosa.R.attr.actionBarPopupTheme, typedValue, true);
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    newTheme.applyStyle(i3, true);
                }
                newTheme.resolveAttribute(com.kolosta.rejin.jilosa.R.attr.panelMenuListTheme, typedValue, true);
                int i4 = typedValue.resourceId;
                if (i4 != 0) {
                    newTheme.applyStyle(i4, true);
                } else {
                    newTheme.applyStyle(com.kolosta.rejin.jilosa.R.style.Theme_AppCompat_CompactMenu, true);
                }
                f9 f9Var = new f9(context, 0);
                f9Var.getTheme().setTo(newTheme);
                nbenluv4.eVhOlqcC = f9Var;
                TypedArray obtainStyledAttributes = f9Var.obtainStyledAttributes(z00.eVhOlqcC);
                nbenluv4.NCTxEWno = obtainStyledAttributes.getResourceId(86, 0);
                nbenluv4.wxUZMvaN = obtainStyledAttributes.getResourceId(1, 0);
                obtainStyledAttributes.recycle();
                nbenluv4.VgvYg0wo = new REcs5POV(this, nbenluv4.eVhOlqcC);
                nbenluv4.MdtA4re8 = 81;
            } else if (nbenluv4.ygLcUYwZ && rEcs5POV.getChildCount() > 0) {
                nbenluv4.VgvYg0wo.removeAllViews();
            }
            View view = nbenluv4.b2ZJblxo;
            if (view == null) {
                if (nbenluv4.Qr9iLBAD != null) {
                    nEk3tCGF nek3tcgf = this.Ey6iv0m0;
                    if (nek3tcgf == null) {
                        nek3tcgf = new nEk3tCGF(this, 3);
                        this.Ey6iv0m0 = nek3tcgf;
                    }
                    if (nbenluv4.jb9XjC4I == null) {
                        pp ppVar = new pp(nbenluv4.eVhOlqcC);
                        nbenluv4.jb9XjC4I = ppVar;
                        ppVar.P7K7Inc8 = nek3tcgf;
                        yr yrVar = nbenluv4.Qr9iLBAD;
                        yrVar.NCTxEWno(ppVar, yrVar.qoPGr6Ce);
                    }
                    pp ppVar2 = nbenluv4.jb9XjC4I;
                    REcs5POV rEcs5POV2 = nbenluv4.VgvYg0wo;
                    if (ppVar2.VgvYg0wo == null) {
                        ppVar2.VgvYg0wo = (ExpandedMenuView) ppVar2.MdtA4re8.inflate(com.kolosta.rejin.jilosa.R.layout.abc_expanded_menu_layout, (ViewGroup) rEcs5POV2, false);
                        op opVar = ppVar2.b2ZJblxo;
                        if (opVar == null) {
                            opVar = new op(ppVar2);
                            ppVar2.b2ZJblxo = opVar;
                        }
                        ppVar2.VgvYg0wo.setAdapter((ListAdapter) opVar);
                        ppVar2.VgvYg0wo.setOnItemClickListener(ppVar2);
                    }
                    ExpandedMenuView expandedMenuView = ppVar2.VgvYg0wo;
                    nbenluv4.P7K7Inc8 = expandedMenuView;
                }
                nbenluv4.ygLcUYwZ = true;
                return;
            }
            nbenluv4.P7K7Inc8 = view;
            if (nbenluv4.P7K7Inc8 != null) {
                if (nbenluv4.b2ZJblxo == null) {
                    pp ppVar3 = nbenluv4.jb9XjC4I;
                    op opVar2 = ppVar3.b2ZJblxo;
                    if (opVar2 == null) {
                        opVar2 = new op(ppVar3);
                        ppVar3.b2ZJblxo = opVar2;
                    }
                }
                ViewGroup.LayoutParams layoutParams2 = nbenluv4.P7K7Inc8.getLayoutParams();
                if (layoutParams2 == null) {
                    layoutParams2 = new ViewGroup.LayoutParams(-2, -2);
                }
                nbenluv4.VgvYg0wo.setBackgroundResource(nbenluv4.NCTxEWno);
                ViewParent parent = nbenluv4.P7K7Inc8.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(nbenluv4.P7K7Inc8);
                }
                nbenluv4.VgvYg0wo.addView(nbenluv4.P7K7Inc8, layoutParams2);
                if (!nbenluv4.P7K7Inc8.hasFocus()) {
                    nbenluv4.P7K7Inc8.requestFocus();
                }
            }
            nbenluv4.ygLcUYwZ = true;
            return;
        }
        View view2 = nbenluv4.b2ZJblxo;
        if (view2 != null && (layoutParams = view2.getLayoutParams()) != null && layoutParams.width == -1) {
            i = -1;
            nbenluv4.ow5vqvCr = false;
            WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
            layoutParams3.gravity = nbenluv4.MdtA4re8;
            layoutParams3.windowAnimations = nbenluv4.wxUZMvaN;
            windowManager.addView(nbenluv4.VgvYg0wo, layoutParams3);
            nbenluv4.OnDfzHZD = true;
            if (i2 != 0) {
                eIA6dogk();
                return;
            }
            return;
        }
        i = -2;
        nbenluv4.ow5vqvCr = false;
        WindowManager.LayoutParams layoutParams32 = new WindowManager.LayoutParams(i, -2, 0, 0, 1002, 8519680, -3);
        layoutParams32.gravity = nbenluv4.MdtA4re8;
        layoutParams32.windowAnimations = nbenluv4.wxUZMvaN;
        windowManager.addView(nbenluv4.VgvYg0wo, layoutParams32);
        nbenluv4.OnDfzHZD = true;
        if (i2 != 0) {
        }
    }

    public final void OnDfzHZD(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.OnDfzHZD != null) {
            m1.Ey6iv0m0("AppCompat has already installed itself into the Window");
            return;
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof kCZyLIxn) {
            m1.Ey6iv0m0("AppCompat has already installed itself into the Window");
            return;
        }
        kCZyLIxn kczylixn = new kCZyLIxn(this, callback);
        this.ygLcUYwZ = kczylixn;
        window.setCallback(kczylixn);
        Context context = this.ow5vqvCr;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, orhfF2Ya);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = null;
        } else {
            j5BPOSYv qoPGr6Ce = j5BPOSYv.qoPGr6Ce();
            synchronized (qoPGr6Ce) {
                drawable = qoPGr6Ce.qoPGr6Ce.VgvYg0wo(context, resourceId, true);
            }
        }
        if (drawable != null) {
            window.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.OnDfzHZD = window;
        if (Build.VERSION.SDK_INT < 33 || (onBackInvokedDispatcher = this.hGvurcGl) != null) {
            return;
        }
        Object obj = this.k3x7lurq;
        if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.Wi7iiXC4) != null) {
            iZMrJEOF.MdtA4re8(onBackInvokedDispatcher, onBackInvokedCallback);
            this.Wi7iiXC4 = null;
        }
        if (obj instanceof Activity) {
            Activity activity = (Activity) obj;
            if (activity.getWindow() != null) {
                this.hGvurcGl = iZMrJEOF.qoPGr6Ce(activity);
                eIA6dogk();
            }
        }
        this.hGvurcGl = null;
        eIA6dogk();
    }

    public final void OxcuoDLp(yr yrVar) {
        CTE3lpUp cTE3lpUp;
        if (this.Xkz7p5xa) {
            return;
        }
        this.Xkz7p5xa = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.amk52bBQ;
        actionBarOverlayLayout.k3x7lurq();
        ActionMenuView actionMenuView = ((dd0) actionBarOverlayLayout.P7K7Inc8).qoPGr6Ce.NCTxEWno;
        if (actionMenuView != null && (cTE3lpUp = actionMenuView.I5GHvsYW) != null) {
            cTE3lpUp.wxUZMvaN();
            f7oeun2L f7oeun2l = cTE3lpUp.RXQxj5Oe;
            if (f7oeun2l != null && f7oeun2l.NCTxEWno()) {
                f7oeun2l.jb9XjC4I.dismiss();
            }
        }
        Window.Callback callback = this.OnDfzHZD.getCallback();
        if (callback != null && !this.N8VPGzVC) {
            callback.onPanelClosed(108, yrVar);
        }
        this.Xkz7p5xa = false;
    }

    @Override // defpackage.DQL61DDk
    public final boolean P7K7Inc8(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.aZz0PFXp && i == 108) {
            return false;
        }
        if (this.ytu5o6f4 && i == 1) {
            this.ytu5o6f4 = false;
        }
        if (i == 1) {
            ytu5o6f4();
            this.aZz0PFXp = true;
            return true;
        }
        if (i == 2) {
            ytu5o6f4();
            this.euDDoUNr = true;
            return true;
        }
        if (i == 5) {
            ytu5o6f4();
            this.SgZGMMPL = true;
            return true;
        }
        if (i == 10) {
            ytu5o6f4();
            this.pRiPUEwG = true;
            return true;
        }
        if (i == 108) {
            ytu5o6f4();
            this.ytu5o6f4 = true;
            return true;
        }
        if (i != 109) {
            return this.OnDfzHZD.requestFeature(i);
        }
        ytu5o6f4();
        this.eIA6dogk = true;
        return true;
    }

    @Override // defpackage.DQL61DDk
    public final void Qr9iLBAD(int i) {
        RXQxj5Oe();
        ViewGroup viewGroup = (ViewGroup) this.U0LaHZX7.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.ow5vqvCr).inflate(i, viewGroup);
        this.ygLcUYwZ.qoPGr6Ce(this.OnDfzHZD.getCallback());
    }

    public final void RXQxj5Oe() {
        ViewGroup viewGroup;
        if (this.lwWCatUu) {
            return;
        }
        Context context = this.ow5vqvCr;
        int[] iArr = z00.eVhOlqcC;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(117)) {
            obtainStyledAttributes.recycle();
            m1.Ey6iv0m0("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
            return;
        }
        int i = 0;
        int i2 = 1;
        if (obtainStyledAttributes.getBoolean(126, false)) {
            P7K7Inc8(1);
        } else if (obtainStyledAttributes.getBoolean(117, false)) {
            P7K7Inc8(108);
        }
        if (obtainStyledAttributes.getBoolean(118, false)) {
            P7K7Inc8(109);
        }
        if (obtainStyledAttributes.getBoolean(119, false)) {
            P7K7Inc8(10);
        }
        this.VhgXwMj9 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        FySoLYna();
        this.OnDfzHZD.getDecorView();
        LayoutInflater from = LayoutInflater.from(context);
        if (this.aZz0PFXp) {
            viewGroup = this.pRiPUEwG ? (ViewGroup) from.inflate(com.kolosta.rejin.jilosa.R.layout.abc_screen_simple_overlay_action_mode, (ViewGroup) null) : (ViewGroup) from.inflate(com.kolosta.rejin.jilosa.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.VhgXwMj9) {
            viewGroup = (ViewGroup) from.inflate(com.kolosta.rejin.jilosa.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.eIA6dogk = false;
            this.ytu5o6f4 = false;
        } else if (this.ytu5o6f4) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(com.kolosta.rejin.jilosa.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new f9(context, typedValue.resourceId) : context).inflate(com.kolosta.rejin.jilosa.R.layout.abc_screen_toolbar, (ViewGroup) null);
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) viewGroup.findViewById(com.kolosta.rejin.jilosa.R.id.decor_content_parent);
            this.amk52bBQ = actionBarOverlayLayout;
            actionBarOverlayLayout.setWindowCallback(this.OnDfzHZD.getCallback());
            if (this.eIA6dogk) {
                this.amk52bBQ.eVhOlqcC(109);
            }
            if (this.euDDoUNr) {
                this.amk52bBQ.eVhOlqcC(2);
            }
            if (this.SgZGMMPL) {
                this.amk52bBQ.eVhOlqcC(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.ytu5o6f4 + ", windowActionBarOverlay: " + this.eIA6dogk + ", android:windowIsFloating: " + this.VhgXwMj9 + ", windowActionModeOverlay: " + this.pRiPUEwG + ", windowNoTitle: " + this.aZz0PFXp + " }");
        }
        nEk3tCGF nek3tcgf = new nEk3tCGF(this, i);
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        zf0.MdtA4re8(viewGroup, nek3tcgf);
        if (this.amk52bBQ == null) {
            this.i7xS8jrb = (TextView) viewGroup.findViewById(com.kolosta.rejin.jilosa.R.id.title);
        }
        boolean z = fh0.qoPGr6Ce;
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
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(com.kolosta.rejin.jilosa.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.OnDfzHZD.findViewById(R.id.content);
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
        this.OnDfzHZD.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new nEk3tCGF(this, i2));
        this.U0LaHZX7 = viewGroup;
        Object obj = this.k3x7lurq;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.OxcuoDLp;
        if (!TextUtils.isEmpty(title)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.amk52bBQ;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setWindowTitle(title);
            } else {
                zh0 zh0Var = this.lDXGDhIF;
                if (zh0Var != null) {
                    dd0 dd0Var = (dd0) zh0Var.VgvYg0wo;
                    if (!dd0Var.b2ZJblxo) {
                        Toolbar toolbar = dd0Var.qoPGr6Ce;
                        dd0Var.Qr9iLBAD = title;
                        if ((dd0Var.NCTxEWno & 8) != 0) {
                            toolbar.setTitle(title);
                            if (dd0Var.b2ZJblxo) {
                                hg0.k3x7lurq(toolbar.getRootView(), title);
                            }
                        }
                    }
                } else {
                    TextView textView = this.i7xS8jrb;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.U0LaHZX7.findViewById(R.id.content);
        View decorView = this.OnDfzHZD.getDecorView();
        contentFrameLayout2.Qr9iLBAD.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
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
        this.lwWCatUu = true;
        nBenlUV4 WYNAV5pd = WYNAV5pd(0);
        if (this.N8VPGzVC || WYNAV5pd.Qr9iLBAD != null) {
            return;
        }
        lwWCatUu(108);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cb, code lost:
    
        if (r6 == null) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean SgZGMMPL(nBenlUV4 nbenluv4, KeyEvent keyEvent) {
        ActionBarOverlayLayout actionBarOverlayLayout;
        ActionBarOverlayLayout actionBarOverlayLayout2;
        Resources.Theme theme;
        ActionBarOverlayLayout actionBarOverlayLayout3;
        ActionBarOverlayLayout actionBarOverlayLayout4;
        if (!this.N8VPGzVC) {
            boolean z = nbenluv4.k3x7lurq;
            int i = nbenluv4.qoPGr6Ce;
            if (z) {
                return true;
            }
            nBenlUV4 nbenluv42 = this.hzgxAD8d;
            if (nbenluv42 != null && nbenluv42 != nbenluv4) {
                amk52bBQ(nbenluv42, false);
            }
            Window.Callback callback = this.OnDfzHZD.getCallback();
            if (callback != null) {
                nbenluv4.b2ZJblxo = callback.onCreatePanelView(i);
            }
            boolean z2 = i == 0 || i == 108;
            if (z2 && (actionBarOverlayLayout4 = this.amk52bBQ) != null) {
                actionBarOverlayLayout4.k3x7lurq();
                ((dd0) actionBarOverlayLayout4.P7K7Inc8).ow5vqvCr = true;
            }
            if (nbenluv4.b2ZJblxo == null) {
                yr yrVar = nbenluv4.Qr9iLBAD;
                if (yrVar == null || nbenluv4.lDXGDhIF) {
                    if (yrVar == null) {
                        Context context = this.ow5vqvCr;
                        if ((i == 0 || i == 108) && this.amk52bBQ != null) {
                            TypedValue typedValue = new TypedValue();
                            Resources.Theme theme2 = context.getTheme();
                            theme2.resolveAttribute(com.kolosta.rejin.jilosa.R.attr.actionBarTheme, typedValue, true);
                            if (typedValue.resourceId != 0) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                                theme.applyStyle(typedValue.resourceId, true);
                                theme.resolveAttribute(com.kolosta.rejin.jilosa.R.attr.actionBarWidgetTheme, typedValue, true);
                            } else {
                                theme2.resolveAttribute(com.kolosta.rejin.jilosa.R.attr.actionBarWidgetTheme, typedValue, true);
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
                                f9 f9Var = new f9(context, 0);
                                f9Var.getTheme().setTo(theme);
                                context = f9Var;
                            }
                        }
                        yr yrVar2 = new yr(context);
                        yrVar2.VgvYg0wo = this;
                        yr yrVar3 = nbenluv4.Qr9iLBAD;
                        if (yrVar2 != yrVar3) {
                            if (yrVar3 != null) {
                                yrVar3.amk52bBQ(nbenluv4.jb9XjC4I);
                            }
                            nbenluv4.Qr9iLBAD = yrVar2;
                            pp ppVar = nbenluv4.jb9XjC4I;
                            if (ppVar != null) {
                                yrVar2.NCTxEWno(ppVar, yrVar2.qoPGr6Ce);
                            }
                        }
                        yrVar = nbenluv4.Qr9iLBAD;
                    }
                    if (z2 && (actionBarOverlayLayout2 = this.amk52bBQ) != null) {
                        nEk3tCGF nek3tcgf = this.KlHjfFWx;
                        if (nek3tcgf == null) {
                            nek3tcgf = new nEk3tCGF(this, 2);
                            this.KlHjfFWx = nek3tcgf;
                        }
                        actionBarOverlayLayout2.ow5vqvCr(yrVar, nek3tcgf);
                    }
                    nbenluv4.Qr9iLBAD.FySoLYna();
                    if (callback.onCreatePanelMenu(i, nbenluv4.Qr9iLBAD)) {
                        nbenluv4.lDXGDhIF = false;
                    } else {
                        yr yrVar4 = nbenluv4.Qr9iLBAD;
                        if (yrVar4 != null) {
                            if (yrVar4 != null) {
                                yrVar4.amk52bBQ(nbenluv4.jb9XjC4I);
                            }
                            nbenluv4.Qr9iLBAD = null;
                        }
                        if (z2 && (actionBarOverlayLayout = this.amk52bBQ) != null) {
                            actionBarOverlayLayout.ow5vqvCr(null, this.KlHjfFWx);
                        }
                    }
                }
                nbenluv4.Qr9iLBAD.FySoLYna();
                Bundle bundle = nbenluv4.sjUBp5pO;
                if (bundle != null) {
                    nbenluv4.Qr9iLBAD.KlHjfFWx(bundle);
                    nbenluv4.sjUBp5pO = null;
                }
                if (!callback.onPreparePanel(0, nbenluv4.b2ZJblxo, nbenluv4.Qr9iLBAD)) {
                    if (z2 && (actionBarOverlayLayout3 = this.amk52bBQ) != null) {
                        actionBarOverlayLayout3.ow5vqvCr(null, this.KlHjfFWx);
                    }
                    nbenluv4.Qr9iLBAD.RXQxj5Oe();
                    return false;
                }
                nbenluv4.Qr9iLBAD.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
                nbenluv4.Qr9iLBAD.RXQxj5Oe();
            }
            nbenluv4.k3x7lurq = true;
            nbenluv4.ow5vqvCr = false;
            this.hzgxAD8d = nbenluv4;
            return true;
        }
        return false;
    }

    public final int U0LaHZX7(Context context, int i) {
        if (i != -100) {
            if (i != -1) {
                if (i != 0) {
                    if (i != 1 && i != 2) {
                        if (i != 3) {
                            m1.Ey6iv0m0("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                            return 0;
                        }
                        D7luKAMV d7luKAMV = this.g2aRJUAd;
                        if (d7luKAMV == null) {
                            d7luKAMV = new D7luKAMV(this, context);
                            this.g2aRJUAd = d7luKAMV;
                        }
                        return d7luKAMV.b2ZJblxo();
                    }
                } else if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() != 0) {
                    return gjV1z5T1(context).b2ZJblxo();
                }
            }
            return i;
        }
        return -1;
    }

    public final nBenlUV4 WYNAV5pd(int i) {
        nBenlUV4[] nbenluv4Arr = this.fVMzMhyS;
        if (nbenluv4Arr == null || nbenluv4Arr.length <= i) {
            nBenlUV4[] nbenluv4Arr2 = new nBenlUV4[i + 1];
            if (nbenluv4Arr != null) {
                System.arraycopy(nbenluv4Arr, 0, nbenluv4Arr2, 0, nbenluv4Arr.length);
            }
            this.fVMzMhyS = nbenluv4Arr2;
            nbenluv4Arr = nbenluv4Arr2;
        }
        nBenlUV4 nbenluv4 = nbenluv4Arr[i];
        if (nbenluv4 != null) {
            return nbenluv4;
        }
        nBenlUV4 nbenluv42 = new nBenlUV4();
        nbenluv42.qoPGr6Ce = i;
        nbenluv42.ygLcUYwZ = false;
        nbenluv4Arr[i] = nbenluv42;
        return nbenluv42;
    }

    public final void amk52bBQ(nBenlUV4 nbenluv4, boolean z) {
        REcs5POV rEcs5POV;
        ActionBarOverlayLayout actionBarOverlayLayout;
        CTE3lpUp cTE3lpUp;
        if (z && nbenluv4.qoPGr6Ce == 0 && (actionBarOverlayLayout = this.amk52bBQ) != null) {
            actionBarOverlayLayout.k3x7lurq();
            ActionMenuView actionMenuView = ((dd0) actionBarOverlayLayout.P7K7Inc8).qoPGr6Ce.NCTxEWno;
            if (actionMenuView != null && (cTE3lpUp = actionMenuView.I5GHvsYW) != null && cTE3lpUp.jb9XjC4I()) {
                OxcuoDLp(nbenluv4.Qr9iLBAD);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.ow5vqvCr.getSystemService("window");
        if (windowManager != null && nbenluv4.OnDfzHZD && (rEcs5POV = nbenluv4.VgvYg0wo) != null) {
            windowManager.removeView(rEcs5POV);
            if (z) {
                sjUBp5pO(nbenluv4.qoPGr6Ce, nbenluv4, null);
            }
        }
        nbenluv4.k3x7lurq = false;
        nbenluv4.ow5vqvCr = false;
        nbenluv4.OnDfzHZD = false;
        nbenluv4.P7K7Inc8 = null;
        nbenluv4.ygLcUYwZ = true;
        if (this.hzgxAD8d == nbenluv4) {
            this.hzgxAD8d = null;
        }
        if (nbenluv4.qoPGr6Ce == 0) {
            eIA6dogk();
        }
    }

    @Override // defpackage.wr
    public final boolean b2ZJblxo(yr yrVar, MenuItem menuItem) {
        nBenlUV4 nbenluv4;
        Window.Callback callback = this.OnDfzHZD.getCallback();
        if (callback != null && !this.N8VPGzVC) {
            yr k3x7lurq = yrVar.k3x7lurq();
            nBenlUV4[] nbenluv4Arr = this.fVMzMhyS;
            int length = nbenluv4Arr != null ? nbenluv4Arr.length : 0;
            int i = 0;
            while (true) {
                if (i < length) {
                    nbenluv4 = nbenluv4Arr[i];
                    if (nbenluv4 != null && nbenluv4.Qr9iLBAD == k3x7lurq) {
                        break;
                    }
                    i++;
                } else {
                    nbenluv4 = null;
                    break;
                }
            }
            if (nbenluv4 != null) {
                return callback.onMenuItemSelected(nbenluv4.qoPGr6Ce, menuItem);
            }
        }
        return false;
    }

    public final void eIA6dogk() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.hGvurcGl != null && (WYNAV5pd(0).OnDfzHZD || this.I5GHvsYW != null)) {
                z = true;
            }
            if (z && this.Wi7iiXC4 == null) {
                this.Wi7iiXC4 = iZMrJEOF.NCTxEWno(this.hGvurcGl, this);
            } else {
                if (z || (onBackInvokedCallback = this.Wi7iiXC4) == null) {
                    return;
                }
                iZMrJEOF.MdtA4re8(this.hGvurcGl, onBackInvokedCallback);
                this.Wi7iiXC4 = null;
            }
        }
    }

    @Override // defpackage.DQL61DDk
    public final void eVhOlqcC(View view, ViewGroup.LayoutParams layoutParams) {
        RXQxj5Oe();
        ViewGroup viewGroup = (ViewGroup) this.U0LaHZX7.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.ygLcUYwZ.qoPGr6Ce(this.OnDfzHZD.getCallback());
    }

    public final boolean euDDoUNr(nBenlUV4 nbenluv4, int i, KeyEvent keyEvent) {
        yr yrVar;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((nbenluv4.k3x7lurq || SgZGMMPL(nbenluv4, keyEvent)) && (yrVar = nbenluv4.Qr9iLBAD) != null) {
            return yrVar.performShortcut(i, keyEvent, 1);
        }
        return false;
    }

    public final cD2QLRqg gjV1z5T1(Context context) {
        D7luKAMV d7luKAMV = this.TrssYQ34;
        if (d7luKAMV == null) {
            f0 f0Var = f0.Qr9iLBAD;
            if (f0Var == null) {
                Context applicationContext = context.getApplicationContext();
                f0Var = new f0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
                f0.Qr9iLBAD = f0Var;
            }
            d7luKAMV = new D7luKAMV(this, f0Var);
            this.TrssYQ34 = d7luKAMV;
        }
        return d7luKAMV;
    }

    public final boolean i7xS8jrb() {
        sa saVar;
        xc0 xc0Var;
        boolean z = this.zCflySGU;
        this.zCflySGU = false;
        nBenlUV4 WYNAV5pd = WYNAV5pd(0);
        if (!WYNAV5pd.OnDfzHZD) {
            yzvmSy3z yzvmsy3z = this.I5GHvsYW;
            if (yzvmsy3z != null) {
                yzvmsy3z.qoPGr6Ce();
                return true;
            }
            DK9slbsy();
            zh0 zh0Var = this.lDXGDhIF;
            if (zh0Var == null || (saVar = zh0Var.VgvYg0wo) == null || (xc0Var = ((dd0) saVar).qoPGr6Ce.fVMzMhyS) == null || xc0Var.MdtA4re8 == null) {
                return false;
            }
            xc0 xc0Var2 = ((dd0) saVar).qoPGr6Ce.fVMzMhyS;
            cs csVar = xc0Var2 == null ? null : xc0Var2.MdtA4re8;
            if (csVar != null) {
                csVar.collapseActionView();
            }
        } else if (!z) {
            amk52bBQ(WYNAV5pd, true);
            return true;
        }
        return true;
    }

    @Override // defpackage.DQL61DDk
    public final void jb9XjC4I(View view) {
        RXQxj5Oe();
        ViewGroup viewGroup = (ViewGroup) this.U0LaHZX7.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.ygLcUYwZ.qoPGr6Ce(this.OnDfzHZD.getCallback());
    }

    @Override // defpackage.DQL61DDk
    public final void k3x7lurq(CharSequence charSequence) {
        this.OxcuoDLp = charSequence;
        ActionBarOverlayLayout actionBarOverlayLayout = this.amk52bBQ;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setWindowTitle(charSequence);
            return;
        }
        zh0 zh0Var = this.lDXGDhIF;
        if (zh0Var == null) {
            TextView textView = this.i7xS8jrb;
            if (textView != null) {
                textView.setText(charSequence);
                return;
            }
            return;
        }
        dd0 dd0Var = (dd0) zh0Var.VgvYg0wo;
        if (dd0Var.b2ZJblxo) {
            return;
        }
        Toolbar toolbar = dd0Var.qoPGr6Ce;
        dd0Var.Qr9iLBAD = charSequence;
        if ((dd0Var.NCTxEWno & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (dd0Var.b2ZJblxo) {
                hg0.k3x7lurq(toolbar.getRootView(), charSequence);
            }
        }
    }

    public final void lwWCatUu(int i) {
        this.VGmz0ccI = (1 << i) | this.VGmz0ccI;
        if (this.ESscZ9M1) {
            return;
        }
        View decorView = this.OnDfzHZD.getDecorView();
        WeakHashMap weakHashMap = hg0.qoPGr6Ce;
        decorView.postOnAnimation(this.LfKQckgD);
        this.ESscZ9M1 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x010c, code lost:
    
        if (r10.equals("ImageButton") == false) goto L24;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View s8bmZIW2;
        e0 e0Var = this.LvHlPNBd;
        View view2 = null;
        if (e0Var == null) {
            int[] iArr = z00.eVhOlqcC;
            Context context2 = this.ow5vqvCr;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            String string = obtainStyledAttributes.getString(116);
            obtainStyledAttributes.recycle();
            if (string == null) {
                e0Var = new e0();
                this.LvHlPNBd = e0Var;
            } else {
                try {
                    e0Var = (e0) context2.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                    this.LvHlPNBd = e0Var;
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    e0Var = new e0();
                    this.LvHlPNBd = e0Var;
                }
            }
        }
        int i = mf0.qoPGr6Ce;
        e0Var.getClass();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, z00.gjV1z5T1, 0, 0);
        char c = 4;
        int resourceId = obtainStyledAttributes2.getResourceId(4, 0);
        if (resourceId != 0) {
            Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes2.recycle();
        Context f9Var = (resourceId == 0 || ((context instanceof f9) && ((f9) context).qoPGr6Ce == resourceId)) ? context : new f9(context, resourceId);
        str.getClass();
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -937446323:
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                s8bmZIW2 = new S8bmZIW2(f9Var, attributeSet);
                break;
            case 1:
                s8bmZIW2 = new N1Rc84Tm(f9Var, attributeSet);
                break;
            case 2:
                s8bmZIW2 = new Stt3SxhF(f9Var, attributeSet);
                break;
            case 3:
                s8bmZIW2 = e0Var.VgvYg0wo(f9Var, attributeSet);
                break;
            case 4:
                s8bmZIW2 = new EiHZrOWV(f9Var, attributeSet, com.kolosta.rejin.jilosa.R.attr.imageButtonStyle);
                break;
            case 5:
                s8bmZIW2 = new qav1gMqP(f9Var, attributeSet);
                break;
            case 6:
                s8bmZIW2 = new l(f9Var, attributeSet);
                break;
            case 7:
                s8bmZIW2 = e0Var.wxUZMvaN(f9Var, attributeSet);
                break;
            case '\b':
                s8bmZIW2 = new c0(f9Var, attributeSet);
                break;
            case '\t':
                s8bmZIW2 = new CMlnIseC(f9Var, attributeSet, 0);
                break;
            case '\n':
                s8bmZIW2 = e0Var.qoPGr6Ce(f9Var, attributeSet);
                break;
            case 11:
                s8bmZIW2 = e0Var.MdtA4re8(f9Var, attributeSet);
                break;
            case '\f':
                s8bmZIW2 = new qIGtQL9b(f9Var, attributeSet);
                break;
            case '\r':
                s8bmZIW2 = e0Var.NCTxEWno(f9Var, attributeSet);
                break;
            default:
                s8bmZIW2 = null;
                break;
        }
        if (s8bmZIW2 == null && context != f9Var) {
            Object[] objArr = e0Var.qoPGr6Ce;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, "class");
            }
            try {
                objArr[0] = f9Var;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i2 = 0;
                    while (true) {
                        String[] strArr = e0.b2ZJblxo;
                        if (i2 < 3) {
                            View P7K7Inc8 = e0Var.P7K7Inc8(f9Var, str, strArr[i2]);
                            if (P7K7Inc8 != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                view2 = P7K7Inc8;
                            } else {
                                i2++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                        }
                    }
                } else {
                    View P7K7Inc82 = e0Var.P7K7Inc8(f9Var, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    view2 = P7K7Inc82;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
            s8bmZIW2 = view2;
        }
        if (s8bmZIW2 != null) {
            Context context3 = s8bmZIW2.getContext();
            if ((context3 instanceof ContextWrapper) && s8bmZIW2.hasOnClickListeners()) {
                TypedArray obtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, e0.MdtA4re8);
                String string2 = obtainStyledAttributes3.getString(0);
                if (string2 != null) {
                    s8bmZIW2.setOnClickListener(new d0(s8bmZIW2, string2));
                }
                obtainStyledAttributes3.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray obtainStyledAttributes4 = f9Var.obtainStyledAttributes(attributeSet, e0.wxUZMvaN);
                if (obtainStyledAttributes4.hasValue(0)) {
                    boolean z = obtainStyledAttributes4.getBoolean(0, false);
                    WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                    new vf0(com.kolosta.rejin.jilosa.R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).P7K7Inc8(s8bmZIW2, Boolean.valueOf(z));
                }
                obtainStyledAttributes4.recycle();
                TypedArray obtainStyledAttributes5 = f9Var.obtainStyledAttributes(attributeSet, e0.VgvYg0wo);
                if (obtainStyledAttributes5.hasValue(0)) {
                    hg0.k3x7lurq(s8bmZIW2, obtainStyledAttributes5.getString(0));
                }
                obtainStyledAttributes5.recycle();
                TypedArray obtainStyledAttributes6 = f9Var.obtainStyledAttributes(attributeSet, e0.P7K7Inc8);
                if (obtainStyledAttributes6.hasValue(0)) {
                    boolean z2 = obtainStyledAttributes6.getBoolean(0, false);
                    WeakHashMap weakHashMap2 = hg0.qoPGr6Ce;
                    new vf0(com.kolosta.rejin.jilosa.R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0).P7K7Inc8(s8bmZIW2, Boolean.valueOf(z2));
                }
                obtainStyledAttributes6.recycle();
            }
        }
        return s8bmZIW2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean ow5vqvCr(boolean z, boolean z2) {
        int i;
        Configuration configuration;
        dq NCTxEWno;
        int i2;
        boolean z3;
        Object obj;
        Object obj2;
        Activity activity;
        if (this.N8VPGzVC) {
            return false;
        }
        int i3 = this.ZyZthT5G;
        if (i3 == -100) {
            i3 = DQL61DDk.MdtA4re8;
        }
        Context context = this.ow5vqvCr;
        int U0LaHZX7 = U0LaHZX7(context, i3);
        int i4 = Build.VERSION.SDK_INT;
        LongSparseArray longSparseArray = null;
        dq lDXGDhIF = i4 < 33 ? lDXGDhIF(context) : null;
        if (!z2 && lDXGDhIF != null) {
            lDXGDhIF = tx3ZX4rv.NCTxEWno(context.getResources().getConfiguration());
        }
        Configuration KlHjfFWx = KlHjfFWx(context, U0LaHZX7, lDXGDhIF, null, false);
        boolean z4 = this.gmkaJpmS;
        boolean z5 = true;
        Object obj3 = this.k3x7lurq;
        if (!z4 && (obj3 instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                i = 0;
                configuration = this.HdOGZAzC;
                if (configuration == null) {
                    configuration = context.getResources().getConfiguration();
                }
                int i5 = configuration.uiMode & 48;
                int i6 = KlHjfFWx.uiMode & 48;
                dq NCTxEWno2 = tx3ZX4rv.NCTxEWno(configuration);
                NCTxEWno = lDXGDhIF != null ? null : tx3ZX4rv.NCTxEWno(KlHjfFWx);
                i2 = i5 == i6 ? 512 : 0;
                if (NCTxEWno != null && !NCTxEWno2.equals(NCTxEWno)) {
                    i2 |= 8196;
                }
                if (((~i) & i2) != 0 && z && this.FXJmAAN1 && ((dHozS53r || this.nSmgoSB5) && (obj3 instanceof Activity))) {
                    activity = (Activity) obj3;
                    if (!activity.isChild()) {
                        int i7 = Build.VERSION.SDK_INT;
                        if (i7 >= 31 && (i2 & 8192) != 0) {
                            activity.getWindow().getDecorView().setLayoutDirection(KlHjfFWx.getLayoutDirection());
                        }
                        if (i7 >= 28) {
                            activity.recreate();
                        } else {
                            new Handler(activity.getMainLooper()).post(new d3vfVszL(r1, activity));
                        }
                        z3 = true;
                        if (!z3 || i2 == 0) {
                            z5 = z3;
                        } else {
                            r1 = (i2 & i) == i2 ? 1 : 0;
                            Resources resources = context.getResources();
                            Configuration configuration2 = new Configuration(resources.getConfiguration());
                            configuration2.uiMode = (resources.getConfiguration().uiMode & (-49)) | i6;
                            if (NCTxEWno != null) {
                                tx3ZX4rv.wxUZMvaN(configuration2, NCTxEWno);
                            }
                            resources.updateConfiguration(configuration2, null);
                            int i8 = Build.VERSION.SDK_INT;
                            if (i8 < 26 && i8 < 28) {
                                if (!ra.RXQxj5Oe) {
                                    try {
                                        Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                                        ra.I5GHvsYW = declaredField;
                                        declaredField.setAccessible(true);
                                    } catch (NoSuchFieldException e) {
                                        Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e);
                                    }
                                    ra.RXQxj5Oe = true;
                                }
                                Field field = ra.I5GHvsYW;
                                if (field != null) {
                                    try {
                                        obj = field.get(resources);
                                    } catch (IllegalAccessException e2) {
                                        Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e2);
                                        obj = null;
                                    }
                                    if (obj != null) {
                                        if (!ra.sjUBp5pO) {
                                            try {
                                                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                                                ra.lDXGDhIF = declaredField2;
                                                declaredField2.setAccessible(true);
                                            } catch (NoSuchFieldException e3) {
                                                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e3);
                                            }
                                            ra.sjUBp5pO = true;
                                        }
                                        Field field2 = ra.lDXGDhIF;
                                        if (field2 != null) {
                                            try {
                                                obj2 = field2.get(obj);
                                            } catch (IllegalAccessException e4) {
                                                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e4);
                                            }
                                            if (obj2 != null) {
                                                if (!ra.amk52bBQ) {
                                                    try {
                                                        ra.OxcuoDLp = Class.forName("android.content.res.ThemedResourceCache");
                                                    } catch (ClassNotFoundException e5) {
                                                        Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e5);
                                                    }
                                                    ra.amk52bBQ = true;
                                                }
                                                Class cls = ra.OxcuoDLp;
                                                if (cls != null) {
                                                    if (!ra.Ey6iv0m0) {
                                                        try {
                                                            Field declaredField3 = cls.getDeclaredField("mUnthemedEntries");
                                                            ra.KlHjfFWx = declaredField3;
                                                            declaredField3.setAccessible(true);
                                                        } catch (NoSuchFieldException e6) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e6);
                                                        }
                                                        ra.Ey6iv0m0 = true;
                                                    }
                                                    Field field3 = ra.KlHjfFWx;
                                                    if (field3 != null) {
                                                        try {
                                                            longSparseArray = (LongSparseArray) field3.get(obj2);
                                                        } catch (IllegalAccessException e7) {
                                                            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e7);
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
                            int i9 = this.bvfAo0eO;
                            if (i9 != 0) {
                                context.setTheme(i9);
                                context.getTheme().applyStyle(this.bvfAo0eO, true);
                            }
                            if (r1 != 0 && (obj3 instanceof Activity)) {
                                Activity activity2 = (Activity) obj3;
                                if (activity2 instanceof vo) {
                                    if (((vo) activity2).b2ZJblxo().MdtA4re8.compareTo(po.wxUZMvaN) >= 0) {
                                        activity2.onConfigurationChanged(configuration2);
                                    }
                                } else if (this.nSmgoSB5 && !this.N8VPGzVC) {
                                    activity2.onConfigurationChanged(configuration2);
                                }
                            }
                        }
                        if (NCTxEWno != null) {
                            tx3ZX4rv.MdtA4re8(tx3ZX4rv.NCTxEWno(context.getResources().getConfiguration()));
                        }
                        if (i3 == 0) {
                            gjV1z5T1(context).lDXGDhIF();
                        } else {
                            D7luKAMV d7luKAMV = this.TrssYQ34;
                            if (d7luKAMV != null) {
                                d7luKAMV.wxUZMvaN();
                            }
                        }
                        D7luKAMV d7luKAMV2 = this.g2aRJUAd;
                        if (i3 == 3) {
                            if (d7luKAMV2 == null) {
                                d7luKAMV2 = new D7luKAMV(this, context);
                                this.g2aRJUAd = d7luKAMV2;
                            }
                            d7luKAMV2.lDXGDhIF();
                        } else if (d7luKAMV2 != null) {
                            d7luKAMV2.wxUZMvaN();
                        }
                        return z5;
                    }
                }
                z3 = false;
                if (z3) {
                }
                z5 = z3;
                if (NCTxEWno != null) {
                }
                if (i3 == 0) {
                }
                D7luKAMV d7luKAMV22 = this.g2aRJUAd;
                if (i3 == 3) {
                }
                return z5;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, obj3.getClass()), i4 >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.KRabZ4CU = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e8) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e8);
                this.KRabZ4CU = 0;
            }
        }
        this.gmkaJpmS = true;
        i = this.KRabZ4CU;
        configuration = this.HdOGZAzC;
        if (configuration == null) {
        }
        int i52 = configuration.uiMode & 48;
        int i62 = KlHjfFWx.uiMode & 48;
        dq NCTxEWno22 = tx3ZX4rv.NCTxEWno(configuration);
        if (lDXGDhIF != null) {
        }
        if (i52 == i62) {
        }
        if (NCTxEWno != null) {
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
        z5 = z3;
        if (NCTxEWno != null) {
        }
        if (i3 == 0) {
        }
        D7luKAMV d7luKAMV222 = this.g2aRJUAd;
        if (i3 == 3) {
        }
        return z5;
    }

    @Override // defpackage.DQL61DDk
    public final void qoPGr6Ce() {
        LayoutInflater from = LayoutInflater.from(this.ow5vqvCr);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof SJ7tYVsF) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final void sjUBp5pO(int i, nBenlUV4 nbenluv4, yr yrVar) {
        if (yrVar == null) {
            if (nbenluv4 == null && i >= 0) {
                nBenlUV4[] nbenluv4Arr = this.fVMzMhyS;
                if (i < nbenluv4Arr.length) {
                    nbenluv4 = nbenluv4Arr[i];
                }
            }
            if (nbenluv4 != null) {
                yrVar = nbenluv4.Qr9iLBAD;
            }
        }
        if ((nbenluv4 == null || nbenluv4.OnDfzHZD) && !this.N8VPGzVC) {
            kCZyLIxn kczylixn = this.ygLcUYwZ;
            Window.Callback callback = this.OnDfzHZD.getCallback();
            kczylixn.getClass();
            try {
                kczylixn.VgvYg0wo = true;
                callback.onPanelClosed(i, yrVar);
            } finally {
                kczylixn.VgvYg0wo = false;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.DQL61DDk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void wxUZMvaN() {
        D7luKAMV d7luKAMV;
        D7luKAMV d7luKAMV2;
        if (this.k3x7lurq instanceof Activity) {
            synchronized (DQL61DDk.jb9XjC4I) {
                DQL61DDk.VgvYg0wo(this);
            }
        }
        if (this.ESscZ9M1) {
            this.OnDfzHZD.getDecorView().removeCallbacks(this.LfKQckgD);
        }
        this.N8VPGzVC = true;
        if (this.ZyZthT5G != -100) {
            Object obj = this.k3x7lurq;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                QT4Tf9Dt.put(this.k3x7lurq.getClass().getName(), Integer.valueOf(this.ZyZthT5G));
                d7luKAMV = this.TrssYQ34;
                if (d7luKAMV != null) {
                    d7luKAMV.wxUZMvaN();
                }
                d7luKAMV2 = this.g2aRJUAd;
                if (d7luKAMV2 == null) {
                    d7luKAMV2.wxUZMvaN();
                    return;
                }
                return;
            }
        }
        QT4Tf9Dt.remove(this.k3x7lurq.getClass().getName());
        d7luKAMV = this.TrssYQ34;
        if (d7luKAMV != null) {
        }
        d7luKAMV2 = this.g2aRJUAd;
        if (d7luKAMV2 == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r6.jb9XjC4I() != false) goto L20;
     */
    @Override // defpackage.wr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ygLcUYwZ(yr yrVar) {
        ActionMenuView actionMenuView;
        CTE3lpUp cTE3lpUp;
        CTE3lpUp cTE3lpUp2;
        CTE3lpUp cTE3lpUp3;
        ActionBarOverlayLayout actionBarOverlayLayout = this.amk52bBQ;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.k3x7lurq();
            Toolbar toolbar = ((dd0) actionBarOverlayLayout.P7K7Inc8).qoPGr6Ce;
            if (toolbar.getVisibility() == 0 && (actionMenuView = toolbar.NCTxEWno) != null && actionMenuView.Ey6iv0m0) {
                if (ViewConfiguration.get(this.ow5vqvCr).hasPermanentMenuKey()) {
                    ActionBarOverlayLayout actionBarOverlayLayout2 = this.amk52bBQ;
                    actionBarOverlayLayout2.k3x7lurq();
                    ActionMenuView actionMenuView2 = ((dd0) actionBarOverlayLayout2.P7K7Inc8).qoPGr6Ce.NCTxEWno;
                    if (actionMenuView2 != null) {
                        CTE3lpUp cTE3lpUp4 = actionMenuView2.I5GHvsYW;
                        if (cTE3lpUp4 != null) {
                            if (cTE3lpUp4.FySoLYna == null) {
                            }
                        }
                    }
                }
                Window.Callback callback = this.OnDfzHZD.getCallback();
                ActionBarOverlayLayout actionBarOverlayLayout3 = this.amk52bBQ;
                actionBarOverlayLayout3.k3x7lurq();
                ActionMenuView actionMenuView3 = ((dd0) actionBarOverlayLayout3.P7K7Inc8).qoPGr6Ce.NCTxEWno;
                if (actionMenuView3 != null && (cTE3lpUp2 = actionMenuView3.I5GHvsYW) != null && cTE3lpUp2.jb9XjC4I()) {
                    ActionBarOverlayLayout actionBarOverlayLayout4 = this.amk52bBQ;
                    actionBarOverlayLayout4.k3x7lurq();
                    ActionMenuView actionMenuView4 = ((dd0) actionBarOverlayLayout4.P7K7Inc8).qoPGr6Ce.NCTxEWno;
                    if (actionMenuView4 != null && (cTE3lpUp3 = actionMenuView4.I5GHvsYW) != null) {
                        cTE3lpUp3.wxUZMvaN();
                    }
                    if (this.N8VPGzVC) {
                        return;
                    }
                    callback.onPanelClosed(108, WYNAV5pd(0).Qr9iLBAD);
                    return;
                }
                if (callback == null || this.N8VPGzVC) {
                    return;
                }
                if (this.ESscZ9M1 && (1 & this.VGmz0ccI) != 0) {
                    View decorView = this.OnDfzHZD.getDecorView();
                    fhw4zlf4 fhw4zlf4Var = this.LfKQckgD;
                    decorView.removeCallbacks(fhw4zlf4Var);
                    fhw4zlf4Var.run();
                }
                nBenlUV4 WYNAV5pd = WYNAV5pd(0);
                yr yrVar2 = WYNAV5pd.Qr9iLBAD;
                if (yrVar2 == null || WYNAV5pd.lDXGDhIF || !callback.onPreparePanel(0, WYNAV5pd.b2ZJblxo, yrVar2)) {
                    return;
                }
                callback.onMenuOpened(108, WYNAV5pd.Qr9iLBAD);
                ActionBarOverlayLayout actionBarOverlayLayout5 = this.amk52bBQ;
                actionBarOverlayLayout5.k3x7lurq();
                ActionMenuView actionMenuView5 = ((dd0) actionBarOverlayLayout5.P7K7Inc8).qoPGr6Ce.NCTxEWno;
                if (actionMenuView5 == null || (cTE3lpUp = actionMenuView5.I5GHvsYW) == null) {
                    return;
                }
                cTE3lpUp.ygLcUYwZ();
                return;
            }
        }
        nBenlUV4 WYNAV5pd2 = WYNAV5pd(0);
        WYNAV5pd2.ygLcUYwZ = true;
        amk52bBQ(WYNAV5pd2, false);
        Mq3SeTnW(WYNAV5pd2, null);
    }

    public final void ytu5o6f4() {
        if (this.lwWCatUu) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
