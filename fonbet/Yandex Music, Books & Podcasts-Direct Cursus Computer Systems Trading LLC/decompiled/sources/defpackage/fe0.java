package defpackage;

import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidComposeView;
import com.yandex.plus.home.feature.webviews.internal.stories.i;
import com.yandex.plus.home.plaque.plugin.internal.defaults.a;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.j;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.upsale.c;

/* loaded from: classes.dex */
public final /* synthetic */ class fe0 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fe0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [ezc, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r0v6, types: [ezc, kotlin.jvm.functions.Function0] */
    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Class cls = AndroidComposeView.j1;
                ((AndroidComposeView) obj).M();
                break;
            case 1:
                a aVar = (a) obj;
                aVar.c.D(new i(0, aVar, a.class, "checkVisibility", "checkVisibility()V", 0, 20));
                break;
            case 2:
                j jVar = (j) obj;
                if (com.yandex.plus.bdui.flex.ui.a.q(jVar.c()) >= 1.0f) {
                    jVar.b.invoke();
                    break;
                }
                break;
            default:
                c cVar = (c) obj;
                if (com.yandex.plus.bdui.flex.ui.a.q((TextView) cVar.m.g(c.w[9])) >= 1.0f) {
                    cVar.e.invoke();
                    break;
                }
                break;
        }
    }
}
