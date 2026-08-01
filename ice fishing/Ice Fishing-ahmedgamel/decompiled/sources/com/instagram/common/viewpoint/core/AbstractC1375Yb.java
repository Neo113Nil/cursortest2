package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.Yb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1375Yb extends LinearLayout {
    public static int A00 = (int) (XX.A02 * 56.0f);
    public static int A01 = (int) (XX.A02 * 56.0f);

    public abstract void A09();

    public abstract void A0A();

    public abstract void A0B();

    public abstract void A0C(float f3, int i);

    public abstract void A0D(C1098Na c1098Na, boolean z3);

    public abstract boolean A0E();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC1374Ya getToolbarListener();

    public abstract void setAdReportingVisible(boolean z3);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(ViewOnClickListenerC1038Kr viewOnClickListenerC1038Kr);

    public abstract void setFullscreen(boolean z3);

    public abstract void setPageDetails(C1110Nm c1110Nm, String str, int i, C1116Ns c1116Ns);

    public abstract void setPageDetailsVisible(boolean z3);

    public abstract void setProgress(float f3);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(YM ym);

    public abstract void setProgressImmediate(float f3);

    public abstract void setProgressSpinnerInvisible(boolean z3);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i);

    public abstract void setToolbarListener(InterfaceC1374Ya interfaceC1374Ya);

    public AbstractC1375Yb(Context context) {
        super(context);
    }

    public void A08() {
    }

    public Rect getRequestedMargins() {
        return null;
    }
}
