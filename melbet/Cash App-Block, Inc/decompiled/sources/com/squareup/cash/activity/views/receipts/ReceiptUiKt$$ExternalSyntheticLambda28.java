package com.squareup.cash.activity.views.receipts;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.ui.ReceiptSection;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class ReceiptUiKt$$ExternalSyntheticLambda28 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ReceiptSection.DetailRow f$0;

    public /* synthetic */ ReceiptUiKt$$ExternalSyntheticLambda28(ReceiptSection.DetailRow detailRow, int i) {
        this.$r8$classId = 3;
        this.f$0 = detailRow;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Icons icons;
        String str;
        int i = this.$r8$classId;
        ReceiptSection.DetailRow detailRow = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Icon icon = detailRow.icon;
                    if (icon == null || (str = icon.arcade_id) == null) {
                        icons = null;
                    } else {
                        Icons.Companion.getClass();
                        icons = zzd.get(str);
                    }
                    Icons icons2 = icons;
                    if (icons2 == null) {
                        gapComposer.startReplaceGroup(1425877799);
                    } else {
                        gapComposer.startReplaceGroup(1425877800);
                        Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer, 48, 12);
                    }
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    String str2 = detailRow.title;
                    if (str2 == null) {
                        gapComposer2.startReplaceGroup(1607549637);
                    } else {
                        gapComposer2.startReplaceGroup(1607549638);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    }
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                    String str3 = detailRow.title;
                    if (str3 == null) {
                        gapComposer3.startReplaceGroup(1711592814);
                    } else {
                        gapComposer3.startReplaceGroup(1711592815);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    }
                    gapComposer3.end(false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ReceiptUiKt.DetailRow(detailRow, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ReceiptUiKt$$ExternalSyntheticLambda28(ReceiptSection.DetailRow detailRow, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = detailRow;
    }
}
