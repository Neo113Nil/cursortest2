package defpackage;

import com.yandex.pulse.metrics.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes5.dex */
public final class olk extends ixf {
    public final nlk d;
    public final int e;
    public final int f;
    public final ArrayList g;
    public int h;

    public olk(nlk nlkVar, int i, int i2) {
        this.d = nlkVar;
        this.e = i;
        this.f = i2 == 0 ? Integer.MAX_VALUE : i2;
        this.g = new ArrayList();
        this.h = -1;
    }

    public final boolean O() {
        return this.h != -1;
    }

    public final void P() {
        k[] e = this.d.e();
        if (e == null) {
            plk.a.b(1);
            return;
        }
        ArrayList arrayList = this.g;
        arrayList.isEmpty();
        Collections.addAll(arrayList, Arrays.copyOf(e, e.length));
        plk.a.b(0);
    }

    public final void Q() {
        int i;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.g;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f;
            if (size <= 0) {
                break;
            }
            int size2 = ((k) arrayList2.get(size - 1)).getCompressedLogData().size();
            if (i2 >= 300000 && i3 >= this.e) {
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
            int size4 = ((k) arrayList2.get(size)).getCompressedLogData().size();
            if (size4 > i) {
                plk.c.b(size4);
                i4++;
            } else {
                arrayList.add(arrayList2.get(size));
            }
            size++;
        }
        if (i4 > 0) {
            plk.d.b(i4);
        }
        boolean isEmpty = arrayList.isEmpty();
        nlk nlkVar = this.d;
        if (isEmpty) {
            nlkVar.a(null);
            return;
        }
        Object[] array = arrayList.toArray(new k[0]);
        if (array != null) {
            nlkVar.a((k[]) array);
        } else {
            jj4.j("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }

    public final void R(byte[] bArr) {
        GZIPOutputStream gZIPOutputStream;
        z4i newBuilder = k.newBuilder();
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
                kn3 kn3Var = nn3.b;
                kn3 n = nn3.n(bArr2, 0, bArr2.length);
                newBuilder.d();
                ((k) newBuilder.b).setCompressedLogData(n);
                byte[] digest = MessageDigest.getInstance("SHA-1").digest(bArr);
                kn3 n2 = nn3.n(digest, 0, digest.length);
                newBuilder.d();
                ((k) newBuilder.b).setHash(n2);
                long currentTimeMillis = System.currentTimeMillis() / 1000;
                newBuilder.d();
                ((k) newBuilder.b).setTimestamp(currentTimeMillis);
                k kVar = (k) newBuilder.b();
                this.g.add(kVar);
                lyd lydVar = plk.a;
                plk.b.b((kVar.getCompressedLogData().size() * 100) / bArr.length);
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
        kn3 kn3Var2 = nn3.b;
        kn3 n3 = nn3.n(bArr2, 0, bArr2.length);
        newBuilder.d();
        ((k) newBuilder.b).setCompressedLogData(n3);
        try {
            byte[] digest2 = MessageDigest.getInstance("SHA-1").digest(bArr);
            kn3 n22 = nn3.n(digest2, 0, digest2.length);
            newBuilder.d();
            ((k) newBuilder.b).setHash(n22);
            long currentTimeMillis2 = System.currentTimeMillis() / 1000;
            newBuilder.d();
            ((k) newBuilder.b).setTimestamp(currentTimeMillis2);
            k kVar2 = (k) newBuilder.b();
            this.g.add(kVar2);
            lyd lydVar2 = plk.a;
            plk.b.b((kVar2.getCompressedLogData().size() * 100) / bArr.length);
        } catch (NoSuchAlgorithmException e) {
            wvs.m(e);
        }
    }
}
