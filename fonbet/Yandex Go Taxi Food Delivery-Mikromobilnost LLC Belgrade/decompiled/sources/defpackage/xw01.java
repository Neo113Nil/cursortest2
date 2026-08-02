package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.a;

/* loaded from: classes9.dex */
public final class xw01 implements Iterator, xfx {
    public final /* synthetic */ int a;
    public Iterator b;
    public final Object c;

    public xw01(yw01 yw01Var) {
        this.a = 0;
        this.c = yw01Var;
        this.b = yw01Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((yw01) obj).b.invoke(this.b.next());
            default:
                Object next = this.b.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                h8 h8Var = viewGroup != null ? new h8(3, viewGroup) : null;
                if (h8Var == null || !h8Var.hasNext()) {
                    while (!this.b.hasNext() && !arrayList.isEmpty()) {
                        this.b = (Iterator) a.Z(arrayList);
                        ycc.z(arrayList);
                    }
                } else {
                    arrayList.add(this.b);
                    this.b = h8Var;
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

    public xw01(h8 h8Var) {
        this.a = 1;
        this.c = new ArrayList();
        this.b = h8Var;
    }
}
