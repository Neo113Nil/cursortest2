package b6;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;
import p6.i;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class f implements y5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1036a;

    @Override // zb.a
    public final Object get() {
        switch (this.f1036a) {
            case 0:
                i iVar = new i();
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(t5.d.f6527g, new c6.c(30000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(t5.d.f6529i, new c6.c(1000L, 86400000L, set));
                if (set == null) {
                    throw new NullPointerException("Null flags");
                }
                Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(c6.d.f1242h)));
                if (unmodifiableSet == null) {
                    throw new NullPointerException("Null flags");
                }
                hashMap.put(t5.d.f6528h, new c6.c(86400000L, 86400000L, unmodifiableSet));
                if (hashMap.keySet().size() < t5.d.values().length) {
                    throw new IllegalStateException("Not all priorities have been configured");
                }
                new HashMap();
                return new c6.b(iVar, hashMap);
            default:
                return new a5.b(3, Executors.newSingleThreadExecutor());
        }
    }
}
