package defpackage;

import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class luq {
    public final float a;
    public final float b;
    public final Typeface c;
    public final float d;
    public final float e;
    public final int f;

    public luq(float f, float f2, Typeface typeface, float f3, float f4, int i) {
        this.a = f;
        this.b = f2;
        this.c = typeface;
        this.d = f3;
        this.e = f4;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof luq)) {
            return false;
        }
        luq luqVar = (luq) obj;
        return Float.compare(this.a, luqVar.a) == 0 && Float.compare(this.b, luqVar.b) == 0 && Intrinsics.d(this.c, luqVar.c) && Float.compare(this.d, luqVar.d) == 0 && Float.compare(this.e, luqVar.e) == 0 && this.f == luqVar.f;
    }

    public final int hashCode() {
        return f1d.a(this.f, eta.a(eta.a((this.c.hashCode() + eta.a(Float.hashCode(this.a) * 31, this.b, 31)) * 31, this.d, 31), this.e, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SliderTextStyle(fontSize=");
        sb.append(this.a);
        sb.append(", spacing=");
        sb.append(this.b);
        sb.append(", fontWeight=");
        sb.append(this.c);
        sb.append(", offsetX=");
        sb.append(this.d);
        sb.append(", offsetY=");
        sb.append(this.e);
        sb.append(", textColor=");
        return f1d.i(sb, this.f, ", fontVariations=null)");
    }
}
