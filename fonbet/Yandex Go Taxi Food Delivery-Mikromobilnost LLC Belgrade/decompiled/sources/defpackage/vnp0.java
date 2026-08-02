package defpackage;

/* loaded from: classes13.dex */
public final class vnp0 {
    public final String a;

    public /* synthetic */ vnp0(String str) {
        this.a = str;
    }

    public static void a(String str) {
        if (evu0.J(str)) {
            ny61.g("SdkComponentTag value must not be blank");
        } else {
            if (str.equals(evu0.k0(str).toString())) {
                return;
            }
            ny61.g("SdkComponentTag value must not contain surrounding whitespace");
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vnp0) {
            return jl40.l(this.a, ((vnp0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
