package com.squareup.cash.formview.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.core.graphics.ColorUtils;
import androidx.room.Room;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeFormViewTitleBar$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArcadeFormViewTitleBar f$0;

    public /* synthetic */ ArcadeFormViewTitleBar$$ExternalSyntheticLambda0(ArcadeFormViewTitleBar arcadeFormViewTitleBar, int i) {
        this.$r8$classId = i;
        this.f$0 = arcadeFormViewTitleBar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Color m;
        int i = this.$r8$classId;
        Object obj3 = Composer.Companion.Empty;
        ArcadeFormViewTitleBar arcadeFormViewTitleBar = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    ColorModel colorModel = (ColorModel) arcadeFormViewTitleBar.fullBleedBackgroundColor$delegate.getValue();
                    Object obj4 = null;
                    if (colorModel == null) {
                        gapComposer.startReplaceGroup(-2031282340);
                        gapComposer.end(false);
                        m = null;
                    } else {
                        m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1874137413, colorModel, gapComposer, false);
                    }
                    Integer valueOf = m != null ? Integer.valueOf(ColorKt.m694toArgb8_81llA(m.value)) : null;
                    boolean changed = gapComposer.changed(valueOf);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj3) {
                        if (valueOf != null) {
                            Iterator it = CollectionsKt__CollectionsKt.listOf((Object[]) new Colors[]{ColorsLightKt.colorsLight, ColorsDarkKt.colorsDark}).iterator();
                            if (!it.hasNext()) {
                                a$$ExternalSyntheticBUOutline0.m();
                                break;
                            } else {
                                Object next = it.next();
                                if (it.hasNext()) {
                                    double calculateContrast = ColorUtils.calculateContrast(ColorKt.m694toArgb8_81llA(((Colors) next).component.titleBar.icon.f218default), valueOf.intValue());
                                    do {
                                        Object next2 = it.next();
                                        double calculateContrast2 = ColorUtils.calculateContrast(ColorKt.m694toArgb8_81llA(((Colors) next2).component.titleBar.icon.f218default), valueOf.intValue());
                                        if (Double.compare(calculateContrast, calculateContrast2) < 0) {
                                            next = next2;
                                            calculateContrast = calculateContrast2;
                                        }
                                    } while (it.hasNext());
                                }
                                obj4 = (Colors) next;
                            }
                        }
                        gapComposer.updateRememberedValue(obj4);
                        rememberedValue = obj4;
                    }
                    Colors colors = (Colors) rememberedValue;
                    if (colors == null) {
                        gapComposer.startReplaceGroup(-2030584374);
                        arcadeFormViewTitleBar.TitleBarContent(gapComposer, 8);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-2030456468);
                        ArcadeThemeKt.ArcadeTheme(colors, null, null, Expect_jvmKt.rememberComposableLambda(1580341932, new ArcadeFormViewTitleBar$$ExternalSyntheticLambda0(arcadeFormViewTitleBar, 3), gapComposer), gapComposer, 3072, 6);
                        gapComposer.end(false);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                ((String) obj2).getClass();
                arcadeFormViewTitleBar.onUrlClick.invoke(str);
                break;
            case 2:
                ((Integer) obj2).getClass();
                arcadeFormViewTitleBar.Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 3:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    arcadeFormViewTitleBar.TitleBarContent(gapComposer2, 8);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 4:
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = arcadeFormViewTitleBar.title$delegate;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (!gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    gapComposer3.skipToGroupEnd();
                } else if (((String) parcelableSnapshotMutableState.getValue()) != null) {
                    gapComposer3.startReplaceGroup(-10370609);
                    String str2 = (String) parcelableSnapshotMutableState.getValue();
                    str2.getClass();
                    boolean changedInstance = gapComposer3.changedInstance(arcadeFormViewTitleBar);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changedInstance || rememberedValue2 == obj3) {
                        rememberedValue2 = new GpsConfigQueries$$ExternalSyntheticLambda2(arcadeFormViewTitleBar, 1);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    Modifier graphicsLayer = ColorKt.graphicsLayer(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue2);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (rememberedValue3 == obj3) {
                        rememberedValue3 = new GpsConfigQueries$$ExternalSyntheticLambda1(2);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4028, 0L, (Composer) gapComposer3, SemanticsModifierKt.clearAndSetSemantics(graphicsLayer, (Function1) rememberedValue3), (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(-9834061);
                    gapComposer3.end(false);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                arcadeFormViewTitleBar.TitleBarContent((Composer) obj, Updater.updateChangedFlags(9));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeFormViewTitleBar$$ExternalSyntheticLambda0(ArcadeFormViewTitleBar arcadeFormViewTitleBar, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = arcadeFormViewTitleBar;
    }
}
