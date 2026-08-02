package com.miteksystems.misnap.controller.a;

import android.graphics.YuvImage;
import com.miteksystems.misnap.core.Frame;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Result;
import kotlin.text.MatchResult;
import net.idrnd.misnap.iad.CaptureCore;
import net.idrnd.misnap.iad.IadFrame;
import net.idrnd.misnap.iad.ProcessError;
import net.idrnd.misnap.iad.ProcessResult$FrameProcessed;
import net.idrnd.misnap.iad.ReadyToCapture;
import net.idrnd.misnap.iad.Result;

/* loaded from: classes4.dex */
public final class p {
    public final CaptureCore a;
    public boolean b;

    public p(CaptureCore captureCore) {
        this.a = captureCore;
    }

    public final void a(Frame frame) {
        Frame.FrameInfo frameInfo;
        Object failure;
        Result b;
        t$a t_a;
        frame.getClass();
        if (frame.getImageFormat() != 17) {
            throw new q(t$a.a$3);
        }
        Frame.FrameInfo[] frameInfos = frame.getFrameInfos();
        int length = frameInfos.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                frameInfo = null;
                break;
            }
            frameInfo = frameInfos[i];
            if (frameInfo instanceof Frame.FrameInfo.TimingFrameInfo) {
                break;
            } else {
                i++;
            }
        }
        Long valueOf = frameInfo != null ? Long.valueOf(((Frame.FrameInfo.TimingFrameInfo) frameInfo).getTimestamp()) : null;
        if (valueOf == null || valueOf.longValue() <= 0) {
            throw new q(t$a.a$2);
        }
        try {
            Result.Companion companion = kotlin.Result.Companion;
            failure = new YuvImage(frame.getImageBytes(), 17, frame.getImageSize().getWidth(), frame.getImageSize().getHeight(), null);
        } catch (Throwable th) {
            Result.Companion companion2 = kotlin.Result.Companion;
            failure = new Result.Failure(th);
        }
        if (kotlin.Result.m4120exceptionOrNullimpl(failure) != null) {
            throw new q(t$a.a$3);
        }
        YuvImage yuvImage = (YuvImage) failure;
        IadFrame iadFrame = new IadFrame(yuvImage, valueOf.longValue(), frame.getRotationDegrees());
        CaptureCore captureCore = this.a;
        synchronized (captureCore.a) {
            b = net.idrnd.misnap.iad.a.b(captureCore.b.a(yuvImage, new MatchResult.Destructured(iadFrame)));
        }
        if (!(b instanceof Result.Failure)) {
            if (b instanceof Result.Success) {
                this.b = ((ProcessResult$FrameProcessed) ((Result.Success) b).a).a == ReadyToCapture.Yes;
                return;
            }
            return;
        }
        ProcessError processError = (ProcessError) ((Result.Failure) b).a;
        if (processError.equals(ProcessError.CaptureCoreClosed.INSTANCE)) {
            t_a = t$a.a;
        } else if (processError.equals(ProcessError.ImageSizeInvalid.INSTANCE)) {
            t_a = t$a.a$1;
        } else if (processError.equals(ProcessError.ImageTimestampInvalid.INSTANCE)) {
            t_a = t$a.a$2;
        } else if (processError.equals(ProcessError.JpegEncodingFailed.INSTANCE)) {
            t_a = t$a.a$4;
        } else if (processError.equals(ProcessError.Nv21IsNull.INSTANCE)) {
            t_a = t$a.a$5;
        } else {
            if (!processError.equals(ProcessError.UnknownError.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            t_a = t$a.a$6;
        }
        throw new q(t_a);
    }
}
