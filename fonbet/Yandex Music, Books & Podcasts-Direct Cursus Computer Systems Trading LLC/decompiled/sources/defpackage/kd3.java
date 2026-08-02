package defpackage;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* loaded from: classes3.dex */
public final class kd3 extends fjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ BottomAppBar b;

    public kd3(BottomAppBar bottomAppBar, int i) {
        this.b = bottomAppBar;
        this.a = i;
    }

    @Override // defpackage.fjc
    public final void a(FloatingActionButton floatingActionButton) {
        int i = BottomAppBar.a1;
        floatingActionButton.setTranslationX(this.b.E(this.a));
        floatingActionButton.l(new jd3(), true);
    }
}
