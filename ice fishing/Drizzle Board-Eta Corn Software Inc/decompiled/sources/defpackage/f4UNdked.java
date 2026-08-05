package defpackage;

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
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class f4UNdked extends n7 implements fBtTvv4Q {
    public boolean FySoLYna;
    public boolean RXQxj5Oe;
    public SJ7tYVsF WYNAV5pd;
    public final tg0 Ey6iv0m0 = new tg0(15, new ni(this));
    public final xo I5GHvsYW = new xo(this);
    public boolean gjV1z5T1 = true;

    public f4UNdked() {
        final int i = 1;
        ((mcXgUFR8) this.P7K7Inc8.NCTxEWno).eIA6dogk("android:support:lifecycle", new f7(this, i));
        final int i2 = 0;
        jb9XjC4I(new w8(this) { // from class: mi
            public final /* synthetic */ f4UNdked NCTxEWno;

            {
                this.NCTxEWno = this;
            }

            @Override // defpackage.w8
            public final void accept(Object obj) {
                int i3 = i2;
                f4UNdked f4undked = this.NCTxEWno;
                switch (i3) {
                    case 0:
                        f4undked.Ey6iv0m0.i7xS8jrb();
                        break;
                    default:
                        f4undked.Ey6iv0m0.i7xS8jrb();
                        break;
                }
            }
        });
        this.lDXGDhIF.add(new w8(this) { // from class: mi
            public final /* synthetic */ f4UNdked NCTxEWno;

            {
                this.NCTxEWno = this;
            }

            @Override // defpackage.w8
            public final void accept(Object obj) {
                int i3 = i;
                f4UNdked f4undked = this.NCTxEWno;
                switch (i3) {
                    case 0:
                        f4undked.Ey6iv0m0.i7xS8jrb();
                        break;
                    default:
                        f4undked.Ey6iv0m0.i7xS8jrb();
                        break;
                }
            }
        });
        eVhOlqcC(new g7(this, i));
    }

    public static boolean ygLcUYwZ(ej ejVar) {
        boolean z = false;
        for (li liVar : ejVar.MdtA4re8.b2ZJblxo()) {
            if (liVar != null) {
                ni niVar = liVar.I5GHvsYW;
                if ((niVar == null ? null : niVar.Ey6iv0m0) != null) {
                    z |= ygLcUYwZ(liVar.jb9XjC4I());
                }
                bk bkVar = liVar.nSmgoSB5;
                po poVar = po.VgvYg0wo;
                po poVar2 = po.wxUZMvaN;
                if (bkVar != null) {
                    bkVar.MdtA4re8();
                    if (bkVar.P7K7Inc8.MdtA4re8.compareTo(poVar) >= 0) {
                        liVar.nSmgoSB5.P7K7Inc8.b2ZJblxo(poVar2);
                        z = true;
                    }
                }
                if (liVar.FXJmAAN1.MdtA4re8.compareTo(poVar) >= 0) {
                    liVar.FXJmAAN1.b2ZJblxo(poVar2);
                    z = true;
                }
            }
        }
        return z;
    }

    public final void KlHjfFWx() {
        tg0 tg0Var;
        super.onStop();
        this.gjV1z5T1 = true;
        do {
            tg0Var = this.Ey6iv0m0;
        } while (ygLcUYwZ(((ni) tg0Var.MdtA4re8).KlHjfFWx));
        ej ejVar = ((ni) tg0Var.MdtA4re8).KlHjfFWx;
        ejVar.ytu5o6f4 = true;
        ejVar.fVMzMhyS.b2ZJblxo = true;
        ejVar.Ey6iv0m0(4);
        this.I5GHvsYW.wxUZMvaN(oo.ON_STOP);
    }

    public final DQL61DDk OnDfzHZD() {
        SJ7tYVsF sJ7tYVsF = this.WYNAV5pd;
        if (sJ7tYVsF != null) {
            return sJ7tYVsF;
        }
        HzhOLUMW hzhOLUMW = DQL61DDk.NCTxEWno;
        SJ7tYVsF sJ7tYVsF2 = new SJ7tYVsF(this, null, this, this);
        this.WYNAV5pd = sJ7tYVsF2;
        return sJ7tYVsF2;
    }

    public final void OxcuoDLp() {
        super.onPostResume();
        this.I5GHvsYW.wxUZMvaN(oo.ON_RESUME);
        ej ejVar = ((ni) this.Ey6iv0m0.MdtA4re8).KlHjfFWx;
        ejVar.SgZGMMPL = false;
        ejVar.ytu5o6f4 = false;
        ejVar.fVMzMhyS.b2ZJblxo = false;
        ejVar.Ey6iv0m0(7);
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ow5vqvCr();
        SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) OnDfzHZD();
        sJ7tYVsF.RXQxj5Oe();
        ((ViewGroup) sJ7tYVsF.U0LaHZX7.findViewById(R.id.content)).addView(view, layoutParams);
        sJ7tYVsF.ygLcUYwZ.qoPGr6Ce(sJ7tYVsF.OnDfzHZD.getCallback());
    }

    public final void amk52bBQ() {
        tg0 tg0Var = this.Ey6iv0m0;
        tg0Var.i7xS8jrb();
        ni niVar = (ni) tg0Var.MdtA4re8;
        super.onStart();
        this.gjV1z5T1 = false;
        if (!this.RXQxj5Oe) {
            this.RXQxj5Oe = true;
            ej ejVar = niVar.KlHjfFWx;
            ejVar.SgZGMMPL = false;
            ejVar.ytu5o6f4 = false;
            ejVar.fVMzMhyS.b2ZJblxo = false;
            ejVar.Ey6iv0m0(4);
        }
        niVar.KlHjfFWx.gjV1z5T1(true);
        this.I5GHvsYW.wxUZMvaN(oo.ON_START);
        ej ejVar2 = niVar.KlHjfFWx;
        ejVar2.SgZGMMPL = false;
        ejVar2.ytu5o6f4 = false;
        ejVar2.fVMzMhyS.b2ZJblxo = false;
        ejVar2.Ey6iv0m0(5);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) OnDfzHZD();
        sJ7tYVsF.FXJmAAN1 = true;
        int i9 = sJ7tYVsF.ZyZthT5G;
        if (i9 == -100) {
            i9 = DQL61DDk.MdtA4re8;
        }
        int U0LaHZX7 = sJ7tYVsF.U0LaHZX7(context, i9);
        int i10 = 0;
        if (DQL61DDk.NCTxEWno(context) && DQL61DDk.NCTxEWno(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (DQL61DDk.eVhOlqcC) {
                    try {
                        dq dqVar = DQL61DDk.wxUZMvaN;
                        if (dqVar == null) {
                            dq dqVar2 = DQL61DDk.VgvYg0wo;
                            if (dqVar2 == null) {
                                dqVar2 = dq.qoPGr6Ce(w30.fVMzMhyS(context));
                                DQL61DDk.VgvYg0wo = dqVar2;
                            }
                            if (!dqVar2.qoPGr6Ce.qoPGr6Ce.isEmpty()) {
                                DQL61DDk.wxUZMvaN = DQL61DDk.VgvYg0wo;
                            }
                        } else if (!dqVar.equals(DQL61DDk.VgvYg0wo)) {
                            dq dqVar3 = DQL61DDk.wxUZMvaN;
                            DQL61DDk.VgvYg0wo = dqVar3;
                            w30.Xkz7p5xa(context, dqVar3.qoPGr6Ce.qoPGr6Ce.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!DQL61DDk.b2ZJblxo) {
                DQL61DDk.NCTxEWno.execute(new z0CKDypm(context, i10));
            }
        }
        dq lDXGDhIF = SJ7tYVsF.lDXGDhIF(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(SJ7tYVsF.KlHjfFWx(context, U0LaHZX7, lDXGDhIF, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof f9) {
            try {
                ((f9) context).qoPGr6Ce(SJ7tYVsF.KlHjfFWx(context, U0LaHZX7, lDXGDhIF, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (SJ7tYVsF.dHozS53r) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i11 = configuration3.mcc;
                    int i12 = configuration4.mcc;
                    if (i11 != i12) {
                        configuration.mcc = i12;
                    }
                    int i13 = configuration3.mnc;
                    int i14 = configuration4.mnc;
                    if (i13 != i14) {
                        configuration.mnc = i14;
                    }
                    tx3ZX4rv.qoPGr6Ce(configuration3, configuration4, configuration);
                    int i15 = configuration3.touchscreen;
                    int i16 = configuration4.touchscreen;
                    if (i15 != i16) {
                        configuration.touchscreen = i16;
                    }
                    int i17 = configuration3.keyboard;
                    int i18 = configuration4.keyboard;
                    if (i17 != i18) {
                        configuration.keyboard = i18;
                    }
                    int i19 = configuration3.keyboardHidden;
                    int i20 = configuration4.keyboardHidden;
                    if (i19 != i20) {
                        configuration.keyboardHidden = i20;
                    }
                    int i21 = configuration3.navigation;
                    int i22 = configuration4.navigation;
                    if (i21 != i22) {
                        configuration.navigation = i22;
                    }
                    int i23 = configuration3.navigationHidden;
                    int i24 = configuration4.navigationHidden;
                    if (i23 != i24) {
                        configuration.navigationHidden = i24;
                    }
                    int i25 = configuration3.orientation;
                    int i26 = configuration4.orientation;
                    if (i25 != i26) {
                        configuration.orientation = i26;
                    }
                    int i27 = configuration3.screenLayout & 15;
                    int i28 = configuration4.screenLayout & 15;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & 192;
                    int i30 = configuration4.screenLayout & 192;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 48;
                    int i32 = configuration4.screenLayout & 48;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & 768;
                    int i34 = configuration4.screenLayout & 768;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    if (Build.VERSION.SDK_INT >= 26) {
                        i = configuration3.colorMode;
                        int i35 = i & 3;
                        i2 = configuration4.colorMode;
                        if (i35 != (i2 & 3)) {
                            i7 = configuration.colorMode;
                            i8 = configuration4.colorMode;
                            configuration.colorMode = i7 | (i8 & 3);
                        }
                        i3 = configuration3.colorMode;
                        int i36 = i3 & 12;
                        i4 = configuration4.colorMode;
                        if (i36 != (i4 & 12)) {
                            i5 = configuration.colorMode;
                            i6 = configuration4.colorMode;
                            configuration.colorMode = i5 | (i6 & 12);
                        }
                    }
                    int i37 = configuration3.uiMode & 15;
                    int i38 = configuration4.uiMode & 15;
                    if (i37 != i38) {
                        configuration.uiMode |= i38;
                    }
                    int i39 = configuration3.uiMode & 48;
                    int i40 = configuration4.uiMode & 48;
                    if (i39 != i40) {
                        configuration.uiMode |= i40;
                    }
                    int i41 = configuration3.screenWidthDp;
                    int i42 = configuration4.screenWidthDp;
                    if (i41 != i42) {
                        configuration.screenWidthDp = i42;
                    }
                    int i43 = configuration3.screenHeightDp;
                    int i44 = configuration4.screenHeightDp;
                    if (i43 != i44) {
                        configuration.screenHeightDp = i44;
                    }
                    int i45 = configuration3.smallestScreenWidthDp;
                    int i46 = configuration4.smallestScreenWidthDp;
                    if (i45 != i46) {
                        configuration.smallestScreenWidthDp = i46;
                    }
                    int i47 = configuration3.densityDpi;
                    int i48 = configuration4.densityDpi;
                    if (i47 != i48) {
                        configuration.densityDpi = i48;
                    }
                }
            }
            Configuration KlHjfFWx = SJ7tYVsF.KlHjfFWx(context, U0LaHZX7, lDXGDhIF, configuration, true);
            f9 f9Var = new f9(context, com.kolosta.rejin.jilosa.R.style.Theme_AppCompat_Empty);
            f9Var.qoPGr6Ce(KlHjfFWx);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = f9Var.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        i0.MdtA4re8(theme);
                    } else {
                        synchronized (fn.KlHjfFWx) {
                            if (!fn.I5GHvsYW) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    fn.Ey6iv0m0 = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e);
                                }
                                fn.I5GHvsYW = true;
                            }
                            Method method = fn.Ey6iv0m0;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e2) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e2);
                                    fn.Ey6iv0m0 = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = f9Var;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((SJ7tYVsF) OnDfzHZD()).DK9slbsy();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // defpackage.m7, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((SJ7tYVsF) OnDfzHZD()).DK9slbsy();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L37;
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
                    if (str2.equals("--autofill") && Build.VERSION.SDK_INT >= 26) {
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
        printWriter.print(this.RXQxj5Oe);
        printWriter.print(" mResumed=");
        printWriter.print(this.FySoLYna);
        printWriter.print(" mStopped=");
        printWriter.print(this.gjV1z5T1);
        if (getApplication() != null) {
            ug0 P7K7Inc8 = P7K7Inc8();
            P7K7Inc8.getClass();
            y9 y9Var = y9.NCTxEWno;
            y9Var.getClass();
            VZZbw3BB vZZbw3BB = new VZZbw3BB(P7K7Inc8, cq.MdtA4re8, y9Var);
            p5 qoPGr6Ce = m20.qoPGr6Ce(cq.class);
            String NCTxEWno = qoPGr6Ce.NCTxEWno();
            if (NCTxEWno == null) {
                m1.sjUBp5pO("Local and anonymous classes can not be ViewModels");
                return;
            }
            a80 a80Var = ((cq) vZZbw3BB.Qr9iLBAD(qoPGr6Ce, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(NCTxEWno))).NCTxEWno;
            if (a80Var.MdtA4re8() > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (a80Var.MdtA4re8() > 0) {
                    if (a80Var.wxUZMvaN(0) != null) {
                        m1.qoPGr6Ce();
                        return;
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(a80Var.qoPGr6Ce(0));
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((ni) this.Ey6iv0m0.MdtA4re8).KlHjfFWx.I5GHvsYW(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) OnDfzHZD();
        sJ7tYVsF.RXQxj5Oe();
        return sJ7tYVsF.OnDfzHZD.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) OnDfzHZD();
        ra0 ra0Var = sJ7tYVsF.sjUBp5pO;
        if (ra0Var == null) {
            sJ7tYVsF.DK9slbsy();
            zh0 zh0Var = sJ7tYVsF.lDXGDhIF;
            ra0Var = new ra0(zh0Var != null ? zh0Var.NCTxEWno() : sJ7tYVsF.ow5vqvCr);
            sJ7tYVsF.sjUBp5pO = ra0Var;
        }
        return ra0Var;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = mf0.qoPGr6Ce;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) OnDfzHZD();
        if (sJ7tYVsF.lDXGDhIF != null) {
            sJ7tYVsF.DK9slbsy();
            sJ7tYVsF.lDXGDhIF.getClass();
            sJ7tYVsF.lwWCatUu(0);
        }
    }

    public final void lDXGDhIF() {
        super.onDestroy();
        ((ni) this.Ey6iv0m0.MdtA4re8).KlHjfFWx.k3x7lurq();
        this.I5GHvsYW.wxUZMvaN(oo.ON_DESTROY);
    }

    @Override // defpackage.n7, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.Ey6iv0m0.i7xS8jrb();
        super.onActivityResult(i, i2, intent);
    }

    @Override // defpackage.n7, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) OnDfzHZD();
        if (sJ7tYVsF.ytu5o6f4 && sJ7tYVsF.lwWCatUu) {
            sJ7tYVsF.DK9slbsy();
            zh0 zh0Var = sJ7tYVsF.lDXGDhIF;
            if (zh0Var != null) {
                zh0Var.VgvYg0wo(zh0Var.qoPGr6Ce.getResources().getBoolean(com.kolosta.rejin.jilosa.R.bool.abc_action_bar_embed_tabs));
            }
        }
        j5BPOSYv qoPGr6Ce = j5BPOSYv.qoPGr6Ce();
        Context context = sJ7tYVsF.ow5vqvCr;
        synchronized (qoPGr6Ce) {
            e30 e30Var = qoPGr6Ce.qoPGr6Ce;
            synchronized (e30Var) {
                lq lqVar = (lq) e30Var.NCTxEWno.get(context);
                if (lqVar != null) {
                    lqVar.qoPGr6Ce();
                }
            }
        }
        sJ7tYVsF.HdOGZAzC = new Configuration(sJ7tYVsF.ow5vqvCr.getResources().getConfiguration());
        sJ7tYVsF.ow5vqvCr(false, false);
    }

    @Override // defpackage.n7, defpackage.m7, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.I5GHvsYW.wxUZMvaN(oo.ON_CREATE);
        ej ejVar = ((ni) this.Ey6iv0m0.MdtA4re8).KlHjfFWx;
        ejVar.SgZGMMPL = false;
        ejVar.ytu5o6f4 = false;
        ejVar.fVMzMhyS.b2ZJblxo = false;
        ejVar.Ey6iv0m0(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((ni) this.Ey6iv0m0.MdtA4re8).KlHjfFWx.P7K7Inc8.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        lDXGDhIF();
        OnDfzHZD().wxUZMvaN();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.n7, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent KlHjfFWx;
        if (!sjUBp5pO(i, menuItem)) {
            SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) OnDfzHZD();
            sJ7tYVsF.DK9slbsy();
            zh0 zh0Var = sJ7tYVsF.lDXGDhIF;
            if (menuItem.getItemId() != 16908332 || zh0Var == null || (((dd0) zh0Var.VgvYg0wo).NCTxEWno & 4) == 0 || (KlHjfFWx = le0.KlHjfFWx(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(KlHjfFWx)) {
                navigateUpTo(KlHjfFWx);
                return true;
            }
            qb0 qb0Var = new qb0(this);
            Intent KlHjfFWx2 = le0.KlHjfFWx(this);
            if (KlHjfFWx2 == null) {
                KlHjfFWx2 = le0.KlHjfFWx(this);
            }
            if (KlHjfFWx2 != null) {
                ComponentName component = KlHjfFWx2.getComponent();
                if (component == null) {
                    component = KlHjfFWx2.resolveActivity(qb0Var.MdtA4re8.getPackageManager());
                }
                qb0Var.qoPGr6Ce(component);
                qb0Var.NCTxEWno.add(KlHjfFWx2);
            }
            qb0Var.NCTxEWno();
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.FySoLYna = false;
        ((ni) this.Ey6iv0m0.MdtA4re8).KlHjfFWx.Ey6iv0m0(5);
        this.I5GHvsYW.wxUZMvaN(oo.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((SJ7tYVsF) OnDfzHZD()).RXQxj5Oe();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        OxcuoDLp();
        SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) OnDfzHZD();
        sJ7tYVsF.DK9slbsy();
        zh0 zh0Var = sJ7tYVsF.lDXGDhIF;
        if (zh0Var != null) {
            zh0Var.Ey6iv0m0 = true;
        }
    }

    @Override // defpackage.n7, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.Ey6iv0m0.i7xS8jrb();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onResume() {
        tg0 tg0Var = this.Ey6iv0m0;
        tg0Var.i7xS8jrb();
        super.onResume();
        this.FySoLYna = true;
        ((ni) tg0Var.MdtA4re8).KlHjfFWx.gjV1z5T1(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        amk52bBQ();
        ((SJ7tYVsF) OnDfzHZD()).ow5vqvCr(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.Ey6iv0m0.i7xS8jrb();
    }

    @Override // android.app.Activity
    public final void onStop() {
        KlHjfFWx();
        SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) OnDfzHZD();
        sJ7tYVsF.DK9slbsy();
        zh0 zh0Var = sJ7tYVsF.lDXGDhIF;
        if (zh0Var != null) {
            zh0Var.Ey6iv0m0 = false;
            yg0 yg0Var = zh0Var.KlHjfFWx;
            if (yg0Var != null) {
                yg0Var.qoPGr6Ce();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        OnDfzHZD().k3x7lurq(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((SJ7tYVsF) OnDfzHZD()).DK9slbsy();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        ow5vqvCr();
        OnDfzHZD().Qr9iLBAD(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((SJ7tYVsF) OnDfzHZD()).bvfAo0eO = i;
    }

    public final boolean sjUBp5pO(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((ni) this.Ey6iv0m0.MdtA4re8).KlHjfFWx.jb9XjC4I();
        }
        return false;
    }

    @Override // defpackage.n7, android.app.Activity
    public void setContentView(View view) {
        ow5vqvCr();
        OnDfzHZD().jb9XjC4I(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        ow5vqvCr();
        OnDfzHZD().eVhOlqcC(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((ni) this.Ey6iv0m0.MdtA4re8).KlHjfFWx.P7K7Inc8.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
