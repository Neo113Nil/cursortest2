package ru.yandex.taxi.am;

import defpackage.cne0;
import defpackage.d9;
import defpackage.dne0;
import defpackage.ffx;
import defpackage.i3y;
import defpackage.iid0;
import defpackage.kgx;
import defpackage.kj;
import defpackage.mu11;
import defpackage.pz40;
import defpackage.qme0;
import defpackage.r8;
import defpackage.ru11;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.xlt;
import defpackage.zl60;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlinx.coroutines.channels.BufferOverflow;

/* loaded from: classes9.dex */
public final class k extends r8 {
    public static final /* synthetic */ kgx[] S = {new PropertyReference1Impl("legacyPhone", 0, "getLegacyPhone()Ljava/lang/String;", k.class), new MutablePropertyReference1Impl("isAutoLoginShown", 0, "isAutoLoginShown()Z", k.class), new PropertyReference1Impl("isRecentlyResetFromValid", 0, "isRecentlyResetFromValid()Z", k.class), new MutablePropertyReference1Impl("authorizedInner", 0, "getAuthorizedInner()Z", k.class), new MutablePropertyReference1Impl("tokenValid", 0, "getTokenValid()Z", k.class), new MutablePropertyReference1Impl("accountName", 0, "getAccountName()Ljava/lang/String;", k.class), new MutablePropertyReference1Impl("isSocial", 0, "isSocial()Z", k.class), new MutablePropertyReference1Impl("isLite", 0, "isLite()Z", k.class), new MutablePropertyReference1Impl("hasPlus", 0, "getHasPlus()Z", k.class), new MutablePropertyReference1Impl("userFirstName", 0, "getUserFirstName()Ljava/lang/String;", k.class), new MutablePropertyReference1Impl("userLastName", 0, "getUserLastName()Ljava/lang/String;", k.class), new MutablePropertyReference1Impl("email", 0, "getEmail()Ljava/lang/String;", k.class), new MutablePropertyReference1Impl("avatarUrl", 0, "getAvatarUrl()Ljava/lang/String;", k.class), new MutablePropertyReference1Impl("isAvatarEmpty", 0, "isAvatarEmpty()Z", k.class), new MutablePropertyReference1Impl("isYandex", 0, "isYandex()Z", k.class), new MutablePropertyReference1Impl("yandexoidLogin", 0, "getYandexoidLogin()Ljava/lang/String;", k.class), new MutablePropertyReference1Impl("isBetaTester", 0, "isBetaTester()Z", k.class), new MutablePropertyReference1Impl("accountTypeString", 0, "getAccountTypeString()Ljava/lang/String;", k.class)};
    public final qme0 A;
    public final i3y B;
    public final kotlinx.coroutines.flow.n0 C;
    public final qme0 D;
    public final qme0 E;
    public final iid0 F;
    public final qme0 G;
    public final qme0 H;
    public final qme0 I;
    public final iid0 J;
    public final iid0 K;
    public final iid0 L;
    public final iid0 M;
    public final qme0 N;
    public final qme0 O;
    public final iid0 P;
    public final qme0 Q;
    public final iid0 R;
    public final tt2 c;
    public final zl60 w;
    public final ru11 x;
    public final iid0 y;
    public final qme0 z;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(dne0 dne0Var, tt2 tt2Var, zl60 zl60Var, ru11 ru11Var) {
        super(7, r2);
        cne0 b = dne0Var.b();
        this.c = tt2Var;
        this.w = zl60Var;
        this.x = ru11Var;
        this.y = new iid0(b, "phone number");
        this.z = new qme0(0, b, b, "autologin_shown");
        this.A = new qme0(0, b, b, "recently_reset");
        this.B = kotlin.a.a(new d9(10, this));
        this.C = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);
        this.D = new qme0(0, b, b, "authorized");
        this.E = new qme0(0, b, b, "token_valid");
        this.F = new iid0(b, "account_name");
        this.G = new qme0(0, b, b, "is_social");
        this.H = new qme0(0, b, b, "is_lite");
        this.I = new qme0(0, b, b, "account_has_plus");
        this.J = new iid0(b, "account_user_first_name");
        this.K = new iid0(b, "account_user_last_name");
        this.L = new iid0(b, "account_email");
        this.M = new iid0(b, "account_avatar");
        this.N = new qme0(0, b, b, "is_account_avatar_empty");
        this.O = new qme0(0, b, b, "is_team");
        this.P = new iid0(b, "yandexoid_login");
        this.Q = new qme0(0, b, b, "is_beta_tester");
        this.R = new iid0(b, "go_account_type");
    }

    public final tpr Hg() {
        return kotlinx.coroutines.flow.e.t(com.yandex.go.coroutines.b.d(this.C, new AmStorage$authorizedFlow$1(this, null)));
    }

    public final synchronized kj Ig() {
        return Jg();
    }

    public final kj Jg() {
        mu11 a = this.x.a();
        if (a.a()) {
            cne0 cne0Var = (cne0) this.b;
            if (!cne0Var.c("go_account_type") && !cne0Var.c("is_phonish")) {
                return null;
            }
            kgx[] kgxVarArr = S;
            String str = (String) this.F.getValue(this, kgxVarArr[5]);
            if (str != null && str.length() != 0) {
                long j = a.a;
                String str2 = (String) this.J.getValue(this, kgxVarArr[9]);
                String str3 = (String) this.K.getValue(this, kgxVarArr[10]);
                xlt xltVar = GoAccountType.Companion;
                String str4 = (String) this.R.getValue(this, kgxVarArr[17]);
                xltVar.getClass();
                GoAccountType a2 = xlt.a(str4);
                if (a2 == null) {
                    if (Mg()) {
                        a2 = GoAccountType.Phonish;
                    } else if (Ng()) {
                        a2 = GoAccountType.Yandex;
                    } else {
                        if (((Boolean) this.G.getValue(this, kgxVarArr[6])).booleanValue()) {
                            a2 = GoAccountType.Social;
                        } else {
                            a2 = ((Boolean) this.H.getValue(this, kgxVarArr[7])).booleanValue() ? GoAccountType.Lite : GoAccountType.None;
                        }
                    }
                }
                return new kj(j, str, a2, ((Boolean) this.I.getValue(this, kgxVarArr[8])).booleanValue(), str2, str3, (String) this.L.getValue(this, kgxVarArr[11]), (String) this.M.getValue(this, kgxVarArr[12]), ((Boolean) this.N.getValue(this, kgxVarArr[13])).booleanValue(), ((Boolean) this.O.getValue(this, kgxVarArr[14])).booleanValue(), (String) this.P.getValue(this, kgxVarArr[15]), ((Boolean) this.Q.getValue(this, kgxVarArr[16])).booleanValue());
            }
        }
        return null;
    }

    public final boolean Kg() {
        return ((Boolean) this.D.getValue(this, S[3])).booleanValue();
    }

    public final long Lg() {
        return this.x.a().a;
    }

    public final boolean Mg() {
        cne0 cne0Var = (cne0) this.b;
        if (!cne0Var.c("go_account_type") && !cne0Var.c("is_phonish")) {
            return true;
        }
        xlt xltVar = GoAccountType.Companion;
        String str = (String) this.R.getValue(this, S[17]);
        xltVar.getClass();
        return xlt.a(str) == GoAccountType.Phonish || cne0Var.f("is_phonish");
    }

    public final boolean Ng() {
        if (Mg()) {
            return false;
        }
        xlt xltVar = GoAccountType.Companion;
        String str = (String) this.R.getValue(this, S[17]);
        xltVar.getClass();
        return xlt.a(str) == GoAccountType.Yandex || ((cne0) this.b).f("is_portal");
    }

    public final void Og(kj kjVar) {
        cne0 cne0Var = (cne0) this.b;
        ru11 ru11Var = this.x;
        if (kjVar == null) {
            zl60 zl60Var = this.w;
            zl60Var.getClass();
            zl60Var.b = new IllegalArgumentException("yandexUid was removed from preferences");
            ru11Var.a.w("uid");
            cne0Var.w("go_account_type");
            cne0Var.w("is_phonish");
            cne0Var.w("is_portal");
            cne0Var.w("account_user_first_name");
            cne0Var.w("account_user_last_name");
            cne0Var.w("account_name");
            cne0Var.w("account_email");
            cne0Var.w("account_avatar");
            cne0Var.w("account_has_plus");
            cne0Var.w("is_team");
            cne0Var.w("yandexoid_login");
            cne0Var.w("is_beta_tester");
            return;
        }
        ru11Var.a.q(kjVar.a, "uid");
        String str = kjVar.b;
        kgx[] kgxVarArr = S;
        this.F.setValue(this, kgxVarArr[5], str);
        String value = kjVar.c.getValue();
        this.R.setValue(this, kgxVarArr[17], value);
        cne0Var.u("is_phonish", kjVar.m);
        cne0Var.u("is_portal", kjVar.n);
        boolean z = kjVar.o;
        this.G.setValue(this, kgxVarArr[6], Boolean.valueOf(z));
        boolean z2 = kjVar.p;
        this.H.setValue(this, kgxVarArr[7], Boolean.valueOf(z2));
        boolean z3 = kjVar.d;
        this.I.setValue(this, kgxVarArr[8], Boolean.valueOf(z3));
        String str2 = kjVar.e;
        this.J.setValue(this, kgxVarArr[9], str2);
        String str3 = kjVar.f;
        this.K.setValue(this, kgxVarArr[10], str3);
        String str4 = kjVar.g;
        this.L.setValue(this, kgxVarArr[11], str4);
        String str5 = kjVar.h;
        this.M.setValue(this, kgxVarArr[12], str5);
        boolean z4 = kjVar.i;
        this.N.setValue(this, kgxVarArr[13], Boolean.valueOf(z4));
        boolean z5 = kjVar.j;
        this.O.setValue(this, kgxVarArr[14], Boolean.valueOf(z5));
        String str6 = kjVar.k;
        this.P.setValue(this, kgxVarArr[15], str6);
        boolean z6 = kjVar.l;
        this.Q.setValue(this, kgxVarArr[16], Boolean.valueOf(z6));
    }

    public final synchronized void Pg(kj kjVar) {
        Og(kjVar);
        ((kotlinx.coroutines.flow.r0) ((pz40) this.B.getValue())).l(kjVar);
    }
}
