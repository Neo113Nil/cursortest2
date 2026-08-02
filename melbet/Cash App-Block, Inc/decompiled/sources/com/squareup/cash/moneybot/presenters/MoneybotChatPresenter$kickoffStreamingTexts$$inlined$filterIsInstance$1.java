package com.squareup.cash.moneybot.presenters;

import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class MoneybotChatPresenter$kickoffStreamingTexts$$inlined$filterIsInstance$1 implements Function1 {
    public static final MoneybotChatPresenter$kickoffStreamingTexts$$inlined$filterIsInstance$1 INSTANCE = new MoneybotChatPresenter$kickoffStreamingTexts$$inlined$filterIsInstance$1();

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(obj instanceof Message.TextMessage);
    }
}
