package defpackage;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.widget.RemoteViews;
import android.widget.RemoteViewsService;
import androidx.glance.appwidget.GlanceRemoteViewsService;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class wkd implements RemoteViewsService.RemoteViewsFactory {
    public final GlanceRemoteViewsService a;
    public final int b;
    public final int c;
    public final String d;

    public wkd(GlanceRemoteViewsService glanceRemoteViewsService, int i, int i2, String str) {
        this.a = glanceRemoteViewsService;
        this.b = i;
        this.c = i2;
        this.d = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        if (r12.j0(r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
    
        if (r12 != null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(wkd wkdVar, rv0 rv0Var, cg6 cg6Var) {
        vkd vkdVar;
        int i;
        pv0 pv0Var;
        ComponentName componentName;
        String className;
        r2f r2fVar;
        if (cg6Var instanceof vkd) {
            vkdVar = (vkd) cg6Var;
            int i2 = vkdVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vkdVar.m = i2 - Integer.MIN_VALUE;
                Object obj = vkdVar.k;
                nm6 nm6Var = nm6.a;
                i = vkdVar.m;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(wkdVar.a).getAppWidgetInfo(wkdVar.b);
                    if (appWidgetInfo == null || (componentName = appWidgetInfo.provider) == null || (className = componentName.getClassName()) == null) {
                        pv0Var = null;
                    } else {
                        Object newInstance = Class.forName(className).getDeclaredConstructor(null).newInstance(null);
                        newInstance.getClass();
                        pv0Var = ((pkd) newInstance).b();
                    }
                    if (pv0Var != null) {
                        pmp pmpVar = qmp.a;
                        d57 d57Var = new d57(wkdVar, rv0Var, pv0Var, continuation, 23);
                        vkdVar.j = wkdVar;
                        vkdVar.m = 1;
                        obj = pmpVar.a(d57Var, vkdVar);
                        if (obj != nm6Var) {
                            wkdVar = wkdVar;
                        }
                        return nm6Var;
                    }
                    jwl jwlVar = UnmanagedSessionReceiver.a;
                    jwl.a(wkdVar.b);
                    r2fVar = null;
                    if (r2fVar != null) {
                    }
                } else if (i == 1) {
                    wkdVar = vkdVar.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    r2fVar = (r2f) obj;
                    if (r2fVar != null) {
                        return Unit.a;
                    }
                    vkdVar.j = null;
                    vkdVar.m = 3;
                }
                r2fVar = (r2f) obj;
            }
        }
        vkdVar = new vkd(wkdVar, cg6Var);
        Object obj2 = vkdVar.k;
        nm6 nm6Var2 = nm6.a;
        i = vkdVar.m;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        r2fVar = (r2f) obj2;
    }

    public final sun b() {
        sun sunVar;
        kpm kpmVar = GlanceRemoteViewsService.a;
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        kpm kpmVar2 = GlanceRemoteViewsService.a;
        synchronized (kpmVar2) {
            sunVar = (sun) ((LinkedHashMap) kpmVar2.b).get(kpm.H(i, i2, str));
            if (sunVar == null) {
                sunVar = sun.d;
            }
        }
        return sunVar;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getCount() {
        return b().a.length;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final long getItemId(int i) {
        try {
            return b().a[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return -1L;
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final /* bridge */ /* synthetic */ RemoteViews getLoadingView() {
        return null;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final RemoteViews getViewAt(int i) {
        try {
            return b().b[i];
        } catch (ArrayIndexOutOfBoundsException unused) {
            return new RemoteViews(this.a.getPackageName(), R.layout.glance_invalid_list_item);
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final int getViewTypeCount() {
        return b().c;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final boolean hasStableIds() {
        b().getClass();
        return false;
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDataSetChanged() {
        x97.D(g.a, new g68(this, null, 29));
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onDestroy() {
        kpm kpmVar = GlanceRemoteViewsService.a;
        int i = this.b;
        int i2 = this.c;
        String str = this.d;
        kpm kpmVar2 = GlanceRemoteViewsService.a;
        synchronized (kpmVar2) {
            ((LinkedHashMap) kpmVar2.b).remove(kpm.H(i, i2, str));
        }
    }

    @Override // android.widget.RemoteViewsService.RemoteViewsFactory
    public final void onCreate() {
    }
}
