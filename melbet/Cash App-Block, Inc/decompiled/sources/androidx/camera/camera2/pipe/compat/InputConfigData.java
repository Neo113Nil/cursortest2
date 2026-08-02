package androidx.camera.camera2.pipe.compat;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes3.dex */
public final class InputConfigData {

    /* renamed from: format, reason: collision with root package name */
    public final int f839format;
    public final int height;
    public final int width;

    public InputConfigData(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.f839format = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputConfigData)) {
            return false;
        }
        InputConfigData inputConfigData = (InputConfigData) obj;
        return this.width == inputConfigData.width && this.height == inputConfigData.height && this.f839format == inputConfigData.f839format;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f839format) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.height, Integer.hashCode(this.width) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputConfigData(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", format=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.f839format, ')');
    }
}
