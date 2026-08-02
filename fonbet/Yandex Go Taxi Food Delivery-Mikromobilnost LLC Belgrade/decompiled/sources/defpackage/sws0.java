package defpackage;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class sws0 implements s820 {
    public final ArrayList a;

    public sws0(ArrayList arrayList) {
        this.a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((rws0) arrayList.get(0)).b;
            int i = 1;
            while (true) {
                if (i >= arrayList.size()) {
                    break;
                }
                if (((rws0) arrayList.get(i)).a < j) {
                    z = true;
                    break;
                } else {
                    j = ((rws0) arrayList.get(i)).b;
                    i++;
                }
            }
        }
        d6z.l(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sws0.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((sws0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.a;
    }
}
