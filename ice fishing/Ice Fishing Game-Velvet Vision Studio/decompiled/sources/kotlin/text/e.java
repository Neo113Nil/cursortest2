package kotlin.text;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ List d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ e(List list, boolean z) {
        this.d = list;
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003a A[EDGE_INSN: B:11:0x003a->B:54:0x00df BREAK  A[LOOP:0: B:25:0x006e->B:37:0x00a4]] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        Pair pair;
        String str;
        boolean z;
        Object next2;
        CharSequence DelimitedRangesSequence = (CharSequence) obj;
        int iIntValue = ((Integer) obj2).intValue();
        Intrinsics.checkNotNullParameter(DelimitedRangesSequence, "$this$DelimitedRangesSequence");
        List list = this.d;
        boolean z2 = this.e;
        if (z2 || list.size() != 1) {
            if (iIntValue < 0) {
                iIntValue = 0;
            }
            boolean z3 = DelimitedRangesSequence instanceof String;
            int i = new IntRange(iIntValue, DelimitedRangesSequence.length(), 1).e;
            if (!z3) {
                if (iIntValue <= i) {
                    int i2 = iIntValue;
                    while (true) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            str = (String) next;
                        } while (!StringsKt__StringsKt.o(str, 0, DelimitedRangesSequence, i2, str.length(), z2));
                        String str2 = (String) next;
                        if (str2 == null) {
                            if (i2 == i) {
                                pair = null;
                                break;
                            }
                            i2++;
                        } else {
                            pair = new Pair(Integer.valueOf(i2), str2);
                            break;
                        }
                    }
                } else {
                    pair = null;
                    break;
                }
            } else if (iIntValue <= i) {
                int i3 = iIntValue;
                while (true) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z = z2;
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        String str3 = (String) next2;
                        z = z2;
                        if (d.h(0, i3, str3.length(), str3, (String) DelimitedRangesSequence, z)) {
                            break;
                        }
                        z2 = z;
                    }
                    String str4 = (String) next2;
                    if (str4 == null) {
                        if (i3 == i) {
                            pair = null;
                            break;
                        }
                        i3++;
                        z2 = z;
                    } else {
                        pair = new Pair(Integer.valueOf(i3), str4);
                        break;
                    }
                }
            } else {
                pair = null;
                break;
            }
        } else {
            Intrinsics.checkNotNullParameter(list, "<this>");
            Intrinsics.checkNotNullParameter(list, "<this>");
            int size = list.size();
            if (size == 0) {
                throw new NoSuchElementException("List is empty.");
            }
            if (size != 1) {
                throw new IllegalArgumentException("List has more than one element.");
            }
            String str5 = (String) list.get(0);
            int iN = StringsKt__StringsKt.n(DelimitedRangesSequence, str5, iIntValue, 4);
            if (iN < 0) {
                pair = null;
                break;
            }
            pair = new Pair(Integer.valueOf(iN), str5);
        }
        if (pair != null) {
            return new Pair(pair.d, Integer.valueOf(((String) pair.e).length()));
        }
        return null;
    }
}
