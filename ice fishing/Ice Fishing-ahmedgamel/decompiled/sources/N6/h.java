package N6;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f2058a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2059b;

    /* renamed from: c, reason: collision with root package name */
    public int f2060c;

    public h() {
        this.f2058a = -1;
        this.f2059b = new ArrayList();
        this.f2060c = 1;
    }

    public byte[] a() {
        int i = this.f2058a;
        ArrayList arrayList = this.f2059b;
        if (i < arrayList.size()) {
            int i4 = this.f2058a;
            this.f2058a = i4 + 1;
            return (byte[]) arrayList.get(i4);
        }
        byte[] bArr = new byte[this.f2060c];
        arrayList.add(bArr);
        this.f2058a++;
        return bArr;
    }

    public void b(int i) {
        if (i == -1 || i == 0 || i == 1) {
            this.f2058a = i;
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 57);
        sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
        sb.append(i);
        x2.i.f(sb.toString());
    }

    public h(int i) {
        this.f2059b = new ArrayList();
        this.f2060c = i;
    }

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f2059b = new ArrayList();
        this.f2060c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), z.r.f42190h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f2058a = obtainStyledAttributes.getResourceId(index, this.f2058a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f2060c);
                this.f2060c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new z.n().b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
