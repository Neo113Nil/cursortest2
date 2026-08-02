package ru.yandex.taxi.utils;

import android.view.View;
import android.view.ViewGroup;
import defpackage.lr31;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ViewGroupListDelegate$optionHelper$7 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        h hVar = (h) this.receiver;
        ArrayList arrayList = hVar.f;
        lr31 lr31Var = (lr31) kotlin.collections.a.S(intValue - 1, arrayList);
        int i = lr31Var != null ? lr31Var.b + 1 : intValue;
        for (int i2 = 0; i2 < intValue2; i2++) {
            int i3 = i + i2;
            int i4 = intValue + i2;
            Object obj3 = hVar.h.get(i3);
            View view = (View) hVar.c.invoke(obj3);
            lr31 lr31Var2 = new lr31(view, i3);
            hVar.d.invoke(view, obj3);
            arrayList.add(i4, lr31Var2);
            hVar.a.addView(view, i4, new ViewGroup.LayoutParams(-1, -2));
        }
        return zy11.a;
    }
}
