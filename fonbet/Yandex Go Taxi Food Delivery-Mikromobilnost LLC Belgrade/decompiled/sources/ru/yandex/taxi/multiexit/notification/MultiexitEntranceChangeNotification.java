package ru.yandex.taxi.multiexit.notification;

import android.content.Context;
import defpackage.g18;
import defpackage.g3o;
import defpackage.nac;
import defpackage.pav;
import defpackage.scc;
import defpackage.xq40;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.NotificationTimedItemComponent;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lru/yandex/taxi/multiexit/notification/MultiexitEntranceChangeNotification;", "Lru/yandex/taxi/design/NotificationTimedItemComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Lpav;", "imageLoader", "Lg3o;", ClidProvider.STATE, "<init>", "(Landroid/content/Context;Lpav;Lg3o;)V", "Lzy11;", "tryAnnounceForAccessibility", "()V", "onAttachedToWindow", "onDetachedFromWindow", "contentView", "Lru/yandex/taxi/design/ListItemComponent;", "Lg18;", "loadImageCancelable", "Lg18;", "", "getNotificationId", "()Ljava/lang/String;", "notificationId", "Companion", "xq40", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MultiexitEntranceChangeNotification extends NotificationTimedItemComponent<ListItemComponent> {
    public static final xq40 Companion = new xq40();
    public static final String NOTIFICATION_ID = "MULTIEXIT_CHANGE_NOTIFICATION";
    private final ListItemComponent contentView;
    private g18 loadImageCancelable;

    public MultiexitEntranceChangeNotification(Context context, pav pavVar, g3o g3oVar) {
        super(context, null, 0, 6, null);
        ListItemComponent listItemComponent = new ListItemComponent(context, null, 0, 6, null);
        this.contentView = listItemComponent;
        addView(listItemComponent);
        listItemComponent.setTitle(g3oVar.a);
        listItemComponent.setSubtitle(g3oVar.b);
        String str = g3oVar.c;
        if (str.length() > 0) {
            this.loadImageCancelable = ((nac) pavVar.a(listItemComponent.getLeadImageView())).c(str);
        }
        long j = g3oVar.d;
        if (j > 0) {
            startExpiresTimer(TimeUnit.SECONDS.toMillis(j));
        }
    }

    private final void tryAnnounceForAccessibility() {
        List g = scc.g(this.contentView.getTitleText(), this.contentView.getSubtitleText());
        ArrayList arrayList = new ArrayList();
        for (Object obj : g) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        String X = a.X(arrayList, Extension.FIX_SPACE, null, null, null, 62);
        if (X.length() > 0) {
            announceForAccessibility(X);
        }
    }

    @Override // ru.yandex.taxi.design.NotificationItemComponent
    /* renamed from: getNotificationId */
    public String getUid() {
        return NOTIFICATION_ID;
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        tryAnnounceForAccessibility();
    }

    @Override // ru.yandex.taxi.design.NotificationTimedItemComponent, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        g18 g18Var = this.loadImageCancelable;
        if (g18Var != null) {
            g18Var.cancel();
        }
        super.onDetachedFromWindow();
    }
}
