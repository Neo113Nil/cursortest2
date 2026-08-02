package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.Yb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1395Yb extends LinearLayout {
    public static int A00 = (int) (XX.A02 * 56.0f);
    public static int A01 = (int) (XX.A02 * 56.0f);

    public abstract void A09();

    public abstract void A0A();

    public abstract void A0B();

    public abstract void A0C(float f2, int i);

    public abstract void A0D(C1118Na c1118Na, boolean z6);

    public abstract boolean A0E();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC1394Ya getToolbarListener();

    public abstract void setAdReportingVisible(boolean z6);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC1058Kr viewOnClickListenerC1058Kr);

    public abstract void setFullscreen(boolean z6);

    public abstract void setPageDetails(C1130Nm c1130Nm, String str, int i, C1136Ns c1136Ns);

    public abstract void setPageDetailsVisible(boolean z6);

    public abstract void setProgress(float f2);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(YM ym);

    public abstract void setProgressImmediate(float f2);

    public abstract void setProgressSpinnerInvisible(boolean z6);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i);

    public abstract void setToolbarListener(InterfaceC1394Ya interfaceC1394Ya);

    public AbstractC1395Yb(Context context) {
        super(context);
    }

    public void A08() {
    }

    public Rect getRequestedMargins() {
        return null;
    }
}
