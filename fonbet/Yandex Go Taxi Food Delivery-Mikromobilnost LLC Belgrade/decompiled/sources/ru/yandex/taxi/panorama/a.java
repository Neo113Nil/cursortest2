package ru.yandex.taxi.panorama;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.auu0;
import defpackage.e6m;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.panorama.d;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.panorama.TaxiPanoramaExperiment", aVar, 13);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("entry_point_content_description_key", true);
        pluginGeneratedSerialDescriptor.j("entry_point", true);
        pluginGeneratedSerialDescriptor.j("photo_entry_point", true);
        pluginGeneratedSerialDescriptor.j("pin_a_image_tag", true);
        pluginGeneratedSerialDescriptor.j("pin_b_image_tag", true);
        pluginGeneratedSerialDescriptor.j("far_from_starting_point_pin_alpha", true);
        pluginGeneratedSerialDescriptor.j("expanded_entry_point_image_tag", true);
        pluginGeneratedSerialDescriptor.j("tooltip", true);
        pluginGeneratedSerialDescriptor.j("error_screen", true);
        pluginGeneratedSerialDescriptor.j("select_pickup_point_flow", true);
        pluginGeneratedSerialDescriptor.j("order_card", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = d.o;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), auu0Var, i3yVarArr[3].getValue(), i3yVarArr[4].getValue(), auu0Var, auu0Var, e6m.a, auu0Var, e.a, b.a, i.a, g.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = d.o;
        b.getClass();
        double d = 0.0d;
        d.c cVar = null;
        d.C0109d c0109d = null;
        boolean z = true;
        d.b bVar = null;
        d.a aVar = null;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        String str = null;
        List list = null;
        List list2 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    list2 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list2);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    str2 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    str3 = b.k(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    d = b.E(serialDescriptor, 7);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    str4 = b.k(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    bVar = (d.b) b.A(serialDescriptor, 9, e.a, bVar);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    aVar = (d.a) b.A(serialDescriptor, 10, b.a, aVar);
                    i |= 1024;
                    break;
                case 11:
                    i3yVarArr = i3yVarArr2;
                    c0109d = (d.C0109d) b.A(serialDescriptor, 11, i.a, c0109d);
                    i |= 2048;
                    break;
                case 12:
                    i3yVarArr = i3yVarArr2;
                    cVar = (d.c) b.A(serialDescriptor, 12, g.a, cVar);
                    i |= 4096;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new d(i, z2, map, str, list, list2, str2, str3, d, str4, bVar, aVar, c0109d, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d dVar = (d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = d.o;
        if (b.F() || dVar.b) {
            b.n(serialDescriptor, 0, dVar.b);
        }
        if (b.F() || !jl40.l(dVar.c, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), dVar.c);
        }
        if (b.F() || !jl40.l(dVar.d, "")) {
            b.o(serialDescriptor, 2, dVar.d);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(dVar.e, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), dVar.e);
        }
        if (b.F() || !jl40.l(dVar.f, emptyList)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), dVar.f);
        }
        if (b.F() || !jl40.l(dVar.g, "")) {
            b.o(serialDescriptor, 5, dVar.g);
        }
        if (b.F() || !jl40.l(dVar.h, "")) {
            b.o(serialDescriptor, 6, dVar.h);
        }
        if (b.F() || Double.compare(dVar.i, 1.0d) != 0) {
            b.E(serialDescriptor, 7, dVar.i);
        }
        if (b.F() || !jl40.l(dVar.j, "")) {
            b.o(serialDescriptor, 8, dVar.j);
        }
        if (b.F() || !jl40.l(dVar.k, new d.b(0))) {
            b.e(serialDescriptor, 9, e.a, dVar.k);
        }
        if (b.F() || !jl40.l(dVar.l, new d.a(0))) {
            b.e(serialDescriptor, 10, b.a, dVar.l);
        }
        if (b.F() || !jl40.l(dVar.m, new d.C0109d(0))) {
            b.e(serialDescriptor, 11, i.a, dVar.m);
        }
        if (b.F() || !jl40.l(dVar.n, new d.c(0))) {
            b.e(serialDescriptor, 12, g.a, dVar.n);
        }
        b.c(serialDescriptor);
    }
}
