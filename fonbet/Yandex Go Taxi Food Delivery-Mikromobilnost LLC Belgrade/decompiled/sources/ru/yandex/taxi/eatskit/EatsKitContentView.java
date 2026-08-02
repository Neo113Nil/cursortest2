package ru.yandex.taxi.eatskit;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.cst0;
import defpackage.cvq0;
import defpackage.fen;
import defpackage.h1p;
import defpackage.h3c0;
import defpackage.rme;
import defpackage.ymj;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/eatskit/EatsKitContentView;", "Lru/yandex/taxi/eatskit/ContentView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lrme;", "controller", "Lh1p;", Constants.KEY_SERVICE, "Lfen;", "splash", "Lcvq0;", "serviceConfig", "Lzy11;", "init", "(Lrme;Lh1p;Lfen;Lcvq0;)V", "eatskit"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class EatsKitContentView extends ContentView {
    public /* synthetic */ EatsKitContentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cst0 init$lambda$0(EatsKitContentView eatsKitContentView, fen fenVar) {
        h3c0 placeHolderFactory = eatsKitContentView.getPlaceHolderFactory();
        FrameLayout servicePlaceholderView = eatsKitContentView.getServicePlaceholderView();
        placeHolderFactory.getClass();
        return placeHolderFactory.a(fenVar.getLayoutRes(), servicePlaceholderView);
    }

    public final void init(rme controller, h1p service, fen splash, cvq0 serviceConfig) {
        init(controller, service.getLogoId(), service.getLogoColorId(), serviceConfig, new ymj(19, this, splash));
    }

    public EatsKitContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public EatsKitContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public EatsKitContentView(Context context) {
        this(context, null, 0, 6, null);
    }
}
