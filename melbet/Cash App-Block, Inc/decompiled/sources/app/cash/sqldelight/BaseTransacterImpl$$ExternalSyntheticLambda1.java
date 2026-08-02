package app.cash.sqldelight;

import app.cash.sqldelight.driver.android.AndroidStatement;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class BaseTransacterImpl$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LinkedHashSet f$0;

    public /* synthetic */ BaseTransacterImpl$$ExternalSyntheticLambda1(LinkedHashSet linkedHashSet, int i) {
        this.$r8$classId = i;
        this.f$0 = linkedHashSet;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        int i2 = 0;
        LinkedHashSet linkedHashSet = this.f$0;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                linkedHashSet.add(str);
                break;
            case 1:
                AndroidStatement androidStatement = (AndroidStatement) obj;
                androidStatement.getClass();
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    androidStatement.bindString(i2, (String) it.next());
                    i2++;
                }
                break;
            default:
                AndroidStatement androidStatement2 = (AndroidStatement) obj;
                androidStatement2.getClass();
                Iterator it2 = linkedHashSet.iterator();
                while (it2.hasNext()) {
                    androidStatement2.bindString(i2, (String) it2.next());
                    i2++;
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
