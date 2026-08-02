package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.messaging.ChatRequest;
import com.yandex.messaging.input.voice.reply.b;

/* loaded from: classes15.dex */
public final class zy31 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;

    public /* synthetic */ zy31(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.f;
        xvf0 xvf0Var2 = this.e;
        xvf0 xvf0Var3 = this.d;
        xvf0 xvf0Var4 = this.c;
        xvf0 xvf0Var5 = this.b;
        switch (i) {
            case 0:
                return new b((ChatRequest) xvf0Var5.get(), (com.yandex.messaging.internal.authorized.chat.b) xvf0Var4.get(), (kse) xvf0Var3.get(), (oy31) xvf0Var2.get(), (b00) xvf0Var.get());
            default:
                return new zu41((hk3) xvf0Var5.get(), (Context) xvf0Var4.get(), (DefaultEnvironment) xvf0Var3.get(), (dn90) xvf0Var2.get(), (Region) xvf0Var.get());
        }
    }
}
