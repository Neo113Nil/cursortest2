package com.onesignal.core.internal.operations.impl;

import com.onesignal.common.modeling.k;
import com.onesignal.user.internal.operations.impl.executors.e;
import com.onesignal.user.internal.operations.impl.executors.h;
import com.onesignal.user.internal.operations.impl.executors.l;
import java.util.Set;
import kb.d;
import kb.f;
import kb.i;
import kb.m;
import kb.n;
import kb.o;
import kb.p;
import org.json.JSONObject;
import pc.j;
import z8.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c9.b bVar) {
        super("operations", bVar);
        j.e(bVar, "prefs");
    }

    private final boolean isValidOperation(JSONObject jSONObject) {
        if (!jSONObject.has("name")) {
            com.onesignal.debug.internal.logging.b.error$default("jsonObject must have 'name' attribute", null, 2, null);
            return false;
        }
        String string = jSONObject.getString("name");
        Set U = v6.a.U(e.LOGIN_USER, com.onesignal.user.internal.operations.impl.executors.c.LOGIN_USER_FROM_SUBSCRIPTION_USER);
        if (jSONObject.has("onesignalId") || U.contains(string)) {
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
    public g create(JSONObject jSONObject) {
        g bVar;
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
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.a.DELETE_ALIAS)) {
                        bVar = new kb.b();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1793763409:
                    if (string.equals(e.LOGIN_USER)) {
                        bVar = new f();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1606689981:
                    if (string.equals(l.TRACK_PURCHASE)) {
                        bVar = new kb.l();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1188793632:
                    if (string.equals(l.SET_PROPERTY)) {
                        bVar = new kb.j();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1080179201:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.j.DELETE_SUBSCRIPTION)) {
                        bVar = new kb.c();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -828599391:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.j.UPDATE_SUBSCRIPTION)) {
                        bVar = new p();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -516221659:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.a.SET_ALIAS)) {
                        bVar = new i();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -92337283:
                    if (string.equals(h.REFRESH_USER)) {
                        bVar = new kb.h();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 532599746:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.c.LOGIN_USER_FROM_SUBSCRIPTION_USER)) {
                        bVar = new kb.e();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 846157390:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.j.CREATE_SUBSCRIPTION)) {
                        bVar = new kb.a();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1707031487:
                    if (string.equals(com.onesignal.user.internal.operations.impl.executors.j.TRANSFER_SUBSCRIPTION)) {
                        bVar = new o();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1763437688:
                    if (string.equals(l.DELETE_TAG)) {
                        bVar = new d();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1852485538:
                    if (string.equals(l.TRACK_SESSION_END)) {
                        bVar = new m();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1983836079:
                    if (string.equals(l.SET_TAG)) {
                        bVar = new kb.k();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 2135250281:
                    if (string.equals(l.TRACK_SESSION_START)) {
                        bVar = new n();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
            }
        }
        throw new Exception("Unrecognized operation: " + string);
    }
}
