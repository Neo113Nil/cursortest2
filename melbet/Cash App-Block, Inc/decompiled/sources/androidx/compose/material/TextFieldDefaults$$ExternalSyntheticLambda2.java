package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class TextFieldDefaults$$ExternalSyntheticLambda2 implements Function3 {
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ MutableInteractionSourceImpl f$2;
    public final /* synthetic */ DefaultTextFieldColors f$3;
    public final /* synthetic */ float f$4;
    public final /* synthetic */ float f$5;

    public /* synthetic */ TextFieldDefaults$$ExternalSyntheticLambda2(boolean z, boolean z2, MutableInteractionSourceImpl mutableInteractionSourceImpl, DefaultTextFieldColors defaultTextFieldColors, float f, float f2) {
        this.f$0 = z;
        this.f$1 = z2;
        this.f$2 = mutableInteractionSourceImpl;
        this.f$3 = defaultTextFieldColors;
        this.f$4 = f;
        this.f$5 = f2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ((Integer) obj3).getClass();
        GapComposer gapComposer = (GapComposer) ((Composer) obj2);
        gapComposer.startReplaceGroup(1398930845);
        BorderStroke borderStroke = (BorderStroke) CardKt.m474access$animateBorderStrokeAsStateNuRrP5Q(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, gapComposer, 0).getValue();
        Modifier drawWithContent = ClipKt.drawWithContent(Modifier.Companion.$$INSTANCE, new TextFieldKt$$ExternalSyntheticLambda0(borderStroke.width, borderStroke, 0));
        gapComposer.end(false);
        return drawWithContent;
    }
}
