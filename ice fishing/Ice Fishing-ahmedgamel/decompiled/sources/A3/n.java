package A3;

import D.x;
import O.X;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m3.AbstractC4742a;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f178a = {C5248R.attr.colorPrimary};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f179b = {C5248R.attr.colorPrimaryVariant};

    /* renamed from: c, reason: collision with root package name */
    public static final o f180c = new o(0);

    public static void a(Context context, AttributeSet attributeSet, int i, int i4) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4742a.f39417B, i, i4);
        boolean z6 = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z6) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C5248R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                c(context, f179b, "Theme.MaterialComponents");
            }
        }
        c(context, f178a, "Theme.AppCompat");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if (r0.getResourceId(0, -1) != (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i4, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC4742a.f39417B, i, i4);
        boolean z6 = false;
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2.length != 0) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i, i4);
            for (int i6 : iArr2) {
                if (obtainStyledAttributes2.getResourceId(i6, -1) == -1) {
                    obtainStyledAttributes2.recycle();
                    break;
                }
            }
            obtainStyledAttributes2.recycle();
            z6 = true;
            obtainStyledAttributes.recycle();
            if (!z6) {
                throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
            }
        }
    }

    public static void c(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                throw new IllegalArgumentException(x.l("The style on this component requires your app theme to be ", str, " (or a descendant)."));
            }
        }
        obtainStyledAttributes.recycle();
    }

    public static ArrayList d(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < materialToolbar.getChildCount(); i++) {
            View childAt = materialToolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static boolean e(View view) {
        WeakHashMap weakHashMap = X.f2142a;
        return view.getLayoutDirection() == 1;
    }

    public static TypedArray f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i4, int... iArr2) {
        a(context, attributeSet, i, i4);
        b(context, attributeSet, iArr, i, i4, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i4);
    }

    public static PorterDuff.Mode g(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
