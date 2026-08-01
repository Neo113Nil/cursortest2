package P;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f2390a;

    /* renamed from: b, reason: collision with root package name */
    public final k f2391b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2392c;

    public a(int i, k kVar, int i6) {
        this.f2390a = i;
        this.f2391b = kVar;
        this.f2392c = i6;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2390a);
        this.f2391b.f2409a.performAction(this.f2392c, bundle);
    }
}
