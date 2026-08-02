package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.compose.material3.b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.design.view.GoFrameLayout;
import com.yandex.go.design.view.GoLinearLayout;
import com.yandex.go.navigator.compose.button.CustomButtonStyle;
import com.yandex.go.payments.addmethod.ui.home.d;
import com.yandex.go.places.common.ui.indicator.DotsIndicatorComponent;
import com.yandex.go.places.impl.ui.common.compression_resistant.CompressionResistantListComponent;
import com.yandex.go.superapp.web.view.a;
import com.yandex.messaging.ui.settings.SettingsComposeFragment;
import com.yandex.messaging.ui.settings.e;
import com.yandex.messaging.ui.settings.f;
import java.util.List;
import ru.yandex.taxi.design.RatingBarComponent;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes11.dex */
public final /* synthetic */ class xg0 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ xg0(int i, m3u0 m3u0Var, m3u0 m3u0Var2, m8i0 m8i0Var, String str, sls slsVar, int i2) {
        this.a = 13;
        this.c = i;
        this.x = m3u0Var;
        this.y = m3u0Var2;
        this.z = m8i0Var;
        this.A = str;
        this.b = slsVar;
        this.w = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        View O;
        View O2;
        zy11 SettingsScreenRoot$lambda$18;
        int i = this.a;
        int i2 = this.w;
        int i3 = this.c;
        int i4 = 1;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.A;
        Object obj4 = this.b;
        Object obj5 = this.z;
        Object obj6 = this.y;
        Object obj7 = this.x;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                d.d((ph0) obj7, (tls) obj6, (sls) obj4, (tls) obj5, (a) obj3, (fid) obj, vng.O(i3 | 1), this.w);
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.yandex.go.ai_widget.ui.a.i((sls) obj4, (String) obj7, (String) obj6, (wls) obj5, (zls) obj3, (fid) obj, vng.O(i3 | 1), this.w);
                break;
            case 2:
                ((Integer) obj2).getClass();
                r3b1.a((f530) obj7, (w3b1) obj6, (ehr0) obj5, (jt1) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(i3 | 1), this.w);
                break;
            case 3:
                ((Integer) obj2).getClass();
                y4b1.a((f530) obj7, (CustomButtonStyle) obj6, (ButtonSize) obj5, (sls) obj4, (zls) obj3, (fid) obj, vng.O(i3 | 1), this.w);
                break;
            case 4:
                ((Integer) obj2).getClass();
                rfb1.a((f530) obj7, (ehr0) obj6, (ec8) obj5, (b) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(i3 | 1), this.w);
                break;
            case 5:
                ((Integer) obj2).getClass();
                fmb1.f((String) obj7, (f530) obj6, (ety0) obj5, (wp2) obj4, (sjy0) obj3, this.c, this.w, (fid) obj, vng.O(49));
                break;
            case 6:
                ((Integer) obj2).getClass();
                cq91.a((String) obj7, (String) obj6, (f530) obj5, (wls) obj4, (wls) obj3, (fid) obj, vng.O(i3 | 1), this.w);
                break;
            case 7:
                ((Integer) obj2).getClass();
                com.yx360.design.compose.atoms.snackbar.a.a((String) obj7, (f530) obj6, (xsm) obj5, (Long) obj4, (ysm) obj3, (fid) obj, vng.O(i3 | 1), this.w);
                break;
            case 8:
                ((Integer) obj2).getClass();
                n8p.a((CharSequence) obj7, (wp2) obj6, (f530) obj5, (wp2) obj4, (sjy0) obj3, (fid) obj, vng.O(i3 | 1), this.w);
                break;
            case 9:
                ((Integer) obj2).getClass();
                vqr.a((f530) obj7, (k43) obj6, (h43) obj5, (it1) obj4, this.c, this.w, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(1572871));
                break;
            case 10:
                ((Integer) obj2).getClass();
                e5v.a((f530) obj7, (hdu) obj6, (wp2) obj5, (IconSpotSize) obj4, (zls) obj3, (fid) obj, vng.O(i3 | 1), this.w);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.live_location.a.a((svy) obj7, (sls) obj4, (tls) obj6, (sls) obj5, (sls) obj3, (fid) obj, vng.O(i3 | 1), this.w);
                break;
            case 12:
                pav pavVar = (pav) obj7;
                tt2 tt2Var = (tt2) obj6;
                a4j0 a4j0Var = (a4j0) obj5;
                ub60 ub60Var = (ub60) obj4;
                wls wlsVar = (wls) obj3;
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                View inflate = layoutInflater.inflate(uuh0.organizations_organization_preview_v2_item, (ViewGroup) obj2, false);
                int i5 = o6h0.buttons_container;
                GoLinearLayout goLinearLayout = (GoLinearLayout) cma1.O(i5, inflate);
                if (goLinearLayout != null) {
                    i5 = o6h0.buttons_container_host;
                    HorizontalScrollView horizontalScrollView = (HorizontalScrollView) cma1.O(i5, inflate);
                    if (horizontalScrollView != null && (O = cma1.O((i5 = o6h0.dots_bg), inflate)) != null) {
                        i5 = o6h0.dots_view;
                        DotsIndicatorComponent dotsIndicatorComponent = (DotsIndicatorComponent) cma1.O(i5, inflate);
                        if (dotsIndicatorComponent != null && (O2 = cma1.O((i5 = o6h0.empty_review_rating), inflate)) != null) {
                            i5 = o6h0.image_slider_pager;
                            ViewPager2 viewPager2 = (ViewPager2) cma1.O(i5, inflate);
                            if (viewPager2 != null) {
                                i5 = o6h0.image_slider_pager_frame;
                                GoFrameLayout goFrameLayout = (GoFrameLayout) cma1.O(i5, inflate);
                                if (goFrameLayout != null) {
                                    i5 = o6h0.image_slider_recycler;
                                    RecyclerView recyclerView = (RecyclerView) cma1.O(i5, inflate);
                                    if (recyclerView != null) {
                                        GoLinearLayout goLinearLayout2 = (GoLinearLayout) inflate;
                                        i5 = o6h0.review_counter;
                                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i5, inflate);
                                        if (robotoTextView != null) {
                                            i5 = o6h0.review_rating;
                                            RatingBarComponent ratingBarComponent = (RatingBarComponent) cma1.O(i5, inflate);
                                            if (ratingBarComponent != null) {
                                                i5 = o6h0.review_rating_container;
                                                LinearLayout linearLayout = (LinearLayout) cma1.O(i5, inflate);
                                                if (linearLayout != null) {
                                                    i5 = o6h0.review_rating_value;
                                                    RobotoTextView robotoTextView2 = (RobotoTextView) cma1.O(i5, inflate);
                                                    if (robotoTextView2 != null) {
                                                        i5 = o6h0.subtitle;
                                                        CompressionResistantListComponent compressionResistantListComponent = (CompressionResistantListComponent) cma1.O(i5, inflate);
                                                        if (compressionResistantListComponent != null) {
                                                            i5 = o6h0.tags_container;
                                                            GoLinearLayout goLinearLayout3 = (GoLinearLayout) cma1.O(i5, inflate);
                                                            if (goLinearLayout3 != null) {
                                                                i5 = o6h0.tags_container_host;
                                                                HorizontalScrollView horizontalScrollView2 = (HorizontalScrollView) cma1.O(i5, inflate);
                                                                if (horizontalScrollView2 != null) {
                                                                    i5 = o6h0.title;
                                                                    RobotoTextView robotoTextView3 = (RobotoTextView) cma1.O(i5, inflate);
                                                                    if (robotoTextView3 != null) {
                                                                        to80 to80Var = new to80(goLinearLayout2, goLinearLayout, horizontalScrollView, O, dotsIndicatorComponent, O2, viewPager2, goFrameLayout, recyclerView, robotoTextView, ratingBarComponent, linearLayout, robotoTextView2, compressionResistantListComponent, goLinearLayout3, horizontalScrollView2, robotoTextView3);
                                                                        int i6 = o6h0.shimmering_additional_info;
                                                                        PlaceholderView placeholderView = (PlaceholderView) cma1.O(i6, goLinearLayout2);
                                                                        if (placeholderView != null) {
                                                                            i6 = o6h0.shimmering_buttons;
                                                                            LinearLayout linearLayout2 = (LinearLayout) cma1.O(i6, goLinearLayout2);
                                                                            if (linearLayout2 != null) {
                                                                                i6 = o6h0.shimmering_image_stub_first;
                                                                                PlaceholderView placeholderView2 = (PlaceholderView) cma1.O(i6, goLinearLayout2);
                                                                                if (placeholderView2 != null) {
                                                                                    i6 = o6h0.shimmering_image_stub_second;
                                                                                    PlaceholderView placeholderView3 = (PlaceholderView) cma1.O(i6, goLinearLayout2);
                                                                                    if (placeholderView3 != null) {
                                                                                        i6 = o6h0.shimmering_image_stub_third;
                                                                                        PlaceholderView placeholderView4 = (PlaceholderView) cma1.O(i6, goLinearLayout2);
                                                                                        if (placeholderView4 != null) {
                                                                                            i6 = o6h0.shimmering_images_slider_frame;
                                                                                            LinearLayout linearLayout3 = (LinearLayout) cma1.O(i6, goLinearLayout2);
                                                                                            if (linearLayout3 != null) {
                                                                                                i6 = o6h0.shimmering_subtitle;
                                                                                                PlaceholderView placeholderView5 = (PlaceholderView) cma1.O(i6, goLinearLayout2);
                                                                                                if (placeholderView5 != null) {
                                                                                                    i6 = o6h0.shimmering_tags;
                                                                                                    LinearLayout linearLayout4 = (LinearLayout) cma1.O(i6, goLinearLayout2);
                                                                                                    if (linearLayout4 != null) {
                                                                                                        i6 = o6h0.shimmering_title;
                                                                                                        PlaceholderView placeholderView6 = (PlaceholderView) cma1.O(i6, goLinearLayout2);
                                                                                                        if (placeholderView6 != null) {
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        ny61.t("Missing required view with ID: ".concat(goLinearLayout2.getResources().getResourceName(i6)));
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i5)));
                break;
            case 13:
                ((Integer) obj2).getClass();
                com.yandex.go.design.compose.ratingbar.a.c(this.c, (m3u0) obj7, (m3u0) obj6, (m8i0) obj5, (String) obj3, (sls) obj4, (fid) obj, vng.O(i2 | 1));
                break;
            case 14:
                SettingsScreenRoot$lambda$18 = SettingsComposeFragment.SettingsScreenRoot$lambda$18((SettingsComposeFragment) obj7, (f530) obj6, (f) obj5, (jwy0) obj4, (e) obj3, this.c, this.w, (fid) obj, ((Integer) obj2).intValue());
                break;
            case 15:
                ((Integer) obj2).getClass();
                tcb1.a((f530) obj7, (qiy) obj6, (ehr0) obj5, (jt1) obj4, (zls) obj3, (fid) obj, vng.O(i3 | 1), this.w);
                break;
            case 16:
                ((Integer) obj2).getClass();
                com.yandex.go.taxi.summary.verticalsummary.ui.d.a((androidx.compose.foundation.lazy.b) obj7, (wg6) obj6, (Integer) obj5, (List) obj4, this.c, (jj2) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                erb1.e((jtz0) obj7, (wg6) obj5, (f530) obj4, (yur) obj3, (tls) obj6, (fid) obj, vng.O(i3 | 1), this.w);
                break;
            case 18:
                ((Integer) obj2).getClass();
                com.yandex.go.navigator.floating_control_buttons.compose.button.a.b((f530) obj7, (ButtonSize) obj6, (CustomButtonStyle) obj5, (sls) obj4, (r901) obj3, (fid) obj, vng.O(i3 | 1), this.w);
                break;
            default:
                ((Integer) obj2).getClass();
                xrb1.c((ibp0) obj7, (au2) obj6, (f530) obj5, (String) obj4, (wp2) obj3, (fid) obj, vng.O(i3 | 1), this.w);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ xg0(ph0 ph0Var, tls tlsVar, sls slsVar, tls tlsVar2, a aVar, int i, int i2) {
        this.a = 0;
        this.x = ph0Var;
        this.y = tlsVar;
        this.b = slsVar;
        this.z = tlsVar2;
        this.A = aVar;
        this.c = i;
        this.w = i2;
    }

    public /* synthetic */ xg0(sls slsVar, String str, String str2, wls wlsVar, zls zlsVar, int i, int i2) {
        this.a = 1;
        this.b = slsVar;
        this.x = str;
        this.y = str2;
        this.z = wlsVar;
        this.A = zlsVar;
        this.c = i;
        this.w = i2;
    }

    public /* synthetic */ xg0(pav pavVar, tt2 tt2Var, int i, int i2, a4j0 a4j0Var, ub60 ub60Var, wls wlsVar) {
        this.a = 12;
        this.x = pavVar;
        this.y = tt2Var;
        this.c = i;
        this.w = i2;
        this.z = a4j0Var;
        this.b = ub60Var;
        this.A = wlsVar;
    }

    public /* synthetic */ xg0(svy svyVar, sls slsVar, tls tlsVar, sls slsVar2, sls slsVar3, int i, int i2) {
        this.a = 11;
        this.x = svyVar;
        this.b = slsVar;
        this.y = tlsVar;
        this.z = slsVar2;
        this.A = slsVar3;
        this.c = i;
        this.w = i2;
    }

    public /* synthetic */ xg0(f530 f530Var, k43 k43Var, h43 h43Var, it1 it1Var, int i, int i2, androidx.compose.runtime.internal.a aVar, int i3) {
        this.a = 9;
        this.x = f530Var;
        this.y = k43Var;
        this.z = h43Var;
        this.b = it1Var;
        this.c = i;
        this.w = i2;
        this.A = aVar;
    }

    public /* synthetic */ xg0(jtz0 jtz0Var, wg6 wg6Var, f530 f530Var, yur yurVar, tls tlsVar, int i, int i2) {
        this.a = 17;
        this.x = jtz0Var;
        this.z = wg6Var;
        this.b = f530Var;
        this.A = yurVar;
        this.y = tlsVar;
        this.c = i;
        this.w = i2;
    }

    public /* synthetic */ xg0(androidx.compose.foundation.lazy.b bVar, wg6 wg6Var, Integer num, List list, int i, jj2 jj2Var, int i2) {
        this.a = 16;
        this.x = bVar;
        this.y = wg6Var;
        this.z = num;
        this.b = list;
        this.c = i;
        this.A = jj2Var;
        this.w = i2;
    }

    public /* synthetic */ xg0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        this.a = i3;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.b = obj4;
        this.A = obj5;
        this.c = i;
        this.w = i2;
    }

    public /* synthetic */ xg0(String str, f530 f530Var, ety0 ety0Var, wp2 wp2Var, sjy0 sjy0Var, int i, int i2, int i3) {
        this.a = 5;
        this.x = str;
        this.y = f530Var;
        this.z = ety0Var;
        this.b = wp2Var;
        this.A = sjy0Var;
        this.c = i;
        this.w = i2;
    }
}
