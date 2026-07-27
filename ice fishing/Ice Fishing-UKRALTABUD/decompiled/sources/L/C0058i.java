package L;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: L.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0058i implements Comparator {
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
        C0060k c0060k = (C0060k) obj;
        C0060k c0060k2 = (C0060k) obj2;
        RecyclerView recyclerView = c0060k.f651d;
        if ((recyclerView == null) == (c0060k2.f651d == null)) {
            boolean z2 = c0060k.f648a;
            if (z2 == c0060k2.f648a) {
                int i2 = c0060k2.f649b - c0060k.f649b;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = c0060k.f650c - c0060k2.f650c;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
        }
    }
}
