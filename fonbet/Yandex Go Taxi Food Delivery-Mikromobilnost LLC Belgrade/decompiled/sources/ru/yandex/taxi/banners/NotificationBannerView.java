package ru.yandex.taxi.banners;

import android.app.Activity;
import android.net.Uri;
import android.widget.FrameLayout;
import defpackage.bdc;
import defpackage.cay0;
import defpackage.cc;
import defpackage.cdc;
import defpackage.evu0;
import defpackage.fd60;
import defpackage.g8e;
import defpackage.gep0;
import defpackage.h0h;
import defpackage.h1p;
import defpackage.hr4;
import defpackage.ir4;
import defpackage.klf0;
import defpackage.mqg0;
import defpackage.n9y0;
import defpackage.nac;
import defpackage.p3h;
import defpackage.pav;
import defpackage.pdc;
import defpackage.q5z;
import defpackage.ruc;
import defpackage.tg60;
import defpackage.tje;
import defpackage.ufu;
import defpackage.wg60;
import defpackage.xg60;
import defpackage.xng0;
import defpackage.xsv0;
import defpackage.zpf0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.communications.n;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListItemSwitchComponent;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.design.NotificationStackComponent;
import ru.yandex.taxi.promotions.model.PromotionBackground;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001*B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u001e\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006+"}, d2 = {"Lru/yandex/taxi/banners/NotificationBannerView;", "Lru/yandex/taxi/design/NotificationItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Lwg60;", "Landroid/app/Activity;", "context", "Lru/yandex/taxi/banners/e;", "presenter", "Lir4;", "assetsStorage", "Lpav;", "imageLoader", "Lpdc;", "colorConverter", "Ltg60;", "banner", "<init>", "(Landroid/app/Activity;Lru/yandex/taxi/banners/e;Lir4;Lpav;Lpdc;Ltg60;)V", "Lzy11;", "onAttachNotification", "()V", "", "removedManually", "onDetachNotification", "(Z)V", "", "text", "title", "updateText", "(Ljava/lang/CharSequence;Z)V", "onNotificationClick", "toggleSwitch", "Lru/yandex/taxi/banners/e;", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "", "getNotificationPriority", "()I", "notificationPriority", "Companion", "xg60", "banners"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NotificationBannerView extends NotificationItemComponent<ListItemComponent> implements wg60 {
    public static final xg60 Companion = new xg60();
    private final e presenter;

    public NotificationBannerView(Activity activity, e eVar, ir4 ir4Var, pav pavVar, pdc pdcVar, tg60 tg60Var) {
        super(activity, null, 0, 6, null);
        ListItemComponent listItemComponent;
        this.presenter = eVar;
        Companion.getClass();
        BannerWidgets bannerWidgets = tg60Var.o;
        BannerWidgets.d dVar = bannerWidgets.f;
        BannerWidgets.h hVar = bannerWidgets.g;
        if (hVar != null) {
            ListItemSwitchComponent listItemSwitchComponent = new ListItemSwitchComponent(activity, null, 0, 6, null);
            listItemSwitchComponent.setTrackColors(q5z.Q(activity.getColor(mqg0.component_accent_color), hVar.a), q5z.R(activity, mqg0.component_gray_175, hVar.b));
            listItemComponent = listItemSwitchComponent;
        } else {
            ListItemComponent listItemComponent2 = new ListItemComponent(activity, null, 0, 6, null);
            listItemComponent = listItemComponent2;
            if (dVar != null) {
                listItemComponent2.getNavigationIconParams().b = ((ufu) pdcVar).h(new bdc(xng0.textMain), dVar.c);
                listItemComponent2.setTrailMode(2);
                listItemComponent = listItemComponent2;
            }
        }
        listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        listItemComponent.setBackground(null);
        setChild(listItemComponent);
        TypedContentWidget typedContentWidget = tg60Var.l;
        if (typedContentWidget != null) {
            listItemComponent.setTitle(eVar.h(typedContentWidget, true));
            listItemComponent.setTitleTextColor(((ufu) pdcVar).h(new cdc(getContext().getColor(mqg0.component_black)), typedContentWidget.b));
        }
        TypedContentWidget typedContentWidget2 = tg60Var.m;
        if (typedContentWidget2 != null) {
            listItemComponent.setSubtitle(eVar.h(typedContentWidget2, false));
            listItemComponent.setSubtitleTextColor(((ufu) pdcVar).h(new cdc(getContext().getColor(mqg0.component_gray_300)), typedContentWidget2.b));
        }
        String a = hr4.a(ir4Var, tg60Var.n);
        if (a == null || a.length() == 0) {
            return;
        }
        int u = tje.u(60, getContext());
        int u2 = tje.u(6, getContext());
        listItemComponent.setLeadImageSize(u);
        listItemComponent.setLeadImagePadding(u2, 0, u2, 0);
        nac nacVar = (nac) pavVar.a(listItemComponent.getLeadImageView());
        nacVar.i = new cc(listItemComponent, 4);
        nacVar.c(a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(ListItemComponent listItemComponent) {
        listItemComponent.clearLeadView();
        return zy11.a;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getId() {
        return this.presenter.f();
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public int getNotificationPriority() {
        return 3;
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onAttachNotification() {
        e eVar = this.presenter;
        eVar.c(this);
        eVar.p = eVar.m.a();
        klf0 klf0Var = eVar.k;
        tg60 tg60Var = eVar.e;
        cay0 cay0Var = (cay0) eVar.j;
        ((n9y0) klf0Var).g(tg60Var, cay0Var.b(), null);
        eVar.l.d(tg60Var, cay0Var.b());
        cay0Var.a(eVar.q);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onDetachNotification(boolean removedManually) {
        super.onDetachNotification(removedManually);
        if (removedManually) {
            e eVar = this.presenter;
            eVar.g();
            klf0 klf0Var = eVar.k;
            ((n9y0) klf0Var).f(eVar.e, ((cay0) eVar.j).b(), PromotionBackground.Type.COLOR, 0, Long.valueOf(eVar.m.a() - eVar.p));
        }
        this.presenter.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f8  */
    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onNotificationClick() {
        String str;
        String b;
        e eVar = this.presenter;
        gep0 gep0Var = eVar.j;
        zpf0 zpf0Var = eVar.l;
        tg60 tg60Var = eVar.e;
        BannerWidgets bannerWidgets = tg60Var.o;
        BannerWidgets.d dVar = bannerWidgets.f;
        if (bannerWidgets.g != null) {
            zpf0Var.c(tg60Var, ((cay0) gep0Var).b());
            ((wg60) eVar.a).toggleSwitch();
            return;
        }
        if (dVar != null) {
            NotificationStackComponent notificationStackComponent = eVar.h;
            cay0 cay0Var = (cay0) gep0Var;
            zpf0Var.c(tg60Var, cay0Var.b());
            String str2 = null;
            ((n9y0) eVar.k).c(eVar.e, cay0Var.b(), null, dVar.a, null, null, 0, 1, eVar.m.a() - eVar.p, PromotionBackground.Type.COLOR);
            ruc rucVar = eVar.f;
            ru.yandex.taxi.communications.a aVar = eVar.g;
            BannerType bannerType = BannerType.NOTIFICATION;
            String str3 = dVar.a;
            String str4 = dVar.b;
            boolean z = false;
            if (str3 != null && !evu0.J(str3)) {
                if ("webview".equals(str4)) {
                    ((n) rucVar).b(str3, false);
                } else {
                    aVar.a(str3, bannerType, null);
                }
            }
            notificationStackComponent.closeNotification(eVar.f());
            if (str3.length() != 0) {
                z = true;
                if (!"webview".equals(str4)) {
                    Uri parse = Uri.parse(str3);
                    p3h p3hVar = cay0Var.b;
                    p3hVar.getClass();
                    if ("external".equalsIgnoreCase(parse.getAuthority())) {
                        p3hVar.a.getClass();
                        h1p h1pVar = xsv0.a(parse).a;
                        if (h1pVar != null) {
                            str = g8e.o("super_app_", h1pVar.getValue());
                            b = cay0Var.b();
                            if (b == null) {
                                b = "";
                            }
                            z = true ^ str.equals(b);
                        }
                        str = "#none#";
                        b = cay0Var.b();
                        if (b == null) {
                        }
                        z = true ^ str.equals(b);
                    } else {
                        Iterator it = ((List) p3h.b.getValue()).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Pair pair = (Pair) it.next();
                            h0h h0hVar = (h0h) pair.getFirst();
                            String str5 = (String) pair.getSecond();
                            if (!h0hVar.b(parse)) {
                                str5 = null;
                            }
                            if (str5 != null) {
                                str2 = str5;
                                break;
                            }
                        }
                        if (str2 != null) {
                            str = str2;
                            b = cay0Var.b();
                            if (b == null) {
                            }
                            z = true ^ str.equals(b);
                        }
                        str = "#none#";
                        b = cay0Var.b();
                        if (b == null) {
                        }
                        z = true ^ str.equals(b);
                    }
                }
            }
            if (z) {
                notificationStackComponent.closeNotifications(new fd60(3));
            } else {
                notificationStackComponent.closeList();
            }
            eVar.g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wg60
    public void toggleSwitch() {
        T child = getChild();
        ListItemSwitchComponent listItemSwitchComponent = child instanceof ListItemSwitchComponent ? (ListItemSwitchComponent) child : null;
        if (listItemSwitchComponent != null) {
            listItemSwitchComponent.toggle();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wg60
    public void updateText(CharSequence text, boolean title) {
        ListItemComponent listItemComponent = (ListItemComponent) getChild();
        if (listItemComponent == null) {
            return;
        }
        if (title) {
            listItemComponent.setTitle(text);
        } else {
            listItemComponent.setSubtitle(text);
        }
    }
}
