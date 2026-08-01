package com.anythink.basead.exoplayer.j;

import android.text.TextUtils;
import com.anythink.basead.exoplayer.j.h;
import com.anythink.basead.exoplayer.k.af;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public interface s extends h {

    /* renamed from: c, reason: collision with root package name */
    public static final com.anythink.basead.exoplayer.k.u<String> f8222c = new com.anythink.basead.exoplayer.k.u<String>() { // from class: com.anythink.basead.exoplayer.j.s.1
        @Override // com.anythink.basead.exoplayer.k.u
        public final /* synthetic */ boolean a(String str) {
            String d2 = af.d(str);
            if (TextUtils.isEmpty(d2)) {
                return false;
            }
            return ((d2.contains(com.anythink.basead.exoplayer.k.o.f8446c) && !d2.contains(com.anythink.basead.exoplayer.k.o.f8433O)) || d2.contains(com.onesignal.inAppMessages.internal.d.HTML) || d2.contains("xml")) ? false : true;
        }

        /* renamed from: a, reason: avoid collision after fix types in other method */
        private static boolean a2(String str) {
            String d2 = af.d(str);
            if (TextUtils.isEmpty(d2)) {
                return false;
            }
            return ((d2.contains(com.anythink.basead.exoplayer.k.o.f8446c) && !d2.contains(com.anythink.basead.exoplayer.k.o.f8433O)) || d2.contains(com.onesignal.inAppMessages.internal.d.HTML) || d2.contains("xml")) ? false : true;
        }
    };

    public static abstract class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private final f f8223a = new f();

        public abstract s a(f fVar);

        @Override // com.anythink.basead.exoplayer.j.s.b, com.anythink.basead.exoplayer.j.h.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final s a() {
            return a(this.f8223a);
        }

        @Override // com.anythink.basead.exoplayer.j.s.b
        public final f c() {
            return this.f8223a;
        }

        @Override // com.anythink.basead.exoplayer.j.s.b
        @Deprecated
        public final void d() {
            this.f8223a.a();
        }

        @Override // com.anythink.basead.exoplayer.j.s.b
        @Deprecated
        public final void a(String str, String str2) {
            this.f8223a.a(str, str2);
        }

        @Override // com.anythink.basead.exoplayer.j.s.b
        @Deprecated
        public final void a(String str) {
            this.f8223a.a(str);
        }
    }

    public interface b extends h.a {
        @Deprecated
        void a(String str);

        @Deprecated
        void a(String str, String str2);

        @Override // com.anythink.basead.exoplayer.j.h.a
        /* renamed from: b */
        s a();

        f c();

        @Deprecated
        void d();
    }

    public static final class d extends c {

        /* renamed from: f, reason: collision with root package name */
        public final String f8229f;

        public d(String str, k kVar) {
            super("Invalid content type: ".concat(String.valueOf(str)), kVar);
            this.f8229f = str;
        }
    }

    public static final class e extends c {

        /* renamed from: f, reason: collision with root package name */
        public final int f8230f;

        /* renamed from: g, reason: collision with root package name */
        public final Map<String, List<String>> f8231g;

        public e(int i, Map<String, List<String>> map, k kVar) {
            super("Response code: ".concat(String.valueOf(i)), kVar);
            this.f8230f = i;
            this.f8231g = map;
        }
    }

    @Override // com.anythink.basead.exoplayer.j.h
    int a(byte[] bArr, int i, int i6);

    @Override // com.anythink.basead.exoplayer.j.h
    long a(k kVar);

    void a(String str);

    void a(String str, String str2);

    @Override // com.anythink.basead.exoplayer.j.h
    void b();

    Map<String, List<String>> c();

    void d();

    public static class c extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public static final int f8224a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f8225b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f8226c = 3;

        /* renamed from: d, reason: collision with root package name */
        public final int f8227d;

        /* renamed from: e, reason: collision with root package name */
        public final k f8228e;

        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }

        private c(k kVar, int i) {
            this.f8228e = kVar;
            this.f8227d = i;
        }

        public c(String str, k kVar) {
            super(str);
            this.f8228e = kVar;
            this.f8227d = 1;
        }

        public c(IOException iOException, k kVar, int i) {
            super(iOException);
            this.f8228e = kVar;
            this.f8227d = i;
        }

        public c(String str, IOException iOException, k kVar) {
            super(str, iOException);
            this.f8228e = kVar;
            this.f8227d = 1;
        }
    }

    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private final Map<String, String> f8232a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        private Map<String, String> f8233b;

        private synchronized void b(Map<String, String> map) {
            this.f8233b = null;
            this.f8232a.clear();
            this.f8232a.putAll(map);
        }

        public final synchronized void a(String str, String str2) {
            this.f8233b = null;
            this.f8232a.put(str, str2);
        }

        private synchronized void a(Map<String, String> map) {
            this.f8233b = null;
            this.f8232a.putAll(map);
        }

        public final synchronized Map<String, String> b() {
            try {
                if (this.f8233b == null) {
                    this.f8233b = Collections.unmodifiableMap(new HashMap(this.f8232a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f8233b;
        }

        public final synchronized void a(String str) {
            this.f8233b = null;
            this.f8232a.remove(str);
        }

        public final synchronized void a() {
            this.f8233b = null;
            this.f8232a.clear();
        }
    }
}
