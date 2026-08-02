package defpackage;

import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1274w8;
import ru.kinopoisk.sdk.easylogin.internal.Z0;

/* loaded from: classes5.dex */
public final class yi2 implements Z0 {
    public final InterfaceC1274w8 a;

    public yi2(InterfaceC1274w8 interfaceC1274w8) {
        this.a = interfaceC1274w8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yi2) && this.a.equals(((yi2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BackOrReplaceRoot(screen=" + this.a + ")";
    }
}
