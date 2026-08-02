package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h9v {
    public final aqi a;
    public final aqi b;
    public final d9v c;
    public final t9v d;
    public g9v e;

    public h9v(aqi aqiVar, aqi aqiVar2, d9v d9vVar, t9v t9vVar) {
        aqiVar.getClass();
        aqiVar2.getClass();
        d9vVar.getClass();
        t9vVar.getClass();
        this.a = aqiVar;
        this.b = aqiVar2;
        this.c = d9vVar;
        this.d = t9vVar;
    }

    public final void a(boolean z) {
        g9v g9vVar = this.e;
        g9v g9vVar2 = g9v.c;
        if (g9vVar == g9vVar2) {
            return;
        }
        this.e = g9vVar2;
        Continuation continuation = null;
        ssg.a(3, "WaveWordsAnimations", "switch to sleep mode", null);
        this.a.setValue(null);
        this.b.setValue(Boolean.FALSE);
        this.c.b();
        t9v t9vVar = this.d;
        float f = 0.0f;
        if (z) {
            t9vVar.a(0.0f);
        } else {
            t9vVar.c.setValue(t9vVar, t9v.d[0], x97.y(t9vVar.a, null, null, new s9v(t9vVar, f, continuation, 0), 3));
        }
    }

    public final void b(m6v m6vVar, boolean z) {
        g9v g9vVar = this.e;
        g9v g9vVar2 = g9v.b;
        d9v d9vVar = this.c;
        if (g9vVar == g9vVar2) {
            d9vVar.a(m6vVar, z);
            return;
        }
        this.e = g9vVar2;
        ssg.a(3, "WaveWordsAnimations", "switch to content mode", null);
        this.a.setValue(null);
        this.b.setValue(Boolean.TRUE);
        t9v t9vVar = this.d;
        t9vVar.c.setValue(t9vVar, t9v.d[0], x97.y(t9vVar.a, null, null, new s9v(t9vVar, 1.0f, null, 0), 3));
        d9vVar.a(m6vVar, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9v)) {
            return false;
        }
        h9v h9vVar = (h9v) obj;
        return Intrinsics.d(this.a, h9vVar.a) && Intrinsics.d(this.b, h9vVar.b) && Intrinsics.d(this.c, h9vVar.c) && Intrinsics.d(this.d, h9vVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "WaveWordsWidgetContainerAnimationHelper(loadingAnimationState=" + this.a + ", wordsState=" + this.b + ", aiLabelHelper=" + this.c + ", sleepHelper=" + this.d + ")";
    }
}
