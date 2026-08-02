package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public abstract class mi6 implements svc {
    public final dsj b;
    public final /* synthetic */ int h;
    public ByteBuffer c = ByteBuffer.allocate(0);
    public boolean a = true;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;

    public mi6(dsj dsjVar, int i) {
        this.h = i;
        this.b = dsjVar;
    }

    @Override // defpackage.svc
    public ByteBuffer a() {
        return this.c;
    }

    public void b() {
        switch (this.h) {
            case 0:
                if (!this.a) {
                    throw new vxe("Control frame can't have fin==false set");
                }
                if (this.e) {
                    throw new vxe("Control frame can't have rsv1==true set");
                }
                if (this.f) {
                    throw new vxe("Control frame can't have rsv2==true set");
                }
                if (this.g) {
                    throw new vxe("Control frame can't have rsv3==true set");
                }
                return;
            default:
                return;
        }
    }

    public void d(ByteBuffer byteBuffer) {
        this.c = byteBuffer;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        mi6 mi6Var = (mi6) obj;
        if (this.a != mi6Var.a || this.d != mi6Var.d || this.e != mi6Var.e || this.f != mi6Var.f || this.g != mi6Var.g || this.b != mi6Var.b) {
            return false;
        }
        ByteBuffer byteBuffer = this.c;
        ByteBuffer byteBuffer2 = mi6Var.c;
        return byteBuffer != null ? byteBuffer.equals(byteBuffer2) : byteBuffer2 == null;
    }

    public int hashCode() {
        int hashCode = (this.b.hashCode() + ((this.a ? 1 : 0) * 31)) * 31;
        ByteBuffer byteBuffer = this.c;
        return ((((((((hashCode + (byteBuffer != null ? byteBuffer.hashCode() : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Framedata{ opcode:");
        sb.append(this.b);
        sb.append(", fin:");
        sb.append(this.a);
        sb.append(", rsv1:");
        sb.append(this.e);
        sb.append(", rsv2:");
        sb.append(this.f);
        sb.append(", rsv3:");
        sb.append(this.g);
        sb.append(", payload length:[pos:");
        sb.append(this.c.position());
        sb.append(", len:");
        sb.append(this.c.remaining());
        sb.append("], payload:");
        return dfi.i(sb, this.c.remaining() > 1000 ? "(too big to display)" : new String(this.c.array()), '}');
    }

    private void c() {
    }
}
