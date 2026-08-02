package com.squareup.cash.onboarding.accountpicker.views;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.material3.DateInputKt$DateInputTextField$3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import com.squareup.cash.R;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.input.InputChipKt;
import com.squareup.cash.arcade.components.input.SelectionCardStyle;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$2;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.components.ordertype.autoinvest.AutoInvestPurchaseKt;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingFrequencyOption;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringFrequencyPickerViewModel;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AliasViewModel;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;

/* loaded from: classes6.dex */
public final class AliasPickerViewKt$AliasPicker$lambda$3$0$0$1$0$$inlined$items$default$4 implements Function4 {
    public final /* synthetic */ List $items;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $selectedAliasId$delegate$inlined;

    public /* synthetic */ AliasPickerViewKt$AliasPicker$lambda$3$0$0$1$0$$inlined$items$default$4(List list, MutableState mutableState, int i) {
        this.$r8$classId = i;
        this.$items = list;
        this.$selectedAliasId$delegate$inlined = mutableState;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3 = this.$r8$classId;
        Object obj5 = Composer.Companion.Empty;
        List list = this.$items;
        MutableState mutableState = this.$selectedAliasId$delegate$inlined;
        int i4 = 4;
        final int i5 = 1;
        final int i6 = 0;
        switch (i3) {
            case 0:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                int intValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    final AliasViewModel aliasViewModel = (AliasViewModel) list.get(intValue);
                    gapComposer.startReplaceGroup(-791384157);
                    SelectionCardStyle[] selectionCardStyleArr = SelectionCardStyle.$VALUES;
                    boolean equals = aliasViewModel.aliasId.equals((String) mutableState.getValue());
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1123977970, new Function2() { // from class: com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt$AliasPicker$1$1$1$2$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            int i7;
                            int i8 = i6;
                            AliasViewModel aliasViewModel2 = aliasViewModel;
                            switch (i8) {
                                case 0:
                                    Composer composer2 = (Composer) obj6;
                                    int intValue3 = ((Number) obj7).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        int ordinal = aliasViewModel2.f1176type.ordinal();
                                        if (ordinal == 0) {
                                            i7 = R.string.alias_type_email;
                                        } else if (ordinal != 1) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            i7 = R.string.alias_type_text;
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer2, i7), (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj6;
                                    int intValue4 = ((Number) obj7).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer3, (Modifier) null, ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, aliasViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(439119085, new Function2() { // from class: com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt$AliasPicker$1$1$1$2$1$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj6, Object obj7) {
                            int i7;
                            int i8 = i5;
                            AliasViewModel aliasViewModel2 = aliasViewModel;
                            switch (i8) {
                                case 0:
                                    Composer composer2 = (Composer) obj6;
                                    int intValue3 = ((Number) obj7).intValue();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        int ordinal = aliasViewModel2.f1176type.ordinal();
                                        if (ordinal == 0) {
                                            i7 = R.string.alias_type_email;
                                        } else if (ordinal != 1) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            i7 = R.string.alias_type_text;
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, Room.stringResource(gapComposer2, i7), (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj6;
                                    int intValue4 = ((Number) obj7).intValue();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer3, (Modifier) null, ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, aliasViewModel2.text, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer);
                    boolean changedInstance = gapComposer.changedInstance(aliasViewModel);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue == obj5) {
                        rememberedValue = new VerifyCheckDepositPresenter$models$3$2(20, aliasViewModel, mutableState);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    InputChipKt.SelectionCard(rememberComposableLambda, rememberComposableLambda2, equals, null, false, (Function1) rememberedValue, gapComposer, 3126, 48);
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                int intValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (((GapComposer) composer2).changed(lazyItemScopeImpl2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    InvestingRecurringFrequencyPickerViewModel.Content.Option option = (InvestingRecurringFrequencyPickerViewModel.Content.Option) list.get(intValue3);
                    gapComposer2.startReplaceGroup(-1178220807);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    SelectionCardStyle[] selectionCardStyleArr2 = SelectionCardStyle.$VALUES;
                    boolean z = option.frequency.getLabelResId() == ((InvestingFrequencyOption) mutableState.getValue()).getLabelResId();
                    ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(1845940441, new DateInputKt$DateInputTextField$3(option, i4), gapComposer2);
                    boolean changedInstance2 = gapComposer2.changedInstance(option);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == obj5) {
                        rememberedValue2 = new VerifyCheckDepositPresenter$models$3$2(9, option, mutableState);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    InputChipKt.SelectionCard(rememberComposableLambda3, AutoInvestPurchaseKt.lambda$1257005914, z, m300paddingVpY3zN4$default, false, (Function1) rememberedValue2, gapComposer2, 3126, 32);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
