package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class tut {
    public static Drawable a(Context context, Resources resources, int i) {
        return resources.getDrawable(i, context.getTheme());
    }
}
