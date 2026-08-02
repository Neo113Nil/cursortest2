package defpackage;

import android.app.Activity;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.camera.video.internal.encoder.j;
import androidx.camera.video.k;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.fragment.app.Fragment;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason;
import com.google.android.datatransport.runtime.scheduling.persistence.b;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.common.collect.ImmutableList;
import com.google.firebase.a;
import com.google.firebase.messaging.FirebaseMessaging;
import com.yandex.go.taxi.order.ReorderDialog;
import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.mapkit.map.Callback;
import com.yandex.messaging.core.net.entities.GetMediaMessagesParams;
import com.yandex.messaging.internal.view.stickers.bottomsheet.StickerPanelBottomSheet;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import com.ybsdk.feature.card.internal.presentation.singlecard.SingleCardFragment;
import defpackage.k9b;
import defpackage.sgb1;
import defpackage.t601;
import defpackage.vg10;
import defpackage.znw0;
import io.appmetrica.analytics.blecollecting.internal.BleScanReceiver;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.checkin.CheckInStateActionType;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.net.taxi.dto.objects.Dialog;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.video.m3.player.PlayerDelegate;
import ru.yandex.video.m3.player.PlayerDelegateFactory;
import ru.yandex.video.m3.player.feature.FeatureConfigurator;
import ru.yandex.video.m3.player.parameters.PlayerDelegateParameters;
import ru.yandex.video.m3.player.provider.Supplier;
import ru.yandex.video.m3.preload_manager.TrackDownload;
import yads.qd1;

