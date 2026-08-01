package com.onesignal.inAppMessages.internal.triggers.impl;

import I7.l;
import com.onesignal.inAppMessages.internal.m;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import u7.v;

/* loaded from: classes2.dex */
public final class a implements com.onesignal.common.events.d {
    public static final C0214a Companion = new C0214a(null);
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999;
    private static final double REQUIRED_ACCURACY = 0.3d;
    private final O5.b _session;
    private final Y4.a _state;
    private final K4.a _time;
    private final com.onesignal.common.events.b events;
    private final List<String> scheduledMessages;

    /* renamed from: com.onesignal.inAppMessages.internal.triggers.impl.a$a, reason: collision with other inner class name */
    public static final class C0214a {
        public /* synthetic */ C0214a(kotlin.jvm.internal.e eVar) {
            this();
        }

        private C0214a() {
        }
    }

    public static final class b extends i implements l {
        final /* synthetic */ String $triggerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.$triggerId = str;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Z4.b) obj);
            return v.f41353a;
        }

        public final void invoke(Z4.b it) {
            h.e(it, "it");
            it.onTriggerCompleted(this.$triggerId);
        }
    }

    public static final class c extends TimerTask {
        final /* synthetic */ String $triggerId;

        /* renamed from: com.onesignal.inAppMessages.internal.triggers.impl.a$c$a, reason: collision with other inner class name */
        public static final class C0215a extends i implements l {
            final /* synthetic */ String $triggerId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0215a(String str) {
                super(1);
                this.$triggerId = str;
            }

            @Override // I7.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Z4.b) obj);
                return v.f41353a;
            }

            public final void invoke(Z4.b it) {
                h.e(it, "it");
                it.onTriggerConditionChanged(this.$triggerId);
            }
        }

        public c(String str) {
            this.$triggerId = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a.this.scheduledMessages.remove(this.$triggerId);
            a.this.getEvents().fire(new C0215a(this.$triggerId));
        }
    }

    public a(Y4.a _state, O5.b _session, K4.a _time) {
        h.e(_state, "_state");
        h.e(_session, "_session");
        h.e(_time, "_time");
        this._state = _state;
        this._session = _session;
        this._time = _time;
        this.events = new com.onesignal.common.events.b();
        this.scheduledMessages = new ArrayList();
    }

    private final boolean evaluateTimeIntervalWithOperator(double d2, double d9, m.b bVar) {
        switch (com.onesignal.inAppMessages.internal.triggers.impl.b.$EnumSwitchMapping$1[bVar.ordinal()]) {
            case 1:
                return d9 < d2;
            case 2:
                return d9 <= d2 || roughlyEqual(d2, d9);
            case 3:
                return d9 >= d2;
            case 4:
                return d9 >= d2 || roughlyEqual(d2, d9);
            case 5:
                return roughlyEqual(d2, d9);
            case 6:
                return !roughlyEqual(d2, d9);
            default:
                com.onesignal.debug.internal.logging.b.error$default("Attempted to apply an invalid operator on a time-based in-app-message trigger: " + bVar, null, 2, null);
                return false;
        }
    }

    private final boolean roughlyEqual(double d2, double d9) {
        return Math.abs(d2 - d9) < REQUIRED_ACCURACY;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:8:0x0014, B:12:0x001e, B:17:0x0067, B:19:0x0089, B:26:0x009c, B:30:0x00a6, B:33:0x0034, B:37:0x003e, B:41:0x004a, B:42:0x0065, B:43:0x0059), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dynamicTriggerShouldFire(m trigger) {
        long currentTimeMillis;
        long startTime;
        long j6;
        long j9;
        long doubleValue;
        h.e(trigger, "trigger");
        if (trigger.getValue() == null) {
            return false;
        }
        synchronized (this.scheduledMessages) {
            try {
                if (!(trigger.getValue() instanceof Number)) {
                    return false;
                }
                int i = com.onesignal.inAppMessages.internal.triggers.impl.b.$EnumSwitchMapping$0[trigger.getKind().ordinal()];
                if (i == 1) {
                    currentTimeMillis = this._time.getCurrentTimeMillis();
                    startTime = this._session.getStartTime();
                } else {
                    if (i != 2) {
                        j9 = 0;
                        String triggerId = trigger.getTriggerId();
                        Number number = (Number) trigger.getValue();
                        h.b(number);
                        doubleValue = (long) (number.doubleValue() * 1000);
                        if (evaluateTimeIntervalWithOperator(doubleValue, j9, trigger.getOperatorType())) {
                            this.events.fire(new b(triggerId));
                            return true;
                        }
                        long j10 = doubleValue - j9;
                        if (j10 <= 0) {
                            return false;
                        }
                        if (this.scheduledMessages.contains(triggerId)) {
                            return false;
                        }
                        com.onesignal.inAppMessages.internal.triggers.impl.c.INSTANCE.scheduleTrigger(new c(triggerId), triggerId, j10);
                        this.scheduledMessages.add(triggerId);
                        return false;
                    }
                    if (this._state.getInAppMessageIdShowing() != null) {
                        return false;
                    }
                    Long lastTimeInAppDismissed = this._state.getLastTimeInAppDismissed();
                    if (lastTimeInAppDismissed == null) {
                        j6 = DEFAULT_LAST_IN_APP_TIME_AGO;
                        j9 = j6;
                        String triggerId2 = trigger.getTriggerId();
                        Number number2 = (Number) trigger.getValue();
                        h.b(number2);
                        doubleValue = (long) (number2.doubleValue() * 1000);
                        if (evaluateTimeIntervalWithOperator(doubleValue, j9, trigger.getOperatorType())) {
                        }
                    } else {
                        currentTimeMillis = this._time.getCurrentTimeMillis();
                        startTime = lastTimeInAppDismissed.longValue();
                    }
                }
                j6 = currentTimeMillis - startTime;
                j9 = j6;
                String triggerId22 = trigger.getTriggerId();
                Number number22 = (Number) trigger.getValue();
                h.b(number22);
                doubleValue = (long) (number22.doubleValue() * 1000);
                if (evaluateTimeIntervalWithOperator(doubleValue, j9, trigger.getOperatorType())) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.onesignal.common.events.b getEvents() {
        return this.events;
    }

    @Override // com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.onesignal.common.events.d
    public void subscribe(Z4.b handler) {
        h.e(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(Z4.b handler) {
        h.e(handler, "handler");
        this.events.unsubscribe(handler);
    }
}
