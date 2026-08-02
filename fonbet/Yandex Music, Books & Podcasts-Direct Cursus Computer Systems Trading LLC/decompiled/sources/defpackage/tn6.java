package defpackage;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import ru.yandex.music.data.CoverInfo$CoverType;

/* loaded from: classes5.dex */
public final class tn6 implements Serializable {
    private static final long serialVersionUID = 4836348544143729173L;
    public CoverInfo$CoverType a = CoverInfo$CoverType.UNDEFINED;
    public final LinkedList b = new LinkedList();
    public boolean c = false;

    public final void a(List list) {
        LinkedList linkedList = this.b;
        if (linkedList.equals(list)) {
            return;
        }
        linkedList.clear();
        linkedList.addAll(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn6)) {
            return false;
        }
        tn6 tn6Var = (tn6) obj;
        return this.b.equals(tn6Var.b) && this.a == tn6Var.a;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CoverInfo{mType=" + this.a + ", mItems=" + this.b + '}';
    }
}
