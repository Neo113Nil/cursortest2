package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class ip2 implements zyc {
    public final /* synthetic */ le3 a;

    public ip2(le3 le3Var) {
        this.a = le3Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ip2) {
            return Intrinsics.d(getFunctionDelegate(), ((zyc) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // defpackage.zyc
    public final syc getFunctionDelegate() {
        return new ezc(2, 0, le3.class, this.a, "switchTabDot", "switchTabDot(Lcom/yandex/music/design/components/bottomtabs/BottomTab;Z)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
