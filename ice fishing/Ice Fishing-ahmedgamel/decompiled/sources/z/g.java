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
    public final float f42093a;

    /* renamed from: b, reason: collision with root package name */
    public final float f42094b;

    /* renamed from: c, reason: collision with root package name */
    public final float f42095c;

    /* renamed from: d, reason: collision with root package name */
    public final float f42096d;

    /* renamed from: e, reason: collision with root package name */
    public final int f42097e;

    public g(Context context, XmlResourceParser xmlResourceParser) {
        this.f42093a = Float.NaN;
        this.f42094b = Float.NaN;
        this.f42095c = Float.NaN;
        this.f42096d = Float.NaN;
        this.f42097e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), r.f42220j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f42097e);
                this.f42097e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f42096d = obtainStyledAttributes.getDimension(index, this.f42096d);
            } else if (index == 2) {
                this.f42094b = obtainStyledAttributes.getDimension(index, this.f42094b);
            } else if (index == 3) {
                this.f42095c = obtainStyledAttributes.getDimension(index, this.f42095c);
            } else if (index == 4) {
                this.f42093a = obtainStyledAttributes.getDimension(index, this.f42093a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
