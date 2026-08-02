package app.cash.redwood.yoga.internal.event;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public final class Event {
    public static final LinkedHashMap listeners = new LinkedHashMap();

    public static void publish(CallableEvent callableEvent) {
        List list = (List) listeners.get(Reflection.factory.getOrCreateKotlinClass(callableEvent.getClass()));
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(callableEvent);
        }
    }
}
