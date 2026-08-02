package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class ComposeViewContext$ProvideCompositionLocals$2 extends Lambda implements Function2 {
    public final /* synthetic */ Function2 $content;
    public final /* synthetic */ AndroidComposeView $owner;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ ComposeViewContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewContext$ProvideCompositionLocals$2(AndroidComposeView androidComposeView, ComposeViewContext composeViewContext, Function2 function2) {
        super(2);
        this.$owner = androidComposeView;
        this.this$0 = composeViewContext;
        this.$content = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Function2 function2 = this.$content;
        AndroidComposeView androidComposeView = this.$owner;
        ComposeViewContext composeViewContext = this.this$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    gapComposer.startReplaceGroup(866651995);
                    CompositionLocalsKt.ProvideCommonCompositionLocals(androidComposeView, composeViewContext.uriHandler, function2, gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            default:
                ((Number) obj2).intValue();
                composeViewContext.ProvideCompositionLocals$ui(androidComposeView, function2, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeViewContext$ProvideCompositionLocals$2(ComposeViewContext composeViewContext, AndroidComposeView androidComposeView, Function2 function2, int i) {
        super(2);
        this.this$0 = composeViewContext;
        this.$owner = androidComposeView;
        this.$content = function2;
    }
}
