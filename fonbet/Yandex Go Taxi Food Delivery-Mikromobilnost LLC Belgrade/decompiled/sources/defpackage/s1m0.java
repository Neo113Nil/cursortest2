package defpackage;

import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$IdType;
import ru.yandex.taxi.favorites.analytics.FavoritesAnalytics$TripButtonName;

/* loaded from: classes5.dex */
public final /* synthetic */ class s1m0 implements rqs0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1m0 b;
    public final /* synthetic */ String c;

    public /* synthetic */ s1m0(u1m0 u1m0Var, String str, int i) {
        this.a = i;
        this.b = u1m0Var;
        this.c = str;
    }

    @Override // defpackage.rqs0
    public final void a(nqs0 nqs0Var, wss0 wss0Var) {
        int i = this.a;
        String str = this.c;
        u1m0 u1m0Var = this.b;
        switch (i) {
            case 0:
                u1m0Var.S.invoke(nqs0Var, new tpk0(str, FavoritesAnalytics$IdType.Ride, FavoritesAnalytics$TripButtonName.Trip));
                break;
            default:
                u1m0Var.S.invoke(nqs0Var, new tpk0(str, FavoritesAnalytics$IdType.Ride, FavoritesAnalytics$TripButtonName.Settings));
                break;
        }
    }
}
