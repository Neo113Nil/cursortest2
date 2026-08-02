package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.material.search.SearchView;
import com.yandex.passport.internal.ui.base.e;
import com.yandex.plus.log.api.a;
import com.yandex.plus.pay.ui.common.api.log.b;
import io.appmetrica.analytics.MviEventsReporter;
import io.appmetrica.analytics.MviTouchEvent;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class de8 implements View.OnTouchListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ de8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        MviEventsReporter mviEventsReporter;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Iterator it = ((List) obj).iterator();
                while (true) {
                    boolean z = false;
                    while (it.hasNext()) {
                        if (((Boolean) ((Function2) it.next()).invoke(view, motionEvent)).booleanValue() || z) {
                            z = true;
                        }
                    }
                    return z;
                    break;
                }
            case 1:
                return ((Boolean) ((s30) obj).invoke(view, motionEvent)).booleanValue();
            case 2:
                wra wraVar = (wra) obj;
                if (motionEvent.getAction() == 1) {
                    long uptimeMillis = SystemClock.uptimeMillis() - wraVar.o;
                    if (uptimeMillis < 0 || uptimeMillis > 300) {
                        wraVar.m = false;
                    }
                    wraVar.t();
                    wraVar.m = true;
                    wraVar.o = SystemClock.uptimeMillis();
                }
                return false;
            case 3:
                suc sucVar = (suc) obj;
                Context context = sucVar.a.getContext();
                if (context != null && sucVar.b.b && (mviEventsReporter = hdg.b) != null) {
                    mviEventsReporter.onTouchEvent(sucVar.c, MviTouchEvent.from(context, motionEvent));
                }
                return false;
            case 4:
                SearchView searchView = (SearchView) obj;
                int i2 = SearchView.E;
                if (searchView.d()) {
                    searchView.b();
                }
                return false;
            case 5:
                e eVar = (e) obj;
                GestureDetector gestureDetector = eVar.b;
                if (gestureDetector == null) {
                    Intrinsics.j("gestureDetector");
                    throw null;
                }
                if (gestureDetector.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
                    view.performClick();
                    eVar.n(null);
                }
                return true;
            default:
                b bVar = (b) obj;
                boolean onTouchEvent = view.onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 1) {
                    com.yandex.plus.pay.log.impl.b bVar2 = bVar.b;
                    String str = bVar.a;
                    a aVar = a.c;
                    bVar2.getClass();
                    bVar2.c(aVar, str, "User clicked on ".concat(b.a(bVar, view)));
                }
                return onTouchEvent;
        }
    }
}
