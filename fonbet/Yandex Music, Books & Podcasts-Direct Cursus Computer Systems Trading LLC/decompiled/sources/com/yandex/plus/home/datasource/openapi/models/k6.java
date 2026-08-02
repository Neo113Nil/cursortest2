package com.yandex.plus.home.datasource.openapi.models;

import defpackage.b6e;
import defpackage.ern;
import defpackage.k4f;
import defpackage.r7o;
import defpackage.rj7;
import defpackage.t7o;
import defpackage.t9f;
import defpackage.w4f;
import defpackage.x4f;
import defpackage.z7o;

/* loaded from: classes5.dex */
public final class k6 extends k4f {
    public static final k6 d = new k6(ern.a(j6.class));

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // defpackage.k4f
    public final t9f c(w4f w4fVar) {
        Object t7oVar;
        w4fVar.getClass();
        try {
            r7o r7oVar = z7o.b;
            w4f w4fVar2 = (w4f) x4f.f(w4fVar).get("type");
            t7oVar = w4fVar2 != null ? x4f.g(w4fVar2).a() : null;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        if (t7oVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (z7o.a(t7oVar) != null) {
            b6e.l(w4fVar, "Invalid discriminator for element=");
            return null;
        }
        String str = (String) t7oVar;
        switch (str.hashCode()) {
            case -1838656495:
                if (str.equals("STRING")) {
                    return m7.Companion.serializer();
                }
                break;
            case 72655:
                if (str.equals("INT")) {
                    return w3.Companion.serializer();
                }
                break;
            case 2044650:
                if (str.equals("BOOL")) {
                    return a0.Companion.serializer();
                }
                break;
            case 2022338513:
                if (str.equals("DOUBLE")) {
                    return a2.Companion.serializer();
                }
                break;
        }
        rj7.i(str, " for NetworkPrimitiveArgumentModel", "Can't find discriminator=");
        return null;
    }
}
