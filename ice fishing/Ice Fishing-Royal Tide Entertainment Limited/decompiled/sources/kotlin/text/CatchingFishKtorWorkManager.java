package kotlin.text;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class CatchingFishKtorWorkManager {
    public static final ThreadLocal CatchingFishParcelableFAB = new ThreadLocal();
    public static final int[] CatchingFishSnackbar = {-16842910};
    public static final int[] CatchingFishCoroutine = {R.attr.state_focused};
    public static final int[] CatchingFishReduxKtor = {R.attr.state_pressed};
    public static final int[] CatchingFishDaggerWebsocket = {R.attr.state_checked};
    public static final int[] CatchingFishWorkManager = new int[0];
    public static final int[] CatchingFishViewModelScope = new int[1];

    public static int CatchingFishCoroutine(Context context, int i) {
        int[] iArr = CatchingFishViewModelScope;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static void CatchingFishParcelableFAB(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(CatchingFishWidgetGlide.CatchingFishFragmentHandler);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                view.getClass().toString();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList CatchingFishReduxKtor(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = CatchingFishViewModelScope;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = CatchingFishGsonCardView.CatchingFishSpannableWidget(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int CatchingFishSnackbar(Context context, int i) {
        ColorStateList CatchingFishReduxKtor2 = CatchingFishReduxKtor(context, i);
        if (CatchingFishReduxKtor2 != null && CatchingFishReduxKtor2.isStateful()) {
            return CatchingFishReduxKtor2.getColorForState(CatchingFishSnackbar, CatchingFishReduxKtor2.getDefaultColor());
        }
        ThreadLocal threadLocal = CatchingFishParcelableFAB;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        return CatchingFishLiveDataAdMob.CatchingFishReduxKtor(CatchingFishCoroutine(context, i), Math.round(Color.alpha(r4) * f));
    }
}
