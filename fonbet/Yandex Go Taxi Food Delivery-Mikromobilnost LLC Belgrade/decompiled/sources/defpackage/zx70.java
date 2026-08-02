package defpackage;

import com.yandex.go.taxi.order.models.api.response.ContractItem;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class zx70 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ContractItem.ContractItemType.values().length];
        try {
            iArr[ContractItem.ContractItemType.CHECK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContractItem.ContractItemType.COST_STRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContractItem.ContractItemType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ContractItem.ContractItemType.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
