package ru.rt.ebs.cryptosdk.core.verification.ebs.controllers;

import defpackage.ny61;
import defpackage.qjn;
import defpackage.wls;
import defpackage.y2v;
import defpackage.yin;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaData;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.Negotiate;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.UploadNegotiateResult;

/* loaded from: classes4.dex */
public final class l extends SuspendLambda implements wls {
    public y2v a;
    public Token b;
    public int c;
    public final /* synthetic */ yin d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(yin yinVar, String str, Continuation continuation) {
        super(2, continuation);
        this.d = yinVar;
        this.e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.d, this.e, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new l(this.d, this.e, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006d, code lost:
    
        if (r12 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Token token;
        y2v y2vVar;
        l lVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            kotlin.b.b(obj);
            yin yinVar = this.d;
            qjn qjnVar = yinVar.a;
            Token ebsSessionId = yinVar.d.getEbsSessionId();
            IMetadataController iMetadataController = this.d.b;
            this.a = qjnVar;
            this.b = ebsSessionId;
            this.c = 1;
            Object metaData = iMetadataController.getMetaData(this);
            if (metaData != coroutineSingletons) {
                token = ebsSessionId;
                obj = metaData;
                y2vVar = qjnVar;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            lVar = this;
            yin yinVar2 = lVar.d;
            UploadNegotiateResult uploadNegotiateResult = (UploadNegotiateResult) obj;
            yinVar2.d.setEbsRedirectUrl(uploadNegotiateResult.getEbsRedirectUrl());
            yinVar2.d.setEbsToken(uploadNegotiateResult.getEbsToken());
            return zy11.a;
        }
        Token token2 = this.b;
        y2vVar = this.a;
        kotlin.b.b(obj);
        token = token2;
        Negotiate negotiate = new Negotiate(new JSONObject(this.d.a.d.getString("ebs.result_negotiate", "")));
        String str = this.e;
        this.a = null;
        this.b = null;
        this.c = 2;
        lVar = this;
        obj = ((qjn) y2vVar).d(token, (MetaData) obj, negotiate, str, lVar);
    }
}
