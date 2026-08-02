package defpackage;

import com.yandex.quark.capability.CapabilityListener;
import java.util.LinkedHashSet;
import kotlin.collections.b;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatSettingsCapability;
import ru.yandex.alice.protos.endpoint.platform.utils.TCapability;

/* loaded from: classes2.dex */
public final class ts1 implements u28 {
    public final s2n a;
    public final LinkedHashSet b = new LinkedHashSet();
    public final String c;
    public final ul2 d;
    public final ys1 e;
    public final String f;

    /* JADX WARN: Multi-variable type inference failed */
    public ts1(s2n s2nVar, zwf0 zwf0Var) {
        this.a = s2nVar;
        t830 t830Var = new t830(b.f(), true);
        this.c = "AliceSettingsCapability";
        Object[] objArr = 0 == true ? 1 : 0;
        this.d = new ul2(TCapability.ECapabilityType.AliceChatSettingsCapabilityType, new TAliceChatSettingsCapability(objArr, null, new TAliceChatSettingsCapability.TState(false, null, 2, 0 == true ? 1 : 0), null, 11, null), t830Var);
        this.e = new ys1(s2nVar, zwf0Var, t830Var);
        this.f = "WebChatModule";
    }

    @Override // defpackage.u28
    public final String a() {
        return this.c;
    }

    @Override // defpackage.u28
    public final synchronized syj0 b(CapabilityListener capabilityListener) {
        syj0 jyj0Var;
        try {
            if (this.b.add(capabilityListener)) {
                this.a.getClass();
                capabilityListener.onStateChanged(getCurrentState());
                jyj0Var = new lyj0(new ss1(0, this, capabilityListener));
            } else {
                jyj0Var = new jyj0(new upi0());
            }
        } catch (Throwable th) {
            throw th;
        }
        return jyj0Var;
    }

    @Override // defpackage.u28
    public final String c() {
        return this.f;
    }

    @Override // defpackage.u28
    public final bnj d() {
        return this.e;
    }

    @Override // defpackage.u28
    public final synchronized png getCurrentState() {
        return this.d;
    }
}
