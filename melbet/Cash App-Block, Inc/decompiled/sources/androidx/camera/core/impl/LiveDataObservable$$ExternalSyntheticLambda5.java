package androidx.camera.core.impl;

import androidx.camera.core.CameraX$$ExternalSyntheticLambda2;
import androidx.camera.video.Recorder;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.google.mlkit.vision.text.zzb;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.workflow.MiSnapWorkflowActivity;
import com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.NfcReaderFragment;
import com.miteksystems.misnap.workflow.fragment.VoiceProcessorFragment;
import com.miteksystems.misnap.workflow.util.ViewBindingUtil$FragmentViewBindingDelegate;
import com.miteksystems.misnap.workflow.view.TorchView;
import com.withpersona.sdk2.camera.CameraPreview$rebind$1$1$1;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.Cookie;

/* loaded from: classes3.dex */
public final /* synthetic */ class LiveDataObservable$$ExternalSyntheticLambda5 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ LiveDataObservable$$ExternalSyntheticLambda5(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        HashMap hashMap;
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                Recorder.AnonymousClass3 anonymousClass3 = (Recorder.AnonymousClass3) obj2;
                LiveDataObservable$Result liveDataObservable$Result = (LiveDataObservable$Result) obj;
                synchronized (((HashMap) anonymousClass3.val$recordingToStart)) {
                    hashMap = new HashMap((HashMap) anonymousClass3.val$recordingToStart);
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    ((Executor) entry.getValue()).execute(new CameraX$$ExternalSyntheticLambda2(27, entry, liveDataObservable$Result));
                }
                return;
            case 1:
                int i2 = MiSnapWorkflowActivity.$r8$clinit;
                ((MiSnapWorkflowActivity.e) obj2).invoke(obj);
                return;
            case 2:
                int i3 = MiSnapWorkflowActivity.$r8$clinit;
                ((MiSnapWorkflowActivity.e) obj2).invoke(obj);
                return;
            case 3:
                int i4 = MiSnapWorkflowActivity.$r8$clinit;
                ((MiSnapWorkflowActivity.e) obj2).invoke(obj);
                return;
            case 4:
                int i5 = MiSnapWorkflowActivity.$r8$clinit;
                ((MiSnapWorkflowActivity.e) obj2).invoke(obj);
                return;
            case 5:
                BarcodeAnalysisFragment barcodeAnalysisFragment = (BarcodeAnalysisFragment) obj2;
                byte[] bArr = (byte[]) obj;
                BarcodeAnalysisFragment.Companion companion = BarcodeAnalysisFragment.Companion;
                MiSnapController.FrameResult frameResult = barcodeAnalysisFragment.b;
                if (frameResult != null) {
                    barcodeAnalysisFragment.a(Cookie.Companion.a(frameResult, bArr));
                    return;
                }
                return;
            case 6:
                DocumentAnalysisFragment documentAnalysisFragment = (DocumentAnalysisFragment) obj2;
                byte[] bArr2 = (byte[]) obj;
                DocumentAnalysisFragment.Companion companion2 = DocumentAnalysisFragment.Companion;
                MiSnapController.FrameResult frameResult2 = documentAnalysisFragment.b;
                if (frameResult2 != null) {
                    documentAnalysisFragment.a$1(Cookie.Companion.a(frameResult2, bArr2));
                    return;
                }
                return;
            case 7:
                FaceAnalysisFragment faceAnalysisFragment = (FaceAnalysisFragment) obj2;
                byte[] bArr3 = (byte[]) obj;
                FaceAnalysisFragment.Companion companion3 = FaceAnalysisFragment.Companion;
                MiSnapController.FrameResult frameResult3 = faceAnalysisFragment.b;
                if (frameResult3 != null) {
                    faceAnalysisFragment.a$2(Cookie.Companion.a(frameResult3, bArr3));
                    return;
                }
                return;
            case 8:
                NfcReaderFragment.Companion companion4 = NfcReaderFragment.Companion;
                ((NfcReaderFragment.i) obj2).invoke(obj);
                return;
            case 9:
                NfcReaderFragment.Companion companion5 = NfcReaderFragment.Companion;
                ((NfcReaderFragment.g) obj2).invoke(obj);
                return;
            case 10:
                NfcReaderFragment.Companion companion6 = NfcReaderFragment.Companion;
                ((NfcReaderFragment.h) obj2).invoke(obj);
                return;
            case 11:
                zzb zzbVar = VoiceProcessorFragment.Companion;
                ((VoiceProcessorFragment.e) obj2).invoke(obj);
                return;
            case 12:
                zzb zzbVar2 = VoiceProcessorFragment.Companion;
                ((VoiceProcessorFragment.f) obj2).invoke(obj);
                return;
            case 13:
                ViewBindingUtil$FragmentViewBindingDelegate viewBindingUtil$FragmentViewBindingDelegate = (ViewBindingUtil$FragmentViewBindingDelegate) obj2;
                LifecycleOwner lifecycleOwner = (LifecycleOwner) obj;
                if (lifecycleOwner == null) {
                    return;
                }
                lifecycleOwner.getLifecycle().addObserver(new CameraPreview$rebind$1$1$1(viewBindingUtil$FragmentViewBindingDelegate, 1));
                return;
            default:
                Boolean bool = (Boolean) obj;
                int i6 = TorchView.$r8$clinit;
                bool.getClass();
                ((TorchView) obj2).setTorchOn(bool.booleanValue());
                return;
        }
    }
}
