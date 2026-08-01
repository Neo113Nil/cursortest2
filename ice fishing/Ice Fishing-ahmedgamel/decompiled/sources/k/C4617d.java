package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.icefishing.icefishingbigwin.C5275R;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4617d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f38487f;

    /* renamed from: a, reason: collision with root package name */
    public int f38488a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f38489b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f38490c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f38491d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f38492e;

    public C4617d(Context context, int i) {
        super(context);
        this.f38488a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f38492e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f38491d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f38491d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f38489b == null) {
            this.f38489b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f38489b.setTo(theme);
            }
        }
        this.f38489b.applyStyle(this.f38488a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(k.C4617d.f38487f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f38492e == null) {
            Configuration configuration = this.f38491d;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f38487f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f38487f = configuration2;
                    }
                }
                this.f38492e = createConfigurationContext(this.f38491d).getResources();
            }
            this.f38492e = super.getResources();
        }
        return this.f38492e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f38490c == null) {
            this.f38490c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f38490c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f38489b;
        if (theme != null) {
            return theme;
        }
        if (this.f38488a == 0) {
            this.f38488a = C5275R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f38489b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f38488a != i) {
            this.f38488a = i;
            b();
        }
    }
}
