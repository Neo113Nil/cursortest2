package x;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0285a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f3078a;

    /* renamed from: b, reason: collision with root package name */
    public final C0292h f3079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3080c;

    public C0285a(int i2, C0292h c0292h, int i3) {
        this.f3078a = i2;
        this.f3079b = c0292h;
        this.f3080c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3078a);
        this.f3079b.f3088a.performAction(this.f3080c, bundle);
    }
}
