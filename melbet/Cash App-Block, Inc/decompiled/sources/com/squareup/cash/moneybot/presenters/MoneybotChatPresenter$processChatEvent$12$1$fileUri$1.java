package com.squareup.cash.moneybot.presenters;

import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotChatPresenter$processChatEvent$12$1$fileUri$1 extends PropertyReference1Impl {
    public static final MoneybotChatPresenter$processChatEvent$12$1$fileUri$1 INSTANCE = new MoneybotChatPresenter$processChatEvent$12$1$fileUri$1(Storage.class, "temp", "getTemp()Lokio/FileSystem;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((RealStorage) ((Storage) obj)).temp;
    }
}
