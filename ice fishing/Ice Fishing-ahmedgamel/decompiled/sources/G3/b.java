package G3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f1074a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1075b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f1074a;
            f2 += ((b) cVar).f1075b;
        }
        this.f1074a = cVar;
        this.f1075b = f2;
    }

    @Override // G3.c
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f1074a.a(rectF) + this.f1075b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1074a.equals(bVar.f1074a) && this.f1075b == bVar.f1075b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1074a, Float.valueOf(this.f1075b)});
    }
}
