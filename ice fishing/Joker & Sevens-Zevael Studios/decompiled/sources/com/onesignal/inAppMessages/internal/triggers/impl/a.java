package com.onesignal.inAppMessages.internal.triggers.impl;

import ac.o;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import com.onesignal.inAppMessages.internal.m;
import java.util.ArrayList;
import java.util.List;
import java.util.TimerTask;
import pc.f;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements com.onesignal.common.events.d {
    public static final C0036a Companion = new C0036a(null);
    private static final long DEFAULT_LAST_IN_APP_TIME_AGO = 999999;
    private static final double REQUIRED_ACCURACY = 0.3d;
    private final eb.b _session;
    private final s9.a _state;
    private final e9.a _time;
    private final com.onesignal.common.events.b events;
    private final List<String> scheduledMessages;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.inAppMessages.internal.triggers.impl.a$a, reason: collision with other inner class name */
    public static final class C0036a {
        public /* synthetic */ C0036a(f fVar) {
            this();
        }

        private C0036a() {
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends k implements oc.c {
        final /* synthetic */ String $triggerId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.$triggerId = str;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((t9.b) obj);
            return o.f277a;
        }

        public final void invoke(t9.b bVar) {
            j.e(bVar, "it");
            bVar.onTriggerCompleted(this.$triggerId);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class c extends TimerTask {
        final /* synthetic */ String $triggerId;

        /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
        /* renamed from: com.onesignal.inAppMessages.internal.triggers.impl.a$c$a, reason: collision with other inner class name */
        public static final class C0037a extends k implements oc.c {
            final /* synthetic */ String $triggerId;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0037a(String str) {
                super(1);
                this.$triggerId = str;
            }

            @Override // oc.c
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((t9.b) obj);
                return o.f277a;
            }

            public final void invoke(t9.b bVar) {
                j.e(bVar, "it");
                bVar.onTriggerConditionChanged(this.$triggerId);
            }
        }

        public c(String str) {
            this.$triggerId = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a.this.scheduledMessages.remove(this.$triggerId);
            a.this.getEvents().fire(new C0037a(this.$triggerId));
        }
    }

    public a(s9.a aVar, eb.b bVar, e9.a aVar2) {
        j.e(aVar, "_state");
        j.e(bVar, "_session");
        j.e(aVar2, "_time");
        this._state = aVar;
        this._session = bVar;
        this._time = aVar2;
        this.events = new com.onesignal.common.events.b();
        this.scheduledMessages = new ArrayList();
    }

    private final boolean evaluateTimeIntervalWithOperator(double d10, double d11, m.b bVar) {
        switch (com.onesignal.inAppMessages.internal.triggers.impl.b.$EnumSwitchMapping$1[bVar.ordinal()]) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return d11 < d10;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return d11 <= d10 || roughlyEqual(d10, d11);
            case 3:
                return d11 >= d10;
            case 4:
                return d11 >= d10 || roughlyEqual(d10, d11);
            case 5:
                return roughlyEqual(d10, d11);
            case 6:
                return !roughlyEqual(d10, d11);
            default:
                com.onesignal.debug.internal.logging.b.error$default("Attempted to apply an invalid operator on a time-based in-app-message trigger: " + bVar, null, 2, null);
                return false;
        }
    }

    private final boolean roughlyEqual(double d10, double d11) {
        return Math.abs(d10 - d11) < REQUIRED_ACCURACY;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0089 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #0 {all -> 0x0057, blocks: (B:8:0x0014, B:12:0x001e, B:17:0x0067, B:19:0x0089, B:26:0x009c, B:30:0x00a6, B:33:0x0034, B:37:0x003e, B:41:0x004a, B:42:0x0065, B:43:0x0059), top: B:7:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dynamicTriggerShouldFire(m mVar) {
        long currentTimeMillis;
        long startTime;
        long j3;
        long j6;
        long doubleValue;
        j.e(mVar, "trigger");
        if (mVar.getValue() == null) {
            return false;
        }
        synchronized (this.scheduledMessages) {
            try {
                if (!(mVar.getValue() instanceof Number)) {
                    return false;
                }
                int i10 = com.onesignal.inAppMessages.internal.triggers.impl.b.$EnumSwitchMapping$0[mVar.getKind().ordinal()];
                if (i10 == 1) {
                    currentTimeMillis = this._time.getCurrentTimeMillis();
                    startTime = this._session.getStartTime();
                } else {
                    if (i10 != 2) {
                        j6 = 0;
                        String triggerId = mVar.getTriggerId();
                        Number number = (Number) mVar.getValue();
                        j.b(number);
                        doubleValue = (long) (number.doubleValue() * 1000);
                        if (evaluateTimeIntervalWithOperator(doubleValue, j6, mVar.getOperatorType())) {
                            this.events.fire(new b(triggerId));
                            return true;
                        }
                        long j10 = doubleValue - j6;
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
                        j3 = DEFAULT_LAST_IN_APP_TIME_AGO;
                        j6 = j3;
                        String triggerId2 = mVar.getTriggerId();
                        Number number2 = (Number) mVar.getValue();
                        j.b(number2);
                        doubleValue = (long) (number2.doubleValue() * 1000);
                        if (evaluateTimeIntervalWithOperator(doubleValue, j6, mVar.getOperatorType())) {
                        }
                    } else {
                        currentTimeMillis = this._time.getCurrentTimeMillis();
                        startTime = lastTimeInAppDismissed.longValue();
                    }
                }
                j3 = currentTimeMillis - startTime;
                j6 = j3;
                String triggerId22 = mVar.getTriggerId();
                Number number22 = (Number) mVar.getValue();
                j.b(number22);
                doubleValue = (long) (number22.doubleValue() * 1000);
                if (evaluateTimeIntervalWithOperator(doubleValue, j6, mVar.getOperatorType())) {
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
    public void subscribe(t9.b bVar) {
        j.e(bVar, "handler");
        this.events.subscribe(bVar);
    }

    @Override // com.onesignal.common.events.d
    public void unsubscribe(t9.b bVar) {
        j.e(bVar, "handler");
        this.events.unsubscribe(bVar);
    }
}
