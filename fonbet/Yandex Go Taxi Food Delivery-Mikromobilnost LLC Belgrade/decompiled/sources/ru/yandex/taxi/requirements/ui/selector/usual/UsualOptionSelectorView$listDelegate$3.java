package ru.yandex.taxi.requirements.ui.selector.usual;

import defpackage.tf70;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class UsualOptionSelectorView$listDelegate$3 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((UsualOptionSelectorView) this.receiver).bindItem((ListItemComponent) obj, (tf70) obj2);
        return zy11.a;
    }
}
