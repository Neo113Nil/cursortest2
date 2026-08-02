package defpackage;

import core.network.mapi.exception.MapiClientException;
import kotlin.Pair;

/* loaded from: classes11.dex */
public final /* synthetic */ class rnt implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ MapiClientException b;

    public /* synthetic */ rnt(MapiClientException mapiClientException, int i) {
        this.a = i;
        this.b = mapiClientException;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        MapiClientException mapiClientException = this.b;
        switch (i) {
            case 0:
                return new Pair(mapiClientException, "Action request error");
            default:
                return new Pair(mapiClientException, "Action parse error");
        }
    }
}
