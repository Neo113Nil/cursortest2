package com.squareup.cash.blockers.views;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ScreenScaffoldContentScope;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda13 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EarnerEnrollmentBlockerViewModel.Form f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ EarnerEnrollmentBlockerViewKt$$ExternalSyntheticLambda13(EarnerEnrollmentBlockerViewModel.Form form, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = form;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    DefaultSizes.spacing.getClass();
                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentFormFields(this.f$0, this.f$1, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), null, 2, gapComposer, 24576, 8);
                    ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                    Request$Priority$EnumUnboxingLocalUtility.m((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal), companion, 16.0f, gapComposer);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                scrollingScaffoldContentScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(scrollingScaffoldContentScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Modifier markAsScaffoldTitle = ScreenScaffoldContentScope.markAsScaffoldTitle(gapComposer2, companion);
                    EarnerEnrollmentBlockerViewModel.Form form = this.f$0;
                    Function1 function1 = this.f$1;
                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentFormFields(form, function1, null, markAsScaffoldTitle, 0, gapComposer2, 0, 20);
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 32.0f, gapComposer2);
                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentContinueButton(form, function1, gapComposer2, 0);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    EarnerEnrollmentBlockerViewKt.EarnerEnrollmentContinueButton(this.f$0, this.f$1, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
