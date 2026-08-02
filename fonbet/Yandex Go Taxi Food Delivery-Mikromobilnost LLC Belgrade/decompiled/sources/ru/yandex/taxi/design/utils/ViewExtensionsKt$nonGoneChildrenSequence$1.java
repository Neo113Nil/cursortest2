package ru.yandex.taxi.design.utils;

import android.view.View;
import android.view.ViewGroup;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.srq0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsrq0;", "Landroid/view/View;", "Lzy11;", "<anonymous>", "(Lsrq0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.design.utils.ViewExtensionsKt$nonGoneChildrenSequence$1", f = "ViewExtensions.kt", l = {437}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class ViewExtensionsKt$nonGoneChildrenSequence$1 extends RestrictedSuspendLambda implements wls {
    final /* synthetic */ ViewGroup $this_nonGoneChildrenSequence;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewExtensionsKt$nonGoneChildrenSequence$1(ViewGroup viewGroup, Continuation continuation) {
        super(2, continuation);
        this.$this_nonGoneChildrenSequence = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ViewExtensionsKt$nonGoneChildrenSequence$1 viewExtensionsKt$nonGoneChildrenSequence$1 = new ViewExtensionsKt$nonGoneChildrenSequence$1(this.$this_nonGoneChildrenSequence, continuation);
        viewExtensionsKt$nonGoneChildrenSequence$1.L$0 = obj;
        return viewExtensionsKt$nonGoneChildrenSequence$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewExtensionsKt$nonGoneChildrenSequence$1) create((srq0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0048 -> B:5:0x004b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0038 -> B:5:0x004b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        int childCount;
        srq0 srq0Var = (srq0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            i = 0;
            childCount = this.$this_nonGoneChildrenSequence.getChildCount();
            if (i < childCount) {
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            childCount = this.I$1;
            i = this.I$0;
            kotlin.b.b(obj);
            i++;
            if (i < childCount) {
                View childAt = this.$this_nonGoneChildrenSequence.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    this.L$0 = srq0Var;
                    this.L$1 = null;
                    this.I$0 = i;
                    this.I$1 = childCount;
                    this.label = 1;
                    if (srq0Var.a(childAt, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                i++;
                if (i < childCount) {
                    return zy11.a;
                }
            }
        }
    }
}
