package com.squareup.cash.fidesmo.views.haptic;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Arrays;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public final class WaveformHapticPattern {
    public final int[] amplitudes;
    public final String name;
    public final int repeat;
    public final long[] timings;

    public WaveformHapticPattern(String str, long[] jArr, int[] iArr, int i) {
        this.name = str;
        this.timings = jArr;
        this.amplitudes = iArr;
        this.repeat = i;
        if (jArr.length != iArr.length) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(jArr.length, iArr.length, "timings (", ") and amplitudes (", ") must have the same length"));
            throw null;
        }
        if (jArr.length == 0) {
            a$$ExternalSyntheticBUOutline0.m$3("timings must not be empty");
            throw null;
        }
        for (long j : jArr) {
            if (j < 0) {
                a$$ExternalSyntheticBUOutline0.m$3("timings must not contain negative values");
                throw null;
            }
        }
        for (int i2 : this.amplitudes) {
            if (i2 < 0 || i2 >= 256) {
                a$$ExternalSyntheticBUOutline0.m$3("amplitudes must be in [0, 255]");
                throw null;
            }
        }
        int i3 = this.repeat;
        if (i3 != -1) {
            long[] jArr2 = this.timings;
            int length = jArr2.length;
            if (i3 < 0 || i3 >= length) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m(i3, jArr2.length, "repeat (", ") must be -1 or in [0, ", ")"));
                throw null;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaveformHapticPattern)) {
            return false;
        }
        WaveformHapticPattern waveformHapticPattern = (WaveformHapticPattern) obj;
        return this.name.equals(waveformHapticPattern.name) && Arrays.equals(this.timings, waveformHapticPattern.timings) && Arrays.equals(this.amplitudes, waveformHapticPattern.amplitudes) && this.repeat == waveformHapticPattern.repeat;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.amplitudes) + ((Arrays.hashCode(this.timings) + (this.name.hashCode() * 31)) * 31)) * 31) + this.repeat;
    }

    public final String toString() {
        String arrays = Arrays.toString(this.timings);
        String arrays2 = Arrays.toString(this.amplitudes);
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("WaveformHapticPattern(name=", this.name, ", timings=", arrays, ", amplitudes=");
        m.append(arrays2);
        m.append(", repeat=");
        m.append(this.repeat);
        m.append(")");
        return m.toString();
    }
}
