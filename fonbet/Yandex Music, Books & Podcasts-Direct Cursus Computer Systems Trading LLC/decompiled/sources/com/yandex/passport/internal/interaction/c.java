package com.yandex.passport.internal.interaction;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.Log;
import android.view.TouchDelegate;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.passport.common.network.n;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.analytics.r;
import com.yandex.passport.internal.helper.g;
import com.yandex.passport.internal.push.NotificationDismissedReceiver;
import com.yandex.passport.internal.report.reporters.w0;
import com.yandex.passport.internal.sso.announcing.SsoAnnouncingReceiver;
import com.yandex.passport.internal.ui.domik.a0;
import com.yandex.passport.internal.ui.domik.common.i;
import com.yandex.passport.internal.ui.social.gimap.f;
import com.yandex.passport.internal.ui.social.gimap.k;
import com.yandex.passport.internal.ui.social.gimap.p;
import com.yandex.passport.internal.ui.social.gimap.t;
import com.yandex.passport.internal.ui.util.q;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.debug.panel.internal.presentation.view.o;
import defpackage.c7g;
import defpackage.g4i;
import defpackage.v75;
import defpackage.x7j;
import defpackage.xy0;
import io.appmetrica.analytics.billing.impl.j;
import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0201dd;
import io.appmetrica.analytics.impl.Z;
import io.appmetrica.analytics.locationinternal.impl.C0856c;
import io.appmetrica.analytics.locationinternal.impl.C0898o0;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleRemoteConfig;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        f fVar;
        String str;
        t a;
        String stringExtra;
        com.yandex.passport.common.core.f fVar2;
        String str2;
        RecyclerView logsRecyclerView;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                p pVar = (p) this.c;
                q qVar = dVar.b;
                n nVar = dVar.d;
                try {
                    try {
                        String str3 = pVar.a;
                        if (str3 != null) {
                            i = 0;
                            try {
                                str = str3.substring(StringsKt.T(str3, "@", 0, false, 6) + 1);
                            } catch (com.yandex.passport.internal.ui.social.gimap.c e) {
                                e = e;
                                t tVar = e.b;
                                if (tVar != null) {
                                    String str4 = pVar.a;
                                    str4.getClass();
                                    ((com.yandex.passport.internal.ui.social.gimap.q) nVar.b).L(str4, tVar);
                                    return;
                                }
                                n nVar2 = e.a;
                                if (nVar2 != null) {
                                    com.yandex.passport.internal.ui.social.gimap.q qVar2 = (com.yandex.passport.internal.ui.social.gimap.q) nVar.b;
                                    synchronized (qVar2) {
                                        p pVar2 = qVar2.u;
                                        pVar2.getClass();
                                        qVar2.u = p.a(pVar2, null, null, pVar2.c.a((com.yandex.passport.internal.ui.social.gimap.b) nVar2.b), pVar2.d.a((com.yandex.passport.internal.ui.social.gimap.b) nVar2.c), 19);
                                    }
                                }
                                String message = e.getMessage();
                                f[] values = f.values();
                                int length = values.length;
                                while (true) {
                                    if (i < length) {
                                        fVar = values[i];
                                        if (!fVar.a.equals(message)) {
                                            i++;
                                        }
                                    } else {
                                        fVar = null;
                                    }
                                }
                                if (fVar != f.c) {
                                    if (fVar != null) {
                                        ((com.yandex.passport.internal.ui.social.gimap.a) nVar.c).M(fVar);
                                    } else {
                                        ((com.yandex.passport.internal.ui.social.gimap.a) nVar.c).r.g(e);
                                    }
                                }
                                qVar.m(new com.yandex.passport.internal.ui.f(e.getMessage(), e));
                                dVar.c.m(Boolean.FALSE);
                                return;
                            }
                        } else {
                            str = "";
                        }
                        a = t.a(str);
                    } catch (com.yandex.passport.internal.ui.social.gimap.c e2) {
                        e = e2;
                        i = 0;
                    }
                } catch (IOException e3) {
                    ((com.yandex.passport.internal.ui.social.gimap.a) nVar.c).r.g(e3);
                    qVar.m(new com.yandex.passport.internal.ui.f("network error", e3));
                } catch (Throwable th) {
                    ((com.yandex.passport.internal.ui.social.gimap.a) nVar.c).r.g(th);
                    qVar.m(new com.yandex.passport.internal.ui.f(f.d.a, th));
                }
                if (a == null) {
                    nVar.H(((com.yandex.passport.internal.ui.social.gimap.a) nVar.c).L(pVar), pVar);
                    dVar.c.m(Boolean.FALSE);
                    return;
                } else {
                    String str5 = pVar.a;
                    str5.getClass();
                    ((com.yandex.passport.internal.ui.social.gimap.q) nVar.b).L(str5, a);
                    return;
                }
            case 1:
                e eVar = (e) this.b;
                a0 a0Var = (a0) this.c;
                try {
                    g gVar = eVar.d;
                    com.yandex.passport.common.core.b f = a0Var.f();
                    String g = a0Var.g();
                    String d = a0Var.d();
                    if (d == null) {
                        throw new IllegalStateException("required phoneNumber is missing");
                    }
                    eVar.f.invoke(a0Var, gVar.c(f, g, d));
                    return;
                } catch (Throwable th2) {
                    eVar.b.m(eVar.e.a(th2));
                    eVar.c.m(Boolean.FALSE);
                    return;
                }
            case 2:
                Intent intent = (Intent) this.b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.c;
                int i2 = NotificationDismissedReceiver.a;
                try {
                    stringExtra = intent.getStringExtra("notification_message");
                    Parcelable parcelableExtra = intent.getParcelableExtra("uid");
                    parcelableExtra.getClass();
                    Bundle bundle = (Bundle) parcelableExtra;
                    bundle.setClassLoader(com.yandex.passport.internal.util.p.class.getClassLoader());
                    fVar2 = (com.yandex.passport.common.core.f) bundle.getParcelable("passport-uid");
                } catch (Throwable unused) {
                }
                if (fVar2 == null) {
                    throw new ParcelFormatException("Invalid parcelable " + com.yandex.passport.common.core.f.class.getSimpleName() + " in the bundle");
                }
                String stringExtra2 = intent.getStringExtra(CommonUrlParts.APP_ID);
                String stringExtra3 = intent.getStringExtra("device_id");
                String stringExtra4 = intent.getStringExtra("push_id");
                String stringExtra5 = intent.getStringExtra("track_id");
                String stringExtra6 = intent.getStringExtra("push_platform");
                w0 pushReporter = com.yandex.passport.internal.di.a.a().getPushReporter();
                stringExtra3.getClass();
                stringExtra2.getClass();
                pushReporter.w(fVar2, stringExtra3, stringExtra2, stringExtra, stringExtra4, stringExtra5, stringExtra6);
                pendingResult.finish();
                return;
            case 3:
                com.yandex.passport.internal.sso.announcing.e eVar2 = (com.yandex.passport.internal.sso.announcing.e) this.b;
                o0 o0Var = eVar2.d;
                com.yandex.passport.internal.sso.announcing.d dVar2 = (com.yandex.passport.internal.sso.announcing.d) this.c;
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    String uuid = UUID.randomUUID().toString();
                    uuid.getClass();
                    ArrayList a2 = ((com.yandex.passport.internal.sso.announcing.c) eVar2.f.get()).a();
                    ArrayList arrayList = new ArrayList(v75.o(a2, 10));
                    Iterator it = a2.iterator();
                    while (it.hasNext()) {
                        com.yandex.passport.common.core.f fVar3 = ((com.yandex.passport.internal.sso.c) it.next()).a.a;
                        fVar3.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append(fVar3.a.a);
                        sb.append(':');
                        sb.append(fVar3.b);
                        arrayList.add(sb.toString());
                        dVar2 = dVar2;
                    }
                    com.yandex.passport.internal.sso.announcing.d dVar3 = dVar2;
                    ArrayList arrayList2 = new ArrayList(v75.o(a2, 10));
                    Iterator it2 = a2.iterator();
                    while (it2.hasNext()) {
                        com.yandex.passport.internal.sso.a aVar = ((com.yandex.passport.internal.sso.c) it2.next()).a.c;
                        aVar.getClass();
                        int ordinal = aVar.ordinal();
                        if (ordinal == 0) {
                            str2 = "add";
                        } else {
                            if (ordinal != 1) {
                                throw new x7j();
                            }
                            str2 = "delete";
                        }
                        arrayList2.add(str2);
                    }
                    o0Var.j(uuid, a2.size(), arrayList, arrayList2);
                    eVar2.c(dVar3, a2);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    xy0 xy0Var = new xy0(0);
                    xy0Var.put("duration", Long.toString(elapsedRealtime2));
                    xy0Var.put("session_hash", uuid);
                    o0Var.a.b(r.o, xy0Var);
                    return;
                } catch (Exception e4) {
                    o0Var.getClass();
                    xy0 xy0Var2 = new xy0(0);
                    xy0Var2.put("error", Log.getStackTraceString(e4));
                    o0Var.a.b(r.q, xy0Var2);
                    return;
                }
            case 4:
                String str6 = (String) this.b;
                BroadcastReceiver.PendingResult pendingResult2 = (BroadcastReceiver.PendingResult) this.c;
                int i3 = SsoAnnouncingReceiver.a;
                try {
                    com.yandex.passport.internal.di.a.a().getSsoAccountsSyncHelper().b(str6, com.yandex.passport.internal.sso.announcing.b.a);
                } catch (Throwable unused2) {
                }
                pendingResult2.finish();
                return;
            case 5:
                ViewGroup viewGroup = (ViewGroup) this.b;
                c7g c7gVar = (c7g) this.c;
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                int i4 = rect.top;
                int i5 = (int) (14 * g4i.a.density);
                rect.top = i4 - i5;
                rect.bottom += i5;
                c7gVar.setTouchDelegate(new TouchDelegate(rect, viewGroup));
                return;
            case 6:
                LinearLayout linearLayout = (LinearLayout) this.b;
                com.yandex.passport.internal.ui.common.d dVar4 = (com.yandex.passport.internal.ui.common.d) this.c;
                linearLayout.setVisibility(0);
                com.yandex.plus.pay.ui.core.b.i(dVar4.l.e);
                return;
            case 7:
                i iVar = (i) this.b;
                TextView textView = (TextView) this.c;
                ScrollView scrollView = iVar.n;
                scrollView.getClass();
                scrollView.smoothScrollTo(0, textView.getBottom());
                return;
            case 8:
                k kVar = (k) this.b;
                String str7 = (String) this.c;
                q qVar3 = kVar.k;
                o0 o0Var2 = kVar.r;
                com.yandex.passport.internal.ui.social.gimap.q qVar4 = kVar.q;
                try {
                    t a3 = t.a(str7.substring(StringsKt.T(str7, "@", 0, false, 6) + 1));
                    if (a3 == null) {
                        a3 = kVar.u.d(qVar4.q, str7);
                    }
                    if (a3 != t.OTHER) {
                        qVar4.L(str7, a3);
                    } else {
                        kVar.t.m(com.yandex.passport.internal.ui.social.gimap.i.b);
                    }
                } catch (IOException e5) {
                    o0Var2.g(e5);
                    qVar3.m(new com.yandex.passport.internal.ui.f("network error", e5));
                } catch (Throwable th3) {
                    o0Var2.g(th3);
                    qVar3.m(new com.yandex.passport.internal.ui.f(f.d.a, th3));
                }
                kVar.l.m(Boolean.FALSE);
                return;
            case 9:
                r1.O(((com.yandex.plus.bdui.plus.checkout.webview.contract.b) this.b).a.d, (com.yandex.plus.pay.ui.core.mobile.haptic.a) this.c);
                return;
            case 10:
                o oVar = (o) this.b;
                com.yandex.plus.core.debug.panel.internal.presentation.state.e eVar3 = (com.yandex.plus.core.debug.panel.internal.presentation.state.e) this.c;
                logsRecyclerView = oVar.getLogsRecyclerView();
                logsRecyclerView.z0(eVar3.b);
                return;
            case 11:
                C0201dd.a((C0201dd) this.b, (Z) this.c);
                return;
            case 12:
                j.a((j) this.b, (ProductInfo) this.c);
                return;
            case 13:
                io.appmetrica.analytics.idsync.impl.n.a((io.appmetrica.analytics.idsync.impl.n) this.b, (RequestConfig) this.c);
                return;
            case 14:
                C0898o0.a((C0898o0) this.b, (C0856c) this.c);
                return;
            default:
                C0898o0.a((C0898o0) this.b, (ModuleRemoteConfig) this.c);
                return;
        }
    }
}
