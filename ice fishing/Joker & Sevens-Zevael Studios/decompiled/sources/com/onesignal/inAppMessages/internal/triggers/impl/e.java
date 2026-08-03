package com.onesignal.inAppMessages.internal.triggers.impl;

import ac.o;
import com.onesignal.common.modeling.i;
import com.onesignal.core.activities.PermissionsActivity;
import com.onesignal.inAppMessages.internal.display.impl.a;
import com.onesignal.inAppMessages.internal.m;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e implements t9.a, com.onesignal.common.modeling.d {
    private com.onesignal.inAppMessages.internal.triggers.impl.a _dynamicTriggerController;
    private final ConcurrentHashMap<String, Object> triggers;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements oc.c {
        final /* synthetic */ t9.c $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t9.c cVar) {
            super(1);
            this.$model = cVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((t9.b) obj);
            return o.f277a;
        }

        public final void invoke(t9.b bVar) {
            j.e(bVar, "it");
            bVar.onTriggerChanged(this.$model.getKey());
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends k implements oc.c {
        final /* synthetic */ t9.c $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(t9.c cVar) {
            super(1);
            this.$model = cVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((t9.b) obj);
            return o.f277a;
        }

        public final void invoke(t9.b bVar) {
            j.e(bVar, "it");
            bVar.onTriggerChanged(this.$model.getKey());
        }
    }

    public e(t9.d dVar, com.onesignal.inAppMessages.internal.triggers.impl.a aVar) {
        j.e(dVar, "triggerModelStore");
        j.e(aVar, "_dynamicTriggerController");
        this._dynamicTriggerController = aVar;
        this.triggers = new ConcurrentHashMap<>();
        dVar.subscribe((com.onesignal.common.modeling.d) this);
    }

    private final void addTriggers(String str, Object obj) {
        synchronized (this.triggers) {
            this.triggers.put(str, obj);
        }
    }

    private final boolean evaluateAndTriggers(List<m> list) {
        Iterator<m> it = list.iterator();
        while (it.hasNext()) {
            if (!evaluateTrigger(it.next())) {
                return false;
            }
        }
        return true;
    }

    private final boolean evaluateTrigger(m mVar) {
        if (mVar.getKind() == m.a.UNKNOWN) {
            return false;
        }
        if (mVar.getKind() != m.a.CUSTOM) {
            return this._dynamicTriggerController.dynamicTriggerShouldFire(mVar);
        }
        m.b operatorType = mVar.getOperatorType();
        Object obj = this.triggers.get(mVar.getProperty());
        if (obj == null) {
            if (operatorType == m.b.NOT_EXISTS) {
                return true;
            }
            return operatorType == m.b.NOT_EQUAL_TO && mVar.getValue() != null;
        }
        if (operatorType == m.b.EXISTS) {
            return true;
        }
        if (operatorType == m.b.NOT_EXISTS) {
            return false;
        }
        if (operatorType == m.b.CONTAINS) {
            return (obj instanceof Collection) && ((Collection) obj).contains(mVar.getValue());
        }
        if ((obj instanceof String) && (mVar.getValue() instanceof String)) {
            String str = (String) mVar.getValue();
            j.b(str);
            if (triggerMatchesStringValue(str, (String) obj, operatorType)) {
                return true;
            }
        }
        if ((mVar.getValue() instanceof Number) && (obj instanceof Number)) {
            Number number = (Number) mVar.getValue();
            j.b(number);
            if (triggerMatchesNumericValue(number, (Number) obj, operatorType)) {
                return true;
            }
        }
        return triggerMatchesFlex(mVar.getValue(), obj, operatorType);
    }

    private final void removeTriggersForKeys(String str) {
        synchronized (this.triggers) {
            this.triggers.remove(str);
        }
    }

    private final boolean triggerMatchesFlex(Object obj, Object obj2, m.b bVar) {
        if (obj == null) {
            return false;
        }
        if (!bVar.checksEquality()) {
            if ((obj2 instanceof String) && (obj instanceof Number)) {
                return triggerMatchesNumericValueFlex((Number) obj, (String) obj2, bVar);
            }
            return false;
        }
        String obj3 = obj.toString();
        String obj4 = obj2.toString();
        if (obj2 instanceof Number) {
            obj4 = new DecimalFormat("0.#").format(obj2);
            j.d(obj4, "format.format(deviceValue)");
        }
        return triggerMatchesStringValue(obj3, obj4, bVar);
    }

    private final boolean triggerMatchesNumericValue(Number number, Number number2, m.b bVar) {
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        switch (d.$EnumSwitchMapping$0[bVar.ordinal()]) {
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                return doubleValue2 == doubleValue;
            case PermissionsActivity.ONESIGNAL_PERMISSION_REQUEST_CODE /* 2 */:
                return doubleValue2 != doubleValue;
            case 3:
            case 4:
            case 5:
                com.onesignal.debug.internal.logging.b.error$default("Attempted to use an invalid operator with a numeric value: " + bVar, null, 2, null);
                return false;
            case 6:
                return doubleValue2 < doubleValue;
            case 7:
                return doubleValue2 > doubleValue;
            case 8:
                return doubleValue2 < doubleValue || doubleValue2 == doubleValue;
            case 9:
                return doubleValue2 > doubleValue || doubleValue2 == doubleValue;
            default:
                throw new ac.d();
        }
    }

    private final boolean triggerMatchesNumericValueFlex(Number number, String str, m.b bVar) {
        try {
            return triggerMatchesNumericValue(Double.valueOf(number.doubleValue()), Double.valueOf(Double.parseDouble(str)), bVar);
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private final boolean triggerMatchesStringValue(String str, String str2, m.b bVar) {
        int i10 = d.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i10 == 1) {
            return j.a(str, str2);
        }
        if (i10 == 2) {
            return !j.a(str, str2);
        }
        com.onesignal.debug.internal.logging.b.error$default("Attempted to use an invalid operator for a string trigger comparison: " + bVar, null, 2, null);
        return false;
    }

    @Override // t9.a
    public boolean evaluateMessageTriggers(com.onesignal.inAppMessages.internal.a aVar) {
        j.e(aVar, "message");
        if (aVar.getTriggers().isEmpty()) {
            return true;
        }
        Iterator<List<m>> it = aVar.getTriggers().iterator();
        while (it.hasNext()) {
            if (evaluateAndTriggers(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // t9.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this._dynamicTriggerController.getHasSubscribers();
    }

    public final ConcurrentHashMap<String, Object> getTriggers() {
        return this.triggers;
    }

    @Override // t9.a
    public boolean isTriggerOnMessage(com.onesignal.inAppMessages.internal.a aVar, Collection<String> collection) {
        j.e(aVar, "message");
        j.e(collection, "triggersKeys");
        if (aVar.getTriggers() == null) {
            return false;
        }
        for (String str : collection) {
            Iterator<List<m>> it = aVar.getTriggers().iterator();
            while (it.hasNext()) {
                for (m mVar : it.next()) {
                    if (j.a(str, mVar.getProperty()) || j.a(str, mVar.getTriggerId())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // t9.a
    public boolean messageHasOnlyDynamicTriggers(com.onesignal.inAppMessages.internal.a aVar) {
        j.e(aVar, "message");
        if (aVar.getTriggers() == null || aVar.getTriggers().isEmpty()) {
            return false;
        }
        Iterator<List<m>> it = aVar.getTriggers().iterator();
        while (it.hasNext()) {
            for (m mVar : it.next()) {
                if (mVar.getKind() == m.a.CUSTOM || mVar.getKind() == m.a.UNKNOWN) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelUpdated(com.onesignal.common.modeling.j jVar, String str) {
        j.e(jVar, "args");
        j.e(str, "tag");
        i model = jVar.getModel();
        j.c(model, "null cannot be cast to non-null type com.onesignal.inAppMessages.internal.triggers.TriggerModel");
        t9.c cVar = (t9.c) model;
        addTriggers(cVar.getKey(), cVar.getValue());
        this._dynamicTriggerController.getEvents().fire(new b(cVar));
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(t9.c cVar, String str) {
        j.e(cVar, "model");
        j.e(str, "tag");
        addTriggers(cVar.getKey(), cVar.getValue());
        this._dynamicTriggerController.getEvents().fire(new a(cVar));
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(t9.c cVar, String str) {
        j.e(cVar, "model");
        j.e(str, "tag");
        removeTriggersForKeys(cVar.getKey());
    }

    @Override // t9.a, com.onesignal.common.events.d
    public void subscribe(t9.b bVar) {
        j.e(bVar, "handler");
        this._dynamicTriggerController.subscribe(bVar);
    }

    @Override // t9.a, com.onesignal.common.events.d
    public void unsubscribe(t9.b bVar) {
        j.e(bVar, "handler");
        this._dynamicTriggerController.unsubscribe(bVar);
    }
}
