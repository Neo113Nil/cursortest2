package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class au0 extends wyf {
    public final /* synthetic */ int a;

    public /* synthetic */ au0(int i) {
        this.a = i;
    }

    public static tib g0(d7k d7kVar) {
        String q = d7kVar.q();
        q.getClass();
        String q2 = d7kVar.q();
        q2.getClass();
        return new tib(q, q2, d7kVar.p(), d7kVar.p(), Arrays.copyOfRange(d7kVar.a, d7kVar.b, d7kVar.c));
    }

    @Override // defpackage.wyf
    public final u2i B(y2i y2iVar, ByteBuffer byteBuffer) {
        switch (this.a) {
            case 0:
                if (byteBuffer.get() != 116) {
                    return null;
                }
                v94 v94Var = new v94(byteBuffer.array(), byteBuffer.limit());
                int i = 12;
                v94Var.t(12);
                int f = (v94Var.f() + v94Var.i(12)) - 4;
                v94Var.t(44);
                v94Var.u(v94Var.i(12));
                v94Var.t(16);
                ArrayList arrayList = new ArrayList();
                while (v94Var.f() < f) {
                    v94Var.t(48);
                    int i2 = v94Var.i(8);
                    v94Var.t(4);
                    int f2 = v94Var.f() + v94Var.i(i);
                    String str = null;
                    String str2 = null;
                    while (v94Var.f() < f2) {
                        int i3 = v94Var.i(8);
                        int i4 = v94Var.i(8);
                        int f3 = v94Var.f() + i4;
                        if (i3 == 2) {
                            int i5 = v94Var.i(16);
                            v94Var.t(8);
                            if (i5 == 3) {
                                while (v94Var.f() < f3) {
                                    int i6 = v94Var.i(8);
                                    Charset charset = StandardCharsets.US_ASCII;
                                    byte[] bArr = new byte[i6];
                                    v94Var.l(i6, bArr);
                                    String str3 = new String(bArr, charset);
                                    int i7 = v94Var.i(8);
                                    for (int i8 = 0; i8 < i7; i8++) {
                                        v94Var.u(v94Var.i(8));
                                    }
                                    str = str3;
                                }
                            }
                        } else if (i3 == 21) {
                            Charset charset2 = StandardCharsets.US_ASCII;
                            byte[] bArr2 = new byte[i4];
                            v94Var.l(i4, bArr2);
                            str2 = new String(bArr2, charset2);
                        }
                        v94Var.q(f3 * 8);
                    }
                    v94Var.q(f2 * 8);
                    if (str != null && str2 != null) {
                        arrayList.add(new zt0(i2, str.concat(str2)));
                    }
                    i = 12;
                }
                if (arrayList.isEmpty()) {
                    return null;
                }
                return new u2i(arrayList);
            default:
                return new u2i(g0(new d7k(byteBuffer.array(), byteBuffer.limit())));
        }
    }
}
