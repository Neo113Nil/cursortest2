package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class Me extends AbstractC0697uj {
    public final ArrayList b;

    public Me(@NotNull P5 p5) {
        super(p5);
        String b = p5.b().b();
        b = b == null ? "empty" : b;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{b}, 1));
        LinkedHashMap a = C0747wb.k().o().a(b);
        ArrayList arrayList = new ArrayList(a.size());
        for (Map.Entry entry : a.entrySet()) {
            arrayList.add(new Pair(entry.getValue(), new C0835ze(p5, (String) entry.getKey())));
        }
        this.b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0697uj
    public final boolean a(@NotNull H6 h6) {
        ArrayList arrayList;
        if (this.a.t.c() && ((arrayList = this.b) == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) pair.a;
                C0835ze c0835ze = (C0835ze) pair.b;
                if (moduleServiceEventHandler.handle(new Ce(c0835ze.b, c0835ze.a, new Be(c0835ze.d, c0835ze.c, h6)), h6)) {
                    return true;
                }
            }
        }
        return false;
    }
}
