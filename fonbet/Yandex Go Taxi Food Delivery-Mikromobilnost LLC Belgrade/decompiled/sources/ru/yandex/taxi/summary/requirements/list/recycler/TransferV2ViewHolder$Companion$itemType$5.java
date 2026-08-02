package ru.yandex.taxi.summary.requirements.list.recycler;

import android.view.View;
import defpackage.iij0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class TransferV2ViewHolder$Companion$itemType$5 extends FunctionReferenceImpl implements wls {
    public static final TransferV2ViewHolder$Companion$itemType$5 b = new TransferV2ViewHolder$Companion$itemType$5(2, 0, n.class, "bindSubtitle", "bindSubtitle(Lru/yandex/taxi/summary/requirements/list/recycler/RequirementItem$Transfer;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = n.Z;
        ((ListItemComponent) ((View) ((n) obj).R)).setSubtitle(((iij0) obj2).b);
        return zy11.a;
    }
}
