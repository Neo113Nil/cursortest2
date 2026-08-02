package com.plaid.internal;

import android.content.Intent;
import com.plaid.internal.C0095a6;
import com.plaid.internal.D6;
import com.plaid.internal.link.LinkActivity;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

@DebugMetadata(c = "com.plaid.internal.redirect.LinkRedirectActivityViewModel$redirectToLink$1", f = "LinkRedirectActivityViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class J2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ LinkRedirectActivity a;
    public final /* synthetic */ D6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(LinkRedirectActivity linkRedirectActivity, D6 d6, Continuation continuation) {
        super(2, continuation);
        this.a = linkRedirectActivity;
        this.b = d6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new J2(this.a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new J2(this.a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        C0095a6.a.getClass();
        C0095a6.a.a("Launching LinkActivity", true);
        LinkRedirectActivity linkRedirectActivity = this.a;
        int i = LinkActivity.e;
        D6 d6 = this.b;
        linkRedirectActivity.getClass();
        d6.getClass();
        Intent intent = new Intent(linkRedirectActivity, (Class<?>) LinkActivity.class);
        intent.setFlags(603979776);
        d6.getClass();
        if (d6 instanceof D6.a) {
            intent.putExtra("link_oauth_redirect", true);
            intent.putExtra("link_oauth_received_redirect_uri", ((D6.a) d6).a);
        } else if (d6 instanceof D6.b) {
            intent.putExtra("link_out_of_process_complete_redirect", true);
            intent.putExtra("link_out_of_process_complete_redirect_uri", ((D6.b) d6).a);
        } else if (d6 instanceof D6.d) {
            intent.putExtra("redirect_error", true);
            intent.putExtra("redirect_error_exception", ((D6.d) d6).a);
        } else if (d6 instanceof D6.e) {
            intent.putExtra("link_resume_redirect", true);
        }
        linkRedirectActivity.startActivity(intent);
        return Unit.INSTANCE;
    }
}
