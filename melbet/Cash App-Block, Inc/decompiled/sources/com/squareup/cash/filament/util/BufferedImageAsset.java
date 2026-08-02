package com.squareup.cash.filament.util;

import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public final class BufferedImageAsset {
    public final ByteBuffer buffer;
    public final int height;
    public final int width;

    public BufferedImageAsset(ByteBuffer byteBuffer, int i, int i2) {
        this.width = i;
        this.height = i2;
        this.buffer = byteBuffer;
    }
}
