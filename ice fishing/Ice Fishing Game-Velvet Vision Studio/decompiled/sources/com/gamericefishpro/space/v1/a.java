package com.gamericefishpro.space.v1;

import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import com.gamericefishpro.space.tb.u;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final XmlPullParser a;
    public int b = 0;
    public final u c;

    public a(XmlResourceParser xmlResourceParser) {
        this.a = xmlResourceParser;
        u uVar = new u(2, false);
        uVar.e = new float[64];
        this.c = uVar;
    }

    public final float a(TypedArray typedArray, String str, int i, float f) {
        if (com.gamericefishpro.space.t3.b.c(this.a, str)) {
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.a(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.a);
        sb.append(", config=");
        return com.gamericefishpro.space.m5.a.i(sb, this.b, ')');
    }
}
