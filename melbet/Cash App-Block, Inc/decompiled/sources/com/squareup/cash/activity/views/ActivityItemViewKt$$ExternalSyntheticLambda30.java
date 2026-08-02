package com.squareup.cash.activity.views;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.activity.viewmodels.ItemAccessory;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class ActivityItemViewKt$$ExternalSyntheticLambda30 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ItemAccessory.PortraitImage f$0;

    public /* synthetic */ ActivityItemViewKt$$ExternalSyntheticLambda30(ItemAccessory.PortraitImage portraitImage, int i) {
        this.$r8$classId = i;
        this.f$0 = portraitImage;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        ItemAccessory.PortraitImage portraitImage = this.f$0;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                function0.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changedInstance(function0) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    ActivityItemViewKt.PortraitImageFallbackButton(portraitImage, function0, null, gapComposer, (intValue << 3) & 112);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    Icons icons = portraitImage.fallbackIcon;
                    gapComposer2.startReplaceGroup(-2097976505);
                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                    gapComposer2.end(false);
                    String str = portraitImage.fallbackButtonText;
                    if (str == null) {
                        str = re$$ExternalSyntheticOutline0.m(gapComposer2, 486515611, R.string.activity_item_action_view, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(486514619);
                        gapComposer2.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Function0 function02 = (Function0) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                function02.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changedInstance(function02) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    ActivityItemViewKt.PortraitImageFallbackButton(portraitImage, function02, null, gapComposer3, (intValue3 << 3) & 112);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
