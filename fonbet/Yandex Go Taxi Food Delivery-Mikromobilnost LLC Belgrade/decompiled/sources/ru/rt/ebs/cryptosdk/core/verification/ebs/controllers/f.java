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
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.instructions.controllers.IInstructionsController;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.BioSampleType;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.Negotiate;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.NegotiateHandler;

/* loaded from: classes4.dex */
public final class f extends SuspendLambda implements wls {
    public Negotiate a;
    public File b;
    public int c;
    public final /* synthetic */ yin d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yin yinVar, Continuation continuation) {
        super(2, continuation);
        this.d = yinVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f(this.d, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.d, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0051, code lost:
    
        if (r9 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Negotiate negotiate;
        File file;
        Negotiate negotiate2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            kotlin.b.b(obj);
            negotiate = new Negotiate(new JSONObject(this.d.a.d.getString("ebs.negotiate", "")));
            qjn qjnVar = this.d.a;
            BioSampleType bioSampleType = BioSampleType.VIDEO;
            this.a = negotiate;
            this.c = 1;
            obj = x2b1.b(qjnVar.c, bioSampleType.getFileName(), null, 6);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                file = this.b;
                negotiate2 = this.a;
                kotlin.b.b(obj);
                return new NegotiateHandler(negotiate2, file, (String) obj);
            }
            negotiate = this.a;
            kotlin.b.b(obj);
        }
        File file2 = (File) obj;
        IInstructionsController iInstructionsController = this.d.c;
        this.a = negotiate;
        this.b = file2;
        this.c = 2;
        Object fetchInstructionsData = iInstructionsController.fetchInstructionsData(this);
        if (fetchInstructionsData != coroutineSingletons) {
            file = file2;
            obj = fetchInstructionsData;
            negotiate2 = negotiate;
            return new NegotiateHandler(negotiate2, file, (String) obj);
        }
        return coroutineSingletons;
    }
}
