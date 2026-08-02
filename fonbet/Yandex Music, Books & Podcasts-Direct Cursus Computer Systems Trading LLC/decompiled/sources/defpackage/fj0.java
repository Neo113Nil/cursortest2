package defpackage;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class fj0 {
    public final XmlPullParser a;
    public int b = 0;
    public final g8c c;

    public fj0(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        g8c g8cVar = new g8c();
        g8cVar.a = new float[64];
        this.c = g8cVar;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (pcg.F(str, this.a)) {
            f = typedArray.getFloat(i, f);
        }
        b(typedArray.getChangingConfigurations());
        return f;
    }

    public final void b(int i) {
        this.b = i | this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj0)) {
            return false;
        }
        fj0 fj0Var = (fj0) obj;
        return Intrinsics.d(this.a, fj0Var.a) && this.b == fj0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return vz1.r(sb, this.b, ')');
    }
}
