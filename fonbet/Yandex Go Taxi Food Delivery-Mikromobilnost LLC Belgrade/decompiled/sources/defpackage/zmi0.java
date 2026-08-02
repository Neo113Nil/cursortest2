package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes10.dex */
public final /* synthetic */ class zmi0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ zmi0(List list, int i) {
        this.a = i;
        this.b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00c8  */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        Pair pair;
        Object obj4;
        int i = this.a;
        List list = this.b;
        switch (i) {
            case 0:
                peo peoVar = (peo) obj2;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    obj = ((xmi0) it.next()).b(obj, peoVar);
                }
                return obj;
            default:
                CharSequence charSequence = (CharSequence) obj;
                int intValue = ((Integer) obj2).intValue();
                List list2 = list;
                if (list2.size() == 1) {
                    String str = (String) a.r0(list2);
                    int H = evu0.H(charSequence, str, intValue, false, 4);
                    if (H >= 0) {
                        pair = new Pair(Integer.valueOf(H), str);
                        if (pair == null) {
                            return new Pair(pair.c(), Integer.valueOf(((String) pair.f()).length()));
                        }
                        return null;
                    }
                    pair = null;
                    if (pair == null) {
                    }
                } else {
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    d6w d6wVar = new d6w(intValue, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i2 = d6wVar.c;
                    int i3 = d6wVar.b;
                    if (z) {
                        if ((i2 > 0 && intValue <= i3) || (i2 < 0 && i3 <= intValue)) {
                            while (true) {
                                Iterator it2 = list2.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj4 = it2.next();
                                        String str2 = (String) obj4;
                                        if (str2.regionMatches(0, (String) charSequence, intValue, str2.length())) {
                                        }
                                    } else {
                                        obj4 = null;
                                    }
                                }
                                String str3 = (String) obj4;
                                if (str3 != null) {
                                    pair = new Pair(Integer.valueOf(intValue), str3);
                                } else if (intValue != i3) {
                                    intValue += i2;
                                }
                            }
                            if (pair == null) {
                            }
                        }
                        pair = null;
                        if (pair == null) {
                        }
                    } else {
                        if ((i2 > 0 && intValue <= i3) || (i2 < 0 && i3 <= intValue)) {
                            int i4 = intValue;
                            while (true) {
                                Iterator it3 = list2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        obj3 = it3.next();
                                        String str4 = (String) obj3;
                                        if (evu0.P(str4, 0, charSequence, i4, str4.length(), false)) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                String str5 = (String) obj3;
                                if (str5 != null) {
                                    pair = new Pair(Integer.valueOf(i4), str5);
                                } else if (i4 != i3) {
                                    i4 += i2;
                                }
                            }
                            if (pair == null) {
                            }
                        }
                        pair = null;
                        if (pair == null) {
                        }
                    }
                }
        }
    }
}
