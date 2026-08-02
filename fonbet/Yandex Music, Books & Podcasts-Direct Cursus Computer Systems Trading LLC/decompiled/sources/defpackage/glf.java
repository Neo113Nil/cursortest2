package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class glf implements jlf {
    public final String a;
    public final boolean b;

    public glf(String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glf)) {
            return false;
        }
        glf glfVar = (glf) obj;
        return Intrinsics.d(this.a, glfVar.a) && this.b == glfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return v3w.e("ContextTitle(context=", this.a, ", showNotificationDot=", ")", this.b);
    }
}
