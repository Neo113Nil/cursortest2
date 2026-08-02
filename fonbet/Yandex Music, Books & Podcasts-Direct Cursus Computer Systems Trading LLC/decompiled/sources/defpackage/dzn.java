package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class dzn extends gzn {
    public final /* synthetic */ int c = 2;
    public final String d;
    public final agb e;
    public final String f;
    public final String g;
    public final String h;
    public final Integer i;
    public final String j;
    public final String k;
    public final Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzn(String str, agb agbVar, String str2, String str3, String str4, String str5, String str6, Integer num, String str7) {
        super(str2, str3);
        vgb vgbVar = vgb.Network;
        str5.getClass();
        this.d = str;
        this.e = agbVar;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.j = str5;
        this.k = str6;
        this.i = num;
        this.l = str7;
    }

    @Override // defpackage.pxm
    public final String a() {
        switch (this.c) {
        }
        return this.g;
    }

    @Override // defpackage.pxm
    public final String b() {
        switch (this.c) {
        }
        return this.f;
    }

    @Override // defpackage.gzn, defpackage.pxm
    public final void d(p3i p3iVar) {
        switch (this.c) {
            case 0:
                super.d(p3iVar);
                p3iVar.d("container", this.h);
                p3iVar.d("uri", this.j);
                break;
            case 1:
                super.d(p3iVar);
                String str = this.k;
                if (str != null) {
                    p3iVar.d("uri", str);
                    break;
                }
                break;
            case 2:
                super.d(p3iVar);
                p3iVar.d("subType", ((vzi) this.l).a);
                p3iVar.d("code", String.valueOf(this.k));
                break;
            default:
                super.d(p3iVar);
                p3iVar.d("subType", ((jhr) this.l).a);
                String str2 = this.k;
                if (str2 != null) {
                    p3iVar.b(new rjp(str2, (Function1) new q1h(this, str2, 29)), "stack");
                    break;
                }
                break;
        }
    }

    @Override // defpackage.gzn
    public final Integer e() {
        switch (this.c) {
        }
        return this.i;
    }

    @Override // defpackage.gzn
    public final String f() {
        switch (this.c) {
        }
        return this.h;
    }

    @Override // defpackage.gzn
    public final String g() {
        switch (this.c) {
        }
        return this.d;
    }

    @Override // defpackage.gzn
    public final String h() {
        switch (this.c) {
        }
        return this.j;
    }

    @Override // defpackage.gzn
    public final agb i() {
        switch (this.c) {
        }
        return this.e;
    }

    @Override // defpackage.gzn
    public final vgb j() {
        switch (this.c) {
            case 0:
                return vgb.CacheOnlyExpected;
            case 1:
                return (vgb) this.l;
            case 2:
                return vgb.Network;
            default:
                return vgb.Storage;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzn(String str, agb agbVar, String str2, String str3, String str4, Integer num, String str5, vzi vziVar, String str6) {
        super(str2, str3);
        vgb vgbVar = vgb.Network;
        this.d = str;
        this.e = agbVar;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = num;
        this.j = str5;
        this.l = vziVar;
        this.k = str6;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dzn(String str, agb agbVar, String str2, String str3, jhr jhrVar, String str4, Integer num, String str5, String str6) {
        super(str2, str3);
        vgb vgbVar = vgb.Network;
        this.d = str;
        this.e = agbVar;
        this.f = str2;
        this.g = str3;
        this.l = jhrVar;
        this.h = str4;
        this.i = num;
        this.j = str5;
        this.k = str6;
    }

    public dzn(String str, vgb vgbVar, agb agbVar, String str2, String str3, String str4, Integer num, String str5, String str6) {
        super(str2, str3);
        this.d = str;
        this.l = vgbVar;
        this.e = agbVar;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = num;
        this.j = str5;
        this.k = str6;
    }
}
