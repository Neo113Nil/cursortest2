package o1;

import A3.o;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4798b {

    /* renamed from: e, reason: collision with root package name */
    public static final o f39717e = new o(4);

    /* renamed from: a, reason: collision with root package name */
    public int f39718a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39719b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39720c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f39721d;

    public C4798b(int i, ArrayList arrayList, int i4, InputStream inputStream) {
        this.f39718a = i;
        this.f39719b = arrayList;
        this.f39720c = i4;
        this.f39721d = inputStream;
    }

    public synchronized byte[] a(int i) {
        for (int i4 = 0; i4 < ((ArrayList) this.f39721d).size(); i4++) {
            byte[] bArr = (byte[]) ((ArrayList) this.f39721d).get(i4);
            if (bArr.length >= i) {
                this.f39718a -= bArr.length;
                ((ArrayList) this.f39721d).remove(i4);
                this.f39719b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f39720c) {
                this.f39719b.add(bArr);
                int binarySearch = Collections.binarySearch((ArrayList) this.f39721d, bArr, f39717e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                ((ArrayList) this.f39721d).add(binarySearch, bArr);
                this.f39718a += bArr.length;
                synchronized (this) {
                    while (this.f39718a > this.f39720c) {
                        byte[] bArr2 = (byte[]) this.f39719b.remove(0);
                        ((ArrayList) this.f39721d).remove(bArr2);
                        this.f39718a -= bArr2.length;
                    }
                }
            }
        }
    }

    public C4798b() {
        this.f39719b = new ArrayList();
        this.f39721d = new ArrayList(64);
        this.f39718a = 0;
        this.f39720c = 4096;
    }
}
