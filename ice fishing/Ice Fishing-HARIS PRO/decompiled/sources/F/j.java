package F;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f210a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f211b;

    /* renamed from: c, reason: collision with root package name */
    public final int f212c;

    public j(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f210a = colorStateList;
        this.f211b = configuration;
        this.f212c = theme == null ? 0 : theme.hashCode();
    }
}
