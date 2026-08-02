package defpackage;

import android.view.ViewTreeObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yandex.plus.home.feature.webviews.internal.stories.i;
import com.yandex.plus.home.plaque.plugin.internal.defaults.a;

/* loaded from: classes3.dex */
public final /* synthetic */ class ib implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ib(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ob obVar = (ob) obj;
                if (obVar.j && obVar.f.getVisibility() != 0) {
                    obVar.k();
                    break;
                }
                break;
            case 1:
                Class cls = AndroidComposeView.j1;
                ((AndroidComposeView) obj).M();
                break;
            default:
                a aVar = (a) obj;
                aVar.c.D(new i(0, aVar, a.class, "checkVisibility", "checkVisibility()V", 0, 19));
                break;
        }
    }
}
