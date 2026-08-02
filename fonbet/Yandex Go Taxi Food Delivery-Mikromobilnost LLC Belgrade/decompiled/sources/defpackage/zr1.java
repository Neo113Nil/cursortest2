package defpackage;

import android.content.Context;
import kotlin.collections.b;
import okio.ByteString;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatHapticCapability;
import ru.yandex.alice.protos.endpoint.platform.utils.TCapability;
import ru.yandex.alice.protos.endpoint.quark.webchat.TCapability;

/* loaded from: classes8.dex */
public final class zr1 extends hy4 implements e2z {
    public final String b;
    public final ul2 c;
    public final as1 d;
    public final String e;

    /* JADX WARN: Multi-variable type inference failed */
    public zr1(zwf0 zwf0Var, Context context, xw91 xw91Var) {
        t830 t830Var = new t830(b.f(), true);
        this.b = "AliceChatHapticCapability";
        TCapability.TMeta tMeta = null;
        TAliceChatHapticCapability.TParameters tParameters = null;
        ByteString byteString = null;
        this.c = new ul2(TCapability.ECapabilityType.AliceChatHapticCapabilityType, new TAliceChatHapticCapability(tMeta, tParameters, new TAliceChatHapticCapability.TState(null, 1, 0 == true ? 1 : 0), byteString, 11, null), t830Var);
        this.d = new as1(xw91Var, t830Var, zwf0Var, context);
        this.e = "WebChatModule";
    }

    @Override // defpackage.u28
    public final String a() {
        return this.b;
    }

    @Override // defpackage.u28
    public final String c() {
        return this.e;
    }

    @Override // defpackage.u28
    public final bnj d() {
        return this.d;
    }

    @Override // defpackage.u28
    public final synchronized png getCurrentState() {
        return this.c;
    }
}
