package defpackage;

/* loaded from: classes8.dex */
public final class rz10 {
    public final rfy a;
    public final int b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final vy31 g;
    public final l220 h;
    public final k420 i;
    public final sls j;
    public final sls k;
    public final g110 l;
    public final sls m;
    public final tls n;
    public final sls o;

    public rz10(rfy rfyVar, int i, String str, g110 g110Var, w120 w120Var) {
        vy31 vy31Var = new vy31();
        l220 l220Var = new l220(0);
        k420 k420Var = new k420(0);
        qqr qqrVar = qqr.x;
        qqr qqrVar2 = qqr.y;
        qz10 qz10Var = new qz10(0);
        qqr qqrVar3 = qqr.z;
        this.a = rfyVar;
        this.b = i;
        this.c = str;
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = vy31Var;
        this.h = l220Var;
        this.i = k420Var;
        this.j = qqrVar;
        this.k = qqrVar2;
        this.l = g110Var;
        this.m = w120Var;
        this.n = qz10Var;
        this.o = qqrVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rz10)) {
            return false;
        }
        rz10 rz10Var = (rz10) obj;
        return jl40.l(this.a, rz10Var.a) && this.b == rz10Var.b && jl40.l(this.c, rz10Var.c) && this.d == rz10Var.d && this.e == rz10Var.e && this.f == rz10Var.f && jl40.l(this.g, rz10Var.g) && jl40.l(this.h, rz10Var.h) && jl40.l(this.i, rz10Var.i) && jl40.l(this.j, rz10Var.j) && jl40.l(this.k, rz10Var.k) && jl40.l(this.l, rz10Var.l) && jl40.l(this.m, rz10Var.m) && jl40.l(this.n, rz10Var.n) && jl40.l(this.o, rz10Var.o);
    }

    public final int hashCode() {
        int b = oyr.b(this.b, unr0.e(this.a.hashCode() * 31, 31, false), 31);
        String str = this.c;
        int b2 = oyr.b(0, nnm.a(nnm.a((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e(unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, false), 31, this.d), 31, false), 31, this.e), 31, false), 31, this.f), 31, false)) * 31)) * 31)) * 961, 31, this.j), 31, this.k), 31);
        g110 g110Var = this.l;
        return Boolean.hashCode(false) + nnm.a(ly3.a(unr0.e(nnm.a((b2 + (g110Var == null ? 0 : g110Var.hashCode())) * 31, 31, this.m), 31, false), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagingConfiguration(limitedAccess=");
        sb.append(this.a);
        sb.append(", areChatsFromHiddenNamespacesAllowed=false, originServiceId=");
        sb.append(this.b);
        sb.append(", workspaceId=");
        tse0.y(this.c, ", isBottomSheet=false, areLimitedUsersAllowed=", ", areTeamAccountsAllowed=false, areNotificationsEnabled=", sb, this.d);
        nnm.v(", areInAppNotificationsEnabled=false, isAutoLoginEnabled=", ", isLoggingEnabled=false, voiceMessageConfiguration=", sb, this.e, this.f);
        sb.append(this.g);
        sb.append(", intentConfiguration=");
        sb.append(this.h);
        sb.append(", settingsScreenConfiguration=");
        sb.append(this.i);
        sb.append(", hostInfoProvider=null, deepSyncBotIdProvider=");
        sb.append(this.j);
        sb.append(", deepSyncNotificationSmallIconProvider=");
        sb.append(this.k);
        sb.append(", additionalIntentFlags=0, themeOverlayProvider=");
        sb.append(this.l);
        sb.append(", additionalThemeStylesProvider=");
        sb.append(this.m);
        sb.append(", areConversationsEnabled=false, httpClientBuilder=");
        sb.append(this.n);
        sb.append(", overriddenLocaleProvider=");
        return ly3.r(sb, this.o, ", translationByButtonEnabled=false)");
    }
}
