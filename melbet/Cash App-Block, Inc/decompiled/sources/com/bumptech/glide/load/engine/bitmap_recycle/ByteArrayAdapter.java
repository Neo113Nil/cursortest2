package com.bumptech.glide.load.engine.bitmap_recycle;

/* loaded from: classes4.dex */
public final class ByteArrayAdapter {
    public final /* synthetic */ int $r8$classId;

    public final int getArrayLength(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final int getElementSizeInBytes() {
        switch (this.$r8$classId) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    public final String getTag() {
        switch (this.$r8$classId) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
