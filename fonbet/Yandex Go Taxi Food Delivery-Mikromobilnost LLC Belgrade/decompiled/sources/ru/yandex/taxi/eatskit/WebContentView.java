package ru.yandex.taxi.eatskit;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.yandex.go.payments.shared.business.accountcreation.corp.personalaccount.splash.CorpPersonalAccountSplashView;
import defpackage.cst0;
import defpackage.cvq0;
import defpackage.ert0;
import defpackage.fen;
import defpackage.gyc;
import defpackage.h3c0;
import defpackage.rme;
import defpackage.wp01;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ9\u0010\u0013\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/eatskit/WebContentView;", "Lru/yandex/taxi/eatskit/ContentView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lrme;", "controller", "Lfen;", "splash", "Lcvq0;", "serviceConfig", "Lert0;", "placeHolderProvider", "Lzy11;", "init", "(Lrme;Lfen;Lcvq0;Lert0;)V", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebContentView extends ContentView {
    public /* synthetic */ WebContentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void init$default(WebContentView webContentView, rme rmeVar, fen fenVar, cvq0 cvq0Var, ert0 ert0Var, int i, Object obj) {
        if ((i & 8) != 0) {
            ert0Var = null;
        }
        webContentView.init(rmeVar, fenVar, cvq0Var, ert0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cst0 init$lambda$0(WebContentView webContentView, fen fenVar, ert0 ert0Var) {
        h3c0 placeHolderFactory = webContentView.getPlaceHolderFactory();
        FrameLayout servicePlaceholderView = webContentView.getServicePlaceholderView();
        if (ert0Var == null) {
            placeHolderFactory.getClass();
            return placeHolderFactory.a(fenVar.getLayoutRes(), servicePlaceholderView);
        }
        CorpPersonalAccountSplashView corpPersonalAccountSplashView = new CorpPersonalAccountSplashView(placeHolderFactory.a, null, 0, 0, 14, null);
        corpPersonalAccountSplashView.setDrawable((Drawable) ((gyc) ert0Var).a);
        servicePlaceholderView.addView(corpPersonalAccountSplashView);
        return corpPersonalAccountSplashView;
    }

    public final void init(rme controller, fen splash, cvq0 serviceConfig, ert0 placeHolderProvider) {
        init(controller, 0, xng0.textMain, serviceConfig, new wp01(7, this, splash, placeHolderProvider));
    }

    public WebContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public WebContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WebContentView(Context context) {
        this(context, null, 0, 6, null);
    }

    public final void init(rme rmeVar, fen fenVar, cvq0 cvq0Var) {
        init$default(this, rmeVar, fenVar, cvq0Var, null, 8, null);
    }
}
