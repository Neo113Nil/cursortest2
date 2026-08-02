package ru.yandex.taxi.maas.impl.ride.exitchoice;

import defpackage.bl00;
import defpackage.bms;
import defpackage.lmo;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class MaasExitChooseOverlay$attach$3 extends AdaptedFunctionReference implements bms {
    public static final MaasExitChooseOverlay$attach$3 a = new MaasExitChooseOverlay$attach$3(4, 4, Triple.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V");

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return new Triple((List) obj, (lmo) obj2, (bl00) obj3);
    }
}
