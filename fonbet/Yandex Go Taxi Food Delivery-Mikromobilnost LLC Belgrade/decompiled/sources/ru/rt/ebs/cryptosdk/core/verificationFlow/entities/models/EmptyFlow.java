package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models;

import defpackage.hnr0;
import defpackage.n4u0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Optional;
import ru.rt.ebs.cryptosdk.core.logging.EbsLogger;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0096@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0016\u0010\u0014R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/EmptyFlow;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/IFlow;", "<init>", "()V", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Action;", "action", "Lzy11;", "sendAction", "(Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Action;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "emit", "(Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/Event;)V", "T", "Ljava/lang/Class;", "clazz", "Lru/rt/ebs/cryptosdk/core/common/entities/models/Optional;", "getValue", "(Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startProcessingStateUpdating", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startProcessingStateUpdatingIfNotStarted", "cancelProcessingStateUpdating", "Lhnr0;", "actions", "Lhnr0;", "getActions", "()Lhnr0;", "Ln4u0;", "Lru/rt/ebs/cryptosdk/core/verificationFlow/entities/models/GlobalProcessingState;", "processingState", "Ln4u0;", "getProcessingState", "()Ln4u0;", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class EmptyFlow implements IFlow {
    public static final EmptyFlow INSTANCE = new EmptyFlow();
    private static final hnr0 actions = null;
    private static final n4u0 processingState = null;

    private EmptyFlow() {
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public Object cancelProcessingStateUpdating(Continuation<? super zy11> continuation) {
        EbsLogger.INSTANCE.warning("Flow is empty. cancelProcessingStateUpdating()");
        return zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public void emit(Event event) {
        EbsLogger.INSTANCE.warning("Flow is empty. Emit[" + event.getClass().getName() + "]");
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public hnr0 getActions() {
        return actions;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public n4u0 getProcessingState() {
        return processingState;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public <T> Object getValue(Class<T> cls, Continuation<? super Optional<T>> continuation) {
        EbsLogger.INSTANCE.warning("Flow is empty. GetValue[" + cls.getName() + "]");
        Optional.Companion.getClass();
        return new Optional(null);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public Object sendAction(Action action, Continuation<? super zy11> continuation) {
        EbsLogger.INSTANCE.warning("Flow is empty. sendAction(" + action + Extension.C_BRAKE);
        return zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public Object startProcessingStateUpdating(Continuation<? super zy11> continuation) {
        EbsLogger.INSTANCE.warning("Flow is empty. startProcessingStateUpdating()");
        return zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IFlow
    public Object startProcessingStateUpdatingIfNotStarted(Continuation<? super zy11> continuation) {
        EbsLogger.INSTANCE.warning("Flow is empty. startProcessingStateUpdatingIfNotStarted()");
        return zy11.a;
    }
}
