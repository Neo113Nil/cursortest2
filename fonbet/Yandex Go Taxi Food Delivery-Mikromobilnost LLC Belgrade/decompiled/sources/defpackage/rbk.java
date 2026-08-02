package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public final class rbk implements zsq0, nyi {
    public final JsonParserComponent a;

    public rbk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String str;
        Object qckVar;
        Object gckVar;
        Object fckVar;
        String R = wwg.R(jSONObject);
        hex hexVar = yf90Var.b().get(R);
        wck wckVar = hexVar instanceof wck ? (wck) hexVar : null;
        if (wckVar == null) {
            str = R;
        } else if (wckVar instanceof zbk) {
            str = "animator_start";
        } else if (wckVar instanceof ack) {
            str = "animator_stop";
        } else if (wckVar instanceof bck) {
            str = "array_insert_value";
        } else if (wckVar instanceof cck) {
            str = "array_remove_value";
        } else if (wckVar instanceof dck) {
            str = "array_set_value";
        } else if (wckVar instanceof eck) {
            str = "clear_focus";
        } else if (wckVar instanceof fck) {
            str = "copy_to_clipboard";
        } else if (wckVar instanceof hck) {
            str = "dict_set_value";
        } else if (wckVar instanceof ick) {
            str = "download";
        } else if (wckVar instanceof jck) {
            str = "focus_element";
        } else if (wckVar instanceof kck) {
            str = "hide_tooltip";
        } else if (wckVar instanceof lck) {
            str = "scroll_by";
        } else if (wckVar instanceof mck) {
            str = "scroll_to";
        } else if (wckVar instanceof ock) {
            str = "set_state";
        } else if (wckVar instanceof pck) {
            str = "set_stored_value";
        } else if (wckVar instanceof qck) {
            str = "set_variable";
        } else if (wckVar instanceof rck) {
            str = "show_tooltip";
        } else if (wckVar instanceof sck) {
            str = "submit";
        } else if (wckVar instanceof tck) {
            str = "timer";
        } else if (wckVar instanceof uck) {
            str = "update_structure";
        } else if (wckVar instanceof vck) {
            str = MediaStreamTrack.VIDEO_TRACK_KIND;
        } else if (wckVar instanceof gck) {
            str = "custom";
        } else {
            if (!(wckVar instanceof nck)) {
                w511.b();
                return null;
            }
            str = "set_cursor_position";
        }
        int hashCode = str.hashCode();
        wck wckVar2 = wckVar;
        JsonParserComponent jsonParserComponent = this.a;
        switch (hashCode) {
            case -1623648839:
                if (str.equals("set_variable")) {
                    qckVar = new qck(((i9k) jsonParserComponent.T0.getValue()).c(yf90Var, (k9k) (wckVar2 != null ? wckVar2.a() : null), jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case -1623635702:
                if (str.equals("animator_start")) {
                    qckVar = new zbk(((b4k) jsonParserComponent.L.getValue()).c(yf90Var, (d4k) (wckVar2 != null ? wckVar2.a() : null), jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case -1349088399:
                if (str.equals("custom")) {
                    c6k c6kVar = (c6k) jsonParserComponent.j0.getValue();
                    c6kVar.getClass();
                    gckVar = new gck(new e6k());
                    return gckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case -1254965146:
                if (str.equals("clear_focus")) {
                    j5k j5kVar = (j5k) jsonParserComponent.a0.getValue();
                    j5kVar.getClass();
                    gckVar = new eck(new l5k());
                    return gckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case -1160753574:
                if (str.equals("animator_stop")) {
                    g4k g4kVar = (g4k) jsonParserComponent.O.getValue();
                    i4k i4kVar = (i4k) (wckVar2 != null ? wckVar2.a() : null);
                    g4kVar.getClass();
                    qckVar = new ack(new i4k(wcx.a(udq0.Q(yf90Var), jSONObject, "animator_id", yf90Var.i(), i4kVar != null ? i4kVar.a : null)));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case -891535336:
                if (str.equals("submit")) {
                    qckVar = new sck(((v9k) jsonParserComponent.Z0.getValue()).c(yf90Var, (dak) (wckVar2 != null ? wckVar2.a() : null), jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case -796594542:
                if (str.equals("set_stored_value")) {
                    qckVar = new pck(((d9k) jsonParserComponent.Q0.getValue()).c(yf90Var, (f9k) (wckVar2 != null ? wckVar2.a() : null), jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case -404256420:
                if (str.equals("copy_to_clipboard")) {
                    x5k x5kVar = (x5k) jsonParserComponent.g0.getValue();
                    z5k z5kVar = (z5k) (wckVar2 != null ? wckVar2.a() : null);
                    x5kVar.getClass();
                    boolean i = yf90Var.i();
                    fckVar = new fck(new z5k(wcx.c(udq0.Q(yf90Var), jSONObject, "content", i, z5kVar != null ? z5kVar.a : null, x5kVar.a.d0)));
                    return fckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case -326583939:
                if (str.equals("update_structure")) {
                    qckVar = new uck(((bdk) jsonParserComponent.o1.getValue()).c(yf90Var, (ddk) (wckVar2 != null ? wckVar2.a() : null), jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 10055918:
                if (str.equals("array_set_value")) {
                    qckVar = new dck(((v4k) jsonParserComponent.X.getValue()).c(yf90Var, (x4k) (wckVar2 != null ? wckVar2.a() : null), jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 110364485:
                if (str.equals("timer")) {
                    jak jakVar = (jak) jsonParserComponent.i1.getValue();
                    Object a = wckVar2 != null ? wckVar2.a() : null;
                    jakVar.getClass();
                    qckVar = new tck(jak.c(yf90Var, (lak) a, jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 112202875:
                if (str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    hdk hdkVar = (hdk) jsonParserComponent.r1.getValue();
                    Object a2 = wckVar2 != null ? wckVar2.a() : null;
                    hdkVar.getClass();
                    qckVar = new vck(hdk.c(yf90Var, (jdk) a2, jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 203934236:
                if (str.equals("array_remove_value")) {
                    q4k q4kVar = (q4k) jsonParserComponent.U.getValue();
                    Object a3 = wckVar2 != null ? wckVar2.a() : null;
                    q4kVar.getClass();
                    qckVar = new cck(q4k.c(yf90Var, (s4k) a3, jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 301532353:
                if (str.equals("show_tooltip")) {
                    n9k n9kVar = (n9k) jsonParserComponent.W0.getValue();
                    Object a4 = wckVar2 != null ? wckVar2.a() : null;
                    n9kVar.getClass();
                    qckVar = new rck(n9k.c(yf90Var, (p9k) a4, jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 417790729:
                if (str.equals("scroll_by")) {
                    n7k n7kVar = (n7k) jsonParserComponent.y0.getValue();
                    Object a5 = wckVar2 != null ? wckVar2.a() : null;
                    n7kVar.getClass();
                    qckVar = new lck(n7k.c(yf90Var, (p7k) a5, jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 417791277:
                if (str.equals("scroll_to")) {
                    qckVar = new mck(((h8k) jsonParserComponent.E0.getValue()).c(yf90Var, (k8k) (wckVar2 != null ? wckVar2.a() : null), jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 932090484:
                if (str.equals("set_state")) {
                    w8k w8kVar = (w8k) jsonParserComponent.N0.getValue();
                    Object a6 = wckVar2 != null ? wckVar2.a() : null;
                    w8kVar.getClass();
                    qckVar = new ock(w8k.c(yf90Var, (z8k) a6, jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 1427818632:
                if (str.equals("download")) {
                    qckVar = new ick(((m6k) jsonParserComponent.p0.getValue()).c(yf90Var, (o6k) (wckVar2 != null ? wckVar2.a() : null), jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 1550697109:
                if (str.equals("focus_element")) {
                    t6k t6kVar = (t6k) jsonParserComponent.s0.getValue();
                    v6k v6kVar = (v6k) (wckVar2 != null ? wckVar2.a() : null);
                    t6kVar.getClass();
                    fckVar = new jck(new v6k(wcx.d(udq0.Q(yf90Var), jSONObject, "element_id", wm11.c, yf90Var.i(), v6kVar != null ? v6kVar.a : null)));
                    return fckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 1587919371:
                if (str.equals("dict_set_value")) {
                    qckVar = new hck(((h6k) jsonParserComponent.m0.getValue()).c(yf90Var, (j6k) (wckVar2 != null ? wckVar2.a() : null), jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 1650796053:
                if (str.equals("set_cursor_position")) {
                    qckVar = new nck(((o8k) jsonParserComponent.H0.getValue()).c(yf90Var, (t8k) (wckVar2 != null ? wckVar2.a() : null), jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 1715728902:
                if (str.equals("hide_tooltip")) {
                    c7k c7kVar = (c7k) jsonParserComponent.v0.getValue();
                    e7k e7kVar = (e7k) (wckVar2 != null ? wckVar2.a() : null);
                    c7kVar.getClass();
                    fckVar = new kck(new e7k(wcx.d(udq0.Q(yf90Var), jSONObject, "id", wm11.c, yf90Var.i(), e7kVar != null ? e7kVar.a : null)));
                    return fckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            case 1811437713:
                if (str.equals("array_insert_value")) {
                    qckVar = new bck(((l4k) jsonParserComponent.R.getValue()).c(yf90Var, (n4k) (wckVar2 != null ? wckVar2.a() : null), jSONObject));
                    return qckVar;
                }
                throw fg90.m(jSONObject, "type", str);
            default:
                throw fg90.m(jSONObject, "type", str);
        }
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, wck wckVar) {
        boolean z = wckVar instanceof zbk;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((b4k) jsonParserComponent.L.getValue()).b(yf90Var, ((zbk) wckVar).a);
        }
        if (wckVar instanceof ack) {
            g4k g4kVar = (g4k) jsonParserComponent.O.getValue();
            i4k i4kVar = ((ack) wckVar).a;
            g4kVar.getClass();
            return g4k.c(yf90Var, i4kVar);
        }
        if (wckVar instanceof bck) {
            return ((l4k) jsonParserComponent.R.getValue()).b(yf90Var, ((bck) wckVar).a);
        }
        if (wckVar instanceof cck) {
            q4k q4kVar = (q4k) jsonParserComponent.U.getValue();
            s4k s4kVar = ((cck) wckVar).a;
            q4kVar.getClass();
            return q4k.d(yf90Var, s4kVar);
        }
        if (wckVar instanceof dck) {
            return ((v4k) jsonParserComponent.X.getValue()).b(yf90Var, ((dck) wckVar).a);
        }
        if (wckVar instanceof eck) {
            ((j5k) jsonParserComponent.a0.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            wwg.Z(yf90Var, jSONObject, "type", "clear_focus");
            return jSONObject;
        }
        if (wckVar instanceof fck) {
            return ((x5k) jsonParserComponent.g0.getValue()).b(yf90Var, ((fck) wckVar).a);
        }
        if (wckVar instanceof hck) {
            return ((h6k) jsonParserComponent.m0.getValue()).b(yf90Var, ((hck) wckVar).a);
        }
        if (wckVar instanceof ick) {
            return ((m6k) jsonParserComponent.p0.getValue()).b(yf90Var, ((ick) wckVar).a);
        }
        if (wckVar instanceof jck) {
            t6k t6kVar = (t6k) jsonParserComponent.s0.getValue();
            v6k v6kVar = ((jck) wckVar).a;
            t6kVar.getClass();
            return t6k.c(yf90Var, v6kVar);
        }
        if (wckVar instanceof kck) {
            c7k c7kVar = (c7k) jsonParserComponent.v0.getValue();
            e7k e7kVar = ((kck) wckVar).a;
            c7kVar.getClass();
            return c7k.c(yf90Var, e7kVar);
        }
        if (wckVar instanceof lck) {
            n7k n7kVar = (n7k) jsonParserComponent.y0.getValue();
            p7k p7kVar = ((lck) wckVar).a;
            n7kVar.getClass();
            return n7k.d(yf90Var, p7kVar);
        }
        if (wckVar instanceof mck) {
            return ((h8k) jsonParserComponent.E0.getValue()).b(yf90Var, ((mck) wckVar).a);
        }
        if (wckVar instanceof ock) {
            w8k w8kVar = (w8k) jsonParserComponent.N0.getValue();
            z8k z8kVar = ((ock) wckVar).a;
            w8kVar.getClass();
            return w8k.d(yf90Var, z8kVar);
        }
        if (wckVar instanceof pck) {
            return ((d9k) jsonParserComponent.Q0.getValue()).b(yf90Var, ((pck) wckVar).a);
        }
        if (wckVar instanceof qck) {
            return ((i9k) jsonParserComponent.T0.getValue()).b(yf90Var, ((qck) wckVar).a);
        }
        if (wckVar instanceof rck) {
            n9k n9kVar = (n9k) jsonParserComponent.W0.getValue();
            p9k p9kVar = ((rck) wckVar).a;
            n9kVar.getClass();
            return n9k.d(yf90Var, p9kVar);
        }
        if (wckVar instanceof sck) {
            return ((v9k) jsonParserComponent.Z0.getValue()).b(yf90Var, ((sck) wckVar).a);
        }
        if (wckVar instanceof tck) {
            jak jakVar = (jak) jsonParserComponent.i1.getValue();
            lak lakVar = ((tck) wckVar).a;
            jakVar.getClass();
            return jak.d(yf90Var, lakVar);
        }
        if (wckVar instanceof uck) {
            return ((bdk) jsonParserComponent.o1.getValue()).b(yf90Var, ((uck) wckVar).a);
        }
        if (wckVar instanceof vck) {
            hdk hdkVar = (hdk) jsonParserComponent.r1.getValue();
            jdk jdkVar = ((vck) wckVar).a;
            hdkVar.getClass();
            return hdk.d(yf90Var, jdkVar);
        }
        if (wckVar instanceof gck) {
            ((c6k) jsonParserComponent.j0.getValue()).getClass();
            JSONObject jSONObject2 = new JSONObject();
            wwg.Z(yf90Var, jSONObject2, "type", "custom");
            return jSONObject2;
        }
        if (wckVar instanceof nck) {
            return ((o8k) jsonParserComponent.H0.getValue()).b(yf90Var, ((nck) wckVar).a);
        }
        w511.b();
        return null;
    }
}
