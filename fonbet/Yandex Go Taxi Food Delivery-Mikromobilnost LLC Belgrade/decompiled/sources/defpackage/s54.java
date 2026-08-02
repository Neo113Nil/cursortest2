package defpackage;

import defpackage.c3f;
import java.util.List;

/* loaded from: classes11.dex */
public final class s54 extends c3f.e.d.f.a {
    public List a;

    public final t54 a() {
        List list = this.a;
        if (list != null) {
            return new t54(list);
        }
        ny61.r("Missing required properties: rolloutAssignments");
        return null;
    }

    public final s54 b(List list) {
        if (list != null) {
            this.a = list;
            return this;
        }
        ny61.t("Null rolloutAssignments");
        return null;
    }
}
