package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class naq extends faq {
    public final iiw c;
    public final uow d;
    public final mqs e;

    public naq(iiw iiwVar, uow uowVar, mqs mqsVar) {
        mqsVar.getClass();
        this.c = iiwVar;
        this.d = uowVar;
        this.e = mqsVar;
    }

    @Override // defpackage.mwk
    public final mqs a() {
        return this.e;
    }

    @Override // defpackage.mwk
    public final v80 c() {
        uow uowVar = this.d;
        String str = uowVar.c;
        String str2 = uowVar.h;
        if (str2 == null) {
            str2 = avf.G("restored");
        }
        String str3 = uowVar.i;
        if (str3 == null) {
            str3 = weo.t();
        }
        return new v80(str, new gxc(str2, str3), null);
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
        if (!naq.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        naq naqVar = (naq) obj;
        return Intrinsics.d(this.c, naqVar.c) && Intrinsics.d(this.d, naqVar.d) && Intrinsics.d(this.e, naqVar.e) && Intrinsics.d(b(), naqVar.b());
    }

    public final int hashCode() {
        return b().hashCode() + k5r.c((this.d.hashCode() + (this.c.hashCode() * 31)) * 31, 31, this.e.a);
    }

    public final String toString() {
        return "TrackPlayable(playableId=" + rwk.b(b()) + ", connectTrack=" + this.d + ", musicTrack=" + this.e + ")";
    }
}
