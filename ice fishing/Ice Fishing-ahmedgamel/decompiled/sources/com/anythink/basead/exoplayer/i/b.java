package com.anythink.basead.exoplayer.i;

import android.os.SystemClock;
import com.anythink.basead.exoplayer.h.ae;
import com.anythink.basead.exoplayer.m;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b implements f {

    /* renamed from: a, reason: collision with root package name */
    private final m[] f7904a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f7905b;

    /* renamed from: c, reason: collision with root package name */
    private int f7906c;

    /* renamed from: g, reason: collision with root package name */
    protected final ae f7907g;

    /* renamed from: h, reason: collision with root package name */
    protected final int f7908h;
    protected final int[] i;

    public static final class a implements Comparator<m> {
        private a() {
        }

        private static int a(m mVar, m mVar2) {
            return mVar2.f8661d - mVar.f8661d;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(m mVar, m mVar2) {
            return mVar2.f8661d - mVar.f8661d;
        }

        public /* synthetic */ a(byte b9) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(ae aeVar, int... iArr) {
        int i = 0;
        Object[] objArr = 0;
        com.anythink.basead.exoplayer.k.a.b(iArr.length > 0);
        this.f7907g = (ae) com.anythink.basead.exoplayer.k.a.a(aeVar);
        int length = iArr.length;
        this.f7908h = length;
        this.f7904a = new m[length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            this.f7904a[i6] = aeVar.a(iArr[i6]);
        }
        Arrays.sort(this.f7904a, new a(objArr == true ? 1 : 0));
        this.i = new int[this.f7908h];
        while (true) {
            int i9 = this.f7908h;
            if (i >= i9) {
                this.f7905b = new long[i9];
                return;
            } else {
                this.i[i] = aeVar.a(this.f7904a[i]);
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
        for (int i6 = 0; i6 < this.f7908h; i6++) {
            if (this.i[i6] == i) {
                return i6;
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
            if (this.f7907g == bVar.f7907g && Arrays.equals(this.i, bVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final ae f() {
        return this.f7907g;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int g() {
        return this.i.length;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final m h() {
        return this.f7904a[b()];
    }

    public int hashCode() {
        if (this.f7906c == 0) {
            this.f7906c = Arrays.hashCode(this.i) + (System.identityHashCode(this.f7907g) * 31);
        }
        return this.f7906c;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int i() {
        return this.i[b()];
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public void a(float f3) {
    }

    public final boolean b(int i, long j6) {
        return this.f7905b[i] > j6;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final m a(int i) {
        return this.f7904a[i];
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int a(m mVar) {
        for (int i = 0; i < this.f7908h; i++) {
            if (this.f7904a[i] == mVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public int a(long j6, List<? extends com.anythink.basead.exoplayer.h.b.i> list) {
        return list.size();
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final boolean a(int i, long j6) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean b9 = b(i, elapsedRealtime);
        int i6 = 0;
        while (i6 < this.f7908h && !b9) {
            b9 = (i6 == i || b(i6, elapsedRealtime)) ? false : true;
            i6++;
        }
        if (!b9) {
            return false;
        }
        long[] jArr = this.f7905b;
        jArr[i] = Math.max(jArr[i], elapsedRealtime + j6);
        return true;
    }
}
