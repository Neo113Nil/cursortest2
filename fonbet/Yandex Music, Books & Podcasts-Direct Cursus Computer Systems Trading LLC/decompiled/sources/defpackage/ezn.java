package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class ezn extends gzn {
    public final String c;
    public final vgb d;
    public final agb e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;
    public final String j;
    public final String k;
    public final String l;

    public ezn(String str, vgb vgbVar, agb agbVar, String str2, String str3, String str4, Integer num, String str5, String str6, String str7) {
        super(str2, str3);
        this.c = str;
        this.d = vgbVar;
        this.e = agbVar;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = num;
        this.j = str5;
        this.k = str6;
        this.l = str7;
    }

    @Override // defpackage.pxm
    public final String a() {
        return this.g;
    }

    @Override // defpackage.pxm
    public final String b() {
        return this.f;
    }

    @Override // defpackage.gzn, defpackage.pxm
    public final void d(p3i p3iVar) {
        super.d(p3iVar);
        p3iVar.b(new rjp(this.k), "fullName");
        String str = this.l;
        if (str != null) {
            p3iVar.b(new rjp(str, (Function1) new q1h(this, str, 27)), "stack");
        }
    }

    @Override // defpackage.gzn
    public final Integer e() {
        return this.i;
    }

    @Override // defpackage.gzn
    public final String f() {
        return this.h;
    }

    @Override // defpackage.gzn
    public final String g() {
        return this.c;
    }

    @Override // defpackage.gzn
    public final String h() {
        return this.j;
    }

    @Override // defpackage.gzn
    public final agb i() {
        return this.e;
    }

    @Override // defpackage.gzn
    public final vgb j() {
        return this.d;
    }
}
