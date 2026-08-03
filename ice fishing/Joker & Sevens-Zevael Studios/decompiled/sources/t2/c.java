package t2;

import java.util.Arrays;
import m6.i;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f6516a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f6517b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.f6516a = fArr;
        this.f6517b = fArr2;
    }

    @Override // t2.a
    public final float a(float f10) {
        return i.d(f10, this.f6517b, this.f6516a);
    }

    @Override // t2.a
    public final float b(float f10) {
        return i.d(f10, this.f6516a, this.f6517b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f6516a, cVar.f6516a) && Arrays.equals(this.f6517b, cVar.f6517b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6517b) + (Arrays.hashCode(this.f6516a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String arrays = Arrays.toString(this.f6516a);
        j.d(arrays, "toString(...)");
        sb.append(arrays);
        sb.append(", toDpValues=");
        String arrays2 = Arrays.toString(this.f6517b);
        j.d(arrays2, "toString(...)");
        sb.append(arrays2);
        sb.append('}');
        return sb.toString();
    }
}
