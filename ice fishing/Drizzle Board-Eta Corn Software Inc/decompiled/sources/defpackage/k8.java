package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class k8 {
    public final int MdtA4re8;
    public final ArrayList NCTxEWno = new ArrayList();
    public final int qoPGr6Ce;

    public k8(Context context, XmlResourceParser xmlResourceParser) {
        this.MdtA4re8 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r00.Qr9iLBAD);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.qoPGr6Ce = obtainStyledAttributes.getResourceId(index, this.qoPGr6Ce);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.MdtA4re8);
                this.MdtA4re8 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new s8().qoPGr6Ce(context, resourceId);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
