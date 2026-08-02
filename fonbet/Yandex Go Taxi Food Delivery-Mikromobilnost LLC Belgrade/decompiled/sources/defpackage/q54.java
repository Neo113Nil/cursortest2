package defpackage;

import defpackage.c3f;

/* loaded from: classes11.dex */
public final class q54 extends c3f.e.d.AbstractC0026e.b.a {
    public String a;
    public String b;

    public final r54 a() {
        String str;
        String str2 = this.a;
        if (str2 != null && (str = this.b) != null) {
            return new r54(str2, str);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutId");
        }
        if (this.b == null) {
            sb.append(" variantId");
        }
        ny61.r(x4e.g("Missing required properties:", sb));
        return null;
    }

    public final q54 b(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        ny61.t("Null rolloutId");
        return null;
    }

    public final q54 c(String str) {
        if (str != null) {
            this.b = str;
            return this;
        }
        ny61.t("Null variantId");
        return null;
    }
}
