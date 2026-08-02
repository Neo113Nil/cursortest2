package com.yandex.passport.common.util;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.card.MaterialCardView;
import com.yandex.passport.internal.ui.bouncer.challenge.q;
import com.yandex.passport.internal.ui.bouncer.challenge.r;
import com.yandex.passport.internal.ui.challenge.changecurrent.s;
import com.yandex.passport.internal.ui.challenge.changecurrent.t;
import com.yandex.passport.internal.ui.challenge.logout.o;
import com.yandex.passport.internal.ui.challenge.logout.p;
import com.yandex.plus.home.feature.webviews.internal.stories.list.f;
import com.yandex.plus.pay.ui.common.api.ui.view.ProgressView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.onsale.OfferSwitchView;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleContentView;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.bdui.internal.ui.TarifficatorBduiScenarioActivity;
import com.yandex.plus.webview.api.WebViewContainer;
import defpackage.mkn;
import defpackage.s9f;
import defpackage.zh;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class e implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                try {
                    ((mkn) obj2).cancel();
                } catch (Throwable unused) {
                }
                return Unit.a;
            case 1:
                String str = ((com.yandex.passport.common.url.b) obj).a;
                str.getClass();
                ((r) obj2).k.a(new q(str));
                return Unit.a;
            case 2:
                String str2 = ((com.yandex.passport.common.url.b) obj).a;
                str2.getClass();
                ((t) obj2).k.a(new s(str2));
                return Unit.a;
            case 3:
                String str3 = ((com.yandex.passport.common.url.b) obj).a;
                str3.getClass();
                ((p) obj2).k.a(new o(str3));
                return Unit.a;
            case 4:
                String str4 = ((com.yandex.passport.common.url.b) obj).a;
                str4.getClass();
                com.yandex.passport.sloth.ui.d dVar = (com.yandex.passport.sloth.ui.d) obj2;
                dVar.getClass();
                try {
                    dVar.d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str4)));
                } catch (ActivityNotFoundException unused2) {
                }
                return Unit.a;
            case 5:
                ((zh) obj2).b();
                return Unit.a;
            case 6:
                s9f s9fVar = (s9f) obj;
                s9fVar.getClass();
                try {
                    View findViewById = ((f) obj2).findViewById(R.id.view_pager);
                    if (findViewById != null) {
                        return (ViewPager2) findViewById;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.viewpager2.widget.ViewPager2");
                } catch (ClassCastException e) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar, e);
                    return null;
                }
            case 7:
                s9f s9fVar2 = (s9f) obj;
                s9fVar2.getClass();
                try {
                    View findViewById2 = ((ProgressView) obj2).findViewById(R.id.progress_bar);
                    if (findViewById2 != null) {
                        return (ProgressBar) findViewById2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ProgressBar");
                } catch (ClassCastException e2) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar2, e2);
                    return null;
                }
            case 8:
                s9f s9fVar3 = (s9f) obj;
                s9fVar3.getClass();
                try {
                    View findViewById3 = ((OfferSwitchView) obj2).findViewById(R.id.offer_switch_card);
                    if (findViewById3 != null) {
                        return (MaterialCardView) findViewById3;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.google.android.material.card.MaterialCardView");
                } catch (ClassCastException e3) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar3, e3);
                    return null;
                }
            case 9:
                s9f s9fVar4 = (s9f) obj;
                s9fVar4.getClass();
                try {
                    View findViewById4 = ((TarifficatorBduiScenarioActivity) obj2).findViewById(R.id.bdui_progress_view);
                    if (findViewById4 != null) {
                        return (ProgressView) findViewById4;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.common.api.ui.view.ProgressView");
                } catch (ClassCastException e4) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar4, e4);
                    return null;
                }
            case 10:
                s9f s9fVar5 = (s9f) obj;
                s9fVar5.getClass();
                try {
                    View findViewById5 = ((com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.presale.c) obj2).requireView().findViewById(R.id.presale_content_view);
                    if (findViewById5 != null) {
                        return (PresaleContentView) findViewById5;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.internal.tarifficator.ui.presale.PresaleContentView");
                } catch (ClassCastException e5) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar5, e5);
                    return null;
                }
            default:
                s9f s9fVar6 = (s9f) obj;
                s9fVar6.getClass();
                try {
                    View findViewById6 = ((WebViewContainer) obj2).findViewById(R.id.plus_webview);
                    if (findViewById6 != null) {
                        return (WebView) findViewById6;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.webkit.WebView");
                } catch (ClassCastException e6) {
                    com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation.a.c(s9fVar6, e6);
                    return null;
                }
        }
    }
}
