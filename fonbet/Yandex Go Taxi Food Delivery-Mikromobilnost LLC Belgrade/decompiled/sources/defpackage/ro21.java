package defpackage;

/* loaded from: classes6.dex */
public final class ro21 {
    public final int a;
    public final int b;
    public final int[] c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public ro21(int i, int i2, int i3, int i4, int[] iArr) {
        iArr = (i4 & 4) != 0 ? null : iArr;
        int i5 = xrg0.user_location_anchor_x;
        i3 = (i4 & 16) != 0 ? xrg0.user_location_anchor_y : i3;
        int i6 = xrg0.arrow_item_anchor_x;
        int i7 = xrg0.arrow_item_anchor_y;
        int i8 = xrg0.arrow_scale;
        this.a = i;
        this.b = i2;
        this.c = iArr;
        this.d = i5;
        this.e = i3;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }
}
