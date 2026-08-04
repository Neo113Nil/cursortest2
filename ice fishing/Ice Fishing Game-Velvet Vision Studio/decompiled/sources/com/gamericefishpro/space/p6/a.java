package com.gamericefishpro.space.p6;

import android.graphics.fonts.Font;
import android.os.VibratorManager;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ Font.Builder c(Font font) {
        return new Font.Builder(font);
    }

    public static /* bridge */ /* synthetic */ VibratorManager h(Object obj) {
        return (VibratorManager) obj;
    }

    public static /* bridge */ /* synthetic */ boolean p(Object obj) {
        return obj instanceof VibratorManager;
    }
}
