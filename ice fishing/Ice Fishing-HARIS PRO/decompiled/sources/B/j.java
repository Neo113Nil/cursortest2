package B;

import O.B;
import O.K;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;
import k0.C0202p;

/* loaded from: classes.dex */
public final class j implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f27a;

    public /* synthetic */ j(int i) {
        this.f27a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r3 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r3 != false) goto L17;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i = -1;
        switch (this.f27a) {
            case 0:
                WeakHashMap weakHashMap = K.f747a;
                float g2 = B.g((View) obj);
                float g3 = B.g((View) obj2);
                if (g2 > g3) {
                    return -1;
                }
                return g2 < g3 ? 1 : 0;
            case 1:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 2:
                C0202p c0202p = (C0202p) obj;
                C0202p c0202p2 = (C0202p) obj2;
                RecyclerView recyclerView = c0202p.f3580d;
                if ((recyclerView == null) == (c0202p2.f3580d == null)) {
                    boolean z2 = c0202p.f3577a;
                    if (z2 == c0202p2.f3577a) {
                        i = c0202p2.f3578b - c0202p.f3578b;
                        if (i == 0) {
                            int i2 = c0202p.f3579c - c0202p2.f3579c;
                            if (i2 != 0) {
                                return i2;
                            }
                            return 0;
                        }
                    }
                    return i;
                }
                break;
            default:
                return ((u.f) obj).f4422b - ((u.f) obj2).f4422b;
        }
    }
}
