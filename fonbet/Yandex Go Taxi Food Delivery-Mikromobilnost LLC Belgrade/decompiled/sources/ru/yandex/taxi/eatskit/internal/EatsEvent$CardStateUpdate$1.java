package ru.yandex.taxi.eatskit.internal;

import defpackage.ecn;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class EatsEvent$CardStateUpdate$1 extends FunctionReferenceImpl implements wls {
    public static final EatsEvent$CardStateUpdate$1 b = new EatsEvent$CardStateUpdate$1(2, 0, ecn.class, "setVisibility", "setVisibility(Z)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ecn ecnVar = (ecn) obj;
        if (((Boolean) obj2).booleanValue()) {
            ecnVar.g("willOpen", new Object[0]);
        } else {
            ecnVar.g("didHide", new Object[0]);
        }
        return zy11.a;
    }
}
