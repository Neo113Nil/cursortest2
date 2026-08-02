package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class xk20 implements uxs {
    public static final xk20 a;
    private static final SerialDescriptor descriptor;

    static {
        xk20 xk20Var = new xk20();
        a = xk20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.api.model.MobAlgorithmSettings", xk20Var, 17);
        pluginGeneratedSerialDescriptor.j("forget_current_proxies_on_update", true);
        pluginGeneratedSerialDescriptor.j("notifications_cache_limit", true);
        pluginGeneratedSerialDescriptor.j("notifications_ttl_seconds", true);
        pluginGeneratedSerialDescriptor.j("update_config_period_seconds", true);
        pluginGeneratedSerialDescriptor.j("pause_before_next_config_update_attempt_seconds", true);
        pluginGeneratedSerialDescriptor.j("availability_check_period_seconds", true);
        pluginGeneratedSerialDescriptor.j("availability_full_check_period_seconds", true);
        pluginGeneratedSerialDescriptor.j("availability_check_strategy", true);
        pluginGeneratedSerialDescriptor.j("contour_availability_check_strategy", true);
        pluginGeneratedSerialDescriptor.j("current_contour_ttl_seconds", true);
        pluginGeneratedSerialDescriptor.j("availability_report_period_seconds", true);
        pluginGeneratedSerialDescriptor.j("detailed_report_additional_hosts", true);
        pluginGeneratedSerialDescriptor.j("network_diagnostics_traceroute_timeout", true);
        pluginGeneratedSerialDescriptor.j("network_report_check_interval", true);
        pluginGeneratedSerialDescriptor.j("ping_timeout_seconds", true);
        pluginGeneratedSerialDescriptor.j("vpn_notifications_reload_enabled", true);
        pluginGeneratedSerialDescriptor.j("network_type_notifications_reload_enabled", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = zk20.r;
        z96 z96Var = z96.a;
        KSerializer n = qke.n(z96Var);
        h6w h6wVar = h6w.a;
        return new KSerializer[]{n, qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n((KSerializer) i3yVarArr[7].getValue()), qke.n((KSerializer) i3yVarArr[8].getValue()), qke.n(h6wVar), qke.n(h6wVar), qke.n((KSerializer) i3yVarArr[11].getValue()), qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(z96Var), qke.n(z96Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        Integer num;
        Integer num2;
        int i;
        List list;
        Integer num3;
        Boolean bool;
        Integer num4;
        Integer num5;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = zk20.r;
        b.getClass();
        List list2 = null;
        Integer num6 = null;
        Integer num7 = null;
        List list3 = null;
        Integer num8 = null;
        List list4 = null;
        int i2 = 0;
        Integer num9 = null;
        Integer num10 = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num11 = null;
        Integer num12 = null;
        Integer num13 = null;
        boolean z = true;
        Boolean bool4 = null;
        Integer num14 = null;
        Integer num15 = null;
        Integer num16 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    list = list2;
                    num3 = num12;
                    bool = bool4;
                    z = false;
                    num6 = num6;
                    num12 = num3;
                    bool4 = bool;
                    list2 = list;
                case 0:
                    list = list2;
                    num3 = num12;
                    bool = (Boolean) b.s(serialDescriptor, 0, z96.a, bool4);
                    i2 |= 1;
                    num6 = num6;
                    num11 = num11;
                    num12 = num3;
                    bool4 = bool;
                    list2 = list;
                case 1:
                    list = list2;
                    num4 = num11;
                    num5 = num12;
                    num14 = (Integer) b.s(serialDescriptor, 1, h6w.a, num14);
                    i2 |= 2;
                    num15 = num15;
                    num11 = num4;
                    num12 = num5;
                    list2 = list;
                case 2:
                    list = list2;
                    num4 = num11;
                    num5 = num12;
                    num15 = (Integer) b.s(serialDescriptor, 2, h6w.a, num15);
                    i2 |= 4;
                    num11 = num4;
                    num12 = num5;
                    list2 = list;
                case 3:
                    list = list2;
                    num5 = num12;
                    num4 = num11;
                    num16 = (Integer) b.s(serialDescriptor, 3, h6w.a, num16);
                    i2 |= 8;
                    num11 = num4;
                    num12 = num5;
                    list2 = list;
                case 4:
                    list = list2;
                    num5 = num12;
                    num11 = (Integer) b.s(serialDescriptor, 4, h6w.a, num11);
                    i2 |= 16;
                    num12 = num5;
                    list2 = list;
                case 5:
                    list = list2;
                    num12 = (Integer) b.s(serialDescriptor, 5, h6w.a, num12);
                    i2 |= 32;
                    num11 = num11;
                    list2 = list;
                case 6:
                    num = num11;
                    num2 = num12;
                    num13 = (Integer) b.s(serialDescriptor, 6, h6w.a, num13);
                    i2 |= 64;
                    num11 = num;
                    num12 = num2;
                case 7:
                    num = num11;
                    num2 = num12;
                    list4 = (List) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list4);
                    i2 |= 128;
                    num11 = num;
                    num12 = num2;
                case 8:
                    num = num11;
                    num2 = num12;
                    list3 = (List) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), list3);
                    i2 |= 256;
                    num11 = num;
                    num12 = num2;
                case 9:
                    num = num11;
                    num2 = num12;
                    num7 = (Integer) b.s(serialDescriptor, 9, h6w.a, num7);
                    i2 |= 512;
                    num11 = num;
                    num12 = num2;
                case 10:
                    num = num11;
                    num2 = num12;
                    num6 = (Integer) b.s(serialDescriptor, 10, h6w.a, num6);
                    i2 |= 1024;
                    num11 = num;
                    num12 = num2;
                case 11:
                    num = num11;
                    num2 = num12;
                    list2 = (List) b.s(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), list2);
                    i2 |= 2048;
                    num11 = num;
                    num12 = num2;
                case 12:
                    num = num11;
                    num2 = num12;
                    num8 = (Integer) b.s(serialDescriptor, 12, h6w.a, num8);
                    i2 |= 4096;
                    num11 = num;
                    num12 = num2;
                case 13:
                    num = num11;
                    num2 = num12;
                    num9 = (Integer) b.s(serialDescriptor, 13, h6w.a, num9);
                    i2 |= 8192;
                    num11 = num;
                    num12 = num2;
                case 14:
                    num = num11;
                    num2 = num12;
                    num10 = (Integer) b.s(serialDescriptor, 14, h6w.a, num10);
                    i2 |= 16384;
                    num11 = num;
                    num12 = num2;
                case 15:
                    num = num11;
                    num2 = num12;
                    bool2 = (Boolean) b.s(serialDescriptor, 15, z96.a, bool2);
                    i = 32768;
                    i2 |= i;
                    num11 = num;
                    num12 = num2;
                case 16:
                    num = num11;
                    num2 = num12;
                    bool3 = (Boolean) b.s(serialDescriptor, 16, z96.a, bool3);
                    i = 65536;
                    i2 |= i;
                    num11 = num;
                    num12 = num2;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        List list5 = list2;
        Integer num17 = num12;
        b.c(serialDescriptor);
        return new zk20(i2, bool4, num14, num15, num16, num11, num17, num13, list4, list3, num7, num6, list5, num8, num9, num10, bool2, bool3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Integer num;
        Integer num2;
        zk20 zk20Var = (zk20) obj;
        Boolean bool = zk20Var.q;
        Boolean bool2 = zk20Var.p;
        Integer num3 = zk20Var.o;
        Integer num4 = zk20Var.n;
        Integer num5 = zk20Var.m;
        List list = zk20Var.l;
        Integer num6 = zk20Var.k;
        Integer num7 = zk20Var.j;
        List list2 = zk20Var.i;
        List list3 = zk20Var.h;
        Integer num8 = zk20Var.g;
        Integer num9 = zk20Var.f;
        Integer num10 = zk20Var.e;
        Integer num11 = zk20Var.d;
        Integer num12 = zk20Var.c;
        Integer num13 = zk20Var.b;
        Boolean bool3 = zk20Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = zk20.r;
        if (!b.F() && bool3 == null) {
            num = num4;
            num2 = num5;
        } else {
            num = num4;
            num2 = num5;
            b.g(serialDescriptor, 0, z96.a, bool3);
        }
        if (b.F() || num13 != null) {
            b.g(serialDescriptor, 1, h6w.a, num13);
        }
        if (b.F() || num12 != null) {
            b.g(serialDescriptor, 2, h6w.a, num12);
        }
        if (b.F() || num11 != null) {
            b.g(serialDescriptor, 3, h6w.a, num11);
        }
        if (b.F() || num10 != null) {
            b.g(serialDescriptor, 4, h6w.a, num10);
        }
        if (b.F() || num9 != null) {
            b.g(serialDescriptor, 5, h6w.a, num9);
        }
        if (b.F() || num8 != null) {
            b.g(serialDescriptor, 6, h6w.a, num8);
        }
        if (b.F() || list3 != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), list3);
        }
        if (b.F() || list2 != null) {
            b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), list2);
        }
        if (b.F() || num7 != null) {
            b.g(serialDescriptor, 9, h6w.a, num7);
        }
        if (b.F() || num6 != null) {
            b.g(serialDescriptor, 10, h6w.a, num6);
        }
        if (b.F() || list != null) {
            b.g(serialDescriptor, 11, (KSerializer) i3yVarArr[11].getValue(), list);
        }
        if (b.F() || num2 != null) {
            b.g(serialDescriptor, 12, h6w.a, num2);
        }
        if (b.F() || num != null) {
            b.g(serialDescriptor, 13, h6w.a, num);
        }
        if (b.F() || num3 != null) {
            b.g(serialDescriptor, 14, h6w.a, num3);
        }
        if (b.F() || bool2 != null) {
            b.g(serialDescriptor, 15, z96.a, bool2);
        }
        if (b.F() || bool != null) {
            b.g(serialDescriptor, 16, z96.a, bool);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
