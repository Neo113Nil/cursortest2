package gb;

import java.math.BigDecimal;
import java.util.List;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e {
    private final BigDecimal amountSpent;
    private final List<g> purchases;
    private final Integer sessionCount;
    private final Long sessionTime;

    public e() {
        this(null, null, null, null, 15, null);
    }

    public final BigDecimal getAmountSpent() {
        return this.amountSpent;
    }

    public final boolean getHasAtLeastOnePropertySet() {
        return (this.sessionTime == null && this.sessionCount == null && this.amountSpent == null && this.purchases == null) ? false : true;
    }

    public final List<g> getPurchases() {
        return this.purchases;
    }

    public final Integer getSessionCount() {
        return this.sessionCount;
    }

    public final Long getSessionTime() {
        return this.sessionTime;
    }

    public e(Long l10, Integer num, BigDecimal bigDecimal, List<g> list) {
        this.sessionTime = l10;
        this.sessionCount = num;
        this.amountSpent = bigDecimal;
        this.purchases = list;
    }

    public /* synthetic */ e(Long l10, Integer num, BigDecimal bigDecimal, List list, int i10, pc.f fVar) {
        this((i10 & 1) != 0 ? null : l10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : bigDecimal, (i10 & 8) != 0 ? null : list);
    }
}
