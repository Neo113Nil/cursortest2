package defpackage;

import com.ybsdk.feature.dashboard.internal.data.dto.ToolbarHorizontalAlignment;
import com.ybsdk.feature.dashboard.internal.domain.model.TopButtonTag;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class sv00 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ToolbarHorizontalAlignment.values().length];
        try {
            iArr[ToolbarHorizontalAlignment.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ToolbarHorizontalAlignment.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TopButtonTag.values().length];
        try {
            iArr2[TopButtonTag.SUPPORT_URL.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TopButtonTag.PROFILE.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TopButtonTag.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
