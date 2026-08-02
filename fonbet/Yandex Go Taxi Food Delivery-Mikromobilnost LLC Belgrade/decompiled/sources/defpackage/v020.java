package defpackage;

import com.yandex.messaging.isolated.MessengerChatListFragment;

/* loaded from: classes15.dex */
public final class v020 implements a0x {
    public final /* synthetic */ MessengerChatListFragment a;

    public v020(MessengerChatListFragment messengerChatListFragment) {
        this.a = messengerChatListFragment;
    }

    @Override // defpackage.a0x
    public final void a(q6b q6bVar) {
        tls tlsVar;
        tlsVar = this.a.onClickHandler;
        if (tlsVar != null) {
            tlsVar.invoke(q6bVar.b);
        }
    }
}
