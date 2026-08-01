package X0;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import k.C0179c;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1394a = {R.attr.theme, com.lumenpath.harispro.hrnavigator.R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1395b = {com.lumenpath.harispro.hrnavigator.R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1395b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z2 = (context instanceof C0179c) && ((C0179c) context).f3312a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        C0179c c0179c = new C0179c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1394a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0179c.getTheme().applyStyle(resourceId2, true);
        }
        return c0179c;
    }
}
