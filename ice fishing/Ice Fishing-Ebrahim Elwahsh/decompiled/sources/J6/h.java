package J6;

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
    public int f1417a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1418b;

    /* renamed from: c, reason: collision with root package name */
    public int f1419c;

    public h() {
        this.f1417a = -1;
        this.f1418b = new ArrayList();
        this.f1419c = 1;
    }

    public byte[] a() {
        int i = this.f1417a;
        ArrayList arrayList = this.f1418b;
        if (i < arrayList.size()) {
            int i4 = this.f1417a;
            this.f1417a = i4 + 1;
            return (byte[]) arrayList.get(i4);
        }
        byte[] bArr = new byte[this.f1419c];
        arrayList.add(bArr);
        this.f1417a++;
        return bArr;
    }

    public void b(int i) {
        if (i == -1 || i == 0 || i == 1) {
            this.f1417a = i;
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 57);
        sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
        sb.append(i);
        u2.i.f(sb.toString());
    }

    public h(int i) {
        this.f1418b = new ArrayList();
        this.f1419c = i;
    }

    public h(Context context, XmlResourceParser xmlResourceParser) {
        this.f1418b = new ArrayList();
        this.f1419c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), z.r.f42101h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1417a = obtainStyledAttributes.getResourceId(index, this.f1417a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f1419c);
                this.f1419c = resourceId;
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
