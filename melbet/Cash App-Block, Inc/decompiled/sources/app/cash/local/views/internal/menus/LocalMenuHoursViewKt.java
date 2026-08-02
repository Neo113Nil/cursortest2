package app.cash.local.views.internal.menus;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.local.primitives.MenuHours;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public abstract class LocalMenuHoursViewKt {

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MenuHours.State.values().length];
            try {
                MenuHours.State state = MenuHours.State.Unspecified;
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHours.State state2 = MenuHours.State.Unspecified;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LocalMenuHoursView(Modifier modifier, MenuHours menuHours, TextStyle textStyle, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        TextStyle textStyle2;
        int i4;
        int i5;
        Modifier modifier3;
        TextStyle textStyle3;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier4;
        TextStyle textStyle4;
        int i6;
        menuHours.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1079045629);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (gapComposer.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i8 = i3 | (gapComposer.changedInstance(menuHours) ? 32 : 16);
        if ((i2 & 4) == 0) {
            textStyle2 = textStyle;
            if (gapComposer.changed(textStyle2)) {
                i4 = 256;
                i5 = i8 | i4;
                if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) == 146)) {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                    textStyle3 = textStyle2;
                } else {
                    gapComposer.startDefaults();
                    if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                        Modifier modifier5 = i7 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            i5 &= -897;
                            modifier4 = modifier5;
                            textStyle4 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                            gapComposer.endDefaults();
                            MenuHours.State state = menuHours.state;
                            String str = menuHours.hoursFormatted;
                            String str2 = menuHours.nextAvailableFormatted;
                            i6 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                            if (i6 != 1 && str != null && !StringsKt.isBlank(str)) {
                                gapComposer.startReplaceGroup(-1981512180);
                                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, ((i5 << 3) & 112) | (i5 & 896), 0, 4080, colors.semantic.text.subtle, (Composer) gapComposer, modifier4, textStyle4, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                gapComposer.end(false);
                            } else if (i6 == 2 || str2 == null || StringsKt.isBlank(str2)) {
                                gapComposer.startReplaceGroup(1875755969);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-1981280796);
                                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                                if (colors2 == null) {
                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                                } else {
                                    gapComposer.startReplaceGroup(-1762997739);
                                    gapComposer.end(false);
                                }
                                Room.m1165Text25TpFw(0, 0, 0, 0, ((i5 << 3) & 112) | (i5 & 896), 0, 4080, colors2.semantic.text.subtle, (Composer) gapComposer, modifier4, textStyle4, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                gapComposer.end(false);
                            }
                            modifier3 = modifier4;
                            textStyle3 = textStyle4;
                        } else {
                            modifier4 = modifier5;
                        }
                    } else {
                        gapComposer.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i5 &= -897;
                        }
                        modifier4 = modifier2;
                    }
                    textStyle4 = textStyle2;
                    gapComposer.endDefaults();
                    MenuHours.State state2 = menuHours.state;
                    String str3 = menuHours.hoursFormatted;
                    String str22 = menuHours.nextAvailableFormatted;
                    i6 = WhenMappings.$EnumSwitchMapping$0[state2.ordinal()];
                    if (i6 != 1) {
                    }
                    if (i6 == 2) {
                    }
                    gapComposer.startReplaceGroup(1875755969);
                    gapComposer.end(false);
                    modifier3 = modifier4;
                    textStyle3 = textStyle4;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(modifier3, menuHours, textStyle3, i, i2, 4);
                    return;
                }
                return;
            }
        } else {
            textStyle2 = textStyle;
        }
        i4 = 128;
        i5 = i8 | i4;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDocumentBtcTaxForm.deepLinkSpecs;
    }
}
