package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class cvo {
    public static final cvo i = new cvo(wjb.MainScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60);
    public final wjb a;
    public final hlb b;
    public final glb c;
    public final dvo d;
    public final avo e;
    public final zuo f;
    public final ilb g;
    public String h;

    public cvo(wjb wjbVar, hlb hlbVar, glb glbVar, dvo dvoVar, avo avoVar, zuo zuoVar) {
        wjbVar.getClass();
        hlbVar.getClass();
        glbVar.getClass();
        dvoVar.getClass();
        avoVar.getClass();
        zuoVar.getClass();
        this.a = wjbVar;
        this.b = hlbVar;
        this.c = glbVar;
        this.d = dvoVar;
        this.e = avoVar;
        this.f = zuoVar;
        this.g = wdg.Y(hlbVar);
        this.h = "";
    }

    public final String a() {
        if (StringsKt.U(this.h)) {
            this.h = eta.e();
        }
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvo)) {
            return false;
        }
        cvo cvoVar = (cvo) obj;
        return this.a == cvoVar.a && this.b == cvoVar.b && this.c == cvoVar.c && Intrinsics.d(this.d, cvoVar.d) && Intrinsics.d(this.e, cvoVar.e) && Intrinsics.d(this.f, cvoVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + k5r.c((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d.a)) * 31);
    }

    public final String toString() {
        return "ScreenInfo(appScreen=" + this.a + ", pageStyleEnum=" + this.b + ", pagePlacement=" + this.c + ", skeleton=" + this.d + ", screenDomainObject=" + this.e + ", screenData=" + this.f + ")";
    }

    public cvo(wjb wjbVar, dvo dvoVar, avo avoVar) {
        this(wjbVar, hlb.Fullscreen, glb.Fullscreen, dvoVar, avoVar, 32);
    }

    public cvo(wjb wjbVar, hlb hlbVar, glb glbVar, dvo dvoVar, avo avoVar, int i2) {
        this(wjbVar, hlbVar, (i2 & 4) != 0 ? glb.Fullscreen : glbVar, (i2 & 8) != 0 ? new dvo("") : dvoVar, (i2 & 16) != 0 ? new avo(pkb.NonApplicable, "") : avoVar, zuo.c);
    }
}
