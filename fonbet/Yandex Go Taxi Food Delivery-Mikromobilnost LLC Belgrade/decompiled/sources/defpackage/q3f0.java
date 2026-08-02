package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.core.net.entities.chatcreate.AddRemoveUserError;

/* loaded from: classes15.dex */
public final class q3f0 {
    public final h3y a;
    public final Handler b = new Handler(Looper.getMainLooper());
    public final zq60 c = new zq60();

    public q3f0(h3y h3yVar) {
        this.a = h3yVar;
    }

    public final void a(AddRemoveUserError[] addRemoveUserErrorArr) {
        if (addRemoveUserErrorArr == null || addRemoveUserErrorArr.length == 0) {
            return;
        }
        z83.g(null, this.a.get(), Looper.myLooper());
        this.b.post(new p3f0(this, addRemoveUserErrorArr));
    }
}
