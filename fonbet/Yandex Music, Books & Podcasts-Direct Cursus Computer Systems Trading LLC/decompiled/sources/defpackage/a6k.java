package defpackage;

import java.lang.reflect.Array;
import java.util.Iterator;

/* loaded from: classes5.dex */
public final class a6k extends p1g {
    public final /* synthetic */ int a;
    public final /* synthetic */ p1g b;

    public /* synthetic */ a6k(int i, p1g p1gVar) {
        this.a = i;
        this.b = p1gVar;
    }

    @Override // defpackage.p1g
    public final void y(j0o j0oVar, Object obj) {
        switch (this.a) {
            case 0:
                Iterable iterable = (Iterable) obj;
                if (iterable != null) {
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        this.b.y(j0oVar, it.next());
                    }
                    break;
                }
                break;
            default:
                if (obj != null) {
                    int length = Array.getLength(obj);
                    for (int i = 0; i < length; i++) {
                        this.b.y(j0oVar, Array.get(obj, i));
                    }
                    break;
                }
                break;
        }
    }
}
