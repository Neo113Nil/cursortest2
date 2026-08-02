package androidx.media3.exoplayer.trackselection;

import android.graphics.Point;
import android.os.CancellationSignal;
import androidx.credentials.CredentialManagerCallback;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.media3.common.Format;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableList;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final /* synthetic */ class DefaultTrackSelector$$ExternalSyntheticLambda4 implements OnFailureListener, ListenerSet.Event, DefaultTrackSelector.TrackInfo.Factory {
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ DefaultTrackSelector$$ExternalSyntheticLambda4(AnalyticsListener.EventTime eventTime, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        this.f$0 = eventTime;
        this.f$1 = loadEventInfo;
        this.f$2 = mediaLoadData;
        this.f$3 = iOException;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RegularImmutableList create(int i, TrackGroup trackGroup, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        Point point;
        int i6;
        int i7;
        TrackGroup trackGroup2 = trackGroup;
        DefaultTrackSelector.Parameters parameters = (DefaultTrackSelector.Parameters) this.f$0;
        String str = (String) this.f$1;
        int[] iArr2 = (int[]) this.f$2;
        Point point2 = (Point) this.f$3;
        int i8 = iArr2[i];
        int i9 = point2 != null ? point2.x : parameters.viewportWidth;
        int i10 = point2 != null ? point2.y : parameters.viewportHeight;
        boolean z = parameters.viewportOrientationMayChange;
        if (i9 == Integer.MAX_VALUE || i10 == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < trackGroup2.length; i12++) {
                Format format2 = trackGroup2.formats[i12];
                int i13 = format2.width;
                int i14 = format2.height;
                if (i13 > 0 && i14 > 0) {
                    if (z) {
                        if ((i13 > i14) != (i9 > i10)) {
                            i5 = i10;
                            i4 = i9;
                            int i15 = i13 * i4;
                            int i16 = i14 * i5;
                            point = i15 < i16 ? new Point(i5, Util.ceilDivide(i16, i13)) : new Point(Util.ceilDivide(i15, i14), i4);
                            i6 = format2.width;
                            i7 = i6 * i14;
                            if (i6 >= ((int) (point.x * 0.98f)) && i14 >= ((int) (point.y * 0.98f)) && i7 < i11) {
                                i11 = i7;
                            }
                        }
                    }
                    i4 = i10;
                    i5 = i9;
                    int i152 = i13 * i4;
                    int i162 = i14 * i5;
                    if (i152 < i162) {
                    }
                    i6 = format2.width;
                    i7 = i6 * i14;
                    if (i6 >= ((int) (point.x * 0.98f))) {
                        i11 = i7;
                    }
                }
            }
            i2 = i11;
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        int i17 = 0;
        while (i17 < trackGroup2.length) {
            Format format3 = trackGroup2.formats[i17];
            int i18 = format3.width;
            int i19 = (i18 == -1 || (i3 = format3.height) == -1) ? -1 : i18 * i3;
            builder.m2032add((Object) new DefaultTrackSelector.VideoTrackInfo(i, trackGroup2, i17, parameters, iArr[i17], str, i8, i2 == Integer.MAX_VALUE || (i19 != -1 && i19 <= i2)));
            i17++;
            trackGroup2 = trackGroup;
        }
        return builder.build();
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onLoadError((AnalyticsListener.EventTime) this.f$0, (LoadEventInfo) this.f$1, (MediaLoadData) this.f$2, (IOException) this.f$3);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2((CredentialProviderPlayServicesImpl) this.f$0, (CancellationSignal) this.f$1, (Executor) this.f$2, (CredentialManagerCallback) this.f$3, exc);
    }

    public /* synthetic */ DefaultTrackSelector$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }
}
