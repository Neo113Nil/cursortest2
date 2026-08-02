package defpackage;

import com.yandex.go.walking.navigation.impl.navigation_core.guidance.b;

/* loaded from: classes9.dex */
public final class sof0 implements yw60 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ sof0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yw60
    public final void a(boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((pof0) obj).a.g(zy11.a);
                break;
            default:
                if (z) {
                    ((b) obj).b();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.s150
    public final String getName() {
        switch (this.a) {
            case 0:
                return "PromoOverMapUpdater";
            default:
                return "WalkNavOnAppLifecycleListener";
        }
    }
}
