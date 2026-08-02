package com.squareup.cash.securitysignals.backend;

import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.securitysignals.models.Pointer;
import com.squareup.cash.securitysignals.models.TouchEvent;
import com.squareup.protos.franklin.common.SignalsContext;
import com.squareup.protos.franklin.common.TouchSignalEvent;
import com.squareup.protos.franklin.common.TouchSignalPointerList;
import com.squareup.util.android.AndroidAudioManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes.dex */
public final class RealSecuritySignalsAggregator implements SecuritySignalsAggregator {
    public final AndroidAudioManager audioManager;
    public final RealScreenRecordingDetector screenRecordingDetector;

    public RealSecuritySignalsAggregator(AndroidAudioManager androidAudioManager, RealScreenRecordingDetector realScreenRecordingDetector) {
        this.audioManager = androidAudioManager;
        this.screenRecordingDetector = realScreenRecordingDetector;
    }

    public final SignalsContext buildSignalsContext(com.squareup.cash.securitysignals.models.SignalsContext signalsContext) {
        signalsContext.getClass();
        List<TouchEvent> touchEvents = signalsContext.getTouchEvents();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(touchEvents, 10));
        for (TouchEvent touchEvent : touchEvents) {
            Long valueOf = Long.valueOf(touchEvent.getTime());
            Integer valueOf2 = Integer.valueOf(touchEvent.getDeviceId());
            Integer valueOf3 = Integer.valueOf(touchEvent.getActionValue());
            Integer valueOf4 = Integer.valueOf(touchEvent.getEdgeFlag());
            Integer valueOf5 = Integer.valueOf(touchEvent.getMetaState());
            Integer valueOf6 = Integer.valueOf(touchEvent.getFlags());
            Integer valueOf7 = Integer.valueOf(touchEvent.getButtonStates());
            List<List> pointers = touchEvent.getPointers();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(pointers, 10));
            for (List<Pointer> list : pointers) {
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (Pointer pointer : list) {
                    arrayList3.add(new TouchSignalPointerList.TouchSignalPointer(Float.valueOf(pointer.getX()), Float.valueOf(pointer.getY()), Float.valueOf(pointer.getPressure()), Float.valueOf(pointer.getSize()), Integer.valueOf(pointer.getToolType()), Float.valueOf(pointer.getTouchMajor()), Float.valueOf(pointer.getTouchMinor()), Float.valueOf(pointer.getToolMajor()), Float.valueOf(pointer.getToolMinor()), Float.valueOf(pointer.getOrientation()), null, 1024, null));
                }
                arrayList2.add(new TouchSignalPointerList(arrayList3));
            }
            arrayList.add(new TouchSignalEvent(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, arrayList2));
        }
        int mode = this.audioManager.audioManager.getMode();
        return new SignalsContext(arrayList, Boolean.valueOf(mode == 2 || mode == 3), (Boolean) this.screenRecordingDetector._screenIsBeingRecorded.getValue(), 8);
    }
}
