package com.anythink.basead.exoplayer.d;

import com.anythink.basead.exoplayer.d.i;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public interface j<T extends i> {

    /* renamed from: a, reason: collision with root package name */
    public static final int f7646a = 2;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7647b = 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7648c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7649d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7650e = 2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7651f = 3;

    public static final class a implements d {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f7652a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7653b;

        public a(byte[] bArr, String str) {
            this.f7652a = bArr;
            this.f7653b = str;
        }

        @Override // com.anythink.basead.exoplayer.d.j.d
        public final byte[] a() {
            return this.f7652a;
        }

        @Override // com.anythink.basead.exoplayer.d.j.d
        public final String b() {
            return this.f7653b;
        }
    }

    public static final class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private final int f7654a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f7655b;

        public b(int i, byte[] bArr) {
            this.f7654a = i;
            this.f7655b = bArr;
        }

        @Override // com.anythink.basead.exoplayer.d.j.e
        public final int a() {
            return this.f7654a;
        }

        @Override // com.anythink.basead.exoplayer.d.j.e
        public final byte[] b() {
            return this.f7655b;
        }
    }

    public static final class c implements h {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f7656a;

        /* renamed from: b, reason: collision with root package name */
        private final String f7657b;

        public c(byte[] bArr, String str) {
            this.f7656a = bArr;
            this.f7657b = str;
        }

        @Override // com.anythink.basead.exoplayer.d.j.h
        public final byte[] a() {
            return this.f7656a;
        }

        @Override // com.anythink.basead.exoplayer.d.j.h
        public final String b() {
            return this.f7657b;
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
