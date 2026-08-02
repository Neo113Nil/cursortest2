package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class rt90 implements uxs {
    public static final rt90 a;
    private static final SerialDescriptor descriptor;

    static {
        rt90 rt90Var = new rt90();
        a = rt90Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.experiments.PayOnDeliveryExperiment", rt90Var, 11);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("toggle", true);
        pluginGeneratedSerialDescriptor.j("delivery_form", true);
        pluginGeneratedSerialDescriptor.j("payment_selector_screen", true);
        pluginGeneratedSerialDescriptor.j("multipoints_alert", true);
        pluginGeneratedSerialDescriptor.j("prohibited_payment_method_alert", true);
        pluginGeneratedSerialDescriptor.j("prohibited_alternatives", true);
        pluginGeneratedSerialDescriptor.j("tariff_classes", true);
        pluginGeneratedSerialDescriptor.j("prohibited_payment_methods", true);
        pluginGeneratedSerialDescriptor.j("allowed_corp_types", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = tt90.m;
        return new KSerializer[]{z96.a, i3yVarArr[1].getValue(), rkz0.a, jai.a, vja0.a, fx40.a, ukf0.a, i3yVarArr[7].getValue(), i3yVarArr[8].getValue(), i3yVarArr[9].getValue(), i3yVarArr[10].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = tt90.m;
        b.getClass();
        List list = null;
        List list2 = null;
        List list3 = null;
        boolean z2 = true;
        List list4 = null;
        int i = 0;
        boolean z3 = false;
        Map map = null;
        tkz0 tkz0Var = null;
        lai laiVar = null;
        xja0 xja0Var = null;
        hx40 hx40Var = null;
        wkf0 wkf0Var = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    i3yVarArr2 = i3yVarArr2;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    z3 = b.C(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    tkz0Var = (tkz0) b.A(serialDescriptor, 2, rkz0.a, tkz0Var);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    laiVar = (lai) b.A(serialDescriptor, 3, jai.a, laiVar);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    xja0Var = (xja0) b.A(serialDescriptor, 4, vja0.a, xja0Var);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    hx40Var = (hx40) b.A(serialDescriptor, 5, fx40.a, hx40Var);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    wkf0Var = (wkf0) b.A(serialDescriptor, 6, ukf0.a, wkf0Var);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list4 = (List) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list4);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list3 = (List) b.A(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), list3);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list2 = (List) b.A(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), list2);
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
        return new tt90(i, z3, map, tkz0Var, laiVar, xja0Var, hx40Var, wkf0Var, list4, list3, list2, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tt90 tt90Var = (tt90) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = tt90.m;
        if (b.F() || tt90Var.b) {
            b.n(serialDescriptor, 0, tt90Var.b);
        }
        if (b.F() || !jl40.l(tt90Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), tt90Var.c);
        }
        if (b.F() || !jl40.l(tt90Var.d, new tkz0(0))) {
            b.e(serialDescriptor, 2, rkz0.a, tt90Var.d);
        }
        if (b.F() || !jl40.l(tt90Var.e, new lai(0))) {
            b.e(serialDescriptor, 3, jai.a, tt90Var.e);
        }
        if (b.F() || !jl40.l(tt90Var.f, new xja0(0))) {
            b.e(serialDescriptor, 4, vja0.a, tt90Var.f);
        }
        if (b.F() || !jl40.l(tt90Var.g, new hx40(0))) {
            b.e(serialDescriptor, 5, fx40.a, tt90Var.g);
        }
        if (b.F() || !jl40.l(tt90Var.h, new wkf0(0))) {
            b.e(serialDescriptor, 6, ukf0.a, tt90Var.h);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(tt90Var.i, emptyList)) {
            b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), tt90Var.i);
        }
        if (b.F() || !jl40.l(tt90Var.j, emptyList)) {
            b.e(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), tt90Var.j);
        }
        if (b.F() || !jl40.l(tt90Var.k, emptyList)) {
            b.e(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), tt90Var.k);
        }
        if (b.F() || !jl40.l(tt90Var.l, emptyList)) {
            b.e(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), tt90Var.l);
        }
        b.c(serialDescriptor);
    }
}
