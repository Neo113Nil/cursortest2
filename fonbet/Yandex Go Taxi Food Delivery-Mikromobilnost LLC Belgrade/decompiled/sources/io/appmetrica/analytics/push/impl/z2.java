package io.appmetrica.analytics.push.impl;

import io.appmetrica.analytics.push.model.PushMessage;
import io.appmetrica.analytics.push.settings.PushFilter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class z2 extends C2 {
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.push.impl.C2
    public final D2 a(PushMessage pushMessage) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            try {
                D2 a = ((C2) it.next()).a(pushMessage);
                if (!a.a.isShow()) {
                    return a;
                }
                pushMessage = a.b;
            } catch (B2 e) {
                return C2.a(pushMessage, e.a, e.b);
            }
        }
        return new D2(pushMessage, PushFilter.FilterResult.show());
    }
}
