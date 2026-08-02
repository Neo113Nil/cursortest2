package com.squareup.cash.investing.components.search;

import androidx.biometric.KeyguardUtils;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.squareup.cash.investing.viewmodels.search.DisclosureModel;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import net.idrnd.face.iad.capture.internal.b0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes9.dex */
public final /* synthetic */ class InvestingSearchDisclosureKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ DisclosureModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ InvestingSearchDisclosureKt$$ExternalSyntheticLambda0(DisclosureModel disclosureModel, Function1 function1) {
        this.f$0 = disclosureModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        DisclosureModel disclosureModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(Modifier.Companion.$$INSTANCE, 16.0f, 40.0f);
                    String str = disclosureModel.text;
                    TextStyle textStyle = MooncakeTheme.getTypography(gapComposer).caption;
                    long j = MooncakeTheme.getColors(gapComposer).secondaryLabel;
                    SpanStyle spanStyle = new SpanStyle(MooncakeTheme.getColors(gapComposer).secondaryLabel, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61438);
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(16, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    KeyguardUtils.m14MarkdownTextnvClB8o(str, (Function2) rememberedValue, m299paddingVpY3zN4, textStyle, j, spanStyle, null, 0, 3, null, 0, gapComposer, MLKEMEngine.KyberPolyBytes, 1728);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b0.InvestingSearchDisclosure(disclosureModel, function1, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ InvestingSearchDisclosureKt$$ExternalSyntheticLambda0(DisclosureModel disclosureModel, Function1 function1, int i) {
        this.f$0 = disclosureModel;
        this.f$1 = function1;
    }
}
