package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;

/* loaded from: classes5.dex */
public final class rhz extends vfx {
    public static final rhz a = new rhz();
    public static final SerialDescriptor b = b.Companion.serializer().getDescriptor();

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        throw new SerializationException("LogisticsKnownOrderInfo do not support deserialize");
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        shz shzVar = (shz) obj;
        b bVar = shzVar.c;
        if (bVar == null) {
            kdx kdxVar = new kdx();
            abb1.d(kdxVar, "orderid", shzVar.a);
            abb1.d(kdxVar, Constants.KEY_SERVICE, shzVar.b);
            bVar = kdxVar.a();
        }
        vcxVar.p(bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
