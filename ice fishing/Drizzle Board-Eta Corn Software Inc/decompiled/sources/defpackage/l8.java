package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class l8 {
    public final float MdtA4re8;
    public final float NCTxEWno;
    public final int VgvYg0wo;
    public final float qoPGr6Ce;
    public final float wxUZMvaN;

    public l8(Context context, XmlResourceParser xmlResourceParser) {
        this.qoPGr6Ce = Float.NaN;
        this.NCTxEWno = Float.NaN;
        this.MdtA4re8 = Float.NaN;
        this.wxUZMvaN = Float.NaN;
        this.VgvYg0wo = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r00.eVhOlqcC);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.VgvYg0wo);
                this.VgvYg0wo = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new s8().qoPGr6Ce(context, resourceId);
                }
            } else if (index == 1) {
                this.wxUZMvaN = obtainStyledAttributes.getDimension(index, this.wxUZMvaN);
            } else if (index == 2) {
                this.NCTxEWno = obtainStyledAttributes.getDimension(index, this.NCTxEWno);
            } else if (index == 3) {
                this.MdtA4re8 = obtainStyledAttributes.getDimension(index, this.MdtA4re8);
            } else if (index == 4) {
                this.qoPGr6Ce = obtainStyledAttributes.getDimension(index, this.qoPGr6Ce);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
