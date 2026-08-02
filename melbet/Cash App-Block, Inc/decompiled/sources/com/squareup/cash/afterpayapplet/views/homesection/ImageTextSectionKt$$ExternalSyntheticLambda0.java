package com.squareup.cash.afterpayapplet.views.homesection;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class ImageTextSectionKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel f$0;

    public /* synthetic */ ImageTextSectionKt$$ExternalSyntheticLambda0(AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel, int i) {
        this.$r8$classId = i;
        this.f$0 = buttonModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        AfterpayAppletHomeContentViewModel.HomeSection.ButtonModel buttonModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    String str = buttonModel.iconId;
                    if (str == null) {
                        gapComposer.startReplaceGroup(353081344);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(353081345);
                        Icons.Companion.getClass();
                        Icons icons = zzd.get(str);
                        if (icons != null) {
                            gapComposer.startReplaceGroup(-433071756);
                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer, 48, 12);
                            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 8.0f));
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-432966046);
                            gapComposer.end(false);
                        }
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).button, (TextLineBalancing) null, buttonModel.buttonText, (Map) null, (Function1) null, false);
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
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonModel.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    String str2 = buttonModel.iconId;
                    if (str2 == null) {
                        gapComposer3.startReplaceGroup(1082278454);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(1082278455);
                        Icons.Companion.getClass();
                        Icons icons2 = zzd.get(str2);
                        if (icons2 != null) {
                            gapComposer3.startReplaceGroup(1071104102);
                            Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer3, 48, 12);
                            SpacerKt.Spacer(gapComposer3, SizeKt.m290width3ABfNKs(companion, 8.0f));
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(1071209812);
                            gapComposer3.end(false);
                        }
                        gapComposer3.end(false);
                    }
                    KeypadKt.m3651TextPdH14aY(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer3, (Modifier) null, ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).button, (TextLineBalancing) null, buttonModel.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                    String str3 = buttonModel.buttonText;
                    Colors colors = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.inverse, (Composer) gapComposer4, (Modifier) null, ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).button, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            default:
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 17) != 16)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, buttonModel.buttonText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
