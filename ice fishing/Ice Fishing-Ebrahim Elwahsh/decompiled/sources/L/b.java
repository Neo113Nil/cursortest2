package L;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1671n;

    public /* synthetic */ b(int i) {
        this.f1671n = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int a9;
        switch (this.f1671n) {
            case 0:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b9 = bArr[i];
                    byte b10 = bArr2[i];
                    if (b9 != b10) {
                        return b9 - b10;
                    }
                }
                return 0;
            case 1:
                return ((String) obj).compareTo((String) obj2);
            default:
                a9 = com.anythink.core.common.n.b.i.a((String) obj, (String) obj2);
                return a9;
        }
    }
}
