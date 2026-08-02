package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class r370 extends y8 {
    public final SerialDescriptor a = b.Companion.serializer().getDescriptor();

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        return new q370(bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
