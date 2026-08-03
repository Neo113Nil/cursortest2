package o4;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f5219a;

    /* renamed from: b, reason: collision with root package name */
    public final x4.p f5220b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f5221c;

    public p(UUID uuid, x4.p pVar, LinkedHashSet linkedHashSet) {
        pc.j.e(uuid, "id");
        pc.j.e(pVar, "workSpec");
        pc.j.e(linkedHashSet, "tags");
        this.f5219a = uuid;
        this.f5220b = pVar;
        this.f5221c = linkedHashSet;
    }
}
