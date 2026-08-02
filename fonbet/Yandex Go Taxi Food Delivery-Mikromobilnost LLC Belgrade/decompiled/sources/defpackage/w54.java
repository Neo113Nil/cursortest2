package defpackage;

import defpackage.c3f;

/* loaded from: classes11.dex */
public final class w54 extends c3f.e.f.a {
    public String a;

    public final x54 a() {
        String str = this.a;
        if (str != null) {
            return new x54(str);
        }
        ny61.r("Missing required properties: identifier");
        return null;
    }

    public final w54 b(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        ny61.t("Null identifier");
        return null;
    }
}
