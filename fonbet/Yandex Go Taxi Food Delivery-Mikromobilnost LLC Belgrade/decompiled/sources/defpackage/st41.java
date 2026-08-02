package defpackage;

import android.content.Context;
import android.net.http.SslError;
import ru.domesticroots.webview.d;

/* loaded from: classes2.dex */
public interface st41 {
    static d a(Context context, rl60 rl60Var, ql60 ql60Var) {
        return new d(context.getApplicationContext(), rl60Var, ql60Var);
    }

    boolean b(SslError sslError, rt41 rt41Var);
}
