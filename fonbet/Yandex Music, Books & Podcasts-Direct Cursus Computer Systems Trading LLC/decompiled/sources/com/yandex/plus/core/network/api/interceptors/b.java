package com.yandex.plus.core.network.api.interceptors;

import com.connectsdk.service.airplay.PListParser;
import defpackage.b0o;
import defpackage.bse;
import defpackage.d0o;
import defpackage.l3o;
import defpackage.ukn;
import java.io.IOException;
import java.util.Calendar;

/* loaded from: classes4.dex */
public final class b implements bse {
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i) {
        this.a = i;
    }

    @Override // defpackage.bse
    public final l3o b(ukn uknVar) {
        switch (this.a) {
            case 0:
                b0o b = ((d0o) uknVar.i).b();
                b.d("X-Yandex-Plus-Graphql-Apollo-Compatible", PListParser.TAG_TRUE);
                return uknVar.f(b.b());
            case 1:
                try {
                    return uknVar.f((d0o) uknVar.i);
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new IOException(e2);
                }
            default:
                b0o b2 = ((d0o) uknVar.i).b();
                String id = Calendar.getInstance().getTimeZone().getID();
                id.getClass();
                b2.d("Timezone", id);
                return uknVar.f(b2.b());
        }
    }
}
