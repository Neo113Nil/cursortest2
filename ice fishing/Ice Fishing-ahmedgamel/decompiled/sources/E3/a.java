package E3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f733a;

    public a(float f3) {
        this.f733a = f3;
    }

    @Override // E3.c
    public final float a(RectF rectF) {
        return this.f733a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f733a == ((a) obj).f733a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f733a)});
    }
}
