package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.b6e;
import defpackage.tah;
import defpackage.uah;
import kotlin.Pair;

/* loaded from: classes4.dex */
public abstract class b {
    public static final c a = new c(0);
    public static final c b = new c(1);

    public static final String a(b1 b1Var) {
        b1Var.getClass();
        return uah.e(new Pair("account_size", Integer.valueOf(b1Var.b.size())), new Pair("child_info_account_size", Integer.valueOf(b1Var.c.size())), new Pair("is_relogin", Boolean.valueOf(b1Var.f))).toString();
    }

    public static final String b(l1 l1Var) {
        l1Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(c(l1Var.a));
        b1 b1Var = l1Var.d;
        sb.append(uah.e(new Pair("bouncer_parameters", b1Var != null ? a(b1Var) : null), new Pair("challenge_state", l1Var.e)));
        return sb.toString();
    }

    public static final String c(v1 v1Var) {
        String str;
        if (v1Var instanceof o1) {
            str = "Error";
        } else if (v1Var instanceof p1) {
            p1 p1Var = (p1) v1Var;
            str = uah.e(new Pair("ui_state_name", "Fallback"), new Pair("can_go_back", Boolean.valueOf(p1Var.b)), new Pair("is_relogin", Boolean.valueOf(p1Var.e))).toString();
        } else if (v1Var instanceof r1) {
            str = "Roundabout";
        } else if (v1Var instanceof s1) {
            Pair pair = new Pair("ui_state_name", "Sloth");
            com.yandex.passport.sloth.data.m mVar = ((s1) v1Var).a;
            mVar.getClass();
            str = uah.e(pair, new Pair("params", uah.e(new Pair("sloth_variant", mVar.a.a.name()), new Pair("sloth_env", mVar.b)).toString())).toString();
        } else if (v1Var instanceof m1) {
            str = "Challenge";
        } else if (v1Var instanceof q1) {
            str = "Loading";
        } else if (v1Var instanceof t1) {
            str = "WaitConnection";
        } else if (v1Var.equals(u1.a)) {
            str = "WrongAccount";
        } else {
            if (!(v1Var instanceof n1)) {
                b6e.s();
                return null;
            }
            str = "ChooseMaster";
        }
        return tah.b(new Pair("ui_state", str)).toString();
    }

    public static final String d(com.yandex.passport.api.v vVar) {
        if (vVar instanceof com.yandex.passport.api.t) {
            return "LoggedIn";
        }
        if (vVar.equals(com.yandex.passport.api.p.a)) {
            return "Cancelled";
        }
        if (vVar instanceof com.yandex.passport.api.r) {
            return "FailedWithException";
        }
        if (vVar.equals(com.yandex.passport.api.s.a)) {
            return "Forbidden";
        }
        if (vVar instanceof com.yandex.passport.api.u) {
            return "OpenUrl";
        }
        b6e.s();
        return null;
    }

    public static final String e(v1 v1Var) {
        if (v1Var instanceof o1) {
            return "Error";
        }
        if (v1Var instanceof p1) {
            return "Fallback";
        }
        if (v1Var instanceof r1) {
            return "Roundabout";
        }
        if (v1Var instanceof s1) {
            return "Sloth";
        }
        if (v1Var instanceof m1) {
            return "Challenge";
        }
        if (v1Var instanceof q1) {
            return "Loading";
        }
        if (v1Var instanceof t1) {
            return "WaitConnection";
        }
        if (v1Var instanceof u1) {
            return "WrongAccount";
        }
        if (v1Var instanceof n1) {
            return "ChooseMaster";
        }
        b6e.s();
        return null;
    }
}
