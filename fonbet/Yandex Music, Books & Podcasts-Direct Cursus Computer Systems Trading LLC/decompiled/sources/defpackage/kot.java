package defpackage;

import com.yandex.media.ynison.service.d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class kot {
    public final String a;
    public final d b;

    public kot(String str, d dVar) {
        str.getClass();
        this.a = str;
        this.b = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kot)) {
            return false;
        }
        kot kotVar = (kot) obj;
        return Intrinsics.d(this.a, kotVar.a) && this.b.equals(kotVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateVolumeMessage(deviceId=" + this.a + ", volume=" + this.b + ")";
    }
}
