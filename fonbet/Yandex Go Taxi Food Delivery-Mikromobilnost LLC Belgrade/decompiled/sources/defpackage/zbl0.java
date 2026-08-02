package defpackage;

import com.yandex.go.multitariff.RouteStatsVerticalMulticlassDetails;
import com.yandex.go.multitariff.RouteStatsVerticalMulticlassDetails$$serializer;
import com.yandex.go.multitariff.SelectionRules;
import com.yandex.go.multitariff.SelectionRules$$serializer;
import com.yandex.go.zone.dto.objects.TariffUnavailable;
import com.yandex.go.zone.dto.objects.TariffUnavailable$$serializer;
import com.yandex.go.zone.dto.objects.e5;
import com.yandex.go.zone.dto.objects.f5;
import com.yandex.go.zone.dto.response.c;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class zbl0 implements uxs {
    public static final zbl0 a;
    private static final SerialDescriptor descriptor;

    static {
        zbl0 zbl0Var = new zbl0();
        a = zbl0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.response.RouteStatsVerticalMulticlass", zbl0Var, 11);
        pluginGeneratedSerialDescriptor.j("tariffs", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        pluginGeneratedSerialDescriptor.j("selector_icon", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("details", true);
        pluginGeneratedSerialDescriptor.j("widget", true);
        pluginGeneratedSerialDescriptor.j("selection_rules", true);
        pluginGeneratedSerialDescriptor.j("estimated_waiting", true);
        pluginGeneratedSerialDescriptor.j("unsupported_requirements", true);
        pluginGeneratedSerialDescriptor.j("tariff_unavailable", true);
        pluginGeneratedSerialDescriptor.j("brandings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = bcl0.l;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n(h6w.a), qke.n(c7v.a), auu0.a, RouteStatsVerticalMulticlassDetails$$serializer.INSTANCE, hwq0.e, SelectionRules$$serializer.INSTANCE, qke.n(c.Companion.serializer()), i3yVarArr[8].getValue(), qke.n(TariffUnavailable$$serializer.INSTANCE), i3yVarArr[10].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = bcl0.l;
        b.getClass();
        List list = null;
        TariffUnavailable tariffUnavailable = null;
        List list2 = null;
        boolean z2 = true;
        c cVar = null;
        int i = 0;
        List list3 = null;
        Integer num = null;
        n7v n7vVar = null;
        String str = null;
        RouteStatsVerticalMulticlassDetails routeStatsVerticalMulticlassDetails = null;
        f5 f5Var = null;
        SelectionRules selectionRules = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list3 = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list3);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    num = (Integer) b.s(serialDescriptor, 1, h6w.a, num);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    n7vVar = (n7v) b.s(serialDescriptor, 2, c7v.a, n7vVar);
                    i |= 4;
                    break;
                case 3:
                    str = b.k(serialDescriptor, 3);
                    i |= 8;
                    i3yVarArr2 = i3yVarArr2;
                    continue;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    routeStatsVerticalMulticlassDetails = (RouteStatsVerticalMulticlassDetails) b.A(serialDescriptor, 4, RouteStatsVerticalMulticlassDetails$$serializer.INSTANCE, routeStatsVerticalMulticlassDetails);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    f5Var = (f5) b.A(serialDescriptor, 5, hwq0.e, f5Var);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    selectionRules = (SelectionRules) b.A(serialDescriptor, 6, SelectionRules$$serializer.INSTANCE, selectionRules);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    cVar = (c) b.s(serialDescriptor, 7, c.Companion.serializer(), cVar);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list2 = (List) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), list2);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    tariffUnavailable = (TariffUnavailable) b.s(serialDescriptor, 9, TariffUnavailable$$serializer.INSTANCE, tariffUnavailable);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list = (List) b.A(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), list);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
            z2 = z;
        }
        b.c(serialDescriptor);
        return new bcl0(i, list3, num, n7vVar, str, routeStatsVerticalMulticlassDetails, f5Var, selectionRules, cVar, list2, tariffUnavailable, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
    
        if (defpackage.jl40.l(r1, com.yandex.go.multitariff.RouteStatsVerticalMulticlassDetails.f) == false) goto L31;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        bcl0 bcl0Var = (bcl0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = bcl0.l;
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(bcl0Var.a, emptyList)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), bcl0Var.a);
        }
        if (b.F() || bcl0Var.b != null) {
            b.g(serialDescriptor, 1, h6w.a, bcl0Var.b);
        }
        if (b.F() || bcl0Var.c != null) {
            b.g(serialDescriptor, 2, c7v.a, bcl0Var.c);
        }
        if (b.F() || !jl40.l(bcl0Var.d, "")) {
            b.o(serialDescriptor, 3, bcl0Var.d);
        }
        if (!b.F()) {
            RouteStatsVerticalMulticlassDetails routeStatsVerticalMulticlassDetails = bcl0Var.e;
            RouteStatsVerticalMulticlassDetails.Companion.getClass();
        }
        b.e(serialDescriptor, 4, RouteStatsVerticalMulticlassDetails$$serializer.INSTANCE, bcl0Var.e);
        if (b.F() || !jl40.l(bcl0Var.f, e5.INSTANCE)) {
            b.e(serialDescriptor, 5, hwq0.e, bcl0Var.f);
        }
        if (b.F() || !jl40.l(bcl0Var.g, new SelectionRules(0))) {
            b.e(serialDescriptor, 6, SelectionRules$$serializer.INSTANCE, bcl0Var.g);
        }
        if (b.F() || bcl0Var.h != null) {
            b.g(serialDescriptor, 7, c.Companion.serializer(), bcl0Var.h);
        }
        if (b.F() || !jl40.l(bcl0Var.i, emptyList)) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), bcl0Var.i);
        }
        if (b.F() || bcl0Var.j != null) {
            b.g(serialDescriptor, 9, TariffUnavailable$$serializer.INSTANCE, bcl0Var.j);
        }
        if (b.F() || !jl40.l(bcl0Var.k, emptyList)) {
            b.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), bcl0Var.k);
        }
        b.c(serialDescriptor);
    }
}
