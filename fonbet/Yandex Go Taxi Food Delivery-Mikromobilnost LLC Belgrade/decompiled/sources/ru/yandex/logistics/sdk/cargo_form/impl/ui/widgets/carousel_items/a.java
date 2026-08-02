package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.carousel_items;

import defpackage.g8w;
import defpackage.l8x;
import defpackage.r9m;
import defpackage.s9m;
import defpackage.t9m;
import defpackage.tje;
import defpackage.tse;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$ObjectRef;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ tse b;
    public final /* synthetic */ androidx.compose.foundation.pager.d c;
    public final /* synthetic */ long w;
    public final /* synthetic */ int x;

    public a(Ref$ObjectRef ref$ObjectRef, tse tseVar, androidx.compose.foundation.pager.d dVar, long j, int i) {
        this.a = ref$ObjectRef;
        this.b = tseVar;
        this.c = dVar;
        this.w = j;
        this.x = i;
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [T, pzt0] */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        g8w g8wVar = (g8w) obj;
        boolean z = g8wVar instanceof s9m;
        Ref$ObjectRef ref$ObjectRef = this.a;
        if (z) {
            ((l8x) ref$ObjectRef.element).a(null);
        } else if ((g8wVar instanceof t9m) || (g8wVar instanceof r9m)) {
            int i = b.a;
            ref$ObjectRef.element = tje.N(this.b, null, null, new CarouselItemsKt$CarouselAutoScrollEffect$launchScrollJob$1(this.c, this.w, this.x, null), 3);
        }
        return zy11.a;
    }
}
