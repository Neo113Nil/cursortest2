package com.squareup.cash.formview.components;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.formview.components.FormViewCtaButtons;
import com.squareup.cash.formview.viewevents.api.FormViewEvent;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class FormView$renderViewModel$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ FormView this$0;

    /* renamed from: com.squareup.cash.formview.components.FormView$renderViewModel$4$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FormView this$0;

        public /* synthetic */ AnonymousClass2(FormView formView, int i) {
            this.$r8$classId = i;
            this.this$0 = formView;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            FormView formView = this.this$0;
            switch (i) {
                case 0:
                    Object emit = formView.viewEvents.emit((FormViewEvent.FormUrlClicked) obj, continuation);
                    if (emit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
                case 1:
                    Object emit2 = formView.viewEvents.emit((FormViewEvent) obj, continuation);
                    if (emit2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
                case 2:
                    List list = (List) obj;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (((FormRequirement) obj2).isFulfilled) {
                            arrayList.add(obj2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str = ((FormRequirement) it.next()).groupId;
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                    boolean z = true;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                FormRequirement formRequirement = (FormRequirement) it2.next();
                                if (!formRequirement.isFulfilled && !CollectionsKt.contains(arrayList2, formRequirement.groupId)) {
                                    z = false;
                                }
                            }
                        }
                    }
                    formView.areRequirementsMet = z;
                    formView.updateButtonState();
                    break;
                case 3:
                    Object emit3 = formView.viewEvents.emit((FormViewEvent.PrimaryActionSelected) obj, continuation);
                    if (emit3 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
                default:
                    Object emit4 = formView.viewEvents.emit((FormViewEvent.SecondaryActionSelected) obj, continuation);
                    if (emit4 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        break;
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FormView$renderViewModel$4(FormView formView, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = formView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        FormView formView = this.this$0;
        switch (i) {
            case 0:
                return new FormView$renderViewModel$4(formView, continuation, 0);
            case 1:
                return new FormView$renderViewModel$4(formView, continuation, 1);
            default:
                return new FormView$renderViewModel$4(formView, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((FormView$renderViewModel$4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        FormView formView = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 != 0) {
                    if (i2 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                KProperty[] kPropertyArr = FormView.$$delegatedProperties;
                SharedFlowImpl sharedFlowImpl = ((FormViewCtaButtons.DisclaimerProps) formView.disclaimerText$delegate.getValue()).clicks;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(formView, 0);
                this.label = 1;
                sharedFlowImpl.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(anonymousClass2, 11), this);
                return coroutineSingletons;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                KProperty[] kPropertyArr2 = FormView.$$delegatedProperties;
                SharedFlowImpl sharedFlowImpl2 = formView.getPrimaryButton().clicks;
                AnonymousClass2 anonymousClass22 = new AnonymousClass2(formView, 3);
                this.label = 1;
                sharedFlowImpl2.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(anonymousClass22, 12), this);
                return coroutineSingletons2;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                KProperty[] kPropertyArr3 = FormView.$$delegatedProperties;
                SharedFlowImpl sharedFlowImpl3 = ((FormViewCtaButtons.ButtonProps) formView.secondaryButton$delegate.getValue()).clicks;
                AnonymousClass2 anonymousClass23 = new AnonymousClass2(formView, 4);
                this.label = 1;
                sharedFlowImpl3.collect(new RealGooglePayer$createWallet$$inlined$map$1.AnonymousClass2(anonymousClass23, 13), this);
                return coroutineSingletons3;
        }
    }
}
