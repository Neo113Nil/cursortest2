package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.icefishing.icefishingliveapp.C5284R;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4616d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f38607f;

    /* renamed from: a, reason: collision with root package name */
    public int f38608a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f38609b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f38610c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f38611d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f38612e;

    public C4616d(Context context, int i) {
        super(context);
        this.f38608a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f38612e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f38611d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f38611d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f38609b == null) {
            this.f38609b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f38609b.setTo(theme);
            }
        }
        this.f38609b.applyStyle(this.f38608a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(k.C4616d.f38607f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f38612e == null) {
            Configuration configuration = this.f38611d;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f38607f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f38607f = configuration2;
                    }
                }
                this.f38612e = createConfigurationContext(this.f38611d).getResources();
            }
            this.f38612e = super.getResources();
        }
        return this.f38612e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f38610c == null) {
            this.f38610c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f38610c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f38609b;
        if (theme != null) {
            return theme;
        }
        if (this.f38608a == 0) {
            this.f38608a = C5284R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f38609b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f38608a != i) {
            this.f38608a = i;
            b();
        }
    }
}
