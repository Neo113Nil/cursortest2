package defpackage;

import com.connectsdk.device.ConnectableDevice;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class al8 implements gip, py7 {
    public final t6f a;

    public al8(t6f t6fVar) {
        this.a = t6fVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.py7
    public final Object a(t7k t7kVar, JSONObject jSONObject) {
        String str;
        Object tl8Var;
        Object il8Var;
        String b0 = etn.b0(jSONObject);
        d7f d7fVar = t7kVar.b().get(b0);
        zl8 zl8Var = d7fVar instanceof zl8 ? (zl8) d7fVar : null;
        if (zl8Var == null) {
            str = b0;
        } else if (zl8Var instanceof cl8) {
            str = "animator_start";
        } else if (zl8Var instanceof dl8) {
            str = "animator_stop";
        } else if (zl8Var instanceof el8) {
            str = "array_insert_value";
        } else if (zl8Var instanceof fl8) {
            str = "array_remove_value";
        } else if (zl8Var instanceof gl8) {
            str = "array_set_value";
        } else if (zl8Var instanceof hl8) {
            str = "clear_focus";
        } else if (zl8Var instanceof il8) {
            str = "copy_to_clipboard";
        } else if (zl8Var instanceof kl8) {
            str = "dict_set_value";
        } else if (zl8Var instanceof ll8) {
            str = "download";
        } else if (zl8Var instanceof ml8) {
            str = "focus_element";
        } else if (zl8Var instanceof nl8) {
            str = "hide_tooltip";
        } else if (zl8Var instanceof ol8) {
            str = "scroll_by";
        } else if (zl8Var instanceof pl8) {
            str = "scroll_to";
        } else if (zl8Var instanceof rl8) {
            str = "set_state";
        } else if (zl8Var instanceof sl8) {
            str = "set_stored_value";
        } else if (zl8Var instanceof tl8) {
            str = "set_variable";
        } else if (zl8Var instanceof ul8) {
            str = "show_tooltip";
        } else if (zl8Var instanceof vl8) {
            str = "submit";
        } else if (zl8Var instanceof wl8) {
            str = "timer";
        } else if (zl8Var instanceof xl8) {
            str = "update_structure";
        } else if (zl8Var instanceof yl8) {
            str = "video";
        } else if (zl8Var instanceof jl8) {
            str = "custom";
        } else {
            if (!(zl8Var instanceof ql8)) {
                b6e.s();
                return null;
            }
            str = "set_cursor_position";
        }
        int hashCode = str.hashCode();
        zl8 zl8Var2 = zl8Var;
        t6f t6fVar = this.a;
        switch (hashCode) {
            case -1623648839:
                if (str.equals("set_variable")) {
                    tl8Var = new tl8(((ri8) t6fVar.T0.getValue()).c(t7kVar, (ti8) (zl8Var2 != null ? zl8Var2.a() : null), jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case -1623635702:
                if (str.equals("animator_start")) {
                    tl8Var = new cl8(((ed8) t6fVar.L.getValue()).c(t7kVar, (hd8) (zl8Var2 != null ? zl8Var2.a() : null), jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case -1349088399:
                if (str.equals("custom")) {
                    lf8 lf8Var = (lf8) t6fVar.j0.getValue();
                    lf8Var.getClass();
                    return new jl8(new nf8());
                }
                throw a8k.l(jSONObject, "type", str);
            case -1254965146:
                if (str.equals("clear_focus")) {
                    se8 se8Var = (se8) t6fVar.a0.getValue();
                    se8Var.getClass();
                    return new hl8(new ue8());
                }
                throw a8k.l(jSONObject, "type", str);
            case -1160753574:
                if (str.equals("animator_stop")) {
                    kd8 kd8Var = (kd8) t6fVar.O.getValue();
                    md8 md8Var = (md8) (zl8Var2 != null ? zl8Var2.a() : null);
                    kd8Var.getClass();
                    tl8Var = new dl8(new md8(y2x.G(y1g.Y(t7kVar), jSONObject, "animator_id", t7kVar.d(), md8Var != null ? md8Var.a : null)));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case -891535336:
                if (str.equals("submit")) {
                    tl8Var = new vl8(((ej8) t6fVar.Z0.getValue()).c(t7kVar, (nj8) (zl8Var2 != null ? zl8Var2.a() : null), jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case -796594542:
                if (str.equals("set_stored_value")) {
                    tl8Var = new sl8(((li8) t6fVar.Q0.getValue()).c(t7kVar, (oi8) (zl8Var2 != null ? zl8Var2.a() : null), jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case -404256420:
                if (str.equals("copy_to_clipboard")) {
                    gf8 gf8Var = (gf8) t6fVar.g0.getValue();
                    if8 if8Var = (if8) (zl8Var2 != null ? zl8Var2.a() : null);
                    gf8Var.getClass();
                    boolean d = t7kVar.d();
                    il8Var = new il8(new if8(y2x.H(y1g.Y(t7kVar), jSONObject, "content", d, if8Var != null ? if8Var.a : null, gf8Var.a.d0)));
                    return il8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case -326583939:
                if (str.equals("update_structure")) {
                    tl8Var = new xl8(((dm8) t6fVar.o1.getValue()).c(t7kVar, (fm8) (zl8Var2 != null ? zl8Var2.a() : null), jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 10055918:
                if (str.equals("array_set_value")) {
                    tl8Var = new gl8(((zd8) t6fVar.X.getValue()).c(t7kVar, (be8) (zl8Var2 != null ? zl8Var2.a() : null), jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 110364485:
                if (str.equals("timer")) {
                    tj8 tj8Var = (tj8) t6fVar.i1.getValue();
                    Object a = zl8Var2 != null ? zl8Var2.a() : null;
                    tj8Var.getClass();
                    tl8Var = new wl8(tj8.c(t7kVar, (wj8) a, jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 112202875:
                if (str.equals("video")) {
                    jm8 jm8Var = (jm8) t6fVar.r1.getValue();
                    Object a2 = zl8Var2 != null ? zl8Var2.a() : null;
                    jm8Var.getClass();
                    tl8Var = new yl8(jm8.c(t7kVar, (mm8) a2, jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 203934236:
                if (str.equals("array_remove_value")) {
                    ud8 ud8Var = (ud8) t6fVar.U.getValue();
                    Object a3 = zl8Var2 != null ? zl8Var2.a() : null;
                    ud8Var.getClass();
                    tl8Var = new fl8(ud8.c(t7kVar, (wd8) a3, jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 301532353:
                if (str.equals("show_tooltip")) {
                    wi8 wi8Var = (wi8) t6fVar.W0.getValue();
                    Object a4 = zl8Var2 != null ? zl8Var2.a() : null;
                    wi8Var.getClass();
                    tl8Var = new ul8(wi8.c(t7kVar, (yi8) a4, jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 417790729:
                if (str.equals("scroll_by")) {
                    ug8 ug8Var = (ug8) t6fVar.y0.getValue();
                    Object a5 = zl8Var2 != null ? zl8Var2.a() : null;
                    ug8Var.getClass();
                    tl8Var = new ol8(ug8.c(t7kVar, (xg8) a5, jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 417791277:
                if (str.equals("scroll_to")) {
                    tl8Var = new pl8(((ph8) t6fVar.E0.getValue()).c(t7kVar, (sh8) (zl8Var2 != null ? zl8Var2.a() : null), jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 932090484:
                if (str.equals("set_state")) {
                    ei8 ei8Var = (ei8) t6fVar.N0.getValue();
                    Object a6 = zl8Var2 != null ? zl8Var2.a() : null;
                    ei8Var.getClass();
                    tl8Var = new rl8(ei8.c(t7kVar, (hi8) a6, jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 1427818632:
                if (str.equals("download")) {
                    tl8Var = new ll8(((vf8) t6fVar.p0.getValue()).c(t7kVar, (xf8) (zl8Var2 != null ? zl8Var2.a() : null), jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 1550697109:
                if (str.equals("focus_element")) {
                    bg8 bg8Var = (bg8) t6fVar.s0.getValue();
                    dg8 dg8Var = (dg8) (zl8Var2 != null ? zl8Var2.a() : null);
                    bg8Var.getClass();
                    il8Var = new ml8(new dg8(y2x.J(y1g.Y(t7kVar), jSONObject, "element_id", vct.c, t7kVar.d(), dg8Var != null ? dg8Var.a : null)));
                    return il8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 1587919371:
                if (str.equals("dict_set_value")) {
                    tl8Var = new kl8(((qf8) t6fVar.m0.getValue()).c(t7kVar, (sf8) (zl8Var2 != null ? zl8Var2.a() : null), jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 1650796053:
                if (str.equals("set_cursor_position")) {
                    tl8Var = new ql8(((wh8) t6fVar.H0.getValue()).c(t7kVar, (bi8) (zl8Var2 != null ? zl8Var2.a() : null), jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 1715728902:
                if (str.equals("hide_tooltip")) {
                    hg8 hg8Var = (hg8) t6fVar.v0.getValue();
                    jg8 jg8Var = (jg8) (zl8Var2 != null ? zl8Var2.a() : null);
                    hg8Var.getClass();
                    il8Var = new nl8(new jg8(y2x.J(y1g.Y(t7kVar), jSONObject, ConnectableDevice.KEY_ID, vct.c, t7kVar.d(), jg8Var != null ? jg8Var.a : null)));
                    return il8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            case 1811437713:
                if (str.equals("array_insert_value")) {
                    tl8Var = new el8(((pd8) t6fVar.R.getValue()).c(t7kVar, (rd8) (zl8Var2 != null ? zl8Var2.a() : null), jSONObject));
                    return tl8Var;
                }
                throw a8k.l(jSONObject, "type", str);
            default:
                throw a8k.l(jSONObject, "type", str);
        }
    }

    @Override // defpackage.gip
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(t7k t7kVar, zl8 zl8Var) {
        boolean z = zl8Var instanceof cl8;
        t6f t6fVar = this.a;
        if (z) {
            return ((ed8) t6fVar.L.getValue()).b(t7kVar, ((cl8) zl8Var).a);
        }
        if (zl8Var instanceof dl8) {
            kd8 kd8Var = (kd8) t6fVar.O.getValue();
            md8 md8Var = ((dl8) zl8Var).a;
            kd8Var.getClass();
            return kd8.c(t7kVar, md8Var);
        }
        if (zl8Var instanceof el8) {
            return ((pd8) t6fVar.R.getValue()).b(t7kVar, ((el8) zl8Var).a);
        }
        if (zl8Var instanceof fl8) {
            ud8 ud8Var = (ud8) t6fVar.U.getValue();
            wd8 wd8Var = ((fl8) zl8Var).a;
            ud8Var.getClass();
            return ud8.d(t7kVar, wd8Var);
        }
        if (zl8Var instanceof gl8) {
            return ((zd8) t6fVar.X.getValue()).b(t7kVar, ((gl8) zl8Var).a);
        }
        if (zl8Var instanceof hl8) {
            ((se8) t6fVar.a0.getValue()).getClass();
            JSONObject jSONObject = new JSONObject();
            etn.l0(t7kVar, jSONObject, "type", "clear_focus");
            return jSONObject;
        }
        if (zl8Var instanceof il8) {
            return ((gf8) t6fVar.g0.getValue()).b(t7kVar, ((il8) zl8Var).a);
        }
        if (zl8Var instanceof kl8) {
            return ((qf8) t6fVar.m0.getValue()).b(t7kVar, ((kl8) zl8Var).a);
        }
        if (zl8Var instanceof ll8) {
            return ((vf8) t6fVar.p0.getValue()).b(t7kVar, ((ll8) zl8Var).a);
        }
        if (zl8Var instanceof ml8) {
            bg8 bg8Var = (bg8) t6fVar.s0.getValue();
            dg8 dg8Var = ((ml8) zl8Var).a;
            bg8Var.getClass();
            return bg8.c(t7kVar, dg8Var);
        }
        if (zl8Var instanceof nl8) {
            hg8 hg8Var = (hg8) t6fVar.v0.getValue();
            jg8 jg8Var = ((nl8) zl8Var).a;
            hg8Var.getClass();
            return hg8.c(t7kVar, jg8Var);
        }
        if (zl8Var instanceof ol8) {
            ug8 ug8Var = (ug8) t6fVar.y0.getValue();
            xg8 xg8Var = ((ol8) zl8Var).a;
            ug8Var.getClass();
            return ug8.d(t7kVar, xg8Var);
        }
        if (zl8Var instanceof pl8) {
            return ((ph8) t6fVar.E0.getValue()).b(t7kVar, ((pl8) zl8Var).a);
        }
        if (zl8Var instanceof rl8) {
            ei8 ei8Var = (ei8) t6fVar.N0.getValue();
            hi8 hi8Var = ((rl8) zl8Var).a;
            ei8Var.getClass();
            return ei8.d(t7kVar, hi8Var);
        }
        if (zl8Var instanceof sl8) {
            return ((li8) t6fVar.Q0.getValue()).b(t7kVar, ((sl8) zl8Var).a);
        }
        if (zl8Var instanceof tl8) {
            return ((ri8) t6fVar.T0.getValue()).b(t7kVar, ((tl8) zl8Var).a);
        }
        if (zl8Var instanceof ul8) {
            wi8 wi8Var = (wi8) t6fVar.W0.getValue();
            yi8 yi8Var = ((ul8) zl8Var).a;
            wi8Var.getClass();
            return wi8.d(t7kVar, yi8Var);
        }
        if (zl8Var instanceof vl8) {
            return ((ej8) t6fVar.Z0.getValue()).b(t7kVar, ((vl8) zl8Var).a);
        }
        if (zl8Var instanceof wl8) {
            tj8 tj8Var = (tj8) t6fVar.i1.getValue();
            wj8 wj8Var = ((wl8) zl8Var).a;
            tj8Var.getClass();
            return tj8.d(t7kVar, wj8Var);
        }
        if (zl8Var instanceof xl8) {
            return ((dm8) t6fVar.o1.getValue()).b(t7kVar, ((xl8) zl8Var).a);
        }
        if (zl8Var instanceof yl8) {
            jm8 jm8Var = (jm8) t6fVar.r1.getValue();
            mm8 mm8Var = ((yl8) zl8Var).a;
            jm8Var.getClass();
            return jm8.d(t7kVar, mm8Var);
        }
        if (zl8Var instanceof jl8) {
            ((lf8) t6fVar.j0.getValue()).getClass();
            JSONObject jSONObject2 = new JSONObject();
            etn.l0(t7kVar, jSONObject2, "type", "custom");
            return jSONObject2;
        }
        if (zl8Var instanceof ql8) {
            return ((wh8) t6fVar.H0.getValue()).b(t7kVar, ((ql8) zl8Var).a);
        }
        b6e.s();
        return null;
    }
}
