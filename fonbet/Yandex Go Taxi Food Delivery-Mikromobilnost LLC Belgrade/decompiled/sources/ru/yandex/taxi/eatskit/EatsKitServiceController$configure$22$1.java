package ru.yandex.taxi.eatskit;

import com.yandex.go.yb.api.domain.model.YbScreenSource;
import defpackage.aw51;
import defpackage.b8w0;
import defpackage.da70;
import defpackage.ew51;
import defpackage.gcn;
import defpackage.jst;
import defpackage.os51;
import defpackage.s2p;
import defpackage.w511;
import defpackage.wls;
import defpackage.yv51;
import defpackage.zv51;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.superapp.v;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class EatsKitServiceController$configure$22$1 extends FunctionReferenceImpl implements wls {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0043  */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        ew51 yv51Var;
        BigDecimal bigDecimal;
        da70 da70Var = (da70) obj;
        gcn gcnVar = (gcn) obj2;
        s2p s2pVar = ((v) this.receiver).g;
        int i = b8w0.a[da70Var.a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return null;
            }
            os51 os51Var = da70Var.b;
            String str = os51Var != null ? os51Var.b : null;
            if (str == null) {
                str = "";
            }
            String str2 = os51Var != null ? os51Var.a : null;
            if (str2 != null) {
                try {
                    bigDecimal = new BigDecimal(str2);
                } catch (NumberFormatException e) {
                    jst.e.k(e, "Wrong formatted bank money amount from web");
                }
                yv51Var = new aw51(bigDecimal != null ? new zv51(str, bigDecimal) : null, YbScreenSource.WEB_EATSKIT);
            }
            bigDecimal = null;
            yv51Var = new aw51(bigDecimal != null ? new zv51(str, bigDecimal) : null, YbScreenSource.WEB_EATSKIT);
        } else {
            yv51Var = new yv51(YbScreenSource.WEB_EATSKIT);
        }
        s2pVar.h(yv51Var, gcnVar);
        return zy11.a;
    }
}
