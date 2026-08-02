package ru.yandex.taxi.utils;

import defpackage.lr31;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ViewGroupListDelegate$optionHelper$3 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        h hVar = (h) this.receiver;
        hVar.getClass();
        if (intValue < intValue2) {
            i = -1;
        } else {
            i = 1;
            intValue2 = intValue;
            intValue = intValue2;
        }
        for (int i2 = intValue; i2 < intValue2; i2++) {
            lr31 lr31Var = (lr31) hVar.f.get(i2);
            if (i2 == intValue) {
                lr31Var.b = intValue2;
            } else {
                lr31Var.b += i;
            }
        }
        return zy11.a;
    }
}
