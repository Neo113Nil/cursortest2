package com.squareup.cash.arcade.components.list;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import com.squareup.cash.banking.views.BenefitsLeafletViewKt$$ExternalSyntheticLambda25;
import com.squareup.cash.banking.views.TransfersViewKt$$ExternalSyntheticLambda5;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.collections.immutable.ImmutableList;

/* loaded from: classes5.dex */
public final /* synthetic */ class ListOrderedKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ImmutableList f$0;

    public /* synthetic */ ListOrderedKt$$ExternalSyntheticLambda0(ImmutableList immutableList, int i) {
        this.$r8$classId = i;
        this.f$0 = immutableList;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        ImmutableList immutableList = this.f$0;
        switch (i) {
            case 0:
                ListOrderedSubtleItemsScope listOrderedSubtleItemsScope = (ListOrderedSubtleItemsScope) obj;
                listOrderedSubtleItemsScope.getClass();
                Iterator it = immutableList.iterator();
                while (it.hasNext()) {
                    listOrderedSubtleItemsScope.item(new ComposableLambdaImpl(new TransfersViewKt$$ExternalSyntheticLambda5((String) it.next(), 14), true, 292189616));
                }
                break;
            case 1:
                ListOrderedStandardItemsScope listOrderedStandardItemsScope = (ListOrderedStandardItemsScope) obj;
                listOrderedStandardItemsScope.getClass();
                Iterator it2 = immutableList.iterator();
                while (it2.hasNext()) {
                    listOrderedStandardItemsScope.item(new ComposableLambdaImpl(new TransfersViewKt$$ExternalSyntheticLambda5((String) it2.next(), 15), true, -937466976), null);
                }
                break;
            case 2:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setCollectionInfo(semanticsPropertyReceiver, new CollectionInfo(immutableList.size(), 1));
                break;
            case 3:
                ListOrderedStandardItemsScope listOrderedStandardItemsScope2 = (ListOrderedStandardItemsScope) obj;
                listOrderedStandardItemsScope2.getClass();
                Iterator it3 = immutableList.iterator();
                while (it3.hasNext()) {
                    listOrderedStandardItemsScope2.item(new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda25((AnnotatedString) it3.next(), 4), true, 2070611312), null);
                }
                break;
            default:
                ListOrderedSubtleItemsScope listOrderedSubtleItemsScope2 = (ListOrderedSubtleItemsScope) obj;
                listOrderedSubtleItemsScope2.getClass();
                Iterator it4 = immutableList.iterator();
                while (it4.hasNext()) {
                    listOrderedSubtleItemsScope2.item(new ComposableLambdaImpl(new BenefitsLeafletViewKt$$ExternalSyntheticLambda25((AnnotatedString) it4.next(), 0), true, -1966423399));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
