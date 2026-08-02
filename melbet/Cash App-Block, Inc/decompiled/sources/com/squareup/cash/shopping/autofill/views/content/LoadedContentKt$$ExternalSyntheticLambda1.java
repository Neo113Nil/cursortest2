package com.squareup.cash.shopping.autofill.views.content;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.room.Room;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.shopping.autofill.screens.AutofillData;
import com.squareup.cash.shopping.autofill.viewmodels.AutofillViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class LoadedContentKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AutofillViewModel.Loaded f$0;

    public /* synthetic */ LoadedContentKt$$ExternalSyntheticLambda1(AutofillViewModel.Loaded loaded, int i) {
        this.$r8$classId = i;
        this.f$0 = loaded;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        AutofillViewModel.Loaded loaded = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).header, (TextLineBalancing) null, loaded.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4088, 0L, (Composer) gapComposer2, SizeKt.fillMaxWidth(companion, 1.0f), ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, loaded.bodyText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    AutofillData autofillData = loaded.autofillData;
                    String str = autofillData.formattedAddress;
                    String takeIfNotBlank = str != null ? ErrorContentKt.takeIfNotBlank(str) : null;
                    if (takeIfNotBlank == null) {
                        gapComposer3.startReplaceGroup(40859484);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(40859485);
                        MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer3.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography == null) {
                            mooncakeTypography = ((Boolean) gapComposer3.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer3, (Modifier) null, mooncakeTypography.smallBody, (TextLineBalancing) null, takeIfNotBlank, (Map) null, (Function1) null, false);
                        gapComposer3.end(false);
                    }
                    String str2 = autofillData.email;
                    String takeIfNotBlank2 = str2 != null ? ErrorContentKt.takeIfNotBlank(str2) : null;
                    if (takeIfNotBlank2 == null) {
                        gapComposer3.startReplaceGroup(41009276);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(41009277);
                        MooncakeTypography mooncakeTypography2 = (MooncakeTypography) gapComposer3.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography2 == null) {
                            mooncakeTypography2 = ((Boolean) gapComposer3.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer3, (Modifier) null, mooncakeTypography2.smallBody, (TextLineBalancing) null, takeIfNotBlank2, (Map) null, (Function1) null, false);
                        gapComposer3.end(false);
                    }
                    String str3 = autofillData.phone;
                    String takeIfNotBlank3 = str3 != null ? ErrorContentKt.takeIfNotBlank(str3) : null;
                    if (takeIfNotBlank3 == null) {
                        gapComposer3.startReplaceGroup(41159068);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(41159069);
                        MooncakeTypography mooncakeTypography3 = (MooncakeTypography) gapComposer3.consume(MooncakeTypographyKt.LocalTypography);
                        if (mooncakeTypography3 == null) {
                            mooncakeTypography3 = ((Boolean) gapComposer3.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
                        }
                        KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer3, (Modifier) null, mooncakeTypography3.smallBody, (TextLineBalancing) null, takeIfNotBlank3, (Map) null, (Function1) null, false);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
