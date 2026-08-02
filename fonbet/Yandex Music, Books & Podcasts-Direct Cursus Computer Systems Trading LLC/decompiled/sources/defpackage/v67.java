package defpackage;

import java.util.Collections;
import javax.jmdns.impl.a;

/* loaded from: classes5.dex */
public final class v67 extends w67 {
    public final byte[] m;

    public v67(String str, x67 x67Var, boolean z, int i, byte[] bArr) {
        super(str, y67.TYPE_TXT, x67Var, z, i);
        this.m = (bArr == null || bArr.length <= 0) ? w67.l : bArr;
    }

    @Override // defpackage.w67, defpackage.j67
    public final void o(StringBuilder sb) {
        super.o(sb);
        StringBuilder sb2 = new StringBuilder(" text: '");
        byte[] bArr = this.m;
        sb2.append(bArr.length > 20 ? new String(bArr, 0, 17).concat("...") : new String(bArr));
        sb2.append("'");
        sb.append(sb2.toString());
    }

    @Override // defpackage.w67
    public final dkp p(p2f p2fVar) {
        a q = q(false);
        q.q.a = p2fVar;
        return new dkp(p2fVar, q.i(), q.e(), q);
    }

    @Override // defpackage.w67
    public final a q(boolean z) {
        return new a(Collections.unmodifiableMap(this.g), 0, 0, 0, z, this.m);
    }

    @Override // defpackage.w67
    public final boolean r(p2f p2fVar) {
        return false;
    }

    @Override // defpackage.w67
    public final boolean s(p2f p2fVar) {
        return false;
    }

    @Override // defpackage.w67
    public final boolean t() {
        return true;
    }

    @Override // defpackage.w67
    public final boolean u(w67 w67Var) {
        if (!(w67Var instanceof v67)) {
            return false;
        }
        byte[] bArr = ((v67) w67Var).m;
        byte[] bArr2 = this.m;
        if ((bArr2 == null && bArr != null) || bArr.length != bArr2.length) {
            return false;
        }
        int length = bArr2.length;
        while (true) {
            int i = length - 1;
            if (length <= 0) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            length = i;
        }
    }

    @Override // defpackage.w67
    public final void v(n67 n67Var) {
        byte[] bArr = this.m;
        n67Var.b(bArr.length, bArr);
    }
}
