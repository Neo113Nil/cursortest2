package G3;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f1073a;

    public a(float f2) {
        this.f1073a = f2;
    }

    @Override // G3.c
    public final float a(RectF rectF) {
        return this.f1073a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f1073a == ((a) obj).f1073a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1073a)});
    }
}
