package com.miteksystems.misnap.core;

import android.util.Size;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\b\u0010\u0015\u001a\u00020\u0016H&R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/miteksystems/misnap/core/Frame;", "", "frameInfos", "", "Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "getFrameInfos", "()[Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "imageBytes", "", "getImageBytes", "()[B", "imageFormat", "", "getImageFormat", "()I", "imageSize", "Landroid/util/Size;", "getImageSize", "()Landroid/util/Size;", "rotationDegrees", "getRotationDegrees", "close", "", "FrameInfo", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Frame {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static FrameInfo[] getFrameInfos(Frame frame) {
            return new FrameInfo[0];
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "", "TimingFrameInfo", "Lcom/miteksystems/misnap/core/Frame$FrameInfo$TimingFrameInfo;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class FrameInfo {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/miteksystems/misnap/core/Frame$FrameInfo$TimingFrameInfo;", "Lcom/miteksystems/misnap/core/Frame$FrameInfo;", "", "component1", "timestamp", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getTimestamp", "()J", "<init>", "(J)V", "core_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class TimingFrameInfo extends FrameInfo {

            /* renamed from: a, reason: from kotlin metadata */
            public final long timestamp;

            public TimingFrameInfo(long j) {
                super(null);
                this.timestamp = j;
            }

            public static /* synthetic */ TimingFrameInfo copy$default(TimingFrameInfo timingFrameInfo, long j, int i, Object obj) {
                if ((i & 1) != 0) {
                    j = timingFrameInfo.timestamp;
                }
                return timingFrameInfo.copy(j);
            }

            /* renamed from: component1, reason: from getter */
            public final long getTimestamp() {
                return this.timestamp;
            }

            public final TimingFrameInfo copy(long timestamp) {
                return new TimingFrameInfo(timestamp);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TimingFrameInfo) && this.timestamp == ((TimingFrameInfo) other).timestamp;
            }

            public final long getTimestamp() {
                return this.timestamp;
            }

            public int hashCode() {
                return Long.hashCode(this.timestamp);
            }

            public String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("TimingFrameInfo(timestamp="), this.timestamp, ')');
            }
        }

        public FrameInfo(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    void close();

    FrameInfo[] getFrameInfos();

    byte[] getImageBytes();

    int getImageFormat();

    Size getImageSize();

    int getRotationDegrees();
}
