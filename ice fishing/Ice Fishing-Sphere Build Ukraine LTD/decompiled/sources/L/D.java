package L;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f471a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f472b;

    /* renamed from: c, reason: collision with root package name */
    public int f473c;

    /* renamed from: d, reason: collision with root package name */
    public int f474d;

    /* renamed from: e, reason: collision with root package name */
    public C f475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f476f;

    public D(RecyclerView recyclerView) {
        this.f476f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f471a = arrayList;
        this.f472b = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f473c = 2;
        this.f474d = 2;
    }

    public final void a(int i2) {
        RecyclerView recyclerView = this.f476f;
        if (i2 < 0 || i2 >= recyclerView.f1589b0.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i2 + "(" + i2 + "). Item count:" + recyclerView.f1589b0.a() + recyclerView.h());
        }
        G g2 = recyclerView.f1589b0;
        boolean z2 = g2.f480c;
        ArrayList arrayList = this.f471a;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f1598h.f524f;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = this.f472b;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new ClassCastException();
        }
        int v2 = recyclerView.f1596g.v(i2, 0);
        if (v2 >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + v2 + ").state:" + g2.a() + recyclerView.h());
    }

    public final void b() {
        x xVar = this.f476f.f1605m;
        this.f474d = this.f473c;
        ArrayList arrayList = this.f472b;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f474d) {
            return;
        }
        E0.h.h(arrayList.get(size));
        int[] iArr = RecyclerView.f1563l0;
        throw null;
    }
}
