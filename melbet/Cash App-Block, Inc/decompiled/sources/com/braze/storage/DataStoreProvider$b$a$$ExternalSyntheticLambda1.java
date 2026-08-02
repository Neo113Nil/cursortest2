package com.braze.storage;

import com.braze.storage.DataStoreProvider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class DataStoreProvider$b$a$$ExternalSyntheticLambda1 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ DataStoreProvider$b$a$$ExternalSyntheticLambda1(String str, int i, Object obj) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String a;
        String b;
        String migrateTriggersStorageToJson$lambda$2$1;
        switch (this.$r8$classId) {
            case 0:
                a = DataStoreProvider.b.a.a(this.f$0, this.f$1);
                return a;
            case 1:
                b = DataStoreProvider.b.a.b(this.f$0, this.f$1);
                return b;
            default:
                migrateTriggersStorageToJson$lambda$2$1 = TriggerDataStoreProvider$Companion.migrateTriggersStorageToJson$lambda$2$1(this.f$0, this.f$1);
                return migrateTriggersStorageToJson$lambda$2$1;
        }
    }
}
