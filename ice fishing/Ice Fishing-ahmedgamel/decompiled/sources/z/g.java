package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final float f42064a;

    /* renamed from: b, reason: collision with root package name */
    public final float f42065b;

    /* renamed from: c, reason: collision with root package name */
    public final float f42066c;

    /* renamed from: d, reason: collision with root package name */
    public final float f42067d;

    /* renamed from: e, reason: collision with root package name */
    public final int f42068e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f42064a = Float.NaN;
        this.f42065b = Float.NaN;
        this.f42066c = Float.NaN;
        this.f42067d = Float.NaN;
        this.f42068e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f42191j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f42068e);
                this.f42068e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f42067d = obtainStyledAttributes.getDimension(index, this.f42067d);
            } else if (index == 2) {
                this.f42065b = obtainStyledAttributes.getDimension(index, this.f42065b);
            } else if (index == 3) {
                this.f42066c = obtainStyledAttributes.getDimension(index, this.f42066c);
            } else if (index == 4) {
                this.f42064a = obtainStyledAttributes.getDimension(index, this.f42064a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
