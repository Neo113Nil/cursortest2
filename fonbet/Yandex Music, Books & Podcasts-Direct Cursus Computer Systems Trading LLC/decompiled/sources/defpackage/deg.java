package defpackage;

import java.util.Map;

/* loaded from: classes5.dex */
public abstract class deg {
    public abstract String a();

    public abstract ceg b(wdg wdgVar);

    public abstract lwi c(Map map);

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(a(), "policy");
        Y.m(5, "priority");
        Y.t("available", true);
        return Y.toString();
    }
}
