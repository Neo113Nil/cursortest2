package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import ru.yandex.taxi.requirements.models.net.RequirementsParam;

/* loaded from: classes9.dex */
public final class spj0 implements KSerializer {
    public final i8u a;

    public spj0() {
        o2f0 o2f0Var = auu0.b;
        cm2.a.getClass();
        this.a = new i8u(o2f0Var, cm2.b);
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        throw new SerializationException("RequirementsParam does not support deserialize");
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        RequirementsParam requirementsParam = (RequirementsParam) obj;
        requirementsParam.size();
        i8u i8uVar = this.a;
        yjd r = encoder.r(i8uVar);
        auu0 auu0Var = auu0.a;
        cm2 cm2Var = cm2.a;
        int i = 0;
        for (Map.Entry<String, Object> entry : requirementsParam.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            r.e(i8uVar, i, auu0Var, key);
            i += 2;
            r.e(i8uVar, i2, cm2Var, value);
        }
        r.c(i8uVar);
    }
}
