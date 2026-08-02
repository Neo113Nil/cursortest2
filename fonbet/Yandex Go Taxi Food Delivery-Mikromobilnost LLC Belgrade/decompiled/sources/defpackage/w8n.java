package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes10.dex */
public final class w8n implements u8n {
    public static final gym a = new gym(new w8n());
    public static final Set b = Collections.singleton(q8n.d);

    @Override // defpackage.u8n
    public final Set a(q8n q8nVar) {
        d6z.m("DynamicRange is not supported: " + q8nVar, q8n.d.equals(q8nVar));
        return b;
    }

    @Override // defpackage.u8n
    public final Set b() {
        return b;
    }

    @Override // defpackage.u8n
    public final DynamicRangeProfiles c() {
        return null;
    }
}
