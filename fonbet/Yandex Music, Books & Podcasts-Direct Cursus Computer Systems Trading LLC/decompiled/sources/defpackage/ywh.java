package defpackage;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ywh {
    public final Bitmap a;
    public final Map b;

    public ywh(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ywh)) {
            return false;
        }
        ywh ywhVar = (ywh) obj;
        return this.a.equals(ywhVar.a) && Intrinsics.d(this.b, ywhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Value(bitmap=");
        sb.append(this.a);
        sb.append(", extras=");
        return k5r.p(sb, this.b, ')');
    }
}
