package com.braze.storage;

import androidx.datastore.preferences.core.Preferences;
import com.braze.storage.DataStoreProvider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class DataStoreProvider$c$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Preferences.Key f$0;

    public /* synthetic */ DataStoreProvider$c$$ExternalSyntheticLambda0(Preferences.Key key, int i) {
        this.$r8$classId = i;
        this.f$0 = key;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String a;
        String a2;
        String a3;
        int i = this.$r8$classId;
        Preferences.Key key = this.f$0;
        switch (i) {
            case 0:
                a = DataStoreProvider.c.a(key);
                return a;
            case 1:
                a2 = DataStoreProvider.e.a(key);
                return a2;
            default:
                a3 = DataStoreProvider.g.a(key);
                return a3;
        }
    }
}
