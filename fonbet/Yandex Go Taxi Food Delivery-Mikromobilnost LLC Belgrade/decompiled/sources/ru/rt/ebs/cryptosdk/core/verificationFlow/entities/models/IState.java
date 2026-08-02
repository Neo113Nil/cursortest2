package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models;

import java.io.Closeable;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IState;", "", "coroutineScope", "Ljava/io/Closeable;", "getCoroutineScope", "()Ljava/io/Closeable;", "setCoroutineScope", "(Ljava/io/Closeable;)V", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IState {
    Closeable getCoroutineScope();

    void setCoroutineScope(Closeable closeable);
}
