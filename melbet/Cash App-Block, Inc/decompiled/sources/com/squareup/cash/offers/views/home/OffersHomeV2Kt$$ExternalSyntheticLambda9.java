package com.squareup.cash.offers.views.home;

import androidx.compose.foundation.text.selection.CrossStatus;
import androidx.compose.foundation.text.selection.SelectableInfo;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;
import com.squareup.cash.offers.viewmodels.viewevents.OffersHomeViewEventV2;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes6.dex */
public final /* synthetic */ class OffersHomeV2Kt$$ExternalSyntheticLambda9 implements Function0 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ int f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ OffersHomeV2Kt$$ExternalSyntheticLambda9(SelectableInfo selectableInfo, int i, int i2, SelectionLayout selectionLayout, Lazy lazy) {
        this.f$0 = selectableInfo;
        this.f$3 = i;
        this.f$4 = i2;
        this.f$1 = selectionLayout;
        this.f$2 = lazy;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        int i2 = this.f$4;
        int i3 = this.f$3;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                ((Function1) obj3).invoke(new OffersHomeViewEventV2.OfferViewed(((OffersHomeViewModelV2.Loaded.OfferItem) obj2).token, i3, i2, ((OffersHomeViewModelV2.Loaded.OffersSection) obj).sectionId));
                return Unit.INSTANCE;
            default:
                SelectableInfo selectableInfo = (SelectableInfo) obj3;
                SelectionLayout selectionLayout = (SelectionLayout) obj2;
                int intValue = ((Number) ((Lazy) obj).getValue()).intValue();
                boolean isStartHandle = selectionLayout.isStartHandle();
                boolean z = selectionLayout.getCrossStatus() == CrossStatus.CROSSED;
                long m978getWordBoundaryjx7JFs = selectableInfo.textLayoutResult.m978getWordBoundaryjx7JFs(i3);
                TextLayoutResult textLayoutResult = selectableInfo.textLayoutResult;
                MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
                int i4 = TextRange.$r8$clinit;
                int i5 = (int) (m978getWordBoundaryjx7JFs >> 32);
                int lineForOffset = multiParagraph.getLineForOffset(i5);
                int i6 = multiParagraph.lineCount;
                if (lineForOffset != intValue) {
                    i5 = intValue >= i6 ? textLayoutResult.getLineStart(i6 - 1) : textLayoutResult.getLineStart(intValue);
                }
                int i7 = (int) (m978getWordBoundaryjx7JFs & BodyPartID.bodyIdMax);
                if (multiParagraph.getLineForOffset(i7) != intValue) {
                    i7 = intValue >= i6 ? multiParagraph.getLineEnd(i6 - 1, false) : multiParagraph.getLineEnd(intValue, false);
                }
                if (i5 == i2) {
                    return selectableInfo.anchorForOffset(i7);
                }
                if (i7 == i2) {
                    return selectableInfo.anchorForOffset(i5);
                }
                if (!(isStartHandle ^ z) ? i3 >= i5 : i3 > i7) {
                    i5 = i7;
                }
                return selectableInfo.anchorForOffset(i5);
        }
    }

    public /* synthetic */ OffersHomeV2Kt$$ExternalSyntheticLambda9(Function1 function1, OffersHomeViewModelV2.Loaded.OfferItem offerItem, OffersHomeViewModelV2.Loaded.OffersSection offersSection, int i, int i2) {
        this.f$0 = function1;
        this.f$1 = offerItem;
        this.f$2 = offersSection;
        this.f$3 = i;
        this.f$4 = i2;
    }
}
