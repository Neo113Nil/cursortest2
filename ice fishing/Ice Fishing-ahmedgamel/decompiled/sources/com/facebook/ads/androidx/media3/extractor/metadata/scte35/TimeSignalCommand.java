package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.anythink.basead.exoplayer.b;
import com.instagram.common.viewpoint.core.AnonymousClass53;
import com.instagram.common.viewpoint.core.C06674v;
import com.instagram.common.viewpoint.core.C0992Ic;

/* loaded from: assets/audience_network/classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static String[] A02 = {"fBCCr7VwDgvhDxdGkzRiY2TvWvmZmARS", "lBD0fDkRFVdGPYWDbMcaGx4cyXv4WEJh", "6y4HJXgmtxqVkaNMzYZBmSXA6CGxm4DJ", "vpsLDrGqE5zherZQZMMLL6G3cLRsG8Dm", "qp0fDGr3Nzl8ahCuvet6k2311zos", "c5cBfT4Hj52dvZvyRqGaKhWxL68ft04u", "OtVyWYxYdMxR9geYu5t1Sc80NPuk", "8DkmlbSWSEaEI0nee1I51BPAFd"};
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C0992Ic();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j6, long j9) {
        this.A01 = j6;
        this.A00 = j9;
    }

    public /* synthetic */ TimeSignalCommand(long j6, long j9, C0992Ic c0992Ic) {
        this(j6, j9);
    }

    public static long A00(C06674v c06674v, long j6) {
        long A0I = c06674v.A0I();
        if ((128 & A0I) == 0) {
            return b.f7168b;
        }
        long firstByte = c06674v.A0Q();
        long j9 = (((1 & A0I) << 32) | firstByte) + j6;
        if (A02[7].length() == 21) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[5] = "5vtaLYhnTEc2lUg08l0YEv2QqnnKhzp8";
        strArr[0] = "gGhCeZV4kOFdoFbuN1d60dh6MMvStMtQ";
        return j9 & 8589934591L;
    }

    public static TimeSignalCommand A01(C06674v c06674v, long j6, AnonymousClass53 anonymousClass53) {
        long A00 = A00(c06674v, j6);
        return new TimeSignalCommand(A00, anonymousClass53.A06(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
