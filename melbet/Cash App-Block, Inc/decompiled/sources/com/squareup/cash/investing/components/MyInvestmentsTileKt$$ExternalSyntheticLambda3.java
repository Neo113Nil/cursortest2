package com.squareup.cash.investing.components;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.viewmodels.MyInvestmentsContentModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class MyInvestmentsTileKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ MyInvestmentsContentModel.StatRow f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ MyInvestmentsTileKt$$ExternalSyntheticLambda3(long j, MyInvestmentsContentModel.StatRow statRow) {
        this.f$1 = j;
        this.f$0 = statRow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        MyInvestmentsContentModel.StatRow statRow = this.f$0;
        Object[] objArr = 0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, statRow.label, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    AnnotatedString.Builder builder = new AnnotatedString.Builder();
                    MyInvestmentsContentModel.StatRow.StatValueIconKind statValueIconKind = statRow.valueIcon;
                    if (statValueIconKind != null) {
                        KeyMappingKt.appendInlineContent(builder, statValueIconKind.name(), "�");
                    }
                    builder.append(statRow.value);
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    Placeholder placeholder = new Placeholder(7, Room.getSp(16), Room.getSp(16));
                    long j = this.f$1;
                    Room.m1164Text25TpFw(0, 0, 0, 0, 0, 0, 2038, j, (Composer) gapComposer2, (Modifier) null, annotatedString, (TextStyle) null, (TextLineBalancing) null, MapsKt__MapsKt.mapOf(new Pair("ArrowUp", new InlineTextContent(placeholder, Expect_jvmKt.rememberComposableLambda(-963131425, new MyInvestmentsTileKt$$ExternalSyntheticLambda6(j, objArr == true ? 1 : 0), gapComposer2))), new Pair("ArrowDown", new InlineTextContent(new Placeholder(7, Room.getSp(16), Room.getSp(16)), Expect_jvmKt.rememberComposableLambda(1494353568, new MyInvestmentsTileKt$$ExternalSyntheticLambda6(j, 4), gapComposer2)))), (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MyInvestmentsTileKt$$ExternalSyntheticLambda3(MyInvestmentsContentModel.StatRow statRow, long j) {
        this.f$0 = statRow;
        this.f$1 = j;
    }
}
