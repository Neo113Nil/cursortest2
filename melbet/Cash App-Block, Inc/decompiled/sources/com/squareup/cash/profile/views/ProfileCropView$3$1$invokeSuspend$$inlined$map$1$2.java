package com.squareup.cash.profile.views;

import android.graphics.Bitmap;
import android.net.Uri;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.data.profile.CropResultManager$CropResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class ProfileCropView$3$1$invokeSuspend$$inlined$map$1$2 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FlowCollector $this_unsafeFlow;
    public final /* synthetic */ ProfileCropView this$0;

    /* renamed from: com.squareup.cash.profile.views.ProfileCropView$3$1$invokeSuspend$$inlined$map$1$2$1, reason: invalid class name */
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
            return ProfileCropView$3$1$invokeSuspend$$inlined$map$1$2.this.emit(null, this);
        }
    }

    public /* synthetic */ ProfileCropView$3$1$invokeSuspend$$inlined$map$1$2(FlowCollector flowCollector, ProfileCropView profileCropView, int i) {
        this.$r8$classId = i;
        this.$this_unsafeFlow = flowCollector;
        this.this$0 = profileCropView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r2.emit(r9, r0) == r11) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0098  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        AnonymousClass1 anonymousClass1;
        int i;
        ProfileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1 profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        Object obj2;
        int i2;
        int i3;
        int i4 = this.$r8$classId;
        ProfileCropView profileCropView = this.this$0;
        FlowCollector flowCollector = this.$this_unsafeFlow;
        int i5 = 1;
        Continuation continuation2 = null;
        switch (i4) {
            case 0:
                if (continuation instanceof AnonymousClass1) {
                    anonymousClass1 = (AnonymousClass1) continuation;
                    int i6 = anonymousClass1.label;
                    if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                        anonymousClass1.label = i6 - PKIFailureInfo.systemUnavail;
                        Object obj3 = anonymousClass1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = anonymousClass1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj3);
                            Bitmap bitmap = (Bitmap) obj;
                            String str = profileCropView.photoUri;
                            if (str == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("photoUri");
                                throw null;
                            }
                            CropResultManager$CropResult cropResultManager$CropResult = new CropResultManager$CropResult(bitmap, Uri.parse(str));
                            anonymousClass1.label = 1;
                            if (flowCollector.emit(cropResultManager$CropResult, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj3);
                        }
                        return Unit.INSTANCE;
                    }
                }
                anonymousClass1 = new AnonymousClass1(continuation);
                Object obj32 = anonymousClass1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = anonymousClass1.label;
                if (i != 0) {
                }
                return Unit.INSTANCE;
            default:
                if (continuation instanceof ProfileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
                    profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (ProfileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
                    int i7 = profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                    if ((i7 & PKIFailureInfo.systemUnavail) != 0) {
                        profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i7 - PKIFailureInfo.systemUnavail;
                        obj2 = profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj2);
                            DefaultScheduler defaultScheduler = Dispatchers.Default;
                            ProfileCropView$3$1$1 profileCropView$3$1$1 = new ProfileCropView$3$1$1(profileCropView, continuation2, i5);
                            profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = flowCollector;
                            profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.I$0 = 0;
                            profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                            obj2 = JobKt.withContext(defaultScheduler, profileCropView$3$1$1, profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1);
                            if (obj2 != coroutineSingletons3) {
                                i3 = 0;
                            }
                            return coroutineSingletons3;
                        }
                        if (i2 != 1) {
                            if (i2 == 2) {
                                SafeTrace.throwOnFailure(obj2);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i3 = profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.I$0;
                        flowCollector = profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3;
                        SafeTrace.throwOnFailure(obj2);
                        if (obj2 != null) {
                            profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                            profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.I$0 = i3;
                            profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 2;
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                }
                profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new ProfileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
                obj2 = profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = profileCropView$3$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i2 != 0) {
                }
                if (obj2 != null) {
                }
                return Unit.INSTANCE;
        }
    }
}
