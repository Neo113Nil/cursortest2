package com.squareup.cash.family.requestsponsorship.views;

import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.family.requestsponsorship.viewmodels.ContactPermissionDialogViewModel;
import com.squareup.cash.family.safetyhub.views.SafetyHubViewKt$$ExternalSyntheticLambda9;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class ContactPermissionDialogKt$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ContactPermissionDialogViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ContactPermissionDialogKt$$ExternalSyntheticLambda0(ContactPermissionDialogViewModel contactPermissionDialogViewModel, Function1 function1) {
        this.$r8$classId = 0;
        this.f$0 = contactPermissionDialogViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 2;
        final ContactPermissionDialogViewModel contactPermissionDialogViewModel = this.f$0;
        Function1 function1 = this.f$1;
        char c = 1;
        char c2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((BoxScope) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    ModalKt.Modal((Modifier) null, contactPermissionDialogViewModel.title, contactPermissionDialogViewModel.message, Expect_jvmKt.rememberComposableLambda(-19947134, new ContactPermissionDialogKt$$ExternalSyntheticLambda0(c == true ? 1 : 0, contactPermissionDialogViewModel, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1452331459, new ContactPermissionDialogKt$$ExternalSyntheticLambda0(i2, contactPermissionDialogViewModel, function1), gapComposer), (Function3) null, gapComposer, 27648, 33);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                ModalButtonScope modalButtonScope = (ModalButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modalButtonScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modalButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new SafetyHubViewKt$$ExternalSyntheticLambda9(9, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    final int i3 = r8 ? 1 : 0;
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(776389197, new Function3() { // from class: com.squareup.cash.family.requestsponsorship.views.ContactPermissionDialogKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i4 = i3;
                            ContactPermissionDialogViewModel contactPermissionDialogViewModel2 = contactPermissionDialogViewModel;
                            switch (i4) {
                                case 0:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, contactPermissionDialogViewModel2.primaryButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue4 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, contactPermissionDialogViewModel2.secondaryButtonText, (Map) null, (Function1) null, false);
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
                ModalButtonScope modalButtonScope2 = (ModalButtonScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                modalButtonScope2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(modalButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    boolean changed2 = gapComposer3.changed(function1);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new SafetyHubViewKt$$ExternalSyntheticLambda9(10, function1);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    final char c3 = c2 == true ? 1 : 0;
                    modalButtonScope2.SecondaryModalButton((Function0) rememberedValue2, null, false, Expect_jvmKt.rememberComposableLambda(-1805229504, new Function3() { // from class: com.squareup.cash.family.requestsponsorship.views.ContactPermissionDialogKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i4 = c3;
                            ContactPermissionDialogViewModel contactPermissionDialogViewModel2 = contactPermissionDialogViewModel;
                            switch (i4) {
                                case 0:
                                    Composer composer32 = (Composer) obj5;
                                    int intValue32 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                    if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, contactPermissionDialogViewModel2.primaryButtonText, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer32.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    Composer composer4 = (Composer) obj5;
                                    int intValue4 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer4 = (GapComposer) composer4;
                                    if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, contactPermissionDialogViewModel2.secondaryButtonText, (Map) null, (Function1) null, false);
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

    public /* synthetic */ ContactPermissionDialogKt$$ExternalSyntheticLambda0(int i, ContactPermissionDialogViewModel contactPermissionDialogViewModel, Function1 function1) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = contactPermissionDialogViewModel;
    }
}
