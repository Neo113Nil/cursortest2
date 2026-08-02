package androidx.compose.ui.platform;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class ComposeView$Content$1 extends Lambda implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ AbstractComposeView $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeView$Content$1(AbstractComposeView abstractComposeView) {
        super(2);
        this.$tmp0_rcvr = abstractComposeView;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        AbstractComposeView abstractComposeView = this.$tmp0_rcvr;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                ((ComposeView) abstractComposeView).Content((Composer) obj, Updater.updateChangedFlags(1));
                break;
            default:
                Composer composer = (Composer) obj;
                int intValue = ((Number) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    abstractComposeView.Content(gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeView$Content$1(ComposeView composeView, int i) {
        super(2);
        this.$tmp0_rcvr = composeView;
    }
}
