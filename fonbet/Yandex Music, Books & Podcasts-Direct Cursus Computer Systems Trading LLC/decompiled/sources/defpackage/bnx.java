package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.internal.a;

/* loaded from: classes.dex */
public final class bnx extends a {
    public final Context E;
    public final int F;
    public final String G;
    public final int H;
    public final boolean I;

    public bnx(Context context, Looper looper, rn5 rn5Var, rmd rmdVar, smd smdVar, int i) {
        super(context, looper, 4, rn5Var, rmdVar, smdVar, 0);
        this.E = context;
        this.F = i;
        this.G = null;
        this.H = 1;
        this.I = true;
    }

    public final Bundle B() {
        String packageName = this.E.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.F);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.I);
        bundle.putString("androidPackageName", packageName);
        String str = this.G;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.H);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a, defpackage.fo0
    public final int k() {
        return 12600000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof okx ? (okx) queryLocalInterface : new okx(iBinder);
    }

    @Override // com.google.android.gms.common.internal.a
    public final i6c[] p() {
        return ild.l;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String t() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String u() {
        return "com.google.android.gms.wallet.service.BIND";
    }
}
