package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1274w8;
import ru.kinopoisk.sdk.easylogin.internal.Z0;

/* loaded from: classes5.dex */
public final class aj2 implements Z0 {
    public final InterfaceC1274w8 a;

    public aj2(InterfaceC1274w8 interfaceC1274w8) {
        this.a = interfaceC1274w8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aj2) && Intrinsics.d(this.a, ((aj2) obj).a);
    }

    public final int hashCode() {
        InterfaceC1274w8 interfaceC1274w8 = this.a;
        if (interfaceC1274w8 == null) {
            return 0;
        }
        return interfaceC1274w8.hashCode();
    }

    public final String toString() {
        return "BackTo(screen=" + this.a + ")";
    }
}
