package ru.yandex.taxi.requirements.ui.selector.usual;

import defpackage.tf70;
import defpackage.tls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class UsualOptionSelectorView$listDelegate$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ListItemComponent createView;
        createView = ((UsualOptionSelectorView) this.receiver).createView((tf70) obj);
        return createView;
    }
}
