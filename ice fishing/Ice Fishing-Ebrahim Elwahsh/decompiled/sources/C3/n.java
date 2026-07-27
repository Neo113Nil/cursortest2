package C3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class n extends t {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f456c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f457d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f456c = arrayList;
        this.f457d = matrix;
    }

    @Override // C3.t
    public final void a(Matrix matrix, B3.a aVar, int i, Canvas canvas) {
        Iterator it = this.f456c.iterator();
        while (it.hasNext()) {
            ((t) it.next()).a(this.f457d, aVar, i, canvas);
        }
    }
}
