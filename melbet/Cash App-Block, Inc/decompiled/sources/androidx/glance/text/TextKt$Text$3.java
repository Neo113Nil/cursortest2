package androidx.glance.text;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.glance.GlanceModifier;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class TextKt$Text$3 extends Lambda implements Function2 {
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $maxLines;
    public final /* synthetic */ Object $modifier;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object $style;
    public final /* synthetic */ Object $text;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextKt$Text$3(String str, GlanceModifier glanceModifier, TextStyle textStyle, int i, int i2, int i3) {
        super(2);
        this.$text = str;
        this.$modifier = glanceModifier;
        this.$style = textStyle;
        this.$maxLines = i;
        this.$$default = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Composer composer = (Composer) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                TextKt.Text((String) this.$text, (GlanceModifier) this.$modifier, (TextStyle) this.$style, this.$maxLines, composer, 1, this.$$default);
                break;
            default:
                AndroidView_androidKt.AndroidView((Function1) this.$text, (Modifier) this.$modifier, (Function1) this.$style, composer, Updater.updateChangedFlags(this.$maxLines | 1), this.$$default);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextKt$Text$3(Function1 function1, Modifier modifier, Function1 function12, int i, int i2) {
        super(2);
        this.$text = function1;
        this.$modifier = modifier;
        this.$style = function12;
        this.$maxLines = i;
        this.$$default = i2;
    }
}
