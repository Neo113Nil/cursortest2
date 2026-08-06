package io.appmetrica.analytics.identifiers.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;

/* loaded from: classes.dex */
public final class q implements b {

    /* renamed from: a, reason: collision with root package name */
    public final f f3968a;

    public q(f fVar) {
        this.f3968a = fVar;
    }

    @Override // io.appmetrica.analytics.identifiers.impl.b
    public final c a(Context context) {
        c cVar;
        try {
            try {
                try {
                    try {
                        c b2 = b(context);
                        try {
                            this.f3968a.b(context);
                            return b2;
                        } catch (Throwable unused) {
                            return b2;
                        }
                    } catch (g e2) {
                        String message = e2.getMessage();
                        if (message == null) {
                            message = "unknown exception while binding yandex adv_id service";
                        }
                        cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message, 2);
                        this.f3968a.b(context);
                        return cVar;
                    }
                } catch (l e3) {
                    String message2 = e3.getMessage();
                    if (message2 == null) {
                        message2 = "No yandex adv_id service";
                    }
                    cVar = new c(IdentifierStatus.IDENTIFIER_PROVIDER_UNAVAILABLE, null, message2, 2);
                    this.f3968a.b(context);
                    return cVar;
                } catch (Throwable th) {
                    return new c(IdentifierStatus.UNKNOWN, null, "exception while fetching yandex adv_id: " + th.getMessage(), 2);
                }
            } catch (Throwable unused2) {
                return cVar;
            }
        } finally {
            try {
                this.f3968a.b(context);
            } catch (Throwable unused3) {
            }
        }
    }

    public final c b(Context context) {
        s sVar = (s) ((u) this.f3968a.a(context));
        sVar.getClass();
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
            sVar.f3970a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            String readString = obtain2.readString();
            obtain2.recycle();
            obtain.recycle();
            obtain = Parcel.obtain();
            obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.yandex.android.advid.service.YandexAdvIdInterface");
                sVar.f3970a.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                boolean z2 = obtain2.readInt() != 0;
                obtain2.recycle();
                obtain.recycle();
                return new c(IdentifierStatus.OK, new a("yandex", readString, Boolean.valueOf(z2)), null, 4);
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public q() {
        this(new f(r1, p.f3967a, "yandex"));
        Intent intent;
        intent = r.f3969a;
    }
}
