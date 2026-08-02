package defpackage;

import com.yandex.quark.webchat.navigation.internal.a;
import ru.yandex.alice.protos.endpoint.capabilities.quark.webchat.TAliceChatCapability;

/* loaded from: classes2.dex */
public final /* synthetic */ class xd41 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ xd41(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                syj0 b = ((t830) aVar.c).b(TAliceChatCapability.TCreateNewChatDirective.class, new TAliceChatCapability.TCreateNewChatDirective(null, null, 3, null));
                if (!(b instanceof lyj0)) {
                    if (!(b instanceof jyj0)) {
                        w511.b();
                        break;
                    }
                } else {
                    b = new lyj0(new smj("create_new_chat_directive", new fnj((String) ((lyj0) b).a)));
                }
                break;
            default:
                syj0 b2 = ((t830) aVar.c).b(TAliceChatCapability.TOpenChatListDirective.class, new TAliceChatCapability.TOpenChatListDirective(null, null, 3, null));
                if (!(b2 instanceof lyj0)) {
                    if (!(b2 instanceof jyj0)) {
                        w511.b();
                        break;
                    }
                } else {
                    b2 = new lyj0(new smj("open_chat_list_directive", new fnj((String) ((lyj0) b2).a)));
                }
                break;
        }
        return null;
    }
}
