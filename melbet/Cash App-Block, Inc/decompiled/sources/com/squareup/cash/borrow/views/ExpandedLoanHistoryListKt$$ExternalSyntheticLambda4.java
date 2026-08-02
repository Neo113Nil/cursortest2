package com.squareup.cash.borrow.views;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import com.squareup.cash.borrow.viewmodels.ExpandedLoanHistoryListModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.localization.LocalizedString;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class ExpandedLoanHistoryListKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ExpandedLoanHistoryListModel f$0;

    public /* synthetic */ ExpandedLoanHistoryListKt$$ExternalSyntheticLambda4(ExpandedLoanHistoryListModel expandedLoanHistoryListModel, int i) {
        this.$r8$classId = i;
        this.f$0 = expandedLoanHistoryListModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        ExpandedLoanHistoryListModel expandedLoanHistoryListModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    LocalizedString localizedString = expandedLoanHistoryListModel.data.list_header;
                    localizedString.getClass();
                    String str = localizedString.translated_value;
                    str.getClass();
                    String lowerCase = str.toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (lowerCase.length() > 0) {
                        lowerCase = Character.toTitleCase(lowerCase.charAt(0)) + lowerCase.substring(1);
                    }
                    ViewfinderDefaults.SectionHeader(lowerCase, m302paddingqDBjuR0$default, (String) null, (Function0) null, (String) null, gapComposer, 48, 28);
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
                    LocalizedString localizedString2 = expandedLoanHistoryListModel.data.expand_button_title;
                    localizedString2.getClass();
                    String str2 = localizedString2.translated_value;
                    str2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
