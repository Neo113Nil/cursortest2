package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class u6l0 implements z6l0 {
    public final String a;
    public final List b;
    public final atj0 c;
    public final Integer d;
    public final String e;
    public final Integer f;

    public u6l0(String str, List list, atj0 atj0Var, Integer num, String str2, Integer num2) {
        this.a = str;
        this.b = list;
        this.c = atj0Var;
        this.d = num;
        this.e = str2;
        this.f = num2;
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
