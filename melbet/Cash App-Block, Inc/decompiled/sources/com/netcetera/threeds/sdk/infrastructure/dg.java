package com.netcetera.threeds.sdk.infrastructure;

import android.os.SystemClock;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.netcetera.threeds.sdk.infrastructure.ev;
import com.netcetera.threeds.sdk.infrastructure.setCacheColorHint;
import com.netcetera.threeds.sdk.infrastructure.setMinEms;
import com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class dg implements replace {
    private static int createTransaction = 1;
    private static int getSDKVersion;
    private final String ThreeDS2Service;
    private final no ThreeDS2ServiceInstance;
    private final boolean get;
    private final setCacheColorHint.getWarnings getWarnings;
    private final String initialize;

    /* renamed from: com.netcetera.threeds.sdk.infrastructure.dg$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] ThreeDS2Service;
        private static int ThreeDS2ServiceInstance = 0;
        private static int getWarnings = 1;

        static {
            int[] iArr = new int[setCacheColorHint.getWarnings.values().length];
            ThreeDS2Service = iArr;
            try {
                iArr[setCacheColorHint.getWarnings.getWarnings.ordinal()] = 1;
                int i = getWarnings;
                int i2 = i & 7;
                ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 7) & (~i2), ~(i2 << 1), 1, 128);
            } catch (NoSuchFieldError unused) {
            }
            try {
                ThreeDS2Service[setCacheColorHint.getWarnings.ThreeDS2ServiceInstance.ordinal()] = 2;
                int i3 = ThreeDS2ServiceInstance;
                getWarnings = ((i3 & 23) + (i3 | 23)) % 128;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ThreeDS2Service[setCacheColorHint.getWarnings.get.ordinal()] = 3;
                int i4 = getWarnings;
                int i5 = i4 & 93;
                int i6 = (i4 ^ 93) | i5;
                ThreeDS2ServiceInstance = ((i5 & i6) + (i6 | i5)) % 128;
            } catch (NoSuchFieldError unused3) {
            }
            int i7 = ThreeDS2ServiceInstance;
            getWarnings = Thread$State$EnumUnboxingLocalUtility.m(i7 & 46, i7 | 46, 1, 128);
        }
    }

    public dg(setCacheColorHint.getWarnings getwarnings, String str, String str2, boolean z) {
        this.ThreeDS2ServiceInstance = (no) nu.initialize(new Object[]{dg.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
        this.getWarnings = getwarnings;
        this.ThreeDS2Service = str;
        this.initialize = str2;
        this.get = z;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.replace
    public void ThreeDS2Service(setMinEms.initialize initializeVar) {
        getSDKVersion = (createTransaction + 85) % 128;
        SystemClock.elapsedRealtimeNanos();
        int i = AnonymousClass1.ThreeDS2Service[this.getWarnings.ordinal()];
        if (i == 1) {
            initializeVar.getWarnings(Boolean.TRUE);
        } else if (i == 2) {
            initializeVar.getWarnings(Boolean.TRUE);
            if (this.get) {
                setTitleMarginStart settitlemarginstart = new setTitleMarginStart();
                setTitleMarginStart.getWarnings getwarnings = new setTitleMarginStart.getWarnings();
                getwarnings.ThreeDS2Service(this.ThreeDS2Service);
                getwarnings.get(this.initialize);
                settitlemarginstart.ThreeDS2ServiceInstance(getwarnings);
                initializeVar.getWarnings(settitlemarginstart);
            }
        } else if (i == 3) {
            initializeVar.initialize(this.ThreeDS2Service);
            initializeVar.ThreeDS2ServiceInstance(this.initialize);
        }
        int i2 = createTransaction + 39;
        getSDKVersion = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    public dg(setCacheColorHint.getWarnings getwarnings, String str, String str2) {
        this(getwarnings, str, str2, false);
    }

    public dg(setCacheColorHint.getWarnings getwarnings, String str) {
        this(getwarnings, str, ev.ThreeDS2Service.ThreeDS2Service.initialize(), false);
    }
}
