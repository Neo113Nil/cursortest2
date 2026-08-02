package defpackage;

import com.ybsdk.widgets.common.shimmer.b;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public final /* synthetic */ class vo6 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ vo6(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                return new uo6(null, null, bVar.a(), true);
            case 1:
                return new ym8(null, null, bVar.a(), true);
            case 2:
                return new ebm0(bVar.a(), false, null, true, null, null, 0, true, false, null);
            case 3:
                return new mhm0(null, null, bVar.a(), true);
            case 4:
                return new h9u0(null, null, bVar.a(), true);
            default:
                return new tk21(null, null, bVar.a(), false, EmptyList.a);
        }
    }
}
