package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class h60 extends b60 {
    public final /* synthetic */ AtomicReferenceArray b2ZJblxo;

    public h60(long j, h60 h60Var, int i) {
        super(j, h60Var, i);
        this.b2ZJblxo = new AtomicReferenceArray(g60.P7K7Inc8);
    }

    @Override // defpackage.b60
    public final int P7K7Inc8() {
        return g60.P7K7Inc8;
    }

    @Override // defpackage.b60
    public final void b2ZJblxo(int i, l9 l9Var) {
        this.b2ZJblxo.set(i, g60.VgvYg0wo);
        Qr9iLBAD();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.wxUZMvaN + ", hashCode=" + hashCode() + ']';
    }
}
