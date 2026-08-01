package com.instagram.common.viewpoint.core;

import android.os.Parcel;
import com.anythink.basead.exoplayer.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0971Ib {
    public static String[] A0B = {"nEg82cXZVYZFfZdDmhKyBuPXw98CjCqr", "lWWNRS3KueXb9Tbf73wyUq3w1CVt7zYo", "9i1TifP67Pthfk8s9WN", "2Mfz8aUpVuODbM0LRRY7IzxNE33rrKDp", "lWmgQQDKaNBy8Pu2POQEfpeN2vAsVVBR", "WAUg7lL5KFyy4cAmNpLa1cxU0cT6TIeS", "jMg6XDLnbUHNrmDX3ZR", "RwGxvdCbKX59SF6mGNLLwZG43nCYkk8W"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C0970Ia> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static C0971Ib A02(C06474v c06474v) {
        long A0Q = c06474v.A0Q();
        boolean z3 = (c06474v.A0I() & 128) != 0;
        boolean z6 = false;
        boolean z9 = false;
        long j6 = b.f6382b;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i6 = 0;
        int i9 = 0;
        boolean z10 = false;
        long j9 = b.f6382b;
        if (!z3) {
            int A0I = c06474v.A0I();
            z6 = (A0I & 128) != 0;
            z9 = (A0I & 64) != 0;
            if (A0B[3].charAt(19) != '7') {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[0] = "nLO0WJRxYuU9qthfzcYyP1P8ccIGaxOi";
            strArr[1] = "OIpoqKTSq2Ia2FsBUXzy5KxMNemzaoxr";
            boolean z11 = (A0I & 32) != 0;
            if (z9) {
                j6 = c06474v.A0Q();
            }
            if (!z9) {
                int A0I2 = c06474v.A0I();
                arrayList = new ArrayList(A0I2);
                for (int i10 = 0; i10 < A0I2; i10++) {
                    arrayList.add(new C0970Ia(c06474v.A0I(), c06474v.A0Q(), null));
                }
                if (A0B[3].charAt(19) == '7') {
                    A0B[4] = "ZIJV8CxCO5lc3X0ct1XMotdLhBio9GzL";
                }
            }
            if (z11) {
                long A0I3 = c06474v.A0I();
                z10 = (128 & A0I3) != 0;
                j9 = (1000 * (((1 & A0I3) << 32) | c06474v.A0Q())) / 90;
            }
            i = c06474v.A0M();
            i6 = c06474v.A0I();
            i9 = c06474v.A0I();
        }
        return new C0971Ib(A0Q, z3, z6, z9, arrayList, j6, z10, j9, i, i6, i9);
    }

    public C0971Ib(long j6, boolean z3, boolean z6, boolean z9, List<C0970Ia> list, long j9, boolean z10, long j10, int i, int i6, int i9) {
        this.A04 = j6;
        this.A0A = z3;
        this.A08 = z6;
        this.A09 = z9;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j9;
        this.A07 = z10;
        this.A03 = j10;
        this.A02 = i;
        this.A00 = i6;
        this.A01 = i9;
    }

    public C0971Ib(Parcel parcel) {
        C0970Ia A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            A00 = C0970Ia.A00(parcel);
            arrayList.add(A00);
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static C0971Ib A00(Parcel parcel) {
        return new C0971Ib(parcel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
