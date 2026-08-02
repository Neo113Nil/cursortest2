package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scrollable_items.ScrollableItemBadgeModel$Anchor;

/* loaded from: classes5.dex */
public final class yjp0 {
    public final CharSequence a;
    public final ldc b;
    public final ScrollableItemBadgeModel$Anchor c;

    public yjp0(CharSequence charSequence, ldc ldcVar, ScrollableItemBadgeModel$Anchor scrollableItemBadgeModel$Anchor) {
        this.a = charSequence;
        this.b = ldcVar;
        this.c = scrollableItemBadgeModel$Anchor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjp0)) {
            return false;
        }
        yjp0 yjp0Var = (yjp0) obj;
        return jl40.l(this.a, yjp0Var.a) && jl40.l(this.b, yjp0Var.b) && this.c == yjp0Var.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        return this.c.hashCode() + ((hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31);
    }

    public final String toString() {
        return "ScrollableItemBadgeModel(text=" + ((Object) this.a) + ", backgroundColor=" + this.b + ", anchor=" + this.c + Extension.C_BRAKE;
    }
}
