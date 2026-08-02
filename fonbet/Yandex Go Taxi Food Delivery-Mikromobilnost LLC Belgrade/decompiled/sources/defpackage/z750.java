package defpackage;

import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes9.dex */
public final class z750 {
    public final ListItemComponent a;
    public kdc b;
    public final int c;
    public int d;
    public final int e;
    public final int f;

    public z750(ListItemComponent listItemComponent, bdc bdcVar, int i, int i2, int i3, int i4) {
        this.a = listItemComponent;
        this.b = bdcVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
    }

    public final void a() {
        this.a.invalidateNavigationParams(this);
    }
}
