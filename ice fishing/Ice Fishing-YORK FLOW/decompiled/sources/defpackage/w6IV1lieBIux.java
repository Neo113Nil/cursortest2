package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class w6IV1lieBIux extends android.text.style.ClickableSpan {
    public final int QiMR8OkAhezm;
    public final int WDYagTQQm9ns;
    public final defpackage.I5Vdbaz9SDkL oh71FJcDz6S2;

    public w6IV1lieBIux(int i, defpackage.I5Vdbaz9SDkL i5Vdbaz9SDkL, int i2) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = i5Vdbaz9SDkL;
        this.QiMR8OkAhezm = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(android.view.View view) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.WDYagTQQm9ns);
        this.oh71FJcDz6S2.ZpBGe2uQfcn8.performAction(this.QiMR8OkAhezm, bundle);
    }
}
