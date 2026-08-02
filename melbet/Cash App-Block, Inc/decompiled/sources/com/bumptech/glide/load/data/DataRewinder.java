package com.bumptech.glide.load.data;

/* loaded from: classes4.dex */
public interface DataRewinder {

    public interface Factory {
        DataRewinder build(Object obj);

        Class getDataClass();
    }

    void cleanup();

    Object rewindAndGet();
}
