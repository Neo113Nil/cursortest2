package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class czn extends pxm {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final String h;
    public final String i;

    public czn(String str, String str2, String str3, String str4, Integer num, String str5, String str6) {
        super(str, str2);
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = num;
        this.h = str5;
        this.i = str6;
    }

    @Override // defpackage.pxm
    public final String a() {
        return this.d;
    }

    @Override // defpackage.pxm
    public final String b() {
        return this.c;
    }

    @Override // defpackage.pxm
    public final void d(p3i p3iVar) {
        super.d(p3iVar);
        String str = this.h;
        p3iVar.d("name", str);
        p3iVar.d("exceptionName", str);
        String str2 = this.e;
        if (str2 != null) {
            p3iVar.d("uuid", str2);
        }
        String str3 = this.f;
        if (str3 != null) {
            p3iVar.d("codec", str3);
        }
        Integer num = this.g;
        if (num != null) {
            p3iVar.c(Integer.valueOf(num.intValue()), "bitrate");
        }
        String str4 = this.i;
        if (str4 != null) {
            p3iVar.b(new rjp(str4, (Function1) new q1h(this, str4, 26)), "stackTrace");
        }
    }
}
