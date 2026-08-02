package com.instagram.common.viewpoint.core;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ag, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1488ag implements View.OnClickListener {
    public static byte[] A01;
    public final /* synthetic */ M6 A00;

    static {
        A01();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 124);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-23, -22, -9, -3, -4, -62, -22, -12, -23, -10, -13, -32, -19, -34, -32, -30, -13, -24, -11, -24, -13, -8, 16, 29, 19, 33, 30, 24, 19, -35, 24, 29, 35, 20, 29, 35, -35, 16, 18, 35, 24, 30, 29, -35, 5, -8, -12, 6};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        String str2;
        String str3;
        C1860gi c1860gi;
        C1860gi c1860gi2;
        C1860gi c1860gi3;
        InterfaceC1502au interfaceC1502au;
        if (WU.A02(this)) {
            return;
        }
        try {
            str = this.A00.A07;
            if (TextUtils.isEmpty(str)) {
                return;
            }
            String A00 = A00(0, 11, 12);
            str2 = this.A00.A07;
            if (A00.equals(str2)) {
                return;
            }
            String A002 = A00(22, 26, 51);
            str3 = this.A00.A07;
            Intent intent = new Intent(A002, XB.A00(str3));
            intent.addFlags(268435456);
            c1860gi = this.A00.A09;
            c1860gi.A0F().A9y();
            try {
                c1860gi3 = this.A00.A09;
                C1364Wu.A0D(c1860gi3, intent);
                interfaceC1502au = this.A00.A06;
                interfaceC1502au.AF0();
            } catch (C1362Ws e9) {
                Throwable cause = e9.getCause();
                Throwable th = e9;
                if (cause != null) {
                    th = e9.getCause();
                }
                c1860gi2 = this.A00.A09;
                c1860gi2.A08().ABC(A00(11, 11, 3), AbstractC1272Td.A00, new C1273Te(th));
            }
        } catch (Throwable th2) {
            WU.A00(th2, this);
        }
    }

    public ViewOnClickListenerC1488ag(M6 m62) {
        this.A00 = m62;
    }
}
