package ru.yandex.taxi.logistics.sdk.mission_details;

import android.view.WindowManager;
import com.adjust.sdk.Constants;
import defpackage.g8e;
import defpackage.ij20;
import defpackage.jwh;
import defpackage.r1s;
import defpackage.sk7;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.logistics.sdk.mission_details.ui.confetti.xml.ConfettiView;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class MissionDetailsScreen$getView$1$1$1$1$1$2$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        String str = (String) obj;
        b bVar = (b) this.receiver;
        sk7 sk7Var = bVar.x;
        r1s r1sVar = (r1s) sk7Var.w;
        if (r1sVar != null) {
            ((WindowManager) r1sVar.c).removeViewImmediate((ConfettiView) r1sVar.b);
        }
        sk7Var.w = null;
        ij20 ij20Var = bVar.w;
        String str2 = bVar.c.a;
        jwh jwhVar = ij20Var.a;
        jwhVar.a.o("DeliveryMission.Details.ActionTapped", null, g8e.y(Constants.DEEPLINK, str, "mission_id", str2));
        bVar.b.b.invoke(str);
        return zy11.a;
    }
}
