package defpackage;

import java.util.List;
import kotlin.a;

/* loaded from: classes6.dex */
public final class sy30 extends wy30 {
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final String e;
    public final i3y f = a.a(new m020(29, this));

    public sy30(String str, List list, String str2, List list2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = str3;
    }

    @Override // defpackage.wy30
    public final String a() {
        return this.a;
    }

    @Override // defpackage.wy30
    public final String b() {
        return this.b;
    }

    public final List c() {
        return (List) this.f.getValue();
    }
}
