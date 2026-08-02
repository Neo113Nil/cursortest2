package defpackage;

import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class uwg extends jsk {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ uwg(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.jsk
    public final xof b() {
        switch (this.b) {
            case 0:
                return ((twg) this.c).getLayoutDirection();
            default:
                return ((AndroidComposeView) this.c).getLayoutDirection();
        }
    }

    @Override // defpackage.jsk
    public final int c() {
        switch (this.b) {
            case 0:
                return ((twg) this.c).a0();
            default:
                return ((AndroidComposeView) this.c).getRoot().G.p.a;
        }
    }
}
