package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g7e {
    public final String a;
    public final LinkedHashMap b;
    public final InputStream c;

    public g7e(String str, LinkedHashMap linkedHashMap, ByteArrayInputStream byteArrayInputStream) {
        this.a = str;
        this.b = linkedHashMap;
        this.c = byteArrayInputStream;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g7e)) {
            return false;
        }
        g7e g7eVar = (g7e) obj;
        if (!this.a.equals(g7eVar.a)) {
            return false;
        }
        a7e a7eVar = a7e.a;
        return a7eVar.equals(a7eVar) && this.b.equals(g7eVar.b) && Intrinsics.d(this.c, g7eVar.c);
    }

    public final int hashCode() {
        int hashCode = (((this.b.hashCode() + (((this.a.hashCode() * 31) + 1472556622) * 31)) * 31) - 43840953) * 31;
        InputStream inputStream = this.c;
        return hashCode + (inputStream == null ? 0 : inputStream.hashCode());
    }

    public final String toString() {
        return "HttpRequestImpl(url=" + this.a + ", httpMethod=" + a7e.a + ", headers=" + this.b + ", contentType=application/json, bodyInputStream=" + this.c + ')';
    }
}
