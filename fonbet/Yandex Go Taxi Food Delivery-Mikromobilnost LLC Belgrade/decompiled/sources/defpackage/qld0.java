package defpackage;

import com.yandex.plus.home.feature.panel.internalapi.analytics.ShortcutClickArea;
import com.yandex.plus.home.repository.api.model.panel.ActionType;

/* loaded from: classes2.dex */
public final class qld0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final db90 g;
    public final ActionType h;
    public final ShortcutClickArea i;
    public final String j;

    public qld0(String str, String str2, String str3, String str4, String str5, String str6, db90 db90Var, ActionType actionType, ShortcutClickArea shortcutClickArea, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = db90Var;
        this.h = actionType;
        this.i = shortcutClickArea;
        this.j = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qld0)) {
            return false;
        }
        qld0 qld0Var = (qld0) obj;
        return this.a.equals(qld0Var.a) && this.b.equals(qld0Var.b) && jl40.l(this.c, qld0Var.c) && jl40.l(this.d, qld0Var.d) && jl40.l(this.e, qld0Var.e) && jl40.l(this.f, qld0Var.f) && jl40.l(this.g, qld0Var.g) && this.h == qld0Var.h && this.i == qld0Var.i && jl40.l(this.j, qld0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + unr0.b(unr0.b(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Clicked(configId=");
        sb.append(this.a);
        sb.append(", configName=");
        sb.append(this.b);
        sb.append(", sectionId=");
        sb.append(this.c);
        sb.append(", sectionName=");
        sb.append(this.d);
        sb.append(", shortcutId=");
        sb.append(this.e);
        sb.append(", shortcutName=");
        sb.append(this.f);
        sb.append(", childParams=");
        sb.append(this.g);
        sb.append(", actionType=");
        sb.append(this.h);
        sb.append(", clickArea=");
        sb.append(this.i);
        sb.append(", linkUrl=");
        return b64.p(sb, this.j, ')');
    }
}
