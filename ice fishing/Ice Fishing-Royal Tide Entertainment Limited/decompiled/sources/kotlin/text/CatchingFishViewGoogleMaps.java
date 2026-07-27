package kotlin.text;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class CatchingFishViewGoogleMaps extends CatchingFishServiceCameraX {
    @Override // kotlin.text.CatchingFishServiceCameraX, kotlin.text.CatchingFishCustomViewView
    public void CatchingFishParcelableFAB(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }

    @Override // kotlin.text.CatchingFishCustomViewView
    public boolean CatchingFishSnackbar(TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }
}
