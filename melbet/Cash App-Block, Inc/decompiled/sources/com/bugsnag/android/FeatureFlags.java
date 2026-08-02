package com.bugsnag.android;

import com.bugsnag.android.JsonStream;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class FeatureFlags implements JsonStream.Streamable {
    public volatile FeatureFlag[] flags;

    public FeatureFlags() {
        this(new FeatureFlag[0]);
    }

    public final void addFeatureFlag(String str, String str2) {
        FeatureFlag[] featureFlagArr;
        synchronized (this) {
            try {
                FeatureFlag[] featureFlagArr2 = this.flags;
                int length = featureFlagArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (Intrinsics.areEqual(featureFlagArr2[i].name, str)) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    FeatureFlag featureFlag = new FeatureFlag(str, str2);
                    int length2 = featureFlagArr2.length;
                    Object[] copyOf = Arrays.copyOf(featureFlagArr2, length2 + 1);
                    copyOf[length2] = featureFlag;
                    featureFlagArr = (FeatureFlag[]) copyOf;
                } else {
                    if (Intrinsics.areEqual(featureFlagArr2[i].variant, str2)) {
                        return;
                    }
                    Object[] copyOf2 = Arrays.copyOf(featureFlagArr2, featureFlagArr2.length);
                    ((FeatureFlag[]) copyOf2)[i] = new FeatureFlag(str, str2);
                    featureFlagArr = (FeatureFlag[]) copyOf2;
                }
                this.flags = featureFlagArr;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public final void toStream(JsonStream jsonStream) {
        FeatureFlag[] featureFlagArr = this.flags;
        jsonStream.beginArray();
        for (FeatureFlag featureFlag : featureFlagArr) {
            String str = featureFlag.name;
            String str2 = featureFlag.variant;
            jsonStream.beginObject();
            jsonStream.name("featureFlag");
            jsonStream.value(str);
            if (str2 != null) {
                jsonStream.name("variant");
                jsonStream.value(str2);
            }
            jsonStream.endObject();
        }
        jsonStream.endArray();
    }

    public FeatureFlags(FeatureFlag[] featureFlagArr) {
        this.flags = featureFlagArr;
    }
}
