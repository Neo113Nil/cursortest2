package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class n7t implements Iterator, j9f {
    public final /* synthetic */ int a;
    public Iterator b;
    public final Object c;

    public n7t(o7t o7tVar) {
        this.a = 0;
        this.c = o7tVar;
        this.b = o7tVar.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return ((o7t) this.c).b.invoke(this.b.next());
            default:
                Object next = this.b.next();
                ArrayList arrayList = (ArrayList) this.c;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                c7 c7Var = viewGroup != null ? new c7(8, viewGroup) : null;
                if (c7Var == null || !c7Var.hasNext()) {
                    while (!this.b.hasNext() && !arrayList.isEmpty()) {
                        this.b = (Iterator) CollectionsKt.Y(arrayList);
                        z75.A(arrayList);
                    }
                } else {
                    arrayList.add(this.b);
                    this.b = c7Var;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n7t(c7 c7Var) {
        this.a = 1;
        this.c = new ArrayList();
        this.b = c7Var;
    }
}
