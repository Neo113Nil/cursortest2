package defpackage;

import android.view.ViewGroup;
import java.util.function.Predicate;
import ru.yandex.taxi.plaque.PlaqueView;

/* loaded from: classes5.dex */
public final /* synthetic */ class sdc implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sdc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        boolean sceneRoot_delegate$lambda$0$0;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 6:
                if (((mit) obj).a == ((o2y0) obj2)) {
                }
                break;
            case 23:
                sceneRoot_delegate$lambda$0$0 = PlaqueView.sceneRoot_delegate$lambda$0$0((PlaqueView) obj2, (ViewGroup) obj);
                break;
        }
        return ((Boolean) ((g8m0) obj2).invoke(obj)).booleanValue();
    }
}
