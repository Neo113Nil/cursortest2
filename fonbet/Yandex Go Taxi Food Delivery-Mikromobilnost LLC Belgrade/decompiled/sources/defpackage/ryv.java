package defpackage;

import android.view.View;
import com.yandex.messaging.input.c;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.view.input.edit.a;

/* loaded from: classes15.dex */
public final class ryv {
    public final h3y a;
    public final h3y b;
    public final h3y c;
    public final h3y d;
    public boolean e;

    public ryv(h3y h3yVar, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4) {
        this.a = h3yVar;
        this.b = h3yVar2;
        this.c = h3yVar3;
        this.d = h3yVar4;
    }

    public final void a(ServerMessageRef serverMessageRef) {
        ((ycz0) this.c.get()).a();
        this.e = true;
        a aVar = (a) this.a.get();
        aVar.L = new tzt(16, this);
        aVar.F.requestFocusAndOpenKeyboard();
        aVar.J.bind(aVar.C, (View) serverMessageRef, (ServerMessageRef) null);
        ((c) this.b.get()).c();
    }
}
