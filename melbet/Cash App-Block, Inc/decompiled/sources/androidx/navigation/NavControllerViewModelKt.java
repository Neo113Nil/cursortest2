package androidx.navigation;

import androidx.lifecycle.viewmodel.InitializerViewModelFactory;
import androidx.media3.extractor.ChunkIndexMerger;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes3.dex */
public abstract class NavControllerViewModelKt {
    public static final InitializerViewModelFactory FACTORY;

    static {
        ChunkIndexMerger chunkIndexMerger = new ChunkIndexMerger(1);
        chunkIndexMerger.addInitializer(Reflection.factory.getOrCreateKotlinClass(NavControllerViewModel.class), new Navigation$$ExternalSyntheticLambda1(17));
        FACTORY = chunkIndexMerger.build();
    }
}
