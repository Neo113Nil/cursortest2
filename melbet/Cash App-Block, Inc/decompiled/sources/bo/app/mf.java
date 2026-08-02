package bo.app;

import com.braze.models.IPutIntoJson;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public enum mf implements IPutIntoJson {
    SUBSCRIBED,
    UNSUBSCRIBED;

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public final Object getKey() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "subscribed";
        }
        if (ordinal == 1) {
            return "unsubscribed";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }
}
