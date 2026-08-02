package yads;

import defpackage.evu0;
import defpackage.gy71;
import defpackage.i3y;
import defpackage.sls;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class nc3 extends Lambda implements sls {
    public static final nc3 w = new nc3();

    public nc3() {
        super(0);
    }

    @Override // defpackage.sls
    public final Object invoke() {
        List W;
        i3y i3yVar = gy71.a;
        W = evu0.W("adsdk.yandex.ru,yandex.ru", new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
        ArrayList arrayList = new ArrayList();
        for (Object obj : W) {
            if (!evu0.J((String) obj)) {
                arrayList.add(obj);
            }
        }
        i3y i3yVar2 = gy71.a;
        return a.o0(arrayList, "yandex.com/ads");
    }
}
