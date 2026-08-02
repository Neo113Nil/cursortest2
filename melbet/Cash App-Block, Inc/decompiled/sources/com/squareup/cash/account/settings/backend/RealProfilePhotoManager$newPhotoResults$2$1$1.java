package com.squareup.cash.account.settings.backend;

import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final /* synthetic */ class RealProfilePhotoManager$newPhotoResults$2$1$1 extends PropertyReference1Impl {
    public static final RealProfilePhotoManager$newPhotoResults$2$1$1 INSTANCE = new RealProfilePhotoManager$newPhotoResults$2$1$1(Storage.class, "cache", "getCache()Lokio/FileSystem;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((RealStorage) ((Storage) obj)).cache;
    }
}
