package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class qup extends wup {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public qup(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.wup
    public final void a(Matrix matrix, stp stpVar, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((wup) it.next()).a(this.d, stpVar, i, canvas);
        }
    }
}
