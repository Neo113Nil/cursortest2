package C3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class h implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f420a;

    public h(float f6) {
        this.f420a = f6;
    }

    @Override // C3.c
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f420a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f420a == ((h) obj).f420a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f420a)});
    }
}
