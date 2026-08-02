package com.plaid.internal;

import com.plaid.internal.C0095a6;
import com.plaid.link.event.LinkEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.DelayQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class A2 {
    public final DelayQueue<DelayedC0332y0> a;
    public final List<LinkEvent> b;

    public A2(Object obj) {
        DelayQueue<DelayedC0332y0> delayQueue = new DelayQueue<>();
        List<LinkEvent> synchronizedList = Collections.synchronizedList(new ArrayList());
        synchronizedList.getClass();
        synchronizedList.getClass();
        this.a = delayQueue;
        this.b = synchronizedList;
    }

    public final void a(Function1<? super LinkEvent, Unit> function1) {
        function1.getClass();
        b(function1);
        Object[] array2 = this.a.toArray();
        this.a.clear();
        array2.getClass();
        if (array2.length > 1) {
            Arrays.sort(array2);
        }
        C0095a6.a.a(C0095a6.a, "draining: " + array2.length + " events");
        for (Object obj : array2) {
            obj.getClass();
            function1.invoke(((DelayedC0332y0) obj).a());
        }
    }

    public final void b(Function1<? super LinkEvent, Unit> function1) {
        synchronized (this.b) {
            try {
                List<LinkEvent> list = this.b;
                C0095a6.a.a(C0095a6.a, "flushing " + list.size() + " events");
                for (LinkEvent linkEvent : list) {
                    if (function1 != null) {
                        function1.invoke(linkEvent);
                    } else {
                        a(linkEvent, -1);
                    }
                }
                list.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public A2() {
        this(null);
    }

    public final void a(LinkEvent linkEvent, int i) {
        linkEvent.getClass();
        C0095a6.a.a(C0095a6.a, "putting: " + linkEvent.getEventName() + " for " + i);
        this.a.put((DelayQueue<DelayedC0332y0>) new DelayedC0332y0(linkEvent, i));
    }

    public final void a(LinkEvent linkEvent) {
        linkEvent.getClass();
        synchronized (this.b) {
            C0095a6.a.a(C0095a6.a, "enqueueing: " + linkEvent.getEventName(), new Object[]{""});
            this.b.add(linkEvent);
        }
    }
}
