package com.miteksystems.misnap.controller;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.lifecycle.BlockRunner$cancel$1;
import androidx.lifecycle.MutableLiveData;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.controller.a.a;
import com.miteksystems.misnap.controller.a.a0;
import com.miteksystems.misnap.controller.a.b;
import com.miteksystems.misnap.controller.a.b0;
import com.miteksystems.misnap.controller.a.c;
import com.miteksystems.misnap.controller.a.e;
import com.miteksystems.misnap.controller.a.f;
import com.miteksystems.misnap.controller.a.g;
import com.miteksystems.misnap.controller.a.h;
import com.miteksystems.misnap.controller.a.j;
import com.miteksystems.misnap.controller.a.l;
import com.miteksystems.misnap.controller.a.m;
import com.miteksystems.misnap.controller.a.o;
import com.miteksystems.misnap.controller.a.p;
import com.miteksystems.misnap.controller.a.q;
import com.miteksystems.misnap.controller.a.r$a;
import com.miteksystems.misnap.controller.a.s$a;
import com.miteksystems.misnap.controller.a.s$b;
import com.miteksystems.misnap.controller.a.t$a;
import com.miteksystems.misnap.core.Barcode;
import com.miteksystems.misnap.core.DocumentClassification;
import com.miteksystems.misnap.core.DocumentExtraction;
import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.core.UserAction;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import net.idrnd.misnap.iad.CaptureCore;
import net.idrnd.misnap.iad.CaptureError$UnknownError;
import net.idrnd.misnap.iad.CaptureResult$PayloadCreated;
import net.idrnd.misnap.iad.Result;
import net.oneformapp.DLog;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class MiSnapController$analyzeFrame$3 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ MiSnapController b;
    public final /* synthetic */ Frame c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiSnapController$analyzeFrame$3(MiSnapController miSnapController, Frame frame, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = miSnapController;
        this.c = frame;
        this.d = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MiSnapController$analyzeFrame$3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MiSnapController$analyzeFrame$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x02fe, code lost:
    
        if (r9 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0479, code lost:
    
        if (androidx.camera.video.Recorder$$ExternalSyntheticOutline1.m(r4) != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x047b, code lost:
    
        r4.setValue(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x047f, code lost:
    
        r4.postValue(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x04a3, code lost:
    
        if (androidx.camera.video.Recorder$$ExternalSyntheticOutline1.m(r4) != false) goto L240;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0300, code lost:
    
        if (r12 != false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x030b, code lost:
    
        if (r1 == false) goto L157;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object a;
        byte[] bArr;
        Frame.FrameInfo frameInfo;
        Result a2;
        Object obj2;
        MutableLiveData mutableLiveData;
        MiSnapController.ErrorResult.VdsProcessingError vdsProcessingError;
        String str2;
        MiSnapController.FeedbackResult a3;
        MiSnapController.FeedbackResult a4;
        Barcode barcode;
        MiSnapController.FeedbackResult a5;
        MiSnapController.FeedbackResult a6;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.a;
        Barcode barcode2 = null;
        barcode2 = null;
        try {
            if (i == 0) {
                SafeTrace.throwOnFailure(obj);
                MiSnapController miSnapController = this.b;
                if (miSnapController.p && miSnapController.shouldTrackFinalFrameDispatched$controller_release()) {
                    return Unit.INSTANCE;
                }
                a0 a0Var = this.b.a;
                Frame frame = this.c;
                this.a = 1;
                a = a0Var.a(frame, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                a = obj;
            }
            b0 b0Var = (b0) a;
            MiSnapSettings miSnapSettings = this.b.g;
            if (AnalysisSettings.shouldEnableAiBasedRts(miSnapSettings.analysis, miSnapSettings.a)) {
                this.b.c.a(this.c);
            }
            UserAction userAction = b0Var.a;
            UserAction.NONE none = UserAction.NONE.INSTANCE;
            boolean z = Intrinsics.areEqual(userAction, none) && !this.d;
            MiSnapController miSnapController2 = this.b;
            if (miSnapController2.k <= 0 || miSnapController2.m || !z || !miSnapController2.isImageQualityPriority$controller_release()) {
                MiSnapController miSnapController3 = this.b;
                UserAction userAction2 = b0Var.a;
                if (!Intrinsics.areEqual(miSnapController3.i, userAction2)) {
                    miSnapController3.i = userAction2;
                    miSnapController3.o.addUxpEvent("SMCUA", userAction2.toString());
                }
                MiSnapController miSnapController4 = this.b;
                Frame frame2 = this.c;
                boolean z2 = this.d;
                a0 a0Var2 = miSnapController4.a;
                if (a0Var2 instanceof h) {
                    j jVar = (j) b0Var;
                    if (miSnapController4.shouldHandleDeviceMotionFeedback$controller_release(jVar, z2)) {
                        a6 = miSnapController4.a(jVar, frame2, true);
                    } else if (Intrinsics.areEqual(jVar.a, none) || z2) {
                        miSnapController4.a(jVar, z2);
                        MiSnapController.Container a7 = miSnapController4.a(frame2, jVar);
                        byte[] imageBytes = a7.getImageBytes();
                        DocumentExtraction a8 = miSnapController4.a(jVar);
                        List list = jVar.c;
                        Context context = miSnapController4.e;
                        context.getClass();
                        miSnapController4.a(new MiSnapController.FrameResult.DocumentAnalysis(imageBytes, a8, null, null, list, MibiData.toMiSnapMibiData(context), jVar.h, a7.getRts()));
                    } else {
                        a6 = miSnapController4.a(jVar, frame2, false);
                    }
                    miSnapController4.a(a6);
                } else if (a0Var2 instanceof a) {
                    b bVar = (b) b0Var;
                    UserAction userAction3 = bVar.a;
                    if (Intrinsics.areEqual(userAction3, none) || z2) {
                        miSnapController4.a(bVar, z2);
                        MiSnapController.Container a9 = miSnapController4.a(frame2, bVar);
                        byte[] imageBytes2 = a9.getImageBytes();
                        Barcode barcode3 = bVar.b;
                        Barcode prepareBarcodeResult$controller_release = barcode3 != null ? miSnapController4.prepareBarcodeResult$controller_release(barcode3) : null;
                        List listOf = !Intrinsics.areEqual(userAction3, none) ? CollectionsKt__CollectionsJVMKt.listOf(userAction3) : EmptyList.INSTANCE;
                        Context context2 = miSnapController4.e;
                        context2.getClass();
                        miSnapController4.a(new MiSnapController.FrameResult.BarcodeAnalysis(imageBytes2, prepareBarcodeResult$controller_release, listOf, MibiData.toMiSnapMibiData(context2), bVar.c, a9.getRts()));
                    } else {
                        miSnapController4.a(miSnapController4.a(bVar, frame2, false));
                    }
                } else if (a0Var2 instanceof e) {
                    f fVar = (f) b0Var;
                    boolean shouldHandleDeviceMotionFeedback$controller_release = miSnapController4.shouldHandleDeviceMotionFeedback$controller_release(fVar, z2);
                    j jVar2 = fVar.c;
                    b bVar2 = fVar.b;
                    if (shouldHandleDeviceMotionFeedback$controller_release) {
                        a5 = miSnapController4.a(fVar, frame2, true);
                    } else if (Intrinsics.areEqual(fVar.a, none) || z2) {
                        miSnapController4.a(fVar, z2);
                        MiSnapController.Container a10 = miSnapController4.a(frame2, fVar);
                        byte[] imageBytes3 = a10.getImageBytes();
                        if (bVar2 != null && (barcode = bVar2.b) != null) {
                            barcode2 = miSnapController4.prepareBarcodeResult$controller_release(barcode);
                        }
                        Barcode barcode4 = barcode2;
                        List plus = (bVar2 == null || Intrinsics.areEqual(bVar2.a, none)) ? jVar2.c : CollectionsKt.plus((Iterable) CollectionsKt__CollectionsJVMKt.listOf(bVar2.a), (Collection) jVar2.c);
                        Context context3 = miSnapController4.e;
                        context3.getClass();
                        miSnapController4.a(new MiSnapController.FrameResult.DocumentAnalysis(imageBytes3, null, null, barcode4, plus, MibiData.toMiSnapMibiData(context3), jVar2.h, a10.getRts()));
                    } else {
                        a5 = miSnapController4.a(fVar, frame2, false);
                    }
                    miSnapController4.a(a5);
                } else if (a0Var2 instanceof l) {
                    j jVar3 = (j) b0Var;
                    if (miSnapController4.shouldHandleDeviceMotionFeedback$controller_release(jVar3, z2)) {
                        a4 = miSnapController4.a(jVar3, frame2, true);
                    } else if (Intrinsics.areEqual(jVar3.a, none) || z2) {
                        miSnapController4.a(jVar3, z2);
                        MiSnapController.Container a11 = miSnapController4.a(frame2, jVar3);
                        byte[] imageBytes4 = a11.getImageBytes();
                        DocumentExtraction a12 = miSnapController4.a(jVar3);
                        List list2 = jVar3.c;
                        Context context4 = miSnapController4.e;
                        context4.getClass();
                        miSnapController4.a(new MiSnapController.FrameResult.DocumentAnalysis(imageBytes4, a12, null, null, list2, MibiData.toMiSnapMibiData(context4), jVar3.h, a11.getRts()));
                    } else {
                        a4 = miSnapController4.a(jVar3, frame2, false);
                    }
                    miSnapController4.a(a4);
                } else if (a0Var2 instanceof g) {
                    j jVar4 = (j) b0Var;
                    if (miSnapController4.shouldHandleDeviceMotionFeedback$controller_release(jVar4, z2)) {
                        a3 = miSnapController4.a(jVar4, frame2, true);
                    } else if (Intrinsics.areEqual(jVar4.a, none) || z2) {
                        miSnapController4.a(jVar4, z2);
                        MiSnapController.Container a13 = miSnapController4.a(frame2, jVar4);
                        byte[] imageBytes5 = a13.getImageBytes();
                        DocumentExtraction a14 = miSnapController4.a(jVar4);
                        DocumentClassification documentClassification = jVar4.g;
                        List list3 = jVar4.c;
                        Context context5 = miSnapController4.e;
                        context5.getClass();
                        miSnapController4.a(new MiSnapController.FrameResult.DocumentAnalysis(imageBytes5, a14, documentClassification, null, list3, MibiData.toMiSnapMibiData(context5), jVar4.h, a13.getRts()));
                    } else {
                        a3 = miSnapController4.a(jVar4, frame2, false);
                    }
                    miSnapController4.a(a3);
                } else if (a0Var2 instanceof m) {
                    o oVar = (o) b0Var;
                    MiSnapSettings miSnapSettings2 = miSnapController4.g;
                    boolean shouldEnableAiBasedRts = AnalysisSettings.shouldEnableAiBasedRts(miSnapSettings2.analysis, miSnapSettings2.a);
                    if (shouldEnableAiBasedRts) {
                        boolean z3 = miSnapController4.c.b;
                        boolean z4 = z2 && z3;
                        if (Intrinsics.areEqual(oVar.a, none)) {
                        }
                    } else {
                        if (!Intrinsics.areEqual(oVar.a, none)) {
                        }
                        miSnapController4.a(oVar, z2);
                        MiSnapController.Container a15 = miSnapController4.a(frame2, oVar);
                        if (shouldEnableAiBasedRts) {
                            p pVar = miSnapController4.c;
                            byte[] imageBytes6 = a15.getImageBytes();
                            Frame.FrameInfo[] frameInfos = frame2.getFrameInfos();
                            pVar.getClass();
                            imageBytes6.getClass();
                            frameInfos.getClass();
                            if (!pVar.b) {
                                obj2 = new s$a(r$a.a$4);
                            } else if (imageBytes6.length == 0) {
                                obj2 = new s$a(r$a.a$2);
                            } else {
                                int length = frameInfos.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= length) {
                                        frameInfo = null;
                                        break;
                                    }
                                    frameInfo = frameInfos[i2];
                                    if (frameInfo instanceof Frame.FrameInfo.TimingFrameInfo) {
                                        break;
                                    }
                                    i2++;
                                }
                                Long valueOf = frameInfo != null ? Long.valueOf(((Frame.FrameInfo.TimingFrameInfo) frameInfo).getTimestamp()) : null;
                                if (valueOf == null || valueOf.longValue() <= 0) {
                                    obj2 = new s$a(r$a.a$2);
                                } else {
                                    CaptureCore captureCore = pVar.a;
                                    long longValue = valueOf.longValue();
                                    synchronized (captureCore.a) {
                                        a2 = net.idrnd.misnap.iad.a.a(captureCore.b.b(longValue, imageBytes6));
                                    }
                                    if (a2 instanceof Result.Failure) {
                                        CaptureError$UnknownError captureError$UnknownError = (CaptureError$UnknownError) ((Result.Failure) a2).a;
                                        if (captureError$UnknownError.equals(CaptureError$UnknownError.INSTANCE$1) ? true : captureError$UnknownError.equals(CaptureError$UnknownError.INSTANCE)) {
                                            obj2 = new s$a(r$a.a$1);
                                        } else if (captureError$UnknownError.equals(CaptureError$UnknownError.INSTANCE$2)) {
                                            obj2 = new s$a(r$a.a$3);
                                        } else if (captureError$UnknownError.equals(CaptureError$UnknownError.INSTANCE$3)) {
                                            obj2 = new s$a(r$a.a);
                                        } else {
                                            if (!(captureError$UnknownError.equals(CaptureError$UnknownError.INSTANCE$4) ? true : captureError$UnknownError.equals(CaptureError$UnknownError.INSTANCE$5))) {
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                            }
                                            obj2 = new s$a(r$a.a$4);
                                        }
                                    } else {
                                        if (!(a2 instanceof Result.Success)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        byte[] bArr2 = (byte[]) ((CaptureResult$PayloadCreated) ((Result.Success) a2).a).a.a;
                                        obj2 = bArr2.length == 0 ? new s$a(r$a.a) : new s$b(bArr2);
                                    }
                                }
                            }
                            if (obj2 instanceof s$a) {
                                s$a s_a = (s$a) obj2;
                                Result result = s_a.a;
                                r$a r_a = r$a.a$4;
                                boolean equals = result.equals(r_a);
                                MibiData.Session session = miSnapController4.o;
                                if (equals) {
                                    session.addUxpEvent("IPNRE", new String[0]);
                                    miSnapController4.a(miSnapController4.a(oVar, frame2, false));
                                } else {
                                    Result result2 = s_a.a;
                                    if (result2.equals(r$a.a$2)) {
                                        str2 = "IPIPE";
                                    } else if (result2.equals(r$a.a$3)) {
                                        str2 = "IPPKE";
                                    } else if (result2.equals(r$a.a$1)) {
                                        str2 = "IPEXE";
                                    } else if (result2.equals(r$a.a)) {
                                        str2 = "IPEEE";
                                    } else {
                                        if (!result2.equals(r_a)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        str2 = "IPNRE";
                                    }
                                    session.addUxpEvent(str2, new String[0]);
                                    mutableLiveData = miSnapController4.v;
                                    vdsProcessingError = MiSnapController.ErrorResult.VdsProcessingError.INSTANCE$1;
                                }
                            } else if (obj2 instanceof s$b) {
                                byte[] bArr3 = ((s$b) obj2).a;
                                if (bArr3.length == 0) {
                                    miSnapController4.o.addUxpEvent("IPREE", new String[0]);
                                    mutableLiveData = miSnapController4.v;
                                    vdsProcessingError = MiSnapController.ErrorResult.VdsProcessingError.INSTANCE$1;
                                } else {
                                    bArr = bArr3;
                                    byte[] imageBytes7 = a15.getImageBytes();
                                    ArrayList arrayList = oVar.c;
                                    Context context6 = miSnapController4.e;
                                    context6.getClass();
                                    miSnapController4.a(new MiSnapController.FrameResult.FaceAnalysis(imageBytes7, arrayList, MibiData.toMiSnapMibiData(context6), oVar.e, a15.getRts(), bArr));
                                }
                            }
                        }
                        bArr = null;
                        byte[] imageBytes72 = a15.getImageBytes();
                        ArrayList arrayList2 = oVar.c;
                        Context context62 = miSnapController4.e;
                        context62.getClass();
                        miSnapController4.a(new MiSnapController.FrameResult.FaceAnalysis(imageBytes72, arrayList2, MibiData.toMiSnapMibiData(context62), oVar.e, a15.getRts(), bArr));
                    }
                }
            } else {
                MiSnapController miSnapController5 = this.b;
                if (!miSnapController5.l) {
                    miSnapController5.l = true;
                    miSnapController5.o.addUxpEvent("MCSPT", String.valueOf(miSnapController5.k));
                    JobKt.launch$default(JobKt.MainScope(), null, null, new BlockRunner$cancel$1(this.b, (Continuation) null, 21), 3);
                }
                MiSnapController miSnapController6 = this.b;
                a0 a0Var3 = miSnapController6.a;
                UserAction.Document.HOLD_STILL hold_still = a0Var3 instanceof h ? true : a0Var3 instanceof l ? true : a0Var3 instanceof e ? true : a0Var3 instanceof g ? UserAction.Document.HOLD_STILL.INSTANCE : null;
                if (hold_still != null) {
                    if (!Intrinsics.areEqual(miSnapController6.i, hold_still)) {
                        miSnapController6.i = hold_still;
                        miSnapController6.o.addUxpEvent("SMCUA", hold_still.toString());
                    }
                    miSnapController6.a(new MiSnapController.FeedbackResult(hold_still, null, null, null, null, 30));
                }
            }
            return Unit.INSTANCE;
        } catch (c e) {
            MutableLiveData mutableLiveData2 = this.b.v;
            MiSnapController.ErrorResult errorResult = e.a;
            if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData2)) {
                mutableLiveData2.setValue(errorResult);
            } else {
                mutableLiveData2.postValue(errorResult);
            }
            return Unit.INSTANCE;
        } catch (q e2) {
            MibiData.Session session2 = this.b.o;
            DLog dLog = e2.a;
            if (Intrinsics.areEqual(dLog, t$a.a)) {
                str = "IPCCE";
            } else if (Intrinsics.areEqual(dLog, t$a.a$1)) {
                str = "IPISE";
            } else if (Intrinsics.areEqual(dLog, t$a.a$2)) {
                str = "IPITE";
            } else if (Intrinsics.areEqual(dLog, t$a.a$3)) {
                str = "IPIFE";
            } else if (Intrinsics.areEqual(dLog, t$a.a$4)) {
                str = "IPJEE";
            } else if (Intrinsics.areEqual(dLog, t$a.a$5)) {
                str = "IPNNE";
            } else {
                if (!Intrinsics.areEqual(dLog, t$a.a$6)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                str = "IPUKE";
            }
            session2.addUxpEvent(str, new String[0]);
            MutableLiveData mutableLiveData3 = this.b.v;
            MiSnapController.ErrorResult.VdsProcessingError vdsProcessingError2 = MiSnapController.ErrorResult.VdsProcessingError.INSTANCE$1;
            if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData3)) {
                mutableLiveData3.setValue(vdsProcessingError2);
            } else {
                mutableLiveData3.postValue(vdsProcessingError2);
            }
            return Unit.INSTANCE;
        }
    }
}
