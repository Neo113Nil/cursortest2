package com.braze.storage;

import androidx.datastore.preferences.core.Preferences;
import com.braze.storage.DataStoreProvider;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final /* synthetic */ class DataStoreProvider$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DataStoreProvider$$ExternalSyntheticLambda5(String str, ContextScope contextScope) {
        this.$r8$classId = 2;
        this.f$1 = str;
        this.f$0 = contextScope;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        File createOrGetDataStore$lambda$0$0;
        String a;
        String orCreateScopeForKey$lambda$1$1;
        int i = this.$r8$classId;
        Object obj = this.f$0;
        Object obj2 = this.f$1;
        switch (i) {
            case 0:
                createOrGetDataStore$lambda$0$0 = DataStoreProvider.createOrGetDataStore$lambda$0$0((DataStoreProvider) obj, (String) obj2);
                return createOrGetDataStore$lambda$0$0;
            case 1:
                a = DataStoreProvider.n.a(obj, (Preferences.Key) obj2);
                return a;
            default:
                orCreateScopeForKey$lambda$1$1 = DataStoreProvider.Companion.getOrCreateScopeForKey$lambda$1$1((String) obj2, (ContextScope) obj);
                return orCreateScopeForKey$lambda$1$1;
        }
    }

    public /* synthetic */ DataStoreProvider$$ExternalSyntheticLambda5(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }
}
