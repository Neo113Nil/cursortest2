package defpackage;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class z19UFEN2I extends ClickableSpan {
    public final int AvO7iQsrTN;
    public final SyyZR548qbcW EljAMC1QTz;
    public final int OOA6hdeuvCS;

    public z19UFEN2I(int i, SyyZR548qbcW syyZR548qbcW, int i2) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = syyZR548qbcW;
        this.AvO7iQsrTN = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.OOA6hdeuvCS);
        this.EljAMC1QTz.GWasM1elztuh.performAction(this.AvO7iQsrTN, bundle);
    }
}
