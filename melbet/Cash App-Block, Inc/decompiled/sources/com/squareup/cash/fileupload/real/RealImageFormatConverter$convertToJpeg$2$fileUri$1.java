package com.squareup.cash.fileupload.real;

import com.squareup.cash.storage.RealStorage;
import com.squareup.cash.storage.Storage;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealImageFormatConverter$convertToJpeg$2$fileUri$1 extends PropertyReference1Impl {
    public static final RealImageFormatConverter$convertToJpeg$2$fileUri$1 INSTANCE = new RealImageFormatConverter$convertToJpeg$2$fileUri$1(Storage.class, "cache", "getCache()Lokio/FileSystem;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
    public final Object get(Object obj) {
        return ((RealStorage) ((Storage) obj)).cache;
    }
}
