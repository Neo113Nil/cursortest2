package defpackage;

/* loaded from: classes4.dex */
public final class daq extends faq {
    public final jiw c;
    public final uow d;
    public final e5d e;

    public daq(jiw jiwVar, uow uowVar, e5d e5dVar) {
        jiwVar.getClass();
        e5dVar.getClass();
        this.c = jiwVar;
        this.d = uowVar;
        this.e = e5dVar;
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

    public final String toString() {
        return "GenerativePlayable(playableId=" + rwk.b(b()) + ", generativeStream=" + this.e + ")";
    }
}
