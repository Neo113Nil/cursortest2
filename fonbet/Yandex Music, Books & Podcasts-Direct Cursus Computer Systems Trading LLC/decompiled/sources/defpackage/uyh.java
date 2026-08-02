package defpackage;

import java.util.HashSet;

/* loaded from: classes.dex */
public final class uyh implements tc6 {
    public final int a;
    public final boolean b;

    public uyh(String str, int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.tc6
    public final lb6 a(czg czgVar, ayg aygVar, ds2 ds2Var) {
        if (((HashSet) czgVar.l.a).contains(fzg.a)) {
            return new vyh(this);
        }
        psg.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "EXCLUDE_INTERSECTIONS" : "INTERSECT" : "SUBTRACT" : "ADD" : "MERGE");
        sb.append('}');
        return sb.toString();
    }
}
