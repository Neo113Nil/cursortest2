package L3;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.IceFishing.LiveIceFishing.C5248R;
import k.C4627d;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f1785a = {R.attr.theme, C5248R.attr.theme};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f1786b = {C5248R.attr.materialThemeOverlay};

    public static Context a(Context context, AttributeSet attributeSet, int i, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1786b, i, i4);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z6 = (context instanceof C4627d) && ((C4627d) context).f38500a == resourceId;
        if (resourceId == 0 || z6) {
            return context;
        }
        C4627d c4627d = new C4627d(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f1785a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c4627d.getTheme().applyStyle(resourceId2, true);
        }
        return c4627d;
    }
}
