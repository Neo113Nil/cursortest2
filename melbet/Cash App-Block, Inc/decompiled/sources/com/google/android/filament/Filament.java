package com.google.android.filament;

/* loaded from: classes.dex */
public abstract class Filament {
    public static final /* synthetic */ int $r8$clinit = 0;

    static {
        Platform.get();
        System.loadLibrary("filament-jni");
    }
}
