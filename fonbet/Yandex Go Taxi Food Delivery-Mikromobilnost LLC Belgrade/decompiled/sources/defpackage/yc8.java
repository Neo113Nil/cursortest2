package defpackage;

import com.ybsdk.feature.card.internal.interactors.c;
import com.ybsdk.feature.card.internal.interactors.h;
import com.ybsdk.feature.card.internal.interactors.k;
import com.ybsdk.feature.card.internal.interactors.l;
import com.ybsdk.feature.card.internal.repositories.b;

/* loaded from: classes3.dex */
public final class yc8 implements v7p {
    public final /* synthetic */ int a;
    public final kj7 b;

    public /* synthetic */ yc8(kj7 kj7Var, int i) {
        this.a = i;
        this.b = kj7Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        kj7 kj7Var = this.b;
        switch (i) {
            case 0:
                return new c((b) kj7Var.get());
            case 1:
                return new aj8((b) kj7Var.get());
            case 2:
                return new h((b) kj7Var.get());
            case 3:
                return new k((b) kj7Var.get());
            default:
                return new l((b) kj7Var.get());
        }
    }
}
