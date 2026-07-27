package com.onesignal.inAppMessages.internal.triggers.impl;

import I7.l;
import com.onesignal.common.modeling.j;
import com.onesignal.inAppMessages.internal.m;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import u7.v;

/* loaded from: classes2.dex */
public final class e implements Z4.a, com.onesignal.common.modeling.d {
    private com.onesignal.inAppMessages.internal.triggers.impl.a _dynamicTriggerController;
    private final ConcurrentHashMap<String, Object> triggers;

    public static final class a extends i implements l {
        final /* synthetic */ Z4.c $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Z4.c cVar) {
            super(1);
            this.$model = cVar;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Z4.b) obj);
            return v.f41350a;
        }

        public final void invoke(Z4.b it) {
            h.e(it, "it");
            it.onTriggerChanged(this.$model.getKey());
        }
    }

    public static final class b extends i implements l {
        final /* synthetic */ Z4.c $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Z4.c cVar) {
            super(1);
            this.$model = cVar;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Z4.b) obj);
            return v.f41350a;
        }

        public final void invoke(Z4.b it) {
            h.e(it, "it");
            it.onTriggerChanged(this.$model.getKey());
        }
    }

    public e(Z4.d triggerModelStore, com.onesignal.inAppMessages.internal.triggers.impl.a _dynamicTriggerController) {
        h.e(triggerModelStore, "triggerModelStore");
        h.e(_dynamicTriggerController, "_dynamicTriggerController");
        this._dynamicTriggerController = _dynamicTriggerController;
        this.triggers = new ConcurrentHashMap<>();
        triggerModelStore.subscribe((com.onesignal.common.modeling.d) this);
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
            return operatorType == m.b.NOT_EXISTS;
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
            h.b(str);
            if (triggerMatchesStringValue(str, (String) obj, operatorType)) {
                return true;
            }
        }
        if ((mVar.getValue() instanceof Number) && (obj instanceof Number)) {
            Number number = (Number) mVar.getValue();
            h.b(number);
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
            h.d(obj4, "format(...)");
        }
        return triggerMatchesStringValue(obj3, obj4, bVar);
    }

    private final boolean triggerMatchesNumericValue(Number number, Number number2, m.b bVar) {
        double doubleValue = number.doubleValue();
        double doubleValue2 = number2.doubleValue();
        switch (d.$EnumSwitchMapping$0[bVar.ordinal()]) {
            case 1:
                return doubleValue2 == doubleValue;
            case 2:
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
                throw new B0.c();
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
        int i = d.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i == 1) {
            return h.a(str, str2);
        }
        if (i == 2) {
            return !h.a(str, str2);
        }
        com.onesignal.debug.internal.logging.b.error$default("Attempted to use an invalid operator for a string trigger comparison: " + bVar, null, 2, null);
        return false;
    }

    @Override // Z4.a
    public boolean evaluateMessageTriggers(com.onesignal.inAppMessages.internal.a message) {
        h.e(message, "message");
        if (message.getTriggers().isEmpty()) {
            return true;
        }
        Iterator<List<m>> it = message.getTriggers().iterator();
        while (it.hasNext()) {
            if (evaluateAndTriggers(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // Z4.a, com.onesignal.common.events.d
    public boolean getHasSubscribers() {
        return this._dynamicTriggerController.getHasSubscribers();
    }

    public final ConcurrentHashMap<String, Object> getTriggers() {
        return this.triggers;
    }

    @Override // Z4.a
    public boolean isTriggerOnMessage(com.onesignal.inAppMessages.internal.a message, Collection<String> triggersKeys) {
        h.e(message, "message");
        h.e(triggersKeys, "triggersKeys");
        if (message.getTriggers() == null) {
            return false;
        }
        for (String str : triggersKeys) {
            Iterator<List<m>> it = message.getTriggers().iterator();
            while (it.hasNext()) {
                for (m mVar : it.next()) {
                    if (h.a(str, mVar.getProperty()) || h.a(str, mVar.getTriggerId())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // Z4.a
    public boolean messageHasOnlyDynamicTriggers(com.onesignal.inAppMessages.internal.a message) {
        h.e(message, "message");
        if (message.getTriggers() == null || message.getTriggers().isEmpty()) {
            return false;
        }
        Iterator<List<m>> it = message.getTriggers().iterator();
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
    public void onModelUpdated(j args, String tag) {
        h.e(args, "args");
        h.e(tag, "tag");
        com.onesignal.common.modeling.i model = args.getModel();
        h.c(model, "null cannot be cast to non-null type com.onesignal.inAppMessages.internal.triggers.TriggerModel");
        Z4.c cVar = (Z4.c) model;
        addTriggers(cVar.getKey(), cVar.getValue());
        this._dynamicTriggerController.getEvents().fire(new b(cVar));
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelAdded(Z4.c model, String tag) {
        h.e(model, "model");
        h.e(tag, "tag");
        addTriggers(model.getKey(), model.getValue());
        this._dynamicTriggerController.getEvents().fire(new a(model));
    }

    @Override // com.onesignal.common.modeling.d
    public void onModelRemoved(Z4.c model, String tag) {
        h.e(model, "model");
        h.e(tag, "tag");
        removeTriggersForKeys(model.getKey());
    }

    @Override // Z4.a, com.onesignal.common.events.d
    public void subscribe(Z4.b handler) {
        h.e(handler, "handler");
        this._dynamicTriggerController.subscribe(handler);
    }

    @Override // Z4.a, com.onesignal.common.events.d
    public void unsubscribe(Z4.b handler) {
        h.e(handler, "handler");
        this._dynamicTriggerController.unsubscribe(handler);
    }
}