/* loaded from: classes15.dex */
public final /* synthetic */ class t26 implements FunctionWithThrowable, gn6, kds, at21, iy60, v0x0, smh, el7, h3v0, pdj, wx60, bx60, dly, c9e, dx4, rdj, Callback, rxe0, sll0, sbu0, eps0, t7m, ax60, Supplier, fj81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;

    public /* synthetic */ t26(StickerPanelBottomSheet stickerPanelBottomSheet, Context context, String str) {
        this.a = 21;
        this.b = stickerPanelBottomSheet;
        this.w = context;
        this.c = str;
    }

    @Override // defpackage.rxe0
    public void a(znw0 znw0Var) {
        oy80 oy80Var = (oy80) this.b;
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) this.c;
        v3x0 v3x0Var = (v3x0) this.w;
        oy80Var.getClass();
        textureRegistry$SurfaceProducer.setCallback(new aye0(0, znw0Var));
        textureRegistry$SurfaceProducer.setSize(znw0Var.b.getWidth(), znw0Var.b.getHeight());
        Surface forcedNewSurface = textureRegistry$SurfaceProducer.getForcedNewSurface();
        znw0Var.b(forcedNewSurface, Executors.newSingleThreadExecutor(), new avm(oy80Var, forcedNewSurface, v3x0Var));
    }

    @Override // defpackage.c9e
    public void accept(Object obj) {
        xf10 xf10Var = (xf10) this.b;
        ((yf10) obj).onUpstreamDiscarded(xf10Var.a, (sf10) this.c, (he10) this.w);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    /* renamed from: apply */
    public Object mo489apply(Object obj) {
        Integer a;
        int i = this.a;
        Object obj2 = this.w;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                a = BleScanReceiver.a((BleScanReceiver) obj4, (Intent) obj3, (Context) obj2, (JobScheduler) obj);
                return a;
            default:
                b bVar = (b) obj4;
                HashMap hashMap = (HashMap) obj3;
                an8 an8Var = (an8) obj2;
                ArrayList arrayList = (ArrayList) an8Var.w;
                Cursor cursor = (Cursor) obj;
                bVar.getClass();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    int i2 = cursor.getInt(1);
                    LogEventDropped$Reason logEventDropped$Reason = LogEventDropped$Reason.REASON_UNKNOWN;
                    if (i2 != logEventDropped$Reason.getNumber()) {
                        LogEventDropped$Reason logEventDropped$Reason2 = LogEventDropped$Reason.MESSAGE_TOO_OLD;
                        if (i2 != logEventDropped$Reason2.getNumber()) {
                            logEventDropped$Reason2 = LogEventDropped$Reason.CACHE_FULL;
                            if (i2 != logEventDropped$Reason2.getNumber()) {
                                logEventDropped$Reason2 = LogEventDropped$Reason.PAYLOAD_TOO_BIG;
                                if (i2 != logEventDropped$Reason2.getNumber()) {
                                    logEventDropped$Reason2 = LogEventDropped$Reason.MAX_RETRIES_REACHED;
                                    if (i2 != logEventDropped$Reason2.getNumber()) {
                                        logEventDropped$Reason2 = LogEventDropped$Reason.INVALID_PAYLOD;
                                        if (i2 != logEventDropped$Reason2.getNumber()) {
                                            logEventDropped$Reason2 = LogEventDropped$Reason.SERVER_ERROR;
                                            if (i2 != logEventDropped$Reason2.getNumber()) {
                                                rzo.o("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i2));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        logEventDropped$Reason = logEventDropped$Reason2;
                    }
                    long j = cursor.getLong(2);
                    if (!hashMap.containsKey(string)) {
                        hashMap.put(string, new ArrayList());
                    }
                    ((List) hashMap.get(string)).add(new hez(j, logEventDropped$Reason));
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    int i3 = tfz.c;
                    new ArrayList();
                    arrayList.add(new tfz((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
                }
                final long time = bVar.b.getTime();
                an8Var.c = (o8z0) bVar.d(new sll0() { // from class: rll0
                    @Override // defpackage.sll0
                    public final Object apply(Object obj5) {
                        long j2 = time;
                        Cursor rawQuery = ((SQLiteDatabase) obj5).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
                        try {
                            Cursor cursor2 = rawQuery;
                            cursor2.moveToNext();
                            return new o8z0(cursor2.getLong(0), j2);
                        } finally {
                            rawQuery.close();
                        }
                    }
                });
                an8Var.x = new bjt(new dju0(bVar.a().compileStatement("PRAGMA page_size").simpleQueryForLong() * bVar.a().compileStatement("PRAGMA page_count").simpleQueryForLong(), j64.f.a));
                an8Var.b = (String) bVar.x.get();
                return new w2c((o8z0) an8Var.c, Collections.unmodifiableList(arrayList), (bjt) an8Var.x, (String) an8Var.b);
        }
    }

    @Override // defpackage.t7m
    public void b(long j, float f, long j2) {
        TrackDownload.doWork$lambda$0((Ref$LongRef) this.b, (TrackDownload) this.c, (Ref$BooleanRef) this.w, j, j2, f);
    }

    @Override // defpackage.gn6
    public NinePatchDrawable c(Drawable drawable) {
        fn6 fn6Var = (fn6) this.b;
        wa60 wa60Var = (wa60) this.c;
        wa60[] wa60VarArr = (wa60[]) this.w;
        return sb2.l((Canvas) fn6Var.a, ((View) fn6Var.d).getContext(), drawable, wa60Var, (wa60[]) Arrays.copyOf(wa60VarArr, wa60VarArr.length));
    }

    @Override // defpackage.smh
    public List d(int i, xzz0 xzz0Var, int[] iArr) {
        omh omhVar = (omh) this.b;
        String str = (String) this.c;
        String str2 = (String) this.w;
        piv pivVar = ImmutableList.b;
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i2 = 0; i2 < xzz0Var.a; i2++) {
            aVar.a(new rmh(i, xzz0Var, i2, omhVar, iArr[i2], str, str2));
        }
        return aVar.g();
    }

    @Override // defpackage.at21
    /* renamed from: e */
    public x08 mo25e(cl21 cl21Var) {
        GetMediaMessagesParams getMediaMessagesParams = (GetMediaMessagesParams) this.b;
        tls tlsVar = (tls) this.c;
        tls tlsVar2 = (tls) this.w;
        to3 a = ((d9g) cl21Var).a();
        return a.a.a(new io3(11, a, getMediaMessagesParams, new m7b(tlsVar, tlsVar2)));
    }

    @Override // defpackage.v0x0
    public Object execute() {
        tjh tjhVar = (tjh) this.b;
        v111 v111Var = (v111) this.c;
        rfo rfoVar = (rfo) this.w;
        b bVar = (b) tjhVar.d;
        bVar.getClass();
        Priority d = v111Var.d();
        rfoVar.k();
        if (Log.isLoggable("TRuntime.".concat("SQLiteEventStore"), 3)) {
            new StringBuilder("Storing event with priority=").append(d);
        }
        long longValue = ((Long) bVar.d(new i3f(8, bVar, rfoVar, v111Var))).longValue();
        if (longValue >= 1) {
            new s74(longValue, v111Var, rfoVar);
        }
        tjhVar.a.o(v111Var, 1, false);
        return null;
    }

    @Override // defpackage.pdj
    public qdj f(tdj tdjVar, Activity activity, zch zchVar) {
        pit pitVar = (pit) this.b;
        pzi0 pzi0Var = (pzi0) this.c;
        o2y0 o2y0Var = (o2y0) this.w;
        to31 to31Var = pitVar.a.w;
        to31Var.getClass();
        to31Var.a.a("view.reorder", new HashMap(), 1, new HashMap());
        ReorderDialog reorderDialog = new ReorderDialog(activity, pitVar.e, pzi0Var, new oit(pitVar, o2y0Var));
        reorderDialog.setTitle(tdjVar.b);
        reorderDialog.setMessage(tdjVar.c);
        return zchVar.I(tdjVar, reorderDialog);
    }

    @Override // defpackage.h3v0
    public Task g(Object obj) {
        String str;
        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.b;
        String str2 = (String) this.c;
        ndi0 ndi0Var = (ndi0) this.w;
        String str3 = (String) obj;
        o370 c = FirebaseMessaging.c(firebaseMessaging.b);
        a aVar = firebaseMessaging.a;
        aVar.a();
        String f = "[DEFAULT]".equals(aVar.b) ? "" : aVar.f();
        String a = firebaseMessaging.h.a();
        synchronized (c) {
            long currentTimeMillis = System.currentTimeMillis();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AuthSdkActivity.RESPONSE_TYPE_TOKEN, str3);
                jSONObject.put("appVersion", a);
                jSONObject.put(ClidProvider.TIMESTAMP, currentTimeMillis);
                str = jSONObject.toString();
            } catch (JSONException e) {
                e.toString();
                str = null;
            }
            if (str != null) {
                SharedPreferences.Editor edit = ((SharedPreferences) c.a).edit();
                edit.putString(f + "|T|" + str2 + "|*", str);
                edit.commit();
            }
        }
        if (ndi0Var == null || !str3.equals((String) ndi0Var.b)) {
            a aVar2 = firebaseMessaging.a;
            aVar2.a();
            if ("[DEFAULT]".equals(aVar2.b)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    aVar2.a();
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra(AuthSdkActivity.RESPONSE_TYPE_TOKEN, str3);
                new com.google.firebase.messaging.a(firebaseMessaging.b).b(intent);
            }
        }
        return udq0.p(str3);
    }

    @Override // ru.yandex.video.m3.player.provider.Supplier
    /* renamed from: get */
    public Object getValue() {
        PlayerDelegate create;
        create = ((PlayerDelegateFactory) this.b).create((PlayerDelegateParameters) this.c, (FeatureConfigurator) this.w);
        return create;
    }

    @Override // defpackage.sbu0
    public void i(String str, String str2) {
        ((StickerPanelBottomSheet) this.b).lambda$new$0((Context) this.w, (String) this.c, str, str2);
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.camera.video.j, java.lang.Object] */
    @Override // defpackage.el7
    public Object j(final androidx.concurrent.futures.b bVar) {
        Surface surface;
        int i = 27;
        switch (this.a) {
            case 7:
                gl7 gl7Var = (gl7) this.b;
                Executor executor = (Executor) this.c;
                Collection collection = (Collection) this.w;
                bVar.a(new oxe(i, gl7Var), executor);
                ni91.a(gl7Var, new qnh(bVar), executor);
                return "surfaceList[" + collection + "]";
            default:
                final k kVar = (k) this.b;
                final znw0 znw0Var = (znw0) this.c;
                d94 d94Var = (d94) this.w;
                try {
                    d7g0 d7g0Var = kVar.c;
                    Executor executor2 = kVar.a;
                    int i2 = znw0Var.g;
                    d7g0Var.getClass();
                    j jVar = new j(executor2, d94Var, i2);
                    kVar.d = jVar;
                    syn synVar = jVar.g;
                    if (synVar instanceof hzn) {
                        hzn hznVar = (hzn) synVar;
                        Executor executor3 = kVar.b;
                        ?? r4 = new tyn() { // from class: androidx.camera.video.j
                            @Override // defpackage.tyn
                            public final void a(Surface surface2) {
                                androidx.camera.core.impl.utils.executor.b bVar2;
                                k kVar2 = k.this;
                                int ordinal = kVar2.i.ordinal();
                                androidx.concurrent.futures.b bVar3 = bVar;
                                if (ordinal != 0) {
                                    if (ordinal == 1) {
                                        znw0 znw0Var2 = znw0Var;
                                        if (znw0Var2.a()) {
                                            Objects.toString(znw0Var2, "EMPTY");
                                            sgb1.g(3, "VideoEncoderSession");
                                            bVar3.b(null);
                                            kVar2.a();
                                            return;
                                        }
                                        kVar2.e = surface2;
                                        Objects.toString(surface2);
                                        sgb1.g(3, "VideoEncoderSession");
                                        znw0Var2.b(surface2, kVar2.b, new k9b(18, kVar2));
                                        kVar2.i = VideoEncoderSession$VideoEncoderState.READY;
                                        bVar3.b(kVar2.d);
                                        return;
                                    }
                                    if (ordinal != 2) {
                                        if (ordinal == 3) {
                                            if (kVar2.h != null && (bVar2 = kVar2.g) != null) {
                                                bVar2.execute(new t601(25, kVar2, surface2));
                                            }
                                            Objects.toString(surface2);
                                            sgb1.g(5, "VideoEncoderSession");
                                            return;
                                        }
                                        if (ordinal != 4) {
                                            vg10.s("State ", kVar2.i, " is not handled");
                                            return;
                                        }
                                    }
                                }
                                Objects.toString(kVar2.i);
                                sgb1.g(3, "VideoEncoderSession");
                                bVar3.b(null);
                            }
                        };
                        synchronized (hznVar.a) {
                            hznVar.d = r4;
                            executor3.getClass();
                            hznVar.e = executor3;
                            surface = hznVar.b;
                        }
                        if (surface != null) {
                            try {
                                executor3.execute(new wqj(i, r4, surface));
                            } catch (RejectedExecutionException e) {
                                sgb1.e(hznVar.f.a, "Unable to post to the supplied executor.", e);
                            }
                        }
                    } else {
                        bVar.d(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
                    }
                } catch (InvalidConfigException e2) {
                    sgb1.e("VideoEncoderSession", "Unable to initialize video encoder.", e2);
                    bVar.d(e2);
                }
                return "ConfigureVideoEncoderFuture " + kVar;
        }
    }

    @Override // defpackage.rdj
    public void k(AlertDialog alertDialog) {
        Dialog dialog = (Dialog) this.b;
        rp70 rp70Var = (rp70) this.c;
        o2y0 o2y0Var = (o2y0) this.w;
        Dialog.a a = dialog.a(Dialog.Action.BACK_TO_DRIVING_SCREEN);
        alertDialog.setMainActionButton(rp70Var.a(a), new d82(1), (String) null).setDismissListener(new ud30(4, rp70Var, o2y0Var, a != null ? a.a : null));
    }

    @Override // defpackage.ax60
    public void m(View view, n751 n751Var, bv31 bv31Var) {
        Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.b;
        ax60 ax60Var = (ax60) this.c;
        View view2 = (View) this.w;
        ref$BooleanRef.element = true;
        n751Var.a.g(519);
        ax60Var.m(view2, n751Var, bv31Var);
    }

    @Override // defpackage.dly
    public boolean n(ClickableSpan clickableSpan) {
        dc dcVar = (dc) this.b;
        TextView textView = (TextView) this.c;
        ely elyVar = (ely) this.w;
        dcVar.run();
        if (textView.getContext() == null || !(clickableSpan instanceof URLSpan)) {
            return false;
        }
        String url = ((URLSpan) clickableSpan).getURL();
        CoreWebViewConfig.a aVar = new CoreWebViewConfig.a();
        aVar.b = url;
        UiWebViewConfig uiWebViewConfig = new UiWebViewConfig(aVar.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
        uiWebViewConfig.setHasTitleFromWeb(true);
        uiWebViewConfig.setShouldShowCloseButton(true);
        ((pep0) elyVar.b).f(elyVar.a.a().b(), new dg41(uiWebViewConfig, null, null, null, null, null, null, 254), hxx.a);
        return true;
    }

    @Override // defpackage.dx4
    public void o(ru.yandex.taxi.search.view.a aVar, pv0 pv0Var) {
        zzs B;
        zzs zzsVar = (zzs) this.b;
        gw70 gw70Var = (gw70) this.c;
        zzs zzsVar2 = (zzs) this.w;
        aVar.h(null);
        OrderFragment.showDestinationPicker$lambda$0((OrderFragment) gw70Var.b, (o2y0) gw70Var.c, (RouteChangeType) gw70Var.w, gw70Var.a, (Consumer) gw70Var.x, zzsVar2, (pv0Var == null || (B = pv0Var.a.B()) == null) ? zzsVar : B);
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        int i;
        int i2 = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i2) {
            case 12:
                ((alb0) obj3).invoke(view, n751Var, (u1w) obj2, (u1w) obj);
                return n751Var;
            default:
                v40 v40Var = (Fragment) obj2;
                View view2 = (View) obj;
                u1w f = p7b1.f(n751Var);
                int i3 = f.d;
                int i4 = ((hs51) obj3).a ? 0 : f.b;
                p5t0 p5t0Var = v40Var instanceof p5t0 ? (p5t0) v40Var : null;
                if (!(p5t0Var != null ? p5t0Var.getNeedIgnoreKeyboard() : false) && (i = p7b1.e(n751Var).d) >= i3) {
                    i3 = i;
                }
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    ny61.t("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return null;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(f.a, i4, f.c, i3);
                view2.setLayoutParams(marginLayoutParams);
                return n751.b;
        }
    }

    @Override // defpackage.wx60
    public void onComplete(Task task) {
        zvs zvsVar = (zvs) this.b;
        com.google.android.play.core.review.a aVar = (com.google.android.play.core.review.a) this.c;
        awt awtVar = (awt) this.w;
        if (task.o()) {
            aVar.a(awtVar.a, (ReviewInfo) task.k()).b(new xen(20, zvsVar));
        } else {
            jst.e.h(null, "Request Google Play In app Rate failed", task.j());
            zvsVar.invoke(Boolean.FALSE);
        }
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        CredentialProviderPlayServicesImpl.onClearCredential$lambda$1((CancellationSignal) this.b, (Executor) this.c, (c9f) this.w, exc);
    }

    @Override // com.yandex.mapkit.map.Callback
    public void onTaskFinished() {
        lz2 lz2Var = (lz2) this.b;
        f4c0 f4c0Var = (f4c0) this.c;
        Callback callback = (Callback) this.w;
        pt3 pt3Var = lz2Var.e;
        f4c0Var.C(pt3Var != null ? scc.g(new PointF(pt3Var.b, pt3Var.c), new PointF(pt3Var.d, pt3Var.e)) : Collections.singletonList(new PointF(1.0f, lz2Var.d)));
        if (callback != null) {
            callback.onTaskFinished();
        }
    }

    @Override // defpackage.eps0
    public void p(int i, long j) {
        com.yandex.go.taxi.order.superapp.orders.ui.b bVar = (com.yandex.go.taxi.order.superapp.orders.ui.b) this.b;
        q6y0 q6y0Var = (q6y0) this.c;
        yfb yfbVar = (yfb) this.w;
        bVar.Z.a(q6y0Var, CheckInStateActionType.SLIDER);
        SliderButtonView sliderButtonView = bVar.v0;
        sliderButtonView.showProgressState();
        sliderButtonView.setTitleProgress(yfbVar.f);
        sliderButtonView.setSubtitleProgress(yfbVar.h);
    }

    @Override // defpackage.kds
    public void s(Bundle bundle, String str) {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 2:
                CardDetailsFragment.handle2faResult$lambda$49((CardDetailsFragment) obj3, (tls) obj2, (sls) obj, str, bundle);
                break;
            default:
                SingleCardFragment.handle2faResult$lambda$20((SingleCardFragment) obj3, (tls) obj2, (sls) obj, str, bundle);
                break;
        }
    }

    public /* synthetic */ t26(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // defpackage.fj81
    public void a(Object obj) {
        q881 q881Var = (q881) this.b;
        tje.N(q881Var.e, null, null, new qd1(q881Var, (String) obj, (String) this.c, (tls) this.w, null), 3);
    }
}
