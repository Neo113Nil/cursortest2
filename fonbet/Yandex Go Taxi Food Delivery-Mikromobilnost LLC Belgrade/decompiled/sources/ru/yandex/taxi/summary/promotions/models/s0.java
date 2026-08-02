package ru.yandex.taxi.summary.promotions.models;

import defpackage.a4v;
import defpackage.auu0;
import defpackage.b7v;
import defpackage.c4v;
import defpackage.f8s0;
import defpackage.ft1;
import defpackage.ht1;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.myi;
import defpackage.ny61;
import defpackage.o8s0;
import defpackage.p7v;
import defpackage.qke;
import defpackage.si70;
import defpackage.sjd;
import defpackage.ui70;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class s0 implements uxs {
    public static final s0 a;
    private static final SerialDescriptor descriptor;

    static {
        s0 s0Var = new s0();
        a = s0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse.PromoModalWindows.ModalWindowsItem.DefaultItem", s0Var, 12);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("display_on", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        pluginGeneratedSerialDescriptor.j("widgets", true);
        pluginGeneratedSerialDescriptor.j("order_button", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("footer", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("bullets", true);
        pluginGeneratedSerialDescriptor.j("header_payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = u0.m;
        KSerializer n = qke.n((KSerializer) i3yVarArr[2].getValue());
        KSerializer n2 = qke.n(si70.a);
        KSerializer n3 = qke.n((KSerializer) i3yVarArr[10].getValue());
        KSerializer n4 = qke.n((KSerializer) i3yVarArr[11].getValue());
        ft1 ft1Var = ft1.a;
        return new KSerializer[]{auu0.a, ft1Var, n, f8s0.a, a1.a, n2, ft1Var, ft1Var, a4v.a, b7v.a, n3, n4};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        String str;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = u0.m;
        b.getClass();
        Map map = null;
        List list = null;
        p7v p7vVar = null;
        c4v c4vVar = null;
        boolean z2 = true;
        ht1 ht1Var = null;
        int i = 0;
        String str2 = null;
        ht1 ht1Var2 = null;
        jsq0 jsq0Var = null;
        o8s0 o8s0Var = null;
        SummaryPromotionsResponse.f fVar = null;
        ui70 ui70Var = null;
        ht1 ht1Var3 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    i |= 1;
                    str2 = b.k(serialDescriptor, 0);
                    z2 = z2;
                    continue;
                case 1:
                    z = z2;
                    str = str2;
                    ht1Var2 = (ht1) b.A(serialDescriptor, 1, ft1.a, ht1Var2);
                    i |= 2;
                    break;
                case 2:
                    z = z2;
                    str = str2;
                    jsq0Var = (jsq0) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), jsq0Var);
                    i |= 4;
                    break;
                case 3:
                    z = z2;
                    str = str2;
                    o8s0Var = (o8s0) b.A(serialDescriptor, 3, f8s0.a, o8s0Var);
                    i |= 8;
                    break;
                case 4:
                    z = z2;
                    str = str2;
                    fVar = (SummaryPromotionsResponse.f) b.A(serialDescriptor, 4, a1.a, fVar);
                    i |= 16;
                    break;
                case 5:
                    z = z2;
                    str = str2;
                    ui70Var = (ui70) b.s(serialDescriptor, 5, si70.a, ui70Var);
                    i |= 32;
                    break;
                case 6:
                    z = z2;
                    str = str2;
                    ht1Var3 = (ht1) b.A(serialDescriptor, 6, ft1.a, ht1Var3);
                    i |= 64;
                    break;
                case 7:
                    z = z2;
                    str = str2;
                    ht1Var = (ht1) b.A(serialDescriptor, 7, ft1.a, ht1Var);
                    i |= 128;
                    break;
                case 8:
                    z = z2;
                    str = str2;
                    c4vVar = (c4v) b.A(serialDescriptor, 8, a4v.a, c4vVar);
                    i |= 256;
                    break;
                case 9:
                    z = z2;
                    str = str2;
                    p7vVar = (p7v) b.A(serialDescriptor, 9, b7v.a, p7vVar);
                    i |= 512;
                    break;
                case 10:
                    z = z2;
                    str = str2;
                    list = (List) b.s(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), list);
                    i |= 1024;
                    break;
                case 11:
                    z = z2;
                    str = str2;
                    map = (Map) b.s(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), map);
                    i |= 2048;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            z2 = z;
            str2 = str;
        }
        b.c(serialDescriptor);
        return new u0(i, str2, ht1Var2, jsq0Var, o8s0Var, fVar, ui70Var, ht1Var3, ht1Var, c4vVar, p7vVar, list, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.ht1.d) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.ht1.d) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f4, code lost:
    
        if (defpackage.jl40.l(r8.i, new defpackage.c4v(r5, r5, r3)) == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.ht1.d) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        u0 u0Var = (u0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = u0.m;
        if (b.F() || !jl40.l(u0Var.a, "")) {
            b.o(serialDescriptor, 0, u0Var.a);
        }
        if (!b.F()) {
            ht1 ht1Var = u0Var.b;
            ht1.Companion.getClass();
        }
        b.e(serialDescriptor, 1, ft1.a, u0Var.b);
        if (b.F() || u0Var.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), u0Var.c);
        }
        int i = 3;
        if (b.F() || !jl40.l(u0Var.d, new o8s0(15))) {
            b.e(serialDescriptor, 3, f8s0.a, u0Var.d);
        }
        if (b.F() || !jl40.l(u0Var.e, new SummaryPromotionsResponse.f(0))) {
            b.e(serialDescriptor, 4, a1.a, u0Var.e);
        }
        if (b.F() || u0Var.f != null) {
            b.g(serialDescriptor, 5, si70.a, u0Var.f);
        }
        if (!b.F()) {
            ht1 ht1Var2 = u0Var.g;
            ht1.Companion.getClass();
        }
        b.e(serialDescriptor, 6, ft1.a, u0Var.g);
        if (!b.F()) {
            ht1 ht1Var3 = u0Var.h;
            ht1.Companion.getClass();
        }
        b.e(serialDescriptor, 7, ft1.a, u0Var.h);
        if (!b.F()) {
            String str = null;
        }
        b.e(serialDescriptor, 8, a4v.a, u0Var.i);
        if (b.F() || !jl40.l(u0Var.j, new p7v(0))) {
            b.e(serialDescriptor, 9, b7v.a, u0Var.j);
        }
        if (b.F() || u0Var.k != null) {
            b.g(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), u0Var.k);
        }
        if (b.F() || u0Var.l != null) {
            b.g(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), u0Var.l);
        }
        b.c(serialDescriptor);
    }
}
