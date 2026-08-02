package com.anythink.basead.exoplayer.e;

import com.anythink.basead.exoplayer.k.s;
import java.util.Arrays;

/* loaded from: classes.dex */
public interface m {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f7969a;

        /* renamed from: b, reason: collision with root package name */
        public final byte[] f7970b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7971c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7972d;

        public a(int i, byte[] bArr, int i4, int i6) {
            this.f7969a = i;
            this.f7970b = bArr;
            this.f7971c = i4;
            this.f7972d = i6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f7969a == aVar.f7969a && this.f7971c == aVar.f7971c && this.f7972d == aVar.f7972d && Arrays.equals(this.f7970b, aVar.f7970b)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return ((((Arrays.hashCode(this.f7970b) + (this.f7969a * 31)) * 31) + this.f7971c) * 31) + this.f7972d;
        }
    }

    int a(f fVar, int i, boolean z6);

    void a(long j6, int i, int i4, int i6, a aVar);

    void a(s sVar, int i);

    void a(com.anythink.basead.exoplayer.m mVar);
}
