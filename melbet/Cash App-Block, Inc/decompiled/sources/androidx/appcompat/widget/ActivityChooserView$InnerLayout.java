package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.squareup.wire.GrpcMethod;

/* loaded from: classes3.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {
    public static final int[] TINT_ATTRS = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        GrpcMethod obtainStyledAttributes = GrpcMethod.obtainStyledAttributes(context, attributeSet, TINT_ATTRS);
        setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
        obtainStyledAttributes.recycle();
    }
}
