package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum a7x {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    OK(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);

    public static final u7x c;
    public final int a;

    static {
        w2r w2rVar = new w2r(11, (byte) 0);
        w2rVar.c = new Object[8];
        w2rVar.b = 0;
        for (a7x a7xVar : values()) {
            Integer valueOf = Integer.valueOf(a7xVar.a);
            int i = w2rVar.b + 1;
            Object[] objArr = (Object[]) w2rVar.c;
            int length = objArr.length;
            int i2 = i + i;
            if (i2 > length) {
                w2rVar.c = Arrays.copyOf(objArr, h8s.d(length, i2));
            }
            Object[] objArr2 = (Object[]) w2rVar.c;
            int i3 = w2rVar.b;
            int i4 = i3 + i3;
            objArr2[i4] = valueOf;
            objArr2[i4 + 1] = a7xVar;
            w2rVar.b = i3 + 1;
        }
        j6x j6xVar = (j6x) w2rVar.d;
        if (j6xVar != null) {
            throw j6xVar.a();
        }
        u7x b = u7x.b(w2rVar.b, (Object[]) w2rVar.c, w2rVar);
        j6x j6xVar2 = (j6x) w2rVar.d;
        if (j6xVar2 != null) {
            throw j6xVar2.a();
        }
        c = b;
    }

    a7x(int i) {
        this.a = i;
    }
}
