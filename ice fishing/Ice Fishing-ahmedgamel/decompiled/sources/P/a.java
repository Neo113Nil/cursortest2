package P;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f2321a;

    /* renamed from: b, reason: collision with root package name */
    public final k f2322b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2323c;

    public a(int i, k kVar, int i4) {
        this.f2321a = i;
        this.f2322b = kVar;
        this.f2323c = i4;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2321a);
        this.f2322b.f2340a.performAction(this.f2323c, bundle);
    }
}
