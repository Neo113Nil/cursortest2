package com.squareup.cash.payments.views;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class DissolveWipeContentKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ float f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ boolean f$5;
    public final /* synthetic */ ComposableLambdaImpl f$6;

    public /* synthetic */ DissolveWipeContentKt$$ExternalSyntheticLambda1(Modifier modifier, Function1 function1, Element element, float f, boolean z, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$1 = modifier;
        this.f$0 = function1;
        this.f$4 = element;
        this.f$3 = f;
        this.f$5 = z;
        this.f$6 = composableLambdaImpl;
        this.f$2 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$4;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(1572865);
                QuickPayViewKt.DissolveWipeContent((Triple) obj4, this.f$1, this.f$2, this.f$3, (DissolveTransitionStyle) obj3, this.f$5, this.f$6, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$2 | 1);
                Modifier modifier = this.f$1;
                AlphaKt.TransformableContent(modifier, (Function1) obj4, (Element) obj3, this.f$3, this.f$5, this.f$6, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DissolveWipeContentKt$$ExternalSyntheticLambda1(Triple triple, Modifier modifier, int i, float f, DissolveTransitionStyle dissolveTransitionStyle, boolean z, ComposableLambdaImpl composableLambdaImpl, int i2) {
        this.f$0 = triple;
        this.f$1 = modifier;
        this.f$2 = i;
        this.f$3 = f;
        this.f$4 = dissolveTransitionStyle;
        this.f$5 = z;
        this.f$6 = composableLambdaImpl;
    }
}
