package com.google.android.datatransport;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public class WinterFlowWidgetInterface extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WinterFlowWidgetInterface(Looper looper, int i) {
        super(looper);
        switch (i) {
            case 2:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
