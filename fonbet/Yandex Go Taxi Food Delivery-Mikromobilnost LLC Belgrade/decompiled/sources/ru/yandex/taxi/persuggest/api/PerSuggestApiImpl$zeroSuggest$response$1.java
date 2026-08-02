package ru.yandex.taxi.persuggest.api;

import android.os.SystemClock;
import defpackage.cmt;
import defpackage.fmt;
import defpackage.mvg;
import defpackage.nc61;
import defpackage.ny61;
import defpackage.rc61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.perf.screen.ScreenEndpoint;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lfmt;", "Lrc61;", "<anonymous>", "(Ltse;)Lfmt;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.persuggest.api.PerSuggestApiImpl$zeroSuggest$response$1", f = "PerSuggestApiImpl.kt", l = {44, 44}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PerSuggestApiImpl$zeroSuggest$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ cmt<rc61> $call;
    final /* synthetic */ nc61 $params;
    final /* synthetic */ boolean $retryRequests;
    final /* synthetic */ long $start;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerSuggestApiImpl$zeroSuggest$response$1(boolean z, cmt cmtVar, long j, a aVar, nc61 nc61Var, Continuation continuation) {
        super(2, continuation);
        this.$retryRequests = z;
        this.$call = cmtVar;
        this.$start = j;
        this.this$0 = aVar;
        this.$params = nc61Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PerSuggestApiImpl$zeroSuggest$response$1(this.$retryRequests, this.$call, this.$start, this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PerSuggestApiImpl$zeroSuggest$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002a, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0036, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        fmt fmtVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            boolean z = this.$retryRequests;
            cmt<rc61> cmtVar = this.$call;
            if (z) {
                this.label = 1;
                obj = ru.yandex.taxi.network.api.a.b(cmtVar, null, this);
            } else {
                this.label = 2;
                obj = cmtVar.a(this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            b.b(obj);
            fmtVar = (fmt) obj;
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            fmtVar = (fmt) obj;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.$start;
        String a = fmtVar.e.a("X-YaTraceId");
        if (a == null) {
            a = "";
        }
        this.this$0.b.a(ScreenEndpoint.ZeroSuggest, elapsedRealtime, a, this.$params.c);
        return fmtVar;
    }
}
