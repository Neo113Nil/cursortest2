package ru.rt.ebs.cryptosdk.core.metadata.controllers;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaData;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"Lru/rt/ebs/cryptosdk/core/metadata/controllers/IMetadataController;", "", "Lru/rt/ebs/cryptosdk/core/metadata/entities/MetaData;", "getMetaData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getDeviceId", "()Ljava/lang/String;", "", "getRootAvailable", "()I", "Lzy11;", "startLocationTracker", "()V", "stopLocationTracker", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IMetadataController {
    String getDeviceId();

    Object getMetaData(Continuation<? super MetaData> continuation);

    int getRootAvailable();

    void startLocationTracker();

    void stopLocationTracker();
}
