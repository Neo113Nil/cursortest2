package io.appmetrica.analytics.coreapi.internal.model;

/* loaded from: classes.dex */
public final class ScreenInfo {

    /* renamed from: a, reason: collision with root package name */
    private final int f3764a;

    /* renamed from: b, reason: collision with root package name */
    private final int f3765b;

    /* renamed from: c, reason: collision with root package name */
    private final int f3766c;

    /* renamed from: d, reason: collision with root package name */
    private final float f3767d;

    public ScreenInfo(int i2, int i3, int i4, float f2) {
        this.f3764a = i2;
        this.f3765b = i3;
        this.f3766c = i4;
        this.f3767d = f2;
    }

    public static /* synthetic */ ScreenInfo copy$default(ScreenInfo screenInfo, int i2, int i3, int i4, float f2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = screenInfo.f3764a;
        }
        if ((i5 & 2) != 0) {
            i3 = screenInfo.f3765b;
        }
        if ((i5 & 4) != 0) {
            i4 = screenInfo.f3766c;
        }
        if ((i5 & 8) != 0) {
            f2 = screenInfo.f3767d;
        }
        return screenInfo.copy(i2, i3, i4, f2);
    }

    public final int component1() {
        return this.f3764a;
    }

    public final int component2() {
        return this.f3765b;
    }

    public final int component3() {
        return this.f3766c;
    }

    public final float component4() {
        return this.f3767d;
    }

    public final ScreenInfo copy(int i2, int i3, int i4, float f2) {
        return new ScreenInfo(i2, i3, i4, f2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenInfo)) {
            return false;
        }
        ScreenInfo screenInfo = (ScreenInfo) obj;
        return this.f3764a == screenInfo.f3764a && this.f3765b == screenInfo.f3765b && this.f3766c == screenInfo.f3766c && Float.valueOf(this.f3767d).equals(Float.valueOf(screenInfo.f3767d));
    }

    public final int getDpi() {
        return this.f3766c;
    }

    public final int getHeight() {
        return this.f3765b;
    }

    public final float getScaleFactor() {
        return this.f3767d;
    }

    public final int getWidth() {
        return this.f3764a;
    }

    public int hashCode() {
        return Float.hashCode(this.f3767d) + ((Integer.hashCode(this.f3766c) + ((Integer.hashCode(this.f3765b) + (Integer.hashCode(this.f3764a) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ScreenInfo(width=" + this.f3764a + ", height=" + this.f3765b + ", dpi=" + this.f3766c + ", scaleFactor=" + this.f3767d + ')';
    }
}
