package defpackage;

import java.util.Map;
import kotlin.Pair;
import kotlinx.serialization.json.b;

/* loaded from: classes13.dex */
public final class wex implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object l = xw91.A.l((b) entry.getValue());
        if (l == null) {
            return null;
        }
        return new Pair(entry.getKey(), l);
    }
}
