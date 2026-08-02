package com.squareup.cash.db2.contacts;

import app.cash.sqldelight.driver.android.AndroidStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes9.dex */
public final /* synthetic */ class AliasQueries$$ExternalSyntheticLambda11 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Collection f$0;

    public /* synthetic */ AliasQueries$$ExternalSyntheticLambda11(int i, Collection collection) {
        this.$r8$classId = i;
        this.f$0 = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean contains;
        int i = this.$r8$classId;
        Collection<?> collection = this.f$0;
        switch (i) {
            case 0:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                Iterator it = collection.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    androidStatement.bindString(i2, (String) it.next());
                    i2++;
                }
                return Unit.INSTANCE;
            case 1:
                contains = collection.contains(obj);
                break;
            case 2:
                contains = collection.contains(obj);
                break;
            case 3:
                contains = ((List) obj).retainAll(collection);
                break;
            default:
                contains = collection.contains(obj);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
