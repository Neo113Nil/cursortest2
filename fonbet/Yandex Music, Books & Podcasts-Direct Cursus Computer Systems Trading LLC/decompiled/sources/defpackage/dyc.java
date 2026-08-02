package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.video.m3.player.tracking.FullscreenDataBundle;
import ru.yandex.video.m3.player.tracking.FullscreenInfo;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class dyc implements u9l {
    public final Context a;
    public final yjj b;
    public FullscreenInfo c;

    public dyc(Context context) {
        yjj yjjVar = new yjj();
        context.getClass();
        this.a = context;
        this.b = yjjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if ((r1 / (r8.heightPixels * r8.widthPixels)) > 0.9d) goto L11;
     */
    @Override // defpackage.u9l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j0(FullscreenDataBundle fullscreenDataBundle) {
        HashSet u0;
        Object t7oVar;
        fullscreenDataBundle.getClass();
        Boolean isFullscreenExternal = fullscreenDataBundle.getIsFullscreenExternal();
        int surfaceHeight = fullscreenDataBundle.getSurfaceHeight();
        int surfaceWidth = fullscreenDataBundle.getSurfaceWidth();
        Context context = this.a;
        boolean z = true;
        if (context.getResources().getConfiguration().orientation != 2) {
            if (surfaceHeight != Integer.MAX_VALUE) {
                int i = surfaceHeight * surfaceWidth;
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            }
            z = false;
        }
        this.c = new FullscreenInfo(isFullscreenExternal, Boolean.valueOf(z), null);
        yjj yjjVar = this.b;
        synchronized (yjjVar.a) {
            u0 = CollectionsKt.u0(yjjVar.a);
        }
        Iterator it = u0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            try {
                r7o r7oVar = z7o.b;
                rgu rguVar = (rgu) next;
                rguVar.b(rguVar.d);
                t7oVar = Unit.a;
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            Throwable a = z7o.a(t7oVar);
            if (a != null) {
                Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
            }
        }
    }
}
