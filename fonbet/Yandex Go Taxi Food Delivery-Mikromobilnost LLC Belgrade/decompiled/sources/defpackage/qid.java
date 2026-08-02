package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class qid implements lu {
    public final List a;

    public qid(List list) {
        this.a = list;
    }

    @Override // defpackage.lu
    public final KSerializer decoder(String str) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            KSerializer decoder = ((lu) it.next()).decoder(str);
            if (decoder != null) {
                return decoder;
            }
        }
        return null;
    }
}
