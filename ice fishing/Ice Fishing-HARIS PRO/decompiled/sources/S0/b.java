package S0;

import android.graphics.RectF;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f1057a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1058b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f1057a;
            f2 += ((b) cVar).f1058b;
        }
        this.f1057a = cVar;
        this.f1058b = f2;
    }

    @Override // S0.c
    public final float a(RectF rectF) {
        return Math.max(RecyclerView.f2111C0, this.f1057a.a(rectF) + this.f1058b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1057a.equals(bVar.f1057a) && this.f1058b == bVar.f1058b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1057a, Float.valueOf(this.f1058b)});
    }
}
