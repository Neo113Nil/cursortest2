package G3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1151c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f1152d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f1151c = arrayList;
        this.f1152d = matrix;
    }

    @Override // G3.t
    public final void a(Matrix matrix, F3.a aVar, int i, Canvas canvas) {
        Iterator it = this.f1151c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.f1152d, aVar, i, canvas);
        }
    }
}
