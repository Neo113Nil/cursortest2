package kotlin.text;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import com.catchingfish.fishcatcherpro.R;

/* loaded from: classes.dex */
public final class CatchingFishGraphQLManifest extends ContextWrapper {
    public static Configuration CatchingFishWorkManager;
    public LayoutInflater CatchingFishCoroutine;
    public Resources CatchingFishDaggerWebsocket;
    public int CatchingFishParcelableFAB;
    public Configuration CatchingFishReduxKtor;
    public Resources.Theme CatchingFishSnackbar;

    public CatchingFishGraphQLManifest(Context context, int i) {
        super(context);
        this.CatchingFishParcelableFAB = i;
    }

    public final void CatchingFishParcelableFAB(Configuration configuration) {
        if (this.CatchingFishDaggerWebsocket != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.CatchingFishReduxKtor != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.CatchingFishReduxKtor = new Configuration(configuration);
    }

    public final void CatchingFishSnackbar() {
        if (this.CatchingFishSnackbar == null) {
            this.CatchingFishSnackbar = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.CatchingFishSnackbar.setTo(theme);
            }
        }
        this.CatchingFishSnackbar.applyStyle(this.CatchingFishParcelableFAB, true);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r0.equals(kotlin.text.CatchingFishGraphQLManifest.CatchingFishWorkManager) != false) goto L15;
     */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Resources getResources() {
        if (this.CatchingFishDaggerWebsocket == null) {
            Configuration configuration = this.CatchingFishReduxKtor;
            if (configuration != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (CatchingFishWorkManager == null) {
                        Configuration configuration2 = new Configuration();
                        configuration2.fontScale = 0.0f;
                        CatchingFishWorkManager = configuration2;
                    }
                }
                this.CatchingFishDaggerWebsocket = createConfigurationContext(this.CatchingFishReduxKtor).getResources();
            }
            this.CatchingFishDaggerWebsocket = super.getResources();
        }
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.CatchingFishCoroutine == null) {
            this.CatchingFishCoroutine = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.CatchingFishCoroutine;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.CatchingFishSnackbar;
        if (theme != null) {
            return theme;
        }
        if (this.CatchingFishParcelableFAB == 0) {
            this.CatchingFishParcelableFAB = R.style.Theme_AppCompat_Light;
        }
        CatchingFishSnackbar();
        return this.CatchingFishSnackbar;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        if (this.CatchingFishParcelableFAB != i) {
            this.CatchingFishParcelableFAB = i;
            CatchingFishSnackbar();
        }
    }
}
