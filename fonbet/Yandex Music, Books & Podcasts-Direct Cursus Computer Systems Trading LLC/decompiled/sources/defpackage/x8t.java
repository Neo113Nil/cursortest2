package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@vhp
/* loaded from: classes5.dex */
public final class x8t {

    @NotNull
    public static final p8t Companion = new p8t();
    public final w8t a;
    public final w8t b;

    public /* synthetic */ x8t(int i, w8t w8tVar, w8t w8tVar2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = w8tVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = w8tVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8t)) {
            return false;
        }
        x8t x8tVar = (x8t) obj;
        return Intrinsics.d(this.a, x8tVar.a) && Intrinsics.d(this.b, x8tVar.b);
    }

    public final int hashCode() {
        w8t w8tVar = this.a;
        int hashCode = (w8tVar == null ? 0 : w8tVar.hashCode()) * 31;
        w8t w8tVar2 = this.b;
        return hashCode + (w8tVar2 != null ? w8tVar2.hashCode() : 0);
    }

    public final String toString() {
        return "TransitionSettingsSurrogate(onShow=" + this.a + ", onHide=" + this.b + ")";
    }
}
