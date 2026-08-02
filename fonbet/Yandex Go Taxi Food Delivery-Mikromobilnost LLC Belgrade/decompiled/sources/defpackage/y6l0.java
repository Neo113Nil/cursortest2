package defpackage;

import java.util.List;

/* loaded from: classes14.dex */
public final class y6l0 implements z6l0 {
    public final String a;
    public final List b;
    public final atj0 c;

    public y6l0(String str, List list, atj0 atj0Var) {
        this.a = str;
        this.b = list;
        this.c = atj0Var;
    }

    @Override // defpackage.z6l0
    public final List a() {
        return this.b;
    }

    @Override // defpackage.z6l0
    public final atj0 b() {
        return this.c;
    }

    @Override // defpackage.z6l0
    public final String getRouteUri() {
        return this.a;
    }
}
