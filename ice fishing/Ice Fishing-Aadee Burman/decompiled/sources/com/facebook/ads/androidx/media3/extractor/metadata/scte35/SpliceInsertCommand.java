package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.b;
import com.instagram.common.viewpoint.core.AnonymousClass53;
import com.instagram.common.viewpoint.core.C06474v;
import com.instagram.common.viewpoint.core.IW;
import com.instagram.common.viewpoint.core.IX;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"2fVUWVW5Hj7LHoGITBtqA0sUitS4PTb4", "Q8qvKmypWvqXriKcaeBTncTBfq8seygK", "PB3TBbluvnbAoPy", "V5r7AKyrTxu4nkwu31wVya7iCL5S2t7X", "ptiIvLXZk7optwegrSJTcSLpf9JtKnje", "Im1w1jT", "8VlbtMqcAJkMoCkUmgZltZaiEM6o3", "PsL5EDhhHapqBInAVo5dkvRq7GvOLwYr"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new IW();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<IX> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public SpliceInsertCommand(long j6, boolean z3, boolean z6, boolean z9, boolean z10, long j9, long j10, List<IX> list, boolean z11, long j11, int i, int i6, int i9) {
        this.A06 = j6;
        this.A0B = z3;
        this.A09 = z6;
        this.A0A = z9;
        this.A0C = z10;
        this.A05 = j9;
        this.A04 = j10;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z11;
        this.A03 = j11;
        this.A02 = i;
        this.A00 = i6;
        this.A01 = i9;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(IX.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        int componentSpliceListSize = parcel.readByte();
        this.A08 = componentSpliceListSize == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListSize2 = parcel.readInt();
        this.A02 = componentSpliceListSize2;
        int componentSpliceListSize3 = parcel.readInt();
        this.A00 = componentSpliceListSize3;
        int componentSpliceListSize4 = parcel.readInt();
        this.A01 = componentSpliceListSize4;
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, IW iw) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(C06474v c06474v, long j6, AnonymousClass53 anonymousClass53) {
        long A0Q = c06474v.A0Q();
        boolean z3 = (c06474v.A0I() & 128) != 0;
        boolean z6 = false;
        boolean outOfNetworkIndicator = false;
        boolean z9 = false;
        long j9 = b.f6382b;
        List emptyList = Collections.emptyList();
        if (A0D[6].length() == 19) {
            throw new RuntimeException();
        }
        A0D[4] = "mssbEGkdhdKHHgY1hMK2RaJspuJCG0bt";
        int i = 0;
        int i6 = 0;
        int i9 = 0;
        boolean z10 = false;
        long j10 = b.f6382b;
        if (!z3) {
            int A0I = c06474v.A0I();
            z6 = (A0I & 128) != 0;
            outOfNetworkIndicator = (A0I & 64) != 0;
            boolean autoReturn = (A0I & 32) != 0;
            z9 = (A0I & 16) != 0;
            if (outOfNetworkIndicator && !z9) {
                j9 = TimeSignalCommand.A00(c06474v, j6);
            }
            if (!outOfNetworkIndicator) {
                int componentCount = c06474v.A0I();
                emptyList = new ArrayList(componentCount);
                for (int i10 = 0; i10 < componentCount; i10++) {
                    int componentTag = c06474v.A0I();
                    long j11 = b.f6382b;
                    if (!z9) {
                        j11 = TimeSignalCommand.A00(c06474v, j6);
                    }
                    emptyList.add(new IX(componentTag, j11, anonymousClass53.A06(j11), null));
                }
            }
            if (autoReturn) {
                long A0I2 = c06474v.A0I();
                z10 = (A0I2 & 128) != 0;
                j10 = (1000 * (((A0I2 & 1) << 32) | c06474v.A0Q())) / 90;
            }
            i = c06474v.A0M();
            i6 = c06474v.A0I();
            i9 = c06474v.A0I();
        }
        return new SpliceInsertCommand(A0Q, z3, z6, outOfNetworkIndicator, z9, j9, anonymousClass53.A06(j9), emptyList, z10, j10, i, i6, i9);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i6 = 0; i6 < size; i6++) {
            this.A07.get(i6).A01(parcel);
            String[] strArr = A0D;
            if (strArr[1].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "b82jUGYrdOItwNOnrxCotui81UmrwpK";
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
