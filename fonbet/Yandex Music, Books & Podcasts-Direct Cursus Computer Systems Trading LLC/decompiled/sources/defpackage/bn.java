package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class bn extends en {
    public final String a;
    public final List b;

    public bn(String str, List list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn)) {
            return false;
        }
        bn bnVar = (bn) obj;
        return Intrinsics.d(this.a, bnVar.a) && Intrinsics.d(this.b, bnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return dfi.h("SHOW_3DS_TRUSTED_URLS(url=", this.a, ", trustedUrls=", ")", this.b);
    }
}
