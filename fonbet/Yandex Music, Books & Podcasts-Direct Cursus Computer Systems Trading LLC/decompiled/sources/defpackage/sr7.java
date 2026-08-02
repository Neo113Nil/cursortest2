package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.g;
import androidx.fragment.app.y;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.common.utils.Logger;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.impl.J1;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.quasar.glagol.impl.DevicesListTask;
import timber.log.Timber;

/* loaded from: classes.dex */
public final /* synthetic */ class sr7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sr7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a() {
        bqc bqcVar = (bqc) this.b;
        synchronized (bqcVar.d) {
            try {
                if (bqcVar.h == null) {
                    return;
                }
                try {
                    vqc c = bqcVar.c();
                    int i = c.e;
                    if (i == 2) {
                        synchronized (bqcVar.d) {
                        }
                    }
                    if (i != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                    }
                    try {
                        Method method = bqs.b;
                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                        e88 e88Var = bqcVar.c;
                        Context context = bqcVar.a;
                        e88Var.getClass();
                        vqc[] vqcVarArr = {c};
                        hdg hdgVar = cdt.a;
                        Trace.beginSection(y7g.X("TypefaceCompat.createFromFontInfo"));
                        try {
                            Typeface P = cdt.a.P(context, vqcVarArr, 0);
                            Trace.endSection();
                            MappedByteBuffer y = ldg.y(bqcVar.a, c.a);
                            if (y == null || P == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            try {
                                Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                xdh xdhVar = new xdh(P, t7g.D(y));
                                Trace.endSection();
                                synchronized (bqcVar.d) {
                                    try {
                                        men menVar = bqcVar.h;
                                        if (menVar != null) {
                                            menVar.D(xdhVar);
                                        }
                                    } finally {
                                    }
                                }
                                bqcVar.b();
                            } finally {
                                Method method2 = bqs.b;
                            }
                        } finally {
                            Trace.endSection();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } catch (Throwable th2) {
                    synchronized (bqcVar.d) {
                        try {
                            men menVar2 = bqcVar.h;
                            if (menVar2 != null) {
                                menVar2.C(th2);
                            }
                            bqcVar.b();
                        } finally {
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v67, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.a) {
            case 0:
                vuc.a((ArrayList) this.b, 4);
                return;
            case 1:
                g gVar = (g) this.b;
                if (y.M(2)) {
                    Log.v("FragmentManager", "Transition for all operations has completed");
                }
                Iterator it = gVar.c.iterator();
                while (it.hasNext()) {
                    ((ur7) it.next()).a.c(gVar);
                }
                return;
            case 2:
                ms7 ms7Var = (ms7) this.b;
                int i2 = ms7.J;
                ms7Var.d();
                return;
            case 3:
                ns7 ns7Var = (ns7) this.b;
                int i3 = ns7.y0;
                ns7Var.d(false);
                return;
            case 4:
                DevicesListTask.start$lambda$1((DevicesListTask) this.b);
                return;
            case 5:
                gc8 gc8Var = (gc8) this.b;
                int i4 = gc8.D0;
                synchronized (d51.l) {
                }
                if (!qht.a.a()) {
                    dq7 dq7Var = ca8.a;
                    x97.D(j5h.a, new seg((Continuation) null, gc8Var, gc8Var, 23));
                    return;
                }
                int i5 = 0;
                while (i5 < gc8Var.getChildCount()) {
                    int i6 = i5 + 1;
                    View childAt = gc8Var.getChildAt(i5);
                    if (childAt == null) {
                        rj7.m();
                        return;
                    } else {
                        yd5.R(gc8Var.getReleaseViewVisitor$div_release(), childAt);
                        i5 = i6;
                    }
                }
                gc8Var.removeAllViews();
                return;
            case 6:
                pv8.setState$lambda$1$lambda$0((xhk) this.b);
                return;
            case 7:
                lw9 lw9Var = (lw9) this.b;
                if (lw9Var.d) {
                    lw9Var.a(lw9Var.a, true);
                }
                lw9Var.d = false;
                return;
            case 8:
                w1a w1aVar = (w1a) this.b;
                Iterator it2 = w1aVar.b.b.iterator();
                if (it2.hasNext()) {
                    throw hrg.j(it2);
                }
                w1aVar.l = false;
                return;
            case 9:
                wra wraVar = (wra) this.b;
                boolean isPopupShowing = wraVar.h.isPopupShowing();
                wraVar.s(isPopupShowing);
                wraVar.m = isPopupShowing;
                return;
            case 10:
                ((FileChannel) this.b).close();
                return;
            case 11:
                aqb aqbVar = (aqb) this.b;
                if (aqbVar.i().e()) {
                    ckj ckjVar = aqbVar.e;
                    ckjVar.getClass();
                    akj akjVar = new akj(ckjVar);
                    while (akjVar.hasNext()) {
                        ((re9) akjVar.next()).b(aqbVar.i().J0());
                    }
                    aqbVar.f.postDelayed(new sr7(11, aqbVar), 1000L);
                    return;
                }
                return;
            case 12:
                xrb xrbVar = (xrb) this.b;
                sj sjVar = xrbVar.E;
                Context context = xrbVar.e;
                int i7 = dvt.a;
                Integer valueOf = Integer.valueOf(fx1.f(context).generateAudioSessionId());
                sjVar.f = valueOf;
                ((hzr) sjVar.c).e(new wj2(sjVar, valueOf, i));
                return;
            case 13:
                pgl pglVar = (pgl) this.b;
                try {
                    synchronized (pglVar) {
                    }
                    try {
                        pglVar.a.a(pglVar.c, pglVar.d);
                        pglVar.a(true);
                        return;
                    } catch (Throwable th) {
                        pglVar.a(true);
                        throw th;
                    }
                } catch (pqb e) {
                    vq1.L("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    b6e.q(e);
                    return;
                }
            case 14:
                uf2.a((Intent) this.b);
                return;
            case 15:
                a();
                return;
            case 16:
                qrc qrcVar = (qrc) this.b;
                boolean z = qrcVar.e;
                if (z) {
                    return;
                }
                if (z) {
                    qrcVar.e = false;
                    Timber.d("stopping tasks", new Object[0]);
                    ScheduledFuture scheduledFuture = qrcVar.i;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    qrcVar.c = qrcVar.b;
                }
                qrcVar.e = true;
                Timber.d("starting tasks", new Object[0]);
                q9 q9Var = new q9(27, qrcVar);
                if (qrcVar.d > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - qrcVar.d;
                    Timber.d("time spent in background, sec: %d", Long.valueOf(elapsedRealtime / 1000));
                    qrcVar.c -= elapsedRealtime;
                    if (qrcVar.c < 0) {
                        qrcVar.c = 0L;
                    }
                    qrcVar.d = 0L;
                }
                qrcVar.i = qrcVar.g.scheduleAtFixedRate(q9Var, qrcVar.c, qrcVar.b, TimeUnit.MILLISECONDS);
                return;
            case 17:
                Iterator it3 = ((y) this.b).o.iterator();
                while (it3.hasNext()) {
                    ((ytc) it3.next()).onBackStackChangeCancelled();
                }
                return;
            case 18:
                ((ril) this.b).invoke();
                return;
            case 19:
                ((yld) this.b).k();
                return;
            case 20:
                ((y6g) this.b).invoke();
                return;
            case 21:
                ((n7b) this.b).k();
                return;
            case 22:
                s2e s2eVar = (s2e) this.b;
                s2eVar.p.setState(3);
                xdr xdrVar = s2eVar.q;
                xdrVar.getClass();
                xdrVar.m(null, 3);
                return;
            case 23:
                J1.a((Object[]) this.b);
                return;
            case 24:
                ((J1) this.b).e();
                return;
            case 25:
                final p8f p8fVar = (p8f) this.b;
                q13 q13Var = p8fVar.i;
                Context context2 = p8fVar.c;
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context2, 1, false);
                p8fVar.a().setLayoutManager(linearLayoutManager);
                RecyclerView a = p8fVar.a();
                r8f r8fVar = p8fVar.p;
                a.setAdapter(r8fVar);
                p8fVar.a().s(new i8f(context2.getResources().getDimension(R.dimen.unit_and_half_margin), context2.getResources().getDimension(R.dimen.juicy_bottom_sheet_list_item_small_padding), context2.getResources().getDimension(R.dimen.juicy_bottom_sheet_list_item_large_padding), context2.getResources().getDimension(R.dimen.juicy_bottom_sheet_list_item_corner_radius), context2.getResources().getDimension(R.dimen.juicy_bottom_sheet_vibe_button_top_padding), context2.getResources().getDimension(R.dimen.juicy_bottom_sheet_vibe_button_bottom_padding), context2.getResources().getDimension(R.dimen.juicy_bottom_sheet_disclaimers_to_actions), context2.getResources().getDimension(R.dimen.juicy_bottom_sheet_disclaimers_to_vibe_or_desc), weo.M(context2, R.attr.bgPlaceholder)));
                RecyclerView a2 = p8fVar.a();
                r8fVar.getClass();
                a2.getClass();
                q8f q8fVar = new q8f(a2);
                View view = q8fVar.a;
                jvd jvdVar = p8fVar.d;
                if (jvdVar == null) {
                    Intrinsics.j("headerData");
                    throw null;
                }
                q8fVar.e(jvdVar);
                view.measure(0, 0);
                final int measuredHeight = view.getMeasuredHeight() - context2.getResources().getDimensionPixelSize(R.dimen.juicy_item_catalog_header_height);
                p8fVar.a().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: n8f
                    @Override // android.view.View.OnScrollChangeListener
                    public final void onScrollChange(View view2, int i8, int i9, int i10, int i11) {
                        if (i11 < 0) {
                            p8f.this.r.b = measuredHeight;
                        }
                    }
                });
                p8fVar.a().s(p8fVar.r);
                RecyclerView a3 = p8fVar.a();
                s9f[] s9fVarArr = p8f.s;
                a3.t(new kvd((ViewGroup) q13Var.a(s9fVarArr[0])));
                p8fVar.a().t(new cwd(linearLayoutManager, (ViewGroup) q13Var.a(s9fVarArr[0])));
                return;
            case 26:
                r2f r2fVar = (r2f) this.b;
                if (r2fVar != null) {
                    r2fVar.g(null);
                    return;
                }
                return;
            case 27:
                ((bhg) this.b).a.invoke();
                return;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                Logger.lambda$out$2((String) this.b);
                return;
            default:
                rvt.b((InputStream) this.b);
                return;
        }
    }

    public /* synthetic */ sr7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj2;
    }
}
