package S0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1124c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f1125d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f1124c = arrayList;
        this.f1125d = matrix;
    }

    @Override // S0.t
    public final void a(Matrix matrix, R0.a aVar, int i, Canvas canvas) {
        Iterator it = this.f1124c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.f1125d, aVar, i, canvas);
        }
    }
}
