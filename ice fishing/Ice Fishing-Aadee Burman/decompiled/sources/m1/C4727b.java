package m1;

import B.i;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: m1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4727b {

    /* renamed from: e, reason: collision with root package name */
    public static final i f39274e = new i(3);

    /* renamed from: a, reason: collision with root package name */
    public int f39275a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f39276b;

    /* renamed from: c, reason: collision with root package name */
    public final int f39277c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f39278d;

    public C4727b(int i, ArrayList arrayList, int i6, InputStream inputStream) {
        this.f39275a = i;
        this.f39276b = arrayList;
        this.f39277c = i6;
        this.f39278d = inputStream;
    }

    public synchronized byte[] a(int i) {
        for (int i6 = 0; i6 < ((ArrayList) this.f39278d).size(); i6++) {
            byte[] bArr = (byte[]) ((ArrayList) this.f39278d).get(i6);
            if (bArr.length >= i) {
                this.f39275a -= bArr.length;
                ((ArrayList) this.f39278d).remove(i6);
                this.f39276b.remove(bArr);
                return bArr;
            }
        }
        return new byte[i];
    }

    public synchronized void b(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f39277c) {
                this.f39276b.add(bArr);
                int binarySearch = Collections.binarySearch((ArrayList) this.f39278d, bArr, f39274e);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                ((ArrayList) this.f39278d).add(binarySearch, bArr);
                this.f39275a += bArr.length;
                synchronized (this) {
                    while (this.f39275a > this.f39277c) {
                        byte[] bArr2 = (byte[]) this.f39276b.remove(0);
                        ((ArrayList) this.f39278d).remove(bArr2);
                        this.f39275a -= bArr2.length;
                    }
                }
            }
        }
    }

    public C4727b() {
        this.f39276b = new ArrayList();
        this.f39278d = new ArrayList(64);
        this.f39275a = 0;
        this.f39277c = 4096;
    }
}
