package defpackage;

import defpackage.r7w;

/* loaded from: classes11.dex */
public final class ti61 extends r7w.a {
    public String a;
    public Long b;

    public final bj61 a() {
        String str = this.a;
        if (str != null) {
            return new bj61(str, this.b);
        }
        ny61.r("Missing required properties: nonce");
        return null;
    }

    public final ti61 b(long j) {
        this.b = Long.valueOf(j);
        return this;
    }

    public final ti61 c(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        ny61.t("Null nonce");
        return null;
    }
}
