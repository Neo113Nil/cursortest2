package io.appmetrica.analytics.appsetid.internal;

import D0.e;
import D0.l;
import D0.m;
import K.a;
import Z0.i;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import f1.C0163N;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import j0.C0966a;
import j0.c;
import java.util.ArrayList;
import java.util.List;
import m0.d;
import o.b;
import x0.g;

/* loaded from: classes.dex */
public final class AppSetIdRetriever implements IAppSetIdRetriever {

    /* renamed from: a, reason: collision with root package name */
    private final Object f3532a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f3533b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i2) {
        appSetIdRetriever.getClass();
        return i2 != 1 ? i2 != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER : AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(Context context, final AppSetIdListener appSetIdListener) {
        m mVar;
        b bVar = new b(context);
        g gVar = (g) bVar.f8226b;
        if (gVar.f8535j.b(gVar.f8534i, 212800000) == 0) {
            a aVar = new a();
            aVar.f1020e = new d[]{c.f8032a};
            aVar.f1019d = new C0163N();
            aVar.f1018c = false;
            aVar.f1017b = 27601;
            mVar = gVar.b(0, aVar.a());
        } else {
            n0.d dVar = new n0.d(new Status(17, null, null, null));
            m mVar2 = new m();
            mVar2.e(dVar);
            mVar = mVar2;
        }
        i iVar = new i(28, bVar);
        mVar.getClass();
        l lVar = e.f211a;
        m mVar3 = new m();
        mVar.f230b.c(new D0.g(lVar, iVar, mVar3));
        mVar.h();
        D0.a aVar2 = new D0.a() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // D0.a
            public void onComplete(Task task) {
                Object obj;
                List list;
                obj = AppSetIdRetriever.this.f3532a;
                AppSetIdRetriever appSetIdRetriever = AppSetIdRetriever.this;
                synchronized (obj) {
                    list = appSetIdRetriever.f3533b;
                    list.remove(this);
                }
                if (task.d()) {
                    appSetIdListener.onAppSetIdRetrieved(((C0966a) task.c()).f8028a, AppSetIdRetriever.access$convertScope(AppSetIdRetriever.this, ((C0966a) task.c()).f8029b));
                } else {
                    appSetIdListener.onFailure(task.b());
                }
            }
        };
        synchronized (this.f3532a) {
            this.f3533b.add(aVar2);
        }
        mVar3.f230b.c(new D0.g(lVar, aVar2));
        mVar3.h();
    }
}
