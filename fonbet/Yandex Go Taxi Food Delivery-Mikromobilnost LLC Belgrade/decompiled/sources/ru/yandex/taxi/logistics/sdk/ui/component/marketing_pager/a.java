package ru.yandex.taxi.logistics.sdk.ui.component.marketing_pager;

import androidx.compose.foundation.pager.d;
import defpackage.g8w;
import defpackage.l8x;
import defpackage.r9m;
import defpackage.s9m;
import defpackage.sls;
import defpackage.t9m;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ sls a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ tse c;
    public final /* synthetic */ d w;
    public final /* synthetic */ List x;
    public final /* synthetic */ sls y;

    public a(sls slsVar, Ref$ObjectRef ref$ObjectRef, tse tseVar, d dVar, List list, sls slsVar2) {
        this.a = slsVar;
        this.b = ref$ObjectRef;
        this.c = tseVar;
        this.w = dVar;
        this.x = list;
        this.y = slsVar2;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, pzt0] */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        g8w g8wVar = (g8w) obj;
        boolean z = g8wVar instanceof s9m;
        Ref$ObjectRef ref$ObjectRef = this.b;
        if (z) {
            this.a.invoke();
            ((l8x) ref$ObjectRef.element).a(null);
        } else if ((g8wVar instanceof t9m) || (g8wVar instanceof r9m)) {
            ref$ObjectRef.element = tje.N(this.c, null, null, new MarketingPagerKt$LaunchedPagerScrollingEffect$launchScrollJob$1(this.w, this.x, this.y, null), 3);
        }
        return zy11.a;
    }
}
