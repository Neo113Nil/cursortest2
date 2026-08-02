package ru.yandex.taxi.logistics.sdk.promotions.impl.ui;

import defpackage.lr4;
import defpackage.tls;
import defpackage.xbp0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class BannerCarouselViewImpl$Content$1$1$3$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        b bVar = (b) this.receiver;
        bVar.c.c(str);
        xbp0 xbp0Var = bVar.f;
        if (xbp0Var != null) {
            lr4 lr4Var = bVar.d;
            lr4Var.getClass();
            lr4Var.b(lr4.a(xbp0Var), "Tapped", str);
        }
        return zy11.a;
    }
}
