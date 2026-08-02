package defpackage;

import com.yandex.go.flex.common.api.actions.GeoPoint;
import com.yandex.go.flex.common.api.actions.TaxiExpectedDestinationAction;

@gsq0
/* loaded from: classes6.dex */
public final class t210 extends kr {
    public static final s210 Companion = new s210();
    public final GeoPoint a;
    public final String b;
    public final String c;
    public final TaxiExpectedDestinationAction.ShortcutInfo d;

    public /* synthetic */ t210(int i, GeoPoint geoPoint, String str, String str2, TaxiExpectedDestinationAction.ShortcutInfo shortcutInfo) {
        if (8 != (i & 8)) {
            qje.Z(i, 8, r210.a.getDescriptor());
            throw null;
        }
        this.a = (i & 1) == 0 ? new GeoPoint(0) : geoPoint;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        this.d = shortcutInfo;
    }
}
