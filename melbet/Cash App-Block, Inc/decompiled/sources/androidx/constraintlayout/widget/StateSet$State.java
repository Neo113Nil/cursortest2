package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class StateSet$State {
    public final int mConstraintID;
    public final int mId;
    public final ArrayList mVariants = new ArrayList();

    public StateSet$State(Context context, XmlResourceParser xmlResourceParser) {
        this.mConstraintID = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R$styleable.State);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.mId = obtainStyledAttributes.getResourceId(index, this.mId);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.mConstraintID);
                this.mConstraintID = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
