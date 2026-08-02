package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class whr0 extends air0 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public whr0(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.air0
    public final void b(Matrix matrix, sgr0 sgr0Var, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((air0) it.next()).b(this.d, sgr0Var, i, canvas);
        }
    }
}
