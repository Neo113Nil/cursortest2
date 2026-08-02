package defpackage;

import android.app.AlertDialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.widget.Toast;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;
import com.yandex.go.navigator.driving.r;
import com.yandex.go.navigator.notifications.cartech.CartechDeeplinkPayloadDto;
import com.yandex.go.places.analytics.generated.DiscoveryAnalytics$TabbarType;
import com.yandex.go.places.impl.domain.interactors.a;
import com.yandex.go.places.impl.ui.main.DiscoveryMainModalView;
import com.yandex.go.places.impl.ui.main.d;
import com.yandex.go.places.models.ui.PlacesNativeScreenTabName;
import com.yandex.go.places.webview.api.navigation.PlacesWebAuthType;
import com.yandex.go.taxi.order.details.v1.ui.DriverSectionView;
import com.yandex.go.trusted_contacts.share_settings.edit.EditContactNameModalView;
import com.yandex.mobile.drive.sdk.full.internal.DriveException;
import com.ybsdk.feature.divkit.common.screen.api.DivkitCommonScreenParams;
import com.ybsdk.feature.divkit.common.screen.api.DivkitScreenConfig;
import com.ybsdk.feature.educations.internal.ui.educations2.DivEducationsV2View;
import com.ybsdk.rconfig.configs.YbMobileTabBarConfig;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.b;
import okhttp3.OkHttpClient;
import ru.yandex.alice.protos.api.alicekit.directives.platform.utils.TDirective;
import ru.yandex.taxi.deeplinks.DeeplinkSource;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.eatskit.EatsKitContentView;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class ymj implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ymj(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        Object obj;
        sls slsVar;
        zy11 showView$lambda$19;
        zy11 renderWaitingCandidateResponse$lambda$0;
        cst0 init$lambda$0;
        zy11 onAttachedToWindow$lambda$0$0$0;
        String str;
        ffi ffiVar;
        int i = this.a;
        Object obj2 = null;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                TDirective tDirective = (TDirective) obj4;
                zwf0 zwf0Var = (zwf0) obj3;
                try {
                    obj = new lyj0(TDirective.ADAPTER.encode(tDirective));
                } catch (IOException e) {
                    String message = e.getMessage();
                    if (message == null) {
                        message = "Failed to encode proto " + tDirective + " to bytes";
                    }
                    obj = new jyj0(new puf0(message, e));
                }
                if (obj instanceof lyj0) {
                    obj2 = ((lyj0) obj).a;
                } else if (!(obj instanceof jyj0)) {
                    w511.b();
                    break;
                } else {
                    zwf0Var.f("DirectiveExtensions", ((puf0) ((jyj0) obj).a).a);
                }
                break;
            case 1:
                foj fojVar = (foj) obj4;
                lhg lhgVar = (lhg) obj3;
                ky kyVar = fojVar.d;
                if (kyVar != null && (slsVar = kyVar.b) != null) {
                    slsVar.invoke();
                }
                lhgVar.b(fojVar.l, fojVar.k);
                break;
            case 2:
                ((tls) obj4).invoke(((uoj) obj3).c);
                break;
            case 3:
                ((tls) obj4).invoke(((qoj) obj3).g);
                break;
            case 4:
                ((a) obj4).c.f.a(Uri.parse(((yq) ((fr) obj3)).d), DeeplinkSource.PLACES);
                break;
            case 5:
                btj btjVar = (btj) obj3;
                d presenter = ((DiscoveryMainModalView) obj4).getPresenter();
                jio jioVar = presenter.H;
                DiscoveryAnalytics$TabbarType discoveryAnalytics$TabbarType = DiscoveryAnalytics$TabbarType.Places;
                hsj hsjVar = jioVar.b;
                String i2 = jioVar.i();
                hsjVar.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("action_type", discoveryAnalytics$TabbarType.getEventValue());
                hashMap.put("source", i2);
                hsjVar.a.a("Discovery.Tabbar.Tapped", hashMap, 2, new HashMap());
                if (jl40.l(btjVar.a, PlacesNativeScreenTabName.PUBLICATIONS.getId())) {
                    ((pep0) presenter.V).f(presenter.U, new ugc0(presenter.T.f(), PlacesWebAuthType.OAUTH, false, 12), hxx.a);
                    break;
                } else {
                    presenter.J.a.a(btjVar);
                    break;
                }
            case 6:
                showView$lambda$19 = DivEducationsV2View.showView$lambda$19((DivEducationsV2View) obj4, (yon) obj3);
                break;
            case 7:
                DivkitCommonScreenParams divkitCommonScreenParams = (DivkitCommonScreenParams) obj4;
                String path = divkitCommonScreenParams.getPath();
                String skeletonId = divkitCommonScreenParams.getSkeletonId();
                DivkitScreenConfig screenConfig = divkitCommonScreenParams.getScreenConfig();
                List<YbMobileTabBarConfig.TabBarItem> items = ((fsl) ((isl) obj3)).a.q().getItems();
                ArrayList arrayList = new ArrayList(tcc.n(items, 10));
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    arrayList.add(((YbMobileTabBarConfig.TabBarItem) it.next()).toEntity());
                }
                break;
            case 8:
                q4g q4gVar = (q4g) obj4;
                Uri uri = (Uri) obj3;
                ew2 ew2Var = (ew2) q4gVar.c;
                FragmentActivity fragmentActivity = (FragmentActivity) q4gVar.b;
                DownloadManager downloadManager = (DownloadManager) ((i3y) q4gVar.y).getValue();
                if (downloadManager == null) {
                    try {
                        q4gVar.k();
                    } catch (PackageManager.NameNotFoundException unused) {
                        new AlertDialog.Builder(fragmentActivity).setMessage(qyh0.download_manager_not_present).setPositiveButton(qyh0.download_manager_not_present_ok_button, (DialogInterface.OnClickListener) null).create().show();
                    } catch (IllegalArgumentException unused2) {
                        new AlertDialog.Builder(fragmentActivity).setMessage(qyh0.download_manager_not_present).setPositiveButton(qyh0.download_manager_not_present_ok_button, (DialogInterface.OnClickListener) null).create().show();
                    }
                    ew2Var.c("wm_download_file_error", gw00.e(new Pair(Constants.KEY_MESSAGE, "problem with download manager")));
                    break;
                } else {
                    if (uri.getScheme() != null) {
                        String scheme = uri.getScheme();
                        for (int i3 = 0; i3 < 2; i3++) {
                            if (jl40.l(qa91.a[i3], scheme)) {
                                String g = ((rl3) q4gVar.w).g();
                                if (g != null) {
                                    OkHttpClient okHttpClient = (OkHttpClient) q4gVar.x;
                                    t4j0 t4j0Var = new t4j0();
                                    t4j0Var.h(uri.toString());
                                    t4j0Var.c.a("Authorization", g);
                                    t4j0Var.e("HEAD", null);
                                    ((nci0) okHttpClient.newCall(new d5j0(t4j0Var))).I(new jdj(5, q4gVar, uri, downloadManager));
                                    Toast.makeText(fragmentActivity, qyh0.download_descr, 0).show();
                                    break;
                                }
                            }
                        }
                    }
                    ew2Var.c("wm_download_file_error", b.i(new Pair(Constants.KEY_MESSAGE, "not supported scheme for downloading"), new Pair("url", uri.toString())));
                    break;
                }
                break;
            case 9:
                ((fj7) obj4).invoke();
                ((DriveHostView) obj3).requestFocus();
                break;
            case 10:
                ((tj) obj4).invoke((uhf) obj3);
                break;
            case 11:
                tj tjVar = (tj) obj3;
                lzj0 lzj0Var = (lzj0) ((pyj0) obj4);
                DriveException driveException = lzj0Var.a;
                DriveException driveException2 = lzj0Var.a;
                Throwable source = driveException.getSource();
                Exception exc = source instanceof Exception ? (Exception) source : null;
                if (exc == null) {
                    exc = driveException2;
                }
                tjVar.invoke(new thf(driveException2.getCode(), exc));
                break;
            case 12:
                renderWaitingCandidateResponse$lambda$0 = DriverSectionView.renderWaitingCandidateResponse$lambda$0((DriverSectionView) obj4, (e6j) obj3);
                break;
            case 13:
                ((r) obj4).f.a((CartechDeeplinkPayloadDto) obj3);
                break;
            case 14:
                ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.a aVar = (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.a) obj4;
                m5n m5nVar = (m5n) ((n351) obj3);
                gv90 gv90Var = m5nVar.f;
                String str2 = m5nVar.g;
                if (gv90Var != null) {
                    aVar.b.b(gv90Var, str2);
                    break;
                }
                break;
            case 15:
                ((tls) obj4).invoke(((o5n) obj3).h);
                break;
            case 16:
                q5n q5nVar = (q5n) ((n351) obj3);
                ((c) obj4).c.o(q5nVar.f, q5nVar.g);
                break;
            case 17:
                ((tls) obj4).invoke((mu90) obj3);
                break;
            case 18:
                e1q0 e1q0Var = (e1q0) ((vyc) obj4).c;
                i6n i6nVar = ((j6n) ((n351) obj3)).d;
                e1q0Var.a(i6nVar != null ? i6nVar.c : null);
                break;
            case 19:
                init$lambda$0 = EatsKitContentView.init$lambda$0((EatsKitContentView) obj4, (fen) obj3);
                break;
            case 20:
                ((ru.yandex.taxi.eatskit.c) obj4).s(((d6j0) obj3).a, false);
                break;
            case 21:
                onAttachedToWindow$lambda$0$0$0 = EditContactNameModalView.onAttachedToWindow$lambda$0$0$0((AnimatedListItemInputComponent) obj4, (EditContactNameModalView) obj3);
                break;
            case 22:
                u1n.k(((gon) obj4).d, new x2s(b64.j((String) obj3, ".DeleteButton"), null));
                break;
            case 23:
                int i4 = y2l.f;
                break;
            case 24:
                ((tls) obj4).invoke(((p6o) obj3).e.c);
                break;
            case 25:
                ((tls) obj4).invoke(((zrm) obj3).c);
                break;
            case 26:
                break;
            case 27:
                Context context = (Context) obj4;
                Context applicationContext = context.getApplicationContext();
                String str3 = ((v8o) obj3).a;
                AppMetrica.activateReporter(applicationContext, ReporterConfig.newConfigBuilder(str3).withLogs().build());
                break;
            case 28:
                ((tls) obj4).invoke(((vnb) obj3).b);
                break;
            default:
                tls tlsVar = (tls) obj4;
                List list = (List) obj3;
                if (list == null || (ffiVar = (ffi) kotlin.collections.a.R(list)) == null || (str = ffiVar.a) == null) {
                    str = "";
                }
                tlsVar.invoke(str);
                break;
        }
        return zy11Var;
    }
}
