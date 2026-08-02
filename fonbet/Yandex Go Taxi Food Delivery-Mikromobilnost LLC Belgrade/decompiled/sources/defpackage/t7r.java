package defpackage;

import com.adjust.sdk.Constants;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class t7r {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MapBuilder e;

    public t7r(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("image_tag", str);
        mapBuilder.put(Constants.DEEPLINK, str2);
        mapBuilder.put("bg", str3);
        mapBuilder.put("accessibility_text", str4);
        this.e = mapBuilder.j();
    }

    public final MapBuilder a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t7r)) {
            return false;
        }
        t7r t7rVar = (t7r) obj;
        return jl40.l(this.a, t7rVar.a) && jl40.l(this.b, t7rVar.b) && jl40.l(this.c, t7rVar.c) && jl40.l(this.d, t7rVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("TrailInputButton(imageTag=", this.a, ", deeplink=", this.b, ", bg="), this.c, ", accessibilityText=", this.d, Extension.C_BRAKE);
    }
}
