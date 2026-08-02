package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class UnitModelLoader implements ModelLoader {
    public static final UnitModelLoader INSTANCE = new UnitModelLoader(0);
    public final /* synthetic */ int $r8$classId;

    public final class UnitFetcher implements DataFetcher {
        public final /* synthetic */ int $r8$classId;
        public final Object resource;

        public /* synthetic */ UnitFetcher(Object obj, int i) {
            this.$r8$classId = i;
            this.resource = obj;
        }

        private final void cancel$com$bumptech$glide$load$model$ByteBufferFileLoader$ByteBufferFetcher() {
        }

        private final void cancel$com$bumptech$glide$load$model$UnitModelLoader$UnitFetcher() {
        }

        private final void cleanup$com$bumptech$glide$load$model$ByteBufferFileLoader$ByteBufferFetcher() {
        }

        private final void cleanup$com$bumptech$glide$load$model$UnitModelLoader$UnitFetcher() {
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cancel() {
            int i = this.$r8$classId;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void cleanup() {
            int i = this.$r8$classId;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final Class getDataClass() {
            switch (this.$r8$classId) {
                case 0:
                    return this.resource.getClass();
                default:
                    return ByteBuffer.class;
            }
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final int getDataSource() {
            switch (this.$r8$classId) {
            }
            return 1;
        }

        @Override // com.bumptech.glide.load.data.DataFetcher
        public final void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
            int i = this.$r8$classId;
            Object obj = this.resource;
            switch (i) {
                case 0:
                    dataCallback.onDataReady(obj);
                    break;
                default:
                    try {
                        dataCallback.onDataReady(ByteBufferUtil.fromFile((File) obj));
                        break;
                    } catch (IOException e) {
                        if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                            Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e);
                        }
                        dataCallback.onLoadFailed(e);
                        return;
                    }
            }
        }
    }

    public /* synthetic */ UnitModelLoader(int i) {
        this.$r8$classId = i;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData buildLoadData(Object obj, int i, int i2, Options options) {
        switch (this.$r8$classId) {
            case 0:
                return new ModelLoader.LoadData(new ObjectKey(obj), new UnitFetcher(obj, 0));
            case 1:
                File file = (File) obj;
                return new ModelLoader.LoadData(new ObjectKey(file), new UnitFetcher(file, 1));
            default:
                return null;
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
