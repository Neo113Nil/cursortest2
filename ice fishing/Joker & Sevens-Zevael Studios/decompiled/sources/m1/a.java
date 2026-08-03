package m1;

import a4.d;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import f8.c;
import org.xmlpull.v1.XmlPullParser;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f4853a;

    /* renamed from: b, reason: collision with root package name */
    public int f4854b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final c f4855c;

    public a(XmlResourceParser xmlResourceParser) {
        this.f4853a = xmlResourceParser;
        c cVar = new c(23, false);
        cVar.f2340h = new float[64];
        this.f4855c = cVar;
    }

    public final float a(TypedArray typedArray, String str, int i10, float f10) {
        if (z2.b.b(this.f4853a, str)) {
            f10 = typedArray.getFloat(i10, f10);
        }
        b(typedArray.getChangingConfigurations());
        return f10;
    }

    public final void b(int i10) {
        this.f4854b = i10 | this.f4854b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f4853a, aVar.f4853a) && this.f4854b == aVar.f4854b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4854b) + (this.f4853a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.f4853a);
        sb.append(", config=");
        return d.l(sb, this.f4854b, ')');
    }
}
