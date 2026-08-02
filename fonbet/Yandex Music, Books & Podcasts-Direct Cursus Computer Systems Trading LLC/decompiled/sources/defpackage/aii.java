package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class aii extends bii {
    public final Object a;
    public final MusicBackendInvocationInfo b;

    public aii(Object obj, MusicBackendInvocationInfo musicBackendInvocationInfo) {
        this.a = obj;
        this.b = musicBackendInvocationInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aii)) {
            return false;
        }
        aii aiiVar = (aii) obj;
        return Intrinsics.d(this.a, aiiVar.a) && Intrinsics.d(this.b, aiiVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        MusicBackendInvocationInfo musicBackendInvocationInfo = this.b;
        return hashCode + (musicBackendInvocationInfo != null ? musicBackendInvocationInfo.hashCode() : 0);
    }

    public final String toString() {
        return "Ok(dto=" + this.a + ", info=" + this.b + ")";
    }
}
