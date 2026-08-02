package defpackage;

import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes8.dex */
public abstract class tnt extends vfx {
    public final asq0 a;

    public tnt() {
        String c = qoi0.a(getClass()).c();
        String replace = c != null ? c.replace('$', '.') : null;
        if (replace != null) {
            this.a = d6z.g(replace, new SerialDescriptor[0]);
        } else {
            ny61.g("Required value was null.");
            throw null;
        }
    }

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        throw new SerializationException(b64.j(qoi0.a(getClass()).c(), " do not support seserialization"));
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        kf5 kf5Var = vcxVar.d().b;
        g0c a = qoi0.a(obj.getClass());
        KSerializer K = gtq0.K(a);
        if (K == null) {
            K = kf5Var.b(a, EmptyList.a);
        }
        if (K == null) {
            K = null;
        }
        if (K != null) {
            K.serialize(vcxVar, obj);
        } else {
            uh6.M(a);
            throw null;
        }
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
