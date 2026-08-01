package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import com.lumenpath.harispro.hrnavigator.R;

/* renamed from: k.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179c extends ContextWrapper {

    /* renamed from: f, reason: collision with root package name */
    public static Configuration f3311f;

    /* renamed from: a, reason: collision with root package name */
    public int f3312a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f3313b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f3314c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f3315d;
    public Resources e;

    public C0179c(Context context, int i) {
        super(context);
        this.f3312a = i;
    }

    public final void a(Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f3315d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f3315d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f3313b == null) {
            this.f3313b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f3313b.setTo(theme);
            }
        }
        this.f3313b.applyStyle(this.f3312a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        if (this.e == null) {
            Configuration configuration = this.f3315d;
            if (configuration != null) {
                if (f3311f == null) {
                    Configuration configuration2 = new Configuration();
                    configuration2.fontScale = RecyclerView.f2111C0;
                    f3311f = configuration2;
                }
                if (!configuration.equals(f3311f)) {
                    this.e = createConfigurationContext(this.f3315d).getResources();
                }
            }
            this.e = super.getResources();
        }
        return this.e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f3314c == null) {
            this.f3314c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f3314c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f3313b;
        if (theme != null) {
            return theme;
        }
        if (this.f3312a == 0) {
            this.f3312a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f3313b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.f3312a != i) {
            this.f3312a = i;
            b();
        }
    }
}
