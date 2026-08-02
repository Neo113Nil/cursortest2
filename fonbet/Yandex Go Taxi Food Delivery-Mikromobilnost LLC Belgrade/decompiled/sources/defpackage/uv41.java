package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.plus.home.feature.webviews.internal.container.a;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes2.dex */
public final class uv41 implements y23 {
    public final /* synthetic */ a a;

    public uv41(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.y23
    public final void b(u1w u1wVar) {
        a aVar = this.a;
        r0 r0Var = aVar.L;
        r0Var.getClass();
        r0Var.m(null, u1wVar);
        View view = aVar.N;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = u1wVar.d;
        view.setLayoutParams(marginLayoutParams);
    }
}
