package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;
import l.C4659e;

/* loaded from: classes2.dex */
public final class EA extends AbstractBinderC3359i8 {

    /* renamed from: n, reason: collision with root package name */
    public final C4659e f25312n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ FA f25313u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EA(FA fa, C4659e c4659e) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        Objects.requireNonNull(fa);
        this.f25313u = fa;
        this.f25312n = c4659e;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        C2618Hq c2618Hq;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            AbstractC3411j8.a(parcel);
            parcel.readInt();
            AbstractC3411j8.f(parcel);
            return true;
        }
        Bundle bundle = (Bundle) AbstractC3411j8.b(parcel, Bundle.CREATOR);
        AbstractC3411j8.f(parcel);
        int i4 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i6 = bundle.getInt("uiMode", 0);
        byte b9 = (byte) (((byte) (0 | 1)) | 1);
        if (string == null) {
            string = null;
        }
        byte b10 = (byte) (b9 | 2);
        Boolean valueOf = bundle.containsKey("userInteracted") ? Boolean.valueOf(bundle.getBoolean("userInteracted")) : null;
        if (b10 != 3) {
            StringBuilder sb = new StringBuilder();
            if ((b10 & 1) == 0) {
                sb.append(" statusCode");
            }
            if ((b10 & 2) == 0) {
                sb.append(" uiMode");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        this.f25312n.C(new CA(i4, string, i6, valueOf));
        if (i4 == 8157 && (c2618Hq = this.f25313u.f25508a) != null) {
            FA.f25506c.a("unbind LMD display overlay service", new Object[0]);
            c2618Hq.a(new RunnableC3830qw(10, c2618Hq));
        }
        return true;
    }
}
