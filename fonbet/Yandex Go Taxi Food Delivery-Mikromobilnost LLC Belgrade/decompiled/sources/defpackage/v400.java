package defpackage;

import com.ybsdk.feature.main.internal.data.network.MainScreenApi;
import com.ybsdk.feature.main.internal.data.network.SbpAccountApi;
import com.ybsdk.feature.main.internal.data.network.UserCardsApi;

/* loaded from: classes3.dex */
public final class v400 implements v7p {
    public final /* synthetic */ int a;
    public final u2g b;

    public /* synthetic */ v400(u2g u2gVar, int i) {
        this.a = i;
        this.b = u2gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        u2g u2gVar = this.b;
        switch (i) {
            case 0:
                return (MainScreenApi) ((t0k0) u2gVar.get()).b(MainScreenApi.class);
            case 1:
                return (SbpAccountApi) ((t0k0) u2gVar.get()).b(SbpAccountApi.class);
            default:
                return (UserCardsApi) ((t0k0) u2gVar.get()).b(UserCardsApi.class);
        }
    }
}
