package defpackage;

import kotlin.Result;
import kotlinx.serialization.json.b;

/* loaded from: classes2.dex */
public final class yy50 extends dcx {
    public static final yy50 d = new yy50(qoi0.a(xy50.class));

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
            case -1838656495:
                if (str.equals("STRING")) {
                    return f160.Companion.serializer();
                }
                break;
            case 72655:
                if (str.equals("INT")) {
                    return sv50.Companion.serializer();
                }
                break;
            case 2044650:
                if (str.equals("BOOL")) {
                    return wo50.Companion.serializer();
                }
                break;
            case 2022338513:
                if (str.equals("DOUBLE")) {
                    return cs50.Companion.serializer();
                }
                break;
        }
        w511.j("Can't find discriminator=", str, " for NetworkPrimitiveArgumentModel");
        return null;
    }
}
