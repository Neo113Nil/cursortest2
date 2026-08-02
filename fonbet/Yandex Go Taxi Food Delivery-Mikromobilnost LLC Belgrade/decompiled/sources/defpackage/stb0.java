package defpackage;

/* loaded from: classes6.dex */
public final class stb0 implements qo21 {
    public static final stb0 a = new stb0();
    public static final ro21 b;
    public static final ro21 c;
    public static final ro21 d;

    static {
        int i = k0h0.pin_absence_user_location_icon;
        int i2 = c0h0.ic_user_location_arrow;
        int i3 = esg0.pin_absence_source_item_anchor_y;
        b = new ro21(i, i2, i3, 232, new int[]{i});
        c = new ro21(i, i2, i3, 236, null);
        d = new ro21(k0h0.pin_absence_user_sharing_location_icon, c0h0.ic_user_sharing_location_arrow, i3, 236, null);
    }

    @Override // defpackage.qo21
    public final ro21 a() {
        return d;
    }

    @Override // defpackage.qo21
    public final int b() {
        return k0h0.pin_absence_user_location_icon;
    }

    @Override // defpackage.qo21
    public final ro21 c() {
        return b;
    }

    @Override // defpackage.qo21
    public final ro21 d() {
        return c;
    }
}
