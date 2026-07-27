package com.anythink.core.common.s.a;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class b {

    public static class a extends j {
        public a(int i, int i4, Object obj, int i9, boolean z8) {
            super(i, i4, obj, i9, z8);
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final byte a() {
            return (byte) 7;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final boolean a(AbstractC0097b abstractC0097b) {
            if (abstractC0097b.a() != 7) {
                return false;
            }
            Object obj = ((a) abstractC0097b).f16470c;
            Object obj2 = this.f16470c;
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
    public static abstract class AbstractC0097b {

        /* renamed from: a, reason: collision with root package name */
        int f16463a;

        public abstract byte a();

        public abstract boolean a(AbstractC0097b abstractC0097b);
    }

    public static class c extends AbstractC0097b {

        /* renamed from: b, reason: collision with root package name */
        boolean f16464b;

        public c(int i, boolean z8) {
            this.f16463a = i;
            this.f16464b = z8;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final byte a() {
            return (byte) 1;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final boolean a(AbstractC0097b abstractC0097b) {
            return abstractC0097b.a() == 1 && ((c) abstractC0097b).f16464b == this.f16464b;
        }
    }

    public static class d extends AbstractC0097b {

        /* renamed from: b, reason: collision with root package name */
        double f16465b;

        public d(int i, double d2) {
            this.f16463a = i;
            this.f16465b = d2;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final byte a() {
            return (byte) 5;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final boolean a(AbstractC0097b abstractC0097b) {
            return abstractC0097b.a() == 5 && ((d) abstractC0097b).f16465b == this.f16465b;
        }
    }

    public static class e extends AbstractC0097b {

        /* renamed from: b, reason: collision with root package name */
        float f16466b;

        public e(int i, float f6) {
            this.f16463a = i;
            this.f16466b = f6;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final byte a() {
            return (byte) 3;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final boolean a(AbstractC0097b abstractC0097b) {
            return abstractC0097b.a() == 3 && ((e) abstractC0097b).f16466b == this.f16466b;
        }
    }

    public static class f extends AbstractC0097b {

        /* renamed from: b, reason: collision with root package name */
        int f16467b;

        public f(int i, int i4) {
            this.f16463a = i;
            this.f16467b = i4;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final byte a() {
            return (byte) 2;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final boolean a(AbstractC0097b abstractC0097b) {
            return abstractC0097b.a() == 2 && ((f) abstractC0097b).f16467b == this.f16467b;
        }
    }

    public static class g extends AbstractC0097b {

        /* renamed from: b, reason: collision with root package name */
        long f16468b;

        public g(int i, long j9) {
            this.f16463a = i;
            this.f16468b = j9;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final byte a() {
            return (byte) 4;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final boolean a(AbstractC0097b abstractC0097b) {
            return abstractC0097b.a() == 4 && ((g) abstractC0097b).f16468b == this.f16468b;
        }
    }

    public static class h extends j {

        /* renamed from: b, reason: collision with root package name */
        com.anythink.core.common.s.a.a.b f16469b;

        public h(int i, int i4, Object obj, int i9, boolean z8) {
            super(i, i4, obj, i9, z8);
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final byte a() {
            return (byte) 8;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final boolean a(AbstractC0097b abstractC0097b) {
            return abstractC0097b.a() == 8 && Objects.equals(((h) abstractC0097b).f16470c, this.f16470c);
        }
    }

    public static class i extends j {
        public i(int i, int i4, String str, int i9, boolean z8) {
            super(i, i4, str, i9, z8);
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final byte a() {
            return (byte) 6;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0097b
        public final boolean a(AbstractC0097b abstractC0097b) {
            if (abstractC0097b.a() != 6) {
                return false;
            }
            i iVar = (i) abstractC0097b;
            return iVar.f16473f == this.f16473f && Objects.equals(iVar.f16470c, this.f16470c);
        }
    }

    public static abstract class j extends AbstractC0097b {

        /* renamed from: c, reason: collision with root package name */
        Object f16470c;

        /* renamed from: d, reason: collision with root package name */
        int f16471d;

        /* renamed from: e, reason: collision with root package name */
        int f16472e;

        /* renamed from: f, reason: collision with root package name */
        boolean f16473f;

        public j(int i, int i4, Object obj, int i9, boolean z8) {
            this.f16471d = i;
            this.f16463a = i4;
            this.f16470c = obj;
            this.f16472e = i9;
            this.f16473f = z8;
        }
    }
}
