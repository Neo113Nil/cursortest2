package g1;

import Z0.v;
import Z0.w;
import b1.InterfaceC0519c;
import h1.AbstractC4563a;
import java.util.HashSet;
import l1.AbstractC4668c;

/* loaded from: classes.dex */
public final class g implements b {

    /* renamed from: a, reason: collision with root package name */
    public final int f37611a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f37612b;

    public g(int i, String str, boolean z6) {
        this.f37611a = i;
        this.f37612b = z6;
    }

    @Override // g1.b
    public final InterfaceC0519c a(v vVar, Z0.i iVar, AbstractC4563a abstractC4563a) {
        if (((HashSet) vVar.f4022E.f38152u).contains(w.f4059n)) {
            return new b1.l(this);
        }
        AbstractC4668c.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.f37611a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE");
        sb.append('}');
        return sb.toString();
    }
}
