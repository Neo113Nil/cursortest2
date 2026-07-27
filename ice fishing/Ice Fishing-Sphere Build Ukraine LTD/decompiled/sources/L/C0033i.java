package L;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: L.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0033i implements Comparator {
    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0023, code lost:
    
        if (r0 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r0 == null) goto L13;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        C0035k c0035k = (C0035k) obj;
        C0035k c0035k2 = (C0035k) obj2;
        RecyclerView recyclerView = c0035k.f573d;
        if ((recyclerView == null) == (c0035k2.f573d == null)) {
            boolean z2 = c0035k.f570a;
            if (z2 == c0035k2.f570a) {
                int i2 = c0035k2.f571b - c0035k.f571b;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = c0035k.f572c - c0035k2.f572c;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
        }
    }
}
