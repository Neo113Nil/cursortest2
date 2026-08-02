package ru.yandex.taxi.surge.widget;

import android.net.Uri;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.taxi.tariffs.interactor.h;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a60;
import defpackage.a7t0;
import defpackage.arv0;
import defpackage.egb1;
import defpackage.fnx0;
import defpackage.gnx0;
import defpackage.jl40;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.nuw0;
import defpackage.ny61;
import defpackage.tse;
import defpackage.v770;
import defpackage.wls;
import defpackage.y50;
import defpackage.yqv0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.surge.widget.SurgeInfoDeeplinkHandlerImpl$handleRedirectDeeplink$1", f = "SurgeInfoDeeplinkHandlerImpl.kt", l = {120}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SurgeInfoDeeplinkHandlerImpl$handleRedirectDeeplink$1 extends SuspendLambda implements wls {
    final /* synthetic */ Uri $uri;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SurgeInfoDeeplinkHandlerImpl$handleRedirectDeeplink$1(Uri uri, b bVar, Continuation continuation) {
        super(2, continuation);
        this.$uri = uri;
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SurgeInfoDeeplinkHandlerImpl$handleRedirectDeeplink$1(this.$uri, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SurgeInfoDeeplinkHandlerImpl$handleRedirectDeeplink$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean c = egb1.c(this.$uri);
            b bVar = this.this$0;
            if (!c) {
                ((a60) ((y50) bVar.f.get())).c(this.$uri.toString(), v770.w);
                return zy11Var;
            }
            String h = ((k) bVar.b).h();
            h hVar = this.this$0.e;
            Uri uri = this.$uri;
            this.L$0 = null;
            this.label = 1;
            obj = hVar.a(uri, h, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        mi31 mi31Var = (mi31) obj;
        b bVar2 = this.this$0;
        arv0 arv0Var = bVar2.d;
        k kVar = (k) bVar2.c;
        String h2 = kVar.h();
        if (mi31Var != null) {
            bVar2.a.a(new gnx0(new fnx0(mi31Var, SelectionOrigin.DEEPLINK), true));
        }
        if (!jl40.l(kVar.h(), h2)) {
            a7t0 a7t0Var = (a7t0) arv0Var;
            if (a7t0Var.a().a == SummaryUiState$Type.TRAP) {
                a7t0Var.b(new yqv0(SummaryUiState$Type.NORMAL, ""));
            }
        }
        nuw0 nuw0Var = bVar2.l;
        if (mi31Var != null && (str = mi31Var.b) != null) {
            h2 = str;
        }
        nuw0Var.b(h2);
        return zy11Var;
    }
}
