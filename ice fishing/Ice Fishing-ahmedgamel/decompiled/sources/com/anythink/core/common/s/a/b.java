package com.anythink.core.common.s.a;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class b {

    public static class a extends j {
        public a(int i, int i6, Object obj, int i9, boolean z3) {
            super(i, i6, obj, i9, z3);
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 7;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            if (abstractC0098b.a() != 7) {
                return false;
            }
            Object obj = ((a) abstractC0098b).f16312c;
            Object obj2 = this.f16312c;
            if (obj2 == obj) {
                return true;
            }
            if (obj2 != null && obj != null) {
                if (obj2 instanceof String) {
                    return obj2.equals(obj);
                }
                if ((obj2 instanceof byte[]) && (obj instanceof byte[])) {
                    return Arrays.equals((byte[]) obj2, (byte[]) obj);
                }
            }
            return false;
        }
    }

    /* renamed from: com.anythink.core.common.s.a.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0098b {

        /* renamed from: a, reason: collision with root package name */
        int f16305a;

        public abstract byte a();

        public abstract boolean a(AbstractC0098b abstractC0098b);
    }

    public static class c extends AbstractC0098b {

        /* renamed from: b, reason: collision with root package name */
        boolean f16306b;

        public c(int i, boolean z3) {
            this.f16305a = i;
            this.f16306b = z3;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 1;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            return abstractC0098b.a() == 1 && ((c) abstractC0098b).f16306b == this.f16306b;
        }
    }

    public static class d extends AbstractC0098b {

        /* renamed from: b, reason: collision with root package name */
        double f16307b;

        public d(int i, double d2) {
            this.f16305a = i;
            this.f16307b = d2;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 5;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            return abstractC0098b.a() == 5 && ((d) abstractC0098b).f16307b == this.f16307b;
        }
    }

    public static class e extends AbstractC0098b {

        /* renamed from: b, reason: collision with root package name */
        float f16308b;

        public e(int i, float f3) {
            this.f16305a = i;
            this.f16308b = f3;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 3;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            return abstractC0098b.a() == 3 && ((e) abstractC0098b).f16308b == this.f16308b;
        }
    }

    public static class f extends AbstractC0098b {

        /* renamed from: b, reason: collision with root package name */
        int f16309b;

        public f(int i, int i6) {
            this.f16305a = i;
            this.f16309b = i6;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 2;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            return abstractC0098b.a() == 2 && ((f) abstractC0098b).f16309b == this.f16309b;
        }
    }

    public static class g extends AbstractC0098b {

        /* renamed from: b, reason: collision with root package name */
        long f16310b;

        public g(int i, long j6) {
            this.f16305a = i;
            this.f16310b = j6;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 4;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            return abstractC0098b.a() == 4 && ((g) abstractC0098b).f16310b == this.f16310b;
        }
    }

    public static class h extends j {

        /* renamed from: b, reason: collision with root package name */
        com.anythink.core.common.s.a.a.b f16311b;

        public h(int i, int i6, Object obj, int i9, boolean z3) {
            super(i, i6, obj, i9, z3);
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 8;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            return abstractC0098b.a() == 8 && Objects.equals(((h) abstractC0098b).f16312c, this.f16312c);
        }
    }

    public static class i extends j {
        public i(int i, int i6, String str, int i9, boolean z3) {
            super(i, i6, str, i9, z3);
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 6;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            if (abstractC0098b.a() != 6) {
                return false;
            }
            i iVar = (i) abstractC0098b;
            return iVar.f16315f == this.f16315f && Objects.equals(iVar.f16312c, this.f16312c);
        }
    }

    public static abstract class j extends AbstractC0098b {

        /* renamed from: c, reason: collision with root package name */
        Object f16312c;

        /* renamed from: d, reason: collision with root package name */
        int f16313d;

        /* renamed from: e, reason: collision with root package name */
        int f16314e;

        /* renamed from: f, reason: collision with root package name */
        boolean f16315f;

        public j(int i, int i6, Object obj, int i9, boolean z3) {
            this.f16313d = i;
            this.f16305a = i6;
            this.f16312c = obj;
            this.f16314e = i9;
            this.f16315f = z3;
        }
    }
}
