package com.squareup.cash.benefits.views;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.benefits.viewmodels.BankingBenefitsBookletViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class BankingBenefitsBookletViewKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BankingBenefitsBookletViewModel f$0;

    public /* synthetic */ BankingBenefitsBookletViewKt$$ExternalSyntheticLambda4(BankingBenefitsBookletViewModel bankingBenefitsBookletViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = bankingBenefitsBookletViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        BankingBenefitsBookletViewModel bankingBenefitsBookletViewModel = this.f$0;
        switch (i) {
            case 0:
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(listUnorderedScope) ? 4 : 2;
                }
                int i2 = intValue;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    for (BankingBenefitsBookletViewModel.Loaded.BookletIconItem bookletIconItem : ((BankingBenefitsBookletViewModel.Loaded) bankingBenefitsBookletViewModel).iconListItems) {
                        AnnotatedString annotatedString = new AnnotatedString(bookletIconItem.text);
                        zzd zzdVar = Icons.Companion;
                        String str = bookletIconItem.icon.arcade_id;
                        str.getClass();
                        zzdVar.getClass();
                        Icons icons = zzd.get(str);
                        icons.getClass();
                        listUnorderedScope.ListUnorderedItem(annotatedString, (Modifier) null, icons, (AnnotatedString) null, (AnnotatedString) null, gapComposer, (i2 << 15) & 458752, 26);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((BankingBenefitsBookletViewModel.Loaded) bankingBenefitsBookletViewModel).footerButtonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
