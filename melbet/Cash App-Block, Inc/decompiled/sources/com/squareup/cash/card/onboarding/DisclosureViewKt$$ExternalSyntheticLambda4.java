package com.squareup.cash.card.onboarding;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.franklin.api.DisclosureBlocker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class DisclosureViewKt$$ExternalSyntheticLambda4 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DisclosureViewModel f$0;

    public /* synthetic */ DisclosureViewKt$$ExternalSyntheticLambda4(DisclosureViewModel disclosureViewModel, int i) {
        this.$r8$classId = i;
        this.f$0 = disclosureViewModel;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        DisclosureViewModel disclosureViewModel = this.f$0;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                ListUnorderedScope listUnorderedScope = (ListUnorderedScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                listUnorderedScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(listUnorderedScope) ? 4 : 2;
                }
                int i4 = intValue;
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
                    for (final DisclosureBlocker.LineItem lineItem : disclosureViewModel.moreInfoPanelLineItems) {
                        listUnorderedScope.ListUnorderedItem(Expect_jvmKt.rememberComposableLambda(-1852256306, new Function2() { // from class: com.squareup.cash.card.onboarding.DisclosureViewKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                int i5 = i2;
                                DisclosureBlocker.LineItem lineItem2 = lineItem;
                                switch (i5) {
                                    case 0:
                                        Composer composer2 = (Composer) obj4;
                                        int intValue2 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                            String str = lineItem2.title_text;
                                            str.getClass();
                                            TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                                            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                            if (colors == null) {
                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                            } else {
                                                gapComposer2.startReplaceGroup(-1762997739);
                                                gapComposer2.end(false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer3 = (Composer) obj4;
                                        int intValue3 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                            String str2 = lineItem2.detail_text;
                                            if (str2 == null) {
                                                gapComposer3.startReplaceGroup(-1287717374);
                                                gapComposer3.end(false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-1287717373);
                                                TextStyle textStyle2 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.standard, (Composer) gapComposer3, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                                gapComposer3.end(false);
                                            }
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(-1469135125, new Function2() { // from class: com.squareup.cash.card.onboarding.DisclosureViewKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                int i5 = i3;
                                DisclosureBlocker.LineItem lineItem2 = lineItem;
                                switch (i5) {
                                    case 0:
                                        Composer composer2 = (Composer) obj4;
                                        int intValue2 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                            String str = lineItem2.title_text;
                                            str.getClass();
                                            TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                                            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                                            if (colors == null) {
                                                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                                            } else {
                                                gapComposer2.startReplaceGroup(-1762997739);
                                                gapComposer2.end(false);
                                            }
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        Composer composer3 = (Composer) obj4;
                                        int intValue3 = ((Integer) obj5).intValue();
                                        GapComposer gapComposer3 = (GapComposer) composer3;
                                        if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                                            String str2 = lineItem2.detail_text;
                                            if (str2 == null) {
                                                gapComposer3.startReplaceGroup(-1287717374);
                                                gapComposer3.end(false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-1287717373);
                                                TextStyle textStyle2 = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                                                Colors colors2 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors2 == null) {
                                                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors2.semantic.text.standard, (Composer) gapComposer3, (Modifier) null, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                                gapComposer3.end(false);
                                            }
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), (Function2) null, gapComposer, ((i4 << 15) & 458752) | 3078, 22);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (!gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 17) != 16)) {
                    gapComposer2.skipToGroupEnd();
                } else if (disclosureViewModel.hasFullyScrolled) {
                    gapComposer2.startReplaceGroup(2146355192);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, disclosureViewModel.acceptButtonText, (Map) null, (Function1) null, false);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(2146427019);
                    Trace.m1191Iconww6aTOc(Icons.TickerDown24, (String) null, (Modifier) null, 0L, gapComposer2, 54, 12);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, disclosureViewModel.scrollButtonText, (Map) null, (Function1) null, false);
                    gapComposer2.end(false);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
