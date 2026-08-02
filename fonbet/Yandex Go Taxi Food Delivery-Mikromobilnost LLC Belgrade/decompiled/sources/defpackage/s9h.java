package defpackage;

import android.os.Looper;
import android.os.Message;
import com.yandex.plus.home.common.utils.DefaultDebouncer$handler$2$1;
import kotlin.a;

/* loaded from: classes2.dex */
public final class s9h implements ltg {
    public final long a;
    public final i3y b;

    public s9h(int i) {
        Looper mainLooper = Looper.getMainLooper();
        this.a = 500L;
        this.b = a.a(new ybf(24, mainLooper));
    }

    public final void a(sls slsVar) {
        if (b().hasMessages(1)) {
            return;
        }
        b().sendMessageDelayed(Message.obtain(b(), 1, new h60(16, slsVar)), this.a);
    }

    public final DefaultDebouncer$handler$2$1 b() {
        return (DefaultDebouncer$handler$2$1) this.b.getValue();
    }

    public final void c(sls slsVar) {
        b().removeMessages(1);
        b().sendMessage(Message.obtain(b(), 1, new h60(17, slsVar)));
    }

    public s9h() {
        this(0);
    }
}
