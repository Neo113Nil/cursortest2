package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.complete_buttons;

import defpackage.az6;
import defpackage.b4u0;
import defpackage.io9;
import defpackage.lzr;
import defpackage.myc;
import defpackage.ryc;
import defpackage.uzc;
import defpackage.zls;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.ButtonType;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class CompleteButtonsStateHolder$completeButtonsFlow$1 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        uzc uzcVar = (uzc) obj;
        Map map = (Map) obj2;
        b bVar = (b) this.receiver;
        myc mycVar = null;
        if (uzcVar == null) {
            bVar.getClass();
            return null;
        }
        io9 io9Var = bVar.a;
        io9Var.getClass();
        ButtonType buttonType = ButtonType.PRIMARY;
        Boolean bool = Boolean.FALSE;
        boolean booleanValue = ((Boolean) map.getOrDefault(buttonType, bool)).booleanValue();
        b4u0 b4u0Var = uzcVar.a;
        String str = b4u0Var.a;
        az6 az6Var = b4u0Var.b;
        ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a aVar = (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.common.mappers.a) io9Var.a;
        myc mycVar2 = new myc(str, az6Var, aVar.d("controlMain"), aVar.d("textOnControl"), lzr.E, booleanValue);
        b4u0 b4u0Var2 = uzcVar.b;
        if (b4u0Var2 != null) {
            mycVar = new myc(b4u0Var2.a, b4u0Var2.b, aVar.d("controlMinor"), aVar.d("textOnControlMinor"), lzr.D, ((Boolean) map.getOrDefault(ButtonType.SECONDARY, bool)).booleanValue());
        }
        return new ryc(mycVar2, mycVar);
    }
}
