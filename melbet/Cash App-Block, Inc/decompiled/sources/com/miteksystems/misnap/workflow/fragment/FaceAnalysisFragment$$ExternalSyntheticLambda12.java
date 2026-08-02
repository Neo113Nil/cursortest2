package com.miteksystems.misnap.workflow.fragment;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.DocumentAnalysisFragment;
import com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment;
import okhttp3.Cookie;

/* loaded from: classes4.dex */
public final /* synthetic */ class FaceAnalysisFragment$$ExternalSyntheticLambda12 implements Observer {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Fragment f$1;

    public /* synthetic */ FaceAnalysisFragment$$ExternalSyntheticLambda12(boolean z, Fragment fragment, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = fragment;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i = this.$r8$classId;
        Fragment fragment = this.f$1;
        boolean z = this.f$0;
        switch (i) {
            case 0:
                FaceAnalysisFragment faceAnalysisFragment = (FaceAnalysisFragment) fragment;
                MiSnapController.FrameResult frameResult = (MiSnapController.FrameResult) obj;
                FaceAnalysisFragment.Companion companion = FaceAnalysisFragment.Companion;
                if (frameResult != null) {
                    if (!z || faceAnalysisFragment.b != null) {
                        if (!z) {
                            faceAnalysisFragment.a$2(Cookie.Companion.a(frameResult, null));
                            break;
                        }
                    } else {
                        faceAnalysisFragment.b = frameResult;
                        faceAnalysisFragment.getBinding$workflow_release().m.stopRecording();
                        break;
                    }
                }
                break;
            case 1:
                BarcodeAnalysisFragment barcodeAnalysisFragment = (BarcodeAnalysisFragment) fragment;
                MiSnapController.FrameResult frameResult2 = (MiSnapController.FrameResult) obj;
                BarcodeAnalysisFragment.Companion companion2 = BarcodeAnalysisFragment.Companion;
                if (frameResult2 != null) {
                    if (!z || barcodeAnalysisFragment.b != null) {
                        if (!z) {
                            barcodeAnalysisFragment.a(Cookie.Companion.a(frameResult2, null));
                            break;
                        }
                    } else {
                        barcodeAnalysisFragment.b = frameResult2;
                        barcodeAnalysisFragment.getBinding$workflow_release().k.stopRecording();
                        break;
                    }
                }
                break;
            default:
                DocumentAnalysisFragment documentAnalysisFragment = (DocumentAnalysisFragment) fragment;
                MiSnapController.FrameResult frameResult3 = (MiSnapController.FrameResult) obj;
                DocumentAnalysisFragment.Companion companion3 = DocumentAnalysisFragment.Companion;
                if (frameResult3 != null) {
                    if (!z || documentAnalysisFragment.b != null) {
                        if (!z) {
                            documentAnalysisFragment.a$1(Cookie.Companion.a(frameResult3, null));
                            break;
                        }
                    } else {
                        documentAnalysisFragment.b = frameResult3;
                        documentAnalysisFragment.getBinding$workflow_release().l.stopRecording();
                        break;
                    }
                }
                break;
        }
    }
}
