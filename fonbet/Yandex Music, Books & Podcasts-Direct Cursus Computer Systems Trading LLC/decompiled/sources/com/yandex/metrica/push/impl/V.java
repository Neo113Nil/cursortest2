package com.yandex.metrica.push.impl;

import com.yandex.metrica.push.core.model.PushMessage;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public class V extends Y {
    private final List<Y> a = new CopyOnWriteArrayList();

    @Override // com.yandex.metrica.push.impl.Y
    public Z a(PushMessage pushMessage) {
        Iterator<Y> it = this.a.iterator();
        while (it.hasNext()) {
            try {
                Z a = it.next().a(pushMessage);
                if (!a.a.isShow()) {
                    return a;
                }
                pushMessage = a.b;
            } catch (X e) {
                return Z.a(pushMessage, e.a(), e.b());
            }
        }
        return Z.a(pushMessage);
    }

    public void a(Y y) {
        this.a.add(y);
    }
}
