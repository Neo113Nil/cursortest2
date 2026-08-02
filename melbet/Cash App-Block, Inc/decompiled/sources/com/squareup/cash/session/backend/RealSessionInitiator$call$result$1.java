package com.squareup.cash.session.backend;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.encryption.EllipticCurveEncryptionEngine;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.ClientSecurityContext;
import com.squareup.protos.franklin.app.InitiateSessionRequest;
import com.squareup.protos.franklin.common.RequestContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealSessionInitiator$call$result$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ String $backupTag;
    public final /* synthetic */ RequestContext $requestContext;
    public int label;
    public final /* synthetic */ RealSessionInitiator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSessionInitiator$call$result$1(RealSessionInitiator realSessionInitiator, String str, RequestContext requestContext, Continuation continuation) {
        super(1, continuation);
        this.this$0 = realSessionInitiator;
        this.$backupTag = str;
        this.$requestContext = requestContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RealSessionInitiator$call$result$1(this.this$0, this.$backupTag, this.$requestContext, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RealSessionInitiator$call$result$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                SafeTrace.throwOnFailure(obj);
                return obj;
            }
            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        SafeTrace.throwOnFailure(obj);
        RealSessionInitiator realSessionInitiator = this.this$0;
        AppService appService = realSessionInitiator.appService;
        String country = RealLocaleManager.getSystemLocale().getCountry();
        ByteString.Companion companion = ByteString.Companion;
        ByteString of$default = ByteString.Companion.of$default(((EllipticCurveEncryptionEngine) realSessionInitiator.engine.getValue()).getPublicKey().getKeyset().toByteArray());
        ByteString byteString = ByteString.EMPTY;
        InitiateSessionRequest initiateSessionRequest = new InitiateSessionRequest(null, this.$backupTag, new ClientSecurityContext(of$default, null, byteString), null, country, this.$requestContext, byteString);
        this.label = 1;
        Object initiateSession = appService.initiateSession(initiateSessionRequest, this);
        return initiateSession == coroutineSingletons ? coroutineSingletons : initiateSession;
    }
}
