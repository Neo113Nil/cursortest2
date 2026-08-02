package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final class yq7 {
    public final ArrayList a;
    public final l6v b;

    public yq7(ArrayList arrayList, l6v l6vVar) {
        this.a = arrayList;
        this.b = l6vVar;
        d6z.m("Camera ID set cannot be empty.", !arrayList.isEmpty());
    }

    public final String a() {
        ArrayList arrayList = this.a;
        d6z.y("getInternalId() is only available for single-camera identifiers.", arrayList.size() == 1);
        return (String) a.P(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq7)) {
            return false;
        }
        yq7 yq7Var = (yq7) obj;
        return this.a.equals(yq7Var.a) && jl40.l(this.b, yq7Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l6v l6vVar = this.b;
        return hashCode + (l6vVar != null ? l6vVar.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CameraIdentifier{cameraIds=");
        sb.append(a.X(this.a, ",", null, null, null, 62));
        l6v l6vVar = this.b;
        if (l6vVar != null) {
            str = ", compatId=" + l6vVar;
        } else {
            str = "";
        }
        return b64.p(sb, str, '}');
    }
}
