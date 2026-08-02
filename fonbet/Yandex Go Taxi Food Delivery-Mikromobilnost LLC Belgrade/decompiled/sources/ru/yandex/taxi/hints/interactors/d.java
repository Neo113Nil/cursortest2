package ru.yandex.taxi.hints.interactors;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.EditAction;
import defpackage.a81;
import defpackage.avj0;
import defpackage.kyh0;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.q5z;
import defpackage.qje;
import defpackage.vpr;
import defpackage.xng0;
import defpackage.zuj0;
import defpackage.zxs0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ pv0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ zxs0 x;

    public d(vpr vprVar, pv0 pv0Var, String str, boolean z, zxs0 zxs0Var) {
        this.a = vprVar;
        this.b = pv0Var;
        this.c = str;
        this.w = z;
        this.x = zxs0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TitleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1 titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1;
        int i;
        a81 a81Var;
        a81 a81Var2;
        Address address;
        if (continuation instanceof TitleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1) {
            titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1 = (TitleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1) continuation;
            int i2 = titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.label;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    CharSequence charSequence = (CharSequence) obj;
                    int length = charSequence.length();
                    zxs0 zxs0Var = this.x;
                    if (length == 0) {
                        charSequence = ((avj0) ((zuj0) zxs0Var.b)).h(kyh0.address_search_modal_view_to);
                    }
                    int i3 = 2;
                    pv0 pv0Var = this.b;
                    if (pv0Var == null || (address = pv0Var.a) == null) {
                        String str2 = this.c;
                        if (str2 == null) {
                            str2 = "";
                        }
                        a81Var = new a81(str2, charSequence, i3);
                    } else {
                        EditAction editAction = address.getAddress().v;
                        String F = q5z.F(address);
                        EditAction editAction2 = EditAction.CLEAR;
                        int i4 = 3;
                        if (editAction == editAction2 && !this.w) {
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(F);
                            spannableStringBuilder.setSpan(new ForegroundColorSpan(qje.t(xng0.textMain, ((avj0) ((zuj0) zxs0Var.b)).a)), 0, spannableStringBuilder.length(), 17);
                            a81Var2 = new a81(str, spannableStringBuilder, i4);
                        } else if (editAction == editAction2) {
                            a81Var2 = new a81(str, charSequence, i4);
                        } else {
                            a81Var = new a81(F, charSequence, i3);
                        }
                        titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.L$0 = null;
                        titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.L$1 = null;
                        titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.L$2 = null;
                        titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.L$3 = null;
                        titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.label = 1;
                        if (this.a.emit(a81Var2, titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    a81Var2 = a81Var;
                    titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.L$0 = null;
                    titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.L$1 = null;
                    titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.L$2 = null;
                    titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.L$3 = null;
                    titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a81Var2, titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1 = new TitleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = titleAndHintDestination$titleAndHintDestinationFlow$$inlined$map$1$2$1.label;
        String str3 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
