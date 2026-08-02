package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreutils.internal.io.FileUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* renamed from: io.appmetrica.analytics.impl.qf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0652qf {
    public final Context a;
    public final InterfaceC0504lc b;
    public final Ma c;
    public final C0567nh d;
    public final Sr e;
    public volatile IdentifiersResult f;

    public C0652qf(Context context, InterfaceC0504lc interfaceC0504lc, Ma ma, C0567nh c0567nh, Sr sr) {
        this.a = context;
        this.b = interfaceC0504lc;
        this.c = ma;
        this.d = c0567nh;
        this.e = sr;
        try {
            ma.a();
            c0567nh.a();
            ma.b();
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
            Sr sr = this.e;
            String str = identifiersResult.id;
            sr.getClass();
            if (Sr.a(str)) {
                return identifiersResult;
            }
        }
        try {
            Ma ma = this.c;
            ma.a.lock();
            ma.b.a();
            identifiersResult = this.f;
        } catch (Throwable unused) {
        }
        if (identifiersResult != null && identifiersResult.status == IdentifierStatus.OK) {
            Sr sr2 = this.e;
            String str2 = identifiersResult.id;
            sr2.getClass();
            if (Sr.a(str2)) {
                Ma ma2 = this.c;
                ma2.b.b();
                ma2.a.unlock();
                return identifiersResult == null ? identifiersResult : new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "Uuid must be obtained via async API AppMetrica#requestStartupParams(Context, StartupParamsCallback, List<String>)");
            }
        }
        String a = AbstractC0475kc.a(FileUtils.getFileFromSdkStorage(this.d.a, "uuid.dat"));
        this.e.getClass();
        if (!Sr.a(a)) {
            a = this.d.a(this.b.a(this.a));
        }
        this.e.getClass();
        if (Sr.a(a)) {
            IdentifiersResult identifiersResult2 = new IdentifiersResult(a, IdentifierStatus.OK, null);
            try {
                this.f = identifiersResult2;
            } catch (Throwable unused2) {
            }
            identifiersResult = identifiersResult2;
        }
        Ma ma22 = this.c;
        ma22.b.b();
        ma22.a.unlock();
        if (identifiersResult == null) {
        }
    }

    public C0652qf(Context context, InterfaceC0504lc interfaceC0504lc) {
        this(context, interfaceC0504lc, AbstractC0680rf.a(context), new C0567nh(context), new Sr());
    }
}
