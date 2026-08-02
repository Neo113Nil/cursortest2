package com.squareup.cash.invitations.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.RegisterInvitationsRequest;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class RealInvitationsRepository$registerInvitations$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ ArrayList $aliases;
    public int label;
    public final /* synthetic */ EglCore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInvitationsRepository$registerInvitations$2(EglCore eglCore, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eglCore;
        this.$aliases = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealInvitationsRepository$registerInvitations$2(this.this$0, this.$aliases, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealInvitationsRepository$registerInvitations$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
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
        AppService appService = (AppService) this.this$0.eglDisplay;
        EmptyList emptyList = EmptyList.INSTANCE;
        RegisterInvitationsRequest registerInvitationsRequest = new RegisterInvitationsRequest(emptyList, null, emptyList, null, this.$aliases, ByteString.EMPTY);
        this.label = 1;
        Object registerInvitations = appService.registerInvitations(registerInvitationsRequest, this);
        return registerInvitations == coroutineSingletons ? coroutineSingletons : registerInvitations;
    }
}
