package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* loaded from: classes3.dex */
public final class StateSet$Variant {
    public final int mConstraintID;
    public final float mMaxHeight;
    public final float mMaxWidth;
    public final float mMinHeight;
    public final float mMinWidth;

    public StateSet$Variant(Context context, XmlResourceParser xmlResourceParser) {
        this.mMinWidth = Float.NaN;
        this.mMinHeight = Float.NaN;
        this.mMaxWidth = Float.NaN;
        this.mMaxHeight = Float.NaN;
        this.mConstraintID = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.Variant);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                this.mConstraintID = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.mMaxHeight = obtainStyledAttributes.getDimension(index, this.mMaxHeight);
            } else if (index == 2) {
                this.mMinHeight = obtainStyledAttributes.getDimension(index, this.mMinHeight);
            } else if (index == 3) {
                this.mMaxWidth = obtainStyledAttributes.getDimension(index, this.mMaxWidth);
            } else if (index == 4) {
                this.mMinWidth = obtainStyledAttributes.getDimension(index, this.mMinWidth);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
