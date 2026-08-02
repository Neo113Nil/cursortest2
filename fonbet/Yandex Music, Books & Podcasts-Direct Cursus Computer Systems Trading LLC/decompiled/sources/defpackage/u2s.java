package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class u2s implements fu4 {
    public final u6k a;
    public final List b;

    public u2s(u6k u6kVar, List list) {
        this.a = u6kVar;
        this.b = list;
    }

    @Override // defpackage.fu4
    public final boolean a() {
        fvf fvfVar = (fvf) CollectionsKt.S(this.b, this.a.h());
        if (fvfVar != null) {
            return fvfVar.h() == 0 && fvfVar.i() == 0;
        }
        return true;
    }
}
