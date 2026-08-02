package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;

/* loaded from: classes4.dex */
public abstract class s17 {
    public final /* synthetic */ int a;
    public final int b;
    public final int c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s17(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 1, (byte) 0);
        this.a = 1;
    }

    public abstract void a(n8n n8nVar, nw0 nw0Var, oxq oxqVar, m mVar);

    public String toString() {
        switch (this.a) {
            case 1:
                String h = ern.a(getClass()).h();
                return h == null ? "" : h;
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s17(int i, int i2, int i3, byte b) {
        this.a = i3;
        this.b = i;
        this.c = i2;
    }
}
