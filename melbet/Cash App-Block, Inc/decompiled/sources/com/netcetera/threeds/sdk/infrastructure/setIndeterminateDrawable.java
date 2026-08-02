package com.netcetera.threeds.sdk.infrastructure;

/* loaded from: classes5.dex */
public class setIndeterminateDrawable {
    private static int ThreeDS2Service = 0;
    private static int getWarnings = 1;
    private final String ThreeDS2ServiceInstance;
    private final Boolean get;

    public setIndeterminateDrawable(String str, Boolean bool) {
        this.ThreeDS2ServiceInstance = str;
        this.get = bool;
    }

    public static setIndeterminateDrawable getWarnings() {
        return (setIndeterminateDrawable) ThreeDS2ServiceInstance(new Object[0], -381530957, 381530957, (int) System.currentTimeMillis());
    }

    public Boolean ThreeDS2ServiceInstance() {
        int i = getWarnings;
        int i2 = i & 113;
        int i3 = (i ^ 113) | i2;
        int i4 = (i2 ^ i3) + ((i3 & i2) << 1);
        ThreeDS2Service = i4 % 128;
        int i5 = i4 % 2;
        Boolean bool = this.get;
        if (i5 == 0) {
            return bool;
        }
        throw null;
    }

    public String get() {
        int i = getWarnings;
        String str = this.ThreeDS2ServiceInstance;
        int i2 = i & 89;
        int i3 = ((((i ^ 89) | i2) << 1) - (~(-((i | 89) & (~i2))))) - 1;
        ThreeDS2Service = i3 % 128;
        if (i3 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public static /* synthetic */ Object ThreeDS2ServiceInstance(Object[] objArr, int i, int i2, int i3) {
        setIndeterminateDrawable setindeterminatedrawable = new setIndeterminateDrawable("", Boolean.TRUE);
        ThreeDS2Service = (getWarnings + 37) % 128;
        return setindeterminatedrawable;
    }
}
