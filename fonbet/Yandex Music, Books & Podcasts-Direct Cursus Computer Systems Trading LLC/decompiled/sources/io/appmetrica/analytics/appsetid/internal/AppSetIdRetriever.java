package io.appmetrica.analytics.appsetid.internal;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import defpackage.cuk;
import defpackage.cxb;
import defpackage.h8s;
import defpackage.i6c;
import defpackage.iu0;
import defpackage.j8s;
import defpackage.kpm;
import defpackage.onx;
import defpackage.q5i;
import defpackage.qo0;
import defpackage.y8p;
import defpackage.yix;
import defpackage.ywf;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetIdScope;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/appsetid/internal/AppSetIdRetriever;", "Lio/appmetrica/analytics/appsetid/internal/IAppSetIdRetriever;", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/appsetid/internal/AppSetIdListener;", "listener", "", "retrieveAppSetId", "<init>", "()V", "appsetid_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes5.dex */
public final class AppSetIdRetriever implements IAppSetIdRetriever {
    private final Object a = new Object();
    private final ArrayList b = new ArrayList();

    public static final AppSetIdScope access$convertScope(AppSetIdRetriever appSetIdRetriever, int i) {
        appSetIdRetriever.getClass();
        return i != 1 ? i != 2 ? AppSetIdScope.UNKNOWN : AppSetIdScope.DEVELOPER : AppSetIdScope.APP;
    }

    @Override // io.appmetrica.analytics.appsetid.internal.IAppSetIdRetriever
    public void retrieveAppSetId(@NotNull Context context, @NotNull final AppSetIdListener listener) throws Throwable {
        onx v;
        y8p y8pVar = new y8p(context, 19);
        yix yixVar = (yix) y8pVar.b;
        if (yixVar.l.b(yixVar.k, 212800000) == 0) {
            q5i a = h8s.a();
            a.d = new i6c[]{cxb.r};
            a.c = new cuk(yixVar);
            a.a = false;
            a.b = 27601;
            v = yixVar.c(0, a.c());
        } else {
            v = ywf.v(new qo0(new Status(17, null, null, null)));
        }
        kpm kpmVar = new kpm(28, y8pVar);
        v.getClass();
        Task f = v.f(j8s.a, kpmVar);
        OnCompleteListener<iu0> onCompleteListener = new OnCompleteListener<iu0>() { // from class: io.appmetrica.analytics.appsetid.internal.AppSetIdRetriever$retrieveAppSetId$onCompleteListener$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@NotNull Task<iu0> completedTask) {
                Object obj;
                List list;
                obj = AppSetIdRetriever.this.a;
                AppSetIdRetriever appSetIdRetriever = AppSetIdRetriever.this;
                synchronized (obj) {
                    list = appSetIdRetriever.b;
                    list.remove(this);
                }
                boolean l = completedTask.l();
                AppSetIdListener appSetIdListener = listener;
                if (l) {
                    appSetIdListener.onAppSetIdRetrieved(((iu0) completedTask.h()).a, AppSetIdRetriever.access$convertScope(AppSetIdRetriever.this, ((iu0) completedTask.h()).b));
                } else {
                    appSetIdListener.onFailure(completedTask.g());
                }
            }
        };
        synchronized (this.a) {
            this.b.add(onCompleteListener);
        }
        f.addOnCompleteListener(onCompleteListener);
    }
}
