package L;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f549a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f550b;

    /* renamed from: c, reason: collision with root package name */
    public int f551c;

    /* renamed from: d, reason: collision with root package name */
    public int f552d;

    /* renamed from: e, reason: collision with root package name */
    public C f553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f554f;

    public D(RecyclerView recyclerView) {
        this.f554f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f549a = arrayList;
        this.f550b = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f551c = 2;
        this.f552d = 2;
    }

    public final void a(int i2) {
        RecyclerView recyclerView = this.f554f;
        if (i2 < 0 || i2 >= recyclerView.f1582c0.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i2 + "(" + i2 + "). Item count:" + recyclerView.f1582c0.a() + recyclerView.h());
        }
        G g2 = recyclerView.f1582c0;
        boolean z2 = g2.f558c;
        ArrayList arrayList = this.f549a;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f1591i.f602g;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = this.f550b;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new ClassCastException();
        }
        int v2 = recyclerView.f1589h.v(i2, 0);
        if (v2 >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + v2 + ").state:" + g2.a() + recyclerView.h());
    }

    public final void b() {
        x xVar = this.f554f.f1598n;
        this.f552d = this.f551c;
        ArrayList arrayList = this.f550b;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f552d) {
            return;
        }
        E0.h.i(arrayList.get(size));
        int[] iArr = RecyclerView.f1555m0;
        throw null;
    }
}
