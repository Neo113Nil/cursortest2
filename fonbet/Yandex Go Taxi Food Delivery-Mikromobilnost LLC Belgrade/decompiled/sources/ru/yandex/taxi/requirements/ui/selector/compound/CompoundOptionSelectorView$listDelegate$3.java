package ru.yandex.taxi.requirements.ui.selector.compound;

import defpackage.pud;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class CompoundOptionSelectorView$listDelegate$3 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((CompoundOptionSelectorView) this.receiver).bindItem((ListItemComponent) obj, (pud) obj2);
        return zy11.a;
    }
}
