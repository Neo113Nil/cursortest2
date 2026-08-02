package androidx.compose.material3;

import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.instruments.viewmodels.InstrumentIcon;
import com.squareup.cash.instruments.views.CardArtImageKt;
import com.squareup.cash.instruments.views.CardInfoLabelPosition;
import com.squareup.cash.moneybot.views.markdown.MoneybotMarkdownKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.ClosedFloatRange;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ float f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ boolean f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda0(float f, Function1 function1, Modifier modifier, boolean z, ClosedFloatRange closedFloatRange, int i, SliderColors sliderColors, MutableInteractionSourceImpl mutableInteractionSourceImpl, int i2) {
        this.f$0 = f;
        this.f$1 = function1;
        this.f$2 = modifier;
        this.f$3 = z;
        this.f$4 = closedFloatRange;
        this.f$5 = i;
        this.f$7 = sliderColors;
        this.f$8 = mutableInteractionSourceImpl;
        this.f$9 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$9;
        Object obj3 = this.f$8;
        Object obj4 = this.f$7;
        Object obj5 = this.f$4;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                SliderKt.Slider(this.f$0, (Function1) obj7, (Modifier) obj6, this.f$3, (ClosedFloatRange) obj5, this.f$5, (SliderColors) obj4, (MutableInteractionSourceImpl) obj3, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$5 | 1);
                CardArtImageKt.m3576CardArtImageAFY4PWA((Modifier) obj6, (InstrumentIcon) obj7, this.f$0, (String) obj5, (String) obj4, (CardInfoLabelPosition) obj3, this.f$3, (Composer) obj, updateChangedFlags2, this.f$9);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                MoneybotMarkdownKt.m3633MoneybotMarkdownTableRowUR9CgXA((String) obj7, (ASTNodeImpl) obj6, this.f$0, (TextStyle) obj5, (BiasAlignment.Vertical) obj4, this.f$5, (JWECryptoParts) obj3, this.f$3, (Composer) obj, updateChangedFlags3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda0(Modifier modifier, InstrumentIcon instrumentIcon, float f, String str, String str2, CardInfoLabelPosition cardInfoLabelPosition, boolean z, int i, int i2) {
        this.f$2 = modifier;
        this.f$1 = instrumentIcon;
        this.f$0 = f;
        this.f$4 = str;
        this.f$7 = str2;
        this.f$8 = cardInfoLabelPosition;
        this.f$3 = z;
        this.f$5 = i;
        this.f$9 = i2;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda0(String str, ASTNodeImpl aSTNodeImpl, float f, TextStyle textStyle, BiasAlignment.Vertical vertical, int i, JWECryptoParts jWECryptoParts, boolean z, int i2) {
        this.f$1 = str;
        this.f$2 = aSTNodeImpl;
        this.f$0 = f;
        this.f$4 = textStyle;
        this.f$7 = vertical;
        this.f$5 = i;
        this.f$8 = jWECryptoParts;
        this.f$3 = z;
        this.f$9 = i2;
    }
}
