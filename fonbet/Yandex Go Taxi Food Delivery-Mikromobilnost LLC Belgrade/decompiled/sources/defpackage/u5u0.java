package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class u5u0 {
    public final int a;
    public final ArrayList b = new ArrayList();
    public final int c;

    public u5u0(Context context, XmlResourceParser xmlResourceParser) {
        this.c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), z3i0.State);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == z3i0.State_android_id) {
                this.a = obtainStyledAttributes.getResourceId(index, this.a);
            } else if (index == z3i0.State_constraints) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.c);
                this.c = resourceId;
                context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
