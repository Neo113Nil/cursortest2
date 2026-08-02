package defpackage;

import com.google.firebase.sessions.SharedSessionRepositoryImpl$NotificationType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class xpr0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SharedSessionRepositoryImpl$NotificationType.values().length];
        try {
            iArr[SharedSessionRepositoryImpl$NotificationType.GENERAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SharedSessionRepositoryImpl$NotificationType.FALLBACK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
