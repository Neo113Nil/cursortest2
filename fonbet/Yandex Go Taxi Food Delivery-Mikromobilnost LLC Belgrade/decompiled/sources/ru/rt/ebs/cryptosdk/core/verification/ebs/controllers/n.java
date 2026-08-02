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
import ru.rt.ebs.cryptosdk.core.common.entities.models.Token;
import ru.rt.ebs.cryptosdk.core.metadata.controllers.IMetadataController;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaData;
import ru.rt.ebs.cryptosdk.core.verification.ebs.entities.models.EbsToken;

/* loaded from: classes4.dex */
public final class n extends SuspendLambda implements wls {
    public y2v a;
    public String b;
    public Token c;
    public int d;
    public final /* synthetic */ yin e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(yin yinVar, String str, Continuation continuation) {
        super(2, continuation);
        this.e = yinVar;
        this.f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n(this.e, this.f, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return new n(this.e, this.f, (Continuation) obj2).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0057, code lost:
    
        if (r9 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y2v y2vVar;
        Token token;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.d;
        if (i == 0) {
            kotlin.b.b(obj);
            yin yinVar = this.e;
            y2vVar = yinVar.a;
            String str2 = this.f;
            Token ebsSessionId = yinVar.d.getEbsSessionId();
            IMetadataController iMetadataController = this.e.b;
            this.a = y2vVar;
            this.b = str2;
            this.c = ebsSessionId;
            this.d = 1;
            Object metaData = iMetadataController.getMetaData(this);
            if (metaData != coroutineSingletons) {
                token = ebsSessionId;
                obj = metaData;
                str = str2;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            this.e.d.setEbsToken((EbsToken) obj);
            return zy11.a;
        }
        token = this.c;
        str = this.b;
        y2vVar = this.a;
        kotlin.b.b(obj);
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 2;
        obj = ((qjn) y2vVar).e(str, token, (MetaData) obj, this);
    }
}
