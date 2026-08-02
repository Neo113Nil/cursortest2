package ru.rt.ebs.cryptosdk.core.verification.ebs.controllers;

import defpackage.ny61;
import defpackage.qjn;
import defpackage.wls;
import defpackage.x2b1;
import defpackage.yin;
import defpackage.zy11;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.rt.ebs.cryptosdk.core.instructions.controllers.IInstructionsController;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.BioSampleType;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.PhotoHandler;

/* loaded from: classes4.dex */
public final class h extends SuspendLambda implements wls {
    public File a;
    public int b;
    public final /* synthetic */ yin c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yin yinVar, Continuation continuation) {
        super(2, continuation);
        this.c = yinVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.c, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new h(this.c, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r7 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        File file;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            qjn qjnVar = this.c.a;
            BioSampleType bioSampleType = BioSampleType.PHOTO;
            this.b = 1;
            obj = x2b1.b(qjnVar.c, bioSampleType.getFileName(), null, 6);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                file = this.a;
                kotlin.b.b(obj);
                return new PhotoHandler(file, (String) obj);
            }
            kotlin.b.b(obj);
        }
        File file2 = (File) obj;
        IInstructionsController iInstructionsController = this.c.c;
        this.a = file2;
        this.b = 2;
        Object fetchInstructionsData = iInstructionsController.fetchInstructionsData(this);
        if (fetchInstructionsData != coroutineSingletons) {
            obj = fetchInstructionsData;
            file = file2;
            return new PhotoHandler(file, (String) obj);
        }
        return coroutineSingletons;
    }
}
