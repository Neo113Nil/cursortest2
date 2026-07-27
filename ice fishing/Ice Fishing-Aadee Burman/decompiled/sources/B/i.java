package B;

import O.L;
import O.X;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;
import t0.C5017l;
import u.C5050f;

/* loaded from: classes.dex */
public final class i implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f89n;

    public /* synthetic */ i(int i) {
        this.f89n = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0034, code lost:
    
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003d, code lost:
    
        if (r3 != false) goto L22;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i = -1;
        switch (this.f89n) {
            case 0:
                WeakHashMap weakHashMap = X.f2054a;
                float m4 = L.m((View) obj);
                float m9 = L.m((View) obj2);
                if (m4 > m9) {
                    return -1;
                }
                return m4 < m9 ? 1 : 0;
            case 1:
                return ((G0.e) obj).f1033b - ((G0.e) obj2).f1033b;
            case 2:
                G0.f fVar = (G0.f) ((View) obj).getLayoutParams();
                G0.f fVar2 = (G0.f) ((View) obj2).getLayoutParams();
                boolean z3 = fVar.f1037a;
                return z3 != fVar2.f1037a ? z3 ? 1 : -1 : fVar.f1041e - fVar2.f1041e;
            case 3:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 4:
                C5017l c5017l = (C5017l) obj;
                C5017l c5017l2 = (C5017l) obj2;
                RecyclerView recyclerView = c5017l.f40722d;
                if ((recyclerView == null) == (c5017l2.f40722d == null)) {
                    boolean z6 = c5017l.f40719a;
                    if (z6 == c5017l2.f40719a) {
                        i = c5017l2.f40720b - c5017l.f40720b;
                        if (i == 0) {
                            int i6 = c5017l.f40721c - c5017l2.f40721c;
                            if (i6 != 0) {
                                return i6;
                            }
                            return 0;
                        }
                    }
                    return i;
                }
                break;
            case 5:
                return ((C5050f) obj).f40978u - ((C5050f) obj2).f40978u;
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }
}
