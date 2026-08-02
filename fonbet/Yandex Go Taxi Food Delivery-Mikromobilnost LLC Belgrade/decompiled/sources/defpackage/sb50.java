package defpackage;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events_layer.RoadEventSignificance;
import com.yandex.mapkit.road_events_layer.RoadEventStyle;
import com.yandex.mapkit.road_events_layer.RoadEventStylingProperties;
import com.yandex.mapkit.road_events_layer.StyleProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes15.dex */
public final class sb50 implements StyleProvider {
    public final WeakReference a;
    public final LinkedHashMap b;
    public final List c;
    public final List d;
    public boolean e;

    public sb50(Context context, wsk0 wsk0Var) {
        this.a = new WeakReference(context);
        wsk0Var.getClass();
        this.b = wsk0.a();
        this.c = scc.g(new PointF(1.0f, 0.5f), new PointF(14.0f, 0.85f), new PointF(15.0f, 0.9f), new PointF(16.0f, 1.0f));
        this.d = Collections.singletonList(new PointF(1.0f, 1.0f));
    }

    @Override // com.yandex.mapkit.road_events_layer.StyleProvider
    public final boolean provideStyle(RoadEventStylingProperties roadEventStylingProperties, boolean z, float f, RoadEventStyle roadEventStyle) {
        Object next;
        if (roadEventStylingProperties.isOnRoute() || this.e) {
            List<EventTag> tags = roadEventStylingProperties.getTags();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = tags.iterator();
            while (it.hasNext()) {
                kg50 kg50Var = (kg50) this.b.get((EventTag) it.next());
                if (kg50Var != null) {
                    arrayList.add(kg50Var);
                }
            }
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int priority = ((kg50) next).a.getPriority();
                    do {
                        Object next2 = it2.next();
                        int priority2 = ((kg50) next2).a.getPriority();
                        if (priority < priority2) {
                            next = next2;
                            priority = priority2;
                        }
                    } while (it2.hasNext());
                }
            } else {
                next = null;
            }
            kg50 kg50Var2 = (kg50) next;
            if (kg50Var2 != null) {
                Map significanceToZoomMin = kg50Var2.a.getSignificanceToZoomMin();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : significanceToZoomMin.entrySet()) {
                    if (roadEventStylingProperties.hasSignificanceGreaterOrEqual((RoadEventSignificance) entry.getKey())) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                LinkedHashMap linkedHashMap2 = linkedHashMap.isEmpty() ? null : linkedHashMap;
                if (linkedHashMap2 != null) {
                    Iterator it3 = linkedHashMap2.entrySet().iterator();
                    if (it3.hasNext()) {
                        int intValue = ((Number) ((Map.Entry) it3.next()).getValue()).intValue();
                        while (it3.hasNext()) {
                            int intValue2 = ((Number) ((Map.Entry) it3.next()).getValue()).intValue();
                            if (intValue > intValue2) {
                                intValue = intValue2;
                            }
                        }
                        Integer valueOf = roadEventStylingProperties.isSelected() ? roadEventStylingProperties.isInFuture() ? kg50Var2.e : kg50Var2.c : roadEventStylingProperties.isInFuture() ? kg50Var2.d : Integer.valueOf(kg50Var2.b);
                        if (valueOf != null && valueOf.intValue() != 0) {
                            roadEventStyle.setZoomMin(intValue);
                            roadEventStyle.setZoomScaleFunction(roadEventStylingProperties.isSelected() ? this.d : this.c);
                            float f2 = (this.e && roadEventStylingProperties.isSelected()) ? 0.67f : (roadEventStylingProperties.isSelected() || this.e) ? 1.0f : 1.5f;
                            int intValue3 = valueOf.intValue();
                            WeakReference weakReference = this.a;
                            Context context = (Context) weakReference.get();
                            roadEventStyle.setIconImage(new elm0(weakReference, intValue3, (f / (context != null ? ddb1.e(context) : 1.0f)) * f2));
                            roadEventStyle.setIconAnchor(new PointF(0.5f, 1.0f));
                            return true;
                        }
                    } else {
                        ny61.p();
                    }
                }
            }
        }
        return false;
    }
}
