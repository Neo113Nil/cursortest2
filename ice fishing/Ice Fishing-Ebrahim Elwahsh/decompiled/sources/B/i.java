package B;

import O.L;
import O.X;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;
import t0.C5049l;
import u.C5089f;

/* loaded from: classes.dex */
public final class i implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f61n;

    public /* synthetic */ i(int i) {
        this.f61n = i;
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
        switch (this.f61n) {
            case 0:
                WeakHashMap weakHashMap = X.f2240a;
                float m8 = L.m((View) obj);
                float m9 = L.m((View) obj2);
                if (m8 > m9) {
                    return -1;
                }
                return m8 < m9 ? 1 : 0;
            case 1:
                return ((G0.d) obj).f1177b - ((G0.d) obj2).f1177b;
            case 2:
                G0.e eVar = (G0.e) ((View) obj).getLayoutParams();
                G0.e eVar2 = (G0.e) ((View) obj2).getLayoutParams();
                boolean z8 = eVar.f1181a;
                return z8 != eVar2.f1181a ? z8 ? 1 : -1 : eVar.f1185e - eVar2.f1185e;
            case 3:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 4:
                C5049l c5049l = (C5049l) obj;
                C5049l c5049l2 = (C5049l) obj2;
                RecyclerView recyclerView = c5049l.f40747d;
                if ((recyclerView == null) == (c5049l2.f40747d == null)) {
                    boolean z9 = c5049l.f40744a;
                    if (z9 == c5049l2.f40744a) {
                        i = c5049l2.f40745b - c5049l.f40745b;
                        if (i == 0) {
                            int i4 = c5049l.f40746c - c5049l2.f40746c;
                            if (i4 != 0) {
                                return i4;
                            }
                            return 0;
                        }
                    }
                    return i;
                }
                break;
            case 5:
                return ((C5089f) obj).f40995u - ((C5089f) obj2).f40995u;
            default:
                return ((View) obj).getTop() - ((View) obj2).getTop();
        }
    }
}
