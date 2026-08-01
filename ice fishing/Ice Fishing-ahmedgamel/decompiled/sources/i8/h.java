package i8;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f38122a = true;

    /* renamed from: b, reason: collision with root package name */
    public boolean f38123b;

    /* renamed from: c, reason: collision with root package name */
    public Object f38124c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f38125d;

    public i a() {
        return new i(this.f38122a, this.f38123b, (String[]) this.f38124c, (String[]) this.f38125d);
    }

    public void b(f... cipherSuites) {
        kotlin.jvm.internal.h.e(cipherSuites, "cipherSuites");
        if (!this.f38122a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (f fVar : cipherSuites) {
            arrayList.add(fVar.f38113a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... cipherSuites) {
        kotlin.jvm.internal.h.e(cipherSuites, "cipherSuites");
        if (!this.f38122a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        Object[] copyOf = Arrays.copyOf(cipherSuites, cipherSuites.length);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        this.f38124c = (String[]) copyOf;
    }

    public void d(z... zVarArr) {
        if (!this.f38122a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(zVarArr.length);
        for (z zVar : zVarArr) {
            arrayList.add(zVar.f38272n);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        e((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Serializable, java.lang.String[]] */
    public void e(String... tlsVersions) {
        kotlin.jvm.internal.h.e(tlsVersions, "tlsVersions");
        if (!this.f38122a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        Object[] copyOf = Arrays.copyOf(tlsVersions, tlsVersions.length);
        kotlin.jvm.internal.h.d(copyOf, "copyOf(...)");
        this.f38125d = (String[]) copyOf;
    }
}
