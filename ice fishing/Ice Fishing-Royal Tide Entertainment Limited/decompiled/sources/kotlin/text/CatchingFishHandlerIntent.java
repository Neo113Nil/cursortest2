package kotlin.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class CatchingFishHandlerIntent {
    public static final RectF CatchingFishEspressoTesting = new RectF();
    public static final ConcurrentHashMap CatchingFishOkHttp = new ConcurrentHashMap();
    public final CatchingFishServiceCameraX CatchingFishCloudMessaging;
    public final Context CatchingFishFragmentHandler;
    public final TextView CatchingFishLayout;
    public TextPaint CatchingFishViewModelFAB;
    public int CatchingFishParcelableFAB = 0;
    public boolean CatchingFishSnackbar = false;
    public float CatchingFishCoroutine = -1.0f;
    public float CatchingFishReduxKtor = -1.0f;
    public float CatchingFishDaggerWebsocket = -1.0f;
    public int[] CatchingFishWorkManager = new int[0];
    public boolean CatchingFishViewModelScope = false;

    public CatchingFishHandlerIntent(TextView textView) {
        this.CatchingFishLayout = textView;
        this.CatchingFishFragmentHandler = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.CatchingFishCloudMessaging = new CatchingFishViewGoogleMaps();
        } else {
            this.CatchingFishCloudMessaging = new CatchingFishServiceCameraX();
        }
    }

    public static Method CatchingFishReduxKtor(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = CatchingFishOkHttp;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int[] CatchingFishSnackbar(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final int CatchingFishCoroutine(RectF rectF) {
        CharSequence transformation;
        int length = this.CatchingFishWorkManager.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i2 = 0;
        int i3 = 1;
        while (i3 <= i) {
            int i4 = (i3 + i) / 2;
            int i5 = this.CatchingFishWorkManager[i4];
            TextView textView = this.CatchingFishLayout;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.CatchingFishViewModelFAB;
            if (textPaint == null) {
                this.CatchingFishViewModelFAB = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.CatchingFishViewModelFAB.set(textView.getPaint());
            this.CatchingFishViewModelFAB.setTextSize(i5);
            Object obj = Layout.Alignment.ALIGN_NORMAL;
            try {
                obj = CatchingFishReduxKtor("getLayoutAlignment").invoke(textView, null);
            } catch (Exception unused) {
            }
            StaticLayout CatchingFishParcelableFAB = CatchingFishJUnitSpannable.CatchingFishParcelableFAB(charSequence, (Layout.Alignment) obj, Math.round(rectF.right), maxLines, this.CatchingFishLayout, this.CatchingFishViewModelFAB, this.CatchingFishCloudMessaging);
            if ((maxLines == -1 || (CatchingFishParcelableFAB.getLineCount() <= maxLines && CatchingFishParcelableFAB.getLineEnd(CatchingFishParcelableFAB.getLineCount() - 1) == charSequence.length())) && CatchingFishParcelableFAB.getHeight() <= rectF.bottom) {
                int i6 = i4 + 1;
                i2 = i3;
                i3 = i6;
            } else {
                i2 = i4 - 1;
                i = i2;
            }
        }
        return this.CatchingFishWorkManager[i2];
    }

    public final boolean CatchingFishDaggerWebsocket() {
        return CatchingFishLayout() && this.CatchingFishParcelableFAB != 0;
    }

    public final void CatchingFishFragmentHandler(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        }
        this.CatchingFishParcelableFAB = 1;
        this.CatchingFishReduxKtor = f;
        this.CatchingFishDaggerWebsocket = f2;
        this.CatchingFishCoroutine = f3;
        this.CatchingFishViewModelScope = false;
    }

    public final boolean CatchingFishLayout() {
        return !(this.CatchingFishLayout instanceof CatchingFishAdMobGlide);
    }

    public final void CatchingFishParcelableFAB() {
        if (CatchingFishDaggerWebsocket()) {
            if (this.CatchingFishSnackbar) {
                if (this.CatchingFishLayout.getMeasuredHeight() <= 0 || this.CatchingFishLayout.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.CatchingFishCloudMessaging.CatchingFishSnackbar(this.CatchingFishLayout) ? 1048576 : (this.CatchingFishLayout.getMeasuredWidth() - this.CatchingFishLayout.getTotalPaddingLeft()) - this.CatchingFishLayout.getTotalPaddingRight();
                int height = (this.CatchingFishLayout.getHeight() - this.CatchingFishLayout.getCompoundPaddingBottom()) - this.CatchingFishLayout.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = CatchingFishEspressoTesting;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float CatchingFishCoroutine = CatchingFishCoroutine(rectF);
                        if (CatchingFishCoroutine != this.CatchingFishLayout.getTextSize()) {
                            CatchingFishWorkManager(0, CatchingFishCoroutine);
                        }
                    } finally {
                    }
                }
            }
            this.CatchingFishSnackbar = true;
        }
    }

    public final boolean CatchingFishViewModelFAB() {
        boolean z = this.CatchingFishWorkManager.length > 0;
        this.CatchingFishViewModelScope = z;
        if (z) {
            this.CatchingFishParcelableFAB = 1;
            this.CatchingFishReduxKtor = r0[0];
            this.CatchingFishDaggerWebsocket = r0[r1 - 1];
            this.CatchingFishCoroutine = -1.0f;
        }
        return z;
    }

    public final boolean CatchingFishViewModelScope() {
        if (CatchingFishLayout() && this.CatchingFishParcelableFAB == 1) {
            if (!this.CatchingFishViewModelScope || this.CatchingFishWorkManager.length == 0) {
                int floor = ((int) Math.floor((this.CatchingFishDaggerWebsocket - this.CatchingFishReduxKtor) / this.CatchingFishCoroutine)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.CatchingFishCoroutine) + this.CatchingFishReduxKtor);
                }
                this.CatchingFishWorkManager = CatchingFishSnackbar(iArr);
            }
            this.CatchingFishSnackbar = true;
        } else {
            this.CatchingFishSnackbar = false;
        }
        return this.CatchingFishSnackbar;
    }

    public final void CatchingFishWorkManager(int i, float f) {
        Context context = this.CatchingFishFragmentHandler;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.CatchingFishLayout;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.CatchingFishSnackbar = false;
                try {
                    Method CatchingFishReduxKtor = CatchingFishReduxKtor("nullLayouts");
                    if (CatchingFishReduxKtor != null) {
                        CatchingFishReduxKtor.invoke(textView, null);
                    }
                } catch (Exception unused) {
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }
}
