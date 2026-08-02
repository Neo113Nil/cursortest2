package ru.yandex.taxi.summary.solid;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import defpackage.f540;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final /* synthetic */ class SolidSummaryCommunicationsDelegate$hideNotification$1 extends FunctionReferenceImpl implements sls {
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m730invoke() {
        d dVar = (d) this.receiver;
        f540 f540Var = dVar.m;
        float f = 0.0f;
        f540Var.b.setTranslationY(0.0f);
        LinearLayout linearLayout = dVar.d;
        linearLayout.removeView(f540Var.b);
        ImageView imageView = dVar.f;
        View childAt = linearLayout.getChildAt(1);
        if (childAt != null) {
            float y = childAt.getY() - imageView.getHeight();
            if (y >= 0.0f) {
                f = y;
            }
        }
        imageView.setTranslationY(f);
        dVar.x = true;
        dVar.r = SolidSummaryCommunicationsDelegate$NotificationState.HIDDEN;
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m730invoke();
        return zy11.a;
    }
}
