package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class f9 extends ContextWrapper {
    public static Configuration P7K7Inc8;
    public LayoutInflater MdtA4re8;
    public Resources.Theme NCTxEWno;
    public Resources VgvYg0wo;
    public int qoPGr6Ce;
    public Configuration wxUZMvaN;

    public f9(Context context, int i) {
        super(context);
        this.qoPGr6Ce = i;
    }

    public final void NCTxEWno() {
        if (this.NCTxEWno == null) {
            this.NCTxEWno = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.NCTxEWno.setTo(theme);
            }
        }
        this.NCTxEWno.applyStyle(this.qoPGr6Ce, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r0.equals(r1) != false) goto L16;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        Resources resources = this.VgvYg0wo;
        if (resources != null) {
            return resources;
        }
        Configuration configuration = this.wxUZMvaN;
        if (configuration != null) {
            if (Build.VERSION.SDK_INT >= 26) {
                Configuration configuration2 = P7K7Inc8;
                if (configuration2 == null) {
                    configuration2 = new Configuration();
                    configuration2.fontScale = 0.0f;
                    P7K7Inc8 = configuration2;
                }
            }
            Resources resources2 = createConfigurationContext(this.wxUZMvaN).getResources();
            this.VgvYg0wo = resources2;
            return resources2;
        }
        Resources resources3 = super.getResources();
        this.VgvYg0wo = resources3;
        return resources3;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        LayoutInflater layoutInflater = this.MdtA4re8;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater cloneInContext = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        this.MdtA4re8 = cloneInContext;
        return cloneInContext;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.NCTxEWno;
        if (theme != null) {
            return theme;
        }
        if (this.qoPGr6Ce == 0) {
            this.qoPGr6Ce = R.style.Theme_AppCompat_Light;
        }
        NCTxEWno();
        return this.NCTxEWno;
    }

    public final void qoPGr6Ce(Configuration configuration) {
        if (this.VgvYg0wo != null) {
            m1.Ey6iv0m0("getResources() or getAssets() has already been called");
        } else if (this.wxUZMvaN == null) {
            this.wxUZMvaN = new Configuration(configuration);
        } else {
            m1.Ey6iv0m0("Override configuration has already been set");
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.qoPGr6Ce != i) {
            this.qoPGr6Ce = i;
            NCTxEWno();
        }
    }
}
