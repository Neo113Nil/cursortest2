package bo.app;

import com.braze.models.IPutIntoJson;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c1 implements IPutIntoJson {
    public final String a;

    public c1(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && Intrinsics.areEqual(this.a, ((c1) obj).a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
