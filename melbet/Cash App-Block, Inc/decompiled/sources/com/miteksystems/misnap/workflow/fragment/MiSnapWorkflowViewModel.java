package com.miteksystems.misnap.workflow.fragment;

import android.content.Context;
import android.os.Looper;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.miteksystems.misnap.core.MiSnapMibiData;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.workflow.MiSnapErrorResult;
import com.miteksystems.misnap.workflow.MiSnapFinalResult;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.a.t;
import com.miteksystems.misnap.workflow.util.FailoverReasonsHandler;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class MiSnapWorkflowViewModel extends ViewModel {
    public final FailoverReasonsHandler a;
    public ArrayList b;
    public t c;
    public final MutableLiveData d;
    public final MutableLiveData e;
    public final MutableLiveData f;
    public final MutableLiveData g;
    public MiSnapFinalResult h;
    public MiSnapFinalResult i;

    public final class a {
        public final byte[] a;
        public final MiSnapMibiData b;
        public final String c;

        public a(byte[] bArr, MiSnapMibiData miSnapMibiData, String str) {
            bArr.getClass();
            this.a = bArr;
            this.b = miSnapMibiData;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.a, aVar.a) && this.b.equals(aVar.b) && Intrinsics.areEqual(this.c, aVar.c);
        }

        public final int hashCode() {
            int hashCode = (this.b.hashCode() + (Arrays.hashCode(this.a) * 31)) * 31;
            String str = this.c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VoiceRecording(voiceBytes=");
            sb.append(Arrays.toString(this.a));
            sb.append(", misnapMibiData=");
            sb.append(this.b);
            sb.append(", rts=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.c, ')');
        }
    }

    public MiSnapWorkflowViewModel() {
        FailoverReasonsHandler failoverReasonsHandler = new FailoverReasonsHandler();
        failoverReasonsHandler.a = FailoverReasonsHandler.a();
        this.a = failoverReasonsHandler;
        this.b = new ArrayList();
        this.d = new MutableLiveData();
        this.e = new MutableLiveData();
        this.f = new MutableLiveData();
        this.g = new MutableLiveData();
    }

    public final void applySettings(MiSnapSettings miSnapSettings) {
        miSnapSettings.getClass();
        MibiData.startSession(miSnapSettings, MiSnapWorkflowViewModel.class.getName());
        updateState$workflow_release(miSnapSettings);
        MutableLiveData mutableLiveData = this.d;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(null);
        } else {
            mutableLiveData.postValue(null);
        }
    }

    public final void clearLiveData$workflow_release() {
        MutableLiveData mutableLiveData = this.g;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(null);
        } else {
            mutableLiveData.postValue(null);
        }
        MutableLiveData mutableLiveData2 = this.d;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData2)) {
            mutableLiveData2.setValue(null);
        } else {
            mutableLiveData2.postValue(null);
        }
        MutableLiveData mutableLiveData3 = this.e;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData3)) {
            mutableLiveData3.setValue(null);
        } else {
            mutableLiveData3.postValue(null);
        }
    }

    public final void postError$workflow_release(Context context, MiSnapWorkflowError miSnapWorkflowError) {
        context.getClass();
        miSnapWorkflowError.getClass();
        MiSnapErrorResult miSnapErrorResult = new MiSnapErrorResult(miSnapWorkflowError, MibiData.toMiSnapMibiData(context));
        MutableLiveData mutableLiveData = this.d;
        mutableLiveData.getClass();
        if (Looper.getMainLooper().isCurrentThread()) {
            mutableLiveData.setValue(miSnapErrorResult);
        } else {
            mutableLiveData.postValue(miSnapErrorResult);
        }
    }

    public final void postNavigationError$workflow_release(NavigationError navigationError) {
        MutableLiveData mutableLiveData = this.e;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(navigationError);
        } else {
            mutableLiveData.postValue(navigationError);
        }
    }

    public final void postResults$workflow_release(MiSnapFinalResult miSnapFinalResult) {
        miSnapFinalResult.getClass();
        MibiData.releaseSession(MiSnapWorkflowViewModel.class.getName());
        MutableLiveData mutableLiveData = this.g;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(miSnapFinalResult);
        } else {
            mutableLiveData.postValue(miSnapFinalResult);
        }
    }

    public final void updateState$workflow_release(MiSnapSettings miSnapSettings) {
        miSnapSettings.getClass();
        miSnapSettings.camera.advanced.a = miSnapSettings.analysis.d;
        MutableLiveData mutableLiveData = this.f;
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(miSnapSettings);
        } else {
            mutableLiveData.postValue(miSnapSettings);
        }
    }
}
