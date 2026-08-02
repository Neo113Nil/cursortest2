package ru.yandex.taxi.requirements.ui.selector.compound;

import defpackage.pud;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class CompoundOptionSelectorView$listDelegate$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ListItemComponent createView;
        createView = ((CompoundOptionSelectorView) this.receiver).createView((pud) obj);
        return createView;
    }
}
