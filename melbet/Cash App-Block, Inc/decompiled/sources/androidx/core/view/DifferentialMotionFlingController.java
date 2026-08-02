package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.media3.ui.PlayerView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Map;
import java.util.Objects;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final class DifferentialMotionFlingController {
    public final Context mContext;
    public float mLastFlingVelocity;
    public final DifferentialMotionFlingTarget mTarget;
    public VelocityTracker mVelocityTracker;
    public int mLastProcessedAxis = -1;
    public int mLastProcessedSource = -1;
    public int mLastProcessedDeviceId = -1;
    public final int[] mFlingVelocityThresholds = {Integer.MAX_VALUE, 0};

    public DifferentialMotionFlingController(Context context, DifferentialMotionFlingTarget differentialMotionFlingTarget) {
        this.mContext = context;
        this.mTarget = differentialMotionFlingTarget;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x00b8, code lost:
    
        if (r5 >= 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0071, code lost:
    
        if (r14 >= 0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMotionEvent(MotionEvent motionEvent, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        float f;
        float f2;
        long j;
        int i6;
        float f3;
        float sqrt;
        float f4;
        float[] fArr;
        float f5;
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        int i7 = this.mLastProcessedSource;
        int[] iArr = this.mFlingVelocityThresholds;
        if (i7 == source && this.mLastProcessedDeviceId == deviceId && this.mLastProcessedAxis == i) {
            z = false;
            i2 = 1;
            i3 = 0;
        } else {
            Context context = this.mContext;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            int deviceId2 = motionEvent.getDeviceId();
            int source2 = motionEvent.getSource();
            i2 = 1;
            int i8 = Build.VERSION.SDK_INT;
            i3 = 0;
            if (i8 >= 34) {
                i4 = PlayerView.Api34.getScaledMinimumFlingVelocity(viewConfiguration, deviceId2, i, source2);
            } else {
                InputDevice device = InputDevice.getDevice(deviceId2);
                if (device != null && device.getMotionRange(i, source2) != null) {
                    Resources resources = context.getResources();
                    int identifier = (source2 == 4194304 && i == 26) ? resources.getIdentifier("config_viewMinRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier == -1) {
                        i4 = viewConfiguration.getScaledMinimumFlingVelocity();
                    } else if (identifier != 0) {
                        i4 = resources.getDimensionPixelSize(identifier);
                    }
                }
                i4 = Integer.MAX_VALUE;
            }
            iArr[0] = i4;
            int deviceId3 = motionEvent.getDeviceId();
            int source3 = motionEvent.getSource();
            if (i8 >= 34) {
                i5 = PlayerView.Api34.getScaledMaximumFlingVelocity(viewConfiguration, deviceId3, i, source3);
            } else {
                InputDevice device2 = InputDevice.getDevice(deviceId3);
                if (device2 != null && device2.getMotionRange(i, source3) != null) {
                    Resources resources2 = context.getResources();
                    int identifier2 = (source3 == 4194304 && i == 26) ? resources2.getIdentifier("config_viewMaxRotaryEncoderFlingVelocity", "dimen", "android") : -1;
                    Objects.requireNonNull(viewConfiguration);
                    if (identifier2 == -1) {
                        i5 = viewConfiguration.getScaledMaximumFlingVelocity();
                    } else if (identifier2 != 0) {
                        i5 = resources2.getDimensionPixelSize(identifier2);
                    }
                }
                i5 = Integer.MIN_VALUE;
            }
            iArr[1] = i5;
            this.mLastProcessedSource = source;
            this.mLastProcessedDeviceId = deviceId;
            this.mLastProcessedAxis = i;
            z = true;
        }
        int i9 = iArr[i3];
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (i9 == Integer.MAX_VALUE) {
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.mVelocityTracker = null;
                return;
            }
            return;
        }
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        VelocityTracker velocityTracker2 = this.mVelocityTracker;
        Map map = VelocityTrackerCompat.sFallbackTrackers;
        velocityTracker2.addMovement(motionEvent);
        int i10 = Build.VERSION.SDK_INT;
        float f6 = RecyclerView.DECELERATION_RATE;
        int i11 = 20;
        if (i10 < 34 && motionEvent.getSource() == 4194304) {
            Map map2 = VelocityTrackerCompat.sFallbackTrackers;
            if (!map2.containsKey(velocityTracker2)) {
                map2.put(velocityTracker2, new VelocityTrackerFallback());
            }
            VelocityTrackerFallback velocityTrackerFallback = (VelocityTrackerFallback) map2.get(velocityTracker2);
            long[] jArr = velocityTrackerFallback.mEventTimes;
            long eventTime = motionEvent.getEventTime();
            if (velocityTrackerFallback.mDataPointsBufferSize != 0 && eventTime - jArr[velocityTrackerFallback.mDataPointsBufferLastUsedIndex] > 40) {
                velocityTrackerFallback.mDataPointsBufferSize = i3;
                velocityTrackerFallback.mLastComputedVelocity = RecyclerView.DECELERATION_RATE;
            }
            int i12 = (velocityTrackerFallback.mDataPointsBufferLastUsedIndex + 1) % 20;
            velocityTrackerFallback.mDataPointsBufferLastUsedIndex = i12;
            int i13 = velocityTrackerFallback.mDataPointsBufferSize;
            if (i13 != 20) {
                velocityTrackerFallback.mDataPointsBufferSize = i13 + 1;
            }
            velocityTrackerFallback.mMovements[i12] = motionEvent.getAxisValue(26);
            jArr[velocityTrackerFallback.mDataPointsBufferLastUsedIndex] = eventTime;
        }
        velocityTracker2.computeCurrentVelocity(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, Float.MAX_VALUE);
        VelocityTrackerFallback velocityTrackerFallback2 = (VelocityTrackerFallback) VelocityTrackerCompat.sFallbackTrackers.get(velocityTracker2);
        if (velocityTrackerFallback2 != null) {
            float[] fArr2 = velocityTrackerFallback2.mMovements;
            long[] jArr2 = velocityTrackerFallback2.mEventTimes;
            int i14 = velocityTrackerFallback2.mDataPointsBufferSize;
            if (i14 >= 2) {
                int i15 = velocityTrackerFallback2.mDataPointsBufferLastUsedIndex;
                int i16 = ((i15 + 20) - (i14 - 1)) % 20;
                long j2 = jArr2[i15];
                while (true) {
                    j = jArr2[i16];
                    long j3 = j2 - j;
                    i6 = velocityTrackerFallback2.mDataPointsBufferSize;
                    if (j3 <= 100) {
                        break;
                    }
                    velocityTrackerFallback2.mDataPointsBufferSize = i6 - 1;
                    i16 = (i16 + 1) % 20;
                }
                if (i6 >= 2) {
                    if (i6 == 2) {
                        int i17 = (i16 + 1) % 20;
                        if (j != jArr2[i17]) {
                            sqrt = fArr2[i17] / (r13 - j);
                            f3 = Float.MAX_VALUE;
                            f = 0.0f;
                        }
                    } else {
                        f3 = Float.MAX_VALUE;
                        float f7 = 0.0f;
                        int i18 = 0;
                        int i19 = 0;
                        while (true) {
                            if (i18 >= velocityTrackerFallback2.mDataPointsBufferSize - 1) {
                                break;
                            }
                            int i20 = i18 + i16;
                            long j4 = jArr2[i20 % 20];
                            int i21 = (i20 + 1) % i11;
                            if (jArr2[i21] == j4) {
                                f4 = f6;
                                fArr = fArr2;
                            } else {
                                i19++;
                                f4 = f6;
                                fArr = fArr2;
                                float sqrt2 = (f7 < f6 ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f7) * 2.0f));
                                float f8 = fArr[i21] / (jArr2[i21] - j4);
                                f7 += Math.abs(f8) * (f8 - sqrt2);
                                if (i19 == i2) {
                                    f7 *= 0.5f;
                                }
                            }
                            i18++;
                            f6 = f4;
                            fArr2 = fArr;
                            i11 = 20;
                            i2 = 1;
                        }
                        f = f6;
                        sqrt = (f7 < f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f7) * 2.0f));
                    }
                    f5 = sqrt * 1000.0f;
                    velocityTrackerFallback2.mLastComputedVelocity = f5;
                    if (f5 >= (-Math.abs(f3))) {
                        velocityTrackerFallback2.mLastComputedVelocity = -Math.abs(f3);
                    } else if (velocityTrackerFallback2.mLastComputedVelocity > Math.abs(f3)) {
                        velocityTrackerFallback2.mLastComputedVelocity = Math.abs(f3);
                    }
                }
            }
            f3 = Float.MAX_VALUE;
            sqrt = 0.0f;
            f = 0.0f;
            f5 = sqrt * 1000.0f;
            velocityTrackerFallback2.mLastComputedVelocity = f5;
            if (f5 >= (-Math.abs(f3))) {
            }
        } else {
            f = 0.0f;
        }
        if (Build.VERSION.SDK_INT >= 34) {
            f2 = PlayerView.Api34.getAxisVelocity(velocityTracker2, i);
        } else if (i == 0) {
            f2 = velocityTracker2.getXVelocity();
        } else if (i == 1) {
            f2 = velocityTracker2.getYVelocity();
        } else {
            VelocityTrackerFallback velocityTrackerFallback3 = (VelocityTrackerFallback) VelocityTrackerCompat.sFallbackTrackers.get(velocityTracker2);
            f2 = (velocityTrackerFallback3 == null || i != 26) ? f : velocityTrackerFallback3.mLastComputedVelocity;
        }
        DifferentialMotionFlingTarget differentialMotionFlingTarget = this.mTarget;
        float scaledScrollFactor = differentialMotionFlingTarget.getScaledScrollFactor() * f2;
        float signum = Math.signum(scaledScrollFactor);
        if (z || (signum != Math.signum(this.mLastFlingVelocity) && signum != f)) {
            differentialMotionFlingTarget.stopDifferentialMotionFling();
        }
        if (Math.abs(scaledScrollFactor) < iArr[0]) {
            return;
        }
        float max = Math.max(-r1, Math.min(scaledScrollFactor, iArr[1]));
        this.mLastFlingVelocity = differentialMotionFlingTarget.startDifferentialMotionFling(max) ? max : f;
    }
}
