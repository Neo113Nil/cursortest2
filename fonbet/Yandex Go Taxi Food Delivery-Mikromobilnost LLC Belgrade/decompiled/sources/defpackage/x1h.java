package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.di.modules.c;
import com.ybsdk.feature.dashboard.api.DashboardScreenParams;
import com.ybsdk.feature.dashboard.api.model.ProductId;
import com.ybsdk.feature.deeplink.api.BaseDeeplinkAction;
import com.ybsdk.feature.redirect.url.api.RedirectUrlAuth;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.DashboardV3Feature;
import com.ybsdk.rconfig.configs.DefaultProductForDashboardSchema;
import com.ybsdk.screens.initial.a;
import com.ybsdk.screens.initial.deeplink.DeeplinkAction;
import com.ybsdk.widgets.common.YbButtonViewGroup;
import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;
import com.ybsdk.widgets.common.bottomsheet.d;
import com.ybsdk.widgets.common.bottomsheet.f;
import com.ybsdk.widgets.common.bottomsheet.h;
import com.ybsdk.widgets.common.bottomsheet.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class x1h implements k3h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public x1h(fk3 fk3Var, tfl0 tfl0Var, kg51 kg51Var, fj3 fj3Var, a aVar) {
        this.a = 2;
        this.b = fk3Var;
        this.c = tfl0Var;
        this.d = aVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02a7, code lost:
    
        if (r5.equals("split") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02d6, code lost:
    
        r4 = ((com.ybsdk.rconfig.configs.DefaultProductForDashboardSchema) r0.d(r4).getData()).getProduct().getProductId();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02b0, code lost:
    
        if (r5.equals("pro") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02b9, code lost:
    
        if (r5.equals("mkk") != false) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02c0, code lost:
    
        if (r5.equals("wallet") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02c9, code lost:
    
        if (r5.equals("credit_limit") == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02d2, code lost:
    
        if (r5.equals("corp_card") == false) goto L89;
     */
    @Override // defpackage.k3h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final y0h a(BaseDeeplinkAction baseDeeplinkAction) {
        Object obj;
        List singletonList;
        v0h v0hVar;
        RedirectUrlAuth redirectUrlAuth;
        boolean z = true;
        switch (this.a) {
            case 0:
                wig wigVar = (wig) this.d;
                if (!(baseDeeplinkAction instanceof DeeplinkAction.DashboardAction)) {
                    break;
                } else {
                    DeeplinkAction.DashboardAction dashboardAction = (DeeplinkAction.DashboardAction) baseDeeplinkAction;
                    DashboardV3Feature dashboardV3Feature = (DashboardV3Feature) ((b) this.b).d(jr51.a).getData();
                    String productId = dashboardAction.getProductId();
                    if (dashboardV3Feature.isEnabled()) {
                        if (kotlin.collections.a.G(dashboardV3Feature.getProducts(), productId != null ? productId.toLowerCase(Locale.ROOT) : null)) {
                            String productId2 = dashboardAction.getProductId();
                            if (productId2 == null) {
                                b bVar = (b) ((j0g) this.c).a;
                                dfr dfrVar = lih.a;
                                String productId3 = ((DefaultProductForDashboardSchema) bVar.d(dfrVar).getData()).getProduct().getProductId();
                                switch (productId3.hashCode()) {
                                    case -1272463739:
                                        break;
                                    case -819102987:
                                        break;
                                    case -795192327:
                                        break;
                                    case 108173:
                                        break;
                                    case 111277:
                                        break;
                                    case 109648666:
                                        break;
                                    default:
                                        productId2 = "wallet";
                                        break;
                                }
                            }
                            List<DeeplinkAction.DashboardDeeplinkParams> products = dashboardAction.getProducts();
                            ArrayList arrayList = new ArrayList(tcc.n(products, 10));
                            for (DeeplinkAction.DashboardDeeplinkParams dashboardDeeplinkParams : products) {
                                arrayList.add(new vig(dashboardDeeplinkParams.getProductId(), dashboardDeeplinkParams.getBalance()));
                            }
                            singletonList = Collections.singletonList(wigVar.c(productId2, arrayList, false));
                            break;
                        }
                    }
                    String productId4 = dashboardAction.getProductId();
                    Iterator<E> it = ProductId.getEntries().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (jl40.l(((ProductId) obj).getValue(), productId4)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    ProductId productId5 = (ProductId) obj;
                    if (productId5 == null) {
                        productId5 = ProductId.WALLET;
                    }
                    singletonList = Collections.singletonList(wigVar.b(new DashboardScreenParams(productId5, dashboardAction.getAgreementId(), dashboardAction.getProductType())));
                }
            case 1:
                if (baseDeeplinkAction instanceof DeeplinkAction.EsiaSdk) {
                    DeeplinkAction.EsiaSdk esiaSdk = (DeeplinkAction.EsiaSdk) baseDeeplinkAction;
                    break;
                } else {
                    break;
                }
            case 2:
                if (baseDeeplinkAction instanceof DeeplinkAction.LogoutAccount) {
                    com.ybsdk.common.repositiories.auth.a aVar = (com.ybsdk.common.repositiories.auth.a) ((fk3) this.b);
                    aVar.e.m0.a.a("tech.auth_repository.logout", null);
                    aVar.b(null);
                    gff gffVar = aVar.k;
                    gffVar.f = null;
                    gffVar.d.f();
                    aVar.k.b = null;
                    com.ybsdk.common.repositiories.auth.b bVar2 = aVar.m;
                    bVar2.d = null;
                    r0 r0Var = bVar2.c.e;
                    sn90 sn90Var = sn90.a;
                    r0Var.getClass();
                    r0Var.m(null, sn90Var);
                    aVar.h.m.invoke();
                    aVar.n.b = null;
                    ((tfl0) this.c).j(a.c((a) this.d));
                    break;
                } else {
                    break;
                }
            case 3:
                if (baseDeeplinkAction instanceof DeeplinkAction.OpenProduct) {
                    DeeplinkAction.OpenProduct openProduct = (DeeplinkAction.OpenProduct) baseDeeplinkAction;
                    cya1.a = new amt(openProduct.getProduct(), zlt.a);
                    break;
                } else {
                    break;
                }
            case 4:
                ContextThemeWrapper contextThemeWrapper = (ContextThemeWrapper) this.b;
                if (baseDeeplinkAction instanceof DeeplinkAction.ProTopupMethodsBottomSheet) {
                    BottomSheetDialogView bottomSheetDialogView = new BottomSheetDialogView(contextThemeWrapper, null, 0, 6, null);
                    bottomSheetDialogView.render(new BottomSheetDialogView.State((d) new f(new c(contextThemeWrapper, (lhk) this.d, (DeeplinkAction.ProTopupMethodsBottomSheet) baseDeeplinkAction, bottomSheetDialogView)), (YbButtonViewGroup.b) null, (h) null, true, (BottomSheetDialogView.State.Background) null, (l) null, (p1b) null, false, (com.ybsdk.widgets.common.bottomsheet.c) null, false, (z1x0) null, (z1x0) null, false, false, 65526));
                    BottomSheetDialogView.show$default(bottomSheetDialogView, (FragmentActivity) this.c, null, 2, null);
                    break;
                } else {
                    break;
                }
            default:
                EmptyList emptyList = EmptyList.a;
                if (baseDeeplinkAction instanceof DeeplinkAction.Redirect) {
                    DeeplinkAction.Redirect redirect = (DeeplinkAction.Redirect) baseDeeplinkAction;
                    String landingFirstRunQueryParam = redirect.getLandingFirstRunQueryParam();
                    if (landingFirstRunQueryParam != null) {
                        ((AppAnalyticsReporter) this.d).o.f(landingFirstRunQueryParam);
                    }
                    DeeplinkAction.Redirect.Auth auth = redirect.getAuth();
                    int[] iArr = k1h.b;
                    int i = iArr[auth.ordinal()];
                    if (i != 1) {
                        if (i == 2) {
                            String uri = redirect.getUri().toString();
                            int i2 = iArr[redirect.getAuth().ordinal()];
                            if (i2 == 1) {
                                redirectUrlAuth = RedirectUrlAuth.NONE;
                            } else if (i2 != 2) {
                                w511.b();
                                break;
                            } else {
                                redirectUrlAuth = RedirectUrlAuth.YANDEX;
                            }
                            break;
                        } else {
                            w511.b();
                            break;
                        }
                    } else {
                        FragmentActivity fragmentActivity = (FragmentActivity) this.b;
                        Uri uri2 = redirect.getUri();
                        try {
                            new slf().a().a(fragmentActivity, uri2);
                            i5z0.a.a("CustomTabsIntent launched with uri " + uri2, new Object[0]);
                        } catch (Exception unused) {
                            z = rje.k(fragmentActivity, new Intent("android.intent.action.VIEW", uri2));
                        }
                        if (z) {
                            v0hVar = new v0h(emptyList, null, 6);
                        } else if (redirect.getFallback() != null) {
                            break;
                        } else {
                            x4c.g("Unable to open in webview", null, String.valueOf(redirect.getUri()), null, 10);
                            v0hVar = new v0h(emptyList, null, 6);
                        }
                        break;
                    }
                } else {
                    break;
                }
        }
        return x0h.a;
    }

    public /* synthetic */ x1h(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public x1h(FragmentActivity fragmentActivity, xvf0 xvf0Var, tc9 tc9Var, AppAnalyticsReporter appAnalyticsReporter) {
        this.a = 5;
        this.b = fragmentActivity;
        this.c = xvf0Var;
        this.d = appAnalyticsReporter;
    }
}
