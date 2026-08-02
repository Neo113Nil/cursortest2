package com.miteksystems.misnap.core;

import android.util.Log;
import com.miteksystems.misnap.core.MibiData;
import com.miteksystems.misnap.core.internal.ImageConverterNativeWrapper;

/* loaded from: classes4.dex */
public abstract class FrameUtil {
    public static final boolean a;
    public static MibiData.Session b = MibiData.bindSession();
    public static final ImageConverterNativeWrapper c;

    static {
        boolean z;
        ImageConverterNativeWrapper imageConverterNativeWrapper = new ImageConverterNativeWrapper();
        try {
            System.loadLibrary("misnapCommonUtil");
            z = true;
        } catch (UnsatisfiedLinkError e) {
            Log.e("ImageConverterInternal", "Unable to load image conversion library", e);
            z = false;
        }
        a = z;
        if (!z) {
            b.addUxpEvent("EFULL", new String[0]);
        }
        c = imageConverterNativeWrapper;
    }
}
