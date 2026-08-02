package defpackage;

import android.view.View;
import androidx.core.view.e;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class v1w extends e {
    public final View a;
    public int b;
    public int c;
    public final int[] w;

    public v1w(View view) {
        super(0);
        this.w = new int[2];
        this.a = view;
    }

    @Override // androidx.core.view.e
    public final void onEnd(u651 u651Var) {
        this.a.setTranslationY(0.0f);
    }

    @Override // androidx.core.view.e
    public final void onPrepare(u651 u651Var) {
        View view = this.a;
        int[] iArr = this.w;
        view.getLocationOnScreen(iArr);
        this.b = iArr[1];
    }

    @Override // androidx.core.view.e
    public final n751 onProgress(n751 n751Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((u651) it.next()).a.d() & 8) != 0) {
                this.a.setTranslationY(mj2.c(this.c, 0, r0.a.c()));
                break;
            }
        }
        return n751Var;
    }

    @Override // androidx.core.view.e
    public final q651 onStart(u651 u651Var, q651 q651Var) {
        View view = this.a;
        int[] iArr = this.w;
        view.getLocationOnScreen(iArr);
        int i = this.b - iArr[1];
        this.c = i;
        view.setTranslationY(i);
        return q651Var;
    }
}
