package com.squareup.cash.profile.views.notifications;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.profile.viewmodels.Category;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final /* synthetic */ class CategoryListViewKt$$ExternalSyntheticLambda16 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Category f$0;

    public /* synthetic */ CategoryListViewKt$$ExternalSyntheticLambda16(Category category, int i) {
        this.$r8$classId = i;
        this.f$0 = category;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Category category = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Category.Icon icon = category.icon;
                    Icons notificationIcon = icon != null ? ProfileNotificationsUiMapperKt.getNotificationIcon(icon) : null;
                    if (notificationIcon == null) {
                        gapComposer.startReplaceGroup(-867865866);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-867865865);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        Trace.m1191Iconww6aTOc(notificationIcon, (String) null, (Modifier) null, colors.semantic.icon.standard, gapComposer, 48, 4);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Category.Icon icon2 = category.icon;
                    Icons notificationIcon2 = icon2 != null ? ProfileNotificationsUiMapperKt.getNotificationIcon(icon2) : null;
                    if (notificationIcon2 == null) {
                        gapComposer2.startReplaceGroup(-350158636);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-350158635);
                        Trace.m1191Iconww6aTOc(notificationIcon2, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer3, (Modifier) null, ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, category.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 3:
                String str = category.body;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (!gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    gapComposer4.skipToGroupEnd();
                } else if (str == null || str.length() <= 0) {
                    gapComposer4.startReplaceGroup(-1804675918);
                    gapComposer4.end(false);
                } else {
                    gapComposer4.startReplaceGroup(-1804772979);
                    str.getClass();
                    Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer4.end(false);
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, category.title, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            default:
                String str2 = category.body;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (str2 == null || str2.length() <= 0) {
                        gapComposer6.startReplaceGroup(-548700472);
                    } else {
                        gapComposer6.startReplaceGroup(1367772841);
                        str2.getClass();
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    }
                    gapComposer6.end(false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
