package com.miteksystems.misnap.core;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.room.RoomDatabase$performClear$1;
import com.miteksystems.misnap.camera.frameproducers.FrameProducer;
import com.miteksystems.misnap.camera.view.CameraView;
import com.miteksystems.misnap.controller.MiSnapController;
import com.miteksystems.misnap.workflow.view.MiSnapView;
import com.plaid.internal.c7$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.util.cache.Cache;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public abstract class LiveDataUtil {

    public final class b implements Observer {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ Object a;
        public final /* synthetic */ Object b;

        public /* synthetic */ b(int i, Object obj, Object obj2) {
            this.$r8$classId = i;
            this.a = obj;
            this.b = obj2;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            int i = this.$r8$classId;
            Object obj2 = this.b;
            Object obj3 = this.a;
            switch (i) {
                case 0:
                    ((c7$$ExternalSyntheticLambda0) obj3).onChanged(obj);
                    ((LiveData) obj2).removeObserver(this);
                    return;
                case 1:
                    byte[] bArr = (byte[]) obj;
                    if (bArr != null) {
                        FrameProducer frameProducer = (FrameProducer) obj2;
                        MutableLiveData mutableLiveData = ((CameraView) obj3).k;
                        if (bArr.length == 0) {
                            bArr = null;
                        }
                        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
                            mutableLiveData.setValue(bArr);
                        } else {
                            mutableLiveData.postValue(bArr);
                        }
                        frameProducer.getVideoRecordings().removeObserver(this);
                        return;
                    }
                    return;
                default:
                    Frame frame = (Frame) obj;
                    if (frame != null) {
                        MiSnapView miSnapView = (MiSnapView) obj3;
                        miSnapView.c.l.removeObserver(miSnapView.F);
                        try {
                            MiSnapController miSnapController = (MiSnapController) obj2;
                            StandaloneCoroutine standaloneCoroutine = miSnapController.w;
                            Continuation continuation = null;
                            if (standaloneCoroutine != null && standaloneCoroutine.isActive()) {
                                standaloneCoroutine.cancel(null);
                            }
                            miSnapController.w = null;
                            miSnapController.w = JobKt.launch$default(JobKt.MainScope(), null, null, new RoomDatabase$performClear$1((Object) miSnapController, (Object) frame, true, continuation, 5), 3);
                            return;
                        } finally {
                            frame.close();
                        }
                    }
                    return;
            }
        }
    }

    public static int getTinyImageResourceIdForCreditCardType(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equalsIgnoreCase("American Express")) {
            return R.drawable.creditcard_american_express;
        }
        if (str.equalsIgnoreCase("Cash")) {
            return R.drawable.creditcard_cash;
        }
        if (str.equalsIgnoreCase("Diners Club")) {
            return R.drawable.creditcard_diners_club;
        }
        if (str.equalsIgnoreCase("Discover") || str.equalsIgnoreCase("Découvrir")) {
            return R.drawable.creditcard_discover;
        }
        if (str.equalsIgnoreCase("JCB")) {
            return R.drawable.creditcard_jcb;
        }
        if (str.equalsIgnoreCase("Maestro")) {
            return R.drawable.creditcard_maestro;
        }
        if (str.equalsIgnoreCase("MasterCard")) {
            return R.drawable.creditcard_mastercard;
        }
        if (str.equalsIgnoreCase("Visa")) {
            return R.drawable.creditcard_visa;
        }
        if (str.equalsIgnoreCase("Dankort")) {
            return R.drawable.creditcard_dankort;
        }
        if (str.equalsIgnoreCase("Visa Electron")) {
            return R.drawable.creditcard_visaelectron;
        }
        if (str.equalsIgnoreCase("Laser")) {
            return R.drawable.creditcard_laser;
        }
        return 0;
    }

    public static Cache historicalRangeCache(Flow flow, CoroutineScope coroutineScope) {
        return new Cache(flow, coroutineScope);
    }

    public static Cache selectHistoricalRangeCache(Flow flow, CoroutineScope coroutineScope) {
        return new Cache(flow, coroutineScope);
    }

    public static Cache selectedPriceCache(Flow flow, CoroutineScope coroutineScope) {
        return new Cache(flow, coroutineScope);
    }

    public static Cache topSearchFilterConfigurationCache(Flow flow, CoroutineScope coroutineScope) {
        return new Cache(flow, coroutineScope);
    }

    public static void updateValue(MutableLiveData mutableLiveData, Boolean bool) {
        if (Recorder$$ExternalSyntheticOutline1.m(mutableLiveData)) {
            mutableLiveData.setValue(bool);
        } else {
            mutableLiveData.postValue(bool);
        }
    }
}
