package defpackage;

import com.google.protobuf.ByteString;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes8.dex */
public final class y0b0 extends ufz {
    public final x0b0 a;
    public final int b;
    public final int c = 300000;
    public final int d;
    public final ArrayList e;
    public int f;

    public y0b0(x0b0 x0b0Var, int i, int i2) {
        this.a = x0b0Var;
        this.b = i;
        this.d = i2 == 0 ? Integer.MAX_VALUE : i2;
        this.e = new ArrayList();
        this.f = -1;
    }

    public final boolean a() {
        return this.f != -1;
    }

    public final void b() {
        od20[] s = this.a.s();
        if (s == null) {
            z0b0.a.b(1);
            return;
        }
        ArrayList arrayList = this.e;
        arrayList.isEmpty();
        Collections.addAll(arrayList, Arrays.copyOf(s, s.length));
        z0b0.a.b(0);
    }

    public final void c() {
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.d;
            if (size <= 0) {
                break;
            }
            int size2 = ((od20) arrayList2.get(size - 1)).getCompressedLogData().size();
            if (i2 >= this.c && i3 >= this.b) {
                break;
            }
            if (size2 <= i) {
                i2 += size2;
                i3++;
            }
            size--;
        }
        int size3 = arrayList2.size();
        int i4 = size;
        while (size < size3) {
            int size4 = ((od20) arrayList2.get(size)).getCompressedLogData().size();
            if (size4 > i) {
                z0b0.c.b(size4);
                i4++;
            } else {
                arrayList.add(arrayList2.get(size));
            }
            size++;
        }
        if (i4 > 0) {
            z0b0.d.b(i4);
        }
        boolean isEmpty = arrayList.isEmpty();
        x0b0 x0b0Var = this.a;
        if (isEmpty) {
            x0b0Var.l(null);
            return;
        }
        Object[] array = arrayList.toArray(new od20[0]);
        if (array != null) {
            x0b0Var.l((od20[]) array);
        } else {
            ny61.t("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    public final void d(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        nd20 newBuilder = od20.newBuilder();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream2 = null;
        r2 = null;
        r2 = null;
        byte[] bArr2 = null;
        try {
            gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(bArr);
                try {
                    gZIPOutputStream.close();
                } catch (IOException unused) {
                }
                bArr2 = byteArrayOutputStream.toByteArray();
            } catch (IOException unused2) {
                if (gZIPOutputStream != null) {
                    try {
                        gZIPOutputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                ByteString byteString = ByteString.a;
                newBuilder.c(ByteString.f(0, bArr2.length, bArr2));
                byte[] digest = MessageDigest.getInstance("SHA-1").digest(bArr);
                newBuilder.d(ByteString.f(0, digest.length, digest));
                newBuilder.e(System.currentTimeMillis() / 1000);
                od20 od20Var = (od20) newBuilder.build();
                this.e.add(od20Var);
                vku vkuVar = z0b0.a;
                z0b0.b.b((od20Var.getCompressedLogData().size() * 100) / bArr.length);
            } catch (Throwable th) {
                th = th;
                gZIPOutputStream2 = gZIPOutputStream;
                if (gZIPOutputStream2 != null) {
                    try {
                        gZIPOutputStream2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (IOException unused5) {
            gZIPOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        ByteString byteString2 = ByteString.a;
        newBuilder.c(ByteString.f(0, bArr2.length, bArr2));
        try {
            byte[] digest2 = MessageDigest.getInstance("SHA-1").digest(bArr);
            newBuilder.d(ByteString.f(0, digest2.length, digest2));
            newBuilder.e(System.currentTimeMillis() / 1000);
            od20 od20Var2 = (od20) newBuilder.build();
            this.e.add(od20Var2);
            vku vkuVar2 = z0b0.a;
            z0b0.b.b((od20Var2.getCompressedLogData().size() * 100) / bArr.length);
        } catch (NoSuchAlgorithmException e) {
            ny61.o(e);
        }
    }
}
