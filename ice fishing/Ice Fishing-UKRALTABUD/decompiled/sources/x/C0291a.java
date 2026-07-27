package x;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: x.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0291a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f3073a;

    /* renamed from: b, reason: collision with root package name */
    public final C0298h f3074b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3075c;

    public C0291a(int i2, C0298h c0298h, int i3) {
        this.f3073a = i2;
        this.f3074b = c0298h;
        this.f3075c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3073a);
        this.f3074b.f3083a.performAction(this.f3075c, bundle);
    }
}
