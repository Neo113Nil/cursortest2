package H0;

import D.x;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final String f1185a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1186b;

    public c(String str) {
        this.f1185a = str;
        this.f1186b = 0;
    }

    public final String a() {
        int i = this.f1186b;
        if (i == 0) {
            return this.f1185a;
        }
        throw new IllegalStateException(x.p(new StringBuilder("Wrong data accessor type detected. "), i != 0 ? i != 1 ? "Unknown" : "ArrayBuffer" : "String", " expected, but got ", "String"));
    }

    public c(byte[] bArr) {
        Objects.requireNonNull(bArr);
        this.f1185a = null;
        this.f1186b = 1;
    }
}
