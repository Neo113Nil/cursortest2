package i3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: g, reason: collision with root package name */
    public final int f3151g;

    /* renamed from: h, reason: collision with root package name */
    public final d f3152h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3153i;

    public a(int i10, d dVar, int i11) {
        this.f3151g = i10;
        this.f3152h = dVar;
        this.f3153i = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3151g);
        this.f3152h.f3164a.performAction(this.f3153i, bundle);
    }
}
