package com.anythink.basead.exoplayer.j.a;

import java.io.File;

/* loaded from: classes.dex */
public class e implements Comparable<e> {

    /* renamed from: a, reason: collision with root package name */
    public final String f8846a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8847b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8848c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8849d;

    /* renamed from: e, reason: collision with root package name */
    public final File f8850e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8851f;

    private e(String str, long j6, long j9) {
        this(str, j6, j9, com.anythink.basead.exoplayer.b.f7168b, null);
    }

    public final boolean a() {
        return this.f8848c == -1;
    }

    public final boolean b() {
        return !this.f8849d;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(e eVar) {
        e eVar2 = eVar;
        if (!this.f8846a.equals(eVar2.f8846a)) {
            return this.f8846a.compareTo(eVar2.f8846a);
        }
        long j6 = this.f8847b - eVar2.f8847b;
        if (j6 == 0) {
            return 0;
        }
        return j6 < 0 ? -1 : 1;
    }

    public e(String str, long j6, long j9, long j10, File file) {
        this.f8846a = str;
        this.f8847b = j6;
        this.f8848c = j9;
        this.f8849d = file != null;
        this.f8850e = file;
        this.f8851f = j10;
    }

    private int a(e eVar) {
        if (!this.f8846a.equals(eVar.f8846a)) {
            return this.f8846a.compareTo(eVar.f8846a);
        }
        long j6 = this.f8847b - eVar.f8847b;
        if (j6 == 0) {
            return 0;
        }
        return j6 < 0 ? -1 : 1;
    }
}
