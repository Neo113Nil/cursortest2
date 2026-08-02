package defpackage;

import com.google.gson.JsonObject;

/* loaded from: classes3.dex */
public final class kxb {
    public final String a;
    public final JsonObject b;

    public kxb(String str, JsonObject jsonObject) {
        this.a = str;
        this.b = jsonObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kxb)) {
            return false;
        }
        kxb kxbVar = (kxb) obj;
        return this.a.equals(kxbVar.a) && this.b.equals(kxbVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExperimentDetailsData(name=" + this.a + ", details=" + this.b + ")";
    }
}
