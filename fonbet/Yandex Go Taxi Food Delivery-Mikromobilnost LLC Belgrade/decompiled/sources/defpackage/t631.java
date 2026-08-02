package defpackage;

import androidx.compose.ui.input.pointer.util.a;

/* loaded from: classes10.dex */
public final class t631 {
    public final a a = new a();

    public final long a(long j) {
        a aVar = this.a;
        aVar.getClass();
        if (k631.c(j) <= 0.0f || k631.d(j) <= 0.0f) {
            ixv.b("maximumVelocity should be a positive value. You specified=" + ((Object) k631.h(j)));
        }
        return ma91.a(aVar.a.b(k631.c(j)), aVar.b.b(k631.d(j)));
    }
}
