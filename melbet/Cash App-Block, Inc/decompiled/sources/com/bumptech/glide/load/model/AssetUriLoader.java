package com.bumptech.glide.load.model;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import androidx.core.util.Pools$Pool;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.signature.ObjectKey;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class AssetUriLoader implements ModelLoader {
    public final /* synthetic */ int $r8$classId;
    public final Object assetManager;
    public final Object factory;

    public interface AssetFetcherFactory {
        DataFetcher buildFetcher(AssetManager assetManager, String str);
    }

    public AssetUriLoader(Context context, DirectResourceLoader$ResourceOpener directResourceLoader$ResourceOpener) {
        this.$r8$classId = 1;
        this.assetManager = context.getApplicationContext();
        this.factory = directResourceLoader$ResourceOpener;
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final ModelLoader.LoadData buildLoadData(Object obj, int i, int i2, Options options) {
        ModelLoader.LoadData buildLoadData;
        Uri uri;
        int i3 = this.$r8$classId;
        ModelLoader.LoadData loadData = null;
        Object obj2 = this.assetManager;
        Object obj3 = this.factory;
        switch (i3) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new ModelLoader.LoadData(new ObjectKey(uri2), ((AssetFetcherFactory) obj3).buildFetcher((AssetManager) obj2, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                final Resources.Theme theme = (Resources.Theme) options.get(ResourceDrawableDecoder.THEME);
                final Resources resources = theme != null ? theme.getResources() : ((Context) obj2).getResources();
                ObjectKey objectKey = new ObjectKey(num);
                final DirectResourceLoader$ResourceOpener directResourceLoader$ResourceOpener = (DirectResourceLoader$ResourceOpener) obj3;
                final int intValue = num.intValue();
                return new ModelLoader.LoadData(objectKey, new DataFetcher(theme, resources, directResourceLoader$ResourceOpener, intValue) { // from class: com.bumptech.glide.load.model.DirectResourceLoader$ResourceDataFetcher
                    public Object data;
                    public final int resourceId;
                    public final DirectResourceLoader$ResourceOpener resourceOpener;
                    public final Resources resources;
                    public final Resources.Theme theme;

                    {
                        this.theme = theme;
                        this.resources = resources;
                        this.resourceOpener = directResourceLoader$ResourceOpener;
                        this.resourceId = intValue;
                    }

                    @Override // com.bumptech.glide.load.data.DataFetcher
                    public final void cancel() {
                    }

                    @Override // com.bumptech.glide.load.data.DataFetcher
                    public final void cleanup() {
                        Object obj4 = this.data;
                        if (obj4 != null) {
                            try {
                                this.resourceOpener.close(obj4);
                            } catch (IOException unused) {
                            }
                        }
                    }

                    @Override // com.bumptech.glide.load.data.DataFetcher
                    public final Class getDataClass() {
                        return this.resourceOpener.getDataClass();
                    }

                    @Override // com.bumptech.glide.load.data.DataFetcher
                    public final int getDataSource() {
                        return 1;
                    }

                    @Override // com.bumptech.glide.load.data.DataFetcher
                    public final void loadData(Priority priority, DataFetcher.DataCallback dataCallback) {
                        try {
                            Object open = this.resourceOpener.open(this.resources, this.resourceId, this.theme);
                            this.data = open;
                            dataCallback.onDataReady(open);
                        } catch (Resources.NotFoundException e) {
                            dataCallback.onLoadFailed(e);
                        }
                    }
                });
            case 2:
                ArrayList arrayList = (ArrayList) obj2;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size);
                Key key = null;
                for (int i4 = 0; i4 < size; i4++) {
                    ModelLoader modelLoader = (ModelLoader) arrayList.get(i4);
                    if (modelLoader.handles(obj) && (buildLoadData = modelLoader.buildLoadData(obj, i, i2, options)) != null) {
                        key = buildLoadData.sourceKey;
                        arrayList2.add(buildLoadData.fetcher);
                    }
                }
                if (arrayList2.isEmpty() || key == null) {
                    return null;
                }
                return new ModelLoader.LoadData(key, new MultiModelLoader$MultiFetcher(arrayList2, (Pools$Pool) obj3));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources2 = (Resources) obj3;
                try {
                    uri = Uri.parse("android.resource://" + resources2.getResourcePackageName(num2.intValue()) + '/' + resources2.getResourceTypeName(num2.intValue()) + '/' + resources2.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException e) {
                    if (Log.isLoggable("ResourceLoader", 5)) {
                        Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
                    }
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((ModelLoader) obj2).buildLoadData(uri, i, i2, options);
            default:
                Uri uri3 = (Uri) obj;
                ModelLoader modelLoader2 = (ModelLoader) obj3;
                List<String> pathSegments = uri3.getPathSegments();
                if (pathSegments.size() == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt != 0) {
                            loadData = modelLoader2.buildLoadData(Integer.valueOf(parseInt), i, i2, options);
                        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri3);
                        }
                        return loadData;
                    } catch (NumberFormatException e2) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return loadData;
                        }
                        Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri3, e2);
                        return loadData;
                    }
                }
                if (pathSegments.size() != 2) {
                    if (!Log.isLoggable("ResourceUriLoader", 5)) {
                        return null;
                    }
                    Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri3);
                    return null;
                }
                List<String> pathSegments2 = uri3.getPathSegments();
                Context context = (Context) obj2;
                int identifier = context.getResources().getIdentifier(pathSegments2.get(1), pathSegments2.get(0), context.getPackageName());
                if (identifier != 0) {
                    return modelLoader2.buildLoadData(Integer.valueOf(identifier), i, i2, options);
                }
                if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                }
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri3);
                return null;
        }
    }

    @Override // com.bumptech.glide.load.model.ModelLoader
    public final boolean handles(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.assetManager;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                if ("file".equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && "android_asset".equals(uri.getPathSegments().get(0))) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                Iterator it = ((ArrayList) obj2).iterator();
                while (it.hasNext()) {
                    if (((ModelLoader) it.next()).handles(obj)) {
                        break;
                    }
                }
                break;
            case 3:
                break;
            default:
                Uri uri2 = (Uri) obj;
                if ("android.resource".equals(uri2.getScheme()) && ((Context) obj2).getPackageName().equals(uri2.getAuthority())) {
                    break;
                }
                break;
        }
        return true;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((ArrayList) this.assetManager).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public AssetUriLoader(Resources resources, ModelLoader modelLoader) {
        this.$r8$classId = 3;
        this.factory = resources;
        this.assetManager = modelLoader;
    }

    public /* synthetic */ AssetUriLoader(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.assetManager = obj;
        this.factory = obj2;
    }

    public AssetUriLoader(Context context, ModelLoader modelLoader) {
        this.$r8$classId = 4;
        this.assetManager = context.getApplicationContext();
        this.factory = modelLoader;
    }
}
