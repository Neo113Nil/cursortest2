package defpackage;

import java.util.Comparator;
import java.util.Map;

/* loaded from: classes10.dex */
public final class uom0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return uvc.b((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
    }
}
