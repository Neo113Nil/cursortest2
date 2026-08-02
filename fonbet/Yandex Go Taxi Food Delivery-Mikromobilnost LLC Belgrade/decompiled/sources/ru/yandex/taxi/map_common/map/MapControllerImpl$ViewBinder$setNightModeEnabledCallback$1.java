package ru.yandex.taxi.map_common.map;

import com.yandex.mapkit.map.Map;
import defpackage.gh00;
import defpackage.jst;
import defpackage.qv10;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
final /* synthetic */ class MapControllerImpl$ViewBinder$setNightModeEnabledCallback$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Boolean bool = (Boolean) obj;
        boolean booleanValue = bool.booleanValue();
        gh00 gh00Var = (gh00) this.receiver;
        Map map = gh00Var.b;
        if (map != null) {
            map.setNightModeEnabled(booleanValue);
        }
        gh00Var.c = booleanValue;
        qv10.C(new Object[]{bool}, 1, "Night mode is '%s'", jst.e);
        return zy11.a;
    }
}
