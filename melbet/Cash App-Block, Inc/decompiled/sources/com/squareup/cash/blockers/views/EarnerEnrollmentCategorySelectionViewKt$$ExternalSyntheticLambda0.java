package com.squareup.cash.blockers.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import coil3.size.DimensionKt;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes4.dex */
public final /* synthetic */ class EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ EarnerEnrollmentBlockerViewModel.CategorySelection f$0;
    public final /* synthetic */ Function0 f$1;

    public /* synthetic */ EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda0(EarnerEnrollmentBlockerViewModel.CategorySelection categorySelection, Function0 function0, int i) {
        this.$r8$classId = 1;
        this.f$0 = categorySelection;
        this.f$1 = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object[] objArr = 0;
        final Function0 function0 = this.f$1;
        final EarnerEnrollmentBlockerViewModel.CategorySelection categorySelection = this.f$0;
        final int i2 = 1;
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1022043652, new Function3() { // from class: com.squareup.cash.blockers.views.EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i3 = objArr2;
                            Function0 function02 = function0;
                            EarnerEnrollmentBlockerViewModel.CategorySelection categorySelection2 = categorySelection;
                            AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj3;
                            Composer composer2 = (Composer) obj4;
                            int intValue2 = ((Integer) obj5).intValue();
                            switch (i3) {
                                case 0:
                                    adaptiveStackScope.getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        SsnViewKt.EarnerEnrollmentCategoryContinueButton(categorySelection2, function02, gapComposer2, 0);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    adaptiveStackScope.getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        SsnViewKt.EarnerEnrollmentCategoryContinueButton(categorySelection2, function02, gapComposer3, 0);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, 24576, 15);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                num.getClass();
                SsnViewKt.EarnerEnrollmentCategoryContinueButton(categorySelection, function0, composer, Updater.updateChangedFlags(1));
                break;
            default:
                int intValue2 = num.intValue();
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-327333340, new Function3() { // from class: com.squareup.cash.blockers.views.EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            int i3 = i2;
                            Function0 function02 = function0;
                            EarnerEnrollmentBlockerViewModel.CategorySelection categorySelection2 = categorySelection;
                            AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj3;
                            Composer composer2 = (Composer) obj4;
                            int intValue22 = ((Integer) obj5).intValue();
                            switch (i3) {
                                case 0:
                                    adaptiveStackScope.getClass();
                                    GapComposer gapComposer22 = (GapComposer) composer2;
                                    if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                        SsnViewKt.EarnerEnrollmentCategoryContinueButton(categorySelection2, function02, gapComposer22, 0);
                                    } else {
                                        gapComposer22.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    adaptiveStackScope.getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer2;
                                    if (gapComposer3.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                        SsnViewKt.EarnerEnrollmentCategoryContinueButton(categorySelection2, function02, gapComposer3, 0);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), gapComposer2, 24576, 15);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda0(EarnerEnrollmentBlockerViewModel.CategorySelection categorySelection, Function0 function0, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = categorySelection;
        this.f$1 = function0;
    }
}
