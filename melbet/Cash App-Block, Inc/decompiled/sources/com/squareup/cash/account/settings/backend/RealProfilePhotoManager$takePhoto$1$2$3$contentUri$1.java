package com.squareup.cash.account.settings.backend;

import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final /* synthetic */ class RealProfilePhotoManager$takePhoto$1$2$3$contentUri$1 extends PropertyReference1Impl {
    public static final RealProfilePhotoManager$takePhoto$1$2$3$contentUri$1 INSTANCE = new RealProfilePhotoManager$takePhoto$1$2$3$contentUri$1(Storage.class, "cache", "getCache()Lokio/FileSystem;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((RealStorage) ((Storage) obj)).cache;
    }
}
