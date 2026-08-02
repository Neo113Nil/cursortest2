package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes10.dex */
public final class v8n implements u8n {
    public final DynamicRangeProfiles a;

    public v8n(Object obj) {
        this.a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            l.longValue();
            q8n q8nVar = (q8n) r8n.a.get(l);
            if (q8nVar == null) {
                sgb1.g(5, "DynamicRangesCompatApi33Impl");
            }
            if (q8nVar != null) {
                hashSet.add(q8nVar);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    @Override // defpackage.u8n
    public final Set a(q8n q8nVar) {
        Long a = r8n.a(q8nVar, this.a);
        d6z.m("DynamicRange is not supported: " + q8nVar, a != null);
        return d(this.a.getProfileCaptureRequestConstraints(a.longValue()));
    }

    @Override // defpackage.u8n
    public final Set b() {
        return d(this.a.getSupportedProfiles());
    }

    @Override // defpackage.u8n
    public final DynamicRangeProfiles c() {
        return this.a;
    }
}
