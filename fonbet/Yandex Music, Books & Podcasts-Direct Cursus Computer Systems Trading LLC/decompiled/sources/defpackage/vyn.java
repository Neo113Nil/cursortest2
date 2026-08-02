package defpackage;

import kotlin.jvm.internal.Intrinsics;
import ru.kinopoisk.sdk.easylogin.internal.InterfaceC1274w8;
import ru.kinopoisk.sdk.easylogin.internal.Z0;

/* loaded from: classes5.dex */
public final class vyn implements Z0 {
    public final InterfaceC1274w8 a;

    public vyn(InterfaceC1274w8 interfaceC1274w8) {
        interfaceC1274w8.getClass();
        this.a = interfaceC1274w8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vyn) && Intrinsics.d(this.a, ((vyn) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Replace(screen=" + this.a + ")";
    }
}
