package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i3k extends h3k {
    public int e;
    public cxj f;
    public cxj g;

    public static int j(yon yonVar, View view, gc9 gc9Var) {
        float y;
        int height;
        int f;
        if (yonVar.x()) {
            y = view.getX();
            height = view.getWidth() / 2;
        } else {
            y = view.getY();
            height = view.getHeight() / 2;
        }
        int i = (int) (y + height);
        RecyclerView recyclerView = yonVar.b;
        if (recyclerView == null || !recyclerView.h) {
            f = gc9Var.f() / 2;
        } else {
            f = (gc9Var.o() / 2) + gc9Var.n();
        }
        return i - f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        if (r2 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r2 == null) goto L10;
     */
    @Override // defpackage.h3k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] b(yon yonVar, View view) {
        cxj cxjVar;
        int[] iArr = new int[2];
        if (yonVar.x()) {
            cxj cxjVar2 = this.g;
            if (cxjVar2 != null) {
                cxjVar = Intrinsics.d((yon) cxjVar2.b, yonVar) ? cxjVar2 : null;
            }
            cxjVar = new cxj(yonVar, 0);
            this.g = cxjVar;
            iArr[0] = j(yonVar, view, cxjVar);
            return iArr;
        }
        if (yonVar.y()) {
            cxj cxjVar3 = this.f;
            if (cxjVar3 != null) {
                cxjVar = Intrinsics.d((yon) cxjVar3.b, yonVar) ? cxjVar3 : null;
            }
            cxjVar = new cxj(yonVar, 1);
            this.f = cxjVar;
            iArr[1] = j(yonVar, view, cxjVar);
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h3k
    public final int f(yon yonVar, int i, int i2) {
        y09 y09Var = (y09) yonVar;
        if (y09Var.s() != 0) {
            i = i2;
        } else if (yonVar.b.getLayoutDirection() != 0) {
            i = -i;
        }
        int f = i < 0 ? y09Var.f() : y09Var.p();
        if (f != -1) {
            return f;
        }
        int o = y09Var.o();
        int l = y09Var.l();
        if (l == o) {
            if (l == -1) {
                return 0;
            }
        } else if (i < 0) {
            return o;
        }
        return l;
    }
}
