package ru.yandex.taxi.routeselector.presentation;

import android.text.SpannableStringBuilder;
import defpackage.avj0;
import defpackage.ik31;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.u8l0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.text.Regex;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ u8l0 b;

    public a(vpr vprVar, u8l0 u8l0Var) {
        this.a = vprVar;
        this.b = u8l0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RouteSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1 routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1;
        int i;
        Pair pair;
        if (continuation instanceof RouteSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1) {
            routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1 = (RouteSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1) continuation;
            int i2 = routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ik31 ik31Var = (ik31) obj;
                    PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState = ik31Var.c;
                    PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState2 = PriceUpdate$PriceLoadingState.LOADING;
                    u8l0 u8l0Var = this.b;
                    if (priceUpdate$PriceLoadingState == priceUpdate$PriceLoadingState2) {
                        pair = new Pair(((avj0) u8l0Var.c).h(kyh0.route_selector_pin_loading_bubble), Boolean.TRUE);
                    } else {
                        pex0 pex0Var = ik31Var.b.a;
                        int i3 = pex0Var.h.a;
                        String str = pex0Var.r.a;
                        String e = pex0Var.e();
                        avj0 avj0Var = (avj0) u8l0Var.c;
                        String h = avj0Var.h(u8l0Var.a.b() ? i3 >= 0 ? kyh0.route_selector_pin_src_bubble : kyh0.route_selector_pin_src_bubble_without_eta : (str == null || str.length() == 0) ? kyh0.route_selector_pin_src_bubble_without_eta : kyh0.route_selector_pin_dest_bubble);
                        String h2 = avj0Var.h(kyh0.common_minutes_sign);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (String str2 : (String[]) new Regex("(?=\\{)|(?<=\\})").l(0, h).toArray(new String[0])) {
                            int hashCode = str2.hashCode();
                            if (hashCode == -1049871006) {
                                if (str2.equals("{routetime}")) {
                                    u8l0.a(spannableStringBuilder, str);
                                }
                                spannableStringBuilder.append((CharSequence) str2);
                            } else if (hashCode != 116716582) {
                                if (hashCode == 808775823 && str2.equals("{price}")) {
                                    u8l0.a(spannableStringBuilder, e);
                                }
                                spannableStringBuilder.append((CharSequence) str2);
                            } else {
                                if (str2.equals("{eta}")) {
                                    u8l0.a(spannableStringBuilder, String.format("%s %s", Arrays.copyOf(new Object[]{Integer.valueOf(i3), h2}, 2)));
                                }
                                spannableStringBuilder.append((CharSequence) str2);
                            }
                        }
                        pair = new Pair(spannableStringBuilder, Boolean.FALSE);
                    }
                    routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1.L$0 = null;
                    routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1.L$1 = null;
                    routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1.L$2 = null;
                    routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1.L$3 = null;
                    routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(pair, routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1 = new RouteSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorBubbleInteractor$bubbleTariffFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
