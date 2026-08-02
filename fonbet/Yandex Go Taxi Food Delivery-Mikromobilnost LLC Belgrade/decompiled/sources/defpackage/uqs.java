package defpackage;

import android.app.job.JobParameters;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import androidx.loader.content.ModernAsyncTask$Status;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.billingclient.api.f;
import com.google.android.gms.common.moduleinstall.internal.c;
import com.google.android.gms.iid.zze;
import com.google.android.gms.iid.zzi;
import com.google.android.gms.internal.play_billing.g;
import com.google.android.gms.internal.play_billing.zzco;
import com.yandex.div.core.d;
import com.yandex.go.chargers.design.components.ChargersOrderTabsView;
import com.yandex.go.chargers.multiorder.ui.ChargersMultiOrderModalView;
import com.yandex.go.design.view.GoConstraintLayout;
import com.yandex.go.flex.common.ui.DefaultFlexPopupModalView;
import com.yandex.go.scooters.offers.v2.components.tariffs.ScootersTariffListView;
import com.yandex.go.superapp.print_animation_text.PrintAnimationTextView;
import com.yandex.go.tariffcard.ui.HeaderType;
import com.yandex.go.tariffcard.ui.TariffOptionsCardView;
import com.yandex.go.tariffcard.ui.a;
import com.yandex.go.tariffcard.ui.model.VisibilityChangeOrigin;
import com.ybsdk.feature.savings.internal.screens.account.view.FundIncomeWidgetView;
import com.ybsdk.widgets.common.LoadableInput;
import com.ybsdk.widgets.common.SelectionAwareEditText;
import io.appmetrica.analytics.billingv6.impl.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import kotlin.Pair;
import kotlin.collections.builders.MapBuilder;
import kotlinx.coroutines.flow.r0;
import org.altbeacon.beacon.b;
import org.altbeacon.beacon.service.ScanJob;
import org.altbeacon.beacon.service.ScanState;
import ru.yandex.taxi.coordinator.AnchorBottomSheetBehavior;
import ru.yandex.taxi.design.FloatButtonIconComponent;
import ru.yandex.taxi.preorder.summary.solid.SolidSummaryView;
import ru.yandex.taxi.scooters.presentation.finish_info.ScootersFinishInfoModalView;
import ru.yandex.taxi.ui.DeliveryTooltipPopup;
import ru.yandex.taxi.web.modal.WebContainerModalView;
import ru.yandex.taxi.web.view.WebViewContainerImpl;
import yads.gm1;
import yads.hm2;
import yads.p9;
import yads.q63;
import yads.yl2;

