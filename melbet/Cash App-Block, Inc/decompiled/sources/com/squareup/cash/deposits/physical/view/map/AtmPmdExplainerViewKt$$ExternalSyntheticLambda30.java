package com.squareup.cash.deposits.physical.view.map;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.util.cash.StringsKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import squareup.cash.ui.arcade.elements.ListUnordered;

/* loaded from: classes6.dex */
public final /* synthetic */ class AtmPmdExplainerViewKt$$ExternalSyntheticLambda30 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ListUnordered.ListItem f$0;

    public /* synthetic */ AtmPmdExplainerViewKt$$ExternalSyntheticLambda30(ListUnordered.ListItem listItem, int i) {
        this.$r8$classId = i;
        this.f$0 = listItem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        ListUnordered.ListItem listItem = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    LocalizedString localizedString = listItem.label;
                    localizedString.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, StringsKt.translated(localizedString), (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ArcadeComponentProtoBindingKt.translatedOrEmpty(listItem.label), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
