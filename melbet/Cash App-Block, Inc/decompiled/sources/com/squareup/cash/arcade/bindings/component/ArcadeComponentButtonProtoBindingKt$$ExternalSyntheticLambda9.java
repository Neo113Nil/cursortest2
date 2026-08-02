package com.squareup.cash.arcade.bindings.component;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import com.squareup.protos.cash.localization.LocalizedString;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import squareup.cash.ui.arcade.elements.ButtonDefault;

/* loaded from: classes5.dex */
public final /* synthetic */ class ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda9 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ButtonDefault f$0;

    public /* synthetic */ ArcadeComponentButtonProtoBindingKt$$ExternalSyntheticLambda9(ButtonDefault buttonDefault, int i) {
        this.$r8$classId = i;
        this.f$0 = buttonDefault;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        int i = this.$r8$classId;
        ButtonDefault buttonDefault = this.f$0;
        RowScope rowScope = (RowScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                rowScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(rowScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    LocalizedString localizedString = buttonDefault.text;
                    str = localizedString != null ? localizedString.translated_value : null;
                    ArcadeComponentButtonProtoBindingKt.ButtonContent(rowScope, str != null ? str : "", buttonDefault.icon, gapComposer, intValue & 14);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                rowScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(rowScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    LocalizedString localizedString2 = buttonDefault.text;
                    str = localizedString2 != null ? localizedString2.translated_value : null;
                    ArcadeComponentButtonProtoBindingKt.ButtonContent(rowScope, str != null ? str : "", buttonDefault.icon, gapComposer2, intValue & 14);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                rowScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(rowScope) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer;
                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    LocalizedString localizedString3 = buttonDefault.text;
                    str = localizedString3 != null ? localizedString3.translated_value : null;
                    ArcadeComponentButtonProtoBindingKt.ButtonContent(rowScope, str != null ? str : "", buttonDefault.icon, gapComposer3, intValue & 14);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
