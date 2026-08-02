package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;

/* loaded from: classes9.dex */
public final class urd implements jwi0 {
    public final ArrayList a;

    public urd(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.dtq0
    public final KSerializer select(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            KSerializer select = ((jwi0) it.next()).select(str);
            if (select != null) {
                return select;
            }
        }
        return null;
    }
}
