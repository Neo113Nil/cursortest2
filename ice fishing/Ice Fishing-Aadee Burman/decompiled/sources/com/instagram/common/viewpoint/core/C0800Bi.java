package com.instagram.common.viewpoint.core;

import com.google.common.collect.ParametricNullness;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0800Bi<K, V> extends AbstractC2140lr<K, V> {
    public int A00;

    @ParametricNullness
    public final K A01;
    public final /* synthetic */ C2241nh A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC2140lr, java.util.Map.Entry
    @ParametricNullness
    public final V getValue() {
        Object A0F;
        Map<K, V> A0h = this.A02.A0h();
        if (A0h != null) {
            return (V) AbstractC2397qF.A01(A0h.get(this.A01));
        }
        A00();
        if (this.A00 == -1) {
            return (V) AbstractC2397qF.A00();
        }
        A0F = this.A02.A0F(this.A00);
        return (V) A0F;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.instagram.common.viewpoint.core.AbstractC2140lr, java.util.Map.Entry
    @ParametricNullness
    public final V setValue(@ParametricNullness V v9) {
        Object A0F;
        Map<K, V> A0h = this.A02.A0h();
        if (A0h != null) {
            return (V) AbstractC2397qF.A01(A0h.put(this.A01, v9));
        }
        A00();
        if (this.A00 == -1) {
            this.A02.put(this.A01, v9);
            return (V) AbstractC2397qF.A00();
        }
        A0F = this.A02.A0F(this.A00);
        V v10 = (V) A0F;
        this.A02.A0R(this.A00, v9);
        return v10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    public C0800Bi(C2241nh c2241nh, int i) {
        Object A0E;
        this.A02 = c2241nh;
        A0E = c2241nh.A0E(i);
        this.A01 = (K) A0E;
        this.A00 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    private void A00() {
        int A07;
        Object A0E;
        if (this.A00 != -1 && this.A00 < this.A02.size()) {
            K k9 = this.A01;
            A0E = this.A02.A0E(this.A00);
            if (CB.A01(k9, A0E)) {
                return;
            }
        }
        A07 = this.A02.A07(this.A01);
        this.A00 = A07;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    @Override // com.instagram.common.viewpoint.core.AbstractC2140lr, java.util.Map.Entry
    @ParametricNullness
    public final K getKey() {
        return this.A01;
    }
}
