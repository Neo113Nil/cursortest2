package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[LifecycleChannel$AppLifecycleState.values().length];
        a = iArr;
        try {
            iArr[LifecycleChannel$AppLifecycleState.RESUMED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[LifecycleChannel$AppLifecycleState.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[LifecycleChannel$AppLifecycleState.HIDDEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[LifecycleChannel$AppLifecycleState.PAUSED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[LifecycleChannel$AppLifecycleState.DETACHED.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
    }
}
