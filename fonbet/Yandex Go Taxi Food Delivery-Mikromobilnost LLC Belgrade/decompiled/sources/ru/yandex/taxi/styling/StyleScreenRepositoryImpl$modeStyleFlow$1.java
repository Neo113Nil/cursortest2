package ru.yandex.taxi.styling;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.bms;
import defpackage.e430;
import defpackage.pxu0;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class StyleScreenRepositoryImpl$modeStyleFlow$1 extends AdaptedFunctionReference implements bms {
    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        e430 e430Var = (e430) obj;
        e430 e430Var2 = (e430) obj2;
        ((g) this.receiver).getClass();
        int i = pxu0.a[((Screen) obj3).ordinal()];
        return (i == 1 || i == 2) ? e430Var2 : e430Var;
    }
}
