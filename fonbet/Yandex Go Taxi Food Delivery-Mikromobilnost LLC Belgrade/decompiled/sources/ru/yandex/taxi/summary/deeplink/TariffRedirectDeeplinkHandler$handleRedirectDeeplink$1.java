package ru.yandex.taxi.summary.deeplink;

import android.net.Uri;
import com.yandex.go.taxi.tariffs.interactor.h;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.a60;
import defpackage.by1;
import defpackage.c2l0;
import defpackage.egb1;
import defpackage.evu0;
import defpackage.fnx0;
import defpackage.hz00;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qht0;
import defpackage.tse;
import defpackage.v770;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.deeplink.TariffRedirectDeeplinkHandler$handleRedirectDeeplink$1", f = "TariffRedirectDeeplinkHandler.kt", l = {HProv.ALG_SID_GR3410_12_256, 82}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffRedirectDeeplinkHandler$handleRedirectDeeplink$1 extends SuspendLambda implements wls {
    final /* synthetic */ SelectionOrigin $origin;
    final /* synthetic */ Uri $uri;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffRedirectDeeplinkHandler$handleRedirectDeeplink$1(Uri uri, b bVar, SelectionOrigin selectionOrigin, Continuation continuation) {
        super(2, continuation);
        this.$uri = uri;
        this.this$0 = bVar;
        this.$origin = selectionOrigin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffRedirectDeeplinkHandler$handleRedirectDeeplink$1(this.$uri, this.this$0, this.$origin, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TariffRedirectDeeplinkHandler$handleRedirectDeeplink$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x014c A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean equals;
        Set set;
        Set set2;
        Set set3;
        boolean z;
        mi31 mi31Var;
        List W;
        pex0 pex0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean c = egb1.c(this.$uri);
            b bVar = this.this$0;
            if (!c) {
                ((a60) bVar.f).c(this.$uri.toString(), v770.w);
                return zy11Var;
            }
            Uri uri = this.$uri;
            bVar.getClass();
            equals = "expanded".equals(uri.getQueryParameter("expandingState"));
            b bVar2 = this.this$0;
            Uri uri2 = this.$uri;
            bVar2.getClass();
            String queryParameter = uri2.getQueryParameter("selectedClasses");
            if (queryParameter != null) {
                W = evu0.W(queryParameter, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                set = kotlin.collections.a.N0(W);
            } else {
                set = null;
            }
            String h = ((k) this.this$0.b).h();
            if (equals) {
                c2l0 g = hz00.E.g(this.$uri);
                if (g != null && g.e != null && g.b == null && g.c == null && g.d == null && g.f == null && egb1.b(g)) {
                    fnx0 n = ((k) this.this$0.b).n();
                    if (n != null) {
                        set3 = set;
                        z = equals;
                        mi31Var = n.a;
                    } else {
                        set3 = set;
                        z = equals;
                        mi31Var = null;
                    }
                    if (((Boolean) this.this$0.g.a.b()).booleanValue()) {
                        if (((mi31Var == null || (pex0Var = mi31Var.a) == null) ? null : pex0Var.u0) == TariffOrderFlow.DRIVE_FLOW) {
                            b bVar3 = this.this$0;
                            bVar3.getClass();
                            ((qht0) bVar3.h).d(new by1(mi31Var.b), bVar3.k.a(), ((k) bVar3.b).h(), null);
                            return zy11Var;
                        }
                    }
                    b bVar4 = this.this$0;
                    SelectionOrigin selectionOrigin = this.$origin;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.Z$0 = z;
                    this.label = 2;
                    return b.a(bVar4, mi31Var, z, set3, selectionOrigin, this) != coroutineSingletons ? coroutineSingletons : zy11Var;
                }
            }
            h hVar = this.this$0.e;
            Uri uri3 = this.$uri;
            this.L$0 = null;
            this.L$1 = set;
            this.L$2 = null;
            this.Z$0 = equals;
            this.label = 1;
            Object a = hVar.a(uri3, h, this);
            if (a != coroutineSingletons) {
                set2 = set;
                obj = a;
            }
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return zy11Var;
        }
        equals = this.Z$0;
        set2 = (Set) this.L$1;
        kotlin.b.b(obj);
        mi31Var = (mi31) obj;
        z = equals;
        set3 = set2;
        if (((Boolean) this.this$0.g.a.b()).booleanValue()) {
        }
        b bVar42 = this.this$0;
        SelectionOrigin selectionOrigin2 = this.$origin;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.Z$0 = z;
        this.label = 2;
        if (b.a(bVar42, mi31Var, z, set3, selectionOrigin2, this) != coroutineSingletons) {
        }
    }
}
