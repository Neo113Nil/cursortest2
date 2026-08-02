package com.yandex.plus.core.openapi;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.dfi;
import defpackage.f1d;
import defpackage.k5r;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/plus/core/openapi/a;", "", "T", "b", "a", "com/yandex/plus/core/openapi/b", "Lcom/yandex/plus/core/openapi/a$a;", "Lcom/yandex/plus/core/openapi/a$b;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public abstract class a<T> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/plus/core/openapi/a$a;", "Lcom/yandex/plus/core/openapi/a;", "", "a", "d", "b", "c", "Lcom/yandex/plus/core/openapi/a$a$a;", "Lcom/yandex/plus/core/openapi/a$a$b;", "Lcom/yandex/plus/core/openapi/a$a$c;", "Lcom/yandex/plus/core/openapi/a$a$d;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    /* renamed from: com.yandex.plus.core.openapi.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0017a extends a {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/plus/core/openapi/a$a$a;", "Lcom/yandex/plus/core/openapi/a$a;", "b", "a", "Lcom/yandex/plus/core/openapi/a$a$a$a;", "Lcom/yandex/plus/core/openapi/a$a$a$b;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        /* renamed from: com.yandex.plus.core.openapi.a$a$a, reason: collision with other inner class name */
        public static abstract class AbstractC0018a extends AbstractC0017a {

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/plus/core/openapi/a$a$a$a;", "Lcom/yandex/plus/core/openapi/a$a$a;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            /* renamed from: com.yandex.plus.core.openapi.a$a$a$a, reason: collision with other inner class name */
            public static final /* data */ class C0019a extends AbstractC0018a {
                public final com.yandex.plus.core.openapi.b a;
                public final int b;
                public final String c;
                public final String d;

                public C0019a(com.yandex.plus.core.openapi.b bVar, int i, String str, String str2) {
                    str.getClass();
                    this.a = bVar;
                    this.b = i;
                    this.c = str;
                    this.d = str2;
                }

                @Override // com.yandex.plus.core.openapi.a
                /* renamed from: a, reason: from getter */
                public final com.yandex.plus.core.openapi.b getB() {
                    return this.a;
                }

                @Override // com.yandex.plus.core.openapi.a.AbstractC0017a.AbstractC0018a
                /* renamed from: c, reason: from getter */
                public final int getB() {
                    return this.b;
                }

                @Override // com.yandex.plus.core.openapi.a.AbstractC0017a.AbstractC0018a
                /* renamed from: d, reason: from getter */
                public final String getD() {
                    return this.d;
                }

                @Override // com.yandex.plus.core.openapi.a.AbstractC0017a.AbstractC0018a
                /* renamed from: e, reason: from getter */
                public final String getC() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0019a)) {
                        return false;
                    }
                    C0019a c0019a = (C0019a) obj;
                    return this.a.equals(c0019a.a) && this.b == c0019a.b && Intrinsics.d(this.c, c0019a.c) && Intrinsics.d(this.d, c0019a.d);
                }

                public final int hashCode() {
                    int c = k5r.c(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
                    String str = this.d;
                    return c + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Backend(meta=");
                    sb.append(this.a);
                    sb.append(", code=");
                    sb.append(this.b);
                    sb.append(", message=");
                    sb.append(this.c);
                    sb.append(", errorBody=");
                    return dfi.i(sb, this.d, ')');
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/plus/core/openapi/a$a$a$b;", "Lcom/yandex/plus/core/openapi/a$a$a;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
            /* renamed from: com.yandex.plus.core.openapi.a$a$a$b */
            public static final /* data */ class b extends AbstractC0018a {
                public final com.yandex.plus.core.openapi.b a;
                public final int b;
                public final String c;
                public final String d;

                public b(com.yandex.plus.core.openapi.b bVar, int i, String str, String str2) {
                    str.getClass();
                    this.a = bVar;
                    this.b = i;
                    this.c = str;
                    this.d = str2;
                }

                @Override // com.yandex.plus.core.openapi.a
                /* renamed from: a, reason: from getter */
                public final com.yandex.plus.core.openapi.b getB() {
                    return this.a;
                }

                @Override // com.yandex.plus.core.openapi.a.AbstractC0017a.AbstractC0018a
                /* renamed from: c, reason: from getter */
                public final int getB() {
                    return this.b;
                }

                @Override // com.yandex.plus.core.openapi.a.AbstractC0017a.AbstractC0018a
                /* renamed from: d, reason: from getter */
                public final String getD() {
                    return this.d;
                }

                @Override // com.yandex.plus.core.openapi.a.AbstractC0017a.AbstractC0018a
                /* renamed from: e, reason: from getter */
                public final String getC() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj;
                    return this.a.equals(bVar.a) && this.b == bVar.b && Intrinsics.d(this.c, bVar.c) && Intrinsics.d(this.d, bVar.d);
                }

                public final int hashCode() {
                    int c = k5r.c(f1d.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
                    String str = this.d;
                    return c + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ClientOrRedirect(meta=");
                    sb.append(this.a);
                    sb.append(", code=");
                    sb.append(this.b);
                    sb.append(", message=");
                    sb.append(this.c);
                    sb.append(", errorBody=");
                    return dfi.i(sb, this.d, ')');
                }
            }

            /* renamed from: c */
            public abstract int getB();

            /* renamed from: d */
            public abstract String getD();

            /* renamed from: e */
            public abstract String getC();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/plus/core/openapi/a$a$b;", "Lcom/yandex/plus/core/openapi/a$a;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        /* renamed from: com.yandex.plus.core.openapi.a$a$b */
        public static final /* data */ class b extends AbstractC0017a {
            public final com.yandex.plus.core.openapi.b a;
            public final IOException b;

            public b(com.yandex.plus.core.openapi.b bVar, IOException iOException) {
                this.a = bVar;
                this.b = iOException;
            }

            @Override // com.yandex.plus.core.openapi.a
            /* renamed from: a, reason: from getter */
            public final com.yandex.plus.core.openapi.b getB() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.b.equals(bVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Network(meta=" + this.a + ", cause=" + this.b + ')';
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/plus/core/openapi/a$a$c;", "Lcom/yandex/plus/core/openapi/a$a;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        /* renamed from: com.yandex.plus.core.openapi.a$a$c */
        public static final /* data */ class c extends AbstractC0017a {
            public final com.yandex.plus.core.openapi.b a;
            public final Throwable b;

            public c(com.yandex.plus.core.openapi.b bVar, Throwable th) {
                bVar.getClass();
                this.a = bVar;
                this.b = th;
            }

            @Override // com.yandex.plus.core.openapi.a
            /* renamed from: a, reason: from getter */
            public final com.yandex.plus.core.openapi.b getB() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return Intrinsics.d(this.a, cVar.a) && this.b.equals(cVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Other(meta=");
                sb.append(this.a);
                sb.append(", cause=");
                return f1d.k(sb, this.b, ')');
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/plus/core/openapi/a$a$d;", "Lcom/yandex/plus/core/openapi/a$a;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
        /* renamed from: com.yandex.plus.core.openapi.a$a$d */
        public static final /* data */ class d extends AbstractC0017a {
            public final com.yandex.plus.core.openapi.b a;
            public final IllegalArgumentException b;

            public d(com.yandex.plus.core.openapi.b bVar, IllegalArgumentException illegalArgumentException) {
                this.a = bVar;
                this.b = illegalArgumentException;
            }

            @Override // com.yandex.plus.core.openapi.a
            /* renamed from: a, reason: from getter */
            public final com.yandex.plus.core.openapi.b getB() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a.equals(dVar.a) && this.b.equals(dVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Parse(meta=" + this.a + ", cause=" + this.b + ')';
            }
        }

        @Override // com.yandex.plus.core.openapi.a
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object getA() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/plus/core/openapi/a$b;", "", "T", "Lcom/yandex/plus/core/openapi/a;", "plus-home-data-openapi-model_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class b<T> extends a<T> {
        public final Object a;
        public final com.yandex.plus.core.openapi.b b;

        public b(Object obj, com.yandex.plus.core.openapi.b bVar) {
            obj.getClass();
            this.a = obj;
            this.b = bVar;
        }

        @Override // com.yandex.plus.core.openapi.a
        /* renamed from: a, reason: from getter */
        public final com.yandex.plus.core.openapi.b getB() {
            return this.b;
        }

        @Override // com.yandex.plus.core.openapi.a
        /* renamed from: b, reason: from getter */
        public final Object getA() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.d(this.a, bVar.a) && this.b.equals(bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Success(parsedResponse=" + this.a + ", meta=" + this.b + ')';
        }
    }

    /* renamed from: a */
    public abstract com.yandex.plus.core.openapi.b getB();

    /* renamed from: b */
    public abstract Object getA();
}
