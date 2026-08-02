package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.accent_button;

import defpackage.ldc;
import defpackage.lvi0;
import defpackage.mvg;
import defpackage.nb;
import defpackage.ny61;
import defpackage.ob;
import defpackage.scc;
import defpackage.t701;
import defpackage.wpy0;
import defpackage.xpi;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "<unused var>", "Lt701;", Constants.KEY_DATA, "", "Lob;", "<anonymous>", "(ZLt701;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.accent_button.AccentButtonStateHolder$widgetModelFlow$1", f = "AccentButtonStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AccentButtonStateHolder$widgetModelFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ nb $accentButtonMapper;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccentButtonStateHolder$widgetModelFlow$1(nb nbVar, Continuation continuation) {
        super(3, continuation);
        this.$accentButtonMapper = nbVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj).booleanValue();
        AccentButtonStateHolder$widgetModelFlow$1 accentButtonStateHolder$widgetModelFlow$1 = new AccentButtonStateHolder$widgetModelFlow$1(this.$accentButtonMapper, (Continuation) obj3);
        accentButtonStateHolder$widgetModelFlow$1.L$0 = (t701) obj2;
        return accentButtonStateHolder$widgetModelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        t701 t701Var = (t701) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ob obVar = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        xpi xpiVar = t701Var.a.s;
        if (xpiVar != null) {
            nb nbVar = this.$accentButtonMapper;
            ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar = nbVar.b;
            String str = xpiVar.a;
            wpy0 wpy0Var = aVar.b;
            ldc d = wpy0Var.d(str);
            String str2 = xpiVar.b;
            ldc d2 = wpy0Var.d(xpiVar.c);
            String str3 = xpiVar.d;
            ldc d3 = wpy0Var.d(xpiVar.e);
            String str4 = xpiVar.f;
            obVar = new ob(d, str2, d2, str3, d3, str4 != null ? new lvi0(nbVar.a.a(str4), null, null, null, null, 62) : null, xpiVar.g, xpiVar.h);
        }
        return scc.h(obVar);
    }
}
