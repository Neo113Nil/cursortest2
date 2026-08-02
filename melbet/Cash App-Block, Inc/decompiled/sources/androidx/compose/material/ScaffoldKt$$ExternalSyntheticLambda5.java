package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.InsetsPaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import com.google.android.filament.Viewport;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadn;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.benefits.applets.viewmodels.Subtitle;
import com.squareup.cash.benefits.components.viewmodels.GreenStatus;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.widgets.LinkStyle;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.moneybot.widgets.UtilsKt;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel$AmountConfig$KeypadConfig;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.transfers.views.composer.RecurringReloadConfigurationComposersKt;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import com.squareup.moshi.ClassFactory;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.coroutines.FirstOrNullOnTimeoutKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class ScaffoldKt$$ExternalSyntheticLambda5 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;

    public /* synthetic */ ScaffoldKt$$ExternalSyntheticLambda5(int i, Function2 function2, ComposableLambdaImpl composableLambdaImpl, Function2 function22, MutableWindowInsets mutableWindowInsets, Function2 function23, Function3 function3, ScaffoldState scaffoldState) {
        this.$r8$classId = 0;
        this.f$1 = i;
        this.f$2 = function2;
        this.f$3 = composableLambdaImpl;
        this.f$4 = function22;
        this.f$5 = mutableWindowInsets;
        this.f$6 = function23;
        this.f$7 = function3;
        this.f$8 = scaffoldState;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x05cb A[LOOP:3: B:130:0x05c9->B:131:0x05cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0666 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x06bc A[LOOP:4: B:156:0x06ba->B:157:0x06bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x064e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0614  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x05e4  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        final ArrayList arrayList;
        Object obj4;
        final ArrayList arrayList2;
        Viewport viewport;
        final ArrayList arrayList3;
        int size;
        int i;
        int i2;
        Object obj5;
        Integer num;
        int size2;
        Object obj6;
        Object obj7;
        int i3;
        int mo230roundToPx0680j_4;
        int i4;
        int mo230roundToPx0680j_42;
        int mo230roundToPx0680j_43;
        int i5;
        Viewport viewport2;
        final Integer num2;
        final int i6;
        int intValue;
        int mo230roundToPx0680j_44;
        int bottom;
        int i7 = this.$r8$classId;
        int i8 = this.f$1;
        Object obj8 = this.f$8;
        Object obj9 = this.f$7;
        Object obj10 = this.f$5;
        Object obj11 = this.f$6;
        Object obj12 = this.f$4;
        Object obj13 = this.f$2;
        Object obj14 = this.f$3;
        switch (i7) {
            case 0:
                Function2 function2 = (Function2) obj13;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj14;
                Function2 function22 = (Function2) obj12;
                MutableWindowInsets mutableWindowInsets = (MutableWindowInsets) obj10;
                Function2 function23 = (Function2) obj11;
                Function3 function3 = (Function3) obj9;
                ScaffoldState scaffoldState = (ScaffoldState) obj8;
                Composer composer = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ScaffoldKt.m504ScaffoldLayouti1QSOvI(this.f$1, 24576, mutableWindowInsets, gapComposer, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(545329543, new androidx.compose.material3.TextKt$$ExternalSyntheticLambda0(19, function3, scaffoldState), gapComposer), function2, function22, function23);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ComposableLambdaImpl composableLambdaImpl2 = (ComposableLambdaImpl) obj14;
                Function2 function24 = (Function2) obj12;
                WindowInsets windowInsets = (WindowInsets) obj10;
                ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1 = (ScaffoldKt$ScaffoldLayout$contentPadding$1$1) obj9;
                Function2 function25 = (Function2) obj11;
                ComposableLambdaImpl composableLambdaImpl3 = (ComposableLambdaImpl) obj8;
                SubcomposeMeasureScope subcomposeMeasureScope = (SubcomposeMeasureScope) obj;
                Constraints constraints = (Constraints) obj2;
                float f = ScaffoldKt.FabSpacing;
                int m1025getMaxWidthimpl = Constraints.m1025getMaxWidthimpl(constraints.value);
                final int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(constraints.value);
                long m1018copyZbe2FdA$default = Constraints.m1018copyZbe2FdA$default(constraints.value, 0, 0, 0, 0, 10);
                List subcompose = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.TopBar, (Function2) obj13);
                ArrayList arrayList4 = new ArrayList(subcompose.size());
                int size3 = subcompose.size();
                int i9 = 0;
                while (i9 < size3) {
                    arrayList4.add(((Measurable) subcompose.get(i9)).mo833measureBRTryo0(m1018copyZbe2FdA$default));
                    i9++;
                    subcompose = subcompose;
                }
                if (arrayList4.isEmpty()) {
                    arrayList = arrayList4;
                    obj3 = null;
                } else {
                    obj3 = arrayList4.get(0);
                    int i10 = ((Placeable) obj3).height;
                    int size4 = arrayList4.size() - 1;
                    if (1 <= size4) {
                        Object obj15 = obj3;
                        int i11 = i10;
                        int i12 = 1;
                        while (true) {
                            Object obj16 = arrayList4.get(i12);
                            arrayList = arrayList4;
                            int i13 = ((Placeable) obj16).height;
                            if (i11 < i13) {
                                i11 = i13;
                            } else {
                                obj16 = obj15;
                            }
                            if (i12 != size4) {
                                i12++;
                                obj15 = obj16;
                                arrayList4 = arrayList;
                            } else {
                                obj3 = obj16;
                            }
                        }
                    } else {
                        arrayList = arrayList4;
                    }
                }
                Placeable placeable = (Placeable) obj3;
                final int i14 = placeable != null ? placeable.height : 0;
                List subcompose2 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Snackbar, composableLambdaImpl2);
                ArrayList arrayList5 = new ArrayList(subcompose2.size());
                int size5 = subcompose2.size();
                int i15 = 0;
                while (i15 < size5) {
                    arrayList5.add(((Measurable) subcompose2.get(i15)).mo833measureBRTryo0(ConstraintsKt.m1034offsetNN6EwU((-windowInsets.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope), m1018copyZbe2FdA$default)));
                    i15++;
                    subcompose2 = subcompose2;
                    size5 = size5;
                    composableLambdaImpl3 = composableLambdaImpl3;
                }
                ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImpl3;
                if (arrayList5.isEmpty()) {
                    arrayList2 = arrayList5;
                    obj4 = null;
                } else {
                    obj4 = arrayList5.get(0);
                    int i16 = ((Placeable) obj4).height;
                    int size6 = arrayList5.size() - 1;
                    if (1 <= size6) {
                        int i17 = 1;
                        while (true) {
                            Object obj17 = arrayList5.get(i17);
                            arrayList2 = arrayList5;
                            int i18 = ((Placeable) obj17).height;
                            if (i16 < i18) {
                                i16 = i18;
                                obj4 = obj17;
                            }
                            if (i17 != size6) {
                                i17++;
                                arrayList5 = arrayList2;
                            }
                        }
                    } else {
                        arrayList2 = arrayList5;
                    }
                }
                Placeable placeable2 = (Placeable) obj4;
                int i19 = placeable2 != null ? placeable2.height : 0;
                List subcompose3 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.Fab, function24);
                final ArrayList arrayList6 = new ArrayList(subcompose3.size());
                int size7 = subcompose3.size();
                int i20 = 0;
                while (i20 < size7) {
                    arrayList6.add(((Measurable) subcompose3.get(i20)).mo833measureBRTryo0(ConstraintsKt.m1034offsetNN6EwU((-windowInsets.getLeft(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection())) - windowInsets.getRight(subcomposeMeasureScope, subcomposeMeasureScope.getLayoutDirection()), -windowInsets.getBottom(subcomposeMeasureScope), m1018copyZbe2FdA$default)));
                    i20++;
                    i19 = i19;
                    m1025getMaxWidthimpl = m1025getMaxWidthimpl;
                    subcompose3 = subcompose3;
                }
                int i21 = i19;
                int i22 = m1025getMaxWidthimpl;
                if (!arrayList6.isEmpty()) {
                    if (arrayList6.isEmpty()) {
                        obj6 = null;
                    } else {
                        obj6 = arrayList6.get(0);
                        int i23 = ((Placeable) obj6).width;
                        int size8 = arrayList6.size() - 1;
                        if (1 <= size8) {
                            int i24 = 1;
                            while (true) {
                                Object obj18 = arrayList6.get(i24);
                                int i25 = ((Placeable) obj18).width;
                                if (i23 < i25) {
                                    obj6 = obj18;
                                    i23 = i25;
                                }
                                if (i24 != size8) {
                                    i24++;
                                }
                            }
                        }
                    }
                    Placeable placeable3 = (Placeable) obj6;
                    int i26 = placeable3 != null ? placeable3.width : 0;
                    if (arrayList6.isEmpty()) {
                        obj7 = null;
                    } else {
                        obj7 = arrayList6.get(0);
                        int i27 = ((Placeable) obj7).height;
                        int size9 = arrayList6.size() - 1;
                        if (1 <= size9) {
                            int i28 = 1;
                            while (true) {
                                Object obj19 = arrayList6.get(i28);
                                int i29 = ((Placeable) obj19).height;
                                if (i27 < i29) {
                                    obj7 = obj19;
                                    i27 = i29;
                                }
                                if (i28 != size9) {
                                    i28++;
                                }
                            }
                        }
                    }
                    Placeable placeable4 = (Placeable) obj7;
                    int i30 = placeable4 != null ? placeable4.height : 0;
                    if (i26 != 0 && i30 != 0) {
                        if (i8 != 0) {
                            if (i8 != 2) {
                                i3 = (i22 - i26) / 2;
                            } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                                mo230roundToPx0680j_4 = subcomposeMeasureScope.mo230roundToPx0680j_4(f);
                                i3 = (i22 - mo230roundToPx0680j_4) - i26;
                            } else {
                                i3 = subcomposeMeasureScope.mo230roundToPx0680j_4(f);
                            }
                            viewport = new Viewport(i3, i30);
                            List subcompose4 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.BottomBar, new ComposableLambdaImpl(new androidx.compose.material3.TextKt$$ExternalSyntheticLambda0(20, viewport, function25), true, -502652347));
                            arrayList3 = new ArrayList(subcompose4.size());
                            size = subcompose4.size();
                            while (i < size) {
                            }
                            if (arrayList3.isEmpty()) {
                            }
                            Placeable placeable5 = (Placeable) obj5;
                            if (placeable5 == null) {
                            }
                            if (viewport == null) {
                            }
                            if (i21 == 0) {
                            }
                            InsetsPaddingValues insetsPaddingValues = new InsetsPaddingValues(windowInsets, subcomposeMeasureScope);
                            scaffoldKt$ScaffoldLayout$contentPadding$1$1.paddingHolder$delegate.setValue(new PaddingValuesImpl(SpacerKt.calculateStartPadding(insetsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), !arrayList.isEmpty() ? insetsPaddingValues.mo267calculateTopPaddingD9Ej5fM() : RecyclerView.DECELERATION_RATE, SpacerKt.calculateEndPadding(insetsPaddingValues, subcomposeMeasureScope.getLayoutDirection()), (!arrayList3.isEmpty() || r5 == null) ? insetsPaddingValues.mo264calculateBottomPaddingD9Ej5fM() : subcomposeMeasureScope.mo233toDpu2uoSUM(r5.intValue())));
                            int i31 = m1024getMaxHeightimpl - i14;
                            List subcompose5 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.MainContent, new ComposableLambdaImpl(new androidx.compose.material3.TextKt$$ExternalSyntheticLambda0(composableLambdaImpl4, scaffoldKt$ScaffoldLayout$contentPadding$1$1, 18), true, -574531306));
                            final ArrayList arrayList7 = new ArrayList(subcompose5.size());
                            size2 = subcompose5.size();
                            while (i2 < size2) {
                            }
                            final Integer num3 = num;
                            final Viewport viewport3 = viewport;
                            final Integer num4 = r5;
                            final int i32 = r7;
                        } else if (subcomposeMeasureScope.getLayoutDirection() == LayoutDirection.Ltr) {
                            i3 = subcomposeMeasureScope.mo230roundToPx0680j_4(f);
                            viewport = new Viewport(i3, i30);
                            List subcompose42 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.BottomBar, new ComposableLambdaImpl(new androidx.compose.material3.TextKt$$ExternalSyntheticLambda0(20, viewport, function25), true, -502652347));
                            arrayList3 = new ArrayList(subcompose42.size());
                            size = subcompose42.size();
                            for (i = 0; i < size; i++) {
                                arrayList3.add(((Measurable) subcompose42.get(i)).mo833measureBRTryo0(m1018copyZbe2FdA$default));
                            }
                            if (arrayList3.isEmpty()) {
                                i2 = 0;
                                obj5 = arrayList3.get(0);
                                int i33 = ((Placeable) obj5).height;
                                int size10 = arrayList3.size() - 1;
                                if (1 <= size10) {
                                    int i34 = 1;
                                    while (true) {
                                        Object obj20 = arrayList3.get(i34);
                                        int i35 = ((Placeable) obj20).height;
                                        if (i33 < i35) {
                                            obj5 = obj20;
                                            i33 = i35;
                                        }
                                        if (i34 != size10) {
                                            i34++;
                                        }
                                    }
                                }
                            } else {
                                i2 = 0;
                                obj5 = null;
                            }
                            Placeable placeable52 = (Placeable) obj5;
                            Integer valueOf = placeable52 == null ? Integer.valueOf(placeable52.height) : null;
                            if (viewport == null) {
                                int i36 = viewport.height;
                                num = Integer.valueOf(valueOf == null ? windowInsets.getBottom(subcomposeMeasureScope) + subcomposeMeasureScope.mo230roundToPx0680j_4(f) + i36 : subcomposeMeasureScope.mo230roundToPx0680j_4(f) + valueOf.intValue() + i36);
                            } else {
                                num = null;
                            }
                            int intValue3 = i21 == 0 ? i21 + (num != null ? num.intValue() : valueOf != null ? valueOf.intValue() : windowInsets.getBottom(subcomposeMeasureScope)) : i2;
                            InsetsPaddingValues insetsPaddingValues2 = new InsetsPaddingValues(windowInsets, subcomposeMeasureScope);
                            scaffoldKt$ScaffoldLayout$contentPadding$1$1.paddingHolder$delegate.setValue(new PaddingValuesImpl(SpacerKt.calculateStartPadding(insetsPaddingValues2, subcomposeMeasureScope.getLayoutDirection()), !arrayList.isEmpty() ? insetsPaddingValues2.mo267calculateTopPaddingD9Ej5fM() : RecyclerView.DECELERATION_RATE, SpacerKt.calculateEndPadding(insetsPaddingValues2, subcomposeMeasureScope.getLayoutDirection()), (!arrayList3.isEmpty() || valueOf == null) ? insetsPaddingValues2.mo264calculateBottomPaddingD9Ej5fM() : subcomposeMeasureScope.mo233toDpu2uoSUM(valueOf.intValue())));
                            int i312 = m1024getMaxHeightimpl - i14;
                            List subcompose52 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.MainContent, new ComposableLambdaImpl(new androidx.compose.material3.TextKt$$ExternalSyntheticLambda0(composableLambdaImpl4, scaffoldKt$ScaffoldLayout$contentPadding$1$1, 18), true, -574531306));
                            final ArrayList arrayList72 = new ArrayList(subcompose52.size());
                            size2 = subcompose52.size();
                            while (i2 < size2) {
                                arrayList72.add(((Measurable) subcompose52.get(i2)).mo833measureBRTryo0(Constraints.m1018copyZbe2FdA$default(m1018copyZbe2FdA$default, 0, 0, 0, i312, 7)));
                                i2++;
                            }
                            final Integer num32 = num;
                            final Viewport viewport32 = viewport;
                            final Integer num42 = valueOf;
                            final int i322 = intValue3;
                            break;
                        } else {
                            mo230roundToPx0680j_4 = subcomposeMeasureScope.mo230roundToPx0680j_4(f);
                            i3 = (i22 - mo230roundToPx0680j_4) - i26;
                            viewport = new Viewport(i3, i30);
                            List subcompose422 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.BottomBar, new ComposableLambdaImpl(new androidx.compose.material3.TextKt$$ExternalSyntheticLambda0(20, viewport, function25), true, -502652347));
                            arrayList3 = new ArrayList(subcompose422.size());
                            size = subcompose422.size();
                            while (i < size) {
                            }
                            if (arrayList3.isEmpty()) {
                            }
                            Placeable placeable522 = (Placeable) obj5;
                            if (placeable522 == null) {
                            }
                            if (viewport == null) {
                            }
                            if (i21 == 0) {
                            }
                            InsetsPaddingValues insetsPaddingValues22 = new InsetsPaddingValues(windowInsets, subcomposeMeasureScope);
                            scaffoldKt$ScaffoldLayout$contentPadding$1$1.paddingHolder$delegate.setValue(new PaddingValuesImpl(SpacerKt.calculateStartPadding(insetsPaddingValues22, subcomposeMeasureScope.getLayoutDirection()), !arrayList.isEmpty() ? insetsPaddingValues22.mo267calculateTopPaddingD9Ej5fM() : RecyclerView.DECELERATION_RATE, SpacerKt.calculateEndPadding(insetsPaddingValues22, subcomposeMeasureScope.getLayoutDirection()), (!arrayList3.isEmpty() || valueOf == null) ? insetsPaddingValues22.mo264calculateBottomPaddingD9Ej5fM() : subcomposeMeasureScope.mo233toDpu2uoSUM(valueOf.intValue())));
                            int i3122 = m1024getMaxHeightimpl - i14;
                            List subcompose522 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.MainContent, new ComposableLambdaImpl(new androidx.compose.material3.TextKt$$ExternalSyntheticLambda0(composableLambdaImpl4, scaffoldKt$ScaffoldLayout$contentPadding$1$1, 18), true, -574531306));
                            final ArrayList arrayList722 = new ArrayList(subcompose522.size());
                            size2 = subcompose522.size();
                            while (i2 < size2) {
                            }
                            final Integer num322 = num;
                            final Viewport viewport322 = viewport;
                            final Integer num422 = valueOf;
                            final int i3222 = intValue3;
                        }
                    }
                }
                viewport = null;
                List subcompose4222 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.BottomBar, new ComposableLambdaImpl(new androidx.compose.material3.TextKt$$ExternalSyntheticLambda0(20, viewport, function25), true, -502652347));
                arrayList3 = new ArrayList(subcompose4222.size());
                size = subcompose4222.size();
                while (i < size) {
                }
                if (arrayList3.isEmpty()) {
                }
                Placeable placeable5222 = (Placeable) obj5;
                if (placeable5222 == null) {
                }
                if (viewport == null) {
                }
                if (i21 == 0) {
                }
                InsetsPaddingValues insetsPaddingValues222 = new InsetsPaddingValues(windowInsets, subcomposeMeasureScope);
                scaffoldKt$ScaffoldLayout$contentPadding$1$1.paddingHolder$delegate.setValue(new PaddingValuesImpl(SpacerKt.calculateStartPadding(insetsPaddingValues222, subcomposeMeasureScope.getLayoutDirection()), !arrayList.isEmpty() ? insetsPaddingValues222.mo267calculateTopPaddingD9Ej5fM() : RecyclerView.DECELERATION_RATE, SpacerKt.calculateEndPadding(insetsPaddingValues222, subcomposeMeasureScope.getLayoutDirection()), (!arrayList3.isEmpty() || valueOf == null) ? insetsPaddingValues222.mo264calculateBottomPaddingD9Ej5fM() : subcomposeMeasureScope.mo233toDpu2uoSUM(valueOf.intValue())));
                int i31222 = m1024getMaxHeightimpl - i14;
                List subcompose5222 = subcomposeMeasureScope.subcompose(ScaffoldLayoutContent.MainContent, new ComposableLambdaImpl(new androidx.compose.material3.TextKt$$ExternalSyntheticLambda0(composableLambdaImpl4, scaffoldKt$ScaffoldLayout$contentPadding$1$1, 18), true, -574531306));
                final ArrayList arrayList7222 = new ArrayList(subcompose5222.size());
                size2 = subcompose5222.size();
                while (i2 < size2) {
                }
                final Integer num3222 = num;
                final Viewport viewport3222 = viewport;
                final Integer num4222 = valueOf;
                final int i32222 = intValue3;
            case 2:
                final WindowInsets windowInsets2 = (WindowInsets) obj14;
                Function2 function26 = (Function2) obj10;
                androidx.compose.material3.ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$12 = (androidx.compose.material3.ScaffoldKt$ScaffoldLayout$contentPadding$1$1) obj9;
                Function2 function27 = (Function2) obj8;
                final SubcomposeMeasureScope subcomposeMeasureScope2 = (SubcomposeMeasureScope) obj;
                Constraints constraints2 = (Constraints) obj2;
                final int m1025getMaxWidthimpl2 = Constraints.m1025getMaxWidthimpl(constraints2.value);
                final int m1024getMaxHeightimpl2 = Constraints.m1024getMaxHeightimpl(constraints2.value);
                long m1018copyZbe2FdA$default2 = Constraints.m1018copyZbe2FdA$default(constraints2.value, 0, 0, 0, 0, 10);
                int left = windowInsets2.getLeft(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection());
                int right = windowInsets2.getRight(subcomposeMeasureScope2, subcomposeMeasureScope2.getLayoutDirection());
                int bottom2 = windowInsets2.getBottom(subcomposeMeasureScope2);
                final Placeable mo833measureBRTryo0 = ((Measurable) CollectionsKt.first(subcomposeMeasureScope2.subcompose(androidx.compose.material3.ScaffoldLayoutContent.TopBar, (Function2) obj13))).mo833measureBRTryo0(m1018copyZbe2FdA$default2);
                int i37 = (-left) - right;
                int i38 = -bottom2;
                final Placeable mo833measureBRTryo02 = ((Measurable) CollectionsKt.first(subcomposeMeasureScope2.subcompose(androidx.compose.material3.ScaffoldLayoutContent.Snackbar, (Function2) obj12))).mo833measureBRTryo0(ConstraintsKt.m1034offsetNN6EwU(i37, i38, m1018copyZbe2FdA$default2));
                final Placeable mo833measureBRTryo03 = ((Measurable) CollectionsKt.first(subcomposeMeasureScope2.subcompose(androidx.compose.material3.ScaffoldLayoutContent.Fab, (Function2) obj11))).mo833measureBRTryo0(ConstraintsKt.m1034offsetNN6EwU(i37, i38, m1018copyZbe2FdA$default2));
                int i39 = mo833measureBRTryo03.width;
                if (i39 == 0 && mo833measureBRTryo03.height == 0) {
                    viewport2 = null;
                } else {
                    int i40 = mo833measureBRTryo03.height;
                    if (i8 == 0) {
                        i4 = left;
                        if (subcomposeMeasureScope2.getLayoutDirection() == LayoutDirection.Ltr) {
                            mo230roundToPx0680j_42 = subcomposeMeasureScope2.mo230roundToPx0680j_4(16.0f);
                            i5 = mo230roundToPx0680j_42 + i4;
                        } else {
                            mo230roundToPx0680j_43 = subcomposeMeasureScope2.mo230roundToPx0680j_4(16.0f);
                            i5 = ((m1025getMaxWidthimpl2 - mo230roundToPx0680j_43) - i39) - right;
                        }
                    } else {
                        i4 = left;
                        if (i8 != 2 && i8 != 3) {
                            i5 = (((m1025getMaxWidthimpl2 - i39) + i4) - right) / 2;
                        } else if (subcomposeMeasureScope2.getLayoutDirection() == LayoutDirection.Ltr) {
                            mo230roundToPx0680j_43 = subcomposeMeasureScope2.mo230roundToPx0680j_4(16.0f);
                            i5 = ((m1025getMaxWidthimpl2 - mo230roundToPx0680j_43) - i39) - right;
                        } else {
                            mo230roundToPx0680j_42 = subcomposeMeasureScope2.mo230roundToPx0680j_4(16.0f);
                            i5 = mo230roundToPx0680j_42 + i4;
                        }
                    }
                    viewport2 = new Viewport(i5, i40);
                }
                final Placeable mo833measureBRTryo04 = ((Measurable) CollectionsKt.first(subcomposeMeasureScope2.subcompose(androidx.compose.material3.ScaffoldLayoutContent.BottomBar, function26))).mo833measureBRTryo0(m1018copyZbe2FdA$default2);
                boolean z = mo833measureBRTryo04.width == 0 && mo833measureBRTryo04.height == 0;
                if (viewport2 != null) {
                    int i41 = viewport2.height;
                    if (z || i8 == 3) {
                        mo230roundToPx0680j_44 = subcomposeMeasureScope2.mo230roundToPx0680j_4(16.0f) + i41;
                        bottom = windowInsets2.getBottom(subcomposeMeasureScope2);
                    } else {
                        mo230roundToPx0680j_44 = mo833measureBRTryo04.height + i41;
                        bottom = subcomposeMeasureScope2.mo230roundToPx0680j_4(16.0f);
                    }
                    num2 = Integer.valueOf(bottom + mo230roundToPx0680j_44);
                } else {
                    num2 = null;
                }
                int i42 = mo833measureBRTryo02.height;
                if (i42 != 0) {
                    if (num2 != null) {
                        intValue = num2.intValue();
                    } else {
                        Integer valueOf2 = Integer.valueOf(mo833measureBRTryo04.height);
                        if (z) {
                            valueOf2 = null;
                        }
                        intValue = valueOf2 != null ? valueOf2.intValue() : windowInsets2.getBottom(subcomposeMeasureScope2);
                    }
                    i6 = i42 + intValue;
                } else {
                    i6 = 0;
                }
                InsetsPaddingValues insetsPaddingValues3 = new InsetsPaddingValues(windowInsets2, subcomposeMeasureScope2);
                scaffoldKt$ScaffoldLayout$contentPadding$1$12.paddingHolder$delegate.setValue(new PaddingValuesImpl(SpacerKt.calculateStartPadding(insetsPaddingValues3, subcomposeMeasureScope2.getLayoutDirection()), (mo833measureBRTryo0.width == 0 && mo833measureBRTryo0.height == 0) ? insetsPaddingValues3.mo267calculateTopPaddingD9Ej5fM() : subcomposeMeasureScope2.mo233toDpu2uoSUM(mo833measureBRTryo0.height), SpacerKt.calculateEndPadding(insetsPaddingValues3, subcomposeMeasureScope2.getLayoutDirection()), z ? insetsPaddingValues3.mo264calculateBottomPaddingD9Ej5fM() : subcomposeMeasureScope2.mo233toDpu2uoSUM(mo833measureBRTryo04.height)));
                final Placeable mo833measureBRTryo05 = ((Measurable) CollectionsKt.first(subcomposeMeasureScope2.subcompose(androidx.compose.material3.ScaffoldLayoutContent.MainContent, function27))).mo833measureBRTryo0(m1018copyZbe2FdA$default2);
                final Viewport viewport4 = viewport2;
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((ComposableLambdaImpl) obj14).invoke(this.f$2, this.f$4, this.f$6, this.f$5, this.f$7, this.f$8, (Composer) obj, Updater.updateChangedFlags(i8) | 1);
                break;
            case 4:
                ((Integer) obj2).getClass();
                ClassFactory.SyncBrandSpotEffect((BrandSpot) obj13, (BrandSpotSyncTokens) obj12, (String) obj11, (RealLocalBrandSyncer) obj14, (BetterNavigator.ScreenNavigator) obj10, (RealLocalLauncher) obj9, (Function0) obj8, (Composer) obj, Updater.updateChangedFlags(1), this.f$1);
                break;
            case 5:
                ((Integer) obj2).getClass();
                zzadn.AppletContentUI((String) obj13, (GreenStatus) obj12, (Subtitle) obj11, (Float) obj14, (Float) obj10, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj9, (AppletTile.AppletTileAppearance) obj8, (Composer) obj, Updater.updateChangedFlags(i8 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                VisibleKt.ArcadeBannerCardStandard((Icons) obj12, (String) obj11, (Modifier) obj14, (String) obj10, (Function2) obj13, (String) obj9, (Function0) obj8, (Composer) obj, Updater.updateChangedFlags(7), this.f$1);
                break;
            case 7:
                ((Integer) obj2).getClass();
                VisibleKt.m3493InfoUpsellContentnWqOM5s((ScrollState) obj13, (String) obj12, (String) obj11, (Painter) obj10, (ComposableLambdaImpl) obj14, (Modifier) obj9, (DpSize) obj8, (Composer) obj, Updater.updateChangedFlags(i8 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                FirstOrNullOnTimeoutKt.UpsellWidget((Image) obj13, (String) obj12, (String) obj11, (String) obj14, (Function0) obj10, (Modifier) obj9, (LinkStyle) obj8, (Composer) obj, Updater.updateChangedFlags(i8 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                UtilsKt.PromptInput((TextFieldValue) obj13, (Modifier) obj12, (String) obj11, (Function1) obj14, (Function0) obj10, (FocusRequester) obj9, (MutableInteractionSourceImpl) obj8, (Composer) obj, Updater.updateChangedFlags(i8 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                AddMoneyViewKt.WithdrawAmountView((Modifier) obj13, (WithdrawViewModel$AmountConfig$KeypadConfig) obj12, (MoneyFormatter) obj11, (Function1) obj14, (KeypadAmount) obj10, (Function0) obj9, (FocusRequester) obj8, (Composer) obj, Updater.updateChangedFlags(i8 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                RecurringReloadConfigurationComposersKt.AmountKeypadContent((Modifier) obj13, (RecurringReloadConfigurationViewModel.Keypad) obj12, (Function1) obj11, (Function0) obj14, (Function0) obj10, (LocalizedMoneyFormatter.Factory) obj9, (RealCashVibrator) obj8, (Composer) obj, Updater.updateChangedFlags(i8 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ScaffoldKt$$ExternalSyntheticLambda5(ScrollState scrollState, String str, String str2, Painter painter, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, DpSize dpSize, int i) {
        this.$r8$classId = 7;
        this.f$2 = scrollState;
        this.f$4 = str;
        this.f$6 = str2;
        this.f$5 = painter;
        this.f$3 = composableLambdaImpl;
        this.f$7 = modifier;
        this.f$8 = dpSize;
        this.f$1 = i;
    }

    public /* synthetic */ ScaffoldKt$$ExternalSyntheticLambda5(WindowInsets windowInsets, Function2 function2, Function2 function22, Function2 function23, int i, Function2 function24, androidx.compose.material3.ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, Function2 function25) {
        this.$r8$classId = 2;
        this.f$3 = windowInsets;
        this.f$2 = function2;
        this.f$4 = function22;
        this.f$6 = function23;
        this.f$1 = i;
        this.f$5 = function24;
        this.f$7 = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
        this.f$8 = function25;
    }

    public /* synthetic */ ScaffoldKt$$ExternalSyntheticLambda5(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.$r8$classId = 3;
        this.f$3 = composableLambdaImpl;
        this.f$2 = obj;
        this.f$4 = obj2;
        this.f$6 = obj3;
        this.f$5 = obj4;
        this.f$7 = obj5;
        this.f$8 = obj6;
        this.f$1 = i;
    }

    public /* synthetic */ ScaffoldKt$$ExternalSyntheticLambda5(BrandSpot brandSpot, BrandSpotSyncTokens brandSpotSyncTokens, String str, RealLocalBrandSyncer realLocalBrandSyncer, BetterNavigator.ScreenNavigator screenNavigator, RealLocalLauncher realLocalLauncher, Function0 function0, int i, int i2) {
        this.$r8$classId = 4;
        this.f$2 = brandSpot;
        this.f$4 = brandSpotSyncTokens;
        this.f$6 = str;
        this.f$3 = realLocalBrandSyncer;
        this.f$5 = screenNavigator;
        this.f$7 = realLocalLauncher;
        this.f$8 = function0;
        this.f$1 = i2;
    }

    public /* synthetic */ ScaffoldKt$$ExternalSyntheticLambda5(Icons icons, String str, Modifier modifier, String str2, Function2 function2, String str3, Function0 function0, int i, int i2) {
        this.$r8$classId = 6;
        this.f$4 = icons;
        this.f$6 = str;
        this.f$3 = modifier;
        this.f$5 = str2;
        this.f$2 = function2;
        this.f$7 = str3;
        this.f$8 = function0;
        this.f$1 = i2;
    }

    public /* synthetic */ ScaffoldKt$$ExternalSyntheticLambda5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, int i2) {
        this.$r8$classId = i2;
        this.f$2 = obj;
        this.f$4 = obj2;
        this.f$6 = obj3;
        this.f$3 = obj4;
        this.f$5 = obj5;
        this.f$7 = obj6;
        this.f$8 = obj7;
        this.f$1 = i;
    }

    public /* synthetic */ ScaffoldKt$$ExternalSyntheticLambda5(Function2 function2, ComposableLambdaImpl composableLambdaImpl, Function2 function22, int i, WindowInsets windowInsets, ScaffoldKt$ScaffoldLayout$contentPadding$1$1 scaffoldKt$ScaffoldLayout$contentPadding$1$1, Function2 function23, ComposableLambdaImpl composableLambdaImpl2) {
        this.$r8$classId = 1;
        this.f$2 = function2;
        this.f$3 = composableLambdaImpl;
        this.f$4 = function22;
        this.f$1 = i;
        this.f$5 = windowInsets;
        this.f$7 = scaffoldKt$ScaffoldLayout$contentPadding$1$1;
        this.f$6 = function23;
        this.f$8 = composableLambdaImpl2;
    }
}
