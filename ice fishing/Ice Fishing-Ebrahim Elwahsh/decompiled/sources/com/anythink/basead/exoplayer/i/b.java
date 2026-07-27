package com.anythink.basead.exoplayer.i;

import android.os.SystemClock;
import com.anythink.basead.exoplayer.h.ae;
import com.anythink.basead.exoplayer.k.C0544a;
import com.anythink.basead.exoplayer.m;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final m[] f8061a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f8062b;

    /* renamed from: c, reason: collision with root package name */
    private int f8063c;

    /* renamed from: g, reason: collision with root package name */
    protected final ae f8064g;

    /* renamed from: h, reason: collision with root package name */
    protected final int f8065h;
    protected final int[] i;

    public static final class a implements Comparator<m> {
        private a() {
        }

        private static int a(m mVar, m mVar2) {
            return mVar2.f8818d - mVar.f8818d;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(m mVar, m mVar2) {
            return mVar2.f8818d - mVar.f8818d;
        }

        public /* synthetic */ a(byte b9) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(ae aeVar, int... iArr) {
        int i = 0;
        Object[] objArr = 0;
        C0544a.b(iArr.length > 0);
        this.f8064g = (ae) C0544a.a(aeVar);
        int length = iArr.length;
        this.f8065h = length;
        this.f8061a = new m[length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.f8061a[i4] = aeVar.a(iArr[i4]);
        }
        Arrays.sort(this.f8061a, new a(objArr == true ? 1 : 0));
        this.i = new int[this.f8065h];
        while (true) {
            int i9 = this.f8065h;
            if (i >= i9) {
                this.f8062b = new long[i9];
                return;
            } else {
                this.i[i] = aeVar.a(this.f8061a[i]);
                i++;
            }
        }
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public void a() {
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int b(int i) {
        return this.i[i];
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int c(int i) {
        for (int i4 = 0; i4 < this.f8065h; i4++) {
            if (this.i[i4] == i) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final void e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f8064g == bVar.f8064g && Arrays.equals(this.i, bVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final ae f() {
        return this.f8064g;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int g() {
        return this.i.length;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final m h() {
        return this.f8061a[b()];
    }

    public int hashCode() {
        if (this.f8063c == 0) {
            this.f8063c = Arrays.hashCode(this.i) + (System.identityHashCode(this.f8064g) * 31);
        }
        return this.f8063c;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int i() {
        return this.i[b()];
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public void a(float f6) {
    }

    public final boolean b(int i, long j9) {
        return this.f8062b[i] > j9;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final m a(int i) {
        return this.f8061a[i];
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int a(m mVar) {
        for (int i = 0; i < this.f8065h; i++) {
            if (this.f8061a[i] == mVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public int a(long j9, List<? extends com.anythink.basead.exoplayer.h.b.i> list) {
        return list.size();
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final boolean a(int i, long j9) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b9 = b(i, elapsedRealtime);
        int i4 = 0;
        while (i4 < this.f8065h && !b9) {
            b9 = (i4 == i || b(i4, elapsedRealtime)) ? false : true;
            i4++;
        }
        if (!b9) {
            return false;
        }
        long[] jArr = this.f8062b;
        jArr[i] = Math.max(jArr[i], elapsedRealtime + j9);
        return true;
    }
}
