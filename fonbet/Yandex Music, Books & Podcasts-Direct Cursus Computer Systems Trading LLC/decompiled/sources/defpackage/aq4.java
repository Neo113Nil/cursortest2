package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;

/* loaded from: classes5.dex */
public final class aq4 extends mi6 {
    public int i;
    public String j;

    public aq4() {
        super(dsj.f, 0);
        this.j = "";
        e();
        this.i = 1000;
        e();
    }

    @Override // defpackage.mi6, defpackage.svc
    public final ByteBuffer a() {
        return this.i == 1005 ? ByteBuffer.allocate(0) : this.c;
    }

    @Override // defpackage.mi6
    public final void b() {
        super.b();
        if (this.i == 1007 && this.j.isEmpty()) {
            throw new uxe(1007, "Received text is no valid utf8 string!");
        }
        if (this.i == 1005 && this.j.length() > 0) {
            throw new uxe(1002, "A close frame must have a closecode if it has a reason");
        }
        int i = this.i;
        if (i > 1015 && i < 3000) {
            throw new uxe(1002, "Trying to send an illegal close code!");
        }
        if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
            throw new vxe("closecode must not be sent over the wire: " + this.i);
        }
    }

    @Override // defpackage.mi6
    public final void d(ByteBuffer byteBuffer) {
        this.i = 1005;
        this.j = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            this.i = 1000;
            return;
        }
        if (byteBuffer.remaining() == 1) {
            this.i = 1002;
            return;
        }
        if (byteBuffer.remaining() >= 2) {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            allocate.position(2);
            allocate.putShort(byteBuffer.getShort());
            allocate.position(0);
            this.i = allocate.getInt();
        }
        byteBuffer.reset();
        try {
            int position = byteBuffer.position();
            try {
                try {
                    byteBuffer.position(byteBuffer.position() + 2);
                    this.j = me4.b(byteBuffer);
                } catch (IllegalArgumentException unused) {
                    throw new uxe(1007);
                }
            } finally {
                byteBuffer.position(position);
            }
        } catch (uxe unused2) {
            this.i = 1007;
            this.j = null;
        }
    }

    public final void e() {
        String str = this.j;
        CodingErrorAction codingErrorAction = me4.a;
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.i);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(bytes.length + 2);
        allocate2.put(allocate);
        allocate2.put(bytes);
        allocate2.rewind();
        this.c = allocate2;
    }

    @Override // defpackage.mi6
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || aq4.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        aq4 aq4Var = (aq4) obj;
        if (this.i != aq4Var.i) {
            return false;
        }
        String str = this.j;
        String str2 = aq4Var.j;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // defpackage.mi6
    public final int hashCode() {
        int hashCode = ((super.hashCode() * 31) + this.i) * 31;
        String str = this.j;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // defpackage.mi6
    public final String toString() {
        return super.toString() + "code: " + this.i;
    }
}
