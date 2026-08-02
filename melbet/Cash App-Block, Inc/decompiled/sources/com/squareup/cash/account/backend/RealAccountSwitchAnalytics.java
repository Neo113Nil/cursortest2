package com.squareup.cash.account.backend;

import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchingMetadata;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.performance.MemoryInfo;
import com.squareup.cash.util.clock.AndroidClock;

/* loaded from: classes.dex */
public final class RealAccountSwitchAnalytics {
    public final Analytics analytics;
    public final AndroidClock clock;
    public final MemoryInfo.Reader memoryInfoReader;

    /* loaded from: classes5.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountSwitcher$AccountSwitchingMetadata.SwitchSource.values().length];
            try {
                AccountSwitcher$AccountSwitchingMetadata.SwitchSource switchSource = AccountSwitcher$AccountSwitchingMetadata.SwitchSource.SWITCH;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AccountSwitcher$AccountSwitchingMetadata.SwitchSource switchSource2 = AccountSwitcher$AccountSwitchingMetadata.SwitchSource.SWITCH;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealAccountSwitchAnalytics(Analytics analytics, AndroidClock androidClock, MemoryInfo.Reader reader) {
        analytics.getClass();
        androidClock.getClass();
        reader.getClass();
        this.analytics = analytics;
        this.clock = androidClock;
        this.memoryInfoReader = reader;
    }
}
