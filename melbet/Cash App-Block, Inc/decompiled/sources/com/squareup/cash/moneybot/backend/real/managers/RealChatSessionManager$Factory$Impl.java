package com.squareup.cash.moneybot.backend.real.managers;

import com.squareup.cash.appmessages.views.InlineAppMessageView;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;

/* loaded from: classes.dex */
public final class RealChatSessionManager$Factory$Impl {
    public final InlineAppMessageView.MetroFactory delegateFactory;

    public RealChatSessionManager$Factory$Impl(InlineAppMessageView.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final RealChatSessionManager create$1(String str) {
        ChatManager chatManager = (ChatManager) this.delegateFactory.staticImageLoader.invoke();
        chatManager.getClass();
        return new RealChatSessionManager(str, chatManager);
    }
}
