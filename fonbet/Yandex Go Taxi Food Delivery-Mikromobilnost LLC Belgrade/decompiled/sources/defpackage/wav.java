package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class wav {
    public final String a;
    public final Exception b;

    public wav(String str, Exception exc) {
        this.a = str;
        this.b = exc;
    }

    public final String a() {
        return this.a;
    }

    public final Exception b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wav)) {
            return false;
        }
        wav wavVar = (wav) obj;
        return jl40.l(this.a, wavVar.a) && this.b.equals(wavVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "ImageLoadingErrorPayload(imageUrl=" + this.a + ", stackTraceException=" + this.b + Extension.C_BRAKE;
    }
}
