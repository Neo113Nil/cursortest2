package kotlin;

import defpackage.jl40;
import defpackage.qv10;
import java.io.Serializable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005R\u0017\u0010\u0006\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\n\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u0017\u0010\f\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\t¨\u0006\u000e"}, d2 = {"Lkotlin/Triple;", "A", "B", CA20Status.STATUS_REQUEST_C, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "second", "g", "third", "h", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Triple<A, B, C> implements Serializable {
    private final A first;
    private final B second;
    private final C third;

    /* JADX WARN: Multi-variable type inference failed */
    public Triple(Object obj, Object obj2, Object obj3) {
        this.first = obj;
        this.second = obj2;
        this.third = obj3;
    }

    /* renamed from: a, reason: from getter */
    public final Object getFirst() {
        return this.first;
    }

    /* renamed from: b, reason: from getter */
    public final Object getSecond() {
        return this.second;
    }

    /* renamed from: c, reason: from getter */
    public final Object getThird() {
        return this.third;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return jl40.l(this.first, triple.first) && jl40.l(this.second, triple.second) && jl40.l(this.third, triple.third);
    }

    public final Object f() {
        return this.first;
    }

    public final Object g() {
        return this.second;
    }

    public final Object h() {
        return this.third;
    }

    public final int hashCode() {
        A a = this.first;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.second;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.third;
        return hashCode2 + (c != null ? c.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Extension.O_BRAKE);
        sb.append(this.first);
        sb.append(Extension.FIX_SPACE);
        sb.append(this.second);
        sb.append(Extension.FIX_SPACE);
        return qv10.r(sb, this.third, ')');
    }
}
