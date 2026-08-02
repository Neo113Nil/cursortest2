package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class uys implements ehr0 {
    public final zls a;

    public uys(zls zlsVar) {
        this.a = zlsVar;
    }

    @Override // defpackage.ehr0
    public final ix80 a(long j, LayoutDirection layoutDirection, fwi fwiVar) {
        jb2 a = nb2.a();
        this.a.invoke(a, new cjs0(j), layoutDirection);
        a.g();
        return new fx80(a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        uys uysVar = obj instanceof uys ? (uys) obj : null;
        return (uysVar != null ? uysVar.a : null) == this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
