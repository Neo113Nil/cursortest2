package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class sob implements p3c {
    public final /* synthetic */ int a;

    public /* synthetic */ sob(int i) {
        this.a = i;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                return new lno(0, Executors.newSingleThreadExecutor());
            default:
                vpl vplVar = new vpl();
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(lsm.a, new wd2(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(lsm.c, new wd2(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(lto.b)));
                            if (unmodifiableSet != null) {
                                hashMap.put(lsm.b, new wd2(86400000L, 86400000L, unmodifiableSet));
                                if (hashMap.keySet().size() >= lsm.values().length) {
                                    new HashMap();
                                    return new vd2(vplVar, hashMap);
                                }
                                xq0.q("Not all priorities have been configured");
                            } else {
                                jj4.j("Null flags");
                            }
                        } else {
                            jj4.j("Null flags");
                        }
                    } else {
                        jj4.j("Null flags");
                    }
                } else {
                    jj4.j("Null flags");
                }
                return null;
        }
    }
}
