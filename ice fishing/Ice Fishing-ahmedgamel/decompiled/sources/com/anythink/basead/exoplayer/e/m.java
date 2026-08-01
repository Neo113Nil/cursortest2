package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.k.s;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface m {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7183a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f7184b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7185c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7186d;

        public a(int i, byte[] bArr, int i6, int i9) {
            this.f7183a = i;
            this.f7184b = bArr;
            this.f7185c = i6;
            this.f7186d = i9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7183a == aVar.f7183a && this.f7185c == aVar.f7185c && this.f7186d == aVar.f7186d && Arrays.equals(this.f7184b, aVar.f7184b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f7184b) + (this.f7183a * 31)) * 31) + this.f7185c) * 31) + this.f7186d;
        }
    }

    int a(f fVar, int i, boolean z3);

    void a(long j6, int i, int i6, int i9, a aVar);

    void a(s sVar, int i);

    void a(com.anythink.basead.exoplayer.m mVar);
}
