package z;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1089a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f8608a;

    /* renamed from: b, reason: collision with root package name */
    public final C1096h f8609b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8610c;

    public C1089a(int i2, C1096h c1096h, int i3) {
        this.f8608a = i2;
        this.f8609b = c1096h;
        this.f8610c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f8608a);
        this.f8609b.f8618a.performAction(this.f8610c, bundle);
    }
}
