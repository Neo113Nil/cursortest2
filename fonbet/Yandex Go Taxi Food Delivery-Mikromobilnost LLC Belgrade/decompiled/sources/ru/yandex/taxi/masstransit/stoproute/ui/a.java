package ru.yandex.taxi.masstransit.stoproute.ui;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.ContextThemeWrapper;
import defpackage.avj0;
import defpackage.kyh0;
import defpackage.n340;
import defpackage.n440;
import defpackage.ny61;
import defpackage.q2h0;
import defpackage.r2v0;
import defpackage.scc;
import defpackage.tje;
import defpackage.v3l0;
import defpackage.vng;
import defpackage.vpr;
import defpackage.w511;
import defpackage.x3l0;
import defpackage.zuj0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.utils.CustomImageSpan;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ru.yandex.taxi.masstransit.stoproute.mapper.a b;

    public a(vpr vprVar, ru.yandex.taxi.masstransit.stoproute.mapper.a aVar) {
        this.a = vprVar;
        this.b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1 mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1;
        int i;
        int i2;
        if (continuation instanceof MtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1) {
            mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1 = (MtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1) continuation;
            int i3 = mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj2 = mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    x3l0 x3l0Var = (x3l0) obj;
                    zuj0 zuj0Var = this.b.b;
                    ArrayList arrayList = x3l0Var.c;
                    v3l0 v3l0Var = (v3l0) kotlin.collections.a.R(arrayList);
                    String str = v3l0Var != null ? v3l0Var.b : null;
                    if (str == null) {
                        str = "";
                    }
                    v3l0 v3l0Var2 = (v3l0) kotlin.collections.a.b0(arrayList);
                    String str2 = v3l0Var2 != null ? v3l0Var2.b : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    List singletonList = (str.length() == 0 && str2.length() == 0) ? EmptyList.a : str2.length() == 0 ? Collections.singletonList(new r2v0(2, null, str)) : scc.g(new r2v0(2, null, str), new r2v0(1, Integer.valueOf(q2h0.ic_stops_divider), null), new r2v0(2, null, str2));
                    int i4 = kyh0.mt_stop_routes_header_title;
                    switch (n340.b[x3l0Var.a.ordinal()]) {
                        case 1:
                            i2 = kyh0.mt_routes_bus;
                            break;
                        case 2:
                            i2 = kyh0.mt_routes_minibus;
                            break;
                        case 3:
                            i2 = kyh0.mt_routes_tramway;
                            break;
                        case 4:
                            i2 = kyh0.mt_routes_underground;
                            break;
                        case 5:
                            i2 = kyh0.mt_routes_railway;
                            break;
                        case 6:
                            i2 = kyh0.mt_routes_water;
                            break;
                        case 7:
                            i2 = kyh0.mt_routes_trolleybus;
                            break;
                        case 8:
                            i2 = kyh0.mt_routes_funicular;
                            break;
                        case 9:
                            i2 = kyh0.mt_routes_cabel;
                            break;
                        case 10:
                            i2 = kyh0.mt_routes_aero;
                            break;
                        case 11:
                            i2 = kyh0.mt_routes_shuttle;
                            break;
                        default:
                            w511.b();
                            return null;
                    }
                    avj0 avj0Var = (avj0) zuj0Var;
                    String h = avj0Var.h(i2);
                    ContextThemeWrapper contextThemeWrapper = avj0Var.a;
                    String i5 = avj0Var.i(i4, h, x3l0Var.b);
                    v3l0 v3l0Var3 = (v3l0) kotlin.collections.a.R(arrayList);
                    String str3 = v3l0Var3 != null ? v3l0Var3.b : null;
                    if (str3 == null) {
                        str3 = "";
                    }
                    v3l0 v3l0Var4 = (v3l0) kotlin.collections.a.b0(arrayList);
                    String str4 = v3l0Var4 != null ? v3l0Var4.b : null;
                    String str5 = str4 != null ? str4 : "";
                    int u = tje.u(6, contextThemeWrapper);
                    Drawable t = vng.t(q2h0.ic_mt_separator, contextThemeWrapper);
                    InsetDrawable insetDrawable = t != null ? new InsetDrawable(t, u, 0, u, 0) : null;
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) str3);
                    if (str5.length() > 0 && insetDrawable != null) {
                        spannableStringBuilder.append(" ", new CustomImageSpan(insetDrawable, 2, false, false, null, 28, null), 33);
                        spannableStringBuilder.append((CharSequence) str5);
                    }
                    new SpannedString(spannableStringBuilder);
                    n440 n440Var = new n440(i5, str, str2, singletonList);
                    mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1.L$0 = null;
                    mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1.L$1 = null;
                    mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1.L$2 = null;
                    mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1.L$3 = null;
                    mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(n440Var, mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1) == coroutineSingletons) {
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
        mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1 = new MtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mtStopRouteUiStateInteractor$initializeData$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
