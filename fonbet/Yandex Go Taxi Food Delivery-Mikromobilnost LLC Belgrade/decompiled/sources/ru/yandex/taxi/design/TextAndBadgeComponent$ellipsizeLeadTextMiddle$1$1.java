package ru.yandex.taxi.design;

import defpackage.sls;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* synthetic */ class TextAndBadgeComponent$ellipsizeLeadTextMiddle$1$1 extends FunctionReferenceImpl implements sls {
    public TextAndBadgeComponent$ellipsizeLeadTextMiddle$1$1(TextAndBadgeComponent textAndBadgeComponent) {
        super(0, textAndBadgeComponent, TextAndBadgeComponent.class, "getFreeWidthLeadText", "getFreeWidthLeadText()I", 0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int freeWidthLeadText;
        freeWidthLeadText = ((TextAndBadgeComponent) this.receiver).getFreeWidthLeadText();
        return Integer.valueOf(freeWidthLeadText);
    }
}
