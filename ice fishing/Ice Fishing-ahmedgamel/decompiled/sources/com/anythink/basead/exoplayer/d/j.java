package com.anythink.basead.exoplayer.d;

import com.anythink.basead.exoplayer.d.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public interface j<T extends i> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f6860a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f6861b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f6862c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f6863d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f6864e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f6865f = 3;

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f6866a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6867b;

        public a(byte[] bArr, String str) {
            this.f6866a = bArr;
            this.f6867b = str;
        }

        @Override // com.anythink.basead.exoplayer.d.j.d
        public final byte[] a() {
            return this.f6866a;
        }

        @Override // com.anythink.basead.exoplayer.d.j.d
        public final String b() {
            return this.f6867b;
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private final int f6868a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f6869b;

        public b(int i, byte[] bArr) {
            this.f6868a = i;
            this.f6869b = bArr;
        }

        @Override // com.anythink.basead.exoplayer.d.j.e
        public final int a() {
            return this.f6868a;
        }

        @Override // com.anythink.basead.exoplayer.d.j.e
        public final byte[] b() {
            return this.f6869b;
        }
    }

    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f6870a;

        /* renamed from: b, reason: collision with root package name */
        private final String f6871b;

        public c(byte[] bArr, String str) {
            this.f6870a = bArr;
            this.f6871b = str;
        }

        @Override // com.anythink.basead.exoplayer.d.j.h
        public final byte[] a() {
            return this.f6870a;
        }

        @Override // com.anythink.basead.exoplayer.d.j.h
        public final String b() {
            return this.f6871b;
        }
    }

    public interface d {
        byte[] a();

        String b();
    }

    public interface e {
        int a();

        byte[] b();
    }

    public interface f<T extends i> {
        void a(byte[] bArr, int i);
    }

    public interface g<T extends i> {
        void a();
    }

    public interface h {
        byte[] a();

        String b();
    }

    d a(byte[] bArr, byte[] bArr2, String str, int i, HashMap<String, String> hashMap);

    String a(String str);

    void a(f<? super T> fVar);

    void a(g<? super T> gVar);

    void a(String str, String str2);

    void a(String str, byte[] bArr);

    void a(byte[] bArr);

    byte[] a();

    byte[] a(byte[] bArr, byte[] bArr2);

    h b();

    void b(byte[] bArr);

    void b(byte[] bArr, byte[] bArr2);

    byte[] b(String str);

    Map<String, String> c(byte[] bArr);

    void c();

    T d(byte[] bArr);
}
