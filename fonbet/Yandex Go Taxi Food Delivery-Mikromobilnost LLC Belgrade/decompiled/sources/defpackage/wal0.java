package defpackage;

import com.yandex.go.preorder.source.altpins.Alternatives;
import com.yandex.go.preorder.source.altpins.Alternatives$$serializer;
import com.yandex.go.zone.dto.objects.CouponCheckResult;
import com.yandex.go.zone.dto.objects.CouponCheckResult$$serializer;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.json.b;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes9.dex */
public final /* synthetic */ class wal0 implements uxs {
    public static final wal0 a;
    private static final SerialDescriptor descriptor;

    static {
        wal0 wal0Var = new wal0();
        a = wal0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.response.RouteStats", wal0Var, 18);
        pluginGeneratedSerialDescriptor.j("coupon", true);
        pluginGeneratedSerialDescriptor.j("service_levels", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        pluginGeneratedSerialDescriptor.j("cache_estimated_waiting", true);
        pluginGeneratedSerialDescriptor.j("alternatives", true);
        pluginGeneratedSerialDescriptor.j("notify", true);
        pluginGeneratedSerialDescriptor.j("distance", true);
        pluginGeneratedSerialDescriptor.j(RemoteBioParameters.TIME, true);
        pluginGeneratedSerialDescriptor.j("time_seconds", true);
        pluginGeneratedSerialDescriptor.j("toll_roads", true);
        pluginGeneratedSerialDescriptor.j("verticals", true);
        pluginGeneratedSerialDescriptor.j("verticals_modes", true);
        pluginGeneratedSerialDescriptor.j("promo_context", true);
        pluginGeneratedSerialDescriptor.j("mobility_hub_context", true);
        pluginGeneratedSerialDescriptor.j("intercity", true);
        pluginGeneratedSerialDescriptor.j("price_formats", true);
        pluginGeneratedSerialDescriptor.j("auction_info", true);
        pluginGeneratedSerialDescriptor.j("typed_experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = yal0.v;
        auu0 auu0Var = auu0.a;
        rcx rcxVar = rcx.a;
        return new KSerializer[]{qke.n(CouponCheckResult$$serializer.INSTANCE), i3yVarArr[1].getValue(), gef.a, v1k.a, qke.n(Alternatives$$serializer.INSTANCE), i3yVarArr[5].getValue(), auu0Var, auu0Var, h6w.a, trz0.a, i3yVarArr[10].getValue(), i3yVarArr[11].getValue(), qke.n(rcxVar), qke.n(rcxVar), qke.n(jow.a), qke.n((KSerializer) i3yVarArr[15].getValue()), qke.n(e6k0.a), qke.n(zn11.Companion.serializer())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ief iefVar;
        x1k x1kVar;
        int i;
        b bVar;
        CouponCheckResult couponCheckResult;
        ief iefVar2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = yal0.v;
        b.getClass();
        b bVar2 = null;
        b bVar3 = null;
        Set set = null;
        List list = null;
        now nowVar = null;
        vrz0 vrz0Var = null;
        int i2 = 0;
        h6k0 h6k0Var = null;
        zn11 zn11Var = null;
        ief iefVar3 = null;
        x1k x1kVar2 = null;
        Alternatives alternatives = null;
        List list2 = null;
        Map map = null;
        String str = null;
        int i3 = 0;
        int i4 = 1;
        boolean z = true;
        String str2 = null;
        CouponCheckResult couponCheckResult2 = null;
        List list3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    bVar = bVar2;
                    couponCheckResult = couponCheckResult2;
                    z = false;
                    bVar3 = bVar3;
                    x1kVar2 = x1kVar2;
                    i4 = 1;
                    couponCheckResult2 = couponCheckResult;
                    bVar2 = bVar;
                case 0:
                    bVar = bVar2;
                    couponCheckResult = (CouponCheckResult) b.s(serialDescriptor, 0, CouponCheckResult$$serializer.INSTANCE, couponCheckResult2);
                    i2 |= 1;
                    bVar3 = bVar3;
                    x1kVar2 = x1kVar2;
                    iefVar3 = iefVar3;
                    i4 = 1;
                    couponCheckResult2 = couponCheckResult;
                    bVar2 = bVar;
                case 1:
                    bVar = bVar2;
                    iefVar2 = iefVar3;
                    list3 = (List) b.A(serialDescriptor, i4, (myi) i3yVarArr[i4].getValue(), list3);
                    i2 |= 2;
                    x1kVar2 = x1kVar2;
                    iefVar3 = iefVar2;
                    bVar2 = bVar;
                case 2:
                    bVar = bVar2;
                    iefVar3 = (ief) b.A(serialDescriptor, 2, gef.a, iefVar3);
                    i2 |= 4;
                    x1kVar2 = x1kVar2;
                    bVar2 = bVar;
                case 3:
                    iefVar2 = iefVar3;
                    bVar = bVar2;
                    x1kVar2 = (x1k) b.A(serialDescriptor, 3, v1k.a, x1kVar2);
                    i2 |= 8;
                    iefVar3 = iefVar2;
                    bVar2 = bVar;
                case 4:
                    iefVar = iefVar3;
                    x1kVar = x1kVar2;
                    alternatives = (Alternatives) b.s(serialDescriptor, 4, Alternatives$$serializer.INSTANCE, alternatives);
                    i2 |= 16;
                    x1kVar2 = x1kVar;
                    iefVar3 = iefVar;
                case 5:
                    iefVar = iefVar3;
                    x1kVar = x1kVar2;
                    list2 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list2);
                    i2 |= 32;
                    x1kVar2 = x1kVar;
                    iefVar3 = iefVar;
                case 6:
                    iefVar = iefVar3;
                    str2 = b.k(serialDescriptor, 6);
                    i2 |= 64;
                    iefVar3 = iefVar;
                case 7:
                    iefVar = iefVar3;
                    str = b.k(serialDescriptor, 7);
                    i2 |= 128;
                    iefVar3 = iefVar;
                case 8:
                    iefVar = iefVar3;
                    i3 = b.h(serialDescriptor, 8);
                    i2 |= 256;
                    iefVar3 = iefVar;
                case 9:
                    iefVar = iefVar3;
                    x1kVar = x1kVar2;
                    vrz0Var = (vrz0) b.A(serialDescriptor, 9, trz0.a, vrz0Var);
                    i2 |= 512;
                    x1kVar2 = x1kVar;
                    iefVar3 = iefVar;
                case 10:
                    iefVar = iefVar3;
                    x1kVar = x1kVar2;
                    list = (List) b.A(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), list);
                    i2 |= 1024;
                    x1kVar2 = x1kVar;
                    iefVar3 = iefVar;
                case 11:
                    iefVar = iefVar3;
                    x1kVar = x1kVar2;
                    set = (Set) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), set);
                    i2 |= 2048;
                    x1kVar2 = x1kVar;
                    iefVar3 = iefVar;
                case 12:
                    iefVar = iefVar3;
                    x1kVar = x1kVar2;
                    bVar3 = (b) b.s(serialDescriptor, 12, rcx.a, bVar3);
                    i2 |= 4096;
                    x1kVar2 = x1kVar;
                    iefVar3 = iefVar;
                case 13:
                    iefVar = iefVar3;
                    x1kVar = x1kVar2;
                    bVar2 = (b) b.s(serialDescriptor, 13, rcx.a, bVar2);
                    i2 |= 8192;
                    x1kVar2 = x1kVar;
                    iefVar3 = iefVar;
                case 14:
                    iefVar = iefVar3;
                    x1kVar = x1kVar2;
                    nowVar = (now) b.s(serialDescriptor, 14, jow.a, nowVar);
                    i2 |= 16384;
                    x1kVar2 = x1kVar;
                    iefVar3 = iefVar;
                case 15:
                    iefVar = iefVar3;
                    x1kVar = x1kVar2;
                    map = (Map) b.s(serialDescriptor, 15, (myi) i3yVarArr[15].getValue(), map);
                    i = 32768;
                    i2 |= i;
                    x1kVar2 = x1kVar;
                    iefVar3 = iefVar;
                case 16:
                    iefVar = iefVar3;
                    x1kVar = x1kVar2;
                    h6k0Var = (h6k0) b.s(serialDescriptor, 16, e6k0.a, h6k0Var);
                    i = 65536;
                    i2 |= i;
                    x1kVar2 = x1kVar;
                    iefVar3 = iefVar;
                case 17:
                    iefVar = iefVar3;
                    x1kVar = x1kVar2;
                    zn11Var = (zn11) b.s(serialDescriptor, 17, zn11.Companion.serializer(), zn11Var);
                    i = 131072;
                    i2 |= i;
                    x1kVar2 = x1kVar;
                    iefVar3 = iefVar;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b bVar4 = bVar2;
        x1k x1kVar3 = x1kVar2;
        CouponCheckResult couponCheckResult3 = couponCheckResult2;
        List list4 = list3;
        b.c(serialDescriptor);
        return new yal0(i2, couponCheckResult3, list4, iefVar3, x1kVar3, alternatives, list2, str2, str, i3, vrz0Var, list, set, bVar3, bVar4, nowVar, map, h6k0Var, zn11Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        yal0 yal0Var = (yal0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = yal0.v;
        if (b.F() || yal0Var.a != null) {
            b.g(serialDescriptor, 0, CouponCheckResult$$serializer.INSTANCE, yal0Var.a);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(yal0Var.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), yal0Var.b);
        }
        if (b.F() || !jl40.l(yal0Var.c, ief.e)) {
            b.e(serialDescriptor, 2, gef.a, yal0Var.c);
        }
        if (b.F() || !jl40.l(yal0Var.d, x1k.c)) {
            b.e(serialDescriptor, 3, v1k.a, yal0Var.d);
        }
        if (b.F() || yal0Var.e != null) {
            b.g(serialDescriptor, 4, Alternatives$$serializer.INSTANCE, yal0Var.e);
        }
        if (b.F() || !jl40.l(yal0Var.f, emptyList)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), yal0Var.f);
        }
        if (b.F() || !jl40.l(yal0Var.g, "")) {
            b.o(serialDescriptor, 6, yal0Var.g);
        }
        if (b.F() || !jl40.l(yal0Var.h, "")) {
            b.o(serialDescriptor, 7, yal0Var.h);
        }
        if (b.F() || yal0Var.i != 0) {
            b.A(8, yal0Var.i, serialDescriptor);
        }
        if (b.F() || !jl40.l(yal0Var.j, vrz0.i)) {
            b.e(serialDescriptor, 9, trz0.a, yal0Var.j);
        }
        if (b.F() || !jl40.l(yal0Var.k, emptyList)) {
            b.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), yal0Var.k);
        }
        if (b.F() || !jl40.l(yal0Var.l, EmptySet.a)) {
            b.e(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), yal0Var.l);
        }
        if (b.F() || yal0Var.m != null) {
            b.g(serialDescriptor, 12, rcx.a, yal0Var.m);
        }
        if (b.F() || yal0Var.n != null) {
            b.g(serialDescriptor, 13, rcx.a, yal0Var.n);
        }
        if (b.F() || yal0Var.o != null) {
            b.g(serialDescriptor, 14, jow.a, yal0Var.o);
        }
        if (b.F() || yal0Var.p != null) {
            b.g(serialDescriptor, 15, (KSerializer) i3yVarArr[15].getValue(), yal0Var.p);
        }
        if (b.F() || yal0Var.q != null) {
            b.g(serialDescriptor, 16, e6k0.a, yal0Var.q);
        }
        if (b.F() || yal0Var.r != null) {
            b.g(serialDescriptor, 17, zn11.Companion.serializer(), yal0Var.r);
        }
        b.c(serialDescriptor);
    }
}
