package com.braze.storage;

import android.content.Context;
import com.braze.enums.DataStoreKey;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class a$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ a$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String readFloat$lambda$0;
        String readLong$lambda$0;
        String readBoolean$lambda$0;
        String readString$lambda$0;
        String readInt$lambda$0;
        String migrateBlocklistedList$lambda$0;
        int i = this.$r8$classId;
        Object obj = this.f$1;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                return a.a((Context) obj2, (a) obj);
            case 1:
                readFloat$lambda$0 = DataStoreProvider.readFloat$lambda$0((DataStoreKey) obj2, (Float) obj);
                return readFloat$lambda$0;
            case 2:
                readLong$lambda$0 = DataStoreProvider.readLong$lambda$0((DataStoreKey) obj2, (Long) obj);
                return readLong$lambda$0;
            case 3:
                readBoolean$lambda$0 = DataStoreProvider.readBoolean$lambda$0((DataStoreKey) obj2, (Boolean) obj);
                return readBoolean$lambda$0;
            case 4:
                readString$lambda$0 = DataStoreProvider.readString$lambda$0((DataStoreKey) obj2, (String) obj);
                return readString$lambda$0;
            case 5:
                readInt$lambda$0 = DataStoreProvider.readInt$lambda$0((DataStoreKey) obj2, (Integer) obj);
                return readInt$lambda$0;
            case 6:
                migrateBlocklistedList$lambda$0 = ServerConfigDataStoreProvider$Companion.migrateBlocklistedList$lambda$0((DataStoreKey) obj2, (ArrayList) obj);
                return migrateBlocklistedList$lambda$0;
            case 7:
                return b.a((Context) obj2, (b) obj);
            case 8:
                return d.a((Context) obj2, (d) obj);
            case 9:
                return g.a((Context) obj2, (g) obj);
            case 10:
                return h.a((Context) obj2, (h) obj);
            case 11:
                return j.a((Context) obj2, (j) obj);
            case 12:
                return k.a((Context) obj2, (k) obj);
            case 13:
                return l.a((Context) obj2, (l) obj);
            case 14:
                return n.a((Context) obj2, (n) obj);
            case 15:
                return o.a((Context) obj2, (o) obj);
            case 16:
                return q.a((Context) obj2, (q) obj);
            default:
                return t.a((Context) obj2, (t) obj);
        }
    }
}
