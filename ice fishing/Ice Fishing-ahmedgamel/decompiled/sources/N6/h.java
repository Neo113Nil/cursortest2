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
    public int f1970a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1971b;

    /* renamed from: c, reason: collision with root package name */
    public int f1972c;

    public h() {
        this.f1970a = -1;
        this.f1971b = new ArrayList();
        this.f1972c = 1;
    }

    public byte[] a() {
        int i = this.f1970a;
        ArrayList arrayList = this.f1971b;
        if (i < arrayList.size()) {
            int i6 = this.f1970a;
            this.f1970a = i6 + 1;
            return (byte[]) arrayList.get(i6);
        }
        byte[] bArr = new byte[this.f1972c];
        arrayList.add(bArr);
        this.f1970a++;
        return bArr;
    }

    public void b(int i) {
        if (i == -1 || i == 0 || i == 1) {
            this.f1970a = i;
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 57);
        sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
        sb.append(i);
        v2.i.f(sb.toString());
    }

    public h(int i) {
        this.f1971b = new ArrayList();
        this.f1972c = i;
    }

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f1971b = new ArrayList();
        this.f1972c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), z.r.f42219h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1970a = obtainStyledAttributes.getResourceId(index, this.f1970a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f1972c);
                this.f1972c = resourceId;
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
