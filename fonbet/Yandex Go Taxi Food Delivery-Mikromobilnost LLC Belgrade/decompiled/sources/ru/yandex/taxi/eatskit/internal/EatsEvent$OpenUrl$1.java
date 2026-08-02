package ru.yandex.taxi.eatskit.internal;

import defpackage.ecn;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class EatsEvent$OpenUrl$1 extends FunctionReferenceImpl implements wls {
    public static final EatsEvent$OpenUrl$1 b = new EatsEvent$OpenUrl$1(2, 0, ecn.class, "openUrl", "openUrl(Ljava/lang/String;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((ecn) obj).g("openUrl", (String) obj2);
        return zy11.a;
    }
}
