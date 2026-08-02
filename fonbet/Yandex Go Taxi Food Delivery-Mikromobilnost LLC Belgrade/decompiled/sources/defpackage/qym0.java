package defpackage;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import java.util.Locale;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;
import ru.yandex.taxi.layers.a;

/* loaded from: classes8.dex */
public final class qym0 implements a {
    public final lx4 a;
    public final dyx b;

    public qym0(lx4 lx4Var, dyx dyxVar) {
        this.a = lx4Var;
        this.b = dyxVar;
    }

    @Override // ru.yandex.taxi.layers.a
    public final void a(String str, MapObjectComponentType mapObjectComponentType, LayersAnalyticEventEmmiter.Event event, sm00 sm00Var) {
        dyx dyxVar = this.b;
        String name = dyxVar.a().a.name();
        Locale locale = Locale.ROOT;
        vxn0.b(this.a, str, mapObjectComponentType, event, name.toLowerCase(locale), dyxVar.a().b.a.name().toLowerCase(locale));
    }
}
