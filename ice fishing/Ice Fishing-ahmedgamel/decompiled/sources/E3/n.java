package E3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f809c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f810d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f809c = arrayList;
        this.f810d = matrix;
    }

    @Override // E3.t
    public final void a(Matrix matrix, D3.a aVar, int i, Canvas canvas) {
        Iterator it = this.f809c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.f810d, aVar, i, canvas);
        }
    }
}
