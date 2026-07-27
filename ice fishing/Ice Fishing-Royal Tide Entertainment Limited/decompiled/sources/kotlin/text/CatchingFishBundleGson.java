package kotlin.text;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class CatchingFishBundleGson {
    public final int CatchingFishCoroutine;
    public final ColorStateList CatchingFishParcelableFAB;
    public final Configuration CatchingFishSnackbar;

    public CatchingFishBundleGson(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.CatchingFishParcelableFAB = colorStateList;
        this.CatchingFishSnackbar = configuration;
        this.CatchingFishCoroutine = theme == null ? 0 : theme.hashCode();
    }
}
