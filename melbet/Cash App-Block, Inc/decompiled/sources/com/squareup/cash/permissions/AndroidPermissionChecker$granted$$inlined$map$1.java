package com.squareup.cash.permissions;

import androidx.room.MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager$withTokens$$inlined$map$1$2$1;
import com.squareup.cash.instruments.common.BalanceSnapshot;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.instruments.presenters.SelectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.builders.SetBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class AndroidPermissionChecker$granted$$inlined$map$1 implements Flow {
    public final /* synthetic */ String[] $permissions$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Flow $this_unsafeTransform$inlined;

    /* renamed from: com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$1$2, reason: invalid class name */
    public final class AnonymousClass2 implements FlowCollector {
        public final /* synthetic */ String[] $permissions$inlined;
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* renamed from: com.squareup.cash.permissions.AndroidPermissionChecker$granted$$inlined$map$1$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends ContinuationImpl {
            public int label;
            public /* synthetic */ Object result;

            public AnonymousClass1(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= PKIFailureInfo.systemUnavail;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public /* synthetic */ AnonymousClass2(FlowCollector flowCollector, String[] strArr, int i) {
            this.$r8$classId = i;
            this.$this_unsafeFlow = flowCollector;
            this.$permissions$inlined = strArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x0145  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00da  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1;
            int i;
            MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1 multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1;
            int i2;
            RealInstrumentManager$withTokens$$inlined$map$1$2$1 realInstrumentManager$withTokens$$inlined$map$1$2$1;
            int i3;
            SelectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1 selectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1;
            int i4;
            int i5 = this.$r8$classId;
            String[] strArr = this.$permissions$inlined;
            FlowCollector flowCollector = this.$this_unsafeFlow;
            switch (i5) {
                case 0:
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i6 = anonymousClass1.label;
                        if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                            anonymousClass1.label = i6 - PKIFailureInfo.systemUnavail;
                            Object obj2 = anonymousClass1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = anonymousClass1.label;
                            if (i != 0) {
                                SafeTrace.throwOnFailure(obj2);
                                Boolean valueOf = Boolean.valueOf(ArraysKt___ArraysKt.contains(strArr, (String) obj));
                                anonymousClass1.label = 1;
                                if (flowCollector.emit(valueOf, anonymousClass1) == coroutineSingletons) {
                                    break;
                                }
                            } else if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj2);
                            }
                            break;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(continuation);
                    Object obj22 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = anonymousClass1.label;
                    if (i != 0) {
                    }
                case 1:
                    if (continuation instanceof MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1) {
                        multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1 = (MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1) continuation;
                        int i7 = multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.label;
                        if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                            multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                            Object obj3 = multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.result;
                            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i2 = multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.label;
                            if (i2 != 0) {
                                SafeTrace.throwOnFailure(obj3);
                                Set set = (Set) obj;
                                SetBuilder setBuilder = new SetBuilder();
                                for (String str : strArr) {
                                    Iterator it = set.iterator();
                                    while (it.hasNext()) {
                                        if (StringsKt__StringsJVMKt.equals(str, (String) it.next(), true)) {
                                            setBuilder.add(str);
                                        }
                                    }
                                }
                                SetBuilder build = SetsKt__SetsJVMKt.build(setBuilder);
                                String str2 = build.backing.isEmpty() ? null : build;
                                if (str2 != null) {
                                    multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.label = 1;
                                    if (flowCollector.emit(str2, multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons3) {
                                        break;
                                    }
                                }
                            } else if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj3);
                            }
                            break;
                        }
                    }
                    multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1 = new MultiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1(this, continuation);
                    Object obj32 = multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.result;
                    CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i2 = multiInstanceInvalidationClient$createFlow$$inlined$mapNotNull$1$2$1.label;
                    if (i2 != 0) {
                    }
                case 2:
                    if (continuation instanceof RealInstrumentManager$withTokens$$inlined$map$1$2$1) {
                        realInstrumentManager$withTokens$$inlined$map$1$2$1 = (RealInstrumentManager$withTokens$$inlined$map$1$2$1) continuation;
                        int i8 = realInstrumentManager$withTokens$$inlined$map$1$2$1.label;
                        if ((i8 & PKIFailureInfo.systemUnavail) != 0) {
                            realInstrumentManager$withTokens$$inlined$map$1$2$1.label = i8 - PKIFailureInfo.systemUnavail;
                            Object obj4 = realInstrumentManager$withTokens$$inlined$map$1$2$1.result;
                            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i3 = realInstrumentManager$withTokens$$inlined$map$1$2$1.label;
                            if (i3 != 0) {
                                SafeTrace.throwOnFailure(obj4);
                                ArrayList arrayList = new ArrayList();
                                for (Object obj5 : (List) obj) {
                                    if (ArraysKt___ArraysKt.contains(strArr, ((Instrument) obj5).token)) {
                                        arrayList.add(obj5);
                                    }
                                }
                                realInstrumentManager$withTokens$$inlined$map$1$2$1.label = 1;
                                if (flowCollector.emit(arrayList, realInstrumentManager$withTokens$$inlined$map$1$2$1) == coroutineSingletons4) {
                                    break;
                                }
                            } else if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj4);
                            }
                            break;
                        }
                    }
                    realInstrumentManager$withTokens$$inlined$map$1$2$1 = new RealInstrumentManager$withTokens$$inlined$map$1$2$1(this, continuation);
                    Object obj42 = realInstrumentManager$withTokens$$inlined$map$1$2$1.result;
                    CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i3 = realInstrumentManager$withTokens$$inlined$map$1$2$1.label;
                    if (i3 != 0) {
                    }
                default:
                    if (continuation instanceof SelectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1) {
                        selectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1 = (SelectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1) continuation;
                        int i9 = selectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1.label;
                        if ((i9 & PKIFailureInfo.systemUnavail) != 0) {
                            selectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1.label = i9 - PKIFailureInfo.systemUnavail;
                            Object obj6 = selectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1.result;
                            CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i4 = selectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1.label;
                            if (i4 != 0) {
                                SafeTrace.throwOnFailure(obj6);
                                BalanceSnapshot balanceSnapshot = (BalanceSnapshot) obj;
                                if (ArraysKt___ArraysKt.contains(strArr, balanceSnapshot != null ? balanceSnapshot.token : null)) {
                                    selectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1.label = 1;
                                    if (flowCollector.emit(obj, selectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1) == coroutineSingletons5) {
                                        break;
                                    }
                                }
                            } else if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            } else {
                                SafeTrace.throwOnFailure(obj6);
                            }
                            break;
                        }
                    }
                    selectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1 = new SelectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1(this, continuation);
                    Object obj62 = selectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1.result;
                    CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i4 = selectPaymentInstrumentPresenter$initialModel$$inlined$filter$1$2$1.label;
                    if (i4 != 0) {
                    }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ AndroidPermissionChecker$granted$$inlined$map$1(SharedFlowImpl sharedFlowImpl, String[] strArr, int i) {
        this.$r8$classId = i;
        this.$this_unsafeTransform$inlined = sharedFlowImpl;
        this.$permissions$inlined = strArr;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        int i = this.$r8$classId;
        String[] strArr = this.$permissions$inlined;
        Flow flow = this.$this_unsafeTransform$inlined;
        switch (i) {
            case 0:
                Object collect = flow.collect(new AnonymousClass2(flowCollector, strArr, 0), continuation);
                if (collect != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object collect2 = flow.collect(new AnonymousClass2(flowCollector, strArr, 1), continuation);
                if (collect2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
