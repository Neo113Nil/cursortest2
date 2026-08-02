package ru.yandex.taxi.utils;

import defpackage.lr31;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ViewGroupListDelegate$optionHelper$4 extends FunctionReferenceImpl implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        h hVar = (h) this.receiver;
        for (int i = 0; i < intValue2; i++) {
            lr31 lr31Var = (lr31) hVar.f.get(intValue + i);
            hVar.d.invoke(lr31Var.a, hVar.h.get(lr31Var.b));
        }
        hVar.getClass();
        return zy11.a;
    }
}
