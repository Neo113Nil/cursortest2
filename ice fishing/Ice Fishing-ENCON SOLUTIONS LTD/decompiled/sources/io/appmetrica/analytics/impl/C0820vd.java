package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.vd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0820vd {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7059a;

    /* renamed from: b, reason: collision with root package name */
    public final Ka f7060b;

    /* renamed from: c, reason: collision with root package name */
    public final C0868x9 f7061c;

    /* renamed from: d, reason: collision with root package name */
    public final Ae f7062d;

    /* renamed from: e, reason: collision with root package name */
    public final C0676po f7063e;

    /* renamed from: f, reason: collision with root package name */
    public volatile IdentifiersResult f7064f;

    public C0820vd(Context context, Ka ka) {
        this(context, ka, AbstractC0846wd.a(context), new Ae(context), new C0676po());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult a() {
        IdentifiersResult identifiersResult = this.f7064f;
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            C0676po c0676po = this.f7063e;
            String str = identifiersResult.id;
            c0676po.getClass();
            if (C0676po.a(str)) {
                return identifiersResult;
            }
        }
        try {
            C0868x9 c0868x9 = this.f7061c;
            c0868x9.f7194a.lock();
            c0868x9.f7195b.a();
            identifiersResult = this.f7064f;
        } catch (Throwable unused) {
        }
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            C0676po c0676po2 = this.f7063e;
            String str2 = identifiersResult.id;
            c0676po2.getClass();
            if (C0676po.a(str2)) {
                C0868x9 c0868x92 = this.f7061c;
                c0868x92.f7195b.b();
                c0868x92.f7194a.unlock();
                return identifiersResult == null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
            }
        }
        String a2 = Ja.a(FileUtils.getFileFromSdkStorage(this.f7062d.f4148a, "uuid.dat"));
        this.f7063e.getClass();
        if (!C0676po.a(a2)) {
            a2 = this.f7062d.a(this.f7060b.a(this.f7059a));
        }
        this.f7063e.getClass();
        if (C0676po.a(a2)) {
            IdentifiersResult identifiersResult2 = new IdentifiersResult(a2, IdentifierStatus.OK, null);
            try {
                this.f7064f = identifiersResult2;
            } catch (Throwable unused2) {
            }
            identifiersResult = identifiersResult2;
        }
        C0868x9 c0868x922 = this.f7061c;
        c0868x922.f7195b.b();
        c0868x922.f7194a.unlock();
        if (identifiersResult == null) {
        }
    }

    public C0820vd(Context context, Ka ka, C0868x9 c0868x9, Ae ae, C0676po c0676po) {
        this.f7059a = context;
        this.f7060b = ka;
        this.f7061c = c0868x9;
        this.f7062d = ae;
        this.f7063e = c0676po;
        try {
            c0868x9.a();
            ae.a();
            c0868x9.b();
        } catch (Throwable unused) {
            this.f7061c.b();
        }
    }
}
