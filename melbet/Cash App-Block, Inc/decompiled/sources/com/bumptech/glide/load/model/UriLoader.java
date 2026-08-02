package com.bumptech.glide.load.model;

import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes4.dex */
public final class UriLoader implements ModelLoader {
    public static final Set SCHEMES = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final LocalUriFetcherFactory factory;

    public interface LocalUriFetcherFactory {
        DataFetcher build(Uri uri);
    }

    public UriLoader(LocalUriFetcherFactory localUriFetcherFactory) {
        this.factory = localUriFetcherFactory;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData buildLoadData(Object obj, int i, int i2, Options options) {
        Uri uri = (Uri) obj;
        return new ModelLoader.LoadData(new ObjectKey(uri), this.factory.build(uri));
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(Object obj) {
        return SCHEMES.contains(((Uri) obj).getScheme());
    }
}
