package io.appmetrica.analytics.identifiers.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import io.appmetrica.analytics.identifiers.impl.a;
import io.appmetrica.analytics.identifiers.impl.b;
import io.appmetrica.analytics.identifiers.impl.c;
import io.appmetrica.analytics.identifiers.impl.d;

@Keep
/* loaded from: classes.dex */
public class AdvIdentifiersProvider {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3972a = 0;
    private static final d retriever = new d();

    public static Bundle requestIdentifiers(Context context, Bundle bundle) {
        c a2;
        b bVar = (b) retriever.f3955a.get(bundle.getString("io.appmetrica.analytics.identifiers.extra.PROVIDER"));
        if (bVar == null || (a2 = bVar.a(context)) == null) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        a aVar = a2.f3953b;
        if (aVar != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.PROVIDER", aVar.f3949a);
            bundle3.putString("io.appmetrica.analytics.identifiers.extra.ID", aVar.f3950b);
            Boolean bool = aVar.f3951c;
            if (bool != null) {
                bundle3.putBoolean("io.appmetrica.analytics.identifiers.extra.LIMITED", bool.booleanValue());
            }
            bundle2.putBundle("io.appmetrica.analytics.identifiers.extra.TRACKING_INFO", bundle3);
        }
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.STATUS", a2.f3952a.getValue());
        bundle2.putString("io.appmetrica.analytics.identifiers.extra.ERROR_MESSAGE", a2.f3954c);
        return bundle2;
    }
}
