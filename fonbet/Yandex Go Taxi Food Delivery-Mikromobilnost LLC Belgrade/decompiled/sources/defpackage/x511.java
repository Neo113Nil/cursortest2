package defpackage;

import com.yandex.mapkit.navigation.transport.layer.RequestPointViewListener;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes7.dex */
public final class x511 implements RequestPointViewListener {
    public final /* synthetic */ y511 a;

    public x511(y511 y511Var) {
        this.a = y511Var;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RequestPointViewListener
    public final void onRequestPointTap(int i) {
        this.a.c(new gac(i, 5));
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.RequestPointViewListener
    public final void onRequestPointViewsChanged() {
        yeo yeoVar;
        y511 y511Var = this.a;
        try {
            Map e = gw00.e(new Pair("type", "onRequestPointViewsChanged"));
            if ((e instanceof zy11) || (yeoVar = y511Var.b) == null) {
                return;
            }
            yeoVar.success(e);
        } catch (Throwable th) {
            yeo yeoVar2 = y511Var.b;
            if (yeoVar2 != null) {
                yeoVar2.error(y511.class.getSimpleName(), ljo.b(th), null);
            }
        }
    }
}
