package A3;

import O.L;
import O.X;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;
import t0.C5016l;
import u.C5051f;

/* loaded from: classes2.dex */
public final class o implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f181n;

    public /* synthetic */ o(int i) {
        this.f181n = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
    
        if (r3 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002f, code lost:
    
        if (r3 != false) goto L20;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i = -1;
        switch (this.f181n) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                WeakHashMap weakHashMap = X.f2142a;
                float m9 = L.m((View) obj);
                float m10 = L.m((View) obj2);
                if (m9 > m10) {
                    return -1;
                }
                return m9 < m10 ? 1 : 0;
            case 2:
                return ((G0.e) obj).f1059b - ((G0.e) obj2).f1059b;
            case 3:
                G0.f fVar = (G0.f) ((View) obj).getLayoutParams();
                G0.f fVar2 = (G0.f) ((View) obj2).getLayoutParams();
                boolean z6 = fVar.f1063a;
                return z6 != fVar2.f1063a ? z6 ? 1 : -1 : fVar.f1067e - fVar2.f1067e;
            case 4:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 5:
                C5016l c5016l = (C5016l) obj;
                C5016l c5016l2 = (C5016l) obj2;
                RecyclerView recyclerView = c5016l.f40775d;
                if ((recyclerView == null) == (c5016l2.f40775d == null)) {
                    boolean z9 = c5016l.f40772a;
                    if (z9 == c5016l2.f40772a) {
                        i = c5016l2.f40773b - c5016l.f40773b;
                        if (i == 0) {
                            int i4 = c5016l.f40774c - c5016l2.f40774c;
                            if (i4 != 0) {
                                return i4;
                            }
                            return 0;
                        }
                    }
                    return i;
                }
                break;
            default:
                return ((C5051f) obj).f40943u - ((C5051f) obj2).f40943u;
        }
    }
}
