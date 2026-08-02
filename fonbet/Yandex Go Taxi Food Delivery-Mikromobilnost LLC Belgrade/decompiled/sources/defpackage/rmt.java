package defpackage;

import java.util.LinkedHashSet;
import ru.yandex.taxi.appdelegates.BadgeType;

/* loaded from: classes9.dex */
public final class rmt extends jm4 {
    public final LinkedHashSet b;

    public rmt() {
        BadgeType[] badgeTypeArr = {BadgeType.PaymentMiniWidgets, BadgeType.BankQr, BadgeType.Plus};
        LinkedHashSet linkedHashSet = new LinkedHashSet(gw00.d(3));
        j73.Z(badgeTypeArr, linkedHashSet);
        this.b = linkedHashSet;
    }

    @Override // defpackage.jm4
    public final LinkedHashSet a() {
        return this.b;
    }
}
