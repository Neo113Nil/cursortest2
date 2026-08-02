package defpackage;

import ru.yandex.video.m3.player.PreparingParams;

/* loaded from: classes6.dex */
public final class rku implements u9l, tx7 {
    public static final ujl c = new ujl();
    public volatile qku a;
    public volatile paw b;

    @Override // defpackage.tx7
    public final void a(paw pawVar) {
        paw pawVar2;
        this.b = pawVar;
        qku qkuVar = this.a;
        if (qkuVar != null && (pawVar2 = this.b) != null) {
            pawVar2.F(qkuVar);
        }
        this.a = null;
        paw pawVar3 = this.b;
        if (pawVar3 != null) {
            qku qkuVar2 = new qku(pawVar3, new ihs(c));
            this.a = qkuVar2;
            pawVar3.I(qkuVar2);
            this.a = qkuVar2;
        }
        pawVar.w(this);
    }

    @Override // defpackage.tx7
    public final void e(paw pawVar) {
        paw pawVar2;
        qku qkuVar = this.a;
        if (qkuVar != null && (pawVar2 = this.b) != null) {
            pawVar2.F(qkuVar);
        }
        this.a = null;
        pawVar.q(this);
        this.b = null;
    }

    @Override // defpackage.u9l
    public final void j(PreparingParams preparingParams) {
        paw pawVar;
        preparingParams.getClass();
        qku qkuVar = this.a;
        if (qkuVar != null && (pawVar = this.b) != null) {
            pawVar.F(qkuVar);
        }
        this.a = null;
        paw pawVar2 = this.b;
        if (pawVar2 != null) {
            qku qkuVar2 = new qku(pawVar2, new ihs(c));
            this.a = qkuVar2;
            pawVar2.I(qkuVar2);
            this.a = qkuVar2;
        }
    }
}
