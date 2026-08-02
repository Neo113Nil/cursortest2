package defpackage;

import android.content.Context;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes5.dex */
public final class ss4 implements wni {
    public final /* synthetic */ int a;
    public final Context b;
    public final hwy0 c;

    public /* synthetic */ ss4(Context context, hwy0 hwy0Var, int i) {
        this.a = i;
        this.b = context;
        this.c = hwy0Var;
    }

    @Override // defpackage.wni
    public final ComposeView m(uni uniVar, vni vniVar) {
        int i = 1;
        switch (this.a) {
            case 0:
                ComposeView composeView = new ComposeView(this.b, null, 0, 6, null);
                composeView.setContent(new a(-837583851, new qs4(this, (rs4) uniVar, (zs4) vniVar, 0), true));
                return composeView;
            default:
                ComposeView composeView2 = new ComposeView(this.b, null, 0, 6, null);
                composeView2.setContent(new a(-1696678344, new e3i(this, (f3i) uniVar, (ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui.a) vniVar, i), true));
                return composeView2;
        }
    }
}
