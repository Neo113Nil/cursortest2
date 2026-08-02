package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i7f extends x6f {
    public String i;
    public boolean j;

    @Override // defpackage.x6f
    public final w4f K() {
        return new q5f((LinkedHashMap) this.h);
    }

    @Override // defpackage.x6f
    public final void N(w4f w4fVar, String str) {
        str.getClass();
        w4fVar.getClass();
        if (!this.j) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.h;
            String str2 = this.i;
            if (str2 == null) {
                Intrinsics.j("tag");
                throw null;
            }
            linkedHashMap.put(str2, w4fVar);
            this.j = true;
            return;
        }
        if (w4fVar instanceof v6f) {
            this.i = ((v6f) w4fVar).a();
            this.j = false;
        } else {
            if (w4fVar instanceof q5f) {
                throw ghh.h(s5f.b);
            }
            if (w4fVar instanceof c4f) {
                throw ghh.h(f4f.b);
            }
            b6e.s();
        }
    }
}
