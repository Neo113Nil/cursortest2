package com.squareup.cash.investing.components;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.initialscreenloader.views.AppUpgradeViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.investing.viewmodels.TransferStockViewModel;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeMigrationUtilsKt$investingCryptoExchangeView$1$$ExternalSyntheticLambda3 implements Function3 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ TransferStockViewModel.Content.FullScreenContent.DialogContent f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ ArcadeMigrationUtilsKt$investingCryptoExchangeView$1$$ExternalSyntheticLambda3(TransferStockViewModel.Content.FullScreenContent.DialogContent dialogContent, Function1 function1) {
        this.f$0 = dialogContent;
        this.f$1 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ComposableLambdaImpl composableLambdaImpl;
        int i = this.$r8$classId;
        final TransferStockViewModel.Content.FullScreenContent.DialogContent dialogContent = this.f$0;
        Function1 function1 = this.f$1;
        Object[] objArr = 0;
        final int i2 = 1;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((TransferStockViewModel.Content.FullScreenContent.DialogContent) obj).getClass();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-727414551, new Function3() { // from class: com.squareup.cash.investing.components.ArcadeMigrationUtilsKt$investingCryptoExchangeView$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i3;
                            int i4;
                            int i5 = objArr2;
                            TransferStockViewModel.Content.FullScreenContent.DialogContent dialogContent2 = dialogContent;
                            switch (i5) {
                                case 0:
                                    Composer composer2 = (Composer) obj5;
                                    int intValue2 = ((Integer) obj6).intValue();
                                    ((ColumnScope) obj4).getClass();
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogContent2.content, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        int ordinal = dialogContent2.f1163type.ordinal();
                                        if (ordinal == 0) {
                                            i3 = -108656031;
                                            i4 = R.string.investing_components_agree;
                                        } else {
                                            if (ordinal != 1) {
                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -108659200, false);
                                            }
                                            i3 = -108653026;
                                            i4 = R.string.investing_components_ok;
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, re$$ExternalSyntheticOutline0.m(gapComposer3, i3, i4, gapComposer3, false), (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer);
                    ComposableLambdaImpl composableLambdaImpl2 = ArcadeBordersKt.f443lambda$1199411960;
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(114954676, new ArcadeMigrationUtilsKt$investingCryptoExchangeView$1$$ExternalSyntheticLambda3(function1, dialogContent), gapComposer);
                    if (dialogContent.f1163type == TransferStockViewModel.Content.FullScreenContent.DialogContent.Type.AGREE_OR_CANCEL) {
                        gapComposer.startReplaceGroup(508650724);
                        composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(-850347432, new MusicViewKt$$ExternalSyntheticLambda7(6, function1), gapComposer);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(508909884);
                        gapComposer.end(false);
                        composableLambdaImpl = null;
                    }
                    ModalKt.Modal((Modifier) null, rememberComposableLambda, composableLambdaImpl2, rememberComposableLambda2, composableLambdaImpl, (Function3) null, gapComposer, 3504, 33);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
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
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new AppUpgradeViewKt$$ExternalSyntheticLambda7(22, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    modalButtonScope.PrimaryModalButton((Function0) rememberedValue, null, false, Expect_jvmKt.rememberComposableLambda(-1832513271, new Function3() { // from class: com.squareup.cash.investing.components.ArcadeMigrationUtilsKt$investingCryptoExchangeView$1$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i3;
                            int i4;
                            int i5 = i2;
                            TransferStockViewModel.Content.FullScreenContent.DialogContent dialogContent2 = dialogContent;
                            switch (i5) {
                                case 0:
                                    Composer composer22 = (Composer) obj5;
                                    int intValue22 = ((Integer) obj6).intValue();
                                    ((ColumnScope) obj4).getClass();
                                    GapComposer gapComposer22 = (GapComposer) composer22;
                                    if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, dialogContent2.content, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer22.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        int ordinal = dialogContent2.f1163type.ordinal();
                                        if (ordinal == 0) {
                                            i3 = -108656031;
                                            i4 = R.string.investing_components_agree;
                                        } else {
                                            if (ordinal != 1) {
                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer3, -108659200, false);
                                            }
                                            i3 = -108653026;
                                            i4 = R.string.investing_components_ok;
                                        }
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, re$$ExternalSyntheticOutline0.m(gapComposer3, i3, i4, gapComposer3, false), (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer2), gapComposer2, ((intValue2 << 12) & 57344) | 3072, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ArcadeMigrationUtilsKt$investingCryptoExchangeView$1$$ExternalSyntheticLambda3(Function1 function1, TransferStockViewModel.Content.FullScreenContent.DialogContent dialogContent) {
        this.f$1 = function1;
        this.f$0 = dialogContent;
    }
}
