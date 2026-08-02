package com.netcetera.threeds.sdk.infrastructure;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.netcetera.threeds.sdk.infrastructure.setMinEms;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes5.dex */
public class dh implements replace {
    private static int createTransaction = 1;
    private static int get;
    private final no ThreeDS2ServiceInstance = (no) nu.initialize(new Object[]{dh.class}, -1889553984, 1889553984, (int) System.currentTimeMillis());
    private final size getWarnings;
    private static char[] initialize = {35185, 18571, 2804, 52416, 36391, 16384, 632, 50260, 34800, 22963, 7163, 56627, 40717, 20855, 4939, 53995, 38077, 22236, 10386, 59929, 44053, 28277, 8618, 58246, 42482, 26509, 14653, 64286, 48480, 32601, 16100, 61659, 45795, 29752, 63448, 13869, 29783, 45694, 61584, 16108, 31942, 47845, 63760, 10026, 25887, 41867, 57775, 12244, 28158, 44058, 60001, 10256, 22116, 38047, 53933, 4296, 24330, 40232, 56130, 6440, 18316, 34234, 50128, 504, 16407, 36411, 52307, 2695, 18594, 30436, 46310, 62249, 12605, 32578, 48487, 64385, 14833};
    private static long ThreeDS2Service = -946347287450269467L;

    public dh(size sizeVar) {
        this.getWarnings = sizeVar;
    }

    private void ThreeDS2ServiceInstance(setMinEms.initialize initializeVar) {
        get = (createTransaction + 97) % 128;
        TextUtils.indexOf((CharSequence) "", '0', 0);
        ViewConfiguration.getScrollDefaultDelay();
        KeyEvent.getMaxKeyCode();
        initializeVar.initialize(getInfo.getWarnings);
        int i = get + 45;
        createTransaction = i % 128;
        if (i % 2 == 0) {
            int i2 = 14 / 0;
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.replace
    public void ThreeDS2Service(setMinEms.initialize initializeVar) {
        int i = createTransaction + 69;
        get = i % 128;
        int i2 = i % 2;
        size sizeVar = this.getWarnings;
        if (i2 != 0) {
            throw null;
        }
        if (sizeVar == null) {
            ThreeDS2ServiceInstance(initializeVar);
            createTransaction = (get + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        } else if (sizeVar instanceof bg) {
            String warnings = ((bg) sizeVar).getWarnings();
            if (oj.getWarnings((CharSequence) warnings)) {
                int i3 = get + 17;
                createTransaction = i3 % 128;
                if (i3 % 2 == 0) {
                    ThreeDS2ServiceInstance(initializeVar);
                    throw null;
                }
                ThreeDS2ServiceInstance(initializeVar);
            } else {
                Color.green(0);
                ViewConfiguration.getEdgeSlop();
                Gravity.getAbsoluteGravity(0, 0);
                initializeVar.ThreeDS2Service(warnings);
            }
        }
        int i4 = get + 81;
        createTransaction = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 87 / 0;
        }
    }
}
