package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class saq extends faq {
    public final miw c;
    public final uow d;
    public final x1u e;

    public saq(miw miwVar, uow uowVar, x1u x1uVar) {
        this.c = miwVar;
        this.d = uowVar;
        this.e = x1uVar;
    }

    @Override // defpackage.mwk
    public final mqs a() {
        return null;
    }

    @Override // defpackage.mwk
    public final v80 c() {
        uow uowVar = this.d;
        String str = uowVar.c;
        String str2 = uowVar.h;
        String G = str2 == null ? avf.G("restored") : str2;
        if (str2 == null) {
            str2 = weo.t();
        }
        return new v80(str, new gxc(G, str2), null);
    }

    @Override // defpackage.faq
    public final kiw d() {
        return this.c;
    }

    @Override // defpackage.faq
    public final uow e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!saq.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        saq saqVar = (saq) obj;
        return Intrinsics.d(this.c, saqVar.c) && Intrinsics.d(this.d, saqVar.d) && Intrinsics.d(this.e, saqVar.e) && Intrinsics.d(b(), saqVar.b());
    }

    public final int hashCode() {
        return b().hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + (this.c.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VideoClipPlayable(playableId=" + rwk.b(b()) + ", connectSource=" + this.d + ", videoClip=" + this.e + ")";
    }
}
