package bo.app;

import com.braze.models.IPutIntoJson;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ye implements IPutIntoJson {
    public final UUID a;
    public final String b;

    public ye(UUID uuid) {
        uuid.getClass();
        this.a = uuid;
        String uuid2 = uuid.toString();
        uuid2.getClass();
        this.b = uuid2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ye) && Intrinsics.areEqual(this.a, ((ye) obj).a);
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getPropertiesJSONObject() {
        return this.b;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.b;
    }
}
