package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.internal.LocalMessageRef;
import com.yandex.messaging.internal.authorized.chat.b;

/* loaded from: classes15.dex */
public final class qhs0 implements e1k, a9b, ybz0 {
    public final Handler a = new Handler();
    public final LocalMessageRef b;
    public ct21 c;
    public mmp0 w;
    public ru10 x;

    public qhs0(b bVar, ChatRequest chatRequest, LocalMessageRef localMessageRef, mmp0 mmp0Var) {
        this.b = localMessageRef;
        this.w = mmp0Var;
        this.c = bVar.e(chatRequest, this);
    }

    @Override // defpackage.a9b
    public final void B(j9b j9bVar) {
        this.x = j9bVar.a().a(this.b);
    }

    @Override // defpackage.ybz0
    public final void c(ru10 ru10Var) {
        this.a.post(new epo0(25, this, ru10Var));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.a9b
    public final void close() {
        tje.e();
        this.w = null;
        ct21 ct21Var = this.c;
        if (ct21Var != null) {
            ct21Var.close();
            this.c = null;
        }
    }

    @Override // defpackage.a9b
    public final e1k w(s020 s020Var) {
        zbz0 g = ((m8g) s020Var).g();
        z83.g(null, g.a.get(), Looper.myLooper());
        return new s2r(g, this, this.b);
    }
}
