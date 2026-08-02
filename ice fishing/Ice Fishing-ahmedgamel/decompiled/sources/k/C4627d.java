package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.IceFishing.LiveIceFishing.C5248R;

/* renamed from: k.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4627d extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f38499f;

    /* renamed from: a, reason: collision with root package name */
    public int f38500a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f38501b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f38502c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f38503d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f38504e;

    public C4627d(Context context, int i) {
        super(context);
        this.f38500a = i;
    }

    public final void a(Configuration configuration) {
        if (this.f38504e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f38503d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f38503d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f38501b == null) {
            this.f38501b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f38501b.setTo(theme);
            }
        }
        this.f38501b.applyStyle(this.f38500a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(k.C4627d.f38499f) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.f38504e == null) {
            Configuration configuration = this.f38503d;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (f38499f == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        f38499f = configuration2;
                    }
                }
                this.f38504e = createConfigurationContext(this.f38503d).getResources();
            }
            this.f38504e = super.getResources();
        }
        return this.f38504e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f38502c == null) {
            this.f38502c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f38502c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f38501b;
        if (theme != null) {
            return theme;
        }
        if (this.f38500a == 0) {
            this.f38500a = C5248R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f38501b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f38500a != i) {
            this.f38500a = i;
            b();
        }
    }
}
