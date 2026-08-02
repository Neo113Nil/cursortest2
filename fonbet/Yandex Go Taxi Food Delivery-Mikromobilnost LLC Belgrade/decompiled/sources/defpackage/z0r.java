package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.internal.net.file.FileProgressObservable$Listener$Status;

/* loaded from: classes15.dex */
public final class z0r implements e1k {
    public final String a;
    public final Handler b;
    public final Handler c;
    public w0r w;
    public final /* synthetic */ a1r x;

    public z0r(a1r a1rVar, String str, w0r w0rVar) {
        this.x = a1rVar;
        Handler handler = new Handler(a1rVar.e);
        this.b = handler;
        this.a = str;
        this.w = w0rVar;
        this.c = new Handler();
        handler.post(new qpo(7, this, str));
    }

    public final void a(FileProgressObservable$Listener$Status fileProgressObservable$Listener$Status) {
        this.c.post(new qpo(8, this, fileProgressObservable$Listener$Status));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Handler handler = this.c;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        this.w = null;
        handler.removeCallbacksAndMessages(null);
        Handler handler2 = this.b;
        handler2.removeCallbacksAndMessages(null);
        handler2.post(new ejp(4, this));
    }
}
