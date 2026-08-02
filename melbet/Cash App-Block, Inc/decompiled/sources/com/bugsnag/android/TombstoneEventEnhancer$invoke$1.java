package com.bugsnag.android;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class TombstoneEventEnhancer$invoke$1 extends Lambda implements Function1 {
    public final /* synthetic */ Event $event;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TombstoneEventEnhancer$invoke$1(TraceEventEnhancer traceEventEnhancer, Event event) {
        super(1);
        this.$r8$classId = 0;
        this.$event = event;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = null;
        Event event = this.$event;
        switch (i) {
            case 0:
                Thread thread = (Thread) obj;
                Iterator it = event.impl.threads.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (Intrinsics.areEqual(((Thread) next).impl.id, thread.impl.id)) {
                            obj2 = next;
                        }
                    }
                }
                Thread thread2 = (Thread) obj2;
                if (thread2 != null) {
                    ThreadInternal threadInternal = thread2.impl;
                    String str = thread.impl.name;
                    if (str != null) {
                        threadInternal.name = str;
                    } else {
                        thread2.logger.e("Invalid null value supplied to thread.name, ignoring");
                    }
                    threadInternal.stacktrace.clear();
                    threadInternal.stacktrace.addAll(thread.impl.stacktrace);
                } else {
                    event.impl.threads.add(thread);
                }
                break;
            case 1:
                event.addMetadata("Log Messages", "Log Messages", (String) obj);
                break;
            default:
                String str2 = (String) obj;
                Iterator it2 = event.impl.errors.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (Intrinsics.areEqual(((Error) next2).impl.errorClass, "SIGABRT")) {
                            obj2 = next2;
                        }
                    }
                }
                Error error = (Error) obj2;
                if (error == null) {
                    error = (Error) CollectionsKt.firstOrNull((List) event.impl.errors);
                }
                if (error != null) {
                    error.impl.errorMessage = str2;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TombstoneEventEnhancer$invoke$1(Event event, int i) {
        super(1);
        this.$r8$classId = i;
        this.$event = event;
    }
}
