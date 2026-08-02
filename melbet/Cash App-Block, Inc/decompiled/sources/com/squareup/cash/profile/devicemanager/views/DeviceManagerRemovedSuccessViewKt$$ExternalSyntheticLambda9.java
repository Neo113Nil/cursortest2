package com.squareup.cash.profile.devicemanager.views;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.components.InlineMessageButtonScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.profile.devicemanager.viewmodels.DeviceManagerRemovedSuccessViewModel;
import com.squareup.cash.profile.views.ErrorViewKt$$ExternalSyntheticLambda4;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;

/* loaded from: classes7.dex */
public final /* synthetic */ class DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda9 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ DeviceManagerRemovedSuccessViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda9(DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel, Function1 function1) {
        this.$r8$classId = 0;
        this.f$0 = deviceManagerRemovedSuccessViewModel;
        this.f$1 = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        final DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel = this.f$0;
        Function1 function1 = this.f$1;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object[] objArr = 0;
        char c = 1;
        switch (i) {
            case 0:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Modifier padding = SpacerKt.padding(companion, paddingValues);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    DeviceManagerListViewKt.DeviceManagerRemovedSuccessHalfSheetContent(this.f$0, this.f$1, ImageKt.m177backgroundbw27NRU(padding, colors.semantic.background.f1047app, ColorKt.RectangleShape), gapComposer, 0, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                InlineMessageButtonScope inlineMessageButtonScope = (InlineMessageButtonScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                inlineMessageButtonScope.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(inlineMessageButtonScope) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed = gapComposer2.changed(function1);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ErrorViewKt$$ExternalSyntheticLambda4(11, function1);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    final Object[] objArr2 = objArr == true ? 1 : 0;
                    inlineMessageButtonScope.PrimaryButton((57344 & (intValue2 << 12)) | 3120, 4, gapComposer2, Expect_jvmKt.rememberComposableLambda(1341909139, new Function3() { // from class: com.squareup.cash.profile.devicemanager.views.DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i2 = objArr2;
                            DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel2 = deviceManagerRemovedSuccessViewModel;
                            switch (i2) {
                                case 0:
                                    Composer composer3 = (Composer) obj5;
                                    int intValue3 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, deviceManagerRemovedSuccessViewModel2.securityOption.actionName, (Map) null, (Function1) null, false);
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
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, deviceManagerRemovedSuccessViewModel2.securityOption.actionName, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer2), fillMaxWidth, (Function0) rememberedValue, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            default:
                InlineMessageButtonScope inlineMessageButtonScope2 = (InlineMessageButtonScope) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                inlineMessageButtonScope2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(inlineMessageButtonScope2) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed2 = gapComposer3.changed(function1);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ErrorViewKt$$ExternalSyntheticLambda4(13, function1);
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    }
                    final char c2 = c == true ? 1 : 0;
                    inlineMessageButtonScope2.PrimaryButton(((intValue3 << 12) & 57344) | 3120, 4, gapComposer3, Expect_jvmKt.rememberComposableLambda(-1663697016, new Function3() { // from class: com.squareup.cash.profile.devicemanager.views.DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj4, Object obj5, Object obj6) {
                            int i2 = c2;
                            DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel2 = deviceManagerRemovedSuccessViewModel;
                            switch (i2) {
                                case 0:
                                    Composer composer32 = (Composer) obj5;
                                    int intValue32 = ((Integer) obj6).intValue();
                                    ((RowScope) obj4).getClass();
                                    GapComposer gapComposer32 = (GapComposer) composer32;
                                    if (gapComposer32.shouldExecute(intValue32 & 1, (intValue32 & 17) != 16)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer32, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, deviceManagerRemovedSuccessViewModel2.securityOption.actionName, (Map) null, (Function1) null, false);
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
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, deviceManagerRemovedSuccessViewModel2.securityOption.actionName, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer3), fillMaxWidth2, (Function0) rememberedValue2, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DeviceManagerRemovedSuccessViewKt$$ExternalSyntheticLambda9(Function1 function1, DeviceManagerRemovedSuccessViewModel deviceManagerRemovedSuccessViewModel, int i) {
        this.$r8$classId = i;
        this.f$1 = function1;
        this.f$0 = deviceManagerRemovedSuccessViewModel;
    }
}
