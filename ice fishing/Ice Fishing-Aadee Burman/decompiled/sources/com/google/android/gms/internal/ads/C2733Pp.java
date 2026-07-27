package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import u2.C5069B;

/* renamed from: com.google.android.gms.internal.ads.Pp, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2733Pp extends E2.a {

    /* renamed from: B, reason: collision with root package name */
    public static final SparseArray f26866B;

    /* renamed from: A, reason: collision with root package name */
    public int f26867A;

    /* renamed from: w, reason: collision with root package name */
    public final Context f26868w;

    /* renamed from: x, reason: collision with root package name */
    public final E3.j f26869x;

    /* renamed from: y, reason: collision with root package name */
    public final TelephonyManager f26870y;

    /* renamed from: z, reason: collision with root package name */
    public final C2699Np f26871z;

    static {
        SparseArray sparseArray = new SparseArray();
        f26866B = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), EnumC3605n9.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        EnumC3605n9 enumC3605n9 = EnumC3605n9.CONNECTING;
        sparseArray.put(ordinal, enumC3605n9);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), enumC3605n9);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), enumC3605n9);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), EnumC3605n9.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        EnumC3605n9 enumC3605n92 = EnumC3605n9.DISCONNECTED;
        sparseArray.put(ordinal2, enumC3605n92);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), enumC3605n92);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), enumC3605n92);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), enumC3605n92);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), enumC3605n92);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), EnumC3605n9.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), enumC3605n9);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), enumC3605n9);
    }

    public C2733Pp(Context context, E3.j jVar, C2699Np c2699Np, S0.e eVar, C5069B c5069b) {
        super(eVar, c5069b);
        this.f26868w = context;
        this.f26869x = jVar;
        this.f26871z = c2699Np;
        this.f26870y = (TelephonyManager) context.getSystemService("phone");
    }
}
