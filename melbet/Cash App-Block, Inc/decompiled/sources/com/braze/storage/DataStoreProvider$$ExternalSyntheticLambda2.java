package com.braze.storage;

import com.braze.storage.DataStoreProvider;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class DataStoreProvider$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ DataStoreProvider$$ExternalSyntheticLambda2(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String writeData$lambda$0;
        String a;
        int i = this.$r8$classId;
        String str = this.f$0;
        switch (i) {
            case 0:
                writeData$lambda$0 = DataStoreProvider.writeData$lambda$0(str);
                return writeData$lambda$0;
            default:
                a = DataStoreProvider.n.a(str);
                return a;
        }
    }
}
