package com.gamericefishpro.space.ie;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.qd.m;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.dc.d {
    public static final C0025a Companion = new C0025a(null);
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999;
    private static final double REQUIRED_ACCURACY = 0.3d;
    private final com.gamericefishpro.space.rg.b _session;
    private final com.gamericefishpro.space.ge.a _state;
    private final com.gamericefishpro.space.kd.a _time;
    private final com.gamericefishpro.space.dc.b events;
    private final List<String> scheduledMessages;

    /* JADX INFO: renamed from: com.gamericefishpro.space.ie.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0025a {
        public /* synthetic */ C0025a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0025a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends l implements Function1 {
        final /* synthetic */ String $triggerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.$triggerId = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.he.b) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.he.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onTriggerCompleted(this.$triggerId);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class c extends TimerTask {
        final /* synthetic */ String $triggerId;

        /* JADX INFO: renamed from: com.gamericefishpro.space.ie.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
        public static final class C0026a extends l implements Function1 {
            final /* synthetic */ String $triggerId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0026a(String str) {
                super(1);
                this.$triggerId = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((com.gamericefishpro.space.he.b) obj);
                return Unit.a;
            }

            public final void invoke(com.gamericefishpro.space.he.b it) {
                Intrinsics.checkNotNullParameter(it, "it");
                it.onTriggerConditionChanged(this.$triggerId);
            }
        }

        public c(String str) {
            this.$triggerId = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a.this.scheduledMessages.remove(this.$triggerId);
            a.this.getEvents().fire(new C0026a(this.$triggerId));
        }
    }

    public a(com.gamericefishpro.space.ge.a _state, com.gamericefishpro.space.rg.b _session, com.gamericefishpro.space.kd.a _time) {
        Intrinsics.checkNotNullParameter(_state, "_state");
        Intrinsics.checkNotNullParameter(_session, "_session");
        Intrinsics.checkNotNullParameter(_time, "_time");
        this._state = _state;
        this._session = _session;
        this._time = _time;
        this.events = new com.gamericefishpro.space.dc.b();
        this.scheduledMessages = new ArrayList();
    }

    private final boolean evaluateTimeIntervalWithOperator(double d, double d2, m.b bVar) {
        switch (com.gamericefishpro.space.ie.b.$EnumSwitchMapping$1[bVar.ordinal()]) {
            case 1:
                return d2 < d;
            case 2:
                return d2 <= d || roughlyEqual(d, d2);
            case 3:
                return d2 >= d;
            case 4:
                return d2 >= d || roughlyEqual(d, d2);
            case i.STRING_FIELD_NUMBER /* 5 */:
                return roughlyEqual(d, d2);
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return !roughlyEqual(d, d2);
            default:
                com.gamericefishpro.space.od.b.error$default("Attempted to apply an invalid operator on a time-based in-app-message trigger: " + bVar, null, 2, null);
                return false;
        }
    }

    private final boolean roughlyEqual(double d, double d2) {
        return Math.abs(d - d2) < REQUIRED_ACCURACY;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:7:0x0014, B:11:0x001e, B:29:0x0067, B:31:0x0089, B:38:0x009c, B:42:0x00a6, B:16:0x0034, B:20:0x003e, B:23:0x004a, B:28:0x0065, B:27:0x0059), top: B:47:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0095  */
    /* JADX WARN: Code duplicated, block: B:36:0x009a A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:38:0x009c A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:7:0x0014, B:11:0x001e, B:29:0x0067, B:31:0x0089, B:38:0x009c, B:42:0x00a6, B:16:0x0034, B:20:0x003e, B:23:0x004a, B:28:0x0065, B:27:0x0059), top: B:47:0x0014 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a4 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:42:0x00a6 A[Catch: all -> 0x0057, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:7:0x0014, B:11:0x001e, B:29:0x0067, B:31:0x0089, B:38:0x009c, B:42:0x00a6, B:16:0x0034, B:20:0x003e, B:23:0x004a, B:28:0x0065, B:27:0x0059), top: B:47:0x0014 }] */
    public final boolean dynamicTriggerShouldFire(m trigger) {
        long currentTimeMillis;
        long startTime;
        long j;
        long j2;
        String triggerId;
        long jDoubleValue;
        long j3;
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        if (trigger.getValue() == null) {
            return false;
        }
        synchronized (this.scheduledMessages) {
            try {
                if (!(trigger.getValue() instanceof Number)) {
                    return false;
                }
                int i = com.gamericefishpro.space.ie.b.$EnumSwitchMapping$0[trigger.getKind().ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        j2 = 0;
                    } else {
                        if (this._state.getInAppMessageIdShowing() != null) {
                            return false;
                        }
                        Long lastTimeInAppDismissed = this._state.getLastTimeInAppDismissed();
                        if (lastTimeInAppDismissed == null) {
                            j = DEFAULT_LAST_IN_APP_TIME_AGO;
                        } else {
                            currentTimeMillis = this._time.getCurrentTimeMillis();
                            startTime = lastTimeInAppDismissed.longValue();
                        }
                        j2 = j;
                    }
                    triggerId = trigger.getTriggerId();
                    Number number = (Number) trigger.getValue();
                    Intrinsics.b(number);
                    jDoubleValue = (long) (number.doubleValue() * ((double) 1000));
                    if (evaluateTimeIntervalWithOperator(jDoubleValue, j2, trigger.getOperatorType())) {
                        this.events.fire(new b(triggerId));
                        return true;
                    }
                    j3 = jDoubleValue - j2;
                    if (j3 <= 0) {
                        return false;
                    }
                    if (this.scheduledMessages.contains(triggerId)) {
                        return false;
                    }
                    com.gamericefishpro.space.ie.c.INSTANCE.scheduleTrigger(new c(triggerId), triggerId, j3);
                    this.scheduledMessages.add(triggerId);
                    return false;
                }
                currentTimeMillis = this._time.getCurrentTimeMillis();
                startTime = this._session.getStartTime();
                j = currentTimeMillis - startTime;
                j2 = j;
                triggerId = trigger.getTriggerId();
                Number number2 = (Number) trigger.getValue();
                Intrinsics.b(number2);
                jDoubleValue = (long) (number2.doubleValue() * ((double) 1000));
                if (evaluateTimeIntervalWithOperator(jDoubleValue, j2, trigger.getOperatorType())) {
                    this.events.fire(new b(triggerId));
                    return true;
                }
                j3 = jDoubleValue - j2;
                if (j3 <= 0) {
                    return false;
                }
                if (this.scheduledMessages.contains(triggerId)) {
                    return false;
                }
                com.gamericefishpro.space.ie.c.INSTANCE.scheduleTrigger(new c(triggerId), triggerId, j3);
                this.scheduledMessages.add(triggerId);
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.gamericefishpro.space.dc.b getEvents() {
        return this.events;
    }

    @Override // com.gamericefishpro.space.dc.d
    public boolean getHasSubscribers() {
        return this.events.getHasSubscribers();
    }

    @Override // com.gamericefishpro.space.dc.d
    public void subscribe(com.gamericefishpro.space.he.b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.subscribe(handler);
    }

    @Override // com.gamericefishpro.space.dc.d
    public void unsubscribe(com.gamericefishpro.space.he.b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.events.unsubscribe(handler);
    }
}
