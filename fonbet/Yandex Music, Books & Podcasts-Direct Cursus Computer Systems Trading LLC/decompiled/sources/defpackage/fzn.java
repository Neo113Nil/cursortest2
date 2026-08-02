package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class fzn extends gzn {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Integer g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final Long n;
    public final Long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fzn(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, String str8, String str9, String str10, Long l, Long l2) {
        super(str2, str3);
        vgb vgbVar = vgb.Network;
        agb agbVar = agb.GetFileInfo;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = num;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = l;
        this.o = l2;
    }

    @Override // defpackage.pxm
    public final String a() {
        return this.e;
    }

    @Override // defpackage.pxm
    public final String b() {
        return this.d;
    }

    @Override // defpackage.gzn, defpackage.pxm
    public final void d(p3i p3iVar) {
        super.d(p3iVar);
        p3iVar.d("causeClassName", this.j);
        String str = this.i;
        if (str != null) {
            p3iVar.d(Constants.KEY_MESSAGE, str);
        }
        p3iVar.b(new rjp(this.k), "causeMessage");
        String str2 = this.l;
        if (str2 != null) {
            p3iVar.b(new rjp(str2, (Function1) new q1h(this, str2, 28)), "stack");
        }
        p3iVar.d("rendererErrorType", this.m);
        Long l = this.n;
        if (l != null) {
            p3iVar.c(Long.valueOf(l.longValue()), "currentPositionMs");
        }
        Long l2 = this.o;
        if (l2 != null) {
            p3iVar.c(Long.valueOf(l2.longValue()), "durationMs");
        }
    }

    @Override // defpackage.gzn
    public final Integer e() {
        return this.g;
    }

    @Override // defpackage.gzn
    public final String f() {
        return this.f;
    }

    @Override // defpackage.gzn
    public final String g() {
        return this.c;
    }

    @Override // defpackage.gzn
    public final String h() {
        return this.h;
    }

    @Override // defpackage.gzn
    public final agb i() {
        return agb.Renderer;
    }

    @Override // defpackage.gzn
    public final vgb j() {
        return vgb.Unknown;
    }
}
