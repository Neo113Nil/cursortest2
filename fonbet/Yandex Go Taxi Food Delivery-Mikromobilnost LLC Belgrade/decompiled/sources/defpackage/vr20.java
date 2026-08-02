package defpackage;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes8.dex */
public final /* synthetic */ class vr20 implements uxs {
    public static final vr20 a;
    private static final SerialDescriptor descriptor;

    static {
        vr20 vr20Var = new vr20();
        a = vr20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.datastore.MobStorageData", vr20Var, 16);
        pluginGeneratedSerialDescriptor.j("mob_id", true);
        pluginGeneratedSerialDescriptor.j("country_iso", true);
        pluginGeneratedSerialDescriptor.j("current_contour_state", true);
        pluginGeneratedSerialDescriptor.j("ip_to_geo_country_iso", true);
        pluginGeneratedSerialDescriptor.j("notifications_polling_interval", true);
        pluginGeneratedSerialDescriptor.j("metrica_data", true);
        pluginGeneratedSerialDescriptor.j("notifications", true);
        pluginGeneratedSerialDescriptor.j("hosts_for_detail_report", true);
        pluginGeneratedSerialDescriptor.j("availability_report_state", true);
        pluginGeneratedSerialDescriptor.j("vpn_state", true);
        pluginGeneratedSerialDescriptor.j("network_type_state", true);
        pluginGeneratedSerialDescriptor.j("cron_job_states", true);
        pluginGeneratedSerialDescriptor.j("trigger_job_states", true);
        pluginGeneratedSerialDescriptor.j("completed_config_migration_tags", true);
        pluginGeneratedSerialDescriptor.j(ConfigConstants.CONFIG, true);
        pluginGeneratedSerialDescriptor.j("selected_proxies", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = xr20.q;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), qke.n(auu0Var), qke.n(rn20.a), qke.n(auu0Var), qke.n(h6w.a), qke.n(bp20.a), i3yVarArr[6].getValue(), i3yVarArr[7].getValue(), qke.n(cm20.a), qke.n(as20.a), qke.n(ip20.a), i3yVarArr[11].getValue(), i3yVarArr[12].getValue(), i3yVarArr[13].getValue(), qke.n(rm20.a), i3yVarArr[15].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        Map map;
        String str;
        Integer num;
        String str2;
        Map map2;
        Integer num2;
        String str3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = xr20.q;
        b.getClass();
        Map map3 = null;
        kp20 kp20Var = null;
        cs20 cs20Var = null;
        em20 em20Var = null;
        Map map4 = null;
        List list = null;
        int i = 0;
        Set set = null;
        tm20 tm20Var = null;
        List list2 = null;
        String str4 = null;
        Integer num3 = null;
        dp20 dp20Var = null;
        List list3 = null;
        boolean z = true;
        String str5 = null;
        String str6 = null;
        tn20 tn20Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    map2 = map3;
                    num2 = num3;
                    str3 = str5;
                    z = false;
                    kp20Var = kp20Var;
                    num3 = num2;
                    str5 = str3;
                    map3 = map2;
                case 0:
                    map2 = map3;
                    num2 = num3;
                    str3 = (String) b.s(serialDescriptor, 0, auu0.a, str5);
                    i |= 1;
                    kp20Var = kp20Var;
                    str4 = str4;
                    num3 = num2;
                    str5 = str3;
                    map3 = map2;
                case 1:
                    map = map3;
                    str = str4;
                    num = num3;
                    str6 = (String) b.s(serialDescriptor, 1, auu0.a, str6);
                    i |= 2;
                    tn20Var = tn20Var;
                    str4 = str;
                    map3 = map;
                    num3 = num;
                case 2:
                    map = map3;
                    num = num3;
                    str = str4;
                    tn20Var = (tn20) b.s(serialDescriptor, 2, rn20.a, tn20Var);
                    i |= 4;
                    str4 = str;
                    map3 = map;
                    num3 = num;
                case 3:
                    map = map3;
                    num = num3;
                    str4 = (String) b.s(serialDescriptor, 3, auu0.a, str4);
                    i |= 8;
                    map3 = map;
                    num3 = num;
                case 4:
                    map2 = map3;
                    num3 = (Integer) b.s(serialDescriptor, 4, h6w.a, num3);
                    i |= 16;
                    str4 = str4;
                    map3 = map2;
                case 5:
                    str2 = str4;
                    num = num3;
                    dp20Var = (dp20) b.s(serialDescriptor, 5, bp20.a, dp20Var);
                    i |= 32;
                    str4 = str2;
                    num3 = num;
                case 6:
                    str2 = str4;
                    num = num3;
                    list3 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list3);
                    i |= 64;
                    str4 = str2;
                    num3 = num;
                case 7:
                    str2 = str4;
                    num = num3;
                    list = (List) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    str4 = str2;
                    num3 = num;
                case 8:
                    str2 = str4;
                    num = num3;
                    em20Var = (em20) b.s(serialDescriptor, 8, cm20.a, em20Var);
                    i |= 256;
                    str4 = str2;
                    num3 = num;
                case 9:
                    str2 = str4;
                    num = num3;
                    cs20Var = (cs20) b.s(serialDescriptor, 9, as20.a, cs20Var);
                    i |= 512;
                    str4 = str2;
                    num3 = num;
                case 10:
                    str2 = str4;
                    num = num3;
                    kp20Var = (kp20) b.s(serialDescriptor, 10, ip20.a, kp20Var);
                    i |= 1024;
                    str4 = str2;
                    num3 = num;
                case 11:
                    str2 = str4;
                    num = num3;
                    map3 = (Map) b.A(serialDescriptor, 11, (myi) i3yVarArr[11].getValue(), map3);
                    i |= 2048;
                    str4 = str2;
                    num3 = num;
                case 12:
                    str2 = str4;
                    num = num3;
                    map4 = (Map) b.A(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), map4);
                    i |= 4096;
                    str4 = str2;
                    num3 = num;
                case 13:
                    str2 = str4;
                    num = num3;
                    set = (Set) b.A(serialDescriptor, 13, (myi) i3yVarArr[13].getValue(), set);
                    i |= 8192;
                    str4 = str2;
                    num3 = num;
                case 14:
                    str2 = str4;
                    num = num3;
                    tm20Var = (tm20) b.s(serialDescriptor, 14, rm20.a, tm20Var);
                    i |= 16384;
                    str4 = str2;
                    num3 = num;
                case 15:
                    str2 = str4;
                    num = num3;
                    list2 = (List) b.A(serialDescriptor, 15, (myi) i3yVarArr[15].getValue(), list2);
                    i |= 32768;
                    str4 = str2;
                    num3 = num;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        Map map5 = map3;
        Integer num4 = num3;
        b.c(serialDescriptor);
        return new xr20(i, str5, str6, tn20Var, str4, num4, dp20Var, list3, list, em20Var, cs20Var, kp20Var, map5, map4, set, tm20Var, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v13 java.util.Map, still in use, count: 2, list:
          (r4v13 java.util.Map) from 0x0127: INVOKE 
          (r4v13 java.util.Map)
          (wrap:java.util.Map:0x0121: INVOKE  STATIC call: kotlin.collections.b.f():java.util.Map A[MD:():java.util.Map (m), WRAPPED])
         STATIC call: jl40.l(java.lang.Object, java.lang.Object):boolean A[MD:(java.lang.Object, java.lang.Object):boolean (m), WRAPPED]
          (r4v13 java.util.Map) from 0x012d: PHI (r4v21 java.util.Map) = (r4v13 java.util.Map) binds: [B:65:0x012b] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // kotlinx.serialization.KSerializer
    public final void serialize(kotlinx.serialization.encoding.Encoder r20, java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vr20.serialize(kotlinx.serialization.encoding.Encoder, java.lang.Object):void");
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
