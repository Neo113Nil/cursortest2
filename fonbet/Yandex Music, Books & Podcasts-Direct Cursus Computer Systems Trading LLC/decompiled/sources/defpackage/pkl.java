package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pkl {
    public final hlb a;
    public final glb b;
    public final ajl c;
    public final String d;
    public final String e;
    public final ilb f;
    public final jyr g;
    public final jyr h;
    public final jyr i;

    public pkl(hlb hlbVar, glb glbVar, ajl ajlVar, String str, String str2) {
        ajlVar.getClass();
        this.a = hlbVar;
        this.b = glbVar;
        this.c = ajlVar;
        this.d = str;
        this.e = str2;
        this.f = wdg.Y(hlbVar);
        final int i = 0;
        this.g = btf.b(new Function0(this) { // from class: okl
            public final /* synthetic */ pkl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new avo(pkb.Track, this.b.c.a.b);
                    case 1:
                        return bkp.X(this.b.c());
                    default:
                        wjb wjbVar = wjb.PlayerScreen;
                        pkl pklVar = this.b;
                        hlb hlbVar2 = pklVar.a;
                        glb glbVar2 = pklVar.b;
                        ajl ajlVar2 = pklVar.c;
                        cvo cvoVar = new cvo(wjbVar, hlbVar2, glbVar2, new dvo(ajlVar2.b), pklVar.c(), new zuo(ajlVar2.a.a, pklVar.d));
                        String str3 = pklVar.e;
                        str3.getClass();
                        cvoVar.h = str3;
                        return cvoVar;
                }
            }
        });
        final int i2 = 1;
        this.h = btf.b(new Function0(this) { // from class: okl
            public final /* synthetic */ pkl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new avo(pkb.Track, this.b.c.a.b);
                    case 1:
                        return bkp.X(this.b.c());
                    default:
                        wjb wjbVar = wjb.PlayerScreen;
                        pkl pklVar = this.b;
                        hlb hlbVar2 = pklVar.a;
                        glb glbVar2 = pklVar.b;
                        ajl ajlVar2 = pklVar.c;
                        cvo cvoVar = new cvo(wjbVar, hlbVar2, glbVar2, new dvo(ajlVar2.b), pklVar.c(), new zuo(ajlVar2.a.a, pklVar.d));
                        String str3 = pklVar.e;
                        str3.getClass();
                        cvoVar.h = str3;
                        return cvoVar;
                }
            }
        });
        final int i3 = 2;
        this.i = btf.b(new Function0(this) { // from class: okl
            public final /* synthetic */ pkl b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new avo(pkb.Track, this.b.c.a.b);
                    case 1:
                        return bkp.X(this.b.c());
                    default:
                        wjb wjbVar = wjb.PlayerScreen;
                        pkl pklVar = this.b;
                        hlb hlbVar2 = pklVar.a;
                        glb glbVar2 = pklVar.b;
                        ajl ajlVar2 = pklVar.c;
                        cvo cvoVar = new cvo(wjbVar, hlbVar2, glbVar2, new dvo(ajlVar2.b), pklVar.c(), new zuo(ajlVar2.a.a, pklVar.d));
                        String str3 = pklVar.e;
                        str3.getClass();
                        cvoVar.h = str3;
                        return cvoVar;
                }
            }
        });
    }

    public static pkl a(pkl pklVar, ajl ajlVar, String str, String str2) {
        hlb hlbVar = pklVar.a;
        glb glbVar = pklVar.b;
        hlbVar.getClass();
        glbVar.getClass();
        ajlVar.getClass();
        str.getClass();
        str2.getClass();
        return new pkl(hlbVar, glbVar, ajlVar, str, str2);
    }

    public final mwk b() {
        return this.c.a.a;
    }

    public final avo c() {
        return (avo) this.g.getValue();
    }

    public final cvo d() {
        return (cvo) this.i.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkl)) {
            return false;
        }
        pkl pklVar = (pkl) obj;
        return this.a == pklVar.a && this.b == pklVar.b && Intrinsics.d(this.c, pklVar.c) && Intrinsics.d(this.d, pklVar.d) && Intrinsics.d(this.e, pklVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + k5r.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerScreenInfo(pageStyleEnum=");
        sb.append(this.a);
        sb.append(", pagePlacement=");
        sb.append(this.b);
        sb.append(", analyticsScreenState=");
        sb.append(this.c);
        sb.append(", loadedViewId=");
        sb.append(this.d);
        sb.append(", screenUuid=");
        return su4.o(sb, this.e, ")");
    }

    public pkl(hlb hlbVar, glb glbVar) {
        this(hlbVar, glbVar, ajl.d, "", "");
    }
}
