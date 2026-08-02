package androidx.camera.camera2.pipe;

import androidx.camera.camera2.pipe.compat.AndroidFrameInfo;
import androidx.camera.camera2.pipe.compat.AndroidFrameMetadata;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;

/* loaded from: classes3.dex */
public final class Request {
    public final Map extras;
    public final InputRequest inputRequest;
    public final List listeners;
    public final Map parameters;
    public final List streams;
    public final RequestTemplate template;

    public interface Listener {
        default void onAborted(Request request) {
            request.getClass();
        }

        /* renamed from: onBufferLost-iiEMlm4 */
        default void mo26onBufferLostiiEMlm4(RequestMetadata requestMetadata, long j, int i, int i2) {
        }

        default void onCaptureProgress(RequestMetadata requestMetadata, int i) {
            requestMetadata.getClass();
        }

        /* renamed from: onComplete-CcXjc1I */
        default void mo16onCompleteCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo) {
        }

        /* renamed from: onFailed-CcXjc1I */
        default void mo17onFailedCcXjc1I(RequestMetadata requestMetadata, long j, RequestFailure requestFailure) {
        }

        /* renamed from: onPartialCaptureResult-CcXjc1I */
        default void mo27onPartialCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameMetadata androidFrameMetadata) {
            requestMetadata.getClass();
        }

        /* renamed from: onReadoutStarted-mP9r-9w */
        default void mo28onReadoutStartedmP9r9w(RequestMetadata requestMetadata, long j, long j2) {
            requestMetadata.getClass();
        }

        default void onRequestSequenceAborted(RequestMetadata requestMetadata) {
            requestMetadata.getClass();
        }

        /* renamed from: onRequestSequenceCompleted-RuT0dZU */
        default void mo29onRequestSequenceCompletedRuT0dZU(RequestMetadata requestMetadata, long j) {
            requestMetadata.getClass();
        }

        default void onRequestSequenceCreated(RequestMetadata requestMetadata) {
            requestMetadata.getClass();
        }

        default void onRequestSequenceSubmitted(RequestMetadata requestMetadata) {
            requestMetadata.getClass();
        }

        /* renamed from: onStarted-uGKBvU4 */
        default void mo30onStarteduGKBvU4(RequestMetadata requestMetadata, long j, long j2) {
            requestMetadata.getClass();
        }

        /* renamed from: onTotalCaptureResult-CcXjc1I */
        default void mo18onTotalCaptureResultCcXjc1I(RequestMetadata requestMetadata, long j, AndroidFrameInfo androidFrameInfo) {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Request(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ArrayList arrayList, RequestTemplate requestTemplate, int i) {
        this(list, r2, r10, (i & 8) != 0 ? EmptyList.INSTANCE : arrayList, (i & 16) != 0 ? null : requestTemplate, (InputRequest) null);
        Map map = linkedHashMap;
        if ((i & 2) != 0) {
            Map map2 = EmptyMap.INSTANCE;
            map2.getClass();
            map = map2;
        }
        Map map3 = map;
        Map map4 = linkedHashMap2;
        if ((i & 4) != 0) {
            Map map5 = EmptyMap.INSTANCE;
            map5.getClass();
            map4 = map5;
        }
    }

    public final String toString() {
        String str;
        RequestTemplate requestTemplate = this.template;
        if (requestTemplate == null) {
            str = "";
        } else {
            str = ", template=" + ((Object) RequestTemplate.m54toStringimpl(requestTemplate.value));
        }
        StringBuilder sb = new StringBuilder("Request(streams=");
        Recorder$$ExternalSyntheticOutline2.m(str, "", "", sb, this.streams);
        sb.append(")@");
        sb.append(Integer.toHexString(hashCode()));
        return sb.toString();
    }

    public Request(List list, Map map, Map map2, List list2, RequestTemplate requestTemplate, InputRequest inputRequest) {
        list.getClass();
        map.getClass();
        map2.getClass();
        list2.getClass();
        this.streams = list;
        this.parameters = map;
        this.extras = map2;
        this.listeners = list2;
        this.template = requestTemplate;
        this.inputRequest = inputRequest;
    }
}