/* loaded from: classes10.dex */
public final class uqs implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public uqs(ChargersOrderTabsView chargersOrderTabsView, ChargersOrderTabsView chargersOrderTabsView2, ChargersMultiOrderModalView chargersMultiOrderModalView) {
        this.a = 2;
        this.b = chargersOrderTabsView2;
        this.c = chargersMultiOrderModalView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View content;
        boolean z;
        boolean initialzeScanHelper;
        boolean z2;
        boolean z3;
        Handler handler;
        ScanState scanState;
        ScanState scanState2;
        ScanState scanState3;
        Handler handler2;
        ScanState scanState4;
        mlm0 mlm0Var;
        mlm0 mlm0Var2;
        s6n0 s6n0Var;
        List visibleTariffs;
        int contentViewHeight;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior;
        int contentViewHeight2;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior2;
        int i;
        AnchorBottomSheetBehavior anchorBottomSheetBehavior3;
        int i2;
        a aVar;
        l8u0 l8u0Var;
        Object value;
        ekj0 ekj0Var;
        LinearLayoutManager linearLayoutManager;
        WebViewContainerImpl webViewContainerImpl;
        View content2;
        WebViewContainerImpl webViewContainerImpl2;
        View a;
        List g;
        i281 a2;
        gm1 j;
        zze zzeVar;
        int i3 = 24;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                iqs iqsVar = (iqs) this.c;
                try {
                    iqsVar.onSuccess(ni91.d((Future) this.b));
                    return;
                } catch (Error | RuntimeException e) {
                    iqsVar.onFailure(e);
                    return;
                } catch (ExecutionException e2) {
                    Throwable cause = e2.getCause();
                    if (cause == null) {
                        iqsVar.onFailure(e2);
                        return;
                    } else {
                        iqsVar.onFailure(cause);
                        return;
                    }
                }
            case 1:
                dp11 dp11Var = (dp11) this.b;
                Typeface typeface = (Typeface) this.c;
                vuj0 vuj0Var = dp11Var.a;
                if (vuj0Var != null) {
                    vuj0Var.c(typeface);
                    return;
                }
                return;
            case 2:
                ChargersOrderTabsView chargersOrderTabsView = (ChargersOrderTabsView) this.b;
                content = ((ChargersMultiOrderModalView) this.c).getContent();
                chargersOrderTabsView.setLayoutParams(new LinearLayout.LayoutParams(content.getWidth() - (tje.u(64, chargersOrderTabsView.getContext()) * 2), tje.u(48, chargersOrderTabsView.getContext())));
                xw31.F(chargersOrderTabsView, 0, 0, 0, Integer.valueOf(tje.u(8, chargersOrderTabsView.getContext())));
                return;
            case 3:
                ((DefaultFlexPopupModalView) this.b).calculateHeight(((View) this.c).getMeasuredHeight());
                return;
            case 4:
                View view = (View) this.c;
                DeliveryTooltipPopup deliveryTooltipPopup = (DeliveryTooltipPopup) this.b;
                try {
                    deliveryTooltipPopup.getTooltip().measure(0, 0);
                    deliveryTooltipPopup.showAsDropDown(view, (view.getWidth() - deliveryTooltipPopup.getTooltip().getMeasuredWidth()) / 2, (-view.getHeight()) - deliveryTooltipPopup.getTooltip().getMeasuredHeight());
                    return;
                } catch (Exception e3) {
                    jst.e.k(e3, "Cannot show tooltip view");
                    return;
                }
            case 5:
                d dVar = (d) this.b;
                bay bayVar = dVar.c;
                Throwable th = (Throwable) this.c;
                Throwable th2 = th;
                if (th == null) {
                    th2 = new UnknownError("No stack provided");
                }
                bayVar.a.add(th2);
                bayVar.b--;
                d.h(dVar);
                return;
            case 6:
                com.yandex.div.core.expression.variables.a aVar2 = (com.yandex.div.core.expression.variables.a) this.b;
                c231[] c231VarArr = (c231[]) this.c;
                com.yandex.div.core.expression.variables.a.a(aVar2, (c231[]) Arrays.copyOf(c231VarArr, c231VarArr.length));
                return;
            case 7:
                View view2 = (View) this.b;
                if (view2.isAttachedToWindow()) {
                    ((FundIncomeWidgetView) this.c).scrollToSelectedChip();
                    return;
                }
                return;
            case 8:
                ((c) this.b).c(puy.c((ykt) this.c, d3w.class.getSimpleName()), 27306);
                return;
            case 9:
                if (((LoadableInput) this.b).getCanShowSoftInputOnFocus()) {
                    lcb1.f((SelectionAwareEditText) this.c);
                    return;
                }
                return;
            case 10:
                db3 db3Var = (db3) this.c;
                Object obj = this.b;
                boolean z5 = db3Var.c.get();
                t091 t091Var = db3Var.x;
                if (z5) {
                    if (t091Var.h == db3Var) {
                        SystemClock.uptimeMillis();
                        t091Var.h = null;
                        t091Var.c();
                    }
                } else if (t091Var.g != db3Var) {
                    if (t091Var.h == db3Var) {
                        SystemClock.uptimeMillis();
                        t091Var.h = null;
                        t091Var.c();
                    }
                } else if (!t091Var.c) {
                    SystemClock.uptimeMillis();
                    t091Var.g = null;
                    vyy vyyVar = t091Var.a;
                    if (vyyVar != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            vyyVar.l(obj);
                        } else {
                            vyyVar.m(obj);
                        }
                    }
                }
                db3Var.b = ModernAsyncTask$Status.FINISHED;
                return;
            case 11:
                PrintAnimationTextView printAnimationTextView = (PrintAnimationTextView) this.b;
                z = printAnimationTextView.isAnimationPaused;
                if (z) {
                    return;
                }
                x2f0 x2f0Var = (x2f0) this.c;
                printAnimationTextView.animateShow(x2f0Var.g, new z5(19, printAnimationTextView, x2f0Var));
                return;
            case 12:
                b.j((ScanJob) this.c);
                initialzeScanHelper = ((ScanJob) this.c).initialzeScanHelper();
                if (!initialzeScanHelper) {
                    ((ScanJob) this.c).jobFinished((JobParameters) this.b, false);
                }
                kzo s = kzo.s();
                ((ScanJob) this.c).getApplicationContext();
                if (((ni5) s.x) == null) {
                    s.x = ni5.a();
                }
                ((ni5) s.x).getClass();
                int jobId = ((JobParameters) this.b).getJobId();
                int immediateScanJobId = ScanJob.getImmediateScanJobId((ScanJob) this.c);
                ScanJob scanJob = (ScanJob) this.c;
                if (jobId == immediateScanJobId) {
                    Objects.toString(scanJob);
                } else {
                    Objects.toString(scanJob);
                }
                kzo s2 = kzo.s();
                ArrayList arrayList = (ArrayList) s2.w;
                s2.w = new ArrayList();
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.size();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ScanResult scanResult = (ScanResult) it.next();
                    ScanRecord scanRecord = scanResult.getScanRecord();
                    if (scanRecord != null) {
                        mlm0Var = ((ScanJob) this.c).mScanHelper;
                        if (mlm0Var != null) {
                            mlm0Var2 = ((ScanJob) this.c).mScanHelper;
                            mlm0Var2.b(scanResult.getRssi(), (scanResult.getTimestampNanos() / 1000000) + (System.currentTimeMillis() - SystemClock.elapsedRealtime()), scanResult.getDevice(), scanRecord.getBytes());
                        }
                    }
                }
                int i4 = ScanJob.a;
                synchronized (((ScanJob) this.c)) {
                    try {
                        z2 = ((ScanJob) this.c).mStopCalled;
                        if (z2) {
                            ((ScanJob) this.c).jobFinished((JobParameters) this.b, false);
                            return;
                        }
                        z3 = ((ScanJob) this.c).mInitialized;
                        boolean restartScanning = z3 ? ((ScanJob) this.c).restartScanning() : ((ScanJob) this.c).startScanning();
                        handler = ((ScanJob) this.c).mStopHandler;
                        handler.removeCallbacksAndMessages(null);
                        if (restartScanning) {
                            scanState2 = ((ScanJob) this.c).mScanState;
                            if (scanState2 != null) {
                                scanState3 = ((ScanJob) this.c).mScanState;
                                scanState3.getClass();
                                handler2 = ((ScanJob) this.c).mStopHandler;
                                ii30 ii30Var = new ii30(i3, this);
                                scanState4 = ((ScanJob) this.c).mScanState;
                                handler2.postDelayed(ii30Var, scanState4.m());
                            }
                        } else {
                            ((ScanJob) this.c).stopScanning();
                            scanState = ((ScanJob) this.c).mScanState;
                            scanState.p();
                            Objects.toString((ScanJob) this.c);
                            ((ScanJob) this.c).jobFinished((JobParameters) this.b, false);
                        }
                        return;
                    } finally {
                    }
                }
            case 13:
                GoConstraintLayout goConstraintLayout = (GoConstraintLayout) this.b;
                NestedScrollView nestedScrollView = ScootersFinishInfoModalView.access$getBinding((ScootersFinishInfoModalView) this.c).l;
                nestedScrollView.setPadding(nestedScrollView.getPaddingLeft(), nestedScrollView.getPaddingTop(), nestedScrollView.getPaddingRight(), goConstraintLayout.getHeight());
                return;
            case 14:
                ScootersTariffListView scootersTariffListView = (ScootersTariffListView) this.b;
                scootersTariffListView.ensureInitialSelectorItemFullyVisibleOnFirstRender(((y5n0) this.c).h);
                s6n0Var = scootersTariffListView.scootersCardV2ProxyAnalytics;
                visibleTariffs = scootersTariffListView.getVisibleTariffs();
                s6n0Var.b(visibleTariffs);
                return;
            case 15:
                SolidSummaryView solidSummaryView = (SolidSummaryView) this.b;
                solidSummaryView.runWhenOpen(new j7t0(solidSummaryView, true ? 1 : 0));
                solidSummaryView.runWhenOpen(new j7t0(solidSummaryView, 2));
                int height = solidSummaryView.getHeight();
                contentViewHeight = solidSummaryView.contentViewHeight();
                solidSummaryView.anchorOffset = height - contentViewHeight;
                anchorBottomSheetBehavior = solidSummaryView.summaryAnchorBehavior;
                contentViewHeight2 = solidSummaryView.contentViewHeight();
                boolean z6 = ((bov0) this.c).a;
                anchorBottomSheetBehavior.M(contentViewHeight2, z6);
                anchorBottomSheetBehavior2 = solidSummaryView.summaryAnchorBehavior;
                i = solidSummaryView.anchorOffset;
                anchorBottomSheetBehavior2.G(i, z6);
                anchorBottomSheetBehavior3 = solidSummaryView.summaryAnchorBehavior;
                i2 = SolidSummaryView.BEHAVIOR_SUMMARY_COLLAPSED;
                anchorBottomSheetBehavior3.P(i2, z6, false);
                solidSummaryView.collapseToSummary(z6);
                return;
            case 16:
                TariffOptionsCardView tariffOptionsCardView = (TariffOptionsCardView) this.b;
                uix0 uix0Var = (uix0) this.c;
                tariffOptionsCardView.scrollIfHeaderTariffChanged(uix0Var.f);
                aVar = tariffOptionsCardView.bottomContainerShadowListener;
                aVar.b();
                l8u0Var = tariffOptionsCardView.statusBarThemeTracker;
                HeaderType headerType = uix0Var.g;
                r0 r0Var = l8u0Var.b;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, k8u0.a((k8u0) value, false, headerType, false, false, false, 29)));
                ekj0Var = tariffOptionsCardView.requirementShowInteractor;
                linearLayoutManager = tariffOptionsCardView.linearLayoutManager;
                ekj0Var.a.a(uix0Var.f, linearLayoutManager.L1(), VisibilityChangeOrigin.SYSTEM);
                return;
            case 17:
                WebContainerModalView webContainerModalView = (WebContainerModalView) this.b;
                webViewContainerImpl = webContainerModalView.webViewContainer;
                ViewGroup.LayoutParams layoutParams = webViewContainerImpl.getLayoutParams();
                content2 = webContainerModalView.getContent();
                layoutParams.height = content2.getMeasuredHeight() - ((FloatButtonIconComponent) this.c).getMeasuredHeight();
                webViewContainerImpl2 = webContainerModalView.webViewContainer;
                webViewContainerImpl2.setLayoutParams(layoutParams);
                return;
            case 18:
                if (((kzo) this.c).b) {
                    return;
                }
                rr41 rr41Var = (rr41) this.b;
                o081 o081Var = (o081) ((vi71) ((aj31) rr41Var.b).b).w;
                if (o081Var != null && (a = o081Var.c.a()) != null && sj71.a.a(a).a >= 1) {
                    cr71 cr71Var = (cr71) rr41Var.c;
                    ((jl71) cr71Var.w).getClass();
                    gg81 a3 = ((a081) cr71Var.x).a((Context) cr71Var.b);
                    if ((a3 == null || !a3.C) ? true : ((vi71) cr71Var.c).g(false) instanceof f881) {
                        kzo kzoVar = (kzo) this.c;
                        kzoVar.b = true;
                        no6 no6Var = (no6) kzoVar.w;
                        iz71 iz71Var = (iz71) no6Var.w;
                        if (iz71Var != null) {
                            iz71Var.a = Long.valueOf(SystemClock.elapsedRealtime());
                        }
                        vi71 vi71Var = (vi71) no6Var.x;
                        Iterator it2 = ((ArrayList) vi71Var.b).iterator();
                        while (it2.hasNext()) {
                            String str = (String) it2.next();
                            pb81 pb81Var = (pb81) vi71Var.c;
                            q63 q63Var = q63.i;
                            ExecutorService executorService = pb81.d;
                            pb81Var.a(str, q63Var, kotlin.collections.b.f());
                        }
                        z4m0 z4m0Var = (z4m0) vi71Var.w;
                        hn71 a4 = ((f571) z4m0Var.z).a((fe81) z4m0Var.b, (d881) z4m0Var.c);
                        a4.r(g771.a, "adapter");
                        rr41 rr41Var2 = (rr41) z4m0Var.A;
                        if (rr41Var2 != null) {
                            Map map = (Map) ((uio0) rr41Var2.b).b().b;
                            hn71 hn71Var = (hn71) rr41Var2.c;
                            hn71Var.getClass();
                            HashMap hashMap = new HashMap();
                            for (uy71 uy71Var : (List) hn71Var.b) {
                                String str2 = uy71Var.a;
                                o081 o081Var2 = (o081) hn71Var.c;
                                if (o081Var2 != null && (a2 = o081Var2.a(uy71Var)) != null && a2.b()) {
                                    HashMap hashMap2 = new HashMap();
                                    iv81 c = a2.c();
                                    if (c != null) {
                                        hashMap2.put("width", Integer.valueOf(nba1.a(c.a)));
                                        hashMap2.put("height", Integer.valueOf(nba1.a(c.b)));
                                    }
                                    up71 up71Var = a2 instanceof up71 ? (up71) a2 : null;
                                    if (up71Var != null) {
                                        vd71 vd71Var = up71Var.b;
                                        gm1 gm1Var = (vd71Var == null || (j = vd71Var.j()) == null) ? up71Var.a != null ? gm1.f : null : j;
                                        if (gm1Var != null) {
                                            hashMap2.put("value_type", gm1Var.b);
                                        }
                                    }
                                    hashMap.put(str2, hashMap2);
                                }
                            }
                            o081 o081Var3 = (o081) hn71Var.c;
                            View a5 = o081Var3 != null ? o081Var3.c.a() : null;
                            MapBuilder mapBuilder = new MapBuilder();
                            if (a5 != null) {
                                mapBuilder.put("width", Integer.valueOf(nba1.a(a5.getWidth())));
                                mapBuilder.put("height", Integer.valueOf(nba1.a(a5.getHeight())));
                            }
                            MapBuilder j2 = mapBuilder.j();
                            if (!j2.isEmpty()) {
                                hashMap.put("superview", j2);
                            }
                            ((Map) a4.b).putAll(kotlin.collections.b.n(map, gw00.e(new Pair("assets", gw00.e(new Pair("rendered", hashMap))))));
                        }
                        a271 a271Var = ((fe81) z4m0Var.b).d.a;
                        if (a271Var != null) {
                            jd81 jd81Var = (jd81) a271Var;
                            a4.r(jd81Var.a.b, "size_type");
                            a4.r(Integer.valueOf(jd81Var.b), "width");
                            a4.r(Integer.valueOf(jd81Var.c), "height");
                        }
                        gg81 gg81Var = (gg81) z4m0Var.y;
                        if (gg81Var != null) {
                            a4.r(gg81Var.R, "banner_size_calculation_type");
                        }
                        int ordinal = ((p9) z4m0Var.w).ordinal();
                        if (ordinal == 0) {
                            g = scc.g(hm2.l, hm2.k);
                        } else if (ordinal == 1) {
                            g = Collections.singletonList(hm2.l);
                        } else {
                            if (ordinal != 2) {
                                w511.b();
                                return;
                            }
                            g = Collections.singletonList(hm2.k);
                        }
                        Iterator it3 = g.iterator();
                        while (it3.hasNext()) {
                            ((ge71) z4m0Var.x).c(new zj71((hm2) it3.next(), (Map) a4.b, (no61) a4.c));
                        }
                        hn71 hn71Var2 = (hn71) no6Var.b;
                        String str3 = ((mf1) hn71Var2.b).b;
                        if (str3 != null && str3.length() != 0) {
                            db81 db81Var = (db81) hn71Var2.c;
                            db81Var.getClass();
                            synchronized (db81.c) {
                                db81Var.a.remove(str3);
                                db81Var.a.add(str3);
                            }
                        }
                        ((bl61) no6Var.c).f();
                        return;
                    }
                }
                kzo kzoVar2 = (kzo) this.c;
                ((Handler) kzoVar2.x).postDelayed(new uqs(kzoVar2, (rr41) this.b, z4, 18), 300L);
                return;
            case 19:
                yl2 yl2Var = (yl2) this.b;
                yl2Var.setBackground(new BitmapDrawable(yl2Var.getResources(), (Bitmap) this.c));
                yl2Var.setVisibility(0);
                return;
            case 20:
                ouy ouyVar = (ouy) this.b;
                muy muyVar = (muy) this.c;
                Object obj2 = ouyVar.b;
                if (obj2 == null) {
                    return;
                }
                muyVar.e(obj2);
                return;
            case 21:
                com.android.billingclient.api.a aVar3 = (com.android.billingclient.api.a) this.b;
                j0g0 j0g0Var = (j0g0) this.c;
                aVar3.getClass();
                ns5 ns5Var = fe91.l;
                aVar3.B(24, 9, ns5Var);
                j0g0Var.onQueryPurchasesResponse(ns5Var, zzco.n());
                return;
            case 22:
                com.android.billingclient.api.a aVar4 = (com.android.billingclient.api.a) this.b;
                i iVar = (i) this.c;
                aVar4.getClass();
                ns5 ns5Var2 = fe91.l;
                aVar4.B(24, 11, ns5Var2);
                iVar.onPurchaseHistoryResponse(ns5Var2, null);
                return;
            case 23:
                g9p g9pVar = (g9p) this.b;
                mvt0 mvt0Var = (mvt0) this.c;
                g9pVar.f.a(mvt0Var);
                g9pVar.g.a(mvt0Var);
                return;
            case 24:
                Log.isLoggable("EnhancedIntentService", 3);
                zzeVar = ((zzi) this.c).zzbm;
                bx91 bx91Var = (bx91) this.b;
                zzeVar.handleIntent(bx91Var.a);
                bx91Var.a();
                return;
            case 25:
                u430 u430Var = (u430) this.b;
                atx0 atx0Var = (atx0) this.c;
                int decrementAndGet = u430Var.b.decrementAndGet();
                cvw.o(decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    u430Var.c();
                    u430Var.c.set(false);
                }
                wlb1.a.clear();
                tpb1.a.clear();
                atx0Var.a(null);
                return;
            case 26:
                com.android.billingclient.api.a aVar5 = (com.android.billingclient.api.a) this.b;
                ns5 ns5Var3 = (ns5) this.c;
                l0g0 l0g0Var = aVar5.e.b;
                f fVar = aVar5.e;
                if (l0g0Var != null) {
                    fVar.b.onPurchasesUpdated(ns5Var3, null);
                    return;
                } else {
                    int i5 = g.a;
                    Log.isLoggable("BillingClient", 5);
                    return;
                }
            default:
                com.android.billingclient.api.a aVar6 = (com.android.billingclient.api.a) this.b;
                fs5 fs5Var = (fs5) this.c;
                ns5 ns5Var4 = fe91.l;
                aVar6.B(24, 3, ns5Var4);
                fs5Var.a(ns5Var4);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return uqs.class.getSimpleName() + "," + ((iqs) this.c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ uqs(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ uqs(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }
}
