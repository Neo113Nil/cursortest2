package ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.sticky_widgets;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.p;
import defpackage.tse;
import defpackage.wls;
import defpackage.yx40;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.sticky_widgets.AiChatWidgetKt$DynamicText$1$1", f = "AiChatWidget.kt", l = {106, 108}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AiChatWidgetKt$DynamicText$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ yx40 $currentTextIndex$delegate;
    final /* synthetic */ p $currentTextItem;
    final /* synthetic */ oz40 $displayedText$delegate;
    final /* synthetic */ List<p> $dynamicTexts;
    char C$0;
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiChatWidgetKt$DynamicText$1$1(p pVar, List list, oz40 oz40Var, yx40 yx40Var, Continuation continuation) {
        super(2, continuation);
        this.$currentTextItem = pVar;
        this.$dynamicTexts = list;
        this.$displayedText$delegate = oz40Var;
        this.$currentTextIndex$delegate = yx40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AiChatWidgetKt$DynamicText$1$1(this.$currentTextItem, this.$dynamicTexts, this.$displayedText$delegate, this.$currentTextIndex$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AiChatWidgetKt$DynamicText$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008b, code lost:
    
        if (kotlinx.coroutines.a.i(r6, r14) == r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0077 -> B:12:0x0078). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CharSequence charSequence;
        CharSequence charSequence2;
        oz40 oz40Var;
        int i;
        int i2;
        int i3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            b.b(obj);
            charSequence = this.$currentTextItem.b;
            charSequence2 = charSequence;
            oz40Var = this.$displayedText$delegate;
            i = 0;
            i2 = 0;
            i3 = 0;
            if (i2 < charSequence.length()) {
            }
            return coroutineSingletons;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            yx40 yx40Var = this.$currentTextIndex$delegate;
            yx40Var.setIntValue((yx40Var.getIntValue() + 1) % this.$dynamicTexts.size());
            return zy11.a;
        }
        i2 = this.I$2;
        int i5 = this.I$1;
        i3 = this.I$0;
        oz40Var = (oz40) this.L$2;
        charSequence = (CharSequence) this.L$1;
        charSequence2 = (CharSequence) this.L$0;
        b.b(obj);
        i = i5;
        i2++;
        if (i2 < charSequence.length()) {
            char charAt = charSequence.charAt(i2);
            int i6 = i + 1;
            oz40Var.setValue(charSequence2.subSequence(0, i6).toString());
            this.L$0 = charSequence2;
            this.L$1 = charSequence;
            this.L$2 = oz40Var;
            this.I$0 = i3;
            this.I$1 = i6;
            this.I$2 = i2;
            this.C$0 = charAt;
            this.I$3 = i;
            this.I$4 = 0;
            this.label = 1;
            if (kotlinx.coroutines.a.i(50L, this) != coroutineSingletons) {
                i = i6;
                i2++;
                if (i2 < charSequence.length()) {
                    long j = this.$currentTextItem.a;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                }
            }
        }
        return coroutineSingletons;
    }
}
