package com.braze.storage;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import bo.app.s3;
import bo.app.t3;
import com.braze.support.StringUtils;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes4.dex */
public final class b extends DataStoreProvider {
    public static final ContentCardsDataStoreProvider$Companion d = new ContentCardsDataStoreProvider$Companion(null);
    public final String a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = LazyKt.lazy(new a$$ExternalSyntheticLambda0(7, context, this));
    }

    public static final String a(Context context, b bVar) {
        return StringUtils.getCacheFileSuffix(context, bVar.a, bVar.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        Context context = getContext();
        String m = Recorder$$ExternalSyntheticOutline2.m("com.appboy.storage.content_cards_storage_provider.cards", (String) this.c.getValue());
        ContentCardsDataStoreProvider$Companion contentCardsDataStoreProvider$Companion = d;
        return createOrGetDataStore(CollectionsKt__CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{new SharedPreferencesMigration(context, m, (RealGcmRegistrar$unregister$2) null, new s3(contentCardsDataStoreProvider$Companion), 12), new SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.braze.storage.content_cards_storage_provider.metadata", (String) this.c.getValue()), (RealGcmRegistrar$unregister$2) null, new t3(contentCardsDataStoreProvider$Companion), 12)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.contentcards.", (String) this.c.getValue());
    }
}
