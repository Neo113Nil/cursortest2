package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.ComposeView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class d7r implements zyc {
    public final /* synthetic */ e7r a;

    public d7r(e7r e7rVar) {
        this.a = e7rVar;
    }

    public final void a(vtm vtmVar) {
        aqd aqdVar = (aqd) vtmVar.a;
        e7r e7rVar = this.a;
        if (e7rVar.a().L()) {
            aqdVar.s();
            return;
        }
        e7rVar.a().N();
        ViewParent parent = aqdVar.m().getParent();
        parent.getClass();
        ViewGroup viewGroup = (ViewGroup) parent;
        ComposeView composeView = new ComposeView(e7rVar.a, null, 0, 6, null);
        composeView.setViewCompositionStrategy(gos.m);
        composeView.setContent(new wn5(new f5r(1, e7rVar), -160235239, true));
        viewGroup.addView(composeView);
        tf6 e = gld.e(dm6.b());
        ox6.B(e7rVar.a().H(), e, new s3(viewGroup, composeView, vtmVar, e7rVar, e, 6));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d7r) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(1, 0, e7r.class, this.a, "handleExitAnimation", "handleExitAnimation(Landroidx/core/splashscreen/SplashScreenViewProvider;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
