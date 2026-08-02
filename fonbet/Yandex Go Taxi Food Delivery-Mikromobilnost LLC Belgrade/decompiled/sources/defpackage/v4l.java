package defpackage;

import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class v4l {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final JSONObject d;
    public final float e;

    public v4l(boolean z, boolean z2, boolean z3, JSONObject jSONObject, float f) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = jSONObject;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v4l)) {
            return false;
        }
        v4l v4lVar = (v4l) obj;
        return this.a == v4lVar.a && this.b == v4lVar.b && this.c == v4lVar.c && jl40.l(this.d, v4lVar.d) && Float.compare(this.e, v4lVar.e) == 0;
    }

    public final int hashCode() {
        int e = unr0.e(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        JSONObject jSONObject = this.d;
        return Float.hashCode(this.e) + ((e + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DivPlayerPlaybackConfig(autoplay=");
        sb.append(this.a);
        sb.append(", isMuted=");
        sb.append(this.b);
        sb.append(", repeatable=");
        sb.append(this.c);
        sb.append(", payload=");
        sb.append(this.d);
        sb.append(", playbackSpeed=");
        return n.n(sb, this.e, ')');
    }

    public v4l() {
        this(false, false, false, null, 1.0f);
    }
}
