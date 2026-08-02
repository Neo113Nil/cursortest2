package J3;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.icefishingapp.icefishing.C5275R;
import k.C4617d;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1469a = {R.attr.theme, C5275R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1470b = {C5275R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i6) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1470b, i, i6);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z3 = (context instanceof C4617d) && ((C4617d) context).f38488a == resourceId;
        if (resourceId == 0 || z3) {
            return context;
        }
        C4617d c4617d = new C4617d(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1469a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c4617d.getTheme().applyStyle(resourceId2, true);
        }
        return c4617d;
    }
}
