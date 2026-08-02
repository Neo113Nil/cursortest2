package com.squareup.cash.blockers.presenters;

import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes5.dex */
public final /* synthetic */ class FilesetUploadPresenter$models$2$6$photoUri$1 extends PropertyReference1Impl {
    public static final FilesetUploadPresenter$models$2$6$photoUri$1 INSTANCE = new FilesetUploadPresenter$models$2$6$photoUri$1(Storage.class, "cache", "getCache()Lokio/FileSystem;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((RealStorage) ((Storage) obj)).cache;
    }
}
