package com.squareup.cash.genericelements.components.components.arcade;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.maps.internal.zza;
import com.google.android.play.integrity.internal.ak;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListUnorderedItem;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.familyhub.views.FamilyHomeSectionsKt$$ExternalSyntheticLambda6;
import com.squareup.cash.family.familyhub.views.FamilyMemberRowKt$$ExternalSyntheticLambda5;
import com.squareup.cash.genericelements.viewmodels.GenericBaseViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush;
import com.squareup.cash.genericelements.viewmodels.GenericComponentViewModel$CellDefaultViewModel$Accessory$Push;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda4;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.invitations.InviteContactsBodyKt$$ExternalSyntheticLambda18;
import com.squareup.cash.money.booklet.MoneyTabBookletKt$$ExternalSyntheticLambda4;
import com.squareup.protos.cash.genericelements.ui.ArcadeTextElement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class ArcadeUtilKt {

    /* renamed from: lambda$-1069643319, reason: not valid java name */
    public static final ComposableLambdaImpl f425lambda$1069643319 = new ComposableLambdaImpl(new FamilyHomeSectionsKt$$ExternalSyntheticLambda6(29), false, -1069643319);

    public static final void CellActivityWidget(GenericComponentViewModel.CellActivityViewModel cellActivityViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        cellActivityViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-619153269);
        int i3 = i & 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i3 == 0) {
            i2 = (gapComposer.changed(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(cellActivityViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = cellActivityViewModel.label;
            String str2 = cellActivityViewModel.body;
            String str3 = cellActivityViewModel.body2;
            boolean z = cellActivityViewModel.centerContentVertically;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1499447313, new MoneyTabBookletKt$$ExternalSyntheticLambda4(5, (Object) cellActivityViewModel, function1), gapComposer);
            boolean changedInstance = gapComposer.changedInstance(cellActivityViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new GpsConfigQueries$$ExternalSyntheticLambda2(cellActivityViewModel, 10);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            boolean changedInstance2 = gapComposer.changedInstance(cellActivityViewModel) | ((i2 & 896) == 256);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == obj) {
                rememberedValue2 = new GLSceneScope$$ExternalSyntheticLambda4(26, cellActivityViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CellDefaultKt.m3389CellActivityGZm5OLo(rememberComposableLambda, str, function12, (Function0) rememberedValue2, companion, null, str2, str3, z, 0, 0L, gapComposer, ((i2 << 12) & 57344) | 6, 1568);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(cellActivityViewModel, function1, i);
        }
    }

    public static final void CellDefaultWidget(final GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Color m;
        int i3;
        long j;
        long j2;
        Function0 function0;
        final int i4;
        CellDefaultAccessory cellDefaultAccessory;
        boolean z;
        Function0 function02;
        CellDefaultAccessory label;
        Function0 function03;
        CellDefaultAccessory label2;
        Function0 function04;
        CellDefaultAccessory label3;
        cellDefaultViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-493566801);
        int i5 = i & 6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        if (i5 == 0) {
            i2 = (gapComposer.changed(companion) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(cellDefaultViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        final int i6 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            GenericBaseViewModel genericBaseViewModel = cellDefaultViewModel.icon;
            String str = cellDefaultViewModel.iconId;
            ak akVar = cellDefaultViewModel.accessory;
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = cellDefaultViewModel.event;
            GenericComponentViewModel$CellDefaultViewModel$Accessory$Push genericComponentViewModel$CellDefaultViewModel$Accessory$Push = GenericComponentViewModel$CellDefaultViewModel$Accessory$Push.INSTANCE;
            final int i7 = 6;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            CellDefaultAccessory cellDefaultAccessory2 = null;
            if (genericBaseViewModel == null && str == null) {
                gapComposer.startReplaceGroup(2119670132);
                if (genericTreeElementsViewEvent == null) {
                    gapComposer.startReplaceGroup(2119729403);
                    gapComposer.end(false);
                    function04 = null;
                } else {
                    gapComposer.startReplaceGroup(2119729404);
                    boolean changedInstance = ((i2 & 896) == 256) | gapComposer.changedInstance(genericTreeElementsViewEvent);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CellDefaultWidgetKt$$ExternalSyntheticLambda0(function1, genericTreeElementsViewEvent, 2);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    function04 = (Function0) rememberedValue;
                    gapComposer.end(false);
                }
                if (Intrinsics.areEqual(akVar, genericComponentViewModel$CellDefaultViewModel$Accessory$Push)) {
                    cellDefaultAccessory2 = CellDefaultAccessory.Push.INSTANCE;
                } else if (akVar instanceof GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush) {
                    label3 = new CellDefaultAccessory.Label(((GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush) akVar).label, 2);
                    final int i8 = 7;
                    CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(-1990690088, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i9 = i7;
                            GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            switch (i9) {
                                case 0:
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        zzd zzdVar = Icons.Companion;
                                        String str2 = cellDefaultViewModel2.iconId;
                                        str2.getClass();
                                        zzdVar.getClass();
                                        Icons icons = zzd.get(str2);
                                        icons.getClass();
                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str3 = cellDefaultViewModel2.body;
                                        if (str3 == null) {
                                            gapComposer3.startReplaceGroup(-264610346);
                                        } else {
                                            gapComposer3.startReplaceGroup(684200843);
                                            ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                        }
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    GapComposer gapComposer4 = (GapComposer) composer2;
                                    if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str4 = cellDefaultViewModel2.label;
                                        if (str4 == null) {
                                            gapComposer4.startReplaceGroup(-1641998621);
                                        } else {
                                            gapComposer4.startReplaceGroup(-607157026);
                                            ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                        }
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    GapComposer gapComposer5 = (GapComposer) composer2;
                                    if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str5 = cellDefaultViewModel2.body;
                                        if (str5 == null) {
                                            gapComposer5.startReplaceGroup(203448413);
                                        } else {
                                            gapComposer5.startReplaceGroup(6562852);
                                            ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                        }
                                        gapComposer5.end(false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                case 4:
                                    GapComposer gapComposer6 = (GapComposer) composer2;
                                    if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str6 = cellDefaultViewModel2.label;
                                        if (str6 == null) {
                                            gapComposer6.startReplaceGroup(-1737664271);
                                        } else {
                                            gapComposer6.startReplaceGroup(-1995716336);
                                            ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                        }
                                        gapComposer6.end(false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                                case 5:
                                    GapComposer gapComposer7 = (GapComposer) composer2;
                                    if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str7 = cellDefaultViewModel2.body;
                                        if (str7 == null) {
                                            gapComposer7.startReplaceGroup(1749806457);
                                        } else {
                                            gapComposer7.startReplaceGroup(-1606122616);
                                            ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                        }
                                        gapComposer7.end(false);
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                                case 6:
                                    GapComposer gapComposer8 = (GapComposer) composer2;
                                    if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str8 = cellDefaultViewModel2.label;
                                        if (str8 == null) {
                                            gapComposer8.startReplaceGroup(260026844);
                                        } else {
                                            gapComposer8.startReplaceGroup(-1792727355);
                                            ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                        }
                                        gapComposer8.end(false);
                                    } else {
                                        gapComposer8.skipToGroupEnd();
                                    }
                                    break;
                                case 7:
                                    GapComposer gapComposer9 = (GapComposer) composer2;
                                    if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str9 = cellDefaultViewModel2.body;
                                        if (str9 == null) {
                                            gapComposer9.startReplaceGroup(-619533008);
                                        } else {
                                            gapComposer9.startReplaceGroup(811299057);
                                            ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                        }
                                        gapComposer9.end(false);
                                    } else {
                                        gapComposer9.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    GapComposer gapComposer10 = (GapComposer) composer2;
                                    if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str10 = cellDefaultViewModel2.label;
                                        if (str10 == null) {
                                            gapComposer10.startReplaceGroup(558811598);
                                        } else {
                                            gapComposer10.startReplaceGroup(-1644541805);
                                            ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                        }
                                        gapComposer10.end(false);
                                    } else {
                                        gapComposer10.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), companion, function04, false, false, Expect_jvmKt.rememberComposableLambda(2083523474, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i9 = i8;
                            GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            switch (i9) {
                                case 0:
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        zzd zzdVar = Icons.Companion;
                                        String str2 = cellDefaultViewModel2.iconId;
                                        str2.getClass();
                                        zzdVar.getClass();
                                        Icons icons = zzd.get(str2);
                                        icons.getClass();
                                        Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str3 = cellDefaultViewModel2.body;
                                        if (str3 == null) {
                                            gapComposer3.startReplaceGroup(-264610346);
                                        } else {
                                            gapComposer3.startReplaceGroup(684200843);
                                            ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                        }
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    GapComposer gapComposer4 = (GapComposer) composer2;
                                    if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str4 = cellDefaultViewModel2.label;
                                        if (str4 == null) {
                                            gapComposer4.startReplaceGroup(-1641998621);
                                        } else {
                                            gapComposer4.startReplaceGroup(-607157026);
                                            ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                        }
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    GapComposer gapComposer5 = (GapComposer) composer2;
                                    if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str5 = cellDefaultViewModel2.body;
                                        if (str5 == null) {
                                            gapComposer5.startReplaceGroup(203448413);
                                        } else {
                                            gapComposer5.startReplaceGroup(6562852);
                                            ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                        }
                                        gapComposer5.end(false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                case 4:
                                    GapComposer gapComposer6 = (GapComposer) composer2;
                                    if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str6 = cellDefaultViewModel2.label;
                                        if (str6 == null) {
                                            gapComposer6.startReplaceGroup(-1737664271);
                                        } else {
                                            gapComposer6.startReplaceGroup(-1995716336);
                                            ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                        }
                                        gapComposer6.end(false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                                case 5:
                                    GapComposer gapComposer7 = (GapComposer) composer2;
                                    if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str7 = cellDefaultViewModel2.body;
                                        if (str7 == null) {
                                            gapComposer7.startReplaceGroup(1749806457);
                                        } else {
                                            gapComposer7.startReplaceGroup(-1606122616);
                                            ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                        }
                                        gapComposer7.end(false);
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                                case 6:
                                    GapComposer gapComposer8 = (GapComposer) composer2;
                                    if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str8 = cellDefaultViewModel2.label;
                                        if (str8 == null) {
                                            gapComposer8.startReplaceGroup(260026844);
                                        } else {
                                            gapComposer8.startReplaceGroup(-1792727355);
                                            ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                        }
                                        gapComposer8.end(false);
                                    } else {
                                        gapComposer8.skipToGroupEnd();
                                    }
                                    break;
                                case 7:
                                    GapComposer gapComposer9 = (GapComposer) composer2;
                                    if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str9 = cellDefaultViewModel2.body;
                                        if (str9 == null) {
                                            gapComposer9.startReplaceGroup(-619533008);
                                        } else {
                                            gapComposer9.startReplaceGroup(811299057);
                                            ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                        }
                                        gapComposer9.end(false);
                                    } else {
                                        gapComposer9.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    GapComposer gapComposer10 = (GapComposer) composer2;
                                    if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str10 = cellDefaultViewModel2.label;
                                        if (str10 == null) {
                                            gapComposer10.startReplaceGroup(558811598);
                                        } else {
                                            gapComposer10.startReplaceGroup(-1644541805);
                                            ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                        }
                                        gapComposer10.end(false);
                                    } else {
                                        gapComposer10.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), null, 0L, label3, null, gapComposer, ((i2 << 3) & 112) | 1572870, 1464);
                    gapComposer.end(false);
                }
                label3 = cellDefaultAccessory2;
                final int i82 = 7;
                CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(-1990690088, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i9 = i7;
                        GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                        Composer composer2 = (Composer) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i9) {
                            case 0:
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    zzd zzdVar = Icons.Companion;
                                    String str2 = cellDefaultViewModel2.iconId;
                                    str2.getClass();
                                    zzdVar.getClass();
                                    Icons icons = zzd.get(str2);
                                    icons.getClass();
                                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str3 = cellDefaultViewModel2.body;
                                    if (str3 == null) {
                                        gapComposer3.startReplaceGroup(-264610346);
                                    } else {
                                        gapComposer3.startReplaceGroup(684200843);
                                        ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                    }
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                GapComposer gapComposer4 = (GapComposer) composer2;
                                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str4 = cellDefaultViewModel2.label;
                                    if (str4 == null) {
                                        gapComposer4.startReplaceGroup(-1641998621);
                                    } else {
                                        gapComposer4.startReplaceGroup(-607157026);
                                        ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                    }
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            case 3:
                                GapComposer gapComposer5 = (GapComposer) composer2;
                                if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str5 = cellDefaultViewModel2.body;
                                    if (str5 == null) {
                                        gapComposer5.startReplaceGroup(203448413);
                                    } else {
                                        gapComposer5.startReplaceGroup(6562852);
                                        ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                    }
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                            case 4:
                                GapComposer gapComposer6 = (GapComposer) composer2;
                                if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str6 = cellDefaultViewModel2.label;
                                    if (str6 == null) {
                                        gapComposer6.startReplaceGroup(-1737664271);
                                    } else {
                                        gapComposer6.startReplaceGroup(-1995716336);
                                        ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                    }
                                    gapComposer6.end(false);
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                break;
                            case 5:
                                GapComposer gapComposer7 = (GapComposer) composer2;
                                if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str7 = cellDefaultViewModel2.body;
                                    if (str7 == null) {
                                        gapComposer7.startReplaceGroup(1749806457);
                                    } else {
                                        gapComposer7.startReplaceGroup(-1606122616);
                                        ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                    }
                                    gapComposer7.end(false);
                                } else {
                                    gapComposer7.skipToGroupEnd();
                                }
                                break;
                            case 6:
                                GapComposer gapComposer8 = (GapComposer) composer2;
                                if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str8 = cellDefaultViewModel2.label;
                                    if (str8 == null) {
                                        gapComposer8.startReplaceGroup(260026844);
                                    } else {
                                        gapComposer8.startReplaceGroup(-1792727355);
                                        ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                    }
                                    gapComposer8.end(false);
                                } else {
                                    gapComposer8.skipToGroupEnd();
                                }
                                break;
                            case 7:
                                GapComposer gapComposer9 = (GapComposer) composer2;
                                if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str9 = cellDefaultViewModel2.body;
                                    if (str9 == null) {
                                        gapComposer9.startReplaceGroup(-619533008);
                                    } else {
                                        gapComposer9.startReplaceGroup(811299057);
                                        ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                    }
                                    gapComposer9.end(false);
                                } else {
                                    gapComposer9.skipToGroupEnd();
                                }
                                break;
                            default:
                                GapComposer gapComposer10 = (GapComposer) composer2;
                                if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str10 = cellDefaultViewModel2.label;
                                    if (str10 == null) {
                                        gapComposer10.startReplaceGroup(558811598);
                                    } else {
                                        gapComposer10.startReplaceGroup(-1644541805);
                                        ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                    }
                                    gapComposer10.end(false);
                                } else {
                                    gapComposer10.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), companion, function04, false, false, Expect_jvmKt.rememberComposableLambda(2083523474, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        int i9 = i82;
                        GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                        Composer composer2 = (Composer) obj;
                        int intValue = ((Integer) obj2).intValue();
                        switch (i9) {
                            case 0:
                                GapComposer gapComposer2 = (GapComposer) composer2;
                                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    zzd zzdVar = Icons.Companion;
                                    String str2 = cellDefaultViewModel2.iconId;
                                    str2.getClass();
                                    zzdVar.getClass();
                                    Icons icons = zzd.get(str2);
                                    icons.getClass();
                                    Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            case 1:
                                GapComposer gapComposer3 = (GapComposer) composer2;
                                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str3 = cellDefaultViewModel2.body;
                                    if (str3 == null) {
                                        gapComposer3.startReplaceGroup(-264610346);
                                    } else {
                                        gapComposer3.startReplaceGroup(684200843);
                                        ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                    }
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                            case 2:
                                GapComposer gapComposer4 = (GapComposer) composer2;
                                if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str4 = cellDefaultViewModel2.label;
                                    if (str4 == null) {
                                        gapComposer4.startReplaceGroup(-1641998621);
                                    } else {
                                        gapComposer4.startReplaceGroup(-607157026);
                                        ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                    }
                                    gapComposer4.end(false);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                break;
                            case 3:
                                GapComposer gapComposer5 = (GapComposer) composer2;
                                if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str5 = cellDefaultViewModel2.body;
                                    if (str5 == null) {
                                        gapComposer5.startReplaceGroup(203448413);
                                    } else {
                                        gapComposer5.startReplaceGroup(6562852);
                                        ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                    }
                                    gapComposer5.end(false);
                                } else {
                                    gapComposer5.skipToGroupEnd();
                                }
                                break;
                            case 4:
                                GapComposer gapComposer6 = (GapComposer) composer2;
                                if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str6 = cellDefaultViewModel2.label;
                                    if (str6 == null) {
                                        gapComposer6.startReplaceGroup(-1737664271);
                                    } else {
                                        gapComposer6.startReplaceGroup(-1995716336);
                                        ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                    }
                                    gapComposer6.end(false);
                                } else {
                                    gapComposer6.skipToGroupEnd();
                                }
                                break;
                            case 5:
                                GapComposer gapComposer7 = (GapComposer) composer2;
                                if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str7 = cellDefaultViewModel2.body;
                                    if (str7 == null) {
                                        gapComposer7.startReplaceGroup(1749806457);
                                    } else {
                                        gapComposer7.startReplaceGroup(-1606122616);
                                        ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                    }
                                    gapComposer7.end(false);
                                } else {
                                    gapComposer7.skipToGroupEnd();
                                }
                                break;
                            case 6:
                                GapComposer gapComposer8 = (GapComposer) composer2;
                                if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str8 = cellDefaultViewModel2.label;
                                    if (str8 == null) {
                                        gapComposer8.startReplaceGroup(260026844);
                                    } else {
                                        gapComposer8.startReplaceGroup(-1792727355);
                                        ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                    }
                                    gapComposer8.end(false);
                                } else {
                                    gapComposer8.skipToGroupEnd();
                                }
                                break;
                            case 7:
                                GapComposer gapComposer9 = (GapComposer) composer2;
                                if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str9 = cellDefaultViewModel2.body;
                                    if (str9 == null) {
                                        gapComposer9.startReplaceGroup(-619533008);
                                    } else {
                                        gapComposer9.startReplaceGroup(811299057);
                                        ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                    }
                                    gapComposer9.end(false);
                                } else {
                                    gapComposer9.skipToGroupEnd();
                                }
                                break;
                            default:
                                GapComposer gapComposer10 = (GapComposer) composer2;
                                if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                    String str10 = cellDefaultViewModel2.label;
                                    if (str10 == null) {
                                        gapComposer10.startReplaceGroup(558811598);
                                    } else {
                                        gapComposer10.startReplaceGroup(-1644541805);
                                        ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                    }
                                    gapComposer10.end(false);
                                } else {
                                    gapComposer10.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), null, 0L, label3, null, gapComposer, ((i2 << 3) & 112) | 1572870, 1464);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(2120251196);
                int ordinal = cellDefaultViewModel.f1137type.ordinal();
                if (ordinal == 0) {
                    gapComposer.startReplaceGroup(-1871266646);
                    if (genericBaseViewModel != null) {
                        gapComposer.startReplaceGroup(2120298316);
                        ComposableLambdaImpl composableLambdaImpl = new ComposableLambdaImpl(new ErrorView$$ExternalSyntheticLambda1(genericBaseViewModel, function1), true, 277984307);
                        if (genericTreeElementsViewEvent == null) {
                            gapComposer.startReplaceGroup(2120493243);
                            gapComposer.end(false);
                            function02 = null;
                        } else {
                            gapComposer.startReplaceGroup(2120493244);
                            boolean changedInstance2 = gapComposer.changedInstance(genericTreeElementsViewEvent) | ((i2 & 896) == 256);
                            Object rememberedValue2 = gapComposer.rememberedValue();
                            if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new CellDefaultWidgetKt$$ExternalSyntheticLambda0(function1, genericTreeElementsViewEvent, 3);
                                gapComposer.updateRememberedValue(rememberedValue2);
                            }
                            gapComposer.end(false);
                            function02 = (Function0) rememberedValue2;
                        }
                        if (Intrinsics.areEqual(akVar, genericComponentViewModel$CellDefaultViewModel$Accessory$Push)) {
                            cellDefaultAccessory2 = CellDefaultAccessory.Push.INSTANCE;
                        } else if (akVar instanceof GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush) {
                            label = new CellDefaultAccessory.Label(((GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush) akVar).label, 2);
                            final int i9 = 8;
                            final int i10 = 1;
                            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-1056458714, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    int i92 = i9;
                                    GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    switch (i92) {
                                        case 0:
                                            GapComposer gapComposer2 = (GapComposer) composer2;
                                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                zzd zzdVar = Icons.Companion;
                                                String str2 = cellDefaultViewModel2.iconId;
                                                str2.getClass();
                                                zzdVar.getClass();
                                                Icons icons = zzd.get(str2);
                                                icons.getClass();
                                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                            } else {
                                                gapComposer2.skipToGroupEnd();
                                            }
                                            break;
                                        case 1:
                                            GapComposer gapComposer3 = (GapComposer) composer2;
                                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str3 = cellDefaultViewModel2.body;
                                                if (str3 == null) {
                                                    gapComposer3.startReplaceGroup(-264610346);
                                                } else {
                                                    gapComposer3.startReplaceGroup(684200843);
                                                    ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                                }
                                                gapComposer3.end(false);
                                            } else {
                                                gapComposer3.skipToGroupEnd();
                                            }
                                            break;
                                        case 2:
                                            GapComposer gapComposer4 = (GapComposer) composer2;
                                            if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str4 = cellDefaultViewModel2.label;
                                                if (str4 == null) {
                                                    gapComposer4.startReplaceGroup(-1641998621);
                                                } else {
                                                    gapComposer4.startReplaceGroup(-607157026);
                                                    ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                                }
                                                gapComposer4.end(false);
                                            } else {
                                                gapComposer4.skipToGroupEnd();
                                            }
                                            break;
                                        case 3:
                                            GapComposer gapComposer5 = (GapComposer) composer2;
                                            if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str5 = cellDefaultViewModel2.body;
                                                if (str5 == null) {
                                                    gapComposer5.startReplaceGroup(203448413);
                                                } else {
                                                    gapComposer5.startReplaceGroup(6562852);
                                                    ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                                }
                                                gapComposer5.end(false);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            break;
                                        case 4:
                                            GapComposer gapComposer6 = (GapComposer) composer2;
                                            if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str6 = cellDefaultViewModel2.label;
                                                if (str6 == null) {
                                                    gapComposer6.startReplaceGroup(-1737664271);
                                                } else {
                                                    gapComposer6.startReplaceGroup(-1995716336);
                                                    ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                                }
                                                gapComposer6.end(false);
                                            } else {
                                                gapComposer6.skipToGroupEnd();
                                            }
                                            break;
                                        case 5:
                                            GapComposer gapComposer7 = (GapComposer) composer2;
                                            if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str7 = cellDefaultViewModel2.body;
                                                if (str7 == null) {
                                                    gapComposer7.startReplaceGroup(1749806457);
                                                } else {
                                                    gapComposer7.startReplaceGroup(-1606122616);
                                                    ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                                }
                                                gapComposer7.end(false);
                                            } else {
                                                gapComposer7.skipToGroupEnd();
                                            }
                                            break;
                                        case 6:
                                            GapComposer gapComposer8 = (GapComposer) composer2;
                                            if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str8 = cellDefaultViewModel2.label;
                                                if (str8 == null) {
                                                    gapComposer8.startReplaceGroup(260026844);
                                                } else {
                                                    gapComposer8.startReplaceGroup(-1792727355);
                                                    ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                                }
                                                gapComposer8.end(false);
                                            } else {
                                                gapComposer8.skipToGroupEnd();
                                            }
                                            break;
                                        case 7:
                                            GapComposer gapComposer9 = (GapComposer) composer2;
                                            if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str9 = cellDefaultViewModel2.body;
                                                if (str9 == null) {
                                                    gapComposer9.startReplaceGroup(-619533008);
                                                } else {
                                                    gapComposer9.startReplaceGroup(811299057);
                                                    ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                                }
                                                gapComposer9.end(false);
                                            } else {
                                                gapComposer9.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            GapComposer gapComposer10 = (GapComposer) composer2;
                                            if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str10 = cellDefaultViewModel2.label;
                                                if (str10 == null) {
                                                    gapComposer10.startReplaceGroup(558811598);
                                                } else {
                                                    gapComposer10.startReplaceGroup(-1644541805);
                                                    ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                                }
                                                gapComposer10.end(false);
                                            } else {
                                                gapComposer10.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer), companion, function02, null, false, false, Expect_jvmKt.rememberComposableLambda(1958251692, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    int i92 = i10;
                                    GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    switch (i92) {
                                        case 0:
                                            GapComposer gapComposer2 = (GapComposer) composer2;
                                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                zzd zzdVar = Icons.Companion;
                                                String str2 = cellDefaultViewModel2.iconId;
                                                str2.getClass();
                                                zzdVar.getClass();
                                                Icons icons = zzd.get(str2);
                                                icons.getClass();
                                                Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                            } else {
                                                gapComposer2.skipToGroupEnd();
                                            }
                                            break;
                                        case 1:
                                            GapComposer gapComposer3 = (GapComposer) composer2;
                                            if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str3 = cellDefaultViewModel2.body;
                                                if (str3 == null) {
                                                    gapComposer3.startReplaceGroup(-264610346);
                                                } else {
                                                    gapComposer3.startReplaceGroup(684200843);
                                                    ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                                }
                                                gapComposer3.end(false);
                                            } else {
                                                gapComposer3.skipToGroupEnd();
                                            }
                                            break;
                                        case 2:
                                            GapComposer gapComposer4 = (GapComposer) composer2;
                                            if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str4 = cellDefaultViewModel2.label;
                                                if (str4 == null) {
                                                    gapComposer4.startReplaceGroup(-1641998621);
                                                } else {
                                                    gapComposer4.startReplaceGroup(-607157026);
                                                    ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                                }
                                                gapComposer4.end(false);
                                            } else {
                                                gapComposer4.skipToGroupEnd();
                                            }
                                            break;
                                        case 3:
                                            GapComposer gapComposer5 = (GapComposer) composer2;
                                            if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str5 = cellDefaultViewModel2.body;
                                                if (str5 == null) {
                                                    gapComposer5.startReplaceGroup(203448413);
                                                } else {
                                                    gapComposer5.startReplaceGroup(6562852);
                                                    ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                                }
                                                gapComposer5.end(false);
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            break;
                                        case 4:
                                            GapComposer gapComposer6 = (GapComposer) composer2;
                                            if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str6 = cellDefaultViewModel2.label;
                                                if (str6 == null) {
                                                    gapComposer6.startReplaceGroup(-1737664271);
                                                } else {
                                                    gapComposer6.startReplaceGroup(-1995716336);
                                                    ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                                }
                                                gapComposer6.end(false);
                                            } else {
                                                gapComposer6.skipToGroupEnd();
                                            }
                                            break;
                                        case 5:
                                            GapComposer gapComposer7 = (GapComposer) composer2;
                                            if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str7 = cellDefaultViewModel2.body;
                                                if (str7 == null) {
                                                    gapComposer7.startReplaceGroup(1749806457);
                                                } else {
                                                    gapComposer7.startReplaceGroup(-1606122616);
                                                    ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                                }
                                                gapComposer7.end(false);
                                            } else {
                                                gapComposer7.skipToGroupEnd();
                                            }
                                            break;
                                        case 6:
                                            GapComposer gapComposer8 = (GapComposer) composer2;
                                            if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str8 = cellDefaultViewModel2.label;
                                                if (str8 == null) {
                                                    gapComposer8.startReplaceGroup(260026844);
                                                } else {
                                                    gapComposer8.startReplaceGroup(-1792727355);
                                                    ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                                }
                                                gapComposer8.end(false);
                                            } else {
                                                gapComposer8.skipToGroupEnd();
                                            }
                                            break;
                                        case 7:
                                            GapComposer gapComposer9 = (GapComposer) composer2;
                                            if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str9 = cellDefaultViewModel2.body;
                                                if (str9 == null) {
                                                    gapComposer9.startReplaceGroup(-619533008);
                                                } else {
                                                    gapComposer9.startReplaceGroup(811299057);
                                                    ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                                }
                                                gapComposer9.end(false);
                                            } else {
                                                gapComposer9.skipToGroupEnd();
                                            }
                                            break;
                                        default:
                                            GapComposer gapComposer10 = (GapComposer) composer2;
                                            if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                                String str10 = cellDefaultViewModel2.label;
                                                if (str10 == null) {
                                                    gapComposer10.startReplaceGroup(558811598);
                                                } else {
                                                    gapComposer10.startReplaceGroup(-1644541805);
                                                    ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                                }
                                                gapComposer10.end(false);
                                            } else {
                                                gapComposer10.skipToGroupEnd();
                                            }
                                            break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }, gapComposer), null, label, 0L, null, gapComposer, ((i2 << 6) & 896) | 12582960, 0, 3440);
                            gapComposer = gapComposer;
                            gapComposer.end(false);
                            z = false;
                        }
                        label = cellDefaultAccessory2;
                        final int i92 = 8;
                        final int i102 = 1;
                        CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(-1056458714, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i922 = i92;
                                GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                switch (i922) {
                                    case 0:
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            zzd zzdVar = Icons.Companion;
                                            String str2 = cellDefaultViewModel2.iconId;
                                            str2.getClass();
                                            zzdVar.getClass();
                                            Icons icons = zzd.get(str2);
                                            icons.getClass();
                                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str3 = cellDefaultViewModel2.body;
                                            if (str3 == null) {
                                                gapComposer3.startReplaceGroup(-264610346);
                                            } else {
                                                gapComposer3.startReplaceGroup(684200843);
                                                ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                            }
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    case 2:
                                        GapComposer gapComposer4 = (GapComposer) composer2;
                                        if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str4 = cellDefaultViewModel2.label;
                                            if (str4 == null) {
                                                gapComposer4.startReplaceGroup(-1641998621);
                                            } else {
                                                gapComposer4.startReplaceGroup(-607157026);
                                                ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                            }
                                            gapComposer4.end(false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                    case 3:
                                        GapComposer gapComposer5 = (GapComposer) composer2;
                                        if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str5 = cellDefaultViewModel2.body;
                                            if (str5 == null) {
                                                gapComposer5.startReplaceGroup(203448413);
                                            } else {
                                                gapComposer5.startReplaceGroup(6562852);
                                                ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                            }
                                            gapComposer5.end(false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    case 4:
                                        GapComposer gapComposer6 = (GapComposer) composer2;
                                        if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str6 = cellDefaultViewModel2.label;
                                            if (str6 == null) {
                                                gapComposer6.startReplaceGroup(-1737664271);
                                            } else {
                                                gapComposer6.startReplaceGroup(-1995716336);
                                                ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                            }
                                            gapComposer6.end(false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                    case 5:
                                        GapComposer gapComposer7 = (GapComposer) composer2;
                                        if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str7 = cellDefaultViewModel2.body;
                                            if (str7 == null) {
                                                gapComposer7.startReplaceGroup(1749806457);
                                            } else {
                                                gapComposer7.startReplaceGroup(-1606122616);
                                                ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                            }
                                            gapComposer7.end(false);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                    case 6:
                                        GapComposer gapComposer8 = (GapComposer) composer2;
                                        if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str8 = cellDefaultViewModel2.label;
                                            if (str8 == null) {
                                                gapComposer8.startReplaceGroup(260026844);
                                            } else {
                                                gapComposer8.startReplaceGroup(-1792727355);
                                                ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                            }
                                            gapComposer8.end(false);
                                        } else {
                                            gapComposer8.skipToGroupEnd();
                                        }
                                        break;
                                    case 7:
                                        GapComposer gapComposer9 = (GapComposer) composer2;
                                        if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str9 = cellDefaultViewModel2.body;
                                            if (str9 == null) {
                                                gapComposer9.startReplaceGroup(-619533008);
                                            } else {
                                                gapComposer9.startReplaceGroup(811299057);
                                                ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                            }
                                            gapComposer9.end(false);
                                        } else {
                                            gapComposer9.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        GapComposer gapComposer10 = (GapComposer) composer2;
                                        if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str10 = cellDefaultViewModel2.label;
                                            if (str10 == null) {
                                                gapComposer10.startReplaceGroup(558811598);
                                            } else {
                                                gapComposer10.startReplaceGroup(-1644541805);
                                                ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                            }
                                            gapComposer10.end(false);
                                        } else {
                                            gapComposer10.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), companion, function02, null, false, false, Expect_jvmKt.rememberComposableLambda(1958251692, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i922 = i102;
                                GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                switch (i922) {
                                    case 0:
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            zzd zzdVar = Icons.Companion;
                                            String str2 = cellDefaultViewModel2.iconId;
                                            str2.getClass();
                                            zzdVar.getClass();
                                            Icons icons = zzd.get(str2);
                                            icons.getClass();
                                            Trace.m1191Iconww6aTOc(icons, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str3 = cellDefaultViewModel2.body;
                                            if (str3 == null) {
                                                gapComposer3.startReplaceGroup(-264610346);
                                            } else {
                                                gapComposer3.startReplaceGroup(684200843);
                                                ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                            }
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    case 2:
                                        GapComposer gapComposer4 = (GapComposer) composer2;
                                        if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str4 = cellDefaultViewModel2.label;
                                            if (str4 == null) {
                                                gapComposer4.startReplaceGroup(-1641998621);
                                            } else {
                                                gapComposer4.startReplaceGroup(-607157026);
                                                ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                            }
                                            gapComposer4.end(false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                    case 3:
                                        GapComposer gapComposer5 = (GapComposer) composer2;
                                        if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str5 = cellDefaultViewModel2.body;
                                            if (str5 == null) {
                                                gapComposer5.startReplaceGroup(203448413);
                                            } else {
                                                gapComposer5.startReplaceGroup(6562852);
                                                ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                            }
                                            gapComposer5.end(false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    case 4:
                                        GapComposer gapComposer6 = (GapComposer) composer2;
                                        if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str6 = cellDefaultViewModel2.label;
                                            if (str6 == null) {
                                                gapComposer6.startReplaceGroup(-1737664271);
                                            } else {
                                                gapComposer6.startReplaceGroup(-1995716336);
                                                ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                            }
                                            gapComposer6.end(false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                    case 5:
                                        GapComposer gapComposer7 = (GapComposer) composer2;
                                        if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str7 = cellDefaultViewModel2.body;
                                            if (str7 == null) {
                                                gapComposer7.startReplaceGroup(1749806457);
                                            } else {
                                                gapComposer7.startReplaceGroup(-1606122616);
                                                ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                            }
                                            gapComposer7.end(false);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                    case 6:
                                        GapComposer gapComposer8 = (GapComposer) composer2;
                                        if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str8 = cellDefaultViewModel2.label;
                                            if (str8 == null) {
                                                gapComposer8.startReplaceGroup(260026844);
                                            } else {
                                                gapComposer8.startReplaceGroup(-1792727355);
                                                ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                            }
                                            gapComposer8.end(false);
                                        } else {
                                            gapComposer8.skipToGroupEnd();
                                        }
                                        break;
                                    case 7:
                                        GapComposer gapComposer9 = (GapComposer) composer2;
                                        if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str9 = cellDefaultViewModel2.body;
                                            if (str9 == null) {
                                                gapComposer9.startReplaceGroup(-619533008);
                                            } else {
                                                gapComposer9.startReplaceGroup(811299057);
                                                ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                            }
                                            gapComposer9.end(false);
                                        } else {
                                            gapComposer9.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        GapComposer gapComposer10 = (GapComposer) composer2;
                                        if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str10 = cellDefaultViewModel2.label;
                                            if (str10 == null) {
                                                gapComposer10.startReplaceGroup(558811598);
                                            } else {
                                                gapComposer10.startReplaceGroup(-1644541805);
                                                ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                            }
                                            gapComposer10.end(false);
                                        } else {
                                            gapComposer10.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), null, label, 0L, null, gapComposer, ((i2 << 6) & 896) | 12582960, 0, 3440);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                        z = false;
                    } else {
                        gapComposer.startReplaceGroup(2121022135);
                        zzd zzdVar = Icons.Companion;
                        str.getClass();
                        zzdVar.getClass();
                        Icons icons = zzd.get(str);
                        icons.getClass();
                        String str2 = cellDefaultViewModel.iconDescription;
                        ColorModel colorModel = cellDefaultViewModel.iconBackground;
                        colorModel.getClass();
                        Color forTheme = ThemablesKt.forTheme(colorModel, gapComposer);
                        forTheme.getClass();
                        long j3 = forTheme.value;
                        ColorModel colorModel2 = cellDefaultViewModel.iconTint;
                        if (colorModel2 == null) {
                            gapComposer.startReplaceGroup(2121232872);
                            gapComposer.end(false);
                            m = null;
                        } else {
                            m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1871235783, colorModel2, gapComposer, false);
                        }
                        if (m != null) {
                            i3 = i2;
                            j = m.value;
                        } else {
                            i3 = i2;
                            j = Color.Unspecified;
                        }
                        if (genericTreeElementsViewEvent == null) {
                            gapComposer.startReplaceGroup(2121391003);
                            gapComposer.end(false);
                            j2 = j;
                            function0 = null;
                        } else {
                            gapComposer.startReplaceGroup(2121391004);
                            j2 = j;
                            boolean changedInstance3 = ((i3 & 896) == 256) | gapComposer.changedInstance(genericTreeElementsViewEvent);
                            Object rememberedValue3 = gapComposer.rememberedValue();
                            if (changedInstance3 || rememberedValue3 == neverEqualPolicy) {
                                rememberedValue3 = new CellDefaultWidgetKt$$ExternalSyntheticLambda0(function1, genericTreeElementsViewEvent, 1);
                                gapComposer.updateRememberedValue(rememberedValue3);
                            }
                            gapComposer.end(false);
                            function0 = (Function0) rememberedValue3;
                        }
                        if (Intrinsics.areEqual(akVar, genericComponentViewModel$CellDefaultViewModel$Accessory$Push)) {
                            cellDefaultAccessory = CellDefaultAccessory.Push.INSTANCE;
                            i4 = 2;
                        } else if (akVar instanceof GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush) {
                            i4 = 2;
                            cellDefaultAccessory = new CellDefaultAccessory.Label(((GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush) akVar).label, 2);
                        } else {
                            i4 = 2;
                            cellDefaultAccessory = null;
                        }
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-2029679823, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i922 = i4;
                                GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                switch (i922) {
                                    case 0:
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            zzd zzdVar2 = Icons.Companion;
                                            String str22 = cellDefaultViewModel2.iconId;
                                            str22.getClass();
                                            zzdVar2.getClass();
                                            Icons icons2 = zzd.get(str22);
                                            icons2.getClass();
                                            Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str3 = cellDefaultViewModel2.body;
                                            if (str3 == null) {
                                                gapComposer3.startReplaceGroup(-264610346);
                                            } else {
                                                gapComposer3.startReplaceGroup(684200843);
                                                ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                            }
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    case 2:
                                        GapComposer gapComposer4 = (GapComposer) composer2;
                                        if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str4 = cellDefaultViewModel2.label;
                                            if (str4 == null) {
                                                gapComposer4.startReplaceGroup(-1641998621);
                                            } else {
                                                gapComposer4.startReplaceGroup(-607157026);
                                                ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                            }
                                            gapComposer4.end(false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                    case 3:
                                        GapComposer gapComposer5 = (GapComposer) composer2;
                                        if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str5 = cellDefaultViewModel2.body;
                                            if (str5 == null) {
                                                gapComposer5.startReplaceGroup(203448413);
                                            } else {
                                                gapComposer5.startReplaceGroup(6562852);
                                                ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                            }
                                            gapComposer5.end(false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    case 4:
                                        GapComposer gapComposer6 = (GapComposer) composer2;
                                        if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str6 = cellDefaultViewModel2.label;
                                            if (str6 == null) {
                                                gapComposer6.startReplaceGroup(-1737664271);
                                            } else {
                                                gapComposer6.startReplaceGroup(-1995716336);
                                                ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                            }
                                            gapComposer6.end(false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                    case 5:
                                        GapComposer gapComposer7 = (GapComposer) composer2;
                                        if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str7 = cellDefaultViewModel2.body;
                                            if (str7 == null) {
                                                gapComposer7.startReplaceGroup(1749806457);
                                            } else {
                                                gapComposer7.startReplaceGroup(-1606122616);
                                                ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                            }
                                            gapComposer7.end(false);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                    case 6:
                                        GapComposer gapComposer8 = (GapComposer) composer2;
                                        if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str8 = cellDefaultViewModel2.label;
                                            if (str8 == null) {
                                                gapComposer8.startReplaceGroup(260026844);
                                            } else {
                                                gapComposer8.startReplaceGroup(-1792727355);
                                                ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                            }
                                            gapComposer8.end(false);
                                        } else {
                                            gapComposer8.skipToGroupEnd();
                                        }
                                        break;
                                    case 7:
                                        GapComposer gapComposer9 = (GapComposer) composer2;
                                        if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str9 = cellDefaultViewModel2.body;
                                            if (str9 == null) {
                                                gapComposer9.startReplaceGroup(-619533008);
                                            } else {
                                                gapComposer9.startReplaceGroup(811299057);
                                                ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                            }
                                            gapComposer9.end(false);
                                        } else {
                                            gapComposer9.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        GapComposer gapComposer10 = (GapComposer) composer2;
                                        if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str10 = cellDefaultViewModel2.label;
                                            if (str10 == null) {
                                                gapComposer10.startReplaceGroup(558811598);
                                            } else {
                                                gapComposer10.startReplaceGroup(-1644541805);
                                                ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                            }
                                            gapComposer10.end(false);
                                        } else {
                                            gapComposer10.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer);
                        final int i11 = 3;
                        CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, str2, j3, rememberComposableLambda, companion, j2, function0, null, false, false, Expect_jvmKt.rememberComposableLambda(-1054740603, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i922 = i11;
                                GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                switch (i922) {
                                    case 0:
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            zzd zzdVar2 = Icons.Companion;
                                            String str22 = cellDefaultViewModel2.iconId;
                                            str22.getClass();
                                            zzdVar2.getClass();
                                            Icons icons2 = zzd.get(str22);
                                            icons2.getClass();
                                            Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str3 = cellDefaultViewModel2.body;
                                            if (str3 == null) {
                                                gapComposer3.startReplaceGroup(-264610346);
                                            } else {
                                                gapComposer3.startReplaceGroup(684200843);
                                                ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                            }
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    case 2:
                                        GapComposer gapComposer4 = (GapComposer) composer2;
                                        if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str4 = cellDefaultViewModel2.label;
                                            if (str4 == null) {
                                                gapComposer4.startReplaceGroup(-1641998621);
                                            } else {
                                                gapComposer4.startReplaceGroup(-607157026);
                                                ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                            }
                                            gapComposer4.end(false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                    case 3:
                                        GapComposer gapComposer5 = (GapComposer) composer2;
                                        if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str5 = cellDefaultViewModel2.body;
                                            if (str5 == null) {
                                                gapComposer5.startReplaceGroup(203448413);
                                            } else {
                                                gapComposer5.startReplaceGroup(6562852);
                                                ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                            }
                                            gapComposer5.end(false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    case 4:
                                        GapComposer gapComposer6 = (GapComposer) composer2;
                                        if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str6 = cellDefaultViewModel2.label;
                                            if (str6 == null) {
                                                gapComposer6.startReplaceGroup(-1737664271);
                                            } else {
                                                gapComposer6.startReplaceGroup(-1995716336);
                                                ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                            }
                                            gapComposer6.end(false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                    case 5:
                                        GapComposer gapComposer7 = (GapComposer) composer2;
                                        if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str7 = cellDefaultViewModel2.body;
                                            if (str7 == null) {
                                                gapComposer7.startReplaceGroup(1749806457);
                                            } else {
                                                gapComposer7.startReplaceGroup(-1606122616);
                                                ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                            }
                                            gapComposer7.end(false);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                    case 6:
                                        GapComposer gapComposer8 = (GapComposer) composer2;
                                        if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str8 = cellDefaultViewModel2.label;
                                            if (str8 == null) {
                                                gapComposer8.startReplaceGroup(260026844);
                                            } else {
                                                gapComposer8.startReplaceGroup(-1792727355);
                                                ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                            }
                                            gapComposer8.end(false);
                                        } else {
                                            gapComposer8.skipToGroupEnd();
                                        }
                                        break;
                                    case 7:
                                        GapComposer gapComposer9 = (GapComposer) composer2;
                                        if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str9 = cellDefaultViewModel2.body;
                                            if (str9 == null) {
                                                gapComposer9.startReplaceGroup(-619533008);
                                            } else {
                                                gapComposer9.startReplaceGroup(811299057);
                                                ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                            }
                                            gapComposer9.end(false);
                                        } else {
                                            gapComposer9.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        GapComposer gapComposer10 = (GapComposer) composer2;
                                        if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str10 = cellDefaultViewModel2.label;
                                            if (str10 == null) {
                                                gapComposer10.startReplaceGroup(558811598);
                                            } else {
                                                gapComposer10.startReplaceGroup(-1644541805);
                                                ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                            }
                                            gapComposer10.end(false);
                                        } else {
                                            gapComposer10.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), null, cellDefaultAccessory, 0L, null, gapComposer, ((i3 << 12) & 57344) | 3072, 6, 27520);
                        gapComposer = gapComposer;
                        z = false;
                        gapComposer.end(false);
                    }
                    gapComposer.end(z);
                } else {
                    if (ordinal != 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1871267450, false);
                    }
                    gapComposer.startReplaceGroup(2121920267);
                    if (genericTreeElementsViewEvent == null) {
                        gapComposer.startReplaceGroup(2122121115);
                        gapComposer.end(false);
                        function03 = null;
                    } else {
                        gapComposer.startReplaceGroup(2122121116);
                        boolean changedInstance4 = gapComposer.changedInstance(genericTreeElementsViewEvent) | ((i2 & 896) == 256);
                        Object rememberedValue4 = gapComposer.rememberedValue();
                        if (changedInstance4 || rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = new CellDefaultWidgetKt$$ExternalSyntheticLambda0(function1, genericTreeElementsViewEvent, 0);
                            gapComposer.updateRememberedValue(rememberedValue4);
                        }
                        gapComposer.end(false);
                        function03 = (Function0) rememberedValue4;
                    }
                    if (Intrinsics.areEqual(akVar, genericComponentViewModel$CellDefaultViewModel$Accessory$Push)) {
                        cellDefaultAccessory2 = CellDefaultAccessory.Push.INSTANCE;
                    } else if (akVar instanceof GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush) {
                        label2 = new CellDefaultAccessory.Label(((GenericComponentViewModel$CellDefaultViewModel$Accessory$LabeledPush) akVar).label, 2);
                        final int i12 = 4;
                        final int i13 = 5;
                        CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-1380913694, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i922 = i6;
                                GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                switch (i922) {
                                    case 0:
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            zzd zzdVar2 = Icons.Companion;
                                            String str22 = cellDefaultViewModel2.iconId;
                                            str22.getClass();
                                            zzdVar2.getClass();
                                            Icons icons2 = zzd.get(str22);
                                            icons2.getClass();
                                            Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str3 = cellDefaultViewModel2.body;
                                            if (str3 == null) {
                                                gapComposer3.startReplaceGroup(-264610346);
                                            } else {
                                                gapComposer3.startReplaceGroup(684200843);
                                                ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                            }
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    case 2:
                                        GapComposer gapComposer4 = (GapComposer) composer2;
                                        if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str4 = cellDefaultViewModel2.label;
                                            if (str4 == null) {
                                                gapComposer4.startReplaceGroup(-1641998621);
                                            } else {
                                                gapComposer4.startReplaceGroup(-607157026);
                                                ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                            }
                                            gapComposer4.end(false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                    case 3:
                                        GapComposer gapComposer5 = (GapComposer) composer2;
                                        if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str5 = cellDefaultViewModel2.body;
                                            if (str5 == null) {
                                                gapComposer5.startReplaceGroup(203448413);
                                            } else {
                                                gapComposer5.startReplaceGroup(6562852);
                                                ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                            }
                                            gapComposer5.end(false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    case 4:
                                        GapComposer gapComposer6 = (GapComposer) composer2;
                                        if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str6 = cellDefaultViewModel2.label;
                                            if (str6 == null) {
                                                gapComposer6.startReplaceGroup(-1737664271);
                                            } else {
                                                gapComposer6.startReplaceGroup(-1995716336);
                                                ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                            }
                                            gapComposer6.end(false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                    case 5:
                                        GapComposer gapComposer7 = (GapComposer) composer2;
                                        if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str7 = cellDefaultViewModel2.body;
                                            if (str7 == null) {
                                                gapComposer7.startReplaceGroup(1749806457);
                                            } else {
                                                gapComposer7.startReplaceGroup(-1606122616);
                                                ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                            }
                                            gapComposer7.end(false);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                    case 6:
                                        GapComposer gapComposer8 = (GapComposer) composer2;
                                        if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str8 = cellDefaultViewModel2.label;
                                            if (str8 == null) {
                                                gapComposer8.startReplaceGroup(260026844);
                                            } else {
                                                gapComposer8.startReplaceGroup(-1792727355);
                                                ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                            }
                                            gapComposer8.end(false);
                                        } else {
                                            gapComposer8.skipToGroupEnd();
                                        }
                                        break;
                                    case 7:
                                        GapComposer gapComposer9 = (GapComposer) composer2;
                                        if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str9 = cellDefaultViewModel2.body;
                                            if (str9 == null) {
                                                gapComposer9.startReplaceGroup(-619533008);
                                            } else {
                                                gapComposer9.startReplaceGroup(811299057);
                                                ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                            }
                                            gapComposer9.end(false);
                                        } else {
                                            gapComposer9.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        GapComposer gapComposer10 = (GapComposer) composer2;
                                        if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str10 = cellDefaultViewModel2.label;
                                            if (str10 == null) {
                                                gapComposer10.startReplaceGroup(558811598);
                                            } else {
                                                gapComposer10.startReplaceGroup(-1644541805);
                                                ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                            }
                                            gapComposer10.end(false);
                                        } else {
                                            gapComposer10.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), Expect_jvmKt.rememberComposableLambda(109655011, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i922 = i12;
                                GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                switch (i922) {
                                    case 0:
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            zzd zzdVar2 = Icons.Companion;
                                            String str22 = cellDefaultViewModel2.iconId;
                                            str22.getClass();
                                            zzdVar2.getClass();
                                            Icons icons2 = zzd.get(str22);
                                            icons2.getClass();
                                            Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str3 = cellDefaultViewModel2.body;
                                            if (str3 == null) {
                                                gapComposer3.startReplaceGroup(-264610346);
                                            } else {
                                                gapComposer3.startReplaceGroup(684200843);
                                                ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                            }
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    case 2:
                                        GapComposer gapComposer4 = (GapComposer) composer2;
                                        if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str4 = cellDefaultViewModel2.label;
                                            if (str4 == null) {
                                                gapComposer4.startReplaceGroup(-1641998621);
                                            } else {
                                                gapComposer4.startReplaceGroup(-607157026);
                                                ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                            }
                                            gapComposer4.end(false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                    case 3:
                                        GapComposer gapComposer5 = (GapComposer) composer2;
                                        if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str5 = cellDefaultViewModel2.body;
                                            if (str5 == null) {
                                                gapComposer5.startReplaceGroup(203448413);
                                            } else {
                                                gapComposer5.startReplaceGroup(6562852);
                                                ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                            }
                                            gapComposer5.end(false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    case 4:
                                        GapComposer gapComposer6 = (GapComposer) composer2;
                                        if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str6 = cellDefaultViewModel2.label;
                                            if (str6 == null) {
                                                gapComposer6.startReplaceGroup(-1737664271);
                                            } else {
                                                gapComposer6.startReplaceGroup(-1995716336);
                                                ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                            }
                                            gapComposer6.end(false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                    case 5:
                                        GapComposer gapComposer7 = (GapComposer) composer2;
                                        if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str7 = cellDefaultViewModel2.body;
                                            if (str7 == null) {
                                                gapComposer7.startReplaceGroup(1749806457);
                                            } else {
                                                gapComposer7.startReplaceGroup(-1606122616);
                                                ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                            }
                                            gapComposer7.end(false);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                    case 6:
                                        GapComposer gapComposer8 = (GapComposer) composer2;
                                        if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str8 = cellDefaultViewModel2.label;
                                            if (str8 == null) {
                                                gapComposer8.startReplaceGroup(260026844);
                                            } else {
                                                gapComposer8.startReplaceGroup(-1792727355);
                                                ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                            }
                                            gapComposer8.end(false);
                                        } else {
                                            gapComposer8.skipToGroupEnd();
                                        }
                                        break;
                                    case 7:
                                        GapComposer gapComposer9 = (GapComposer) composer2;
                                        if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str9 = cellDefaultViewModel2.body;
                                            if (str9 == null) {
                                                gapComposer9.startReplaceGroup(-619533008);
                                            } else {
                                                gapComposer9.startReplaceGroup(811299057);
                                                ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                            }
                                            gapComposer9.end(false);
                                        } else {
                                            gapComposer9.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        GapComposer gapComposer10 = (GapComposer) composer2;
                                        if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str10 = cellDefaultViewModel2.label;
                                            if (str10 == null) {
                                                gapComposer10.startReplaceGroup(558811598);
                                            } else {
                                                gapComposer10.startReplaceGroup(-1644541805);
                                                ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                            }
                                            gapComposer10.end(false);
                                        } else {
                                            gapComposer10.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), companion, function03, false, false, Expect_jvmKt.rememberComposableLambda(463132649, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                int i922 = i13;
                                GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                                Composer composer2 = (Composer) obj;
                                int intValue = ((Integer) obj2).intValue();
                                switch (i922) {
                                    case 0:
                                        GapComposer gapComposer2 = (GapComposer) composer2;
                                        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            zzd zzdVar2 = Icons.Companion;
                                            String str22 = cellDefaultViewModel2.iconId;
                                            str22.getClass();
                                            zzdVar2.getClass();
                                            Icons icons2 = zzd.get(str22);
                                            icons2.getClass();
                                            Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                        } else {
                                            gapComposer2.skipToGroupEnd();
                                        }
                                        break;
                                    case 1:
                                        GapComposer gapComposer3 = (GapComposer) composer2;
                                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str3 = cellDefaultViewModel2.body;
                                            if (str3 == null) {
                                                gapComposer3.startReplaceGroup(-264610346);
                                            } else {
                                                gapComposer3.startReplaceGroup(684200843);
                                                ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                            }
                                            gapComposer3.end(false);
                                        } else {
                                            gapComposer3.skipToGroupEnd();
                                        }
                                        break;
                                    case 2:
                                        GapComposer gapComposer4 = (GapComposer) composer2;
                                        if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str4 = cellDefaultViewModel2.label;
                                            if (str4 == null) {
                                                gapComposer4.startReplaceGroup(-1641998621);
                                            } else {
                                                gapComposer4.startReplaceGroup(-607157026);
                                                ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                            }
                                            gapComposer4.end(false);
                                        } else {
                                            gapComposer4.skipToGroupEnd();
                                        }
                                        break;
                                    case 3:
                                        GapComposer gapComposer5 = (GapComposer) composer2;
                                        if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str5 = cellDefaultViewModel2.body;
                                            if (str5 == null) {
                                                gapComposer5.startReplaceGroup(203448413);
                                            } else {
                                                gapComposer5.startReplaceGroup(6562852);
                                                ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                            }
                                            gapComposer5.end(false);
                                        } else {
                                            gapComposer5.skipToGroupEnd();
                                        }
                                        break;
                                    case 4:
                                        GapComposer gapComposer6 = (GapComposer) composer2;
                                        if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str6 = cellDefaultViewModel2.label;
                                            if (str6 == null) {
                                                gapComposer6.startReplaceGroup(-1737664271);
                                            } else {
                                                gapComposer6.startReplaceGroup(-1995716336);
                                                ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                            }
                                            gapComposer6.end(false);
                                        } else {
                                            gapComposer6.skipToGroupEnd();
                                        }
                                        break;
                                    case 5:
                                        GapComposer gapComposer7 = (GapComposer) composer2;
                                        if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str7 = cellDefaultViewModel2.body;
                                            if (str7 == null) {
                                                gapComposer7.startReplaceGroup(1749806457);
                                            } else {
                                                gapComposer7.startReplaceGroup(-1606122616);
                                                ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                            }
                                            gapComposer7.end(false);
                                        } else {
                                            gapComposer7.skipToGroupEnd();
                                        }
                                        break;
                                    case 6:
                                        GapComposer gapComposer8 = (GapComposer) composer2;
                                        if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str8 = cellDefaultViewModel2.label;
                                            if (str8 == null) {
                                                gapComposer8.startReplaceGroup(260026844);
                                            } else {
                                                gapComposer8.startReplaceGroup(-1792727355);
                                                ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                            }
                                            gapComposer8.end(false);
                                        } else {
                                            gapComposer8.skipToGroupEnd();
                                        }
                                        break;
                                    case 7:
                                        GapComposer gapComposer9 = (GapComposer) composer2;
                                        if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str9 = cellDefaultViewModel2.body;
                                            if (str9 == null) {
                                                gapComposer9.startReplaceGroup(-619533008);
                                            } else {
                                                gapComposer9.startReplaceGroup(811299057);
                                                ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                            }
                                            gapComposer9.end(false);
                                        } else {
                                            gapComposer9.skipToGroupEnd();
                                        }
                                        break;
                                    default:
                                        GapComposer gapComposer10 = (GapComposer) composer2;
                                        if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                            String str10 = cellDefaultViewModel2.label;
                                            if (str10 == null) {
                                                gapComposer10.startReplaceGroup(558811598);
                                            } else {
                                                gapComposer10.startReplaceGroup(-1644541805);
                                                ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                            }
                                            gapComposer10.end(false);
                                        } else {
                                            gapComposer10.skipToGroupEnd();
                                        }
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer), null, label2, 0L, gapComposer, ((i2 << 6) & 896) | 12582966, 3440);
                        gapComposer.end(false);
                        z = false;
                    }
                    label2 = cellDefaultAccessory2;
                    final int i122 = 4;
                    final int i132 = 5;
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(-1380913694, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i922 = i6;
                            GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            switch (i922) {
                                case 0:
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        zzd zzdVar2 = Icons.Companion;
                                        String str22 = cellDefaultViewModel2.iconId;
                                        str22.getClass();
                                        zzdVar2.getClass();
                                        Icons icons2 = zzd.get(str22);
                                        icons2.getClass();
                                        Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str3 = cellDefaultViewModel2.body;
                                        if (str3 == null) {
                                            gapComposer3.startReplaceGroup(-264610346);
                                        } else {
                                            gapComposer3.startReplaceGroup(684200843);
                                            ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                        }
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    GapComposer gapComposer4 = (GapComposer) composer2;
                                    if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str4 = cellDefaultViewModel2.label;
                                        if (str4 == null) {
                                            gapComposer4.startReplaceGroup(-1641998621);
                                        } else {
                                            gapComposer4.startReplaceGroup(-607157026);
                                            ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                        }
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    GapComposer gapComposer5 = (GapComposer) composer2;
                                    if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str5 = cellDefaultViewModel2.body;
                                        if (str5 == null) {
                                            gapComposer5.startReplaceGroup(203448413);
                                        } else {
                                            gapComposer5.startReplaceGroup(6562852);
                                            ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                        }
                                        gapComposer5.end(false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                case 4:
                                    GapComposer gapComposer6 = (GapComposer) composer2;
                                    if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str6 = cellDefaultViewModel2.label;
                                        if (str6 == null) {
                                            gapComposer6.startReplaceGroup(-1737664271);
                                        } else {
                                            gapComposer6.startReplaceGroup(-1995716336);
                                            ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                        }
                                        gapComposer6.end(false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                                case 5:
                                    GapComposer gapComposer7 = (GapComposer) composer2;
                                    if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str7 = cellDefaultViewModel2.body;
                                        if (str7 == null) {
                                            gapComposer7.startReplaceGroup(1749806457);
                                        } else {
                                            gapComposer7.startReplaceGroup(-1606122616);
                                            ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                        }
                                        gapComposer7.end(false);
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                                case 6:
                                    GapComposer gapComposer8 = (GapComposer) composer2;
                                    if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str8 = cellDefaultViewModel2.label;
                                        if (str8 == null) {
                                            gapComposer8.startReplaceGroup(260026844);
                                        } else {
                                            gapComposer8.startReplaceGroup(-1792727355);
                                            ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                        }
                                        gapComposer8.end(false);
                                    } else {
                                        gapComposer8.skipToGroupEnd();
                                    }
                                    break;
                                case 7:
                                    GapComposer gapComposer9 = (GapComposer) composer2;
                                    if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str9 = cellDefaultViewModel2.body;
                                        if (str9 == null) {
                                            gapComposer9.startReplaceGroup(-619533008);
                                        } else {
                                            gapComposer9.startReplaceGroup(811299057);
                                            ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                        }
                                        gapComposer9.end(false);
                                    } else {
                                        gapComposer9.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    GapComposer gapComposer10 = (GapComposer) composer2;
                                    if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str10 = cellDefaultViewModel2.label;
                                        if (str10 == null) {
                                            gapComposer10.startReplaceGroup(558811598);
                                        } else {
                                            gapComposer10.startReplaceGroup(-1644541805);
                                            ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                        }
                                        gapComposer10.end(false);
                                    } else {
                                        gapComposer10.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), Expect_jvmKt.rememberComposableLambda(109655011, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i922 = i122;
                            GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            switch (i922) {
                                case 0:
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        zzd zzdVar2 = Icons.Companion;
                                        String str22 = cellDefaultViewModel2.iconId;
                                        str22.getClass();
                                        zzdVar2.getClass();
                                        Icons icons2 = zzd.get(str22);
                                        icons2.getClass();
                                        Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str3 = cellDefaultViewModel2.body;
                                        if (str3 == null) {
                                            gapComposer3.startReplaceGroup(-264610346);
                                        } else {
                                            gapComposer3.startReplaceGroup(684200843);
                                            ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                        }
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    GapComposer gapComposer4 = (GapComposer) composer2;
                                    if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str4 = cellDefaultViewModel2.label;
                                        if (str4 == null) {
                                            gapComposer4.startReplaceGroup(-1641998621);
                                        } else {
                                            gapComposer4.startReplaceGroup(-607157026);
                                            ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                        }
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    GapComposer gapComposer5 = (GapComposer) composer2;
                                    if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str5 = cellDefaultViewModel2.body;
                                        if (str5 == null) {
                                            gapComposer5.startReplaceGroup(203448413);
                                        } else {
                                            gapComposer5.startReplaceGroup(6562852);
                                            ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                        }
                                        gapComposer5.end(false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                case 4:
                                    GapComposer gapComposer6 = (GapComposer) composer2;
                                    if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str6 = cellDefaultViewModel2.label;
                                        if (str6 == null) {
                                            gapComposer6.startReplaceGroup(-1737664271);
                                        } else {
                                            gapComposer6.startReplaceGroup(-1995716336);
                                            ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                        }
                                        gapComposer6.end(false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                                case 5:
                                    GapComposer gapComposer7 = (GapComposer) composer2;
                                    if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str7 = cellDefaultViewModel2.body;
                                        if (str7 == null) {
                                            gapComposer7.startReplaceGroup(1749806457);
                                        } else {
                                            gapComposer7.startReplaceGroup(-1606122616);
                                            ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                        }
                                        gapComposer7.end(false);
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                                case 6:
                                    GapComposer gapComposer8 = (GapComposer) composer2;
                                    if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str8 = cellDefaultViewModel2.label;
                                        if (str8 == null) {
                                            gapComposer8.startReplaceGroup(260026844);
                                        } else {
                                            gapComposer8.startReplaceGroup(-1792727355);
                                            ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                        }
                                        gapComposer8.end(false);
                                    } else {
                                        gapComposer8.skipToGroupEnd();
                                    }
                                    break;
                                case 7:
                                    GapComposer gapComposer9 = (GapComposer) composer2;
                                    if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str9 = cellDefaultViewModel2.body;
                                        if (str9 == null) {
                                            gapComposer9.startReplaceGroup(-619533008);
                                        } else {
                                            gapComposer9.startReplaceGroup(811299057);
                                            ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                        }
                                        gapComposer9.end(false);
                                    } else {
                                        gapComposer9.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    GapComposer gapComposer10 = (GapComposer) composer2;
                                    if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str10 = cellDefaultViewModel2.label;
                                        if (str10 == null) {
                                            gapComposer10.startReplaceGroup(558811598);
                                        } else {
                                            gapComposer10.startReplaceGroup(-1644541805);
                                            ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                        }
                                        gapComposer10.end(false);
                                    } else {
                                        gapComposer10.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), companion, function03, false, false, Expect_jvmKt.rememberComposableLambda(463132649, new Function2() { // from class: com.squareup.cash.genericelements.components.components.arcade.CellDefaultWidgetKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i922 = i132;
                            GenericComponentViewModel.CellDefaultViewModel cellDefaultViewModel2 = cellDefaultViewModel;
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            switch (i922) {
                                case 0:
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        zzd zzdVar2 = Icons.Companion;
                                        String str22 = cellDefaultViewModel2.iconId;
                                        str22.getClass();
                                        zzdVar2.getClass();
                                        Icons icons2 = zzd.get(str22);
                                        icons2.getClass();
                                        Trace.m1191Iconww6aTOc(icons2, (String) null, (Modifier) null, 0L, gapComposer2, 48, 12);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str3 = cellDefaultViewModel2.body;
                                        if (str3 == null) {
                                            gapComposer3.startReplaceGroup(-264610346);
                                        } else {
                                            gapComposer3.startReplaceGroup(684200843);
                                            ArcadeUtilKt.ToCellBodyText(str3, cellDefaultViewModel2.bodyColor, gapComposer3, 0);
                                        }
                                        gapComposer3.end(false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    GapComposer gapComposer4 = (GapComposer) composer2;
                                    if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str4 = cellDefaultViewModel2.label;
                                        if (str4 == null) {
                                            gapComposer4.startReplaceGroup(-1641998621);
                                        } else {
                                            gapComposer4.startReplaceGroup(-607157026);
                                            ArcadeUtilKt.ToLabelText(str4, gapComposer4, 0);
                                        }
                                        gapComposer4.end(false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    GapComposer gapComposer5 = (GapComposer) composer2;
                                    if (gapComposer5.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str5 = cellDefaultViewModel2.body;
                                        if (str5 == null) {
                                            gapComposer5.startReplaceGroup(203448413);
                                        } else {
                                            gapComposer5.startReplaceGroup(6562852);
                                            ArcadeUtilKt.ToCellBodyText(str5, cellDefaultViewModel2.bodyColor, gapComposer5, 0);
                                        }
                                        gapComposer5.end(false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    break;
                                case 4:
                                    GapComposer gapComposer6 = (GapComposer) composer2;
                                    if (gapComposer6.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str6 = cellDefaultViewModel2.label;
                                        if (str6 == null) {
                                            gapComposer6.startReplaceGroup(-1737664271);
                                        } else {
                                            gapComposer6.startReplaceGroup(-1995716336);
                                            ArcadeUtilKt.ToLabelText(str6, gapComposer6, 0);
                                        }
                                        gapComposer6.end(false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    break;
                                case 5:
                                    GapComposer gapComposer7 = (GapComposer) composer2;
                                    if (gapComposer7.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str7 = cellDefaultViewModel2.body;
                                        if (str7 == null) {
                                            gapComposer7.startReplaceGroup(1749806457);
                                        } else {
                                            gapComposer7.startReplaceGroup(-1606122616);
                                            ArcadeUtilKt.ToCellBodyText(str7, cellDefaultViewModel2.bodyColor, gapComposer7, 0);
                                        }
                                        gapComposer7.end(false);
                                    } else {
                                        gapComposer7.skipToGroupEnd();
                                    }
                                    break;
                                case 6:
                                    GapComposer gapComposer8 = (GapComposer) composer2;
                                    if (gapComposer8.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str8 = cellDefaultViewModel2.label;
                                        if (str8 == null) {
                                            gapComposer8.startReplaceGroup(260026844);
                                        } else {
                                            gapComposer8.startReplaceGroup(-1792727355);
                                            ArcadeUtilKt.ToLabelText(str8, gapComposer8, 0);
                                        }
                                        gapComposer8.end(false);
                                    } else {
                                        gapComposer8.skipToGroupEnd();
                                    }
                                    break;
                                case 7:
                                    GapComposer gapComposer9 = (GapComposer) composer2;
                                    if (gapComposer9.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str9 = cellDefaultViewModel2.body;
                                        if (str9 == null) {
                                            gapComposer9.startReplaceGroup(-619533008);
                                        } else {
                                            gapComposer9.startReplaceGroup(811299057);
                                            ArcadeUtilKt.ToCellBodyText(str9, cellDefaultViewModel2.bodyColor, gapComposer9, 0);
                                        }
                                        gapComposer9.end(false);
                                    } else {
                                        gapComposer9.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    GapComposer gapComposer10 = (GapComposer) composer2;
                                    if (gapComposer10.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        String str10 = cellDefaultViewModel2.label;
                                        if (str10 == null) {
                                            gapComposer10.startReplaceGroup(558811598);
                                        } else {
                                            gapComposer10.startReplaceGroup(-1644541805);
                                            ArcadeUtilKt.ToLabelText(str10, gapComposer10, 0);
                                        }
                                        gapComposer10.end(false);
                                    } else {
                                        gapComposer10.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), null, label2, 0L, gapComposer, ((i2 << 6) & 896) | 12582966, 3440);
                    gapComposer.end(false);
                    z = false;
                }
                gapComposer.end(z);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GooglePayPresenter$$ExternalSyntheticLambda0(cellDefaultViewModel, function1, i);
        }
    }

    public static final void SectionHeaderWidget(Modifier modifier, GenericComponentViewModel.SectionHeaderViewModel sectionHeaderViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Function0 function0;
        sectionHeaderViewModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1436891620);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(sectionHeaderViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 896;
            boolean changedInstance = gapComposer.changedInstance(sectionHeaderViewModel) | (i3 == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new GLSceneScope$$ExternalSyntheticLambda4(27, sectionHeaderViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier onVisible$default = VisibleKt.onVisible$default(modifier, (Function0) rememberedValue);
            String str = sectionHeaderViewModel.title;
            String str2 = sectionHeaderViewModel.actionText;
            String str3 = sectionHeaderViewModel.body;
            GenericTreeElementsViewEvent genericTreeElementsViewEvent = sectionHeaderViewModel.event;
            if (genericTreeElementsViewEvent == null) {
                gapComposer.startReplaceGroup(1501147630);
                gapComposer.end(false);
                function0 = null;
            } else {
                gapComposer.startReplaceGroup(1501147631);
                boolean changedInstance2 = gapComposer.changedInstance(genericTreeElementsViewEvent) | (i3 == 256);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == obj) {
                    rememberedValue2 = new CellDefaultWidgetKt$$ExternalSyntheticLambda0(function1, genericTreeElementsViewEvent, 4);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                function0 = (Function0) rememberedValue2;
                gapComposer.end(false);
            }
            ViewfinderDefaults.SectionHeader(str, onVisible$default, str2, function0, str3, gapComposer, 0, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InviteContactsBodyKt$$ExternalSyntheticLambda18((Object) modifier, (Object) sectionHeaderViewModel, (Object) function1, i, 1);
        }
    }

    public static final void ToCellBodyText(String str, ArcadeTextElement.SemanticTextColor semanticTextColor, Composer composer, int i) {
        Color color;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(219793182);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changed(semanticTextColor == null ? -1 : semanticTextColor.ordinal()) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
            if (semanticTextColor == null) {
                gapComposer.startReplaceGroup(-1966297132);
                gapComposer.end(false);
                color = null;
            } else {
                gapComposer.startReplaceGroup(767855053);
                long arcadeColor = zza.toArcadeColor(semanticTextColor, gapComposer);
                gapComposer.end(false);
                color = new Color(arcadeColor);
            }
            if (color == null) {
                gapComposer.startReplaceGroup(767856708);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(767854879);
                gapComposer.end(false);
                j = color.value;
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, j, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorView$$ExternalSyntheticLambda1(str, semanticTextColor, i, 24);
        }
    }

    public static final void ToLabelText(String str, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1909378988);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FamilyMemberRowKt$$ExternalSyntheticLambda5(str, i, 25);
        }
    }

    public static final ArrayList toArcadeModels(ArrayList arrayList) {
        Icons icons;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            GenericComponentViewModel.ListUnorderedViewModel.ListUnorderedItem listUnorderedItem = (GenericComponentViewModel.ListUnorderedViewModel.ListUnorderedItem) it.next();
            String str = listUnorderedItem.label;
            String str2 = listUnorderedItem.iconId;
            if (str2 != null) {
                Icons.Companion.getClass();
                icons = zzd.get(str2);
            } else {
                icons = null;
            }
            arrayList2.add(new ListUnorderedItem(str, icons, listUnorderedItem.value, null, 8));
        }
        return arrayList2;
    }
}
