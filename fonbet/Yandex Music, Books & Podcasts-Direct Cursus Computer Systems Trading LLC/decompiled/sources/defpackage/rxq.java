package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class rxq implements n2i {
    public final ArrayList a;

    public rxq(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((qxq) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((qxq) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((qxq) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        vq1.v(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rxq.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((rxq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
