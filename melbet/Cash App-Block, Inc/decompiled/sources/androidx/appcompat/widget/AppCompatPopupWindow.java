package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.PopupWindow;
import androidx.appcompat.R$styleable;
import com.squareup.wire.GrpcMethod;

/* loaded from: classes3.dex */
public class AppCompatPopupWindow extends PopupWindow {
    public AppCompatPopupWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }

    public final void init(Context context, AttributeSet attributeSet, int i, int i2) {
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(i, i2, context, attributeSet, R$styleable.PopupWindow);
        TypedArray typedArray = (TypedArray) obtainStyledAttributes.requestAdapter;
        if (typedArray.hasValue(2)) {
            setOverlapAnchor(typedArray.getBoolean(2, false));
        }
        setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        obtainStyledAttributes.recycle();
    }
}
