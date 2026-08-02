package defpackage;

import kotlin.text.StringsKt;

/* loaded from: classes6.dex */
public final class gkt extends ou2 {
    public final euo g = euo.E0;
    public final jyr h = btf.b(new wfs(11, this));

    @Override // defpackage.ypt
    public final cqt T() {
        return (aqt) this.h.getValue();
    }

    public final tjt b() {
        String a;
        String a2;
        String a3 = a(1);
        ujt ujtVar = (a3 != null && a3.hashCode() == 3552213 && a3.equals("tag/")) ? ujt.b : ujt.a;
        int ordinal = ujtVar.ordinal();
        if (ordinal == 0) {
            a = a(1);
        } else {
            if (ordinal != 1) {
                b6e.s();
                return null;
            }
            a = a(2);
        }
        String obj = a != null ? StringsKt.t0(a).toString() : null;
        int ordinal2 = ujtVar.ordinal();
        if (ordinal2 == 0) {
            a2 = a(2);
        } else {
            if (ordinal2 != 1) {
                b6e.s();
                return null;
            }
            a2 = a(3);
        }
        String obj2 = a2 != null ? StringsKt.t0(a2).toString() : null;
        if (obj == null || obj2 == null) {
            return null;
        }
        return new tjt(obj, obj2, ujtVar);
    }

    @Override // defpackage.ypt
    public final euo getType() {
        return this.g;
    }
}
