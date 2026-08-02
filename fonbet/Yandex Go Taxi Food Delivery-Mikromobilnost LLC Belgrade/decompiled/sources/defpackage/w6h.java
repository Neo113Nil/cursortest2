package defpackage;

import com.yandex.go.navigation.screen.api.Screen;

/* loaded from: classes10.dex */
public final class w6h implements j9s0 {
    public final boolean a;
    public final boolean b;

    public w6h(int i) {
        boolean z = (i & 1) != 0;
        boolean z2 = (i & 2) != 0;
        this.a = z;
        this.b = z2;
    }

    @Override // defpackage.j9s0
    public final boolean a(Screen screen) {
        return this.a;
    }

    @Override // defpackage.j9s0
    public final x060 b() {
        return null;
    }

    @Override // defpackage.j9s0
    public final boolean c(Screen screen) {
        return this.b;
    }

    public w6h() {
        this(7);
    }
}
