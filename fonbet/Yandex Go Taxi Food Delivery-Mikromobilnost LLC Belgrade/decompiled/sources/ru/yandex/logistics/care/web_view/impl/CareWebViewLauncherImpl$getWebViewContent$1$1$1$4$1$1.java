package ru.yandex.logistics.care.web_view.impl;

import defpackage.bts;
import defpackage.fid;
import defpackage.wls;
import defpackage.wm41;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class CareWebViewLauncherImpl$getWebViewContent$1$1$1$4$1$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        wm41 wm41Var = (wm41) this.receiver;
        bts btsVar = (bts) ((fid) obj);
        btsVar.e0(453413796);
        ((ru.yandex.taxi.logistics.sdk.webview.impl.ui.a) wm41Var).a(btsVar, intValue & 14);
        btsVar.t(false);
        return zy11.a;
    }
}
