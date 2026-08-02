package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes14.dex */
public final class v8i0 {
    public static final v8i0 c;
    public final UiStateDrawableWrapper a;
    public final kdc b;

    static {
        UiStateDrawableWrapper uiStateDrawableWrapper;
        UiStateDrawableWrapper.Companion.getClass();
        uiStateDrawableWrapper = UiStateDrawableWrapper.EMPTY;
        c = new v8i0(uiStateDrawableWrapper, null);
    }

    public v8i0(UiStateDrawableWrapper uiStateDrawableWrapper, kdc kdcVar) {
        this.a = uiStateDrawableWrapper;
        this.b = kdcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v8i0)) {
            return false;
        }
        v8i0 v8i0Var = (v8i0) obj;
        return jl40.l(this.a, v8i0Var.a) && jl40.l(this.b, v8i0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        kdc kdcVar = this.b;
        return hashCode + (kdcVar == null ? 0 : kdcVar.hashCode());
    }

    public final String toString() {
        return "Decoration(image=" + this.a + ", animationColor=" + this.b + Extension.C_BRAKE;
    }
}
