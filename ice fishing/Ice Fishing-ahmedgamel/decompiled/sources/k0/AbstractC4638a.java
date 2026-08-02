package k0;

import androidx.lifecycle.EnumC0500n;

/* renamed from: k0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC4638a {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f38562a;

    static {
        int[] iArr = new int[EnumC0500n.values().length];
        try {
            iArr[EnumC0500n.ON_CREATE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EnumC0500n.ON_RESUME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EnumC0500n.ON_STOP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EnumC0500n.ON_DESTROY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f38562a = iArr;
    }
}
