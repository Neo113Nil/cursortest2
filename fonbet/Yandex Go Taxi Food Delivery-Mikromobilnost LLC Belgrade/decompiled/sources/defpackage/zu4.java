package defpackage;

import flex.section.divkit.DivkitSnippet;
import java.util.Set;
import ru.yandex.taxi.promotions.model.Promotion;

/* loaded from: classes9.dex */
public final /* synthetic */ class zu4 implements tls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Set b;

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        Set set = this.b;
        switch (i) {
            case 0:
                return Boolean.valueOf(set.contains(((Promotion) obj).getB()));
            default:
                DivkitSnippet divkitSnippet = (DivkitSnippet) obj;
                return Boolean.valueOf(set.contains(divkitSnippet.a) || divkitSnippet.i);
        }
    }
}
