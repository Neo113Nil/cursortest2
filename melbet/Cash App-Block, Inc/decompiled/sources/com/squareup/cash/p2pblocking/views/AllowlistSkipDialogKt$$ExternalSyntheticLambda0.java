package com.squareup.cash.p2pblocking.views;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSkipDialogModel;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class AllowlistSkipDialogKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AllowlistSkipDialogModel f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ AllowlistSkipDialogKt$$ExternalSyntheticLambda0(AllowlistSkipDialogModel allowlistSkipDialogModel, Function0 function0, Function0 function02, int i) {
        this.$r8$classId = i;
        this.f$0 = allowlistSkipDialogModel;
        this.f$1 = function0;
        this.f$2 = function02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        Object[] objArr = 0;
        final Function0 function0 = this.f$2;
        final Function0 function02 = this.f$1;
        final AllowlistSkipDialogModel allowlistSkipDialogModel = this.f$0;
        final int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    AnimatedContentKt.AnimatedVisibility(true, (Modifier) null, (EnterTransitionImpl) null, (ExitTransitionImpl) null, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-1797510113, new AllowlistSkipDialogKt$$ExternalSyntheticLambda0(allowlistSkipDialogModel, function02, function0, i2), gapComposer), (Composer) gapComposer, 196614, 30);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                String str = allowlistSkipDialogModel.title;
                String str2 = allowlistSkipDialogModel.message;
                final Object[] objArr2 = objArr == true ? 1 : 0;
                ModalKt.Modal((Modifier) null, str, str2, Expect_jvmKt.rememberComposableLambda(1285913411, new Function3() { // from class: com.squareup.cash.p2pblocking.views.AllowlistSkipDialogKt$$ExternalSyntheticLambda3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        int i3 = objArr2;
                        final AllowlistSkipDialogModel allowlistSkipDialogModel2 = allowlistSkipDialogModel;
                        Object[] objArr3 = 0;
                        char c = 1;
                        switch (i3) {
                            case 0:
                                ModalButtonScope modalButtonScope = (ModalButtonScope) obj4;
                                Composer composer3 = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                modalButtonScope.getClass();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((GapComposer) composer3).changed(modalButtonScope) ? 4 : 2;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer3;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    final char c2 = c == true ? 1 : 0;
                                    modalButtonScope.PrimaryModalButton(function02, null, false, Expect_jvmKt.rememberComposableLambda(-123748594, new Function3() { // from class: com.squareup.cash.p2pblocking.views.AllowlistSkipDialogKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                            int i4 = c2;
                                            AllowlistSkipDialogModel allowlistSkipDialogModel3 = allowlistSkipDialogModel2;
                                            switch (i4) {
                                                case 0:
                                                    Composer composer4 = (Composer) obj8;
                                                    int intValue3 = ((Integer) obj9).intValue();
                                                    ((RowScope) obj7).getClass();
                                                    GapComposer gapComposer3 = (GapComposer) composer4;
                                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowlistSkipDialogModel3.cancelButtonText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer3.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj8;
                                                    int intValue4 = ((Integer) obj9).intValue();
                                                    ((RowScope) obj7).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer5;
                                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowlistSkipDialogModel3.confirmButtonText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer2), gapComposer2, (57344 & (intValue2 << 12)) | 3072, 6);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj4;
                                Composer composer4 = (Composer) obj5;
                                int intValue3 = ((Integer) obj6).intValue();
                                modalButtonScope2.getClass();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((GapComposer) composer4).changed(modalButtonScope2) ? 4 : 2;
                                }
                                GapComposer gapComposer3 = (GapComposer) composer4;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    final Object[] objArr4 = objArr3 == true ? 1 : 0;
                                    modalButtonScope2.SecondaryModalButton(function02, null, false, Expect_jvmKt.rememberComposableLambda(316336641, new Function3() { // from class: com.squareup.cash.p2pblocking.views.AllowlistSkipDialogKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                            int i4 = objArr4;
                                            AllowlistSkipDialogModel allowlistSkipDialogModel3 = allowlistSkipDialogModel2;
                                            switch (i4) {
                                                case 0:
                                                    Composer composer42 = (Composer) obj8;
                                                    int intValue32 = ((Integer) obj9).intValue();
                                                    ((RowScope) obj7).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer42;
                                                    if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowlistSkipDialogModel3.cancelButtonText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj8;
                                                    int intValue4 = ((Integer) obj9).intValue();
                                                    ((RowScope) obj7).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer5;
                                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowlistSkipDialogModel3.confirmButtonText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), gapComposer3, ((intValue3 << 12) & 57344) | 3072, 6);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, composer2), Expect_jvmKt.rememberComposableLambda(-1179847548, new Function3() { // from class: com.squareup.cash.p2pblocking.views.AllowlistSkipDialogKt$$ExternalSyntheticLambda3
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        int i3 = i2;
                        final AllowlistSkipDialogModel allowlistSkipDialogModel2 = allowlistSkipDialogModel;
                        Object[] objArr3 = 0;
                        char c = 1;
                        switch (i3) {
                            case 0:
                                ModalButtonScope modalButtonScope = (ModalButtonScope) obj4;
                                Composer composer3 = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                modalButtonScope.getClass();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((GapComposer) composer3).changed(modalButtonScope) ? 4 : 2;
                                }
                                GapComposer gapComposer2 = (GapComposer) composer3;
                                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    final int c2 = c == true ? 1 : 0;
                                    modalButtonScope.PrimaryModalButton(function0, null, false, Expect_jvmKt.rememberComposableLambda(-123748594, new Function3() { // from class: com.squareup.cash.p2pblocking.views.AllowlistSkipDialogKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                            int i4 = c2;
                                            AllowlistSkipDialogModel allowlistSkipDialogModel3 = allowlistSkipDialogModel2;
                                            switch (i4) {
                                                case 0:
                                                    Composer composer42 = (Composer) obj8;
                                                    int intValue32 = ((Integer) obj9).intValue();
                                                    ((RowScope) obj7).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer42;
                                                    if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowlistSkipDialogModel3.cancelButtonText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj8;
                                                    int intValue4 = ((Integer) obj9).intValue();
                                                    ((RowScope) obj7).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer5;
                                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowlistSkipDialogModel3.confirmButtonText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer2), gapComposer2, (57344 & (intValue2 << 12)) | 3072, 6);
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                }
                                break;
                            default:
                                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj4;
                                Composer composer4 = (Composer) obj5;
                                int intValue3 = ((Integer) obj6).intValue();
                                modalButtonScope2.getClass();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((GapComposer) composer4).changed(modalButtonScope2) ? 4 : 2;
                                }
                                GapComposer gapComposer3 = (GapComposer) composer4;
                                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    final int objArr4 = objArr3 == true ? 1 : 0;
                                    modalButtonScope2.SecondaryModalButton(function0, null, false, Expect_jvmKt.rememberComposableLambda(316336641, new Function3() { // from class: com.squareup.cash.p2pblocking.views.AllowlistSkipDialogKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                            int i4 = objArr4;
                                            AllowlistSkipDialogModel allowlistSkipDialogModel3 = allowlistSkipDialogModel2;
                                            switch (i4) {
                                                case 0:
                                                    Composer composer42 = (Composer) obj8;
                                                    int intValue32 = ((Integer) obj9).intValue();
                                                    ((RowScope) obj7).getClass();
                                                    GapComposer gapComposer32 = (GapComposer) composer42;
                                                    if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowlistSkipDialogModel3.cancelButtonText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer32.skipToGroupEnd();
                                                    }
                                                    break;
                                                default:
                                                    Composer composer5 = (Composer) obj8;
                                                    int intValue4 = ((Integer) obj9).intValue();
                                                    ((RowScope) obj7).getClass();
                                                    GapComposer gapComposer4 = (GapComposer) composer5;
                                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, allowlistSkipDialogModel3.confirmButtonText, (Map) null, (Function1) null, false);
                                                    } else {
                                                        gapComposer4.skipToGroupEnd();
                                                    }
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer3), gapComposer3, ((intValue3 << 12) & 57344) | 3072, 6);
                                } else {
                                    gapComposer3.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, composer2), (Function3) null, composer2, 27648, 33);
                break;
        }
        return Unit.INSTANCE;
    }
}
