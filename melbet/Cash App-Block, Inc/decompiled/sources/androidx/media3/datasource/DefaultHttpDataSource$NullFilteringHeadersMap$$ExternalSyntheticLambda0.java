package androidx.media3.datasource;

import com.google.common.base.Predicate;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class DefaultHttpDataSource$NullFilteringHeadersMap$$ExternalSyntheticLambda0 implements Predicate {
    public final /* synthetic */ int $r8$classId;

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if (((Map.Entry) obj).getKey() != null) {
                }
                break;
            default:
                if (((String) obj) != null) {
                }
                break;
        }
        return false;
    }
}
