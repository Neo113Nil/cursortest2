package androidx.media3.exoplayer.upstream;

import bo.app.ng$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes3.dex */
public final class SlidingPercentile {
    public static final ng$$ExternalSyntheticLambda0 INDEX_COMPARATOR = new ng$$ExternalSyntheticLambda0(15);
    public static final ng$$ExternalSyntheticLambda0 VALUE_COMPARATOR = new ng$$ExternalSyntheticLambda0(16);
    public int nextSampleIndex;
    public int recycledSampleCount;
    public int totalWeight;
    public final Sample[] recycledSamples = new Sample[5];
    public final ArrayList samples = new ArrayList();
    public int currentSortOrder = -1;

    public final class Sample {
        public int index;
        public float value;
        public int weight;
    }

    public final void addSample(float f, int i) {
        Sample sample;
        int i2 = this.currentSortOrder;
        ArrayList arrayList = this.samples;
        if (i2 != 1) {
            Collections.sort(arrayList, INDEX_COMPARATOR);
            this.currentSortOrder = 1;
        }
        int i3 = this.recycledSampleCount;
        Sample[] sampleArr = this.recycledSamples;
        if (i3 > 0) {
            int i4 = i3 - 1;
            this.recycledSampleCount = i4;
            sample = sampleArr[i4];
        } else {
            sample = new Sample();
        }
        int i5 = this.nextSampleIndex;
        this.nextSampleIndex = i5 + 1;
        sample.index = i5;
        sample.weight = i;
        sample.value = f;
        arrayList.add(sample);
        this.totalWeight += i;
        while (true) {
            int i6 = this.totalWeight;
            if (i6 <= 2000) {
                return;
            }
            int i7 = i6 - 2000;
            Sample sample2 = (Sample) arrayList.get(0);
            int i8 = sample2.weight;
            if (i8 <= i7) {
                this.totalWeight -= i8;
                arrayList.remove(0);
                int i9 = this.recycledSampleCount;
                if (i9 < 5) {
                    this.recycledSampleCount = i9 + 1;
                    sampleArr[i9] = sample2;
                }
            } else {
                sample2.weight = i8 - i7;
                this.totalWeight -= i7;
            }
        }
    }

    public final float getPercentile() {
        int i = this.currentSortOrder;
        ArrayList arrayList = this.samples;
        if (i != 0) {
            Collections.sort(arrayList, VALUE_COMPARATOR);
            this.currentSortOrder = 0;
        }
        float f = 0.5f * this.totalWeight;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            Sample sample = (Sample) arrayList.get(i3);
            i2 += sample.weight;
            if (i2 >= f) {
                return sample.value;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((Sample) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(1, arrayList)).value;
    }
}
