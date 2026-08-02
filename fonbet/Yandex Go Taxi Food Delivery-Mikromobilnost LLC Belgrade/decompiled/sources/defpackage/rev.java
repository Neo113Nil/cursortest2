package defpackage;

import com.ybsdk.core.utils.ScreenDensity;

/* loaded from: classes2.dex */
public final class rev extends tev {
    public static final rev d;
    public static final rev e;
    public static final rev f;
    public static final rev g;
    public static final rev h;
    public static final rev i;
    public static final rev j;
    public static final rev k;
    public static final rev l = new rev(36, 24, 8);
    public static final rev m;
    public static final rev n;
    public static final rev o;
    public static final rev p;
    public final /* synthetic */ int c;

    static {
        int i2 = 0;
        d = new rev(i2, i2, 0);
        e = new rev(i2, i2, 1);
        f = new rev(i2, i2, 2);
        int i3 = 12;
        g = new rev(i3, i3, 3);
        int i4 = 16;
        h = new rev(i4, i4, 4);
        int i5 = 20;
        i = new rev(i5, i5, 5);
        int i6 = 24;
        j = new rev(i6, i6, 6);
        int i7 = 32;
        k = new rev(i7, i7, 7);
        int i8 = 40;
        m = new rev(i8, i8, 9);
        int i9 = 48;
        n = new rev(i9, i9, 10);
        int i10 = 68;
        o = new rev(i10, i10, 11);
        int i11 = 86;
        p = new rev(i11, i11, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rev(int i2, int i3, int i4) {
        super(i2, i3);
        this.c = i4;
    }

    @Override // defpackage.tev
    public String c(ScreenDensity screenDensity) {
        switch (this.c) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 11:
                if (sev.a[screenDensity.ordinal()] != 1) {
                    break;
                }
                break;
        }
        return super.c(screenDensity);
    }
}
