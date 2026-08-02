package defpackage;

import com.yandex.div2.JsonParserComponent;
import org.json.JSONObject;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class qbk implements zsq0, nyi {
    public final JsonParserComponent a;

    public qbk(JsonParserComponent jsonParserComponent) {
        this.a = jsonParserComponent;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // defpackage.nyi
    public final Object a(yf90 yf90Var, JSONObject jSONObject) {
        String R = wwg.R(jSONObject);
        int hashCode = R.hashCode();
        JsonParserComponent jsonParserComponent = this.a;
        switch (hashCode) {
            case -1623648839:
                if (R.equals("set_variable")) {
                    return new dbk(((h9k) jsonParserComponent.S0.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case -1623635702:
                if (R.equals("animator_start")) {
                    return new mak(((a4k) jsonParserComponent.K.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case -1349088399:
                if (R.equals("custom")) {
                    ((b6k) jsonParserComponent.i0.getValue()).getClass();
                    return new tak(b6k.c());
                }
                break;
            case -1254965146:
                if (R.equals("clear_focus")) {
                    ((i5k) jsonParserComponent.Z.getValue()).getClass();
                    return new rak(i5k.c());
                }
                break;
            case -1160753574:
                if (R.equals("animator_stop")) {
                    ((f4k) jsonParserComponent.N.getValue()).getClass();
                    return new nak(f4k.c(jSONObject));
                }
                break;
            case -891535336:
                if (R.equals("submit")) {
                    return new fbk(((u9k) jsonParserComponent.Y0.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case -796594542:
                if (R.equals("set_stored_value")) {
                    return new cbk(((c9k) jsonParserComponent.P0.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case -404256420:
                if (R.equals("copy_to_clipboard")) {
                    return new sak(((w5k) jsonParserComponent.f0.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case -326583939:
                if (R.equals("update_structure")) {
                    return new hbk(((adk) jsonParserComponent.n1.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 10055918:
                if (R.equals("array_set_value")) {
                    return new qak(((u4k) jsonParserComponent.W.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 110364485:
                if (R.equals("timer")) {
                    ((iak) jsonParserComponent.h1.getValue()).getClass();
                    return new gbk(iak.c(yf90Var, jSONObject));
                }
                break;
            case 112202875:
                if (R.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    ((gdk) jsonParserComponent.q1.getValue()).getClass();
                    return new ibk(gdk.c(yf90Var, jSONObject));
                }
                break;
            case 203934236:
                if (R.equals("array_remove_value")) {
                    ((p4k) jsonParserComponent.T.getValue()).getClass();
                    return new pak(p4k.c(yf90Var, jSONObject));
                }
                break;
            case 301532353:
                if (R.equals("show_tooltip")) {
                    ((m9k) jsonParserComponent.V0.getValue()).getClass();
                    return new ebk(m9k.c(yf90Var, jSONObject));
                }
                break;
            case 417790729:
                if (R.equals("scroll_by")) {
                    ((m7k) jsonParserComponent.x0.getValue()).getClass();
                    return new yak(m7k.c(yf90Var, jSONObject));
                }
                break;
            case 417791277:
                if (R.equals("scroll_to")) {
                    return new zak(((g8k) jsonParserComponent.D0.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 932090484:
                if (R.equals("set_state")) {
                    ((v8k) jsonParserComponent.M0.getValue()).getClass();
                    return new bbk(v8k.c(yf90Var, jSONObject));
                }
                break;
            case 1427818632:
                if (R.equals("download")) {
                    return new vak(((l6k) jsonParserComponent.o0.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 1550697109:
                if (R.equals("focus_element")) {
                    ((s6k) jsonParserComponent.r0.getValue()).getClass();
                    return new wak(s6k.c(yf90Var, jSONObject));
                }
                break;
            case 1587919371:
                if (R.equals("dict_set_value")) {
                    return new uak(((g6k) jsonParserComponent.l0.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 1650796053:
                if (R.equals("set_cursor_position")) {
                    return new abk(((n8k) jsonParserComponent.G0.getValue()).a(yf90Var, jSONObject));
                }
                break;
            case 1715728902:
                if (R.equals("hide_tooltip")) {
                    ((b7k) jsonParserComponent.u0.getValue()).getClass();
                    return new xak(b7k.c(yf90Var, jSONObject));
                }
                break;
            case 1811437713:
                if (R.equals("array_insert_value")) {
                    return new oak(((k4k) jsonParserComponent.Q.getValue()).a(yf90Var, jSONObject));
                }
                break;
        }
        hex b = yf90Var.b().b(R, jSONObject);
        wck wckVar = b instanceof wck ? (wck) b : null;
        if (wckVar != null) {
            return ((sbk) jsonParserComponent.m1.getValue()).a(yf90Var, wckVar, jSONObject);
        }
        throw fg90.m(jSONObject, "type", R);
    }

    @Override // defpackage.zsq0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(yf90 yf90Var, jbk jbkVar) {
        boolean z = jbkVar instanceof mak;
        JsonParserComponent jsonParserComponent = this.a;
        if (z) {
            return ((a4k) jsonParserComponent.K.getValue()).b(yf90Var, ((mak) jbkVar).d());
        }
        if (jbkVar instanceof nak) {
            f4k f4kVar = (f4k) jsonParserComponent.N.getValue();
            e4k d = ((nak) jbkVar).d();
            f4kVar.getClass();
            return f4k.d(yf90Var, d);
        }
        if (jbkVar instanceof oak) {
            return ((k4k) jsonParserComponent.Q.getValue()).b(yf90Var, ((oak) jbkVar).d());
        }
        if (jbkVar instanceof pak) {
            p4k p4kVar = (p4k) jsonParserComponent.T.getValue();
            o4k d2 = ((pak) jbkVar).d();
            p4kVar.getClass();
            return p4k.d(yf90Var, d2);
        }
        if (jbkVar instanceof qak) {
            return ((u4k) jsonParserComponent.W.getValue()).b(yf90Var, ((qak) jbkVar).d());
        }
        if (jbkVar instanceof rak) {
            ((i5k) jsonParserComponent.Z.getValue()).getClass();
            return i5k.d(yf90Var);
        }
        if (jbkVar instanceof sak) {
            return ((w5k) jsonParserComponent.f0.getValue()).b(yf90Var, ((sak) jbkVar).b);
        }
        if (jbkVar instanceof uak) {
            return ((g6k) jsonParserComponent.l0.getValue()).b(yf90Var, ((uak) jbkVar).d());
        }
        if (jbkVar instanceof vak) {
            return ((l6k) jsonParserComponent.o0.getValue()).b(yf90Var, ((vak) jbkVar).d());
        }
        if (jbkVar instanceof wak) {
            s6k s6kVar = (s6k) jsonParserComponent.r0.getValue();
            r6k d3 = ((wak) jbkVar).d();
            s6kVar.getClass();
            return s6k.d(yf90Var, d3);
        }
        if (jbkVar instanceof xak) {
            b7k b7kVar = (b7k) jsonParserComponent.u0.getValue();
            a7k d4 = ((xak) jbkVar).d();
            b7kVar.getClass();
            return b7k.d(yf90Var, d4);
        }
        if (jbkVar instanceof yak) {
            m7k m7kVar = (m7k) jsonParserComponent.x0.getValue();
            l7k d5 = ((yak) jbkVar).d();
            m7kVar.getClass();
            return m7k.d(yf90Var, d5);
        }
        if (jbkVar instanceof zak) {
            return ((g8k) jsonParserComponent.D0.getValue()).b(yf90Var, ((zak) jbkVar).d());
        }
        if (jbkVar instanceof bbk) {
            v8k v8kVar = (v8k) jsonParserComponent.M0.getValue();
            u8k d6 = ((bbk) jbkVar).d();
            v8kVar.getClass();
            return v8k.d(yf90Var, d6);
        }
        if (jbkVar instanceof cbk) {
            return ((c9k) jsonParserComponent.P0.getValue()).b(yf90Var, ((cbk) jbkVar).d());
        }
        if (jbkVar instanceof dbk) {
            return ((h9k) jsonParserComponent.S0.getValue()).b(yf90Var, ((dbk) jbkVar).d());
        }
        if (jbkVar instanceof ebk) {
            m9k m9kVar = (m9k) jsonParserComponent.V0.getValue();
            l9k d7 = ((ebk) jbkVar).d();
            m9kVar.getClass();
            return m9k.d(yf90Var, d7);
        }
        if (jbkVar instanceof fbk) {
            return ((u9k) jsonParserComponent.Y0.getValue()).b(yf90Var, ((fbk) jbkVar).d());
        }
        if (jbkVar instanceof gbk) {
            iak iakVar = (iak) jsonParserComponent.h1.getValue();
            hak d8 = ((gbk) jbkVar).d();
            iakVar.getClass();
            return iak.d(yf90Var, d8);
        }
        if (jbkVar instanceof hbk) {
            return ((adk) jsonParserComponent.n1.getValue()).b(yf90Var, ((hbk) jbkVar).d());
        }
        if (jbkVar instanceof ibk) {
            gdk gdkVar = (gdk) jsonParserComponent.q1.getValue();
            fdk d9 = ((ibk) jbkVar).d();
            gdkVar.getClass();
            return gdk.d(yf90Var, d9);
        }
        if (jbkVar instanceof tak) {
            ((b6k) jsonParserComponent.i0.getValue()).getClass();
            return b6k.d(yf90Var);
        }
        if (jbkVar instanceof abk) {
            return ((n8k) jsonParserComponent.G0.getValue()).b(yf90Var, ((abk) jbkVar).d());
        }
        w511.b();
        return null;
    }
}
