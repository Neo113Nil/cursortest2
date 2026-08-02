package defpackage;

import android.os.Looper;
import com.yandex.messaging.core.net.entities.Bucket;
import com.yandex.messaging.core.net.entities.ChatMuteData;
import com.yandex.messaging.core.net.entities.ChatMutingsBucket;
import java.util.HashMap;

/* loaded from: classes15.dex */
public final class u5b {
    public final to3 a;
    public final k020 b;
    public final Looper c;
    public final x22 d;

    public u5b(to3 to3Var, k020 k020Var, Looper looper, x22 x22Var) {
        this.a = to3Var;
        this.b = k020Var;
        this.c = looper;
        this.d = x22Var;
    }

    public final void a(String str, boolean z) {
        z83.g(null, this.c, Looper.myLooper());
        x5b b = this.b.b.m().b(str);
        if (b == null) {
            b = new x5b(str, false, false, null);
        }
        boolean z2 = b.c;
        String str2 = b.a;
        Long l = b.d;
        if (b.b != z && l != null) {
            long longValue = l.longValue();
            ChatMutingsBucket chatMutingsBucket = new ChatMutingsBucket();
            chatMutingsBucket.version = longValue;
            HashMap hashMap = new HashMap(1);
            chatMutingsBucket.bucketValue = hashMap;
            hashMap.put(str2, new ChatMuteData(z, z2));
            b(chatMutingsBucket);
        }
        to3 to3Var = this.a;
        if (l == null) {
            f45 f45Var = new f45(this, str, z);
            Bucket.GetParams getParams = new Bucket.GetParams(new ChatMutingsBucket(), str);
            to3Var.getClass();
            to3Var.a(ChatMutingsBucket.class, new eo1(15, f45Var), getParams);
            return;
        }
        long longValue2 = l.longValue();
        ChatMutingsBucket chatMutingsBucket2 = new ChatMutingsBucket();
        chatMutingsBucket2.version = longValue2;
        HashMap hashMap2 = new HashMap(1);
        chatMutingsBucket2.bucketValue = hashMap2;
        hashMap2.put(str2, new ChatMuteData(z, z2));
        to3Var.d(ChatMutingsBucket.class, new tis0(this, z, str), chatMutingsBucket2);
    }

    public final void b(ChatMutingsBucket chatMutingsBucket) {
        z83.g(null, this.c, Looper.myLooper());
        l020 C = this.b.C();
        try {
            C.T(chatMutingsBucket);
            C.s();
            C.close();
        } catch (Throwable th) {
            if (C != null) {
                try {
                    C.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
