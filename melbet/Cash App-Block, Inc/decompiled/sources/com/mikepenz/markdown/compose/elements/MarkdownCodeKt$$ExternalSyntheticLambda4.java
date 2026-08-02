package com.mikepenz.markdown.compose.elements;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.payments.views.coreflowsheet.CoreFlowBasicShieetScope;
import com.squareup.util.compose.SquircleShape;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt__CollectionKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class MarkdownCodeKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ long f$0;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ ComposableLambdaImpl f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ MarkdownCodeKt$$ExternalSyntheticLambda4(long j, Modifier modifier, Shape shape, String str, String str2, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = j;
        this.f$1 = modifier;
        this.f$2 = shape;
        this.f$6 = str;
        this.f$7 = str2;
        this.f$8 = composableLambdaImpl;
        this.f$9 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$9;
        Object obj3 = this.f$7;
        Object obj4 = this.f$6;
        Object obj5 = this.f$2;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                FlowKt__CollectionKt.m4196MarkdownCodeBackgroundymN66Js(this.f$0, this.f$1, (Shape) obj5, (String) obj4, (String) obj3, this.f$8, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                KeypadKt.m3648PushOnPressCardIkByU14(this.f$1, (Shape) obj5, this.f$0, (Function0) obj4, (Alignment) obj3, this.f$8, (Composer) obj, updateChangedFlags2);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                ((CoreFlowBasicShieetScope) obj5).m3709SheetContainerZPw9REg$views(this.f$0, (SquircleShape) obj4, this.f$8, this.f$1, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags3);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MarkdownCodeKt$$ExternalSyntheticLambda4(Modifier modifier, Shape shape, long j, Function0 function0, Alignment alignment, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$1 = modifier;
        this.f$2 = shape;
        this.f$0 = j;
        this.f$6 = function0;
        this.f$7 = alignment;
        this.f$8 = composableLambdaImpl;
        this.f$9 = i;
    }

    public /* synthetic */ MarkdownCodeKt$$ExternalSyntheticLambda4(CoreFlowBasicShieetScope coreFlowBasicShieetScope, long j, SquircleShape squircleShape, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.f$2 = coreFlowBasicShieetScope;
        this.f$0 = j;
        this.f$6 = squircleShape;
        this.f$8 = composableLambdaImpl;
        this.f$1 = modifier;
        this.f$7 = composableLambdaImpl2;
        this.f$9 = i;
    }
}
