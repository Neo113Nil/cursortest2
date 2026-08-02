package ru.yandex.taxi.requirements.ui.selector.compound;

import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class CompoundOptionSelectorView$listDelegate$4 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ((CompoundOptionSelectorView) this.receiver).removeView((ListItemComponent) obj);
        return zy11.a;
    }
}
