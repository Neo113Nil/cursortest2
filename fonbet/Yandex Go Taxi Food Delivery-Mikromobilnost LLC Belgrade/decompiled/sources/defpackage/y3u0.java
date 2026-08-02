package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class y3u0 {
    public final r0 a = bvf0.c(Boolean.FALSE);
    public final HashSet b = new HashSet();

    public final boolean a() {
        HashSet hashSet = this.b;
        if (hashSet != null && hashSet.isEmpty()) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((Boolean) ((sls) it.next()).invoke()).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}
