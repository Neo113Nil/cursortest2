package defpackage;

import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class v1m extends y8 {
    public final SerialDescriptor a = z1m.Companion.serializer().getDescriptor();

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        z1m z1mVar = (z1m) sbxVar.a(z1m.Companion.serializer(), bVar);
        String str = z1mVar.a;
        Map map = z1mVar.b;
        if (map == null) {
            map = kotlin.collections.b.f();
        }
        return new u1m(map, str, z1mVar.c);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
