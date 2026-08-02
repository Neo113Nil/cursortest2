package defpackage;

import com.yandex.go.layers.api.model.MapObjectComponentType;
import java.util.Locale;
import ru.yandex.taxi.layers.LayersAnalyticEventEmmiter;
import ru.yandex.taxi.layers.a;

/* loaded from: classes8.dex */
public final class qbo0 implements a {
    public final kf00 a;
    public final dyx b;

    public qbo0(kf00 kf00Var, dyx dyxVar) {
        this.a = kf00Var;
        this.b = dyxVar;
    }

    @Override // ru.yandex.taxi.layers.a
    public final void a(String str, MapObjectComponentType mapObjectComponentType, LayersAnalyticEventEmmiter.Event event, sm00 sm00Var) {
        dyx dyxVar = this.b;
        String name = dyxVar.a().a.name();
        Locale locale = Locale.ROOT;
        vxn0.a(this.a, str, mapObjectComponentType, event, name.toLowerCase(locale), dyxVar.a().b.a.name().toLowerCase(locale), new k6d(5), new k6d(6));
    }
}
