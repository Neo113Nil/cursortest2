package com.bumptech.glide.load.model;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public interface ModelLoader {

    public final class LoadData {
        public final List alternateKeys;
        public final DataFetcher fetcher;
        public final Key sourceKey;

        public LoadData(Key key, DataFetcher dataFetcher) {
            List list = Collections.EMPTY_LIST;
            Util.checkNotNull(key, "Argument must not be null");
            this.sourceKey = key;
            Util.checkNotNull(list, "Argument must not be null");
            this.alternateKeys = list;
            Util.checkNotNull(dataFetcher, "Argument must not be null");
            this.fetcher = dataFetcher;
        }
    }

    LoadData buildLoadData(Object obj, int i, int i2, Options options);

    boolean handles(Object obj);
}
