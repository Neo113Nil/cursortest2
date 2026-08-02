package com.squareup.cash.bitcoin.graph.api.model;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinGraphModel {
    public final long firstTickY;
    public final boolean isStale;
    public final long lastTickY;
    public final List points;
    public final List sampledPoints;
    public final List sampledSmoothedPoints;
    public final List smoothedPoints;

    public BitcoinGraphModel(List list, List list2, List list3, List list4, long j, long j2, boolean z) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.points = list;
        this.smoothedPoints = list2;
        this.sampledPoints = list3;
        this.sampledSmoothedPoints = list4;
        this.firstTickY = j;
        this.lastTickY = j2;
        this.isStale = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinGraphModel)) {
            return false;
        }
        BitcoinGraphModel bitcoinGraphModel = (BitcoinGraphModel) obj;
        return Intrinsics.areEqual(this.points, bitcoinGraphModel.points) && Intrinsics.areEqual(this.smoothedPoints, bitcoinGraphModel.smoothedPoints) && Intrinsics.areEqual(this.sampledPoints, bitcoinGraphModel.sampledPoints) && Intrinsics.areEqual(this.sampledSmoothedPoints, bitcoinGraphModel.sampledSmoothedPoints) && this.firstTickY == bitcoinGraphModel.firstTickY && this.lastTickY == bitcoinGraphModel.lastTickY && this.isStale == bitcoinGraphModel.isStale;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isStale) + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(this.points.hashCode() * 31, 31, this.smoothedPoints), 31, this.sampledPoints), 31, this.sampledSmoothedPoints), 31, this.firstTickY), 31, this.lastTickY);
    }

    public final String toString() {
        StringBuilder m = re$$ExternalSyntheticOutline0.m("BitcoinGraphModel(points=", ", smoothedPoints=", ", sampledPoints=", this.points, this.smoothedPoints);
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.sampledPoints, ", sampledSmoothedPoints=", this.sampledSmoothedPoints, ", firstTickY=");
        m.append(this.firstTickY);
        Boxes$$ExternalSyntheticOutline1.m1151m(this.lastTickY, ", lastTickY=", ", isStale=", m);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.isStale, ")");
    }
}
