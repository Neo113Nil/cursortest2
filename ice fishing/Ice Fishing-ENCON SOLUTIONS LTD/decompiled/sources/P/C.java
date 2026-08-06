package P;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1253a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1254b;

    /* renamed from: c, reason: collision with root package name */
    public int f1255c;

    /* renamed from: d, reason: collision with root package name */
    public int f1256d;

    /* renamed from: e, reason: collision with root package name */
    public B f1257e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1258f;

    public C(RecyclerView recyclerView) {
        this.f1258f = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f1253a = arrayList;
        this.f1254b = new ArrayList();
        Collections.unmodifiableList(arrayList);
        this.f1255c = 2;
        this.f1256d = 2;
    }

    public final void a(int i2) {
        RecyclerView recyclerView = this.f1258f;
        if (i2 < 0 || i2 >= recyclerView.f2554c0.a()) {
            throw new IndexOutOfBoundsException("Invalid item position " + i2 + "(" + i2 + "). Item count:" + recyclerView.f2554c0.a() + recyclerView.h());
        }
        F f2 = recyclerView.f2554c0;
        boolean z2 = f2.f1262c;
        ArrayList arrayList = this.f1253a;
        if (arrayList.size() > 0) {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
        ArrayList arrayList2 = (ArrayList) recyclerView.f2555d.f723d;
        if (arrayList2.size() > 0) {
            RecyclerView.j((View) arrayList2.get(0));
            throw null;
        }
        ArrayList arrayList3 = this.f1254b;
        if (arrayList3.size() > 0) {
            arrayList3.get(0).getClass();
            throw new ClassCastException();
        }
        int y2 = recyclerView.f2553c.y(i2, 0);
        if (y2 >= 0) {
            throw null;
        }
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i2 + "(offset:" + y2 + ").state:" + f2.a() + recyclerView.h());
    }

    public final void b() {
        w wVar = this.f1258f.f2563i;
        this.f1256d = this.f1255c;
        ArrayList arrayList = this.f1254b;
        int size = arrayList.size() - 1;
        if (size < 0 || arrayList.size() <= this.f1256d) {
            return;
        }
        C1.a.n(arrayList.get(size));
        int[] iArr = RecyclerView.f2528m0;
        throw null;
    }
}
