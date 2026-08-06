package o0;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import n0.InterfaceC0989c;
import p0.C1006c;
import p0.C1009f;
import p0.C1010g;
import p0.C1011h;
import p0.C1027x;

/* loaded from: classes.dex */
public final class r implements D0.a {

    /* renamed from: a, reason: collision with root package name */
    public final c f8298a;

    /* renamed from: b, reason: collision with root package name */
    public final int f8299b;

    /* renamed from: c, reason: collision with root package name */
    public final C0997a f8300c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8301d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8302e;

    public r(c cVar, int i2, C0997a c0997a, long j2, long j3) {
        this.f8298a = cVar;
        this.f8299b = i2;
        this.f8300c = c0997a;
        this.f8301d = j2;
        this.f8302e = j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1006c a(l lVar, com.google.android.gms.common.internal.a aVar, int i2) {
        C1027x c1027x = aVar.f2704u;
        C1006c c1006c = c1027x == null ? null : c1027x.f8420d;
        if (c1006c != null && c1006c.f8344b) {
            int[] iArr = c1006c.f8346d;
            int i3 = 0;
            if (iArr == null) {
                int[] iArr2 = c1006c.f8348f;
                if (iArr2 != null) {
                    while (i3 < iArr2.length) {
                        if (iArr2[i3] != i2) {
                            i3++;
                        }
                    }
                }
                if (lVar.f8285l >= c1006c.f8347e) {
                    return c1006c;
                }
                return null;
            }
            while (i3 < iArr.length) {
                if (iArr[i3] != i2) {
                    i3++;
                } else if (lVar.f8285l >= c1006c.f8347e) {
                }
            }
        }
        return null;
    }

    @Override // D0.a
    public final void onComplete(Task task) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        long j2;
        int i8;
        if (this.f8298a.a()) {
            C1011h c1011h = (C1011h) C1010g.b().f8376a;
            if (c1011h == null || c1011h.f8378b) {
                l lVar = (l) this.f8298a.f8266j.get(this.f8300c);
                if (lVar != null) {
                    InterfaceC0989c interfaceC0989c = lVar.f8275b;
                    if (interfaceC0989c instanceof com.google.android.gms.common.internal.a) {
                        com.google.android.gms.common.internal.a aVar = (com.google.android.gms.common.internal.a) interfaceC0989c;
                        long j3 = 0;
                        boolean z2 = this.f8301d > 0;
                        int i9 = aVar.f2700p;
                        if (c1011h != null) {
                            z2 &= c1011h.f8379c;
                            int i10 = c1011h.f8380d;
                            int i11 = c1011h.f8381e;
                            i2 = c1011h.f8377a;
                            if (aVar.f2704u != null && !aVar.b()) {
                                C1006c a2 = a(lVar, aVar, this.f8299b);
                                if (a2 == null) {
                                    return;
                                }
                                boolean z3 = a2.f8345c && this.f8301d > 0;
                                i11 = a2.f8347e;
                                z2 = z3;
                            }
                            i4 = i10;
                            i3 = i11;
                        } else {
                            i2 = 0;
                            i3 = 100;
                            i4 = 5000;
                        }
                        c cVar = this.f8298a;
                        if (task.d()) {
                            i6 = 0;
                            i7 = 0;
                        } else {
                            if (((D0.m) task).f232d) {
                                i6 = 100;
                            } else {
                                Exception b2 = task.b();
                                if (b2 instanceof n0.d) {
                                    Status status = ((n0.d) b2).f8199a;
                                    i5 = status.f2680a;
                                    m0.b bVar = status.f2683d;
                                    if (bVar != null) {
                                        i7 = bVar.f8163b;
                                        i6 = i5;
                                    }
                                } else {
                                    i5 = 101;
                                }
                                i6 = i5;
                            }
                            i7 = -1;
                        }
                        if (z2) {
                            long j4 = this.f8301d;
                            long j5 = this.f8302e;
                            long currentTimeMillis = System.currentTimeMillis();
                            i8 = (int) (SystemClock.elapsedRealtime() - j5);
                            j2 = j4;
                            j3 = currentTimeMillis;
                        } else {
                            j2 = 0;
                            i8 = -1;
                        }
                        cVar.getClass();
                        s sVar = new s(new C1009f(this.f8299b, i6, i7, j2, j3, null, null, i9, i8), i2, i4, i3);
                        A0.a aVar2 = cVar.f8269m;
                        aVar2.sendMessage(aVar2.obtainMessage(18, sVar));
                    }
                }
            }
        }
    }
}
