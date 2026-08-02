package defpackage;

import java.util.AbstractQueue;

/* loaded from: classes3.dex */
public final class uhg extends xkt {
    public Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ AbstractQueue d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uhg(AbstractQueue abstractQueue, crn crnVar, int i) {
        super(0);
        this.c = i;
        this.d = abstractQueue;
        this.b = crnVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r1 == ((defpackage.thg) ((defpackage.vhg) r3.d).b)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1 == ((defpackage.thg) ((defpackage.vhg) r3.d).b)) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001a, code lost:
    
        r1 = null;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object next() {
        crn h;
        Object obj = this.b;
        if (obj == null) {
            wvs.n();
            return null;
        }
        switch (this.c) {
            case 0:
                h = ((crn) obj).h();
                break;
            default:
                h = ((crn) obj).f();
                break;
        }
        this.b = h;
        return obj;
    }
}
