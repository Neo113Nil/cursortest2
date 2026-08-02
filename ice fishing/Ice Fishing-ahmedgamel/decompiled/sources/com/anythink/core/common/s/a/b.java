package com.anythink.core.common.s.a;

import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
final class b {

    public static class a extends j {
        public a(int i, int i4, Object obj, int i6, boolean z6) {
            super(i, i4, obj, i6, z6);
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
            Object obj = ((a) abstractC0098b).f17099c;
            Object obj2 = this.f17099c;
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
        int f17092a;

        public abstract byte a();

        public abstract boolean a(AbstractC0098b abstractC0098b);
    }

    public static class c extends AbstractC0098b {

        /* renamed from: b, reason: collision with root package name */
        boolean f17093b;

        public c(int i, boolean z6) {
            this.f17092a = i;
            this.f17093b = z6;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 1;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            return abstractC0098b.a() == 1 && ((c) abstractC0098b).f17093b == this.f17093b;
        }
    }

    public static class d extends AbstractC0098b {

        /* renamed from: b, reason: collision with root package name */
        double f17094b;

        public d(int i, double d9) {
            this.f17092a = i;
            this.f17094b = d9;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 5;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            return abstractC0098b.a() == 5 && ((d) abstractC0098b).f17094b == this.f17094b;
        }
    }

    public static class e extends AbstractC0098b {

        /* renamed from: b, reason: collision with root package name */
        float f17095b;

        public e(int i, float f2) {
            this.f17092a = i;
            this.f17095b = f2;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 3;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            return abstractC0098b.a() == 3 && ((e) abstractC0098b).f17095b == this.f17095b;
        }
    }

    public static class f extends AbstractC0098b {

        /* renamed from: b, reason: collision with root package name */
        int f17096b;

        public f(int i, int i4) {
            this.f17092a = i;
            this.f17096b = i4;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 2;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            return abstractC0098b.a() == 2 && ((f) abstractC0098b).f17096b == this.f17096b;
        }
    }

    public static class g extends AbstractC0098b {

        /* renamed from: b, reason: collision with root package name */
        long f17097b;

        public g(int i, long j6) {
            this.f17092a = i;
            this.f17097b = j6;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 4;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            return abstractC0098b.a() == 4 && ((g) abstractC0098b).f17097b == this.f17097b;
        }
    }

    public static class h extends j {

        /* renamed from: b, reason: collision with root package name */
        com.anythink.core.common.s.a.a.b f17098b;

        public h(int i, int i4, Object obj, int i6, boolean z6) {
            super(i, i4, obj, i6, z6);
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final byte a() {
            return (byte) 8;
        }

        @Override // com.anythink.core.common.s.a.b.AbstractC0098b
        public final boolean a(AbstractC0098b abstractC0098b) {
            return abstractC0098b.a() == 8 && Objects.equals(((h) abstractC0098b).f17099c, this.f17099c);
        }
    }

    public static class i extends j {
        public i(int i, int i4, String str, int i6, boolean z6) {
            super(i, i4, str, i6, z6);
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
            return iVar.f17102f == this.f17102f && Objects.equals(iVar.f17099c, this.f17099c);
        }
    }

    public static abstract class j extends AbstractC0098b {

        /* renamed from: c, reason: collision with root package name */
        Object f17099c;

        /* renamed from: d, reason: collision with root package name */
        int f17100d;

        /* renamed from: e, reason: collision with root package name */
        int f17101e;

        /* renamed from: f, reason: collision with root package name */
        boolean f17102f;

        public j(int i, int i4, Object obj, int i6, boolean z6) {
            this.f17100d = i;
            this.f17092a = i4;
            this.f17099c = obj;
            this.f17101e = i6;
            this.f17102f = z6;
        }
    }
}
