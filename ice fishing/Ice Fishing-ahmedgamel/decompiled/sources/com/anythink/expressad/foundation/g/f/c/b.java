package com.anythink.expressad.foundation.g.f.c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f20033a;

    /* renamed from: b, reason: collision with root package name */
    private InputStream f20034b;

    /* renamed from: c, reason: collision with root package name */
    private File f20035c;

    /* renamed from: d, reason: collision with root package name */
    private long f20036d;

    /* renamed from: e, reason: collision with root package name */
    private String f20037e;

    /* renamed from: f, reason: collision with root package name */
    private String f20038f;

    /* renamed from: g, reason: collision with root package name */
    private String f20039g;

    private b(String str, byte[] bArr, long j6, String str2, String str3) {
        this.f20039g = "application/octet-stream";
        this.f20037e = str;
        this.f20038f = str2;
        this.f20033a = bArr;
        this.f20036d = j6;
        if (str3 != null) {
            this.f20039g = str3;
        }
    }

    public final long a() {
        return this.f20036d;
    }

    public final File b() {
        return this.f20035c;
    }

    public final InputStream c() {
        return this.f20034b;
    }

    public final byte[] d() {
        return this.f20033a;
    }

    public final String e() {
        return this.f20037e;
    }

    public final String f() {
        return this.f20038f;
    }

    public final String g() {
        return this.f20039g;
    }

    private void a(String str) {
        this.f20037e = str;
    }

    private void b(String str) {
        this.f20038f = str;
    }

    private void c(String str) {
        this.f20039g = str;
    }

    public b(String str, File file, String str2, String str3) {
        this.f20039g = "application/octet-stream";
        this.f20037e = str;
        this.f20038f = str2;
        try {
            this.f20034b = new FileInputStream(file);
        } catch (FileNotFoundException e9) {
            e9.printStackTrace();
        }
        this.f20036d = file.length();
        if (str3 != null) {
            this.f20039g = str3;
        }
        this.f20035c = file;
    }

    private b(InputStream inputStream, int i, String str, String str2, String str3) {
        this.f20037e = str;
        this.f20038f = str2;
        this.f20034b = inputStream;
        this.f20036d = i;
        this.f20039g = str3;
    }
}
