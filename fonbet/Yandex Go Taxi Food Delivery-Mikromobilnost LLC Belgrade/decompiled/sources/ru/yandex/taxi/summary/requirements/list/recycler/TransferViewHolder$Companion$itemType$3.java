package ru.yandex.taxi.summary.requirements.list.recycler;

import android.view.View;
import defpackage.iij0;
import defpackage.wls;
import defpackage.xu01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class TransferViewHolder$Companion$itemType$3 extends FunctionReferenceImpl implements wls {
    public static final TransferViewHolder$Companion$itemType$3 b = new TransferViewHolder$Companion$itemType$3(2, 0, xu01.class, "bindTitle", "bindTitle(Lru/yandex/taxi/summary/requirements/list/recycler/RequirementItem$Transfer;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = xu01.U;
        ((ListItemComponent) ((View) ((xu01) obj).R)).setTitle(((iij0) obj2).a);
        return zy11.a;
    }
}
