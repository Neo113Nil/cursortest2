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
    private final m[] f8690a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f8691b;

    /* renamed from: c, reason: collision with root package name */
    private int f8692c;

    /* renamed from: g, reason: collision with root package name */
    protected final ae f8693g;

    /* renamed from: h, reason: collision with root package name */
    protected final int f8694h;
    protected final int[] i;

    public static final class a implements Comparator<m> {
        private a() {
        }

        private static int a(m mVar, m mVar2) {
            return mVar2.f9447d - mVar.f9447d;
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(m mVar, m mVar2) {
            return mVar2.f9447d - mVar.f9447d;
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
        this.f8693g = (ae) com.anythink.basead.exoplayer.k.a.a(aeVar);
        int length = iArr.length;
        this.f8694h = length;
        this.f8690a = new m[length];
        for (int i4 = 0; i4 < iArr.length; i4++) {
            this.f8690a[i4] = aeVar.a(iArr[i4]);
        }
        Arrays.sort(this.f8690a, new a(objArr == true ? 1 : 0));
        this.i = new int[this.f8694h];
        while (true) {
            int i6 = this.f8694h;
            if (i >= i6) {
                this.f8691b = new long[i6];
                return;
            } else {
                this.i[i] = aeVar.a(this.f8690a[i]);
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
        for (int i4 = 0; i4 < this.f8694h; i4++) {
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
            if (this.f8693g == bVar.f8693g && Arrays.equals(this.i, bVar.i)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final ae f() {
        return this.f8693g;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int g() {
        return this.i.length;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final m h() {
        return this.f8690a[b()];
    }

    public int hashCode() {
        if (this.f8692c == 0) {
            this.f8692c = Arrays.hashCode(this.i) + (System.identityHashCode(this.f8693g) * 31);
        }
        return this.f8692c;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int i() {
        return this.i[b()];
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public void a(float f2) {
    }

    public final boolean b(int i, long j6) {
        return this.f8691b[i] > j6;
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final m a(int i) {
        return this.f8690a[i];
    }

    @Override // com.anythink.basead.exoplayer.i.f
    public final int a(m mVar) {
        for (int i = 0; i < this.f8694h; i++) {
            if (this.f8690a[i] == mVar) {
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
        int i4 = 0;
        while (i4 < this.f8694h && !b9) {
            b9 = (i4 == i || b(i4, elapsedRealtime)) ? false : true;
            i4++;
        }
        if (!b9) {
            return false;
        }
        long[] jArr = this.f8691b;
        jArr[i] = Math.max(jArr[i], elapsedRealtime + j6);
        return true;
    }
}
