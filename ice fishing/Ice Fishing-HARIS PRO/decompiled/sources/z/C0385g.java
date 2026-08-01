package z;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: z.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0385g {

    /* renamed from: a, reason: collision with root package name */
    public final float f4855a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4856b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4857c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4858d;
    public final int e;

    public C0385g(Context context, XmlResourceParser xmlResourceParser) {
        this.f4855a = Float.NaN;
        this.f4856b = Float.NaN;
        this.f4857c = Float.NaN;
        this.f4858d = Float.NaN;
        this.e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC0396r.j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.e);
                this.e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0392n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f4858d = obtainStyledAttributes.getDimension(index, this.f4858d);
            } else if (index == 2) {
                this.f4856b = obtainStyledAttributes.getDimension(index, this.f4856b);
            } else if (index == 3) {
                this.f4857c = obtainStyledAttributes.getDimension(index, this.f4857c);
            } else if (index == 4) {
                this.f4855a = obtainStyledAttributes.getDimension(index, this.f4855a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
