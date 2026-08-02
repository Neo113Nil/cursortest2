package defpackage;

import kotlin.Result;
import kotlinx.serialization.json.b;

/* loaded from: classes2.dex */
public final class sy50 extends dcx {
    public static final sy50 d = new sy50(qoi0.a(ry50.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.dcx
    public final myi c(b bVar) {
        Object failure;
        try {
            b bVar2 = (b) qcx.m(bVar).get("type");
            failure = bVar2 != null ? qcx.n(bVar2).a() : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (Result.a(failure) != null) {
            yhl.d(bVar, "Invalid discriminator for element=");
            return null;
        }
        String str = (String) failure;
        switch (str.hashCode()) {
            case -2130092504:
                if (str.equals("IN_SET")) {
                    return lv50.Companion.serializer();
                }
                break;
            case 77491:
                if (str.equals("NOT")) {
                    return px50.Companion.serializer();
                }
                break;
            case 215180831:
                if (str.equals("CONTAINS")) {
                    return nq50.Companion.serializer();
                }
                break;
            case 782694408:
                if (str.equals("BOOLEAN")) {
                    return zo50.Companion.serializer();
                }
                break;
            case 1668466885:
                if (str.equals("COMPARE")) {
                    return zp50.Companion.serializer();
                }
                break;
            case 1810683778:
                if (str.equals("IS_EXIST")) {
                    return aw50.Companion.serializer();
                }
                break;
            case 1933440341:
                if (str.equals("ALL_OF")) {
                    return go50.Companion.serializer();
                }
                break;
            case 1935674666:
                if (str.equals("ANY_OF")) {
                    return jo50.Companion.serializer();
                }
                break;
        }
        w511.j("Can't find discriminator=", str, " for NetworkPredicateModel");
        return null;
    }
}
