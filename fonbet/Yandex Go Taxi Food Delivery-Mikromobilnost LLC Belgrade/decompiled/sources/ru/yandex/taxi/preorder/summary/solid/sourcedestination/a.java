package ru.yandex.taxi.preorder.summary.solid.sourcedestination;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.p81;
import defpackage.sls;
import defpackage.zy11;
import ru.yandex.taxi.address.design.SourceDestinationComponentV2;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements sls {
    public final /* synthetic */ b a;

    public /* synthetic */ a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = this.a;
        FrameLayout frameLayout = bVar.a;
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        SourceDestinationComponentV2 sourceDestinationComponentV2 = new SourceDestinationComponentV2(frameLayout.getContext(), bVar.i);
        sourceDestinationComponentV2.setOnSourceClickListener(new SummarySourceDestinationViewHolder$createNewbiesAddressBlock$1$1$1(0, bVar, b.class, "showSourceAddressSelector", "showSourceAddressSelector()V", 0));
        sourceDestinationComponentV2.setOnDestinationClickListener(new SummarySourceDestinationViewHolder$createNewbiesAddressBlock$1$1$2(0, bVar, b.class, "showDestinationAddressSelector", "showDestinationAddressSelector()V", 0));
        sourceDestinationComponentV2.updateBottomDivider(!(bVar.j.a instanceof p81));
        bVar.o = sourceDestinationComponentV2;
        linearLayout.addView(sourceDestinationComponentV2, -1, -2);
        frameLayout.addView(linearLayout, -1, -2);
        return zy11.a;
    }
}
