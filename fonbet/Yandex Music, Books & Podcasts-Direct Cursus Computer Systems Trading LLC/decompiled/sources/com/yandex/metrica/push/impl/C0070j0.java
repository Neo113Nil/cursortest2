package com.yandex.metrica.push.impl;

import com.yandex.metrica.push.PushFilter;
import com.yandex.metrica.push.PushFilteredCallback;
import com.yandex.metrica.push.core.model.PushMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.yandex.metrica.push.impl.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0070j0 implements PushFilter {
    private final List<PushFilter> a = new CopyOnWriteArrayList();
    private final List<PushFilteredCallback> b = new ArrayList();

    public void a(PushFilter pushFilter) {
        this.a.add(pushFilter);
    }

    @Override // com.yandex.metrica.push.PushFilter
    public PushFilter.FilterResult filter(PushMessage pushMessage) {
        Iterator<PushFilter> it = this.a.iterator();
        while (it.hasNext()) {
            PushFilter.FilterResult filter = it.next().filter(pushMessage);
            if (filter.filterResultCode == PushFilter.FilterResultCode.SILENCE) {
                Iterator<PushFilteredCallback> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    it2.next().onPushFiltered(pushMessage, filter);
                }
                return filter;
            }
        }
        PushFilter.FilterResult show = PushFilter.FilterResult.show();
        Iterator<PushFilteredCallback> it3 = this.b.iterator();
        while (it3.hasNext()) {
            it3.next().onPushFiltered(pushMessage, show);
        }
        return show;
    }

    public void a(PushFilteredCallback pushFilteredCallback) {
        this.b.add(pushFilteredCallback);
    }
}
