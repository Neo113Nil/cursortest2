package defpackage;

import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final /* synthetic */ class wg40 implements uxs {
    public static final wg40 a;
    private static final SerialDescriptor descriptor;

    static {
        wg40 wg40Var = new wg40();
        a = wg40Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.trains.schedule.dto.MtTrainSchedulerDto", wg40Var, 13);
        pluginGeneratedSerialDescriptor.j("departure_time", true);
        pluginGeneratedSerialDescriptor.j("arrival_time", true);
        pluginGeneratedSerialDescriptor.j("departure_track", true);
        pluginGeneratedSerialDescriptor.j("arrival_track", true);
        pluginGeneratedSerialDescriptor.j("route_time", true);
        pluginGeneratedSerialDescriptor.j("transport_type", true);
        pluginGeneratedSerialDescriptor.j("route_name", true);
        pluginGeneratedSerialDescriptor.j("notification", true);
        pluginGeneratedSerialDescriptor.j("purchase_button_title", true);
        pluginGeneratedSerialDescriptor.j("is_trip_creating_available", true);
        pluginGeneratedSerialDescriptor.j("is_active", true);
        pluginGeneratedSerialDescriptor.j("payload", true);
        pluginGeneratedSerialDescriptor.j("details_payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = yg40.n;
        w7s w7sVar = w7s.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), qke.n(w7sVar), tf40.a, qke.n(w7sVar), z96Var, z96Var, i3yVarArr[11].getValue(), i3yVarArr[12].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        i3y[] i3yVarArr2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr3 = yg40.n;
        b.getClass();
        Map map = null;
        Map map2 = null;
        FormattedText formattedText = null;
        boolean z2 = true;
        vf40 vf40Var = null;
        int i = 0;
        FormattedText formattedText2 = null;
        FormattedText formattedText3 = null;
        FormattedText formattedText4 = null;
        FormattedText formattedText5 = null;
        FormattedText formattedText6 = null;
        FormattedText formattedText7 = null;
        FormattedText formattedText8 = null;
        boolean z3 = false;
        boolean z4 = false;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                case 0:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText2 = (FormattedText) b.s(serialDescriptor, 0, w7s.a, formattedText2);
                    i |= 1;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 1:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText3 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText3);
                    i |= 2;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 2:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText4 = (FormattedText) b.s(serialDescriptor, 2, w7s.a, formattedText4);
                    i |= 4;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 3:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText5 = (FormattedText) b.s(serialDescriptor, 3, w7s.a, formattedText5);
                    i |= 8;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 4:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText6 = (FormattedText) b.s(serialDescriptor, 4, w7s.a, formattedText6);
                    i |= 16;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 5:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText7 = (FormattedText) b.s(serialDescriptor, 5, w7s.a, formattedText7);
                    i |= 32;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 6:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText8 = (FormattedText) b.s(serialDescriptor, 6, w7s.a, formattedText8);
                    i |= 64;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 7:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    vf40Var = (vf40) b.A(serialDescriptor, 7, tf40.a, vf40Var);
                    i |= 128;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 8:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    formattedText = (FormattedText) b.s(serialDescriptor, 8, w7s.a, formattedText);
                    i |= 256;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 9:
                    i3yVarArr2 = i3yVarArr3;
                    z3 = b.C(serialDescriptor, 9);
                    i |= 512;
                    i3yVarArr3 = i3yVarArr2;
                case 10:
                    i3yVarArr2 = i3yVarArr3;
                    z4 = b.C(serialDescriptor, 10);
                    i |= 1024;
                    i3yVarArr3 = i3yVarArr2;
                case 11:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    map2 = (Map) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), map2);
                    i |= 2048;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 12:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    map = (Map) b.A(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), map);
                    i |= 4096;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new yg40(i, formattedText2, formattedText3, formattedText4, formattedText5, formattedText6, formattedText7, formattedText8, vf40Var, formattedText, z3, z4, map2, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a3, code lost:
    
        if (defpackage.jl40.l(r1, defpackage.vf40.c) == false) goto L49;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        yg40 yg40Var = (yg40) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = yg40.n;
        if (b.F() || yg40Var.a != null) {
            b.g(serialDescriptor, 0, w7s.a, yg40Var.a);
        }
        if (b.F() || yg40Var.b != null) {
            b.g(serialDescriptor, 1, w7s.a, yg40Var.b);
        }
        if (b.F() || yg40Var.c != null) {
            b.g(serialDescriptor, 2, w7s.a, yg40Var.c);
        }
        if (b.F() || yg40Var.d != null) {
            b.g(serialDescriptor, 3, w7s.a, yg40Var.d);
        }
        if (b.F() || yg40Var.e != null) {
            b.g(serialDescriptor, 4, w7s.a, yg40Var.e);
        }
        if (b.F() || yg40Var.f != null) {
            b.g(serialDescriptor, 5, w7s.a, yg40Var.f);
        }
        if (b.F() || yg40Var.g != null) {
            b.g(serialDescriptor, 6, w7s.a, yg40Var.g);
        }
        if (!b.F()) {
            vf40 vf40Var = yg40Var.h;
            vf40.Companion.getClass();
        }
        b.e(serialDescriptor, 7, tf40.a, yg40Var.h);
        if (b.F() || yg40Var.i != null) {
            b.g(serialDescriptor, 8, w7s.a, yg40Var.i);
        }
        if (b.F() || !yg40Var.j) {
            b.n(serialDescriptor, 9, yg40Var.j);
        }
        if (b.F() || yg40Var.k) {
            b.n(serialDescriptor, 10, yg40Var.k);
        }
        if (b.F() || !jl40.l(yg40Var.l, b.f())) {
            b.e(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), yg40Var.l);
        }
        if (b.F() || !jl40.l(yg40Var.m, b.f())) {
            b.e(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), yg40Var.m);
        }
        b.c(serialDescriptor);
    }
}
