package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes11.dex */
public final class s79 implements ve1 {
    public final /* synthetic */ int a;
    public final s1w b;

    public s79(byte[] bArr, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new s1w(bArr, 1);
                break;
            default:
                this.b = new s1w(bArr, 0);
                break;
        }
    }

    @Override // defpackage.ve1
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int i = this.a;
        s1w s1wVar = this.b;
        switch (i) {
            case 0:
                ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] a = i6i0.a(12);
                allocate.put(a);
                s1wVar.b(allocate, a, bArr, bArr2);
                return allocate.array();
            default:
                ByteBuffer allocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] a2 = i6i0.a(24);
                allocate2.put(a2);
                s1wVar.b(allocate2, a2, bArr, bArr2);
                return allocate2.array();
        }
    }

    @Override // defpackage.ve1
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        int i = this.a;
        s1w s1wVar = this.b;
        switch (i) {
            case 0:
                if (bArr.length < 28) {
                    kbs.v("ciphertext too short");
                    break;
                } else {
                    break;
                }
            default:
                if (bArr.length < 40) {
                    kbs.v("ciphertext too short");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }
}
