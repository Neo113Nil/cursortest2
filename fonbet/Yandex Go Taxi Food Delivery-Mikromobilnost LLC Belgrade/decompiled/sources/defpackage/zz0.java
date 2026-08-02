package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes12.dex */
public final class zz0 implements KSerializer {
    public static final zz0 a = new zz0();
    public static final o2f0 b = d6z.a("AddressMapPickerFlow", h2f0.o);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        String p = decoder.p();
        switch (p.hashCode()) {
            case -1857640538:
                if (p.equals("summary")) {
                    return uz0.a;
                }
                break;
            case -1785238953:
                if (p.equals("favorites")) {
                    return tz0.a;
                }
                break;
            case -1673292602:
                if (p.equals("superapp")) {
                    return vz0.a;
                }
                break;
            case 265988922:
                if (p.equals("taxi_main")) {
                    return wz0.a;
                }
                break;
        }
        return xz0.a;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        String str;
        yz0 yz0Var = (yz0) obj;
        if (jl40.l(yz0Var, vz0.a)) {
            str = "superapp";
        } else if (jl40.l(yz0Var, wz0.a)) {
            str = "taxi_main";
        } else if (jl40.l(yz0Var, uz0.a)) {
            str = "summary";
        } else {
            if (!jl40.l(yz0Var, tz0.a)) {
                if (jl40.l(yz0Var, xz0.a)) {
                    return;
                }
                w511.b();
                return;
            }
            str = "favorites";
        }
        encoder.t(str);
    }
}
