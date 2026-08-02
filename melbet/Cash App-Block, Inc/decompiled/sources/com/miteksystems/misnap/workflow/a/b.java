package com.miteksystems.misnap.workflow.a;

import android.os.Build;
import android.util.TypedValue;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes4.dex */
public abstract class b {
    public static final Map b;
    public static final Map c;

    static {
        Float valueOf = Float.valueOf(1.05f);
        Float valueOf2 = Float.valueOf(8.0f);
        Pair pair = new Pair(valueOf2, Float.valueOf(8.4f));
        Float valueOf3 = Float.valueOf(10.0f);
        Pair pair2 = new Pair(valueOf3, Float.valueOf(10.5f));
        Float valueOf4 = Float.valueOf(12.0f);
        Pair pair3 = new Pair(valueOf4, Float.valueOf(12.6f));
        Float valueOf5 = Float.valueOf(14.0f);
        Pair pair4 = new Pair(valueOf5, Float.valueOf(14.8f));
        Float valueOf6 = Float.valueOf(18.0f);
        Pair pair5 = new Pair(valueOf6, Float.valueOf(18.6f));
        Float valueOf7 = Float.valueOf(20.0f);
        Pair pair6 = new Pair(valueOf7, Float.valueOf(20.6f));
        Float valueOf8 = Float.valueOf(24.0f);
        Float valueOf9 = Float.valueOf(24.4f);
        Pair pair7 = new Pair(valueOf8, valueOf9);
        Float valueOf10 = Float.valueOf(30.0f);
        Pair pair8 = new Pair(valueOf10, valueOf10);
        Float valueOf11 = Float.valueOf(100.0f);
        Pair pair9 = new Pair(valueOf, MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, new Pair(valueOf11, valueOf11)));
        Float valueOf12 = Float.valueOf(1.1f);
        Pair pair10 = new Pair(valueOf2, Float.valueOf(8.8f));
        Pair pair11 = new Pair(valueOf3, Float.valueOf(11.0f));
        Pair pair12 = new Pair(valueOf4, Float.valueOf(13.2f));
        Float valueOf13 = Float.valueOf(15.6f);
        Pair pair13 = new Pair(valueOf12, MapsKt__MapsKt.mapOf(pair10, pair11, pair12, new Pair(valueOf5, valueOf13), new Pair(valueOf6, Float.valueOf(19.2f)), new Pair(valueOf7, Float.valueOf(21.2f)), new Pair(valueOf8, Float.valueOf(24.8f)), new Pair(valueOf10, valueOf10), new Pair(valueOf11, valueOf11)));
        Pair pair14 = new Pair(Float.valueOf(1.15f), MapsKt__MapsKt.mapOf(new Pair(valueOf2, Float.valueOf(9.2f)), new Pair(valueOf3, Float.valueOf(11.5f)), new Pair(valueOf4, Float.valueOf(13.8f)), new Pair(valueOf5, Float.valueOf(16.4f)), new Pair(valueOf6, Float.valueOf(19.8f)), new Pair(valueOf7, Float.valueOf(21.8f)), new Pair(valueOf8, Float.valueOf(25.2f)), new Pair(valueOf10, valueOf10), new Pair(valueOf11, valueOf11)));
        Float valueOf14 = Float.valueOf(1.2f);
        Pair pair15 = new Pair(valueOf2, Float.valueOf(9.6f));
        Pair pair16 = new Pair(valueOf3, valueOf4);
        Float valueOf15 = Float.valueOf(14.4f);
        Pair pair17 = new Pair(valueOf14, MapsKt__MapsKt.mapOf(pair15, pair16, new Pair(valueOf4, valueOf15), new Pair(valueOf5, Float.valueOf(17.2f)), new Pair(valueOf6, Float.valueOf(20.4f)), new Pair(valueOf7, Float.valueOf(22.4f)), new Pair(valueOf8, Float.valueOf(25.6f)), new Pair(valueOf10, valueOf10), new Pair(valueOf11, valueOf11)));
        Float valueOf16 = Float.valueOf(1.3f);
        Pair pair18 = new Pair(valueOf2, Float.valueOf(10.4f));
        Pair pair19 = new Pair(valueOf3, Float.valueOf(13.0f));
        Pair pair20 = new Pair(valueOf4, valueOf13);
        Pair pair21 = new Pair(valueOf5, Float.valueOf(18.8f));
        Float valueOf17 = Float.valueOf(21.6f);
        Pair pair22 = new Pair(valueOf16, MapsKt__MapsKt.mapOf(pair18, pair19, pair20, pair21, new Pair(valueOf6, valueOf17), new Pair(valueOf7, Float.valueOf(23.6f)), new Pair(valueOf8, Float.valueOf(26.4f)), new Pair(valueOf10, valueOf10), new Pair(valueOf11, valueOf11)));
        Float valueOf18 = Float.valueOf(1.5f);
        Pair pair23 = new Pair(valueOf2, valueOf4);
        Float valueOf19 = Float.valueOf(15.0f);
        Pair pair24 = new Pair(valueOf3, valueOf19);
        Pair pair25 = new Pair(valueOf4, valueOf6);
        Float valueOf20 = Float.valueOf(22.0f);
        Pair pair26 = new Pair(valueOf5, valueOf20);
        Pair pair27 = new Pair(valueOf6, valueOf8);
        Float valueOf21 = Float.valueOf(26.0f);
        Pair pair28 = new Pair(valueOf7, valueOf21);
        Float valueOf22 = Float.valueOf(28.0f);
        b = MapsKt__MapsKt.mapOf(pair9, pair13, pair14, pair17, pair22, new Pair(valueOf18, MapsKt__MapsKt.mapOf(pair23, pair24, pair25, pair26, pair27, pair28, new Pair(valueOf8, valueOf22), new Pair(valueOf10, valueOf10), new Pair(valueOf11, valueOf11))), new Pair(Float.valueOf(1.8f), MapsKt__MapsKt.mapOf(new Pair(valueOf2, valueOf15), new Pair(valueOf3, valueOf6), new Pair(valueOf4, valueOf17), new Pair(valueOf5, valueOf9), new Pair(valueOf6, valueOf21), new Pair(valueOf7, valueOf10), new Pair(valueOf8, Float.valueOf(32.0f)), new Pair(valueOf10, Float.valueOf(34.0f)), new Pair(valueOf11, valueOf11))));
        c = MapsKt__MapsKt.mapOf(new Pair(valueOf2, valueOf4), new Pair(valueOf3, valueOf19), new Pair(valueOf4, valueOf6), new Pair(valueOf5, valueOf20), new Pair(valueOf6, valueOf8), new Pair(valueOf7, valueOf21), new Pair(valueOf8, valueOf22), new Pair(valueOf10, valueOf10), new Pair(valueOf11, valueOf11));
    }

    public static void a(TextView textView, float f) {
        Object next;
        Object obj;
        float f2;
        textView.getClass();
        float deriveDimension = Build.VERSION.SDK_INT >= 34 ? TypedValue.deriveDimension(2, textView.getTextSize(), textView.getContext().getResources().getDisplayMetrics()) : textView.getTextSize() / textView.getContext().getResources().getDisplayMetrics().scaledDensity;
        Map map = b;
        Iterator it = map.keySet().iterator();
        Object obj2 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(((Number) next).floatValue() - f);
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(((Number) next2).floatValue() - f);
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map map2 = (Map) map.get((Float) next);
        if (map2 == null) {
            map2 = c;
        }
        Float f3 = (Float) map2.get(Float.valueOf(deriveDimension));
        if (f3 != null) {
            f2 = f3.floatValue();
        } else {
            Float f4 = (Float) map2.get(Float.valueOf(deriveDimension));
            if (f4 != null) {
                deriveDimension = f4.floatValue();
            } else {
                List sorted = CollectionsKt.sorted(map2.keySet());
                ListIterator listIterator = sorted.listIterator(sorted.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    } else {
                        obj = listIterator.previous();
                        if (((Number) obj).floatValue() <= deriveDimension) {
                            break;
                        }
                    }
                }
                Float f5 = (Float) obj;
                Iterator it2 = sorted.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next3 = it2.next();
                    if (((Number) next3).floatValue() >= deriveDimension) {
                        obj2 = next3;
                        break;
                    }
                }
                Float f6 = (Float) obj2;
                if (f5 == null) {
                    deriveDimension *= f;
                } else if (f6 != null) {
                    float floatValue = ((Number) MapsKt__MapsKt.getValue(map2, f5)).floatValue();
                    deriveDimension = (((((Number) MapsKt__MapsKt.getValue(map2, f6)).floatValue() - floatValue) * (deriveDimension - f5.floatValue())) / (f6.floatValue() - f5.floatValue())) + floatValue;
                }
            }
            f2 = deriveDimension;
        }
        textView.setAutoSizeTextTypeWithDefaults(0);
        textView.setTextSize(1, f2);
    }
}
