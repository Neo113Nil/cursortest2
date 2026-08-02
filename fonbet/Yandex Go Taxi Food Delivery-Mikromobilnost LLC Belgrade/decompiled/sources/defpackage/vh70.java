package defpackage;

import ru.yandex.taxi.superapp.address.OrderAddressViewModel$State;

/* loaded from: classes6.dex */
public final class vh70 {
    public static final int d;
    public static final vh70 e;
    public static final vh70 f;
    public final int a;
    public final String b;
    public final OrderAddressViewModel$State c;

    static {
        int i = kyh0.new_mainscreen_from;
        d = i;
        e = new vh70(i, "", OrderAddressViewModel$State.GONE);
        f = new vh70(i, "", OrderAddressViewModel$State.IN_PROGRESS);
    }

    public vh70(int i, String str, OrderAddressViewModel$State orderAddressViewModel$State) {
        this.a = i;
        this.b = str;
        this.c = orderAddressViewModel$State;
    }
}
