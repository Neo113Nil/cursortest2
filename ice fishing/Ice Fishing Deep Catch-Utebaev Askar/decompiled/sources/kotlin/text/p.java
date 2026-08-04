package kotlin.text;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
public final class p extends m.d implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f206b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(List list, boolean z) {
        super(2);
        this.f205a = list;
        this.f206b = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Pair a(Object obj, Serializable serializable) {
        return b((CharSequence) obj, ((Number) serializable).intValue());
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00d5 A[EDGE_INSN: B:54:0x00d5->B:55:0x00d6 BREAK  A[LOOP:0: B:26:0x0069->B:37:0x009c]] */
    public final Pair<Integer, Integer> b(CharSequence $receiver, int i2) {
        Object next;
        Pair pair;
        String str;
        Object next2;
        String str2;
        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
        boolean z = this.f206b;
        List list = this.f205a;
        if (z || list.size() != 1) {
            if (i2 < 0) {
                i2 = 0;
            }
            IntRange intRange = new IntRange(i2, $receiver.length());
            boolean z2 = $receiver instanceof String;
            int i3 = intRange.f215c;
            int i4 = intRange.f214b;
            if (!z2) {
                if ((i3 > 0 && i2 <= i4) || (i3 < 0 && i4 <= i2)) {
                    while (true) {
                        Iterator it = list.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                            str = (String) next;
                        } while (!StringsKt__StringsKt.g(str, $receiver, i2, str.length(), z));
                        String str3 = (String) next;
                        if (str3 == null) {
                            if (i2 == i4) {
                                pair = null;
                                break;
                            }
                            i2 += i3;
                        } else {
                            pair = new Pair(Integer.valueOf(i2), str3);
                            break;
                        }
                    }
                } else {
                    pair = null;
                    break;
                }
            } else if ((i3 > 0 && i2 <= i4) || (i3 < 0 && i4 <= i2)) {
                while (true) {
                    Iterator it2 = list.iterator();
                    do {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        str2 = (String) next2;
                    } while (!o.c(str2, 0, (String) $receiver, i2, str2.length(), z));
                    String str4 = (String) next2;
                    if (str4 == null) {
                        if (i2 == i4) {
                            pair = null;
                            break;
                        }
                        i2 += i3;
                    } else {
                        pair = new Pair(Integer.valueOf(i2), str4);
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
            int iF = StringsKt__StringsKt.f(i2, $receiver, str5, false);
            if (iF < 0) {
                pair = null;
                break;
            }
            pair = new Pair(Integer.valueOf(iF), str5);
        }
        if (pair == null) {
            return null;
        }
        return new Pair<>(pair.f155a, Integer.valueOf(((String) pair.f156b).length()));
    }
}
