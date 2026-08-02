package com.squareup.cash.account.components;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.Room;
import androidx.room.TransactorKt;
import bo.app.y0$$ExternalSyntheticLambda0;
import coil3.size.SizeKt;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda38;
import com.squareup.cash.payments.views.composer.ErrorKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes5.dex */
public final /* synthetic */ class AccountToolbarKt$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function0 f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ AccountToolbarKt$$ExternalSyntheticLambda2(boolean z, Function0 function0, Function0 function02) {
        this.$r8$classId = 0;
        this.f$0 = z;
        this.f$1 = function0;
        this.f$2 = function02;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GapComposer gapComposer;
        int i = this.$r8$classId;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(titleBarActionScope) ? 4 : 2;
                }
                int i2 = intValue;
                GapComposer gapComposer2 = (GapComposer) composer;
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
                    Object obj4 = Composer.Companion.Empty;
                    if (z) {
                        gapComposer = gapComposer2;
                        gapComposer.startReplaceGroup(-2328203);
                        gapComposer.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-2507197);
                        Icons icons = Icons.NavigationScanQr;
                        String stringResource = Room.stringResource(gapComposer2, R.string.account_header_qr_code_description);
                        Function0 function0 = this.f$1;
                        boolean changed = gapComposer2.changed(function0);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (changed || rememberedValue == obj4) {
                            rememberedValue = new y0$$ExternalSyntheticLambda0(12, function0);
                            gapComposer2.updateRememberedValue(rememberedValue);
                        }
                        gapComposer = gapComposer2;
                        TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue, null, null, null, null, null, null, false, gapComposer, (i2 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                        gapComposer.end(false);
                    }
                    Icons icons2 = Icons.NavigationShareAndroid;
                    String stringResource2 = Room.stringResource(gapComposer, R.string.account_header_share_description);
                    Function0 function02 = this.f$2;
                    boolean changed2 = gapComposer.changed(function02);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == obj4) {
                        rememberedValue2 = new y0$$ExternalSyntheticLambda0(13, function02);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons2, stringResource2, (Function0) rememberedValue2, null, null, null, null, null, null, false, gapComposer, (i2 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 17) != 16)) {
                    boolean z2 = !z;
                    SizeKt.ButtonCta(this.f$1, null, null, false, z2, null, Expect_jvmKt.rememberComposableLambda(-2003761929, new MoneyTabUIKt$$ExternalSyntheticLambda38(z, 7), gapComposer3), gapComposer3, 1572864, 46);
                    SizeKt.ButtonCta(this.f$2, null, ButtonProminence.PROMINENT, false, z2, null, ErrorKt.f554lambda$1022484128, gapComposer3, 1573248, 42);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    boolean z3 = !z;
                    SizeKt.ButtonCta(this.f$1, null, null, false, z3, null, ErrorKt.lambda$526829788, gapComposer4, 1572864, 46);
                    SizeKt.ButtonCta(this.f$2, null, ButtonProminence.PROMINENT, false, z3, null, Expect_jvmKt.rememberComposableLambda(-791139053, new MoneyTabUIKt$$ExternalSyntheticLambda38(z, 6), gapComposer4), gapComposer4, 1573248, 42);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AccountToolbarKt$$ExternalSyntheticLambda2(int i, Function0 function0, Function0 function02, boolean z) {
        this.$r8$classId = i;
        this.f$1 = function0;
        this.f$0 = z;
        this.f$2 = function02;
    }
}
