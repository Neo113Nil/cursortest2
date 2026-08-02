package defpackage;

import android.os.SystemClock;
import androidx.media3.common.a;
import java.util.Arrays;
import java.util.List;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes10.dex */
public abstract class yb5 implements loo {
    private final long[] excludeUntilTimes;
    private final a[] formats;
    protected final xzz0 group;
    private int hashCode;
    protected final int length;
    private boolean playWhenReady;
    protected final int[] tracks;
    private final int type;

    public yb5(int i, xzz0 xzz0Var, int[] iArr) {
        a[] aVarArr;
        d6z.x(iArr.length > 0);
        this.type = i;
        xzz0Var.getClass();
        this.group = xzz0Var;
        int length = iArr.length;
        this.length = length;
        this.formats = new a[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            aVarArr = this.formats;
            if (i2 >= length2) {
                break;
            }
            aVarArr[i2] = xzz0Var.d[iArr[i2]];
            i2++;
        }
        Arrays.sort(aVarArr, new y60(3));
        this.tracks = new int[this.length];
        int i3 = 0;
        while (true) {
            int i4 = this.length;
            if (i3 >= i4) {
                this.excludeUntilTimes = new long[i4];
                this.playWhenReady = false;
                return;
            } else {
                this.tracks[i3] = xzz0Var.a(this.formats[i3]);
                i3++;
            }
        }
    }

    @Override // defpackage.loo
    public void disable() {
    }

    @Override // defpackage.loo
    public void enable() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            yb5 yb5Var = (yb5) obj;
            if (this.group.equals(yb5Var.group) && Arrays.equals(this.tracks, yb5Var.tracks)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.loo
    public int evaluateQueueSize(long j, List list) {
        return list.size();
    }

    @Override // defpackage.loo
    public boolean excludeTrack(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean isTrackExcluded = isTrackExcluded(i, elapsedRealtime);
        int i2 = 0;
        while (i2 < this.length && !isTrackExcluded) {
            isTrackExcluded = (i2 == i || isTrackExcluded(i2, elapsedRealtime)) ? false : true;
            i2++;
        }
        if (!isTrackExcluded) {
            return false;
        }
        long[] jArr = this.excludeUntilTimes;
        long j2 = jArr[i];
        int i3 = tw21.a;
        long j3 = elapsedRealtime + j;
        if (((j ^ j3) & (elapsedRealtime ^ j3)) < 0) {
            j3 = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // defpackage.l001
    public final a getFormat(int i) {
        return this.formats[i];
    }

    @Override // defpackage.l001
    public final int getIndexInTrackGroup(int i) {
        return this.tracks[i];
    }

    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    @Override // defpackage.loo
    public final a getSelectedFormat() {
        return this.formats[getSelectedIndex()];
    }

    @Override // defpackage.loo
    public final int getSelectedIndexInTrackGroup() {
        return this.tracks[getSelectedIndex()];
    }

    @Override // defpackage.l001
    public final xzz0 getTrackGroup() {
        return this.group;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = Arrays.hashCode(this.tracks) + (System.identityHashCode(this.group) * 31);
        }
        return this.hashCode;
    }

    @Override // defpackage.l001
    public final int indexOf(a aVar) {
        for (int i = 0; i < this.length; i++) {
            if (this.formats[i] == aVar) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.loo
    public boolean isTrackExcluded(int i, long j) {
        return this.excludeUntilTimes[i] > j;
    }

    @Override // defpackage.l001
    public final int length() {
        return this.tracks.length;
    }

    @Override // defpackage.loo
    public void onPlayWhenReadyChanged(boolean z) {
        this.playWhenReady = z;
    }

    @Override // defpackage.loo
    public void onPlaybackSpeed(float f) {
    }

    @Override // defpackage.l001
    public final int indexOf(int i) {
        for (int i2 = 0; i2 < this.length; i2++) {
            if (this.tracks[i2] == i) {
                return i2;
            }
        }
        return -1;
    }
}
