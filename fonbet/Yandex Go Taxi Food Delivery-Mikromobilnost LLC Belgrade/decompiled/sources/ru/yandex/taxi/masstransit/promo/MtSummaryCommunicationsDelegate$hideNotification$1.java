package ru.yandex.taxi.masstransit.promo;

import android.view.View;
import android.widget.ImageView;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class MtSummaryCommunicationsDelegate$hideNotification$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        a aVar = (a) this.receiver;
        GoLinearLayout goLinearLayout = aVar.a;
        float f = 0.0f;
        goLinearLayout.setTranslationY(0.0f);
        goLinearLayout.removeView(aVar.d.b);
        ImageView imageView = aVar.b;
        View childAt = goLinearLayout.getChildAt(1);
        if (childAt != null) {
            float y = childAt.getY() - imageView.getHeight();
            if (y >= 0.0f) {
                f = y;
            }
        }
        imageView.setTranslationY(f);
        aVar.h = true;
        aVar.e = NotificationState.HIDDEN;
        return zy11.a;
    }
}
