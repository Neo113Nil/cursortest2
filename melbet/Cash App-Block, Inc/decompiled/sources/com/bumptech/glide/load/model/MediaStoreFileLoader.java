package com.bumptech.glide.load.model;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.data.mediastore.ThumbFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.signature.ObjectKey;

/* loaded from: classes4.dex */
public final class MediaStoreFileLoader implements ModelLoader {
    public final /* synthetic */ int $r8$classId;
    public final Context context;

    public MediaStoreFileLoader(Context context, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.context = context.getApplicationContext();
                break;
            case 2:
                this.context = context.getApplicationContext();
                break;
            default:
                this.context = context;
                break;
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData buildLoadData(Object obj, int i, int i2, Options options) {
        Long l;
        int i3 = this.$r8$classId;
        Context context = this.context;
        switch (i3) {
            case 0:
                Uri uri = (Uri) obj;
                return new ModelLoader.LoadData(new ObjectKey(uri), new ByteArrayLoader$Fetcher(1, context, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new ModelLoader.LoadData(new ObjectKey(uri2), ThumbFetcher.build(context, uri2, new ThumbFetcher.ImageThumbnailQuery(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) options.get(VideoDecoder.TARGET_FRAME)) == null || l.longValue() != -1) {
                    return null;
                }
                return new ModelLoader.LoadData(new ObjectKey(uri3), ThumbFetcher.build(context, uri3, new ThumbFetcher.ImageThumbnailQuery(context.getContentResolver(), 1)));
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                return MediaStoreUtil.isMediaStoreUri((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return MediaStoreUtil.isMediaStoreUri(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return MediaStoreUtil.isMediaStoreUri(uri2) && uri2.getPathSegments().contains("video");
        }
    }
}
