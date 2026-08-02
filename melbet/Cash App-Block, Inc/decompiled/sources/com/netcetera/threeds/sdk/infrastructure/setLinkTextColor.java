package com.netcetera.threeds.sdk.infrastructure;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class setLinkTextColor {
    private static int ThreeDS2ServiceInstance = 0;
    private static int getWarnings = 1;
    private final long get;
    private final Handler initialize;

    public setLinkTextColor(long j, Handler handler) {
        this.get = j;
        this.initialize = handler;
    }

    public static /* synthetic */ Object ThreeDS2Service(Object[] objArr, int i, int i2, int i3) {
        setLinkTextColor setlinktextcolor = new setLinkTextColor(TimeUnit.MINUTES.toMillis(((Number) objArr[0]).intValue()), new Handler(Looper.getMainLooper()));
        int i4 = getWarnings;
        int i5 = i4 & 23;
        ThreeDS2ServiceInstance = ((((i4 ^ 23) | i5) << 1) - ((i4 | 23) & (~i5))) % 128;
        return setlinktextcolor;
    }

    public static setLinkTextColor initialize(int i) {
        return (setLinkTextColor) ThreeDS2Service(new Object[]{Integer.valueOf(i)}, 316398404, -316398404, i);
    }

    public setHyphenationFrequency ThreeDS2Service(setLineBreakWordStyle setlinebreakwordstyle) {
        setMinLines setminlines = new setMinLines(setlinebreakwordstyle, new setHorizontallyScrolling(), this.initialize, this.get);
        int i = getWarnings;
        int i2 = ((i ^ 113) | (i & 113)) << 1;
        int i3 = -(((~i) & 113) | (i & (-114)));
        int i4 = (i2 & i3) + (i3 | i2);
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return setminlines;
    }
}
