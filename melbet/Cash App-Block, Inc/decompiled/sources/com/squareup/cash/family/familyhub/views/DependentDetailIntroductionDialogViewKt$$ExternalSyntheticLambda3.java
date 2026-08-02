package com.squareup.cash.family.familyhub.views;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import coil3.compose.AsyncImageKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailIntroductionViewModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class DependentDetailIntroductionDialogViewKt$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ DependentDetailIntroductionViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ DependentDetailIntroductionDialogViewKt$$ExternalSyntheticLambda3(DependentDetailIntroductionViewModel dependentDetailIntroductionViewModel, Function1 function1) {
        this.f$0 = dependentDetailIntroductionViewModel;
        this.f$1 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object[] objArr = 0;
        final DependentDetailIntroductionViewModel dependentDetailIntroductionViewModel = this.f$0;
        Function1 function1 = this.f$1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                String str = dependentDetailIntroductionViewModel.title;
                String str2 = dependentDetailIntroductionViewModel.message;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-85010073, new DependentDetailIntroductionDialogViewKt$$ExternalSyntheticLambda3(function1, dependentDetailIntroductionViewModel), composer);
                final Object[] objArr2 = objArr == true ? 1 : 0;
                ModalKt.Modal((Modifier) null, str, str2, rememberComposableLambda, (Function3) null, Expect_jvmKt.rememberComposableLambda(-1023521130, new Function3() { // from class: com.squareup.cash.family.familyhub.views.DependentDetailIntroductionDialogViewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        int i2 = objArr2;
                        DependentDetailIntroductionViewModel dependentDetailIntroductionViewModel2 = dependentDetailIntroductionViewModel;
                        switch (i2) {
                            case 0:
                                Composer composer2 = (Composer) obj5;
                                int intValue = ((Integer) obj6).intValue();
                                ((ColumnScope) obj4).getClass();
                                GapComposer gapComposer = (GapComposer) composer2;
                                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                                    String urlForTheme = ThemablesKt.urlForTheme(dependentDetailIntroductionViewModel2.image, gapComposer);
                                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                    DefaultSizes.spacing.getClass();
                                    AsyncImageKt.m1438AsyncImage10Xjiaw(urlForTheme, null, SpacerKt.m298padding3ABfNKs(Modifier.Companion.$$INSTANCE, 8.0f), null, null, null, gapComposer, 48, 2040);
                                } else {
                                    gapComposer.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer3 = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                ((RowScope) obj4).getClass();
                                GapComposer gapComposer2 = (GapComposer) composer3;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dependentDetailIntroductionViewModel2.closeButtonText, (Map) null, (Function1) null, false);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, composer), composer, 199680, 17);
                break;
            default:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                }
                final int i2 = 1;
                GapComposer gapComposer = (GapComposer) composer2;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new FamilyHomeViewKt$$ExternalSyntheticLambda6(13, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(-534917518, new Function3() { // from class: com.squareup.cash.family.familyhub.views.DependentDetailIntroductionDialogViewKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i22 = i2;
                            DependentDetailIntroductionViewModel dependentDetailIntroductionViewModel2 = dependentDetailIntroductionViewModel;
                            switch (i22) {
                                case 0:
                                    Composer composer22 = (Composer) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    ((ColumnScope) obj4).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer22;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        String urlForTheme = ThemablesKt.urlForTheme(dependentDetailIntroductionViewModel2.image, gapComposer2);
                                        ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                        DefaultSizes.spacing.getClass();
                                        AsyncImageKt.m1438AsyncImage10Xjiaw(urlForTheme, null, SpacerKt.m298padding3ABfNKs(Modifier.Companion.$$INSTANCE, 8.0f), null, null, null, gapComposer2, 48, 2040);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue22 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer22 = (GapComposer) composer3;
                                    if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dependentDetailIntroductionViewModel2.closeButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer22.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, ((intValue << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DependentDetailIntroductionDialogViewKt$$ExternalSyntheticLambda3(Function1 function1, DependentDetailIntroductionViewModel dependentDetailIntroductionViewModel) {
        this.f$1 = function1;
        this.f$0 = dependentDetailIntroductionViewModel;
    }
}
