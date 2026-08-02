package io.appmetrica.analytics.appsetid.internal;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.appset.c;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.zzw;
import defpackage.dtx0;
import defpackage.em91;
import defpackage.qw2;
import defpackage.rfw0;
import defpackage.tbb1;
import defpackage.udq0;
import defpackage.va90;
import defpackage.wx60;
import defpackage.ysx0;
import defpackage.zsx0;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lio/appmetrica/analytics/appsetid/internal/AppSetIdRetriever;", "Lio/appmetrica/analytics/appsetid/internal/IAppSetIdRetriever;", "<init>", "()V", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/appsetid/internal/AppSetIdListener;", "listener", "Lzy11;", "retrieveAppSetId", "(Landroid/content/Context;Lio/appmetrica/analytics/appsetid/internal/AppSetIdListener;)V", "appsetid_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class AppSetIdRetriever implements IAppSetIdRetriever {
    private final Object a = new Object();
    private final ArrayList b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i) {
        appSetIdRetriever.getClass();
        return i != 1 ? i != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER : AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(Context context, final AppSetIdListener listener) throws Throwable {
        zzw o;
        rfw0 rfw0Var = new rfw0(context);
        tbb1 tbb1Var = (tbb1) rfw0Var.a;
        if (tbb1Var.l.d(tbb1Var.k, 212800000) == 0) {
            ysx0 a = zsx0.a();
            a.c = new Feature[]{em91.a};
            a.a = new c(tbb1Var);
            a.b = false;
            a.d = 27601;
            o = tbb1Var.d(0, a.a());
        } else {
            o = udq0.o(new ApiException(new Status(17)));
        }
        va90 va90Var = new va90(rfw0Var);
        o.getClass();
        Task i = o.i(dtx0.a, va90Var);
        wx60 wx60Var = new wx60() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // defpackage.wx60
            public void onComplete(Task completedTask) {
                Object obj;
                List list;
                obj = AppSetIdRetriever.this.a;
                AppSetIdRetriever appSetIdRetriever = AppSetIdRetriever.this;
                synchronized (obj) {
                    list = appSetIdRetriever.b;
                    list.remove(this);
                }
                boolean o2 = completedTask.o();
                AppSetIdListener appSetIdListener = listener;
                if (o2) {
                    appSetIdListener.onAppSetIdRetrieved(((qw2) completedTask.k()).a, AppSetIdRetriever.access$convertScope(AppSetIdRetriever.this, ((qw2) completedTask.k()).b));
                } else {
                    appSetIdListener.onFailure(completedTask.j());
                }
            }
        };
        synchronized (this.a) {
            this.b.add(wx60Var);
        }
        i.b(wx60Var);
    }
}
