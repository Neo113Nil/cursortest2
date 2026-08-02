package ru.yandex.taxi.communications.model;

import defpackage.a4v;
import defpackage.auu0;
import defpackage.c4v;
import defpackage.dj2;
import defpackage.f8s0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.m0e;
import defpackage.myi;
import defpackage.ny61;
import defpackage.nzs;
import defpackage.o8s0;
import defpackage.qke;
import defpackage.sjd;
import defpackage.t0e;
import defpackage.ug2;
import defpackage.uxs;
import defpackage.v1e;
import defpackage.w7s;
import defpackage.yjd;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.model.CommunicationItem", aVar, 11);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("animation", true);
        pluginGeneratedSerialDescriptor.j("widgets", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        pluginGeneratedSerialDescriptor.j("configuration", true);
        pluginGeneratedSerialDescriptor.j("display_on", true);
        pluginGeneratedSerialDescriptor.j("analytics_payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = CommunicationItem.l;
        KSerializer n = qke.n(dj2.e);
        KSerializer n2 = qke.n((KSerializer) i3yVarArr[9].getValue());
        KSerializer n3 = qke.n((KSerializer) i3yVarArr[10].getValue());
        w7s w7sVar = w7s.a;
        a4v a4vVar = a4v.a;
        return new KSerializer[]{auu0.a, w7sVar, w7sVar, a4vVar, a4vVar, n, c.a, f8s0.a, v1e.e, n2, n3};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = CommunicationItem.l;
        b.getClass();
        Map map = null;
        jsq0 jsq0Var = null;
        t0e t0eVar = null;
        boolean z2 = true;
        o8s0 o8s0Var = null;
        int i = 0;
        String str = null;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        c4v c4vVar = null;
        c4v c4vVar2 = null;
        ug2 ug2Var = null;
        CommunicationItem.a aVar = null;
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
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    formattedText2 = (FormattedText) b.A(serialDescriptor, 2, w7s.a, formattedText2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    c4vVar = (c4v) b.A(serialDescriptor, 3, a4v.a, c4vVar);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    c4vVar2 = (c4v) b.A(serialDescriptor, 4, a4v.a, c4vVar2);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    ug2Var = (ug2) b.s(serialDescriptor, 5, dj2.e, ug2Var);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    aVar = (CommunicationItem.a) b.A(serialDescriptor, 6, c.a, aVar);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    o8s0Var = (o8s0) b.A(serialDescriptor, 7, f8s0.a, o8s0Var);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    t0eVar = (t0e) b.A(serialDescriptor, 8, v1e.e, t0eVar);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    jsq0Var = (jsq0) b.s(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), jsq0Var);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    map = (Map) b.s(serialDescriptor, 10, (myi) i3yVarArr[10].getValue(), map);
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
        return new CommunicationItem(i, str, formattedText, formattedText2, c4vVar, c4vVar2, ug2Var, aVar, o8s0Var, t0eVar, jsq0Var, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00af, code lost:
    
        if (defpackage.jl40.l(r1, ru.yandex.taxi.communications.model.CommunicationItem.a.j) == false) goto L43;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        CommunicationItem communicationItem = (CommunicationItem) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CommunicationItem.l;
        if (b.F() || !jl40.l(communicationItem.a, "")) {
            b.o(serialDescriptor, 0, communicationItem.a);
        }
        if (b.F() || !nzs.t(0, communicationItem.b)) {
            b.e(serialDescriptor, 1, w7s.a, communicationItem.b);
        }
        if (b.F() || !nzs.t(0, communicationItem.c)) {
            b.e(serialDescriptor, 2, w7s.a, communicationItem.c);
        }
        int i = 3;
        String str = null;
        if (b.F() || !jl40.l(communicationItem.d, new c4v(str, str, i))) {
            b.e(serialDescriptor, 3, a4v.a, communicationItem.d);
        }
        if (b.F() || !jl40.l(communicationItem.e, new c4v(str, str, i))) {
            b.e(serialDescriptor, 4, a4v.a, communicationItem.e);
        }
        if (b.F() || communicationItem.f != null) {
            b.g(serialDescriptor, 5, dj2.e, communicationItem.f);
        }
        if (!b.F()) {
            CommunicationItem.a aVar = communicationItem.g;
            CommunicationItem.a.Companion.getClass();
        }
        b.e(serialDescriptor, 6, c.a, communicationItem.g);
        if (b.F() || !jl40.l(communicationItem.h, new o8s0(15))) {
            b.e(serialDescriptor, 7, f8s0.a, communicationItem.h);
        }
        if (b.F() || !jl40.l(communicationItem.i, new m0e(0))) {
            b.e(serialDescriptor, 8, v1e.e, communicationItem.i);
        }
        if (b.F() || communicationItem.j != null) {
            b.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), communicationItem.j);
        }
        if (b.F() || communicationItem.k != null) {
            b.g(serialDescriptor, 10, (KSerializer) i3yVarArr[10].getValue(), communicationItem.k);
        }
        b.c(serialDescriptor);
    }
}
