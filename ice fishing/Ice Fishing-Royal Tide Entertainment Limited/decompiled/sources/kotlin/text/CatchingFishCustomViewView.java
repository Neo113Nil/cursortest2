package kotlin.text;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class CatchingFishCustomViewView {
    public abstract void CatchingFishParcelableFAB(StaticLayout.Builder builder, TextView textView);

    public boolean CatchingFishSnackbar(TextView textView) {
        Object obj = Boolean.FALSE;
        try {
            obj = CatchingFishHandlerIntent.CatchingFishReduxKtor("getHorizontallyScrolling").invoke(textView, null);
        } catch (Exception unused) {
        }
        return ((Boolean) obj).booleanValue();
    }
}
