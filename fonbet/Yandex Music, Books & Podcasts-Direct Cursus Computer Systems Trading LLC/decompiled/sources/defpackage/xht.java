package defpackage;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class xht implements rld {
    public final jyr a = l18.b.b(hag.I(frt.class), true);
    public final String b = "UidKeyProvider";

    @Override // defpackage.rld
    @NotNull
    public String getId() {
        return this.b;
    }

    @Override // defpackage.rld
    public Object key() {
        return ((frt) this.a.getValue()).c().a;
    }
}
