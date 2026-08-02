package G3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f1115a;

    public h(float f2) {
        this.f1115a = f2;
    }

    @Override // G3.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f1115a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f1115a == ((h) obj).f1115a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1115a)});
    }
}
