package kotlin.text;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;

/* loaded from: classes.dex */
public class CatchingFishServiceCameraX extends CatchingFishCustomViewView {
    @Override // kotlin.text.CatchingFishCustomViewView
    public void CatchingFishParcelableFAB(StaticLayout.Builder builder, TextView textView) {
        Object obj = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        try {
            obj = CatchingFishHandlerIntent.CatchingFishReduxKtor("getTextDirectionHeuristic").invoke(textView, null);
        } catch (Exception unused) {
        }
        builder.setTextDirection((TextDirectionHeuristic) obj);
    }
}
