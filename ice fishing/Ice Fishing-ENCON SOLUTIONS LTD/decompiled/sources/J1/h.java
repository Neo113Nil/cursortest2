package J1;

import android.os.Bundle;
import j.C0965f;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f866a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f867b;

    /* renamed from: c, reason: collision with root package name */
    public Object f868c;

    /* renamed from: d, reason: collision with root package name */
    public Object f869d;

    public h(int i2) {
        switch (i2) {
            case 1:
                this.f868c = new C0965f();
                break;
            default:
                this.f866a = true;
                break;
        }
    }

    public i a() {
        return new i(this.f866a, this.f867b, (String[]) this.f868c, (String[]) this.f869d);
    }

    public void b(g... cipherSuites) {
        kotlin.jvm.internal.i.e(cipherSuites, "cipherSuites");
        if (!this.f866a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(cipherSuites.length);
        for (g gVar : cipherSuites) {
            arrayList.add(gVar.f865a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        c((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void c(String... cipherSuites) {
        kotlin.jvm.internal.i.e(cipherSuites, "cipherSuites");
        if (!this.f866a) {
            throw new IllegalArgumentException("no cipher suites for cleartext connections");
        }
        if (cipherSuites.length == 0) {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        this.f868c = (String[]) cipherSuites.clone();
    }

    public Bundle d(String str) {
        if (!this.f867b) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle = (Bundle) this.f869d;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle.getBundle(str);
        Bundle bundle3 = (Bundle) this.f869d;
        if (bundle3 != null) {
            bundle3.remove(str);
        }
        Bundle bundle4 = (Bundle) this.f869d;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f869d = null;
        }
        return bundle2;
    }

    public void e(B... bArr) {
        if (!this.f866a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (B b2 : bArr) {
            arrayList.add(b2.f812a);
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        String[] strArr = (String[]) array;
        f((String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public void f(String... tlsVersions) {
        kotlin.jvm.internal.i.e(tlsVersions, "tlsVersions");
        if (!this.f866a) {
            throw new IllegalArgumentException("no TLS versions for cleartext connections");
        }
        if (tlsVersions.length == 0) {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        this.f869d = (String[]) tlsVersions.clone();
    }
}
