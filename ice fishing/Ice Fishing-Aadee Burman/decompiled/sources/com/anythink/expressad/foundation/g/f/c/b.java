package com.anythink.expressad.foundation.g.f.c;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f19246a;

    /* renamed from: b, reason: collision with root package name */
    private InputStream f19247b;

    /* renamed from: c, reason: collision with root package name */
    private File f19248c;

    /* renamed from: d, reason: collision with root package name */
    private long f19249d;

    /* renamed from: e, reason: collision with root package name */
    private String f19250e;

    /* renamed from: f, reason: collision with root package name */
    private String f19251f;

    /* renamed from: g, reason: collision with root package name */
    private String f19252g;

    private b(String str, byte[] bArr, long j6, String str2, String str3) {
        this.f19252g = "application/octet-stream";
        this.f19250e = str;
        this.f19251f = str2;
        this.f19246a = bArr;
        this.f19249d = j6;
        if (str3 != null) {
            this.f19252g = str3;
        }
    }

    public final long a() {
        return this.f19249d;
    }

    public final File b() {
        return this.f19248c;
    }

    public final InputStream c() {
        return this.f19247b;
    }

    public final byte[] d() {
        return this.f19246a;
    }

    public final String e() {
        return this.f19250e;
    }

    public final String f() {
        return this.f19251f;
    }

    public final String g() {
        return this.f19252g;
    }

    private void a(String str) {
        this.f19250e = str;
    }

    private void b(String str) {
        this.f19251f = str;
    }

    private void c(String str) {
        this.f19252g = str;
    }

    public b(String str, File file, String str2, String str3) {
        this.f19252g = "application/octet-stream";
        this.f19250e = str;
        this.f19251f = str2;
        try {
            this.f19247b = new FileInputStream(file);
        } catch (FileNotFoundException e9) {
            e9.printStackTrace();
        }
        this.f19249d = file.length();
        if (str3 != null) {
            this.f19252g = str3;
        }
        this.f19248c = file;
    }

    private b(InputStream inputStream, int i, String str, String str2, String str3) {
        this.f19250e = str;
        this.f19251f = str2;
        this.f19247b = inputStream;
        this.f19249d = i;
        this.f19252g = str3;
    }
}
