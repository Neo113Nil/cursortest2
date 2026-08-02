package com.instagram.common.viewpoint.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.List;
import java.util.RandomAccess;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.p2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2343p2 {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @ParametricNullness
    public static <T> T A00(@ParametricNullness Iterable<? extends T> iterable, T t6) {
        return (T) AbstractC2350p9.A06(iterable.iterator(), t6);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> boolean A02(Iterable<T> iterable, InterfaceC2091kj<? super T> predicate) {
        return AbstractC2350p9.A0B(iterable.iterator(), predicate);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> boolean A03(Iterable<T> removeFrom, InterfaceC2091kj<? super T> predicate) {
        return ((removeFrom instanceof RandomAccess) && (removeFrom instanceof List)) ? A04((List) removeFrom, (InterfaceC2091kj) AbstractC2090ki.A04(predicate)) : AbstractC2350p9.A0C(removeFrom.iterator(), predicate);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    public static <T> void A01(List<T> list, InterfaceC2091kj<? super T> predicate, int to, int from) {
        for (int size = list.size() - 1; size > from; size--) {
            if (predicate.A4C(list.get(size))) {
                list.remove(size);
            }
        }
        for (int n9 = from - 1; n9 >= to; n9--) {
            list.remove(n9);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> boolean A04(List<T> list, InterfaceC2091kj<? super T> predicate) {
        int i = 0;
        int i4 = 0;
        while (i < from) {
            T t6 = list.get(i);
            if (!predicate.A4C(t6)) {
                if (i > i4) {
                    try {
                        list.set(i4, t6);
                    } catch (IllegalArgumentException unused) {
                        A01(list, predicate, i4, i);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        A01(list, predicate, i4, i);
                        return true;
                    }
                }
                i4++;
            }
            i++;
        }
        int from = list.size();
        list.subList(i4, from).clear();
        return i != i4;
    }
}
