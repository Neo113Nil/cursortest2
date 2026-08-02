package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class t46 implements uxs {
    public static final t46 a;
    private static final SerialDescriptor descriptor;

    static {
        t46 t46Var = new t46();
        a = t46Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.persuggest.api.finalsuggest.BlockedZone", t46Var, 5);
        pluginGeneratedSerialDescriptor.j("geometry", true);
        pluginGeneratedSerialDescriptor.j("options", true);
        pluginGeneratedSerialDescriptor.j("properties", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("zone_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        KSerializer n = qke.n(u2t.Companion.serializer());
        KSerializer n2 = qke.n(hg70.a);
        KSerializer n3 = qke.n(gtf0.a);
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{n, n2, n3, qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        u2t u2tVar = null;
        pg70 pg70Var = null;
        ktf0 ktf0Var = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                u2tVar = (u2t) b.s(serialDescriptor, 0, u2t.Companion.serializer(), u2tVar);
                i |= 1;
            } else if (v == 1) {
                pg70Var = (pg70) b.s(serialDescriptor, 1, hg70.a, pg70Var);
                i |= 2;
            } else if (v == 2) {
                ktf0Var = (ktf0) b.s(serialDescriptor, 2, gtf0.a, ktf0Var);
                i |= 4;
            } else if (v == 3) {
                str = (String) b.s(serialDescriptor, 3, auu0.a, str);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new v46(i, u2tVar, pg70Var, ktf0Var, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        v46.c((v46) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
