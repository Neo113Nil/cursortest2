package E3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f773a;

    public h(float f3) {
        this.f773a = f3;
    }

    @Override // E3.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f773a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f773a == ((h) obj).f773a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f773a)});
    }
}
