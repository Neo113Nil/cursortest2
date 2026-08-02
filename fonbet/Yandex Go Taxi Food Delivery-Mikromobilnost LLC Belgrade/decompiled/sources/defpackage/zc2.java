package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes10.dex */
public final class zc2 {
    public final XmlPullParser a;
    public int b = 0;
    public final zr90 c = new zr90();

    public zc2(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        float f2 = uvb1.f(typedArray, this.a, str, i, f);
        b(typedArray.getChangingConfigurations());
        return f2;
    }

    public final void b(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc2)) {
            return false;
        }
        zc2 zc2Var = (zc2) obj;
        return jl40.l(this.a, zc2Var.a) && this.b == zc2Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return oyr.s(sb, this.b, ')');
    }
}
