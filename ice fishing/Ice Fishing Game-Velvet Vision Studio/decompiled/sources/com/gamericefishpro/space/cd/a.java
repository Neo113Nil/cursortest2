package com.gamericefishpro.space.cd;

import com.gamericefishpro.space.dh.d;
import com.gamericefishpro.space.dh.f;
import com.gamericefishpro.space.dh.h;
import com.gamericefishpro.space.dh.i;
import com.gamericefishpro.space.dh.j;
import com.gamericefishpro.space.dh.m;
import com.gamericefishpro.space.dh.o;
import com.gamericefishpro.space.dh.p;
import com.gamericefishpro.space.dh.q;
import com.gamericefishpro.space.eh.e;
import com.gamericefishpro.space.eh.g;
import com.gamericefishpro.space.eh.l;
import com.gamericefishpro.space.eh.n;
import com.gamericefishpro.space.fc.k;
import com.gamericefishpro.space.ph.v;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.gamericefishpro.space.gd.b prefs) {
        super("operations", prefs);
        Intrinsics.checkNotNullParameter(prefs, "prefs");
    }

    private final boolean isValidOperation(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("name")) {
            com.gamericefishpro.space.od.b.error$default("jsonObject must have 'name' attribute", null, 2, null);
            return false;
        }
        String string = jSONObject.getString("name");
        String[] elements = {g.LOGIN_USER, e.LOGIN_USER_FROM_SUBSCRIPTION_USER};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set setX = v.x(elements);
        if (jSONObject.has("onesignalId") || setX.contains(string)) {
            return true;
        }
        com.gamericefishpro.space.od.b.error$default(string + " jsonObject must have 'onesignalId' attribute", null, 2, null);
        return false;
    }

    public final void loadOperations() {
        load();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.gamericefishpro.space.fc.k, com.gamericefishpro.space.fc.c
    public com.gamericefishpro.space.bd.g create(JSONObject jSONObject) throws Exception {
        com.gamericefishpro.space.bd.g bVar;
        if (jSONObject == null) {
            com.gamericefishpro.space.od.b.error$default("null jsonObject sent to OperationModelStore.create", null, 2, null);
            return null;
        }
        if (!isValidOperation(jSONObject)) {
            return null;
        }
        String string = jSONObject.getString("name");
        if (string != null) {
            switch (string.hashCode()) {
                case -1865677906:
                    if (string.equals(com.gamericefishpro.space.eh.c.DELETE_ALIAS)) {
                        bVar = new com.gamericefishpro.space.dh.b();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1793763409:
                    if (string.equals(g.LOGIN_USER)) {
                        bVar = new f();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1606689981:
                    if (string.equals(n.TRACK_PURCHASE)) {
                        bVar = new m();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1188793632:
                    if (string.equals(n.SET_PROPERTY)) {
                        bVar = new j();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -1080179201:
                    if (string.equals(l.DELETE_SUBSCRIPTION)) {
                        bVar = new com.gamericefishpro.space.dh.c();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -828599391:
                    if (string.equals(l.UPDATE_SUBSCRIPTION)) {
                        bVar = new q();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -713885378:
                    if (string.equals(com.gamericefishpro.space.eh.a.CUSTOM_EVENT)) {
                        bVar = new com.gamericefishpro.space.dh.l();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -516221659:
                    if (string.equals(com.gamericefishpro.space.eh.c.SET_ALIAS)) {
                        bVar = new i();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case -92337283:
                    if (string.equals(com.gamericefishpro.space.eh.j.REFRESH_USER)) {
                        bVar = new h();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 532599746:
                    if (string.equals(e.LOGIN_USER_FROM_SUBSCRIPTION_USER)) {
                        bVar = new com.gamericefishpro.space.dh.e();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 846157390:
                    if (string.equals(l.CREATE_SUBSCRIPTION)) {
                        bVar = new com.gamericefishpro.space.dh.a();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1707031487:
                    if (string.equals(l.TRANSFER_SUBSCRIPTION)) {
                        bVar = new p();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1763437688:
                    if (string.equals(n.DELETE_TAG)) {
                        bVar = new d();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1852485538:
                    if (string.equals(n.TRACK_SESSION_END)) {
                        bVar = new com.gamericefishpro.space.dh.n();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 1983836079:
                    if (string.equals(n.SET_TAG)) {
                        bVar = new com.gamericefishpro.space.dh.k();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
                case 2135250281:
                    if (string.equals(n.TRACK_SESSION_START)) {
                        bVar = new o();
                        bVar.initializeFromJson(jSONObject);
                        return bVar;
                    }
                    break;
            }
        }
        throw new Exception(com.gamericefishpro.space.m5.a.u("Unrecognized operation: ", string));
    }
}
