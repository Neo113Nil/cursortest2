package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class sz20 implements uz20 {
    public final sls a;

    public sz20(sls slsVar) {
        this.a = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sz20) && this.a.equals(((sz20) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Hide(onAnimationFinish=" + this.a + Extension.C_BRAKE;
    }
}
