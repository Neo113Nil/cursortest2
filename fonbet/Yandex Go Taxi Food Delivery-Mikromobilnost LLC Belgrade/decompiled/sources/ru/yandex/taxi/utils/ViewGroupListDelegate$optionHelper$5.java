package ru.yandex.taxi.utils;

import android.view.ViewGroup;
import defpackage.lr31;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class ViewGroupListDelegate$optionHelper$5 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        h hVar = (h) this.receiver;
        ArrayList arrayList = hVar.f;
        lr31 lr31Var = (lr31) arrayList.get(intValue);
        arrayList.remove(intValue);
        arrayList.add(intValue2, lr31Var);
        ViewGroup viewGroup = hVar.a;
        int indexOfChild = viewGroup.indexOfChild(lr31Var.a);
        viewGroup.removeViewAt(indexOfChild);
        viewGroup.addView(lr31Var.a, (intValue2 - intValue) + indexOfChild);
        return zy11.a;
    }
}
