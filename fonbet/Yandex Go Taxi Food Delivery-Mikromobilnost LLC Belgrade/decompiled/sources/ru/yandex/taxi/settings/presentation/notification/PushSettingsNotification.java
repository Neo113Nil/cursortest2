package ru.yandex.taxi.settings.presentation.notification;

import android.content.Context;
import defpackage.cne0;
import defpackage.f4g0;
import defpackage.o1g0;
import defpackage.pav;
import defpackage.sls;
import defpackage.tje;
import defpackage.tse0;
import defpackage.u500;
import defpackage.u8w;
import defpackage.v2g0;
import defpackage.v7j;
import defpackage.w2g0;
import defpackage.w3g0;
import defpackage.w511;
import defpackage.x500;
import defpackage.y3g0;
import defpackage.y4a0;
import defpackage.zy11;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationItemComponent;
import ru.yandex.taxi.design.utils.c;
import ru.yandex.taxi.settings.analytics.NotificationCloseReason;
import ru.yandex.taxi.settings.main.MainMenuProcessor$MenuEntry;
import ru.yandex.taxi.settings.model.PushSettingsOpenReason;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u00060\u0016R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/settings/presentation/notification/PushSettingsNotification;", "Lru/yandex/taxi/design/NotificationItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Ly3g0;", "presenter", "<init>", "(Landroid/content/Context;Lpav;Ly3g0;)V", "Lzy11;", "onAttachNotification", "()V", "", "removedManually", "onDetachNotification", "(Z)V", "Lpav;", "Ly3g0;", "listItem", "Lru/yandex/taxi/design/ListItemComponent;", "Lw3g0;", "mvpView", "Lw3g0;", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PushSettingsNotification extends NotificationItemComponent<ListItemComponent> {
    private final pav imageLoader;
    private final ListItemComponent listItem;
    private final w3g0 mvpView;
    private final y3g0 presenter;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* renamed from: ru.yandex.taxi.settings.presentation.notification.PushSettingsNotification$1, reason: invalid class name */
    public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements sls {
        @Override // defpackage.sls
        public final Object invoke() {
            y3g0 y3g0Var = (y3g0) this.receiver;
            w2g0 w2g0Var = y3g0Var.z;
            if (w2g0Var instanceof f4g0) {
                x500 x500Var = y3g0Var.A;
                PushSettingsOpenReason pushSettingsOpenReason = PushSettingsOpenReason.PUSH;
                u500 u500Var = x500Var.a;
                u500Var.getClass();
                u500Var.c(MainMenuProcessor$MenuEntry.PUSH_SETTINGS, pushSettingsOpenReason);
            } else {
                if (!(w2g0Var instanceof o1g0)) {
                    w511.b();
                    return null;
                }
                y3g0Var.y.a();
            }
            y4a0 y4a0Var = y3g0Var.E;
            u8w u8wVar = (u8w) y4a0Var.b;
            String b = ((w2g0) y4a0Var.c).b();
            u8wVar.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("notification_type", b);
            u8wVar.a.a("PushSettingsNotification.Tapped", hashMap, 1, new HashMap());
            y3g0Var.D.c(w2g0Var.c());
            y3g0Var.x.a.a.u(w2g0Var.c().concat("_is_interacted_with"), true);
            return zy11.a;
        }
    }

    public PushSettingsNotification(Context context, pav pavVar, y3g0 y3g0Var) {
        super(context, null, 0, 6, null);
        this.imageLoader = pavVar;
        this.presenter = y3g0Var;
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        listItemComponent.setTrailMode(2);
        this.listItem = listItemComponent;
        this.mvpView = new w3g0(this);
        setChild(listItemComponent);
        c.z(new AnonymousClass1(0, y3g0Var, y3g0.class, "onNotificationClicked", "onNotificationClicked()V", 0), this);
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getUid() {
        return this.presenter.z.c();
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onAttachNotification() {
        super.onAttachNotification();
        y3g0 y3g0Var = this.presenter;
        y3g0Var.Bg(this.mvpView);
        tje.N(y3g0Var.Jg(), null, null, new PushSettingsNotificationPresenter$attachView$$inlined$collectIn$1(y3g0Var.B.a.a(), null, y3g0Var), 3);
        v2g0 v2g0Var = y3g0Var.x;
        String c = y3g0Var.z.c();
        v7j v7jVar = v2g0Var.a;
        int i = v7jVar.a.i(c.concat("_show_count"), 0) + 1;
        long currentTimeMillis = System.currentTimeMillis();
        cne0 cne0Var = v7jVar.a;
        cne0Var.q(currentTimeMillis, c.concat("_last_shown_timestamp"));
        cne0Var.p(i, c.concat("_show_count"));
        y4a0 y4a0Var = y3g0Var.E;
        u8w u8wVar = (u8w) y4a0Var.b;
        String b = ((w2g0) y4a0Var.c).b();
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("notification_type", b);
        u8wVar.a.a("PushSettingsNotification.Shown", hashMap, 1, new HashMap());
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    public void onDetachNotification(boolean removedManually) {
        super.onDetachNotification(removedManually);
        this.presenter.Cg();
        y3g0 y3g0Var = this.presenter;
        y3g0Var.getClass();
        NotificationCloseReason notificationCloseReason = removedManually ? NotificationCloseReason.SWIPE : NotificationCloseReason.NEW_SCREEN;
        y4a0 y4a0Var = y3g0Var.E;
        u8w u8wVar = (u8w) y4a0Var.b;
        String value = notificationCloseReason.getValue();
        String b = ((w2g0) y4a0Var.c).b();
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        if (value != null) {
            hashMap.put("close_reason", value);
        }
        u8wVar.a.a("PushSettingsNotification.Closed", hashMap, 1, tse0.r("notification_type", hashMap, b));
    }
}
