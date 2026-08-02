package defpackage;

import com.yandex.messaging.internal.authorized.chat.notifications.a;
import kotlin.Pair;

/* loaded from: classes15.dex */
public final /* synthetic */ class wj3 implements e1k {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wj3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ck3) obj).c();
                break;
            case 1:
                a aVar = (a) obj;
                aVar.z = null;
                aVar.f.reportEvent("notification_lock_released", gw00.e(new Pair("chatId", aVar.c.b)));
                break;
            default:
                apf apfVar = (apf) obj;
                uds0 uds0Var = (uds0) apfVar.c;
                if (uds0Var != null) {
                    uds0Var.close();
                }
                uds0 uds0Var2 = (uds0) apfVar.w;
                if (uds0Var2 != null) {
                    uds0Var2.close();
                }
                apfVar.w = null;
                apfVar.c = null;
                break;
        }
    }
}
