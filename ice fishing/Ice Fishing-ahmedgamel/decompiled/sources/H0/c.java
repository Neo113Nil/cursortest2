package H0;

import D.y;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f1082a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1083b;

    public c(String str) {
        this.f1082a = str;
        this.f1083b = 0;
    }

    public final String a() {
        int i = this.f1083b;
        if (i == 0) {
            return this.f1082a;
        }
        throw new IllegalStateException(y.s(new StringBuilder("Wrong data accessor type detected. "), i != 0 ? i != 1 ? "Unknown" : "ArrayBuffer" : "String", " expected, but got ", "String"));
    }

    public c(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f1082a = null;
        this.f1083b = 1;
    }
}
