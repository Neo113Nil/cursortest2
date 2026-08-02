package ru.yandex.taxi.startup.launch;

import defpackage.cmt;
import defpackage.evu0;
import defpackage.ewx;
import defpackage.fmt;
import defpackage.hd7;
import defpackage.jl40;
import defpackage.kp50;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.owx;
import defpackage.tse;
import defpackage.udq0;
import defpackage.wls;
import defpackage.xd1;
import defpackage.zux;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.client.api.LaunchApi;
import ru.yandex.taxi.network.api.models.GoParsingException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lfmt;", "Lowx;", "<anonymous>", "(Ltse;)Lfmt;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.startup.launch.LaunchRepositoryImpl$makeRequest$response$1", f = "LaunchRepositoryImpl.kt", l = {128, 130}, m = "invokeSuspend", v = 2)
/* loaded from: classes10.dex */
final class LaunchRepositoryImpl$makeRequest$response$1 extends SuspendLambda implements wls {
    final /* synthetic */ xd1 $advertHeaders;
    final /* synthetic */ String $availableGroupId;
    final /* synthetic */ hd7 $cachedExperimentsRequest;
    final /* synthetic */ boolean $needRetry;
    final /* synthetic */ ewx $param;
    final /* synthetic */ String $tokenAfterAuthorization;
    Object L$0;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchRepositoryImpl$makeRequest$response$1(String str, l lVar, ewx ewxVar, String str2, xd1 xd1Var, boolean z, hd7 hd7Var, Continuation continuation) {
        super(2, continuation);
        this.$tokenAfterAuthorization = str;
        this.this$0 = lVar;
        this.$param = ewxVar;
        this.$availableGroupId = str2;
        this.$advertHeaders = xd1Var;
        this.$needRetry = z;
        this.$cachedExperimentsRequest = hd7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LaunchRepositoryImpl$makeRequest$response$1(this.$tokenAfterAuthorization, this.this$0, this.$param, this.$availableGroupId, this.$advertHeaders, this.$needRetry, this.$cachedExperimentsRequest, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LaunchRepositoryImpl$makeRequest$response$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d9, code lost:
    
        if (r2 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        if (r2 == r1) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        cmt<owx> c;
        Object a;
        Object b;
        fmt fmtVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            String str = this.$tokenAfterAuthorization;
            if (str == null || evu0.J(str)) {
                l lVar = this.this$0;
                LaunchApi launchApi = lVar.a;
                ewx ewxVar = this.$param;
                String str2 = this.$availableGroupId;
                String b2 = lVar.f.b();
                String str3 = !evu0.J(b2) ? b2 : null;
                String a2 = this.this$0.f.a();
                String str4 = (a2 == null || evu0.J(a2)) ? null : a2;
                xd1 xd1Var = this.$advertHeaders;
                c = launchApi.c(ewxVar, str2, str3, str4, xd1Var.a, xd1Var.b, xd1Var.c, xd1Var.d, jl40.d);
            } else {
                LaunchApi launchApi2 = this.this$0.a;
                String h = kp50.h(this.$tokenAfterAuthorization);
                String str5 = this.$tokenAfterAuthorization;
                ewx ewxVar2 = this.$param;
                String str6 = this.$availableGroupId;
                String b3 = this.this$0.f.b();
                String str7 = !evu0.J(b3) ? b3 : null;
                String a3 = this.this$0.f.a();
                String str8 = (a3 == null || evu0.J(a3)) ? null : a3;
                xd1 xd1Var2 = this.$advertHeaders;
                c = launchApi2.b(h, str5, ewxVar2, str6, str7, str8, xd1Var2.a, xd1Var2.b, xd1Var2.c, xd1Var2.d, jl40.c);
            }
            if (this.$needRetry) {
                LaunchRepositoryImpl$makeRequest$response$1$response$1 launchRepositoryImpl$makeRequest$response$1$response$1 = new LaunchRepositoryImpl$makeRequest$response$1$response$1(1, this.this$0.b, zux.class, "onError", "onError(Ljava/lang/Throwable;)V", 0);
                this.L$0 = null;
                this.label = 1;
                b = ru.yandex.taxi.network.api.a.b(c, launchRepositoryImpl$makeRequest$response$1$response$1, this);
            } else {
                this.L$0 = null;
                this.label = 2;
                a = c.a(this);
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            b = obj;
            fmtVar = (fmt) b;
        } else {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = obj;
            fmtVar = (fmt) a;
        }
        try {
            owx owxVar = (owx) fmtVar.a;
            udq0.P(owxVar.F, this.this$0.i, this.$cachedExperimentsRequest);
            return new fmt(owxVar, fmtVar.b, fmtVar.c, fmtVar.d, fmtVar.e, fmtVar.f, fmtVar.g, fmtVar.h);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            throw new GoParsingException(e2);
        }
    }
}
