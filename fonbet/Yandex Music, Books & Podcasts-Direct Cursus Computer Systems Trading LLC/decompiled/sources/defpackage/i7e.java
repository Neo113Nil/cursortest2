package defpackage;

import java.io.InputStream;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i7e {
    public final Integer a;
    public final TreeMap b;
    public final InputStream c;

    public i7e(Integer num, TreeMap treeMap, InputStream inputStream) {
        this.a = num;
        this.b = treeMap;
        this.c = inputStream;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7e)) {
            return false;
        }
        i7e i7eVar = (i7e) obj;
        return this.a.equals(i7eVar.a) && this.b.equals(i7eVar.b) && Intrinsics.d(this.c, i7eVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        InputStream inputStream = this.c;
        return hashCode + (inputStream == null ? 0 : inputStream.hashCode());
    }

    public final String toString() {
        return "HttpResponseImpl(statusCode=" + this.a + ", headersMap=" + this.b + ", bodyInputStream=" + this.c + ')';
    }
}
