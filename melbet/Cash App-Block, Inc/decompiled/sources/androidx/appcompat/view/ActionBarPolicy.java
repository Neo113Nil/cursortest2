package androidx.appcompat.view;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import androidx.appcompat.R$styleable;
import com.bumptech.glide.load.model.AssetUriLoader;
import com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener;
import com.bumptech.glide.load.model.MediaStoreFileLoader;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent$TransportRuntimeComponentImpl;
import com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory;
import com.google.android.datatransport.runtime.TransportRuntime_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.gms.internal.mlkit_vision_common.zzbs;
import com.squareup.cash.R;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Provider;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;

/* loaded from: classes3.dex */
public final class ActionBarPolicy implements ModelLoaderFactory, DirectResourceLoader$ResourceOpener {
    public final /* synthetic */ int $r8$classId;
    public Context mContext;

    public ActionBarPolicy(Context context) {
        this.$r8$classId = 7;
        context.getClass();
        this.mContext = context;
    }

    public static ActionBarPolicy get(Context context) {
        ActionBarPolicy actionBarPolicy = new ActionBarPolicy(0);
        actionBarPolicy.mContext = context;
        return actionBarPolicy;
    }

    public DaggerTransportRuntimeComponent$TransportRuntimeComponentImpl build() {
        Context context = this.mContext;
        if (context == null) {
            f$$ExternalSyntheticLambda0.m((Object) Context.class.getCanonicalName(), (Object) " must be set");
            return null;
        }
        DaggerTransportRuntimeComponent$TransportRuntimeComponentImpl daggerTransportRuntimeComponent$TransportRuntimeComponentImpl = new DaggerTransportRuntimeComponent$TransportRuntimeComponentImpl();
        daggerTransportRuntimeComponent$TransportRuntimeComponentImpl.executorProvider = DoubleCheck.provider(ExecutionModule_ExecutorFactory.InstanceHolder.INSTANCE);
        int i = 0;
        InstanceFactory instanceFactory = new InstanceFactory(context, i);
        daggerTransportRuntimeComponent$TransportRuntimeComponentImpl.setApplicationContextProvider = instanceFactory;
        int i2 = 1;
        daggerTransportRuntimeComponent$TransportRuntimeComponentImpl.metadataBackendRegistryProvider = DoubleCheck.provider(new MetadataBackendRegistry_Factory(instanceFactory, new InstanceFactory(instanceFactory, i2), i));
        InstanceFactory instanceFactory2 = daggerTransportRuntimeComponent$TransportRuntimeComponentImpl.setApplicationContextProvider;
        daggerTransportRuntimeComponent$TransportRuntimeComponentImpl.schemaManagerProvider = new SchemaManager_Factory(instanceFactory2, i);
        Provider provider = DoubleCheck.provider(new MetadataBackendRegistry_Factory(daggerTransportRuntimeComponent$TransportRuntimeComponentImpl.schemaManagerProvider, DoubleCheck.provider(new SchemaManager_Factory(instanceFactory2, i2)), i2));
        daggerTransportRuntimeComponent$TransportRuntimeComponentImpl.sQLiteEventStoreProvider = provider;
        ExecutionModule_ExecutorFactory executionModule_ExecutorFactory = new ExecutionModule_ExecutorFactory(i2);
        InstanceFactory instanceFactory3 = daggerTransportRuntimeComponent$TransportRuntimeComponentImpl.setApplicationContextProvider;
        TransportRuntime_Factory transportRuntime_Factory = new TransportRuntime_Factory(instanceFactory3, provider, executionModule_ExecutorFactory, i2);
        Provider provider2 = daggerTransportRuntimeComponent$TransportRuntimeComponentImpl.executorProvider;
        Provider provider3 = daggerTransportRuntimeComponent$TransportRuntimeComponentImpl.metadataBackendRegistryProvider;
        daggerTransportRuntimeComponent$TransportRuntimeComponentImpl.transportRuntimeProvider = DoubleCheck.provider(new TransportRuntime_Factory(new DefaultScheduler_Factory(provider2, provider3, transportRuntime_Factory, provider, provider), new Uploader_Factory(instanceFactory3, provider3, provider, transportRuntime_Factory, provider2, provider, provider), new WorkInitializer_Factory(provider2, provider, transportRuntime_Factory, provider), i));
        return daggerTransportRuntimeComponent$TransportRuntimeComponentImpl;
    }

    @Override // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public /* bridge */ /* synthetic */ void close(Object obj) {
    }

    @Override // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public Class getDataClass() {
        return Drawable.class;
    }

    public int getMaxActionButtons() {
        Configuration configuration = this.mContext.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public int getTabContainerHeight() {
        Context context = this.mContext;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.ActionBar, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(13, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    @Override // com.bumptech.glide.load.model.DirectResourceLoader$ResourceOpener
    public Object open(Resources resources, int i, Resources.Theme theme) {
        Context context = this.mContext;
        return zzbs.getDrawable(context, context, i, theme);
    }

    public Set zza() {
        Set<String> hashSet;
        synchronized (ActionBarPolicy.class) {
            try {
                hashSet = this.mContext.getSharedPreferences("playcore_split_install_internal", 0).getStringSet("modules_to_uninstall_if_emulated", new HashSet());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }

    public /* synthetic */ ActionBarPolicy(Context context, int i) {
        this.$r8$classId = i;
        this.mContext = context;
    }

    public /* synthetic */ ActionBarPolicy(int i) {
        this.$r8$classId = i;
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
        switch (this.$r8$classId) {
            case 3:
                return new AssetUriLoader(this.mContext, this);
            case 4:
                return new AssetUriLoader(this.mContext, multiModelLoaderFactory.build(Integer.class, AssetFileDescriptor.class));
            default:
                return new MediaStoreFileLoader(this.mContext, 2);
        }
    }
}
