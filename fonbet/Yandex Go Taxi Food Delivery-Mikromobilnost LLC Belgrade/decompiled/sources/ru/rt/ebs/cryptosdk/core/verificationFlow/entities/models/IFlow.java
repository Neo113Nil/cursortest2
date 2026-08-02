package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models;

import defpackage.hnr0;
import defpackage.n4u0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Optional;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0014\u0010\u0012R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00158&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IFlow;", "", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "Lzy11;", "emit", "(Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event;)V", "T", "Ljava/lang/Class;", "clazz", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Optional;", "getValue", "(Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Action;", "action", "sendAction", "(Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Action;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startProcessingStateUpdating", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startProcessingStateUpdatingIfNotStarted", "cancelProcessingStateUpdating", "Lhnr0;", "getActions", "()Lhnr0;", "actions", "Ln4u0;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/GlobalProcessingState;", "getProcessingState", "()Ln4u0;", "processingState", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface IFlow {
    Object cancelProcessingStateUpdating(Continuation<? super zy11> continuation);

    void emit(Event event);

    hnr0 getActions();

    n4u0 getProcessingState();

    <T> Object getValue(Class<T> cls, Continuation<? super Optional<T>> continuation);

    Object sendAction(Action action, Continuation<? super zy11> continuation);

    Object startProcessingStateUpdating(Continuation<? super zy11> continuation);

    Object startProcessingStateUpdatingIfNotStarted(Continuation<? super zy11> continuation);
}
