package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0219bf extends Aj {
    public final ArrayList b;

    public C0219bf(S5 s5) {
        super(s5);
        String b = s5.a().b();
        b = b == null ? "empty" : b;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{b}, 1));
        LinkedHashMap a = Jb.k().o().a(b);
        ArrayList arrayList = new ArrayList(a.size());
        for (Map.Entry entry : a.entrySet()) {
            arrayList.add(new Pair(entry.getValue(), new Oe(s5, (String) entry.getKey())));
        }
        this.b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.Aj
    public final boolean a(K6 k6) {
        ArrayList arrayList;
        if (this.a.t.c() && ((arrayList = this.b) == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) pair.getFirst();
                Oe oe = (Oe) pair.getSecond();
                if (moduleServiceEventHandler.handle(new Re(oe.b, oe.a, new Qe(oe.e, oe.d, oe.c, k6)), k6)) {
                    return true;
                }
            }
        }
        return false;
    }
}
