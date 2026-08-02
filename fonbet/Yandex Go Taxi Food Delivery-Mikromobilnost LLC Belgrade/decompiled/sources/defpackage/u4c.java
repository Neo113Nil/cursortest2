package defpackage;

import com.yandex.go.flex.common.api.actions.CloseFlexScreenAction;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;

/* loaded from: classes13.dex */
public final /* synthetic */ class u4c implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ nlr b;

    public /* synthetic */ u4c(nlr nlrVar, int i) {
        this.a = i;
        this.b = nlrVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        nlr nlrVar = this.b;
        switch (i) {
            case 0:
                int i2 = 1;
                return new mu("CloseFlexScreenAction", qoi0.a(CloseFlexScreenAction.class), new z2c(i2), a.b(LazyThreadSafetyMode.NONE, new u4c(nlrVar, i2)), EmptyList.a, false);
            default:
                return new v4c(0, nlrVar);
        }
    }
}
