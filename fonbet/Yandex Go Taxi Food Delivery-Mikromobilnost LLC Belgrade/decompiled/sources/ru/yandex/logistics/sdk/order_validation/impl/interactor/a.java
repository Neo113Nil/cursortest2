package ru.yandex.logistics.sdk.order_validation.impl.interactor;

import defpackage.bpc;
import defpackage.cpc;
import defpackage.dpc;
import defpackage.e031;
import defpackage.f031;
import defpackage.fpc;
import defpackage.ny61;
import defpackage.qz21;
import defpackage.w511;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class a {
    public final ru.yandex.logistics.sdk.order_validation.impl.data.a a;

    public a(ru.yandex.logistics.sdk.order_validation.impl.data.a aVar) {
        this.a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(qz21 qz21Var, ContinuationImpl continuationImpl) {
        ValidationInteractorImpl$validate$1 validationInteractorImpl$validate$1;
        int i;
        fpc fpcVar;
        if (continuationImpl instanceof ValidationInteractorImpl$validate$1) {
            validationInteractorImpl$validate$1 = (ValidationInteractorImpl$validate$1) continuationImpl;
            int i2 = validationInteractorImpl$validate$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                validationInteractorImpl$validate$1.label = i2 - Integer.MIN_VALUE;
                Object obj = validationInteractorImpl$validate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = validationInteractorImpl$validate$1.label;
                if (i != 0) {
                    b.b(obj);
                    validationInteractorImpl$validate$1.L$0 = null;
                    validationInteractorImpl$validate$1.L$1 = this;
                    validationInteractorImpl$validate$1.label = 1;
                    obj = this.a.b(qz21Var, validationInteractorImpl$validate$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (a) validationInteractorImpl$validate$1.L$1;
                    b.b(obj);
                }
                fpcVar = (fpc) obj;
                this.getClass();
                if (!(fpcVar instanceof dpc)) {
                    return (f031) ((dpc) fpcVar).a();
                }
                if (fpcVar instanceof bpc) {
                    cpc cpcVar = fpcVar instanceof cpc ? (cpc) fpcVar : null;
                    return new e031(cpcVar != null ? cpcVar.a() : null);
                }
                w511.b();
                return null;
            }
        }
        validationInteractorImpl$validate$1 = new ValidationInteractorImpl$validate$1(this, continuationImpl);
        Object obj2 = validationInteractorImpl$validate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = validationInteractorImpl$validate$1.label;
        if (i != 0) {
        }
        fpcVar = (fpc) obj2;
        this.getClass();
        if (!(fpcVar instanceof dpc)) {
        }
    }
}
