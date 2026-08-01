package P;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f878a;

    /* renamed from: b, reason: collision with root package name */
    public final f f879b;

    /* renamed from: c, reason: collision with root package name */
    public final int f880c;

    public a(int i, f fVar, int i2) {
        this.f878a = i;
        this.f879b = fVar;
        this.f880c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f878a);
        this.f879b.f891a.performAction(this.f880c, bundle);
    }
}
