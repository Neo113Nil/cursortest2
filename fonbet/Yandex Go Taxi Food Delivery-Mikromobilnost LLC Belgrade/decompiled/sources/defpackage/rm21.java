package defpackage;

import android.location.GnssMeasurement;
import java.util.Comparator;

/* loaded from: classes5.dex */
public final class rm21 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Double.valueOf(((GnssMeasurement) obj2).getCn0DbHz()).compareTo(Double.valueOf(((GnssMeasurement) obj).getCn0DbHz()));
    }
}
