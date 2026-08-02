package com.plaid.internal;

import androidx.fragment.app.FragmentActivity;
import com.plaid.internal.link.LinkActivity;
import com.plaid.link.R;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: com.plaid.internal.n7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0241n7 {
    public static final void a(FragmentActivity fragmentActivity) {
        fragmentActivity.getClass();
        fragmentActivity.getWindow().addFlags(PKIFailureInfo.systemUnavail);
        fragmentActivity.getWindow().setStatusBarColor(-1);
        fragmentActivity.getWindow().getDecorView().setSystemUiVisibility(PKIFailureInfo.certRevoked);
    }

    public static final void a(LinkActivity linkActivity) {
        linkActivity.getClass();
        linkActivity.getWindow().addFlags(PKIFailureInfo.systemUnavail);
        linkActivity.getWindow().setStatusBarColor(linkActivity.getColor(R.color.plaid_full_black_opacity_25));
    }
}
