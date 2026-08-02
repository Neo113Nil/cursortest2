package defpackage;

import android.content.Context;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.information.InformationModalView;
import ru.yandex.taxi.communications.model.widgets.ActionButton;
import ru.yandex.taxi.widget.c;

/* loaded from: classes5.dex */
public final class uu implements tu {
    public final k7x0 a;
    public final i130 b;
    public final iuv c;

    public uu(k7x0 k7x0Var, i130 i130Var, iuv iuvVar) {
        this.a = k7x0Var;
        this.b = i130Var;
        this.c = iuvVar;
    }

    public final void a(ActionButton.h hVar) {
        String str;
        if (hVar.c.length() > 0) {
            str = ((m7x0) this.a).a(hVar.c);
        } else {
            str = "";
        }
        String str2 = str;
        FormattedText formattedText = hVar.b;
        String str3 = hVar.a;
        ActionButton.e eVar = hVar.d;
        juv juvVar = new juv(str3, str2, eVar.a, eVar.b, eVar.c, formattedText);
        ho9 ho9Var = this.c.a;
        this.b.a().s(new InformationModalView((Context) ho9Var.a.get(), juvVar, (pav) ho9Var.b.get(), (pdc) ho9Var.c.get(), (c) ho9Var.d.get()), true);
    }
}
