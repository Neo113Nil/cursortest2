package i7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: i7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4602d {

    /* renamed from: a, reason: collision with root package name */
    public static final List f38184a = Collections.unmodifiableList(Arrays.asList(Double.valueOf(0.0d), Double.valueOf(5.0d), Double.valueOf(10.0d), Double.valueOf(25.0d), Double.valueOf(50.0d), Double.valueOf(75.0d), Double.valueOf(100.0d), Double.valueOf(250.0d), Double.valueOf(500.0d), Double.valueOf(750.0d), Double.valueOf(1000.0d), Double.valueOf(2500.0d), Double.valueOf(5000.0d), Double.valueOf(7500.0d), Double.valueOf(10000.0d)));

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (Double.isNaN(((Double) it.next()).doubleValue())) {
                throw new IllegalArgumentException("invalid bucket boundary: NaN");
            }
        }
        for (int i = 1; i < list.size(); i++) {
            int i4 = i - 1;
            if (((Double) list.get(i4)).doubleValue() >= ((Double) list.get(i)).doubleValue()) {
                throw new IllegalArgumentException("Bucket boundaries must be in increasing order: " + list.get(i4) + " >= " + list.get(i));
            }
        }
        if (list.isEmpty()) {
            return;
        }
        if (((Double) list.get(0)).doubleValue() == Double.NEGATIVE_INFINITY) {
            throw new IllegalArgumentException("invalid bucket boundary: -Inf");
        }
        if (((Double) list.get(list.size() - 1)).doubleValue() == Double.POSITIVE_INFINITY) {
            throw new IllegalArgumentException("invalid bucket boundary: +Inf");
        }
    }
}
