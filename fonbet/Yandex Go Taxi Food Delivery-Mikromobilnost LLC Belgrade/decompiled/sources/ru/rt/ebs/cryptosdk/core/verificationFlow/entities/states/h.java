package ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Optional;
import ru.rt.ebs.cryptosdk.core.verification.ebs.controllers.IEbsController;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.PhotoHandler;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.exceptions.IllegalTypeGetterVerificationFlowEbsException;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationRouter;

/* loaded from: classes4.dex */
public final class h extends a {
    public final IEbsController f;

    public h(IVerificationFlow iVerificationFlow, IVerificationRouter iVerificationRouter, IEbsController iEbsController) {
        super(iVerificationFlow, iVerificationRouter);
        this.f = iEbsController;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a, defpackage.z3v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getValue(Class cls, Continuation continuation) {
        RecordPhotoVerificationFlowState$getValue$1 recordPhotoVerificationFlowState$getValue$1;
        int i;
        if (continuation instanceof RecordPhotoVerificationFlowState$getValue$1) {
            recordPhotoVerificationFlowState$getValue$1 = (RecordPhotoVerificationFlowState$getValue$1) continuation;
            int i2 = recordPhotoVerificationFlowState$getValue$1.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recordPhotoVerificationFlowState$getValue$1.c = i2 - Integer.MIN_VALUE;
                Object obj = recordPhotoVerificationFlowState$getValue$1.a;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = recordPhotoVerificationFlowState$getValue$1.c;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!jl40.l(cls, PhotoHandler.class)) {
                        throw new IllegalTypeGetterVerificationFlowEbsException(this, cls.getName());
                    }
                    recordPhotoVerificationFlowState$getValue$1.c = 1;
                    obj = m(recordPhotoVerificationFlowState$getValue$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return (Optional) obj;
            }
        }
        recordPhotoVerificationFlowState$getValue$1 = new RecordPhotoVerificationFlowState$getValue$1(this, (ContinuationImpl) continuation);
        Object obj3 = recordPhotoVerificationFlowState$getValue$1.a;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = recordPhotoVerificationFlowState$getValue$1.c;
        if (i != 0) {
        }
        return (Optional) obj3;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final Object h(Object obj, Continuation continuation) {
        return zy11.a;
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.states.a
    public final void i(Object obj) {
        this.a.gotoPhotoRecording();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(ContinuationImpl continuationImpl) {
        RecordPhotoVerificationFlowState$getPhotoHandler$1 recordPhotoVerificationFlowState$getPhotoHandler$1;
        int i;
        try {
            if (continuationImpl instanceof RecordPhotoVerificationFlowState$getPhotoHandler$1) {
                recordPhotoVerificationFlowState$getPhotoHandler$1 = (RecordPhotoVerificationFlowState$getPhotoHandler$1) continuationImpl;
                int i2 = recordPhotoVerificationFlowState$getPhotoHandler$1.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    recordPhotoVerificationFlowState$getPhotoHandler$1.d = i2 - Integer.MIN_VALUE;
                    Object obj = recordPhotoVerificationFlowState$getPhotoHandler$1.b;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = recordPhotoVerificationFlowState$getPhotoHandler$1.d;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        IEbsController iEbsController = this.f;
                        recordPhotoVerificationFlowState$getPhotoHandler$1.a = this;
                        recordPhotoVerificationFlowState$getPhotoHandler$1.d = 1;
                        obj = iEbsController.fetchPhotoHandler(recordPhotoVerificationFlowState$getPhotoHandler$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        this = recordPhotoVerificationFlowState$getPhotoHandler$1.a;
                        kotlin.b.b(obj);
                    }
                    return new Optional(obj);
                }
            }
            if (i != 0) {
            }
            return new Optional(obj);
        } catch (Exception e) {
            this.c(e);
            Optional.Companion.getClass();
            return new Optional(null);
        }
        recordPhotoVerificationFlowState$getPhotoHandler$1 = new RecordPhotoVerificationFlowState$getPhotoHandler$1(this, continuationImpl);
        Object obj2 = recordPhotoVerificationFlowState$getPhotoHandler$1.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = recordPhotoVerificationFlowState$getPhotoHandler$1.d;
    }
}
