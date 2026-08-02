package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public class jf implements iz {
    private static int ThreeDS2Service = 0;
    private static int ThreeDS2ServiceInstance = 1;
    private setTitleMarginStart get;
    private setTitleMarginStart.get getWarnings = setTitleMarginStart.get.ThreeDS2Service;

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        if ((r0 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0067, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart.get.initialize.equals(r4.get.getSDKInfo()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0069, code lost:
    
        r5 = com.netcetera.threeds.sdk.infrastructure.jf.ThreeDS2Service + 95;
        com.netcetera.threeds.sdk.infrastructure.jf.ThreeDS2ServiceInstance = r5 % 128;
        r5 = r5 % 2;
        r0 = r4.get;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        if (r5 == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        r0.initialize((com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart.initialize) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        r0.initialize((com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart.initialize) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        r4 = r4.get;
        r5 = com.netcetera.threeds.sdk.infrastructure.jf.ThreeDS2ServiceInstance;
        r0 = r5 & 33;
        r5 = -(-(r5 | 33));
        com.netcetera.threeds.sdk.infrastructure.jf.ThreeDS2Service = (((r0 | r5) << 1) - (r5 ^ r0)) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart.get.initialize.equals(r4.get.getSDKInfo());
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003c, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.put.get.equals(r5) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.put.get.equals(r5) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
    
        if (com.netcetera.threeds.sdk.infrastructure.setTitleMarginStart.get.ThreeDS2Service.equals(r4.get.getSDKInfo()) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x004c, code lost:
    
        r5 = com.netcetera.threeds.sdk.infrastructure.jf.ThreeDS2Service;
        r0 = (r5 & 65) + (r5 | 65);
        com.netcetera.threeds.sdk.infrastructure.jf.ThreeDS2ServiceInstance = r0 % 128;
     */
    @Override // com.netcetera.threeds.sdk.infrastructure.iz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public setMarqueeRepeatLimit ThreeDS2Service(put putVar) {
        int i = ThreeDS2ServiceInstance;
        int i2 = i | 35;
        int i3 = i2 << 1;
        int i4 = -(i2 & (~(i & 35)));
        ThreeDS2Service = (((i3 | i4) << 1) - (i4 ^ i3)) % 128;
        if (this.get != null) {
            int i5 = (i ^ 109) + ((i & 109) << 1);
            ThreeDS2Service = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 89 / 0;
            }
        }
        int i7 = ThreeDS2Service + 63;
        ThreeDS2ServiceInstance = i7 % 128;
        if (i7 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.iz
    public void initialize(setMarqueeRepeatLimit setmarqueerepeatlimit) {
        ThreeDS2Service = (ThreeDS2ServiceInstance + 3) % 128;
        if (setmarqueerepeatlimit instanceof setTitleMarginStart) {
            setTitleMarginStart settitlemarginstart = new setTitleMarginStart();
            settitlemarginstart.initialize(this.getWarnings);
            setTitleMarginStart settitlemarginstart2 = (setTitleMarginStart) setmarqueerepeatlimit;
            settitlemarginstart.initialize(settitlemarginstart2.getSDKVersion());
            settitlemarginstart.ThreeDS2ServiceInstance((setTitleMarginStart.getWarnings) og.ThreeDS2Service(settitlemarginstart2.ThreeDS2Service(), new setTitleMarginStart.getWarnings()));
            this.get = settitlemarginstart;
            int i = ThreeDS2Service;
            ThreeDS2ServiceInstance = SVG$Unit$EnumUnboxingLocalUtility.m$1((i | 46) << 1, i ^ 46, 1, 128);
        }
        int i2 = ThreeDS2Service;
        int i3 = i2 & 85;
        int i4 = (((i2 ^ 85) | i3) << 1) - ((i2 | 85) & (~i3));
        ThreeDS2ServiceInstance = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public void ThreeDS2Service(setTitleMarginStart.get getVar) {
        int i = ThreeDS2ServiceInstance;
        this.getWarnings = getVar;
        int i2 = i ^ 15;
        int i3 = ((i & 15) | i2) << 1;
        int i4 = -i2;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        ThreeDS2Service = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 48 / 0;
        }
    }
}
