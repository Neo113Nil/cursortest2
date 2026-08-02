package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class qlu0 implements o7m {
    public final String a;
    public final String b;

    public qlu0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlu0)) {
            return false;
        }
        qlu0 qlu0Var = (qlu0) obj;
        return jl40.l(this.a, qlu0Var.a) && jl40.l(this.b, qlu0Var.b);
    }

    @Override // defpackage.o7m
    public final String getStoryId() {
        return this.a;
    }

    @Override // defpackage.o7m
    public final String getUrl() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("AnimationDownload(storyId=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
