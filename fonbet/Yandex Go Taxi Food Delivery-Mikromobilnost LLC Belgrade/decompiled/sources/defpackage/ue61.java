package defpackage;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes7.dex */
public final class ue61 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return uvc.b((Comparable) ((Map.Entry) obj).getValue(), (Comparable) ((Map.Entry) obj2).getValue());
    }
}
