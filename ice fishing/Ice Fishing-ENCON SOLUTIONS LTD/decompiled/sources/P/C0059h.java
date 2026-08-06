package P;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;

/* renamed from: P.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0059h implements Comparator {
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
        C0061j c0061j = (C0061j) obj;
        C0061j c0061j2 = (C0061j) obj2;
        RecyclerView recyclerView = c0061j.f1346d;
        if ((recyclerView == null) == (c0061j2.f1346d == null)) {
            boolean z2 = c0061j.f1343a;
            if (z2 == c0061j2.f1343a) {
                int i2 = c0061j2.f1344b - c0061j.f1344b;
                if (i2 != 0) {
                    return i2;
                }
                int i3 = c0061j.f1345c - c0061j2.f1345c;
                if (i3 != 0) {
                    return i3;
                }
                return 0;
            }
        }
    }
}
