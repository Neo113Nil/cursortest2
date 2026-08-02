package com.onesignal.core.internal.operations.impl;

import V5.e;
import V5.f;
import V5.j;
import V5.l;
import V5.m;
import V5.o;
import V5.q;
import com.onesignal.common.modeling.k;
import com.onesignal.user.internal.operations.impl.executors.g;
import com.onesignal.user.internal.operations.impl.executors.i;
import com.onesignal.user.internal.operations.impl.executors.n;
import com.onesignal.user.internal.operations.impl.executors.p;
import java.util.Set;
import kotlin.jvm.internal.h;
import org.json.JSONObject;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class a extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(J4.b prefs) {
        super("operations", prefs);
        h.e(prefs, "prefs");
    }

    private final boolean isValidOperation(JSONObject jSONObject) {
        if (!jSONObject.has("name")) {
            com.onesignal.debug.internal.logging.b.error$default("jsonObject must have 'name' attribute", null, 2, null);
            return false;
        }
        String string = jSONObject.getString("name");
        Set G2 = com.bumptech.glide.d.G(i.LOGIN_USER, g.LOGIN_USER_FROM_SUBSCRIPTION_USER);
        if (jSONObject.has("onesignalId") || G2.contains(string)) {
            return true;
        }
        com.onesignal.debug.internal.logging.b.error$default(string + " jsonObject must have 'onesignalId' attribute", null, 2, null);
        return false;
    }

    public final void loadOperations() {
        load();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // com.onesignal.common.modeling.k, com.onesignal.common.modeling.c
    public H4.g create(JSONObject jSONObject) {
        H4.g bVar;
        if (jSONObject == null) {
            com.onesignal.debug.internal.logging.b.error$default("null jsonObject sent to OperationModelStore.create", null, 2, null);
            return null;
        }
        if (!isValidOperation(jSONObject)) {
            return null;
        }
        String string = jSONObject.getString("name");
        if (string != null) {
            switch (string.hashCode()) {
                case -1865677906:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.d.DELETE_ALIAS)) {
                        bVar = new V5.b();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1793763409:
                    if (string.equals(i.LOGIN_USER)) {
                        bVar = new f();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1606689981:
                    if (string.equals(p.TRACK_PURCHASE)) {
                        bVar = new m();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1188793632:
                    if (string.equals(p.SET_PROPERTY)) {
                        bVar = new j();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1080179201:
                    if (string.equals(n.DELETE_SUBSCRIPTION)) {
                        bVar = new V5.c();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -828599391:
                    if (string.equals(n.UPDATE_SUBSCRIPTION)) {
                        bVar = new q();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -713885378:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.a.CUSTOM_EVENT)) {
                        bVar = new l();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -516221659:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.d.SET_ALIAS)) {
                        bVar = new V5.i();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -92337283:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.l.REFRESH_USER)) {
                        bVar = new V5.h();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 532599746:
                    if (string.equals(g.LOGIN_USER_FROM_SUBSCRIPTION_USER)) {
                        bVar = new e();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 846157390:
                    if (string.equals(n.CREATE_SUBSCRIPTION)) {
                        bVar = new V5.a();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1707031487:
                    if (string.equals(n.TRANSFER_SUBSCRIPTION)) {
                        bVar = new V5.p();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1763437688:
                    if (string.equals(p.DELETE_TAG)) {
                        bVar = new V5.d();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1852485538:
                    if (string.equals(p.TRACK_SESSION_END)) {
                        bVar = new V5.n();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1983836079:
                    if (string.equals(p.SET_TAG)) {
                        bVar = new V5.k();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 2135250281:
                    if (string.equals(p.TRACK_SESSION_START)) {
                        bVar = new o();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
            }
        }
        throw new Exception(AbstractC5128c.f("Unrecognized operation: ", string));
    }
}
