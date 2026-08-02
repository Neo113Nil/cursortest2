package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextLayoutResult;
import com.squareup.cash.checks.CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class BasicTextKt$$ExternalSyntheticLambda6 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ TextLinkScope f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BasicTextKt$$ExternalSyntheticLambda6(TextLinkScope textLinkScope, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = textLinkScope;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        TextLinkScope textLinkScope = this.f$0;
        switch (i) {
            case 0:
                TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
                if (textLinkScope != null) {
                    textLinkScope.textLayoutResult$delegate.setValue(textLayoutResult);
                }
                if (function1 != null) {
                    function1.invoke(textLayoutResult);
                }
                return Unit.INSTANCE;
            default:
                textLinkScope.annotators.add(function1);
                return new CaptureCheckFaceKt$MiSnap$lambda$2$0$$inlined$onDispose$1(6, textLinkScope, function1);
        }
    }
}
