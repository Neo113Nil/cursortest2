package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.storage.DataStoreProvider;
import com.braze.support.StringUtils;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public final class yg extends DataStoreProvider {
    public final String a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yg(Context context, String str, String str2) {
        super(context);
        context.getClass();
        this.a = str;
        this.b = str2;
        this.c = LazyKt.lazy(new t7$$ExternalSyntheticLambda4(7, context, this));
    }

    public static final String a(Context context, yg ygVar) {
        return StringUtils.getCacheFileSuffix(context, ygVar.a, ygVar.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        Context context = getContext();
        String m = Recorder$$ExternalSyntheticOutline2.m("com.appboy.storage.user_cache.v3", (String) this.c.getValue());
        LinkedHashSet linkedHashSet = SharedPreferencesMigrationKt.MIGRATE_ALL_KEYS;
        return createOrGetDataStore(CollectionsKt__CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigrationKt.SharedPreferencesMigration(context, m, linkedHashSet), SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), "com.braze.storage.user_cache.push_token_store" + ((String) this.c.getValue()), linkedHashSet)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.user_cache", (String) this.c.getValue());
    }
}
