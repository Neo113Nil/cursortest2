package defpackage;

import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.Counters;
import com.yandex.go.shortcuts.dto.response.ShortcutIconSize;
import com.yandex.go.shortcuts.dto.response.f0;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import java.util.ArrayList;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class yj11 implements v0s0, a1f, e6v {
    public final String a;
    public final String b;
    public final CharSequence c;
    public final FormattedText d;
    public final fa5 e;
    public final ba5 f;
    public final q1 g;
    public final String h;
    public final int i;
    public final ShortcutIconSize j;
    public final Counters k;
    public final ArrayList l;
    public final tbu m;
    public final boolean n;
    public final String o;
    public final f0 p;
    public final BaseShortcutModel$Source q = BaseShortcutModel$Source.TURBO_BUTTONS;

    public yj11(String str, String str2, String str3, FormattedText formattedText, fa5 fa5Var, ba5 ba5Var, q1 q1Var, String str4, int i, ShortcutIconSize shortcutIconSize, Counters counters, ArrayList arrayList, tbu tbuVar, boolean z, String str5, f0 f0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = formattedText;
        this.e = fa5Var;
        this.f = ba5Var;
        this.g = q1Var;
        this.h = str4;
        this.i = i;
        this.j = shortcutIconSize;
        this.k = counters;
        this.l = arrayList;
        this.m = tbuVar;
        this.n = z;
        this.o = str5;
        this.p = f0Var;
    }

    @Override // defpackage.yyr0
    public final String d() {
        return null;
    }

    @Override // defpackage.yyr0
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj11)) {
            return false;
        }
        yj11 yj11Var = (yj11) obj;
        return this.a.equals(yj11Var.a) && jl40.l(this.b, yj11Var.b) && jl40.l(this.c, yj11Var.c) && jl40.l(this.d, yj11Var.d) && this.e.equals(yj11Var.e) && this.f.equals(yj11Var.f) && jl40.l(this.g, yj11Var.g) && jl40.l(this.h, yj11Var.h) && this.i == yj11Var.i && this.j == yj11Var.j && jl40.l(this.k, yj11Var.k) && this.l.equals(yj11Var.l) && this.m.equals(yj11Var.m) && this.n == yj11Var.n && jl40.l(this.o, yj11Var.o) && jl40.l(this.p, yj11Var.p);
    }

    @Override // defpackage.yyr0
    public final String f() {
        return this.o;
    }

    @Override // defpackage.yyr0
    /* renamed from: getAction */
    public final q1 getC() {
        return this.g;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.a;
    }

    @Override // defpackage.yyr0
    public final BaseShortcutModel$Source getSource() {
        return this.q;
    }

    @Override // defpackage.a1f
    public final Counters h() {
        return this.k;
    }

    public final int hashCode() {
        int b = smw0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        FormattedText formattedText = this.d;
        int b2 = unr0.b(unr0.e((this.m.hashCode() + ly3.b(unr0.c((this.j.hashCode() + oyr.b(this.i, unr0.b((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((b + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31)) * 31)) * 31)) * 31, 31, this.h), 31)) * 31, 31, this.k.a), 31, this.l)) * 31, 31, this.n), 31, this.o);
        f0 f0Var = this.p;
        return (b2 + (f0Var != null ? f0Var.hashCode() : 0)) * 31;
    }

    @Override // defpackage.v0s0
    public final f0 i() {
        return this.p;
    }

    public final String toString() {
        StringBuilder v = b64.v("TurboButtonModel(id=", this.a, ", shortcutId=", this.b, ", title=");
        v.append((Object) this.c);
        v.append(", attributedTitle=");
        v.append(this.d);
        v.append(", textStyle=");
        v.append(this.e);
        v.append(", background=");
        v.append(this.f);
        v.append(", action=");
        v.append(this.g);
        v.append(", imageTag=");
        v.append(this.h);
        v.append(", fallbackImageRes=");
        v.append(this.i);
        v.append(", imageSize=");
        v.append(this.j);
        v.append(", counters=");
        v.append(this.k);
        v.append(", badges=");
        v.append(this.l);
        v.append(", service=");
        v.append(this.m);
        v.append(", titleMultiline=");
        v.append(this.n);
        v.append(", gridId=");
        v.append(this.o);
        v.append(", onboarding=");
        v.append(this.p);
        v.append(", eventPayload=null)");
        return v.toString();
    }

    public final tbu v() {
        return this.m;
    }
}
