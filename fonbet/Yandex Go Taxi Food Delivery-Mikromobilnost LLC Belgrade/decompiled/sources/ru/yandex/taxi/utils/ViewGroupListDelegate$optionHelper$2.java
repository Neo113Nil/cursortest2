package ru.yandex.taxi.utils;

import defpackage.lr31;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ViewGroupListDelegate$optionHelper$2 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        ArrayList arrayList = ((h) this.receiver).f;
        int size = arrayList.size();
        for (int intValue2 = ((Number) obj).intValue(); intValue2 < size; intValue2++) {
            ((lr31) arrayList.get(intValue2)).b -= intValue;
        }
        return zy11.a;
    }
}
