package defpackage;

import java.util.ArrayList;
import ru.yandex.taxi.fragment.YandexTaxiFragment;
import ru.yandex.taxi.fragment.settings.ParksListFragment;
import ru.yandex.taxi.parks.view.ParksContentView;

/* loaded from: classes6.dex */
public final class te90 implements af90 {
    public final /* synthetic */ ParksContentView a;

    public te90(ParksContentView parksContentView) {
        this.a = parksContentView;
    }

    @Override // defpackage.af90
    public final void G9(ArrayList arrayList) {
        xe90 xe90Var;
        xe90Var = this.a.parkAdapter;
        ArrayList arrayList2 = xe90Var.a;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        xe90Var.notifyDataSetChanged();
    }

    @Override // defpackage.af90
    public final void h5() {
        Object obj;
        obj = ((YandexTaxiFragment) ((ParksListFragment) ((aq80) this.a.getEventsListener()).a)).callback;
        je90 je90Var = (je90) obj;
        if (je90Var != null) {
            je90Var.b.r(new qu(9));
        }
    }
}
