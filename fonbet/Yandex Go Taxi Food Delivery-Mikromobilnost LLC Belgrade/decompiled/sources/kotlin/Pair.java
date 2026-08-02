package kotlin;

import defpackage.jl40;
import defpackage.qv10;
import java.io.Serializable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004R\u0017\u0010\u0005\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lkotlin/Pair;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "second", "f", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    /* JADX WARN: Multi-variable type inference failed */
    public Pair(Object obj, Object obj2) {
        this.first = obj;
        this.second = obj2;
    }

    /* renamed from: a, reason: from getter */
    public final Object getFirst() {
        return this.first;
    }

    /* renamed from: b, reason: from getter */
    public final Object getSecond() {
        return this.second;
    }

    public final Object c() {
        return this.first;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return jl40.l(this.first, pair.first) && jl40.l(this.second, pair.second);
    }

    public final Object f() {
        return this.second;
    }

    public final int hashCode() {
        A a = this.first;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.second;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Extension.O_BRAKE);
        sb.append(this.first);
        sb.append(Extension.FIX_SPACE);
        return qv10.r(sb, this.second, ')');
    }
}
