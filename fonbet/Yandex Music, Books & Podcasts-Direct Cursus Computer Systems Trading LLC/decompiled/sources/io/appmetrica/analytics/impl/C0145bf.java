package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0145bf {
    public final Context a;
    public final Wb b;
    public final Fa c;
    public final Xg d;
    public final zr e;
    public volatile IdentifiersResult f;

    public C0145bf(Context context, Wb wb, Fa fa, Xg xg, zr zrVar) {
        this.a = context;
        this.b = wb;
        this.c = fa;
        this.d = xg;
        this.e = zrVar;
        try {
            fa.a();
            xg.a();
            fa.b();
        } catch (Throwable unused) {
            this.c.b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult a() {
        IdentifiersResult identifiersResult = this.f;
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            zr zrVar = this.e;
            String str = identifiersResult.id;
            zrVar.getClass();
            if (zr.a(str)) {
                return identifiersResult;
            }
        }
        try {
            Fa fa = this.c;
            fa.a.lock();
            fa.b.a();
            identifiersResult = this.f;
        } catch (Throwable unused) {
        }
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            zr zrVar2 = this.e;
            String str2 = identifiersResult.id;
            zrVar2.getClass();
            if (zr.a(str2)) {
                Fa fa2 = this.c;
                fa2.b.b();
                fa2.a.unlock();
                return identifiersResult == null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
            }
        }
        String a = Vb.a(FileUtils.getFileFromSdkStorage(this.d.a, "uuid.dat"));
        this.e.getClass();
        if (!zr.a(a)) {
            a = this.d.a(this.b.a(this.a));
        }
        this.e.getClass();
        if (zr.a(a)) {
            IdentifiersResult identifiersResult2 = new IdentifiersResult(a, IdentifierStatus.OK, null);
            try {
                this.f = identifiersResult2;
            } catch (Throwable unused2) {
            }
            identifiersResult = identifiersResult2;
        }
        Fa fa22 = this.c;
        fa22.b.b();
        fa22.a.unlock();
        if (identifiersResult == null) {
        }
    }

    public C0145bf(Context context, Wb wb) {
        this(context, wb, AbstractC0174cf.a(context), new Xg(context), new zr());
    }
}
