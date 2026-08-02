package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.view.WindowInsets;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.passport.internal.ui.domik.DomikActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class ciu implements View.OnApplyWindowInsetsListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ ciu(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.a) {
            case 0:
                ComposeView composeView = (ComposeView) this.b;
                view.getClass();
                windowInsets.getClass();
                wdu.c(composeView, kqv.h(null, windowInsets));
                return windowInsets;
            default:
                DomikActivity domikActivity = (DomikActivity) this.b;
                for (int i = 0; i < domikActivity.l.getChildCount(); i++) {
                    domikActivity.l.getChildAt(i).dispatchApplyWindowInsets(windowInsets);
                }
                return windowInsets.consumeSystemWindowInsets();
        }
    }
}
