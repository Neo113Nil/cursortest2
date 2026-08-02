package com.miteksystems.misnap.camera.frameproducers;

import android.content.Context;
import android.util.Rational;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.VideoCapture;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.lifecycle.MutableLiveData;
import com.squareup.cash.moneybot.genie.GenieForEachViewKt;

/* loaded from: classes4.dex */
public final /* synthetic */ class CameraWrapper$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ CameraWrapper f$0;

    public /* synthetic */ CameraWrapper$$ExternalSyntheticLambda1(CameraWrapper cameraWrapper, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraWrapper;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rational rational;
        int i = this.$r8$classId;
        CameraWrapper cameraWrapper = this.f$0;
        switch (i) {
            case 0:
                cameraWrapper.r.addUxpEvent("WDAFT", new String[0]);
                cameraWrapper.n = false;
                cameraWrapper.m = false;
                break;
            case 1:
                Context context = (Context) cameraWrapper.e.get();
                if (context != null) {
                    int rotationFromNaturalOrientation = WindowCompat$Api35Impl.getRotationFromNaturalOrientation(context);
                    Preview preview = cameraWrapper.B;
                    if (preview != null && preview.setTargetRotationInternal(rotationFromNaturalOrientation)) {
                        preview.sendTransformationInfoIfReady();
                    }
                    ImageAnalysis imageAnalysis = cameraWrapper.C;
                    if (imageAnalysis != null && imageAnalysis.setTargetRotationInternal(rotationFromNaturalOrientation)) {
                        imageAnalysis.tryUpdateRelativeRotation();
                    }
                    ImageCapture imageCapture = cameraWrapper.D;
                    if (imageCapture != null) {
                        int targetRotation = ((ImageOutputConfig) imageCapture.mCurrentConfig).getTargetRotation(0);
                        if (imageCapture.setTargetRotationInternal(rotationFromNaturalOrientation) && imageCapture.mCropAspectRatio != null) {
                            int abs = Math.abs(GenieForEachViewKt.surfaceRotationToDegrees(rotationFromNaturalOrientation) - GenieForEachViewKt.surfaceRotationToDegrees(targetRotation));
                            Rational rational2 = imageCapture.mCropAspectRatio;
                            if (abs == 90 || abs == 270) {
                                if (rational2 != null) {
                                    rational = new Rational(rational2.getDenominator(), rational2.getNumerator());
                                }
                                imageCapture.mCropAspectRatio = rational2;
                            } else {
                                rational = new Rational(rational2.getNumerator(), rational2.getDenominator());
                            }
                            rational2 = rational;
                            imageCapture.mCropAspectRatio = rational2;
                        }
                    }
                    VideoCapture videoCapture = cameraWrapper.E;
                    if (videoCapture != null && videoCapture.setTargetRotationInternal(rotationFromNaturalOrientation)) {
                        videoCapture.sendTransformationInfoIfReady$1();
                        break;
                    }
                }
                break;
            default:
                cameraWrapper.r.addUxpEvent("SCWAF", new String[0]);
                Integer num = cameraWrapper.v;
                if (num != null) {
                    cameraWrapper.b(num.intValue());
                }
                MutableLiveData mutableLiveData = cameraWrapper.N;
                Boolean bool = Boolean.FALSE;
                if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                    mutableLiveData.setValue(bool);
                } else {
                    mutableLiveData.postValue(bool);
                }
                cameraWrapper.m = false;
                cameraWrapper.o.removeCallbacksAndMessages(null);
                break;
        }
    }
}
