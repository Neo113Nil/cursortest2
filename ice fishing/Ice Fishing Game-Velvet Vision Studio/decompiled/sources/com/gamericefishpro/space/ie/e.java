package com.gamericefishpro.space.ie;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.fc.j;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.oh.k;
import com.gamericefishpro.space.qd.m;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.he.a, com.gamericefishpro.space.fc.d {
    private com.gamericefishpro.space.ie.a _dynamicTriggerController;
    private final ConcurrentHashMap<String, Object> triggers;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.he.c $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.gamericefishpro.space.he.c cVar) {
            super(1);
            this.$model = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.he.b) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.he.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onTriggerChanged(this.$model.getKey());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends l implements Function1 {
        final /* synthetic */ com.gamericefishpro.space.he.c $model;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.gamericefishpro.space.he.c cVar) {
            super(1);
            this.$model = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.he.b) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.he.b it) {
            Intrinsics.checkNotNullParameter(it, "it");
            it.onTriggerChanged(this.$model.getKey());
        }
    }

    public e(com.gamericefishpro.space.he.d triggerModelStore, com.gamericefishpro.space.ie.a _dynamicTriggerController) {
        Intrinsics.checkNotNullParameter(triggerModelStore, "triggerModelStore");
        Intrinsics.checkNotNullParameter(_dynamicTriggerController, "_dynamicTriggerController");
        this._dynamicTriggerController = _dynamicTriggerController;
        this.triggers = new ConcurrentHashMap<>();
        triggerModelStore.subscribe((com.gamericefishpro.space.fc.d) this);
    }

    private final void addTriggers(String str, Object obj) {
        synchronized (this.triggers) {
            this.triggers.put(str, obj);
            Unit unit = Unit.a;
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
            Intrinsics.b(str);
            if (triggerMatchesStringValue(str, (String) obj, operatorType)) {
                return true;
            }
        }
        if ((mVar.getValue() instanceof Number) && (obj instanceof Number)) {
            Number number = (Number) mVar.getValue();
            Intrinsics.b(number);
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
        String string = obj.toString();
        String string2 = obj2.toString();
        if (obj2 instanceof Number) {
            string2 = new DecimalFormat("0.#").format(obj2);
            Intrinsics.checkNotNullExpressionValue(string2, "format(...)");
        }
        return triggerMatchesStringValue(string, string2, bVar);
    }

    private final boolean triggerMatchesNumericValue(Number number, Number number2, m.b bVar) {
        double dDoubleValue = number.doubleValue();
        double dDoubleValue2 = number2.doubleValue();
        switch (d.$EnumSwitchMapping$0[bVar.ordinal()]) {
            case 1:
                return dDoubleValue2 == dDoubleValue;
            case 2:
                return dDoubleValue2 != dDoubleValue;
            case 3:
            case 4:
            case i.STRING_FIELD_NUMBER /* 5 */:
                com.gamericefishpro.space.od.b.error$default("Attempted to use an invalid operator with a numeric value: " + bVar, null, 2, null);
                return false;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                return dDoubleValue2 < dDoubleValue;
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                return dDoubleValue2 > dDoubleValue;
            case i.BYTES_FIELD_NUMBER /* 8 */:
                return dDoubleValue2 < dDoubleValue || dDoubleValue2 == dDoubleValue;
            case 9:
                return dDoubleValue2 > dDoubleValue || dDoubleValue2 == dDoubleValue;
            default:
                throw new k();
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
            return Intrinsics.a(str, str2);
        }
        if (i == 2) {
            return !Intrinsics.a(str, str2);
        }
        com.gamericefishpro.space.od.b.error$default("Attempted to use an invalid operator for a string trigger comparison: " + bVar, null, 2, null);
        return false;
    }

    @Override // com.gamericefishpro.space.he.a
    public boolean evaluateMessageTriggers(com.gamericefishpro.space.qd.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
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

    @Override // com.gamericefishpro.space.he.a, com.gamericefishpro.space.dc.d
    public boolean getHasSubscribers() {
        return this._dynamicTriggerController.getHasSubscribers();
    }

    public final ConcurrentHashMap<String, Object> getTriggers() {
        return this.triggers;
    }

    @Override // com.gamericefishpro.space.he.a
    public boolean isTriggerOnMessage(com.gamericefishpro.space.qd.a message, Collection<String> triggersKeys) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(triggersKeys, "triggersKeys");
        if (message.getTriggers() == null) {
            return false;
        }
        for (String str : triggersKeys) {
            Iterator<List<m>> it = message.getTriggers().iterator();
            while (it.hasNext()) {
                for (m mVar : it.next()) {
                    if (Intrinsics.a(str, mVar.getProperty()) || Intrinsics.a(str, mVar.getTriggerId())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.gamericefishpro.space.he.a
    public boolean messageHasOnlyDynamicTriggers(com.gamericefishpro.space.qd.a message) {
        Intrinsics.checkNotNullParameter(message, "message");
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

    @Override // com.gamericefishpro.space.fc.d
    public void onModelUpdated(j args, String tag) {
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(tag, "tag");
        com.gamericefishpro.space.fc.i model = args.getModel();
        Intrinsics.c(model, "null cannot be cast to non-null type com.onesignal.inAppMessages.internal.triggers.TriggerModel");
        com.gamericefishpro.space.he.c cVar = (com.gamericefishpro.space.he.c) model;
        addTriggers(cVar.getKey(), cVar.getValue());
        this._dynamicTriggerController.getEvents().fire(new b(cVar));
    }

    @Override // com.gamericefishpro.space.fc.d
    public void onModelAdded(com.gamericefishpro.space.he.c model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        addTriggers(model.getKey(), model.getValue());
        this._dynamicTriggerController.getEvents().fire(new a(model));
    }

    @Override // com.gamericefishpro.space.fc.d
    public void onModelRemoved(com.gamericefishpro.space.he.c model, String tag) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(tag, "tag");
        removeTriggersForKeys(model.getKey());
    }

    @Override // com.gamericefishpro.space.he.a, com.gamericefishpro.space.dc.d
    public void subscribe(com.gamericefishpro.space.he.b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this._dynamicTriggerController.subscribe(handler);
    }

    @Override // com.gamericefishpro.space.he.a, com.gamericefishpro.space.dc.d
    public void unsubscribe(com.gamericefishpro.space.he.b handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this._dynamicTriggerController.unsubscribe(handler);
    }
}
