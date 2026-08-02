package defpackage;

import android.view.View;
import com.yandex.payment.sdk.ui.view.HeaderView;
import com.yandex.payment.sdk.ui.view.ProgressResultView;
import com.yandex.plus.home.feature.webviews.internal.toolbar.WebViewToolbar;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class hy7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function0 b;

    public /* synthetic */ hy7(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Function0 function0 = this.b;
        switch (i) {
            case 0:
                function0.invoke();
                break;
            case 1:
                int i2 = HeaderView.r;
                function0.getClass();
                function0.invoke();
                break;
            case 2:
                int i3 = HeaderView.r;
                function0.getClass();
                function0.invoke();
                break;
            case 3:
                int i4 = HeaderView.r;
                function0.invoke();
                break;
            case 4:
                function0.invoke();
                break;
            case 5:
                int i5 = ProgressResultView.b;
                function0.getClass();
                function0.invoke();
                break;
            case 6:
                int i6 = ProgressResultView.b;
                function0.getClass();
                function0.invoke();
                break;
            case 7:
                s9f[] s9fVarArr = WebViewToolbar.A;
                function0.invoke();
                break;
            default:
                s9f[] s9fVarArr2 = WebViewToolbar.A;
                function0.invoke();
                break;
        }
    }
}
