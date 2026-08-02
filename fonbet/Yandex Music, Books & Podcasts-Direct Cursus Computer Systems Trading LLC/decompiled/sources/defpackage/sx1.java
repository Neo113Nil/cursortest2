package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class sx1 {
    public final yde a;
    public final ArrayList b = new ArrayList();
    public ByteBuffer[] c = new ByteBuffer[0];
    public boolean d;

    public sx1(yde ydeVar) {
        this.a = ydeVar;
        tx1 tx1Var = tx1.e;
        this.d = false;
    }

    public final void a() {
        ArrayList arrayList = this.b;
        arrayList.clear();
        this.d = false;
        int i = 0;
        while (true) {
            yde ydeVar = this.a;
            if (i >= ydeVar.size()) {
                break;
            }
            vx1 vx1Var = (vx1) ydeVar.get(i);
            vx1Var.flush();
            if (vx1Var.b()) {
                arrayList.add(vx1Var);
            }
            i++;
        }
        this.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= b(); i2++) {
            this.c[i2] = ((vx1) arrayList.get(i2)).c();
        }
    }

    public final int b() {
        return this.c.length - 1;
    }

    public final boolean c() {
        return this.d && ((vx1) this.b.get(b())).g() && !this.c[b()].hasRemaining();
    }

    public final boolean d() {
        return !this.b.isEmpty();
    }

    public final void e(ByteBuffer byteBuffer) {
        boolean z;
        for (boolean z2 = true; z2; z2 = z) {
            z = false;
            int i = 0;
            while (i <= b()) {
                if (!this.c[i].hasRemaining()) {
                    ArrayList arrayList = this.b;
                    vx1 vx1Var = (vx1) arrayList.get(i);
                    if (!vx1Var.g()) {
                        ByteBuffer byteBuffer2 = i > 0 ? this.c[i - 1] : byteBuffer.hasRemaining() ? byteBuffer : vx1.a;
                        long remaining = byteBuffer2.remaining();
                        vx1Var.d(byteBuffer2);
                        this.c[i] = vx1Var.c();
                        z |= remaining - ((long) byteBuffer2.remaining()) > 0 || this.c[i].hasRemaining();
                    } else if (!this.c[i].hasRemaining() && i < b()) {
                        ((vx1) arrayList.get(i + 1)).f();
                    }
                }
                i++;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx1)) {
            return false;
        }
        yde ydeVar = ((sx1) obj).a;
        yde ydeVar2 = this.a;
        if (ydeVar2.size() != ydeVar.size()) {
            return false;
        }
        for (int i = 0; i < ydeVar2.size(); i++) {
            if (ydeVar2.get(i) != ydeVar.get(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
