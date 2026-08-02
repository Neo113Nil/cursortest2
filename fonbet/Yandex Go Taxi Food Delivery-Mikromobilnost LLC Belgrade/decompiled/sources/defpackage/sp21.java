package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.core.net.entities.proto.CommonRequestFields;
import com.yandex.messaging.core.net.entities.proto.SubscriptionRequest;
import com.yandex.messaging.core.net.entities.proto.SubscriptionResponse;
import com.yandex.messaging.core.net.entities.proto.message.Heartbeat;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessage;
import com.yandex.messaging.core.net.entities.proto.message.ServerMessageInfo;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final class sp21 extends n1v0 implements Runnable, e1k {
    public final /* synthetic */ tp21 A;
    public final String b;
    public w0j0 c;
    public long y;
    public bh11 z;
    public final zq60 a = new zq60();
    public long w = 0;
    public long x = -1;

    public sp21(tp21 tp21Var, String str) {
        this.A = tp21Var;
        z83.g(null, tp21Var.a.getLooper(), Looper.myLooper());
        this.b = str;
    }

    public final boolean D(long j) {
        tp21 tp21Var = this.A;
        tp21Var.c.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.y;
        if (j2 <= 0) {
            j2 = 30000;
        }
        return tp21Var.y && currentTimeMillis - j < j2;
    }

    public final void G(long j) {
        boolean z;
        tp21 tp21Var = this.A;
        w3c w3cVar = tp21Var.c;
        w3cVar.getClass();
        this.w = System.currentTimeMillis();
        this.x = j;
        boolean D = D(j);
        if (this.y > 0) {
            w3cVar.getClass();
            if (System.currentTimeMillis() - this.x < this.y) {
                w3cVar.getClass();
                j = System.currentTimeMillis();
            }
        }
        long j2 = j;
        g370 g370Var = tp21Var.x;
        zq60 zq60Var = this.a;
        int i = zq60Var.c;
        ArrayList arrayList = zq60Var.a;
        g370Var.c(this.b, i, j2, D);
        zq60Var.b++;
        int size = arrayList.size();
        int i2 = 0;
        boolean z2 = false;
        while (true) {
            int i3 = i2;
            while (i3 < size && arrayList.get(i3) == null) {
                i3++;
            }
            if (i3 < size) {
                z = true;
            } else {
                if (!z2) {
                    zq60.a(zq60Var);
                    z2 = true;
                }
                z = false;
            }
            if (!z) {
                return;
            }
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 >= size) {
                if (!z2) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                ((f370) arrayList.get(i2)).a(j2, D);
                i2++;
            }
        }
    }

    public final void I(long j, long j2) {
        tp21 tp21Var = this.A;
        Handler handler = tp21Var.a;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        if (j < this.x) {
            tp21Var.x.a(j, this.b, "ignore heartbeats from the past");
            return;
        }
        this.y = j2;
        G(j);
        handler.removeCallbacks(this);
        handler.postDelayed(this, 30000L);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Handler handler = this.A.a;
        handler.removeCallbacks(this);
        bh11 bh11Var = this.z;
        if (bh11Var != null) {
            handler.removeCallbacks(bh11Var);
            this.z = null;
        }
        w0j0 w0j0Var = this.c;
        if (w0j0Var != null) {
            w0j0Var.cancel();
            this.c = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = this.A.a;
        z83.g(null, handler.getLooper(), Looper.myLooper());
        G(this.x);
        handler.postDelayed(this, 30000L);
    }

    @Override // defpackage.n1v0
    public final void v(SubscriptionResponse subscriptionResponse) {
        z83.g(null, this.A.a.getLooper(), Looper.myLooper());
        ServerMessage serverMessage = subscriptionResponse.lastMessage;
        if (serverMessage == null) {
            return;
        }
        ServerMessageInfo serverMessageInfo = serverMessage.serverMessageInfo;
        Heartbeat heartbeat = serverMessage.clientMessage.heartbeat;
        if (heartbeat == null || serverMessageInfo == null) {
            return;
        }
        if (this.b.equals(serverMessageInfo.from.userId)) {
            I(serverMessageInfo.timestamp / 1000, heartbeat.onlineUntil * 1000);
        }
    }

    @Override // defpackage.n1v0, defpackage.o5t0
    /* renamed from: w */
    public final SubscriptionRequest c(int i, int i2) {
        SubscriptionRequest subscriptionRequest = new SubscriptionRequest();
        subscriptionRequest.toGuid = this.b;
        subscriptionRequest.messageBodyType = 2;
        subscriptionRequest.ttlMcs = 30000000L;
        subscriptionRequest.commonFields = new CommonRequestFields(i2 > 0, i);
        return subscriptionRequest;
    }
}
