package defpackage;

import android.text.Layout;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import ru.yandex.music.post.ui.grid.PostGridItemsActivity;

/* loaded from: classes6.dex */
public final class dim implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PostGridItemsActivity b;

    public /* synthetic */ dim(PostGridItemsActivity postGridItemsActivity, int i) {
        this.a = i;
        this.b = postGridItemsActivity;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a;
        PostGridItemsActivity postGridItemsActivity = this.b;
        switch (i) {
            case 0:
                postGridItemsActivity.A0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                Layout layout = postGridItemsActivity.A0.getLayout();
                if (layout != null && layout.getEllipsisCount(layout.getLineCount() - 1) == 0) {
                    postGridItemsActivity.Z.f(false, false, true);
                    break;
                }
                break;
            default:
                postGridItemsActivity.C0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                int maxLines = postGridItemsActivity.C0.getMaxLines();
                Layout layout2 = postGridItemsActivity.C0.getLayout();
                if (layout2 != null) {
                    int lineCount = layout2.getLineCount();
                    int ellipsisCount = layout2.getEllipsisCount(lineCount - 1);
                    boolean z = ellipsisCount == 0;
                    TextView textView = postGridItemsActivity.D0;
                    jyr jyrVar = sht.a;
                    if (textView != null) {
                        textView.setVisibility(z ? 8 : 0);
                    }
                    if (ellipsisCount > 0) {
                        int i2 = maxLines - 1;
                        if (lineCount > i2) {
                            postGridItemsActivity.C0.setMaxLines(i2);
                        }
                        lg3.d0("MultiItemsWindow_LongDescription");
                        break;
                    }
                }
                break;
        }
    }
}
