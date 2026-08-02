package com.yandex.passport.internal.ui.authsdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.passport.internal.usecase.j2;
import com.yandex.passport.internal.usecase.l2;
import defpackage.x97;
import java.io.IOException;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class t extends p {

    @NotNull
    public static final Parcelable.Creator<t> CREATOR = new r(1);
    public final com.yandex.passport.internal.l a;

    public t(com.yandex.passport.internal.l lVar) {
        lVar.getClass();
        this.a = lVar;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.p
    public final com.yandex.passport.internal.l D() {
        return this.a;
    }

    @Override // com.yandex.passport.internal.ui.authsdk.p
    public final p a(k kVar) {
        com.yandex.passport.internal.l lVar = this.a;
        Continuation continuation = null;
        try {
            l2 l2Var = kVar.z;
            l2Var.getClass();
            String str = (String) x97.D(kotlin.coroutines.g.a, new com.yandex.passport.internal.methods.performer.b(l2Var, new j2(lVar.b.a, null), continuation, 28));
            com.yandex.passport.internal.network.client.g L = kVar.L();
            com.yandex.passport.common.account.a aVar = lVar.d;
            l lVar2 = kVar.y;
            return new a0(L.e(aVar, lVar2.a, lVar2.b, str, lVar2.c, lVar2.h, lVar2.g, lVar2.d()), lVar);
        } catch (com.yandex.passport.common.exception.a unused) {
            kVar.t.e(lVar, com.yandex.passport.internal.report.reporters.t.g);
            com.yandex.passport.common.core.f fVar = lVar.b;
            kVar.r.m(new com.yandex.passport.internal.ui.base.l(new com.yandex.passport.internal.ui.l(1, kVar, fVar), 400));
            return new b0(fVar, true);
        } catch (com.yandex.passport.data.exceptions.h e) {
            kVar.N(e, lVar);
            return null;
        } catch (IOException e2) {
            kVar.N(e2, lVar);
            return null;
        } catch (JSONException e3) {
            kVar.N(e3, lVar);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        this.a.writeToParcel(parcel, i);
    }
}
