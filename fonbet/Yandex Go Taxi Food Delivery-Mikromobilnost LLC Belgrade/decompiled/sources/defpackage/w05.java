package defpackage;

import com.yandex.messaging.input.b;

/* loaded from: classes15.dex */
public final class w05 extends btn {
    public final /* synthetic */ b a;

    public w05(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.btn
    public final void a(Throwable th) {
        b bVar = this.a;
        bVar.h = null;
        bVar.b();
        bVar.d.reportError("tech_emoji_initializaition_failed", th);
    }

    @Override // defpackage.btn
    public final void b() {
        b bVar = this.a;
        bVar.i = true;
        bVar.h = null;
        bVar.b();
    }
}
