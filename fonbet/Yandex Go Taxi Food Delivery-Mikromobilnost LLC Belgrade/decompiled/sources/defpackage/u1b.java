package defpackage;

import android.os.Looper;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.base.rights.ChatRightsFlag;
import com.yandex.messaging.core.net.entities.ChatData;
import com.yandex.messaging.core.net.entities.UserData;
import com.yandex.messaging.internal.entities.ChatId;
import com.yandex.messaging.internal.net.Error;
import java.util.ArrayList;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class u1b implements fo3 {
    public static final /* synthetic */ kgx[] z;
    public final ChatRequest a;
    public final zq60 b = new zq60();
    public final op3 c;
    public Error w;
    public String x;
    public final /* synthetic */ w1b y;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("httpRetrier", 0, "getHttpRetrier()Lcom/yandex/messaging/Cancelable;", u1b.class);
        qoi0.a.getClass();
        z = new kgx[]{mutablePropertyReference1Impl};
    }

    public u1b(w1b w1bVar, ChatRequest chatRequest) {
        this.y = w1bVar;
        this.a = chatRequest;
        op3 op3Var = new op3();
        this.c = op3Var;
        x08 x08Var = (x08) chatRequest.handle(new q1b(this));
        kgx[] kgxVarArr = z;
        kgx kgxVar = kgxVarArr[0];
        op3Var.b(x08Var);
        kgx kgxVar2 = kgxVarArr[0];
        z83.d(op3Var.a(), null);
    }

    public static final void a(u1b u1bVar, UserData userData) {
        w1b w1bVar = u1bVar.y;
        String[] strArr = {w1bVar.c.a, userData.userId};
        String[] strArr2 = {ChatRightsFlag.Read.getFlagName(), ChatRightsFlag.Write.getFlagName(), ChatRightsFlag.SendStickers.getFlagName(), ChatRightsFlag.SendAttachments.getFlagName(), ChatRightsFlag.MakeExtCall.getFlagName(), ChatRightsFlag.MarkAsImportant.getFlagName()};
        h3b h3bVar = w1bVar.d;
        ChatData chatData = new ChatData(new ChatId.PrivateChatId(h3bVar.a, userData.userId).a, 0L, null, null, null, true, 0.0d, strArr, null, null, 0L, strArr2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 67105630, null);
        w1bVar.i.f("chat created", "chat id", chatData.getChatId(), "chat type", "personal");
        u1bVar.b(chatData, userData, true);
    }

    public final void b(ChatData chatData, UserData userData, boolean z2) {
        boolean z3;
        w1b w1bVar = this.y;
        Looper looper = w1bVar.a;
        z83.g(null, looper, Looper.myLooper());
        this.x = chatData.getChatId();
        z83.g(null, looper, Looper.myLooper());
        l020 C = w1bVar.b.C();
        try {
            if (userData != null) {
                if (z2) {
                    C.C.b(userData);
                } else {
                    C.P0(userData);
                }
            }
            C.I(chatData);
            C.s();
            C.close();
            zq60 zq60Var = this.b;
            zq60Var.getClass();
            ArrayList arrayList = zq60Var.a;
            zq60Var.b++;
            int size = arrayList.size();
            int i = 0;
            boolean z4 = false;
            while (true) {
                int i2 = i;
                while (i2 < size && arrayList.get(i2) == null) {
                    i2++;
                }
                if (i2 < size) {
                    z3 = true;
                } else {
                    if (!z4) {
                        zq60.a(zq60Var);
                        z4 = true;
                    }
                    z3 = false;
                }
                if (!z3) {
                    return;
                }
                while (i < size && arrayList.get(i) == null) {
                    i++;
                }
                if (i >= size) {
                    if (!z4) {
                        zq60.a(zq60Var);
                    }
                    ny61.p();
                    return;
                } else {
                    ((o1b) arrayList.get(i)).c(chatData.getChatId());
                    i++;
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(C, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.fo3
    public final void g(Error error) {
        boolean z2;
        z83.g(null, this.y.a, Looper.myLooper());
        zq60 zq60Var = this.b;
        zq60Var.getClass();
        zq60Var.b++;
        ArrayList arrayList = zq60Var.a;
        int size = arrayList.size();
        int i = 0;
        boolean z3 = false;
        while (true) {
            int i2 = i;
            while (i2 < size && arrayList.get(i2) == null) {
                i2++;
            }
            if (i2 < size) {
                z2 = true;
            } else {
                if (!z3) {
                    zq60.a(zq60Var);
                    z3 = true;
                }
                z2 = false;
            }
            if (!z2) {
                this.w = error;
                return;
            }
            while (i < size && arrayList.get(i) == null) {
                i++;
            }
            if (i >= size) {
                if (!z3) {
                    zq60.a(zq60Var);
                }
                ny61.p();
                return;
            } else {
                ((o1b) arrayList.get(i)).a(error);
                i++;
            }
        }
    }

    @Override // defpackage.fo3
    public final void h(ChatData chatData, UserData userData) {
        w1b w1bVar = this.y;
        z83.g(null, w1bVar.a, Looper.myLooper());
        w1bVar.k.getClass();
        String a = bx6.a(chatData);
        if (a != null && userData == null) {
            xn21.a(w1bVar.j, a);
        }
        b(chatData, userData, false);
    }
}
