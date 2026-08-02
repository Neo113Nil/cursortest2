package ru.yandex.taxi.zalogin;

import android.view.View;
import defpackage.fhz;
import defpackage.hky;
import defpackage.qeb1;
import defpackage.rx2;
import defpackage.vsn;
import defpackage.zi;
import java.util.HashMap;
import kotlin.Metadata;
import ru.yandex.taxi.analytics.Events$Zalogin$LinkageContext;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"ru/yandex/taxi/zalogin/LinkAccountsViewFactoryImpl$createLinkAccountsView$1", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Lzy11;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "v", "onViewDetachedFromWindow", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LinkAccountsViewFactoryImpl$createLinkAccountsView$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ ListItemComponent $linkAccountsView;
    final /* synthetic */ Events$Zalogin$LinkageContext $linkageContext;
    final /* synthetic */ hky this$0;

    public LinkAccountsViewFactoryImpl$createLinkAccountsView$1(ListItemComponent listItemComponent, hky hkyVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext) {
        this.$linkAccountsView = listItemComponent;
        this.this$0 = hkyVar;
        this.$linkageContext = events$Zalogin$LinkageContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onViewAttachedToWindow$lambda$0(hky hkyVar, Events$Zalogin$LinkageContext events$Zalogin$LinkageContext, View view) {
        fhz fhzVar = hkyVar.b;
        rx2 rx2Var = fhzVar.e;
        Long f = fhzVar.f();
        String name = events$Zalogin$LinkageContext.name();
        rx2Var.getClass();
        HashMap hashMap = new HashMap();
        if (f != null) {
            hashMap.put("uid", f);
        }
        if (name != null) {
            hashMap.put("context", name);
        }
        rx2Var.a.a("Zalogin.LoginYandexTap", hashMap, 1, new HashMap());
        d dVar = hkyVar.a;
        dVar.b(events$Zalogin$LinkageContext, qeb1.b(dVar.e), new zi(21), new zi(21));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.$linkAccountsView.setOnClickListener(new vsn(22, this.this$0, this.$linkageContext));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        this.$linkAccountsView.removeOnAttachStateChangeListener(this);
        this.$linkAccountsView.setOnClickListener(null);
    }
}
