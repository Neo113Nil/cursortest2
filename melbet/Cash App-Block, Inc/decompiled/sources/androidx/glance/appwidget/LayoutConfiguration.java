package androidx.glance.appwidget;

import android.content.Context;
import androidx.glance.EmittableWithChildren;
import androidx.glance.appwidget.ContentReceiver;
import androidx.glance.appwidget.proto.LayoutProto$LayoutNode;
import androidx.glance.state.GlanceState;
import app.cash.badging.backend.RealBadger2$clear$2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class LayoutConfiguration {
    public static final ContentReceiver.Key Companion = new ContentReceiver.Key();
    public final int appWidgetId;
    public final Context context;
    public final LinkedHashSet existingLayoutIds;
    public final LinkedHashMap layoutConfig;
    public int nextIndex;
    public final LinkedHashSet usedLayoutIds;

    public LayoutConfiguration(Context context, LinkedHashMap linkedHashMap, int i, int i2, LinkedHashSet linkedHashSet) {
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        this.context = context;
        this.layoutConfig = linkedHashMap;
        this.nextIndex = i;
        this.appWidgetId = i2;
        this.usedLayoutIds = linkedHashSet2;
        this.existingLayoutIds = linkedHashSet;
    }

    public final int addLayout(EmittableWithChildren emittableWithChildren) {
        LayoutProto$LayoutNode createNode = WidgetLayoutKt.createNode(emittableWithChildren);
        synchronized (this) {
            Integer num = (Integer) this.layoutConfig.get(createNode);
            if (num != null) {
                int intValue = num.intValue();
                this.usedLayoutIds.add(Integer.valueOf(intValue));
                return intValue;
            }
            int i = this.nextIndex;
            while (this.existingLayoutIds.contains(Integer.valueOf(i))) {
                i = (i + 1) % LayoutSelectionKt.TopLevelLayoutsCount;
                if (i == this.nextIndex) {
                    throw new IllegalArgumentException("Cannot assign a valid layout index to the new layout: no free index left.");
                }
            }
            this.nextIndex = (i + 1) % LayoutSelectionKt.TopLevelLayoutsCount;
            this.usedLayoutIds.add(Integer.valueOf(i));
            this.existingLayoutIds.add(Integer.valueOf(i));
            this.layoutConfig.put(createNode, Integer.valueOf(i));
            return i;
        }
    }

    public final Object save(AppWidgetSession$processEmittableTree$1 appWidgetSession$processEmittableTree$1) {
        Object updateValue = GlanceState.INSTANCE.updateValue(this.context, LayoutStateDefinition.INSTANCE, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.appWidgetId, "appWidgetLayout-"), new RealBadger2$clear$2(this, null, 17), appWidgetSession$processEmittableTree$1);
        return updateValue == CoroutineSingletons.COROUTINE_SUSPENDED ? updateValue : Unit.INSTANCE;
    }
}
