package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class EA extends AbstractBinderC3336i8 {

    /* renamed from: n, reason: collision with root package name */
    public final t2.n f24551n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ FA f24552u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EA(FA fa, t2.n nVar) {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
        Objects.requireNonNull(fa);
        this.f24552u = fa;
        this.f24551n = nVar;
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        C2598Hq c2598Hq;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            AbstractC3388j8.a(parcel);
            parcel.readInt();
            AbstractC3388j8.f(parcel);
            return true;
        }
        Bundle bundle = (Bundle) AbstractC3388j8.b(parcel, Bundle.CREATOR);
        AbstractC3388j8.f(parcel);
        int i6 = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        int i9 = bundle.getInt("uiMode", 0);
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
        this.f24551n.a(new CA(i6, string, i9, valueOf));
        if (i6 == 8157 && (c2598Hq = this.f24552u.f24752a) != null) {
            FA.f24750c.a("unbind LMD display overlay service", new Object[0]);
            c2598Hq.a(new RunnableC3807qw(10, c2598Hq));
        }
        return true;
    }
}
