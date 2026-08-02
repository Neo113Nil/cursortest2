package defpackage;

import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.dto.response.ButtonStackItem;
import com.yandex.go.shortcuts.dto.response.Title;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class r27 extends ButtonStackItem implements yyr0, e6v {
    public final String d;
    public final String e;
    public final Title f;
    public final q1 g;
    public final tbu h;
    public final String i;
    public final String j;
    public final BaseShortcutModel$Source k;
    public final String l;

    public r27(String str, String str2, Title title, q1 q1Var, tbu tbuVar, String str3, String str4, BaseShortcutModel$Source baseShortcutModel$Source, String str5) {
        super(str2, title, q1Var);
        this.d = str;
        this.e = str2;
        this.f = title;
        this.g = q1Var;
        this.h = tbuVar;
        this.i = str3;
        this.j = str4;
        this.k = baseShortcutModel$Source;
        this.l = str5;
    }

    @Override // defpackage.yyr0
    public final String d() {
        return this.l;
    }

    @Override // defpackage.yyr0
    public final String e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r27)) {
            return false;
        }
        r27 r27Var = (r27) obj;
        return this.d.equals(r27Var.d) && jl40.l(this.e, r27Var.e) && jl40.l(this.f, r27Var.f) && jl40.l(this.g, r27Var.g) && this.h.equals(r27Var.h) && jl40.l(this.i, r27Var.i) && jl40.l(this.j, r27Var.j) && this.k == r27Var.k && jl40.l(this.l, r27Var.l);
    }

    @Override // defpackage.yyr0
    public final String f() {
        return this.j;
    }

    @Override // com.yandex.go.shortcuts.dto.response.ButtonStackItem, defpackage.yyr0
    /* renamed from: getAction */
    public final q1 getC() {
        return this.g;
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.d;
    }

    @Override // defpackage.yyr0
    public final BaseShortcutModel$Source getSource() {
        return this.k;
    }

    public final int hashCode() {
        int hashCode = (this.k.hashCode() + unr0.b(unr0.b((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + unr0.b(this.d.hashCode() * 31, 31, this.e)) * 31)) * 31)) * 31, 31, this.i), 31, this.j)) * 31;
        String str = this.l;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ButtonStackPresentationModel(id=", this.d, ", color=", this.e, ", title=");
        v.append(this.f);
        v.append(", action=");
        v.append(this.g);
        v.append(", service=");
        v.append(this.h);
        v.append(", shortcutId=");
        v.append(this.i);
        v.append(", gridId=");
        v.append(this.j);
        v.append(", source=");
        v.append(this.k);
        v.append(", eventPayload=");
        return oyr.t(v, this.l, Extension.C_BRAKE);
    }

    @Override // com.yandex.go.shortcuts.dto.response.ButtonStackItem
    /* renamed from: v */
    public final String getA() {
        return this.e;
    }

    @Override // com.yandex.go.shortcuts.dto.response.ButtonStackItem
    /* renamed from: w */
    public final Title getB() {
        return this.f;
    }

    public final tbu y() {
        return this.h;
    }
}
