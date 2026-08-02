package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.ServerMessageRef;
import com.yandex.messaging.internal.ThreadChat;
import com.yandex.messaging.internal.authorized.sync.SyncSource;
import com.yandex.messaging.internal.authorized.sync.f;
import com.yandex.messaging.internal.entities.ChatId;
import java.util.ArrayList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class t1b implements x08 {
    public static final /* synthetic */ kgx[] c;
    public final rp3 a = new rp3();
    public final /* synthetic */ u1b b;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("messageLoaderJob", 0, "getMessageLoaderJob()Lkotlinx/coroutines/Job;", t1b.class);
        qoi0.a.getClass();
        c = new kgx[]{mutablePropertyReference1Impl};
    }

    public t1b(u1b u1bVar, ThreadChat threadChat) {
        boolean z;
        this.b = u1bVar;
        String threadId = threadChat.getThreadId();
        ChatId.ThreadId threadId2 = new ChatId.ThreadId(threadId);
        w1b w1bVar = u1bVar.y;
        l020 C = w1bVar.b.C();
        try {
            C.B.g(threadId, "");
            C.s();
            C.close();
            z83.g(null, w1bVar.a, Looper.myLooper());
            u1bVar.x = threadId;
            zq60 zq60Var = u1bVar.b;
            zq60Var.getClass();
            ArrayList arrayList = zq60Var.a;
            zq60Var.b++;
            int size = arrayList.size();
            int i = 0;
            boolean z2 = false;
            while (true) {
                int i2 = i;
                while (i2 < size && arrayList.get(i2) == null) {
                    i2++;
                }
                if (i2 < size) {
                    z = true;
                } else {
                    if (!z2) {
                        zq60.a(zq60Var);
                        z2 = true;
                    }
                    z = false;
                }
                if (!z) {
                    pzt0 c2 = f.c(this.b.y.l, new ServerMessageRef(threadId2.c().a, threadId2.d), SyncSource.ThreadFetcher);
                    rp3 rp3Var = this.a;
                    kgx kgxVar = c[0];
                    rp3Var.a(c2);
                    return;
                }
                while (i < size && arrayList.get(i) == null) {
                    i++;
                }
                if (i >= size) {
                    if (!z2) {
                        zq60.a(zq60Var);
                    }
                    ny61.p();
                    throw null;
                }
                ((o1b) arrayList.get(i)).c(threadId);
                i++;
            }
        } finally {
        }
    }

    @Override // defpackage.x08
    public final void cancel() {
        kgx kgxVar = c[0];
        this.a.a(null);
    }
}
