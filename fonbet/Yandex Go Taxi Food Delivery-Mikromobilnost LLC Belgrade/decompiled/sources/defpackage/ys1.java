package defpackage;

import com.squareup.wire.ProtoAdapter;
import java.util.Set;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatSettingsCapability;

/* loaded from: classes2.dex */
public final class ys1 implements bnj {
    public final s2n a;
    public final zwf0 b;
    public final t830 c;
    public final Set w = j73.f0(new dnj[]{new dnj("show_alice_chat_settings"), new dnj("set_chat_setting_mode_directive")});

    public ys1(s2n s2nVar, zwf0 zwf0Var, t830 t830Var) {
        this.a = s2nVar;
        this.b = zwf0Var;
        this.c = t830Var;
    }

    @Override // defpackage.bnj
    public final void h(smj smjVar) {
        syj0 a;
        syj0 a2;
        gnj gnjVar = smjVar.b;
        String str = smjVar.a;
        boolean l = jl40.l(str, "show_alice_chat_settings");
        s2n s2nVar = this.a;
        t830 t830Var = this.c;
        zwf0 zwf0Var = this.b;
        if (l) {
            ProtoAdapter<TAliceChatSettingsCapability.TShowAliceChatSettingsDirective> protoAdapter = TAliceChatSettingsCapability.TShowAliceChatSettingsDirective.ADAPTER;
            if (gnjVar instanceof fnj) {
                a2 = t830Var.a(TAliceChatSettingsCapability.TShowAliceChatSettingsDirective.class, ((fnj) gnjVar).a).a(ws1.a);
            } else {
                if (!(gnjVar instanceof enj)) {
                    w511.b();
                    return;
                }
                a2 = jaa1.a(protoAdapter, ((enj) gnjVar).a).a(xs1.a);
            }
            if (a2 instanceof lyj0) {
                s2nVar.getClass();
                return;
            } else if (!(a2 instanceof jyj0)) {
                w511.b();
                return;
            } else {
                zwf0Var.f("AliceSettingsDirectiveHandler", b64.l("Fail to deserialize ", qoi0.a(gnjVar.getClass()).d(), " open chat settings directive ", ((txg) ((jyj0) a2).a).a));
                return;
            }
        }
        if (!jl40.l(str, "set_chat_setting_mode_directive")) {
            zwf0Var.f("AliceSettingsDirectiveHandler", "Fail to handle directive " + dnj.a(str) + ", no supported handler found");
            return;
        }
        ProtoAdapter<TAliceChatSettingsCapability.TSetChatSettingModeDirective> protoAdapter2 = TAliceChatSettingsCapability.TSetChatSettingModeDirective.ADAPTER;
        if (gnjVar instanceof fnj) {
            a = t830Var.a(TAliceChatSettingsCapability.TSetChatSettingModeDirective.class, ((fnj) gnjVar).a).a(us1.a);
        } else {
            if (!(gnjVar instanceof enj)) {
                w511.b();
                return;
            }
            a = jaa1.a(protoAdapter2, ((enj) gnjVar).a).a(vs1.a);
        }
        if (!(a instanceof lyj0)) {
            if (!(a instanceof jyj0)) {
                w511.b();
                return;
            } else {
                zwf0Var.f("AliceSettingsDirectiveHandler", b64.l("Fail to deserialize ", qoi0.a(gnjVar.getClass()).d(), " set alice chat setting mode directive ", ((txg) ((jyj0) a).a).a));
                return;
            }
        }
        TAliceChatSettingsCapability.TSetChatSettingModeDirective tSetChatSettingModeDirective = (TAliceChatSettingsCapability.TSetChatSettingModeDirective) ((lyj0) a).a;
        if (jl40.l(tSetChatSettingModeDirective.getId(), "silentMode")) {
            tSetChatSettingModeDirective.getIsActive();
            s2nVar.getClass();
        } else {
            zwf0Var.f("AliceSettingsDirectiveHandler", "SetChatSettingModeDirective try to set unsupported option " + tSetChatSettingModeDirective.getId());
        }
    }

    @Override // defpackage.bnj
    public final Set m() {
        return this.w;
    }
}
