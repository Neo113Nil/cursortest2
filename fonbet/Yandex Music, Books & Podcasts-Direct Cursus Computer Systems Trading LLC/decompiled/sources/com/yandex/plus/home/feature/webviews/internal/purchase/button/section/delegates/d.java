package com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates;

import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.h;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.i;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.l;
import defpackage.aur;
import defpackage.b6e;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.xdr;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class d extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new d((f) this.k, continuation, 0);
            case 1:
                return new d((com.yandex.plus.home.plaque.feature.internal.presentation.b) this.k, continuation, 1);
            case 2:
                return new d((l) this.k, continuation, 2);
            default:
                return new d((com.yandex.plus.pay.ui.webview.paymentwidget.ui.d) this.k, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((d) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        Object obj2 = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                f fVar = (f) obj2;
                xdr xdrVar = fVar.g;
                Boolean bool = Boolean.FALSE;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                xdr xdrVar2 = fVar.h;
                xdrVar2.getClass();
                xdrVar2.m(null, bool);
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.home.plaque.feature.internal.presentation.b bVar = (com.yandex.plus.home.plaque.feature.internal.presentation.b) obj2;
                com.yandex.plus.pay.ui.core.debug.internal.domain.log.a aVar = (com.yandex.plus.pay.ui.core.debug.internal.domain.log.a) bVar.d;
                List w0 = CollectionsKt.w0(((com.yandex.plus.pay.log.impl.b) bVar.b).b.d);
                aVar.getClass();
                w0.getClass();
                byte[] bytes = CollectionsKt.X(w0, StringUtil.LF, null, null, new com.yandex.plus.pay.ui.common.internal.error.content.b(4), 30).getBytes(Charsets.UTF_8);
                bytes.getClass();
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                l lVar = (l) obj2;
                i iVar = (i) lVar.v.getValue();
                if (!(iVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.f) && !(iVar instanceof com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.silent.g)) {
                    if (!(iVar instanceof h)) {
                        b6e.s();
                        break;
                    }
                } else {
                    lVar.G(true);
                    lVar.t.b();
                    lVar.p.a();
                }
                break;
            default:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                com.yandex.plus.pay.ui.webview.paymentwidget.ui.d dVar = (com.yandex.plus.pay.ui.webview.paymentwidget.ui.d) obj2;
                String str = dVar.o;
                if (str != null) {
                    dVar.k.a(dVar.h, str, "load");
                    dVar.j.y("Loaded message timeout!");
                }
                com.yandex.plus.log.api.b bVar2 = dVar.i;
                com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.e;
                if (bVar2.b(aVar2)) {
                    bVar2.c(aVar2, "WebPaymentWidgetContractImpl", "Loaded message timeout!");
                }
                break;
        }
        return Unit.a;
    }
}
