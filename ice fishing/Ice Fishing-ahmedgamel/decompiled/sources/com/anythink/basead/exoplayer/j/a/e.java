package com.anythink.basead.exoplayer.j.a;

import java.io.File;

/* loaded from: classes.dex */
public class e implements Comparable<e> {

    /* renamed from: a, reason: collision with root package name */
    public final String f8060a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8061b;

    /* renamed from: c, reason: collision with root package name */
    public final long f8062c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8063d;

    /* renamed from: e, reason: collision with root package name */
    public final File f8064e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8065f;

    private e(String str, long j6, long j9) {
        this(str, j6, j9, com.anythink.basead.exoplayer.b.f6382b, null);
    }

    public final boolean a() {
        return this.f8062c == -1;
    }

    public final boolean b() {
        return !this.f8063d;
    }

    @Override // java.lang.Comparable
    public /* synthetic */ int compareTo(e eVar) {
        e eVar2 = eVar;
        if (!this.f8060a.equals(eVar2.f8060a)) {
            return this.f8060a.compareTo(eVar2.f8060a);
        }
        long j6 = this.f8061b - eVar2.f8061b;
        if (j6 == 0) {
            return 0;
        }
        return j6 < 0 ? -1 : 1;
    }

    public e(String str, long j6, long j9, long j10, File file) {
        this.f8060a = str;
        this.f8061b = j6;
        this.f8062c = j9;
        this.f8063d = file != null;
        this.f8064e = file;
        this.f8065f = j10;
    }

    private int a(e eVar) {
        if (!this.f8060a.equals(eVar.f8060a)) {
            return this.f8060a.compareTo(eVar.f8060a);
        }
        long j6 = this.f8061b - eVar.f8061b;
        if (j6 == 0) {
            return 0;
        }
        return j6 < 0 ? -1 : 1;
    }
}
