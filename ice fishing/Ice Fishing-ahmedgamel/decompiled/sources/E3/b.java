package E3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f734a;

    /* renamed from: b, reason: collision with root package name */
    public final float f735b;

    public b(float f3, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f734a;
            f3 += ((b) cVar).f735b;
        }
        this.f734a = cVar;
        this.f735b = f3;
    }

    @Override // E3.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f734a.a(rectF) + this.f735b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f734a.equals(bVar.f734a) && this.f735b == bVar.f735b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f734a, Float.valueOf(this.f735b)});
    }
}
