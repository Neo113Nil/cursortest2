package ru.yandex.taxi.logistics.sdk.mission_details;

import android.view.WindowManager;
import defpackage.r1s;
import defpackage.sk7;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.logistics.sdk.mission_details.ui.confetti.xml.ConfettiView;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class MissionDetailsScreen$getView$1$1$1$1$1$4$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        sk7 sk7Var = ((b) this.receiver).x;
        r1s r1sVar = (r1s) sk7Var.w;
        if (r1sVar != null) {
            ((WindowManager) r1sVar.c).removeViewImmediate((ConfettiView) r1sVar.b);
        }
        sk7Var.w = null;
        return zy11.a;
    }
}
